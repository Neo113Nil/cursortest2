package io.appmetrica.analytics.impl;

import android.content.Context;
import defpackage.jj4;
import defpackage.u75;
import defpackage.v75;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class Ac implements ServiceComponentsInitializer {

    @NotNull
    public static final C0805yc b = new C0805yc();
    public static boolean c;
    public final List a = u75.h("io.appmetrica.analytics.remotepermissions.internal.RemotePermissionsModuleEntryPoint", "io.appmetrica.analytics.locationinternal.internal.InternalLocationModuleEntryPoint", "io.appmetrica.analytics.egress.internal.EgressModuleEntryPoint", "io.appmetrica.analytics.identitylight.internal.IdentityLightModuleEntryPoint", "io.appmetrica.analytics.tv.internal.AnalyticsTvModuleEntryPoint", "io.appmetrica.analytics.apphud.internal.ApphudServiceModuleEntryPoint", "io.appmetrica.analytics.rtm.internal.service.RtmModuleEntryPoint", "io.appmetrica.analytics.blecollecting.internal.BleCollectingServiceModuleEntryPoint", "io.appmetrica.analytics.screenshot.internal.ScreenshotServiceModuleEntryPoint", "io.appmetrica.analytics.accessibility.internal.AccessibilityModuleEntryPoint", "io.appmetrica.analytics.billing.internal.BillingServiceModuleEntryPoint", "io.appmetrica.analytics.idsync.internal.IdSyncModuleEntryPoint");

    public final synchronized void b() {
        c = false;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer
    public final void onCreate(@NotNull Context context) {
        C0747wb c0747wb = C0747wb.I;
        C0114ad c0114ad = new C0114ad(context);
        synchronized (c0747wb) {
            try {
                InterfaceC0824z3 interfaceC0824z3 = c0747wb.p;
                if (interfaceC0824z3 != null) {
                    c0747wb.u.b.remove(interfaceC0824z3);
                }
                c0747wb.p = c0114ad;
                c0747wb.u.a(c0114ad);
            } catch (Throwable th) {
                throw th;
            }
        }
        C0779xe c0779xe = C0747wb.I.s;
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
        c0779xe.a((C0338i6[]) Arrays.copyOf(c0338i6Arr, c0338i6Arr.length));
        C0747wb.I.t.a(new C0833zc());
        C0805yc.a(b);
    }
}
