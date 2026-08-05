package com.google.android.gms.internal.wearable;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public final class zzaj {
    public static String zza(String str, Object... objArr) {
        int indexOf;
        StringBuilder sb = new StringBuilder(str.length() + 16);
        char c = 0;
        int i = 0;
        while (c <= 0 && (indexOf = str.indexOf("%s", i)) != -1) {
            sb.append((CharSequence) str, i, indexOf);
            sb.append(zzb(objArr[0]));
            i = indexOf + 2;
            c = 1;
        }
        sb.append((CharSequence) str, i, str.length());
        if (c <= 0) {
            String str2 = " [";
            for (char c2 = 0; c2 <= 0; c2 = 1) {
                sb.append(str2);
                sb.append(zzb(objArr[0]));
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    private static String zzb(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 1 + String.valueOf(hexString).length());
            sb.append(name);
            sb.append("@");
            sb.append(hexString);
            String sb2 = sb.toString();
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(sb2), (Throwable) e);
            String name2 = e.getClass().getName();
            StringBuilder sb3 = new StringBuilder(sb2.length() + 8 + String.valueOf(name2).length() + 1);
            sb3.append("<");
            sb3.append(sb2);
            sb3.append(" threw ");
            sb3.append(name2);
            sb3.append(">");
            return sb3.toString();
        }
    }
}
