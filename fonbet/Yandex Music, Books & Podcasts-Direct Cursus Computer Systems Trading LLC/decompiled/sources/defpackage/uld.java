package defpackage;

/* loaded from: classes.dex */
public final class uld extends nyf {
    public static final uld b = new uld();
    public static final tld c = new tld();

    @Override // defpackage.nyf
    public final void a(czf czfVar) {
        if (!(czfVar instanceof yn7)) {
            throw new IllegalArgumentException((czfVar + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
        }
        yn7 yn7Var = (yn7) czfVar;
        tld tldVar = c;
        yn7Var.onCreate(tldVar);
        yn7Var.onStart(tldVar);
        yn7Var.onResume(tldVar);
    }

    @Override // defpackage.nyf
    public final lyf b() {
        return lyf.e;
    }

    public final String toString() {
        return "coil.request.GlobalLifecycle";
    }

    @Override // defpackage.nyf
    public final void d(czf czfVar) {
    }
}
