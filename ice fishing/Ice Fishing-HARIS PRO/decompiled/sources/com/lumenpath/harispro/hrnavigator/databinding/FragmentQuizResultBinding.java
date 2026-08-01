package com.lumenpath.harispro.hrnavigator.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.lumenpath.harispro.hrnavigator.R;
import h0.f;

/* loaded from: classes.dex */
public final class FragmentQuizResultBinding {
    public final TextView descriptionText;
    public final MaterialButton homeButton;
    public final MaterialButton retryButton;
    private final ScrollView rootView;
    public final TextView scoreText;
    public final TextView titleText;

    private FragmentQuizResultBinding(ScrollView scrollView, TextView textView, MaterialButton materialButton, MaterialButton materialButton2, TextView textView2, TextView textView3) {
        this.rootView = scrollView;
        this.descriptionText = textView;
        this.homeButton = materialButton;
        this.retryButton = materialButton2;
        this.scoreText = textView2;
        this.titleText = textView3;
    }

    public static FragmentQuizResultBinding bind(View view) {
        int i = R.id.descriptionText;
        TextView textView = (TextView) f.k(view, R.id.descriptionText);
        if (textView != null) {
            i = R.id.homeButton;
            MaterialButton materialButton = (MaterialButton) f.k(view, R.id.homeButton);
            if (materialButton != null) {
                i = R.id.retryButton;
                MaterialButton materialButton2 = (MaterialButton) f.k(view, R.id.retryButton);
                if (materialButton2 != null) {
                    i = R.id.scoreText;
                    TextView textView2 = (TextView) f.k(view, R.id.scoreText);
                    if (textView2 != null) {
                        i = R.id.titleText;
                        TextView textView3 = (TextView) f.k(view, R.id.titleText);
                        if (textView3 != null) {
                            return new FragmentQuizResultBinding((ScrollView) view, textView, materialButton, materialButton2, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentQuizResultBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentQuizResultBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View inflate = layoutInflater.inflate(R.layout.fragment_quiz_result, viewGroup, false);
        if (z2) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ScrollView getRoot() {
        return this.rootView;
    }
}
