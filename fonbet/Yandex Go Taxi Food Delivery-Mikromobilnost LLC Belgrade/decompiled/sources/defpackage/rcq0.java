package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.x0;
import com.yandex.payment.sdk.core.data.FamilyInfo;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.xplat.payment.sdk.FamilyInfoFrame;

/* loaded from: classes2.dex */
public class rcq0 extends x0 {
    public final ViewGroup N;
    public final ImageView O;
    public final ImageView P;
    public final TextView Q;
    public final TextView R;
    public final ImageView S;
    public final /* synthetic */ int T;
    public final /* synthetic */ xcq0 U;

    public rcq0(View view) {
        super(view);
        this.N = (ViewGroup) view.findViewById(o9h0.payments_method_container);
        this.O = (ImageView) view.findViewById(o9h0.payment_method_icon);
        this.P = (ImageView) view.findViewById(o9h0.payment_method_right_icon);
        this.Q = (TextView) view.findViewById(o9h0.payments_method_title);
        this.R = (TextView) view.findViewById(o9h0.payments_method_subtitle);
        this.S = (ImageView) view.findViewById(o9h0.payment_method_radio_button);
    }

    public void W(int i) {
        String string;
        int i2 = this.T;
        TextView textView = this.R;
        TextView textView2 = this.Q;
        ImageView imageView = this.P;
        ImageView imageView2 = this.O;
        xcq0 xcq0Var = this.U;
        View view = this.a;
        ImageView imageView3 = this.S;
        switch (i2) {
            case 0:
                boolean X = X(i);
                Context context = view.getContext();
                vcq0 vcq0Var = (vcq0) xcq0Var.y.get(i);
                PaymentMethod paymentMethod = vcq0Var.a;
                if (paymentMethod instanceof PaymentMethod.Card) {
                    FamilyInfo familyInfo = ((PaymentMethod.Card) paymentMethod).getFamilyInfo();
                    if (familyInfo != null) {
                        FamilyInfoFrame c = he91.c(familyInfo.getFrame());
                        if (familyInfo.getIsUnlimited()) {
                            int i3 = c == null ? -1 : wcq0.b[c.ordinal()];
                            if (i3 == -1) {
                                string = context.getString(tyh0.paymentsdk_prebuilt_family_pay_available_unlimited);
                            } else if (i3 == 1) {
                                string = context.getString(tyh0.paymentsdk_prebuilt_family_pay_available_unlimited_day);
                            } else if (i3 == 2) {
                                string = context.getString(tyh0.paymentsdk_prebuilt_family_pay_available_unlimited_week);
                            } else if (i3 != 3) {
                                w511.b();
                                break;
                            } else {
                                string = context.getString(tyh0.paymentsdk_prebuilt_family_pay_available_unlimited_month);
                            }
                        } else {
                            String c2 = mta1.c(context, familyInfo.getAvailable(), familyInfo.getCurrency(), xcq0Var.x);
                            int i4 = c == null ? -1 : wcq0.b[c.ordinal()];
                            if (i4 == -1) {
                                string = context.getString(tyh0.paymentsdk_prebuilt_family_pay_available_format, c2);
                            } else if (i4 == 1) {
                                string = context.getString(tyh0.paymentsdk_prebuilt_family_pay_available_day_format, c2);
                            } else if (i4 == 2) {
                                string = context.getString(tyh0.paymentsdk_prebuilt_family_pay_available_week_format, c2);
                            } else if (i4 != 3) {
                                w511.b();
                                break;
                            } else {
                                string = context.getString(tyh0.paymentsdk_prebuilt_family_pay_available_month_format, c2);
                            }
                        }
                    }
                    string = null;
                } else {
                    if (paymentMethod.equals(PaymentMethod.Sbp.INSTANCE) || paymentMethod.equals(PaymentMethod.NewSbpToken.INSTANCE)) {
                        string = context.getString(tyh0.paymentsdk_non_new_sbp_subtitle);
                    }
                    string = null;
                }
                xcq0.f(xcq0Var, vcq0Var, imageView2, imageView, context);
                String str = vcq0Var.e;
                if (str == null) {
                    str = xcq0.g(xcq0Var, paymentMethod, context, xcq0Var.C);
                }
                textView2.setText(str);
                textView.setText(string);
                textView.setVisibility(string != null ? 0 : 8);
                imageView3.setSelected(X);
                if (X) {
                    imageView3.setImportantForAccessibility(1);
                    imageView3.setContentDescription(imageView3.getContext().getString(tyh0.paymentsdk_prebuilt_selected_content_description));
                } else {
                    imageView3.setImportantForAccessibility(2);
                    imageView3.setContentDescription("");
                }
                imageView3.setVisibility(xcq0Var.y.size() > 1 ? 0 : 8);
                break;
            default:
                imageView3.setImageResource(exg0.paymentsdk_ic_remove);
                imageView3.setContentDescription(imageView3.getContext().getString(tyh0.paymentsdk_prebuilt_delete_content_description));
                Context context2 = view.getContext();
                vcq0 vcq0Var2 = (vcq0) xcq0Var.y.get(i);
                PaymentMethod paymentMethod2 = vcq0Var2.a;
                xcq0.f(xcq0Var, vcq0Var2, imageView2, imageView, context2);
                String str2 = vcq0Var2.e;
                if (str2 == null) {
                    str2 = xcq0.g(xcq0Var, paymentMethod2, context2, xcq0Var.C);
                }
                textView2.setText(str2);
                textView.setVisibility(8);
                imageView3.setVisibility(0);
                break;
        }
    }

    public boolean X(int i) {
        xcq0 xcq0Var = this.U;
        return jl40.l(xcq0Var.y.get(i), xcq0Var.A);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rcq0(xcq0 xcq0Var, View view, int i) {
        this(view);
        this.T = i;
        switch (i) {
            case 1:
                this.U = xcq0Var;
                this(view);
                this.S.setOnClickListener(new tai0(15, this, xcq0Var));
                break;
            default:
                this.U = xcq0Var;
                this.N.setOnClickListener(new tai0(14, this, xcq0Var));
                break;
        }
    }
}
