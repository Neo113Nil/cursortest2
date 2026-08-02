package app.cash.redwood.layout.view;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import app.cash.redwood.Modifier;
import app.cash.redwood.ui.DensityKt;
import app.cash.redwood.widget.Widget;

/* loaded from: classes3.dex */
public final class ViewSpacer extends View implements Widget {
    public final double density;
    public Modifier modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewSpacer(Context context) {
        super(context);
        context.getClass();
        Resources resources = context.getResources();
        resources.getClass();
        this.density = DensityKt.Density(resources);
        this.modifier = Modifier.Companion.$$INSTANCE;
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
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            suggestedMinimumWidth = Math.min(suggestedMinimumWidth, size);
        } else if (mode == 1073741824) {
            suggestedMinimumWidth = size;
        }
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            suggestedMinimumHeight = Math.min(suggestedMinimumHeight, size2);
        } else if (mode2 == 1073741824) {
            suggestedMinimumHeight = size2;
        }
        setMeasuredDimension(suggestedMinimumWidth, suggestedMinimumHeight);
    }

    @Override // app.cash.redwood.widget.Widget
    public void setModifier(Modifier modifier) {
        modifier.getClass();
        this.modifier = modifier;
    }
}
