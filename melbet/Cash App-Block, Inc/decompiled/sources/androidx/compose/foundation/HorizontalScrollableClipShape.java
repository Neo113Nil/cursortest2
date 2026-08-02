package androidx.compose.foundation;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Outline$Rectangle;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class HorizontalScrollableClipShape implements Shape {
    public static final HorizontalScrollableClipShape INSTANCE = new HorizontalScrollableClipShape();

    @Override // androidx.compose.ui.graphics.Shape
    /* renamed from: createOutline-Pq9zytI, reason: not valid java name */
    public final ColorKt mo175createOutlinePq9zytI(long j, LayoutDirection layoutDirection, Density density) {
        float mo230roundToPx0680j_4 = density.mo230roundToPx0680j_4(30.0f);
        return new Outline$Rectangle(new Rect(RecyclerView.DECELERATION_RATE, -mo230roundToPx0680j_4, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)) + mo230roundToPx0680j_4));
    }
}
