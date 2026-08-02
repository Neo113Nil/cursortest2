package io.appmetrica.analytics.impl;

import defpackage.scc;
import defpackage.tcc;
import defpackage.ycc;
import io.appmetrica.analytics.coreapi.internal.clientcomponents.ClientComponentsInitializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.z8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0905z8 implements ClientComponentsInitializer {
    public final List a = scc.g("io.appmetrica.analytics.adrevenue.admob.v23.internal.AdMobClientModuleEntryPoint", "io.appmetrica.analytics.adrevenue.applovin.v12.internal.AppLovinClientModuleEntryPoint", "io.appmetrica.analytics.adrevenue.fyber.v3.internal.FyberClientModuleEntryPoint", "io.appmetrica.analytics.adrevenue.ironsource.v7.internal.IronSourceClientModuleEntryPoint", "io.appmetrica.analytics.adrevenue.ironsource.v9.internal.IronSourceV9ClientModuleEntryPoint", "io.appmetrica.analytics.adrevenue.other.internal.AdRevenueOtherClientModuleEntryPoint", "io.appmetrica.analytics.apphud.internal.ApphudClientModuleEntryPoint", "io.appmetrica.analytics.screenshot.internal.ScreenshotClientModuleEntryPoint", "io.appmetrica.analytics.reporterextension.internal.ReporterExtensionClientModuleEntryPoint");

    @Override // io.appmetrica.analytics.coreapi.internal.clientcomponents.ClientComponentsInitializer
    public final void onCreate() {
        if (V4.l().a.b()) {
            Me me2 = V4.l().n;
            List list = this.a;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new C0498l6((String) it.next()));
            }
            C0498l6[] c0498l6Arr = (C0498l6[]) arrayList.toArray(new C0498l6[0]);
            C0498l6[] c0498l6Arr2 = (C0498l6[]) Arrays.copyOf(c0498l6Arr, c0498l6Arr.length);
            synchronized (me2) {
                ycc.t(me2.a, c0498l6Arr2);
            }
        }
    }
}
