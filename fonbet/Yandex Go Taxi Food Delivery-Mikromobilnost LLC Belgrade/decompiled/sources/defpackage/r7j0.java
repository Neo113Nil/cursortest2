package defpackage;

/* loaded from: classes10.dex */
public class r7j0 extends d95 {
    public static r7j0 O;

    public static r7j0 A(exj exjVar) {
        return (r7j0) new r7j0().e(exjVar);
    }

    public static r7j0 B() {
        if (O == null) {
            r7j0 r7j0Var = (r7j0) new r7j0().v(true);
            r7j0Var.b();
            O = r7j0Var;
        }
        return O;
    }

    @Override // defpackage.d95
    public final boolean equals(Object obj) {
        return (obj instanceof r7j0) && super.equals(obj);
    }
}
