package com.lumenpath.harispro.hrnavigator.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.lumenpath.harispro.hrnavigator.R;
import h0.f;

/* loaded from: classes.dex */
public final class ActivitySplashBinding {
    public final View logoBackground;
    public final ImageView logoImage;
    public final ProgressBar progressBar;
    private final ConstraintLayout rootView;
    public final TextView subtitleText;
    public final TextView titleText;

    private ActivitySplashBinding(ConstraintLayout constraintLayout, View view, ImageView imageView, ProgressBar progressBar, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.logoBackground = view;
        this.logoImage = imageView;
        this.progressBar = progressBar;
        this.subtitleText = textView;
        this.titleText = textView2;
    }

    public static ActivitySplashBinding bind(View view) {
        int i = R.id.logoBackground;
        View k2 = f.k(view, R.id.logoBackground);
        if (k2 != null) {
            i = R.id.logoImage;
            ImageView imageView = (ImageView) f.k(view, R.id.logoImage);
            if (imageView != null) {
                i = R.id.progressBar;
                ProgressBar progressBar = (ProgressBar) f.k(view, R.id.progressBar);
                if (progressBar != null) {
                    i = R.id.subtitleText;
                    TextView textView = (TextView) f.k(view, R.id.subtitleText);
                    if (textView != null) {
                        i = R.id.titleText;
                        TextView textView2 = (TextView) f.k(view, R.id.titleText);
                        if (textView2 != null) {
                            return new ActivitySplashBinding((ConstraintLayout) view, k2, imageView, progressBar, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ActivitySplashBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivitySplashBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View inflate = layoutInflater.inflate(R.layout.activity_splash, viewGroup, false);
        if (z2) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
