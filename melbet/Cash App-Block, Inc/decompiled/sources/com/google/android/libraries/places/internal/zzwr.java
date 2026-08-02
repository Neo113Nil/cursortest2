package com.google.android.libraries.places.internal;

import android.content.Context;
import android.content.res.Configuration;
import android.os.LocaleList;
import androidx.core.os.LocaleListCompat;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.airbnb.lottie.utils.Utils;
import com.google.android.libraries.places.api.Places;
import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import java.text.ParseException;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;

/* loaded from: classes4.dex */
public abstract class zzwr {
    public static final zzez zza = new zzez(1);
    public static final zzez zza$1 = new zzez(7);

    public static boolean zza(int i) {
        return i <= 126 ? i >= 32 || i == 10 || i == 13 || i == 9 || i == 12 : i < 55296 ? i >= 160 : i < 64976 ? i > 57343 : i > 65007 && (i & JpegConstants.COM_MARKER) != 65534 && i <= 1114111;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0024 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String zzb(String str) {
        int length;
        int length2 = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 != length2) {
            int i3 = i2 + 1;
            char charAt = str.charAt(i2);
            if (charAt <= '~') {
                if (charAt >= ' ') {
                    i2 = i3;
                }
                if (charAt < 55296) {
                    if (charAt > 57343) {
                        if (charAt >= 64976) {
                            if (charAt > 65007) {
                                if (charAt >= 65534) {
                                }
                            }
                        }
                        i2 = i3;
                    } else {
                        int codePointAt = Character.codePointAt(str, i2);
                        if (codePointAt >= 65536 && (codePointAt & JpegConstants.COM_MARKER) != 65534) {
                            i2 += 2;
                        }
                    }
                    length = str.length();
                    StringBuilder sb = new StringBuilder(length);
                    while (i < length) {
                    }
                    return sb.toString();
                }
                if (charAt != '\n' && charAt != '\r' && charAt != '\t' && charAt != '\f') {
                    length = str.length();
                    StringBuilder sb2 = new StringBuilder(length);
                    while (i < length) {
                        char charAt2 = str.charAt(i);
                        if (zza(charAt2)) {
                            sb2.append(charAt2);
                            i++;
                        } else {
                            int codePointAt2 = Character.codePointAt(str, i);
                            sb2.appendCodePoint(true != zza(codePointAt2) ? 65533 : codePointAt2);
                            i += Character.charCount(codePointAt2);
                        }
                    }
                    return sb2.toString();
                }
                i2 = i3;
            } else {
                if (charAt < 55296 && charAt >= 160) {
                    i2 = i3;
                }
                if (charAt < 55296) {
                }
            }
        }
        return str;
    }

    public static List zzc(String str, Map map) {
        List zza2 = zza(str, map);
        if (zza2 == null) {
            return null;
        }
        for (int i = 0; i < zza2.size(); i++) {
            if (!(zza2.get(i) instanceof String)) {
                throw new ClassCastException(String.format(Locale.US, "value '%s' for idx %d in '%s' is not string", zza2.get(i), Integer.valueOf(i), zza2));
            }
        }
        return zza2;
    }

    public static Map zzd(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Map) {
            return (Map) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not object", obj, str, map));
    }

    public static String zze(Context context, int i) {
        Locale locale;
        zznj zznjVar;
        Object obj = PlatformKt.getLocales(context.getResources().getConfiguration()).get(0);
        if (obj == null) {
            obj = Locale.getDefault();
        }
        if (Places.isInitialized()) {
            synchronized (Places.class) {
                zznjVar = Places.zza;
            }
            locale = zznjVar.zzf();
        } else {
            locale = obj;
        }
        if (locale.equals(obj)) {
            return context.getString(i);
        }
        LocaleListCompat forLanguageTags = LocaleListCompat.forLanguageTags(locale.toLanguageTag());
        Configuration configuration = context.getResources().getConfiguration();
        configuration.setLocales((LocaleList) forLanguageTags.unwrap());
        return context.createConfigurationContext(configuration).getString(i);
    }

