package androidx.compose.material3.internal;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAbsoluteAlignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.wallet.views.HeroTagViewKt$$ExternalSyntheticLambda12;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class DropdownMenuPositionProvider implements PopupPositionProvider {
    public final AnchorAlignmentOffsetPosition$Vertical bottomToAnchorTop;
    public final WindowAlignmentMarginPosition$Vertical bottomToWindowBottom;
    public final AnchorAlignmentOffsetPosition$Vertical centerToAnchorTop;
    public final long contentOffset;
    public final Density density;
    public final AnchorAlignmentOffsetPosition$Horizontal endToAnchorEnd;
    public final WindowAlignmentMarginPosition$Horizontal leftToWindowLeft;
    public final HeroTagViewKt$$ExternalSyntheticLambda12 onPositionCalculated;
    public final WindowAlignmentMarginPosition$Horizontal rightToWindowRight;
    public final AnchorAlignmentOffsetPosition$Horizontal startToAnchorStart;
    public final AnchorAlignmentOffsetPosition$Vertical topToAnchorBottom;
    public final WindowAlignmentMarginPosition$Vertical topToWindowTop;
    public final int verticalMargin;

    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.compose.material3.internal.AnchorAlignmentOffsetPosition$Horizontal] */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.material3.internal.AnchorAlignmentOffsetPosition$Horizontal] */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.compose.material3.internal.WindowAlignmentMarginPosition$Vertical] */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.material3.internal.WindowAlignmentMarginPosition$Vertical] */
    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.compose.material3.internal.AnchorAlignmentOffsetPosition$Vertical] */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.material3.internal.AnchorAlignmentOffsetPosition$Vertical] */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.compose.material3.internal.AnchorAlignmentOffsetPosition$Vertical] */
    /* JADX WARN: Type inference failed for: r7v3, types: [androidx.compose.material3.internal.WindowAlignmentMarginPosition$Horizontal] */
    /* JADX WARN: Type inference failed for: r7v4, types: [androidx.compose.material3.internal.WindowAlignmentMarginPosition$Horizontal] */
    public DropdownMenuPositionProvider(long j, Density density, HeroTagViewKt$$ExternalSyntheticLambda12 heroTagViewKt$$ExternalSyntheticLambda12) {
        final int mo230roundToPx0680j_4 = density.mo230roundToPx0680j_4(48.0f);
        this.contentOffset = j;
        this.density = density;
        this.verticalMargin = mo230roundToPx0680j_4;
        this.onPositionCalculated = heroTagViewKt$$ExternalSyntheticLambda12;
        final int mo230roundToPx0680j_42 = density.mo230roundToPx0680j_4(DpOffset.m1039getXD9Ej5fM(j));
        final BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
        this.startToAnchorStart = new MenuPosition$Horizontal(horizontal, horizontal, mo230roundToPx0680j_42) { // from class: androidx.compose.material3.internal.AnchorAlignmentOffsetPosition$Horizontal
            public final BiasAlignment.Horizontal anchorAlignment;
            public final BiasAlignment.Horizontal menuAlignment;
            public final int offset;

            {
                this.menuAlignment = horizontal;
                this.anchorAlignment = horizontal;
                this.offset = mo230roundToPx0680j_42;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AnchorAlignmentOffsetPosition$Horizontal)) {
                    return false;
                }
                AnchorAlignmentOffsetPosition$Horizontal anchorAlignmentOffsetPosition$Horizontal = (AnchorAlignmentOffsetPosition$Horizontal) obj;
                return this.menuAlignment.equals(anchorAlignmentOffsetPosition$Horizontal.menuAlignment) && this.anchorAlignment.equals(anchorAlignmentOffsetPosition$Horizontal.anchorAlignment) && this.offset == anchorAlignmentOffsetPosition$Horizontal.offset;
            }

            public final int hashCode() {
                return Integer.hashCode(this.offset) + CameraState$Type$EnumUnboxingLocalUtility.m(this.anchorAlignment.bias, Float.hashCode(this.menuAlignment.bias) * 31, 31);
            }

            @Override // androidx.compose.material3.internal.MenuPosition$Horizontal
            /* renamed from: position-95KtPRI, reason: not valid java name */
            public final int mo563position95KtPRI(IntRect intRect, long j2, int i, LayoutDirection layoutDirection) {
                int align = this.anchorAlignment.align(0, intRect.getWidth(), layoutDirection);
                int i2 = -this.menuAlignment.align(0, i, layoutDirection);
                LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
                int i3 = this.offset;
                if (layoutDirection != layoutDirection2) {
                    i3 = -i3;
                }
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m$1(intRect.left, align, i2, i3);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Horizontal(menuAlignment=");
                sb.append(this.menuAlignment);
                sb.append(", anchorAlignment=");
                sb.append(this.anchorAlignment);
                sb.append(", offset=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.offset, ')');
            }
        };
        final BiasAlignment.Horizontal horizontal2 = Alignment.Companion.End;
        this.endToAnchorEnd = new MenuPosition$Horizontal(horizontal2, horizontal2, mo230roundToPx0680j_42) { // from class: androidx.compose.material3.internal.AnchorAlignmentOffsetPosition$Horizontal
            public final BiasAlignment.Horizontal anchorAlignment;
            public final BiasAlignment.Horizontal menuAlignment;
            public final int offset;

            {
                this.menuAlignment = horizontal2;
                this.anchorAlignment = horizontal2;
                this.offset = mo230roundToPx0680j_42;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AnchorAlignmentOffsetPosition$Horizontal)) {
                    return false;
                }
                AnchorAlignmentOffsetPosition$Horizontal anchorAlignmentOffsetPosition$Horizontal = (AnchorAlignmentOffsetPosition$Horizontal) obj;
                return this.menuAlignment.equals(anchorAlignmentOffsetPosition$Horizontal.menuAlignment) && this.anchorAlignment.equals(anchorAlignmentOffsetPosition$Horizontal.anchorAlignment) && this.offset == anchorAlignmentOffsetPosition$Horizontal.offset;
            }

            public final int hashCode() {
                return Integer.hashCode(this.offset) + CameraState$Type$EnumUnboxingLocalUtility.m(this.anchorAlignment.bias, Float.hashCode(this.menuAlignment.bias) * 31, 31);
            }

            @Override // androidx.compose.material3.internal.MenuPosition$Horizontal
            /* renamed from: position-95KtPRI, reason: not valid java name */
            public final int mo563position95KtPRI(IntRect intRect, long j2, int i, LayoutDirection layoutDirection) {
                int align = this.anchorAlignment.align(0, intRect.getWidth(), layoutDirection);
                int i2 = -this.menuAlignment.align(0, i, layoutDirection);
                LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
                int i3 = this.offset;
                if (layoutDirection != layoutDirection2) {
                    i3 = -i3;
                }
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m$1(intRect.left, align, i2, i3);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Horizontal(menuAlignment=");
                sb.append(this.menuAlignment);
                sb.append(", anchorAlignment=");
                sb.append(this.anchorAlignment);
                sb.append(", offset=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.offset, ')');
            }
        };
        final BiasAbsoluteAlignment.Horizontal horizontal3 = ZIndexModifierKt.Left;
        this.leftToWindowLeft = new MenuPosition$Horizontal(horizontal3) { // from class: androidx.compose.material3.internal.WindowAlignmentMarginPosition$Horizontal
            public final BiasAbsoluteAlignment.Horizontal alignment;

            {
                this.alignment = horizontal3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof WindowAlignmentMarginPosition$Horizontal) && this.alignment.equals(((WindowAlignmentMarginPosition$Horizontal) obj).alignment);
            }

            public final int hashCode() {
                return Integer.hashCode(0) + (Float.hashCode(this.alignment.bias) * 31);
            }

            @Override // androidx.compose.material3.internal.MenuPosition$Horizontal
            /* renamed from: position-95KtPRI */
            public final int mo563position95KtPRI(IntRect intRect, long j2, int i, LayoutDirection layoutDirection) {
                int i2 = (int) (j2 >> 32);
                if (i >= i2) {
                    return Math.round((1.0f + (layoutDirection == LayoutDirection.Ltr ? RecyclerView.DECELERATION_RATE : -0.0f)) * ((i2 - i) / 2.0f));
                }
                return RangesKt___RangesKt.coerceIn(this.alignment.align(i, i2, layoutDirection), 0, i2 - i);
            }

            public final String toString() {
                return "Horizontal(alignment=" + this.alignment + ", margin=0)";
            }
        };
        final BiasAbsoluteAlignment.Horizontal horizontal4 = ZIndexModifierKt.Right;
        this.rightToWindowRight = new MenuPosition$Horizontal(horizontal4) { // from class: androidx.compose.material3.internal.WindowAlignmentMarginPosition$Horizontal
            public final BiasAbsoluteAlignment.Horizontal alignment;

            {
                this.alignment = horizontal4;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof WindowAlignmentMarginPosition$Horizontal) && this.alignment.equals(((WindowAlignmentMarginPosition$Horizontal) obj).alignment);
            }

            public final int hashCode() {
                return Integer.hashCode(0) + (Float.hashCode(this.alignment.bias) * 31);
            }

            @Override // androidx.compose.material3.internal.MenuPosition$Horizontal
            /* renamed from: position-95KtPRI */
            public final int mo563position95KtPRI(IntRect intRect, long j2, int i, LayoutDirection layoutDirection) {
                int i2 = (int) (j2 >> 32);
                if (i >= i2) {
                    return Math.round((1.0f + (layoutDirection == LayoutDirection.Ltr ? RecyclerView.DECELERATION_RATE : -0.0f)) * ((i2 - i) / 2.0f));
                }
                return RangesKt___RangesKt.coerceIn(this.alignment.align(i, i2, layoutDirection), 0, i2 - i);
            }

            public final String toString() {
                return "Horizontal(alignment=" + this.alignment + ", margin=0)";
            }
        };
        final int mo230roundToPx0680j_43 = density.mo230roundToPx0680j_4(DpOffset.m1040getYD9Ej5fM(j));
        final BiasAlignment.Vertical vertical = Alignment.Companion.Top;
        final BiasAlignment.Vertical vertical2 = Alignment.Companion.Bottom;
        this.topToAnchorBottom = new MenuPosition$Vertical(vertical, vertical2, mo230roundToPx0680j_43) { // from class: androidx.compose.material3.internal.AnchorAlignmentOffsetPosition$Vertical
            public final BiasAlignment.Vertical anchorAlignment;
            public final BiasAlignment.Vertical menuAlignment;
            public final int offset;

            {
                this.menuAlignment = vertical;
                this.anchorAlignment = vertical2;
                this.offset = mo230roundToPx0680j_43;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AnchorAlignmentOffsetPosition$Vertical)) {
                    return false;
                }
                AnchorAlignmentOffsetPosition$Vertical anchorAlignmentOffsetPosition$Vertical = (AnchorAlignmentOffsetPosition$Vertical) obj;
                return this.menuAlignment.equals(anchorAlignmentOffsetPosition$Vertical.menuAlignment) && this.anchorAlignment.equals(anchorAlignmentOffsetPosition$Vertical.anchorAlignment) && this.offset == anchorAlignmentOffsetPosition$Vertical.offset;
            }

            public final int hashCode() {
                return Integer.hashCode(this.offset) + CameraState$Type$EnumUnboxingLocalUtility.m(this.anchorAlignment.bias, Float.hashCode(this.menuAlignment.bias) * 31, 31);
            }

            @Override // androidx.compose.material3.internal.MenuPosition$Vertical
            /* renamed from: position-JVtK1S4, reason: not valid java name */
            public final int mo564positionJVtK1S4(IntRect intRect, long j2, int i) {
                int align = this.anchorAlignment.align(0, intRect.getHeight());
                return intRect.top + align + (-this.menuAlignment.align(0, i)) + this.offset;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Vertical(menuAlignment=");
                sb.append(this.menuAlignment);
                sb.append(", anchorAlignment=");
                sb.append(this.anchorAlignment);
                sb.append(", offset=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.offset, ')');
            }
        };
        this.bottomToAnchorTop = new MenuPosition$Vertical(vertical2, vertical, mo230roundToPx0680j_43) { // from class: androidx.compose.material3.internal.AnchorAlignmentOffsetPosition$Vertical
            public final BiasAlignment.Vertical anchorAlignment;
            public final BiasAlignment.Vertical menuAlignment;
            public final int offset;

            {
                this.menuAlignment = vertical2;
                this.anchorAlignment = vertical;
                this.offset = mo230roundToPx0680j_43;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AnchorAlignmentOffsetPosition$Vertical)) {
                    return false;
                }
                AnchorAlignmentOffsetPosition$Vertical anchorAlignmentOffsetPosition$Vertical = (AnchorAlignmentOffsetPosition$Vertical) obj;
                return this.menuAlignment.equals(anchorAlignmentOffsetPosition$Vertical.menuAlignment) && this.anchorAlignment.equals(anchorAlignmentOffsetPosition$Vertical.anchorAlignment) && this.offset == anchorAlignmentOffsetPosition$Vertical.offset;
            }

            public final int hashCode() {
                return Integer.hashCode(this.offset) + CameraState$Type$EnumUnboxingLocalUtility.m(this.anchorAlignment.bias, Float.hashCode(this.menuAlignment.bias) * 31, 31);
            }

            @Override // androidx.compose.material3.internal.MenuPosition$Vertical
            /* renamed from: position-JVtK1S4, reason: not valid java name */
            public final int mo564positionJVtK1S4(IntRect intRect, long j2, int i) {
                int align = this.anchorAlignment.align(0, intRect.getHeight());
                return intRect.top + align + (-this.menuAlignment.align(0, i)) + this.offset;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Vertical(menuAlignment=");
                sb.append(this.menuAlignment);
                sb.append(", anchorAlignment=");
                sb.append(this.anchorAlignment);
                sb.append(", offset=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.offset, ')');
            }
        };
        final BiasAlignment.Vertical vertical3 = Alignment.Companion.CenterVertically;
        this.centerToAnchorTop = new MenuPosition$Vertical(vertical3, vertical, mo230roundToPx0680j_43) { // from class: androidx.compose.material3.internal.AnchorAlignmentOffsetPosition$Vertical
            public final BiasAlignment.Vertical anchorAlignment;
            public final BiasAlignment.Vertical menuAlignment;
            public final int offset;

            {
                this.menuAlignment = vertical3;
                this.anchorAlignment = vertical;
                this.offset = mo230roundToPx0680j_43;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AnchorAlignmentOffsetPosition$Vertical)) {
                    return false;
                }
                AnchorAlignmentOffsetPosition$Vertical anchorAlignmentOffsetPosition$Vertical = (AnchorAlignmentOffsetPosition$Vertical) obj;
                return this.menuAlignment.equals(anchorAlignmentOffsetPosition$Vertical.menuAlignment) && this.anchorAlignment.equals(anchorAlignmentOffsetPosition$Vertical.anchorAlignment) && this.offset == anchorAlignmentOffsetPosition$Vertical.offset;
            }

            public final int hashCode() {
                return Integer.hashCode(this.offset) + CameraState$Type$EnumUnboxingLocalUtility.m(this.anchorAlignment.bias, Float.hashCode(this.menuAlignment.bias) * 31, 31);
            }

            @Override // androidx.compose.material3.internal.MenuPosition$Vertical
            /* renamed from: position-JVtK1S4, reason: not valid java name */
            public final int mo564positionJVtK1S4(IntRect intRect, long j2, int i) {
                int align = this.anchorAlignment.align(0, intRect.getHeight());
                return intRect.top + align + (-this.menuAlignment.align(0, i)) + this.offset;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Vertical(menuAlignment=");
                sb.append(this.menuAlignment);
                sb.append(", anchorAlignment=");
                sb.append(this.anchorAlignment);
                sb.append(", offset=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.offset, ')');
            }
        };
        this.topToWindowTop = new MenuPosition$Vertical(vertical, mo230roundToPx0680j_4) { // from class: androidx.compose.material3.internal.WindowAlignmentMarginPosition$Vertical
            public final BiasAlignment.Vertical alignment;
            public final int margin;

            {
                this.alignment = vertical;
                this.margin = mo230roundToPx0680j_4;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof WindowAlignmentMarginPosition$Vertical)) {
                    return false;
                }
                WindowAlignmentMarginPosition$Vertical windowAlignmentMarginPosition$Vertical = (WindowAlignmentMarginPosition$Vertical) obj;
                return this.alignment.equals(windowAlignmentMarginPosition$Vertical.alignment) && this.margin == windowAlignmentMarginPosition$Vertical.margin;
            }

            public final int hashCode() {
                return Integer.hashCode(this.margin) + (Float.hashCode(this.alignment.bias) * 31);
            }

            @Override // androidx.compose.material3.internal.MenuPosition$Vertical
            /* renamed from: position-JVtK1S4 */
            public final int mo564positionJVtK1S4(IntRect intRect, long j2, int i) {
                int i2 = (int) (j2 & BodyPartID.bodyIdMax);
                int i3 = this.margin;
                return i >= i2 - (i3 * 2) ? Recorder$$ExternalSyntheticOutline2.m(i2 - i, 2.0f, 1.0f) : RangesKt___RangesKt.coerceIn(this.alignment.align(i, i2), i3, (i2 - i3) - i);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Vertical(alignment=");
                sb.append(this.alignment);
                sb.append(", margin=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.margin, ')');
            }
        };
        this.bottomToWindowBottom = new MenuPosition$Vertical(vertical2, mo230roundToPx0680j_4) { // from class: androidx.compose.material3.internal.WindowAlignmentMarginPosition$Vertical
            public final BiasAlignment.Vertical alignment;
            public final int margin;

            {
                this.alignment = vertical2;
                this.margin = mo230roundToPx0680j_4;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof WindowAlignmentMarginPosition$Vertical)) {
                    return false;
                }
                WindowAlignmentMarginPosition$Vertical windowAlignmentMarginPosition$Vertical = (WindowAlignmentMarginPosition$Vertical) obj;
                return this.alignment.equals(windowAlignmentMarginPosition$Vertical.alignment) && this.margin == windowAlignmentMarginPosition$Vertical.margin;
            }

            public final int hashCode() {
                return Integer.hashCode(this.margin) + (Float.hashCode(this.alignment.bias) * 31);
            }

            @Override // androidx.compose.material3.internal.MenuPosition$Vertical
            /* renamed from: position-JVtK1S4 */
            public final int mo564positionJVtK1S4(IntRect intRect, long j2, int i) {
                int i2 = (int) (j2 & BodyPartID.bodyIdMax);
                int i3 = this.margin;
                return i >= i2 - (i3 * 2) ? Recorder$$ExternalSyntheticOutline2.m(i2 - i, 2.0f, 1.0f) : RangesKt___RangesKt.coerceIn(this.alignment.align(i, i2), i3, (i2 - i3) - i);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Vertical(alignment=");
                sb.append(this.alignment);
                sb.append(", margin=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.margin, ')');
            }
        };
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public final long mo190calculatePositionllwVHH4(IntRect intRect, long j, LayoutDirection layoutDirection, long j2) {
        IntRect intRect2;
        long j3;
        char c;
        int i;
        int i2;
        int i3;
        char c2 = ' ';
        int i4 = (int) (j >> 32);
        boolean z = true;
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new MenuPosition$Horizontal[]{this.startToAnchorStart, this.endToAnchorEnd, ((int) (intRect.m1051getCenternOccac() >> 32)) < i4 / 2 ? this.leftToWindowLeft : this.rightToWindowRight});
        int size = listOf.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                intRect2 = intRect;
                j3 = j;
                c = c2;
                i = 0;
                break;
            }
            MenuPosition$Horizontal menuPosition$Horizontal = (MenuPosition$Horizontal) listOf.get(i5);
            int i6 = (int) (j2 >> c2);
            int i7 = size;
            c = c2;
            j3 = j;
            int i8 = i5;
            intRect2 = intRect;
            i = menuPosition$Horizontal.mo563position95KtPRI(intRect2, j3, i6, layoutDirection);
            if (i8 == listOf.size() - 1 || (i >= 0 && i6 + i <= i4)) {
                break;
            }
            i5 = i8 + 1;
            size = i7;
            c2 = c;
        }
        int m1051getCenternOccac = (int) (intRect2.m1051getCenternOccac() & BodyPartID.bodyIdMax);
        int i9 = (int) (j3 & BodyPartID.bodyIdMax);
        List listOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new MenuPosition$Vertical[]{this.topToAnchorBottom, this.bottomToAnchorTop, this.centerToAnchorTop, m1051getCenternOccac < i9 / 2 ? this.topToWindowTop : this.bottomToWindowBottom});
        int size2 = listOf2.size();
        int i10 = 0;
        while (i10 < size2) {
            MenuPosition$Vertical menuPosition$Vertical = (MenuPosition$Vertical) listOf2.get(i10);
            boolean z2 = z;
            int i11 = (int) (j2 & BodyPartID.bodyIdMax);
            int mo564positionJVtK1S4 = menuPosition$Vertical.mo564positionJVtK1S4(intRect2, j3, i11);
            if (i10 == listOf2.size() - 1 || (mo564positionJVtK1S4 >= (i3 = this.verticalMargin) && i11 + mo564positionJVtK1S4 <= i9 - i3)) {
                i2 = mo564positionJVtK1S4;
                break;
            }
            i10++;
            z = z2;
        }
        i2 = 0;
        long j4 = (i << c) | (i2 & BodyPartID.bodyIdMax);
        this.onPositionCalculated.invoke(intRect2, IntRectKt.m1053IntRectVbeCjmY(j4, j2));
        return j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DropdownMenuPositionProvider) {
            DropdownMenuPositionProvider dropdownMenuPositionProvider = (DropdownMenuPositionProvider) obj;
            if (this.contentOffset == dropdownMenuPositionProvider.contentOffset && Intrinsics.areEqual(this.density, dropdownMenuPositionProvider.density) && this.verticalMargin == dropdownMenuPositionProvider.verticalMargin && Intrinsics.areEqual(this.onPositionCalculated, dropdownMenuPositionProvider.onPositionCalculated)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.onPositionCalculated.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.verticalMargin, (this.density.hashCode() + (Long.hashCode(this.contentOffset) * 31)) * 31, 31);
    }

    public final String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) DpOffset.m1041toStringimpl(this.contentOffset)) + ", density=" + this.density + ", verticalMargin=" + this.verticalMargin + ", onPositionCalculated=" + this.onPositionCalculated + ')';
    }
}
