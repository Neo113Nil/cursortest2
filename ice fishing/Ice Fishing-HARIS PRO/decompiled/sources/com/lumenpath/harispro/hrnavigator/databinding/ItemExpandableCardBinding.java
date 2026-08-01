package com.lumenpath.harispro.hrnavigator.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.lumenpath.harispro.hrnavigator.R;
import h0.f;

/* loaded from: classes.dex */
public final class ItemExpandableCardBinding {
    public final MaterialCardView cardView;
    public final TextView descriptionText;
    public final View divider;
    public final TextView expandIcon;
    public final LinearLayout expandedContent;
    public final TextView resultText;
    private final LinearLayout rootView;
    public final TextView stagesText;
    public final TextView titleText;

    private ItemExpandableCardBinding(LinearLayout linearLayout, MaterialCardView materialCardView, TextView textView, View view, TextView textView2, LinearLayout linearLayout2, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = linearLayout;
        this.cardView = materialCardView;
        this.descriptionText = textView;
        this.divider = view;
        this.expandIcon = textView2;
        this.expandedContent = linearLayout2;
        this.resultText = textView3;
        this.stagesText = textView4;
        this.titleText = textView5;
    }

    public static ItemExpandableCardBinding bind(View view) {
        int i = R.id.cardView;
        MaterialCardView materialCardView = (MaterialCardView) f.k(view, R.id.cardView);
        if (materialCardView != null) {
            i = R.id.descriptionText;
            TextView textView = (TextView) f.k(view, R.id.descriptionText);
            if (textView != null) {
                i = R.id.divider;
                View k2 = f.k(view, R.id.divider);
                if (k2 != null) {
                    i = R.id.expandIcon;
                    TextView textView2 = (TextView) f.k(view, R.id.expandIcon);
                    if (textView2 != null) {
                        i = R.id.expandedContent;
                        LinearLayout linearLayout = (LinearLayout) f.k(view, R.id.expandedContent);
                        if (linearLayout != null) {
                            i = R.id.resultText;
                            TextView textView3 = (TextView) f.k(view, R.id.resultText);
                            if (textView3 != null) {
                                i = R.id.stagesText;
                                TextView textView4 = (TextView) f.k(view, R.id.stagesText);
                                if (textView4 != null) {
                                    i = R.id.titleText;
                                    TextView textView5 = (TextView) f.k(view, R.id.titleText);
                                    if (textView5 != null) {
                                        return new ItemExpandableCardBinding((LinearLayout) view, materialCardView, textView, k2, textView2, linearLayout, textView3, textView4, textView5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ItemExpandableCardBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemExpandableCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View inflate = layoutInflater.inflate(R.layout.item_expandable_card, viewGroup, false);
        if (z2) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}
