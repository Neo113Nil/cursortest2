package defpackage;

import android.view.View;
import com.yandex.go.taxi.order.rate.RateView;

/* loaded from: classes14.dex */
public final /* synthetic */ class s7i0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ RateView b;

    public /* synthetic */ s7i0(RateView rateView, int i) {
        this.a = i;
        this.b = rateView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        RateView rateView = this.b;
        switch (i) {
            case 0:
                RateView.setAccessibilityHelpers$lambda$0(rateView, view);
                break;
            case 1:
                RateView.setAccessibilityHelpers$lambda$1(rateView, view);
                break;
            case 2:
                RateView.onAttachedToWindow$lambda$0(rateView, view);
                break;
            default:
                RateView._init_$lambda$2(rateView, view);
                break;
        }
    }
}
