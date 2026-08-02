package androidx.compose.foundation.text.input.internal.selection;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes.dex */
public final class TextFieldHandleState {
    public static final TextFieldHandleState Hidden = new TextFieldHandleState(false, 9205357640488583168L, RecyclerView.DECELERATION_RATE, ResolvedTextDirection.Ltr, false);
    public final ResolvedTextDirection direction;
    public final boolean handlesCrossed;
    public final float lineHeight;
    public final long position;
    public final boolean visible;

    public TextFieldHandleState(boolean z, long j, float f, ResolvedTextDirection resolvedTextDirection, boolean z2) {
        this.visible = z;
        this.position = j;
        this.lineHeight = f;
        this.direction = resolvedTextDirection;
        this.handlesCrossed = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldHandleState)) {
            return false;
        }
        TextFieldHandleState textFieldHandleState = (TextFieldHandleState) obj;
        return this.visible == textFieldHandleState.visible && Offset.m622equalsimpl0(this.position, textFieldHandleState.position) && Float.compare(this.lineHeight, textFieldHandleState.lineHeight) == 0 && this.direction == textFieldHandleState.direction && this.handlesCrossed == textFieldHandleState.handlesCrossed;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.handlesCrossed) + ((this.direction.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.lineHeight, Recorder$$ExternalSyntheticOutline2.m(Boolean.hashCode(this.visible) * 31, 31, this.position), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextFieldHandleState(visible=");
        sb.append(this.visible);
        sb.append(", position=");
        sb.append((Object) Offset.m628toStringimpl(this.position));
        sb.append(", lineHeight=");
        sb.append(this.lineHeight);
        sb.append(", direction=");
        sb.append(this.direction);
        sb.append(", handlesCrossed=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.handlesCrossed, ')');
    }
}
