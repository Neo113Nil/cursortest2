package v4;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import v7.AbstractC5119j;
import v7.AbstractC5120k;

/* loaded from: classes2.dex */
public final class d implements b {
    public static final a Companion = new a(null);
    private static String indent = "";
    private final Map<Class<?>, List<e>> serviceMap;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final String getIndent() {
            return d.indent;
        }

        public final void setIndent(String str) {
            kotlin.jvm.internal.h.e(str, "<set-?>");
            d.indent = str;
        }

        private a() {
        }
    }

    public d(List<? extends e> registrations) {
        kotlin.jvm.internal.h.e(registrations, "registrations");
        this.serviceMap = new LinkedHashMap();
        for (e eVar : registrations) {
            for (Class<?> cls : eVar.getServices()) {
                if (this.serviceMap.containsKey(cls)) {
                    List<e> list = this.serviceMap.get(cls);
                    kotlin.jvm.internal.h.b(list);
                    list.add(eVar);
                } else {
                    this.serviceMap.put(cls, AbstractC5120k.u(eVar));
                }
            }
        }
    }

    @Override // v4.b
    public <T> List<T> getAllServices(Class<T> c9) {
        ArrayList arrayList;
        kotlin.jvm.internal.h.e(c9, "c");
        synchronized (this.serviceMap) {
            try {
                arrayList = new ArrayList();
                if (this.serviceMap.containsKey(c9)) {
                    Map<Class<?>, List<e>> map = this.serviceMap;
                    kotlin.jvm.internal.h.b(map);
                    List<e> list = map.get(c9);
                    kotlin.jvm.internal.h.b(list);
                    for (e eVar : list) {
                        Object resolve = eVar.resolve(this);
                        if (resolve == null) {
                            throw new Exception("Could not instantiate service: " + eVar);
                        }
                        arrayList.add(resolve);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public final /* synthetic */ <T> List<T> getAllServices$com_onesignal_core() {
        kotlin.jvm.internal.h.h();
        throw null;
    }

    @Override // v4.b
    public <T> T getService(Class<T> c9) {
        kotlin.jvm.internal.h.e(c9, "c");
        T t6 = (T) getServiceOrNull(c9);
        if (t6 != null) {
            return t6;
        }
        throw new Exception("Service " + c9 + " could not be instantiated");
    }

    public final /* synthetic */ <T> T getService$com_onesignal_core() {
        kotlin.jvm.internal.h.h();
        throw null;
    }

    @Override // v4.b
    public <T> T getServiceOrNull(Class<T> c9) {
        T t6;
        e eVar;
        kotlin.jvm.internal.h.e(c9, "c");
        synchronized (this.serviceMap) {
            List<e> list = this.serviceMap.get(c9);
            t6 = (list == null || (eVar = (e) AbstractC5119j.D(list)) == null) ? null : (T) eVar.resolve(this);
        }
        return t6;
    }

    public final /* synthetic */ <T> T getServiceOrNull$com_onesignal_core() {
        kotlin.jvm.internal.h.h();
        throw null;
    }

    @Override // v4.b
    public <T> boolean hasService(Class<T> c9) {
        boolean containsKey;
        kotlin.jvm.internal.h.e(c9, "c");
        synchronized (this.serviceMap) {
            containsKey = this.serviceMap.containsKey(c9);
        }
        return containsKey;
    }

    public final /* synthetic */ <T> boolean hasService$com_onesignal_core() {
        kotlin.jvm.internal.h.h();
        throw null;
    }
}
