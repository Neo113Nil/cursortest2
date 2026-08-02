package androidx.compose.ui.graphics;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.room.util.DBUtil;

/* loaded from: classes.dex */
public final class RectangleShapeKt$RectangleShape$1 implements Shape {
    @Override // androidx.compose.ui.graphics.Shape
    /* renamed from: createOutline-Pq9zytI */
    public final ColorKt mo175createOutlinePq9zytI(long j, LayoutDirection layoutDirection, Density density) {
        return new Outline$Rectangle(DBUtil.m1180Recttz77jQw(0L, j));
    }

    public final String toString() {
        return "RectangleShape";
    }
}
