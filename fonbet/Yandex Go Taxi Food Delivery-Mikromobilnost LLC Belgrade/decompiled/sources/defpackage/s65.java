package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes8.dex */
public abstract class s65 {
    public s9a0 a;
    public final pmn b;

    public s65(s9a0 s9a0Var, pmn pmnVar) {
        this.a = s9a0Var;
        this.b = pmnVar;
    }

    public static bt51 d(uv51 uv51Var, tv51 tv51Var) {
        Object obj = tv51Var.c;
        boolean z = obj instanceof zv51;
        String str = tv51Var.a;
        String str2 = tv51Var.b;
        if (!z) {
            return new zs51(str, str2, tv51Var);
        }
        zv51 zv51Var = (zv51) obj;
        mv51 a = uv51Var.a();
        String b = a != null ? a.b() : null;
        if (b == null) {
            b = "";
        }
        return new at51(str, str2, tv51Var, zv51Var, b);
    }

    public abstract Object a(nea0 nea0Var, rhq0 rhq0Var, boolean z, bfa0 bfa0Var, Continuation continuation);

    public abstract Object b(Continuation continuation);

    public abstract bfa0 c(nea0 nea0Var);

    public abstract boolean e(nea0 nea0Var);
}
