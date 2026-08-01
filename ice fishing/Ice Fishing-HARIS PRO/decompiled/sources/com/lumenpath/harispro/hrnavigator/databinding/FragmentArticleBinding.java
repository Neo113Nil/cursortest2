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
public final class FragmentArticleBinding {
    public final MaterialButton backButton;
    public final TextView mistakesText;
    public final TextView recommendationsText;
    private final ScrollView rootView;
    public final TextView summaryText;
    public final TextView titleText;
    public final TextView whatText;
    public final TextView whyText;

    private FragmentArticleBinding(ScrollView scrollView, MaterialButton materialButton, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.rootView = scrollView;
        this.backButton = materialButton;
        this.mistakesText = textView;
        this.recommendationsText = textView2;
        this.summaryText = textView3;
        this.titleText = textView4;
        this.whatText = textView5;
        this.whyText = textView6;
    }

    public static FragmentArticleBinding bind(View view) {
        int i = R.id.backButton;
        MaterialButton materialButton = (MaterialButton) f.k(view, R.id.backButton);
        if (materialButton != null) {
            i = R.id.mistakesText;
            TextView textView = (TextView) f.k(view, R.id.mistakesText);
            if (textView != null) {
                i = R.id.recommendationsText;
                TextView textView2 = (TextView) f.k(view, R.id.recommendationsText);
                if (textView2 != null) {
                    i = R.id.summaryText;
                    TextView textView3 = (TextView) f.k(view, R.id.summaryText);
                    if (textView3 != null) {
                        i = R.id.titleText;
                        TextView textView4 = (TextView) f.k(view, R.id.titleText);
                        if (textView4 != null) {
                            i = R.id.whatText;
                            TextView textView5 = (TextView) f.k(view, R.id.whatText);
                            if (textView5 != null) {
                                i = R.id.whyText;
                                TextView textView6 = (TextView) f.k(view, R.id.whyText);
                                if (textView6 != null) {
                                    return new FragmentArticleBinding((ScrollView) view, materialButton, textView, textView2, textView3, textView4, textView5, textView6);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentArticleBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentArticleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View inflate = layoutInflater.inflate(R.layout.fragment_article, viewGroup, false);
        if (z2) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ScrollView getRoot() {
        return this.rootView;
    }
}
