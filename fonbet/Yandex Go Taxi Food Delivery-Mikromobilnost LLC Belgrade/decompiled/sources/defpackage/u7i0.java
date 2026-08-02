package defpackage;

import com.yandex.go.taxi.order.rate.RateView;

/* loaded from: classes14.dex */
public final /* synthetic */ class u7i0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ RateView b;

    public /* synthetic */ u7i0(RateView rateView, int i) {
        this.a = i;
        this.b = rateView;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 _init_$lambda$4;
        zy11 _init_$lambda$5;
        zy11 onAttachedToWindow$lambda$2;
        int i = this.a;
        RateView rateView = this.b;
        switch (i) {
            case 0:
                _init_$lambda$4 = RateView._init_$lambda$4(rateView, (fpf0) obj);
                return _init_$lambda$4;
            case 1:
                _init_$lambda$5 = RateView._init_$lambda$5(rateView, (fpf0) obj);
                return _init_$lambda$5;
            default:
                onAttachedToWindow$lambda$2 = RateView.onAttachedToWindow$lambda$2(rateView, (ibk0) obj);
                return onAttachedToWindow$lambda$2;
        }
    }
}
