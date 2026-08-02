package defpackage;

import com.yandex.go.taxi.order.recalculation.ui.PriceRecalculationModalView;
import com.yandex.go.taxi.order.recalculation.ui.b;
import java.util.HashMap;

/* loaded from: classes14.dex */
public final /* synthetic */ class zze0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ zze0(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        b bVar = this.b;
        switch (i) {
            case 0:
                PriceRecalculationModalView.floatBackButton_delegate$lambda$0$onBackButtonPressed(bVar);
                break;
            case 1:
                PriceRecalculationModalView.onAttachedToWindow$onInitialCancelPressed(bVar);
                break;
            case 2:
                bVar.Mg();
                kdd0 kdd0Var = bVar.G;
                u8w u8wVar = (u8w) kdd0Var.b;
                u8wVar.a.a("PriceExpiredPopup.ConfirmButtonTapped", x4e.p("order_id", ((o2y0) kdd0Var.d).b().a), 2, new HashMap());
                break;
            default:
                kdd0 kdd0Var2 = bVar.G;
                x770 x770Var = (x770) kdd0Var2.c;
                x770Var.a.a("PriceNotCalculatedPopup.ConfirmButtonTapped", x4e.p("order_id", ((o2y0) kdd0Var2.d).b().a), 2, new HashMap());
                break;
        }
    }
}
