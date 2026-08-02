package androidx.compose.ui.graphics;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.geometry.Offset;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.ULong;

/* loaded from: classes.dex */
public final class Shadow {
    public static final Shadow None = new Shadow(0, 7);
    public final float blurRadius;
    public final long color;
    public final long offset;

    public /* synthetic */ Shadow(long j, int i) {
        this((i & 4) != 0 ? RecyclerView.DECELERATION_RATE : 8.0f, (i & 1) != 0 ? ColorKt.Color(4278190080L) : j, 0L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Shadow)) {
            return false;
        }
        Shadow shadow = (Shadow) obj;
        return Color.m676equalsimpl0(this.color, shadow.color) && Offset.m622equalsimpl0(this.offset, shadow.offset) && this.blurRadius == shadow.blurRadius;
    }

    public final int hashCode() {
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        return Float.hashCode(this.blurRadius) + Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.color) * 31, 31, this.offset);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        Recorder$$ExternalSyntheticOutline1.m(this.color, ", offset=", sb);
        sb.append((Object) Offset.m628toStringimpl(this.offset));
        sb.append(", blurRadius=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.blurRadius, ')');
    }

    public Shadow(float f, long j, long j2) {
        this.color = j;
        this.offset = j2;
        this.blurRadius = f;
    }
}
