package K;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1586a;

    /* renamed from: b, reason: collision with root package name */
    public e f1587b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1588c;

    public final void a(e eVar) {
        synchronized (this) {
            while (this.f1588c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } finally {
                }
            }
            if (this.f1587b == eVar) {
                return;
            }
            this.f1587b = eVar;
            if (this.f1586a) {
                eVar.a();
            }
        }
    }
}
