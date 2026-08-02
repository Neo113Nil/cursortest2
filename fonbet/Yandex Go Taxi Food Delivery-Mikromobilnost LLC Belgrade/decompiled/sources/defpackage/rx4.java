package defpackage;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import com.yandex.go.navigator.rate_route.d;
import com.yandex.go.navigator.rate_route.e;
import com.yandex.go.safety.center.contacts.b;
import com.yandex.go.scooters.offers.v2.surge.info.f;
import com.yandex.payment.sdk.core.data.BrowserCard;
import com.yandex.payment.sdk.core.data.GooglePayAllowedCardNetworks;
import com.yandex.payment.sdk.core.data.GooglePayData;
import com.yandex.payment.sdk.core.data.PaymentMethodsFilter;
import com.yandex.xplat.payment.sdk.PaymentMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.logistics.safe_flow.a;
import ru.yandex.taxi.n;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.scooters.data.g;

/* loaded from: classes13.dex */
public final class rx4 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final n3w e;

    public rx4(ox4 ox4Var, xvf0 xvf0Var, n3w n3wVar, n3w n3wVar2, n3w n3wVar3) {
        this.a = 0;
        this.b = xvf0Var;
        this.c = n3wVar;
        this.d = n3wVar2;
        this.e = n3wVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yvf0
    public final Object get() {
        int i;
        int i2 = this.a;
        int i3 = 1;
        xvf0 xvf0Var = this.d;
        xvf0 xvf0Var2 = this.c;
        xvf0 xvf0Var3 = this.b;
        n3w n3wVar = this.e;
        switch (i2) {
            case 0:
                yvt yvtVar = (yvt) xvf0Var3.get();
                boolean booleanValue = ((Boolean) xvf0Var2.get()).booleanValue();
                List list = (List) xvf0Var.get();
                PaymentMethodsFilter paymentMethodsFilter = (PaymentMethodsFilter) n3wVar.a;
                o9a0 o9a0Var = new o9a0();
                twd twdVar = new twd(i3, yvtVar);
                ArrayList arrayList = o9a0Var.a;
                arrayList.add(twdVar);
                arrayList.add(new twd(2, znb1.i(paymentMethodsFilter)));
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    PaymentMethod f = znb1.f((BrowserCard) it.next());
                    if (f != null) {
                        arrayList2.add(f);
                    }
                }
                arrayList.add(new twd(r2, new ArrayList(arrayList2)));
                arrayList.add(new wxn(booleanValue));
                return o9a0Var;
            case 1:
                return new qy9((w030) xvf0Var3.get(), (fva0) xvf0Var2.get(), (gy9) xvf0Var.get(), (oy9) n3wVar.a);
            case 2:
                return new k1a((fva0) xvf0Var3.get(), (w030) xvf0Var2.get(), (d1a) xvf0Var.get(), (i1a) n3wVar.a);
            case 3:
                return new f28(xvf0Var2.get(), xvf0Var.get(), (w030) xvf0Var3.get(), n3wVar.a, 1);
            case 4:
                return new f28(xvf0Var2.get(), xvf0Var.get(), (w030) xvf0Var3.get(), n3wVar.a, 2);
            case 5:
                return new a((tj60) xvf0Var3.get(), (tni) xvf0Var2.get(), (mni) n3wVar.a, (wiq0) xvf0Var.get());
            case 6:
                x6w0 x6w0Var = (x6w0) xvf0Var3.get();
                y8w0 y8w0Var = (y8w0) xvf0Var2.get();
                rvq0 rvq0Var = (rvq0) xvf0Var.get();
                bp90 bp90Var = (bp90) n3wVar.a;
                return new n(x6w0Var, y8w0Var.a, new jdj(22, (fva0) y8w0Var.e.a.a.get(), bp90Var, x6w0Var.a), y8w0Var.b, y8w0Var.c, new vbb((ibw0) y8w0Var.d.a.a.get(), x6w0Var.a), rvq0Var, bp90Var, y8w0Var.f);
            case 7:
                return new sts((w030) xvf0Var3.get(), (fus) xvf0Var2.get(), (kus) n3wVar.a, (tus) xvf0Var.get(), 0);
            case 8:
                return new xvt((GooglePayData) xvf0Var3.get(), (tw4) xvf0Var2.get(), (pcy) xvf0Var.get(), (GooglePayAllowedCardNetworks) n3wVar.a);
            case 9:
                return new kk5((w030) xvf0Var3.get(), (urx) xvf0Var2.get(), (xrx) n3wVar.a, (r6r0) xvf0Var.get(), 3);
            case 10:
                return new wnz((unz) xvf0Var3.get(), (znz) n3wVar.a, (w030) xvf0Var2.get(), (eb50) xvf0Var.get());
            case 11:
                return new k1a((w030) xvf0Var3.get(), (Context) xvf0Var2.get(), (p340) xvf0Var.get(), (t340) n3wVar.a);
            case 12:
                return new kk5((w030) xvf0Var3.get(), (k0b0) xvf0Var2.get(), (be50) xvf0Var.get(), (yd50) n3wVar.a, 6);
            case 13:
                return new tm50((gm50) n3wVar.a, (b00) xvf0Var3.get(), (hff) xvf0Var2.get(), (qp90) xvf0Var.get());
            case 14:
                return new e((q7i0) xvf0Var3.get(), (l7i0) n3wVar.a, (d) xvf0Var2.get(), (w030) xvf0Var.get());
            case 15:
                boolean booleanValue2 = ((Boolean) xvf0Var3.get()).booleanValue();
                o2y0 o2y0Var = (o2y0) xvf0Var2.get();
                ps70 ps70Var = (ps70) xvf0Var.get();
                AccessibilityManager accessibilityManager = (AccessibilityManager) n3wVar.a;
                DriveState c = o2y0Var.c();
                r2 = c == DriveState.COMPLETE ? 1 : 0;
                boolean contains = ((ArrayList) kotlin.collections.a.M(((qs70) ps70Var).a().d)).contains(c);
                if (r2 != 0) {
                    i = 7;
                } else if (booleanValue2) {
                    i = 4;
                } else {
                    i = 3;
                    if (!contains && !accessibilityManager.isTouchExplorationEnabled()) {
                        i = 6;
                    }
                }
                return new ykk0(Integer.valueOf(i), r2 ^ 1, false, Float.valueOf(0.4f), Float.valueOf(0.15f), true);
            case 16:
                return new sts((w030) xvf0Var3.get(), (lvk0) xvf0Var2.get(), (nvk0) n3wVar.a, i5m.a(xvf0Var), 1);
            case 17:
                return new b((ng11) xvf0Var3.get(), xvf0Var2, (drl0) n3wVar.a, (w030) xvf0Var.get());
            case 18:
                return new v0n0((yhr) xvf0Var3.get(), (i0n0) xvf0Var2.get(), (com.yandex.go.scooters.bdui.data.a) xvf0Var.get(), (w0n0) n3wVar.a);
            case 19:
                return new kdd0((Context) xvf0Var3.get(), (fva0) xvf0Var2.get(), (ban0) xvf0Var.get(), (n9n0) n3wVar.a);
            case 20:
                return new c0o0(xvf0Var3, (xzn0) xvf0Var2.get(), (czn0) xvf0Var.get(), (a0o0) n3wVar.a);
            case 21:
                return new f28(xvf0Var2.get(), xvf0Var.get(), (w030) xvf0Var3.get(), n3wVar.a, 10);
            case 22:
                return new vdm((Object) this.c, (Object) this.d, (w030) xvf0Var3.get(), n3wVar.a, 2);
            case 23:
                return new vdm(xvf0Var2.get(), xvf0Var.get(), (w030) xvf0Var3.get(), n3wVar.a, 3);
            case 24:
                return new ru.yandex.taxi.scooters.presentation.route_navigation.domain.a((po21) xvf0Var3.get(), (g) xvf0Var2.get(), (el00) xvf0Var.get(), (g311) n3wVar.a);
            case 25:
                return new f28(xvf0Var2.get(), xvf0Var.get(), (w030) xvf0Var3.get(), n3wVar.a, 12);
            case 26:
                return new f((w030) xvf0Var3.get(), (fva0) xvf0Var2.get(), (j3p0) xvf0Var.get(), (m3p0) n3wVar.a);
            case 27:
                return new ru.yandex.taxi.summary.solid.preview_card.di.a(xvf0Var3, (p8e0) n3wVar.a, (aev0) xvf0Var2.get(), (ru.yandex.taxi.modal.popup.ui.model.a) xvf0Var.get());
            case 28:
                return new s0w0((w030) xvf0Var3.get(), (ktv0) xvf0Var2.get(), (r0w0) xvf0Var.get(), (o0w0) n3wVar.a);
            default:
                ekx0 ekx0Var = (ekx0) n3wVar.a;
                return new ykx0(ekx0Var);
        }
    }

    public /* synthetic */ rx4(xvf0 xvf0Var, n3w n3wVar, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.e = n3wVar;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
    }

    public /* synthetic */ rx4(xvf0 xvf0Var, xvf0 xvf0Var2, n3w n3wVar, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.e = n3wVar;
        this.d = xvf0Var3;
    }

    public /* synthetic */ rx4(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, n3w n3wVar, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = n3wVar;
    }

    public /* synthetic */ rx4(n3w n3wVar, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.e = n3wVar;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
    }
}
