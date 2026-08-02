package androidx.compose.foundation.lazy;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$release$1;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class LazyListMeasuredItem implements LazyLayoutMeasuredItem {
    public final int afterContentPadding;
    public final LazyLayoutItemAnimator animator;
    public final int beforeContentPadding;
    public final long constraints;
    public final Object contentType;
    public final int crossAxisSize;
    public final Alignment.Horizontal horizontalAlignment;
    public final int index;
    public final boolean isVertical;
    public final Object key;
    public final LayoutDirection layoutDirection;
    public int mainAxisLayoutSize = PKIFailureInfo.systemUnavail;
    public final int mainAxisSizeWithSpacings;
    public int maxMainAxisOffset;
    public int minMainAxisOffset;
    public boolean nonScrollableItem;
    public int offset;
    public final int[] placeableOffsets;
    public final List placeables;
    public final int size;
    public final int spacing;
    public final BiasAlignment.Vertical verticalAlignment;
    public final long visualOffset;

    public LazyListMeasuredItem(int i, List list, boolean z, Alignment.Horizontal horizontal, BiasAlignment.Vertical vertical, LayoutDirection layoutDirection, int i2, int i3, int i4, long j, Object obj, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j2) {
        this.index = i;
        this.placeables = list;
        this.isVertical = z;
        this.horizontalAlignment = horizontal;
        this.verticalAlignment = vertical;
        this.layoutDirection = layoutDirection;
        this.beforeContentPadding = i2;
        this.afterContentPadding = i3;
        this.spacing = i4;
        this.visualOffset = j;
        this.key = obj;
        this.contentType = obj2;
        this.animator = lazyLayoutItemAnimator;
        this.constraints = j2;
        int size = list.size();
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            Placeable placeable = (Placeable) list.get(i7);
            boolean z2 = this.isVertical;
            i5 += z2 ? placeable.height : placeable.width;
            i6 = Math.max(i6, !z2 ? placeable.height : placeable.width);
        }
        this.size = i5;
        int i8 = i5 + this.spacing;
        this.mainAxisSizeWithSpacings = i8 >= 0 ? i8 : 0;
        this.crossAxisSize = i6;
        this.placeableOffsets = new int[this.placeables.size() * 2];
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: getConstraints-msEJaDk, reason: not valid java name */
    public final long mo311getConstraintsmsEJaDk() {
        return this.constraints;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final Object getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final int getLane() {
        return 0;
    }

    /* renamed from: getMainAxis--gyyYBs, reason: not valid java name */
    public final int m312getMainAxisgyyYBs(long j) {
        return (int) (this.isVertical ? j & BodyPartID.bodyIdMax : j >> 32);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final int getMainAxisSizeWithSpacings() {
        return this.mainAxisSizeWithSpacings;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: getOffset-Bjo55l4, reason: not valid java name */
    public final long mo313getOffsetBjo55l4(int i) {
        if (i == 0 && this.placeables.size() == 0) {
            int i2 = this.offset;
            return this.isVertical ? i2 & BodyPartID.bodyIdMax : i2 << 32;
        }
        int i3 = i * 2;
        int[] iArr = this.placeableOffsets;
        return (iArr[i3 + 1] & BodyPartID.bodyIdMax) | (iArr[i3] << 32);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final Object getParentData(int i) {
        return ((Placeable) this.placeables.get(i)).getParentData();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final int getPlaceablesCount() {
        return this.placeables.size();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final int getSpan() {
        return 1;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final boolean isVertical() {
        return this.isVertical;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void place(Placeable.PlacementScope placementScope, boolean z) {
        List list;
        int i;
        if (this.mainAxisLayoutSize == Integer.MIN_VALUE) {
            InlineClassHelperKt.throwIllegalArgumentException("position() should be called first");
        }
        List list2 = this.placeables;
        int size = list2.size();
        int i2 = 0;
        while (i2 < size) {
            Placeable placeable = (Placeable) list2.get(i2);
            int i3 = this.minMainAxisOffset;
            boolean z2 = this.isVertical;
            int i4 = i3 - (z2 ? placeable.height : placeable.width);
            int i5 = this.maxMainAxisOffset;
            long mo313getOffsetBjo55l4 = mo313getOffsetBjo55l4(i2);
            LazyLayoutItemAnimation animation = this.animator.getAnimation(i2, this.key);
            GraphicsLayer graphicsLayer = null;
            Object[] objArr = 0;
            if (animation != null) {
                if (z) {
                    animation.lookaheadOffset = mo313getOffsetBjo55l4;
                    list = list2;
                    i = size;
                } else {
                    list = list2;
                    i = size;
                    if (!IntOffset.m1047equalsimpl0(animation.lookaheadOffset, 9223372034707292159L)) {
                        mo313getOffsetBjo55l4 = animation.lookaheadOffset;
                    }
                    long m1049plusqkQi6aY = IntOffset.m1049plusqkQi6aY(mo313getOffsetBjo55l4, ((IntOffset) animation.placementDelta$delegate.getValue()).packedValue);
                    if (((m312getMainAxisgyyYBs(mo313getOffsetBjo55l4) <= i4 && m312getMainAxisgyyYBs(m1049plusqkQi6aY) <= i4) || (m312getMainAxisgyyYBs(mo313getOffsetBjo55l4) >= i5 && m312getMainAxisgyyYBs(m1049plusqkQi6aY) >= i5)) && ((Boolean) animation.isPlacementAnimationInProgress$delegate.getValue()).booleanValue()) {
                        JobKt.launch$default(animation.coroutineScope, null, null, new LazyLayoutItemAnimation$release$1(animation, objArr == true ? 1 : 0, 2), 3);
                    }
                    mo313getOffsetBjo55l4 = m1049plusqkQi6aY;
                }
                graphicsLayer = animation.layer;
            } else {
                list = list2;
                i = size;
            }
            long m1049plusqkQi6aY2 = IntOffset.m1049plusqkQi6aY(mo313getOffsetBjo55l4, this.visualOffset);
            if (!z && animation != null) {
                animation.finalOffset = m1049plusqkQi6aY2;
            }
            if (z2) {
                if (graphicsLayer != null) {
                    placementScope.getClass();
                    Placeable.PlacementScope.access$handleMotionFrameOfReferencePlacement(placementScope, placeable);
                    placeable.mo851placeAtf8xVGno(IntOffset.m1049plusqkQi6aY(m1049plusqkQi6aY2, placeable.apparentToRealOffset), RecyclerView.DECELERATION_RATE, graphicsLayer);
                } else {
                    Placeable.PlacementScope.m856placeWithLayeraW9wM$default(placementScope, placeable, m1049plusqkQi6aY2, null, 6);
                }
            } else if (graphicsLayer == null) {
                Placeable.PlacementScope.m855placeRelativeWithLayeraW9wM$default(placementScope, placeable, m1049plusqkQi6aY2);
            } else if (placementScope.getParentLayoutDirection() == LayoutDirection.Ltr || placementScope.getParentWidth() == 0) {
                Placeable.PlacementScope.access$handleMotionFrameOfReferencePlacement(placementScope, placeable);
                placeable.mo851placeAtf8xVGno(IntOffset.m1049plusqkQi6aY(m1049plusqkQi6aY2, placeable.apparentToRealOffset), RecyclerView.DECELERATION_RATE, graphicsLayer);
            } else {
                long parentWidth = (((placementScope.getParentWidth() - placeable.width) - ((int) (m1049plusqkQi6aY2 >> 32))) << 32) | (((int) (m1049plusqkQi6aY2 & BodyPartID.bodyIdMax)) & BodyPartID.bodyIdMax);
                Placeable.PlacementScope.access$handleMotionFrameOfReferencePlacement(placementScope, placeable);
                placeable.mo851placeAtf8xVGno(IntOffset.m1049plusqkQi6aY(parentWidth, placeable.apparentToRealOffset), RecyclerView.DECELERATION_RATE, graphicsLayer);
            }
            i2++;
            list2 = list;
            size = i;
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
                    throw Recorder$$ExternalSyntheticOutline2.m("null horizontalAlignment when isVertical == true");
                }
                iArr[i6] = horizontal.align(placeable.width, i2, this.layoutDirection);
                iArr[i6 + 1] = i;
                i4 = placeable.height;
            } else {
                iArr[i6] = i;
                int i7 = i6 + 1;
                BiasAlignment.Vertical vertical = this.verticalAlignment;
                if (vertical == null) {
                    throw Recorder$$ExternalSyntheticOutline2.m("null verticalAlignment when isVertical == false");
                }
                iArr[i7] = vertical.align(placeable.height, i3);
                i4 = placeable.width;
            }
            i += i4;
        }
        this.minMainAxisOffset = -this.beforeContentPadding;
        this.maxMainAxisOffset = this.mainAxisLayoutSize + this.afterContentPadding;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final void setNonScrollableItem() {
        this.nonScrollableItem = true;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final void position(int i, int i2, int i3, int i4) {
        position(i, i3, i4);
    }
}
