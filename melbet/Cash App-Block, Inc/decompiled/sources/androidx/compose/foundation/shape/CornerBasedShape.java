package androidx.compose.foundation.shape;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes.dex */
public abstract class CornerBasedShape implements Shape {
    public final CornerSize bottomEnd;
    public final CornerSize bottomStart;
    public final CornerSize topEnd;
    public final CornerSize topStart;

    public CornerBasedShape(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        this.topStart = cornerSize;
        this.topEnd = cornerSize2;
        this.bottomEnd = cornerSize3;
        this.bottomStart = cornerSize4;
    }

    public static /* synthetic */ CornerBasedShape copy$default(CornerBasedShape cornerBasedShape, CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4, int i) {
        if ((i & 1) != 0) {
            cornerSize = cornerBasedShape.topStart;
        }
        if ((i & 2) != 0) {
            cornerSize2 = cornerBasedShape.topEnd;
        }
        if ((i & 4) != 0) {
            cornerSize3 = cornerBasedShape.bottomEnd;
        }
        if ((i & 8) != 0) {
            cornerSize4 = cornerBasedShape.bottomStart;
        }
        return cornerBasedShape.copy(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }

    public abstract CornerBasedShape copy(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4);

    /* renamed from: createOutline-LjSzlW0 */
    public abstract ColorKt mo338createOutlineLjSzlW0(long j, float f, float f2, float f3, float f4, LayoutDirection layoutDirection);

    @Override // androidx.compose.ui.graphics.Shape
    /* renamed from: createOutline-Pq9zytI */
    public final ColorKt mo175createOutlinePq9zytI(long j, LayoutDirection layoutDirection, Density density) {
        float mo339toPxTmRCtEA = this.topStart.mo339toPxTmRCtEA(j, density);
        float mo339toPxTmRCtEA2 = this.topEnd.mo339toPxTmRCtEA(j, density);
        float mo339toPxTmRCtEA3 = this.bottomEnd.mo339toPxTmRCtEA(j, density);
        float mo339toPxTmRCtEA4 = this.bottomStart.mo339toPxTmRCtEA(j, density);
        float m642getMinDimensionimpl = Size.m642getMinDimensionimpl(j);
        float f = mo339toPxTmRCtEA + mo339toPxTmRCtEA4;
        if (f > m642getMinDimensionimpl) {
            float f2 = m642getMinDimensionimpl / f;
            mo339toPxTmRCtEA *= f2;
            mo339toPxTmRCtEA4 *= f2;
        }
        float f3 = mo339toPxTmRCtEA2 + mo339toPxTmRCtEA3;
        if (f3 > m642getMinDimensionimpl) {
            float f4 = m642getMinDimensionimpl / f3;
            mo339toPxTmRCtEA2 *= f4;
            mo339toPxTmRCtEA3 *= f4;
        }
        if (mo339toPxTmRCtEA < RecyclerView.DECELERATION_RATE || mo339toPxTmRCtEA2 < RecyclerView.DECELERATION_RATE || mo339toPxTmRCtEA3 < RecyclerView.DECELERATION_RATE || mo339toPxTmRCtEA4 < RecyclerView.DECELERATION_RATE) {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Corner size in Px can't be negative(topStart = ", mo339toPxTmRCtEA, ", topEnd = ", mo339toPxTmRCtEA2, ", bottomEnd = ");
            m.append(mo339toPxTmRCtEA3);
            m.append(", bottomStart = ");
            m.append(mo339toPxTmRCtEA4);
            m.append(")!");
            InlineClassHelperKt.throwIllegalArgumentException(m.toString());
        }
        return mo338createOutlineLjSzlW0(j, mo339toPxTmRCtEA, mo339toPxTmRCtEA2, mo339toPxTmRCtEA3, mo339toPxTmRCtEA4, layoutDirection);
    }
}
