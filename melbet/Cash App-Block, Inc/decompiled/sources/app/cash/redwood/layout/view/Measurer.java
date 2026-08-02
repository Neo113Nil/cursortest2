package app.cash.redwood.layout.view;

import android.view.View;
import app.cash.arcade.protocol.host.redwoodlayout.HeightImpl;
import app.cash.arcade.protocol.host.redwoodlayout.HorizontalAlignmentImpl;
import app.cash.arcade.protocol.host.redwoodlayout.MarginImpl;
import app.cash.arcade.protocol.host.redwoodlayout.SizeImpl;
import app.cash.arcade.protocol.host.redwoodlayout.VerticalAlignmentImpl;
import app.cash.arcade.protocol.host.redwoodlayout.WidthImpl;
import app.cash.redwood.Modifier;
import app.cash.redwood.layout.api.CrossAxisAlignment;
import app.cash.redwood.ui.Density;
import app.cash.redwood.ui.Margin;
import app.cash.redwood.widget.Widget;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class Measurer {
    public double boxDensity;
    public boolean boxHeightUnspecified;
    public int boxHorizontalAlignment;
    public int boxMarginBottom;
    public int boxMarginEnd;
    public int boxMarginStart;
    public int boxMarginTop;
    public int boxVerticalAlignment;
    public boolean boxWidthUnspecified;
    public int frameHeight;
    public int frameWidth;
    public int height;
    public int horizontalAlignment;
    public int layoutDirection;
    public int marginBottom;
    public int marginEnd;
    public int marginStart;
    public int marginTop;
    public boolean measureForLayout;
    public int requestedHeight;
    public int requestedWidth;
    public int verticalAlignment;
    public int width;

    /* renamed from: box-kUSdIy0, reason: not valid java name */
    public final void m1360boxkUSdIy0(boolean z, int i, double d, int i2, int i3, Margin margin, int i4, boolean z2, int i5, boolean z3) {
        margin.getClass();
        this.measureForLayout = z;
        this.layoutDirection = i;
        this.boxDensity = d;
        this.boxHorizontalAlignment = i2;
        this.boxVerticalAlignment = i3;
        this.boxMarginStart = Density.m1402toPxIntmnpKzHI(d, margin.start);
        this.boxMarginEnd = Density.m1402toPxIntmnpKzHI(d, margin.end);
        this.boxMarginTop = Density.m1402toPxIntmnpKzHI(d, margin.top);
        int m1402toPxIntmnpKzHI = Density.m1402toPxIntmnpKzHI(d, margin.bottom);
        this.boxMarginBottom = m1402toPxIntmnpKzHI;
        int i6 = (i4 - this.boxMarginStart) - this.boxMarginEnd;
        if (i6 < 0) {
            i6 = 0;
        }
        this.frameWidth = i6;
        this.boxWidthUnspecified = z2;
        int i7 = (i5 - this.boxMarginTop) - m1402toPxIntmnpKzHI;
        this.frameHeight = i7 >= 0 ? i7 : 0;
        this.boxHeightUnspecified = z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        if (r7 == 3) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void measure(Widget widget) {
        boolean z;
        int i;
        int i2;
        widget.getClass();
        this.horizontalAlignment = this.boxHorizontalAlignment;
        this.verticalAlignment = this.boxVerticalAlignment;
        this.marginStart = 0;
        this.marginEnd = 0;
        this.marginTop = 0;
        this.marginBottom = 0;
        this.requestedWidth = -1;
        this.requestedHeight = -1;
        final double d = this.boxDensity;
        widget.getModifier().forEachScoped(new Function1() { // from class: app.cash.redwood.layout.view.Measurer$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Modifier.ScopedElement scopedElement = (Modifier.ScopedElement) obj;
                scopedElement.getClass();
                boolean z2 = scopedElement instanceof HorizontalAlignmentImpl;
                Measurer measurer = Measurer.this;
                if (z2) {
                    measurer.horizontalAlignment = ((HorizontalAlignmentImpl) scopedElement).alignment;
                } else if (scopedElement instanceof VerticalAlignmentImpl) {
                    measurer.verticalAlignment = ((VerticalAlignmentImpl) scopedElement).alignment;
                } else {
                    boolean z3 = scopedElement instanceof WidthImpl;
                    double d2 = d;
                    if (z3) {
                        measurer.requestedWidth = Density.m1402toPxIntmnpKzHI(d2, ((WidthImpl) scopedElement).width);
                    } else if (scopedElement instanceof HeightImpl) {
                        measurer.requestedHeight = Density.m1402toPxIntmnpKzHI(d2, ((HeightImpl) scopedElement).height);
                    } else if (scopedElement instanceof SizeImpl) {
                        SizeImpl sizeImpl = (SizeImpl) scopedElement;
                        measurer.requestedWidth = Density.m1402toPxIntmnpKzHI(d2, sizeImpl.width);
                        measurer.requestedHeight = Density.m1402toPxIntmnpKzHI(d2, sizeImpl.height);
                    } else if (scopedElement instanceof MarginImpl) {
                        int i3 = measurer.marginStart;
                        Margin margin = ((MarginImpl) scopedElement).margin;
                        measurer.marginStart = Math.max(i3, Density.m1402toPxIntmnpKzHI(d2, margin.start));
                        measurer.marginEnd = Math.max(measurer.marginEnd, Density.m1402toPxIntmnpKzHI(d2, margin.end));
                        measurer.marginTop = Math.max(measurer.marginTop, Density.m1402toPxIntmnpKzHI(d2, margin.top));
                        measurer.marginBottom = Math.max(measurer.marginBottom, Density.m1402toPxIntmnpKzHI(d2, margin.bottom));
                    }
                }
                return Unit.INSTANCE;
            }
        });
        int i3 = this.frameWidth - (this.marginStart + this.marginEnd);
        if (i3 < 0) {
            i3 = 0;
        }
        int i4 = this.frameHeight - (this.marginTop + this.marginBottom);
        if (i4 < 0) {
            i4 = 0;
        }
        boolean z2 = true;
        if (this.measureForLayout) {
            int i5 = this.verticalAlignment;
            CrossAxisAlignment.Companion.getClass();
            if (i5 == 3) {
                z = true;
                if (this.measureForLayout) {
                    int i6 = this.horizontalAlignment;
                    CrossAxisAlignment.Companion.getClass();
                }
                z2 = false;
                int i7 = this.requestedWidth;
                int makeMeasureSpec = i7 == -1 ? View.MeasureSpec.makeMeasureSpec(i7, 1073741824) : z2 ? View.MeasureSpec.makeMeasureSpec(i3, 1073741824) : this.boxWidthUnspecified ? View.MeasureSpec.makeMeasureSpec(i3, 0) : View.MeasureSpec.makeMeasureSpec(i3, PKIFailureInfo.systemUnavail);
                int i8 = this.requestedHeight;
                ((View) widget.getValue()).measure(makeMeasureSpec, i8 == -1 ? View.MeasureSpec.makeMeasureSpec(i8, 1073741824) : z ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : this.boxHeightUnspecified ? View.MeasureSpec.makeMeasureSpec(i4, 0) : View.MeasureSpec.makeMeasureSpec(i4, PKIFailureInfo.systemUnavail));
                i = this.requestedWidth;
                if (i == -1) {
                    i3 = i;
                } else if (!z2) {
                    i3 = ((View) widget.getValue()).getMeasuredWidth();
                }
                this.width = i3;
                i2 = this.requestedHeight;
                if (i2 == -1) {
                    i4 = i2;
                } else if (!z) {
                    i4 = ((View) widget.getValue()).getMeasuredHeight();
                }
                this.height = i4;
            }
        }
        z = false;
        if (this.measureForLayout) {
        }
        z2 = false;
        int i72 = this.requestedWidth;
        if (i72 == -1) {
        }
        int i82 = this.requestedHeight;
        ((View) widget.getValue()).measure(makeMeasureSpec, i82 == -1 ? View.MeasureSpec.makeMeasureSpec(i82, 1073741824) : z ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : this.boxHeightUnspecified ? View.MeasureSpec.makeMeasureSpec(i4, 0) : View.MeasureSpec.makeMeasureSpec(i4, PKIFailureInfo.systemUnavail));
        i = this.requestedWidth;
        if (i == -1) {
        }
        this.width = i3;
        i2 = this.requestedHeight;
        if (i2 == -1) {
        }
        this.height = i4;
    }
}
