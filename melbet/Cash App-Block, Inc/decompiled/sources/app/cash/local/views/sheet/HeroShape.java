package app.cash.local.views.sheet;

import android.graphics.Path;
import android.graphics.RectF;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Outline$Generic;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class HeroShape implements Shape {
    @Override // androidx.compose.ui.graphics.Shape
    /* renamed from: createOutline-Pq9zytI */
    public final ColorKt mo175createOutlinePq9zytI(long j, LayoutDirection layoutDirection, Density density) {
        layoutDirection.getClass();
        density.getClass();
        float mo236toPx0680j_4 = density.mo236toPx0680j_4(12.0f);
        float mo236toPx0680j_42 = density.mo236toPx0680j_4(40.0f);
        float mo236toPx0680j_43 = density.mo236toPx0680j_4(60.0f);
        AndroidPath Path = AndroidPath_androidKt.Path();
        Path path = Path.internalPath;
        Path.moveTo(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
        int i = (int) (j >> 32);
        Path.lineTo(Float.intBitsToFloat(i), RecyclerView.DECELERATION_RATE);
        float f = 2.0f * mo236toPx0680j_4;
        float intBitsToFloat = Float.intBitsToFloat(i) - f;
        float intBitsToFloat2 = Float.intBitsToFloat(i);
        if (Path.rectF == null) {
            Path.rectF = new RectF();
        }
        RectF rectF = Path.rectF;
        rectF.getClass();
        rectF.set(intBitsToFloat, RecyclerView.DECELERATION_RATE, intBitsToFloat2, f);
        RectF rectF2 = Path.rectF;
        rectF2.getClass();
        path.arcTo(rectF2, 270.0f, 90.0f, false);
        float intBitsToFloat3 = Float.intBitsToFloat(i);
        int i2 = (int) (j & BodyPartID.bodyIdMax);
        Path.lineTo(intBitsToFloat3, Float.intBitsToFloat(i2));
        float intBitsToFloat4 = Float.intBitsToFloat(i) - f;
        float intBitsToFloat5 = Float.intBitsToFloat(i2) - f;
        float intBitsToFloat6 = Float.intBitsToFloat(i);
        float intBitsToFloat7 = Float.intBitsToFloat(i2);
        if (Path.rectF == null) {
            Path.rectF = new RectF();
        }
        RectF rectF3 = Path.rectF;
        rectF3.getClass();
        rectF3.set(intBitsToFloat4, intBitsToFloat5, intBitsToFloat6, intBitsToFloat7);
        RectF rectF4 = Path.rectF;
        rectF4.getClass();
        path.arcTo(rectF4, RecyclerView.DECELERATION_RATE, 90.0f, false);
        Path.lineTo(mo236toPx0680j_43, Float.intBitsToFloat(i2));
        float intBitsToFloat8 = Float.intBitsToFloat(i2) - f;
        float f2 = mo236toPx0680j_43 + f;
        float intBitsToFloat9 = Float.intBitsToFloat(i2);
        if (Path.rectF == null) {
            Path.rectF = new RectF();
        }
        RectF rectF5 = Path.rectF;
        rectF5.getClass();
        rectF5.set(mo236toPx0680j_43, intBitsToFloat8, f2, intBitsToFloat9);
        RectF rectF6 = Path.rectF;
        rectF6.getClass();
        path.arcTo(rectF6, 90.0f, 90.0f, false);
        Path.lineTo(mo236toPx0680j_43, Float.intBitsToFloat(i2) - mo236toPx0680j_42);
        float f3 = mo236toPx0680j_43 - f;
        float intBitsToFloat10 = Float.intBitsToFloat(i2) - mo236toPx0680j_42;
        float intBitsToFloat11 = (Float.intBitsToFloat(i2) - mo236toPx0680j_42) + f;
        if (Path.rectF == null) {
            Path.rectF = new RectF();
        }
        RectF rectF7 = Path.rectF;
        rectF7.getClass();
        rectF7.set(f3, intBitsToFloat10, mo236toPx0680j_43, intBitsToFloat11);
        RectF rectF8 = Path.rectF;
        rectF8.getClass();
        path.arcTo(rectF8, RecyclerView.DECELERATION_RATE, -90.0f, false);
        Path.lineTo(RecyclerView.DECELERATION_RATE, Float.intBitsToFloat(i2) - mo236toPx0680j_42);
        float intBitsToFloat12 = (Float.intBitsToFloat(i2) - mo236toPx0680j_42) - f;
        float intBitsToFloat13 = Float.intBitsToFloat(i2) - mo236toPx0680j_42;
        if (Path.rectF == null) {
            Path.rectF = new RectF();
        }
        RectF rectF9 = Path.rectF;
        rectF9.getClass();
        rectF9.set(RecyclerView.DECELERATION_RATE, intBitsToFloat12, f, intBitsToFloat13);
        RectF rectF10 = Path.rectF;
        rectF10.getClass();
        path.arcTo(rectF10, 90.0f, 90.0f, false);
        Path.lineTo(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
        float f4 = f + RecyclerView.DECELERATION_RATE;
        if (Path.rectF == null) {
            Path.rectF = new RectF();
        }
        RectF rectF11 = Path.rectF;
        rectF11.getClass();
        rectF11.set(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, f, f4);
        RectF rectF12 = Path.rectF;
        rectF12.getClass();
        path.arcTo(rectF12, 180.0f, 90.0f, false);
        Path.close();
        return new Outline$Generic(Path);
    }
}
