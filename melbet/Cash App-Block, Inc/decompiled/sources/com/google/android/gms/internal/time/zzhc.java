package com.google.android.gms.internal.time;

/* loaded from: classes4.dex */
public final class zzhc extends RuntimeException {
    public static zzhc zza(int i, String str, String str2) {
        return new zzhc(zze(str, i, i + 1, str2));
    }

    public static zzhc zzc(String str, int i, int i2, String str2) {
        return new zzhc(zze(str, i, i2, str2));
    }

    public static String zze(String str, int i, int i2, String str2) {
        if (i2 < 0) {
            i2 = str2.length();
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append(": ");
        if (i > 8) {
            sb.append("...");
            sb.append((CharSequence) str2, i - 5, i);
        } else {
            sb.append((CharSequence) str2, 0, i);
        }
        sb.append('[');
        sb.append(str2.substring(i, i2));
        sb.append(']');
        if (str2.length() - i2 > 8) {
            sb.append((CharSequence) str2, i2, i2 + 5);
            sb.append("...");
        } else {
            sb.append((CharSequence) str2, i2, str2.length());
        }
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
