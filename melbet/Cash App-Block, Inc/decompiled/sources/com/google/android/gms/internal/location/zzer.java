package com.google.android.gms.internal.location;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public abstract class zzer implements ModelJsonParser {
    public static final String translatedValue(LocalizedString localizedString) {
        String str;
        if (localizedString == null || (str = localizedString.translated_value) == null || StringsKt.isBlank(str)) {
            return null;
        }
        return str;
    }

    public static void zzc(int i, int i2) {
        String zza;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                zza = zzes.zza("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    a$$ExternalSyntheticBUOutline0.m$3(Boxes$$ExternalSyntheticOutline1.m(i2, "negative size: ", new StringBuilder(String.valueOf(i2).length() + 15)));
                    return;
                }
                zza = zzes.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(zza);
        }
    }

    public static void zze(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? zzf(i, i3, "start index") : (i2 < 0 || i2 > i3) ? zzf(i2, i3, "end index") : zzes.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static String zzf(int i, int i2, String str) {
        if (i < 0) {
            return zzes.zza("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return zzes.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        a$$ExternalSyntheticBUOutline0.m$3(Boxes$$ExternalSyntheticOutline1.m(i2, "negative size: ", new StringBuilder(String.valueOf(i2).length() + 15)));
        return null;
    }
}
