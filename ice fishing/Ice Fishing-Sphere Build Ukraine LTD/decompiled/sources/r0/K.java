package r0;

import D.C0004e;
import D.S;
import D.W;
import D.X;
import L0.C0062u;
import L0.InterfaceC0063v;
import L0.U;
import L0.g0;
import android.content.Context;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class K {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ I0.c[] f2866a;

    /* renamed from: b, reason: collision with root package name */
    public static final F.c f2867b;

    static {
        E0.l lVar = new E0.l(E0.b.f294e, K.class, "sharedPreferencesDataStore", "getSharedPreferencesDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;");
        E0.q.f314a.getClass();
        f2866a = new I0.c[]{lVar};
        F.a aVar = F.a.f315f;
        v0.i iVar = L0.C.f612b;
        g0 g0Var = new g0(null);
        iVar.getClass();
        if (g0Var != v0.j.f3014e) {
            iVar = (v0.i) g0Var.m(iVar, new v0.b(1));
        }
        if (iVar.i(C0062u.f682f) == null) {
            iVar = iVar.f(new U(null));
        }
        f2867b = new F.c(aVar, new Q0.e(iVar));
    }

    public static final A.j a(Context context) {
        A.j jVar;
        E0.i.e(context, "<this>");
        F.c cVar = f2867b;
        I0.c cVar2 = f2866a[0];
        cVar.getClass();
        E0.i.e(cVar2, "property");
        A.j jVar2 = cVar.f322d;
        if (jVar2 != null) {
            return jVar2;
        }
        synchronized (cVar.f321c) {
            try {
                if (cVar.f322d == null) {
                    Context applicationContext = context.getApplicationContext();
                    D0.l lVar = cVar.f319a;
                    E0.i.d(applicationContext, "applicationContext");
                    List list = (List) lVar.i(applicationContext);
                    InterfaceC0063v interfaceC0063v = cVar.f320b;
                    F.b bVar = new F.b(0, applicationContext, cVar);
                    E0.i.e(list, "migrations");
                    S s2 = new S(new X(new W(1, bVar)), o.g.s(new C0004e(list, null)), new E.a(0), interfaceC0063v);
                    cVar.f322d = new A.j(5, new A.j(5, s2));
                }
                jVar = cVar.f322d;
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
