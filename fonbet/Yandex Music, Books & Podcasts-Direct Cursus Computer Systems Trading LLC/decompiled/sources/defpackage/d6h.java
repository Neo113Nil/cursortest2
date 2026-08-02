package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import com.yandex.pulse.metrics.o;
import j$.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final /* synthetic */ class d6h implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ d6h(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str;
        String str2;
        boolean d;
        switch (this.a) {
            case 0:
                me5 me5Var = (me5) obj;
                pkl pklVar = (pkl) obj2;
                me5Var.getClass();
                pklVar.getClass();
                if (me5Var.equals(ke5.a)) {
                    break;
                } else if (me5Var instanceof le5) {
                    le5 le5Var = (le5) me5Var;
                    break;
                } else {
                    b6e.s();
                    break;
                }
            case 1:
                ((Integer) obj2).getClass();
                swf.g(rvf.R(1), (hq5) obj);
                break;
            case 2:
                ((Integer) obj).intValue();
                tf3 tf3Var = (tf3) obj2;
                int i = kii.p;
                tf3Var.getClass();
                break;
            case 3:
                Date date = (Date) obj;
                int intValue = ((Integer) obj2).intValue();
                date.getClass();
                LocalDate d2 = gkg.d(date);
                LocalDate d3 = gkg.d(new Date(System.currentTimeMillis()));
                if (gkg.b(d2, d3)) {
                    break;
                } else {
                    LocalDate minusDays = d3.minusDays(1L);
                    minusDays.getClass();
                    if (gkg.b(d2, minusDays)) {
                        break;
                    } else {
                        break;
                    }
                }
            case 4:
                xxq xxqVar = (xxq) obj;
                xxq xxqVar2 = (xxq) obj2;
                xxqVar.getClass();
                xxqVar2.getClass();
                break;
            case 5:
                m4j m4jVar = (m4j) obj;
                i5j i5jVar = (i5j) obj2;
                m4jVar.getClass();
                i5jVar.getClass();
                nrf nrfVar = m4jVar.a;
                g73 g73Var = new g73(nrfVar.a, nrfVar.b, new wn5(new m2g(21, i5jVar, m4jVar), 736839632, true), (cma) null, 24);
                xdr a = i5jVar.a();
                a.getClass();
                break;
            case 6:
                ((Integer) obj).getClass();
                b9j b9jVar = (b9j) obj2;
                b9jVar.getClass();
                break;
            case 7:
                ((Integer) obj).getClass();
                x9j x9jVar = (x9j) obj2;
                x9jVar.getClass();
                break;
            case 8:
                ((Integer) obj).getClass();
                eej eejVar = (eej) obj2;
                eejVar.getClass();
                break;
            case 9:
                ((Integer) obj2).getClass();
                szf.f(rvf.R(1), (hq5) obj);
                break;
            case 10:
                ((Integer) obj2).getClass();
                gut.b(rvf.R(1), (hq5) obj);
                break;
            case 11:
                dok dokVar = (dok) obj;
                dok dokVar2 = (dok) obj2;
                String str3 = dokVar.a;
                Date date2 = dokVar.b;
                String str4 = dokVar2.a;
                Date date3 = dokVar2.b;
                break;
            case 12:
                break;
            case 13:
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                nho a2 = lho.a(qx0.a, b2c.l, hq5Var, 48);
                oq5 oq5Var2 = (oq5) hq5Var;
                int i2 = oq5Var2.P;
                a l = oq5Var2.l();
                vci vciVar = vci.a;
                yci H = vnj.H(hq5Var, vciVar);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var2.d0();
                if (oq5Var2.O) {
                    oq5Var2.k(grbVar);
                } else {
                    oq5Var2.n0();
                }
                kb5 kb5Var = wp5.f;
                g0g.U(hq5Var, a2, kb5Var);
                kb5 kb5Var2 = wp5.e;
                g0g.U(hq5Var, l, kb5Var2);
                kb5 kb5Var3 = wp5.g;
                if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i2))) {
                    ouj.x(i2, oq5Var2, i2, kb5Var3);
                }
                kb5 kb5Var4 = wp5.d;
                g0g.U(hq5Var, H, kb5Var4);
                float f = 16;
                yci m = d.m(androidx.compose.foundation.layout.a.q(vciVar, f, 0.0f, 0.0f, 0.0f, 14), 24);
                kfh d4 = ug3.d(b2c.b, false);
                int i3 = oq5Var2.P;
                a l2 = oq5Var2.l();
                yci H2 = vnj.H(hq5Var, m);
                oq5Var2.d0();
                if (oq5Var2.O) {
                    oq5Var2.k(grbVar);
                } else {
                    oq5Var2.n0();
                }
                g0g.U(hq5Var, d4, kb5Var);
                g0g.U(hq5Var, l2, kb5Var2);
                if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i3))) {
                    ouj.x(i3, oq5Var2, i3, kb5Var3);
                }
                g0g.U(hq5Var, H2, kb5Var4);
                gae.b(a0g.E(R.drawable.ic_trash_24, 0, hq5Var), rvf.M(R.string.delete_button, hq5Var), null, ((dq0) ((oq5) hq5Var).j(eq0.a)).a.c, hq5Var, 0, 4);
                oq5Var2.p(true);
                float f2 = 12;
                ivf.k(0, 0, hq5Var, d.m(xp3.u(androidx.compose.foundation.layout.a.q(vciVar, f, f2, 0.0f, f2, 4), irf.R(qo6.a, hq5Var)), 52), true);
                oq5Var2.p(true);
                break;
            case 14:
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        break;
                    }
                }
                ta5 a3 = sa5.a(qx0.c, b2c.n, hq5Var2, 0);
                oq5 oq5Var4 = (oq5) hq5Var2;
                int i4 = oq5Var4.P;
                a l3 = oq5Var4.l();
                vci vciVar2 = vci.a;
                yci H3 = vnj.H(hq5Var2, vciVar2);
                xp5.T.getClass();
                grb grbVar2 = wp5.b;
                oq5Var4.d0();
                if (oq5Var4.O) {
                    oq5Var4.k(grbVar2);
                } else {
                    oq5Var4.n0();
                }
                g0g.U(hq5Var2, a3, wp5.f);
                g0g.U(hq5Var2, l3, wp5.e);
                kb5 kb5Var5 = wp5.g;
                if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i4))) {
                    ouj.x(i4, oq5Var4, i4, kb5Var5);
                }
                g0g.U(hq5Var2, H3, wp5.d);
                h6g h6gVar = nu0.a;
                h6g h6gVar2 = h6g.c;
                ivf.l(true, d.d(vciVar2, 0.7f), nu0.j(), hq5Var2, 48, 0);
                u1g.l(hq5Var2, d.e(vciVar2, mu0.a));
                ivf.l(true, d.d(vciVar2, 0.5f), nu0.i(), hq5Var2, 48, 0);
                oq5Var4.p(true);
                break;
            case 15:
                ((Integer) obj).getClass();
                ewl ewlVar = (ewl) obj2;
                ewlVar.getClass();
                break;
            case 16:
                int intValue2 = ((Integer) obj).intValue();
                ozl ozlVar = (ozl) obj2;
                ozlVar.getClass();
                if (ozlVar instanceof mzl) {
                    str = ((mzl) ozlVar).a().a;
                    str2 = "track(";
                } else if (!(ozlVar instanceof nzl)) {
                    b6e.s();
                    break;
                } else {
                    str = ((nzl) ozlVar).b.a;
                    str2 = "wave(";
                }
                break;
            case 17:
                rrl rrlVar = (rrl) obj;
                rrl rrlVar2 = (rrl) obj2;
                if (Intrinsics.d(rrlVar, rrlVar2)) {
                    List list = rrlVar != null ? rrlVar.c : null;
                    List list2 = rrlVar2 != null ? rrlVar2.c : null;
                    if (list == null || list2 == null) {
                        d = Intrinsics.d(list, list2);
                    } else {
                        if (list.size() == list2.size()) {
                            int size = list.size();
                            for (int i5 = 0; i5 < size; i5++) {
                                mqs mqsVar = (mqs) CollectionsKt.S(list, i5);
                                i1m i1mVar = mqsVar != null ? mqsVar.v : null;
                                mqs mqsVar2 = (mqs) CollectionsKt.S(list2, i5);
                                if (Intrinsics.d(i1mVar, mqsVar2 != null ? mqsVar2.v : null)) {
                                }
                            }
                            d = true;
                        }
                        d = false;
                    }
                    if (d) {
                        r8 = true;
                    }
                }
                break;
            case 18:
                ((Integer) obj).intValue();
                j1b j1bVar = (j1b) obj2;
                j1bVar.getClass();
                break;
            case 19:
                ((Integer) obj).intValue();
                d9j d9jVar = (d9j) obj2;
                d9jVar.getClass();
                break;
            case 20:
                ((Integer) obj2).getClass();
                y2n.b(rvf.R(1), (hq5) obj);
                break;
            case 21:
                List list3 = (List) obj;
                List list4 = (List) obj2;
                list3.getClass();
                list4.getClass();
                break;
            case 22:
                mwk mwkVar = (mwk) obj;
                mwk mwkVar2 = (mwk) obj2;
                mwkVar.getClass();
                mwkVar2.getClass();
                String b = mwkVar.b();
                String b2 = mwkVar2.b();
                AtomicInteger atomicInteger = rwk.b;
                break;
            case 23:
                e2o e2oVar = (e2o) obj2;
                ((goo) obj).getClass();
                e2oVar.getClass();
                break;
            case 24:
                break;
            case 25:
                um4 um4Var = (um4) obj2;
                ((qxs) obj).getClass();
                um4Var.getClass();
                um4Var.g("track_type", gys.MyMusic.a);
                break;
            case 26:
                um4 um4Var2 = (um4) obj2;
                ((qxs) obj).getClass();
                um4Var2.getClass();
                um4Var2.c("track_for_kids", true);
                um4 um4Var3 = new um4(pgp.b);
                um4Var3.c("liked", true);
                um4 um4Var4 = new um4(pgp.a);
                um4Var4.c("is_permanent", true);
                um4Var4.e("track_type", gys.MyMusicPodcastEpisodes.a);
                um4Var3.a(um4Var4);
                um4Var2.a(um4Var3);
                break;
            case 27:
                um4 um4Var5 = (um4) obj2;
                ((qxs) obj).getClass();
                um4Var5.getClass();
                um4Var5.g("track_type", gys.MyMusicWithKids.a);
                um4Var5.c("track_for_kids", false);
                um4Var5.c("is_permanent", true);
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                um4 um4Var6 = (um4) obj2;
                ((qxs) obj).getClass();
                um4Var6.getClass();
                um4Var6.e("track_type", gys.MyMusicPodcastEpisodes.a);
                um4Var6.c("liked", true);
                um4Var6.c("track_for_kids", false);
                break;
            default:
                um4 um4Var7 = (um4) obj2;
                ((qxs) obj).getClass();
                um4Var7.getClass();
                um4Var7.e("track_type", gys.MyMusicAudioBooksChapters.a);
                um4Var7.c("liked", true);
                um4Var7.c("track_for_kids", false);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ d6h(int i, int i2) {
        this.a = i2;
    }

    public /* synthetic */ d6h(int i, Object obj) {
        this.a = i;
    }
}
