package com.google.android.gms.internal.ads;

import z7.InterfaceC5240d;

/* renamed from: com.google.android.gms.internal.ads.xx, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4208xx extends B7.h implements I7.p {
    @Override // B7.a
    public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
        return new C4208xx(2, interfaceC5240d);
    }

    @Override // I7.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C4208xx) create((C3831qx) obj, (InterfaceC5240d) obj2)).invokeSuspend(u7.v.f41073a);
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        A7.a aVar = A7.a.f215n;
        Q3.b.s(obj);
        C3831qx D8 = C3831qx.D();
        kotlin.jvm.internal.h.d(D8, "getDefaultInstance(...)");
        return D8;
    }
}
