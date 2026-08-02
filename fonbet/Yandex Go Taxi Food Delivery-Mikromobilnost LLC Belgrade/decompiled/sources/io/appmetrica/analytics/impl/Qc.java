package io.appmetrica.analytics.impl;

import android.content.Context;
import defpackage.scc;
import defpackage.tcc;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class Qc implements ServiceComponentsInitializer {
    public static final Oc b = new Oc();
    public static boolean c;
    public final List a = scc.g("io.appmetrica.analytics.remotepermissions.internal.RemotePermissionsModuleEntryPoint", "io.appmetrica.analytics.locationinternal.internal.InternalLocationModuleEntryPoint", "io.appmetrica.analytics.egress.internal.EgressModuleEntryPoint", "io.appmetrica.analytics.identitylight.internal.IdentityLightModuleEntryPoint", "io.appmetrica.analytics.tv.internal.AnalyticsTvModuleEntryPoint", "io.appmetrica.analytics.apphud.internal.ApphudServiceModuleEntryPoint", "io.appmetrica.analytics.rtm.internal.service.RtmModuleEntryPoint", "io.appmetrica.analytics.blecollecting.internal.BleCollectingServiceModuleEntryPoint", "io.appmetrica.analytics.adrevenue.other.internal.AdRevenueOtherServiceModuleEntryPoint", "io.appmetrica.analytics.screenshot.internal.ScreenshotServiceModuleEntryPoint", "io.appmetrica.analytics.accessibility.internal.AccessibilityModuleEntryPoint", "io.appmetrica.analytics.billing.internal.BillingServiceModuleEntryPoint", "io.appmetrica.analytics.idsync.internal.IdSyncModuleEntryPoint", "io.appmetrica.analytics.networkquality.internal.NetworkQualityModuleEntryPoint");

    public final synchronized void b() {
        c = false;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer
    public final void onCreate(Context context) {
        Jb jb = Jb.I;
        C0650qd c0650qd = new C0650qd(context);
        synchronized (jb) {
            try {
                InterfaceC0900z3 interfaceC0900z3 = jb.p;
                if (interfaceC0900z3 != null) {
                    jb.u.b.remove(interfaceC0900z3);
                }
                jb.p = c0650qd;
                jb.u.a(c0650qd);
            } catch (Throwable th) {
                throw th;
            }
        }
        Me me2 = Jb.I.s;
        List list = this.a;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C0498l6((String) it.next()));
        }
        C0498l6[] c0498l6Arr = (C0498l6[]) arrayList.toArray(new C0498l6[0]);
        me2.a((C0498l6[]) Arrays.copyOf(c0498l6Arr, c0498l6Arr.length));
        Jb.I.t.a(new Pc());
        Oc.a(b);
    }
}
