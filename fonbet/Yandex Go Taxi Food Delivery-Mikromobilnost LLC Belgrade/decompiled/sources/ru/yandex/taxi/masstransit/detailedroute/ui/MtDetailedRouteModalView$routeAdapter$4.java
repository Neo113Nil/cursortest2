package ru.yandex.taxi.masstransit.detailedroute.ui;

import defpackage.bf30;
import defpackage.ge01;
import defpackage.tls;
import defpackage.w511;
import defpackage.wtb1;
import defpackage.yw30;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.masstransit.analytic.MtDetailedRouteAnalyticSource;
import ru.yandex.taxi.masstransit.analytic.MtDetailedRouteAnalyticType;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$DetailCardSource;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$DetailCardTappedButtonV2;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$DetailCardType;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* synthetic */ class MtDetailedRouteModalView$routeAdapter$4 extends FunctionReferenceImpl implements tls {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0032  */
    @Override // defpackage.tls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        TransportRouteAnalytics$DetailCardSource transportRouteAnalytics$DetailCardSource;
        int i;
        TransportRouteAnalytics$DetailCardType transportRouteAnalytics$DetailCardType;
        String str;
        ge01 ge01Var = (ge01) obj;
        c cVar = (c) this.receiver;
        yw30 yw30Var = cVar.C;
        TransportRouteAnalytics$DetailCardTappedButtonV2 transportRouteAnalytics$DetailCardTappedButtonV2 = TransportRouteAnalytics$DetailCardTappedButtonV2.MyTickets;
        MtDetailedRouteAnalyticSource mtDetailedRouteAnalyticSource = cVar.z;
        int i2 = mtDetailedRouteAnalyticSource == null ? -1 : bf30.a[mtDetailedRouteAnalyticSource.ordinal()];
        if (i2 != -1) {
            if (i2 == 1) {
                transportRouteAnalytics$DetailCardSource = TransportRouteAnalytics$DetailCardSource.Hub;
                MtDetailedRouteAnalyticType mtDetailedRouteAnalyticType = cVar.A;
                i = mtDetailedRouteAnalyticType != null ? -1 : bf30.b[mtDetailedRouteAnalyticType.ordinal()];
                if (i != -1) {
                    if (i == 1) {
                        transportRouteAnalytics$DetailCardType = TransportRouteAnalytics$DetailCardType.Vertical;
                        yw30Var.c(transportRouteAnalytics$DetailCardTappedButtonV2, transportRouteAnalytics$DetailCardSource, transportRouteAnalytics$DetailCardType, wtb1.d(cVar.x.a), c.Lg(ge01Var.c));
                        str = ge01Var.b;
                        if (str != null) {
                            cVar.y.g(str);
                        }
                        return zy11.a;
                    }
                    if (i != 2) {
                        w511.b();
                        return null;
                    }
                }
                transportRouteAnalytics$DetailCardType = TransportRouteAnalytics$DetailCardType.Horizontal;
                yw30Var.c(transportRouteAnalytics$DetailCardTappedButtonV2, transportRouteAnalytics$DetailCardSource, transportRouteAnalytics$DetailCardType, wtb1.d(cVar.x.a), c.Lg(ge01Var.c));
                str = ge01Var.b;
                if (str != null) {
                }
                return zy11.a;
            }
            if (i2 != 2) {
                w511.b();
                return null;
            }
        }
        transportRouteAnalytics$DetailCardSource = TransportRouteAnalytics$DetailCardSource.Transport;
        MtDetailedRouteAnalyticType mtDetailedRouteAnalyticType2 = cVar.A;
        if (mtDetailedRouteAnalyticType2 != null) {
        }
        if (i != -1) {
        }
        transportRouteAnalytics$DetailCardType = TransportRouteAnalytics$DetailCardType.Horizontal;
        yw30Var.c(transportRouteAnalytics$DetailCardTappedButtonV2, transportRouteAnalytics$DetailCardSource, transportRouteAnalytics$DetailCardType, wtb1.d(cVar.x.a), c.Lg(ge01Var.c));
        str = ge01Var.b;
        if (str != null) {
        }
        return zy11.a;
    }
}
