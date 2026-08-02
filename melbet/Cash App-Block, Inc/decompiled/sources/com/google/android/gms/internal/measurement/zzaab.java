package com.google.android.gms.internal.measurement;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public abstract class zzaab {
    public static final zzaad zza;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.google.android.gms.internal.measurement.zzaad] */
    static {
        zzaaj zzaajVar;
        try {
            zzaajVar = zzaak.zza;
        } catch (NoClassDefFoundError unused) {
            zzaajVar = null;
        }
        if (zzaajVar == null) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 3; i++) {
                String str = zzaad.zzd[i];
                try {
                    zzaajVar = (zzaad) Class.forName(str).getConstructor(null).newInstance(null);
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
        zza = zzaajVar;
    }
}
