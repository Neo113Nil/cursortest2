package f1;

import A1.C0019u;
import A1.InterfaceC0020v;
import A1.V;
import A1.h0;
import F.C0029e;
import F.U;
import a.AbstractC0083a;
import android.content.Context;
import java.util.List;
import java.util.Set;
import l1.C0982b;

/* renamed from: f1.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0162M {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ x1.g[] f2912a;

    /* renamed from: b, reason: collision with root package name */
    public static final H.c f2913b;

    static {
        kotlin.jvm.internal.l lVar = new kotlin.jvm.internal.l(kotlin.jvm.internal.b.NO_RECEIVER, AbstractC0162M.class, "sharedPreferencesDataStore", "getSharedPreferencesDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;");
        kotlin.jvm.internal.q.f8077a.getClass();
        f2912a = new x1.g[]{lVar};
        H.a aVar = H.a.f643e;
        l1.i iVar = A1.D.f3b;
        h0 h0Var = new h0(null);
        iVar.getClass();
        if (h0Var != l1.j.f8138a) {
            iVar = (l1.i) h0Var.k(iVar, new C0982b(1));
        }
        if (iVar.m(C0019u.f73b) == null) {
            iVar = iVar.l(new V(null));
        }
        f2913b = new H.c(aVar, new F1.e(iVar));
    }

    public static final C.j a(Context context) {
        C.j jVar;
        kotlin.jvm.internal.i.e(context, "<this>");
        H.c cVar = f2913b;
        x1.g property = f2912a[0];
        cVar.getClass();
        kotlin.jvm.internal.i.e(property, "property");
        C.j jVar2 = cVar.f650d;
        if (jVar2 != null) {
            return jVar2;
        }
        synchronized (cVar.f649c) {
            try {
                if (cVar.f650d == null) {
                    Context applicationContext = context.getApplicationContext();
                    t1.l lVar = cVar.f647a;
                    kotlin.jvm.internal.i.d(applicationContext, "applicationContext");
                    List migrations = (List) lVar.invoke(applicationContext);
                    InterfaceC0020v interfaceC0020v = cVar.f648b;
                    H.b bVar = new H.b(0, applicationContext, cVar);
                    kotlin.jvm.internal.i.e(migrations, "migrations");
                    F.P p2 = new F.P(new F.V(new U(1, bVar)), AbstractC0083a.m(new C0029e(migrations, null)), new m0.j(1, false), interfaceC0020v);
                    cVar.f650d = new C.j(8, new C.j(8, p2));
                }
                jVar = cVar.f650d;
                kotlin.jvm.internal.i.b(jVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return jVar;
    }

    public static final boolean b(String key, Object obj, Set set) {
        kotlin.jvm.internal.i.e(key, "key");
        return set == null ? (obj instanceof Boolean) || (obj instanceof Long) || (obj instanceof String) || (obj instanceof Double) : set.contains(key);
    }

    public static final Object c(Object obj, m0.j jVar) {
        if (!(obj instanceof String)) {
            return obj;
        }
        String str = (String) obj;
        if (z1.o.R(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu", false)) {
            if (z1.o.R(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!", false)) {
                return obj;
            }
            String substring = str.substring(40);
            kotlin.jvm.internal.i.d(substring, "substring(...)");
            return jVar.f(substring);
        }
        if (!z1.o.R(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu", false)) {
            return obj;
        }
        String substring2 = str.substring(40);
        kotlin.jvm.internal.i.d(substring2, "substring(...)");
        return Double.valueOf(Double.parseDouble(substring2));
    }
}
