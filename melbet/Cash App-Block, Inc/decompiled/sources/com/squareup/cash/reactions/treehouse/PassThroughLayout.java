package com.squareup.cash.reactions.treehouse;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.ViewGroupKt$children$1;
import kotlin.sequences.SequencesKt___SequencesKt;

/* loaded from: classes7.dex */
public final class PassThroughLayout extends FrameLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassThroughLayout(Context context) {
        super(context);
        context.getClass();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        View view = (View) SequencesKt___SequencesKt.singleOrNull(new ViewGroupKt$children$1(this));
        if (view == null) {
            super.onMeasure(i, i2);
            return;
        }
        view.setLayoutParams(new FrameLayout.LayoutParams(getLayoutParams().width, getLayoutParams().height));
        view.measure(i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }
}
