package io.appmetrica.analytics.impl;

import android.os.Bundle;
import h1.C0234d;
import i1.AbstractC0252i;
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
import u0.AbstractC1050a;

/* loaded from: classes.dex */
public final class Y3 {

    /* renamed from: c, reason: collision with root package name */
    public H5 f5413c;

    /* renamed from: a, reason: collision with root package name */
    public final X3 f5411a = new X3();

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f5412b = new CopyOnWriteArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f5414d = new CopyOnWriteArrayList();

    public static void a(String str, String str2, Throwable th) {
        Qj qj = AbstractC0645oj.f6689a;
        Map H2 = i1.v.H(new C0234d(str, i1.v.H(new C0234d(str2, AbstractC1050a.A(th)))));
        qj.getClass();
        qj.a(new Pj("client_module_errors", H2));
    }

    public final ModuleAdRevenueProcessor b() {
        K5 k5;
        H5 h5 = this.f5413c;
        if (h5 == null || (k5 = ((K3) h5).f4616b) == null) {
            return null;
        }
        return k5.f4625a;
    }

    public final void c() {
        Iterator it = this.f5412b.iterator();
        while (it.hasNext()) {
            ModuleClientEntryPoint moduleClientEntryPoint = (ModuleClientEntryPoint) it.next();
            try {
                moduleClientEntryPoint.onActivated();
            } catch (Throwable th) {
                a(moduleClientEntryPoint.getIdentifier(), "onActivated", th);
            }
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f5414d;
        CopyOnWriteArrayList copyOnWriteArrayList2 = this.f5412b;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = copyOnWriteArrayList2.iterator();
        while (it2.hasNext()) {
            AdRevenueCollector adRevenueCollector = ((ModuleClientEntryPoint) it2.next()).getAdRevenueCollector();
            if (adRevenueCollector != null) {
                arrayList.add(adRevenueCollector);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            if (((AdRevenueCollector) next).getEnabled()) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(i1.k.E(arrayList2));
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            arrayList3.add(((AdRevenueCollector) it4.next()).getSourceIdentifier());
        }
        copyOnWriteArrayList.addAll(AbstractC0252i.R(AbstractC0252i.U(arrayList3)));
    }

    public final List<String> a() {
        return this.f5414d;
    }

    public final void a(ModuleClientEntryPoint<Object> moduleClientEntryPoint) {
        this.f5412b.add(moduleClientEntryPoint);
    }

    public final void a(H5 h5) {
        this.f5413c = h5;
        HashSet hashSet = new HashSet();
        Iterator it = this.f5412b.iterator();
        while (it.hasNext()) {
            ModuleClientEntryPoint moduleClientEntryPoint = (ModuleClientEntryPoint) it.next();
            try {
                moduleClientEntryPoint.initClientSide(h5);
            } catch (Throwable th) {
                a(moduleClientEntryPoint.getIdentifier(), "initClientSide", th);
                hashSet.add(moduleClientEntryPoint);
            }
        }
        if (hashSet.isEmpty()) {
            return;
        }
        this.f5412b.removeAll(hashSet);
    }

    public final void a(Bundle bundle, SdkIdentifiers sdkIdentifiers) {
        if (bundle == null) {
            return;
        }
        Iterator it = this.f5412b.iterator();
        while (it.hasNext()) {
            ModuleClientEntryPoint moduleClientEntryPoint = (ModuleClientEntryPoint) it.next();
            try {
                ServiceConfigExtensionConfiguration serviceConfigExtensionConfiguration = moduleClientEntryPoint.getServiceConfigExtensionConfiguration();
                if (serviceConfigExtensionConfiguration != null) {
                    ServiceConfigUpdateListener serviceConfigUpdateListener = serviceConfigExtensionConfiguration.getServiceConfigUpdateListener();
                    X3 x3 = this.f5411a;
                    String identifier = moduleClientEntryPoint.getIdentifier();
                    x3.getClass();
                    Bundle bundle2 = bundle.getBundle(identifier);
                    W3 w3 = bundle2 != null ? new W3(sdkIdentifiers, serviceConfigExtensionConfiguration.getBundleConverter().fromBundle(bundle2)) : null;
                    if (w3 != null) {
                        serviceConfigUpdateListener.onServiceConfigUpdated(w3);
                    }
                }
            } catch (Throwable th) {
                a(moduleClientEntryPoint.getIdentifier(), "notifyModulesWithConfig", th);
            }
        }
    }
}
