package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes2.dex */
public final class ypa0 implements zo31 {
    public final ConstraintLayout a;
    public final TextView b;
    public final ConstraintLayout c;

    public ypa0(ConstraintLayout constraintLayout, TextView textView, ConstraintLayout constraintLayout2) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = constraintLayout2;
    }

    public static ypa0 o(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(rlh0.paymentsdk_layout_transport_error, (ViewGroup) null, false);
        int i = j9h0.errorDescription;
        if (((TextView) cma1.O(i, inflate)) != null) {
            i = j9h0.errorImageView;
            if (((ImageView) cma1.O(i, inflate)) != null) {
                i = j9h0.errorTitle;
                if (((TextView) cma1.O(i, inflate)) != null) {
                    i = j9h0.feedsdkErrorActionButton;
                    TextView textView = (TextView) cma1.O(i, inflate);
                    if (textView != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                        return new ypa0(constraintLayout, textView, constraintLayout);
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
