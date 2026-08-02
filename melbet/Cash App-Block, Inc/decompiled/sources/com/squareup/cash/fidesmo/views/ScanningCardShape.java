package com.squareup.cash.fidesmo.views;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Outline$Generic;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.db.contacts.Recipient$$ExternalSyntheticLambda2;
import kotlin.Lazy;
import kotlin.LazyKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public final class ScanningCardShape implements Shape {
    public static final ScanningCardShape INSTANCE = new ScanningCardShape();
    public static final Lazy rawBounds$delegate = LazyKt.lazy(new Recipient$$ExternalSyntheticLambda2(27));

    public static AndroidPath buildPath(float f, float f2, float f3) {
        AndroidPath Path = AndroidPath_androidKt.Path();
        Path.m666setFillTypeoQ8Xj4U(1);
        float f4 = (124.158f * f3) + f;
        float f5 = RecyclerView.DECELERATION_RATE * f3;
        float f6 = f5 + f2;
        Path.moveTo(f4, f6);
        float f7 = (133.201f * f3) + f;
        float f8 = (137.725f * f3) + f;
        float f9 = (141.18f * f3) + f;
        float f10 = (1.77344f * f3) + f2;
        Path.cubicTo(f7, f6, f8, ((-2.48451E-4f) * f3) + f2, f9, f10);
        float f11 = (144.219f * f3) + f;
        float f12 = (3.33415f * f3) + f2;
        float f13 = (146.692f * f3) + f;
        float f14 = (5.82567f * f3) + f2;
        float f15 = (148.24f * f3) + f;
        float f16 = (8.88867f * f3) + f2;
        Path.cubicTo(f11, f12, f13, f14, f15, f16);
        float f17 = (150.0f * f3) + f;
        Path.cubicTo(f17, (12.3702f * f3) + f2, f17, (16.9287f * f3) + f2, f17, (26.042f * f3) + f2);
        Path.lineTo(f17, (73.958f * f3) + f2);
        float f18 = (91.1113f * f3) + f2;
        Path.cubicTo(f17, (83.0713f * f3) + f2, f17, (87.6298f * f3) + f2, f15, f18);
        float f19 = (94.1743f * f3) + f2;
        float f20 = (96.6659f * f3) + f2;
        float f21 = (98.2266f * f3) + f2;
        Path.cubicTo(f13, f19, f11, f20, f9, f21);
        float f22 = (100.0f * f3) + f2;
        Path.cubicTo(f8, f22, f7, f22, f4, f22);
        float f23 = (25.8418f * f3) + f;
        Path.lineTo(f23, f22);
        float f24 = (16.7985f * f3) + f;
        float f25 = (12.2751f * f3) + f;
        float f26 = (8.82031f * f3) + f;
        Path.cubicTo(f24, f22, f25, f22, f26, f21);
        float f27 = (5.78087f * f3) + f;
        float f28 = (3.30847f * f3) + f;
        float f29 = (1.75977f * f3) + f;
        Path.cubicTo(f27, f20, f28, f19, f29, f18);
        float f30 = ((-3.00527E-4f) * f3) + f;
        float f31 = f5 + f;
        Path.cubicTo(f30, (87.6297f * f3) + f2, f31, (83.0706f * f3) + f2, f31, (73.957f * f3) + f2);
        Path.lineTo(f31, (26.043f * f3) + f2);
        Path.cubicTo(f31, (16.9294f * f3) + f2, f30, (12.3703f * f3) + f2, f29, f16);
        Path.cubicTo(f28, f14, f27, f12, f26, f10);
        Path.cubicTo(f25, ((-2.48948E-4f) * f3) + f2, f24, f6, f23, f6);
        Path.lineTo(f4, f6);
        Path.close();
        float f32 = 25.0f * f3;
        float f33 = f32 + f;
        float f34 = 18.0f * f3;
        float f35 = f34 + f2;
        Path.moveTo(f33, f35);
        float f36 = 21.134f * f3;
        float f37 = f36 + f;
        float f38 = f34 + f;
        Path.cubicTo(f37, f35, f38, f36 + f2, f38, f32 + f2);
        float f39 = (75.0f * f3) + f2;
        Path.lineTo(f38, f39);
        float f40 = (78.866f * f3) + f2;
        float f41 = (82.0f * f3) + f2;
        Path.cubicTo(f38, f40, f37, f41, f33, f41);
        Path.lineTo((125.0f * f3) + f, f41);
        float f42 = (132.0f * f3) + f;
        Path.cubicTo((128.866f * f3) + f, f41, f42, f40, f42, f39);
        Path.lineTo(f42, (38.8271f * f3) + f2);
        float f43 = (34.6357f * f3) + f2;
        Path.cubicTo(f42, (36.5124f * f3) + f2, (130.123f * f3) + f, (34.6358f * f3) + f2, (127.809f * f3) + f, f43);
        Path.lineTo((127.314f * f3) + f, f43);
        float f44 = (115.564f * f3) + f;
        Path.cubicTo((120.825f * f3) + f, (34.6355f * f3) + f2, f44, (29.3744f * f3) + f2, f44, (22.8848f * f3) + f2);
        Path.lineTo(f44, (22.3721f * f3) + f2);
        Path.cubicTo(f44, (19.9576f * f3) + f2, (113.607f * f3) + f, f35, (111.192f * f3) + f, f35);
        Path.lineTo(f33, f35);
        Path.close();
        float f45 = (10.0f * f3) + f2;
        Path.moveTo(f42, f45);
        float f46 = (127.582f * f3) + f;
        float f47 = (124.0f * f3) + f;
        float f48 = (13.5817f * f3) + f2;
        Path.cubicTo(f46, f45, f47, f48, f47, f35);
        float f49 = (22.4183f * f3) + f2;
        float f50 = (26.0f * f3) + f2;
        Path.cubicTo(f47, f49, f46, f50, f42, f50);
        float f51 = (136.418f * f3) + f;
        float f52 = (140.0f * f3) + f;
        Path.cubicTo(f51, f50, f52, f49, f52, f35);
        Path.cubicTo(f52, f48, f51, f45, f42, f45);
        Path.close();
        return Path;
    }

    @Override // androidx.compose.ui.graphics.Shape
    /* renamed from: createOutline-Pq9zytI */
    public final ColorKt mo175createOutlinePq9zytI(long j, LayoutDirection layoutDirection, Density density) {
        layoutDirection.getClass();
        density.getClass();
        Rect rect = (Rect) rawBounds$delegate.getValue();
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i);
        float f = rect.right;
        float f2 = rect.left;
        float f3 = intBitsToFloat / (f - f2);
        int i2 = (int) (j & BodyPartID.bodyIdMax);
        float intBitsToFloat2 = Float.intBitsToFloat(i2);
        float f4 = rect.bottom;
        float f5 = rect.top;
        float f6 = f4 - f5;
        float min = Math.min(f3, intBitsToFloat2 / f6);
        return new Outline$Generic(buildPath(((Float.intBitsToFloat(i) - ((rect.right - f2) * min)) / 2.0f) - (f2 * min), ((Float.intBitsToFloat(i2) - (f6 * min)) / 2.0f) - (f5 * min), min));
    }
}
