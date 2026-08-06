package io.appmetrica.analytics.billingv6.impl;

import h1.C0239i;
import java.util.LinkedHashMap;
import java.util.Map;
import t1.InterfaceC1046a;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.j implements InterfaceC1046a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map f3664a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f3665b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f3666c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(LinkedHashMap linkedHashMap, Map map, i iVar) {
        super(0);
        this.f3664a = linkedHashMap;
        this.f3665b = map;
        this.f3666c = iVar;
    }

    @Override // t1.InterfaceC1046a
    public final Object invoke() {
        Map map = this.f3664a;
        Map map2 = this.f3665b;
        i iVar = this.f3666c;
        m.a(map, map2, iVar.f3670d, iVar.f3669c.getBillingInfoManager());
        return C0239i.f3393a;
    }
}
