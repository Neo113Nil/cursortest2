package androidx.compose.foundation;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class OverscrollConfiguration {
    public final PaddingValuesImpl drawPadding;
    public final long glowColor;

    public OverscrollConfiguration() {
        long Color = ColorKt.Color(4284900966L);
        PaddingValuesImpl m295PaddingValuesYgX7TsA$default = SpacerKt.m295PaddingValuesYgX7TsA$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 3);
        this.glowColor = Color;
        this.drawPadding = m295PaddingValuesYgX7TsA$default;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!OverscrollConfiguration.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        OverscrollConfiguration overscrollConfiguration = (OverscrollConfiguration) obj;
        return Color.m676equalsimpl0(this.glowColor, overscrollConfiguration.glowColor) && Intrinsics.areEqual(this.drawPadding, overscrollConfiguration.drawPadding);
    }

    public final int hashCode() {
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        return this.drawPadding.hashCode() + (Long.hashCode(this.glowColor) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverscrollConfiguration(glowColor=");
        Recorder$$ExternalSyntheticOutline1.m(this.glowColor, ", drawPadding=", sb);
        sb.append(this.drawPadding);
        sb.append(')');
        return sb.toString();
    }
}
