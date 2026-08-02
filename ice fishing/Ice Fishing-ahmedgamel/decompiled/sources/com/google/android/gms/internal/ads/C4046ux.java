package com.google.android.gms.internal.ads;

import java.util.Collections;
import z7.InterfaceC5240d;

/* renamed from: com.google.android.gms.internal.ads.ux, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4046ux extends B7.h implements I7.p {

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f35376n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f35377u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4046ux(String str, InterfaceC5240d interfaceC5240d) {
        super(2, interfaceC5240d);
        this.f35377u = str;
    }

    @Override // B7.a
    public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
        C4046ux c4046ux = new C4046ux(this.f35377u, interfaceC5240d);
        c4046ux.f35376n = obj;
        return c4046ux;
    }

    @Override // I7.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C4046ux) create((C3831qx) obj, (InterfaceC5240d) obj2)).invokeSuspend(u7.v.f41073a);
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        A7.a aVar = A7.a.f215n;
        Q3.b.s(obj);
        C3669nx c3669nx = (C3669nx) ((C3831qx) this.f35376n).s();
        kotlin.jvm.internal.h.d(Collections.unmodifiableMap(((C3831qx) c3669nx.f28504u).B()), "getQueryIdToAdQualityDataMapMap(...)");
        String key = this.f35377u;
        kotlin.jvm.internal.h.e(key, "key");
        c3669nx.h();
        ((C3831qx) c3669nx.f28504u).E().remove(key);
        return (C3831qx) c3669nx.j();
    }
}
