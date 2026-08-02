package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ybsdk.widgets.common.communication.CommunicationFullScreenView;

/* loaded from: classes3.dex */
public final class v761 implements zo31 {
    public final CommunicationFullScreenView a;

    public v761(CommunicationFullScreenView communicationFullScreenView) {
        this.a = communicationFullScreenView;
    }

    public static v761 p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(doh0.ybsdk_screen_savings_account_close, viewGroup, false);
        if (inflate != null) {
            return new v761((CommunicationFullScreenView) inflate);
        }
        ny61.t("rootView");
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }

    public final CommunicationFullScreenView o() {
        return this.a;
    }
}
