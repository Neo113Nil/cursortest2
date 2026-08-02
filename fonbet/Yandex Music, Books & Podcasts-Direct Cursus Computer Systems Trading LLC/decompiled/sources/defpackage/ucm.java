package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.ui.platform.ComposeView;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.yandex.music.screen.landing.api.skeleton.SkeletonListView;
import com.yandex.music.shared.dto.PromotionDto;
import com.yandex.music.shared.dto.playlist.chart.ChartPositionInfoDto;
import com.yandex.music.shared.dto.playlist.chart.ChartTrackDto;
import com.yandex.music.shared.dto.track.TrackDto;
import com.yandex.music.shared.dto.wave.recommendation.IconDto;
import com.yandex.music.shared.dto.wave.recommendation.StationIdDto;
import com.yandex.music.shared.dto.wave.recommendation.StationMetaDto;
import com.yandex.music.shared.dto.wave.recommendation.StationWithSettingsDto;
import com.yandex.pulse.metrics.o;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.data.stores.WebPath$Storage;
import ru.yandex.music.data.wave.recommendations.Icon;
import ru.yandex.music.data.wave.recommendations.StationId;
import ru.yandex.music.novelties.podcasts.catalog.data.dto.MenuItemEntityAliasDto;
import ru.yandex.music.novelties.podcasts.catalog.data.dto.MenuItemEntityDataAliasDto;
import ru.yandex.music.novelties.podcasts.catalog.data.dto.PromotionPodcastsEntityDto;
import ru.yandex.music.novelties.podcasts.catalog.data.dto.StationEntityDto;
import ru.yandex.music.novelties.podcasts.catalog.data.dto.TrackChartEntityDto;
import ru.yandex.music.radio.store.RadioMenuDefaultDto;
import ru.yandex.music.radio.store.RadioMenuDescriptorDto;
import ru.yandex.music.radio.store.RadioMenuStationDto;

