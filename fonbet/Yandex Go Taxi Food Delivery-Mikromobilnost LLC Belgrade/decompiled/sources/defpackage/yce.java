package defpackage;

import androidx.compose.ui.semantics.f;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.contentcontroller.SkeletonContentControllerFactory;
import com.yandex.fintechsdk.flows.payment.kit.api.widget.PaymentKitWidget;
import com.yandex.go.places.organization.card.impl.ui.card.flex.v2.OrganizationCardPageView;
import com.yandex.go.places.organization.card.impl.ui.card.flex.v2.bottom_panel.OrganizationCardBottomPanelView;
import com.yandex.go.trusted_contacts.ui.BaseTrustedContactsModalView;
import com.yandex.mapkit.directions.carparks.CarparksLayer;
import com.yandex.mapkit.road_events.EventTag;
import com.yandex.mapkit.road_events_layer.RoadEventsLayer;
import com.yandex.passport.api.PassportAccountType;
import com.yandex.passport.api.y0;
import com.yandex.passport.internal.entities.Filter;
import defpackage.v4j0;
import kotlin.Pair;
import ru.yandex.taxi.cashback.router.c;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final /* synthetic */ class yce implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ yce(boolean z, int i) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String str;
        int i = this.a;
        p1j0 p1j0Var = p1j0.a;
        int i2 = 0;
        zy11 zy11Var = zy11.a;
        boolean z = this.b;
        switch (i) {
            case 0:
                v9e v9eVar = (v9e) obj;
                return Boolean.valueOf(z ? v9eVar.b.c() : v9eVar.b.d());
            case 1:
                String str2 = (String) obj;
                if (!z) {
                    return new pbv(str2, (ccv) null, rev.e, (dcv) null, (vfv) null, 58);
                }
                rev revVar = rev.l;
                float x = kp50.x(4);
                return new pbv(str2, (ccv) null, revVar, (dcv) null, new ufv(x, x, x, x, true), 32);
            case 2:
                f.q((mnq0) obj, z);
                return zy11Var;
            case 3:
                ((isd) obj).X0(z, null);
                return zy11Var;
            case 4:
                return Boolean.valueOf(z ? ((te7) obj).b instanceof ve7 : true);
            case 5:
                RoadEventsLayer roadEventsLayer = (RoadEventsLayer) obj;
                EventTag[] values = EventTag.values();
                int length = values.length;
                while (i2 < length) {
                    roadEventsLayer.setRoadEventVisible(values[i2], z);
                    i2++;
                }
                return zy11Var;
            case 6:
                ((v4j0.a) obj).a = !z;
                return zy11Var;
            case 7:
                ((yjv) obj).Z(z);
                return zy11Var;
            case 8:
                ((yjv) obj).Z(z);
                return zy11Var;
            case 9:
                mnq0 mnq0Var = (mnq0) obj;
                f.p(mnq0Var, 3);
                f.q(mnq0Var, z);
                return zy11Var;
            case 10:
                mnq0 mnq0Var2 = (mnq0) obj;
                f.p(mnq0Var2, 3);
                f.q(mnq0Var2, z);
                return zy11Var;
            case 11:
                mnq0 mnq0Var3 = (mnq0) obj;
                f.p(mnq0Var3, 3);
                f.q(mnq0Var3, z);
                return zy11Var;
            case 12:
                RoadEventsLayer roadEventsLayer2 = (RoadEventsLayer) obj;
                EventTag[] values2 = EventTag.values();
                int length2 = values2.length;
                while (i2 < length2) {
                    roadEventsLayer2.setRoadEventVisible(values2[i2], z);
                    i2++;
                }
                return zy11Var;
            case 13:
                ((CarparksLayer) obj).setVisible(z);
                return zy11Var;
            case 14:
                f.q((mnq0) obj, z);
                return zy11Var;
            case 15:
                OrganizationCardBottomPanelView bottomPanel = ((OrganizationCardPageView) obj).getBottomPanel();
                if (bottomPanel != null) {
                    bottomPanel.setUltimaMode(z);
                }
                return zy11Var;
            case 16:
                y0 y0Var = (y0) obj;
                if (!z) {
                    ((Filter.a) y0Var).c(PassportAccountType.PHONISH);
                }
                return zy11Var;
            case 17:
                y0 y0Var2 = (y0) obj;
                if (z) {
                    ((Filter.a) y0Var2).c(PassportAccountType.PHONISH);
                }
                return zy11Var;
            case 18:
                nrd0 nrd0Var = (nrd0) obj;
                nrd0Var.getClass();
                v2d0 v2d0Var = new v2d0();
                v2d0Var.b = z;
                qxx0 qxx0Var = new qxx0("", v2d0Var.a(), null);
                c cVar = nrd0Var.a;
                cVar.A((m950) cVar.D.get(), qxx0Var, new mo30(15, cVar));
                return zy11Var;
            case 19:
                ((PaymentKitWidget) obj).setImportantForAccessibility(z ? 0 : 4);
                return zy11Var;
            case 20:
                f.q((mnq0) obj, z);
                return zy11Var;
            case 21:
                return z ? p1j0Var : new o1j0((xgc0) ((a5g) obj).u1.get());
            case 22:
                return z ? p1j0Var : new o1j0((xgc0) ((a5g) obj).u1.get());
            case 23:
                return z ? p1j0Var : new o1j0((xgc0) ((a5g) obj).u1.get());
            case 24:
                Float f = (Float) obj;
                if (z) {
                    return new Pair(Float.valueOf(f != null ? f.floatValue() : 0.0f), Float.valueOf(1.0f));
                }
                return new Pair(Float.valueOf(f != null ? f.floatValue() : 1.0f), Float.valueOf(0.0f));
            case 25:
                gpe0 gpe0Var = (gpe0) obj;
                gpe0Var.c.setVisibility(8);
                RobotoTextView robotoTextView = gpe0Var.d;
                robotoTextView.setText(gpe0Var.a.getContext().getString(z ? kyh0.preload_launch_server_error : kyh0.preload_launch_internet_error));
                robotoTextView.setVisibility(0);
                gpe0Var.b.setVisibility(8);
                gpe0Var.e.setVisibility(0);
                return zy11Var;
            case 26:
                hh11 hh11Var = (hh11) obj;
                BaseTrustedContactsModalView baseTrustedContactsModalView = hh11Var.a;
                if (baseTrustedContactsModalView != null) {
                    BaseTrustedContactsModalView.animateShowLeftToRight$default(baseTrustedContactsModalView, null, null, 3, null);
                }
                if (z) {
                    hh11Var.b.b();
                }
                return zy11Var;
            case 27:
                str = SkeletonContentControllerFactory.get$lambda$0(z, (String) obj);
                return str;
            case 28:
                ((cne0) obj).u("ToggleState", z);
                return zy11Var;
            default:
                Float f2 = (Float) obj;
                if (z) {
                    return new Pair(Float.valueOf(f2 != null ? f2.floatValue() : 0.0f), Float.valueOf(1.0f));
                }
                return new Pair(Float.valueOf(f2 != null ? f2.floatValue() : 1.0f), Float.valueOf(0.0f));
        }
    }
}
