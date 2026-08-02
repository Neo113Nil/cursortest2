package defpackage;

import androidx.media3.common.a;
import java.util.List;

/* loaded from: classes10.dex */
public final class vr10 implements loo {
    public final loo a;
    public final xzz0 b;

    public vr10(loo looVar, xzz0 xzz0Var) {
        this.a = looVar;
        this.b = xzz0Var;
    }

    @Override // defpackage.loo
    public final void disable() {
        this.a.disable();
    }

    @Override // defpackage.loo
    public final void enable() {
        this.a.enable();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vr10)) {
            return false;
        }
        vr10 vr10Var = (vr10) obj;
        return this.a.equals(vr10Var.a) && this.b.equals(vr10Var.b);
    }

    @Override // defpackage.loo
    public final int evaluateQueueSize(long j, List list) {
        return this.a.evaluateQueueSize(j, list);
    }

    @Override // defpackage.loo
    public final boolean excludeTrack(int i, long j) {
        return this.a.excludeTrack(i, j);
    }

    @Override // defpackage.l001
    public final a getFormat(int i) {
        return this.b.d[this.a.getIndexInTrackGroup(i)];
    }

    @Override // defpackage.l001
    public final int getIndexInTrackGroup(int i) {
        return this.a.getIndexInTrackGroup(i);
    }

    @Override // defpackage.loo
    public final a getSelectedFormat() {
        return this.b.d[this.a.getSelectedIndexInTrackGroup()];
    }

    @Override // defpackage.loo
    public final int getSelectedIndex() {
        return this.a.getSelectedIndex();
    }

    @Override // defpackage.loo
    public final int getSelectedIndexInTrackGroup() {
        return this.a.getSelectedIndexInTrackGroup();
    }

    @Override // defpackage.loo
    public final Object getSelectionData() {
        return this.a.getSelectionData();
    }

    @Override // defpackage.loo
    public final int getSelectionReason() {
        return this.a.getSelectionReason();
    }

    @Override // defpackage.l001
    public final xzz0 getTrackGroup() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode() + ((this.b.hashCode() + 527) * 31);
    }

    @Override // defpackage.l001
    public final int indexOf(a aVar) {
        return this.a.indexOf(this.b.a(aVar));
    }

    @Override // defpackage.loo
    public final boolean isTrackExcluded(int i, long j) {
        return this.a.isTrackExcluded(i, j);
    }

    @Override // defpackage.l001
    public final int length() {
        return this.a.length();
    }

    @Override // defpackage.loo
    public final void onDiscontinuity() {
        this.a.onDiscontinuity();
    }

    @Override // defpackage.loo
    public final void onPlayWhenReadyChanged(boolean z) {
        this.a.onPlayWhenReadyChanged(z);
    }

    @Override // defpackage.loo
    public final void onPlaybackSpeed(float f) {
        this.a.onPlaybackSpeed(f);
    }

    @Override // defpackage.loo
    public final void onRebuffer() {
        this.a.onRebuffer();
    }

    @Override // defpackage.loo
    public final boolean shouldCancelChunkLoad(long j, nsb nsbVar, List list) {
        return this.a.shouldCancelChunkLoad(j, nsbVar, list);
    }

    @Override // defpackage.loo
    public final void updateSelectedTrack(long j, long j2, long j3, List list, jb10[] jb10VarArr) {
        this.a.updateSelectedTrack(j, j2, j3, list, jb10VarArr);
    }

    @Override // defpackage.l001
    public final int indexOf(int i) {
        return this.a.indexOf(i);
    }
}
