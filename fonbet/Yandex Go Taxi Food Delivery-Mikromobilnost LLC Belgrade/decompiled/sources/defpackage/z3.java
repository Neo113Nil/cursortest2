package defpackage;

/* loaded from: classes4.dex */
public abstract class z3 {
    public static void a(t3 t3Var, int i) {
        if (t3Var.k(i)) {
            return;
        }
        ny61.r(b64.l("Expected ", b(128, i), " tag but found ", b(t3Var.i(), t3Var.h())));
    }

    public static String b(int i, int i2) {
        return oyr.j(i2, i != 64 ? i != 128 ? i != 192 ? "[UNIVERSAL " : "[PRIVATE " : "[CONTEXT " : "[APPLICATION ", "]");
    }
}
