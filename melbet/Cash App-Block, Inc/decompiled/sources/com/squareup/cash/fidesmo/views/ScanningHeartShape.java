package com.squareup.cash.fidesmo.views;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Outline$Generic;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.squareup.cash.db.contacts.Recipient$$ExternalSyntheticLambda2;
import kotlin.Lazy;
import kotlin.LazyKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public final class ScanningHeartShape implements Shape {
    public static final ScanningHeartShape INSTANCE = new ScanningHeartShape();
    public static final Lazy rawBounds$delegate = LazyKt.lazy(new Recipient$$ExternalSyntheticLambda2(28));

    public static AndroidPath buildPath$1(float f, float f2, float f3) {
        AndroidPath Path = AndroidPath_androidKt.Path();
        Path.m666setFillTypeoQ8Xj4U(1);
        float f4 = (63.422f * f3) + f;
        float f5 = (0.0451838f * f3) + f2;
        Path.moveTo(f4, f5);
        Path.cubicTo((68.7386f * f3) + f, ((-0.256013f) * f3) + f2, (74.0319f * f3) + f, (0.953322f * f3) + f2, (78.6906f * f3) + f, (3.53249f * f3) + f2);
        Path.cubicTo((83.5718f * f3) + f, (6.23527f * f3) + f2, (87.5458f * f3) + f, (10.3212f * f3) + f2, (90.1105f * f3) + f, (15.2766f * f3) + f2);
        Path.cubicTo((90.8136f * f3) + f, (16.6299f * f3) + f2, (91.4673f * f3) + f, (18.0835f * f3) + f2, (91.8781f * f3) + f, (19.554f * f3) + f2);
        Path.cubicTo((94.2242f * f3) + f, (19.4629f * f3) + f2, (96.5257f * f3) + f, (19.3569f * f3) + f2, (98.8712f * f3) + f, (19.5569f * f3) + f2);
        Path.cubicTo((105.218f * f3) + f, (20.0982f * f3) + f2, (111.552f * f3) + f, (22.6453f * f3) + f2, (116.656f * f3) + f, (26.4104f * f3) + f2);
        Path.cubicTo((123.474f * f3) + f, (31.4398f * f3) + f2, (128.385f * f3) + f, (39.3011f * f3) + f2, (129.642f * f3) + f, (47.7122f * f3) + f2);
        Path.cubicTo((131.565f * f3) + f, (60.5937f * f3) + f2, (125.497f * f3) + f, (73.3145f * f3) + f2, (118.014f * f3) + f, (83.4055f * f3) + f2);
        Path.cubicTo((108.255f * f3) + f, (96.565f * f3) + f2, (93.9647f * f3) + f, (108.071f * f3) + f2, (79.757f * f3) + f, (116.108f * f3) + f2);
        Path.cubicTo((75.9363f * f3) + f, (118.269f * f3) + f2, (70.8165f * f3) + f, (120.994f * f3) + f2, (66.4757f * f3) + f, (121.637f * f3) + f2);
        Path.cubicTo((62.2223f * f3) + f, (122.023f * f3) + f2, (58.3081f * f3) + f, (120.278f * f3) + f2, (54.5871f * f3) + f, (118.391f * f3) + f2);
        Path.cubicTo((40.186f * f3) + f, (111.091f * f3) + f2, (26.7914f * f3) + f, (100.703f * f3) + f2, (16.1486f * f3) + f, (88.5706f * f3) + f2);
        Path.cubicTo((7.48409f * f3) + f, (78.6942f * f3) + f2, ((-0.935658f) * f3) + f, (64.1166f * f3) + f2, (0.08414f * f3) + f, (50.553f * f3) + f2);
        Path.cubicTo((0.685252f * f3) + f, (41.8563f * f3) + f2, (4.72332f * f3) + f, (33.7562f * f3) + f2, (11.3058f * f3) + f, (28.0413f * f3) + f2);
        Path.cubicTo((16.8263f * f3) + f, (23.2747f * f3) + f2, (23.6782f * f3) + f, (20.3196f * f3) + f2, (30.9337f * f3) + f, (19.5774f * f3) + f2);
        Path.cubicTo((33.3783f * f3) + f, (19.346f * f3) + f2, (35.6792f * f3) + f, (19.3952f * f3) + f2, (38.1154f * f3) + f, (19.5823f * f3) + f2);
        Path.cubicTo((39.3235f * f3) + f, (15.7991f * f3) + f2, (41.3221f * f3) + f, (12.3154f * f3) + f2, (43.9787f * f3) + f, (9.36354f * f3) + f2);
        Path.cubicTo((48.9661f * f3) + f, (3.79962f * f3) + f2, (55.9612f * f3) + f, (0.44721f * f3) + f2, f4, f5);
        Path.close();
        float f6 = (46.1525f * f3) + f;
        float f7 = (38.6897f * f3) + f2;
        Path.moveTo(f6, f7);
        Path.cubicTo((44.6299f * f3) + f, (38.5782f * f3) + f2, (43.192f * f3) + f, (38.5489f * f3) + f2, (41.6642f * f3) + f, (38.6868f * f3) + f2);
        Path.cubicTo((37.1296f * f3) + f, (39.129f * f3) + f2, (32.8469f * f3) + f, (40.8896f * f3) + f2, (29.3966f * f3) + f, (43.7298f * f3) + f2);
        Path.cubicTo((25.2826f * f3) + f, (47.135f * f3) + f2, (22.7587f * f3) + f, (51.9618f * f3) + f2, (22.383f * f3) + f, (57.1438f * f3) + f2);
        Path.cubicTo((21.7456f * f3) + f, (65.226f * f3) + f2, (29.0399f * f3) + f, (75.9434f * f3) + f2, (34.4552f * f3) + f, (81.8284f * f3) + f2);
        Path.cubicTo((41.1069f * f3) + f, (89.0572f * f3) + f2, (49.4781f * f3) + f, (95.2474f * f3) + f2, (58.4787f * f3) + f, (99.5969f * f3) + f2);
        Path.cubicTo((60.8044f * f3) + f, (100.721f * f3) + f2, (63.2509f * f3) + f, (101.762f * f3) + f2, (65.9093f * f3) + f, (101.532f * f3) + f2);
        Path.cubicTo((68.6223f * f3) + f, (101.148f * f3) + f2, (71.8222f * f3) + f, (99.5245f * f3) + f2, (74.2101f * f3) + f, (98.2366f * f3) + f2);
        Path.cubicTo((83.0899f * f3) + f, (93.448f * f3) + f2, (92.0209f * f3) + f, (86.5915f * f3) + f2, (98.1203f * f3) + f, (78.7503f * f3) + f2);
        Path.cubicTo((102.797f * f3) + f, (72.7374f * f3) + f2, (108.621f * f3) + f, (63.1261f * f3) + f2, (107.419f * f3) + f, (55.4505f * f3) + f2);
        Path.cubicTo((106.634f * f3) + f, (50.4388f * f3) + f2, (103.565f * f3) + f, (45.7548f * f3) + f2, (99.3039f * f3) + f, (42.7581f * f3) + f2);
        Path.cubicTo((96.1137f * f3) + f, (40.5145f * f3) + f2, (92.1542f * f3) + f, (38.9977f * f3) + f2, (88.1877f * f3) + f, (38.6751f * f3) + f2);
        float f8 = (83.8175f * f3) + f;
        float f9 = (38.6731f * f3) + f2;
        Path.cubicTo((86.7219f * f3) + f, (38.5559f * f3) + f2, (85.2837f * f3) + f, (38.6189f * f3) + f2, f8, f9);
        Path.cubicTo(f8, f9, (79.6265f * f3) + f, (38.9509f * f3) + f2, (76.5539f * f3) + f, (40.6321f * f3) + f2);
        Path.cubicTo((73.4816f * f3) + f, (42.3131f * f3) + f2, (73.5155f * f3) + f, (42.4445f * f3) + f2, (73.1125f * f3) + f, (42.6565f * f3) + f2);
        Path.cubicTo((71.6868f * f3) + f, (43.408f * f3) + f2, (70.5516f * f3) + f, (44.8971f * f3) + f2, (69.3371f * f3) + f, (45.9319f * f3) + f2);
        Path.cubicTo((67.8885f * f3) + f, (47.1771f * f3) + f2, (67.4012f * f3) + f, (48.3317f * f3) + f2, (65.256f * f3) + f, (48.5452f * f3) + f2);
        Path.cubicTo((62.7569f * f3) + f, (48.5769f * f3) + f2, (62.2272f * f3) + f, (47.3268f * f3) + f2, (60.5793f * f3) + f, (45.8899f * f3) + f2);
        Path.cubicTo((59.0201f * f3) + f, (44.5306f * f3) + f2, (56.1848f * f3) + f, (41.8533f * f3) + f2, (53.4328f * f3) + f, (40.6399f * f3) + f2);
        Path.cubicTo((50.6807f * f3) + f, (39.4266f * f3) + f2, f6, f7, f6, f7);
        Path.close();
        float f10 = (64.7355f * f3) + f;
        float f11 = (11.1682f * f3) + f2;
        Path.moveTo(f10, f11);
        Path.cubicTo((63.7783f * f3) + f, (11.2221f * f3) + f2, (62.8735f * f3) + f, (11.2728f * f3) + f2, (61.9279f * f3) + f, (11.4553f * f3) + f2);
        Path.cubicTo((58.5926f * f3) + f, (12.1312f * f3) + f2, (55.5614f * f3) + f, (13.8572f * f3) + f2, (53.2785f * f3) + f, (16.3811f * f3) + f2);
        Path.cubicTo((51.7602f * f3) + f, (18.0919f * f3) + f2, (50.2969f * f3) + f, (20.5906f * f3) + f2, (49.7638f * f3) + f, (22.8548f * f3) + f2);
        Path.cubicTo((52.7413f * f3) + f, (24.3805f * f3) + f2, (55.4529f * f3) + f, (25.975f * f3) + f2, (57.9474f * f3) + f, (28.2561f * f3) + f2);
        Path.cubicTo((60.5843f * f3) + f, (30.6676f * f3) + f2, (61.4321f * f3) + f, (32.7655f * f3) + f2, (65.4308f * f3) + f, (32.7122f * f3) + f2);
        Path.cubicTo((68.863f * f3) + f, (32.354f * f3) + f2, (69.6425f * f3) + f, (30.4171f * f3) + f2, (71.9601f * f3) + f, (28.3274f * f3) + f2);
        Path.cubicTo((73.9033f * f3) + f, (26.5908f * f3) + f2, (76.0357f * f3) + f, (25.0777f * f3) + f2, (78.3166f * f3) + f, (23.8167f * f3) + f2);
        Path.cubicTo((78.9617f * f3) + f, (23.4608f * f3) + f2, (79.6184f * f3) + f, (23.1803f * f3) + f2, (80.257f * f3) + f, (22.8411f * f3) + f2);
        Path.cubicTo((79.1385f * f3) + f, (18.749f * f3) + f2, (76.4371f * f3) + f, (15.2698f * f3) + f2, (72.7502f * f3) + f, (13.1721f * f3) + f2);
        Path.cubicTo((70.5259f * f3) + f, (11.8787f * f3) + f2, (67.2988f * f3) + f, (11.0522f * f3) + f2, f10, f11);
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
        return new Outline$Generic(buildPath$1(((Float.intBitsToFloat(i) - ((rect.right - f2) * min)) / 2.0f) - (f2 * min), ((Float.intBitsToFloat(i2) - (f6 * min)) / 2.0f) - (f5 * min), min));
    }
}
