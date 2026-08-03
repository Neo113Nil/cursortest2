package androidx.compose.material3.carousel;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

/* compiled from: MultiAspectCarousel.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0002\u001a\u00020\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Landroidx/compose/material3/carousel/MaskShape;", "Landroidx/compose/ui/graphics/Shape;", "baseShape", "drawInfo", "Landroidx/compose/material3/carousel/MultiAspectCarouselItemDrawInfo;", "<init>", "(Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/carousel/MultiAspectCarouselItemDrawInfo;)V", "getBaseShape", "()Landroidx/compose/ui/graphics/Shape;", "setBaseShape", "(Landroidx/compose/ui/graphics/Shape;)V", "getDrawInfo", "()Landroidx/compose/material3/carousel/MultiAspectCarouselItemDrawInfo;", "setDrawInfo", "(Landroidx/compose/material3/carousel/MultiAspectCarouselItemDrawInfo;)V", "path", "Landroidx/compose/ui/graphics/Path;", "createOutline", "Landroidx/compose/ui/graphics/Outline;", "size", "Landroidx/compose/ui/geometry/Size;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "density", "Landroidx/compose/ui/unit/Density;", "createOutline-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/graphics/Outline;", "material3"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
final class MaskShape implements Shape {
    private Shape baseShape;
    private MultiAspectCarouselItemDrawInfo drawInfo;
    private final Path path = AndroidPath_androidKt.Path();

    public MaskShape(Shape shape, MultiAspectCarouselItemDrawInfo multiAspectCarouselItemDrawInfo) {
        this.baseShape = shape;
        this.drawInfo = multiAspectCarouselItemDrawInfo;
    }

    public final Shape getBaseShape() {
        return this.baseShape;
    }

    public final MultiAspectCarouselItemDrawInfo getDrawInfo() {
        return this.drawInfo;
    }

    public final void setBaseShape(Shape shape) {
        this.baseShape = shape;
    }

    public final void setDrawInfo(MultiAspectCarouselItemDrawInfo multiAspectCarouselItemDrawInfo) {
        this.drawInfo = multiAspectCarouselItemDrawInfo;
    }

    @Override // androidx.compose.ui.graphics.Shape
    /* renamed from: createOutline-Pq9zytI */
    public Outline mo422createOutlinePq9zytI(long size, LayoutDirection layoutDirection, Density density) {
        Rect rect;
        Path path = this.path;
        path.reset();
        Rect m6609toRectuvyYCjk = SizeKt.m6609toRectuvyYCjk(size);
        if (this.drawInfo.getSize() != 0.0f) {
            if (this.drawInfo.isHorizontal()) {
                rect = new Rect(this.drawInfo.getMaskStart(), m6609toRectuvyYCjk.getTop(), this.drawInfo.getMaskEnd(), m6609toRectuvyYCjk.getBottom());
            } else {
                rect = new Rect(m6609toRectuvyYCjk.getLeft(), this.drawInfo.getMaskStart(), m6609toRectuvyYCjk.getRight(), this.drawInfo.getMaskEnd());
            }
            m6609toRectuvyYCjk = rect;
        }
        OutlineKt.addOutline(path, this.baseShape.mo422createOutlinePq9zytI(m6609toRectuvyYCjk.m6552getSizeNHjbRc(), layoutDirection, density));
        float left = m6609toRectuvyYCjk.getLeft();
        path.mo6657translatek4lQ0M(Offset.m6511constructorimpl((Float.floatToRawIntBits(m6609toRectuvyYCjk.getTop()) & 4294967295L) | (Float.floatToRawIntBits(left) << 32)));
        path.close();
        return this.path.isEmpty() ? new Outline.Rectangle(SizeKt.m6609toRectuvyYCjk(size)) : new Outline.Generic(this.path);
    }
}
