package defpackage;

/* loaded from: classes4.dex */
public final class vbv0 extends zij {
    @Override // defpackage.zij
    public final boolean a(Object obj, Object obj2) {
        return ((u9v0) obj).equals((u9v0) obj2);
    }

    @Override // defpackage.zij
    public final boolean b(Object obj, Object obj2) {
        u9v0 u9v0Var = (u9v0) obj;
        u9v0 u9v0Var2 = (u9v0) obj2;
        return jl40.l(u9v0Var.a.getFormattedAmount(), u9v0Var2.a.getFormattedAmount()) && u9v0Var.e == u9v0Var2.e;
    }
}
