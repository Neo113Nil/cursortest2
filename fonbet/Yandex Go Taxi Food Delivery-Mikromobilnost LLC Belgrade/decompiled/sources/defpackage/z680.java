package defpackage;

import android.app.Activity;
import android.content.Context;
import com.yandex.go.superapp.order.multi.old.view.f;
import com.yandex.go.taxi.order.recalculation.domain.a;
import com.yandex.go.taxi.order.recalculation.ui.PriceRecalculationModalView;
import com.yandex.go.taxi.order.recalculation.ui.b;
import com.yandex.go.taxi.order.stack.OrderStackMvpView;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes14.dex */
public final class z680 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;

    public /* synthetic */ z680(f fVar, int i) {
        this.a = i;
        this.b = fVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        f fVar = this.b;
        switch (i) {
            case 0:
                f0f0 f0f0Var = (f0f0) obj;
                g0f0 g0f0Var = (g0f0) fVar.R.get();
                st0 st0Var = g0f0Var.b;
                o2y0 o2y0Var = f0f0Var.a;
                List list = f0f0Var.b;
                sue0 sue0Var = new sue0(2, f0f0Var);
                st0Var.getClass();
                o2y0Var.getClass();
                Context context = (Context) st0Var.a;
                q5z.h(context);
                yze0 yze0Var = (yze0) st0Var.b;
                q5z.h(yze0Var);
                a aVar = (a) st0Var.x;
                q5z.h(aVar);
                w4y0 w4y0Var = (w4y0) st0Var.z;
                q5z.h(w4y0Var);
                tt2 tt2Var = (tt2) st0Var.c;
                q5z.h(tt2Var);
                xdf xdfVar = (xdf) st0Var.w;
                q5z.h(xdfVar);
                Activity activity = (Activity) st0Var.A;
                q5z.h(activity);
                pho phoVar = (pho) st0Var.B;
                q5z.h(phoVar);
                kdd0 kdd0Var = new kdd0(new x770(phoVar), new u8w(phoVar), new x770(phoVar), o2y0Var);
                k7x0 k7x0Var = (k7x0) st0Var.C;
                q5z.h(k7x0Var);
                pav pavVar = (pav) st0Var.D;
                q5z.h(pavVar);
                of9 of9Var = (of9) st0Var.y;
                q5z.h(of9Var);
                g0f0Var.a.s(new PriceRecalculationModalView(context, new b(o2y0Var, list, sue0Var, yze0Var, aVar, w4y0Var, tt2Var, xdfVar, activity, kdd0Var, k7x0Var, pavVar, context, of9Var)), true);
                break;
            case 1:
                q2y0 q2y0Var = (q2y0) obj;
                ((ru.yandex.taxi.order.f) fVar.T).v0(q2y0Var.a, q2y0Var.b);
                break;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (booleanValue) {
                    ((OrderStackMvpView) fVar.Dg()).forceCollapse();
                } else if (fVar.j0) {
                    ((OrderStackMvpView) fVar.Dg()).forceAnchor();
                }
                fVar.j0 = booleanValue;
                break;
        }
        return zy11Var;
    }
}
