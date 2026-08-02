package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.ybsdk.feature.qr.payments.internal.screens.presentation.view.ImageToolbarView;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.YbButtonView;

/* loaded from: classes3.dex */
public final class w461 implements zo31 {
    public final ConstraintLayout a;
    public final YbButtonView b;
    public final TextView c;
    public final AppCompatImageView d;
    public final ImageToolbarView e;
    public final TextView f;
    public final ToolbarView g;

    public w461(ConstraintLayout constraintLayout, YbButtonView ybButtonView, TextView textView, AppCompatImageView appCompatImageView, ImageToolbarView imageToolbarView, TextView textView2, ToolbarView toolbarView) {
        this.a = constraintLayout;
        this.b = ybButtonView;
        this.c = textView;
        this.d = appCompatImageView;
        this.e = imageToolbarView;
        this.f = textView2;
        this.g = toolbarView;
    }

    public static w461 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(znh0.ybsdk_qr_refresh, viewGroup, false);
        int i = pbh0.qrRefreshButton;
        YbButtonView ybButtonView = (YbButtonView) cma1.O(i, inflate);
        if (ybButtonView != null) {
            i = pbh0.qrRefreshDescrition;
            TextView textView = (TextView) cma1.O(i, inflate);
            if (textView != null) {
                i = pbh0.qrRefreshGuideline;
                if (((Guideline) cma1.O(i, inflate)) != null) {
                    i = pbh0.qrRefreshImage;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i, inflate);
                    if (appCompatImageView != null) {
                        i = pbh0.qrRefreshImageToolbar;
                        ImageToolbarView imageToolbarView = (ImageToolbarView) cma1.O(i, inflate);
                        if (imageToolbarView != null) {
                            i = pbh0.qrRefreshTitle;
                            TextView textView2 = (TextView) cma1.O(i, inflate);
                            if (textView2 != null) {
                                i = pbh0.qrRefreshToolbar;
                                ToolbarView toolbarView = (ToolbarView) cma1.O(i, inflate);
                                if (toolbarView != null) {
                                    return new w461((ConstraintLayout) inflate, ybButtonView, textView, appCompatImageView, imageToolbarView, textView2, toolbarView);
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
