package defpackage;

import android.content.Context;
import android.net.Uri;
import com.yandex.plus.home.repository.api.model.webconfig.SubscriptionConfiguration;
import com.ybsdk.navigation.NavigationFragment;
import defpackage.vb40;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.SegmentedComponent;
import ru.yandex.taxi.eatskit.internal.nativeapi.NativeApi;
import ru.yandex.taxi.logistics.ndd_route_selector.view.NddRouteSelectorModalView;
import ru.yandex.taxi.masstransit.TransportCardSourceScreen;
import ru.yandex.taxi.masstransit.analytic.MtDetailedRouteAnalyticSource;
import ru.yandex.taxi.masstransit.analytic.MtDetailedRouteAnalyticType;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$DetailCardSource;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$DetailCardType;
import ru.yandex.taxi.masstransit.analytic.TransportVerticalAnalytics$TransportCardButtonName;
import ru.yandex.taxi.masstransit.analytic.TransportVerticalAnalytics$TransportCardStatus;
import ru.yandex.taxi.masstransit.main.ui.header.compose.MtHeader;
import ru.yandex.taxi.masstransit.main.ui.modal.MtMainFlexModalView;
import ru.yandex.taxi.masstransit.trains.checkout.model.ModalButtonResultType;
import ru.yandex.taxi.masstransit.ui.route.modal.collapsed.MtCollapsedRoutesView;
import ru.yandex.taxi.masstransit.ui.route.modal.collapsed.d;
import ru.yandex.taxi.masstransit.ui.route.modal.expanded.MtExpandedRoutesView;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes6.dex */
public final /* synthetic */ class ve30 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ve30(h111 h111Var, tls tlsVar) {
        this.a = 2;
        this.c = h111Var;
        this.b = tlsVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:183:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
    @Override // defpackage.sls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        d dVar;
        d dVar2;
        Uri uri;
        d dVar3;
        d dVar4;
        d dVar5;
        TransportRouteAnalytics$DetailCardSource transportRouteAnalytics$DetailCardSource;
        int i;
        TransportRouteAnalytics$DetailCardType transportRouteAnalytics$DetailCardType;
        lj30 lj30Var;
        lj30 lj30Var2;
        Uri uri2;
        lj30 lj30Var3;
        lj30 lj30Var4;
        lj30 lj30Var5;
        MtHeader header_delegate$lambda$0;
        Object ut30Var;
        Object obj;
        String str;
        List list;
        zy11 handleRequestReload$lambda$0;
        zy11 handleOnWebViewLoadError$lambda$0;
        Map map;
        ye0 ye0Var;
        ye0 pb50Var;
        SegmentedComponent routeSwitchSegment_delegate$lambda$0;
        int i2 = this.a;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i2) {
            case 0:
                MtCollapsedRoutesView mtCollapsedRoutesView = (MtCollapsedRoutesView) obj3;
                h111 h111Var = (h111) obj2;
                dVar = mtCollapsedRoutesView.presenter;
                mb11 mb11Var = dVar.N;
                p011 p011Var = h111Var.j;
                String str2 = p011Var.a;
                TransportVerticalAnalytics$TransportCardStatus d = ttb1.d(p011Var);
                p011 p011Var2 = h111Var.j;
                mb11Var.c(str2, d, ttb1.c(p011Var2));
                int i3 = we30.a[h111Var.h.ordinal()];
                if (i3 == 1) {
                    dVar2 = mtCollapsedRoutesView.presenter;
                    String str3 = h111Var.i;
                    if (str3 == null || (uri = Uri.parse(str3)) == null) {
                        uri = Uri.EMPTY;
                    }
                    dVar2.M.b(uri, TransportCardSourceScreen.VERTICAL);
                    dVar3 = mtCollapsedRoutesView.presenter;
                    dVar3.N.b(ttb1.b(p011Var2), TransportVerticalAnalytics$TransportCardButtonName.AddCard);
                } else {
                    if (i3 != 2) {
                        w511.b();
                        return null;
                    }
                    dVar4 = mtCollapsedRoutesView.presenter;
                    dVar4.x.F();
                    dVar5 = mtCollapsedRoutesView.presenter;
                    dVar5.N.a(ttb1.b(p011Var2));
                }
                return zy11Var;
            case 1:
                yfd yfdVar = (yfd) obj2;
                yw30 yw30Var = ((qf30) obj3).J;
                MtDetailedRouteAnalyticSource mtDetailedRouteAnalyticSource = ((sg30) ((agd) yfdVar).a).b;
                int i4 = mtDetailedRouteAnalyticSource == null ? -1 : bf30.a[mtDetailedRouteAnalyticSource.ordinal()];
                if (i4 != -1) {
                    if (i4 == 1) {
                        transportRouteAnalytics$DetailCardSource = TransportRouteAnalytics$DetailCardSource.Hub;
                        MtDetailedRouteAnalyticType mtDetailedRouteAnalyticType = ((sg30) ((agd) yfdVar).a).c;
                        i = mtDetailedRouteAnalyticType != null ? -1 : bf30.b[mtDetailedRouteAnalyticType.ordinal()];
                        if (i != -1) {
                            if (i == 1) {
                                transportRouteAnalytics$DetailCardType = TransportRouteAnalytics$DetailCardType.Vertical;
                                yw30Var.a.e(transportRouteAnalytics$DetailCardSource, transportRouteAnalytics$DetailCardType);
                                return zy11Var;
                            }
                            if (i != 2) {
                                w511.b();
                                return null;
                            }
                        }
                        transportRouteAnalytics$DetailCardType = TransportRouteAnalytics$DetailCardType.Horizontal;
                        yw30Var.a.e(transportRouteAnalytics$DetailCardSource, transportRouteAnalytics$DetailCardType);
                        return zy11Var;
                    }
                    if (i4 != 2) {
                        w511.b();
                        return null;
                    }
                }
                transportRouteAnalytics$DetailCardSource = TransportRouteAnalytics$DetailCardSource.Transport;
                MtDetailedRouteAnalyticType mtDetailedRouteAnalyticType2 = ((sg30) ((agd) yfdVar).a).c;
                if (mtDetailedRouteAnalyticType2 != null) {
                }
                if (i != -1) {
                }
                transportRouteAnalytics$DetailCardType = TransportRouteAnalytics$DetailCardType.Horizontal;
                yw30Var.a.e(transportRouteAnalytics$DetailCardSource, transportRouteAnalytics$DetailCardType);
                return zy11Var;
            case 2:
                h111 h111Var2 = (h111) obj2;
                tls tlsVar = (tls) obj3;
                int i5 = bh30.b[h111Var2.h.ordinal()];
                if (i5 == 1) {
                    String str4 = h111Var2.i;
                    if (str4 != null) {
                        tlsVar.invoke(new th30(str4));
                    }
                } else {
                    if (i5 != 2) {
                        w511.b();
                        return null;
                    }
                    tlsVar.invoke(uh30.a);
                }
                return zy11Var;
            case 3:
                MtExpandedRoutesView mtExpandedRoutesView = (MtExpandedRoutesView) obj3;
                h111 h111Var3 = (h111) obj2;
                lj30Var = mtExpandedRoutesView.presenter;
                mb11 mb11Var2 = lj30Var.H;
                p011 p011Var3 = h111Var3.j;
                String str5 = p011Var3.a;
                TransportVerticalAnalytics$TransportCardStatus d2 = ttb1.d(p011Var3);
                p011 p011Var4 = h111Var3.j;
                mb11Var2.c(str5, d2, ttb1.c(p011Var4));
                int i6 = oj30.a[h111Var3.h.ordinal()];
                if (i6 == 1) {
                    lj30Var2 = mtExpandedRoutesView.presenter;
                    String str6 = h111Var3.i;
                    if (str6 == null || (uri2 = Uri.parse(str6)) == null) {
                        uri2 = Uri.EMPTY;
                    }
                    lj30Var2.G.b(uri2, TransportCardSourceScreen.VERTICAL);
                    lj30Var3 = mtExpandedRoutesView.presenter;
                    lj30Var3.H.b(ttb1.b(p011Var4), TransportVerticalAnalytics$TransportCardButtonName.AddCard);
                } else {
                    if (i6 != 2) {
                        w511.b();
                        return null;
                    }
                    lj30Var4 = mtExpandedRoutesView.presenter;
                    lj30Var4.x.F();
                    lj30Var5 = mtExpandedRoutesView.presenter;
                    lj30Var5.H.a(ttb1.b(p011Var4));
                }
                return zy11Var;
            case 4:
                ((hk30) obj2).getClass();
                ((tls) obj3).invoke(fl30.a);
                return zy11Var;
            case 5:
                ml30 ml30Var = (ml30) obj3;
                tls tlsVar2 = (tls) obj2;
                if (ml30Var != null) {
                    tlsVar2.invoke(ml30Var);
                }
                return zy11Var;
            case 6:
                header_delegate$lambda$0 = MtMainFlexModalView.header_delegate$lambda$0((Context) obj3, (ip11) obj2);
                return header_delegate$lambda$0;
            case 7:
                tls tlsVar3 = (tls) obj3;
                nt30 nt30Var = ((ot30) obj2).d;
                if (nt30Var instanceof lt30) {
                    obj = rt30.a;
                } else {
                    if (nt30Var instanceof kt30) {
                        ut30Var = new tt30(((kt30) nt30Var).a);
                    } else {
                        if (!(nt30Var instanceof mt30)) {
                            w511.b();
                            return null;
                        }
                        ut30Var = new ut30(((mt30) nt30Var).a);
                    }
                    obj = ut30Var;
                }
                tlsVar3.invoke(obj);
                return zy11Var;
            case 8:
                tls tlsVar4 = (tls) obj2;
                c040 c040Var = (c040) ((y57) obj3).U;
                if (c040Var != null) {
                    tlsVar4.invoke(c040Var);
                }
                return zy11Var;
            case 9:
                ((tls) obj3).invoke(new i040(((gd30) obj2).b));
                return zy11Var;
            case 10:
                ((tls) obj3).invoke((diu0) obj2);
                return zy11Var;
            case 11:
                lyy0 lyy0Var = (lyy0) obj3;
                wls wlsVar = (wls) obj2;
                m540 m540Var = lyy0Var.i;
                if (m540Var != null) {
                    wlsVar.invoke(lyy0Var, m540Var);
                }
                return zy11Var;
            case 12:
                ((tls) obj3).invoke(((czy0) obj2).a.d.b);
                return zy11Var;
            case 13:
                m940 m940Var = (m940) obj3;
                oz40 oz40Var = (oz40) obj2;
                j940 j940Var = m940Var instanceof j940 ? (j940) m940Var : null;
                if (j940Var != null && (str = (String) oz40Var.getValue()) != null && (list = j940Var.e) != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (jl40.l(((u510) next).b, str)) {
                                r5 = next;
                            }
                        }
                    }
                    u510 u510Var = (u510) r5;
                    if (u510Var != null) {
                        t740 t740Var = u510Var.a;
                        if ((t740Var instanceof o740) && ((o740) t740Var).b != null) {
                            r2 = true;
                        }
                    }
                }
                return Boolean.valueOf(r2);
            case 14:
                ModalButtonResultType modalButtonResultType = (ModalButtonResultType) obj3;
                tls tlsVar5 = (tls) obj2;
                r5 = modalButtonResultType != null ? new v940(modalButtonResultType) : null;
                if (r5 != null) {
                    tlsVar5.invoke(r5);
                }
                return zy11Var;
            case 15:
                vb40.m mVar = (vb40.m) obj3;
                tls tlsVar6 = (tls) obj2;
                r5 = mVar != null ? new qd40(mVar) : null;
                if (r5 != null) {
                    tlsVar6.invoke(r5);
                }
                return zy11Var;
            case 16:
                ((tls) obj3).invoke(new md40((hb40) obj2));
                return zy11Var;
            case 17:
                ph40 ph40Var = (ph40) obj3;
                tls tlsVar7 = (tls) obj2;
                if (ph40Var.e) {
                    tlsVar7.invoke(new ai40(ph40Var.f));
                }
                return zy11Var;
            case 18:
                ((tls) obj3).invoke(((xk40) obj2).g);
                return zy11Var;
            case 19:
                mn40 mn40Var = (mn40) obj3;
                mn40Var.T.invoke(((kn40) obj2).a, Boolean.valueOf(mn40Var.V.toggleCheckbox()));
                return zy11Var;
            case 20:
                ((tls) obj3).invoke((rv40) obj2);
                return zy11Var;
            case 21:
                ((tls) obj3).invoke(new pv40((tsq) obj2));
                return zy11Var;
            case 22:
                handleRequestReload$lambda$0 = NativeApi.handleRequestReload$lambda$0((NativeApi) obj3, (iti0) obj2);
                return handleRequestReload$lambda$0;
            case 23:
                handleOnWebViewLoadError$lambda$0 = NativeApi.handleOnWebViewLoadError$lambda$0((NativeApi) obj3, (f8o) obj2);
                return handleOnWebViewLoadError$lambda$0;
            case 24:
                ((x350) obj3).k((String) obj2);
                return zy11Var;
            case 25:
                ((x350) obj3).k(((SubscriptionConfiguration.PayInfo.OneClickLegalInfo) obj2).getUrl());
                return zy11Var;
            case 26:
                map = ((NavigationFragment) obj3).fragmentTraces;
                zva0 zva0Var = (zva0) map.remove((String) obj2);
                if (zva0Var != null) {
                    zva0Var.a();
                }
                return zy11Var;
            case 27:
                jb50 jb50Var = (jb50) obj3;
                ib50 ib50Var = (ib50) obj2;
                jb50Var.c.b();
                uzs uzsVar = zzs.Companion;
                String str7 = ib50Var.a;
                if (str7 == null) {
                    str7 = "";
                }
                String str8 = ib50Var.b;
                if (str8 == null) {
                    str8 = "";
                }
                uzsVar.getClass();
                zzs c = uzs.c(str7, str8, null);
                kc50 kc50Var = jb50Var.b;
                String str9 = ib50Var.d;
                if (jl40.l(str9, TariffOrderFlow.ORDER_FLOW_DRIVE_KEY)) {
                    ye0Var = nb50.b;
                } else if (jl40.l(str9, "cartech")) {
                    ye0Var = lb50.b;
                } else if (jl40.l(str9, "mobility_hub")) {
                    ye0Var = ob50.b;
                } else {
                    if (str9 != null) {
                        pb50Var = new pb50(str9);
                        String str10 = ib50Var.c;
                        String str11 = str10 != null ? "" : str10;
                        Boolean bool = ib50Var.g;
                        boolean booleanValue = bool == null ? bool.booleanValue() : false;
                        Boolean bool2 = ib50Var.h;
                        boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
                        String str12 = ib50Var.e;
                        kc50Var.a(null, new rd50(c, pb50Var, str11, booleanValue, booleanValue2, str12 != null ? "" : str12, ib50Var.f));
                        return zy11Var;
                    }
                    ye0Var = mb50.b;
                }
                pb50Var = ye0Var;
                String str102 = ib50Var.c;
                if (str102 != null) {
                }
                Boolean bool3 = ib50Var.g;
                if (bool3 == null) {
                }
                Boolean bool22 = ib50Var.h;
                boolean booleanValue22 = bool22 != null ? bool22.booleanValue() : false;
                String str122 = ib50Var.e;
                kc50Var.a(null, new rd50(c, pb50Var, str11, booleanValue, booleanValue22, str122 != null ? "" : str122, ib50Var.f));
                return zy11Var;
            case 28:
                routeSwitchSegment_delegate$lambda$0 = NddRouteSelectorModalView.routeSwitchSegment_delegate$lambda$0((Context) obj3, (NddRouteSelectorModalView) obj2);
                return routeSwitchSegment_delegate$lambda$0;
            default:
                Integer num = (Integer) obj2;
                ListItemComponent listItemComponent = ((pk50) obj3).N;
                listItemComponent.setLeadImage(xzg0.ic_metrostation);
                if (num != null) {
                    listItemComponent.setLeadTint(num.intValue());
                }
                return zy11Var;
        }
    }

    public /* synthetic */ ve30(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
