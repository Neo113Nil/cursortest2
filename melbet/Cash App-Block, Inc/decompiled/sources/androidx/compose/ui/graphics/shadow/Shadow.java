package androidx.compose.ui.graphics.shadow;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpOffset;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.ULong;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: classes3.dex */
public final class Shadow {
    public final float alpha;
    public final int blendMode;
    public final long color;
    public final long offset;
    public final float radius;
    public final float spread;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Shadow(float f, long j, float f2, long j2, float f3, int i) {
        this(f, f2, j2, j == 16 ? Color.Black : j, (i & 16) != 0 ? 1.0f : f3, 3);
        j = (i & 2) != 0 ? Color.Black : j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Shadow) {
            Shadow shadow = (Shadow) obj;
            if (Dp.m1037equalsimpl0(this.radius, shadow.radius) && Dp.m1037equalsimpl0(this.spread, shadow.spread) && this.offset == shadow.offset && this.alpha == shadow.alpha && this.blendMode == shadow.blendMode && Color.m676equalsimpl0(this.color, shadow.color)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.blendMode, CameraState$Type$EnumUnboxingLocalUtility.m(this.alpha, Recorder$$ExternalSyntheticOutline2.m(CameraState$Type$EnumUnboxingLocalUtility.m(this.spread, Float.hashCode(this.radius) * 31, 31), 31, this.offset), 31), 31);
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        return Recorder$$ExternalSyntheticOutline2.m(m, 31, this.color);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(radius=");
        Recorder$$ExternalSyntheticOutline1.m104m(this.radius, ", spread=", sb);
        Recorder$$ExternalSyntheticOutline1.m104m(this.spread, ", offset=", sb);
        sb.append((Object) DpOffset.m1041toStringimpl(this.offset));
        sb.append(", alpha=");
        sb.append(this.alpha);
        sb.append(", blendMode=");
        sb.append((Object) BlendMode.m669toStringimpl(this.blendMode));
        sb.append(", color=");
        sb.append((Object) Color.m682toStringimpl(this.color));
        sb.append(", brush=null)");
        return sb.toString();
    }

    public Shadow(float f, float f2, long j, long j2, float f3, int i) {
        this.radius = f;
        this.spread = f2;
        this.offset = j;
        this.blendMode = i;
        this.color = j2;
        this.alpha = RangesKt___RangesKt.coerceIn(f3, RecyclerView.DECELERATION_RATE, 1.0f);
    }
}
