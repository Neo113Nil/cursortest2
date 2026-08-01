package com.lumenpath.harispro.hrnavigator.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.lumenpath.harispro.hrnavigator.R;
import h0.f;

/* loaded from: classes.dex */
public final class ItemBenchmarkCardBinding {
    public final TextView contextText;
    public final TextView labelText;
    private final MaterialCardView rootView;
    public final TextView valueText;

    private ItemBenchmarkCardBinding(MaterialCardView materialCardView, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = materialCardView;
        this.contextText = textView;
        this.labelText = textView2;
        this.valueText = textView3;
    }

    public static ItemBenchmarkCardBinding bind(View view) {
        int i = R.id.contextText;
        TextView textView = (TextView) f.k(view, R.id.contextText);
        if (textView != null) {
            i = R.id.labelText;
            TextView textView2 = (TextView) f.k(view, R.id.labelText);
            if (textView2 != null) {
                i = R.id.valueText;
                TextView textView3 = (TextView) f.k(view, R.id.valueText);
                if (textView3 != null) {
                    return new ItemBenchmarkCardBinding((MaterialCardView) view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ItemBenchmarkCardBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemBenchmarkCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View inflate = layoutInflater.inflate(R.layout.item_benchmark_card, viewGroup, false);
        if (z2) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public MaterialCardView getRoot() {
        return this.rootView;
    }
}
