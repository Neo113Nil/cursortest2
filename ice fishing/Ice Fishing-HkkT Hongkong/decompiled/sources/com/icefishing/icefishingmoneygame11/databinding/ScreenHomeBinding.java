package com.icefishing.icefishingmoneygame11.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.icefishing.icefishingmoneygame11.R;

/* loaded from: classes2.dex */
public final class ScreenHomeBinding implements ViewBinding {
    public final CardView cardviewPrivacy;
    public final CardView cardviewRate;
    public final CardView cardviewShare;
    public final CardView cardviewStart;
    public final ViewAdNativeCompactBinding layoutShimmer;
    public final LinearLayout linerToolbar;
    public final RelativeLayout main;
    private final RelativeLayout rootView;
    public final RelativeLayout ryNative;
    public final ShimmerFrameLayout shimmerContainerNative;
    public final TextView textView3;

    private ScreenHomeBinding(RelativeLayout relativeLayout, CardView cardView, CardView cardView2, CardView cardView3, CardView cardView4, ViewAdNativeCompactBinding viewAdNativeCompactBinding, LinearLayout linearLayout, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, ShimmerFrameLayout shimmerFrameLayout, TextView textView) {
        this.rootView = relativeLayout;
        this.cardviewPrivacy = cardView;
        this.cardviewRate = cardView2;
        this.cardviewShare = cardView3;
        this.cardviewStart = cardView4;
        this.layoutShimmer = viewAdNativeCompactBinding;
        this.linerToolbar = linearLayout;
        this.main = relativeLayout2;
        this.ryNative = relativeLayout3;
        this.shimmerContainerNative = shimmerFrameLayout;
        this.textView3 = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ScreenHomeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ScreenHomeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.screen_home, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ScreenHomeBinding bind(View view) {
        View findChildViewById;
        int i = R.id.cardviewPrivacy;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
        if (cardView != null) {
            i = R.id.cardviewRate;
            CardView cardView2 = (CardView) ViewBindings.findChildViewById(view, i);
            if (cardView2 != null) {
                i = R.id.cardviewShare;
                CardView cardView3 = (CardView) ViewBindings.findChildViewById(view, i);
                if (cardView3 != null) {
                    i = R.id.cardviewStart;
                    CardView cardView4 = (CardView) ViewBindings.findChildViewById(view, i);
                    if (cardView4 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.layoutShimmer))) != null) {
                        ViewAdNativeCompactBinding bind = ViewAdNativeCompactBinding.bind(findChildViewById);
                        i = R.id.linerToolbar;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout != null) {
                            RelativeLayout relativeLayout = (RelativeLayout) view;
                            i = R.id.ry_native;
                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                            if (relativeLayout2 != null) {
                                i = R.id.shimmer_container_native;
                                ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) ViewBindings.findChildViewById(view, i);
                                if (shimmerFrameLayout != null) {
                                    i = R.id.textView3;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView != null) {
                                        return new ScreenHomeBinding(relativeLayout, cardView, cardView2, cardView3, cardView4, bind, linearLayout, relativeLayout, relativeLayout2, shimmerFrameLayout, textView);
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
