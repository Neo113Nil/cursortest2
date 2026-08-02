package androidx.compose.foundation.shape;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Outline$Rectangle;
import androidx.compose.ui.graphics.Outline$Rounded;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import com.squareup.util.Strings;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class AbsoluteRoundedCornerShape extends CornerBasedShape {
    @Override // androidx.compose.foundation.shape.CornerBasedShape
    public final CornerBasedShape copy(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        return new AbsoluteRoundedCornerShape(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    /* renamed from: createOutline-LjSzlW0, reason: not valid java name */
    public final ColorKt mo338createOutlineLjSzlW0(long j, float f, float f2, float f3, float f4, LayoutDirection layoutDirection) {
        if (f + f2 + f3 + f4 == RecyclerView.DECELERATION_RATE) {
            return new Outline$Rectangle(DBUtil.m1180Recttz77jQw(0L, j));
        }
        return new Outline$Rounded(Strings.m3986RoundRectZAM2FJo(DBUtil.m1180Recttz77jQw(0L, j), (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f2) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f3) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(f4) & BodyPartID.bodyIdMax)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbsoluteRoundedCornerShape)) {
            return false;
        }
        AbsoluteRoundedCornerShape absoluteRoundedCornerShape = (AbsoluteRoundedCornerShape) obj;
        return Intrinsics.areEqual(this.topStart, absoluteRoundedCornerShape.topStart) && Intrinsics.areEqual(this.topEnd, absoluteRoundedCornerShape.topEnd) && Intrinsics.areEqual(this.bottomEnd, absoluteRoundedCornerShape.bottomEnd) && Intrinsics.areEqual(this.bottomStart, absoluteRoundedCornerShape.bottomStart);
    }

    public final int hashCode() {
        return this.bottomStart.hashCode() + ((this.bottomEnd.hashCode() + ((this.topEnd.hashCode() + (this.topStart.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AbsoluteRoundedCornerShape(topLeft = " + this.topStart + ", topRight = " + this.topEnd + ", bottomRight = " + this.bottomEnd + ", bottomLeft = " + this.bottomStart + ')';
    }
}
