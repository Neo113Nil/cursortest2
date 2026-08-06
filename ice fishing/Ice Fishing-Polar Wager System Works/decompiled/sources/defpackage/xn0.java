package defpackage;

/* loaded from: classes.dex */
public final class xn0 implements defpackage.m00 {
    public final /* synthetic */ defpackage.r31 AARZUJiTa;
    public final /* synthetic */ defpackage.sl0 EXtogiMhuM;
    public final /* synthetic */ defpackage.s61 adDC3e2L;
    public final /* synthetic */ defpackage.ec1 riuEU0zW4;
    public final /* synthetic */ defpackage.nm0 xiZrDbcSW0;

    public xn0(defpackage.s61 s61Var, defpackage.nm0 nm0Var, defpackage.s31 s31Var, defpackage.sl0 sl0Var, defpackage.ec1 ec1Var) {
        this.adDC3e2L = s61Var;
        this.xiZrDbcSW0 = nm0Var;
        this.AARZUJiTa = s31Var;
        this.EXtogiMhuM = sl0Var;
        this.riuEU0zW4 = ec1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    @Override // defpackage.m00
    public final java.lang.Object riuEU0zW4(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        defpackage.nm0 nm0Var;
        defpackage.j4 j4Var = (defpackage.j4) obj;
        defpackage.nm0 nm0Var2 = (defpackage.nm0) obj2;
        defpackage.t10 t10Var = (defpackage.t10) obj3;
        ((java.lang.Number) obj4).intValue();
        boolean QoRHpC4k = defpackage.x70.QoRHpC4k(this.adDC3e2L.r1MBDhnF.getValue(), this.xiZrDbcSW0);
        if (!((java.lang.Boolean) this.EXtogiMhuM.getValue()).booleanValue() && !QoRHpC4k) {
            java.util.List list = (java.util.List) this.riuEU0zW4.getValue();
            java.util.ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    nm0Var = 0;
                    break;
                }
                nm0Var = listIterator.previous();
                if (defpackage.x70.QoRHpC4k(nm0Var2, (defpackage.nm0) nm0Var)) {
                    break;
                }
            }
            nm0Var2 = nm0Var;
        }
        if (nm0Var2 == null) {
            t10Var.AsxAYCCkb3Hi(105930796);
        } else {
            t10Var.AsxAYCCkb3Hi(-1520603531);
            defpackage.s70.oh6vYeIP(nm0Var2, this.AARZUJiTa, defpackage.h1.XZx205DYe(-1263531443, new defpackage.ma(4, nm0Var2, j4Var), t10Var), t10Var, 384);
        }
        t10Var.QoRHpC4k(false);
        return defpackage.ok1.IHQe1A4L2xu;
    }
}
