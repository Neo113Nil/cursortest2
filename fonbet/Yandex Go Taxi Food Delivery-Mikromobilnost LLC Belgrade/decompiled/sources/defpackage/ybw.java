package defpackage;

import com.yandex.go.route.interactor.b;
import com.yandex.go.taxi.intercity.dashboard.impl.data.repository.a;
import com.yandex.go.taxi.intercity.dashboard.impl.domain.entity.IntercityDashboardNavigationTarget;
import com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.impl.j;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import kotlin.Pair;

/* loaded from: classes14.dex */
public final class ybw {
    public final acw a;
    public final reu b;
    public final j c;
    public final a d;

    public ybw(acw acwVar, reu reuVar, j jVar, a aVar) {
        this.a = acwVar;
        this.b = reuVar;
        this.c = jVar;
        this.d = aVar;
    }

    public final void a(IntercityDashboardNavigationTarget intercityDashboardNavigationTarget) {
        pex0 m;
        String str;
        String str2;
        String str3;
        if (jl40.l(this.c.b(), this.d.a().h)) {
            return;
        }
        acw acwVar = this.a;
        b bVar = acwVar.d;
        String a = acwVar.a();
        mcw mcwVar = null;
        if (a != null && (m = ((k) acwVar.c).m()) != null && (str = m.b) != null && (str2 = acwVar.b.a().h) != null) {
            Pair pair = new Pair("open_origin", a);
            Pair pair2 = new Pair("preorder_tariff", str);
            Pair pair3 = new Pair("displayed_tariff", str2);
            Pair pair4 = new Pair("route", kotlin.collections.a.X(bVar.c().a(), null, null, null, new xuv(15), 31));
            d0l0 c = bVar.c();
            zzk0 zzk0Var = d0l0.Companion;
            Pair pair5 = new Pair("raw_route", kotlin.collections.a.X(c.d(false, false), null, null, null, new xuv(14), 31));
            int i = zbw.a[intercityDashboardNavigationTarget.ordinal()];
            if (i == 1) {
                str3 = "flex";
            } else if (i == 2) {
                str3 = "due_timetable";
            } else if (i == 3) {
                str3 = "summary";
            } else if (i == 4) {
                str3 = "discovery";
            } else {
                if (i != 5) {
                    w511.b();
                    return;
                }
                str3 = "suggest";
            }
            mcwVar = new mcw("IntercityError.IntercityMain.NavigateWithInvalidTariff", kotlin.collections.b.i(pair, pair2, pair3, pair4, pair5, new Pair("navigation", str3)));
        }
        if (mcwVar == null) {
            return;
        }
        this.b.E(mcwVar);
    }
}
