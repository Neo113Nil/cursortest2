package androidx.compose.ui.graphics;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.core.view.DisplayCompat;

/* loaded from: classes3.dex */
public final class BlurEffect extends RenderEffect {
    public final int edgeTreatment;
    public final float radiusX;
    public final float radiusY;

    public BlurEffect(float f, float f2, int i) {
        this.radiusX = f;
        this.radiusY = f2;
        this.edgeTreatment = i;
    }

    @Override // androidx.compose.ui.graphics.RenderEffect
    public final android.graphics.RenderEffect createRenderEffect() {
        return DisplayCompat.m1103createBlurEffect8A3gB4(this.radiusX, this.radiusY, this.edgeTreatment);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlurEffect)) {
            return false;
        }
        BlurEffect blurEffect = (BlurEffect) obj;
        return this.radiusX == blurEffect.radiusX && this.radiusY == blurEffect.radiusY && this.edgeTreatment == blurEffect.edgeTreatment;
    }

    public final int hashCode() {
        return Integer.hashCode(this.edgeTreatment) + CameraState$Type$EnumUnboxingLocalUtility.m(this.radiusY, Float.hashCode(this.radiusX) * 31, 31);
    }

    public final String toString() {
        return "BlurEffect(renderEffect=null, radiusX=" + this.radiusX + ", radiusY=" + this.radiusY + ", edgeTreatment=" + ((Object) TileMode.m713toStringimpl(this.edgeTreatment)) + ')';
    }
}
