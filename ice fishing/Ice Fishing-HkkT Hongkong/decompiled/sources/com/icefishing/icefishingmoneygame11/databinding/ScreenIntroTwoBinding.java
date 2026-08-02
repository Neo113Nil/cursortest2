package com.icefishing.icefishingmoneygame11.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.icefishing.icefishingmoneygame11.R;

/* loaded from: classes2.dex */
public final class ScreenIntroTwoBinding implements ViewBinding {
    public final CardView btnNext;
    public final LinearLayout circleIndicatorContainer;
    public final ViewAdNativeCompactBinding layoutShimmer;
    public final LinearLayout linerBottom;
    public final LinearLayout linerBottom1;
    public final RelativeLayout main;
    private final RelativeLayout rootView;
    public final RelativeLayout ryNative;
    public final ShimmerFrameLayout shimmerContainerNative;
    public final TextView skip;
    public final TextView txtNext;
    public final ImageView view1;
    public final ImageView view2;
    public final ImageView view3;

    private ScreenIntroTwoBinding(RelativeLayout relativeLayout, CardView cardView, LinearLayout linearLayout, ViewAdNativeCompactBinding viewAdNativeCompactBinding, LinearLayout linearLayout2, LinearLayout linearLayout3, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, ShimmerFrameLayout shimmerFrameLayout, TextView textView, TextView textView2, ImageView imageView, ImageView imageView2, ImageView imageView3) {
        this.rootView = relativeLayout;
        this.btnNext = cardView;
        this.circleIndicatorContainer = linearLayout;
        this.layoutShimmer = viewAdNativeCompactBinding;
        this.linerBottom = linearLayout2;
        this.linerBottom1 = linearLayout3;
        this.main = relativeLayout2;
        this.ryNative = relativeLayout3;
        this.shimmerContainerNative = shimmerFrameLayout;
        this.skip = textView;
        this.txtNext = textView2;
        this.view1 = imageView;
        this.view2 = imageView2;
        this.view3 = imageView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ScreenIntroTwoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ScreenIntroTwoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.screen_intro_two, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ScreenIntroTwoBinding bind(View view) {
        View findChildViewById;
        int i = R.id.btn_next;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
        if (cardView != null) {
            i = R.id.circleIndicatorContainer;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.layoutShimmer))) != null) {
                ViewAdNativeCompactBinding bind = ViewAdNativeCompactBinding.bind(findChildViewById);
                i = R.id.linerBottom;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout2 != null) {
                    i = R.id.liner_bottom;
                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout3 != null) {
                        RelativeLayout relativeLayout = (RelativeLayout) view;
                        i = R.id.ry_native;
                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                        if (relativeLayout2 != null) {
                            i = R.id.shimmer_container_native;
                            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) ViewBindings.findChildViewById(view, i);
                            if (shimmerFrameLayout != null) {
                                i = R.id.skip;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView != null) {
                                    i = R.id.txtNext;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView2 != null) {
                                        i = R.id.view_1;
                                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                        if (imageView != null) {
                                            i = R.id.view_2;
                                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                            if (imageView2 != null) {
                                                i = R.id.view_3;
                                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                if (imageView3 != null) {
                                                    return new ScreenIntroTwoBinding(relativeLayout, cardView, linearLayout, bind, linearLayout2, linearLayout3, relativeLayout, relativeLayout2, shimmerFrameLayout, textView, textView2, imageView, imageView2, imageView3);
                                                }
                                            }
                                        }
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
