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

/* renamed from: io.appmetrica.analytics.impl.yk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0905yk {

    /* renamed from: a, reason: collision with root package name */
    public final C0271a7 f7241a;

    /* renamed from: b, reason: collision with root package name */
    public Y6 f7242b;

    /* renamed from: c, reason: collision with root package name */
    public S2 f7243c;

    /* renamed from: d, reason: collision with root package name */
    public T2 f7244d;

    /* renamed from: e, reason: collision with root package name */
    public C0740sb f7245e;

    /* renamed from: f, reason: collision with root package name */
    public C0766tb f7246f;

    /* renamed from: g, reason: collision with root package name */
    public C0752sn f7247g;

    /* renamed from: h, reason: collision with root package name */
    public C0778tn f7248h;

    /* renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f7249i = new LinkedHashMap();

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f7250j = new LinkedHashMap();

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f7251k = new LinkedHashMap();

    public C0905yk(File file) {
        this.f7241a = new C0271a7(file);
    }

    public final IBinaryDataHelper a(Context context) {
        S2 s2 = this.f7243c;
        if (s2 != null) {
            return s2;
        }
        S2 s22 = new S2(new C0699ql(f(context)), "binary_data");
        this.f7243c = s22;
        return s22;
    }

    public final synchronized IBinaryDataHelper b(Context context) {
        T2 t2;
        t2 = this.f7244d;
        if (t2 == null) {
            t2 = new T2(a(context));
            this.f7244d = t2;
        }
        return t2;
    }

    public final synchronized IBinaryDataHelper c(Context context) {
        return a(context);
    }

    public final synchronized Ha d(Context context) {
        C0766tb c0766tb;
        try {
            c0766tb = this.f7246f;
            if (c0766tb == null) {
                C0740sb c0740sb = this.f7245e;
                if (c0740sb == null) {
                    c0740sb = new C0740sb(new C0699ql(f(context)));
                    this.f7245e = c0740sb;
                }
                c0766tb = new C0766tb(c0740sb);
                this.f7246f = c0766tb;
            }
        } catch (Throwable th) {
            throw th;
        }
        return c0766tb;
    }

    public final synchronized Ha e(Context context) {
        C0740sb c0740sb;
        c0740sb = this.f7245e;
        if (c0740sb == null) {
            c0740sb = new C0740sb(new C0699ql(f(context)));
            this.f7245e = c0740sb;
        }
        return c0740sb;
    }

    public final synchronized Y6 f(Context context) {
        Y6 y6;
        try {
            y6 = this.f7242b;
            if (y6 == null) {
                C0271a7 c0271a7 = this.f7241a;
                String a2 = new Z6(c0271a7.f5559a, c0271a7.f5560b, true).a(context, new C0413fk());
                M6 m6 = AbstractC0838w5.f7093c;
                m6.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("preferences", InterfaceC0760t5.f6933a);
                hashMap.put("binary_data", AbstractC0708r5.f6809a);
                hashMap.put("temp_cache", AbstractC0830vn.f7077a);
                Iterator<ModuleServicesDatabase> it = C0610na.f6575I.p().b().iterator();
                while (it.hasNext()) {
                    for (TableDescription tableDescription : it.next().getTables()) {
                        hashMap.put(tableDescription.getTableName(), tableDescription.getColumnNames());
                    }
                }
                C0468hn c0468hn = m6.f4738c;
                W6 w6 = m6.f4736a;
                U6 u6 = w6.f5286e;
                V6 v6 = w6.f5287f;
                C0662pa c0662pa = new C0662pa(false);
                c0662pa.a(114, new C0439gk());
                Iterator<ModuleServicesDatabase> it2 = C0610na.f6575I.p().b().iterator();
                while (it2.hasNext()) {
                    Iterator<TableDescription> it3 = it2.next().getTables().iterator();
                    while (it3.hasNext()) {
                        for (Map.Entry<Integer, DatabaseScript> entry : it3.next().getDatabaseProviderUpgradeScript().entrySet()) {
                            c0662pa.a(entry.getKey(), entry.getValue());
                        }
                    }
                }
                C0545kn c0545kn = new C0545kn("service database", hashMap);
                c0468hn.getClass();
                y6 = new Y6(context, a2, new C0493in(u6, v6, c0662pa, c0545kn), PublicLogger.getAnonymousInstance());
                this.f7242b = y6;
            }
        } catch (Throwable th) {
            throw th;
        }
        return y6;
    }

    public final synchronized Y6 c(Context context, Q4 q4) {
        Object obj;
        try {
            String str = new H4(q4).f4460a;
            LinkedHashMap linkedHashMap = this.f7249i;
            obj = linkedHashMap.get(str);
            if (obj == null) {
                C0271a7 c0271a7 = this.f7241a;
                String a2 = new Z6(c0271a7.f5559a, c0271a7.f5560b, false).a(context, new H4(q4));
                M6 m6 = AbstractC0838w5.f7093c;
                m6.getClass();
                String str2 = q4.f4951b;
                if (str2 == null) {
                    str2 = "main";
                }
                String concat = "component-".concat(str2);
                C0468hn c0468hn = m6.f4738c;
                W6 w6 = m6.f4736a;
                O6 o6 = w6.f5282a;
                P6 p6 = w6.f5283b;
                C0662pa c0662pa = new C0662pa(false);
                c0662pa.a(112, new K4());
                C0545kn c0545kn = new C0545kn(concat, m6.f4737b.f6974a);
                c0468hn.getClass();
                obj = new Y6(context, a2, new C0493in(o6, p6, c0662pa, c0545kn), PublicLogger.getAnonymousInstance());
                linkedHashMap.put(str, obj);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Y6) obj;
    }

    public final synchronized IBinaryDataHelper a(Context context, Q4 q4) {
        Object obj;
        try {
            String str = new H4(q4).f4460a;
            LinkedHashMap linkedHashMap = this.f7251k;
            obj = linkedHashMap.get(str);
            if (obj == null) {
                obj = new S2(new C0699ql(c(context, q4)), "binary_data");
                linkedHashMap.put(str, obj);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (IBinaryDataHelper) obj;
    }

    public final synchronized Ha b(Context context, Q4 q4) {
        Object obj;
        try {
            String str = new H4(q4).f4460a;
            LinkedHashMap linkedHashMap = this.f7250j;
            obj = linkedHashMap.get(str);
            if (obj == null) {
                obj = new C0740sb(new C0699ql(c(context, q4)));
                linkedHashMap.put(str, obj);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Ha) obj;
    }
}
