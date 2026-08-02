package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.widgets.common.LoadableInput;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import com.ybsdk.widgets.common.keyboard.NumberKeyboardView;

/* loaded from: classes3.dex */
public final class y761 implements zo31 {
    public final ConstraintLayout a;
    public final LoadableInput b;
    public final YbButtonViewGroup c;
    public final LoadableInput d;
    public final AppCompatTextView e;
    public final AppCompatTextView f;
    public final NumberKeyboardView g;

    public y761(ConstraintLayout constraintLayout, LoadableInput loadableInput, YbButtonViewGroup ybButtonViewGroup, LoadableInput loadableInput2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, NumberKeyboardView numberKeyboardView) {
        this.a = constraintLayout;
        this.b = loadableInput;
        this.c = ybButtonViewGroup;
        this.d = loadableInput2;
        this.e = appCompatTextView;
        this.f = appCompatTextView2;
        this.g = numberKeyboardView;
    }

    public static y761 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(doh0.ybsdk_screen_savings_account_goal, viewGroup, false);
        int i = tbh0.amount;
        LoadableInput loadableInput = (LoadableInput) cma1.O(i, inflate);
        if (loadableInput != null) {
            i = tbh0.buttonsGroup;
            YbButtonViewGroup ybButtonViewGroup = (YbButtonViewGroup) cma1.O(i, inflate);
            if (ybButtonViewGroup != null) {
                i = tbh0.date;
                LoadableInput loadableInput2 = (LoadableInput) cma1.O(i, inflate);
                if (loadableInput2 != null) {
                    i = tbh0.goalSubtitle;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) cma1.O(i, inflate);
                    if (appCompatTextView != null) {
                        i = tbh0.goalTitle;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) cma1.O(i, inflate);
                        if (appCompatTextView2 != null) {
                            i = tbh0.keyboard;
                            NumberKeyboardView numberKeyboardView = (NumberKeyboardView) cma1.O(i, inflate);
                            if (numberKeyboardView != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                i = tbh0.toolbar;
                                if (((ToolbarView) cma1.O(i, inflate)) != null) {
                                    return new y761(constraintLayout, loadableInput, ybButtonViewGroup, loadableInput2, appCompatTextView, appCompatTextView2, numberKeyboardView);
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
