package com.icefishing.icefishingmoneygame11.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.icefishing.icefishingmoneygame11.R;

/* loaded from: classes2.dex */
public final class ScreenCountrySelectionBinding implements ViewBinding {
    public final CardView cardCountry1;
    public final CardView cardCountry2;
    public final CardView cardCountry3;
    public final CardView cardCountry4;
    public final CardView cardCountry5;
    public final CardView cardCountry6;
    public final CardView cardCountry7;
    public final CardView cardCountry8;
    public final CardView cardviewContinue;
    public final ImageView imgSelect1;
    public final ImageView imgSelect2;
    public final ImageView imgSelect3;
    public final ImageView imgSelect4;
    public final ImageView imgSelect5;
    public final ImageView imgSelect6;
    public final ImageView imgSelect7;
    public final ImageView imgSelect8;
    public final ViewAdNativeCompactBinding layoutShimmer;
    public final LinearLayout linerBottom;
    public final RelativeLayout main;
    public final LinearLayout relativeToolbar;
    private final RelativeLayout rootView;
    public final RelativeLayout ryNative;
    public final ShimmerFrameLayout shimmerContainerNative;
    public final View vSelect1;
    public final View vSelect2;
    public final View vSelect3;
    public final View vSelect4;
    public final View vSelect5;
    public final View vSelect6;
    public final View vSelect7;
    public final View vSelect8;

