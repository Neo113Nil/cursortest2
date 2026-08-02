package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.yandex.go.domain.interactor.c;
import com.yandex.go.navigator.domain.o;
import com.yandex.go.vault.data.e;
import com.yandex.go.yb.data.u;
import com.yandex.go.zone.repository.d;
import com.ybsdk.feature.main.internal.screens.userCards.UserCardsFragment;
import com.ybsdk.feature.stories.internal.screens.verticalstories.VerticalStoriesFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.a;

/* loaded from: classes14.dex */
public final class sk21 implements v7p {
    public final /* synthetic */ int a;
    public final Object b;
    public final xvf0 c;
    public final xvf0 d;

    public /* synthetic */ sk21(Object obj, xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = obj;
        this.c = xvf0Var;
        this.d = xvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.d;
        xvf0 xvf0Var2 = this.c;
        Object obj = this.b;
        switch (i) {
            case 0:
                rb00 rb00Var = (rb00) ((u2g) xvf0Var2).get();
                ((aos) xvf0Var).get();
                return new UserCardsFragment((ubq0) obj, rb00Var, null);
            case 1:
                return new fp21((ah00) ((xvf0) obj).get(), (j741) xvf0Var2.get(), (rz0) ((nb11) xvf0Var).get());
            case 2:
                return new c((fjb0) ((icg) obj).get(), (ru.yandex.taxi.widget.c) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 3:
                return new et21((o) ((xvf0) obj).get(), (par) ((b2g) xvf0Var2).get(), (tt2) ((b2g) xvf0Var).b.d);
            case 4:
                return new cjw0((kcz0) ((qx5) obj).get(), (Set) ((y2r0) xvf0Var2).get(), (Set) ((y2r0) xvf0Var).get());
            case 5:
                return new k331((zuj0) ((jcg) obj).get(), (d0m) xvf0Var2.get(), (i331) xvf0Var.get());
            case 6:
                return new e((tw11) obj, (po21) ((jcg) xvf0Var2).get(), (d) ((jcg) xvf0Var).get());
            case 7:
                rs2 rs2Var = (rs2) ((q1g) obj).get();
                u uVar = (u) ((d2g) xvf0Var2).get();
                ((q1g) xvf0Var).get();
                return new c1x0(rs2Var, uVar, msb1.E);
            case 8:
                return new eg31((zxs0) ((flx0) obj).get(), (mrx0) xvf0Var2.get(), (xc11) xvf0Var.get());
            case 9:
                return new VerticalStoriesFragment((rm31) ((hag) obj).get(), (sg31) ((n3w) xvf0Var2).a, (qg6) ((o9g) xvf0Var).get());
            case 10:
                return new mj31(0, (Context) ((n3w) obj).a, (gzh) xvf0Var2.get(), (wpy0) ((tw11) xvf0Var).get());
            case 11:
                return new c641((tse) ((xvf0) obj).get(), (m641) ((v4g) xvf0Var2).get(), (o2y0) xvf0Var.get());
            case 12:
                return new mj31(4, (j3h) ((rbg) obj).get(), (um41) ((rbg) xvf0Var2).get(), (nee0) ((kxb0) xvf0Var).get());
            case 13:
                hkh hkhVar = (hkh) xvf0Var2.get();
                Map map = (Map) xvf0Var.get();
                nr41 nr41Var = new nr41(3, (mj31) obj);
                i4u i4uVar = new i4u(new qdh());
                qq31 qq31Var = hkhVar.a;
                sae saeVar = new sae(29, new me1((SharedPreferences) qq31Var.invoke("xmail_exposed_flag_logs"), 1));
                List L0 = a.L0(a.M0(pfr.b.a.values()));
                ArrayList arrayList = new ArrayList();
                Iterator it = L0.iterator();
                while (it.hasNext()) {
                    arrayList.add(((xl2) it.next()).b);
                }
                return new sbh(new wjm(new nj51(arrayList), saeVar, nr41Var, i4uVar, 8), new uxd(map), new jdj(new me1((SharedPreferences) qq31Var.invoke("xmail_flags_dev_settings"), 1), i4uVar));
            default:
                return new de51((SharedPreferences) ((xvf0) obj).get(), (w3c) xvf0Var2.get(), (mj31) ((y101) xvf0Var).get());
        }
    }
}
