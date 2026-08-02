package io.appmetrica.analytics.impl;

import defpackage.sls;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.HashMap;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.impl.zq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0923zq extends Lambda implements sls {
    public final /* synthetic */ Aq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0923zq(Aq aq) {
        super(0);
        this.a = aq;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        HashMap hashMap = new HashMap();
        Aq aq = this.a;
        String a = aq.a.a();
        if (a != null) {
        }
        String a2 = aq.b.a();
        if (a2 != null) {
            hashMap.put(AdRevenueConstants.PLUGIN_SUPPORTED_SOURCES_KEY, a2);
        }
        return hashMap;
    }
}
