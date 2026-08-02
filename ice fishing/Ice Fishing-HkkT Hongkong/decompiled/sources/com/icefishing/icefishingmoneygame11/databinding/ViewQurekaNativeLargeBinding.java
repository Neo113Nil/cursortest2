package com.icefishing.icefishingmoneygame11.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.icefishing.icefishingmoneygame11.R;

/* loaded from: classes2.dex */
public final class ViewQurekaNativeLargeBinding implements ViewBinding {
    public final RelativeLayout QurekaAdsNative;
    public final TextView actionbutton;
    public final TextView adNotificationView;
    public final TextView description;
    public final ImageView gifimagview;
    public final ImageView imgMain;
    private final RelativeLayout rootView;
    public final TextView shortdiscrip;

    private ViewQurekaNativeLargeBinding(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, TextView textView, TextView textView2, TextView textView3, ImageView imageView, ImageView imageView2, TextView textView4) {
        this.rootView = relativeLayout;
        this.QurekaAdsNative = relativeLayout2;
        this.actionbutton = textView;
        this.adNotificationView = textView2;
        this.description = textView3;
        this.gifimagview = imageView;
        this.imgMain = imageView2;
        this.shortdiscrip = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ViewQurekaNativeLargeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ViewQurekaNativeLargeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.view_qureka_native_large, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ViewQurekaNativeLargeBinding bind(View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        int i = R.id.actionbutton;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.ad_notification_view;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = R.id.description;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView3 != null) {
                    i = R.id.gifimagview;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R.id.img_main;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView2 != null) {
                            i = R.id.shortdiscrip;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView4 != null) {
                                return new ViewQurekaNativeLargeBinding(relativeLayout, relativeLayout, textView, textView2, textView3, imageView, imageView2, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
