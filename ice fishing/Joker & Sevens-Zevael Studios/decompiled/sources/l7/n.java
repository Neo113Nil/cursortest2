package l7;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class n implements w7.a {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f4242c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f4243a = f4242c;

    /* renamed from: b, reason: collision with root package name */
    public volatile w7.a f4244b;

    public n(w7.a aVar) {
        this.f4244b = aVar;
    }

    @Override // w7.a
    public final Object get() {
        Object obj;
        Object obj2 = this.f4243a;
        Object obj3 = f4242c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f4243a;
                if (obj == obj3) {
                    obj = this.f4244b.get();
                    this.f4243a = obj;
                    this.f4244b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
