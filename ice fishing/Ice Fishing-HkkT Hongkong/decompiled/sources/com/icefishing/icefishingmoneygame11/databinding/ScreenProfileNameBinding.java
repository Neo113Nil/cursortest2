package com.icefishing.icefishingmoneygame11.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.icefishing.icefishingmoneygame11.R;

/* loaded from: classes2.dex */
public final class ScreenProfileNameBinding implements ViewBinding {
    public final CardView cardCountry2;
    public final CardView cardviewContinue;
    public final ViewAdNativeCompactBinding layoutShimmer;
    public final LinearLayout linerBottom;
    public final RelativeLayout main;
    public final LinearLayout relativeToolbar;
    private final RelativeLayout rootView;
    public final RelativeLayout ryNative;
    public final ShimmerFrameLayout shimmerContainerNative;
    public final EditText txtName;

    private ScreenProfileNameBinding(RelativeLayout relativeLayout, CardView cardView, CardView cardView2, ViewAdNativeCompactBinding viewAdNativeCompactBinding, LinearLayout linearLayout, RelativeLayout relativeLayout2, LinearLayout linearLayout2, RelativeLayout relativeLayout3, ShimmerFrameLayout shimmerFrameLayout, EditText editText) {
        this.rootView = relativeLayout;
        this.cardCountry2 = cardView;
        this.cardviewContinue = cardView2;
        this.layoutShimmer = viewAdNativeCompactBinding;
        this.linerBottom = linearLayout;
        this.main = relativeLayout2;
        this.relativeToolbar = linearLayout2;
        this.ryNative = relativeLayout3;
        this.shimmerContainerNative = shimmerFrameLayout;
        this.txtName = editText;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ScreenProfileNameBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ScreenProfileNameBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.screen_profile_name, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ScreenProfileNameBinding bind(View view) {
        View findChildViewById;
        int i = R.id.cardCountry2;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
        if (cardView != null) {
            i = R.id.cardviewContinue;
            CardView cardView2 = (CardView) ViewBindings.findChildViewById(view, i);
            if (cardView2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.layoutShimmer))) != null) {
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
                            if (shimmerFrameLayout != null) {
                                i = R.id.txtName;
                                EditText editText = (EditText) ViewBindings.findChildViewById(view, i);
                                if (editText != null) {
                                    return new ScreenProfileNameBinding(relativeLayout, cardView, cardView2, bind, linearLayout, relativeLayout, linearLayout2, relativeLayout2, shimmerFrameLayout, editText);
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
