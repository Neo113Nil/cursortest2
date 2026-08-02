package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.widgets.common.CloseButtonView;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import com.ybsdk.widgets.common.communication.CommunicationFullScreenView;

/* loaded from: classes2.dex */
public final class x861 implements zo31 {
    public final ConstraintLayout a;
    public final CloseButtonView b;
    public final YbButtonViewGroup c;
    public final TextView d;
    public final TextView e;
    public final CommunicationFullScreenView f;

    public x861(ConstraintLayout constraintLayout, CloseButtonView closeButtonView, YbButtonViewGroup ybButtonViewGroup, TextView textView, TextView textView2, CommunicationFullScreenView communicationFullScreenView) {
        this.a = constraintLayout;
        this.b = closeButtonView;
        this.c = ybButtonViewGroup;
        this.d = textView;
        this.e = textView2;
        this.f = communicationFullScreenView;
    }

    public static x861 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(qmh0.ybsdk_spoiler_onboarding_fragment, viewGroup, false);
        int i = jah0.closeButton;
        CloseButtonView closeButtonView = (CloseButtonView) cma1.O(i, inflate);
        if (closeButtonView != null) {
            i = jah0.onboardingButtonsGroup;
            YbButtonViewGroup ybButtonViewGroup = (YbButtonViewGroup) cma1.O(i, inflate);
            if (ybButtonViewGroup != null) {
                i = jah0.onboardingSubtitle;
                TextView textView = (TextView) cma1.O(i, inflate);
                if (textView != null) {
                    i = jah0.onboardingTitle;
                    TextView textView2 = (TextView) cma1.O(i, inflate);
                    if (textView2 != null) {
                        i = jah0.onboardingVideoView;
                        CommunicationFullScreenView communicationFullScreenView = (CommunicationFullScreenView) cma1.O(i, inflate);
                        if (communicationFullScreenView != null) {
                            return new x861((ConstraintLayout) inflate, closeButtonView, ybButtonViewGroup, textView, textView2, communicationFullScreenView);
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
