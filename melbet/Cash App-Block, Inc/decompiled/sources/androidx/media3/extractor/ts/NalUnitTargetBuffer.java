package androidx.media3.extractor.ts;

import androidx.media3.exoplayer.PlaybackInfo;
import androidx.tracing.Trace;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class NalUnitTargetBuffer {
    public boolean isCompleted;
    public boolean isFilling;
    public Object nalData;
    public int nalLength;
    public int targetType;

    public NalUnitTargetBuffer(int i) {
        this.targetType = i;
        byte[] bArr = new byte[131];
        this.nalData = bArr;
        bArr[2] = 1;
    }

    public void appendToNalUnit(int i, int i2, byte[] bArr) {
        if (this.isFilling) {
            int i3 = i2 - i;
            byte[] bArr2 = (byte[]) this.nalData;
            int length = bArr2.length;
            int i4 = this.nalLength + i3;
            if (length < i4) {
                this.nalData = Arrays.copyOf(bArr2, i4 * 2);
            }
            System.arraycopy(bArr, i, (byte[]) this.nalData, this.nalLength, i3);
            this.nalLength += i3;
        }
    }

    public boolean endNalUnit(int i) {
        if (!this.isFilling) {
            return false;
        }
        this.nalLength -= i;
        this.isFilling = false;
        this.isCompleted = true;
        return true;
    }

    public void incrementPendingOperationAcks(int i) {
        this.isFilling |= i > 0;
        this.targetType += i;
    }

    public void reset() {
        this.isFilling = false;
        this.isCompleted = false;
    }

    public void startNalUnit(int i) {
        Trace.checkState(!this.isFilling);
        boolean z = i == this.targetType;
        this.isFilling = z;
        if (z) {
            this.nalLength = 3;
            this.isCompleted = false;
        }
    }

    public NalUnitTargetBuffer(PlaybackInfo playbackInfo) {
        this.nalData = playbackInfo;
    }
}
