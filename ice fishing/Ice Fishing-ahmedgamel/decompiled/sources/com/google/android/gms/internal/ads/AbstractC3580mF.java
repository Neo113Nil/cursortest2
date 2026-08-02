package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.mF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3580mF implements InterfaceC3636nH {

    /* renamed from: n, reason: collision with root package name */
    public final boolean f32712n;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f32713u = new ArrayList(1);

    /* renamed from: v, reason: collision with root package name */
    public int f32714v;

    /* renamed from: w, reason: collision with root package name */
    public C2994bJ f32715w;

    public AbstractC3580mF(boolean z6) {
        this.f32712n = z6;
    }

    public final void a(C2994bJ c2994bJ) {
        for (int i = 0; i < this.f32714v; i++) {
            ((InterfaceC3750pN) this.f32713u.get(i)).getClass();
        }
    }

    public final void c(C2994bJ c2994bJ) {
        this.f32715w = c2994bJ;
        for (int i = 0; i < this.f32714v; i++) {
            ((InterfaceC3750pN) this.f32713u.get(i)).c(this, c2994bJ, this.f32712n);
        }
    }

    public final void d(int i) {
        C2994bJ c2994bJ = this.f32715w;
        String str = AbstractC3182eu.f30782a;
        for (int i4 = 0; i4 < this.f32714v; i4++) {
            ((InterfaceC3750pN) this.f32713u.get(i4)).l(c2994bJ, this.f32712n, i);
        }
    }

    public final void e() {
        C2994bJ c2994bJ = this.f32715w;
        String str = AbstractC3182eu.f30782a;
        for (int i = 0; i < this.f32714v; i++) {
            ((InterfaceC3750pN) this.f32713u.get(i)).e(c2994bJ, this.f32712n);
        }
        this.f32715w = null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3636nH
    public final void m(InterfaceC3750pN interfaceC3750pN) {
        interfaceC3750pN.getClass();
        ArrayList arrayList = this.f32713u;
        if (arrayList.contains(interfaceC3750pN)) {
            return;
        }
        arrayList.add(interfaceC3750pN);
        this.f32714v++;
    }
}