    private ScreenCountrySelectionBinding(RelativeLayout relativeLayout, CardView cardView, CardView cardView2, CardView cardView3, CardView cardView4, CardView cardView5, CardView cardView6, CardView cardView7, CardView cardView8, CardView cardView9, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, ImageView imageView8, ViewAdNativeCompactBinding viewAdNativeCompactBinding, LinearLayout linearLayout, RelativeLayout relativeLayout2, LinearLayout linearLayout2, RelativeLayout relativeLayout3, ShimmerFrameLayout shimmerFrameLayout, View view, View view2, View view3, View view4, View view5, View view6, View view7, View view8) {
        this.rootView = relativeLayout;
        this.cardCountry1 = cardView;
        this.cardCountry2 = cardView2;
        this.cardCountry3 = cardView3;
        this.cardCountry4 = cardView4;
        this.cardCountry5 = cardView5;
        this.cardCountry6 = cardView6;
        this.cardCountry7 = cardView7;
        this.cardCountry8 = cardView8;
        this.cardviewContinue = cardView9;
        this.imgSelect1 = imageView;
        this.imgSelect2 = imageView2;
        this.imgSelect3 = imageView3;
        this.imgSelect4 = imageView4;
        this.imgSelect5 = imageView5;
        this.imgSelect6 = imageView6;
        this.imgSelect7 = imageView7;
        this.imgSelect8 = imageView8;
        this.layoutShimmer = viewAdNativeCompactBinding;
        this.linerBottom = linearLayout;
        this.main = relativeLayout2;
        this.relativeToolbar = linearLayout2;
        this.ryNative = relativeLayout3;
        this.shimmerContainerNative = shimmerFrameLayout;
        this.vSelect1 = view;
        this.vSelect2 = view2;
        this.vSelect3 = view3;
        this.vSelect4 = view4;
        this.vSelect5 = view5;
        this.vSelect6 = view6;
        this.vSelect7 = view7;
        this.vSelect8 = view8;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ScreenCountrySelectionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ScreenCountrySelectionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.screen_country_selection, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ScreenCountrySelectionBinding bind(View view) {
        View findChildViewById;
        View findChildViewById2;
        View findChildViewById3;
        View findChildViewById4;
        View findChildViewById5;
        View findChildViewById6;
        View findChildViewById7;
        View findChildViewById8;
        View findChildViewById9;
        int i = R.id.cardCountry1;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
        if (cardView != null) {
            i = R.id.cardCountry2;
            CardView cardView2 = (CardView) ViewBindings.findChildViewById(view, i);
            if (cardView2 != null) {
                i = R.id.cardCountry3;
                CardView cardView3 = (CardView) ViewBindings.findChildViewById(view, i);
                if (cardView3 != null) {
                    i = R.id.cardCountry4;
                    CardView cardView4 = (CardView) ViewBindings.findChildViewById(view, i);
                    if (cardView4 != null) {
                        i = R.id.cardCountry5;
                        CardView cardView5 = (CardView) ViewBindings.findChildViewById(view, i);
                        if (cardView5 != null) {
                            i = R.id.cardCountry6;
                            CardView cardView6 = (CardView) ViewBindings.findChildViewById(view, i);
                            if (cardView6 != null) {
                                i = R.id.cardCountry7;
                                CardView cardView7 = (CardView) ViewBindings.findChildViewById(view, i);
                                if (cardView7 != null) {
                                    i = R.id.cardCountry8;
                                    CardView cardView8 = (CardView) ViewBindings.findChildViewById(view, i);
                                    if (cardView8 != null) {
                                        i = R.id.cardviewContinue;
                                        CardView cardView9 = (CardView) ViewBindings.findChildViewById(view, i);
                                        if (cardView9 != null) {
                                            i = R.id.imgSelect1;
                                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                            if (imageView != null) {
                                                i = R.id.imgSelect2;
                                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                if (imageView2 != null) {
                                                    i = R.id.imgSelect3;
                                                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                    if (imageView3 != null) {
                                                        i = R.id.imgSelect4;
                                                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                        if (imageView4 != null) {
                                                            i = R.id.imgSelect5;
                                                            ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                            if (imageView5 != null) {
                                                                i = R.id.imgSelect6;
                                                                ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                if (imageView6 != null) {
                                                                    i = R.id.imgSelect7;
                                                                    ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                    if (imageView7 != null) {
                                                                        i = R.id.imgSelect8;
                                                                        ImageView imageView8 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                        if (imageView8 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.layoutShimmer))) != null) {
                                                                            ViewAdNativeCompactBinding bind = ViewAdNativeCompactBinding.bind(findChildViewById);
                                                                            i = R.id.linerBottom;
                                                                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                            if (linearLayout != null) {
                                                                                RelativeLayout relativeLayout = (RelativeLayout) view;
                                                                                i = R.id.relativeToolbar;
                                                                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                                if (linearLayout2 != null) {
                                                                                    i = R.id.ry_native;
                                                                                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                                                                    if (relativeLayout2 != null) {
                                                                                        i = R.id.shimmer_container_native;
                                                                                        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) ViewBindings.findChildViewById(view, i);
                                                                                        if (shimmerFrameLayout != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.vSelect1))) != null && (findChildViewById3 = ViewBindings.findChildViewById(view, (i = R.id.vSelect2))) != null && (findChildViewById4 = ViewBindings.findChildViewById(view, (i = R.id.vSelect3))) != null && (findChildViewById5 = ViewBindings.findChildViewById(view, (i = R.id.vSelect4))) != null && (findChildViewById6 = ViewBindings.findChildViewById(view, (i = R.id.vSelect5))) != null && (findChildViewById7 = ViewBindings.findChildViewById(view, (i = R.id.vSelect6))) != null && (findChildViewById8 = ViewBindings.findChildViewById(view, (i = R.id.vSelect7))) != null && (findChildViewById9 = ViewBindings.findChildViewById(view, (i = R.id.vSelect8))) != null) {
                                                                                            return new ScreenCountrySelectionBinding(relativeLayout, cardView, cardView2, cardView3, cardView4, cardView5, cardView6, cardView7, cardView8, cardView9, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, bind, linearLayout, relativeLayout, linearLayout2, relativeLayout2, shimmerFrameLayout, findChildViewById2, findChildViewById3, findChildViewById4, findChildViewById5, findChildViewById6, findChildViewById7, findChildViewById8, findChildViewById9);
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
