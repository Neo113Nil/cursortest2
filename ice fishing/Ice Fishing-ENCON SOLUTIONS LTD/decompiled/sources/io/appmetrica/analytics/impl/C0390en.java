package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.HashMap;
import t1.InterfaceC1046a;

/* renamed from: io.appmetrica.analytics.impl.en, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0390en extends kotlin.jvm.internal.j implements InterfaceC1046a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0416fn f5955a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0390en(C0416fn c0416fn) {
        super(0);
        this.f5955a = c0416fn;
    }

    @Override // t1.InterfaceC1046a
    public final Object invoke() {
        HashMap hashMap = new HashMap();
        C0416fn c0416fn = this.f5955a;
        String a2 = c0416fn.f6027a.a();
        if (a2 != null) {
        }
        String a3 = c0416fn.f6028b.a();
        if (a3 != null) {
            hashMap.put(AdRevenueConstants.PLUGIN_SUPPORTED_SOURCES_KEY, a3);
        }
        return hashMap;
    }
}
