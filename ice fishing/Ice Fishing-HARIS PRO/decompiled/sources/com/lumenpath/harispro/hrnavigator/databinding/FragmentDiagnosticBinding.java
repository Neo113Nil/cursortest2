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
public final class FragmentDiagnosticBinding {
    public final MaterialButton nextButton;
    public final MaterialButton noButton;
    public final ProgressBar progressBar;
    public final TextView progressText;
    public final TextView questionText;
    private final LinearLayout rootView;
    public final MaterialButton sometimesButton;
    public final MaterialButton yesButton;

    private FragmentDiagnosticBinding(LinearLayout linearLayout, MaterialButton materialButton, MaterialButton materialButton2, ProgressBar progressBar, TextView textView, TextView textView2, MaterialButton materialButton3, MaterialButton materialButton4) {
        this.rootView = linearLayout;
        this.nextButton = materialButton;
        this.noButton = materialButton2;
        this.progressBar = progressBar;
        this.progressText = textView;
        this.questionText = textView2;
        this.sometimesButton = materialButton3;
        this.yesButton = materialButton4;
    }

    public static FragmentDiagnosticBinding bind(View view) {
        int i = R.id.nextButton;
        MaterialButton materialButton = (MaterialButton) f.k(view, R.id.nextButton);
        if (materialButton != null) {
            i = R.id.noButton;
            MaterialButton materialButton2 = (MaterialButton) f.k(view, R.id.noButton);
            if (materialButton2 != null) {
                i = R.id.progressBar;
                ProgressBar progressBar = (ProgressBar) f.k(view, R.id.progressBar);
                if (progressBar != null) {
                    i = R.id.progressText;
                    TextView textView = (TextView) f.k(view, R.id.progressText);
                    if (textView != null) {
                        i = R.id.questionText;
                        TextView textView2 = (TextView) f.k(view, R.id.questionText);
                        if (textView2 != null) {
                            i = R.id.sometimesButton;
                            MaterialButton materialButton3 = (MaterialButton) f.k(view, R.id.sometimesButton);
                            if (materialButton3 != null) {
                                i = R.id.yesButton;
                                MaterialButton materialButton4 = (MaterialButton) f.k(view, R.id.yesButton);
                                if (materialButton4 != null) {
                                    return new FragmentDiagnosticBinding((LinearLayout) view, materialButton, materialButton2, progressBar, textView, textView2, materialButton3, materialButton4);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentDiagnosticBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDiagnosticBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View inflate = layoutInflater.inflate(R.layout.fragment_diagnostic, viewGroup, false);
        if (z2) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}
