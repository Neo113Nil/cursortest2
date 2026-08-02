package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.modulesapi.internal.common.TableDescription;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServicesDatabase;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.zn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0844zn {
    public final T7 a;
    public R7 b;
    public H3 c;
    public I3 d;
    public Rc e;
    public Sc f;
    public C0791xq g;
    public C0819yq h;
    public final LinkedHashMap i = new LinkedHashMap();
    public final LinkedHashMap j = new LinkedHashMap();
    public final LinkedHashMap k = new LinkedHashMap();

    public C0844zn(File file) {
        this.a = new T7(file);
    }

    public final synchronized IBinaryDataHelper a(Context context, H5 h5) {
        Object obj;
        try {
            String str = new C0798y5(h5).a;
            LinkedHashMap linkedHashMap = this.k;
            obj = linkedHashMap.get(str);
            if (obj == null) {
                obj = new H3(new C0673to(c(context, h5)), "binary_data");
                linkedHashMap.put(str, obj);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (IBinaryDataHelper) obj;
    }

    public final synchronized Tb b(Context context, H5 h5) {
        Object obj;
        try {
            String str = new C0798y5(h5).a;
            LinkedHashMap linkedHashMap = this.j;
            obj = linkedHashMap.get(str);
            if (obj == null) {
                obj = new Rc(new C0673to(c(context, h5)));
                linkedHashMap.put(str, obj);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Tb) obj;
    }

    public final synchronized R7 c(Context context, H5 h5) {
        Object obj;
        try {
            String str = new C0798y5(h5).a;
            LinkedHashMap linkedHashMap = this.i;
            obj = linkedHashMap.get(str);
            if (obj == null) {
                T7 t7 = this.a;
                String a = new S7(t7.a, t7.b, false).a(context, new C0798y5(h5));
                F7 f7 = AbstractC0511o6.c;
                f7.getClass();
                String str2 = h5.b;
                if (str2 == null) {
                    str2 = "main";
                }
                String concat = "component-".concat(str2);
                C0444lq c0444lq = f7.c;
                P7 p7 = f7.a;
                H7 h7 = p7.a;
                I7 i7 = p7.b;
                C0804yb c0804yb = new C0804yb(false);
                c0804yb.a(112, new B5());
                C0531oq c0531oq = new C0531oq(concat, f7.b.a);
                c0444lq.getClass();
                obj = new R7(context, a, new C0473mq(h7, i7, c0804yb, c0531oq), PublicLogger.getAnonymousInstance());
                linkedHashMap.put(str, obj);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (R7) obj;
    }

    public final synchronized Tb d(Context context) {
        Sc sc;
        try {
            sc = this.f;
            if (sc == null) {
                Rc rc = this.e;
                if (rc == null) {
                    rc = new Rc(new C0673to(f(context)));
                    this.e = rc;
                }
                sc = new Sc(rc);
                this.f = sc;
            }
        } catch (Throwable th) {
            throw th;
        }
        return sc;
    }

    public final synchronized Tb e(Context context) {
        Rc rc;
        rc = this.e;
        if (rc == null) {
            rc = new Rc(new C0673to(f(context)));
            this.e = rc;
        }
        return rc;
    }

    public final synchronized R7 f(Context context) {
        R7 r7;
        try {
            r7 = this.b;
            if (r7 == null) {
                T7 t7 = this.a;
                String a = new S7(t7.a, t7.b, true).a(context, new C0211dn());
                F7 f7 = AbstractC0511o6.c;
                f7.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("preferences", InterfaceC0424l6.a);
                hashMap.put("binary_data", AbstractC0366j6.a);
                hashMap.put("temp_cache", Aq.a);
                Iterator<ModuleServicesDatabase> it = C0747wb.I.p().b().iterator();
                while (it.hasNext()) {
                    for (TableDescription tableDescription : it.next().getTables()) {
                        hashMap.put(tableDescription.getTableName(), tableDescription.getColumnNames());
                    }
                }
                C0444lq c0444lq = f7.c;
                P7 p7 = f7.a;
                N7 n7 = p7.e;
                O7 o7 = p7.f;
                C0804yb c0804yb = new C0804yb(false);
                c0804yb.a(114, new C0239en());
                Iterator<ModuleServicesDatabase> it2 = C0747wb.I.p().b().iterator();
                while (it2.hasNext()) {
                    Iterator<TableDescription> it3 = it2.next().getTables().iterator();
                    while (it3.hasNext()) {
                        for (Map.Entry<Integer, DatabaseScript> entry : it3.next().getDatabaseProviderUpgradeScript().entrySet()) {
                            c0804yb.a(entry.getKey(), entry.getValue());
                        }
                    }
                }
                C0531oq c0531oq = new C0531oq("service database", hashMap);
                c0444lq.getClass();
                r7 = new R7(context, a, new C0473mq(n7, o7, c0804yb, c0531oq), PublicLogger.getAnonymousInstance());
                this.b = r7;
            }
        } catch (Throwable th) {
            throw th;
        }
        return r7;
    }

    public final synchronized IBinaryDataHelper b(Context context) {
        I3 i3;
        i3 = this.d;
        if (i3 == null) {
            i3 = new I3(a(context));
            this.d = i3;
        }
        return i3;
    }

    public final IBinaryDataHelper a(Context context) {
        H3 h3 = this.c;
        if (h3 != null) {
            return h3;
        }
        H3 h32 = new H3(new C0673to(f(context)), "binary_data");
        this.c = h32;
        return h32;
    }

    public final synchronized IBinaryDataHelper c(Context context) {
        return a(context);
    }
}
