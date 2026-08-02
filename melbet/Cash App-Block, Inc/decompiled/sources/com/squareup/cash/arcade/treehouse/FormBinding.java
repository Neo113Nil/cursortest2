package com.squareup.cash.arcade.treehouse;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import app.cash.redwood.Modifier;
import app.cash.redwood.widget.Widget;
import com.fillr.featuretoggle.UnleashContext;
import com.squareup.util.android.Views;

/* loaded from: classes5.dex */
public final class FormBinding implements Widget {
    public final UnleashContext body;
    public final UnleashContext footer;
    public final UnleashContext header;
    public Modifier modifier;
    public final int sideMarginDip;
    public final int topMarginDip;
    public final LegacyScaffoldBinding value;

    public FormBinding(final Context context) {
        LegacyScaffoldBinding legacyScaffoldBinding = new LegacyScaffoldBinding(context);
        this.sideMarginDip = Views.dip(context, 32);
        this.topMarginDip = Views.dip(context, 32);
        int dip = Views.dip(context, 32);
        LinearLayout linearLayout = new LinearLayout(context);
        final int i = 1;
        linearLayout.setOrientation(1);
        legacyScaffoldBinding.headerSlot.addView(linearLayout);
        final int i2 = 0;
        LinearLayout linearLayout2 = new LinearLayout(context) { // from class: com.squareup.cash.arcade.treehouse.FormBinding$bodyColumn$1
            @Override // android.widget.LinearLayout, android.view.ViewGroup
            public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
                int i3 = i2;
                FormBinding formBinding = this;
                switch (i3) {
                    case 0:
                        LinearLayout.LayoutParams generateDefaultLayoutParams = super.generateDefaultLayoutParams();
                        int i4 = formBinding.sideMarginDip;
                        generateDefaultLayoutParams.leftMargin = i4;
                        generateDefaultLayoutParams.rightMargin = i4;
                        generateDefaultLayoutParams.topMargin = formBinding.topMarginDip;
                        return generateDefaultLayoutParams;
                    default:
                        LinearLayout.LayoutParams generateDefaultLayoutParams2 = super.generateDefaultLayoutParams();
                        int i5 = formBinding.sideMarginDip;
                        generateDefaultLayoutParams2.leftMargin = i5;
                        generateDefaultLayoutParams2.rightMargin = i5;
                        generateDefaultLayoutParams2.topMargin = formBinding.topMarginDip;
                        return generateDefaultLayoutParams2;
                }
            }

            @Override // android.widget.LinearLayout, android.view.ViewGroup
            public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
                switch (i2) {
                }
                return generateDefaultLayoutParams();
            }
        };
        linearLayout2.setOrientation(1);
        linearLayout2.setPaddingRelative(linearLayout2.getPaddingStart(), linearLayout2.getPaddingTop(), linearLayout2.getPaddingEnd(), dip);
        legacyScaffoldBinding.bodySlot.addView(linearLayout2);
        LinearLayout linearLayout3 = new LinearLayout(context) { // from class: com.squareup.cash.arcade.treehouse.FormBinding$bodyColumn$1
            @Override // android.widget.LinearLayout, android.view.ViewGroup
            public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
                int i3 = i;
                FormBinding formBinding = this;
                switch (i3) {
                    case 0:
                        LinearLayout.LayoutParams generateDefaultLayoutParams = super.generateDefaultLayoutParams();
                        int i4 = formBinding.sideMarginDip;
                        generateDefaultLayoutParams.leftMargin = i4;
                        generateDefaultLayoutParams.rightMargin = i4;
                        generateDefaultLayoutParams.topMargin = formBinding.topMarginDip;
                        return generateDefaultLayoutParams;
                    default:
                        LinearLayout.LayoutParams generateDefaultLayoutParams2 = super.generateDefaultLayoutParams();
                        int i5 = formBinding.sideMarginDip;
                        generateDefaultLayoutParams2.leftMargin = i5;
                        generateDefaultLayoutParams2.rightMargin = i5;
                        generateDefaultLayoutParams2.topMargin = formBinding.topMarginDip;
                        return generateDefaultLayoutParams2;
                }
            }

            @Override // android.widget.LinearLayout, android.view.ViewGroup
            public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
                switch (i) {
                }
                return generateDefaultLayoutParams();
            }
        };
        linearLayout3.setOrientation(1);
        linearLayout3.setPaddingRelative(linearLayout3.getPaddingStart(), linearLayout3.getPaddingTop(), linearLayout3.getPaddingEnd(), dip);
        legacyScaffoldBinding.footerSlot.addView(linearLayout3);
        this.value = legacyScaffoldBinding;
        this.modifier = Modifier.Companion.$$INSTANCE;
        this.header = new UnleashContext(linearLayout);
        this.body = new UnleashContext(linearLayout2);
        this.footer = new UnleashContext(linearLayout3);
    }

    @Override // app.cash.redwood.widget.Widget
    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // app.cash.redwood.widget.Widget
    public final Object getValue() {
        return this.value;
    }

    @Override // app.cash.redwood.widget.Widget
    public final void setModifier(Modifier modifier) {
        modifier.getClass();
        this.modifier = modifier;
    }
}
