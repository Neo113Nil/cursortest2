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

/* loaded from: classes9.dex */
public final class Rn {
    public final X7 a;
    public V7 b;
    public H3 c;
    public I3 d;
    public C0390hd e;
    public C0419id f;
    public Pq g;
    public Qq h;
    public final LinkedHashMap i = new LinkedHashMap();
    public final LinkedHashMap j = new LinkedHashMap();
    public final LinkedHashMap k = new LinkedHashMap();

    public Rn(File file) {
        this.a = new X7(file);
    }

    public final synchronized IBinaryDataHelper a(Context context, K5 k5) {
        Object obj;
        try {
            String str = new B5(k5).a;
            LinkedHashMap linkedHashMap = this.k;
            obj = linkedHashMap.get(str);
            if (obj == null) {
                obj = new H3(new Oo(c(context, k5)), "binary_data");
                linkedHashMap.put(str, obj);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (IBinaryDataHelper) obj;
    }

    public final synchronized InterfaceC0418ic b(Context context, K5 k5) {
        Object obj;
        try {
            String str = new B5(k5).a;
            LinkedHashMap linkedHashMap = this.j;
            obj = linkedHashMap.get(str);
            if (obj == null) {
                obj = new C0390hd("preferences", new Oo(c(context, k5)), Jb.I.d.f());
                linkedHashMap.put(str, obj);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (InterfaceC0418ic) obj;
    }

    public final synchronized V7 c(Context context, K5 k5) {
        Object obj;
        try {
            String str = new B5(k5).a;
            LinkedHashMap linkedHashMap = this.i;
            obj = linkedHashMap.get(str);
            if (obj == null) {
                X7 x7 = this.a;
                String a = new W7(x7.a, x7.b, false).a(context, new B5(k5));
                J7 j7 = AbstractC0671r6.c;
                j7.getClass();
                String str2 = k5.b;
                if (str2 == null) {
                    str2 = "main";
                }
                String concat = "component-".concat(str2);
                Cq cq = j7.c;
                T7 t7 = j7.a;
                L7 l7 = t7.a;
                M7 m7 = t7.b;
                Ob ob = new Ob(false);
                ob.a(112, new E5());
                Fq fq = new Fq(concat, j7.b.a);
                cq.getClass();
                obj = new V7(context, a, new Dq(l7, m7, ob, fq), PublicLogger.getAnonymousInstance());
                linkedHashMap.put(str, obj);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (V7) obj;
    }

    public final synchronized InterfaceC0418ic d(Context context) {
        C0419id c0419id;
        try {
            c0419id = this.f;
            if (c0419id == null) {
                C0390hd c0390hd = this.e;
                if (c0390hd == null) {
                    c0390hd = new C0390hd("preferences", new Oo(f(context)), Jb.I.d.f());
                    this.e = c0390hd;
                }
                c0419id = new C0419id(c0390hd);
                this.f = c0419id;
            }
        } catch (Throwable th) {
            throw th;
        }
        return c0419id;
    }

    public final synchronized InterfaceC0418ic e(Context context) {
        C0390hd c0390hd;
        c0390hd = this.e;
        if (c0390hd == null) {
            c0390hd = new C0390hd("preferences", new Oo(f(context)), Jb.I.d.f());
            this.e = c0390hd;
        }
        return c0390hd;
    }

    public final synchronized V7 f(Context context) {
        V7 v7;
        try {
            v7 = this.b;
            if (v7 == null) {
                X7 x7 = this.a;
                String a = new W7(x7.a, x7.b, true).a(context, new C0804vn());
                J7 j7 = AbstractC0671r6.c;
                j7.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("preferences", InterfaceC0585o6.a);
                hashMap.put("binary_data", AbstractC0527m6.a);
                hashMap.put("temp_cache", Tq.a);
                Iterator<ModuleServicesDatabase> it = Jb.I.p().a().iterator();
                while (it.hasNext()) {
                    for (TableDescription tableDescription : it.next().getTables()) {
                        hashMap.put(tableDescription.getTableName(), tableDescription.getColumnNames());
                    }
                }
                Cq cq = j7.c;
                T7 t7 = j7.a;
                R7 r7 = t7.e;
                S7 s7 = t7.f;
                Ob ob = new Ob(false);
                ob.a(114, new C0833wn());
                Iterator<ModuleServicesDatabase> it2 = Jb.I.p().a().iterator();
                while (it2.hasNext()) {
                    Iterator<TableDescription> it3 = it2.next().getTables().iterator();
                    while (it3.hasNext()) {
                        for (Map.Entry<Integer, DatabaseScript> entry : it3.next().getDatabaseProviderUpgradeScript().entrySet()) {
                            ob.a(entry.getKey(), entry.getValue());
                        }
                    }
                }
                Fq fq = new Fq("service database", hashMap);
                cq.getClass();
                v7 = new V7(context, a, new Dq(r7, s7, ob, fq), PublicLogger.getAnonymousInstance());
                this.b = v7;
            }
        } catch (Throwable th) {
            throw th;
        }
        return v7;
    }

    public final IBinaryDataHelper a(Context context) {
        H3 h3 = this.c;
        if (h3 != null) {
            return h3;
        }
        H3 h32 = new H3(new Oo(f(context)), "binary_data");
        this.c = h32;
        return h32;
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

    public final synchronized IBinaryDataHelper c(Context context) {
        return a(context);
    }
}
