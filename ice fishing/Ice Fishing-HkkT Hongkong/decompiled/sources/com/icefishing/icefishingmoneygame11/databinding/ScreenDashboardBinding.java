package com.icefishing.icefishingmoneygame11.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.icefishing.icefishingmoneygame11.R;

/* loaded from: classes2.dex */
public final class ScreenDashboardBinding implements ViewBinding {
    public final CardView cardVideoGuide;
    public final ViewAdNativeCompactBinding layoutShimmer;
    public final RelativeLayout main;
    public final LinearLayout relativeToolbar;
    private final RelativeLayout rootView;
    public final RelativeLayout ryNative;
    public final ShimmerFrameLayout shimmerContainerNative;

    private ScreenDashboardBinding(RelativeLayout relativeLayout, CardView cardView, ViewAdNativeCompactBinding viewAdNativeCompactBinding, RelativeLayout relativeLayout2, LinearLayout linearLayout, RelativeLayout relativeLayout3, ShimmerFrameLayout shimmerFrameLayout) {
        this.rootView = relativeLayout;
        this.cardVideoGuide = cardView;
        this.layoutShimmer = viewAdNativeCompactBinding;
        this.main = relativeLayout2;
        this.relativeToolbar = linearLayout;
        this.ryNative = relativeLayout3;
        this.shimmerContainerNative = shimmerFrameLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ScreenDashboardBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ScreenDashboardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.screen_dashboard, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ScreenDashboardBinding bind(View view) {
        View findChildViewById;
        int i = R.id.cardVideoGuide;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
        if (cardView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.layoutShimmer))) != null) {
            ViewAdNativeCompactBinding bind = ViewAdNativeCompactBinding.bind(findChildViewById);
            RelativeLayout relativeLayout = (RelativeLayout) view;
            i = R.id.relativeToolbar;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = R.id.ry_native;
                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                if (relativeLayout2 != null) {
                    i = R.id.shimmer_container_native;
                    ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) ViewBindings.findChildViewById(view, i);
                    if (shimmerFrameLayout != null) {
                        return new ScreenDashboardBinding(relativeLayout, cardView, bind, relativeLayout, linearLayout, relativeLayout2, shimmerFrameLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
