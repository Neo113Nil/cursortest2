package androidx.media3.extractor.metadata.scte35;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public final List componentSpliceList;
    public final long programSplicePlaybackPositionUs;
    public final long programSplicePts;

    public SpliceInsertCommand(long j, long j2, List list) {
        this.programSplicePts = j;
        this.programSplicePlaybackPositionUs = j2;
        this.componentSpliceList = Collections.unmodifiableList(list);
    }

    @Override // androidx.media3.extractor.metadata.scte35.SpliceCommand
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb.append(this.programSplicePts);
        sb.append(", programSplicePlaybackPositionUs= ");
        return CameraState$Type$EnumUnboxingLocalUtility.m(this.programSplicePlaybackPositionUs, " }", sb);
    }
}
