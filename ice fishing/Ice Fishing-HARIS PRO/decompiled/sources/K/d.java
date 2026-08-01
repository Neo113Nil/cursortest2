package K;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f378a;

    /* renamed from: b, reason: collision with root package name */
    public c f379b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f380c;

    public final void a(c cVar) {
        synchronized (this) {
            while (this.f380c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f379b == cVar) {
                return;
            }
            this.f379b = cVar;
            if (this.f378a) {
                cVar.a();
            }
        }
    }
}
