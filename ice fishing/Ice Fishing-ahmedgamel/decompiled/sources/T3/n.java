package T3;

import e4.InterfaceC4481a;

/* loaded from: classes2.dex */
public final class n implements InterfaceC4481a {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f3198c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f3199a = f3198c;

    /* renamed from: b, reason: collision with root package name */
    public volatile InterfaceC4481a f3200b;

    public n(InterfaceC4481a interfaceC4481a) {
        this.f3200b = interfaceC4481a;
    }

    @Override // e4.InterfaceC4481a
    public final Object get() {
        Object obj;
        Object obj2 = this.f3199a;
        Object obj3 = f3198c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f3199a;
                if (obj == obj3) {
                    obj = this.f3200b.get();
                    this.f3199a = obj;
                    this.f3200b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
