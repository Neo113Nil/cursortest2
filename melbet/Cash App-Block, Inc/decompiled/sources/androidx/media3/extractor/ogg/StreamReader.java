package androidx.media3.extractor.ogg;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import coil3.svg.internal.AndroidSvg;

/* loaded from: classes3.dex */
public abstract class StreamReader {
    public long currentGranule;
    public ExtractorOutput extractorOutput;
    public boolean formatSet;
    public long lengthOfReadPacket;
    public OggSeeker oggSeeker;
    public long payloadStartPosition;
    public int sampleRate;
    public boolean seekMapSet;
    public int state;
    public long targetGranule;
    public TrackOutput trackOutput;
    public final OggPacket oggPacket = new OggPacket();
    public AndroidSvg setupData = new AndroidSvg(6, false);

    public void onSeekEnd(long j) {
        this.currentGranule = j;
    }

    public abstract long preparePayload(ParsableByteArray parsableByteArray);

    public abstract boolean readHeaders(ParsableByteArray parsableByteArray, long j, AndroidSvg androidSvg);

    public void reset(boolean z) {
        if (z) {
            this.setupData = new AndroidSvg(6, false);
            this.payloadStartPosition = 0L;
            this.state = 0;
        } else {
            this.state = 1;
        }
        this.targetGranule = -1L;
        this.currentGranule = 0L;
    }
}