/* loaded from: classes6.dex */
public final /* synthetic */ class ucm implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ucm(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:210:0x054c, code lost:
    
        if (r4 == null) goto L203;
     */
    /* JADX WARN: Removed duplicated region for block: B:210:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0974  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0a64  */
    /* JADX WARN: Type inference failed for: r4v18, types: [arf, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        dgr dgrVar;
        StationWithSettingsDto stationWithSettings;
        IconDto icon;
        StationIdDto id;
        String urlScheme;
        ypt a;
        gem gemVar;
        TrackDto track;
        mqs a2;
        ChartPositionInfoDto chart;
        jf4 U;
        oxh oxhVar;
        MenuItemEntityDataAliasDto data;
        String title;
        String title2;
        Object obj3;
        qwn qwnVar;
        long j;
        vci vciVar;
        yci yciVar;
        long j2;
        int i;
        int i2;
        long j3;
        long j4;
        int i3 = this.a;
        kjn kjnVar = gq5.a;
        r2f r2fVar = null;
        Object obj4 = this.b;
        switch (i3) {
            case 0:
                ifn ifnVar = (ifn) obj4;
                int intValue = ((Integer) obj).intValue();
                StationEntityDto stationEntityDto = (StationEntityDto) obj2;
                stationEntityDto.getClass();
                RadioMenuDescriptorDto data2 = stationEntityDto.getData();
                if (data2 != null) {
                    if (data2.getStationId() != null && data2.getData() != null) {
                        StationId T = asq.T(data2.getStationId());
                        if (T.g()) {
                            vfn data3 = data2.getData();
                            data3.getClass();
                            String title3 = ((RadioMenuDefaultDto) data2.getData()).getTitle();
                            if (title3 != null) {
                                String backgroundColor = ((RadioMenuDefaultDto) data2.getData()).getBackgroundColor();
                                if (backgroundColor != null) {
                                    new Icon("", backgroundColor);
                                } else {
                                    Icon icon2 = Icon.a;
                                }
                                dgrVar = new dgr(T, t75.c(T.toString()), title3, "");
                                if (dgrVar != null) {
                                    b2c b2cVar = i94.b;
                                    String type = stationEntityDto.getType();
                                    b2cVar.getClass();
                                    i94 A = b2c.A(type);
                                    if (A != null) {
                                        return new fgr(dgrVar, ifnVar, intValue, A);
                                    }
                                }
                            }
                        } else {
                            vfn data4 = data2.getData();
                            RadioMenuStationDto radioMenuStationDto = data4 instanceof RadioMenuStationDto ? (RadioMenuStationDto) data4 : null;
                            if (radioMenuStationDto != null && (stationWithSettings = radioMenuStationDto.getStationWithSettings()) != null) {
                                StationMetaDto stationMeta = stationWithSettings.getStationMeta();
                                StationId T2 = (stationMeta == null || (id = stationMeta.getId()) == null) ? StationId.a : asq.T(id);
                                List c = t75.c(T2.toString());
                                StationMetaDto stationMeta2 = stationWithSettings.getStationMeta();
                                String name = stationMeta2 != null ? stationMeta2.getName() : null;
                                if (name == null) {
                                    name = "";
                                }
                                StationMetaDto stationMeta3 = stationWithSettings.getStationMeta();
                                if (stationMeta3 == null || (icon = stationMeta3.getIcon()) == null) {
                                    Icon icon3 = Icon.a;
                                } else {
                                    vwb.a0(icon);
                                }
                                StationMetaDto stationMeta4 = stationWithSettings.getStationMeta();
                                String idForFrom = stationMeta4 != null ? stationMeta4.getIdForFrom() : null;
                                dgrVar = new dgr(T2, c, name, idForFrom != null ? idForFrom : "");
                                if (dgrVar != null) {
                                }
                            }
                        }
                    }
                    dgrVar = null;
                    if (dgrVar != null) {
                    }
                }
                return null;
            case 1:
                sxm sxmVar = (sxm) obj4;
                int intValue2 = ((Integer) obj).intValue();
                PromotionPodcastsEntityDto promotionPodcastsEntityDto = (PromotionPodcastsEntityDto) obj2;
                promotionPodcastsEntityDto.getClass();
                PromotionDto promotion = promotionPodcastsEntityDto.getPromotion();
                if (promotion != null) {
                    String title4 = promotion.getTitle();
                    String promoId = promotion.getPromoId();
                    if (promoId != null && (urlScheme = promotion.getUrlScheme()) != null && (a = fqt.a(urlScheme, true, false)) != null) {
                        String subtitle = promotion.getSubtitle();
                        String heading = promotion.getHeading();
                        String imageUrl = promotion.getImageUrl();
                        if (imageUrl != null) {
                            gemVar = new gem(title4, promoId, a, subtitle, heading, new jcv(imageUrl, WebPath$Storage.AVATARS_69));
                            if (gemVar != null) {
                                b2c b2cVar2 = i94.b;
                                String type2 = promotionPodcastsEntityDto.getType();
                                b2cVar2.getClass();
                                i94 A2 = b2c.A(type2);
                                if (A2 != null) {
                                    return new rxm(gemVar, sxmVar, intValue2, A2);
                                }
                            }
                        }
                    }
                    gemVar = null;
                    if (gemVar != null) {
                    }
                }
                return null;
            case 2:
                t3t t3tVar = (t3t) obj4;
                int intValue3 = ((Integer) obj).intValue();
                TrackChartEntityDto trackChartEntityDto = (TrackChartEntityDto) obj2;
                trackChartEntityDto.getClass();
                ChartTrackDto data5 = trackChartEntityDto.getData();
                if (data5 != null && (track = data5.getTrack()) != null && (a2 = wts.a(track)) != null && (chart = trackChartEntityDto.getData().getChart()) != null && (U = i4w.U(chart)) != null) {
                    sf4 sf4Var = new sf4(a2, U);
                    b2c b2cVar3 = i94.b;
                    String type3 = trackChartEntityDto.getType();
                    b2cVar3.getClass();
                    i94 A3 = b2c.A(type3);
                    if (A3 != null) {
                        return new wss(sf4Var, t3tVar, intValue3, A3);
                    }
                }
                return null;
            case 3:
                exh exhVar = (exh) obj4;
                int intValue4 = ((Integer) obj).intValue();
                MenuItemEntityAliasDto menuItemEntityAliasDto = (MenuItemEntityAliasDto) obj2;
                menuItemEntityAliasDto.getClass();
                String type4 = menuItemEntityAliasDto.getType();
                if (Intrinsics.d(type4, "menu-item-playlist")) {
                    MenuItemEntityDataAliasDto data6 = menuItemEntityAliasDto.getData();
                    if (data6 != null && (title2 = data6.getTitle()) != null) {
                        qxh qxhVar = new qxh(R.drawable.ic_playlist_24);
                        nxh nxhVar = nxh.a;
                        b2c b2cVar4 = i94.b;
                        String type5 = menuItemEntityAliasDto.getType();
                        b2cVar4.getClass();
                        i94 A4 = b2c.A(type5);
                        if (A4 != null) {
                            oxhVar = new oxh(title2, qxhVar, nxhVar, exhVar, intValue4, A4, menuItemEntityAliasDto.getData().getBlockEntityDataId());
                            return oxhVar;
                        }
                    }
                    return null;
                }
                if (Intrinsics.d(type4, "menu-item-album") && (data = menuItemEntityAliasDto.getData()) != null && (title = data.getTitle()) != null) {
                    qxh qxhVar2 = new qxh(R.drawable.ic_album_24);
                    nxh nxhVar2 = nxh.b;
                    b2c b2cVar5 = i94.b;
                    String type6 = menuItemEntityAliasDto.getType();
                    b2cVar5.getClass();
                    i94 A5 = b2c.A(type6);
                    if (A5 != null) {
                        oxhVar = new oxh(title, qxhVar2, nxhVar2, exhVar, intValue4, A5, menuItemEntityAliasDto.getData().getBlockEntityDataId());
                        return oxhVar;
                    }
                }
                return null;
            case 4:
                ((Integer) obj2).getClass();
                ivf.m((sem) obj4, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 5:
                ixm ixmVar = (ixm) obj4;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                String str = (String) obj2;
                str.getClass();
                ixmVar.getClass();
                weo.H(ixmVar.a.b, ixmVar.c.d, booleanValue, str, null);
                return Unit.a;
            case 6:
                ((Integer) obj2).getClass();
                y2n.c((t1f) obj4, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 7:
                ((Integer) obj2).getClass();
                y2n.a((xgk) obj4, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 8:
                c4n c4nVar = (c4n) obj4;
                hq5 hq5Var = (hq5) obj;
                int intValue5 = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue5 & 1, (intValue5 & 3) != 2)) {
                    e4n e4nVar = c4nVar.l;
                    if (e4nVar == null) {
                        Intrinsics.j("purchaseTicketPresenter");
                        throw null;
                    }
                    g0g.i(e4nVar, oq5Var, 0);
                } else {
                    oq5Var.S();
                }
                return Unit.a;
            case 9:
                n3m n3mVar = (n3m) obj4;
                x5n x5nVar = (x5n) n3mVar.c;
                hq5 hq5Var2 = (hq5) obj;
                int intValue6 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue6 & 1, (intValue6 & 3) != 2)) {
                    Object K = oq5Var2.K();
                    if (K == kjnVar) {
                        a6n a6nVar = (a6n) n3mVar.b;
                        K = new y5n(x5nVar, new n6n(new vtm(a6nVar), a6nVar.b.a()));
                        oq5Var2.k0(K);
                    }
                    o2g.j((y5n) K, false, oq5Var2, 48);
                    boolean h = oq5Var2.h(x5nVar);
                    Object K2 = oq5Var2.K();
                    if (h || K2 == kjnVar) {
                        ebm ebmVar = new ebm(0, x5nVar, w5n.class, "onClose", "onClose()V", 0, 24);
                        oq5Var2.k0(ebmVar);
                        K2 = ebmVar;
                    }
                    wyf.c(null, null, null, null, (Function0) ((h9f) K2), oq5Var2, 0, 31);
                } else {
                    oq5Var2.S();
                }
                return Unit.a;
            case 10:
                ((Integer) obj2).getClass();
                v3g.b((wya) obj4, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 11:
                ((Integer) obj2).getClass();
                q5g.g((t5n) obj4, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 12:
                g8n g8nVar = (g8n) obj4;
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                String str2 = (String) obj2;
                str2.getClass();
                q43 q43Var = g8nVar.e;
                b8n b8nVar = g8nVar.d;
                String str3 = b8nVar.a.a;
                c70 c70Var = c70.f;
                String str4 = b8nVar.d;
                q43Var.h(new d70(str3, c70Var, str4 != null ? str4 : "", 0, str2), booleanValue2);
                return Unit.a;
            case 13:
                msj msjVar = (msj) obj4;
                hq5 hq5Var3 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var3 = (oq5) hq5Var3;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        return Unit.a;
                    }
                }
                oq5 oq5Var4 = (oq5) hq5Var3;
                boolean f = oq5Var4.f(msjVar);
                Object K3 = oq5Var4.K();
                if (f || K3 == kjnVar) {
                    K3 = new yrm(R.drawable.ic_rename_24, R.string.dialog_action_rename, "dialog_action_rename", msjVar);
                    oq5Var4.k0(K3);
                }
                ivf.o((yrm) K3, msjVar, null, null, null, oq5Var4, 0, 28);
                return Unit.a;
            case 14:
                rwn rwnVar = (rwn) obj4;
                jpa jpaVar = (jpa) obj;
                xod xodVar = (xod) obj2;
                jpaVar.getClass();
                xodVar.getClass();
                htd htdVar = rwnVar.a;
                if (rwnVar.b == null || (htdVar.q & 104179) != 0) {
                    float a3 = itd.a(htdVar);
                    float b = itd.b(htdVar);
                    if (Float.isNaN(b)) {
                        b = 0;
                    }
                    float f2 = b * a3;
                    float f3 = htdVar.C;
                    if (0.0f > f3 || f3 > 1.0f) {
                        f3 = htdVar.u.d;
                    }
                    if (0.0f > f3 || f3 > 1.0f) {
                        f3 = htdVar.t.d;
                    }
                    float f4 = f3;
                    List c2 = itd.c(htdVar);
                    long f5 = nmq.f(a3, htdVar.y);
                    long i4 = enj.i(a3, htdVar.A);
                    o6g o6gVar = htdVar.D;
                    c2.getClass();
                    twn twnVar = new twn(f2, f4, c2, ywf.d(i4, f5), o6gVar);
                    ?? r4 = itd.a;
                    pp3 pp3Var = (pp3) ((ajq) r4.getValue()).b.get(twnVar);
                    if (pp3Var != null) {
                        pp3Var.b = System.currentTimeMillis();
                        obj3 = pp3Var.a;
                    } else {
                        obj3 = null;
                    }
                    qwn qwnVar2 = (qwn) obj3;
                    if (qwnVar2 == null) {
                        qwnVar2 = uwn.b(htdVar, twnVar);
                        if (qwnVar2 != null) {
                            ((ajq) r4.getValue()).a(twnVar, qwnVar2);
                        } else {
                            qwnVar = null;
                            rwnVar.b = qwnVar;
                        }
                    }
                    qwnVar = qwnVar2;
                    rwnVar.b = qwnVar;
                }
                qwn qwnVar3 = rwnVar.b;
                yod yodVar = xodVar.a;
                if (!Intrinsics.d(yodVar.a(), qwnVar3)) {
                    yodVar.e(qwnVar3);
                }
                xodVar.h(htdVar.H);
                yd5.s(jpaVar, xodVar);
                return Unit.a;
            case 15:
                String str5 = (String) obj;
                xgn xgnVar = (xgn) obj2;
                str5.getClass();
                xgnVar.getClass();
                ((ykf) obj4).invoke(str5, xgnVar);
                return Unit.a;
            case 16:
                int intValue7 = ((Integer) obj).intValue();
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                f key = element.getKey();
                CoroutineContext.Element element2 = ((xmo) obj4).k.get(key);
                if (key != o6c.l) {
                    if (element != element2) {
                        intValue7 = Integer.MIN_VALUE;
                    }
                    intValue7++;
                } else {
                    r2f r2fVar2 = (r2f) element2;
                    r2f r2fVar3 = (r2f) element;
                    while (r2fVar3 != null) {
                        if (r2fVar3 != r2fVar2 && (r2fVar3 instanceof huo)) {
                            hj4 hj4Var = (hj4) h3f.b.get((huo) r2fVar3);
                            r2fVar3 = hj4Var != null ? hj4Var.getParent() : null;
                        } else {
                            r2fVar = r2fVar3;
                            if (r2fVar == r2fVar2) {
                                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + r2fVar + ", expected child of " + r2fVar2 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                            }
                        }
                    }
                    if (r2fVar == r2fVar2) {
                    }
                }
                return Integer.valueOf(intValue7);
            case 17:
                m7n m7nVar = (m7n) obj4;
                boolean booleanValue3 = ((Boolean) obj).booleanValue();
                String str6 = (String) obj2;
                str6.getClass();
                m7nVar.getClass();
                m7nVar.k = booleanValue3;
                if (booleanValue3) {
                    p7p p7pVar = m7nVar.l;
                    if (p7pVar != null) {
                        m7nVar.m = p7pVar;
                        m7nVar.e.invoke(p7pVar, str6);
                    }
                } else {
                    p7p p7pVar2 = m7nVar.m;
                    if (p7pVar2 != null) {
                        m7nVar.m = null;
                        m7nVar.f.invoke(p7pVar2);
                    }
                }
                return Unit.a;
            case 18:
                i7n i7nVar = (i7n) obj4;
                hq5 hq5Var4 = (hq5) obj;
                int intValue8 = ((Integer) obj2).intValue();
                oq5 oq5Var5 = (oq5) hq5Var4;
                if (oq5Var5.P(intValue8 & 1, (intValue8 & 3) != 2)) {
                    orl.a(0, 2, ((ma5) oq5Var5.j(pa5.a)).d(), oq5Var5, null, i7nVar.e);
                } else {
                    oq5Var5.S();
                }
                return Unit.a;
            case 19:
                ((Integer) obj2).getClass();
                szf.n((mpp) obj4, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 20:
                ctp ctpVar = (ctp) obj4;
                hq5 hq5Var5 = (hq5) obj;
                int intValue9 = ((Integer) obj2).intValue();
                oq5 oq5Var6 = (oq5) hq5Var5;
                if (oq5Var6.P(intValue9 & 1, (intValue9 & 3) != 2)) {
                    qpl qplVar = ((atp) ctpVar).a;
                    if (qplVar instanceof opl) {
                        oq5Var6.Z(102296281);
                        j = ((dq0) oq5Var6.j(eq0.a)).a.a;
                        oq5Var6.p(false);
                    } else {
                        if (!Intrinsics.d(qplVar, ppl.a)) {
                            throw vz1.i(oq5Var6, 102293177, false);
                        }
                        oq5Var6.Z(102298619);
                        j = ((dq0) oq5Var6.j(eq0.a)).a.c;
                        oq5Var6.p(false);
                    }
                    long j5 = j;
                    gz2 gz2Var = b2c.o;
                    boolean z = ctpVar instanceof atp;
                    atp atpVar = z ? (atp) ctpVar : null;
                    qpl qplVar2 = atpVar != null ? atpVar.a : null;
                    opl oplVar = qplVar2 instanceof opl ? (opl) qplVar2 : null;
                    vci vciVar2 = vci.a;
                    if (oplVar != null) {
                        yciVar = a.q(vciVar2, 0.0f, 12, 0.0f, 0.0f, 13);
                        vciVar = vciVar2;
                    } else {
                        vciVar = vciVar2;
                        yciVar = vciVar;
                    }
                    ta5 a4 = sa5.a(qx0.c, gz2Var, oq5Var6, 48);
                    int i5 = oq5Var6.P;
                    androidx.compose.runtime.internal.a l = oq5Var6.l();
                    yci H = vnj.H(oq5Var6, yciVar);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var6.d0();
                    if (oq5Var6.O) {
                        oq5Var6.k(grbVar);
                    } else {
                        oq5Var6.n0();
                    }
                    g0g.U(oq5Var6, a4, wp5.f);
                    g0g.U(oq5Var6, l, wp5.e);
                    kb5 kb5Var = wp5.g;
                    if (oq5Var6.O || !Intrinsics.d(oq5Var6.K(), Integer.valueOf(i5))) {
                        ouj.x(i5, oq5Var6, i5, kb5Var);
                    }
                    g0g.U(oq5Var6, H, wp5.d);
                    gae.b(a0g.E(R.drawable.ic_timer_24, 0, oq5Var6), null, null, j5, oq5Var6, 48, 4);
                    atp atpVar2 = z ? (atp) ctpVar : null;
                    qpl qplVar3 = atpVar2 != null ? atpVar2.a : null;
                    opl oplVar2 = qplVar3 instanceof opl ? (opl) qplVar3 : null;
                    if (oplVar2 == null) {
                        oq5Var6.Z(656425461);
                    } else {
                        long j6 = oplVar2.a;
                        oq5Var6.Z(656425462);
                        xcs.b(lxe.K(j6), ksw.D(androidx.compose.ui.platform.a.a(vciVar, "timer_text"), saf.q0(j6), null), ((dq0) oq5Var6.j(eq0.a)).a.a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.i(), oq5Var6, 0, 0, 65528);
                    }
                    oq5Var6.p(false);
                    oq5Var6.p(true);
                } else {
                    oq5Var6.S();
                }
                return Unit.a;
            case 21:
                qsp qspVar = (qsp) obj4;
                hq5 hq5Var6 = (hq5) obj;
                int intValue10 = ((Integer) obj2).intValue();
                oq5 oq5Var7 = (oq5) hq5Var6;
                if (oq5Var7.P(intValue10 & 1, (intValue10 & 3) != 2)) {
                    xgl xglVar = ((osp) qspVar).a;
                    int ordinal = xglVar.ordinal();
                    if (ordinal == 0) {
                        oq5Var7.Z(2052252211);
                        j2 = ((dq0) oq5Var7.j(eq0.a)).a.c;
                        oq5Var7.p(false);
                    } else if (ordinal == 1) {
                        oq5Var7.Z(2052254833);
                        j2 = ((dq0) oq5Var7.j(eq0.a)).a.a;
                        oq5Var7.p(false);
                    } else if (ordinal == 2) {
                        oq5Var7.Z(2052257137);
                        j2 = ((dq0) oq5Var7.j(eq0.a)).a.a;
                        oq5Var7.p(false);
                    } else {
                        if (ordinal != 3) {
                            throw vz1.i(oq5Var7, 2052249352, false);
                        }
                        oq5Var7.Z(2052259537);
                        j2 = ((dq0) oq5Var7.j(eq0.a)).a.a;
                        oq5Var7.p(false);
                    }
                    long j7 = j2;
                    int ordinal2 = xglVar.ordinal();
                    if (ordinal2 == 0) {
                        i = R.drawable.ic_playback_speed_1_40;
                    } else if (ordinal2 == 1) {
                        i = R.drawable.ic_playback_speed_1_25_40;
                    } else if (ordinal2 == 2) {
                        i = R.drawable.ic_playback_speed_1_5_40;
                    } else {
                        if (ordinal2 != 3) {
                            b6e.s();
                            return null;
                        }
                        i = R.drawable.ic_playback_speed_2_40;
                    }
                    gae.b(a0g.E(i, 0, oq5Var7), null, null, j7, oq5Var7, 48, 4);
                } else {
                    oq5Var7.S();
                }
                return Unit.a;
            case 22:
                wsp wspVar = (wsp) obj4;
                hq5 hq5Var7 = (hq5) obj;
                int intValue11 = ((Integer) obj2).intValue();
                oq5 oq5Var8 = (oq5) hq5Var7;
                if (oq5Var8.P(intValue11 & 1, (intValue11 & 3) != 2)) {
                    nyn nynVar = ((usp) wspVar).a;
                    int ordinal3 = nynVar.ordinal();
                    if (ordinal3 == 0) {
                        i2 = R.drawable.ic_repeat_default_40;
                    } else if (ordinal3 == 1) {
                        i2 = R.drawable.ic_repeat_active_1_40;
                    } else {
                        if (ordinal3 != 2) {
                            b6e.s();
                            return null;
                        }
                        i2 = R.drawable.ic_repeat_active_40;
                    }
                    if (nynVar == nyn.a) {
                        oq5Var8.Z(551397496);
                        j3 = ((dq0) oq5Var8.j(eq0.a)).a.c;
                        oq5Var8.p(false);
                    } else {
                        oq5Var8.Z(551463898);
                        j3 = ((dq0) oq5Var8.j(eq0.a)).a.a;
                        oq5Var8.p(false);
                    }
                    gae.b(a0g.E(i2, 0, oq5Var8), null, null, j3, oq5Var8, 48, 4);
                } else {
                    oq5Var8.S();
                }
                return Unit.a;
            case 23:
                zsp zspVar = (zsp) obj4;
                hq5 hq5Var8 = (hq5) obj;
                int intValue12 = ((Integer) obj2).intValue();
                oq5 oq5Var9 = (oq5) hq5Var8;
                if (oq5Var9.P(intValue12 & 1, (intValue12 & 3) != 2)) {
                    boolean z2 = ((xsp) zspVar).a;
                    int i6 = z2 ? R.drawable.ic_shuffle_active_40 : R.drawable.ic_shuffle_default_40;
                    if (z2) {
                        oq5Var9.Z(1330035900);
                        j4 = ((dq0) oq5Var9.j(eq0.a)).a.a;
                        oq5Var9.p(false);
                    } else {
                        oq5Var9.Z(1330100442);
                        j4 = ((dq0) oq5Var9.j(eq0.a)).a.c;
                        oq5Var9.p(false);
                    }
                    gae.b(a0g.E(i6, 0, oq5Var9), null, null, j4, oq5Var9, 48, 4);
                } else {
                    oq5Var9.S();
                }
                return Unit.a;
            case 24:
                ((Integer) obj2).getClass();
                cb0.n((eqp) obj4, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 25:
                fyp fypVar = (fyp) obj;
                Context context = (Context) obj2;
                fypVar.getClass();
                context.getClass();
                yvp yvpVar = ((rvp) obj4).a;
                yvpVar.getClass();
                x97.y(ot0.F(yvpVar), null, null, new kun(yvpVar, fypVar, context, null, 21), 3);
                return Unit.a;
            case 26:
                ComposeView composeView = (ComposeView) obj4;
                hq5 hq5Var9 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var10 = (oq5) hq5Var9;
                    if (oq5Var10.z()) {
                        oq5Var10.S();
                        return Unit.a;
                    }
                }
                oq5 oq5Var11 = (oq5) hq5Var9;
                boolean h2 = oq5Var11.h(composeView);
                Object K4 = oq5Var11.K();
                if (h2 || K4 == kjnVar) {
                    K4 = new mjm(27, composeView);
                    oq5Var11.k0(K4);
                }
                androidx.compose.ui.viewinterop.a.a(0, 6, oq5Var11, null, (Function1) K4, null);
                return Unit.a;
            case 27:
                wwp wwpVar = (wwp) obj4;
                boolean booleanValue4 = ((Boolean) obj).booleanValue();
                String str7 = (String) obj2;
                str7.getClass();
                wwpVar.getClass();
                x3n x3nVar = wwpVar.c;
                cvo cvoVar = (cvo) x3nVar.d;
                fnb fnbVar = (fnb) x3nVar.c;
                jyr jyrVar = (jyr) x3nVar.b;
                if (booleanValue4) {
                    x3nVar.a = str7;
                    nmb nmbVar = (nmb) jyrVar.getValue();
                    String G = fnbVar.G();
                    wjb wjbVar = cvoVar.a;
                    avo avoVar = cvoVar.e;
                    ilb ilbVar = ilb.Sheet;
                    glb glbVar = glb.Bottom;
                    pkb pkbVar = avoVar.a;
                    String str8 = avoVar.b;
                    qkb qkbVar = qkb.Carousel;
                    nmbVar.q(G, wjbVar, ilbVar, glbVar, "", pkbVar, str8, avoVar.a, avoVar.b, (r44 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 ? 0 : 1, (r44 & 1024) != 0 ? 0 : 1, "", 0, false, "share_subscription", "share_subscription", 1, 1, 0, "", "", "", 0, str7, cvoVar.a(), "");
                } else if (str7.equals((String) x3nVar.a)) {
                    nmb nmbVar2 = (nmb) jyrVar.getValue();
                    String G2 = fnbVar.G();
                    wjb wjbVar2 = cvoVar.a;
                    avo avoVar2 = cvoVar.e;
                    ilb ilbVar2 = ilb.Sheet;
                    glb glbVar2 = glb.Bottom;
                    pkb pkbVar2 = avoVar2.a;
                    String str9 = avoVar2.b;
                    qkb qkbVar2 = qkb.Carousel;
                    nmbVar2.k(G2, wjbVar2, ilbVar2, glbVar2, "", pkbVar2, str9, avoVar2.a, avoVar2.b, (r44 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 ? 0 : 1, (r44 & 1024) != 0 ? 0 : 1, "", 0, false, "share_subscription", "share_subscription", 1, 1, 0, "", "", "", 0, str7, cvoVar.a(), "");
                }
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((Integer) obj2).getClass();
                e9q.e((jmu) obj4, (hq5) obj, rvf.R(7));
                return Unit.a;
            default:
                ((Integer) obj2).getClass();
                int i7 = SkeletonListView.k;
                ((SkeletonListView) obj4).j(rvf.R(1), (hq5) obj);
                return Unit.a;
        }
    }

    public /* synthetic */ ucm(Object obj, int i, int i2) {
        this.a = i2;
        this.b = obj;
    }
}
