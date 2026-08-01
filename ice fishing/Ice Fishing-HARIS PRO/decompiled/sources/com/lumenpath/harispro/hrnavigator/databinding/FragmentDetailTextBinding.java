package com.lumenpath.harispro.hrnavigator.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import com.lumenpath.harispro.hrnavigator.R;
import h0.f;

/* loaded from: classes.dex */
public final class FragmentDetailTextBinding {
    public final TextView contentText;
    public final TextView exampleText;
    private final ScrollView rootView;
    public final TextView tipsText;
    public final TextView titleText;

    private FragmentDetailTextBinding(ScrollView scrollView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = scrollView;
        this.contentText = textView;
        this.exampleText = textView2;
        this.tipsText = textView3;
        this.titleText = textView4;
    }

    public static FragmentDetailTextBinding bind(View view) {
        int i = R.id.contentText;
        TextView textView = (TextView) f.k(view, R.id.contentText);
        if (textView != null) {
            i = R.id.exampleText;
            TextView textView2 = (TextView) f.k(view, R.id.exampleText);
            if (textView2 != null) {
                i = R.id.tipsText;
                TextView textView3 = (TextView) f.k(view, R.id.tipsText);
                if (textView3 != null) {
                    i = R.id.titleText;
                    TextView textView4 = (TextView) f.k(view, R.id.titleText);
                    if (textView4 != null) {
                        return new FragmentDetailTextBinding((ScrollView) view, textView, textView2, textView3, textView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentDetailTextBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDetailTextBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View inflate = layoutInflater.inflate(R.layout.fragment_detail_text, viewGroup, false);
        if (z2) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ScrollView getRoot() {
        return this.rootView;
    }
}
