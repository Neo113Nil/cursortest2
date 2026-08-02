package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.SwitchCompat;
import com.ybsdk.feature.qr.payments.internal.screens.presentation.view.SubscriptionWidgetView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;

/* loaded from: classes3.dex */
public final class u461 implements zo31 {
    public final SubscriptionWidgetView a;
    public final TextView b;
    public final AppCompatImageView c;
    public final ShimmerFrameLayout d;
    public final SwitchCompat e;
    public final TextView f;

    public u461(SubscriptionWidgetView subscriptionWidgetView, TextView textView, AppCompatImageView appCompatImageView, ShimmerFrameLayout shimmerFrameLayout, SwitchCompat switchCompat, TextView textView2) {
        this.a = subscriptionWidgetView;
        this.b = textView;
        this.c = appCompatImageView;
        this.d = shimmerFrameLayout;
        this.e = switchCompat;
        this.f = textView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
