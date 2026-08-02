package com.squareup.cash.family.familyhub.views;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Outline$Rectangle;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public final class CardTuckShape implements Shape {
    public final float bottomPx;

    public CardTuckShape(float f) {
        this.bottomPx = f;
    }

    @Override // androidx.compose.ui.graphics.Shape
    /* renamed from: createOutline-Pq9zytI */
    public final ColorKt mo175createOutlinePq9zytI(long j, LayoutDirection layoutDirection, Density density) {
        layoutDirection.getClass();
        density.getClass();
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax));
        float f = this.bottomPx;
        if (f <= intBitsToFloat2) {
            intBitsToFloat2 = f;
        }
        return new Outline$Rectangle(new Rect(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, intBitsToFloat, intBitsToFloat2));
    }
}
