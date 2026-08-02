package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes3.dex */
public final class u161 implements zo31 {
    public final AppCompatTextView a;

    public u161(AppCompatTextView appCompatTextView) {
        this.a = appCompatTextView;
    }

    public static u161 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(xmh0.ybsdk_item_auto_topup_regular_frequency, viewGroup, false);
        if (inflate != null) {
            return new u161((AppCompatTextView) inflate);
        }
        ny61.t("rootView");
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
