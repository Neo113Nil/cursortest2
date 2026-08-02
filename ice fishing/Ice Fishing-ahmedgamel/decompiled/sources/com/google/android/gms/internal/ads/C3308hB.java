package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.ads.hB, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3308hB implements Serializable, InterfaceC3254gB {

    /* renamed from: n, reason: collision with root package name */
    public final transient C3468kB f31512n = new C3468kB();

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC3254gB f31513u;

    /* renamed from: v, reason: collision with root package name */
    public volatile transient boolean f31514v;

    /* renamed from: w, reason: collision with root package name */
    public transient Object f31515w;

    public C3308hB(InterfaceC3254gB interfaceC3254gB) {
        this.f31513u = interfaceC3254gB;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3254gB
    /* renamed from: c */
    public final Object mo14c() {
        if (!this.f31514v) {
            synchronized (this.f31512n) {
                try {
                    if (!this.f31514v) {
                        Object mo14c = this.f31513u.mo14c();
                        this.f31515w = mo14c;
                        this.f31514v = true;
                        return mo14c;
                    }
                } finally {
                }
            }
        }
        return this.f31515w;
    }

    public final String toString() {
        Object obj;
        if (this.f31514v) {
            String valueOf = String.valueOf(this.f31515w);
            obj = D.x.p(new StringBuilder(valueOf.length() + 25), "<supplier that returned ", valueOf, ">");
        } else {
            obj = this.f31513u;
        }
        String obj2 = obj.toString();
        return D.x.p(new StringBuilder(obj2.length() + 19), "Suppliers.memoize(", obj2, ")");
    }
}
