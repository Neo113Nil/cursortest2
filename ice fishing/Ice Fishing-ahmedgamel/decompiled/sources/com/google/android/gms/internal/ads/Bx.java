package com.google.android.gms.internal.ads;

import java.util.Collections;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public final class Bx extends B7.h implements I7.p {

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f24751n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C3615mx f24752u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bx(C3615mx c3615mx, InterfaceC5240d interfaceC5240d) {
        super(2, interfaceC5240d);
        this.f24752u = c3615mx;
    }

    @Override // B7.a
    public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
        Bx bx = new Bx(this.f24752u, interfaceC5240d);
        bx.f24751n = obj;
        return bx;
    }

    @Override // I7.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((Bx) create((C3831qx) obj, (InterfaceC5240d) obj2)).invokeSuspend(u7.v.f41073a);
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        A7.a aVar = A7.a.f215n;
        Q3.b.s(obj);
        C3669nx c3669nx = (C3669nx) ((C3831qx) this.f24751n).s();
        kotlin.jvm.internal.h.d(Collections.unmodifiableMap(((C3831qx) c3669nx.f28504u).B()), "getQueryIdToAdQualityDataMapMap(...)");
        C3615mx c3615mx = this.f24752u;
        String D8 = c3615mx.D();
        kotlin.jvm.internal.h.d(D8, "getGwsQueryId(...)");
        c3669nx.h();
        ((C3831qx) c3669nx.f28504u).E().put(D8, c3615mx);
        return (C3831qx) c3669nx.j();
    }
}
