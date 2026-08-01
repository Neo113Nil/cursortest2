package com.lumenpath.harispro.hrnavigator.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.lumenpath.harispro.hrnavigator.R;
import h0.f;

/* loaded from: classes.dex */
public final class FragmentChecklistDetailBinding {
    public final LinearLayout checkboxContainer;
    public final MaterialButton clearButton;
    private final LinearLayout rootView;
    public final TextView titleText;

    private FragmentChecklistDetailBinding(LinearLayout linearLayout, LinearLayout linearLayout2, MaterialButton materialButton, TextView textView) {
        this.rootView = linearLayout;
        this.checkboxContainer = linearLayout2;
        this.clearButton = materialButton;
        this.titleText = textView;
    }

    public static FragmentChecklistDetailBinding bind(View view) {
        int i = R.id.checkboxContainer;
        LinearLayout linearLayout = (LinearLayout) f.k(view, R.id.checkboxContainer);
        if (linearLayout != null) {
            i = R.id.clearButton;
            MaterialButton materialButton = (MaterialButton) f.k(view, R.id.clearButton);
            if (materialButton != null) {
                i = R.id.titleText;
                TextView textView = (TextView) f.k(view, R.id.titleText);
                if (textView != null) {
                    return new FragmentChecklistDetailBinding((LinearLayout) view, linearLayout, materialButton, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentChecklistDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentChecklistDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View inflate = layoutInflater.inflate(R.layout.fragment_checklist_detail, viewGroup, false);
        if (z2) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}
