package defpackage;

/* loaded from: classes.dex */
public interface rzt {
    cn0 A(long j, cn0 cn0Var, cn0 cn0Var2, cn0 cn0Var3);

    boolean a();

    long m(cn0 cn0Var, cn0 cn0Var2, cn0 cn0Var3);

    default cn0 v(cn0 cn0Var, cn0 cn0Var2, cn0 cn0Var3) {
        return x(m(cn0Var, cn0Var2, cn0Var3), cn0Var, cn0Var2, cn0Var3);
    }

    cn0 x(long j, cn0 cn0Var, cn0 cn0Var2, cn0 cn0Var3);
}
