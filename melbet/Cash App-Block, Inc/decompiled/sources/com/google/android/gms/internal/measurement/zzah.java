package com.google.android.gms.internal.measurement;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.featuretoggle.UnleashContext;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class zzah implements zzao {
    public final Double zza;

    public zzah(Double d) {
        if (d == null) {
            this.zza = Double.valueOf(Double.NaN);
        } else {
            this.zza = d;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzah) {
            return this.zza.equals(((zzah) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return zzc();
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final String zzc() {
        Double d = this.zza;
        if (Double.isNaN(d.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(d.doubleValue())) {
            return d.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal stripTrailingZeros = BigDecimal.valueOf(d.doubleValue()).stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((stripTrailingZeros.scale() > 0 ? stripTrailingZeros.precision() : stripTrailingZeros.scale()) - 1);
        String format2 = decimalFormat.format(stripTrailingZeros);
        int indexOf = format2.indexOf("E");
        if (indexOf <= 0) {
            return format2;
        }
        int parseInt = Integer.parseInt(format2.substring(indexOf + 1));
        return ((parseInt >= 0 || parseInt <= -7) && (parseInt < 0 || parseInt >= 21)) ? format2.replace("E-", "e-").replace("E", "e+") : stripTrailingZeros.toPlainString();
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final zzao zzcG(String str, UnleashContext unleashContext, ArrayList arrayList) {
        if ("toString".equals(str)) {
            return new zzas(zzc());
        }
        a$$ExternalSyntheticBUOutline0.m$3(Boxes$$ExternalSyntheticOutline1.m(zzc(), ".", str, " is not a function."));
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Double zzd() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Boolean zze() {
        Double d = this.zza;
        boolean z = false;
        if (!Double.isNaN(d.doubleValue()) && d.doubleValue() != 0.0d) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Iterator zzf() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final zzao zzt() {
        return new zzah(this.zza);
    }
}
