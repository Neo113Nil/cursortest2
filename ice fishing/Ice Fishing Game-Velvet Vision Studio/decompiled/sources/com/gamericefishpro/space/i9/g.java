package com.gamericefishpro.space.i9;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements n {
    public final Double d;

    public g(Double d) {
        if (d == null) {
            this.d = Double.valueOf(Double.NaN);
        } else {
            this.d = d;
        }
    }

    @Override // com.gamericefishpro.space.i9.n
    public final Boolean b() {
        Double d = this.d;
        boolean z = false;
        if (!Double.isNaN(d.doubleValue()) && d.doubleValue() != 0.0d) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // com.gamericefishpro.space.i9.n
    public final Double c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            return this.d.equals(((g) obj).d);
        }
        return false;
    }

    @Override // com.gamericefishpro.space.i9.n
    public final Iterator h() {
        return null;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // com.gamericefishpro.space.i9.n
    public final n l(String str, com.gamericefishpro.space.u6.n nVar, ArrayList arrayList) {
        if ("toString".equals(str)) {
            return new q(m());
        }
        throw new IllegalArgumentException(m() + "." + str + " is not a function.");
    }

    @Override // com.gamericefishpro.space.i9.n
    public final String m() {
        Double d = this.d;
        if (Double.isNaN(d.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(d.doubleValue())) {
            return d.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(d.doubleValue());
        BigDecimal bigDecimal = bigDecimalValueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalValueOf.stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimal.scale() > 0 ? bigDecimal.precision() : bigDecimal.scale()) - 1);
        String str = decimalFormat.format(bigDecimal);
        int iIndexOf = str.indexOf("E");
        if (iIndexOf <= 0) {
            return str;
        }
        int i = Integer.parseInt(str.substring(iIndexOf + 1));
        return ((i >= 0 || i <= -7) && (i < 0 || i >= 21)) ? str.replace("E-", "e-").replace("E", "e+") : bigDecimal.toPlainString();
    }

    @Override // com.gamericefishpro.space.i9.n
    public final n o() {
        return new g(this.d);
    }

    public final String toString() {
        return m();
    }
}
