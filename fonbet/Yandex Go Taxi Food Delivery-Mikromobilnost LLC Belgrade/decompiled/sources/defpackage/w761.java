package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.widgets.common.YbButtonViewGroup;

/* loaded from: classes3.dex */
public final class w761 implements zo31 {
    public final ConstraintLayout a;
    public final YbButtonViewGroup b;
    public final AppCompatTextView c;
    public final View d;
    public final AppCompatTextView e;
    public final AppCompatTextView f;
    public final AppCompatTextView g;
    public final View h;
    public final AppCompatTextView i;
    public final AppCompatTextView j;
    public final View k;
    public final AppCompatTextView l;
    public final AppCompatTextView m;

    public w761(ConstraintLayout constraintLayout, YbButtonViewGroup ybButtonViewGroup, AppCompatTextView appCompatTextView, View view, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, View view2, AppCompatTextView appCompatTextView5, AppCompatTextView appCompatTextView6, View view3, AppCompatTextView appCompatTextView7, AppCompatTextView appCompatTextView8) {
        this.a = constraintLayout;
        this.b = ybButtonViewGroup;
        this.c = appCompatTextView;
        this.d = view;
        this.e = appCompatTextView2;
        this.f = appCompatTextView3;
        this.g = appCompatTextView4;
        this.h = view2;
        this.i = appCompatTextView5;
        this.j = appCompatTextView6;
        this.k = view3;
        this.l = appCompatTextView7;
        this.m = appCompatTextView8;
    }

    public static w761 p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View O;
        View O2;
        View O3;
        View inflate = layoutInflater.inflate(doh0.ybsdk_screen_savings_account_close_deposit, viewGroup, false);
        int i = tbh0.buttonsGroup;
        YbButtonViewGroup ybButtonViewGroup = (YbButtonViewGroup) cma1.O(i, inflate);
        if (ybButtonViewGroup != null) {
            i = tbh0.profitPossibleAmount;
            AppCompatTextView appCompatTextView = (AppCompatTextView) cma1.O(i, inflate);
            if (appCompatTextView != null && (O = cma1.O((i = tbh0.profitPossibleChart), inflate)) != null) {
                i = tbh0.profitPossibleDescription;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) cma1.O(i, inflate);
                if (appCompatTextView2 != null) {
                    i = tbh0.profitPossibleLabel;
                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) cma1.O(i, inflate);
                    if (appCompatTextView3 != null) {
                        i = tbh0.profitScaryAmount;
                        AppCompatTextView appCompatTextView4 = (AppCompatTextView) cma1.O(i, inflate);
                        if (appCompatTextView4 != null && (O2 = cma1.O((i = tbh0.profitScaryChart), inflate)) != null) {
                            i = tbh0.profitScaryDescription;
                            AppCompatTextView appCompatTextView5 = (AppCompatTextView) cma1.O(i, inflate);
                            if (appCompatTextView5 != null) {
                                i = tbh0.profitScaryLabel;
                                AppCompatTextView appCompatTextView6 = (AppCompatTextView) cma1.O(i, inflate);
                                if (appCompatTextView6 != null && (O3 = cma1.O((i = tbh0.separator), inflate)) != null) {
                                    i = tbh0.subtitle;
                                    AppCompatTextView appCompatTextView7 = (AppCompatTextView) cma1.O(i, inflate);
                                    if (appCompatTextView7 != null) {
                                        i = tbh0.title;
                                        AppCompatTextView appCompatTextView8 = (AppCompatTextView) cma1.O(i, inflate);
                                        if (appCompatTextView8 != null) {
                                            return new w761((ConstraintLayout) inflate, ybButtonViewGroup, appCompatTextView, O, appCompatTextView2, appCompatTextView3, appCompatTextView4, O2, appCompatTextView5, appCompatTextView6, O3, appCompatTextView7, appCompatTextView8);
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

    public final ConstraintLayout o() {
        return this.a;
    }
}
