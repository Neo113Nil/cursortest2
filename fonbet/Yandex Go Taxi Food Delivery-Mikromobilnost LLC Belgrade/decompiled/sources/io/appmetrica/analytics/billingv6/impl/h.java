package io.appmetrica.analytics.billingv6.impl;

import defpackage.sls;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class h extends Lambda implements sls {
    public final /* synthetic */ Map a;
    public final /* synthetic */ Map b;
    public final /* synthetic */ i c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(LinkedHashMap linkedHashMap, Map map, i iVar) {
        super(0);
        this.a = linkedHashMap;
        this.b = map;
        this.c = iVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        Map map = this.a;
        Map map2 = this.b;
        i iVar = this.c;
        m.a(map, map2, iVar.d, iVar.c.getBillingInfoManager());
        return zy11.a;
    }
}
