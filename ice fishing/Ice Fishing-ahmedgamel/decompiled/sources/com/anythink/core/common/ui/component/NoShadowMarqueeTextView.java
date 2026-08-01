package com.anythink.core.common.ui.component;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.anythink.core.common.ui.MarqueeTextView;

/* loaded from: classes.dex */
public class NoShadowMarqueeTextView extends MarqueeTextView {
    public NoShadowMarqueeTextView(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        setHorizontalFadingEdgeEnabled(false);
    }

    public NoShadowMarqueeTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NoShadowMarqueeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
