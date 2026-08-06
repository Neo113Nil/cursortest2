package io.appmetrica.analytics.impl;

import i1.AbstractC0253j;
import io.appmetrica.analytics.coreapi.internal.clientcomponents.ClientComponentsInitializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class B7 implements ClientComponentsInitializer {

    /* renamed from: a, reason: collision with root package name */
    public final List f4193a = AbstractC0253j.B("io.appmetrica.analytics.adrevenue.admob.v23.internal.AdMobClientModuleEntryPoint", "io.appmetrica.analytics.adrevenue.applovin.v12.internal.AppLovinClientModuleEntryPoint", "io.appmetrica.analytics.adrevenue.fyber.v3.internal.FyberClientModuleEntryPoint", "io.appmetrica.analytics.adrevenue.ironsource.v7.internal.IronSourceClientModuleEntryPoint", "io.appmetrica.analytics.adrevenue.ironsource.v9.internal.IronSourceV9ClientModuleEntryPoint", "io.appmetrica.analytics.apphud.internal.ApphudClientModuleEntryPoint", "io.appmetrica.analytics.screenshot.internal.ScreenshotClientModuleEntryPoint", "io.appmetrica.analytics.reporterextension.internal.ReporterExtensionClientModuleEntryPoint");

    @Override // io.appmetrica.analytics.coreapi.internal.clientcomponents.ClientComponentsInitializer
    public final void onCreate() {
        if (C0294b4.l().f5582a.b()) {
            Sc sc = C0294b4.l().f5594m;
            List list = this.f4193a;
            ArrayList arrayList = new ArrayList(i1.k.E(list));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new C0683q5((String) it.next()));
            }
            Object[] array = arrayList.toArray(new C0683q5[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            C0683q5[] c0683q5Arr = (C0683q5[]) array;
            Rc[] rcArr = (Rc[]) Arrays.copyOf(c0683q5Arr, c0683q5Arr.length);
            synchronized (sc) {
                i1.o.F(sc.f5054a, rcArr);
            }
        }
    }
}
