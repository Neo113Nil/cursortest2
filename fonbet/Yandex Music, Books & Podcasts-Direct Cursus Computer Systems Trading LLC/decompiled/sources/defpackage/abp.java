package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class abp extends zap {
    public final List j;

    public abp(whn whnVar, long j, long j2, long j3, long j4, List list, long j5, List list2, long j6, long j7) {
        super(whnVar, j, j2, j3, j4, list, j5, j6, j7);
        this.j = list2;
    }

    @Override // defpackage.zap
    public final long d(long j) {
        return this.j.size();
    }

    @Override // defpackage.zap
    public final whn h(yzn yznVar, long j) {
        return (whn) this.j.get((int) (j - this.d));
    }

    @Override // defpackage.zap
    public final boolean i() {
        return true;
    }
}
