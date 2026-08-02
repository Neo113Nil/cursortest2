package androidx.media3.extractor.ogg;

import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.container.OpusUtil;
import androidx.media3.extractor.AacUtil;
import coil3.svg.internal.AndroidSvg;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class OpusReader extends StreamReader {
    public boolean firstCommentHeaderSeen;
    public static final byte[] OPUS_ID_HEADER_SIGNATURE = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] OPUS_COMMENT_HEADER_SIGNATURE = {79, 112, 117, 115, 84, 97, 103, 115};

    public static boolean peekPacketStartsWith(ParsableByteArray parsableByteArray, byte[] bArr) {
        if (parsableByteArray.bytesLeft() < bArr.length) {
            return false;
        }
        int i = parsableByteArray.position;
        byte[] bArr2 = new byte[bArr.length];
        parsableByteArray.readBytes(0, bArr.length, bArr2);
        parsableByteArray.setPosition(i);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // androidx.media3.extractor.ogg.StreamReader
    public final long preparePayload(ParsableByteArray parsableByteArray) {
        byte[] bArr = parsableByteArray.data;
        return (this.sampleRate * OpusUtil.getPacketDurationUs(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // androidx.media3.extractor.ogg.StreamReader
    public final boolean readHeaders(ParsableByteArray parsableByteArray, long j, AndroidSvg androidSvg) {
        if (peekPacketStartsWith(parsableByteArray, OPUS_ID_HEADER_SIGNATURE)) {
            byte[] copyOf = Arrays.copyOf(parsableByteArray.data, parsableByteArray.limit);
            int i = copyOf[9] & 255;
            ArrayList buildInitializationData = OpusUtil.buildInitializationData(copyOf);
            if (((Format) androidSvg.svg) == null) {
                Format.Builder builder = new Format.Builder();
                builder.containerMimeType = MimeTypes.normalizeMimeType("audio/ogg");
                builder.sampleMimeType = MimeTypes.normalizeMimeType("audio/opus");
                builder.channelCount = i;
                builder.sampleRate = 48000;
                builder.initializationData = buildInitializationData;
                androidSvg.svg = new Format(builder);
                return true;
            }
        } else {
            if (!peekPacketStartsWith(parsableByteArray, OPUS_COMMENT_HEADER_SIGNATURE)) {
                ((Format) androidSvg.svg).getClass();
                return false;
            }
            ((Format) androidSvg.svg).getClass();
            if (!this.firstCommentHeaderSeen) {
                this.firstCommentHeaderSeen = true;
                parsableByteArray.skipBytes(8);
                Metadata parseVorbisComments = AacUtil.parseVorbisComments(ImmutableList.copyOf((String[]) AacUtil.readVorbisCommentHeader(parsableByteArray, false, false).mClientFragmentManager));
                if (parseVorbisComments != null) {
                    Format.Builder buildUpon = ((Format) androidSvg.svg).buildUpon();
                    buildUpon.metadata = parseVorbisComments.copyWithAppendedEntriesFrom(((Format) androidSvg.svg).metadata);
                    androidSvg.svg = new Format(buildUpon);
                    return true;
                }
            }
        }
        return true;
    }

    @Override // androidx.media3.extractor.ogg.StreamReader
    public final void reset(boolean z) {
        super.reset(z);
        if (z) {
            this.firstCommentHeaderSeen = false;
        }
    }
}
