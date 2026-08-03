package androidx.compose.material3.internal.colorUtil;

import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.core.graphics.ColorUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Cam.android.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fBG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0000J\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000e¨\u0006 "}, d2 = {"Landroidx/compose/material3/internal/colorUtil/Cam;", "", "hue", "", "chroma", "j", "m", "s", "jstar", "astar", "bstar", "<init>", "(FFFFFFFF)V", "getHue", "()F", "getChroma", "getJ", "getM", "getS", "getJstar", "setJstar", "(F)V", "getAstar", "getBstar", "distance", "other", "viewedInSrgb", "", "viewed", "frame", "Landroidx/compose/material3/internal/colorUtil/Frame;", "Companion", "material3"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class Cam {
    private static final float CHROMA_SEARCH_ENDPOINT = 0.4f;
    private static final float DE_MAX = 1.0f;
    private static final float DL_MAX = 0.2f;
    private static final float LIGHTNESS_SEARCH_ENDPOINT = 0.01f;
    private final float astar;
    private final float bstar;
    private final float chroma;
    private final float hue;
    private final float j;
    private float jstar;
    private final float m;
    private final float s;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public Cam(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.hue = f;
        this.chroma = f2;
        this.j = f3;
        this.m = f4;
        this.s = f5;
        this.jstar = f6;
        this.astar = f7;
        this.bstar = f8;
    }

    public final float getHue() {
        return this.hue;
    }

    public final float getChroma() {
        return this.chroma;
    }

    public final float getJ() {
        return this.j;
    }

    public final float getM() {
        return this.m;
    }

    public final float getS() {
        return this.s;
    }

    public final float getJstar() {
        return this.jstar;
    }

    public final void setJstar(float f) {
        this.jstar = f;
    }

    public final float getAstar() {
        return this.astar;
    }

    public final float getBstar() {
        return this.bstar;
    }

    public final float distance(Cam other) {
        float f = this.jstar - other.jstar;
        float f2 = this.astar - other.astar;
        float f3 = this.bstar - other.bstar;
        return (float) (Math.pow(Math.sqrt((f * f) + (f2 * f2) + (f3 * f3)), 0.63d) * 1.41d);
    }

    public final int viewedInSrgb() {
        return viewed(Frame.INSTANCE.getDefault());
    }

    public final int viewed(Frame frame) {
        float f;
        float f2 = this.chroma;
        if (f2 != 0.0f) {
            if (this.j != 0.0f) {
                f = f2 / ((float) Math.sqrt(r2 / 100.0f));
                float pow = f / ((float) Math.pow(1.64f - ((float) Math.pow((float) Math.pow(0.29f, frame.getN()), 0.73f)), 1.1111112f));
                float f3 = (this.hue * 3.1415927f) / 180.0f;
                float cos = (((float) Math.cos(2.0f + f3)) + 3.8f) * 0.25f;
                float aw = frame.getAw() * ((float) Math.pow(this.j / 100.0f, (1.0f / frame.getC()) / frame.getZ()));
                float nc = cos * 3846.1538f * frame.getNc() * frame.getNcb();
                float nbb = aw / frame.getNbb();
                double d = f3;
                float sin = (float) Math.sin(d);
                float cos2 = (float) Math.cos(d);
                float f4 = (((0.305f + nbb) * 23.0f) * pow) / (((nc * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
                float f5 = cos2 * f4;
                float f6 = f4 * sin;
                float f7 = nbb * 460.0f;
                float f8 = (((451.0f * f5) + f7) + (288.0f * f6)) / 1403.0f;
                float f9 = ((f7 - (891.0f * f5)) - (261.0f * f6)) / 1403.0f;
                double d2 = 2.3809524f;
                float signum = Math.signum(f8) * (100.0f / frame.getFl()) * ((float) Math.pow(Math.max(0.0f, (Math.abs(f8) * 27.13f) / (400.0f - Math.abs(f8))), d2));
                float signum2 = Math.signum(f9) * (100.0f / frame.getFl()) * ((float) Math.pow(Math.max(0.0f, (Math.abs(f9) * 27.13f) / (400.0f - Math.abs(f9))), d2));
                float signum3 = Math.signum(((f7 - (f5 * 220.0f)) - (f6 * 6300.0f)) / 1403.0f) * (100.0f / frame.getFl()) * ((float) Math.pow(Math.max(0.0f, (Math.abs(r5) * 27.13f) / (400.0f - Math.abs(r5))), d2));
                float f10 = signum / frame.getRgbD()[0];
                float f11 = signum2 / frame.getRgbD()[1];
                float f12 = signum3 / frame.getRgbD()[2];
                float[][] cam16rgb_to_xyz = CamUtils.INSTANCE.getCAM16RGB_TO_XYZ();
                float[] fArr = cam16rgb_to_xyz[0];
                float f13 = (fArr[0] * f10) + (fArr[1] * f11) + (fArr[2] * f12);
                float[] fArr2 = cam16rgb_to_xyz[1];
                float f14 = (fArr2[0] * f10) + (fArr2[1] * f11) + (fArr2[2] * f12);
                float[] fArr3 = cam16rgb_to_xyz[2];
                return ColorUtils.XYZToColor(f13, f14, (f10 * fArr3[0]) + (f11 * fArr3[1]) + (f12 * fArr3[2]));
            }
        }
        f = 0.0f;
        float pow2 = f / ((float) Math.pow(1.64f - ((float) Math.pow((float) Math.pow(0.29f, frame.getN()), 0.73f)), 1.1111112f));
        float f32 = (this.hue * 3.1415927f) / 180.0f;
        float cos3 = (((float) Math.cos(2.0f + f32)) + 3.8f) * 0.25f;
        float aw2 = frame.getAw() * ((float) Math.pow(this.j / 100.0f, (1.0f / frame.getC()) / frame.getZ()));
        float nc2 = cos3 * 3846.1538f * frame.getNc() * frame.getNcb();
        float nbb2 = aw2 / frame.getNbb();
        double d3 = f32;
        float sin2 = (float) Math.sin(d3);
        float cos22 = (float) Math.cos(d3);
        float f42 = (((0.305f + nbb2) * 23.0f) * pow2) / (((nc2 * 23.0f) + ((11.0f * pow2) * cos22)) + ((pow2 * 108.0f) * sin2));
        float f52 = cos22 * f42;
        float f62 = f42 * sin2;
        float f72 = nbb2 * 460.0f;
        float f82 = (((451.0f * f52) + f72) + (288.0f * f62)) / 1403.0f;
        float f92 = ((f72 - (891.0f * f52)) - (261.0f * f62)) / 1403.0f;
        double d22 = 2.3809524f;
        float signum4 = Math.signum(f82) * (100.0f / frame.getFl()) * ((float) Math.pow(Math.max(0.0f, (Math.abs(f82) * 27.13f) / (400.0f - Math.abs(f82))), d22));
        float signum22 = Math.signum(f92) * (100.0f / frame.getFl()) * ((float) Math.pow(Math.max(0.0f, (Math.abs(f92) * 27.13f) / (400.0f - Math.abs(f92))), d22));
        float signum32 = Math.signum(((f72 - (f52 * 220.0f)) - (f62 * 6300.0f)) / 1403.0f) * (100.0f / frame.getFl()) * ((float) Math.pow(Math.max(0.0f, (Math.abs(r5) * 27.13f) / (400.0f - Math.abs(r5))), d22));
        float f102 = signum4 / frame.getRgbD()[0];
        float f112 = signum22 / frame.getRgbD()[1];
        float f122 = signum32 / frame.getRgbD()[2];
        float[][] cam16rgb_to_xyz2 = CamUtils.INSTANCE.getCAM16RGB_TO_XYZ();
        float[] fArr4 = cam16rgb_to_xyz2[0];
        float f132 = (fArr4[0] * f102) + (fArr4[1] * f112) + (fArr4[2] * f122);
        float[] fArr22 = cam16rgb_to_xyz2[1];
        float f142 = (fArr22[0] * f102) + (fArr22[1] * f112) + (fArr22[2] * f122);
        float[] fArr32 = cam16rgb_to_xyz2[2];
        return ColorUtils.XYZToColor(f132, f142, (f102 * fArr32[0]) + (f112 * fArr32[1]) + (f122 * fArr32[2]));
    }

    /* compiled from: Cam.android.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\nJ\u0018\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J \u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0005H\u0002J(\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J(\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\"\u0010\u0019\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Landroidx/compose/material3/internal/colorUtil/Cam$Companion;", "", "<init>", "()V", "DL_MAX", "", "DE_MAX", "CHROMA_SEARCH_ENDPOINT", "LIGHTNESS_SEARCH_ENDPOINT", "getInt", "", "hue", "chroma", "lstar", "fromInt", "Landroidx/compose/material3/internal/colorUtil/Cam;", "argb", "fromIntInFrame", "frame", "Landroidx/compose/material3/internal/colorUtil/Frame;", "fromJch", "j", "c", "h", "fromJchInFrame", "findCamByJ", "material3"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final int getInt(float hue, float chroma, float lstar) {
            return getInt(hue, chroma, lstar, Frame.INSTANCE.getDefault());
        }

        public final Cam fromInt(int argb) {
            return fromIntInFrame(argb, Frame.INSTANCE.getDefault());
        }

        private final Cam fromIntInFrame(int argb, Frame frame) {
            float[] xyzFromInt = CamUtils.INSTANCE.xyzFromInt(argb);
            float[][] xyz_to_cam16rgb = CamUtils.INSTANCE.getXYZ_TO_CAM16RGB();
            float f = xyzFromInt[0];
            float[] fArr = xyz_to_cam16rgb[0];
            float f2 = fArr[0] * f;
            float f3 = xyzFromInt[1];
            float f4 = f2 + (fArr[1] * f3);
            float f5 = xyzFromInt[2];
            float f6 = f4 + (fArr[2] * f5);
            float[] fArr2 = xyz_to_cam16rgb[1];
            float f7 = (fArr2[0] * f) + (fArr2[1] * f3) + (fArr2[2] * f5);
            float[] fArr3 = xyz_to_cam16rgb[2];
            float f8 = (f * fArr3[0]) + (f3 * fArr3[1]) + (f5 * fArr3[2]);
            float f9 = frame.getRgbD()[0] * f6;
            float f10 = frame.getRgbD()[1] * f7;
            float f11 = frame.getRgbD()[2] * f8;
            double d = 0.42f;
            float pow = (float) Math.pow((frame.getFl() * Math.abs(f9)) / 100.0f, d);
            float pow2 = (float) Math.pow((frame.getFl() * Math.abs(f10)) / 100.0f, d);
            float pow3 = (float) Math.pow((frame.getFl() * Math.abs(f11)) / 100.0f, d);
            float signum = ((Math.signum(f9) * 400.0f) * pow) / (pow + 27.13f);
            float signum2 = ((Math.signum(f10) * 400.0f) * pow2) / (pow2 + 27.13f);
            float signum3 = ((Math.signum(f11) * 400.0f) * pow3) / (pow3 + 27.13f);
            float f12 = (((signum * 11.0f) + ((-12.0f) * signum2)) + signum3) / 11.0f;
            float f13 = ((signum + signum2) - (signum3 * 2.0f)) / 9.0f;
            float f14 = signum2 * 20.0f;
            float f15 = (((signum * 20.0f) + f14) + (21.0f * signum3)) / 20.0f;
            float f16 = (((signum * 40.0f) + f14) + signum3) / 20.0f;
            float atan2 = (((float) Math.atan2(f13, f12)) * 180.0f) / 3.1415927f;
            if (atan2 < 0.0f) {
                atan2 += 360.0f;
            } else if (atan2 >= 360.0f) {
                atan2 -= 360.0f;
            }
            float f17 = atan2;
            float f18 = (f17 * 3.1415927f) / 180.0f;
            float pow4 = ((float) Math.pow((f16 * frame.getNbb()) / frame.getAw(), frame.getC() * frame.getZ())) * 100.0f;
            float pow5 = ((float) Math.pow(((((((((float) Math.cos((((((double) f17) < 20.14d ? 360 + f17 : f17) * 3.1415927f) / 180.0f) + 2.0f)) + 3.8f) * 0.25f) * 3846.1538f) * frame.getNc()) * frame.getNcb()) * ((float) Math.sqrt((f12 * f12) + (f13 * f13)))) / (f15 + 0.305f), 0.9f)) * ((float) Math.pow(1.64f - ((float) Math.pow(0.29f, frame.getN())), 0.73f)) * ((float) Math.sqrt(pow4 / 100.0f));
            float flRoot = pow5 * frame.getFlRoot();
            float sqrt = ((float) Math.sqrt((r0 * frame.getC()) / (frame.getAw() + 4.0f))) * 50.0f;
            float f19 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
            float log = ((float) Math.log((0.0228f * flRoot) + 1.0f)) * 43.85965f;
            double d2 = f18;
            return new Cam(f17, pow5, pow4, flRoot, sqrt, f19, log * ((float) Math.cos(d2)), log * ((float) Math.sin(d2)));
        }

        private final Cam fromJch(float j, float c, float h) {
            return fromJchInFrame(j, c, h, Frame.INSTANCE.getDefault());
        }

        private final Cam fromJchInFrame(float j, float c, float h, Frame frame) {
            float flRoot = c * frame.getFlRoot();
            float sqrt = ((float) Math.sqrt(((c / ((float) Math.sqrt(j / 100.0d))) * frame.getC()) / (frame.getAw() + 4.0f))) * 50.0f;
            float f = (1.7f * j) / ((0.007f * j) + 1.0f);
            float log = ((float) Math.log((flRoot * 0.0228d) + 1.0d)) * 43.85965f;
            double d = (3.1415927f * h) / 180.0f;
            return new Cam(h, c, j, flRoot, sqrt, f, log * ((float) Math.cos(d)), log * ((float) Math.sin(d)));
        }

        private final int getInt(float hue, float chroma, float lstar, Frame frame) {
            if (Intrinsics.areEqual(frame, Frame.INSTANCE.getDefault())) {
                return HctSolver.INSTANCE.solveToInt(hue, chroma, lstar);
            }
            if (chroma < 1.0d || Math.round(lstar) <= 0.0d || Math.round(lstar) >= 100.0d) {
                return CamUtils.INSTANCE.intFromLstar(lstar);
            }
            float min = hue < 0.0f ? 0.0f : Math.min(360.0f, hue);
            Cam cam = null;
            boolean z = true;
            float f = 0.0f;
            float f2 = chroma;
            while (Math.abs(f - chroma) >= 0.4000000059604645d) {
                Cam findCamByJ = findCamByJ(min, f2, lstar);
                if (!z) {
                    if (findCamByJ == null) {
                        chroma = f2;
                    } else {
                        f = f2;
                        cam = findCamByJ;
                    }
                    f2 = ((chroma - f) / 2.0f) + f;
                } else {
                    if (findCamByJ != null) {
                        return findCamByJ.viewed(frame);
                    }
                    f2 = ((chroma - f) / 2.0f) + f;
                    z = false;
                }
            }
            if (cam == null) {
                return CamUtils.INSTANCE.intFromLstar(lstar);
            }
            return cam.viewed(frame);
        }

        private final Cam findCamByJ(float hue, float chroma, float lstar) {
            float f = 100.0f;
            float f2 = 1000.0f;
            float f3 = 0.0f;
            Cam cam = null;
            float f4 = 1000.0f;
            while (Math.abs(f3 - f) > 0.009999999776482582d) {
                float f5 = ((f - f3) / 2) + f3;
                int viewedInSrgb = fromJch(f5, chroma, hue).viewedInSrgb();
                float lstarFromInt = CamUtils.INSTANCE.lstarFromInt(viewedInSrgb);
                float abs = (float) Math.abs(lstar - lstarFromInt);
                if (abs < 0.2f) {
                    Cam fromInt = fromInt(viewedInSrgb);
                    float distance = fromInt.distance(fromJch(fromInt.getJ(), fromInt.getChroma(), hue));
                    if (distance <= 1.0f) {
                        cam = fromInt;
                        f2 = abs;
                        f4 = distance;
                    }
                }
                if (f2 == 0.0f && f4 == 0.0f) {
                    return cam;
                }
                if (lstarFromInt < lstar) {
                    f3 = f5;
                } else {
                    f = f5;
                }
            }
            return cam;
        }
    }
}
