package com.lumenpath.harispro.hrnavigator.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.lumenpath.harispro.hrnavigator.R;
import h0.f;

/* loaded from: classes.dex */
public final class FragmentDiagnosticResultBinding {
    public final TextView descriptionText;
    public final MaterialButton homeButton;
    public final RecyclerView improvementsRecycler;
    public final TextView levelEmoji;
    public final TextView levelText;
    public final TextView recommendationsText;
    public final MaterialButton retryButton;
    private final ScrollView rootView;

    private FragmentDiagnosticResultBinding(ScrollView scrollView, TextView textView, MaterialButton materialButton, RecyclerView recyclerView, TextView textView2, TextView textView3, TextView textView4, MaterialButton materialButton2) {
        this.rootView = scrollView;
        this.descriptionText = textView;
        this.homeButton = materialButton;
        this.improvementsRecycler = recyclerView;
        this.levelEmoji = textView2;
        this.levelText = textView3;
        this.recommendationsText = textView4;
        this.retryButton = materialButton2;
    }

    public static FragmentDiagnosticResultBinding bind(View view) {
        int i = R.id.descriptionText;
        TextView textView = (TextView) f.k(view, R.id.descriptionText);
        if (textView != null) {
            i = R.id.homeButton;
            MaterialButton materialButton = (MaterialButton) f.k(view, R.id.homeButton);
            if (materialButton != null) {
                i = R.id.improvementsRecycler;
                RecyclerView recyclerView = (RecyclerView) f.k(view, R.id.improvementsRecycler);
                if (recyclerView != null) {
                    i = R.id.levelEmoji;
                    TextView textView2 = (TextView) f.k(view, R.id.levelEmoji);
                    if (textView2 != null) {
                        i = R.id.levelText;
                        TextView textView3 = (TextView) f.k(view, R.id.levelText);
                        if (textView3 != null) {
                            i = R.id.recommendationsText;
                            TextView textView4 = (TextView) f.k(view, R.id.recommendationsText);
                            if (textView4 != null) {
                                i = R.id.retryButton;
                                MaterialButton materialButton2 = (MaterialButton) f.k(view, R.id.retryButton);
                                if (materialButton2 != null) {
                                    return new FragmentDiagnosticResultBinding((ScrollView) view, textView, materialButton, recyclerView, textView2, textView3, textView4, materialButton2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentDiagnosticResultBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDiagnosticResultBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View inflate = layoutInflater.inflate(R.layout.fragment_diagnostic_result, viewGroup, false);
        if (z2) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ScrollView getRoot() {
        return this.rootView;
    }
}
