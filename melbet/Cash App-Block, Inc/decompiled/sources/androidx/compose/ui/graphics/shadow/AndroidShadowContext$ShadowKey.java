package androidx.compose.ui.graphics.shadow;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class AndroidShadowContext$ShadowKey {
    public float density;
    public LayoutDirection layoutDirection;
    public Shadow shadow;
    public Shape shape;
    public long size;

    public AndroidShadowContext$ShadowKey(Shape shape, long j, LayoutDirection layoutDirection, float f, Shadow shadow) {
        this.shape = shape;
        this.size = j;
        this.layoutDirection = layoutDirection;
        this.density = f;
        this.shadow = shadow;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidShadowContext$ShadowKey)) {
            return false;
        }
        AndroidShadowContext$ShadowKey androidShadowContext$ShadowKey = (AndroidShadowContext$ShadowKey) obj;
        return Intrinsics.areEqual(this.shape, androidShadowContext$ShadowKey.shape) && Size.m639equalsimpl0(this.size, androidShadowContext$ShadowKey.size) && this.layoutDirection == androidShadowContext$ShadowKey.layoutDirection && Float.compare(this.density, androidShadowContext$ShadowKey.density) == 0 && Intrinsics.areEqual(this.shadow, androidShadowContext$ShadowKey.shadow);
    }

    public final int hashCode() {
        int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.density, (this.layoutDirection.hashCode() + Recorder$$ExternalSyntheticOutline2.m(this.shape.hashCode() * 31, 31, this.size)) * 31, 31);
        Shadow shadow = this.shadow;
        return m + (shadow == null ? 0 : shadow.hashCode());
    }

    public final String toString() {
        return "ShadowKey(shape=" + this.shape + ", size=" + ((Object) Size.m646toStringimpl(this.size)) + ", layoutDirection=" + this.layoutDirection + ", density=" + this.density + ", shadow=" + this.shadow + ')';
    }
}
