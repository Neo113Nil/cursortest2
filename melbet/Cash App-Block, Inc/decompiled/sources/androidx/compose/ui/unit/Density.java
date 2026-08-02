package androidx.compose.ui.unit;

import androidx.compose.ui.unit.fontscaling.FontScaleConverter;
import androidx.compose.ui.unit.fontscaling.FontScaleConverterFactory;
import androidx.core.os.BundleKt;
import androidx.room.Room;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public interface Density {
    float getDensity();

    float getFontScale();

    /* renamed from: roundToPx--R2X_6o */
    default int mo229roundToPxR2X_6o(long j) {
        return Math.round(mo235toPxR2X_6o(j));
    }

    /* renamed from: roundToPx-0680j_4 */
    default int mo230roundToPx0680j_4(float f) {
        float mo236toPx0680j_4 = mo236toPx0680j_4(f);
        if (Float.isInfinite(mo236toPx0680j_4)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(mo236toPx0680j_4);
    }

    /* renamed from: toDp-GaN1DYA */
    default float mo231toDpGaN1DYA(long j) {
        if (!TextUnitType.m1062equalsimpl0(TextUnit.m1058getTypeUIouoOA(j), 4294967296L)) {
            InlineClassHelperKt.throwIllegalStateException("Only Sp can convert to Px");
        }
        float[] fArr = FontScaleConverterFactory.CommonFontSizes;
        if (getFontScale() < 1.03f) {
            return getFontScale() * TextUnit.m1059getValueimpl(j);
        }
        FontScaleConverter forScale = FontScaleConverterFactory.forScale(getFontScale());
        if (forScale != null) {
            return forScale.convertSpToDp(TextUnit.m1059getValueimpl(j));
        }
        return getFontScale() * TextUnit.m1059getValueimpl(j);
    }

    /* renamed from: toDp-u2uoSUM */
    default float mo233toDpu2uoSUM(int i) {
        return i / getDensity();
    }

    /* renamed from: toDpSize-k-rfVVM */
    default long mo234toDpSizekrfVVM(long j) {
        if (j != 9205357640488583168L) {
            return BundleKt.m1091DpSizeYgX7TsA(mo232toDpu2uoSUM(Float.intBitsToFloat((int) (j >> 32))), mo232toDpu2uoSUM(Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax))));
        }
        return 9205357640488583168L;
    }

    /* renamed from: toPx--R2X_6o */
    default float mo235toPxR2X_6o(long j) {
        if (!TextUnitType.m1062equalsimpl0(TextUnit.m1058getTypeUIouoOA(j), 4294967296L)) {
            InlineClassHelperKt.throwIllegalStateException("Only Sp can convert to Px");
        }
        return mo236toPx0680j_4(mo231toDpGaN1DYA(j));
    }

    /* renamed from: toPx-0680j_4 */
    default float mo236toPx0680j_4(float f) {
        return getDensity() * f;
    }

    /* renamed from: toSize-XkaWNTQ */
    default long mo237toSizeXkaWNTQ(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float mo236toPx0680j_4 = mo236toPx0680j_4(DpSize.m1044getWidthD9Ej5fM(j));
        float mo236toPx0680j_42 = mo236toPx0680j_4(DpSize.m1043getHeightD9Ej5fM(j));
        return (Float.floatToRawIntBits(mo236toPx0680j_4) << 32) | (Float.floatToRawIntBits(mo236toPx0680j_42) & BodyPartID.bodyIdMax);
    }

    /* renamed from: toSp-0xMU5do */
    default long mo238toSp0xMU5do(float f) {
        float[] fArr = FontScaleConverterFactory.CommonFontSizes;
        if (getFontScale() < 1.03f) {
            return Room.pack(4294967296L, f / getFontScale());
        }
        FontScaleConverter forScale = FontScaleConverterFactory.forScale(getFontScale());
        return Room.pack(4294967296L, forScale != null ? forScale.convertDpToSp(f) : f / getFontScale());
    }

    /* renamed from: toSp-kPz2Gy4 */
    default long mo239toSpkPz2Gy4(float f) {
        return mo238toSp0xMU5do(mo232toDpu2uoSUM(f));
    }

    /* renamed from: toDp-u2uoSUM */
    default float mo232toDpu2uoSUM(float f) {
        return f / getDensity();
    }
}
