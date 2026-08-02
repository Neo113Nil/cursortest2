package com.ionspin.kotlin.bignum.decimal;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import org.bouncycastle.math.raw.Mod$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class DecimalMode {
    public static final DecimalMode DEFAULT = new DecimalMode(0L, (RoundingMode) null, 7);
    public final long decimalPrecision;
    public final boolean isPrecisionUnlimited;
    public final RoundingMode roundingMode;
    public final long scale;
    public final boolean usingScale;

    static {
        new DecimalMode(30L, RoundingMode.ROUND_HALF_AWAY_FROM_ZERO, 2L);
    }

    public DecimalMode(long j, RoundingMode roundingMode, long j2) {
        roundingMode.getClass();
        this.decimalPrecision = j;
        this.roundingMode = roundingMode;
        this.scale = j2;
        if (j < 0) {
            Mod$$ExternalSyntheticBUOutline0.m$2("Negative decimal precision is not allowed.");
            throw null;
        }
        this.isPrecisionUnlimited = j == 0;
        boolean z = j2 >= 0;
        this.usingScale = z;
        if (!z && j == 0 && roundingMode != RoundingMode.NONE) {
            Mod$$ExternalSyntheticBUOutline0.m$2("Rounding mode with 0 digits precision.");
            throw null;
        }
        if (j2 < -1) {
            Mod$$ExternalSyntheticBUOutline0.m$2("Negative Scale is unsupported.");
            throw null;
        }
        if (z && roundingMode == RoundingMode.NONE) {
            Mod$$ExternalSyntheticBUOutline0.m$2(Boxes$$ExternalSyntheticOutline1.m(j2, "Scale of ", " digits to the right of the decimal requires a RoundingMode that is not NONE."));
            throw null;
        }
    }

    public static DecimalMode copy$default(DecimalMode decimalMode, long j) {
        RoundingMode roundingMode = decimalMode.roundingMode;
        long j2 = decimalMode.scale;
        decimalMode.getClass();
        roundingMode.getClass();
        return new DecimalMode(j, roundingMode, j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DecimalMode)) {
            return false;
        }
        DecimalMode decimalMode = (DecimalMode) obj;
        return this.decimalPrecision == decimalMode.decimalPrecision && this.roundingMode == decimalMode.roundingMode && this.scale == decimalMode.scale;
    }

    public final int hashCode() {
        return Long.hashCode(this.scale) + ((this.roundingMode.hashCode() + (Long.hashCode(this.decimalPrecision) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DecimalMode(decimalPrecision=");
        sb.append(this.decimalPrecision);
        sb.append(", roundingMode=");
        sb.append(this.roundingMode);
        return Boxes$$ExternalSyntheticOutline1.m(this.scale, ", scale=", ")", sb);
    }

    public /* synthetic */ DecimalMode(long j, RoundingMode roundingMode, int i) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? RoundingMode.NONE : roundingMode, -1L);
    }
}
