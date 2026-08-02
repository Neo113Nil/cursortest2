package androidx.compose.material3;

import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.DpCornerSize;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shape;
import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public abstract class ShapesKt {
    public static final StaticProvidableCompositionLocal LocalShapes = new StaticProvidableCompositionLocal(new androidx.compose.material.TextKt$$ExternalSyntheticLambda0(19));

    public static final Shape getValue(ShapeKeyTokens shapeKeyTokens, Composer composer) {
        Shapes shapes = (Shapes) ((GapComposer) composer).consume(LocalShapes);
        switch (shapeKeyTokens.ordinal()) {
            case 0:
                return shapes.extraExtraLarge;
            case 1:
                return shapes.extraLarge;
            case 2:
                return shapes.extraLargeIncreased;
            case 3:
                return top$default(shapes.extraLarge);
            case 4:
                return shapes.extraSmall;
            case 5:
                return top$default(shapes.extraSmall);
            case 6:
                return RoundedCornerShapeKt.CircleShape;
            case 7:
                return shapes.large;
            case 8:
                CornerBasedShape cornerBasedShape = shapes.large;
                DpCornerSize dpCornerSize = ShapeDefaults.CornerNone;
                return CornerBasedShape.copy$default(cornerBasedShape, dpCornerSize, null, null, dpCornerSize, 6);
            case 9:
                return shapes.largeIncreased;
            case 10:
                CornerBasedShape cornerBasedShape2 = shapes.large;
                DpCornerSize dpCornerSize2 = ShapeDefaults.CornerNone;
                return CornerBasedShape.copy$default(cornerBasedShape2, null, dpCornerSize2, dpCornerSize2, null, 9);
            case 11:
                return top$default(shapes.large);
            case 12:
                return shapes.medium;
            case 13:
                return ColorKt.RectangleShape;
            case 14:
                return shapes.small;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
    }

    public static CornerBasedShape top$default(CornerBasedShape cornerBasedShape) {
        DpCornerSize dpCornerSize = ShapeDefaults.CornerNone;
        return CornerBasedShape.copy$default(cornerBasedShape, null, null, dpCornerSize, dpCornerSize, 3);
    }
}
