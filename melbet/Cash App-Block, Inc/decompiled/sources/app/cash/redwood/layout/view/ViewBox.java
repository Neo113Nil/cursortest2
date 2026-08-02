package app.cash.redwood.layout.view;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import app.cash.redwood.Modifier;
import app.cash.redwood.layout.api.Constraint;
import app.cash.redwood.layout.api.CrossAxisAlignment;
import app.cash.redwood.ui.Density;
import app.cash.redwood.ui.DensityKt;
import app.cash.redwood.ui.Margin;
import app.cash.redwood.widget.Widget;
import com.fillr.featuretoggle.UnleashContext;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class ViewBox extends ViewGroup implements Widget {
    public final UnleashContext children;
    public final double density;
    public int horizontalAlignment;
    public Margin margin;
    public final Measurer measurer;
    public Modifier modifier;
    public int verticalAlignment;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewBox(Context context) {
        super(context);
        context.getClass();
        Resources resources = context.getResources();
        resources.getClass();
        this.density = DensityKt.Density(resources);
        CrossAxisAlignment.Companion.getClass();
        this.horizontalAlignment = 0;
        this.verticalAlignment = 0;
        Constraint.Companion.getClass();
        Margin.Companion.getClass();
        this.margin = Margin.Zero;
        this.modifier = Modifier.Companion.$$INSTANCE;
        this.children = new UnleashContext(this);
        Measurer measurer = new Measurer();
        Density.m1399constructorimpl(1.0d);
        measurer.boxDensity = 1.0d;
        measurer.boxHorizontalAlignment = 0;
        measurer.boxVerticalAlignment = 0;
        measurer.frameWidth = -1;
        measurer.frameHeight = -1;
        measurer.horizontalAlignment = 0;
        measurer.verticalAlignment = 0;
        measurer.requestedWidth = -1;
        measurer.requestedHeight = -1;
        measurer.width = -1;
        measurer.height = -1;
        this.measurer = measurer;
    }

    @Override // app.cash.redwood.widget.Widget
    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // app.cash.redwood.widget.Widget
    public final Object getValue() {
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        if (r5 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0057, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006a, code lost:
    
        if (r5 == 2) goto L17;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        boolean z2;
        int i7;
        int layoutDirection = getLayoutDirection();
        int i8 = this.horizontalAlignment;
        int i9 = this.verticalAlignment;
        Margin margin = this.margin;
        int i10 = i3 - i;
        int i11 = i10 < 0 ? 0 : i10;
        int i12 = i4 - i2;
        int i13 = i12 < 0 ? 0 : i12;
        Measurer measurer = this.measurer;
        measurer.m1360boxkUSdIy0(true, layoutDirection, this.density, i8, i9, margin, i11, false, i13, false);
        Iterator it = ((ArrayList) this.children.properties).iterator();
        while (it.hasNext()) {
            Widget widget = (Widget) it.next();
            measurer.measure(widget);
            if (measurer.layoutDirection == 1) {
                i5 = measurer.marginEnd + measurer.boxMarginEnd;
                i6 = measurer.marginStart + measurer.boxMarginStart;
                int i14 = measurer.horizontalAlignment;
                CrossAxisAlignment.Companion.getClass();
            } else {
                i5 = measurer.marginStart + measurer.boxMarginStart;
                i6 = measurer.marginEnd + measurer.boxMarginEnd;
                int i15 = measurer.horizontalAlignment;
                CrossAxisAlignment.Companion.getClass();
            }
            int i16 = measurer.horizontalAlignment;
            CrossAxisAlignment.Companion.getClass();
            if (i16 == 1) {
                i5 += ((measurer.frameWidth - measurer.width) - (measurer.marginStart + measurer.marginEnd)) / 2;
            } else if (z2) {
                i5 = (((measurer.boxMarginStart + measurer.frameWidth) + measurer.boxMarginEnd) - i6) - measurer.width;
            }
            int i17 = measurer.verticalAlignment;
            int i18 = measurer.boxMarginTop;
            if (i17 == 1) {
                int i19 = measurer.marginTop;
                i7 = (((measurer.frameHeight - measurer.height) - (i19 + measurer.marginBottom)) / 2) + i18 + i19;
            } else {
                i7 = i17 == 2 ? ((i18 + measurer.frameHeight) - measurer.marginBottom) - measurer.height : i18 + measurer.marginTop;
            }
            ((View) widget.getValue()).layout(i5, i7, measurer.width + i5, measurer.height + i7);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        Measurer measurer;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode == 1073741824 && mode2 == 1073741824) {
            setMeasuredDimension(size, size2);
            return;
        }
        this.measurer.m1360boxkUSdIy0(false, getLayoutDirection(), this.density, this.horizontalAlignment, this.verticalAlignment, this.margin, size, mode == 0, size2, mode2 == 0);
        Iterator it = ((ArrayList) this.children.properties).iterator();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            measurer = this.measurer;
            if (!hasNext) {
                break;
            }
            measurer.measure((Widget) it.next());
            i3 = Math.max(i3, measurer.marginStart + measurer.marginEnd + measurer.width);
            i4 = Math.max(i4, measurer.marginTop + measurer.marginBottom + measurer.height);
        }
        int i5 = measurer.boxMarginStart + measurer.boxMarginEnd;
        int i6 = measurer.boxMarginTop + measurer.boxMarginBottom;
        if (mode == Integer.MIN_VALUE) {
            int i7 = i5 + i3;
            if (i7 <= size) {
                size = i7;
            }
        } else if (mode != 1073741824) {
            size = i3 + i5;
        }
        if (mode2 == Integer.MIN_VALUE) {
            int i8 = i4 + i6;
            if (i8 <= size2) {
                size2 = i8;
            }
        } else if (mode2 != 1073741824) {
            size2 = i4 + i6;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // app.cash.redwood.widget.Widget
    public void setModifier(Modifier modifier) {
        modifier.getClass();
        this.modifier = modifier;
    }
}
