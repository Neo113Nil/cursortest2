package com.google.android.gms.common.wrappers;

import android.content.Context;
import com.bugsnag.android.internal.dag.ContextModule;

/* loaded from: classes.dex */
public final class Wrappers {
    public static final Wrappers zzb;
    public ContextModule zza;

    static {
        Wrappers wrappers = new Wrappers();
        wrappers.zza = null;
        zzb = wrappers;
    }

    public static ContextModule packageManager(Context context) {
        ContextModule contextModule;
        Wrappers wrappers = zzb;
        synchronized (wrappers) {
            try {
                if (wrappers.zza == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    wrappers.zza = new ContextModule(context, (byte) 0);
                }
                contextModule = wrappers.zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return contextModule;
    }
}
