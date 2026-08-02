package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.component.IntercityDashboardPromoBannerView;

/* loaded from: classes14.dex */
public final class uhw implements zo31 {
    public final IntercityDashboardPromoBannerView a;
    public final TextView b;
    public final TextView c;
    public final ImageView d;

    public uhw(IntercityDashboardPromoBannerView intercityDashboardPromoBannerView, TextView textView, TextView textView2, ImageView imageView) {
        this.a = intercityDashboardPromoBannerView;
        this.b = textView;
        this.c = textView2;
        this.d = imageView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
