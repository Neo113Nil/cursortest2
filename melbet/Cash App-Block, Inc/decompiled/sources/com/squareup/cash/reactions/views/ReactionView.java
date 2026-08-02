package com.squareup.cash.reactions.views;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.ViewGroup;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.ui.widget.text.FigmaTextView;
import com.squareup.protos.franklin.common.Reaction;

/* loaded from: classes7.dex */
public final class ReactionView extends FigmaTextView {
    public boolean lockHeightToWidth;
    public Reaction reaction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ReactionView(Context context) {
        super(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        setGravity(17);
        setTextSize(1, 32.0f);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.lockHeightToWidth) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredWidth());
        }
    }

    public final void setHasBackgroundOutline(boolean z) {
        if (!z) {
            setBackground(null);
            return;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        Paint paint = shapeDrawable.getPaint();
        paint.setColor(ThemeHelpersKt.themeInfo(this).colorPalette.elevatedBackground);
        paint.setAntiAlias(true);
        setBackground(shapeDrawable);
    }

    public final void setLockHeightToWidth(boolean z) {
        this.lockHeightToWidth = z;
    }

    public final void setReaction(Reaction reaction) {
        setText(reaction != null ? reaction.data : null);
        this.reaction = reaction;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReactionView(Context context, Reaction reaction) {
        this(context);
        context.getClass();
        reaction.getClass();
        setReaction(reaction);
    }
}
