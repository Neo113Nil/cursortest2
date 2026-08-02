package androidx.media3.extractor.text;

import androidx.media3.common.Format;
import androidx.media3.common.util.Consumer;
import androidx.media3.exoplayer.ExoPlayerImplInternal$$ExternalSyntheticLambda2;
import com.android.volley.toolbox.HurlStack;
import com.google.common.collect.ImmutableList;

/* loaded from: classes3.dex */
public interface SubtitleParser {

    public interface Factory {
        public static final HurlStack UNSUPPORTED = new HurlStack(15);

        SubtitleParser create(Format format2);

        int getCueReplacementBehavior(Format format2);

        boolean supportsFormat(Format format2);
    }

    public final class OutputOptions {
        public static final OutputOptions ALL = new OutputOptions(-9223372036854775807L, false);
        public final boolean outputAllCues;
        public final long startTimeUs;

        public OutputOptions(long j, boolean z) {
            this.startTimeUs = j;
            this.outputAllCues = z;
        }
    }

    void parse(byte[] bArr, int i, int i2, OutputOptions outputOptions, Consumer consumer);

    default Subtitle parseToLegacySubtitle(int i, int i2, byte[] bArr) {
        ImmutableList.Builder builder = ImmutableList.builder();
        parse(bArr, 0, i2, OutputOptions.ALL, new ExoPlayerImplInternal$$ExternalSyntheticLambda2(builder, 11));
        return new CuesWithTimingSubtitle(builder.build());
    }

    default void reset() {
    }
}
