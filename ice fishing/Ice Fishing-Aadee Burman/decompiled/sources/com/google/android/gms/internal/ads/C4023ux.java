package com.google.android.gms.internal.ads;

import java.util.Collections;
import z7.InterfaceC5267d;

/* renamed from: com.google.android.gms.internal.ads.ux, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4023ux extends B7.h implements I7.p {

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f34613n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f34614u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4023ux(String str, InterfaceC5267d interfaceC5267d) {
        super(2, interfaceC5267d);
        this.f34614u = str;
    }

    @Override // B7.a
    public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
        C4023ux c4023ux = new C4023ux(this.f34614u, interfaceC5267d);
        c4023ux.f34613n = obj;
        return c4023ux;
    }

    @Override // I7.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C4023ux) create((C3808qx) obj, (InterfaceC5267d) obj2)).invokeSuspend(u7.v.f41350a);
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        A7.a aVar = A7.a.f58n;
        com.bumptech.glide.d.k(obj);
        C3646nx c3646nx = (C3646nx) ((C3808qx) this.f34613n).s();
        kotlin.jvm.internal.h.d(Collections.unmodifiableMap(((C3808qx) c3646nx.f27721u).B()), "getQueryIdToAdQualityDataMapMap(...)");
        String key = this.f34614u;
        kotlin.jvm.internal.h.e(key, "key");
        c3646nx.h();
        ((C3808qx) c3646nx.f27721u).E().remove(key);
        return (C3808qx) c3646nx.j();
    }
}
