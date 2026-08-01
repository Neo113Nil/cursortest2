package com.lumenpath.harispro.hrnavigator.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.lumenpath.harispro.hrnavigator.R;
import h0.f;

/* loaded from: classes.dex */
public final class FragmentCalculatorBinding {
    public final MaterialButton calculateButton;
    public final LinearLayout fieldsContainer;
    public final TextView resultText;
    private final ScrollView rootView;
    public final TextView titleText;

    private FragmentCalculatorBinding(ScrollView scrollView, MaterialButton materialButton, LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.rootView = scrollView;
        this.calculateButton = materialButton;
        this.fieldsContainer = linearLayout;
        this.resultText = textView;
        this.titleText = textView2;
    }

    public static FragmentCalculatorBinding bind(View view) {
        int i = R.id.calculateButton;
        MaterialButton materialButton = (MaterialButton) f.k(view, R.id.calculateButton);
        if (materialButton != null) {
            i = R.id.fieldsContainer;
            LinearLayout linearLayout = (LinearLayout) f.k(view, R.id.fieldsContainer);
            if (linearLayout != null) {
                i = R.id.resultText;
                TextView textView = (TextView) f.k(view, R.id.resultText);
                if (textView != null) {
                    i = R.id.titleText;
                    TextView textView2 = (TextView) f.k(view, R.id.titleText);
                    if (textView2 != null) {
                        return new FragmentCalculatorBinding((ScrollView) view, materialButton, linearLayout, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentCalculatorBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentCalculatorBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View inflate = layoutInflater.inflate(R.layout.fragment_calculator, viewGroup, false);
        if (z2) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ScrollView getRoot() {
        return this.rootView;
    }
}
