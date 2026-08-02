package com.squareup.cash.arcade.treehouse;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import app.cash.arcade.values.DividerStyle;
import app.cash.mooncake.values.MooncakeDividerStyles;
import app.cash.redwood.Modifier;
import app.cash.redwood.widget.Widget;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import com.squareup.util.android.Views;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class DividerBinding extends View implements Widget {
    public Modifier modifier;
    public final int sideMarginDip;
    public DividerStyle style;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DividerBinding(Context context) {
        super(context);
        context.getClass();
        ThemeInfo findThemeInfo = ThemeHelpersKt.findThemeInfo(context);
        this.sideMarginDip = Views.dip(context, 32);
        this.style = MooncakeDividerStyles.hairline;
        this.modifier = Modifier.Companion.$$INSTANCE;
        setBackgroundColor(findThemeInfo.colorPalette.hairline);
        setLayoutParams(new ViewGroup.MarginLayoutParams(-1, 1));
    }

    @Override // app.cash.redwood.widget.Widget
    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // app.cash.redwood.widget.Widget
    public final Object getValue() {
        return this;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        DividerStyle dividerStyle = this.style;
        DividerStyle.Id id = MooncakeDividerStyles.hairline;
        DividerStyle.Id id2 = MooncakeDividerStyles.hairline;
        if (Intrinsics.areEqual(dividerStyle, id2)) {
            int i3 = this.sideMarginDip;
            marginLayoutParams.leftMargin = i3;
            marginLayoutParams.rightMargin = i3;
        } else {
            marginLayoutParams.leftMargin = 0;
            marginLayoutParams.rightMargin = 0;
        }
        setLayoutParams(marginLayoutParams);
        int size = View.MeasureSpec.getSize(i);
        DividerStyle dividerStyle2 = this.style;
        boolean areEqual = Intrinsics.areEqual(dividerStyle2, id2);
        int i4 = 1;
        if (!areEqual) {
            if (Intrinsics.areEqual(dividerStyle2, MooncakeDividerStyles.element)) {
                Context context = getContext();
                context.getClass();
                i4 = Views.dip(context, 16);
            } else if (Intrinsics.areEqual(dividerStyle2, MooncakeDividerStyles.section)) {
                Context context2 = getContext();
                context2.getClass();
                i4 = Views.dip(context2, 32);
            }
        }
        setMeasuredDimension(size, i4);
    }

    @Override // app.cash.redwood.widget.Widget
    public void setModifier(Modifier modifier) {
        modifier.getClass();
        this.modifier = modifier;
    }
}
