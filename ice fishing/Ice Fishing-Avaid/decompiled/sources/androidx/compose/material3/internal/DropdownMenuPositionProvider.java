package androidx.compose.material3.internal;

import androidx.autofill.HintConstants;
import androidx.compose.material3.MenuKt;
import androidx.compose.material3.internal.MenuPosition;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MenuPosition.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u00128\b\u0002\u0010\t\u001a2\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\n¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010(\u001a\u00020)2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020+H\u0016¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b2\u0010\u0014J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0007HÆ\u0003J\t\u00105\u001a\u00020\u0007HÆ\u0003J9\u00106\u001a2\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\nHÆ\u0003Jr\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u000728\b\u0002\u0010\t\u001a2\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\nHÆ\u0001¢\u0006\u0004\b8\u00109J\u0014\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010=HÖ\u0083\u0004J\n\u0010>\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010?\u001a\u00020@HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019RA\u0010\t\u001a2\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006A"}, d2 = {"Landroidx/compose/material3/internal/DropdownMenuPositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "contentOffset", "Landroidx/compose/ui/unit/DpOffset;", "density", "Landroidx/compose/ui/unit/Density;", "verticalMargin", "", "horizontalMargin", "onPositionCalculated", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/IntRect;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "anchorBounds", "menuBounds", "", "<init>", "(JLandroidx/compose/ui/unit/Density;IILkotlin/jvm/functions/Function2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getContentOffset-RKDOV3M", "()J", "J", "getDensity", "()Landroidx/compose/ui/unit/Density;", "getVerticalMargin", "()I", "getHorizontalMargin", "getOnPositionCalculated", "()Lkotlin/jvm/functions/Function2;", "startToAnchorStart", "Landroidx/compose/material3/internal/MenuPosition$Horizontal;", "endToAnchorEnd", "leftToWindowLeft", "rightToWindowRight", "topToAnchorBottom", "Landroidx/compose/material3/internal/MenuPosition$Vertical;", "bottomToAnchorTop", "centerToAnchorTop", "topToWindowTop", "bottomToWindowBottom", "calculatePosition", "Landroidx/compose/ui/unit/IntOffset;", "windowSize", "Landroidx/compose/ui/unit/IntSize;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "popupContentSize", "calculatePosition-llwVHH4", "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "component1", "component1-RKDOV3M", "component2", "component3", "component4", "component5", "copy", "copy-_0NXZrk", "(JLandroidx/compose/ui/unit/Density;IILkotlin/jvm/functions/Function2;)Landroidx/compose/material3/internal/DropdownMenuPositionProvider;", "equals", "", "other", "", "hashCode", "toString", "", "material3"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final /* data */ class DropdownMenuPositionProvider implements PopupPositionProvider {
    public static final int $stable = 0;
    private final MenuPosition.Vertical bottomToAnchorTop;
    private final MenuPosition.Vertical bottomToWindowBottom;
    private final MenuPosition.Vertical centerToAnchorTop;
    private final long contentOffset;
    private final Density density;
    private final MenuPosition.Horizontal endToAnchorEnd;
    private final int horizontalMargin;
    private final MenuPosition.Horizontal leftToWindowLeft;
    private final Function2<IntRect, IntRect, Unit> onPositionCalculated;
    private final MenuPosition.Horizontal rightToWindowRight;
    private final MenuPosition.Horizontal startToAnchorStart;
    private final MenuPosition.Vertical topToAnchorBottom;
    private final MenuPosition.Vertical topToWindowTop;
    private final int verticalMargin;

    public /* synthetic */ DropdownMenuPositionProvider(long j, Density density, int i, int i2, Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, density, i, i2, function2);
    }

    /* renamed from: copy-_0NXZrk$default, reason: not valid java name */
    public static /* synthetic */ DropdownMenuPositionProvider m4786copy_0NXZrk$default(DropdownMenuPositionProvider dropdownMenuPositionProvider, long j, Density density, int i, int i2, Function2 function2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = dropdownMenuPositionProvider.contentOffset;
        }
        long j2 = j;
        if ((i3 & 2) != 0) {
            density = dropdownMenuPositionProvider.density;
        }
        Density density2 = density;
        if ((i3 & 4) != 0) {
            i = dropdownMenuPositionProvider.verticalMargin;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = dropdownMenuPositionProvider.horizontalMargin;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            function2 = dropdownMenuPositionProvider.onPositionCalculated;
        }
        return dropdownMenuPositionProvider.m4788copy_0NXZrk(j2, density2, i4, i5, function2);
    }

    /* renamed from: component1-RKDOV3M, reason: not valid java name and from getter */
    public final long getContentOffset() {
        return this.contentOffset;
    }

    /* renamed from: component2, reason: from getter */
    public final Density getDensity() {
        return this.density;
    }

    /* renamed from: component3, reason: from getter */
    public final int getVerticalMargin() {
        return this.verticalMargin;
    }

    /* renamed from: component4, reason: from getter */
    public final int getHorizontalMargin() {
        return this.horizontalMargin;
    }

    public final Function2<IntRect, IntRect, Unit> component5() {
        return this.onPositionCalculated;
    }

    /* renamed from: copy-_0NXZrk, reason: not valid java name */
    public final DropdownMenuPositionProvider m4788copy_0NXZrk(long contentOffset, Density density, int verticalMargin, int horizontalMargin, Function2<? super IntRect, ? super IntRect, Unit> onPositionCalculated) {
        return new DropdownMenuPositionProvider(contentOffset, density, verticalMargin, horizontalMargin, onPositionCalculated, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DropdownMenuPositionProvider)) {
            return false;
        }
        DropdownMenuPositionProvider dropdownMenuPositionProvider = (DropdownMenuPositionProvider) other;
        return DpOffset.m9792equalsimpl0(this.contentOffset, dropdownMenuPositionProvider.contentOffset) && Intrinsics.areEqual(this.density, dropdownMenuPositionProvider.density) && this.verticalMargin == dropdownMenuPositionProvider.verticalMargin && this.horizontalMargin == dropdownMenuPositionProvider.horizontalMargin && Intrinsics.areEqual(this.onPositionCalculated, dropdownMenuPositionProvider.onPositionCalculated);
    }

    public int hashCode() {
        return (((((((DpOffset.m9797hashCodeimpl(this.contentOffset) * 31) + this.density.hashCode()) * 31) + this.verticalMargin) * 31) + this.horizontalMargin) * 31) + this.onPositionCalculated.hashCode();
    }

    public String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) DpOffset.m9800toStringimpl(this.contentOffset)) + ", density=" + this.density + ", verticalMargin=" + this.verticalMargin + ", horizontalMargin=" + this.horizontalMargin + ", onPositionCalculated=" + this.onPositionCalculated + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    private DropdownMenuPositionProvider(long j, Density density, int i, int i2, Function2<? super IntRect, ? super IntRect, Unit> function2) {
        this.contentOffset = j;
        this.density = density;
        this.verticalMargin = i;
        this.horizontalMargin = i2;
        this.onPositionCalculated = function2;
        int mo522roundToPx0680j_4 = density.mo522roundToPx0680j_4(DpOffset.m9793getXD9Ej5fM(j));
        this.startToAnchorStart = MenuPosition.INSTANCE.startToAnchorStart(mo522roundToPx0680j_4);
        this.endToAnchorEnd = MenuPosition.INSTANCE.endToAnchorEnd(mo522roundToPx0680j_4);
        this.leftToWindowLeft = MenuPosition.INSTANCE.leftToWindowLeft(i2);
        this.rightToWindowRight = MenuPosition.INSTANCE.rightToWindowRight(i2);
        int mo522roundToPx0680j_42 = density.mo522roundToPx0680j_4(DpOffset.m9795getYD9Ej5fM(j));
        this.topToAnchorBottom = MenuPosition.INSTANCE.topToAnchorBottom(mo522roundToPx0680j_42);
        this.bottomToAnchorTop = MenuPosition.INSTANCE.bottomToAnchorTop(mo522roundToPx0680j_42);
        this.centerToAnchorTop = MenuPosition.INSTANCE.centerToAnchorTop(mo522roundToPx0680j_42);
        this.topToWindowTop = MenuPosition.INSTANCE.topToWindowTop(i);
        this.bottomToWindowBottom = MenuPosition.INSTANCE.bottomToWindowBottom(i);
    }

    /* renamed from: getContentOffset-RKDOV3M, reason: not valid java name */
    public final long m4789getContentOffsetRKDOV3M() {
        return this.contentOffset;
    }

    public final Density getDensity() {
        return this.density;
    }

    public /* synthetic */ DropdownMenuPositionProvider(long j, Density density, int i, int i2, Function2 function2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, density, (i3 & 4) != 0 ? density.mo522roundToPx0680j_4(MenuKt.getMenuVerticalMargin()) : i, (i3 & 8) != 0 ? density.mo522roundToPx0680j_4(MenuKt.getMenuHorizontalMargin()) : i2, (i3 & 16) != 0 ? new Function2() { // from class: androidx.compose.material3.internal.DropdownMenuPositionProvider$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit _init_$lambda$2;
                _init_$lambda$2 = DropdownMenuPositionProvider._init_$lambda$2((IntRect) obj, (IntRect) obj2);
                return _init_$lambda$2;
            }
        } : function2, null);
    }

    public final int getVerticalMargin() {
        return this.verticalMargin;
    }

    public final int getHorizontalMargin() {
        return this.horizontalMargin;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$2(IntRect intRect, IntRect intRect2) {
        return Unit.INSTANCE;
    }

    public final Function2<IntRect, IntRect, Unit> getOnPositionCalculated() {
        return this.onPositionCalculated;
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo490calculatePositionllwVHH4(IntRect anchorBounds, long windowSize, LayoutDirection layoutDirection, long popupContentSize) {
        MenuPosition.Horizontal horizontal;
        IntRect intRect;
        long j;
        char c;
        int i;
        MenuPosition.Vertical vertical;
        int i2;
        int i3;
        int i4;
        char c2 = 3;
        MenuPosition.Horizontal[] horizontalArr = new MenuPosition.Horizontal[3];
        horizontalArr[0] = this.startToAnchorStart;
        horizontalArr[1] = this.endToAnchorEnd;
        int i5 = (int) (windowSize >> 32);
        if (IntOffset.m9864getXimpl(anchorBounds.m9888getCenternOccac()) < i5 / 2) {
            horizontal = this.leftToWindowLeft;
        } else {
            horizontal = this.rightToWindowRight;
        }
        horizontalArr[2] = horizontal;
        List listOf = CollectionsKt.listOf((Object[]) horizontalArr);
        int size = listOf.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                intRect = anchorBounds;
                j = windowSize;
                c = c2;
                i = 0;
                break;
            }
            MenuPosition.Horizontal horizontal2 = (MenuPosition.Horizontal) listOf.get(i6);
            int i7 = (int) (popupContentSize >> 32);
            int i8 = size;
            c = c2;
            j = windowSize;
            int i9 = i6;
            intRect = anchorBounds;
            i = horizontal2.mo4693position95KtPRI(intRect, j, i7, layoutDirection);
            if (i9 == CollectionsKt.getLastIndex(listOf) || (i >= (i4 = this.horizontalMargin) && i7 + i <= i5 - i4)) {
                break;
            }
            i6 = i9 + 1;
            size = i8;
            c2 = c;
        }
        MenuPosition.Vertical[] verticalArr = new MenuPosition.Vertical[4];
        verticalArr[0] = this.topToAnchorBottom;
        verticalArr[1] = this.bottomToAnchorTop;
        verticalArr[2] = this.centerToAnchorTop;
        int i10 = (int) (j & 4294967295L);
        if (IntOffset.m9865getYimpl(intRect.m9888getCenternOccac()) < i10 / 2) {
            vertical = this.topToWindowTop;
        } else {
            vertical = this.bottomToWindowBottom;
        }
        verticalArr[c] = vertical;
        List listOf2 = CollectionsKt.listOf((Object[]) verticalArr);
        int size2 = listOf2.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size2) {
                i2 = 0;
                break;
            }
            int i12 = i10;
            int i13 = (int) (popupContentSize & 4294967295L);
            i2 = ((MenuPosition.Vertical) listOf2.get(i11)).mo4694positionJVtK1S4(intRect, j, i13);
            if (i11 == CollectionsKt.getLastIndex(listOf2) || (i2 >= (i3 = this.verticalMargin) && i13 + i2 <= i12 - i3)) {
                break;
            }
            i11++;
            i10 = i12;
        }
        long m9858constructorimpl = IntOffset.m9858constructorimpl((i << 32) | (i2 & 4294967295L));
        this.onPositionCalculated.invoke(intRect, IntRectKt.m9897IntRectVbeCjmY(m9858constructorimpl, popupContentSize));
        return m9858constructorimpl;
    }
}
