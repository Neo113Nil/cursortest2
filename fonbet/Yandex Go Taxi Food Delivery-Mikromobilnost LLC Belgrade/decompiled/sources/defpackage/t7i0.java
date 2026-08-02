package defpackage;

import com.yandex.go.taxi.order.rate.RateView;

/* loaded from: classes14.dex */
public final /* synthetic */ class t7i0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ RateView b;

    public /* synthetic */ t7i0(RateView rateView, int i) {
        this.a = i;
        this.b = rateView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        RateView rateView = this.b;
        switch (i) {
            case 0:
                RateView._init_$lambda$3(rateView);
                break;
            case 1:
                RateView.renderInfoState$lambda$0(rateView);
                break;
            case 2:
                RateView._init_$lambda$0(rateView);
                break;
            default:
                RateView._init_$lambda$1(rateView);
                break;
        }
    }
}
