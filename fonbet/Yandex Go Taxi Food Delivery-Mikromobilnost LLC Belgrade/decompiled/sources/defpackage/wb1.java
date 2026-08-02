package defpackage;

import com.yandex.go.address.models.PlainAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.address.clarification.UpdateReason;
import ru.yandex.taxi.address.clarification.impl.repo.a;
import ru.yandex.taxi.persuggest.api.finalsuggest.Action;

/* loaded from: classes9.dex */
public final class wb1 {
    public final a a;
    public final h3y b;
    public final tb1 c;
    public final byb d;
    public final rv0 e;

    public wb1(a aVar, h3y h3yVar, tb1 tb1Var, byb bybVar, rv0 rv0Var) {
        this.a = aVar;
        this.b = h3yVar;
        this.c = tb1Var;
        this.d = bybVar;
        this.e = rv0Var;
    }

    public final void a(xtd0 xtd0Var) {
        List d = xtd0Var.getD();
        ArrayList arrayList = new ArrayList();
        for (Object obj : d) {
            if (obj instanceof gtd0) {
                arrayList.add(obj);
            }
        }
        gtd0 gtd0Var = (gtd0) kotlin.collections.a.R(arrayList);
        String a = gtd0Var != null ? gtd0Var.getA() : null;
        tb1 tb1Var = this.c;
        tb1Var.b = a;
        uy60 uy60Var = tb1Var.a;
        if (uy60Var != null) {
            uy60Var.a();
        }
    }

    public final ac1 b(String str) {
        Object obj;
        zzs zzsVar;
        g2t g2tVar = ((bc1) e.d(this.a.h).a.getValue()).e;
        if (g2tVar != null) {
            v6r v6rVar = g2tVar.a;
            List list = v6rVar.a.c;
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (jl40.l(str, ((ksw) obj).p)) {
                        break;
                    }
                }
                ksw kswVar = (ksw) obj;
                if (kswVar != null && (zzsVar = kswVar.d) != null) {
                    PlainAddress a = this.e.a(g2tVar, kswVar, v6rVar.b, null);
                    k56 k56Var = v6rVar.a.e;
                    return new ac1(a, zzsVar, k56Var != null ? k56Var.d : null, kswVar.b);
                }
            }
        }
        return null;
    }

    public final boolean c() {
        a aVar = this.a;
        boolean z = (jl40.l(e.d(aVar.h).a.getValue(), bc1.g) || ((Boolean) e.d(aVar.f).a.getValue()).booleanValue()) ? false : true;
        this.d.getClass();
        return z;
    }

    public final boolean d() {
        u6r u6rVar;
        k56 k56Var;
        mzb mzbVar = (mzb) this.b.get();
        v6r a = ((bc1) e.d(this.a.h).a.getValue()).a();
        String str = (a == null || (u6rVar = a.a) == null || (k56Var = u6rVar.e) == null) ? null : k56Var.e;
        if (str == null) {
            str = "";
        }
        return ((com.yandex.go.clarify_address.before_order.a) mzbVar).c(str);
    }

    public final void e(pv0 pv0Var) {
        if (pv0Var.a.getFinalSuggestAction() != Action.REDIRECT) {
            k();
            return;
        }
        this.a.d(pv0Var.b.d, pv0Var.a.c2());
    }

    public final void f(String str, UpdateReason updateReason) {
        a aVar = this.a;
        zzs b = ((bc1) e.d(aVar.h).a.getValue()).b();
        if (b == null) {
            return;
        }
        zb1 zb1Var = new zb1(b, str);
        if (jl40.l(aVar.l, zb1Var)) {
            return;
        }
        aVar.l = zb1Var;
        aVar.a(aVar.k, zb1Var, updateReason);
    }

    public final void g(xtd0 xtd0Var, UpdateReason updateReason) {
        List d = xtd0Var.getD();
        ArrayList arrayList = new ArrayList();
        for (Object obj : d) {
            if (obj instanceof ptd0) {
                arrayList.add(obj);
            }
        }
        ptd0 ptd0Var = (ptd0) kotlin.collections.a.R(arrayList);
        if (ptd0Var == null) {
            return;
        }
        l(ptd0Var.getA(), updateReason);
    }

    public final boolean h() {
        UpdateReason updateReason;
        return d() && c() && (updateReason = ((bc1) e.d(this.a.h).a.getValue()).b) != UpdateReason.UPDATE_PICKUP_POINT_BY_CLICK_IN_LIST && updateReason != UpdateReason.UPDATE_PICKUP_POINT_BY_MOVE_PIN_ON_MAP;
    }

    public final void i() {
        a aVar = this.a;
        if (((Boolean) e.d(aVar.f).a.getValue()).booleanValue()) {
            j((bc1) e.d(aVar.h).a.getValue());
        }
    }

    public final void j(bc1 bc1Var) {
        utd0 utd0Var = bc1Var.a.d;
        Object S = kotlin.collections.a.S(utd0Var.a, utd0Var.b);
        xtd0 xtd0Var = S instanceof xtd0 ? (xtd0) S : null;
        if (xtd0Var == null) {
            return;
        }
        g(xtd0Var, UpdateReason.UNKNOWN);
        a(xtd0Var);
    }

    public final boolean k() {
        a aVar = this.a;
        bc1 bc1Var = (bc1) e.d(aVar.h).a.getValue();
        zzs b = bc1Var.b();
        if (b == null || !aVar.m) {
            return false;
        }
        if (!aVar.n) {
            return aVar.c(new fp0(bc1Var, b));
        }
        aVar.n = false;
        return false;
    }

    public final void l(String str, UpdateReason updateReason) {
        ac1 b = b(str);
        if (b == null) {
            return;
        }
        String b2 = b.b();
        String a = b.a();
        a aVar = this.a;
        aVar.d(b2, a);
        if (((Boolean) e.d(aVar.f).a.getValue()).booleanValue()) {
            aVar.c(new ep0(b, updateReason != UpdateReason.UPDATE_PICKUP_POINT_BY_MOVE_PIN_ON_MAP));
            f(str, updateReason);
        }
    }
}
