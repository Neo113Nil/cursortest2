package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.nfc.Tag;
import android.nfc.tech.MifareClassic;
import android.os.Bundle;
import android.os.Parcelable;
import android.webkit.PermissionRequest;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import com.yandex.fintechsdk.core.nfc.impl.internal.exception.MifareClassicException;
import com.yandex.go.masstransit.sdk.camera.view.MtQRCameraPreview;
import com.yandex.go.navigator.ui.b;
import com.yandex.go.payments.design.composite.CompositePaymentIconsView;
import com.yandex.go.slot.ui.view.SlotItemButtonViewComponent;
import com.yandex.go.taxi.order.OrderCancelProcessingObserver;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Pending;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Source;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.request.OrderStatusParam;
import com.yandex.go.taxi.order.models.api.response.FeedbackDto;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import com.yandex.go.taxi.order.t;
import com.yandex.go.taxi.order.util.accordion.AccordionComponent;
import com.yandex.go.zone.model.Zone;
import com.yandex.mapkit.navigation.automotive.Navigation;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.NotificationActionService;
import com.yandex.messaging.ui.auth.ProxyPassportActivity;
import com.yandex.passport.api.KPassportEnvironment;
import com.yandex.passport.api.k2;
import com.yandex.passport.api.x;
import com.yandex.passport.internal.properties.AuthorizationUrlProperties;
import com.yandex.passport.internal.ui.c;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.yandex.plus.acquisition.sdk.api.PlusAcquisitionExperiments;
import com.yandex.plus.pay.api.analytics.PlusPayAnalyticsParams;
import com.yandex.plus.pay.api.analytics.PlusPayTestId;
import com.yandex.plus.webview.core.PlusWebChromeClient;
import com.yandex.plus.webview.core.PlusWebViewClient;
import com.ybsdk.core.analytics.generated.delegates.QrPaymentEvents$QrPaymentCheckLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.QrPaymentEvents$QrPaymentCheckLoadedState;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.pfm.internal.ui.viewitems.PfmFilterViewItem$Content$Mode;
import com.ybsdk.feature.pfm.internal.ui.widgets.PFMCalendarView;
import com.ybsdk.widgets.common.g;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.taxi.domain.RequirementAddressInputType;
import ru.yandex.taxi.logistics.sdk.ui.component.drag_drop_column.utils.e;
import ru.yandex.taxi.map_common.map.TaxiMapView;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.order.f;
import ru.yandex.taxi.summary.promotions.analytics.SummaryPromotionsAnalytics$SummaryState;
import ru.yandex.taxi.summary.solid.interactor.p;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes14.dex */
public final /* synthetic */ class th40 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ th40(tls tlsVar, xlj0 xlj0Var, fgd fgdVar) {
        this.a = 26;
        this.c = tlsVar;
        this.b = xlj0Var;
        this.w = fgdVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:259:0x07b3, code lost:
    
        if (r8 == false) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x07db, code lost:
    
        r6.p0(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x07d4, code lost:
    
        if (r8 == false) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x07d8, code lost:
    
        if (r12 == false) goto L271;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:242:0x081d  */
    /* JADX WARN: Type inference failed for: r1v96, types: [T, hyj0] */
    @Override // defpackage.tls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        MifareClassic mifareClassic;
        zy11 onStartCommand$lambda$2$lambda$1;
        o2y0 o2y0Var;
        List list;
        Object value;
        TaxiOrder taxiOrder;
        g render$lambda$5;
        ArrayList arrayList;
        Set<PlusAcquisitionExperiments.TestId> testIds;
        Pair pair;
        int i;
        fbb0 fbb0Var;
        zy11 onPermissionRequest$lambda$2;
        zy11 onReceivedSslError$lambda$5;
        zy11 lambda$onCreate$0;
        v031 q031Var;
        int i2 = 7;
        int i3 = 18;
        int i4 = 6;
        int i5 = 3;
        switch (this.a) {
            case 0:
                List list2 = (List) this.b;
                ((m6y) ((u6y) obj)).f(list2.size(), null, new rc0(list2, 7, vh40.a), new a(802480018, new yc0(i4, list2, (String) this.w, (tls) this.c), true));
                return zy11.a;
            case 1:
                List list3 = (List) this.b;
                ((m6y) ((u6y) obj)).f(list3.size(), null, new rc0(list3, 8, ki40.a), new a(802480018, new yc0(i2, list3, (na11) this.w, (tls) this.c), true));
                return zy11.a;
            case 2:
                b bVar = (b) this.b;
                ad50 ad50Var = (ad50) this.w;
                bVar.x.b(new vqy(bVar, (TaxiMapView) obj, (Navigation) this.c, ad50Var, 9), true);
                gh00 gh00Var = (gh00) ((ah00) bVar.b);
                gh00Var.e(ad50Var.a);
                gh00Var.I(true);
                return zy11.a;
            case 3:
                com.yandex.fintechsdk.core.nfc.impl.internal.a aVar = (com.yandex.fintechsdk.core.nfc.impl.internal.a) this.b;
                z22 z22Var = aVar.b;
                c860 c860Var = (c860) this.w;
                h511 h511Var = (h511) this.c;
                Tag tag = (Tag) obj;
                try {
                    ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(new keo("nfc_connect_start", gw00.e(new Pair(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Начало подключения к NFC карте"))));
                    mifareClassic = MifareClassic.get(tag);
                    aVar.e = mifareClassic;
                } catch (MifareClassicException e) {
                    h511Var.invoke();
                    String valueOf = String.valueOf(e.getMessage());
                    ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(new keo("nfc_connect_error", kotlin.collections.b.i(new Pair(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Ошибка подключения к NFC карте: ".concat(valueOf)), new Pair(CRLReasonCodeExtension.REASON, valueOf))));
                }
                if (mifareClassic == null) {
                    throw new MifareClassicException();
                }
                mifareClassic.setTimeout(10000);
                MifareClassic mifareClassic2 = aVar.e;
                if (mifareClassic2 != null) {
                    mifareClassic2.connect();
                }
                c860Var.invoke();
                return zy11.a;
            case 4:
                onStartCommand$lambda$2$lambda$1 = NotificationActionService.onStartCommand$lambda$2$lambda$1((Intent) this.b, (NotificationActionService) this.w, (Intent) this.c, (v320) obj);
                return onStartCommand$lambda$2$lambda$1;
            case 5:
                o2y0 o2y0Var2 = (o2y0) this.b;
                f fVar = (f) this.w;
                DriveState driveState = (DriveState) this.c;
                Zone zone = (Zone) obj;
                zy11 zy11Var = zy11.a;
                TaxiOrder b = o2y0Var2.b();
                if (fVar.Q0.add(b)) {
                    fVar.P.a(b.a);
                    String str = (String) fVar.v1.remove(o2y0Var2.b().a);
                    if (str != null) {
                        fVar.o0(o2y0Var2);
                        b.b.j(null);
                        fVar.c0(o2y0Var2);
                        fVar.t0();
                        fVar.j0(str);
                    } else {
                        FeedbackDto feedbackDto = new FeedbackDto(null, null == true ? 1 : 0, null == true ? 1 : 0, 31);
                        fVar.i0.getClass();
                        if (k990.a(b, driveState) && o2y0Var2.b().V().F == OrderStatusInfo.CancelledBy.TIMEOUT) {
                            fVar.A((m950) fVar.t0.get(), o2y0Var2.b(), new cb0(15, fVar, o2y0Var2));
                        } else if (b.l.X) {
                            fVar.c0(o2y0Var2);
                        } else {
                            fVar.d0.getClass();
                            if (k880.b(b)) {
                                fVar.q0(o2y0Var2);
                            } else {
                                boolean g = alb1.g(b.h.b, b.V().k, b.V().u);
                                Object[] objArr = (zone == null || (list = zone.h.d) == null || !(list.isEmpty() ^ true)) ? false : true;
                                List list4 = b.V().A.d;
                                Object[] objArr2 = ((list4 == null || list4.isEmpty()) && b.V().A.g == null) ? false : true;
                                if (g) {
                                    if (objArr == false) {
                                    }
                                    if (fVar.p1 != null && fVar.getLifecycle().w.a(Lifecycle.State.STARTED)) {
                                        o2y0Var = o2y0Var2;
                                        fVar.A((m950) fVar.j0.get(), o2y0Var, new ip70(feedbackDto, o2y0Var2.b(), fVar, driveState, o2y0Var));
                                        if (!alb1.g(b.h.b, b.V().k, b.V().u)) {
                                            ic00 ic00Var = ((kc00) fVar.f0).a;
                                            ic00Var.getClass();
                                            if (!(ic00Var instanceof hc00)) {
                                                fVar.C1.d(o2y0Var, kyh0.order_cancel_confirmed, null, null, new sf30(27, fVar));
                                            }
                                        }
                                    }
                                } else {
                                    boolean z = b.V().A.h;
                                    Object[] objArr3 = driveState == DriveState.DRIVING || driveState == DriveState.WAITING || driveState == DriveState.CHECK_IN || driveState == DriveState.TRANSPORTING;
                                    if (objArr == false) {
                                    }
                                    if (!z) {
                                    }
                                    if (fVar.p1 != null) {
                                        o2y0Var = o2y0Var2;
                                        fVar.A((m950) fVar.j0.get(), o2y0Var, new ip70(feedbackDto, o2y0Var2.b(), fVar, driveState, o2y0Var));
                                        if (!alb1.g(b.h.b, b.V().k, b.V().u)) {
                                        }
                                    }
                                }
                            }
                            o2y0Var = o2y0Var2;
                            if (!alb1.g(b.h.b, b.V().k, b.V().u)) {
                            }
                        }
                    }
                } else {
                    fVar.Z(o2y0Var2);
                }
                return zy11Var;
            case 6:
                com.yandex.go.taxi.order.controller.a aVar2 = (com.yandex.go.taxi.order.controller.a) this.b;
                DriveState driveState2 = (DriveState) this.w;
                qq70 qq70Var = (qq70) this.c;
                switch (lq70.a[driveState2.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        TaxiOrder b2 = aVar2.c.b();
                        String Hg = aVar2.g.Hg();
                        if (Hg == null) {
                            a3y0.e(aVar2.G, new String[]{"cancelOrderBasedOnDriveState", "userId"}, null, new jl70(i3), 2);
                            qq70Var.g(b2.h.b);
                            break;
                        } else {
                            aVar2.j("cancel");
                            OrderCancelProcessingObserver orderCancelProcessingObserver = aVar2.n;
                            o2y0 o2y0Var3 = aVar2.c;
                            r0 r0Var = o2y0Var3.a;
                            do {
                                value = r0Var.getValue();
                                taxiOrder = (TaxiOrder) value;
                                taxiOrder.a(new ChangeOrderState$Pending(null, ChangeOrderState$Source.CANCEL));
                            } while (!r0Var.k(value, taxiOrder));
                            o2y0Var3.f();
                            r0 r0Var2 = orderCancelProcessingObserver.a;
                            t tVar = new t(o2y0Var3, OrderCancelProcessingObserver.ProcessingState.STARTED);
                            r0Var2.getClass();
                            r0Var2.m(null, tVar);
                            aVar2.o.b(Hg, b2, OrderStatusParam.Break.USER, new mq70(b2, aVar2, qq70Var));
                            break;
                        }
                    default:
                        qq70Var.g(driveState2);
                        break;
                }
                return zy11.a;
            case 7:
                sls slsVar = (sls) this.b;
                j690 j690Var = (j690) this.w;
                it1 it1Var = (it1) this.c;
                c1y c1yVar = (c1y) obj;
                long j = ((cjs0) ((MutablePropertyReference0) slsVar).get()).a;
                float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                if (intBitsToFloat > 0.0f) {
                    float w0 = c1yVar.w0(4.0f);
                    k28 k28Var = c1yVar.a;
                    float a = it1Var.a(m810.b(intBitsToFloat), m810.b((Float.intBitsToFloat((int) (k28Var.c() >> 32)) - r12) - c1yVar.w0(j690Var.c(c1yVar.getLayoutDirection()))), c1yVar.getLayoutDirection()) + c1yVar.w0(j690Var.b(c1yVar.getLayoutDirection()));
                    float f = intBitsToFloat / 2.0f;
                    float f2 = a + f;
                    float f3 = (f2 - f) - w0;
                    float f4 = f3 < 0.0f ? 0.0f : f3;
                    float f5 = f2 + f + w0;
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (k28Var.c() >> 32));
                    float f6 = f5 > intBitsToFloat2 ? intBitsToFloat2 : f5;
                    float intBitsToFloat3 = Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                    float f7 = (-intBitsToFloat3) / 2.0f;
                    float f8 = intBitsToFloat3 / 2.0f;
                    nfh nfhVar = k28Var.b;
                    long v = nfhVar.v();
                    nfhVar.q().save();
                    try {
                        ((cot) nfhVar.a).f(f4, f7, f6, f8, 0);
                        c1yVar.a();
                    } finally {
                        b64.C(nfhVar, v);
                    }
                } else {
                    c1yVar.a();
                }
                return zy11.a;
            case 8:
                render$lambda$5 = PFMCalendarView.render$lambda$5((Calendar) this.b, (PFMCalendarView) this.w, (Text) this.c, (g) obj);
                return render$lambda$5;
            case 9:
                k2 k2Var = (k2) this.b;
                String str2 = (String) this.w;
                String str3 = (String) this.c;
                AuthorizationUrlProperties.a aVar3 = (AuthorizationUrlProperties.a) ((x) obj);
                aVar3.a = k2Var;
                aVar3.b = str2;
                aVar3.c = str3;
                aVar3.a();
                return zy11.a;
            case 10:
                String str4 = (String) this.w;
                Uri uri = (Uri) this.b;
                String str5 = (String) this.c;
                AuthorizationUrlProperties.a aVar4 = (AuthorizationUrlProperties.a) ((x) obj);
                aVar4.a = c.c(KPassportEnvironment.PRODUCTION, Long.parseLong(str4));
                aVar4.b = uri.toString();
                aVar4.c = str5;
                return zy11.a;
            case 11:
                String str6 = (String) this.w;
                PlusAcquisitionExperiments plusAcquisitionExperiments = (PlusAcquisitionExperiments) this.b;
                Map map = (Map) this.c;
                PlusPayAnalyticsParams.a aVar5 = (PlusPayAnalyticsParams.a) obj;
                aVar5.a = str6;
                if (plusAcquisitionExperiments == null || (testIds = plusAcquisitionExperiments.getTestIds()) == null) {
                    arrayList = null;
                } else {
                    Set<PlusAcquisitionExperiments.TestId> set = testIds;
                    arrayList = new ArrayList(tcc.n(set, 10));
                    for (PlusAcquisitionExperiments.TestId testId : set) {
                        arrayList.add(new PlusPayTestId(testId.getValue(), testId.getBucketNumber()));
                    }
                }
                aVar5.b = arrayList != null ? kotlin.collections.a.N0(arrayList) : null;
                aVar5.c = plusAcquisitionExperiments != null ? plusAcquisitionExperiments.getFlags() : null;
                for (Map.Entry entry : map.entrySet()) {
                    aVar5.d.put((String) entry.getKey(), ((String) entry.getValue()).toString());
                }
                return zy11.a;
            case 12:
                String str7 = (String) this.w;
                z0a0 z0a0Var = (z0a0) this.b;
                lea0 lea0Var = (lea0) this.c;
                CompositePaymentIconsView compositePaymentIconsView = new CompositePaymentIconsView((Context) obj, null, 0, 6, null);
                compositePaymentIconsView.setContentDescription(str7);
                if (z0a0Var != null) {
                    ((g1a0) z0a0Var).c(compositePaymentIconsView.getTopIcon(), lea0Var);
                }
                compositePaymentIconsView.setEnabled(true);
                return compositePaymentIconsView;
            case 13:
                nsa0.m((nsa0) this.b, (ChatRequest) this.w, (osa0) this.c);
                return zy11.a;
            case 14:
                nsa0.n((nsa0) this.b, (ChatRequest) this.c, (String) this.w);
                return zy11.a;
            case 15:
                i4b0 i4b0Var = (i4b0) this.b;
                z8b0 z8b0Var = (z8b0) this.w;
                z8b0 z8b0Var2 = (z8b0) this.c;
                n70 n70Var = (n70) obj;
                t8b0 t8b0Var = new t8b0(n70Var, 0);
                if (n70Var.T != null) {
                    ny61.r("onViewDetachedFromWindow { ... } is already defined. Only one onViewDetachedFromWindow { ... } is allowed.");
                    return null;
                }
                n70Var.T = t8b0Var;
                n70Var.W(new vqy(n70Var, (Object) i4b0Var, (Object) z8b0Var, (cms) z8b0Var2, 15));
                return zy11.a;
            case 16:
                n70 n70Var2 = (n70) this.b;
                fbb0 fbb0Var2 = (fbb0) this.w;
                fbb0 fbb0Var3 = (fbb0) this.c;
                j261 j261Var = (j261) n70Var2.N;
                TextView textView = j261Var.d;
                AppCompatImageView appCompatImageView = j261Var.c;
                ConstraintLayout constraintLayout = j261Var.a;
                ImageView imageView = j261Var.b;
                xty0.d(textView, ((bbb0) n70Var2.Z()).f.b);
                TextView textView2 = j261Var.d;
                ColorModel colorModel = ((bbb0) n70Var2.Z()).f.a;
                if (colorModel == null) {
                    colorModel = y390.f;
                }
                xty0.e(textView2, colorModel);
                textView2.setVisibility(d.c(((bbb0) n70Var2.Z()).f.b) ? 0 : 8);
                constraintLayout.setBackground(vng.t(((bbb0) n70Var2.Z()).c ? fyg0.ybsdk_pfm_filter_background_selected : fyg0.ybsdk_pfm_filter_background, constraintLayout.getContext()));
                PfmFilterViewItem$Content$Mode pfmFilterViewItem$Content$Mode = ((bbb0) n70Var2.Z()).g;
                rbv rbvVar = ((bbb0) n70Var2.Z()).e;
                imageView.setVisibility(rbvVar != null ? 0 : 8);
                if (rbvVar != null) {
                    v4b1.k(rbvVar, imageView, null, null, 6);
                }
                int[] iArr = oab0.a;
                int i6 = iArr[pfmFilterViewItem$Content$Mode.ordinal()];
                if (i6 == 1) {
                    pair = new Pair(Boolean.FALSE, 0);
                } else if (i6 == 2) {
                    pair = new Pair(Boolean.TRUE, Integer.valueOf(txg0.ybsdk_ic_arrow_short_bottom));
                } else {
                    if (i6 != 3) {
                        w511.b();
                        return null;
                    }
                    pair = new Pair(Boolean.TRUE, Integer.valueOf(nyg0.ybsdk_ic_cross));
                }
                boolean booleanValue = ((Boolean) pair.getFirst()).booleanValue();
                int intValue = ((Number) pair.getSecond()).intValue();
                appCompatImageView.setVisibility(booleanValue ? 0 : 8);
                appCompatImageView.setImageResource(intValue);
                int i7 = iArr[pfmFilterViewItem$Content$Mode.ordinal()];
                if (i7 == 1) {
                    i = 0;
                } else if (i7 == 2) {
                    i = abb0.e;
                } else {
                    if (i7 != 3) {
                        w511.b();
                        return null;
                    }
                    i = abb0.d;
                }
                appCompatImageView.setPadding(i, i, i, i);
                int i8 = imageView.getVisibility() == 0 ? abb0.b : textView2.getVisibility() == 0 ? abb0.a : appCompatImageView.getVisibility() == 0 ? abb0.b : abb0.a;
                int i9 = appCompatImageView.getVisibility() == 0 ? abb0.b : textView2.getVisibility() == 0 ? abb0.a : imageView.getVisibility() == 0 ? abb0.b : abb0.a;
                int i10 = abb0.c;
                constraintLayout.setPaddingRelative(i8, i10, i9, i10);
                int i11 = iArr[pfmFilterViewItem$Content$Mode.ordinal()];
                if (i11 == 1) {
                    fbb0Var = null;
                } else if (i11 == 2) {
                    fbb0Var = fbb0Var2;
                } else {
                    if (i11 != 3) {
                        w511.b();
                        return null;
                    }
                    fbb0Var = fbb0Var3;
                }
                appCompatImageView.setOnClickListener(new os3(i5, n70Var2, fbb0Var));
                constraintLayout.setOnClickListener(new fx00(i3, fbb0Var2, n70Var2));
                return zy11.a;
            case 17:
                onPermissionRequest$lambda$2 = PlusWebChromeClient.onPermissionRequest$lambda$2((PermissionRequest) this.b, (j63) this.w, (PlusWebChromeClient) this.c, (Map) obj);
                return onPermissionRequest$lambda$2;
            case 18:
                onReceivedSslError$lambda$5 = PlusWebViewClient.onReceivedSslError$lambda$5((WebView) this.b, (SslError) this.w, (PlusWebViewClient) this.c, (SslError) obj);
                return onReceivedSslError$lambda$5;
            case 19:
                ((p) this.b).c.d((zkv0) this.w, (u051) this.c, SummaryPromotionsAnalytics$SummaryState.COLLAPSED, ((Boolean) obj).booleanValue());
                return zy11.a;
            case 20:
                lambda$onCreate$0 = ((ProxyPassportActivity) this.b).lambda$onCreate$0((Bundle) this.c, (String) this.w, (kt11) obj);
                return lambda$onCreate$0;
            case 21:
                d9g0 d9g0Var = (d9g0) this.b;
                ka6 ka6Var = d9g0Var.p;
                yj1 yj1Var = d9g0Var.f;
                mgb mgbVar = (mgb) this.w;
                com.ybsdk.feature.qr.payments.internal.screens.presentation.helpers.a aVar6 = (com.ybsdk.feature.qr.payments.internal.screens.presentation.helpers.a) this.c;
                if (mgbVar.a) {
                    aVar6.e.t(QrPaymentEvents$QrPaymentCheckLoadedState.ALLOWED, mgbVar.h, yj1Var != null ? yj1Var.b : null, ka6Var != null ? ka6Var.a : null, QrPaymentEvents$QrPaymentCheckLoadedResult.OK);
                    q031Var = new l031(mgbVar.b, mgbVar.c, mgbVar.d, mgbVar.e, mgbVar.f, mgbVar.g);
                } else {
                    aVar6.e.t(QrPaymentEvents$QrPaymentCheckLoadedState.DISALLOWED, mgbVar.h, yj1Var != null ? yj1Var.b : null, ka6Var != null ? ka6Var.a : null, QrPaymentEvents$QrPaymentCheckLoadedResult.OK);
                    q031Var = new q031(mgbVar.c, mgbVar.e, mgbVar.f);
                }
                return d9g0.c(d9g0Var, null, null, null, null, null, null, q031Var, false, null, 57343);
            case 22:
                tse tseVar = (tse) this.b;
                oz40 oz40Var = (oz40) this.w;
                oz40 oz40Var2 = (oz40) this.c;
                Context context = (Context) obj;
                MtQRCameraPreview mtQRCameraPreview = new MtQRCameraPreview(context, null, 0, 0, 14, null);
                oz40Var.setValue(mtQRCameraPreview);
                oz40Var2.setValue(new com.yandex.go.masstransit.sdk.camera.ml.b(context, mtQRCameraPreview, tseVar));
                return mtQRCameraPreview;
            case 23:
                nsi0 nsi0Var = (nsi0) this.b;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.w;
                PaymentKitError paymentKitError = (PaymentKitError) this.c;
                rwo rwoVar = nsi0Var.b;
                qv90.a.getClass();
                ((y22) rwoVar).a(iho.b(sv90.e0(), null, 3));
                ref$ObjectRef.element = new hyj0(paymentKitError);
                return zy11.a;
            case 24:
                e eVar = (e) this.b;
                zii0 zii0Var = (zii0) this.w;
                tls tlsVar = (tls) this.c;
                l3y l3yVar = (l3y) obj;
                l0j0 l0j0Var = (l0j0) l3yVar;
                long b3 = l0j0Var.b();
                return Boolean.valueOf(((Boolean) eVar.h.invoke(zii0Var, wwg.b((((long) Float.floatToRawIntBits((float) ((int) (b3 >> 32)))) << 32) | (((long) Float.floatToRawIntBits((float) ((int) (b3 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)))) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), rzo.a0(l0j0Var.c())))).booleanValue() && eVar.q.contains(((t6y) l0j0Var.a).k) && ((Boolean) tlsVar.invoke(l3yVar)).booleanValue());
            case 25:
                ubj0 ubj0Var = (ubj0) this.b;
                pbj0 pbj0Var = (pbj0) this.w;
                RequirementAddressInputType requirementAddressInputType = (RequirementAddressInputType) this.c;
                String str8 = (String) obj;
                zy11 zy11Var2 = zy11.a;
                wu0 wu0Var = (wu0) ubj0Var.getItem(pbj0Var.F());
                s41 s41Var = wu0Var instanceof s41 ? (s41) wu0Var : null;
                if (s41Var != null) {
                    ubj0Var.b.invoke(requirementAddressInputType, str8, Boolean.valueOf(s41Var.a));
                }
                return zy11Var2;
            case 26:
                tls tlsVar2 = (tls) this.c;
                xlj0 xlj0Var = (xlj0) this.b;
                fgd fgdVar = (fgd) this.w;
                ((Boolean) obj).getClass();
                tlsVar2.invoke(xlj0Var);
                fgdVar.a(xlj0Var.a());
                return zy11.a;
            case 27:
                HashSet hashSet = (HashSet) this.b;
                ru.yandex.taxi.summary.requirements.list.mapper.a aVar7 = (ru.yandex.taxi.summary.requirements.list.mapper.a) this.w;
                pex0 pex0Var = (pex0) this.c;
                lmw0 lmw0Var = (lmw0) obj;
                boolean contains = hashSet.contains(lmw0Var.getName());
                String str9 = pex0Var.b;
                aVar7.b.getClass();
                return Boolean.valueOf((contains || (lmw0Var.f() || aVar7.c.a(lmw0Var, str9) || aVar7.e.a(lmw0Var))) ? false : true);
            case 28:
                return new com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.b((AccordionComponent) obj, (p9y0) this.b, (bts0) this.w, (com.yandex.go.taxi.order.details.v2.analytics.g) this.c);
            default:
                SlotItemButtonViewComponent slotItemButtonViewComponent = new SlotItemButtonViewComponent((Context) this.w, null, 0, 0, ((hrs0) ((ars0) this.b)).a, new lbb0(9, (p9y0) this.c), 14, null);
                slotItemButtonViewComponent.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                return slotItemButtonViewComponent.asView();
        }
    }

    public /* synthetic */ th40(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.w = obj2;
        this.c = obj3;
    }

    public /* synthetic */ th40(com.yandex.go.quark.dynamic.chat.b bVar, String str, Uri uri, String str2) {
        this.a = 10;
        this.w = str;
        this.b = uri;
        this.c = str2;
    }

    public /* synthetic */ th40(Object obj, Parcelable parcelable, String str, int i) {
        this.a = i;
        this.b = obj;
        this.c = parcelable;
        this.w = str;
    }

    public /* synthetic */ th40(String str, z0a0 z0a0Var, lea0 lea0Var) {
        this.a = 12;
        this.w = str;
        this.b = z0a0Var;
        this.c = lea0Var;
    }

    public /* synthetic */ th40(String str, PlusAcquisitionExperiments plusAcquisitionExperiments, Map map, ns90 ns90Var) {
        this.a = 11;
        this.w = str;
        this.b = plusAcquisitionExperiments;
        this.c = map;
    }
}
