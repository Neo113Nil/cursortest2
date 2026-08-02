package io.appmetrica.analytics.impl;

import android.os.Bundle;
import defpackage.g8e;
import defpackage.gw00;
import defpackage.ljo;
import defpackage.tcc;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigUpdateListener;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueCollector;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;

/* loaded from: classes9.dex */
public final class S4 {
    public final R4 a = new R4();
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public C6 c;

    public final List<String> a() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.b;
        ArrayList arrayList = new ArrayList();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            AdRevenueCollector adRevenueCollector = ((ModuleClientEntryPoint) it.next()).getAdRevenueCollector();
            if (adRevenueCollector != null) {
                arrayList.add(adRevenueCollector);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (((AdRevenueCollector) next).getEnabled()) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((AdRevenueCollector) it3.next()).getSourceIdentifier());
        }
        return kotlin.collections.a.I(arrayList3);
    }

    public final ModuleAdRevenueProcessor b() {
        F6 f6;
        C6 c6 = this.c;
        if (c6 == null || (f6 = ((E4) c6).b) == null) {
            return null;
        }
        return f6.a;
    }

    public final void c() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ModuleClientEntryPoint moduleClientEntryPoint = (ModuleClientEntryPoint) it.next();
            try {
                moduleClientEntryPoint.onActivated();
            } catch (Throwable th) {
                a(moduleClientEntryPoint.getIdentifier(), "onActivated", th);
            }
        }
    }

    public static void a(String str, String str2, Throwable th) {
        C0313en c0313en = Cm.a;
        Map e = gw00.e(new Pair(str, g8e.z(str2, ljo.b(th))));
        c0313en.getClass();
        c0313en.a(new C0285dn("client_module_errors", e));
    }

    public final void a(ModuleClientEntryPoint<Object> moduleClientEntryPoint) {
        this.b.add(moduleClientEntryPoint);
    }

    public final void a(C6 c6) {
        this.c = c6;
        HashSet hashSet = new HashSet();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ModuleClientEntryPoint moduleClientEntryPoint = (ModuleClientEntryPoint) it.next();
            try {
                moduleClientEntryPoint.initClientSide(c6);
            } catch (Throwable th) {
                a(moduleClientEntryPoint.getIdentifier(), "initClientSide", th);
                hashSet.add(moduleClientEntryPoint);
            }
        }
        if (hashSet.isEmpty()) {
            return;
        }
        this.b.removeAll(hashSet);
    }

    public final void a(Bundle bundle, SdkIdentifiers sdkIdentifiers) {
        if (bundle == null) {
            return;
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ModuleClientEntryPoint moduleClientEntryPoint = (ModuleClientEntryPoint) it.next();
            try {
                ServiceConfigExtensionConfiguration serviceConfigExtensionConfiguration = moduleClientEntryPoint.getServiceConfigExtensionConfiguration();
                if (serviceConfigExtensionConfiguration != null) {
                    ServiceConfigUpdateListener serviceConfigUpdateListener2 = serviceConfigExtensionConfiguration.getServiceConfigUpdateListener2();
                    R4 r4 = this.a;
                    String identifier = moduleClientEntryPoint.getIdentifier();
                    r4.getClass();
                    Bundle bundle2 = bundle.getBundle(identifier);
                    Q4 q4 = bundle2 != null ? new Q4(sdkIdentifiers, serviceConfigExtensionConfiguration.getBundleConverter2().fromBundle(bundle2)) : null;
                    if (q4 != null) {
                        serviceConfigUpdateListener2.onServiceConfigUpdated(q4);
                    }
                }
            } catch (Throwable th) {
                a(moduleClientEntryPoint.getIdentifier(), "notifyModulesWithConfig", th);
            }
        }
    }
}
