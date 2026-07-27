package com.google.android.gms.internal.ads;

import z7.InterfaceC5267d;

/* renamed from: com.google.android.gms.internal.ads.xx, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4185xx extends B7.h implements I7.p {
    @Override // B7.a
    public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
        return new C4185xx(2, interfaceC5267d);
    }

    @Override // I7.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C4185xx) create((C3808qx) obj, (InterfaceC5267d) obj2)).invokeSuspend(u7.v.f41350a);
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        A7.a aVar = A7.a.f58n;
        com.bumptech.glide.d.k(obj);
        C3808qx D8 = C3808qx.D();
        kotlin.jvm.internal.h.d(D8, "getDefaultInstance(...)");
        return D8;
    }
}
