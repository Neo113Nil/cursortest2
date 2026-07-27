package androidx.lifecycle;

/* loaded from: classes.dex */
public abstract class B {

    /* renamed from: n, reason: collision with root package name */
    public final I0.j f5198n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f5199u;

    /* renamed from: v, reason: collision with root package name */
    public int f5200v = -1;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C f5201w;

    public B(C c4, I0.j jVar) {
        this.f5201w = c4;
        this.f5198n = jVar;
    }

    public final void b(boolean z8) {
        if (z8 == this.f5199u) {
            return;
        }
        this.f5199u = z8;
        int i = z8 ? 1 : -1;
        C c4 = this.f5201w;
        int i4 = c4.f5205c;
        c4.f5205c = i + i4;
        if (!c4.f5206d) {
            c4.f5206d = true;
            while (true) {
                try {
                    int i9 = c4.f5205c;
                    if (i4 == i9) {
                        break;
                    } else {
                        i4 = i9;
                    }
                } finally {
                    c4.f5206d = false;
                }
            }
        }
        if (this.f5199u) {
            c4.c(this);
        }
    }

    public void c() {
    }

    public abstract boolean d();
}
