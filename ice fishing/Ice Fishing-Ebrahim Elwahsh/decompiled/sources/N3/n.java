package N3;

/* loaded from: classes2.dex */
public final class n implements Y3.a {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f2183c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f2184a = f2183c;

    /* renamed from: b, reason: collision with root package name */
    public volatile Y3.a f2185b;

    public n(Y3.a aVar) {
        this.f2185b = aVar;
    }

    @Override // Y3.a
    public final Object get() {
        Object obj;
        Object obj2 = this.f2184a;
        Object obj3 = f2183c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f2184a;
                if (obj == obj3) {
                    obj = this.f2185b.get();
                    this.f2184a = obj;
                    this.f2185b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
