package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes2.dex */
public final class xpa0 implements zo31 {
    public final ConstraintLayout a;
    public final ImageView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;

    public xpa0(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = textView;
        this.d = textView2;
        this.e = textView3;
    }

    public static xpa0 o(View view) {
        int i = j9h0.brandIcon;
        ImageView imageView = (ImageView) cma1.O(i, view);
        if (imageView != null) {
            i = j9h0.confirmButton;
            TextView textView = (TextView) cma1.O(i, view);
            if (textView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = j9h0.exitButtonsContainer;
                if (((LinearLayout) cma1.O(i, view)) != null) {
                    i = j9h0.headerLayout;
                    if (((FrameLayout) cma1.O(i, view)) != null) {
                        i = j9h0.hideButton;
                        TextView textView2 = (TextView) cma1.O(i, view);
                        if (textView2 != null) {
                            i = j9h0.iconImageView;
                            if (((ImageView) cma1.O(i, view)) != null) {
                                i = j9h0.titleConfirmExitTextView;
                                TextView textView3 = (TextView) cma1.O(i, view);
                                if (textView3 != null) {
                                    return new xpa0(constraintLayout, imageView, textView, textView2, textView3);
                                }
                            }
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
        return this.a;
    }
}
