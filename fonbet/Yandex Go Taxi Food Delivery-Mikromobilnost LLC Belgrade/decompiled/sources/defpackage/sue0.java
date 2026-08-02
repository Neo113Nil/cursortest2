package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import androidx.camera.camera2.internal.x;
import androidx.camera.video.g;
import androidx.compose.foundation.lazy.b;
import com.yandex.go.delivery.rental_duration_selector.e;
import com.yandex.go.summary.analytics.SummaryAnalytics$ModalCloseReason;
import com.yandex.go.summary.analytics.SummaryAnalytics$ModalType;
import com.yandex.go.taxi.order.details.v2.ui.view.item.driver.RideCardDriverSectionView;
import com.yandex.go.taxi.order.models.api.feedback.TaxiOrderSelectedTipsChoiceState;
import com.yandex.go.taxi.order.models.api.feedback.TaxiOrderTipsState;
import com.yandex.go.taxi.order.models.api.response.tips.RideCardTipsChoiceDto$ZeroTipsChoiceDto;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.yandex.payment.sdk.ui.preselect.PreselectActivity;
import com.yandex.payment.sdk.ui.view.Default3DSWebView;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes13.dex */
public final class sue0 implements b88, ryj0, iqs, atq0, d4u, hcl0 {
    public final /* synthetic */ int a;
    public final Object b;

    public sue0(im90 im90Var, um90 um90Var) {
        this.a = 8;
        p370 p370Var = um90Var.a;
        im90Var.b.a.getClass();
        this.b = new um90(p370Var);
    }

    @Override // defpackage.atq0
    public Object a(byte[] bArr) {
        try {
            return ((ouf0) this.b).a(tgu.class).decode(bArr);
        } catch (IOException unused) {
            throw new RuntimeException();
        }
    }

    @Override // defpackage.atq0
    public byte[] b(Object obj) {
        return ((ouf0) this.b).a(tgu.class).encode(obj);
    }

    public void c() {
        yzx yzxVar;
        RideCardDriverSectionView rideCardDriverSectionView = (RideCardDriverSectionView) this.b;
        yzxVar = rideCardDriverSectionView.binding;
        CharSequence contentDescription = yzxVar.g.getContentDescription();
        if (contentDescription == null) {
            return;
        }
        rideCardDriverSectionView.getRootView().announceForAccessibility(contentDescription);
    }

    @Override // defpackage.b88
    public void d(Context context, qq31 qq31Var) {
        qq31Var.invoke(new Default3DSWebView(context, ((pwf) ((PreselectActivity) this.b).getBaseComponent$paymentsdk_release()).c()));
    }

    public v5c0 e() {
        return new v5c0(25, ((b) this.b).j());
    }

    public bpk0 f(RideCardTipsChoiceDto$ZeroTipsChoiceDto rideCardTipsChoiceDto$ZeroTipsChoiceDto, TaxiOrderTipsState taxiOrderTipsState, List list, boolean z) {
        String str = rideCardTipsChoiceDto$ZeroTipsChoiceDto.b;
        String str2 = (str == null || evu0.J(str)) ? null : str;
        if (str2 == null) {
            return null;
        }
        TaxiOrderSelectedTipsChoiceState taxiOrderSelectedTipsChoiceState = taxiOrderTipsState.d;
        boolean z2 = (taxiOrderSelectedTipsChoiceState != null && taxiOrderSelectedTipsChoiceState.a == TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsChoiceType.ZERO_CHOICE && jl40.l(taxiOrderSelectedTipsChoiceState.c, "0")) || (z && taxiOrderTipsState.d == null);
        ((rck0) this.b).getClass();
        return new bpk0(str2, z2, dbk0.a, str2, null, rck0.a(list, z2));
    }

    public pqk0 g(Drawable drawable, pox0 pox0Var) {
        pdc pdcVar = (pdc) this.b;
        if (pox0Var instanceof jhc0) {
            return ihc0.a;
        }
        if (pox0Var instanceof khs0) {
            return new uqk0(drawable);
        }
        if (!(pox0Var instanceof o5v)) {
            w511.b();
            return null;
        }
        o5v o5vVar = (o5v) pox0Var;
        return new vqk0(drawable, ((ufu) pdcVar).e(o5vVar.b), ((ufu) pdcVar).i(o5vVar.c), ((ufu) pdcVar).i(o5vVar.d));
    }

    public void h(SummaryAnalytics$ModalType summaryAnalytics$ModalType, String str, SummaryAnalytics$ModalCloseReason summaryAnalytics$ModalCloseReason) {
        xcv0 xcv0Var = (xcv0) this.b;
        HashMap q = tse0.q(xcv0Var);
        q.put("modal_type", summaryAnalytics$ModalType.getEventValue());
        q.put("requirement_id", str);
        q.put("close_reason", summaryAnalytics$ModalCloseReason.getEventValue());
        xcv0Var.a.a("Summary.Requirement.OptionSelection.Modal.Closed", q, 1, new HashMap());
    }

    @Override // defpackage.ryj0
    public void i(Object obj) {
        ((wve0) this.b).B.l(new lve0(true, (PaymentKitError) obj));
    }

