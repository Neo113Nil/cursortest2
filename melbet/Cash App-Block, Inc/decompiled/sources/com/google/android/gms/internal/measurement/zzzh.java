package com.google.android.gms.internal.measurement;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class zzzh {
    public static final Locale zza = Locale.ROOT;

    public static String zza(Object obj) {
        String simpleName;
        if (obj == null) {
            return "null";
        }
        try {
            if (obj.getClass().isArray()) {
                return obj instanceof int[] ? Arrays.toString((int[]) obj) : obj instanceof long[] ? Arrays.toString((long[]) obj) : obj instanceof byte[] ? Arrays.toString((byte[]) obj) : obj instanceof char[] ? Arrays.toString((char[]) obj) : obj instanceof short[] ? Arrays.toString((short[]) obj) : obj instanceof float[] ? Arrays.toString((float[]) obj) : obj instanceof double[] ? Arrays.toString((double[]) obj) : obj instanceof boolean[] ? Arrays.toString((boolean[]) obj) : Arrays.toString((Object[]) obj);
            }
            String obj2 = obj.toString();
            return obj2 != null ? obj2 : zzf(obj, "toString() returned null");
        } catch (RuntimeException e) {
            try {
                simpleName = e.toString();
            } catch (RuntimeException e2) {
                simpleName = e2.getClass().getSimpleName();
            }
            return zzf(obj, simpleName);
        }
    }

    public static void zzd(StringBuilder sb, long j, boolean z) {
        if (j == 0) {
            sb.append("0");
            return;
        }
        String str = true != z ? "0123456789abcdef" : "0123456789ABCDEF";
        for (int numberOfLeadingZeros = (63 - Long.numberOfLeadingZeros(j)) & (-4); numberOfLeadingZeros >= 0; numberOfLeadingZeros -= 4) {
            sb.append(str.charAt((int) ((j >>> numberOfLeadingZeros) & 15)));
        }
    }

    public static String zzf(Object obj, String str) {
        String name = obj.getClass().getName();
        int identityHashCode = System.identityHashCode(obj);
        int length = name.length();
        StringBuilder sb = new StringBuilder(length + 2 + String.valueOf(identityHashCode).length() + 2 + String.valueOf(str).length() + 1);
        sb.append("{");
        sb.append(name);
        sb.append("@");
        sb.append(identityHashCode);
        return Recorder$$ExternalSyntheticOutline2.m(sb, ": ", str, "}");
    }
}
