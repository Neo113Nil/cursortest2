package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.compose.foundation.lazy.b;
import androidx.fragment.app.Fragment;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.CardInputMainView;
import com.yandex.go.masstransit.sdk.ble.api.analytics.BlePermissionRequestReason;
import com.yandex.go.order.bundle.map.impl.ui.BundledOrderListView;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.messaging.internal.view.custom.ProgressIndicator;
import com.yandex.messaging.internal.view.timeline.c;
import com.yandex.payment.sdk.core.data.BoundCard;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.yandex.payment.sdk.flex.impl.customview.views.cardinput.CardInputView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.Action;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.masstransit.analytic.MasstransitPaymentAnalytics$BlePermissionRequestReason;
import ru.yandex.taxi.preorder.source.domain.d;
import ru.yandex.taxi.search.presenter.e;
import ru.yandex.taxi.search.presenter.f;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class xw4 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xw4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        MasstransitPaymentAnalytics$BlePermissionRequestReason masstransitPaymentAnalytics$BlePermissionRequestReason;
        r0 r0Var;
        Object value;
        Object t8j0Var;
        r0 r0Var2;
        Object value2;
        Object t8j0Var2;
        r0 r0Var3;
        Object value3;
        Object t8j0Var3;
        int i = 1;
        switch (this.a) {
            case 0:
                ((jtj0) obj).a((e) this.b);
                break;
            case 1:
                ru.yandex.taxi.address.experiment.e eVar = (ru.yandex.taxi.address.experiment.e) obj;
                f fVar = (f) this.b;
                if (eVar != null) {
                    ((j61) fVar.Dg()).na(eVar);
                } else {
                    ((j61) fVar.Dg()).fg();
                }
                break;
            case 2:
                ((c) this.b).P0 = (x4b0) obj;
                break;
            case 3:
                float floatValue = ((Number) obj).floatValue();
                ((e75) ((g75) ((com.yandex.go.places.base.ui.modals.map.c) this.b).Dg())).b(floatValue, (floatValue == 0.0f ? 1 : 0) ^ 1);
                break;
            case 4:
                ((com.yandex.messaging.internal.view.timeline.e) this.b).q0((j3b) obj);
                break;
            case 5:
                if (((Action) obj) == Action.RETRY) {
                    ((a) this.b).k();
                }
                break;
            case 6:
                hm31 hm31Var = (hm31) obj;
                com.yandex.messaging.internal.view.timeline.f fVar2 = (com.yandex.messaging.internal.view.timeline.f) this.b;
                ImageView imageView = fVar2.X2;
                ProgressIndicator progressIndicator = fVar2.V2;
                if (hm31Var instanceof gm31) {
                    fVar2.T2.setImageDrawable(null);
                    progressIndicator.setVisibility(8);
                    if (imageView != null) {
                        imageView.setVisibility(8);
                    }
                    fVar2.N3 = false;
                } else if (hm31Var instanceof dm31) {
                    ProgressIndicator.setLoadingState$default(progressIndicator, 0, 1, null);
                    progressIndicator.setVisibility(0);
                    if (imageView != null) {
                        imageView.setVisibility(8);
                    }
                    fVar2.N3 = false;
                } else if (!(hm31Var instanceof fm31)) {
                    if (!(hm31Var instanceof em31)) {
                        w511.b();
                        break;
                    } else {
                        progressIndicator.setVisibility(8);
                        if (imageView != null) {
                            imageView.setVisibility(8);
                        }
                        fVar2.N3 = false;
                    }
                } else if (fVar2.k0) {
                    progressIndicator.setVisibility(8);
                    if (imageView != null) {
                        imageView.setVisibility(0);
                    }
                    fVar2.N3 = true;
                } else {
                    ProgressIndicator.setLoadingState$default(progressIndicator, 0, 1, null);
                    progressIndicator.setVisibility(0);
                    if (imageView != null) {
                        imageView.setVisibility(8);
                    }
                    fVar2.N3 = false;
                }
                break;
            case 7:
                Object value4 = ((Result) obj).getValue();
                com.yandex.payment.sdk.datasource.bind.a aVar = (com.yandex.payment.sdk.datasource.bind.a) this.b;
                if (!(value4 instanceof Result.Failure)) {
                    BoundCard boundCard = (BoundCard) value4;
                    ol41 ol41Var = aVar.e;
                    if (ol41Var != null) {
                        ol41Var.c(kl41.a);
                    }
                    on8 on8Var = aVar.f;
                    if (on8Var != null) {
                        on8Var.b(new ln8(boundCard));
                    }
                }
                Throwable a = Result.a(value4);
                if (a != null) {
                    aVar.c((PaymentKitError) a);
                }
                break;
            case 8:
                BlePermissionRequestReason blePermissionRequestReason = (BlePermissionRequestReason) obj;
                b36 b36Var = (b36) this.b;
                if (blePermissionRequestReason != null && b36Var.b.add(blePermissionRequestReason)) {
                    n310 n310Var = b36Var.a.a;
                    int i2 = o310.b[blePermissionRequestReason.ordinal()];
                    if (i2 == 1) {
                        masstransitPaymentAnalytics$BlePermissionRequestReason = MasstransitPaymentAnalytics$BlePermissionRequestReason.LocationPermission;
                    } else if (i2 == 2) {
                        masstransitPaymentAnalytics$BlePermissionRequestReason = MasstransitPaymentAnalytics$BlePermissionRequestReason.BluetoothPermission;
                    } else if (i2 == 3) {
                        masstransitPaymentAnalytics$BlePermissionRequestReason = MasstransitPaymentAnalytics$BlePermissionRequestReason.BluetoothDisabled;
                    } else if (i2 != 4) {
                        w511.b();
                        break;
                    } else {
                        masstransitPaymentAnalytics$BlePermissionRequestReason = MasstransitPaymentAnalytics$BlePermissionRequestReason.Other;
                    }
                    n310Var.getClass();
                    HashMap hashMap = new HashMap();
                    hashMap.put(CRLReasonCodeExtension.REASON, masstransitPaymentAnalytics$BlePermissionRequestReason.getEventValue());
                    n310Var.a.a("MasstransitPayment.BleVehicles.PermissionRequestShown", hashMap, 1, new HashMap());
                }
                break;
            case 9:
                ((tc6) this.b).uc((hd6) obj);
                break;
            case 10:
                d dVar = (d) this.b;
                hl60 hl60Var = (hl60) obj;
                if (hl60Var != null && !dVar.a.a && dVar.c.g()) {
                    ((pep0) dVar.f).f((m950) dVar.b.get(), hl60Var, hxx.a);
                    pj pjVar = dVar.e;
                    pjVar.getClass();
                    pjVar.a.a("BridgeNotification.Shown", new HashMap(), 1, new HashMap());
                    dVar.a.a = true;
                }
                break;
            case 11:
                qp6 qp6Var = (qp6) obj;
                com.ybsdk.feature.transfer.version2.internal.screens.budget.presentation.search.a aVar2 = (com.ybsdk.feature.transfer.version2.internal.screens.budget.presentation.search.a) this.b;
                int i3 = hp6.a[qp6Var.a.ordinal()];
                if (i3 == 1) {
                    aVar2.G.s(null, true);
                    String str = qp6Var.c;
                    if (str != null) {
                        h791.e(aVar2.E, str, false, null, 14);
                    }
                } else if (i3 == 2) {
                    pz40 Y = aVar2.Y();
                    do {
                        r0Var = (r0) Y;
                        value = r0Var.getValue();
                        u8j0 u8j0Var = (u8j0) value;
                        if (u8j0Var instanceof r8j0) {
                            r8j0 r8j0Var = (r8j0) u8j0Var;
                            t8j0Var = new r8j0(dp6.a((dp6) r8j0Var.a, qp6Var), r8j0Var.b, r8j0Var.c, r8j0Var.d);
                        } else if (u8j0Var instanceof s8j0) {
                            t8j0Var = new s8j0(((s8j0) u8j0Var).a);
                        } else if (!(u8j0Var instanceof t8j0)) {
                            w511.b();
                            break;
                        } else {
                            t8j0Var = new t8j0();
                        }
                    } while (!r0Var.k(value, t8j0Var));
                } else if (i3 == 3) {
                    m04 m04Var = aVar2.G;
                    q8u0 q8u0Var = qp6Var.b;
                    m04Var.s(q8u0Var != null ? q8u0Var.b : null, false);
                    pz40 Y2 = aVar2.Y();
                    do {
                        r0Var2 = (r0) Y2;
                        value2 = r0Var2.getValue();
                        u8j0 u8j0Var2 = (u8j0) value2;
                        if (u8j0Var2 instanceof r8j0) {
                            r8j0 r8j0Var2 = (r8j0) u8j0Var2;
                            t8j0Var2 = new r8j0(dp6.a((dp6) r8j0Var2.a, qp6Var), r8j0Var2.b, r8j0Var2.c, r8j0Var2.d);
                        } else if (u8j0Var2 instanceof s8j0) {
                            t8j0Var2 = new s8j0(((s8j0) u8j0Var2).a);
                        } else if (!(u8j0Var2 instanceof t8j0)) {
                            w511.b();
                            break;
                        } else {
                            t8j0Var2 = new t8j0();
                        }
                    } while (!r0Var2.k(value2, t8j0Var2));
                } else if (i3 != 4) {
                    w511.b();
                    break;
                } else {
                    aVar2.G.s("timeout", false);
                    pz40 Y3 = aVar2.Y();
                    do {
                        r0Var3 = (r0) Y3;
                        value3 = r0Var3.getValue();
                        u8j0 u8j0Var3 = (u8j0) value3;
                        if (u8j0Var3 instanceof r8j0) {
                            r8j0 r8j0Var3 = (r8j0) u8j0Var3;
                            t8j0Var3 = new r8j0(dp6.a((dp6) r8j0Var3.a, qp6Var), r8j0Var3.b, r8j0Var3.c, r8j0Var3.d);
                        } else if (u8j0Var3 instanceof s8j0) {
                            t8j0Var3 = new s8j0(((s8j0) u8j0Var3).a);
                        } else if (!(u8j0Var3 instanceof t8j0)) {
                            w511.b();
                            break;
                        } else {
                            t8j0Var3 = new t8j0();
                        }
                    } while (!r0Var3.k(value3, t8j0Var3));
                }
                break;
            case 12:
                ((BundledOrderListView) this.b).showOrders((List) obj);
                break;
            case 13:
                Pair pair = (Pair) obj;
                List list = (List) pair.getFirst();
                List list2 = (List) pair.getSecond();
                ((com.yandex.go.order.bundle.map.impl.ui.e) this.b).h = list;
                ((com.yandex.go.order.bundle.map.impl.ui.e) this.b).f.emit(list2, continuation);
                zy11 zy11Var = zy11.a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                break;
            case 14:
                int intValue = ((Number) obj).intValue();
                bv6 bv6Var = (bv6) this.b;
                bv6Var.C = intValue;
                if (bv6Var.B) {
                    bv6Var.b();
                }
                break;
            case 15:
                ((hw6) this.b).setStories((List) obj);
                break;
            case 16:
                com.yandex.messaging.internal.view.timeline.suggest.c.y0((com.yandex.messaging.internal.view.timeline.suggest.c) this.b);
                break;
            case 17:
                ((e08) ((j08) this.b).Dg()).render((p08) obj);
                break;
            case 18:
                p58 p58Var = (p58) this.b;
                HashMap hashMap2 = p58Var.g;
                if (hashMap2.values().isEmpty()) {
                    p58Var.d.b.clear();
                }
                Collection values = hashMap2.values();
                ArrayList arrayList = new ArrayList(tcc.n(values, 10));
                Iterator it = values.iterator();
                while (it.hasNext()) {
                    arrayList.add(((n58) it.next()).d.a);
                }
                Iterator it2 = kotlin.collections.a.N0(arrayList).iterator();
                while (it2.hasNext()) {
                    p58Var.e.b((String) it2.next(), true);
                }
                p58Var.i.h(-1);
                for (n58 n58Var : hashMap2.values()) {
                    n58Var.d(n58Var.d);
                }
                break;
            case 19:
                q58 q58Var = (q58) obj;
                s58 s58Var = (s58) this.b;
                IconStyle iconStyle = s58Var.l;
                xm00 xm00Var = s58Var.b;
                zzs zzsVar = q58Var.a;
                int i4 = q58Var.c;
                if (zzsVar != null && q58Var.b && i4 > 1) {
                    if (s58Var.n == null) {
                        f4c0 f4c0Var = new f4c0(new Point(), null, 6);
                        RobotoTextView robotoTextView = new RobotoTextView(s58Var.c, null, 0, 6, null);
                        robotoTextView.setUseMinimumWidth(true);
                        robotoTextView.setText(q58Var.d);
                        Context context = s58Var.c;
                        robotoTextView.setTextColor(context.getColor(mqg0.component_black));
                        robotoTextView.setTextSize(13.0f);
                        robotoTextView.setTextAlignment(4);
                        tp11.b(0, robotoTextView);
                        robotoTextView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                        fn6 fn6Var = new fn6(new Canvas(), context, false);
                        ((LinearLayout) fn6Var.e).addView(robotoTextView);
                        fn6Var.b = ((View) fn6Var.d).getContext().getDrawable(l4h0.ic_bubble_car_number);
                        fn6Var.g = new t26(i, fn6Var, new wa60(0.05f, 0.95f, 0.02f, 0.8f), new wa60[]{new wa60(0.11f, 0.89f, 0.33f, 0.44f)});
                        f4c0Var.x(fn6Var.d().b());
                        f4c0Var.g(new r58(r6, s58Var));
                        f4c0Var.k(q58Var.e);
                        s58Var.n = f4c0Var;
                    }
                    f4c0 f4c0Var2 = s58Var.n;
                    if (f4c0Var2 == null) {
                        ny61.g("Required value was null.");
                        break;
                    } else {
                        zzs zzsVar2 = q58Var.a;
                        if (zzsVar2 == null) {
                            ny61.g("Required value was null.");
                            break;
                        } else {
                            Polyline polyline = ru.yandex.taxi.map.utils.a.b;
                            Point point = new Point(zzsVar2.a, zzsVar2.b);
                            float q = f4c0Var2.q();
                            iconStyle.setAnchor(new PointF(0.5f, ((Math.min(1.0f, Math.max(0.6f, ((gh00) s58Var.d).j() / 18.0f)) * ((i4 - q) / 2.0f)) / q) + 0.5f));
                            f4c0Var2.D(iconStyle);
                            f4c0Var2.i(true);
                            f4c0Var2.o(point);
                            f4c0Var2.b(xm00Var);
                        }
                    }
                } else {
                    f4c0 f4c0Var3 = s58Var.n;
                    if (f4c0Var3 != null) {
                        xm00Var.o(f4c0Var3);
                    }
                    s58Var.n = null;
                    s58Var.o = null;
                    s58Var.p = null;
                }
                break;
            case 20:
                ((CardInputMainView) this.b).render((sg8) obj);
                break;
            case 21:
                ((CardInputView) this.b).render((rg8) obj);
                break;
            case 22:
                ((ru.yandex.taxi.logistics.sdk.webview.impl.ui.a) ((wm41) this.b)).b.evaluateJavascript((String) obj, null);
                break;
            case 23:
                b bVar = (b) this.b;
                kx8 kx8Var = (kx8) obj;
                if (kx8Var instanceof ix8) {
                    Object i5 = com.yandex.go.summary.ui.compose.common.animation.c.i(bVar, ((ix8) kx8Var).a, 0, continuation);
                    if (i5 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    }
                } else if (!jl40.l(kx8Var, jx8.a)) {
                    w511.b();
                    break;
                } else {
                    Object i6 = com.yandex.go.summary.ui.compose.common.animation.c.i(bVar, 0, 0, continuation);
                    if (i6 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    }
                }
                break;
            case 24:
                ((xz8) ((c09) this.b).Dg()).gc((Map) obj);
                break;
            case 25:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                g09 g09Var = (g09) this.b;
                if (booleanValue) {
                    l9s l9sVar = g09Var.l;
                    if (l9sVar.b) {
                        l9sVar.b = false;
                        if (l9sVar.a) {
                            ((cl11) l9sVar.c).onPause();
                        }
                    }
                } else {
                    l9s l9sVar2 = g09Var.l;
                    if (!l9sVar2.b) {
                        l9sVar2.b = true;
                        if (l9sVar2.a) {
                            ((cl11) l9sVar2.c).onResume();
                        }
                    }
                }
                break;
            case 26:
                ((com.yandex.go.cartech.navigation.b) this.b).K.f(new um3(Events$Zalogin$LoginContext.CAR_TECH, (nk3) obj, false, false, 28));
                break;
            case 27:
                r40 r40Var = (r40) obj;
                ((Fragment) this.b).onActivityResult(r40Var.b, r40Var.a, r40Var.c);
                break;
            case 28:
                com.yandex.go.taxi.order.change.source.mvp.d dVar2 = (com.yandex.go.taxi.order.change.source.mvp.d) this.b;
                dVar2.Lg(dVar2.J);
                break;
            default:
                ((cn9) this.b).render((in9) obj);
                break;
        }
        return zy11.a;
    }
}
