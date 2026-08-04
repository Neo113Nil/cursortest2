package com.gamericefishpro.space.hc;

import com.gamericefishpro.space.ph.x;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements b {
    public static final a Companion = new a(null);
    private static String indent = "";
    private final Map<Class<?>, List<e>> serviceMap;

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getIndent() {
            return d.indent;
        }

        public final void setIndent(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            d.indent = str;
        }

        private a() {
        }
    }

    public d(List<? extends e> registrations) {
        Intrinsics.checkNotNullParameter(registrations, "registrations");
        this.serviceMap = new LinkedHashMap();
        for (e eVar : registrations) {
            for (Class<?> cls : eVar.getServices()) {
                if (this.serviceMap.containsKey(cls)) {
                    List<e> list = this.serviceMap.get(cls);
                    Intrinsics.b(list);
                    list.add(eVar);
                } else {
                    this.serviceMap.put(cls, x.g(eVar));
                }
            }
        }
    }

    @Override // com.gamericefishpro.space.hc.b
    public <T> List<T> getAllServices(Class<T> c) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(c, "c");
        synchronized (this.serviceMap) {
            try {
                arrayList = new ArrayList();
                if (this.serviceMap.containsKey(c)) {
                    Map<Class<?>, List<e>> map = this.serviceMap;
                    Intrinsics.b(map);
                    List<e> list = map.get(c);
                    Intrinsics.b(list);
                    for (e eVar : list) {
                        Object objResolve = eVar.resolve(this);
                        if (objResolve == null) {
                            throw new Exception("Could not instantiate service: " + eVar);
                        }
                        arrayList.add(objResolve);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public final /* synthetic */ <T> List<T> getAllServices$com_onesignal_core() {
        Intrinsics.f();
        throw null;
    }

    @Override // com.gamericefishpro.space.hc.b
    public <T> T getService(Class<T> c) throws Exception {
        Intrinsics.checkNotNullParameter(c, "c");
        T t = (T) getServiceOrNull(c);
        if (t != null) {
            return t;
        }
        throw new Exception("Service " + c + " could not be instantiated");
    }

    public final /* synthetic */ <T> T getService$com_onesignal_core() {
        Intrinsics.f();
        throw null;
    }

    @Override // com.gamericefishpro.space.hc.b
    public <T> T getServiceOrNull(Class<T> c) {
        T t;
        e eVar;
        Intrinsics.checkNotNullParameter(c, "c");
        synchronized (this.serviceMap) {
            List<e> list = this.serviceMap.get(c);
            t = (list == null || (eVar = (e) CollectionsKt.B(list)) == null) ? null : (T) eVar.resolve(this);
        }
        return t;
    }

    public final /* synthetic */ <T> T getServiceOrNull$com_onesignal_core() {
        Intrinsics.f();
        throw null;
    }

    @Override // com.gamericefishpro.space.hc.b
    public <T> boolean hasService(Class<T> c) {
        boolean zContainsKey;
        Intrinsics.checkNotNullParameter(c, "c");
        synchronized (this.serviceMap) {
            zContainsKey = this.serviceMap.containsKey(c);
        }
        return zContainsKey;
    }

    public final /* synthetic */ <T> boolean hasService$com_onesignal_core() {
        Intrinsics.f();
        throw null;
    }
}
