package defpackage;

import android.view.ViewGroup;
import androidx.compose.runtime.internal.a;
import ru.yandex.taxi.design.BackButtonIconComponent;
import ru.yandex.taxi.design.CloseButtonIconComponent;
import ru.yandex.taxi.design.LocationButtonIconComponent;
import ru.yandex.taxi.widget.SlideableModalView;

/* loaded from: classes6.dex */
public abstract class qdb1 {
    public static au2 a;

    public static final void a(a aVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-709502251);
        if (btsVar.V(i & 1, (i & 3) != 2)) {
            a7u0 a7u0Var = n1m0.a;
            l1m0 l1m0Var = (l1m0) btsVar.m(a7u0Var);
            btsVar.e0(1967007413);
            Object[] objArr = new Object[0];
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new b7l0(28);
                btsVar.o0(Q);
            }
            j1m0 j1m0Var = (j1m0) cvw.W(objArr, j1m0.x, (sls) Q, btsVar, 384);
            j1m0Var.c = (l1m0) btsVar.m(a7u0Var);
            btsVar.t(false);
            Object[] objArr2 = {l1m0Var};
            tig0 tig0Var = new tig0(new w9u(26), new mgu(25, l1m0Var, j1m0Var));
            boolean e = btsVar.e(l1m0Var) | btsVar.e(j1m0Var);
            Object Q2 = btsVar.Q();
            if (e || Q2 == o430Var) {
                Q2 = new mqu(20, l1m0Var, j1m0Var);
                btsVar.o0(Q2);
            }
            e7y e7yVar = (e7y) cvw.W(objArr2, tig0Var, (sls) Q2, btsVar, 0);
            sb2.b(a7u0Var.a(e7yVar), wwg.S(-412824043, true, new s0v(10, aVar, e7yVar), btsVar), btsVar, 56);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new k2z0(i, 17, aVar);
        }
    }

    public static final BackButtonIconComponent b(SlideableModalView slideableModalView, Runnable runnable) {
        BackButtonIconComponent backButtonIconComponent = new BackButtonIconComponent(slideableModalView.getContext(), null, 0, a2i0.FloatButtonIconStyle, 4, null);
        backButtonIconComponent.setDebounceClickListener(runnable);
        backButtonIconComponent.setLayoutParams(new ViewGroup.LayoutParams(-2, tje.u(90, backButtonIconComponent.getContext())));
        slideableModalView.addFloatButton(backButtonIconComponent, 8388611);
        return backButtonIconComponent;
    }

    public static CloseButtonIconComponent c(SlideableModalView slideableModalView, Runnable runnable) {
        CloseButtonIconComponent closeButtonIconComponent = new CloseButtonIconComponent(slideableModalView.getContext(), null, a2i0.FloatButtonIconStyle);
        closeButtonIconComponent.setDebounceClickListener(runnable);
        closeButtonIconComponent.setLayoutParams(new ViewGroup.LayoutParams(-2, tje.u(90, closeButtonIconComponent.getContext())));
        slideableModalView.addFloatButton(closeButtonIconComponent, 8388613);
        return closeButtonIconComponent;
    }

    public static LocationButtonIconComponent d(SlideableModalView slideableModalView, Runnable runnable) {
        LocationButtonIconComponent locationButtonIconComponent = new LocationButtonIconComponent(slideableModalView.getContext(), null, 0, a2i0.FloatButtonIconStyle, 4, null);
        locationButtonIconComponent.setDebounceClickListener(runnable);
        locationButtonIconComponent.setLayoutParams(new ViewGroup.LayoutParams(-2, tje.u(90, locationButtonIconComponent.getContext())));
        slideableModalView.addFloatButton(locationButtonIconComponent, 8388613);
        return locationButtonIconComponent;
    }
}
