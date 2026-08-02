package com.google.android.libraries.places.internal;

import androidx.room.TransactorKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public final class zzcko {
    public static final zzboq zza;
    public static final Logger zzb = Logger.getLogger(zzcko.class.getName());

    static {
        if (!TransactorKt.stringIsNullOrEmpty(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"))) {
            Boolean.parseBoolean(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"));
        }
        zza = new zzboq("internal-stub-type", 1);
    }

    private zzcko() {
    }

    public static zzckj zzb(zzbpa zzbpaVar, zzbjr zzbjrVar) {
        zzckj zzckjVar = new zzckj(zzbpaVar);
        zzaza zzazaVar = new zzaza(zzckjVar);
        zzbpaVar.zza(zzazaVar, new zzbsn());
        ((zzckj) zzazaVar.zzc).zza.zzc(2);
        try {
            zzbpaVar.zzb(zzbjrVar);
            zzbpaVar.zzd();
            return zzckjVar;
        } catch (Error | RuntimeException e) {
            try {
                zzbpaVar.zze(null, e);
            } catch (Error | RuntimeException e2) {
                zzb.logp(Level.SEVERE, "io.grpc.stub.ClientCalls", "cancelThrow", "RuntimeException encountered while closing call", e2);
            }
            if (e instanceof RuntimeException) {
                throw ((RuntimeException) e);
            }
            if (e instanceof Error) {
                throw ((Error) e);
            }
            a$$ExternalSyntheticBUOutline0.m$1(e);
            return null;
        }
    }
}
