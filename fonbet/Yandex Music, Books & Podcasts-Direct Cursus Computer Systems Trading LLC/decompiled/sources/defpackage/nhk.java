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
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class nhk implements adu {
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

    public nhk(ConstraintLayout constraintLayout, View view, View view2, ConstraintLayout constraintLayout2, TextView textView, PaymentButtonView paymentButtonView, ConstraintLayout constraintLayout3, FrameLayout frameLayout, ImageView imageView, TextView textView2) {
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

    public static nhk a(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.paymentsdk_activity_payment, (ViewGroup) null, false);
        int i = R.id.blur_view;
        View v = dag.v(R.id.blur_view, inflate);
        if (v != null) {
            i = R.id.challenge_fragment;
            if (((FrameLayout) dag.v(R.id.challenge_fragment, inflate)) != null) {
                i = R.id.close_area;
                View v2 = dag.v(R.id.close_area, inflate);
                if (v2 != null) {
                    i = R.id.container_layout;
                    ConstraintLayout constraintLayout = (ConstraintLayout) dag.v(R.id.container_layout, inflate);
                    if (constraintLayout != null) {
                        i = R.id.content_layout;
                        if (((LinearLayout) dag.v(R.id.content_layout, inflate)) != null) {
                            i = R.id.exit_fragment_container;
                            if (((FrameLayout) dag.v(R.id.exit_fragment_container, inflate)) != null) {
                                i = R.id.footer_text;
                                TextView textView = (TextView) dag.v(R.id.footer_text, inflate);
                                if (textView != null) {
                                    i = R.id.fragment_container;
                                    if (((FrameLayout) dag.v(R.id.fragment_container, inflate)) != null) {
                                        i = R.id.loading_fragment_container;
                                        if (((FrameLayout) dag.v(R.id.loading_fragment_container, inflate)) != null) {
                                            i = R.id.pay_button;
                                            PaymentButtonView paymentButtonView = (PaymentButtonView) dag.v(R.id.pay_button, inflate);
                                            if (paymentButtonView != null) {
                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) inflate;
                                                i = R.id.sheet_container;
                                                FrameLayout frameLayout = (FrameLayout) dag.v(R.id.sheet_container, inflate);
                                                if (frameLayout != null) {
                                                    i = R.id.slide_view;
                                                    ImageView imageView = (ImageView) dag.v(R.id.slide_view, inflate);
                                                    if (imageView != null) {
                                                        i = R.id.textViewDebug;
                                                        TextView textView2 = (TextView) dag.v(R.id.textViewDebug, inflate);
                                                        if (textView2 != null) {
                                                            return new nhk(constraintLayout2, v, v2, constraintLayout, textView, paymentButtonView, constraintLayout2, frameLayout, imageView, textView2);
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
        }
        jj4.j("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }
}
