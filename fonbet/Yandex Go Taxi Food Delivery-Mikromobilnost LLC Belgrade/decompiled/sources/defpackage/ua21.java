package defpackage;

/* loaded from: classes2.dex */
public final class ua21 extends zij {
    public static final ua21 a = new ua21();

    @Override // defpackage.zij
    public final boolean a(Object obj, Object obj2) {
        r921 r921Var = (r921) obj;
        r921 r921Var2 = (r921) obj2;
        return ((r921Var instanceof la21) && (r921Var2 instanceof la21)) ? jl40.l(((la21) r921Var).a, ((la21) r921Var2).a) : r921Var.equals(r921Var2);
    }

    @Override // defpackage.zij
    public final boolean b(Object obj, Object obj2) {
        r921 r921Var = (r921) obj;
        r921 r921Var2 = (r921) obj2;
        return ((r921Var instanceof la21) && (r921Var2 instanceof la21)) ? ((la21) r921Var).a.a == ((la21) r921Var2).a.a : r921Var.equals(r921Var2);
    }
}
