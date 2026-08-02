package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class pzb extends szb {
    public final String a;
    public final String b;
    public final Function1 c;
    public final ywt d;
    public final y7k e;
    public final uct f;
    public final szb g;
    public final String h;
    public bhb i;
    public Object j;

    public pzb(String str, String str2, Function1 function1, ywt ywtVar, y7k y7kVar, uct uctVar, szb szbVar) {
        this.a = str;
        this.b = str2;
        this.c = function1;
        this.d = ywtVar;
        this.e = y7kVar;
        this.f = uctVar;
        this.g = szbVar;
        this.h = str2;
    }

    @Override // defpackage.szb
    public final Object a(xzb xzbVar) {
        Object a;
        try {
            Object i = i(xzbVar);
            this.j = i;
            return i;
        } catch (z7k e) {
            String message = e.getMessage();
            y7k y7kVar = this.e;
            if (message != null && message.length() != 0) {
                y7kVar.a(e);
                xzbVar.b(e);
            }
            Object obj = this.j;
            if (obj != null) {
                return obj;
            }
            try {
                szb szbVar = this.g;
                if (szbVar == null || (a = szbVar.a(xzbVar)) == null) {
                    return this.f.a();
                }
                this.j = a;
                return a;
            } catch (z7k e2) {
                y7kVar.a(e2);
                xzbVar.b(e2);
                throw e2;
            }
        }
    }

    @Override // defpackage.szb
    public final Object b() {
        return this.h;
    }

    @Override // defpackage.szb
    public final ja8 c(xzb xzbVar, Function1 function1) {
        List list;
        List list2;
        String str = this.a;
        String str2 = this.b;
        try {
            bhb bhbVar = this.i;
            if (bhbVar == null) {
                try {
                    Set set = jhb.c;
                    str2.getClass();
                    bhbVar = new bhb(str2);
                    this.i = bhbVar;
                } catch (khb e) {
                    throw a8k.h(str, str2, e);
                }
            }
            list = bhbVar.c();
        } catch (Exception e2) {
            z7k h = a8k.h(str, str2, e2);
            this.e.a(h);
            xzbVar.b(h);
            list = c5b.a;
        }
        List<jhb> e3 = e();
        if (list.isEmpty() && ((list2 = e3) == null || list2.isEmpty())) {
            return ja8.b0;
        }
        t03 t03Var = new t03(14, function1, this, xzbVar);
        ja8 d = xzbVar.d(str2, list, t03Var);
        List list3 = e3;
        if (list3 == null || list3.isEmpty()) {
            return d;
        }
        vq5 vq5Var = new vq5();
        vq5Var.a(d);
        vq5Var.a(g(e3, xzbVar, t03Var));
        for (jhb jhbVar : e3) {
            xzb xzbVar2 = xzbVar;
            vh0 vh0Var = new vh0(vq5Var, this, jhbVar, xzbVar2, t03Var, 7);
            vq5Var.a(xzbVar2.d(jhbVar.toString(), jhbVar.c(), vh0Var));
            vq5Var.a(g(jhbVar.b(), xzbVar2, vh0Var));
            xzbVar = xzbVar2;
        }
        return vq5Var;
    }

    public final List e() {
        Object t7oVar;
        try {
            r7o r7oVar = z7o.b;
            bhb bhbVar = this.i;
            t7oVar = bhbVar != null ? bhbVar.b() : null;
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        return (List) (t7oVar instanceof t7o ? null : t7oVar);
    }

    public final List f(xzb xzbVar) {
        List list;
        ArrayList arrayList;
        String str = this.a;
        String str2 = this.b;
        try {
            bhb bhbVar = this.i;
            if (bhbVar == null) {
                try {
                    Set set = jhb.c;
                    str2.getClass();
                    bhbVar = new bhb(str2);
                    this.i = bhbVar;
                } catch (khb e) {
                    throw a8k.h(str, str2, e);
                }
            }
            list = bhbVar.c();
        } catch (Exception e2) {
            z7k h = a8k.h(str, str2, e2);
            this.e.a(h);
            xzbVar.b(h);
            list = c5b.a;
        }
        List e3 = e();
        if (e3 != null) {
            arrayList = new ArrayList();
            Iterator it = e3.iterator();
            while (it.hasNext()) {
                String h2 = h((jhb) it.next(), xzbVar);
                if (h2 != null) {
                    arrayList.add(h2);
                }
            }
        } else {
            arrayList = null;
        }
        return (arrayList == null || arrayList.isEmpty()) ? list : CollectionsKt.g0(list, arrayList);
    }

    public final ja8 g(List list, xzb xzbVar, Function0 function0) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String h = h((jhb) it.next(), xzbVar);
            if (h != null) {
                arrayList.add(h);
            }
        }
        return arrayList.isEmpty() ? ja8.b0 : xzbVar.d(this.b, arrayList, function0);
    }

    public final String h(jhb jhbVar, xzb xzbVar) {
        return (String) xzbVar.a(this.a, jhbVar.toString(), jhbVar, bcx.i, bcx.h, vct.c, this.e);
    }

    public final Object i(xzb xzbVar) {
        bhb bhbVar = this.i;
        String str = this.a;
        String str2 = this.b;
        if (bhbVar == null) {
            try {
                Set set = jhb.c;
                str2.getClass();
                bhbVar = new bhb(str2);
                this.i = bhbVar;
            } catch (khb e) {
                throw a8k.h(str, str2, e);
            }
        }
        bhb bhbVar2 = bhbVar;
        Object a = xzbVar.a(this.a, str2, bhbVar2, this.c, this.d, this.f, this.e);
        String str3 = this.b;
        if (a == null) {
            throw a8k.h(str, str3, null);
        }
        if (this.f.b(a)) {
            return a;
        }
        throw a8k.j(str, str3, a, null);
    }
}
