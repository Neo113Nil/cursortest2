package defpackage;

import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import androidx.compose.runtime.internal.a;
import com.yandex.go.drive.vertical.ui.double_content_modal.DoubleContentModalView;
import com.yandex.go.masstransit.sdk.checkout.impl.checkout.domain.k;
import com.yandex.go.promocodes.base.impl.discounts.presentation.ui.main.DiscountsModalView;
import com.yandex.go.promocodes.d;
import com.yandex.go.trusted_contacts.domain.entities.DialogButton;
import com.yandex.go.trusted_contacts.ui.dialog.DialogContentModalView;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mobile.drive.sdk.DriveSdkView;
import com.yandex.mobile.drive.sdk.full.DriveSummaryCardCollapseSource;
import com.yandex.mobile.drive.sdk.full.DriveSummaryCardExpansionSource;
import com.yandex.mobile.drive.sdk.full.GeoPoint;
import com.yandex.mobile.drive.sdk.full.GreenArea;
import com.yandex.mobile.drive.sdk.full.SessionState;
import com.yandex.mobile.drive.sdk.full.model.BlockChat;
import com.yandex.mobile.drive.sdk.full.model.CurrentOffer;
import com.yandex.mobile.drive.sdk.full.model.RideSession;
import com.yandex.mobile.drive.sdk.full.model.Session;
import com.yandex.mobile.drive.sdk.full.model.UiEntry;
import com.yandex.mobile.drive.sdk.full.model.User;
import com.ybsdk.feature.divkit.api.ui.skeletons.DivSkeletonsView;
import com.ybsdk.feature.status.screen.internal.ui.DivkitCommonFragment;
import com.ybsdk.screens.divbottomsheet.DivBottomSheetView;
import flex.section.divkit.cache.DivWrapperView;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.map_common.map.TaxiMapView;
import ru.yandex.taxi.order.f;

