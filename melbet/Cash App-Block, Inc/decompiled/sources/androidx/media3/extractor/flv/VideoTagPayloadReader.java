package androidx.media3.extractor.flv;

import androidx.credentials.Credential;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.container.OpusUtil;
import androidx.media3.extractor.TrackOutput;

/* loaded from: classes3.dex */
public final class VideoTagPayloadReader extends Credential {
    public int frameType;
    public boolean hasOutputFormat;
    public boolean hasOutputKeyframe;
    public final ParsableByteArray nalLength;
    public final ParsableByteArray nalStartCode;
    public int nalUnitLengthFieldLength;

    public VideoTagPayloadReader(TrackOutput trackOutput) {
        super(trackOutput);
        this.nalStartCode = new ParsableByteArray(OpusUtil.NAL_START_CODE);
        this.nalLength = new ParsableByteArray(4);
    }
}
