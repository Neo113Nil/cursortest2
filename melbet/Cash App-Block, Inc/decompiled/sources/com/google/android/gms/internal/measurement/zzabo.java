package com.google.android.gms.internal.measurement;

/* loaded from: classes4.dex */
public final class zzabo extends RuntimeException {
    public static zzabo zza(String str, int i, int i2, String str2) {
        return new zzabo(zze(str, i, i2, str2));
    }

    public static zzabo zzb(int i, String str, String str2) {
        return new zzabo(zze(str, i, i + 1, str2));
    }

    public static zzabo zzc(int i, String str, String str2) {
        return new zzabo(zze(str, i, -1, str2));
    }

    public static zzabo zzd(String str) {
        return new zzabo(str);
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
