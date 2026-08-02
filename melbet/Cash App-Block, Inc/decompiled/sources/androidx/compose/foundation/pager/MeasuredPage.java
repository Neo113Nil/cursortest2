package androidx.compose.foundation.pager;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class MeasuredPage {
    public final int crossAxisSize;
    public final Alignment.Horizontal horizontalAlignment;
    public final int index;
    public final boolean isVertical;
    public final Object key;
    public final LayoutDirection layoutDirection;
    public int mainAxisLayoutSize;
    public int offset;
    public final int[] placeableOffsets;
    public final List placeables;
    public final BiasAlignment.Vertical verticalAlignment;
    public final long visualOffset;

    public MeasuredPage(int i, int i2, List list, long j, Object obj, Orientation orientation, Alignment.Horizontal horizontal, BiasAlignment.Vertical vertical, LayoutDirection layoutDirection) {
        this.index = i;
        this.placeables = list;
        this.visualOffset = j;
        this.key = obj;
        this.horizontalAlignment = horizontal;
        this.verticalAlignment = vertical;
        this.layoutDirection = layoutDirection;
        this.isVertical = orientation == Orientation.Vertical;
        int size = list.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            Placeable placeable = (Placeable) list.get(i4);
            i3 = Math.max(i3, !this.isVertical ? placeable.height : placeable.width);
        }
        this.crossAxisSize = i3;
        this.placeableOffsets = new int[this.placeables.size() * 2];
        this.mainAxisLayoutSize = PKIFailureInfo.systemUnavail;
    }

    public final void applyScrollDelta(int i) {
        this.offset += i;
        int[] iArr = this.placeableOffsets;
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            boolean z = this.isVertical;
            if ((z && i2 % 2 == 1) || (!z && i2 % 2 == 0)) {
                iArr[i2] = iArr[i2] + i;
            }
        }
    }

    public final void position(int i, int i2, int i3) {
        int i4;
        this.offset = i;
        boolean z = this.isVertical;
        this.mainAxisLayoutSize = z ? i3 : i2;
        List list = this.placeables;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            Placeable placeable = (Placeable) list.get(i5);
            int i6 = i5 * 2;
            int[] iArr = this.placeableOffsets;
            if (z) {
                Alignment.Horizontal horizontal = this.horizontalAlignment;
                if (horizontal == null) {
                    throw Recorder$$ExternalSyntheticOutline2.m("null horizontalAlignment");
                }
                iArr[i6] = horizontal.align(placeable.width, i2, this.layoutDirection);
                iArr[i6 + 1] = i;
                i4 = placeable.height;
            } else {
                iArr[i6] = i;
                int i7 = i6 + 1;
                BiasAlignment.Vertical vertical = this.verticalAlignment;
                if (vertical == null) {
                    throw Recorder$$ExternalSyntheticOutline2.m("null verticalAlignment");
                }
                iArr[i7] = vertical.align(placeable.height, i3);
                i4 = placeable.width;
            }
            i += i4;
        }
    }
}
