package com.lumenpath.harispro.hrnavigator.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.lumenpath.harispro.hrnavigator.R;
import h0.f;

/* loaded from: classes.dex */
public final class ItemListCardBinding {
    public final TextView descriptionText;
    public final TextView iconText;
    private final MaterialCardView rootView;
    public final TextView titleText;

    private ItemListCardBinding(MaterialCardView materialCardView, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = materialCardView;
        this.descriptionText = textView;
        this.iconText = textView2;
        this.titleText = textView3;
    }

    public static ItemListCardBinding bind(View view) {
        int i = R.id.descriptionText;
        TextView textView = (TextView) f.k(view, R.id.descriptionText);
        if (textView != null) {
            i = R.id.iconText;
            TextView textView2 = (TextView) f.k(view, R.id.iconText);
            if (textView2 != null) {
                i = R.id.titleText;
                TextView textView3 = (TextView) f.k(view, R.id.titleText);
                if (textView3 != null) {
                    return new ItemListCardBinding((MaterialCardView) view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ItemListCardBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemListCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View inflate = layoutInflater.inflate(R.layout.item_list_card, viewGroup, false);
        if (z2) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public MaterialCardView getRoot() {
        return this.rootView;
    }
}
