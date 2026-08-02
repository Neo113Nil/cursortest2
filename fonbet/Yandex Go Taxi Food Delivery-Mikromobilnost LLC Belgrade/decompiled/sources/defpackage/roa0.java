package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.payment.sdk.ui.view.payment.PaymentButtonView;

/* loaded from: classes2.dex */
public final class roa0 implements zo31 {
    public final ConstraintLayout a;
    public final View b;
    public final View c;
    public final ConstraintLayout d;
    public final TextView e;
    public final PaymentButtonView f;
    public final ConstraintLayout g;
    public final FrameLayout h;
    public final ImageView i;
    public final TextView j;

    public roa0(ConstraintLayout constraintLayout, View view, View view2, ConstraintLayout constraintLayout2, TextView textView, PaymentButtonView paymentButtonView, ConstraintLayout constraintLayout3, FrameLayout frameLayout, ImageView imageView, TextView textView2) {
        this.a = constraintLayout;
        this.b = view;
        this.c = view2;
        this.d = constraintLayout2;
        this.e = textView;
        this.f = paymentButtonView;
        this.g = constraintLayout3;
        this.h = frameLayout;
        this.i = imageView;
        this.j = textView2;
    }

    public static roa0 o(LayoutInflater layoutInflater) {
        View O;
        View inflate = layoutInflater.inflate(rlh0.paymentsdk_activity_payment, (ViewGroup) null, false);
        int i = j9h0.blur_view;
        View O2 = cma1.O(i, inflate);
        if (O2 != null) {
            i = j9h0.challenge_fragment;
            if (((FrameLayout) cma1.O(i, inflate)) != null && (O = cma1.O((i = j9h0.close_area), inflate)) != null) {
                i = j9h0.container_layout;
                ConstraintLayout constraintLayout = (ConstraintLayout) cma1.O(i, inflate);
                if (constraintLayout != null) {
                    i = j9h0.content_layout;
                    if (((LinearLayout) cma1.O(i, inflate)) != null) {
                        i = j9h0.exit_fragment_container;
                        if (((FrameLayout) cma1.O(i, inflate)) != null) {
                            i = j9h0.footer_text;
                            TextView textView = (TextView) cma1.O(i, inflate);
                            if (textView != null) {
                                i = j9h0.fragment_container;
                                if (((FrameLayout) cma1.O(i, inflate)) != null) {
                                    i = j9h0.loading_fragment_container;
                                    if (((FrameLayout) cma1.O(i, inflate)) != null) {
                                        i = j9h0.pay_button;
                                        PaymentButtonView paymentButtonView = (PaymentButtonView) cma1.O(i, inflate);
                                        if (paymentButtonView != null) {
                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) inflate;
                                            i = j9h0.sheet_container;
                                            FrameLayout frameLayout = (FrameLayout) cma1.O(i, inflate);
                                            if (frameLayout != null) {
                                                i = j9h0.slide_view;
                                                ImageView imageView = (ImageView) cma1.O(i, inflate);
                                                if (imageView != null) {
                                                    i = j9h0.textViewDebug;
                                                    TextView textView2 = (TextView) cma1.O(i, inflate);
                                                    if (textView2 != null) {
                                                        return new roa0(constraintLayout2, O2, O, constraintLayout, textView, paymentButtonView, constraintLayout2, frameLayout, imageView, textView2);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
