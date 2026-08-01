package com.lumenpath.harispro.hrnavigator.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.lumenpath.harispro.hrnavigator.R;
import h0.f;

/* loaded from: classes.dex */
public final class ItemSimpleCardBinding {
    private final MaterialCardView rootView;
    public final TextView textView;

    private ItemSimpleCardBinding(MaterialCardView materialCardView, TextView textView) {
        this.rootView = materialCardView;
        this.textView = textView;
    }

    public static ItemSimpleCardBinding bind(View view) {
        TextView textView = (TextView) f.k(view, R.id.textView);
        if (textView != null) {
            return new ItemSimpleCardBinding((MaterialCardView) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.textView)));
    }

    public static ItemSimpleCardBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemSimpleCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View inflate = layoutInflater.inflate(R.layout.item_simple_card, viewGroup, false);
        if (z2) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public MaterialCardView getRoot() {
        return this.rootView;
    }
}
