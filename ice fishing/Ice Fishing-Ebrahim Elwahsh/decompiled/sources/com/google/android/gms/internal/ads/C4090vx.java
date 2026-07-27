package com.google.android.gms.internal.ads;

import java.util.Collections;
import v7.InterfaceC5133d;
import w7.EnumC5179a;

/* renamed from: com.google.android.gms.internal.ads.vx, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4090vx extends x7.h implements E7.p {

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f34904n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f34905u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4090vx(String str, InterfaceC5133d interfaceC5133d) {
        super(2, interfaceC5133d);
        this.f34905u = str;
    }

    @Override // x7.AbstractC5217a
    public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
        C4090vx c4090vx = new C4090vx(this.f34905u, interfaceC5133d);
        c4090vx.f34904n = obj;
        return c4090vx;
    }

    @Override // E7.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C4090vx) create((C3874rx) obj, (InterfaceC5133d) obj2)).invokeSuspend(q7.v.f40183a);
    }

    @Override // x7.AbstractC5217a
    public final Object invokeSuspend(Object obj) {
        EnumC5179a enumC5179a = EnumC5179a.f41704n;
        com.bumptech.glide.f.r(obj);
        C3767px c3767px = (C3767px) ((C3874rx) this.f34904n).s();
        kotlin.jvm.internal.h.d(Collections.unmodifiableMap(((C3874rx) c3767px.f30000u).B()), "getQueryIdToAdQualityDataMapMap(...)");
        String key = this.f34905u;
        kotlin.jvm.internal.h.e(key, "key");
        c3767px.h();
        ((C3874rx) c3767px.f30000u).E().remove(key);
        return (C3874rx) c3767px.j();
    }
}
