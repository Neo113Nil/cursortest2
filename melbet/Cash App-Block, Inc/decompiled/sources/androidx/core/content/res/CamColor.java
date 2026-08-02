package androidx.core.content.res;

import android.graphics.Color;
import android.graphics.RectF;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.spark.SparkAdapter;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel;
import com.squareup.cash.portfolio.graphs.views.InvestingGraphAdapter;

/* loaded from: classes3.dex */
public final class CamColor {
    public final float mAstar;
    public final float mBstar;
    public final float mChroma;
    public final float mHue;
    public final float mJ;
    public final float mJstar;

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e A[LOOP:0: B:26:0x006c->B:27:0x006e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CamColor(SparkAdapter sparkAdapter, RectF rectF, float f, boolean z) {
        boolean z2;
        float f2;
        Float f3;
        float f4 = rectF.left;
        float f5 = rectF.top;
        float f6 = RecyclerView.DECELERATION_RATE;
        f = z ? 0.0f : f;
        this.mHue = rectF.width() - f;
        this.mChroma = rectF.height() - f;
        ((InvestingGraphAdapter) sparkAdapter).getDisplayedData().size();
        InvestingGraphAdapter investingGraphAdapter = (InvestingGraphAdapter) sparkAdapter;
        int size = investingGraphAdapter.getDisplayedData().size();
        if (investingGraphAdapter.isScrubbing) {
            InvestingGraphContentModel investingGraphContentModel = investingGraphAdapter.content;
            InvestingGraphContentModel.Loaded loaded = investingGraphContentModel instanceof InvestingGraphContentModel.Loaded ? (InvestingGraphContentModel.Loaded) investingGraphContentModel : null;
            if ((loaded != null ? loaded.baselineY : null) != null) {
                z2 = true;
                float f7 = Float.MAX_VALUE;
                if (z2) {
                    f2 = Float.MAX_VALUE;
                } else {
                    InvestingGraphContentModel investingGraphContentModel2 = investingGraphAdapter.content;
                    InvestingGraphContentModel.Loaded loaded2 = investingGraphContentModel2 instanceof InvestingGraphContentModel.Loaded ? (InvestingGraphContentModel.Loaded) investingGraphContentModel2 : null;
                    f2 = (loaded2 == null || (f3 = loaded2.baselineY) == null) ? 0.0f : f3.floatValue();
                }
                float f8 = -3.4028235E38f;
                float f9 = !z2 ? f2 : -3.4028235E38f;
                for (int i = 0; i < size; i++) {
                    float f10 = ((InvestingGraphContentModel.Point) investingGraphAdapter.getDisplayedData().get(i)).x;
                    f7 = Math.min(f7, f10);
                    f8 = Math.max(f8, f10);
                    float f11 = ((InvestingGraphContentModel.Point) investingGraphAdapter.getDisplayedData().get(i)).y;
                    f2 = Math.min(f2, f11);
                    f9 = Math.max(f9, f11);
                }
                RectF rectF2 = new RectF(f7, f2, f8, f9);
                rectF2.right = investingGraphAdapter.content.getGraphWidth();
                if (investingGraphAdapter.content.getMinimumHeightRange() != null) {
                    rectF2.top = Math.min(rectF2.top, r9.first);
                    rectF2.bottom = Math.max(rectF2.bottom, r9.last);
                }
                rectF2.inset(rectF2.width() != RecyclerView.DECELERATION_RATE ? -1.0f : 0.0f, rectF2.height() == RecyclerView.DECELERATION_RATE ? -1.0f : f6);
                float f12 = rectF2.left;
                float f13 = rectF2.right;
                float f14 = rectF2.top;
                float f15 = rectF2.bottom;
                float f16 = this.mHue / (f13 - f12);
                this.mJ = f16;
                float f17 = f / 2.0f;
                this.mAstar = (f4 - (f12 * f16)) + f17;
                float f18 = this.mChroma / (f15 - f14);
                this.mJstar = f18;
                this.mBstar = (f14 * f18) + f5 + f17;
            }
        }
        z2 = false;
        float f72 = Float.MAX_VALUE;
        if (z2) {
        }
        float f82 = -3.4028235E38f;
        if (!z2) {
        }
        while (i < size) {
        }
        RectF rectF22 = new RectF(f72, f2, f82, f9);
        rectF22.right = investingGraphAdapter.content.getGraphWidth();
        if (investingGraphAdapter.content.getMinimumHeightRange() != null) {
        }
        rectF22.inset(rectF22.width() != RecyclerView.DECELERATION_RATE ? -1.0f : 0.0f, rectF22.height() == RecyclerView.DECELERATION_RATE ? -1.0f : f6);
        float f122 = rectF22.left;
        float f132 = rectF22.right;
        float f142 = rectF22.top;
        float f152 = rectF22.bottom;
        float f162 = this.mHue / (f132 - f122);
        this.mJ = f162;
        float f172 = f / 2.0f;
        this.mAstar = (f4 - (f122 * f162)) + f172;
        float f182 = this.mChroma / (f152 - f142);
        this.mJstar = f182;
        this.mBstar = (f142 * f182) + f5 + f172;
    }

    public static CamColor fromColor(int i) {
        ViewingConditions viewingConditions = ViewingConditions.DEFAULT;
        float linearized = CamUtils.linearized(Color.red(i));
        float linearized2 = CamUtils.linearized(Color.green(i));
        float linearized3 = CamUtils.linearized(Color.blue(i));
        float[][] fArr = CamUtils.SRGB_TO_XYZ;
        float[] fArr2 = fArr[0];
        float f = (fArr2[2] * linearized3) + (fArr2[1] * linearized2) + (fArr2[0] * linearized);
        float[] fArr3 = fArr[1];
        float f2 = (fArr3[2] * linearized3) + (fArr3[1] * linearized2) + (fArr3[0] * linearized);
        float[] fArr4 = fArr[2];
        float f3 = (linearized3 * fArr4[2]) + (linearized2 * fArr4[1]) + (linearized * fArr4[0]);
        float[][] fArr5 = CamUtils.XYZ_TO_CAM16RGB;
        float[] fArr6 = fArr5[0];
        float f4 = (fArr6[2] * f3) + (fArr6[1] * f2) + (fArr6[0] * f);
        float[] fArr7 = fArr5[1];
        float f5 = (fArr7[2] * f3) + (fArr7[1] * f2) + (fArr7[0] * f);
        float[] fArr8 = fArr5[2];
        float f6 = (f3 * fArr8[2]) + (f2 * fArr8[1]) + (f * fArr8[0]);
        float[] fArr9 = viewingConditions.mRgbD;
        float f7 = viewingConditions.mFlRoot;
        float f8 = viewingConditions.mC;
        float f9 = viewingConditions.mAw;
        float f10 = fArr9[0] * f4;
        float f11 = fArr9[1] * f5;
        float f12 = fArr9[2] * f6;
        float f13 = viewingConditions.mFl;
        float pow = (float) Math.pow((Math.abs(f10) * f13) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((Math.abs(f11) * f13) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f12) * f13) / 100.0d, 0.42d);
        float signum = ((Math.signum(f10) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f11) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f12) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d = signum3;
        float f14 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d)) / 11.0f;
        float f15 = ((float) ((signum + signum2) - (d * 2.0d))) / 9.0f;
        float f16 = signum2 * 20.0f;
        float f17 = ((21.0f * signum3) + ((signum * 20.0f) + f16)) / 20.0f;
        float f18 = (((signum * 40.0f) + f16) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f15, f14)) * 180.0f) / 3.1415927f;
        if (atan2 < RecyclerView.DECELERATION_RATE) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f19 = (3.1415927f * atan2) / 180.0f;
        float pow4 = ((float) Math.pow((f18 * viewingConditions.mNbb) / f9, viewingConditions.mZ * f8)) * 100.0f;
        Math.sqrt(pow4 / 100.0f);
        float f20 = f9 + 4.0f;
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, viewingConditions.mN), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) atan2) < 20.14d ? 360.0f + atan2 : atan2) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * viewingConditions.mNc) * viewingConditions.mNcb) * ((float) Math.sqrt((f15 * f15) + (f14 * f14)))) / (f17 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow4 / 100.0d));
        Math.sqrt((r0 * f8) / f20);
        float f21 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((f7 * pow5 * 0.0228f) + 1.0f)) * 43.85965f;
        double d2 = f19;
        return new CamColor(atan2, pow5, pow4, f21, log * ((float) Math.cos(d2)), log * ((float) Math.sin(d2)));
    }

    public static CamColor fromJch(float f, float f2, float f3) {
        ViewingConditions viewingConditions = ViewingConditions.DEFAULT;
        float f4 = viewingConditions.mC;
        Math.sqrt(f / 100.0d);
        float f5 = viewingConditions.mAw + 4.0f;
        float f6 = viewingConditions.mFlRoot * f2;
        Math.sqrt(((f2 / ((float) Math.sqrt(r1))) * viewingConditions.mC) / f5);
        float f7 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float log = ((float) Math.log((f6 * 0.0228d) + 1.0d)) * 43.85965f;
        double d = (3.1415927f * f3) / 180.0f;
        return new CamColor(f3, f2, f, f7, log * ((float) Math.cos(d)), log * ((float) Math.sin(d)));
    }

    public int viewed(ViewingConditions viewingConditions) {
        float f;
        float f2 = this.mChroma;
        double d = f2;
        float f3 = this.mJ;
        if (d != 0.0d) {
            double d2 = f3;
            if (d2 != 0.0d) {
                f = f2 / ((float) Math.sqrt(d2 / 100.0d));
                float f4 = viewingConditions.mN;
                float f5 = viewingConditions.mFl;
                float pow = (float) Math.pow(f / Math.pow(1.64d - Math.pow(0.29d, f4), 0.73d), 1.1111111111111112d);
                double d3 = (this.mHue * 3.1415927f) / 180.0f;
                float cos = ((float) (Math.cos(2.0d + d3) + 3.8d)) * 0.25f;
                float pow2 = viewingConditions.mAw * ((float) Math.pow(f3 / 100.0d, (1.0d / viewingConditions.mC) / viewingConditions.mZ));
                float f6 = cos * 3846.1538f * viewingConditions.mNc * viewingConditions.mNcb;
                float f7 = pow2 / viewingConditions.mNbb;
                float sin = (float) Math.sin(d3);
                float cos2 = (float) Math.cos(d3);
                float f8 = (((0.305f + f7) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (f6 * 23.0f)));
                float f9 = cos2 * f8;
                float f10 = f8 * sin;
                float f11 = f7 * 460.0f;
                float f12 = ((288.0f * f10) + ((451.0f * f9) + f11)) / 1403.0f;
                float f13 = ((f11 - (891.0f * f9)) - (261.0f * f10)) / 1403.0f;
                float f14 = ((f11 - (f9 * 220.0f)) - (f10 * 6300.0f)) / 1403.0f;
                float f15 = 100.0f / f5;
                float signum = Math.signum(f12) * f15 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f12) * 27.13d) / (400.0d - Math.abs(f12))), 2.380952380952381d));
                float signum2 = Math.signum(f13) * f15 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f13) * 27.13d) / (400.0d - Math.abs(f13))), 2.380952380952381d));
                float signum3 = Math.signum(f14) * f15 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f14) * 27.13d) / (400.0d - Math.abs(f14))), 2.380952380952381d));
                float[] fArr = viewingConditions.mRgbD;
                float f16 = signum / fArr[0];
                float f17 = signum2 / fArr[1];
                float f18 = signum3 / fArr[2];
                float[][] fArr2 = CamUtils.CAM16RGB_TO_XYZ;
                float[] fArr3 = fArr2[0];
                float f19 = (fArr3[2] * f18) + (fArr3[1] * f17) + (fArr3[0] * f16);
                float[] fArr4 = fArr2[1];
                float f20 = (fArr4[2] * f18) + (fArr4[1] * f17) + (fArr4[0] * f16);
                float[] fArr5 = fArr2[2];
                return ColorUtils.XYZToColor(f19, f20, (f18 * fArr5[2]) + (f17 * fArr5[1]) + (f16 * fArr5[0]));
            }
        }
        f = RecyclerView.DECELERATION_RATE;
        float f42 = viewingConditions.mN;
        float f52 = viewingConditions.mFl;
        float pow3 = (float) Math.pow(f / Math.pow(1.64d - Math.pow(0.29d, f42), 0.73d), 1.1111111111111112d);
        double d32 = (this.mHue * 3.1415927f) / 180.0f;
        float cos3 = ((float) (Math.cos(2.0d + d32) + 3.8d)) * 0.25f;
        float pow22 = viewingConditions.mAw * ((float) Math.pow(f3 / 100.0d, (1.0d / viewingConditions.mC) / viewingConditions.mZ));
        float f62 = cos3 * 3846.1538f * viewingConditions.mNc * viewingConditions.mNcb;
        float f72 = pow22 / viewingConditions.mNbb;
        float sin2 = (float) Math.sin(d32);
        float cos22 = (float) Math.cos(d32);
        float f82 = (((0.305f + f72) * 23.0f) * pow3) / (((pow3 * 108.0f) * sin2) + (((11.0f * pow3) * cos22) + (f62 * 23.0f)));
        float f92 = cos22 * f82;
        float f102 = f82 * sin2;
        float f112 = f72 * 460.0f;
        float f122 = ((288.0f * f102) + ((451.0f * f92) + f112)) / 1403.0f;
        float f132 = ((f112 - (891.0f * f92)) - (261.0f * f102)) / 1403.0f;
        float f142 = ((f112 - (f92 * 220.0f)) - (f102 * 6300.0f)) / 1403.0f;
        float f152 = 100.0f / f52;
        float signum4 = Math.signum(f122) * f152 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f122) * 27.13d) / (400.0d - Math.abs(f122))), 2.380952380952381d));
        float signum22 = Math.signum(f132) * f152 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f132) * 27.13d) / (400.0d - Math.abs(f132))), 2.380952380952381d));
        float signum32 = Math.signum(f142) * f152 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f142) * 27.13d) / (400.0d - Math.abs(f142))), 2.380952380952381d));
        float[] fArr6 = viewingConditions.mRgbD;
        float f162 = signum4 / fArr6[0];
        float f172 = signum22 / fArr6[1];
        float f182 = signum32 / fArr6[2];
        float[][] fArr22 = CamUtils.CAM16RGB_TO_XYZ;
        float[] fArr32 = fArr22[0];
        float f192 = (fArr32[2] * f182) + (fArr32[1] * f172) + (fArr32[0] * f162);
        float[] fArr42 = fArr22[1];
        float f202 = (fArr42[2] * f182) + (fArr42[1] * f172) + (fArr42[0] * f162);
        float[] fArr52 = fArr22[2];
        return ColorUtils.XYZToColor(f192, f202, (f182 * fArr52[2]) + (f172 * fArr52[1]) + (f162 * fArr52[0]));
    }

    public CamColor(float f, float f2, float f3, float f4, float f5, float f6) {
        this.mHue = f;
        this.mChroma = f2;
        this.mJ = f3;
        this.mJstar = f4;
        this.mAstar = f5;
        this.mBstar = f6;
    }
}
