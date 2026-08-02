package androidx.compose.ui.graphics.drawscope;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.compose.ui.graphics.AndroidPathEffect;
import androidx.compose.ui.graphics.PathEffect;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class Stroke extends DrawStyle {
    public final int cap;
    public final int join;
    public final float miter;
    public final PathEffect pathEffect;
    public final float width;

    public Stroke(float f, float f2, int i, int i2, AndroidPathEffect androidPathEffect, int i3) {
        f2 = (i3 & 2) != 0 ? 4.0f : f2;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        androidPathEffect = (i3 & 16) != 0 ? null : androidPathEffect;
        this.width = f;
        this.miter = f2;
        this.cap = i;
        this.join = i2;
        this.pathEffect = androidPathEffect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Stroke)) {
            return false;
        }
        Stroke stroke = (Stroke) obj;
        return this.width == stroke.width && this.miter == stroke.miter && this.cap == stroke.cap && this.join == stroke.join && Intrinsics.areEqual(this.pathEffect, stroke.pathEffect);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.join, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.cap, CameraState$Type$EnumUnboxingLocalUtility.m(this.miter, Float.hashCode(this.width) * 31, 31), 31), 31);
        PathEffect pathEffect = this.pathEffect;
        return m + (pathEffect != null ? pathEffect.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Stroke(width=");
        sb.append(this.width);
        sb.append(", miter=");
        sb.append(this.miter);
        sb.append(", cap=");
        String str = "Unknown";
        int i = this.cap;
        sb.append((Object) (i == 0 ? "Butt" : i == 1 ? "Round" : i == 2 ? "Square" : "Unknown"));
        sb.append(", join=");
        int i2 = this.join;
        if (i2 == 0) {
            str = "Miter";
        } else if (i2 == 1) {
            str = "Round";
        } else if (i2 == 2) {
            str = "Bevel";
        }
        sb.append((Object) str);
        sb.append(", pathEffect=");
        sb.append(this.pathEffect);
        sb.append(')');
        return sb.toString();
    }
}
