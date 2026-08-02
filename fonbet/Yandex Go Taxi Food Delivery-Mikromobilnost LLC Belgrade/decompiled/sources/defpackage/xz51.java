package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.communication.CommunicationFullScreenView;

/* loaded from: classes3.dex */
public final class xz51 implements zo31 {
    public final FrameLayout a;
    public final CommunicationFullScreenView b;
    public final ToolbarView c;

    public xz51(FrameLayout frameLayout, CommunicationFullScreenView communicationFullScreenView, ToolbarView toolbarView) {
        this.a = frameLayout;
        this.b = communicationFullScreenView;
        this.c = toolbarView;
    }

    public static xz51 o(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(xmh0.ybsdk_auto_topup_instruction, (ViewGroup) null, false);
        int i = pah0.autoTopupInstructionFullScreenView;
        CommunicationFullScreenView communicationFullScreenView = (CommunicationFullScreenView) cma1.O(i, inflate);
        if (communicationFullScreenView != null) {
            i = pah0.autoTopupInstructionToolbar;
            ToolbarView toolbarView = (ToolbarView) cma1.O(i, inflate);
            if (toolbarView != null) {
                return new xz51((FrameLayout) inflate, communicationFullScreenView, toolbarView);
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
