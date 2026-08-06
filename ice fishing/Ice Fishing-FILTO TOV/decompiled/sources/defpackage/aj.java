package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class aj extends d71 implements lv {
    public final /* synthetic */ fj E7jCp8Ls;
    public int JFJ3QoxA;
    public final /* synthetic */ int XnEVoBF0td1l;
    public final /* synthetic */ int mOu10nynGul;
    public /* synthetic */ boolean rQPn8YBR;
    public Object uFEq9NpZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aj(fj fjVar, int i, vg vgVar, int i2) {
        super(2, vgVar);
        this.mOu10nynGul = i2;
        this.E7jCp8Ls = fjVar;
        this.XnEVoBF0td1l = i;
    }

    @Override // defpackage.lv
    public final Object EljAMC1QTz(Object obj, Object obj2) {
        int i = this.mOu10nynGul;
        kc1 kc1Var = kc1.GWasM1elztuh;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        vg vgVar = (vg) obj2;
        switch (i) {
        }
        return ((aj) uFEq9NpZ(vgVar, bool)).WIEu4Ya2g8(kc1Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0035, code lost:
    
        if (r10 == r4) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Override // defpackage.h6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WIEu4Ya2g8(Object obj) {
        Throwable th;
        l51 l51Var;
        boolean z;
        boolean z2;
        Object obj2;
        int i = this.mOu10nynGul;
        int i2 = this.XnEVoBF0td1l;
        qh qhVar = qh.OOA6hdeuvCS;
        fj fjVar = this.E7jCp8Ls;
        switch (i) {
            case 0:
                boolean z3 = this.JFJ3QoxA;
                try {
                } catch (Throwable th2) {
                    th = th2;
                    if (z3 != 0) {
                        r21 mOu10nynGul = fjVar.mOu10nynGul();
                        this.uFEq9NpZ = th;
                        this.rQPn8YBR = z3;
                        this.JFJ3QoxA = 2;
                        Integer GWasM1elztuh = mOu10nynGul.GWasM1elztuh();
                        if (GWasM1elztuh != qhVar) {
                            obj = GWasM1elztuh;
                            th = th;
                            z3 = z3;
                        }
                    }
                }
                if (z3 == 0) {
                    o50.A1EKNP6CxJ(obj);
                    boolean z4 = this.rQPn8YBR;
                    this.rQPn8YBR = z4;
                    this.JFJ3QoxA = 1;
                    obj = fj.encWxUiV2(fjVar, z4, this);
                    z3 = z4;
                    if (obj == qhVar) {
                        return qhVar;
                    }
                } else {
                    if (z3 != 1) {
                        if (z3 != 2) {
                            o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        boolean z5 = this.rQPn8YBR;
                        th = (Throwable) this.uFEq9NpZ;
                        o50.A1EKNP6CxJ(obj);
                        z3 = z5;
                        i2 = ((Number) obj).intValue();
                        th = th;
                        l51Var = new vs0(th, i2);
                        z = z3;
                        return new rn0(l51Var, Boolean.valueOf(z));
                    }
                    boolean z6 = this.rQPn8YBR;
                    o50.A1EKNP6CxJ(obj);
                    z3 = z6;
                }
                l51Var = (l51) obj;
                z = z3;
                return new rn0(l51Var, Boolean.valueOf(z));
            default:
                int i3 = this.JFJ3QoxA;
                if (i3 == 0) {
                    o50.A1EKNP6CxJ(obj);
                    z2 = this.rQPn8YBR;
                    this.rQPn8YBR = z2;
                    this.JFJ3QoxA = 1;
                    obj = fjVar.JFJ3QoxA(this);
                    break;
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj2 = this.uFEq9NpZ;
                        o50.A1EKNP6CxJ(obj);
                        i2 = ((Number) obj).intValue();
                        obj = obj2;
                        return new bi(obj == null ? obj.hashCode() : 0, i2, obj);
                    }
                    z2 = this.rQPn8YBR;
                    o50.A1EKNP6CxJ(obj);
                }
                if (z2) {
                    r21 mOu10nynGul2 = fjVar.mOu10nynGul();
                    this.uFEq9NpZ = obj;
                    this.JFJ3QoxA = 2;
                    Integer GWasM1elztuh2 = mOu10nynGul2.GWasM1elztuh();
                    if (GWasM1elztuh2 != qhVar) {
                        Object obj3 = obj;
                        obj = GWasM1elztuh2;
                        obj2 = obj3;
                        i2 = ((Number) obj).intValue();
                        obj = obj2;
                    }
                    return qhVar;
                }
                return new bi(obj == null ? obj.hashCode() : 0, i2, obj);
        }
    }

    @Override // defpackage.h6
    public final vg uFEq9NpZ(vg vgVar, Object obj) {
        int i = this.mOu10nynGul;
        int i2 = this.XnEVoBF0td1l;
        fj fjVar = this.E7jCp8Ls;
        switch (i) {
            case 0:
                aj ajVar = new aj(fjVar, i2, vgVar, 0);
                ajVar.rQPn8YBR = ((Boolean) obj).booleanValue();
                return ajVar;
            default:
                aj ajVar2 = new aj(fjVar, i2, vgVar, 1);
                ajVar2.rQPn8YBR = ((Boolean) obj).booleanValue();
                return ajVar2;
        }
    }
}
