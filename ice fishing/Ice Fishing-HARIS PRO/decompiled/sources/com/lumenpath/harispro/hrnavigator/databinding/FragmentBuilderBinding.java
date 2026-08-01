package com.lumenpath.harispro.hrnavigator.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.lumenpath.harispro.hrnavigator.R;
import h0.f;

/* loaded from: classes.dex */
public final class FragmentBuilderBinding {
    public final MaterialButton nextButton;
    public final LinearLayout optionsContainer;
    public final LinearLayout resultContainer;
    public final RecyclerView resultRecycler;
    private final ScrollView rootView;
    public final TextView stepDescription;
    public final TextView stepTitle;

    private FragmentBuilderBinding(ScrollView scrollView, MaterialButton materialButton, LinearLayout linearLayout, LinearLayout linearLayout2, RecyclerView recyclerView, TextView textView, TextView textView2) {
        this.rootView = scrollView;
        this.nextButton = materialButton;
        this.optionsContainer = linearLayout;
        this.resultContainer = linearLayout2;
        this.resultRecycler = recyclerView;
        this.stepDescription = textView;
        this.stepTitle = textView2;
    }

    public static FragmentBuilderBinding bind(View view) {
        int i = R.id.nextButton;
        MaterialButton materialButton = (MaterialButton) f.k(view, R.id.nextButton);
        if (materialButton != null) {
            i = R.id.optionsContainer;
            LinearLayout linearLayout = (LinearLayout) f.k(view, R.id.optionsContainer);
            if (linearLayout != null) {
                i = R.id.resultContainer;
                LinearLayout linearLayout2 = (LinearLayout) f.k(view, R.id.resultContainer);
                if (linearLayout2 != null) {
                    i = R.id.resultRecycler;
                    RecyclerView recyclerView = (RecyclerView) f.k(view, R.id.resultRecycler);
                    if (recyclerView != null) {
                        i = R.id.stepDescription;
                        TextView textView = (TextView) f.k(view, R.id.stepDescription);
                        if (textView != null) {
                            i = R.id.stepTitle;
                            TextView textView2 = (TextView) f.k(view, R.id.stepTitle);
                            if (textView2 != null) {
                                return new FragmentBuilderBinding((ScrollView) view, materialButton, linearLayout, linearLayout2, recyclerView, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentBuilderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentBuilderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View inflate = layoutInflater.inflate(R.layout.fragment_builder, viewGroup, false);
        if (z2) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ScrollView getRoot() {
        return this.rootView;
    }
}
