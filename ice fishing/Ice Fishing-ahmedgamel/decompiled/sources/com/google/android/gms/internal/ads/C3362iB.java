package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.iB, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3362iB implements InterfaceC3254gB {

    /* renamed from: n, reason: collision with root package name */
    public final C3468kB f31781n = new C3468kB();

    /* renamed from: u, reason: collision with root package name */
    public volatile InterfaceC3254gB f31782u;

    /* renamed from: v, reason: collision with root package name */
    public Object f31783v;

    public C3362iB(InterfaceC3254gB interfaceC3254gB) {
        this.f31782u = interfaceC3254gB;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3254gB
    /* renamed from: c */
    public final Object mo14c() {
        if (this.f31782u != null) {
            synchronized (this.f31781n) {
                try {
                    if (this.f31782u != null) {
                        Object mo14c = this.f31782u.mo14c();
                        this.f31783v = mo14c;
                        this.f31782u = null;
                        return mo14c;
                    }
                } finally {
                }
            }
        }
        return this.f31783v;
    }

    public final String toString() {
        Object obj = this.f31782u;
        if (obj == null) {
            String valueOf = String.valueOf(this.f31783v);
            obj = D.x.p(new StringBuilder(valueOf.length() + 25), "<supplier that returned ", valueOf, ">");
        }
        String obj2 = obj.toString();
        return D.x.p(new StringBuilder(obj2.length() + 19), "Suppliers.memoize(", obj2, ")");
    }
}
