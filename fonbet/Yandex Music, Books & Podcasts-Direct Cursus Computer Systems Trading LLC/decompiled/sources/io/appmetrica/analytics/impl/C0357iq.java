package io.appmetrica.analytics.impl;

import defpackage.uif;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;

/* renamed from: io.appmetrica.analytics.impl.iq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0357iq extends uif implements Function0 {
    public final /* synthetic */ C0386jq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0357iq(C0386jq c0386jq) {
        super(0);
        this.a = c0386jq;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        HashMap hashMap = new HashMap();
        C0386jq c0386jq = this.a;
        String a = c0386jq.a.a();
        if (a != null) {
        }
        String a2 = c0386jq.b.a();
        if (a2 != null) {
            hashMap.put(AdRevenueConstants.PLUGIN_SUPPORTED_SOURCES_KEY, a2);
        }
        return hashMap;
    }
}
