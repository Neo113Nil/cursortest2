package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zfq implements woh {
    public static final yvs c = new yvs(new xvs("", bgq.j));
    public final long a;
    public final ArrayList b = new ArrayList();

    public zfq(long j) {
        this.a = j;
    }

    @Override // defpackage.woh
    public final long a(zsb[] zsbVarArr, boolean[] zArr, aoo[] aooVarArr, boolean[] zArr2, long j) {
        long j2 = dvt.j(j, 0L, this.a);
        for (int i = 0; i < zsbVarArr.length; i++) {
            aoo aooVar = aooVarArr[i];
            ArrayList arrayList = this.b;
            if (aooVar != null && (zsbVarArr[i] == null || !zArr[i])) {
                arrayList.remove(aooVar);
                aooVarArr[i] = null;
            }
            if (aooVarArr[i] == null && zsbVarArr[i] != null) {
                agq agqVar = new agq(this.a);
                agqVar.a(j2);
                arrayList.add(agqVar);
                aooVarArr[i] = agqVar;
                zArr2[i] = true;
            }
        }
        return j2;
    }

    @Override // defpackage.woh
    public final long c(long j, hap hapVar) {
        return dvt.j(j, 0L, this.a);
    }

    @Override // defpackage.ahp
    public final long e() {
        return Long.MIN_VALUE;
    }

    @Override // defpackage.ahp
    public final boolean f() {
        return false;
    }

    @Override // defpackage.woh
    public final long h(long j) {
        long j2 = dvt.j(j, 0L, this.a);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return j2;
            }
            ((agq) arrayList.get(i)).a(j2);
            i++;
        }
    }

    @Override // defpackage.woh
    public final long i() {
        return -9223372036854775807L;
    }

    @Override // defpackage.woh
    public final void l(voh vohVar, long j) {
        vohVar.g(this);
    }

    @Override // defpackage.woh
    public final yvs m() {
        return c;
    }

    @Override // defpackage.ahp
    public final boolean n(dhg dhgVar) {
        return false;
    }

    @Override // defpackage.ahp
    public final long r() {
        return Long.MIN_VALUE;
    }

    @Override // defpackage.woh
    public final void k() {
    }

    @Override // defpackage.ahp
    public final void t(long j) {
    }

    @Override // defpackage.woh
    public final void s(long j, boolean z) {
    }
}
