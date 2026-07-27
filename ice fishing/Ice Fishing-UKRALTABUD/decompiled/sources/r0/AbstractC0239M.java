package r0;

import D.C0004e;
import D.S;
import D.W;
import D.X;
import K0.C0044u;
import K0.InterfaceC0045v;
import K0.U;
import K0.g0;
import android.content.Context;
import java.util.List;
import java.util.Set;

/* renamed from: r0.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0239M {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ H0.c[] f2864a;

    /* renamed from: b, reason: collision with root package name */
    public static final F.c f2865b;

    static {
        E0.l lVar = new E0.l(E0.b.f293f, AbstractC0239M.class, "sharedPreferencesDataStore", "getSharedPreferencesDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;");
        E0.q.f313a.getClass();
        f2864a = new H0.c[]{lVar};
        F.a aVar = F.a.f314g;
        v0.i iVar = K0.C.f464b;
        g0 g0Var = new g0(null);
        iVar.getClass();
        if (g0Var != v0.j.f3009f) {
            iVar = (v0.i) g0Var.m(iVar, new v0.b(1));
        }
        if (iVar.i(C0044u.f534g) == null) {
            iVar = iVar.f(new U(null));
        }
        f2865b = new F.c(aVar, new P0.e(iVar));
    }

    public static final A.j a(Context context) {
        A.j jVar;
        E0.i.e(context, "<this>");
        F.c cVar = f2865b;
        H0.c cVar2 = f2864a[0];
        cVar.getClass();
        E0.i.e(cVar2, "property");
        A.j jVar2 = cVar.f321d;
        if (jVar2 != null) {
            return jVar2;
        }
        synchronized (cVar.f320c) {
            try {
                if (cVar.f321d == null) {
                    Context applicationContext = context.getApplicationContext();
                    D0.l lVar = cVar.f318a;
                    E0.i.d(applicationContext, "applicationContext");
                    List list = (List) lVar.i(applicationContext);
                    InterfaceC0045v interfaceC0045v = cVar.f319b;
                    F.b bVar = new F.b(0, applicationContext, cVar);
                    E0.i.e(list, "migrations");
                    S s2 = new S(new X(new W(1, bVar)), o.g.v(new C0004e(list, null)), new E.a(0), interfaceC0045v);
                    cVar.f321d = new A.j(5, new A.j(5, s2));
                }
                jVar = cVar.f321d;
                E0.i.b(jVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return jVar;
    }

    public static final boolean b(String str, Object obj, Set set) {
        E0.i.e(str, "key");
        return set == null ? (obj instanceof Boolean) || (obj instanceof Long) || (obj instanceof String) || (obj instanceof Double) : set.contains(str);
    }

    public static final Object c(Object obj, E.a aVar) {
        if (!(obj instanceof String)) {
            return obj;
        }
        String str = (String) obj;
        E0.i.e(str, "<this>");
        if (str.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
            if (str.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!")) {
                return obj;
            }
            String substring = str.substring(40);
            E0.i.d(substring, "substring(...)");
            return aVar.c(substring);
        }
        if (!str.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
            return obj;
        }
        String substring2 = str.substring(40);
        E0.i.d(substring2, "substring(...)");
        return Double.valueOf(Double.parseDouble(substring2));
    }
}
