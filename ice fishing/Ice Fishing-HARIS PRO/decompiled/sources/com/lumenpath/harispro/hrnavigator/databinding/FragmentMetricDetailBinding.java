package com.lumenpath.harispro.hrnavigator.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import com.lumenpath.harispro.hrnavigator.R;
import h0.f;

/* loaded from: classes.dex */
public final class FragmentMetricDetailBinding {
    public final TextView benchmarkText;
    public final TextView descriptionText;
    public final TextView formulaText;
    private final ScrollView rootView;
    public final TextView tipsText;
    public final TextView titleText;

    private FragmentMetricDetailBinding(ScrollView scrollView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = scrollView;
        this.benchmarkText = textView;
        this.descriptionText = textView2;
        this.formulaText = textView3;
        this.tipsText = textView4;
        this.titleText = textView5;
    }

    public static FragmentMetricDetailBinding bind(View view) {
        int i = R.id.benchmarkText;
        TextView textView = (TextView) f.k(view, R.id.benchmarkText);
        if (textView != null) {
            i = R.id.descriptionText;
            TextView textView2 = (TextView) f.k(view, R.id.descriptionText);
            if (textView2 != null) {
                i = R.id.formulaText;
                TextView textView3 = (TextView) f.k(view, R.id.formulaText);
                if (textView3 != null) {
                    i = R.id.tipsText;
                    TextView textView4 = (TextView) f.k(view, R.id.tipsText);
                    if (textView4 != null) {
                        i = R.id.titleText;
                        TextView textView5 = (TextView) f.k(view, R.id.titleText);
                        if (textView5 != null) {
                            return new FragmentMetricDetailBinding((ScrollView) view, textView, textView2, textView3, textView4, textView5);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentMetricDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentMetricDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View inflate = layoutInflater.inflate(R.layout.fragment_metric_detail, viewGroup, false);
        if (z2) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ScrollView getRoot() {
        return this.rootView;
    }
}
