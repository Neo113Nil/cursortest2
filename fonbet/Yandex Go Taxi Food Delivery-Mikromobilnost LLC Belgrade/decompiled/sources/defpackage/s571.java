package defpackage;

/* loaded from: classes7.dex */
public final class s571 {
    public final s871 a() {
        s871 s871Var;
        s871 s871Var2 = s871.c;
        if (s871Var2 != null) {
            return s871Var2;
        }
        synchronized (this) {
            s871Var = s871.c;
            if (s871Var == null) {
                s871Var = new s871();
                s871.c = s871Var;
            }
        }
        return s871Var;
    }
}
