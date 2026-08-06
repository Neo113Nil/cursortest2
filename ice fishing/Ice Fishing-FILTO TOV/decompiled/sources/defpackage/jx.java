package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class jx extends d71 implements lv {
    public final /* synthetic */ kx E7jCp8Ls;
    public int JFJ3QoxA;
    public long mOu10nynGul;
    public /* synthetic */ Object rQPn8YBR;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx(kx kxVar, vg vgVar) {
        super(2, vgVar);
        this.E7jCp8Ls = kxVar;
    }

    @Override // defpackage.lv
    public final Object EljAMC1QTz(Object obj, Object obj2) {
        return ((jx) uFEq9NpZ((vg) obj2, (ph) obj)).WIEu4Ya2g8(kc1.GWasM1elztuh);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0033 -> B:5:0x0036). Please report as a decompilation issue!!! */
    @Override // defpackage.h6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WIEu4Ya2g8(Object obj) {
        long nanoTime;
        ph phVar = (ph) this.rQPn8YBR;
        int i = this.JFJ3QoxA;
        if (i == 0) {
            o50.A1EKNP6CxJ(obj);
            nanoTime = System.nanoTime();
            if (fb1.YZjbz8VdP5(phVar)) {
            }
        } else {
            if (i != 1) {
                o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            nanoTime = this.mOu10nynGul;
            o50.A1EKNP6CxJ(obj);
            long nanoTime2 = System.nanoTime();
            this.E7jCp8Ls.EljAMC1QTz.mE4lRynR(new nw((nanoTime2 - nanoTime) / 1000000));
            nanoTime = nanoTime2;
            if (fb1.YZjbz8VdP5(phVar)) {
                this.rQPn8YBR = phVar;
                this.mOu10nynGul = nanoTime;
                this.JFJ3QoxA = 1;
                Object mE4lRynR = o30.mE4lRynR(200L, this);
                qh qhVar = qh.OOA6hdeuvCS;
                if (mE4lRynR == qhVar) {
                    return qhVar;
                }
                long nanoTime22 = System.nanoTime();
                this.E7jCp8Ls.EljAMC1QTz.mE4lRynR(new nw((nanoTime22 - nanoTime) / 1000000));
                nanoTime = nanoTime22;
                if (fb1.YZjbz8VdP5(phVar)) {
                    return kc1.GWasM1elztuh;
                }
            }
        }
    }

    @Override // defpackage.h6
    public final vg uFEq9NpZ(vg vgVar, Object obj) {
        jx jxVar = new jx(this.E7jCp8Ls, vgVar);
        jxVar.rQPn8YBR = obj;
        return jxVar;
    }
}
