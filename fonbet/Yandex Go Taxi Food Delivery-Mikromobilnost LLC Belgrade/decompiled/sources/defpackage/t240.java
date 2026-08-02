package defpackage;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.tooling.PreviewActivity;
import androidx.constraintlayout.helper.widget.Flow;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.multimodal_route.ui.detailed_card.h;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.eatskit.internal.nativeapi.NativeApi;
import ru.yandex.taxi.logistics.sdk.tracking.impl.order_cancel_clarification.a;
import ru.yandex.taxi.masstransit.tickets.c;
import ru.yandex.taxi.masstransit.trains.checkout.model.ModalButtonResultType;
import ru.yandex.taxi.widget.ShimmeringBar;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes6.dex */
public final /* synthetic */ class t240 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ t240(tls tlsVar, rv40 rv40Var, CharSequence charSequence) {
        this.a = 15;
        this.w = tlsVar;
        this.c = rv40Var;
        this.b = charSequence;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        zy11 addAsyncMethod$lambda$0;
        zy11 parameterizedContent$lambda$1;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.b;
        Object obj4 = this.w;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                zob1.a((diu0) obj5, (tls) obj4, (f530) obj3, (fid) obj, vng.O(393));
                break;
            case 1:
                ((Integer) obj2).getClass();
                bpb1.c((List) obj5, (ety0) obj4, (f530) obj3, (fid) obj, vng.O(385));
                break;
            case 2:
                ((Integer) obj2).getClass();
                npb1.a((f530) obj3, (yte0) obj5, (c) obj4, (fid) obj, vng.O(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                rpb1.c((CharSequence) obj5, (ModalButtonResultType) obj3, (tls) obj4, (fid) obj, vng.O(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ed40.l((ud40) obj5, (aj31) obj3, (tls) obj4, (fid) obj, vng.O(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ed40.H((CharSequence) obj5, (CharSequence) obj3, (tls) obj4, (fid) obj, vng.O(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                ed40.J((gi40) obj5, (fi40) obj3, (tls) obj4, (fid) obj, vng.O(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                spb1.a((f530) obj3, (CharSequence) obj5, (tls) obj4, (fid) obj, vng.O(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                int O = vng.O(1);
                vpb1.j(O, (fid) obj, (tls) obj4, (String) obj3, (List) obj5);
                break;
            case 9:
                ((Integer) obj2).getClass();
                vpb1.c((ph40) obj5, (String) obj3, (tls) obj4, (fid) obj, vng.O(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                wpb1.g((List) obj5, (na11) obj3, (tls) obj4, (fid) obj, vng.O(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                wpb1.a((CharSequence) obj5, (na11) obj3, (tls) obj4, (fid) obj, vng.O(1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                wpb1.f((na11) obj5, (na11) obj3, (tls) obj4, (fid) obj, vng.O(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                dqb1.e((sn40) obj5, (f530) obj3, (tls) obj4, (fid) obj, vng.O(1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                h.a((zr40) obj5, (z0a0) obj3, (tls) obj4, (fid) obj, vng.O(9));
                break;
            case 15:
                tls tlsVar = (tls) obj4;
                rv40 rv40Var = (rv40) obj5;
                CharSequence charSequence = (CharSequence) obj3;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    boolean k = btsVar.k(tlsVar) | btsVar.e(rv40Var);
                    Object Q = btsVar.Q();
                    if (k || Q == did.a) {
                        Q = new ve30(20, tlsVar, rv40Var);
                        btsVar.o0(Q);
                    }
                    ohb1.b(null, false, null, (sls) Q, wwg.S(-368870473, true, new or9(12, charSequence), btsVar), btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 7);
                    break;
                }
                break;
            case 16:
                addAsyncMethod$lambda$0 = NativeApi.addAsyncMethod$lambda$0((String) obj5, (wls) obj4, (NativeApi) obj3, (String) obj, (gcn) obj2);
                break;
            case 17:
                ((Integer) obj2).getClass();
                zsb1.a((f360) obj5, (CharSequence) obj4, (CharSequence) obj3, (fid) obj, vng.O(1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                a.a((ArrayList) obj5, (wls) obj4, (f530) obj3, (fid) obj, vng.O(1));
                break;
            case 19:
                pav pavVar = (pav) obj5;
                xvq xvqVar = (xvq) obj3;
                tls tlsVar2 = (tls) obj4;
                View inflate = ((LayoutInflater) obj).inflate(uuh0.organization_preview_placeholder_item, (ViewGroup) obj2, false);
                GoFrameLayout goFrameLayout = (GoFrameLayout) inflate;
                int i2 = o6h0.image;
                GoImageView goImageView = (GoImageView) cma1.O(i2, inflate);
                if (goImageView != null) {
                    i2 = o6h0.loading_bar;
                    ShimmeringBar shimmeringBar = (ShimmeringBar) cma1.O(i2, inflate);
                    if (shimmeringBar != null) {
                        i2 = o6h0.retry_icon;
                        GoImageView goImageView2 = (GoImageView) cma1.O(i2, inflate);
                        if (goImageView2 != null) {
                            break;
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
                break;
            case 20:
                tt2 tt2Var = (tt2) obj5;
                e eVar = (e) obj3;
                tls tlsVar3 = (tls) obj4;
                View inflate2 = ((LayoutInflater) obj).inflate(uuh0.organizations_filter_block_item, (ViewGroup) obj2, false);
                int i3 = o6h0.chips;
                GoConstraintLayout goConstraintLayout = (GoConstraintLayout) cma1.O(i3, inflate2);
                if (goConstraintLayout != null) {
                    i3 = o6h0.flow;
                    Flow flow = (Flow) cma1.O(i3, inflate2);
                    if (flow != null) {
                        i3 = o6h0.title;
                        ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i3, inflate2);
                        if (listItemComponent != null) {
                            break;
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i3)));
                break;
            case 21:
                ((Integer) obj2).getClass();
                cn91.a((Bitmap) obj5, (String) obj4, (sls) obj3, (fid) obj, vng.O(1));
                break;
            case 22:
                String str = (String) obj5;
                efb0 efb0Var = (efb0) obj4;
                oz40 oz40Var = (oz40) obj3;
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else {
                    si91.b(str, ((Boolean) oz40Var.getValue()).booleanValue(), evu0.J(efb0Var.a), btsVar2, 0);
                    break;
                }
            case 23:
                ((Integer) obj2).getClass();
                yn91.b((k1c0) obj5, (m3u0) obj4, (qor) obj3, (fid) obj, vng.O(1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                yn91.a((j1c0) obj5, (wp2) obj4, (wp2) obj3, (fid) obj, vng.O(433));
                break;
            case 25:
                pav pavVar2 = (pav) obj5;
                tt2 tt2Var2 = (tt2) obj3;
                tls tlsVar4 = (tls) obj4;
                View inflate3 = ((LayoutInflater) obj).inflate(uuh0.places_booking_item, (ViewGroup) obj2, false);
                int i4 = o6h0.booking_container;
                View O2 = cma1.O(i4, inflate3);
                if (O2 == null) {
                    ny61.t("Missing required view with ID: ".concat(inflate3.getResources().getResourceName(i4)));
                    break;
                } else {
                    break;
                }
            case 26:
                ((Integer) obj2).getClass();
                gxd0.f((String) obj5, (LinkedHashMap) obj4, (wls) obj3, (fid) obj, vng.O(1));
                break;
            case 27:
                parameterizedContent$lambda$1 = PreviewActivity.setParameterizedContent$lambda$1((String) obj5, (String) obj4, (Object[]) obj3, (fid) obj, ((Integer) obj2).intValue());
                break;
            case 28:
                ((Integer) obj2).getClass();
                w8a1.a((qor) obj5, (up2) obj4, (f530) obj3, (fid) obj, vng.O(1));
                break;
            default:
                ((Integer) obj2).getClass();
                com.yandex.go.masstransit.sdk.ble.impl.qrscan.scan.ui.a.c(vng.O(385), (fid) obj, (tls) obj4, (f530) obj3, (String) obj5);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ t240(int i, Object obj, Object obj2, String str) {
        this.a = i;
        this.c = str;
        this.w = obj;
        this.b = obj2;
    }

    public /* synthetic */ t240(f530 f530Var, Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.b = f530Var;
        this.c = obj;
        this.w = obj2;
    }

    public /* synthetic */ t240(Object obj, Object obj2, tls tlsVar, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
        this.w = tlsVar;
    }

    public /* synthetic */ t240(Object obj, Object obj2, tls tlsVar, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = obj2;
        this.w = tlsVar;
    }

    public /* synthetic */ t240(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.w = obj2;
        this.b = obj3;
    }
}
