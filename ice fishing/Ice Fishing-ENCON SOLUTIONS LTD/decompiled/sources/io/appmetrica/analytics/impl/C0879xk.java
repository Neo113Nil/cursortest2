package io.appmetrica.analytics.impl;

import android.location.Location;
import android.os.Bundle;
import h1.C0234d;
import h1.C0239i;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider;
import io.appmetrica.analytics.modulesapi.internal.service.ClientConfigProvider;
import io.appmetrica.analytics.modulesapi.internal.service.LocationServiceExtension;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleLocationSourcesServiceController;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServicesDatabase;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerFactory;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import u0.AbstractC1050a;

/* renamed from: io.appmetrica.analytics.impl.xk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0879xk implements Pc, InterfaceC0544km, AskForPermissionStrategyModuleProvider {

    /* renamed from: a, reason: collision with root package name */
    public final String f7210a = "rp";

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f7211b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public volatile AskForPermissionStrategyModuleProvider f7212c = new A7();

    public static void a(String str, String str2, Throwable th) {
        Qj qj = AbstractC0645oj.f6689a;
        Map H2 = i1.v.H(new C0234d(str, i1.v.H(new C0234d(str2, AbstractC1050a.A(th)))));
        qj.getClass();
        qj.a(new Pj("service_module_errors", H2));
    }

    @Override // io.appmetrica.analytics.impl.Pc
    public final List<ModuleServicesDatabase> b() {
        Object obj;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList = this.f7211b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ModuleServiceEntryPoint moduleServiceEntryPoint = (ModuleServiceEntryPoint) it.next();
            try {
                ModuleServicesDatabase moduleServicesDatabase = moduleServiceEntryPoint.getModuleServicesDatabase();
                obj = moduleServicesDatabase != null ? Boolean.valueOf(arrayList.add(moduleServicesDatabase)) : null;
            } catch (Throwable th) {
                hashSet.add(moduleServiceEntryPoint);
                a(moduleServiceEntryPoint.getIdentifier(), "db", th);
                obj = C0239i.f3393a;
            }
            if (obj != null) {
                arrayList2.add(obj);
            }
        }
        a(hashSet);
        return arrayList;
    }

    @Override // io.appmetrica.analytics.impl.Pc
    public final Map<String, Yc> c() {
        HashSet hashSet = new HashSet();
        CopyOnWriteArrayList copyOnWriteArrayList = this.f7211b;
        ArrayList arrayList = new ArrayList();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ModuleServiceEntryPoint moduleServiceEntryPoint = (ModuleServiceEntryPoint) it.next();
            C0234d c0234d = null;
            try {
                RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration = moduleServiceEntryPoint.getRemoteConfigExtensionConfiguration();
                if (remoteConfigExtensionConfiguration != null) {
                    c0234d = new C0234d(moduleServiceEntryPoint.getIdentifier(), new Yc(remoteConfigExtensionConfiguration));
                }
            } catch (Throwable th) {
                a(moduleServiceEntryPoint.getIdentifier(), "remote_config_controller", th);
                hashSet.add(moduleServiceEntryPoint);
            }
            if (c0234d != null) {
                arrayList.add(c0234d);
            }
        }
        Map<String, Yc> L2 = i1.u.L(arrayList);
        a(hashSet);
        return L2;
    }

    @Override // io.appmetrica.analytics.impl.Pc
    public final Map<String, Integer> d() {
        List list;
        RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration;
        Map<String, Integer> blocks;
        i1.r rVar = i1.r.f3416a;
        HashSet hashSet = new HashSet();
        CopyOnWriteArrayList copyOnWriteArrayList = this.f7211b;
        ArrayList arrayList = new ArrayList();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ModuleServiceEntryPoint moduleServiceEntryPoint = (ModuleServiceEntryPoint) it.next();
            try {
                remoteConfigExtensionConfiguration = moduleServiceEntryPoint.getRemoteConfigExtensionConfiguration();
            } catch (Throwable th) {
                a(moduleServiceEntryPoint.getIdentifier(), "blocks", th);
                hashSet.add(moduleServiceEntryPoint);
            }
            if (remoteConfigExtensionConfiguration != null && (blocks = remoteConfigExtensionConfiguration.getBlocks()) != null) {
                list = i1.u.K(blocks);
                arrayList.addAll(list);
            }
            list = rVar;
            arrayList.addAll(list);
        }
        Map<String, Integer> L2 = i1.u.L(arrayList);
        a(hashSet);
        return L2;
    }

    @Override // io.appmetrica.analytics.impl.Pc
    public final List<Consumer<Location>> e() {
        HashSet hashSet = new HashSet();
        CopyOnWriteArrayList copyOnWriteArrayList = this.f7211b;
        ArrayList arrayList = new ArrayList();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ModuleServiceEntryPoint moduleServiceEntryPoint = (ModuleServiceEntryPoint) it.next();
            Consumer<Location> consumer = null;
            try {
                LocationServiceExtension locationServiceExtension = moduleServiceEntryPoint.getLocationServiceExtension();
                if (locationServiceExtension != null) {
                    consumer = locationServiceExtension.getLocationConsumer();
                }
            } catch (Throwable th) {
                a(moduleServiceEntryPoint.getIdentifier(), "location_consumer", th);
                hashSet.add(moduleServiceEntryPoint);
            }
            if (consumer != null) {
                arrayList.add(consumer);
            }
        }
        a(hashSet);
        return arrayList;
    }

    @Override // io.appmetrica.analytics.impl.Pc
    public final ModuleLocationSourcesServiceController f() {
        ModuleLocationSourcesServiceController moduleLocationSourcesServiceController;
        HashSet hashSet = new HashSet();
        Iterator it = this.f7211b.iterator();
        do {
            moduleLocationSourcesServiceController = null;
            if (!it.hasNext()) {
                break;
            }
            ModuleServiceEntryPoint moduleServiceEntryPoint = (ModuleServiceEntryPoint) it.next();
            try {
                LocationServiceExtension locationServiceExtension = moduleServiceEntryPoint.getLocationServiceExtension();
                if (locationServiceExtension != null) {
                    moduleLocationSourcesServiceController = locationServiceExtension.getLocationSourcesController();
                }
            } catch (Throwable th) {
                a(moduleServiceEntryPoint.getIdentifier(), "location_source_controller", th);
                hashSet.add(moduleServiceEntryPoint);
            }
        } while (moduleLocationSourcesServiceController == null);
        a(hashSet);
        return moduleLocationSourcesServiceController;
    }

    @Override // io.appmetrica.analytics.impl.Pc
    public final Toggle g() {
        Toggle toggle;
        HashSet hashSet = new HashSet();
        Iterator it = this.f7211b.iterator();
        do {
            toggle = null;
            if (!it.hasNext()) {
                break;
            }
            ModuleServiceEntryPoint moduleServiceEntryPoint = (ModuleServiceEntryPoint) it.next();
            try {
                LocationServiceExtension locationServiceExtension = moduleServiceEntryPoint.getLocationServiceExtension();
                if (locationServiceExtension != null) {
                    toggle = locationServiceExtension.getLocationControllerAppStateToggle();
                }
            } catch (Throwable th) {
                a(moduleServiceEntryPoint.getIdentifier(), "location_app_state_control_toggle", th);
                hashSet.add(moduleServiceEntryPoint);
            }
        } while (toggle == null);
        a(hashSet);
        return toggle;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider
    public final PermissionStrategy getAskForPermissionStrategy() {
        return this.f7212c.getAskForPermissionStrategy();
    }

    @Override // io.appmetrica.analytics.impl.Pc
    public final List<String> h() {
        RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration;
        i1.r rVar = i1.r.f3416a;
        HashSet hashSet = new HashSet();
        CopyOnWriteArrayList copyOnWriteArrayList = this.f7211b;
        ArrayList arrayList = new ArrayList();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ModuleServiceEntryPoint moduleServiceEntryPoint = (ModuleServiceEntryPoint) it.next();
            try {
                remoteConfigExtensionConfiguration = moduleServiceEntryPoint.getRemoteConfigExtensionConfiguration();
            } catch (Throwable th) {
                a(moduleServiceEntryPoint.getIdentifier(), "features", th);
                hashSet.add(moduleServiceEntryPoint);
            }
            if (remoteConfigExtensionConfiguration != null && (r4 = remoteConfigExtensionConfiguration.getFeatures()) != null) {
                arrayList.addAll(r4);
            }
            List<String> list = rVar;
            arrayList.addAll(list);
        }
        a(hashSet);
        return arrayList;
    }

    public final Bundle i() {
        Bundle bundle = new Bundle();
        HashSet hashSet = new HashSet();
        Iterator it = this.f7211b.iterator();
        while (it.hasNext()) {
            ModuleServiceEntryPoint moduleServiceEntryPoint = (ModuleServiceEntryPoint) it.next();
            Bundle bundle2 = null;
            try {
                ClientConfigProvider clientConfigProvider = moduleServiceEntryPoint.getClientConfigProvider();
                if (clientConfigProvider != null) {
                    bundle2 = clientConfigProvider.getConfigBundleForClient();
                }
            } catch (Throwable th) {
                a(moduleServiceEntryPoint.getIdentifier(), "config_bundle", th);
                hashSet.add(moduleServiceEntryPoint);
            }
            if (bundle2 != null) {
                bundle.putBundle(moduleServiceEntryPoint.getIdentifier(), bundle2);
            }
        }
        a(hashSet);
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(ModuleServiceEntryPoint<Object> moduleServiceEntryPoint) {
        this.f7211b.add(moduleServiceEntryPoint);
        if (kotlin.jvm.internal.i.a(this.f7210a, moduleServiceEntryPoint.getIdentifier()) && (moduleServiceEntryPoint instanceof AskForPermissionStrategyModuleProvider)) {
            this.f7212c = (AskForPermissionStrategyModuleProvider) moduleServiceEntryPoint;
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0544km
    public final void a(C0415fm c0415fm) {
        HashSet hashSet = new HashSet();
        SdkIdentifiers sdkIdentifiers = new SdkIdentifiers(c0415fm.f6005d, c0415fm.f6002a, c0415fm.f6003b);
        Kg kg = new Kg(c0415fm.f6022v, c0415fm.f6021u);
        Iterator it = this.f7211b.iterator();
        while (it.hasNext()) {
            ModuleServiceEntryPoint moduleServiceEntryPoint = (ModuleServiceEntryPoint) it.next();
            try {
                RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration = moduleServiceEntryPoint.getRemoteConfigExtensionConfiguration();
                if (remoteConfigExtensionConfiguration != null) {
                    remoteConfigExtensionConfiguration.getRemoteConfigUpdateListener().onRemoteConfigUpdated(new C0801uk(sdkIdentifiers, kg, c0415fm.f6000A.get(moduleServiceEntryPoint.getIdentifier())));
                }
            } catch (Throwable th) {
                hashSet.add(moduleServiceEntryPoint);
                a(moduleServiceEntryPoint.getIdentifier(), "remote_config_updated", th);
            }
        }
        a(hashSet);
    }

    public final void a(ServiceContext serviceContext, C0415fm c0415fm) {
        HashSet hashSet = new HashSet();
        Iterator it = this.f7211b.iterator();
        while (it.hasNext()) {
            ModuleServiceEntryPoint moduleServiceEntryPoint = (ModuleServiceEntryPoint) it.next();
            try {
                moduleServiceEntryPoint.initServiceSide(serviceContext, new C0801uk(new SdkIdentifiers(c0415fm.f6005d, c0415fm.f6002a, c0415fm.f6003b), new Kg(c0415fm.f6022v, c0415fm.f6021u), c0415fm.f6000A.get(moduleServiceEntryPoint.getIdentifier())));
                ModuleEventServiceHandlerFactory moduleEventServiceHandlerFactory = moduleServiceEntryPoint.getModuleEventServiceHandlerFactory();
                if (moduleEventServiceHandlerFactory != null) {
                    Uc uc = C0610na.f6575I.t;
                    String identifier = moduleServiceEntryPoint.getIdentifier();
                    synchronized (uc) {
                        uc.f5162a.put(identifier, moduleEventServiceHandlerFactory);
                    }
                } else {
                    continue;
                }
            } catch (Throwable th) {
                a(moduleServiceEntryPoint.getIdentifier(), "init", th);
                hashSet.add(moduleServiceEntryPoint);
            }
        }
        a(hashSet);
    }

    public final void a(HashSet hashSet) {
        if (hashSet.isEmpty()) {
            return;
        }
        this.f7211b.removeAll(hashSet);
    }
}
