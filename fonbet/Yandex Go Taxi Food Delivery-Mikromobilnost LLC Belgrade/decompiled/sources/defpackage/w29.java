package defpackage;

import android.view.View;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.order.OrderFragment;

/* loaded from: classes6.dex */
public final /* synthetic */ class w29 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ w29(View view, int i) {
        this.a = i;
        this.b = view;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        boolean onViewCreated$lambda$1$0;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        View view = this.b;
        switch (i) {
            case 0:
                return c.H(view, kyh0.summary_accessibility_tariff_plus_amount_fractional, (String) obj);
            case 1:
                view.setX(((Float) obj).floatValue());
                return zy11Var;
            case 2:
                view.setY(((Float) obj).floatValue());
                return zy11Var;
            case 3:
                view.setZ(((Float) obj).floatValue());
                return zy11Var;
            case 4:
                view.setAlpha(((Float) obj).floatValue());
                return zy11Var;
            case 5:
                return Boolean.valueOf(!jl40.l((View) obj, view));
            case 6:
                mj91.e(((Integer) obj).intValue(), view);
                return zy11Var;
            case 7:
                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), ((Integer) obj).intValue());
                return zy11Var;
            case 8:
                onViewCreated$lambda$1$0 = OrderFragment.onViewCreated$lambda$1$0(view, (t1w) obj);
                return Boolean.valueOf(onViewCreated$lambda$1$0);
            case 9:
                c.D(view.getLayoutParams().width, view.getResources().getDimensionPixelSize(uug0.order_fragment_map_top_fade_height) + ((t1w) obj).b, view);
                return Boolean.FALSE;
            case 10:
                return view;
            case 11:
                ons0 ons0Var = new ons0(2, (tls) obj);
                view.addOnLayoutChangeListener(ons0Var);
                return new epo0(29, view, ons0Var);
            default:
                view.animate().setListener(null).cancel();
                return zy11Var;
        }
    }
}
