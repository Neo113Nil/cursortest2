package androidx.compose.ui.graphics.vector;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.graphics.Brush;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class VectorPath extends VectorNode {
    public final Brush fill;
    public final float fillAlpha;
    public final String name;
    public final List pathData;
    public final int pathFillType;
    public final Brush stroke;
    public final float strokeAlpha;
    public final int strokeLineCap;
    public final int strokeLineJoin;
    public final float strokeLineMiter;
    public final float strokeLineWidth;
    public final float trimPathEnd;
    public final float trimPathOffset;
    public final float trimPathStart;

    public VectorPath(String str, List list, int i, Brush brush, float f, Brush brush2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        this.name = str;
        this.pathData = list;
        this.pathFillType = i;
        this.fill = brush;
        this.fillAlpha = f;
        this.stroke = brush2;
        this.strokeAlpha = f2;
        this.strokeLineWidth = f3;
        this.strokeLineCap = i2;
        this.strokeLineJoin = i3;
        this.strokeLineMiter = f4;
        this.trimPathStart = f5;
        this.trimPathEnd = f6;
        this.trimPathOffset = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || VectorPath.class != obj.getClass()) {
            return false;
        }
        VectorPath vectorPath = (VectorPath) obj;
        return this.name.equals(vectorPath.name) && Intrinsics.areEqual(this.fill, vectorPath.fill) && this.fillAlpha == vectorPath.fillAlpha && Intrinsics.areEqual(this.stroke, vectorPath.stroke) && this.strokeAlpha == vectorPath.strokeAlpha && this.strokeLineWidth == vectorPath.strokeLineWidth && this.strokeLineCap == vectorPath.strokeLineCap && this.strokeLineJoin == vectorPath.strokeLineJoin && this.strokeLineMiter == vectorPath.strokeLineMiter && this.trimPathStart == vectorPath.trimPathStart && this.trimPathEnd == vectorPath.trimPathEnd && this.trimPathOffset == vectorPath.trimPathOffset && this.pathFillType == vectorPath.pathFillType && Intrinsics.areEqual(this.pathData, vectorPath.pathData);
    }

    public final int hashCode() {
        int m = Recorder$$ExternalSyntheticOutline2.m(this.name.hashCode() * 31, 31, this.pathData);
        Brush brush = this.fill;
        int m2 = CameraState$Type$EnumUnboxingLocalUtility.m(this.fillAlpha, (m + (brush != null ? brush.hashCode() : 0)) * 31, 31);
        Brush brush2 = this.stroke;
        return Integer.hashCode(this.pathFillType) + CameraState$Type$EnumUnboxingLocalUtility.m(this.trimPathOffset, CameraState$Type$EnumUnboxingLocalUtility.m(this.trimPathEnd, CameraState$Type$EnumUnboxingLocalUtility.m(this.trimPathStart, CameraState$Type$EnumUnboxingLocalUtility.m(this.strokeLineMiter, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.strokeLineJoin, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.strokeLineCap, CameraState$Type$EnumUnboxingLocalUtility.m(this.strokeLineWidth, CameraState$Type$EnumUnboxingLocalUtility.m(this.strokeAlpha, (m2 + (brush2 != null ? brush2.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
