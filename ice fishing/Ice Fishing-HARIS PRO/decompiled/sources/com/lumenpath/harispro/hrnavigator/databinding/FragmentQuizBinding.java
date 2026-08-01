package com.lumenpath.harispro.hrnavigator.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.lumenpath.harispro.hrnavigator.R;
import h0.f;

/* loaded from: classes.dex */
public final class FragmentQuizBinding {
    public final MaterialButton nextButton;
    public final LinearLayout optionsContainer;
    public final ProgressBar progressBar;
    public final TextView questionText;
    private final LinearLayout rootView;

    private FragmentQuizBinding(LinearLayout linearLayout, MaterialButton materialButton, LinearLayout linearLayout2, ProgressBar progressBar, TextView textView) {
        this.rootView = linearLayout;
        this.nextButton = materialButton;
        this.optionsContainer = linearLayout2;
        this.progressBar = progressBar;
        this.questionText = textView;
    }

    public static FragmentQuizBinding bind(View view) {
        int i = R.id.nextButton;
        MaterialButton materialButton = (MaterialButton) f.k(view, R.id.nextButton);
        if (materialButton != null) {
            i = R.id.optionsContainer;
            LinearLayout linearLayout = (LinearLayout) f.k(view, R.id.optionsContainer);
            if (linearLayout != null) {
                i = R.id.progressBar;
                ProgressBar progressBar = (ProgressBar) f.k(view, R.id.progressBar);
                if (progressBar != null) {
                    i = R.id.questionText;
                    TextView textView = (TextView) f.k(view, R.id.questionText);
                    if (textView != null) {
                        return new FragmentQuizBinding((LinearLayout) view, materialButton, linearLayout, progressBar, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentQuizBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentQuizBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View inflate = layoutInflater.inflate(R.layout.fragment_quiz, viewGroup, false);
        if (z2) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}
