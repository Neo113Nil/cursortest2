package com.squareup.cash.arcade.treehouse;

import android.content.Context;
import android.widget.FrameLayout;
import app.cash.arcade.values.Color;
import app.cash.arcade.values.TimelineItemIcon;
import app.cash.redwood.Modifier;
import app.cash.redwood.widget.Widget;
import com.fillr.featuretoggle.UnleashContext;

/* loaded from: classes7.dex */
public final class TimelineItemBinding extends FrameLayout implements Widget {
    public Color color;
    public final UnleashContext content;
    public TimelineItemIcon icon;
    public Modifier modifier;
    public final TimelineItemBinding value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineItemBinding(Context context) {
        super(context);
        context.getClass();
        this.modifier = Modifier.Companion.$$INSTANCE;
        this.value = this;
        this.content = new UnleashContext(this);
    }

    @Override // app.cash.redwood.widget.Widget
    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // app.cash.redwood.widget.Widget
    public final Object getValue() {
        return this.value;
    }

    public final void setColor$treehouse(Color color) {
        color.getClass();
        this.color = color;
    }

    public final void setIcon$treehouse(TimelineItemIcon timelineItemIcon) {
        timelineItemIcon.getClass();
        this.icon = timelineItemIcon;
    }

    @Override // app.cash.redwood.widget.Widget
    public void setModifier(Modifier modifier) {
        modifier.getClass();
        this.modifier = modifier;
    }
}
