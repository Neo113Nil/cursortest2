package com.lumenpath.harispro.hrnavigator.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.lumenpath.harispro.hrnavigator.R;
import h0.f;

/* loaded from: classes.dex */
public final class ViewSectionHeaderBinding {
    private final LinearLayout rootView;
    public final TextView sectionTitle;

    private ViewSectionHeaderBinding(LinearLayout linearLayout, TextView textView) {
        this.rootView = linearLayout;
        this.sectionTitle = textView;
    }

    public static ViewSectionHeaderBinding bind(View view) {
        TextView textView = (TextView) f.k(view, R.id.sectionTitle);
        if (textView != null) {
            return new ViewSectionHeaderBinding((LinearLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.sectionTitle)));
    }

    public static ViewSectionHeaderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ViewSectionHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View inflate = layoutInflater.inflate(R.layout.view_section_header, viewGroup, false);
        if (z2) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}
