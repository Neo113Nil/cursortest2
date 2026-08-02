package defpackage;

/* loaded from: classes5.dex */
public abstract class d67 {
    public static final f67 a;
    public static final e07 b;

    static {
        f67 f67Var = new f67();
        f67Var.c = -1;
        a = f67Var;
        e07 e07Var = new e07();
        e07Var.d = -1;
        b = e07Var;
    }

    public static f67 a(e0 e0Var) {
        if (e0Var.c < 1) {
            return a;
        }
        f67 f67Var = new f67(e0Var);
        f67Var.c = -1;
        return f67Var;
    }

    public static e07 b(e0 e0Var) {
        if (e0Var.c < 1) {
            return b;
        }
        e07 e07Var = new e07(e0Var);
        e07Var.d = -1;
        return e07Var;
    }
}