/* loaded from: classes15.dex */
public final /* synthetic */ class zvi implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zvi(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:78:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0211 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.ArrayList] */
    @Override // defpackage.tls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        zy11 insetsType$lambda$0;
        zy11 insetsType$lambda$02;
        boolean onAttachedToWindow$lambda$2;
        boolean onAttachedToWindow$lambda$1;
        c231 updateVariables$lambda$2$lambda$1;
        zy11 onViewCreated$lambda$0;
        zy11 insetsType$lambda$03;
        ?? r5;
        qfm qfmVar;
        SessionState sessionState;
        String title;
        Long l;
        GreenArea greenArea;
        String finish;
        CurrentOffer c;
        String finishArea;
        zy11 notifySummaryExpanded$lambda$5;
        zy11 _set_listener_$lambda$0;
        zy11 notifySummaryCollapsed$lambda$4;
        int i = this.a;
        int i2 = 2;
        int i3 = 11;
        int i4 = 3;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                z4j z4jVar = (z4j) obj2;
                z4jVar.e.c("Cancel");
                ((f) z4jVar.a).s0((o2y0) obj);
                break;
            case 3:
                u6y u6yVar = (u6y) obj;
                bpl0 bpl0Var = ((n9j) obj2).b;
                List list = bpl0Var.a;
                wls wlsVar = bpl0Var.b;
                ((m6y) u6yVar).f(list.size(), wlsVar != null ? new qq5(2, wlsVar, list) : null, new qc0(list, 9), new a(1891899975, new h9j(list, 0), true));
                break;
            case 4:
                insetsType$lambda$0 = DialogContentModalView.insetsType$lambda$0((DialogContentModalView) obj2, (t1w) obj);
                break;
            case 5:
                DialogButton dialogButton = (DialogButton) obj2;
                flr0 flr0Var = (flr0) obj;
                switch (flr0Var.a) {
                    case 0:
                        flr0Var.b.invoke(dialogButton);
                        break;
                    default:
                        flr0Var.b.invoke(dialogButton);
                        break;
                }
            case 6:
                ss9 ss9Var = (ss9) obj2;
                yfd yfdVar = (yfd) obj;
                ((agd) yfdVar).e = new t8j(i2, ss9Var, new yzh(ss9Var));
                s6d.a.getClass();
                ((agd) yfdVar).g = s6d.b;
                break;
            case 7:
                gmb gmbVar = (gmb) obj;
                k kVar = gmbVar.a.L;
                String str = gmbVar.b.c;
                String str2 = ((glj) obj2).a;
                kVar.a.d(new co21(str, str2));
                kVar.l(new tlc(str, str2));
                break;
            case 8:
                mnq0 mnq0Var = (mnq0) obj;
                androidx.compose.ui.semantics.f.l(mnq0Var, ((qoj) obj2).e.toString());
                androidx.compose.ui.semantics.f.p(mnq0Var, 0);
                break;
            case 9:
                ((dpj) obj).E0((wlf0) obj2);
                break;
            case 10:
                insetsType$lambda$02 = DiscountsModalView.insetsType$lambda$0((DiscountsModalView) obj2, (t1w) obj);
                break;
            case 11:
                vno0 vno0Var = (vno0) obj2;
                qrj qrjVar = (qrj) obj;
                int i5 = qrjVar.a;
                c21 c21Var = sy60.Q2;
                switch (i5) {
                    case 0:
                        rrj rrjVar = (rrj) qrjVar.b;
                        rrjVar.A((m950) ((l3e) rrjVar.N).get(), new mno0(vno0Var), c21Var);
                        break;
                    default:
                        d dVar = (d) qrjVar.b;
                        dVar.A((m950) dVar.H.get(), new mno0(vno0Var), c21Var);
                        break;
                }
            case 12:
                onAttachedToWindow$lambda$2 = DivBottomSheetView.onAttachedToWindow$lambda$2((DivBottomSheetView) obj2, (Uri) obj);
                break;
            case 13:
                String str3 = (String) obj;
                ((qnh) obj2).getClass();
                try {
                    break;
                }
            case 14:
                onAttachedToWindow$lambda$1 = DivSkeletonsView.onAttachedToWindow$lambda$1((DivSkeletonsView) obj2, (Uri) obj);
                break;
            case 15:
                updateVariables$lambda$2$lambda$1 = DivWrapperView.updateVariables$lambda$2$lambda$1((c231) obj2, (c231) obj);
                break;
            case 16:
                onViewCreated$lambda$0 = DivkitCommonFragment.onViewCreated$lambda$0((DivkitCommonFragment) obj2, (tb6) obj);
                break;
            case 17:
                insetsType$lambda$03 = DoubleContentModalView.insetsType$lambda$0((DoubleContentModalView) obj2, (t1w) obj);
                break;
            case 18:
                ((m2k0) obj).G(((z9m) obj2).c.getFloatValue());
                break;
            case 19:
                break;
            case 20:
                ((TaxiMapView) obj2).getChildAt(0).dispatchTouchEvent((MotionEvent) obj);
                break;
            case 21:
                tj tjVar = (tj) obj2;
                pyj0 pyj0Var = (pyj0) obj;
                if (pyj0Var instanceof f0k0) {
                    Pair pair = ((f0k0) pyj0Var).a;
                    Session session = (Session) pair.getFirst();
                    String str4 = (String) pair.getSecond();
                    List sessions = session.getSessions();
                    if (sessions != null) {
                        r5 = new ArrayList();
                        for (Object obj3 : sessions) {
                            if (!((RideSession) obj3).b().equals(b0r0.a)) {
                                r5.add(obj3);
                            }
                        }
                    } else {
                        r5 = EmptyList.a;
                    }
                    if (!session.f() || r5.isEmpty()) {
                        User user = session.getUser();
                        BlockChat show_chat = user != null ? user.getShow_chat() : null;
                        session.f();
                        if (show_chat != null) {
                            jl40.l(show_chat.getClosable(), Boolean.TRUE);
                        }
                        nx21.a(new ymj(10, tjVar, new uhf(str4)));
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (RideSession rideSession : (Iterable) r5) {
                            CurrentOffer c2 = rideSession.c();
                            String offer_id = c2 != null ? c2.getOffer_id() : null;
                            if (offer_id != null) {
                                Long a = rideSession.a();
                                eab1 b = rideSession.b();
                                if (b instanceof f0r0) {
                                    sessionState = SessionState.reservationFree;
                                } else if (b instanceof d0r0) {
                                    sessionState = SessionState.reservationPaid;
                                } else if (b instanceof a0r0) {
                                    sessionState = SessionState.acceptanceFree;
                                } else if (b instanceof c0r0) {
                                    sessionState = SessionState.acceptancePaid;
                                } else if (b instanceof e0r0) {
                                    sessionState = SessionState.parking;
                                } else if (b instanceof g0r0) {
                                    sessionState = SessionState.riding;
                                } else if (b instanceof b0r0) {
                                    sessionState = SessionState.unrecognized;
                                } else if (b instanceof h0r0) {
                                    sessionState = SessionState.unrecognized;
                                } else if (!(b instanceof i0r0)) {
                                    w511.b();
                                    break;
                                } else {
                                    sessionState = SessionState.unrecognized;
                                }
                                SessionState sessionState2 = sessionState;
                                UiEntry uiEntry = rideSession.getUiEntry();
                                if (uiEntry != null && (title = uiEntry.getTitle()) != null) {
                                    if (a == null || a.longValue() <= 0) {
                                        l = null;
                                    } else {
                                        long longValue = a.longValue();
                                        Double time = session.getTime();
                                        l = Long.valueOf(longValue + (time != null ? (long) time.doubleValue() : new Date().getTime()));
                                    }
                                    CurrentOffer c3 = rideSession.c();
                                    if (c3 != null && (finish = c3.getFinish()) != null && (c = rideSession.c()) != null && (finishArea = c.getFinishArea()) != null) {
                                        GeoPoint geoPoint = (GeoPoint) kotlin.collections.a.R(RideSession.f(finish));
                                        ArrayList f = RideSession.f(finishArea);
                                        if (f.size() >= i4 && geoPoint != null) {
                                            greenArea = new GreenArea(geoPoint, (GeoPoint[]) f.toArray(new GeoPoint[0]));
                                            qfmVar = new qfm(offer_id, a, l, sessionState2, greenArea, new umt(title, uiEntry.getSubtitle(), uiEntry.getCarNumber(), uiEntry.getIconUrl(), uiEntry.getPrice()));
                                            if (qfmVar != null) {
                                                arrayList.add(qfmVar);
                                            }
                                            i4 = 3;
                                        }
                                    }
                                    greenArea = null;
                                    qfmVar = new qfm(offer_id, a, l, sessionState2, greenArea, new umt(title, uiEntry.getSubtitle(), uiEntry.getCarNumber(), uiEntry.getIconUrl(), uiEntry.getPrice()));
                                    if (qfmVar != null) {
                                    }
                                    i4 = 3;
                                }
                            }
                            qfmVar = null;
                            if (qfmVar != null) {
                            }
                            i4 = 3;
                        }
                        nx21.a(new t7j(3, tjVar, arrayList, str4));
                    }
                    break;
                } else if (!(pyj0Var instanceof lzj0)) {
                    w511.b();
                    break;
                } else {
                    nx21.a(new ymj(i3, pyj0Var, tjVar));
                }
                break;
            case 22:
                notifySummaryExpanded$lambda$5 = DriveSdkView.notifySummaryExpanded$lambda$5((DriveSummaryCardExpansionSource) obj2, (efm) obj);
                break;
            case 23:
                _set_listener_$lambda$0 = DriveSdkView._set_listener_$lambda$0((hdm) obj2, (efm) obj);
                break;
            case 24:
                notifySummaryCollapsed$lambda$4 = DriveSdkView.notifySummaryCollapsed$lambda$4((DriveSummaryCardCollapseSource) obj2, (efm) obj);
                break;
            case 25:
                ((xgm) ((rgm) obj2).b.Dg()).pg(((Boolean) obj).booleanValue());
                break;
            case 26:
                break;
            case 27:
                ((r3k0) obj2).d(300L, true);
                break;
            case 28:
                wjg wjgVar = new wjg((Point) obj2, 4);
                mlm mlmVar = ((glm) obj).a;
                mlmVar.B((m950) mlmVar.K.get(), wjgVar, new wui(mlmVar, i4), new n1j0(mlmVar.Q()));
                break;
            default:
                ((Float) obj).getClass();
                for (View view : (View[]) obj2) {
                    view.invalidate();
                }
                break;
        }
        return zy11Var;
    }
}
