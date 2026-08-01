package com.lumenpath.harispro.hrnavigator.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.lumenpath.harispro.hrnavigator.R;
import h0.f;

/* loaded from: classes.dex */
public final class ItemExpandableSimpleBinding {
    public final MaterialCardView cardView;
    public final TextView contentText;
    public final View divider;
    public final TextView expandIcon;
    private final LinearLayout rootView;
    public final TextView titleText;

    private ItemExpandableSimpleBinding(LinearLayout linearLayout, MaterialCardView materialCardView, TextView textView, View view, TextView textView2, TextView textView3) {
        this.rootView = linearLayout;
        this.cardView = materialCardView;
        this.contentText = textView;
        this.divider = view;
        this.expandIcon = textView2;
        this.titleText = textView3;
    }

    public static ItemExpandableSimpleBinding bind(View view) {
        int i = R.id.cardView;
        MaterialCardView materialCardView = (MaterialCardView) f.k(view, R.id.cardView);
        if (materialCardView != null) {
            i = R.id.contentText;
            TextView textView = (TextView) f.k(view, R.id.contentText);
            if (textView != null) {
                i = R.id.divider;
                View k2 = f.k(view, R.id.divider);
                if (k2 != null) {
                    i = R.id.expandIcon;
                    TextView textView2 = (TextView) f.k(view, R.id.expandIcon);
                    if (textView2 != null) {
                        i = R.id.titleText;
                        TextView textView3 = (TextView) f.k(view, R.id.titleText);
                        if (textView3 != null) {
                            return new ItemExpandableSimpleBinding((LinearLayout) view, materialCardView, textView, k2, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ItemExpandableSimpleBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemExpandableSimpleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View inflate = layoutInflater.inflate(R.layout.item_expandable_simple, viewGroup, false);
        if (z2) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}
