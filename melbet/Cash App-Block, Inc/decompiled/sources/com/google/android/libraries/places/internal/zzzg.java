package com.google.android.libraries.places.internal;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
public abstract class zzzg {
    public static final zzzi zza;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.google.android.libraries.places.internal.zzzi] */
    static {
        zzzo zzzoVar;
        try {
            zzzoVar = zzzp.zza;
        } catch (NoClassDefFoundError unused) {
            zzzoVar = null;
        }
        if (zzzoVar == null) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 3; i++) {
                String str = zzzi.zzd[i];
                try {
                    zzzoVar = (zzzi) Class.forName(str).getConstructor(null).newInstance(null);
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
        zza = zzzoVar;
    }
}
