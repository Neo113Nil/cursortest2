package defpackage;

/* loaded from: classes7.dex */
public final class w681 {
    public static boolean a(gg81 gg81Var) {
        a081 a081Var;
        a081 a081Var2 = a081.g;
        if (a081Var2 == null) {
            synchronized (a081.f) {
                a081Var = a081.g;
                if (a081Var == null) {
                    a081Var = new a081();
                    a081.g = a081Var;
                }
            }
            a081Var2 = a081Var;
        }
        return !jl40.l(a081Var2.c(), gg81Var.O);
    }
}
