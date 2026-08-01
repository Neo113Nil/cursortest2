package com.lumenpath.harispro.hrnavigator.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.lumenpath.harispro.hrnavigator.R;
import h0.f;

/* loaded from: classes.dex */
public final class FragmentStructureDetailBinding {
    public final TextView consText;
    public final TextView descriptionText;
    public final TextView prosText;
    private final ScrollView rootView;
    public final LinearLayout schemaContainer;
    public final TextView titleText;
    public final TextView whenText;

    private FragmentStructureDetailBinding(ScrollView scrollView, TextView textView, TextView textView2, TextView textView3, LinearLayout linearLayout, TextView textView4, TextView textView5) {
        this.rootView = scrollView;
        this.consText = textView;
        this.descriptionText = textView2;
        this.prosText = textView3;
        this.schemaContainer = linearLayout;
        this.titleText = textView4;
        this.whenText = textView5;
    }

    public static FragmentStructureDetailBinding bind(View view) {
        int i = R.id.consText;
        TextView textView = (TextView) f.k(view, R.id.consText);
        if (textView != null) {
            i = R.id.descriptionText;
            TextView textView2 = (TextView) f.k(view, R.id.descriptionText);
            if (textView2 != null) {
                i = R.id.prosText;
                TextView textView3 = (TextView) f.k(view, R.id.prosText);
                if (textView3 != null) {
                    i = R.id.schemaContainer;
                    LinearLayout linearLayout = (LinearLayout) f.k(view, R.id.schemaContainer);
                    if (linearLayout != null) {
                        i = R.id.titleText;
                        TextView textView4 = (TextView) f.k(view, R.id.titleText);
                        if (textView4 != null) {
                            i = R.id.whenText;
                            TextView textView5 = (TextView) f.k(view, R.id.whenText);
                            if (textView5 != null) {
                                return new FragmentStructureDetailBinding((ScrollView) view, textView, textView2, textView3, linearLayout, textView4, textView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentStructureDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentStructureDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View inflate = layoutInflater.inflate(R.layout.fragment_structure_detail, viewGroup, false);
        if (z2) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ScrollView getRoot() {
        return this.rootView;
    }
}
