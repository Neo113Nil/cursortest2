package com.icefishing.icefishingmoneygame11.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.icefishing.icefishingmoneygame11.R;

/* loaded from: classes2.dex */
public final class ScreenLaunchBinding implements ViewBinding {
    public final LottieAnimationView lottie;
    public final RelativeLayout main;
    private final RelativeLayout rootView;
    public final FrameLayout splashAdContainer;

    private ScreenLaunchBinding(RelativeLayout relativeLayout, LottieAnimationView lottieAnimationView, RelativeLayout relativeLayout2, FrameLayout frameLayout) {
        this.rootView = relativeLayout;
        this.lottie = lottieAnimationView;
        this.main = relativeLayout2;
        this.splashAdContainer = frameLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ScreenLaunchBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ScreenLaunchBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.screen_launch, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ScreenLaunchBinding bind(View view) {
        int i = R.id.lottie;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
        if (lottieAnimationView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            int i2 = R.id.splash_ad_container;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i2);
            if (frameLayout != null) {
                return new ScreenLaunchBinding(relativeLayout, lottieAnimationView, relativeLayout, frameLayout);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
