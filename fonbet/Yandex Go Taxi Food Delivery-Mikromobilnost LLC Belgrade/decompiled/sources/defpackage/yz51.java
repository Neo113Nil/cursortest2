package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes3.dex */
public final class yz51 implements zo31 {
    public final FrameLayout a;

    public yz51(FrameLayout frameLayout) {
        this.a = frameLayout;
    }

    public static yz51 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(goh0.ybsdk_auto_topup_payment_methods_screen, viewGroup, false);
        if (inflate != null) {
            return new yz51((FrameLayout) inflate);
        }
        ny61.t("rootView");
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
