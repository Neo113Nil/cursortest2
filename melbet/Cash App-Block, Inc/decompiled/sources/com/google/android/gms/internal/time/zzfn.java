package com.google.android.gms.internal.time;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
public abstract class zzfn {
    public static final zzfp zza;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.google.android.gms.internal.time.zzfp] */
    static {
        zzfv zzfvVar;
        try {
            zzfvVar = zzfw.zza;
        } catch (NoClassDefFoundError unused) {
            zzfvVar = null;
        }
        if (zzfvVar == null) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 3; i++) {
                String str = zzfp.zzd[i];
                try {
                    zzfvVar = (zzfp) Class.forName(str).getConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    th = th;
                    sb.append('\n');
                    sb.append(str);
                    sb.append(": ");
                    if (th instanceof InvocationTargetException) {
                        th = th.getCause();
                    }
                    sb.append(th);
                }
            }
            throw new IllegalStateException(sb.insert(0, "No logging platforms found:").toString());
        }
        zza = zzfvVar;
    }
}
