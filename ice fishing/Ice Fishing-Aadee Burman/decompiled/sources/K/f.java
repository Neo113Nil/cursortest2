package K;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1477a;

    /* renamed from: b, reason: collision with root package name */
    public e f1478b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1479c;

    public final void a(e eVar) {
        synchronized (this) {
            while (this.f1479c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } finally {
                }
            }
            if (this.f1478b == eVar) {
                return;
            }
            this.f1478b = eVar;
            if (this.f1477a) {
                eVar.a();
            }
        }
    }
}
