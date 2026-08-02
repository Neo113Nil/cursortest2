package defpackage;

/* loaded from: classes10.dex */
public abstract class ryy {
    public vyy a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;

    public final void a() {
        t091 t091Var = (t091) this;
        if (t091Var.g != null) {
            boolean z = t091Var.b;
            if (!z) {
                if (z) {
                    t091Var.b();
                } else {
                    t091Var.e = true;
                }
            }
            db3 db3Var = t091Var.h;
            db3 db3Var2 = t091Var.g;
            if (db3Var != null) {
                db3Var2.getClass();
                t091Var.g = null;
                return;
            }
            db3Var2.getClass();
            db3 db3Var3 = t091Var.g;
            db3Var3.c.set(true);
            if (db3Var3.a.cancel(false)) {
                t091Var.h = t091Var.g;
            }
            t091Var.g = null;
        }
    }

    public final void b() {
        t091 t091Var = (t091) this;
        t091Var.a();
        t091Var.g = new db3(t091Var);
        t091Var.c();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        Class<?> cls = getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append(" id=0}");
        return sb.toString();
    }
}
