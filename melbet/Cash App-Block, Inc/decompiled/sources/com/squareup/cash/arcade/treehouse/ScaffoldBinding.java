package com.squareup.cash.arcade.treehouse;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SearchView;
import androidx.core.view.TreeIterator;
import androidx.core.view.ViewGroupKt$iterator$1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.redwood.Modifier;
import app.cash.redwood.widget.Widget;
import com.fillr.featuretoggle.UnleashContext;
import com.squareup.util.android.Views;

/* loaded from: classes5.dex */
public final class ScaffoldBinding extends LinearLayout implements Widget {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final UnleashContext body;
    public final FrameLayout bodySlot;
    public final UnleashContext footer;
    public final float footerElevation;
    public final FrameLayout footerSlot;
    public final UnleashContext header;
    public final float maxScrollElevationRange;
    public Modifier modifier;
    public final ScaffoldBinding$$ExternalSyntheticLambda0 onScrollChange;
    public final ScaffoldBinding value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScaffoldBinding(Context context) {
        super(context);
        context.getClass();
        this.footerElevation = Views.dip(context, 20.0f);
        this.maxScrollElevationRange = Views.dip(context, 40.0f);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, new LinearLayout.LayoutParams(-1, -2));
        FrameLayout frameLayout2 = new FrameLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        addView(frameLayout2, layoutParams);
        this.bodySlot = frameLayout2;
        FrameLayout frameLayout3 = new FrameLayout(context);
        addView(frameLayout3, new LinearLayout.LayoutParams(-1, -2));
        this.footerSlot = frameLayout3;
        this.value = this;
        this.modifier = Modifier.Companion.$$INSTANCE;
        this.header = new UnleashContext(frameLayout);
        this.body = new UnleashContext(frameLayout2);
        this.footer = new UnleashContext(frameLayout3);
        this.onScrollChange = new ScaffoldBinding$$ExternalSyntheticLambda0(this, 0);
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        if (!frameLayout2.isLaidOut() || frameLayout2.isLayoutRequested()) {
            frameLayout2.addOnLayoutChangeListener(new SearchView.AnonymousClass4(this, 3));
        } else {
            updateFooterElevation$1();
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
        updateFooterElevation$1();
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

    public final void updateFooterElevation$1() {
        Object obj;
        TreeIterator treeIterator = new TreeIterator(new ViewGroupKt$iterator$1(this.bodySlot));
        while (true) {
            if (!treeIterator.iterator.hasNext()) {
                obj = null;
                break;
            } else {
                obj = treeIterator.next();
                if (((View) obj).isScrollContainer()) {
                    break;
                }
            }
        }
        View view = (View) obj;
        if (view == null) {
            return;
        }
        float height = view.getHeight();
        float f = RecyclerView.DECELERATION_RATE;
        if (height < RecyclerView.DECELERATION_RATE) {
            height = 0.0f;
        }
        if (height != RecyclerView.DECELERATION_RATE) {
            float f2 = this.maxScrollElevationRange;
            if (height <= f2) {
                f2 = height;
            }
            float scrollY = view.getScrollY() - (height - f2);
            if (scrollY >= RecyclerView.DECELERATION_RATE) {
                f = scrollY;
            }
            f = this.footerElevation * (1.0f - (f / f2));
        }
        this.footerSlot.setElevation(f);
    }
}
