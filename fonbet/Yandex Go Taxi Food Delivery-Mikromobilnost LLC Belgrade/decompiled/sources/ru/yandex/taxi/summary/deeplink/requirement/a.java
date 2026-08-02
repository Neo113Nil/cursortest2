package ru.yandex.taxi.summary.deeplink.requirement;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.zone.dto.objects.TariffInfoGroupDefinition;
import defpackage.arv0;
import defpackage.b8r;
import defpackage.c4r0;
import defpackage.ck31;
import defpackage.evu0;
import defpackage.g580;
import defpackage.jl40;
import defpackage.kdr;
import defpackage.lmw0;
import defpackage.mi31;
import defpackage.nqx0;
import defpackage.pex0;
import defpackage.tje;
import defpackage.tse;
import defpackage.vij0;
import defpackage.vqv0;
import defpackage.w15;
import defpackage.wiq0;
import defpackage.za31;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class a {
    public final c4r0 a;
    public final ck31 b;
    public final arv0 c;
    public final b8r d;
    public final wiq0 e;
    public final vqv0 f;
    public final g580 g;
    public final w15 h;
    public final kdr i;
    public final tse j;

    public a(c4r0 c4r0Var, ck31 ck31Var, arv0 arv0Var, b8r b8rVar, wiq0 wiq0Var, vqv0 vqv0Var, g580 g580Var, w15 w15Var, kdr kdrVar, tse tseVar) {
        this.a = c4r0Var;
        this.b = ck31Var;
        this.c = arv0Var;
        this.d = b8rVar;
        this.e = wiq0Var;
        this.f = vqv0Var;
        this.g = g580Var;
        this.h = w15Var;
        this.i = kdrVar;
        this.j = tseVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static nqx0 b(mi31 mi31Var, String str, String str2) {
        Object obj;
        Object obj2;
        TariffInfoGroupDefinition tariffInfoGroupDefinition;
        Object obj3;
        TariffInfoGroupDefinition tariffInfoGroupDefinition2;
        if (mi31Var != null) {
            pex0 pex0Var = mi31Var.a;
            boolean J = evu0.J(str);
            List f = pex0Var.f();
            List list = pex0Var.f;
            Iterator it = f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (jl40.l(((lmw0) obj).getName(), str)) {
                    break;
                }
            }
            if (!(obj instanceof lmw0)) {
                obj = null;
            }
            lmw0 lmw0Var = (lmw0) obj;
            if (evu0.J(str2)) {
                if (!J) {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it2.next();
                        if (((TariffInfoGroupDefinition) obj2).b.contains(str)) {
                            break;
                        }
                    }
                    tariffInfoGroupDefinition = (TariffInfoGroupDefinition) obj2;
                    if (!J) {
                    }
                    return new nqx0(mi31Var, tariffInfoGroupDefinition, lmw0Var);
                }
                tariffInfoGroupDefinition = null;
                if (!J) {
                }
                return new nqx0(mi31Var, tariffInfoGroupDefinition, lmw0Var);
            }
            Iterator it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it3.next();
                if (jl40.l(((TariffInfoGroupDefinition) obj3).a, str2)) {
                    break;
                }
            }
            tariffInfoGroupDefinition = (TariffInfoGroupDefinition) obj3;
            if (tariffInfoGroupDefinition == null) {
                if (J) {
                    list = null;
                }
                if (list != null) {
                    Iterator it4 = list.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            tariffInfoGroupDefinition2 = 0;
                            break;
                        }
                        tariffInfoGroupDefinition2 = it4.next();
                        if (((TariffInfoGroupDefinition) tariffInfoGroupDefinition2).b.contains(str)) {
                            break;
                        }
                    }
                    tariffInfoGroupDefinition = tariffInfoGroupDefinition2;
                }
                tariffInfoGroupDefinition = null;
            }
            if ((!J || lmw0Var != null) && (!J || tariffInfoGroupDefinition != null)) {
                return new nqx0(mi31Var, tariffInfoGroupDefinition, lmw0Var);
            }
        }
        return null;
    }

    public final nqx0 a(String str, String str2, String str3) {
        List list;
        za31 e = this.d.e(str);
        ArrayList arrayList = (e == null || (list = e.b) == null) ? null : new ArrayList(list);
        List list2 = ((k) this.b).j().a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list2) {
            if (!((za31) obj).a.o) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            za31 za31Var = (za31) it.next();
            if (!jl40.l(za31Var.d, str)) {
                for (mi31 mi31Var : za31Var.b) {
                    if (arrayList != null) {
                        arrayList.add(mi31Var);
                    }
                }
            }
        }
        if (arrayList != null) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                nqx0 b = b((mi31) it2.next(), str2, str3);
                if (b != null) {
                    return b;
                }
            }
        }
        return null;
    }

    public final void c(vij0 vij0Var) {
        tje.N(this.j, null, null, new RequirementRedirectDeeplinkHandler$handleRequirementDeeplink$1(this, vij0Var, null), 3);
    }
}
