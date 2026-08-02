package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ybsdk.widgets.common.communication.CommunicationFullScreenView;

/* loaded from: classes3.dex */
public final class z761 implements zo31 {
    public final CommunicationFullScreenView a;

    public z761(CommunicationFullScreenView communicationFullScreenView) {
        this.a = communicationFullScreenView;
    }

    public static z761 p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(doh0.ybsdk_screen_savings_account_lock, viewGroup, false);
        if (inflate != null) {
            return new z761((CommunicationFullScreenView) inflate);
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
