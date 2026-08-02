package com.google.android.gms.internal.time;

import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes4.dex */
public final class zzem {
    public static final HashSet zza = new HashSet(Arrays.asList(Boolean.class, Byte.class, Short.class, Integer.class, Long.class, Float.class, Double.class));
    public final StringBuilder zzd;
    public boolean zze = false;

    public zzem(StringBuilder sb) {
        this.zzd = sb;
    }

    public static int zzc(int i, String str) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt < ' ' || charAt == '\"' || charAt == '\\') {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final void zza(Object obj, String str) {
        boolean z = this.zze;
        StringBuilder sb = this.zzd;
        if (z) {
            sb.append(' ');
        } else {
            if (sb.length() > 0) {
                sb.append((sb.length() > 1000 || sb.indexOf("\n") != -1) ? '\n' : ' ');
            }
            sb.append("[CONTEXT ");
            this.zze = true;
        }
        sb.append(str);
        sb.append('=');
        if (obj == null) {
            sb.append(true);
            return;
        }
        if (zza.contains(obj.getClass())) {
            sb.append(obj);
            return;
        }
        sb.append('\"');
        String obj2 = obj.toString();
        int i = 0;
        while (true) {
            int zzc = zzc(i, obj2);
            if (zzc == -1) {
                sb.append((CharSequence) obj2, i, obj2.length());
                sb.append('\"');
                return;
            }
            sb.append((CharSequence) obj2, i, zzc);
            i = zzc + 1;
            char charAt = obj2.charAt(zzc);
            if (charAt == '\t') {
                charAt = 't';
            } else if (charAt == '\n') {
                charAt = 'n';
            } else if (charAt == '\r') {
                charAt = 'r';
            } else if (charAt != '\"' && charAt != '\\') {
                sb.append((char) 65533);
            }
            sb.append("\\");
            sb.append(charAt);
        }
    }
}
