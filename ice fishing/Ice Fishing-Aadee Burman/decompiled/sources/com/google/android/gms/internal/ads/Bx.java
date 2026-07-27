package com.google.android.gms.internal.ads;

import java.util.Collections;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class Bx extends B7.h implements I7.p {

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f23988n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C3592mx f23989u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bx(C3592mx c3592mx, InterfaceC5267d interfaceC5267d) {
        super(2, interfaceC5267d);
        this.f23989u = c3592mx;
    }

    @Override // B7.a
    public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
        Bx bx = new Bx(this.f23989u, interfaceC5267d);
        bx.f23988n = obj;
        return bx;
    }

    @Override // I7.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((Bx) create((C3808qx) obj, (InterfaceC5267d) obj2)).invokeSuspend(u7.v.f41350a);
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        A7.a aVar = A7.a.f58n;
        com.bumptech.glide.d.k(obj);
        C3646nx c3646nx = (C3646nx) ((C3808qx) this.f23988n).s();
        kotlin.jvm.internal.h.d(Collections.unmodifiableMap(((C3808qx) c3646nx.f27721u).B()), "getQueryIdToAdQualityDataMapMap(...)");
        C3592mx c3592mx = this.f23989u;
        String D8 = c3592mx.D();
        kotlin.jvm.internal.h.d(D8, "getGwsQueryId(...)");
        c3646nx.h();
        ((C3808qx) c3646nx.f27721u).E().put(D8, c3592mx);
        return (C3808qx) c3646nx.j();
    }
}
