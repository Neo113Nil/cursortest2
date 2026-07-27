package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.iB, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3339iB implements InterfaceC3231gB {

    /* renamed from: n, reason: collision with root package name */
    public final C3445kB f31008n = new C3445kB();

    /* renamed from: u, reason: collision with root package name */
    public volatile InterfaceC3231gB f31009u;

    /* renamed from: v, reason: collision with root package name */
    public Object f31010v;

    public C3339iB(InterfaceC3231gB interfaceC3231gB) {
        this.f31009u = interfaceC3231gB;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3231gB
    /* renamed from: c */
    public final Object mo15c() {
        if (this.f31009u != null) {
            synchronized (this.f31008n) {
                try {
                    if (this.f31009u != null) {
                        Object mo15c = this.f31009u.mo15c();
                        this.f31010v = mo15c;
                        this.f31009u = null;
                        return mo15c;
                    }
                } finally {
                }
            }
        }
        return this.f31010v;
    }

    public final String toString() {
        Object obj = this.f31009u;
        if (obj == null) {
            String valueOf = String.valueOf(this.f31010v);
            obj = D.y.s(new StringBuilder(valueOf.length() + 25), "<supplier that returned ", valueOf, ">");
        }
        String obj2 = obj.toString();
        return D.y.s(new StringBuilder(obj2.length() + 19), "Suppliers.memoize(", obj2, ")");
    }
}
