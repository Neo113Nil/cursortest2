package com.google.android.gms.internal.ads;

import java.util.Collections;
import v7.InterfaceC5133d;
import w7.EnumC5179a;

/* loaded from: classes2.dex */
public final class Dx extends x7.h implements E7.p {

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f24610n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C3713ox f24611u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dx(C3713ox c3713ox, InterfaceC5133d interfaceC5133d) {
        super(2, interfaceC5133d);
        this.f24611u = c3713ox;
    }

    @Override // x7.AbstractC5217a
    public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
        Dx dx = new Dx(this.f24611u, interfaceC5133d);
        dx.f24610n = obj;
        return dx;
    }

    @Override // E7.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((Dx) create((C3874rx) obj, (InterfaceC5133d) obj2)).invokeSuspend(q7.v.f40183a);
    }

    @Override // x7.AbstractC5217a
    public final Object invokeSuspend(Object obj) {
        EnumC5179a enumC5179a = EnumC5179a.f41704n;
        com.bumptech.glide.f.r(obj);
        C3767px c3767px = (C3767px) ((C3874rx) this.f24610n).s();
        kotlin.jvm.internal.h.d(Collections.unmodifiableMap(((C3874rx) c3767px.f30000u).B()), "getQueryIdToAdQualityDataMapMap(...)");
        C3713ox c3713ox = this.f24611u;
        String D8 = c3713ox.D();
        kotlin.jvm.internal.h.d(D8, "getGwsQueryId(...)");
        c3767px.h();
        ((C3874rx) c3767px.f30000u).E().put(D8, c3713ox);
        return (C3874rx) c3767px.j();
    }
}
