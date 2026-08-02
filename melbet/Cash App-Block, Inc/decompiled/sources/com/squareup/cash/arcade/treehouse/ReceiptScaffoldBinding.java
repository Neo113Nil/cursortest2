package com.squareup.cash.arcade.treehouse;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import app.cash.redwood.Modifier;
import app.cash.redwood.widget.Widget;
import com.fillr.featuretoggle.UnleashContext;

/* loaded from: classes5.dex */
public final class ReceiptScaffoldBinding extends FrameLayout implements Widget {
    public static final /* synthetic */ int $r8$clinit = 0;
    public ValueAnimator animator;
    public final UnleashContext body;
    public final UnleashContext footer;
    public final FrameLayout footerSlot;
    public final UnleashContext header;
    public Modifier modifier;
    public final ReceiptScaffoldBinding value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceiptScaffoldBinding(Context context) {
        super(context);
        context.getClass();
        this.value = this;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(-1, -2));
        FrameLayout frameLayout2 = new FrameLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        linearLayout.addView(frameLayout2, layoutParams);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.footerSlot = frameLayout3;
        addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout3, new FrameLayout.LayoutParams(-1, -2, 80));
        this.body = new UnleashContext(frameLayout2);
        this.footer = new UnleashContext(frameLayout3);
        this.header = new UnleashContext(frameLayout);
        this.modifier = Modifier.Companion.$$INSTANCE;
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
    public void setModifier(Modifier modifier) {
        modifier.getClass();
        this.modifier = modifier;
    }
}
