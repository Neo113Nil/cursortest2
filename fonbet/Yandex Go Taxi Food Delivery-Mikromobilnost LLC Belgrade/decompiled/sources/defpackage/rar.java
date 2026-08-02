package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentContainerView;

/* loaded from: classes12.dex */
public final class rar implements zo31 {
    public final FrameLayout a;

    public rar(FrameLayout frameLayout) {
        this.a = frameLayout;
    }

    public static rar p(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(hoh0.finsdk_activity_applink_payment, (ViewGroup) null, false);
        FrameLayout frameLayout = (FrameLayout) inflate;
        int i = xgh0.finsdkContainer;
        if (((FragmentContainerView) cma1.O(i, inflate)) != null) {
            return new rar(frameLayout);
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }

    public final FrameLayout o() {
        return this.a;
    }
}
