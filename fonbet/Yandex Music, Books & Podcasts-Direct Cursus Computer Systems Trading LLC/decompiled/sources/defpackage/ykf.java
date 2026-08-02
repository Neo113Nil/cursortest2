package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import com.yandex.music.shared.dto.album.AlbumDto;
import com.yandex.music.shared.dto.artist.ArtistDto;
import com.yandex.music.shared.dto.playlist.chart.ChartPositionInfoDto;
import com.yandex.pulse.metrics.o;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ru.yandex.music.R;
import ru.yandex.music.chart.catalog.data.dto.ChartAlbumDto;
import ru.yandex.music.data.stores.WebPath$Storage;
import ru.yandex.music.novelties.podcasts.catalog.data.PodcastsCategoryDto;
import ru.yandex.music.novelties.podcasts.catalog.data.dto.AlbumChartEntityDto;
import ru.yandex.music.novelties.podcasts.catalog.data.dto.AlbumPodcastsEntityDto;
import ru.yandex.music.novelties.podcasts.catalog.data.dto.ArtistEntityDto;
import ru.yandex.music.novelties.podcasts.catalog.data.dto.CategoryPodcastsEntityDto;

/* loaded from: classes3.dex */
public final /* synthetic */ class ykf implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ykf(j2g j2gVar) {
        this.a = 1;
        this.b = j2gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        kb5 kb5Var;
        String categoryId;
        ypt a;
        String textColor;
        fdm fdmVar;
        srl u61Var;
        c01 C;
        oq G;
        AlbumDto album;
        oq G2;
        ChartPositionInfoDto chartPosition;
        jf4 U;
        boolean z2 = false;
        r11 = false;
        boolean z3 = false;
        z2 = false;
        final int i = 1;
        switch (this.a) {
            case 0:
                zkf zkfVar = (zkf) this.b;
                String str = (String) obj;
                xgn xgnVar = (xgn) obj2;
                str.getClass();
                xgnVar.getClass();
                h4b h4bVar = zkfVar.m;
                if (h4bVar != null) {
                    h4bVar.U(str, xgnVar);
                }
                return Unit.a;
            case 1:
                vci vciVar = vci.a;
                j2g j2gVar = (j2g) this.b;
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                kjn kjnVar = gq5.a;
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    float f = 16;
                    yci t = d.t(a.o(vciVar, f, 0.0f, 2), 0.0f, 400, 1);
                    nho a2 = lho.a(qx0.a, b2c.k, oq5Var, 0);
                    int i2 = oq5Var.P;
                    androidx.compose.runtime.internal.a l = oq5Var.l();
                    yci H = vnj.H(oq5Var, t);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var.d0();
                    if (oq5Var.O) {
                        oq5Var.k(grbVar);
                    } else {
                        oq5Var.n0();
                    }
                    g0g.U(oq5Var, a2, wp5.f);
                    g0g.U(oq5Var, l, wp5.e);
                    kb5 kb5Var2 = wp5.g;
                    if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i2))) {
                        ouj.x(i2, oq5Var, i2, kb5Var2);
                    }
                    g0g.U(oq5Var, H, wp5.d);
                    ynn i3 = irv.i(oq5Var);
                    a3g a3gVar = (a3g) gld.M(j2gVar.c, oq5Var).getValue();
                    boolean h = oq5Var.h(j2gVar);
                    Object K = oq5Var.K();
                    if (h || K == kjnVar) {
                        pef pefVar = new pef(0, j2gVar, j2g.class, "onPlaylistClick", "onPlaylistClick()V", 0, 19);
                        oq5Var.k0(pefVar);
                        K = pefVar;
                    }
                    h9f h9fVar = (h9f) K;
                    boolean h2 = oq5Var.h(j2gVar);
                    Object K2 = oq5Var.K();
                    if (h2 || K2 == kjnVar) {
                        le0 le0Var = new le0(2, j2gVar, j2g.class, "onVisibilityPlaylistTileChanged", "onVisibilityPlaylistTileChanged(ZLjava/lang/String;)V", 0, 25);
                        oq5Var.k0(le0Var);
                        K2 = le0Var;
                    }
                    h9f h9fVar2 = (h9f) K2;
                    if (1.0f <= 0.0d) {
                        qme.a("invalid weight; must be greater than zero");
                    }
                    o2g.d(a3gVar, 2, (Function0) h9fVar, i3, (Function2) h9fVar2, androidx.compose.ui.platform.a.a(new LayoutWeightElement(true, 1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f), "playlist_tile"), oq5Var, 48);
                    u1g.l(oq5Var, d.r(vciVar, f));
                    a3g a3gVar2 = (a3g) gld.M(j2gVar.d, oq5Var).getValue();
                    boolean h3 = oq5Var.h(j2gVar);
                    Object K3 = oq5Var.K();
                    if (h3 || K3 == kjnVar) {
                        pef pefVar2 = new pef(0, j2gVar, j2g.class, "onHistoryClick", "onHistoryClick()V", 0, 20);
                        oq5Var.k0(pefVar2);
                        K3 = pefVar2;
                    }
                    h9f h9fVar3 = (h9f) K3;
                    boolean h4 = oq5Var.h(j2gVar);
                    Object K4 = oq5Var.K();
                    if (h4 || K4 == kjnVar) {
                        le0 le0Var2 = new le0(2, j2gVar, j2g.class, "onVisibilityHistoryTileChanged", "onVisibilityHistoryTileChanged(ZLjava/lang/String;)V", 0, 26);
                        oq5Var.k0(le0Var2);
                        K4 = le0Var2;
                    }
                    h9f h9fVar4 = (h9f) K4;
                    if (1.0f <= 0.0d) {
                        qme.a("invalid weight; must be greater than zero");
                    }
                    o2g.d(a3gVar2, 1, (Function0) h9fVar3, i3, (Function2) h9fVar4, androidx.compose.ui.platform.a.a(new LayoutWeightElement(true, 1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f), "history_tile"), oq5Var, 48);
                    oq5Var.p(true);
                } else {
                    oq5Var.S();
                }
                return Unit.a;
            case 2:
                a8g a8gVar = (a8g) this.b;
                wn5 wn5Var = quj.a;
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    hz2 hz2Var = b2c.l;
                    vci vciVar2 = vci.a;
                    yci n = a.n(vciVar2, 16, 8);
                    nho a3 = lho.a(qx0.a, hz2Var, oq5Var2, 48);
                    int i4 = oq5Var2.P;
                    androidx.compose.runtime.internal.a l2 = oq5Var2.l();
                    yci H2 = vnj.H(oq5Var2, n);
                    xp5.T.getClass();
                    grb grbVar2 = wp5.b;
                    oq5Var2.d0();
                    if (oq5Var2.O) {
                        oq5Var2.k(grbVar2);
                    } else {
                        oq5Var2.n0();
                    }
                    kb5 kb5Var3 = wp5.f;
                    g0g.U(oq5Var2, a3, kb5Var3);
                    kb5 kb5Var4 = wp5.e;
                    g0g.U(oq5Var2, l2, kb5Var4);
                    kb5 kb5Var5 = wp5.g;
                    if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i4))) {
                        ouj.x(i4, oq5Var2, i4, kb5Var5);
                    }
                    kb5 kb5Var6 = wp5.d;
                    g0g.U(oq5Var2, H2, kb5Var6);
                    String str2 = a8gVar.c;
                    if (str2 == null || StringsKt.U(str2)) {
                        oq5Var2.Z(1646994001);
                        oq5Var2.p(false);
                        z = true;
                    } else {
                        oq5Var2.Z(-1055248618);
                        z = ((Boolean) oq5Var2.j(koe.a)).booleanValue();
                        oq5Var2.p(false);
                    }
                    if (z) {
                        oq5Var2.Z(1647041380);
                        wn5Var.invoke(oq5Var2, 0);
                        oq5Var2.p(false);
                        kb5Var = kb5Var5;
                    } else {
                        oq5Var2.Z(1647121670);
                        kb5Var = kb5Var5;
                        p1g.a(a8gVar.c, null, androidx.compose.ui.platform.a.a(d.m(vciVar2, 52), "destination_icon"), null, null, b2c.c, hd6.g, 0.0f, null, 0, oq5Var2, 1769904, 920);
                        oq5Var2.p(false);
                    }
                    if (!(((double) 1.0f) > 0.0d)) {
                        qme.a("invalid weight; must be greater than zero");
                    }
                    yci n2 = a.n(new LayoutWeightElement(true, 1.0f), 12, 6);
                    ta5 a4 = sa5.a(qx0.c, b2c.n, oq5Var2, 0);
                    int i5 = oq5Var2.P;
                    androidx.compose.runtime.internal.a l3 = oq5Var2.l();
                    yci H3 = vnj.H(oq5Var2, n2);
                    oq5Var2.d0();
                    if (oq5Var2.O) {
                        oq5Var2.k(grbVar2);
                    } else {
                        oq5Var2.n0();
                    }
                    g0g.U(oq5Var2, a4, kb5Var3);
                    g0g.U(oq5Var2, l3, kb5Var4);
                    if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i5))) {
                        ouj.x(i5, oq5Var2, i5, kb5Var);
                    }
                    g0g.U(oq5Var2, H3, kb5Var6);
                    String str3 = a8gVar.a;
                    ges j = nu0.j();
                    agr agrVar = eq0.a;
                    xcs.b(str3, null, ((dq0) oq5Var2.j(agrVar)).b.a, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, j, oq5Var2, 0, 3120, 55290);
                    String str4 = a8gVar.b;
                    if (str4 == null || StringsKt.U(str4)) {
                        oq5Var2.Z(-290839863);
                    } else {
                        oq5Var2.Z(-287140354);
                        xcs.b(a8gVar.b, null, ((dq0) oq5Var2.j(agrVar)).b.b, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, nu0.i(), oq5Var2, 0, 3120, 55290);
                    }
                    oq5Var2.p(false);
                    oq5Var2.p(true);
                    gae.b(a0g.E(R.drawable.ic_link_default_24, 0, oq5Var2), null, androidx.compose.ui.platform.a.a(wyf.R(d.m(vciVar2, 24)), "link_icon"), ((dq0) oq5Var2.j(agrVar)).a.c, oq5Var2, 48, 0);
                    oq5Var2.p(true);
                } else {
                    oq5Var2.S();
                }
                return Unit.a;
            case 3:
                klg klgVar = (klg) this.b;
                cvl cvlVar = (cvl) obj;
                mqs mqsVar = (mqs) obj2;
                cvlVar.getClass();
                mqsVar.getClass();
                if (!cvlVar.d() || !Intrinsics.d(cvlVar.c.a, ((frt) klgVar.a.getValue()).c().a) || (!mqsVar.A && !a4g.D(gys.MyMusic, mqsVar))) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 4:
                xlg xlgVar = (xlg) this.b;
                cvl cvlVar2 = (cvl) obj;
                mqs mqsVar2 = (mqs) obj2;
                cvlVar2.getClass();
                mqsVar2.getClass();
                if (!cvlVar2.d() || !Intrinsics.d(cvlVar2.c.a, xlgVar.e.c().a) || (!mqsVar2.A && !a4g.D(gys.MyMusic, mqsVar2))) {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            case 5:
                ((Integer) obj2).getClass();
                s7g.a((r5h) this.b, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 6:
                ((Integer) obj2).getClass();
                zdg.e((l8i) this.b, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 7:
                w2u w2uVar = (w2u) this.b;
                hq5 hq5Var3 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var3 = (oq5) hq5Var3;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        return Unit.a;
                    }
                }
                oq5 oq5Var4 = (oq5) hq5Var3;
                boolean f2 = oq5Var4.f(w2uVar);
                Object K5 = oq5Var4.K();
                if (f2 || K5 == gq5.a) {
                    K5 = new rcq(w2uVar);
                    oq5Var4.k0(K5);
                }
                ivf.o((rcq) K5, w2uVar, vci.a, null, null, oq5Var4, 384, 24);
                return Unit.a;
            case 8:
                rhi rhiVar = (rhi) this.b;
                hq5 hq5Var4 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var5 = (oq5) hq5Var4;
                    if (oq5Var5.z()) {
                        oq5Var5.S();
                        return Unit.a;
                    }
                }
                vci vciVar3 = vci.a;
                yci d = d.d(vciVar3, 1.0f);
                ta5 a5 = sa5.a(qx0.c, b2c.n, hq5Var4, 0);
                oq5 oq5Var6 = (oq5) hq5Var4;
                int i6 = oq5Var6.P;
                androidx.compose.runtime.internal.a l4 = oq5Var6.l();
                yci H4 = vnj.H(hq5Var4, d);
                xp5.T.getClass();
                grb grbVar3 = wp5.b;
                oq5Var6.d0();
                if (oq5Var6.O) {
                    oq5Var6.k(grbVar3);
                } else {
                    oq5Var6.n0();
                }
                g0g.U(hq5Var4, a5, wp5.f);
                g0g.U(hq5Var4, l4, wp5.e);
                kb5 kb5Var7 = wp5.g;
                if (oq5Var6.O || !Intrinsics.d(oq5Var6.K(), Integer.valueOf(i6))) {
                    ouj.x(i6, oq5Var6, i6, kb5Var7);
                }
                g0g.U(hq5Var4, H4, wp5.d);
                String str5 = rhiVar.a;
                h6g h6gVar = nu0.a;
                h6g h6gVar2 = h6g.c;
                ges j2 = nu0.j();
                agr agrVar2 = eq0.a;
                oq5 oq5Var7 = (oq5) hq5Var4;
                xv7.j(str5, androidx.compose.ui.platform.a.a(d.d(vciVar3, 1.0f), "wave_list_item_title"), ((dq0) oq5Var7.j(agrVar2)).b.a, 0L, 0L, 0, 0L, 2, false, 2, 0, null, j2, hq5Var4, 48, 3120, 55288);
                String str6 = rhiVar.b;
                if (str6 == null || str6.length() == 0) {
                    oq5Var6.Z(-1871961779);
                } else {
                    oq5Var6.Z(-1868456206);
                    u1g.l(hq5Var4, d.e(vciVar3, mu0.a));
                    xv7.j(str6, androidx.compose.ui.platform.a.a(d.d(vciVar3, 1.0f), "wave_list_item_subtitle"), ((dq0) oq5Var7.j(agrVar2)).b.b, 0L, 0L, 0, 0L, 2, false, 1, 0, null, nu0.i(), hq5Var4, 48, 3120, 55288);
                }
                oq5Var6.p(false);
                oq5Var6.p(true);
                return Unit.a;
            case 9:
                ((Integer) obj2).getClass();
                int i7 = kii.p;
                ((kii) this.b).j(rvf.R(1), (hq5) obj);
                return Unit.a;
            case 10:
                rli rliVar = (rli) this.b;
                hq5 hq5Var5 = (hq5) obj;
                int intValue3 = ((Integer) obj2).intValue();
                oq5 oq5Var8 = (oq5) hq5Var5;
                if (oq5Var8.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    boolean h5 = oq5Var8.h(rliVar);
                    Object K6 = oq5Var8.K();
                    if (h5 || K6 == gq5.a) {
                        k5h k5hVar = new k5h(0, rliVar, rli.class, "onBackClick", "onBackClick()V", 0, 17);
                        oq5Var8.k0(k5hVar);
                        K6 = k5hVar;
                    }
                    zsd.g((Function0) ((h9f) K6), null, 0, 0L, 0, oq5Var8, 0, 30);
                } else {
                    oq5Var8.S();
                }
                return Unit.a;
            case 11:
                jz3 jz3Var = (jz3) this.b;
                hq5 hq5Var6 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var9 = (oq5) hq5Var6;
                    if (oq5Var9.z()) {
                        oq5Var9.S();
                        return Unit.a;
                    }
                }
                h1b.d.u(jz3Var, hq5Var6, 48);
                return Unit.a;
            case 12:
                tmb tmbVar = (tmb) this.b;
                drf drfVar = (drf) obj;
                j76 j76Var = (j76) obj2;
                drfVar.getClass();
                j76Var.getClass();
                g73 g73Var = new g73(drfVar.a(), new wn5(new m2g(18, j76Var, tmbVar), -1770832176, true));
                xdr xdrVar = j76Var.f;
                xdrVar.getClass();
                return new cyd(g73Var, xdrVar);
            case 13:
                ru ruVar = (ru) this.b;
                hq5 hq5Var7 = (hq5) obj;
                int intValue4 = ((Integer) obj2).intValue();
                oq5 oq5Var10 = (oq5) hq5Var7;
                if (oq5Var10.P(intValue4 & 1, (intValue4 & 3) != 2)) {
                    vci vciVar4 = vci.a;
                    yci d2 = d.d(vciVar4, 1.0f);
                    ta5 a6 = sa5.a(qx0.c, b2c.n, oq5Var10, 0);
                    int i8 = oq5Var10.P;
                    androidx.compose.runtime.internal.a l5 = oq5Var10.l();
                    yci H5 = vnj.H(oq5Var10, d2);
                    xp5.T.getClass();
                    grb grbVar4 = wp5.b;
                    oq5Var10.d0();
                    if (oq5Var10.O) {
                        oq5Var10.k(grbVar4);
                    } else {
                        oq5Var10.n0();
                    }
                    g0g.U(oq5Var10, a6, wp5.f);
                    g0g.U(oq5Var10, l5, wp5.e);
                    kb5 kb5Var8 = wp5.g;
                    if (oq5Var10.O || !Intrinsics.d(oq5Var10.K(), Integer.valueOf(i8))) {
                        ouj.x(i8, oq5Var10, i8, kb5Var8);
                    }
                    g0g.U(oq5Var10, H5, wp5.d);
                    jzb jzbVar = ruVar.e;
                    String str7 = ruVar.d;
                    String str8 = ruVar.c;
                    bg3.a(null, null, false, ild.C(443110509, new qt(ruVar, ox6.E(jzbVar, 0L, oq5Var10, 6), jzbVar != null, 9), oq5Var10), oq5Var10, 3072, 7);
                    u1g.l(oq5Var10, d.e(vciVar4, mu0.a));
                    StringBuilder sb = new StringBuilder();
                    if (str8 != null) {
                        sb.append(str8);
                    }
                    if (str8 != null && str7 != null) {
                        sb.append(" · ");
                    }
                    if (str7 != null) {
                        sb.append(str7);
                    }
                    xv7.j(sb.toString(), d.d(androidx.compose.ui.platform.a.a(vciVar4, "subtitle"), 1.0f), ((dq0) oq5Var10.j(eq0.a)).b.b, 0L, 0L, 0, 0L, 2, false, 1, 0, null, nu0.i(), oq5Var10, 48, 3120, 55288);
                    oq5Var10.p(true);
                } else {
                    oq5Var10.S();
                }
                return Unit.a;
            case 14:
                ryc rycVar = (ryc) this.b;
                int intValue5 = ((Integer) obj).intValue();
                oq oqVar = (oq) obj2;
                oqVar.getClass();
                return com.yandex.music.core.ui.compose.a.b(vci.a, null, 0L, 0.0f, null, new gva(rycVar, intValue5, oqVar), 15);
            case 15:
                ((Integer) obj2).getClass();
                cb0.d((orj) this.b, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 16:
                nvj nvjVar = (nvj) this.b;
                hq5 hq5Var8 = (hq5) obj;
                int intValue6 = ((Integer) obj2).intValue();
                oq5 oq5Var11 = (oq5) hq5Var8;
                if (oq5Var11.P(intValue6 & 1, (intValue6 & 3) != 2)) {
                    p6g.e((rvj) nvjVar.d, oq5Var11, 0);
                } else {
                    oq5Var11.S();
                }
                return Unit.a;
            case 17:
                ((Integer) obj2).getClass();
                p6g.a((dwj) this.b, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 18:
                nzj nzjVar = (nzj) this.b;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                String str9 = (String) obj2;
                str9.getClass();
                nzjVar.a(str9, booleanValue);
                return Unit.a;
            case 19:
                ((Integer) obj2).getClass();
                hag.d((wik) this.b, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 20:
                ((Integer) obj2).getClass();
                v5g.e((xan) this.b, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 21:
                final jdl jdlVar = (jdl) this.b;
                hq5 hq5Var9 = (hq5) obj;
                int intValue7 = ((Integer) obj2).intValue();
                ddl ddlVar = jdl.G;
                oq5 oq5Var12 = (oq5) hq5Var9;
                if (oq5Var12.P(intValue7 & 1, (intValue7 & 3) != 2)) {
                    Object K7 = oq5Var12.K();
                    kjn kjnVar2 = gq5.a;
                    if (K7 == kjnVar2) {
                        K7 = new vt4(jdlVar.B(), (jvo) jdlVar.q.getValue());
                        oq5Var12.k0(K7);
                    }
                    vt4 vt4Var = (vt4) K7;
                    Object K8 = oq5Var12.K();
                    if (K8 == kjnVar2) {
                        K8 = new xan((j4l) jdlVar.l.getValue(), (a9l) jdlVar.p.getValue());
                        oq5Var12.k0(K8);
                    }
                    xan xanVar = (xan) K8;
                    l18 l18Var = l18.b;
                    bdt I = hag.I(nke.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    qyf F = wyf.F(jdlVar.getLifecycle());
                    fle fleVar = (fle) jdlVar.v.getValue();
                    boolean h6 = oq5Var12.h(jdlVar);
                    Object K9 = oq5Var12.K();
                    if (h6 || K9 == kjnVar2) {
                        K9 = new Function1() { // from class: bdl
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                int i9 = i;
                                jdl jdlVar2 = jdlVar;
                                switch (i9) {
                                    case 0:
                                        int intValue8 = ((Integer) obj3).intValue();
                                        ddl ddlVar2 = jdl.G;
                                        jdlVar2.E(intValue8);
                                        break;
                                    default:
                                        r2f r2fVar = (r2f) obj3;
                                        ddl ddlVar3 = jdl.G;
                                        r2fVar.getClass();
                                        jdlVar2.w.d(jdl.H[0], r2fVar);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var12.k0(K9);
                    }
                    Function1 function1 = (Function1) K9;
                    boolean h7 = oq5Var12.h(jdlVar);
                    Object K10 = oq5Var12.K();
                    if (h7 || K10 == kjnVar2) {
                        final int i9 = false ? 1 : 0;
                        K10 = new Function1() { // from class: bdl
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                int i92 = i9;
                                jdl jdlVar2 = jdlVar;
                                switch (i92) {
                                    case 0:
                                        int intValue8 = ((Integer) obj3).intValue();
                                        ddl ddlVar2 = jdl.G;
                                        jdlVar2.E(intValue8);
                                        break;
                                    default:
                                        r2f r2fVar = (r2f) obj3;
                                        ddl ddlVar3 = jdl.G;
                                        r2fVar.getClass();
                                        jdlVar2.w.d(jdl.H[0], r2fVar);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var12.k0(K10);
                    }
                    Set set = fle.e;
                    dle b = nke.b(F, fleVar, function1, (Function1) K10, oq5Var12, 32832, 0);
                    xdr xdrVar2 = jdlVar.x;
                    kub kubVar = jdlVar.u;
                    if (kubVar == null) {
                        Intrinsics.j("expandedPlayerPresenter");
                        throw null;
                    }
                    boolean h8 = oq5Var12.h(jdlVar);
                    Object K11 = oq5Var12.K();
                    if (h8 || K11 == kjnVar2) {
                        K11 = new cdl(jdlVar, false ? 1 : 0);
                        oq5Var12.k0(K11);
                    }
                    Function0 function0 = (Function0) K11;
                    boolean h9 = oq5Var12.h(jdlVar);
                    Object K12 = oq5Var12.K();
                    if (h9 || K12 == kjnVar2) {
                        K12 = new cdl(jdlVar, i);
                        oq5Var12.k0(K12);
                    }
                    s7g.c(xdrVar2, kubVar, vt4Var, b, xanVar, function0, (Function0) K12, oq5Var12, 0);
                } else {
                    oq5Var12.S();
                }
                return Unit.a;
            case 22:
                til tilVar = (til) this.b;
                mqs mqsVar3 = (mqs) obj;
                mqsVar3.getClass();
                ((izs) obj2).getClass();
                new tao((mvp) tilVar.f.getValue(), pd.t(new qzm[0]), tilVar.b, tilVar.a, tilVar.c.a, 0).p(mqsVar3);
                return Unit.a;
            case 23:
                n4m n4mVar = (n4m) this.b;
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                String str10 = (String) obj2;
                str10.getClass();
                n4mVar.getClass();
                m4m m4mVar = n4mVar.a;
                cvl cvlVar3 = m4mVar.i;
                d70 d70Var = cvlVar3 != null ? new d70(cvlVar3.e(), c70.d, cvlVar3.b, 0, str10) : null;
                if (d70Var != null) {
                    m4mVar.f.h(d70Var, booleanValue2);
                }
                return Unit.a;
            case 24:
                ((Integer) obj2).getClass();
                c9g.k((aam) this.b, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 25:
                ((Integer) obj2).getClass();
                gdg.k((mam) this.b, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 26:
                gcm gcmVar = (gcm) this.b;
                ybm ybmVar = (ybm) obj;
                ybm ybmVar2 = (ybm) obj2;
                if (ybmVar2 == null || (ybmVar2 instanceof sbm)) {
                    if (ybmVar instanceof sbm) {
                        if (ybmVar2 == null) {
                            return Unit.a;
                        }
                    }
                    gcmVar.B.l(ybmVar);
                    return Unit.a;
                }
                ybmVar = ybmVar2;
                gcmVar.B.l(ybmVar);
                return Unit.a;
            case 27:
                n94 n94Var = (n94) this.b;
                int intValue8 = ((Integer) obj).intValue();
                CategoryPodcastsEntityDto categoryPodcastsEntityDto = (CategoryPodcastsEntityDto) obj2;
                categoryPodcastsEntityDto.getClass();
                PodcastsCategoryDto category = categoryPodcastsEntityDto.getCategory();
                if (category == null) {
                    return null;
                }
                String title = category.getTitle();
                if (title != null && (categoryId = category.getCategoryId()) != null) {
                    String voiceTitle = category.getVoiceTitle();
                    String urlScheme = category.getUrlScheme();
                    if (urlScheme != null && (a = fqt.a(urlScheme, true, false)) != null && (textColor = category.getTextColor()) != null) {
                        int D = y2x.D(textColor);
                        String backgroundCover = category.getBackgroundCover();
                        if (backgroundCover != null) {
                            WebPath$Storage webPath$Storage = WebPath$Storage.AVATARS;
                            webPath$Storage.getClass();
                            fdmVar = new fdm(title, categoryId, voiceTitle, a, D, etn.B(backgroundCover, webPath$Storage));
                            if (fdmVar != null) {
                                return null;
                            }
                            b2c b2cVar = i94.b;
                            String type = categoryPodcastsEntityDto.getType();
                            b2cVar.getClass();
                            i94 A = b2c.A(type);
                            if (A == null) {
                                return null;
                            }
                            return new o94(fdmVar, n94Var, intValue8, A);
                        }
                    }
                }
                fdmVar = null;
                if (fdmVar != null) {
                }
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                o4m o4mVar = (o4m) this.b;
                int intValue9 = ((Integer) obj).intValue();
                trl trlVar = (trl) obj2;
                trlVar.getClass();
                if (trlVar instanceof AlbumPodcastsEntityDto) {
                    AlbumPodcastsEntityDto albumPodcastsEntityDto = (AlbumPodcastsEntityDto) trlVar;
                    AlbumDto album2 = albumPodcastsEntityDto.getAlbum();
                    if (album2 != null && (G = ild.G(album2)) != null) {
                        b2c b2cVar2 = i94.b;
                        String type2 = albumPodcastsEntityDto.getType();
                        b2cVar2.getClass();
                        i94 A2 = b2c.A(type2);
                        if (A2 != null) {
                            u61Var = new lw(G, intValue9, A2);
                        }
                    }
                    u61Var = null;
                } else if (trlVar instanceof t4m) {
                    u61Var = avf.S((t4m) trlVar, intValue9);
                } else {
                    if (!(trlVar instanceof ArtistEntityDto)) {
                        b6e.s();
                        return null;
                    }
                    ArtistEntityDto artistEntityDto = (ArtistEntityDto) trlVar;
                    ArtistDto data = artistEntityDto.getData();
                    if (data != null && (C = lxe.C(data)) != null) {
                        b2c b2cVar3 = i94.b;
                        String type3 = artistEntityDto.getType();
                        b2cVar3.getClass();
                        i94 A3 = b2c.A(type3);
                        if (A3 != null) {
                            u61Var = new u61(C, intValue9, A3);
                        }
                    }
                    u61Var = null;
                }
                if (u61Var == null) {
                    return null;
                }
                u61Var.n0(o4mVar);
                return u61Var;
            default:
                w20 w20Var = (w20) this.b;
                int intValue10 = ((Integer) obj).intValue();
                AlbumChartEntityDto albumChartEntityDto = (AlbumChartEntityDto) obj2;
                albumChartEntityDto.getClass();
                ChartAlbumDto data2 = albumChartEntityDto.getData();
                if (data2 == null || (album = data2.getAlbum()) == null || (G2 = ild.G(album)) == null || (chartPosition = albumChartEntityDto.getData().getChartPosition()) == null || (U = i4w.U(chartPosition)) == null) {
                    return null;
                }
                re4 re4Var = new re4(G2, U);
                b2c b2cVar4 = i94.b;
                String type4 = albumChartEntityDto.getType();
                b2cVar4.getClass();
                i94 A4 = b2c.A(type4);
                if (A4 == null) {
                    return null;
                }
                return new ns(re4Var, w20Var, intValue10, A4);
        }
    }

    public /* synthetic */ ykf(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ ykf(Object obj, int i, int i2) {
        this.a = i2;
        this.b = obj;
    }
}
