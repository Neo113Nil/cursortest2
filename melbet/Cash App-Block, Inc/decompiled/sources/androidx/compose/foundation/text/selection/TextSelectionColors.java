package androidx.compose.foundation.text.selection;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.ui.graphics.Color;
import kotlin.ULong;

/* loaded from: classes3.dex */
public final class TextSelectionColors {
    public final long backgroundColor;
    public final long handleColor;

    public TextSelectionColors(long j, long j2) {
        this.handleColor = j;
        this.backgroundColor = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextSelectionColors)) {
            return false;
        }
        TextSelectionColors textSelectionColors = (TextSelectionColors) obj;
        return Color.m676equalsimpl0(this.handleColor, textSelectionColors.handleColor) && Color.m676equalsimpl0(this.backgroundColor, textSelectionColors.backgroundColor);
    }

    /* renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name */
    public final long m459getBackgroundColor0d7_KjU() {
        return this.backgroundColor;
    }

    public final int hashCode() {
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        return Long.hashCode(this.backgroundColor) + (Long.hashCode(this.handleColor) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        Recorder$$ExternalSyntheticOutline1.m(this.handleColor, ", selectionBackgroundColor=", sb);
        sb.append((Object) Color.m682toStringimpl(this.backgroundColor));
        sb.append(')');
        return sb.toString();
    }
}
