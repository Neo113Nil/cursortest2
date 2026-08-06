package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class j51 extends d71 implements mv {
    public final /* synthetic */ k51 E7jCp8Ls;
    public /* synthetic */ ms JFJ3QoxA;
    public int mOu10nynGul;
    public /* synthetic */ int rQPn8YBR;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j51(k51 k51Var, vg vgVar) {
        super(3, vgVar);
        this.E7jCp8Ls = k51Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x007b, code lost:
    
        if (r0.E7jCp8Ls(defpackage.j21.AvO7iQsrTN, r8) == r7) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
    
        if (defpackage.o30.mE4lRynR(Long.MAX_VALUE, r8) == r7) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (r0.E7jCp8Ls(defpackage.j21.EljAMC1QTz, r8) == r7) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0044, code lost:
    
        if (r0.E7jCp8Ls(defpackage.j21.OOA6hdeuvCS, r8) == r7) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0051, code lost:
    
        if (defpackage.o30.mE4lRynR(0, r8) == r7) goto L32;
     */
    @Override // defpackage.h6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WIEu4Ya2g8(Object obj) {
        ms msVar;
        int i = this.mOu10nynGul;
        qh qhVar = qh.OOA6hdeuvCS;
        if (i == 0) {
            o50.A1EKNP6CxJ(obj);
            msVar = this.JFJ3QoxA;
            if (this.rQPn8YBR > 0) {
                this.mOu10nynGul = 1;
            } else {
                this.JFJ3QoxA = msVar;
                this.mOu10nynGul = 2;
            }
            return qhVar;
        }
        if (i != 1) {
            if (i == 2) {
                msVar = this.JFJ3QoxA;
                o50.A1EKNP6CxJ(obj);
                this.JFJ3QoxA = msVar;
                this.mOu10nynGul = 3;
            } else if (i == 3) {
                msVar = this.JFJ3QoxA;
                o50.A1EKNP6CxJ(obj);
                this.JFJ3QoxA = msVar;
                this.mOu10nynGul = 4;
            } else if (i == 4) {
                msVar = this.JFJ3QoxA;
                o50.A1EKNP6CxJ(obj);
                this.JFJ3QoxA = null;
                this.mOu10nynGul = 5;
            } else if (i != 5) {
                o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        o50.A1EKNP6CxJ(obj);
        return kc1.GWasM1elztuh;
    }

    @Override // defpackage.mv
    public final Object X1lG3V04pd(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        j51 j51Var = new j51(this.E7jCp8Ls, (vg) obj3);
        j51Var.JFJ3QoxA = (ms) obj;
        j51Var.rQPn8YBR = intValue;
        return j51Var.WIEu4Ya2g8(kc1.GWasM1elztuh);
    }
}
