package com.lumenpath.harispro.hrnavigator.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import com.lumenpath.harispro.hrnavigator.R;
import h0.f;

/* loaded from: classes.dex */
public final class FragmentTemplateDetailBinding {
    public final TextView categoryText;
    public final TextView contentText;
    private final ScrollView rootView;
    public final TextView tipsText;
    public final TextView titleText;

    private FragmentTemplateDetailBinding(ScrollView scrollView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = scrollView;
        this.categoryText = textView;
        this.contentText = textView2;
        this.tipsText = textView3;
        this.titleText = textView4;
    }

    public static FragmentTemplateDetailBinding bind(View view) {
        int i = R.id.categoryText;
        TextView textView = (TextView) f.k(view, R.id.categoryText);
        if (textView != null) {
            i = R.id.contentText;
            TextView textView2 = (TextView) f.k(view, R.id.contentText);
            if (textView2 != null) {
                i = R.id.tipsText;
                TextView textView3 = (TextView) f.k(view, R.id.tipsText);
                if (textView3 != null) {
                    i = R.id.titleText;
                    TextView textView4 = (TextView) f.k(view, R.id.titleText);
                    if (textView4 != null) {
                        return new FragmentTemplateDetailBinding((ScrollView) view, textView, textView2, textView3, textView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentTemplateDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentTemplateDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View inflate = layoutInflater.inflate(R.layout.fragment_template_detail, viewGroup, false);
        if (z2) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ScrollView getRoot() {
        return this.rootView;
    }
}
