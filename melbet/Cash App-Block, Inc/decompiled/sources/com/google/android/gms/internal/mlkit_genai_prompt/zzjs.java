package com.google.android.gms.internal.mlkit_genai_prompt;

import com.google.android.gms.internal.mlkit_genai_prompt.zzjc;
import java.util.Set;
import java.util.logging.Level;

/* loaded from: classes4.dex */
public abstract class zzjs extends zzjc.zzf {
    public static final zzjo zza;
    public static final zzkr zzb = new zzkr(zzjs.class, 0);
    public volatile int remainingField;
    public volatile Set seenExceptionsField;

    static {
        Throwable th;
        zzjo zzjqVar;
        try {
            zzjqVar = new zzjp();
            th = null;
        } catch (Throwable th2) {
            th = th2;
            zzjqVar = new zzjq();
        }
        Throwable th3 = th;
        zza = zzjqVar;
        if (th3 != null) {
            zzb.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th3);
        }
    }
}
