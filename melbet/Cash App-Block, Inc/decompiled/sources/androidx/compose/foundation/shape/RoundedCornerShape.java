package androidx.compose.foundation.shape;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Outline$Rectangle;
import androidx.compose.ui.graphics.Outline$Rounded;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import com.squareup.util.Strings;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class RoundedCornerShape extends CornerBasedShape {
    @Override // androidx.compose.foundation.shape.CornerBasedShape
    public final CornerBasedShape copy(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        return new RoundedCornerShape(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    /* renamed from: createOutline-LjSzlW0 */
    public final ColorKt mo338createOutlineLjSzlW0(long j, float f, float f2, float f3, float f4, LayoutDirection layoutDirection) {
        if (f + f2 + f3 + f4 == RecyclerView.DECELERATION_RATE) {
            return new Outline$Rectangle(DBUtil.m1180Recttz77jQw(0L, j));
        }
        Rect m1180Recttz77jQw = DBUtil.m1180Recttz77jQw(0L, j);
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        float f5 = layoutDirection == layoutDirection2 ? f : f2;
        long floatToRawIntBits = (Float.floatToRawIntBits(f5) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f5) << 32);
        float f6 = layoutDirection == layoutDirection2 ? f2 : f;
        long floatToRawIntBits2 = (Float.floatToRawIntBits(f6) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f6) << 32);
        float f7 = layoutDirection == layoutDirection2 ? f3 : f4;
        long floatToRawIntBits3 = (Float.floatToRawIntBits(f7) << 32) | (Float.floatToRawIntBits(f7) & BodyPartID.bodyIdMax);
        float f8 = layoutDirection == layoutDirection2 ? f4 : f3;
        return new Outline$Rounded(Strings.m3986RoundRectZAM2FJo(m1180Recttz77jQw, floatToRawIntBits, floatToRawIntBits2, floatToRawIntBits3, (Float.floatToRawIntBits(f8) << 32) | (Float.floatToRawIntBits(f8) & BodyPartID.bodyIdMax)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoundedCornerShape)) {
            return false;
        }
        RoundedCornerShape roundedCornerShape = (RoundedCornerShape) obj;
        return Intrinsics.areEqual(this.topStart, roundedCornerShape.topStart) && Intrinsics.areEqual(this.topEnd, roundedCornerShape.topEnd) && Intrinsics.areEqual(this.bottomEnd, roundedCornerShape.bottomEnd) && Intrinsics.areEqual(this.bottomStart, roundedCornerShape.bottomStart);
    }

    public final int hashCode() {
        return this.bottomStart.hashCode() + ((this.bottomEnd.hashCode() + ((this.topEnd.hashCode() + (this.topStart.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.topStart + ", topEnd = " + this.topEnd + ", bottomEnd = " + this.bottomEnd + ", bottomStart = " + this.bottomStart + ')';
    }
}
