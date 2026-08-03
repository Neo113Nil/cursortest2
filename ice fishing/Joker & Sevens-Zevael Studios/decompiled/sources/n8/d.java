package n8;

import bc.m;
import bc.n;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d implements b {
    public static final a Companion = new a(null);
    private static String indent = "";
    private final Map<Class<?>, List<e>> serviceMap;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a {
        public /* synthetic */ a(pc.f fVar) {
            this();
        }

        public final String getIndent() {
            return d.indent;
        }

        public final void setIndent(String str) {
            j.e(str, "<set-?>");
            d.indent = str;
        }

        private a() {
        }
    }

    public d(List<? extends e> list) {
        j.e(list, "registrations");
        this.serviceMap = new LinkedHashMap();
        for (e eVar : list) {
            for (Class<?> cls : eVar.getServices()) {
                if (this.serviceMap.containsKey(cls)) {
                    List<e> list2 = this.serviceMap.get(cls);
                    j.b(list2);
                    list2.add(eVar);
                } else {
                    this.serviceMap.put(cls, n.M(eVar));
                }
            }
        }
    }

    @Override // n8.b
    public <T> List<T> getAllServices(Class<T> cls) {
        ArrayList arrayList;
        j.e(cls, "c");
        synchronized (this.serviceMap) {
            try {
                arrayList = new ArrayList();
                if (this.serviceMap.containsKey(cls)) {
                    Map<Class<?>, List<e>> map = this.serviceMap;
                    j.b(map);
                    List<e> list = map.get(cls);
                    j.b(list);
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
        j.i();
        throw null;
    }

    @Override // n8.b
    public <T> T getService(Class<T> cls) {
        j.e(cls, "c");
        T t3 = (T) getServiceOrNull(cls);
        if (t3 != null) {
            return t3;
        }
        throw new Exception("Service " + cls + " could not be instantiated");
    }

    public final /* synthetic */ <T> T getService$com_onesignal_core() {
        j.i();
        throw null;
    }

    @Override // n8.b
    public <T> T getServiceOrNull(Class<T> cls) {
        T t3;
        e eVar;
        j.e(cls, "c");
        synchronized (this.serviceMap) {
            List<e> list = this.serviceMap.get(cls);
            t3 = (list == null || (eVar = (e) m.X(list)) == null) ? null : (T) eVar.resolve(this);
        }
        return t3;
    }

    public final /* synthetic */ <T> T getServiceOrNull$com_onesignal_core() {
        j.i();
        throw null;
    }

    @Override // n8.b
    public <T> boolean hasService(Class<T> cls) {
        boolean containsKey;
        j.e(cls, "c");
        synchronized (this.serviceMap) {
            containsKey = this.serviceMap.containsKey(cls);
        }
        return containsKey;
    }

    public final /* synthetic */ <T> boolean hasService$com_onesignal_core() {
        j.i();
        throw null;
    }
}
