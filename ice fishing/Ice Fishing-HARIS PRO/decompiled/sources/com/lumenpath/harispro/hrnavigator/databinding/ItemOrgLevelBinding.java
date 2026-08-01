package com.lumenpath.harispro.hrnavigator.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.lumenpath.harispro.hrnavigator.R;
import h0.f;

/* loaded from: classes.dex */
public final class ItemOrgLevelBinding {
    public final TextView levelText;
    private final MaterialCardView rootView;

    private ItemOrgLevelBinding(MaterialCardView materialCardView, TextView textView) {
        this.rootView = materialCardView;
        this.levelText = textView;
    }

    public static ItemOrgLevelBinding bind(View view) {
        TextView textView = (TextView) f.k(view, R.id.levelText);
        if (textView != null) {
            return new ItemOrgLevelBinding((MaterialCardView) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.levelText)));
    }

    public static ItemOrgLevelBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemOrgLevelBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View inflate = layoutInflater.inflate(R.layout.item_org_level, viewGroup, false);
        if (z2) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public MaterialCardView getRoot() {
        return this.rootView;
    }
}
