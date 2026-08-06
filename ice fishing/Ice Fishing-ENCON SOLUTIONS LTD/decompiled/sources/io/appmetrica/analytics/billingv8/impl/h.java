package io.appmetrica.analytics.billingv8.impl;

import h1.C0239i;
import java.util.LinkedHashMap;
import java.util.Map;
import t1.InterfaceC1046a;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.j implements InterfaceC1046a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map f3717a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f3718b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f3719c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(LinkedHashMap linkedHashMap, Map map, i iVar) {
        super(0);
        this.f3717a = linkedHashMap;
        this.f3718b = map;
        this.f3719c = iVar;
    }

    @Override // t1.InterfaceC1046a
    public final Object invoke() {
        Map map = this.f3717a;
        Map map2 = this.f3718b;
        i iVar = this.f3719c;
        m.a(map, map2, iVar.f3723d, iVar.f3722c.getBillingInfoManager());
        return C0239i.f3393a;
    }
}
