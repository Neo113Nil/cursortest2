package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class EL implements OL {

    /* renamed from: a, reason: collision with root package name */
    public final IK f24708a;

    /* renamed from: b, reason: collision with root package name */
    public final T2 f24709b;

    public EL(T2 t22, IK ik) {
        C3307hK c3307hK = ZK.f28981a;
        this.f24709b = t22;
        this.f24708a = ik;
    }

    @Override // com.google.android.gms.internal.ads.OL
    public final AbstractC3199fL a() {
        IK ik = this.f24708a;
        return ik instanceof AbstractC3199fL ? ((AbstractC3199fL) ik).p() : ((AbstractC3090dL) ((AbstractC3199fL) ik).w(5, null)).i();
    }

    @Override // com.google.android.gms.internal.ads.OL
    public final int b(AbstractC3199fL abstractC3199fL) {
        return abstractC3199fL.zzt.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.OL
    public final void c(Object obj, C4201y c4201y, YK yk) {
        this.f24709b.getClass();
        T2.B(obj);
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.ads.OL
    public final void d(Object obj, byte[] bArr, int i, int i4, LK lk) {
        AbstractC3199fL abstractC3199fL = (AbstractC3199fL) obj;
        if (abstractC3199fL.zzt == XL.f28633f) {
            abstractC3199fL.zzt = XL.a();
        }
        throw D.y.g(obj);
    }

    @Override // com.google.android.gms.internal.ads.OL
    public final void e(Object obj, Object obj2) {
        PL.d(obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.OL
    public final boolean f(Object obj) {
        throw D.y.g(obj);
    }

    @Override // com.google.android.gms.internal.ads.OL
    public final boolean g(AbstractC3199fL abstractC3199fL, AbstractC3199fL abstractC3199fL2) {
        return abstractC3199fL.zzt.equals(abstractC3199fL2.zzt);
    }

    @Override // com.google.android.gms.internal.ads.OL
    public final void h(Object obj) {
        this.f24709b.getClass();
        XL xl = ((AbstractC3199fL) obj).zzt;
        if (xl.f28638e) {
            xl.f28638e = false;
        }
        C3307hK c3307hK = ZK.f28981a;
        throw D.y.g(obj);
    }

    @Override // com.google.android.gms.internal.ads.OL
    public final int i(AbstractC3199fL abstractC3199fL) {
        XL xl = abstractC3199fL.zzt;
        int i = xl.f28637d;
        if (i != -1) {
            return i;
        }
        int i4 = 0;
        for (int i9 = 0; i9 < xl.f28634a; i9++) {
            int i10 = xl.f28635b[i9] >>> 3;
            SK sk = (SK) xl.f28636c[i9];
            int j9 = XK.j(8);
            int j10 = XK.j(i10) + XK.j(16);
            int j11 = XK.j(24);
            int f6 = sk.f();
            i4 += j9 + j9 + j10 + com.anythink.basead.b.c.i.f(f6, f6, j11);
        }
        xl.f28637d = i4;
        return i4;
    }

    @Override // com.google.android.gms.internal.ads.OL
    public final void j(Object obj, C2478Aq c2478Aq) {
        throw D.y.g(obj);
    }
}
