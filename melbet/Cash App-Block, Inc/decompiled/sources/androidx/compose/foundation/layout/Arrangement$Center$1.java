package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class Arrangement$Center$1 implements Arrangement$Horizontal, Arrangement$Vertical {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Arrangement$Center$1(int i) {
        this.$r8$classId = i;
    }

    @Override // androidx.compose.foundation.layout.Arrangement$Horizontal
    public final void arrange(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
        switch (this.$r8$classId) {
            case 0:
                if (layoutDirection != LayoutDirection.Ltr) {
                    SpacerKt.placeCenter$foundation_layout(i, iArr, iArr2, true);
                    break;
                } else {
                    SpacerKt.placeCenter$foundation_layout(i, iArr, iArr2, false);
                    break;
                }
            case 1:
                if (layoutDirection != LayoutDirection.Ltr) {
                    SpacerKt.placeSpaceAround$foundation_layout(i, iArr, iArr2, true);
                    break;
                } else {
                    SpacerKt.placeSpaceAround$foundation_layout(i, iArr, iArr2, false);
                    break;
                }
            case 2:
                if (layoutDirection != LayoutDirection.Ltr) {
                    SpacerKt.placeSpaceBetween$foundation_layout(i, iArr, iArr2, true);
                    break;
                } else {
                    SpacerKt.placeSpaceBetween$foundation_layout(i, iArr, iArr2, false);
                    break;
                }
            default:
                if (layoutDirection != LayoutDirection.Ltr) {
                    SpacerKt.placeSpaceEvenly$foundation_layout(i, iArr, iArr2, true);
                    break;
                } else {
                    SpacerKt.placeSpaceEvenly$foundation_layout(i, iArr, iArr2, false);
                    break;
                }
        }
    }

    @Override // androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical
    /* renamed from: getSpacing-D9Ej5fM, reason: not valid java name */
    public final float mo252getSpacingD9Ej5fM() {
        switch (this.$r8$classId) {
        }
        return RecyclerView.DECELERATION_RATE;
    }

    public final String toString() {
        switch (this.$r8$classId) {
            case 0:
                return "Arrangement#Center";
            case 1:
                return "Arrangement#SpaceAround";
            case 2:
                return "Arrangement#SpaceBetween";
            default:
                return "Arrangement#SpaceEvenly";
        }
    }

    @Override // androidx.compose.foundation.layout.Arrangement$Vertical
    public final void arrange(Density density, int i, int[] iArr, int[] iArr2) {
        switch (this.$r8$classId) {
            case 0:
                SpacerKt.placeCenter$foundation_layout(i, iArr, iArr2, false);
                break;
            case 1:
                SpacerKt.placeSpaceAround$foundation_layout(i, iArr, iArr2, false);
                break;
            case 2:
                SpacerKt.placeSpaceBetween$foundation_layout(i, iArr, iArr2, false);
                break;
            default:
                SpacerKt.placeSpaceEvenly$foundation_layout(i, iArr, iArr2, false);
                break;
        }
    }
}
