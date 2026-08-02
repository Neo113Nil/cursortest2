package com.google.android.gms.internal.time;

/* loaded from: classes4.dex */
public abstract class zzhe {
    public static final String[] zza = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};
    public static final zzhj zzb;

    static {
        zzhj zzhjVar;
        int i = 0;
        while (true) {
            if (i >= 2) {
                zzhjVar = new zzhj();
                break;
            }
            zzhjVar = null;
            try {
                zzhjVar = (zzhj) Class.forName(zza[i]).asSubclass(zzhj.class).getDeclaredConstructor(null).newInstance(null);
            } catch (Throwable unused) {
            }
            if (zzhjVar != null) {
                break;
            } else {
                i++;
            }
        }
        zzb = zzhjVar;
    }
}
