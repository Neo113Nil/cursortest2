package com.icefishing.icefishingmoneygame11.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.gms.ads.nativead.AdChoicesView;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.icefishing.icefishingmoneygame11.R;

/* loaded from: classes2.dex */
public final class ViewAdNativeFullBinding implements ViewBinding {
    public final TextView adAdvertiser;
    public final TextView adBody;
    public final AdChoicesView adChoices;
    public final Button adCta;
    public final TextView adHeadline;
    public final ImageView adIcon;
    public final MediaView adMedia;
    public final NativeAdView nativeAdView;
    public final RelativeLayout realtive;
    private final NativeAdView rootView;
    public final TextView tvName;

    private ViewAdNativeFullBinding(NativeAdView nativeAdView, TextView textView, TextView textView2, AdChoicesView adChoicesView, Button button, TextView textView3, ImageView imageView, MediaView mediaView, NativeAdView nativeAdView2, RelativeLayout relativeLayout, TextView textView4) {
        this.rootView = nativeAdView;
        this.adAdvertiser = textView;
        this.adBody = textView2;
        this.adChoices = adChoicesView;
        this.adCta = button;
        this.adHeadline = textView3;
        this.adIcon = imageView;
        this.adMedia = mediaView;
        this.nativeAdView = nativeAdView2;
        this.realtive = relativeLayout;
        this.tvName = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public NativeAdView getRoot() {
        return this.rootView;
    }

    public static ViewAdNativeFullBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ViewAdNativeFullBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.view_ad_native_full, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ViewAdNativeFullBinding bind(View view) {
        int i = R.id.ad_advertiser;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.ad_body;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = R.id.ad_choices;
                AdChoicesView adChoicesView = (AdChoicesView) ViewBindings.findChildViewById(view, i);
                if (adChoicesView != null) {
                    i = R.id.ad_cta;
                    Button button = (Button) ViewBindings.findChildViewById(view, i);
                    if (button != null) {
                        i = R.id.ad_headline;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView3 != null) {
                            i = R.id.ad_icon;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView != null) {
                                i = R.id.ad_media;
                                MediaView mediaView = (MediaView) ViewBindings.findChildViewById(view, i);
                                if (mediaView != null) {
                                    NativeAdView nativeAdView = (NativeAdView) view;
                                    i = R.id.realtive;
                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                    if (relativeLayout != null) {
                                        i = R.id.tvName;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView4 != null) {
                                            return new ViewAdNativeFullBinding(nativeAdView, textView, textView2, adChoicesView, button, textView3, imageView, mediaView, nativeAdView, relativeLayout, textView4);
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