    public static Integer zzf(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Double) {
            Double d = (Double) obj;
            int intValue = d.intValue();
            if (intValue == d.doubleValue()) {
                return Integer.valueOf(intValue);
            }
            new StringBuilder(String.valueOf(d).length() + 31);
            throw new ClassCastException("Number expected to be integer: ".concat(String.valueOf(d)));
        }
        if (!(obj instanceof String)) {
            JWK$$ExternalSyntheticBUOutline0.m("value '%s' for key '%s' is not an integer", new Object[]{obj, str});
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) obj));
        } catch (NumberFormatException unused) {
            JWK$$ExternalSyntheticBUOutline0.m("value '%s' for key '%s' is not an integer", new Object[]{obj, str});
            return null;
        }
    }

    public static String zzg(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not String", obj, str, map));
    }

    public static Long zzh(String str, Map map) {
        boolean z;
        int i;
        String zzg = zzg(str, map);
        if (zzg == null) {
            return null;
        }
        try {
            if (zzg.isEmpty() || zzg.charAt(zzg.length() - 1) != 's') {
                throw new ParseException("Invalid duration string: ".concat(zzg), 0);
            }
            if (zzg.charAt(0) == '-') {
                zzg = zzg.substring(1);
                z = true;
            } else {
                z = false;
            }
            String substring = zzg.substring(0, zzg.length() - 1);
            String str2 = "";
            int indexOf = substring.indexOf(46);
            if (indexOf != -1) {
                str2 = substring.substring(indexOf + 1);
                substring = substring.substring(0, indexOf);
            }
            long parseLong = Long.parseLong(substring);
            if (str2.isEmpty()) {
                i = 0;
            } else {
                i = 0;
                for (int i2 = 0; i2 < 9; i2++) {
                    i *= 10;
                    if (i2 < str2.length()) {
                        if (str2.charAt(i2) < '0' || str2.charAt(i2) > '9') {
                            throw new ParseException("Invalid nanoseconds.", 0);
                        }
                        i = (str2.charAt(i2) - '0') + i;
                    }
                }
            }
            if (parseLong < 0) {
                throw new ParseException("Invalid duration string: ".concat(zzg), 0);
            }
            if (z) {
                parseLong = -parseLong;
                i = -i;
            }
            if (i <= -1000000000 || i >= 1000000000) {
                try {
                    parseLong = Math.addExact(parseLong, i / Utils.SECOND_IN_NANOS);
                    i %= Utils.SECOND_IN_NANOS;
                } catch (IllegalArgumentException unused) {
                    throw new ParseException("Duration value is out of range.", 0);
                }
            }
            if (parseLong > 0 && i < 0) {
                i += Utils.SECOND_IN_NANOS;
                parseLong--;
            }
            if (parseLong < 0 && i > 0) {
                i -= 1000000000;
                parseLong++;
            }
            if (parseLong < -315576000000L || parseLong > 315576000000L) {
                throw new IllegalArgumentException("Duration is not valid. See proto definition for valid values. Seconds (" + parseLong + ") must be in range [-315,576,000,000, +315,576,000,000]. Nanos (" + i + ") must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds");
            }
            long nanos = TimeUnit.SECONDS.toNanos(parseLong);
            long j = i;
            long j2 = nanos + j;
            if (!(((nanos ^ j2) >= 0) | ((j ^ nanos) < 0))) {
                j2 = ((j2 >>> 63) ^ 1) + Long.MAX_VALUE;
            }
            return Long.valueOf(j2);
        } catch (ParseException e) {
            a$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }

    public static Boolean zzi(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not Boolean", obj, str, map));
    }

    public static void zzj(List list) {
        for (int i = 0; i < list.size(); i++) {
            if (!(list.get(i) instanceof Map)) {
                throw new ClassCastException(String.format(Locale.US, "value %s for idx %d in %s is not object", list.get(i), Integer.valueOf(i), list));
            }
        }
    }

    public static final int zza(zzcmb zzcmbVar, int i) {
        int i2;
        int[] iArr = zzcmbVar.zzc;
        int length = zzcmbVar.zzb.length;
        iArr.getClass();
        int i3 = length - 1;
        int i4 = 0;
        while (true) {
            if (i4 <= i3) {
                int i5 = i + 1;
                i2 = (i4 + i3) >>> 1;
                int i6 = iArr[i2];
                if (i6 >= i5) {
                    if (i6 <= i5) {
                        break;
                    }
                    i3 = i2 - 1;
                } else {
                    i4 = i2 + 1;
                }
            } else {
                i2 = (-i4) - 1;
                break;
            }
        }
        return i2 >= 0 ? i2 : ~i2;
    }

    public static List zza(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof List) {
            return (List) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not List", obj, str, map));
    }

    public static Double zze(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
                JWK$$ExternalSyntheticBUOutline0.m("value '%s' for key '%s' is not a double", new Object[]{obj, str});
                return null;
            }
        }
        JWK$$ExternalSyntheticBUOutline0.m("value '%s' for key '%s' in '%s' is not a number", new Object[]{obj, str, map});
        return null;
    }
}
