package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.ads.hB, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3285hB implements Serializable, InterfaceC3231gB {

    /* renamed from: n, reason: collision with root package name */
    public final transient C3445kB f30746n = new C3445kB();

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC3231gB f30747u;

    /* renamed from: v, reason: collision with root package name */
    public volatile transient boolean f30748v;

    /* renamed from: w, reason: collision with root package name */
    public transient Object f30749w;

    public C3285hB(InterfaceC3231gB interfaceC3231gB) {
        this.f30747u = interfaceC3231gB;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3231gB
    /* renamed from: c */
    public final Object mo15c() {
        if (!this.f30748v) {
            synchronized (this.f30746n) {
                try {
                    if (!this.f30748v) {
                        Object mo15c = this.f30747u.mo15c();
                        this.f30749w = mo15c;
                        this.f30748v = true;
                        return mo15c;
                    }
                } finally {
                }
            }
        }
        return this.f30749w;
    }

    public final String toString() {
        Object obj;
        if (this.f30748v) {
            String valueOf = String.valueOf(this.f30749w);
            obj = D.y.s(new StringBuilder(valueOf.length() + 25), "<supplier that returned ", valueOf, ">");
        } else {
            obj = this.f30747u;
        }
        String obj2 = obj.toString();
        return D.y.s(new StringBuilder(obj2.length() + 19), "Suppliers.memoize(", obj2, ")");
    }
}
