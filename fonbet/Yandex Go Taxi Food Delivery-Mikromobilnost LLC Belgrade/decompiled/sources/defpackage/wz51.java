package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;

/* loaded from: classes3.dex */
public final class wz51 implements zo31 {
    public final /* synthetic */ int a;
    public final ShimmerFrameLayout b;

    public /* synthetic */ wz51(ShimmerFrameLayout shimmerFrameLayout, int i) {
        this.a = i;
        this.b = shimmerFrameLayout;
    }

    public static wz51 o(View view) {
        if (view != null) {
            return new wz51((ShimmerFrameLayout) view, 11);
        }
        ny61.t("rootView");
        return null;
    }

    public static wz51 q(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(anh0.ybsdk_screen_card_settings_term_skeleton, (ViewGroup) null, false);
        if (inflate != null) {
            return new wz51((ShimmerFrameLayout) inflate, 18);
        }
        ny61.t("rootView");
        return null;
    }

    public static wz51 r(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(anh0.ybsdk_card_rename_shimmer, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        if (inflate != null) {
            return new wz51((ShimmerFrameLayout) inflate, 5);
        }
        ny61.t("rootView");
        return null;
    }

    public static wz51 s(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(eoh0.ybsdk_sbp_subscription_consent, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        if (inflate != null) {
            return new wz51((ShimmerFrameLayout) inflate, 16);
        }
        ny61.t("rootView");
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        int i = this.a;
        return this.b;
    }

    public ShimmerFrameLayout p() {
        int i = this.a;
        return this.b;
    }
}
