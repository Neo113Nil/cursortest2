package androidx.media3.extractor.metadata.scte35;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.common.util.ParsableByteArray;

/* loaded from: classes3.dex */
public final class PrivateCommand extends SpliceCommand {
    public final /* synthetic */ int $r8$classId;
    public final long identifier;
    public final long ptsAdjustment;

    public PrivateCommand(int i, long j, long j2) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                this.ptsAdjustment = j;
                this.identifier = j2;
                break;
            default:
                this.ptsAdjustment = j2;
                this.identifier = j;
                break;
        }
    }

    public static long parseSpliceTime(long j, ParsableByteArray parsableByteArray) {
        long readUnsignedByte = parsableByteArray.readUnsignedByte();
        if ((128 & readUnsignedByte) != 0) {
            return 8589934591L & ((((readUnsignedByte & 1) << 32) | parsableByteArray.readUnsignedInt()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // androidx.media3.extractor.metadata.scte35.SpliceCommand
    public final String toString() {
        switch (this.$r8$classId) {
            case 0:
                StringBuilder sb = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
                sb.append(this.ptsAdjustment);
                sb.append(", identifier= ");
                return CameraState$Type$EnumUnboxingLocalUtility.m(this.identifier, " }", sb);
            default:
                StringBuilder sb2 = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
                sb2.append(this.ptsAdjustment);
                sb2.append(", playbackPositionUs= ");
                return CameraState$Type$EnumUnboxingLocalUtility.m(this.identifier, " }", sb2);
        }
    }
}
