package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.component.IntercityDashboardCouponView;

/* loaded from: classes14.dex */
public final class wbw implements zo31 {
    public final IntercityDashboardCouponView a;
    public final TextView b;
    public final TextView c;
    public final ImageView d;

    public wbw(IntercityDashboardCouponView intercityDashboardCouponView, TextView textView, TextView textView2, ImageView imageView) {
        this.a = intercityDashboardCouponView;
        this.b = textView;
        this.c = textView2;
        this.d = imageView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
