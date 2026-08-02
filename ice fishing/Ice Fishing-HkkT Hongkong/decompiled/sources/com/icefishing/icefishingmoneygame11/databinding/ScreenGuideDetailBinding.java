package com.icefishing.icefishingmoneygame11.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.icefishing.icefishingmoneygame11.R;

/* loaded from: classes2.dex */
public final class ScreenGuideDetailBinding implements ViewBinding {
    public final ViewQurekaNativeLargeBinding QurekaAdsNative;
    public final ImageView btnBack;
    public final ViewAdNativeCompactBinding layoutShimmer;
    public final RelativeLayout main;
    public final LinearLayout relativeToolbar;
    private final RelativeLayout rootView;
    public final RelativeLayout ryNative;
    public final ShimmerFrameLayout shimmerContainerNative;
    public final TextView tvContentPart1;
    public final TextView tvContentPart2;
    public final TextView tvTitle;

    private ScreenGuideDetailBinding(RelativeLayout relativeLayout, ViewQurekaNativeLargeBinding viewQurekaNativeLargeBinding, ImageView imageView, ViewAdNativeCompactBinding viewAdNativeCompactBinding, RelativeLayout relativeLayout2, LinearLayout linearLayout, RelativeLayout relativeLayout3, ShimmerFrameLayout shimmerFrameLayout, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = relativeLayout;
        this.QurekaAdsNative = viewQurekaNativeLargeBinding;
        this.btnBack = imageView;
        this.layoutShimmer = viewAdNativeCompactBinding;
        this.main = relativeLayout2;
        this.relativeToolbar = linearLayout;
        this.ryNative = relativeLayout3;
        this.shimmerContainerNative = shimmerFrameLayout;
        this.tvContentPart1 = textView;
        this.tvContentPart2 = textView2;
        this.tvTitle = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ScreenGuideDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ScreenGuideDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.screen_guide_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ScreenGuideDetailBinding bind(View view) {
        View findChildViewById;
        int i = R.id.QurekaAds_native;
        View findChildViewById2 = ViewBindings.findChildViewById(view, i);
        if (findChildViewById2 != null) {
            ViewQurekaNativeLargeBinding bind = ViewQurekaNativeLargeBinding.bind(findChildViewById2);
            i = R.id.btnBack;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.layoutShimmer))) != null) {
                ViewAdNativeCompactBinding bind2 = ViewAdNativeCompactBinding.bind(findChildViewById);
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
                            i = R.id.tvContentPart1;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                i = R.id.tvContentPart2;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView2 != null) {
                                    i = R.id.tvTitle;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView3 != null) {
                                        return new ScreenGuideDetailBinding(relativeLayout, bind, imageView, bind2, relativeLayout, linearLayout, relativeLayout2, shimmerFrameLayout, textView, textView2, textView3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
