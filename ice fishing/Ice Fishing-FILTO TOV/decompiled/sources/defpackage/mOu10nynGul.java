package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class mOu10nynGul extends d71 implements lv {
    public final /* synthetic */ vr0 E7jCp8Ls;
    public int JFJ3QoxA;
    public final /* synthetic */ bb XnEVoBF0td1l;
    public final /* synthetic */ int mOu10nynGul;
    public final /* synthetic */ tf0 rQPn8YBR;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mOu10nynGul(tf0 tf0Var, vr0 vr0Var, bb bbVar, vg vgVar, int i) {
        super(2, vgVar);
        this.mOu10nynGul = i;
        this.rQPn8YBR = tf0Var;
        this.E7jCp8Ls = vr0Var;
        this.XnEVoBF0td1l = bbVar;
    }

    @Override // defpackage.lv
    public final Object EljAMC1QTz(Object obj, Object obj2) {
        int i = this.mOu10nynGul;
        kc1 kc1Var = kc1.GWasM1elztuh;
        ph phVar = (ph) obj;
        vg vgVar = (vg) obj2;
        switch (i) {
        }
        return ((mOu10nynGul) uFEq9NpZ(vgVar, phVar)).WIEu4Ya2g8(kc1Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r3.GWasM1elztuh(r9, r10) == r6) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
    
        if (defpackage.o30.mE4lRynR(r4, r10) == r6) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006d, code lost:
    
        if (r3.GWasM1elztuh(r9, r10) == r6) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0064, code lost:
    
        if (defpackage.o30.mE4lRynR(r4, r10) == r6) goto L31;
     */
    @Override // defpackage.h6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WIEu4Ya2g8(Object obj) {
        int i = this.mOu10nynGul;
        kc1 kc1Var = kc1.GWasM1elztuh;
        bb bbVar = this.XnEVoBF0td1l;
        tf0 tf0Var = this.rQPn8YBR;
        qh qhVar = qh.OOA6hdeuvCS;
        vr0 vr0Var = this.E7jCp8Ls;
        switch (i) {
            case 0:
                int i2 = this.JFJ3QoxA;
                if (i2 == 0) {
                    o50.A1EKNP6CxJ(obj);
                    long j = cb.GWasM1elztuh;
                    this.JFJ3QoxA = 1;
                    break;
                } else if (i2 == 1) {
                    o50.A1EKNP6CxJ(obj);
                } else if (i2 != 2) {
                    o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    o50.A1EKNP6CxJ(obj);
                    bbVar.A1EKNP6CxJ = vr0Var;
                    break;
                }
                this.JFJ3QoxA = 2;
                break;
            default:
                int i3 = this.JFJ3QoxA;
                if (i3 == 0) {
                    o50.A1EKNP6CxJ(obj);
                    long j2 = cb.GWasM1elztuh;
                    this.JFJ3QoxA = 1;
                    break;
                } else if (i3 == 1) {
                    o50.A1EKNP6CxJ(obj);
                } else if (i3 != 2) {
                    o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    o50.A1EKNP6CxJ(obj);
                    bbVar.ozMwhSAI = vr0Var;
                    break;
                }
                this.JFJ3QoxA = 2;
                break;
        }
        return kc1Var;
    }

    @Override // defpackage.h6
    public final vg uFEq9NpZ(vg vgVar, Object obj) {
        switch (this.mOu10nynGul) {
            case 0:
                return new mOu10nynGul(this.rQPn8YBR, this.E7jCp8Ls, this.XnEVoBF0td1l, vgVar, 0);
            default:
                return new mOu10nynGul(this.rQPn8YBR, this.E7jCp8Ls, this.XnEVoBF0td1l, vgVar, 1);
        }
    }
}
