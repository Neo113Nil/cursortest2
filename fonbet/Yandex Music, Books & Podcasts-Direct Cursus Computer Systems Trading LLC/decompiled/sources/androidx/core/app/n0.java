package androidx.core.app;

import android.os.Bundle;
import com.yandex.passport.internal.methods.v5;
import com.yandex.passport.internal.report.af;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.ze;
import com.yandex.plus.core.graphql.fragment.e3;
import com.yandex.plus.core.graphql.fragment.f3;
import defpackage.b6;
import defpackage.c5b;
import defpackage.cg6;
import defpackage.e5b;
import defpackage.nm6;
import defpackage.q5b;
import defpackage.qgg;
import defpackage.rhw;
import defpackage.tah;
import defpackage.v75;
import defpackage.x97;
import defpackage.xq0;
import defpackage.xz0;
import defpackage.z7o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public abstract class n0 {
    public Object a;

    public n0(com.yandex.passport.internal.methods.requester.f fVar) {
        fVar.getClass();
        this.a = fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r4 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.yandex.plus.home.repository.api.model.webconfig.u c(String str, List list, Map map) {
        Set set;
        if (str == null) {
            str = "";
        }
        if (list != null) {
            ArrayList O = CollectionsKt.O(list);
            ArrayList arrayList = new ArrayList();
            Iterator it = O.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (!StringsKt.U((String) next)) {
                    arrayList.add(next);
                }
            }
            set = CollectionsKt.A0(arrayList);
        }
        set = q5b.a;
        if (map == null) {
            map = e5b.a;
            map.getClass();
        }
        return new com.yandex.plus.home.repository.api.model.webconfig.u(str, set, map);
    }

    public static com.yandex.plus.home.repository.api.model.webconfig.k d(List list) {
        f3 h;
        f3 h2;
        String str = (list == null || (h2 = h("legalText", list)) == null) ? null : h2.b;
        String str2 = (list == null || (h = h("legalUrl", list)) == null) ? null : h.b;
        if (str == null || str2 == null) {
            return null;
        }
        return new com.yandex.plus.home.repository.api.model.webconfig.k(str, str2);
    }

    public static com.yandex.plus.home.repository.api.model.webconfig.o e(List list, boolean z) {
        f3 h;
        f3 h2;
        f3 h3;
        if (!z) {
            return null;
        }
        String str = (list == null || (h3 = h("legalTemplate", list)) == null) ? null : h3.b;
        String str2 = (list == null || (h2 = h("legalUrlText", list)) == null) ? null : h2.b;
        String str3 = (list == null || (h = h("legalUrl", list)) == null) ? null : h.b;
        if (str == null || str2 == null || str3 == null) {
            return null;
        }
        return new com.yandex.plus.home.repository.api.model.webconfig.o(str, str2, str3);
    }

    public static com.yandex.plus.home.repository.api.model.webconfig.z f(boolean z, com.yandex.plus.core.graphql.type.m0 m0Var, com.yandex.plus.core.graphql.type.n0 n0Var, com.yandex.plus.core.graphql.type.o0 o0Var, String str, List list, com.yandex.plus.home.repository.api.model.webconfig.u uVar) {
        str.getClass();
        list.getClass();
        int i = m0Var == null ? -1 : com.yandex.plus.home.graphql.subscription.a.a[m0Var.ordinal()];
        com.yandex.plus.home.repository.api.model.webconfig.v vVar = i != 1 ? i != 2 ? com.yandex.plus.home.repository.api.model.webconfig.v.c : com.yandex.plus.home.repository.api.model.webconfig.v.b : com.yandex.plus.home.repository.api.model.webconfig.v.a;
        int i2 = n0Var == null ? -1 : com.yandex.plus.home.graphql.subscription.a.b[n0Var.ordinal()];
        com.yandex.plus.home.repository.api.model.webconfig.x xVar = i2 != 1 ? i2 != 2 ? com.yandex.plus.home.repository.api.model.webconfig.x.c : com.yandex.plus.home.repository.api.model.webconfig.x.b : com.yandex.plus.home.repository.api.model.webconfig.x.a;
        int i3 = o0Var != null ? com.yandex.plus.home.graphql.subscription.a.c[o0Var.ordinal()] : -1;
        return new com.yandex.plus.home.repository.api.model.webconfig.z(list, z, vVar, xVar, i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? com.yandex.plus.home.repository.api.model.webconfig.y.e : com.yandex.plus.home.repository.api.model.webconfig.y.d : com.yandex.plus.home.repository.api.model.webconfig.y.c : com.yandex.plus.home.repository.api.model.webconfig.y.b : com.yandex.plus.home.repository.api.model.webconfig.y.a, str, uVar);
    }

    public static f3 h(String str, List list) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            f3 f3Var = ((e3) obj).b;
            if (Intrinsics.d(f3Var != null ? f3Var.a : null, str)) {
                break;
            }
        }
        e3 e3Var = (e3) obj;
        if (e3Var != null) {
            return e3Var.b;
        }
        return null;
    }

    public void a(Bundle bundle) {
        String i = i();
        if (i != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", i);
        }
    }

    public abstract void b(p0 p0Var);

    public Object g(Object obj, Continuation continuation) {
        return x97.V((kotlinx.coroutines.a) this.a, new rhw(this, obj, (Continuation) null, 9), continuation);
    }

    public String i() {
        return null;
    }

    public Throwable j() {
        return (Throwable) this.a;
    }

    public boolean k() {
        return true;
    }

    public void l(b6 b6Var, Map map) {
        b6Var.getClass();
        if (k()) {
            com.yandex.passport.internal.report.g gVar = (com.yandex.passport.internal.report.g) this.a;
            gVar.getClass();
            if (gVar.c.b()) {
                gVar.a.a(b6Var.toString(), map);
            }
        }
    }

    public void m(b6 b6Var, Iterable iterable) {
        b6Var.getClass();
        iterable.getClass();
        if (k()) {
            com.yandex.passport.internal.ui.a.y((com.yandex.passport.internal.report.g) this.a, b6Var, iterable);
        }
    }

    public void n(b6 b6Var, ze... zeVarArr) {
        b6Var.getClass();
        m(b6Var, xz0.q(zeVarArr));
    }

    public void o(b6 b6Var, com.yandex.passport.common.core.f fVar) {
        b6Var.getClass();
        fVar.getClass();
        if (k()) {
            com.yandex.passport.internal.ui.a.x((com.yandex.passport.internal.report.g) this.a, b6Var, new ff(fVar));
        }
    }

    public void p(b6 b6Var) {
        b6Var.getClass();
        if (k()) {
            com.yandex.passport.internal.ui.a.y((com.yandex.passport.internal.report.g) this.a, b6Var, c5b.a);
        }
    }

    public void q(b6 b6Var, ze... zeVarArr) {
        b6Var.getClass();
        com.yandex.passport.internal.report.g gVar = (com.yandex.passport.internal.report.g) this.a;
        Iterable<ze> q = xz0.q(zeVarArr);
        gVar.getClass();
        q.getClass();
        ArrayList arrayList = new ArrayList();
        for (ze zeVar : q) {
            zeVar.getClass();
            arrayList.add(zeVar);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((ze) next).a()) {
                arrayList2.add(next);
            }
        }
        if (gVar.c.b()) {
            af afVar = gVar.a;
            String b6Var2 = b6Var.toString();
            ArrayList g0 = CollectionsKt.g0(arrayList2, gVar.b.a());
            int a = tah.a(v75.o(g0, 10));
            if (a < 16) {
                a = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(a);
            Iterator it2 = g0.iterator();
            while (it2.hasNext()) {
                ze zeVar2 = (ze) it2.next();
                linkedHashMap.put(zeVar2.getName(), zeVar2.getValue());
            }
            afVar.b(b6Var2, linkedHashMap);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object r(Unit unit, cg6 cg6Var) {
        com.yandex.passport.internal.methods.requester.h hVar;
        int i;
        com.yandex.passport.internal.methods.requester.f fVar;
        if (cg6Var instanceof com.yandex.passport.internal.methods.requester.h) {
            hVar = (com.yandex.passport.internal.methods.requester.h) cg6Var;
            int i2 = hVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.m = i2 - Integer.MIN_VALUE;
                Object obj = hVar.k;
                nm6 nm6Var = nm6.a;
                i = hVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.methods.requester.f fVar2 = (com.yandex.passport.internal.methods.requester.f) this.a;
                    hVar.j = fVar2;
                    hVar.m = 1;
                    Object t = t(unit);
                    if (t != nm6Var) {
                        obj = t;
                        fVar = fVar2;
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj);
                        return ((z7o) obj).a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fVar = hVar.j;
                qgg.h0(obj);
                hVar.j = null;
                hVar.m = 2;
                Object b = fVar.b((v5) obj, hVar);
                return b != nm6Var ? nm6Var : b;
            }
        }
        hVar = new com.yandex.passport.internal.methods.requester.h(this, cg6Var);
        Object obj2 = hVar.k;
        nm6 nm6Var2 = nm6.a;
        i = hVar.m;
        if (i != 0) {
        }
        hVar.j = null;
        hVar.m = 2;
        Object b2 = fVar.b((v5) obj2, hVar);
        if (b2 != nm6Var2) {
        }
    }

    /* renamed from: s */
    public abstract Object x(Object obj, rhw rhwVar);

    public abstract Object t(Object obj);

    public /* synthetic */ n0(Object obj) {
        this.a = obj;
    }

    public n0(kotlinx.coroutines.a aVar) {
        aVar.getClass();
        this.a = aVar;
    }

    public n0(com.yandex.passport.internal.report.g gVar) {
        gVar.getClass();
        this.a = gVar;
    }

    public n0(com.yandex.plus.core.graphql.utils.b bVar) {
        bVar.getClass();
        this.a = bVar;
    }
}
