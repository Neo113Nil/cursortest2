package com.squareup.cash.arcade.treehouse;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.appcompat.widget.SearchView;
import androidx.core.view.ViewGroupKt;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.redwood.Modifier;
import app.cash.redwood.widget.Widget;
import com.fillr.featuretoggle.UnleashContext;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.util.android.Views;

/* loaded from: classes5.dex */
public final class LegacyScaffoldBinding extends LinearLayout implements Widget {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final FrameLayout bodySlot;
    public final float footerElevation;
    public final FrameLayout footerSlot;
    public final FrameLayout headerSlot;
    public final float maxScrollElevationRange;
    public Modifier modifier;
    public final ScaffoldBinding$$ExternalSyntheticLambda0 onScrollChange;
    public final ScrollView scrollView;
    public final LegacyScaffoldBinding value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyScaffoldBinding(Context context) {
        super(context);
        context.getClass();
        ColorPalette colorPalette = ThemeHelpersKt.findThemeInfo(context).colorPalette;
        this.footerElevation = Views.dip(context, 20.0f);
        this.maxScrollElevationRange = Views.dip(context, 40.0f);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, new LinearLayout.LayoutParams(-1, -2));
        this.headerSlot = frameLayout;
        ScrollView scrollView = new ScrollView(context);
        scrollView.setVerticalScrollBarEnabled(false);
        scrollView.setHorizontalScrollBarEnabled(false);
        scrollView.setFillViewport(true);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        addView(scrollView, layoutParams);
        this.scrollView = scrollView;
        FrameLayout frameLayout2 = new FrameLayout(context);
        scrollView.addView(frameLayout2, new LinearLayout.LayoutParams(-1, -1));
        this.bodySlot = frameLayout2;
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setBackgroundColor(colorPalette.background);
        addView(frameLayout3, new LinearLayout.LayoutParams(-1, -2));
        this.footerSlot = frameLayout3;
        this.value = this;
        this.modifier = Modifier.Companion.$$INSTANCE;
        new UnleashContext(frameLayout);
        new UnleashContext(frameLayout2);
        new UnleashContext(frameLayout3);
        this.onScrollChange = new ScaffoldBinding$$ExternalSyntheticLambda0(this, 1);
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        if (!scrollView.isLaidOut() || scrollView.isLayoutRequested()) {
            scrollView.addOnLayoutChangeListener(new SearchView.AnonymousClass4(this, 2));
        } else {
            updateFooterElevation();
        }
    }

    @Override // app.cash.redwood.widget.Widget
    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // app.cash.redwood.widget.Widget
    public final Object getValue() {
        return this.value;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.onScrollChange);
        updateFooterElevation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnScrollChangedListener(this.onScrollChange);
    }

    @Override // app.cash.redwood.widget.Widget
    public void setModifier(Modifier modifier) {
        modifier.getClass();
        this.modifier = modifier;
    }

    public final void updateFooterElevation() {
        ScrollView scrollView = this.scrollView;
        float height = ViewGroupKt.get(scrollView, 0).getHeight() - scrollView.getHeight();
        float f = RecyclerView.DECELERATION_RATE;
        if (height < RecyclerView.DECELERATION_RATE) {
            height = 0.0f;
        }
        if (height != RecyclerView.DECELERATION_RATE) {
            float f2 = this.maxScrollElevationRange;
            if (height <= f2) {
                f2 = height;
            }
            float scrollY = scrollView.getScrollY() - (height - f2);
            if (scrollY >= RecyclerView.DECELERATION_RATE) {
                f = scrollY;
            }
            f = this.footerElevation * (1.0f - (f / f2));
        }
        this.footerSlot.setElevation(f);
    }
}
