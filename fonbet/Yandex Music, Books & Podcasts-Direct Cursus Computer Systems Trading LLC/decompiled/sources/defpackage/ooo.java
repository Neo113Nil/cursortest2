package defpackage;

/* loaded from: classes.dex */
public final class ooo implements uyf, AutoCloseable {
    public final String a;
    public final noo b;
    public boolean c;

    public ooo(String str, noo nooVar) {
        this.a = str;
        this.b = nooVar;
    }

    @Override // defpackage.uyf
    public final void Q(dzf dzfVar, kyf kyfVar) {
        if (kyfVar == kyf.ON_DESTROY) {
            this.c = false;
            dzfVar.getLifecycle().d(this);
        }
    }

    public final void a(uoo uooVar, nyf nyfVar) {
        uooVar.getClass();
        nyfVar.getClass();
        if (this.c) {
            xq0.q("Already attached to lifecycleOwner");
            return;
        }
        this.c = true;
        nyfVar.a(this);
        uooVar.c(this.a, (ym5) this.b.b.e);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
