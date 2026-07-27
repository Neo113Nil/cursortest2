package R3;

import c4.InterfaceC0542a;

/* loaded from: classes2.dex */
public final class n implements InterfaceC0542a {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f2743c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f2744a = f2743c;

    /* renamed from: b, reason: collision with root package name */
    public volatile InterfaceC0542a f2745b;

    public n(InterfaceC0542a interfaceC0542a) {
        this.f2745b = interfaceC0542a;
    }

    @Override // c4.InterfaceC0542a
    public final Object get() {
        Object obj;
        Object obj2 = this.f2744a;
        Object obj3 = f2743c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f2744a;
                if (obj == obj3) {
                    obj = this.f2745b.get();
                    this.f2744a = obj;
                    this.f2745b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
