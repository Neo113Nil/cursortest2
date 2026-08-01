package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.mF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3557mF implements InterfaceC3613nH {

    /* renamed from: n, reason: collision with root package name */
    public final boolean f31932n;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f31933u = new ArrayList(1);

    /* renamed from: v, reason: collision with root package name */
    public int f31934v;

    /* renamed from: w, reason: collision with root package name */
    public C2971bJ f31935w;

    public AbstractC3557mF(boolean z3) {
        this.f31932n = z3;
    }

    public final void a(C2971bJ c2971bJ) {
        for (int i = 0; i < this.f31934v; i++) {
            ((InterfaceC3727pN) this.f31933u.get(i)).getClass();
        }
    }

    public final void b(C2971bJ c2971bJ) {
        this.f31935w = c2971bJ;
        for (int i = 0; i < this.f31934v; i++) {
            ((InterfaceC3727pN) this.f31933u.get(i)).c(this, c2971bJ, this.f31932n);
        }
    }

    public final void c(int i) {
        C2971bJ c2971bJ = this.f31935w;
        String str = AbstractC3159eu.f29993a;
        for (int i6 = 0; i6 < this.f31934v; i6++) {
            ((InterfaceC3727pN) this.f31933u.get(i6)).l(c2971bJ, this.f31932n, i);
        }
    }

    public final void d() {
        C2971bJ c2971bJ = this.f31935w;
        String str = AbstractC3159eu.f29993a;
        for (int i = 0; i < this.f31934v; i++) {
            ((InterfaceC3727pN) this.f31933u.get(i)).e(c2971bJ, this.f31932n);
        }
        this.f31935w = null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3613nH
    public final void k(InterfaceC3727pN interfaceC3727pN) {
        interfaceC3727pN.getClass();
        ArrayList arrayList = this.f31933u;
        if (arrayList.contains(interfaceC3727pN)) {
            return;
        }
        arrayList.add(interfaceC3727pN);
        this.f31934v++;
    }
}
