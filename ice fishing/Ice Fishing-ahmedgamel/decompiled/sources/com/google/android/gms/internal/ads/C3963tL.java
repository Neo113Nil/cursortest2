package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.tL, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3963tL implements DL {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC4286zK f35061a;

    public C3963tL(V2 v22, AbstractC4286zK abstractC4286zK) {
        this.f35061a = abstractC4286zK;
    }

    @Override // com.google.android.gms.internal.ads.DL
    public final void a(Object obj, C4201xq c4201xq) {
        throw D.x.h(obj);
    }

    @Override // com.google.android.gms.internal.ads.DL
    public final void b(Object obj, C4265z c4265z, PK pk) {
        V2.A(obj);
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.ads.DL
    public final VK c() {
        AbstractC4286zK abstractC4286zK = this.f35061a;
        return abstractC4286zK instanceof VK ? ((VK) abstractC4286zK).p() : ((TK) ((VK) abstractC4286zK).w(5, null)).i();
    }

    @Override // com.google.android.gms.internal.ads.DL
    public final void d(Object obj, Object obj2) {
        EL.d(obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.DL
    public final boolean e(Object obj) {
        throw D.x.h(obj);
    }

    @Override // com.google.android.gms.internal.ads.DL
    public final void f(Object obj, byte[] bArr, int i, int i4, CK ck) {
        VK vk = (VK) obj;
        if (vk.zzt == LL.f26906f) {
            vk.zzt = LL.a();
        }
        throw D.x.h(obj);
    }

    @Override // com.google.android.gms.internal.ads.DL
    public final void g(Object obj) {
        LL ll = ((VK) obj).zzt;
        if (ll.f26911e) {
            ll.f26911e = false;
        }
        throw D.x.h(obj);
    }

    @Override // com.google.android.gms.internal.ads.DL
    public final boolean h(VK vk, VK vk2) {
        return vk.zzt.equals(vk2.zzt);
    }

    @Override // com.google.android.gms.internal.ads.DL
    public final int i(VK vk) {
        LL ll = vk.zzt;
        int i = ll.f26910d;
        if (i != -1) {
            return i;
        }
        int i4 = 0;
        for (int i6 = 0; i6 < ll.f26907a; i6++) {
            int i9 = ll.f26908b[i6] >>> 3;
            JK jk = (JK) ll.f26909c[i6];
            int S8 = OK.S(8);
            int S9 = OK.S(i9) + OK.S(16);
            int S10 = OK.S(24);
            int f2 = jk.f();
            i4 += S8 + S8 + S9 + Wv.c(f2, f2, S10);
        }
        ll.f26910d = i4;
        return i4;
    }

    @Override // com.google.android.gms.internal.ads.DL
    public final int j(VK vk) {
        return vk.zzt.hashCode();
    }
}
