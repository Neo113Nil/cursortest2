package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ViewSwitcher;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.PinCodeDotsView;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.communication.CommunicationFullScreenView;
import com.ybsdk.widgets.common.keyboard.NumberKeyboardView;

/* loaded from: classes3.dex */
public final class q761 implements zo31 {
    public final ConstraintLayout a;
    public final ViewSwitcher b;
    public final PinCodeDotsView c;
    public final PinCodeDotsView d;
    public final ErrorView e;
    public final CommunicationFullScreenView f;
    public final NumberKeyboardView g;
    public final ConstraintLayout h;
    public final AppCompatTextView i;
    public final CircularProgressIndicator j;
    public final ToolbarView k;

    public q761(ConstraintLayout constraintLayout, ViewSwitcher viewSwitcher, PinCodeDotsView pinCodeDotsView, PinCodeDotsView pinCodeDotsView2, ErrorView errorView, CommunicationFullScreenView communicationFullScreenView, NumberKeyboardView numberKeyboardView, ConstraintLayout constraintLayout2, AppCompatTextView appCompatTextView, CircularProgressIndicator circularProgressIndicator, ToolbarView toolbarView) {
        this.a = constraintLayout;
        this.b = viewSwitcher;
        this.c = pinCodeDotsView;
        this.d = pinCodeDotsView2;
        this.e = errorView;
        this.f = communicationFullScreenView;
        this.g = numberKeyboardView;
        this.h = constraintLayout2;
        this.i = appCompatTextView;
        this.j = circularProgressIndicator;
        this.k = toolbarView;
    }

    public static q761 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(xnh0.ybsdk_screen_pin_input, viewGroup, false);
        int i = nbh0.codeInputSwitcher;
        ViewSwitcher viewSwitcher = (ViewSwitcher) cma1.O(i, inflate);
        if (viewSwitcher != null) {
            i = nbh0.dotsFirst;
            PinCodeDotsView pinCodeDotsView = (PinCodeDotsView) cma1.O(i, inflate);
            if (pinCodeDotsView != null) {
                i = nbh0.dotsSecond;
                PinCodeDotsView pinCodeDotsView2 = (PinCodeDotsView) cma1.O(i, inflate);
                if (pinCodeDotsView2 != null) {
                    i = nbh0.errorView;
                    ErrorView errorView = (ErrorView) cma1.O(i, inflate);
                    if (errorView != null) {
                        i = nbh0.fullScreenView;
                        CommunicationFullScreenView communicationFullScreenView = (CommunicationFullScreenView) cma1.O(i, inflate);
                        if (communicationFullScreenView != null) {
                            i = nbh0.keyboard;
                            NumberKeyboardView numberKeyboardView = (NumberKeyboardView) cma1.O(i, inflate);
                            if (numberKeyboardView != null) {
                                i = nbh0.pinEnterElements;
                                ConstraintLayout constraintLayout = (ConstraintLayout) cma1.O(i, inflate);
                                if (constraintLayout != null) {
                                    i = nbh0.pinHintText;
                                    AppCompatTextView appCompatTextView = (AppCompatTextView) cma1.O(i, inflate);
                                    if (appCompatTextView != null) {
                                        i = nbh0.progressIndicator;
                                        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) cma1.O(i, inflate);
                                        if (circularProgressIndicator != null) {
                                            i = nbh0.toolbar;
                                            ToolbarView toolbarView = (ToolbarView) cma1.O(i, inflate);
                                            if (toolbarView != null) {
                                                return new q761((ConstraintLayout) inflate, viewSwitcher, pinCodeDotsView, pinCodeDotsView2, errorView, communicationFullScreenView, numberKeyboardView, constraintLayout, appCompatTextView, circularProgressIndicator, toolbarView);
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
