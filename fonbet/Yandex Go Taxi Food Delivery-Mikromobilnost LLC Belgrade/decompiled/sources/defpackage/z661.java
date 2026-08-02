package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.widgets.common.TraceIdErrorView;
import com.ybsdk.widgets.common.YbButtonView;

/* loaded from: classes3.dex */
public final class z661 implements zo31 {
    public final ConstraintLayout a;
    public final YbButtonView b;
    public final TextView c;
    public final TraceIdErrorView d;
    public final YbButtonView e;

    public z661(ConstraintLayout constraintLayout, YbButtonView ybButtonView, TextView textView, TraceIdErrorView traceIdErrorView, YbButtonView ybButtonView2) {
        this.a = constraintLayout;
        this.b = ybButtonView;
        this.c = textView;
        this.d = traceIdErrorView;
        this.e = ybButtonView2;
    }

    public static z661 p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(noh0.ybsdk_screen_fund_docs_notice_error, viewGroup, false);
        int i = cch0.errorIcon;
        if (((ImageView) cma1.O(i, inflate)) != null) {
            i = cch0.errorRetryButton;
            YbButtonView ybButtonView = (YbButtonView) cma1.O(i, inflate);
            if (ybButtonView != null) {
                i = cch0.errorText;
                TextView textView = (TextView) cma1.O(i, inflate);
                if (textView != null) {
                    i = cch0.errorTextSubtitle;
                    if (((TextView) cma1.O(i, inflate)) != null) {
                        i = cch0.errorTextViewTraceId;
                        TraceIdErrorView traceIdErrorView = (TraceIdErrorView) cma1.O(i, inflate);
                        if (traceIdErrorView != null) {
                            i = cch0.secondErrorButton;
                            YbButtonView ybButtonView2 = (YbButtonView) cma1.O(i, inflate);
                            if (ybButtonView2 != null) {
                                return new z661((ConstraintLayout) inflate, ybButtonView, textView, traceIdErrorView, ybButtonView2);
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

    public final ConstraintLayout o() {
        return this.a;
    }
}