    public void j(SummaryAnalytics$ModalType summaryAnalytics$ModalType, String str, List list, String str2, String str3, String str4) {
        xcv0 xcv0Var = (xcv0) this.b;
        List list2 = list;
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            String str5 = ((vcv0) it.next()).c;
            if (str5 != null) {
                arrayList.add(str5);
            }
        }
        HashMap q = tse0.q(xcv0Var);
        q.put("modal_type", summaryAnalytics$ModalType.getEventValue());
        q.put("requirement_id", str);
        ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((vcv0) it2.next()).d);
        }
        q.put("sections", arrayList2);
        q.put("selected_options", arrayList);
        q.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, str2);
        q.put("vertical_id", str3);
        if (str4 != null) {
            q.put("alt_type", str4);
        }
        xcv0Var.a.a("Summary.Requirement.OptionSelection.Modal.Shown", q, 1, new HashMap());
    }

    public void k(SummaryAnalytics$ModalType summaryAnalytics$ModalType, String str, String str2, boolean z, int i, String str3, String str4, String str5) {
        xcv0 xcv0Var = (xcv0) this.b;
        HashMap q = tse0.q(xcv0Var);
        q.put("modal_type", summaryAnalytics$ModalType.getEventValue());
        q.put("requirement_id", str);
        q.put(PlusAcquisitionSmartOffer.Texts.OPTION_PREFIX, str2);
        q.put("is_selected", Boolean.valueOf(z));
        q.put("section_index", Integer.valueOf(i + 1));
        q.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, str3);
        q.put("vertical_id", str4);
        if (str5 != null) {
            q.put("alt_type", str5);
        }
        xcv0Var.a.a("Summary.Requirement.OptionSelection.Modal.OptionTapped", q, 1, new HashMap());
    }

    public aoi l(yxf0 yxf0Var) {
        wrr wrrVar = (wrr) this.b;
        l6g l6gVar = new l6g(wrrVar, 4);
        int i = 1;
        l6g l6gVar2 = new l6g(wrrVar, i);
        m6g m6gVar = new m6g(i, yxf0Var);
        int i2 = 0;
        m6g m6gVar2 = new m6g(i2, yxf0Var);
        azi0 azi0Var = (azi0) i5m.b(new vfg0(l6gVar, i5m.b(new vfg0(l6gVar2, i5m.b(new cta0((xvf0) m6gVar, (xvf0) m6gVar2, (xvf0) new jzi0(i2, new l6g(wrrVar, 5)), (xvf0) new l6g(wrrVar, 3), (xvf0) new kxb0(new l6g(wrrVar, i2), 29), 14)), new l6g(wrrVar, 6), new l6g(wrrVar, 2), 5, false)), m6gVar2, m6gVar, 4, false)).get();
        qcp0 qcp0Var = azi0Var.a;
        hzi0 hzi0Var = azi0Var.b;
        gzi0 gzi0Var = azi0Var.c;
        e eVar = azi0Var.d;
        qcp0Var.getClass();
        return new aoi(hzi0Var, gzi0Var, eVar);
    }

    public void m(boolean z) {
        yzx yzxVar;
        yzxVar = ((RideCardDriverSectionView) this.b).binding;
        c.y(yzxVar.g, z);
        c.y(yzxVar.f, z);
    }

    public void n(boolean z) {
        yzx yzxVar;
        yzx yzxVar2;
        RideCardDriverSectionView rideCardDriverSectionView = (RideCardDriverSectionView) this.b;
        yzxVar = rideCardDriverSectionView.binding;
        if (yzxVar.c.getVisibility() == 0) {
            yzxVar2 = rideCardDriverSectionView.binding;
            yzxVar2.d.setVisibility(z ? 0 : 8);
        }
    }

    public void o(tls tlsVar) {
        r0 r0Var;
        Object value;
        g9g0 g9g0Var;
        com.ybsdk.feature.qr.payments.internal.screens.presentation.b bVar = (com.ybsdk.feature.qr.payments.internal.screens.presentation.b) this.b;
        d9g0 b = qca1.b((h9g0) bVar.X());
        if (b == null) {
            return;
        }
        pz40 Y = bVar.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
            g9g0Var = ((h9g0) value).a;
            if (g9g0Var instanceof f9g0) {
                g9g0Var = (f9g0) tlsVar.invoke(b);
            }
        } while (!r0Var.k(value, new h9g0(g9g0Var)));
    }

    @Override // defpackage.iqs
    public void onFailure(Throwable th) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 3:
                sgb1.e("ProcessingCaptureSession", "open session failed ", th);
                x xVar = (x) obj;
                xVar.close();
                xVar.release();
                break;
            default:
                g gVar = (g) obj;
                d6z.y("In-progress recording shouldn't be null", gVar.r != null);
                if (!gVar.r.E) {
                    sgb1.g(3, "Recorder");
                    gVar.i(gVar.D == null ? 8 : 6, th);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ryj0
    public void onSuccess(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 1:
                ((wve0) obj2).B.l(new pve0(true));
                break;
            case 2:
            default:
                sgb1.g(3, "Recorder");
                g gVar = (g) obj2;
                gVar.i(gVar.V, gVar.W);
                break;
            case 3:
                break;
        }
    }

    public sue0(wbz0 wbz0Var, SharedPreferences sharedPreferences) {
        this.a = 14;
        this.b = wbz0Var;
    }

    public /* synthetic */ sue0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
