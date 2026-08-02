package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Outline$Rounded;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.room.util.DBUtil;
import com.squareup.util.Strings;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class CircleShape implements Shape {
    public static final CircleShape INSTANCE = new CircleShape();

    @Override // androidx.compose.ui.graphics.Shape
    /* renamed from: createOutline-Pq9zytI */
    public final ColorKt mo175createOutlinePq9zytI(long j, LayoutDirection layoutDirection, Density density) {
        float m642getMinDimensionimpl = Size.m642getMinDimensionimpl(j) / 2.0f;
        long floatToRawIntBits = (Float.floatToRawIntBits(m642getMinDimensionimpl) << 32) | (Float.floatToRawIntBits(m642getMinDimensionimpl) & BodyPartID.bodyIdMax);
        return new Outline$Rounded(Strings.m3986RoundRectZAM2FJo(DBUtil.m1180Recttz77jQw(0L, j), floatToRawIntBits, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits));
    }
}
