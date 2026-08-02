package com.google.android.gms.internal.time;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes4.dex */
public abstract class zzer {
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
            return obj2 != null ? obj2 : zzd(obj, "toString() returned null");
        } catch (RuntimeException e) {
            try {
                simpleName = e.toString();
            } catch (RuntimeException e2) {
                simpleName = e2.getClass().getSimpleName();
            }
            return zzd(obj, simpleName);
        }
    }

    public static String zzd(Object obj, String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m("{", System.identityHashCode(obj), obj.getClass().getName(), "@", ": "), str, "}");
    }

    public static void zzf(StringBuilder sb, long j, boolean z) {
        if (j == 0) {
            sb.append("0");
            return;
        }
        String str = true != z ? "0123456789abcdef" : "0123456789ABCDEF";
        for (int numberOfLeadingZeros = (63 - Long.numberOfLeadingZeros(j)) & (-4); numberOfLeadingZeros >= 0; numberOfLeadingZeros -= 4) {
            sb.append(str.charAt((int) ((j >>> numberOfLeadingZeros) & 15)));
        }
    }
}
