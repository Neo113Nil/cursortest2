package h1;

import java.io.Serializable;
import t1.InterfaceC1046a;

/* renamed from: h1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0237g implements InterfaceC0233c, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC1046a f3389a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f3390b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3391c;

    public C0237g(InterfaceC1046a initializer) {
        kotlin.jvm.internal.i.e(initializer, "initializer");
        this.f3389a = initializer;
        this.f3390b = C0238h.f3392a;
        this.f3391c = this;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f3390b;
        C0238h c0238h = C0238h.f3392a;
        if (obj2 != c0238h) {
            return obj2;
        }
        synchronized (this.f3391c) {
            obj = this.f3390b;
            if (obj == c0238h) {
                InterfaceC1046a interfaceC1046a = this.f3389a;
                kotlin.jvm.internal.i.b(interfaceC1046a);
                obj = interfaceC1046a.invoke();
                this.f3390b = obj;
                this.f3389a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f3390b != C0238h.f3392a ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
