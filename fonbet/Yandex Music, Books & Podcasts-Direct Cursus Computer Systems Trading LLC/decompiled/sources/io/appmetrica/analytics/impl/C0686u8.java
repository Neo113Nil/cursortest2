package io.appmetrica.analytics.impl;

import defpackage.jj4;
import defpackage.u75;
import defpackage.v75;
import defpackage.z75;
import io.appmetrica.analytics.coreapi.internal.clientcomponents.ClientComponentsInitializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.u8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0686u8 implements ClientComponentsInitializer {
    public final List a = u75.h("io.appmetrica.analytics.adrevenue.admob.v23.internal.AdMobClientModuleEntryPoint", "io.appmetrica.analytics.adrevenue.applovin.v12.internal.AppLovinClientModuleEntryPoint", "io.appmetrica.analytics.adrevenue.fyber.v3.internal.FyberClientModuleEntryPoint", "io.appmetrica.analytics.adrevenue.ironsource.v7.internal.IronSourceClientModuleEntryPoint", "io.appmetrica.analytics.adrevenue.ironsource.v9.internal.IronSourceV9ClientModuleEntryPoint", "io.appmetrica.analytics.apphud.internal.ApphudClientModuleEntryPoint", "io.appmetrica.analytics.screenshot.internal.ScreenshotClientModuleEntryPoint", "io.appmetrica.analytics.reporterextension.internal.ReporterExtensionClientModuleEntryPoint");

    @Override // io.appmetrica.analytics.coreapi.internal.clientcomponents.ClientComponentsInitializer
    public final void onCreate() {
        if (R4.l().a.b()) {
            C0779xe c0779xe = R4.l().n;
            List list = this.a;
            ArrayList arrayList = new ArrayList(v75.o(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new C0338i6((String) it.next()));
            }
            Object[] array = arrayList.toArray(new C0338i6[0]);
            if (array == null) {
                jj4.j("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                return;
            }
            C0338i6[] c0338i6Arr = (C0338i6[]) array;
            C0338i6[] c0338i6Arr2 = (C0338i6[]) Arrays.copyOf(c0338i6Arr, c0338i6Arr.length);
            synchronized (c0779xe) {
                z75.u(c0779xe.a, c0338i6Arr2);
            }
        }
    }
}
