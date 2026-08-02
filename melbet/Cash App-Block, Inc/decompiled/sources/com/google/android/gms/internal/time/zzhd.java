package com.google.android.gms.internal.time;

/* loaded from: classes4.dex */
public abstract class zzhd {
    public static final String zza;

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000c, code lost:
    
        if (r0.matches("\\n|\\r(?:\\n)?") == false) goto L4;
     */
    static {
        String str;
        try {
            str = System.getProperty("line.separator");
        } catch (SecurityException unused) {
        }
        str = "\n";
        zza = str;
    }

    public static void zzd(int i, int i2, String str, StringBuilder sb) {
        int i3 = i;
        while (i < i2) {
            int i4 = i + 1;
            if (str.charAt(i) == '%') {
                if (i4 == i2) {
                    break;
                }
                char charAt = str.charAt(i4);
                if (charAt == '%') {
                    sb.append((CharSequence) str, i3, i4);
                } else if (charAt == 'n') {
                    sb.append((CharSequence) str, i3, i);
                    sb.append(zza);
                }
                i3 = i + 2;
                i = i3;
            }
            i = i4;
        }
        if (i3 < i2) {
            sb.append((CharSequence) str, i3, i2);
        }
    }

    public static int zze(int i, String str) {
        while (i < str.length()) {
            int i2 = i + 1;
            if (str.charAt(i) != '%') {
                i = i2;
            } else {
                if (i2 >= str.length()) {
                    throw new zzhc(zzhc.zze("trailing unquoted '%' character", i, -1, str));
                }
                char charAt = str.charAt(i2);
                if (charAt != '%' && charAt != 'n') {
                    return i;
                }
                i += 2;
            }
        }
        return -1;
    }
}
