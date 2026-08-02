package androidx.compose.foundation;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Outline$Rectangle;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class VerticalScrollableClipShape implements Shape {
    public static final VerticalScrollableClipShape INSTANCE = new VerticalScrollableClipShape();

    @Override // androidx.compose.ui.graphics.Shape
    /* renamed from: createOutline-Pq9zytI */
    public final ColorKt mo175createOutlinePq9zytI(long j, LayoutDirection layoutDirection, Density density) {
        float mo230roundToPx0680j_4 = density.mo230roundToPx0680j_4(30.0f);
        return new Outline$Rectangle(new Rect(-mo230roundToPx0680j_4, RecyclerView.DECELERATION_RATE, Float.intBitsToFloat((int) (j >> 32)) + mo230roundToPx0680j_4, Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax))));
    }
}
