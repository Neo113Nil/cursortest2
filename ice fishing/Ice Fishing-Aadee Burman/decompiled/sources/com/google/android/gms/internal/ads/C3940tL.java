package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.tL, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3940tL implements DL {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC4263zK f34275a;

    public C3940tL(V2 v22, AbstractC4263zK abstractC4263zK) {
        this.f34275a = abstractC4263zK;
    }

    @Override // com.google.android.gms.internal.ads.DL
    public final void a(Object obj, C4178xq c4178xq) {
        throw D.y.i(obj);
    }

    @Override // com.google.android.gms.internal.ads.DL
    public final void b(Object obj, C4242z c4242z, PK pk) {
        V2.A(obj);
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.ads.DL
    public final VK c() {
        AbstractC4263zK abstractC4263zK = this.f34275a;
        return abstractC4263zK instanceof VK ? ((VK) abstractC4263zK).p() : ((TK) ((VK) abstractC4263zK).w(5, null)).i();
    }

    @Override // com.google.android.gms.internal.ads.DL
    public final void d(Object obj, Object obj2) {
        EL.d(obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.DL
    public final boolean e(Object obj) {
        throw D.y.i(obj);
    }

    @Override // com.google.android.gms.internal.ads.DL
    public final void f(Object obj, byte[] bArr, int i, int i6, CK ck) {
        VK vk = (VK) obj;
        if (vk.zzt == LL.f26106f) {
            vk.zzt = LL.a();
        }
        throw D.y.i(obj);
    }

    @Override // com.google.android.gms.internal.ads.DL
    public final void g(Object obj) {
        LL ll = ((VK) obj).zzt;
        if (ll.f26111e) {
            ll.f26111e = false;
        }
        throw D.y.i(obj);
    }

    @Override // com.google.android.gms.internal.ads.DL
    public final boolean h(VK vk, VK vk2) {
        return vk.zzt.equals(vk2.zzt);
    }

    @Override // com.google.android.gms.internal.ads.DL
    public final int i(VK vk) {
        LL ll = vk.zzt;
        int i = ll.f26110d;
        if (i != -1) {
            return i;
        }
        int i6 = 0;
        for (int i9 = 0; i9 < ll.f26107a; i9++) {
            int i10 = ll.f26108b[i9] >>> 3;
            JK jk = (JK) ll.f26109c[i9];
            int S8 = OK.S(8);
            int S9 = OK.S(i10) + OK.S(16);
            int S10 = OK.S(24);
            int f3 = jk.f();
            i6 += S8 + S8 + S9 + com.anythink.basead.exoplayer.f.f.f(f3, f3, S10);
        }
        ll.f26110d = i6;
        return i6;
    }

    @Override // com.google.android.gms.internal.ads.DL
    public final int j(VK vk) {
        return vk.zzt.hashCode();
    }
}
