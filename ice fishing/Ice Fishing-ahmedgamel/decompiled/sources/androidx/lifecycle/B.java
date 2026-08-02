package androidx.lifecycle;

/* loaded from: classes.dex */
public abstract class B {

    /* renamed from: n, reason: collision with root package name */
    public final n4.c f5053n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f5054u;

    /* renamed from: v, reason: collision with root package name */
    public int f5055v = -1;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C f5056w;

    public B(C c9, n4.c cVar) {
        this.f5056w = c9;
        this.f5053n = cVar;
    }

    public final void b(boolean z6) {
        if (z6 == this.f5054u) {
            return;
        }
        this.f5054u = z6;
        int i = z6 ? 1 : -1;
        C c9 = this.f5056w;
        int i4 = c9.f5060c;
        c9.f5060c = i + i4;
        if (!c9.f5061d) {
            c9.f5061d = true;
            while (true) {
                try {
                    int i6 = c9.f5060c;
                    if (i4 == i6) {
                        break;
                    } else {
                        i4 = i6;
                    }
                } finally {
                    c9.f5061d = false;
                }
            }
        }
        if (this.f5054u) {
            c9.c(this);
        }
    }

    public void c() {
    }

    public abstract boolean d();
}
