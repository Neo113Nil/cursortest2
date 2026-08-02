package com.google.android.libraries.places.internal;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public final class zzbvj {
    public static final Logger zza = Logger.getLogger(zzboy.class.getName());
    public final Object zzb = new Object();
    public final zzbra zzc;

    public zzbvj(zzbra zzbraVar, long j, String str) {
        this.zzc = zzbraVar;
        zzbqn zzbqnVar = new zzbqn();
        zzbqnVar.zza = str.concat(" created");
        zzbqnVar.zzb = zzbqo.zzb;
        zzbqnVar.zzc = Long.valueOf(j);
        zza(zzbqnVar.zze());
    }

    public static void zzc(zzbra zzbraVar, Level level, String str) {
        Logger logger = zza;
        if (logger.isLoggable(level)) {
            String valueOf = String.valueOf(zzbraVar);
            LogRecord logRecord = new LogRecord(level, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(valueOf.length() + 3 + String.valueOf(str).length()), "[", valueOf, "] ", str));
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    public final void zza(zzbqp zzbqpVar) {
        int ordinal = zzbqpVar.zzb.ordinal();
        Level level = ordinal != 2 ? ordinal != 3 ? Level.FINEST : Level.FINE : Level.FINER;
        synchronized (this.zzb) {
        }
        zzc(this.zzc, level, zzbqpVar.zza);
    }
}
