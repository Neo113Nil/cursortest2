package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.ybsdk.widgets.common.TraceIdErrorView;
import com.ybsdk.widgets.common.YbButtonView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes3.dex */
public final class rm implements zo31 {
    public final /* synthetic */ int a;
    public final ViewGroup b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public rm(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, RobotoTextView robotoTextView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, RobotoTextView robotoTextView2) {
        this.a = 0;
        this.b = constraintLayout;
        this.c = constraintLayout2;
        this.d = robotoTextView;
        this.f = appCompatImageView;
        this.g = appCompatImageView2;
        this.e = robotoTextView2;
    }

    public static rm o(View view) {
        int i = jah0.errorIcon;
        ImageView imageView = (ImageView) cma1.O(i, view);
        if (imageView != null) {
            i = jah0.errorRetryButton;
            YbButtonView ybButtonView = (YbButtonView) cma1.O(i, view);
            if (ybButtonView != null) {
                i = jah0.errorText;
                TextView textView = (TextView) cma1.O(i, view);
                if (textView != null) {
                    i = jah0.errorTextSubtitle;
                    TextView textView2 = (TextView) cma1.O(i, view);
                    if (textView2 != null) {
                        i = jah0.errorTextViewTraceId;
                        TraceIdErrorView traceIdErrorView = (TraceIdErrorView) cma1.O(i, view);
                        if (traceIdErrorView != null) {
                            return new rm((ConstraintLayout) view, imageView, ybButtonView, textView, textView2, traceIdErrorView, 12);
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        int i = this.a;
        ViewGroup viewGroup = this.b;
        switch (i) {
            case 0:
                return (ConstraintLayout) viewGroup;
            case 1:
                return (FrameLayout) viewGroup;
            case 2:
                return (FrameLayout) viewGroup;
            case 3:
                return (ConstraintLayout) viewGroup;
            case 4:
                return (LinearLayout) viewGroup;
            case 5:
                return (LinearLayout) viewGroup;
            case 6:
                return (ConstraintLayout) viewGroup;
            case 7:
                return (LinearLayout) viewGroup;
            case 8:
                return (ConstraintLayout) viewGroup;
            case 9:
                return (LinearLayout) viewGroup;
            case 10:
                return (ConstraintLayout) viewGroup;
            case 11:
                return (GoFrameLayout) viewGroup;
            default:
                return (ConstraintLayout) viewGroup;
        }
    }

    public GoFrameLayout p() {
        return (GoFrameLayout) this.b;
    }

    public /* synthetic */ rm(ViewGroup viewGroup, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = viewGroup;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
    }
}
