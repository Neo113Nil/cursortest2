package com.icefishing.icefishingmoneygame11.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.icefishing.icefishingmoneygame11.R;

/* loaded from: classes2.dex */
public final class DialogNetworkRequiredBinding implements ViewBinding {
    public final AppCompatButton btnOk;
    public final ImageView imgRed;
    public final RelativeLayout relativeUpdate;
    private final RelativeLayout rootView;

    private DialogNetworkRequiredBinding(RelativeLayout relativeLayout, AppCompatButton appCompatButton, ImageView imageView, RelativeLayout relativeLayout2) {
        this.rootView = relativeLayout;
        this.btnOk = appCompatButton;
        this.imgRed = imageView;
        this.relativeUpdate = relativeLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static DialogNetworkRequiredBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogNetworkRequiredBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_network_required, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogNetworkRequiredBinding bind(View view) {
        int i = R.id.btn_ok;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(view, i);
        if (appCompatButton != null) {
            i = R.id.img_red;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                RelativeLayout relativeLayout = (RelativeLayout) view;
                return new DialogNetworkRequiredBinding(relativeLayout, appCompatButton, imageView, relativeLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
