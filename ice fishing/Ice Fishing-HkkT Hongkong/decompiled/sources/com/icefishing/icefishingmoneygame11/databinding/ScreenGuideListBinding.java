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
public final class ScreenGuideListBinding implements ViewBinding {
    public final ViewQurekaNativeLargeBinding QurekaAdsNative;
    public final CardView cardTopic1;
    public final CardView cardTopic10;
    public final CardView cardTopic2;
    public final CardView cardTopic3;
    public final CardView cardTopic4;
    public final CardView cardTopic5;
    public final CardView cardTopic6;
    public final CardView cardTopic7;
    public final CardView cardTopic8;
    public final CardView cardTopic9;
    public final ViewAdNativeCompactBinding layoutShimmer;
    public final RelativeLayout main;
    public final LinearLayout relativeToolbar;
    private final RelativeLayout rootView;
    public final RelativeLayout ryNative;
    public final ShimmerFrameLayout shimmerContainerNative;

    private ScreenGuideListBinding(RelativeLayout relativeLayout, ViewQurekaNativeLargeBinding viewQurekaNativeLargeBinding, CardView cardView, CardView cardView2, CardView cardView3, CardView cardView4, CardView cardView5, CardView cardView6, CardView cardView7, CardView cardView8, CardView cardView9, CardView cardView10, ViewAdNativeCompactBinding viewAdNativeCompactBinding, RelativeLayout relativeLayout2, LinearLayout linearLayout, RelativeLayout relativeLayout3, ShimmerFrameLayout shimmerFrameLayout) {
        this.rootView = relativeLayout;
        this.QurekaAdsNative = viewQurekaNativeLargeBinding;
        this.cardTopic1 = cardView;
        this.cardTopic10 = cardView2;
        this.cardTopic2 = cardView3;
        this.cardTopic3 = cardView4;
        this.cardTopic4 = cardView5;
        this.cardTopic5 = cardView6;
        this.cardTopic6 = cardView7;
        this.cardTopic7 = cardView8;
        this.cardTopic8 = cardView9;
        this.cardTopic9 = cardView10;
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

    public static ScreenGuideListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ScreenGuideListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.screen_guide_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ScreenGuideListBinding bind(View view) {
        View findChildViewById;
        int i = R.id.QurekaAds_native;
        View findChildViewById2 = ViewBindings.findChildViewById(view, i);
        if (findChildViewById2 != null) {
            ViewQurekaNativeLargeBinding bind = ViewQurekaNativeLargeBinding.bind(findChildViewById2);
            i = R.id.cardTopic1;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
            if (cardView != null) {
                i = R.id.cardTopic10;
                CardView cardView2 = (CardView) ViewBindings.findChildViewById(view, i);
                if (cardView2 != null) {
                    i = R.id.cardTopic2;
                    CardView cardView3 = (CardView) ViewBindings.findChildViewById(view, i);
                    if (cardView3 != null) {
                        i = R.id.cardTopic3;
                        CardView cardView4 = (CardView) ViewBindings.findChildViewById(view, i);
                        if (cardView4 != null) {
                            i = R.id.cardTopic4;
                            CardView cardView5 = (CardView) ViewBindings.findChildViewById(view, i);
                            if (cardView5 != null) {
                                i = R.id.cardTopic5;
                                CardView cardView6 = (CardView) ViewBindings.findChildViewById(view, i);
                                if (cardView6 != null) {
                                    i = R.id.cardTopic6;
                                    CardView cardView7 = (CardView) ViewBindings.findChildViewById(view, i);
                                    if (cardView7 != null) {
                                        i = R.id.cardTopic7;
                                        CardView cardView8 = (CardView) ViewBindings.findChildViewById(view, i);
                                        if (cardView8 != null) {
                                            i = R.id.cardTopic8;
                                            CardView cardView9 = (CardView) ViewBindings.findChildViewById(view, i);
                                            if (cardView9 != null) {
                                                i = R.id.cardTopic9;
                                                CardView cardView10 = (CardView) ViewBindings.findChildViewById(view, i);
                                                if (cardView10 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.layoutShimmer))) != null) {
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
                                                                return new ScreenGuideListBinding(relativeLayout, bind, cardView, cardView2, cardView3, cardView4, cardView5, cardView6, cardView7, cardView8, cardView9, cardView10, bind2, relativeLayout, linearLayout, relativeLayout2, shimmerFrameLayout);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
