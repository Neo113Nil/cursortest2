package androidx.compose.foundation.shape;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Outline$Generic;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function3;

/* loaded from: classes3.dex */
public final class GenericShape implements Shape {
    public final Function3 builder;

    public GenericShape(Function3 function3) {
        this.builder = function3;
    }

    @Override // androidx.compose.ui.graphics.Shape
    /* renamed from: createOutline-Pq9zytI */
    public final ColorKt mo175createOutlinePq9zytI(long j, LayoutDirection layoutDirection, Density density) {
        AndroidPath Path = AndroidPath_androidKt.Path();
        this.builder.invoke(Path, new Size(j), layoutDirection);
        Path.close();
        return new Outline$Generic(Path);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        GenericShape genericShape = obj instanceof GenericShape ? (GenericShape) obj : null;
        return (genericShape != null ? genericShape.builder : null) == this.builder;
    }

    public final int hashCode() {
        return this.builder.hashCode();
    }
}
