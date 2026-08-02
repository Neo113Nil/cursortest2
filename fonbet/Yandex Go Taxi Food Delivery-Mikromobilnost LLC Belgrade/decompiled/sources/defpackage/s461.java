package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes3.dex */
public final class s461 implements zo31 {
    public final FrameLayout a;

    public s461(FrameLayout frameLayout) {
        this.a = frameLayout;
    }

    public static s461 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(znh0.ybsdk_qr_payment_subscription, viewGroup, false);
        if (inflate != null) {
            return new s461((FrameLayout) inflate);
        }
        ny61.t("rootView");
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
