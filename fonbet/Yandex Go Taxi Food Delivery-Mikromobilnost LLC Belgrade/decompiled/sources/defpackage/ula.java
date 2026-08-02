package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.payments.design.composite.CompositePaymentIconsView;

/* loaded from: classes13.dex */
public final class ula implements zo31 {
    public final /* synthetic */ int a;
    public final GoFrameLayout b;
    public final GoImageView c;
    public final CompositePaymentIconsView d;
    public final GoFrameLayout e;

    public /* synthetic */ ula(GoFrameLayout goFrameLayout, GoImageView goImageView, CompositePaymentIconsView compositePaymentIconsView, GoFrameLayout goFrameLayout2, int i) {
        this.a = i;
        this.b = goFrameLayout;
        this.c = goImageView;
        this.d = compositePaymentIconsView;
        this.e = goFrameLayout2;
    }

    public static ula o(View view) {
        int i = qfh0.payment_add_card_view;
        GoImageView goImageView = (GoImageView) cma1.O(i, view);
        if (goImageView != null) {
            i = qfh0.payment_info_view;
            CompositePaymentIconsView compositePaymentIconsView = (CompositePaymentIconsView) cma1.O(i, view);
            if (compositePaymentIconsView != null) {
                GoFrameLayout goFrameLayout = (GoFrameLayout) view;
                return new ula(goFrameLayout, goImageView, compositePaymentIconsView, goFrameLayout, 1);
            }
        }
        ny61.t("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        int i = this.a;
        return this.b;
    }
}
