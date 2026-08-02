package androidx.compose.foundation.text.selection;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.text.Handle;
import androidx.compose.ui.geometry.Offset;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class SelectionHandleInfo {
    public final SelectionHandleAnchor anchor;
    public final Handle handle;
    public final long position;
    public final boolean visible;

    public SelectionHandleInfo(Handle handle, long j, SelectionHandleAnchor selectionHandleAnchor, boolean z) {
        this.handle = handle;
        this.position = j;
        this.anchor = selectionHandleAnchor;
        this.visible = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectionHandleInfo)) {
            return false;
        }
        SelectionHandleInfo selectionHandleInfo = (SelectionHandleInfo) obj;
        return this.handle == selectionHandleInfo.handle && Offset.m622equalsimpl0(this.position, selectionHandleInfo.position) && this.anchor == selectionHandleInfo.anchor && this.visible == selectionHandleInfo.visible;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.visible) + ((this.anchor.hashCode() + Recorder$$ExternalSyntheticOutline2.m(this.handle.hashCode() * 31, 31, this.position)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionHandleInfo(handle=");
        sb.append(this.handle);
        sb.append(", position=");
        sb.append((Object) Offset.m628toStringimpl(this.position));
        sb.append(", anchor=");
        sb.append(this.anchor);
        sb.append(", visible=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.visible, ')');
    }
}
