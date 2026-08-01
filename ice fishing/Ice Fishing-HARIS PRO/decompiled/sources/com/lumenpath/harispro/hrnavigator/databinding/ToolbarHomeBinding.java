package com.lumenpath.harispro.hrnavigator.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.card.MaterialCardView;
import com.lumenpath.harispro.hrnavigator.R;

/* loaded from: classes.dex */
public final class ToolbarHomeBinding {
    private final MaterialCardView rootView;

    private ToolbarHomeBinding(MaterialCardView materialCardView) {
        this.rootView = materialCardView;
    }

    public static ToolbarHomeBinding bind(View view) {
        if (view != null) {
            return new ToolbarHomeBinding((MaterialCardView) view);
        }
        throw new NullPointerException("rootView");
    }

    public static ToolbarHomeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ToolbarHomeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View inflate = layoutInflater.inflate(R.layout.toolbar_home, viewGroup, false);
        if (z2) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public MaterialCardView getRoot() {
        return this.rootView;
    }
}
