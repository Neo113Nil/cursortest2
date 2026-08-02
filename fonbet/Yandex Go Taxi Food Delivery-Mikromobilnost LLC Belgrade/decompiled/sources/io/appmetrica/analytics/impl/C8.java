package io.appmetrica.analytics.impl;

import android.content.Context;
import defpackage.scc;
import defpackage.tcc;
import defpackage.ycc;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class C8 implements ServiceComponentsInitializer {
    public final List a = scc.g("io.appmetrica.analytics.remotepermissions.internal.RemotePermissionsModuleEntryPoint", "io.appmetrica.analytics.apphud.internal.ApphudServiceModuleEntryPoint", "io.appmetrica.analytics.adrevenue.other.internal.AdRevenueOtherServiceModuleEntryPoint", "io.appmetrica.analytics.screenshot.internal.ScreenshotServiceModuleEntryPoint", "io.appmetrica.analytics.billing.internal.BillingServiceModuleEntryPoint", "io.appmetrica.analytics.idsync.internal.IdSyncModuleEntryPoint");

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer
    public final void onCreate(Context context) {
        Me me2 = Jb.I.s;
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
