package androidx.media3.extractor.text;

import androidx.media3.decoder.DecoderOutputBuffer;
import androidx.media3.exoplayer.ExoPlayerImplInternal$$ExternalSyntheticLambda2;
import androidx.media3.exoplayer.text.DelegatingSubtitleDecoder;
import androidx.media3.extractor.text.cea.CeaDecoder;
import java.util.List;

/* loaded from: classes3.dex */
public final class SimpleSubtitleDecoder$1 extends DecoderOutputBuffer implements Subtitle {
    public final /* synthetic */ int $r8$classId = 1;
    public long subsampleOffsetUs;
    public Subtitle subtitle;
    public Object this$0;

    public /* synthetic */ SimpleSubtitleDecoder$1() {
        super((byte) 0, 0);
    }

    @Override // androidx.media3.decoder.DecoderOutputBuffer
    public final void clear() {
        this.flags = 0;
        this.timeUs = 0L;
        this.shouldBeSkipped = false;
        this.subtitle = null;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public final List getCues(long j) {
        Subtitle subtitle = this.subtitle;
        subtitle.getClass();
        return subtitle.getCues(j - this.subsampleOffsetUs);
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public final long getEventTime(int i) {
        Subtitle subtitle = this.subtitle;
        subtitle.getClass();
        return subtitle.getEventTime(i) + this.subsampleOffsetUs;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public final int getEventTimeCount() {
        Subtitle subtitle = this.subtitle;
        subtitle.getClass();
        return subtitle.getEventTimeCount();
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public final int getNextEventTimeIndex(long j) {
        Subtitle subtitle = this.subtitle;
        subtitle.getClass();
        return subtitle.getNextEventTimeIndex(j - this.subsampleOffsetUs);
    }

    @Override // androidx.media3.decoder.DecoderOutputBuffer
    public final void release() {
        switch (this.$r8$classId) {
            case 0:
                ((DelegatingSubtitleDecoder) this.this$0).releaseOutputBuffer(this);
                break;
            default:
                CeaDecoder ceaDecoder = (CeaDecoder) ((ExoPlayerImplInternal$$ExternalSyntheticLambda2) this.this$0).f$0;
                clear();
                ceaDecoder.availableOutputBuffers.add(this);
                break;
        }
    }

    public SimpleSubtitleDecoder$1(DelegatingSubtitleDecoder delegatingSubtitleDecoder) {
        super((byte) 0, 0);
        this.this$0 = delegatingSubtitleDecoder;
    }
}
