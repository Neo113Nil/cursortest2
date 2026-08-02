package androidx.compose.material;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import java.util.Iterator;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class DropdownMenuPositionProvider implements PopupPositionProvider {
    public final long contentOffset;
    public final Density density;
    public final Function2 onPositionCalculated;

    public DropdownMenuPositionProvider(long j, Density density, Function2 function2) {
        this.contentOffset = j;
        this.density = density;
        this.onPositionCalculated = function2;
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public final long mo190calculatePositionllwVHH4(IntRect intRect, long j, LayoutDirection layoutDirection, long j2) {
        Sequence asSequence;
        Object obj;
        Object obj2;
        Density density = this.density;
        int mo230roundToPx0680j_4 = density.mo230roundToPx0680j_4(48.0f);
        long j3 = this.contentOffset;
        int mo230roundToPx0680j_42 = density.mo230roundToPx0680j_4(DpOffset.m1039getXD9Ej5fM(j3));
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        int i = mo230roundToPx0680j_42 * (layoutDirection == layoutDirection2 ? 1 : -1);
        int mo230roundToPx0680j_43 = density.mo230roundToPx0680j_4(DpOffset.m1040getYD9Ej5fM(j3));
        int i2 = intRect.left;
        int i3 = intRect.right;
        int i4 = i2 + i;
        int i5 = (int) (j2 >> 32);
        int i6 = (i3 - i5) + i;
        int i7 = (int) (j >> 32);
        int i8 = i7 - i5;
        if (layoutDirection == layoutDirection2) {
            Integer valueOf = Integer.valueOf(i4);
            Integer valueOf2 = Integer.valueOf(i6);
            if (intRect.left < 0) {
                i8 = 0;
            }
            asSequence = ArraysKt___ArraysKt.asSequence(new Integer[]{valueOf, valueOf2, Integer.valueOf(i8)});
        } else {
            Integer valueOf3 = Integer.valueOf(i6);
            Integer valueOf4 = Integer.valueOf(i4);
            if (i3 <= i7) {
                i8 = 0;
            }
            asSequence = ArraysKt___ArraysKt.asSequence(new Integer[]{valueOf3, valueOf4, Integer.valueOf(i8)});
        }
        Iterator it = asSequence.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            int intValue = ((Number) obj2).intValue();
            if (intValue >= 0 && intValue + i5 <= i7) {
                break;
            }
        }
        Integer num = (Integer) obj2;
        if (num != null) {
            i6 = num.intValue();
        }
        int max = Math.max(intRect.bottom + mo230roundToPx0680j_43, mo230roundToPx0680j_4);
        int i9 = intRect.top;
        int i10 = (int) (j2 & BodyPartID.bodyIdMax);
        int i11 = (i9 - i10) + mo230roundToPx0680j_43;
        int i12 = (i9 - (i10 / 2)) + mo230roundToPx0680j_43;
        int i13 = (int) (j & BodyPartID.bodyIdMax);
        Iterator it2 = ArraysKt___ArraysKt.asSequence(new Integer[]{Integer.valueOf(max), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((i13 - i10) - mo230roundToPx0680j_4)}).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            int intValue2 = ((Number) next).intValue();
            if (intValue2 >= mo230roundToPx0680j_4 && intValue2 + i10 <= i13 - mo230roundToPx0680j_4) {
                obj = next;
                break;
            }
        }
        Integer num2 = (Integer) obj;
        if (num2 != null) {
            i11 = num2.intValue();
        }
        this.onPositionCalculated.invoke(intRect, new IntRect(i6, i11, i5 + i6, i10 + i11));
        return (i6 << 32) | (i11 & BodyPartID.bodyIdMax);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DropdownMenuPositionProvider) {
            DropdownMenuPositionProvider dropdownMenuPositionProvider = (DropdownMenuPositionProvider) obj;
            if (this.contentOffset == dropdownMenuPositionProvider.contentOffset && Intrinsics.areEqual(this.density, dropdownMenuPositionProvider.density) && Intrinsics.areEqual(this.onPositionCalculated, dropdownMenuPositionProvider.onPositionCalculated)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.onPositionCalculated.hashCode() + ((this.density.hashCode() + (Long.hashCode(this.contentOffset) * 31)) * 31);
    }

    public final String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) DpOffset.m1041toStringimpl(this.contentOffset)) + ", density=" + this.density + ", onPositionCalculated=" + this.onPositionCalculated + ')';
    }
}
