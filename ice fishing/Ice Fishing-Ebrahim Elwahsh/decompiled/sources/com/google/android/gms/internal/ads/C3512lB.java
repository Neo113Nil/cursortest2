package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.lB, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3512lB implements InterfaceC3404jB {

    /* renamed from: n, reason: collision with root package name */
    public final C3620nB f32548n = new C3620nB();

    /* renamed from: u, reason: collision with root package name */
    public volatile InterfaceC3404jB f32549u;

    /* renamed from: v, reason: collision with root package name */
    public Object f32550v;

    public C3512lB(InterfaceC3404jB interfaceC3404jB) {
        this.f32549u = interfaceC3404jB;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3404jB
    public final Object a() {
        if (this.f32549u != null) {
            synchronized (this.f32548n) {
                try {
                    if (this.f32549u != null) {
                        Object a9 = this.f32549u.a();
                        this.f32550v = a9;
                        this.f32549u = null;
                        return a9;
                    }
                } finally {
                }
            }
        }
        return this.f32550v;
    }

    public final String toString() {
        Object obj = this.f32549u;
        if (obj == null) {
            String valueOf = String.valueOf(this.f32550v);
            obj = D.y.o(new StringBuilder(valueOf.length() + 25), "<supplier that returned ", valueOf, ">");
        }
        String obj2 = obj.toString();
        return D.y.o(new StringBuilder(obj2.length() + 19), "Suppliers.memoize(", obj2, ")");
    }
}
