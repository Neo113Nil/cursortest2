package com.google.android.libraries.places.internal;

import com.google.android.gms.auth.api.zbc;
import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes4.dex */
public final class zzche implements Closeable {
    public static final Logger zza = Logger.getLogger(zzchy.class.getName());
    public final zzchy zzb;
    public final zzcha zzc;
    public final zbc zzd;

    public zzche(zzchy zzchyVar, zzcha zzchaVar) {
        Level level = Level.FINE;
        this.zzd = new zbc(22);
        this.zzb = zzchyVar;
        this.zzc = zzchaVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.zzc.close();
        } catch (IOException e) {
            zza.logp(e.getClass().equals(IOException.class) ? Level.FINE : Level.INFO, "io.grpc.okhttp.ExceptionHandlingFrameWriter", "close", "Failed closing connection", (Throwable) e);
        }
    }

    public final void zza(zzcjt zzcjtVar) {
        zbc zbcVar = this.zzd;
        if (zbcVar.zzl()) {
            ((Logger) zbcVar.zba).logp((Level) zbcVar.zbb, "io.grpc.okhttp.OkHttpFrameLogger", "logSettingsAck", "OUTBOUND".concat(" SETTINGS: ack=true"));
        }
        try {
            this.zzc.zza(zzcjtVar);
        } catch (IOException e) {
            this.zzb.zzg(e);
        }
    }

    public final void zzb(int i, zzcje zzcjeVar) {
        this.zzd.zzc(2, i, zzcjeVar);
        try {
            this.zzc.zzb(i, zzcjeVar);
        } catch (IOException e) {
            this.zzb.zzg(e);
        }
    }

    public final void zzc(int i, int i2) {
        long j = (i << 32) | (i2 & BodyPartID.bodyIdMax);
        zbc zbcVar = this.zzd;
        if (zbcVar.zzl()) {
            Logger logger = (Logger) zbcVar.zba;
            Level level = (Level) zbcVar.zbb;
            StringBuilder sb = new StringBuilder(30 + String.valueOf(j).length());
            sb.append("OUTBOUND PING: ack=true bytes=");
            sb.append(j);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logPingAck", sb.toString());
        }
        try {
            this.zzc.zzc(i, i2);
        } catch (IOException e) {
            this.zzb.zzg(e);
        }
    }

    public final void zze() {
        try {
            this.zzc.zze();
        } catch (IOException e) {
            this.zzb.zzg(e);
        }
    }

    public final void zzj(zzcje zzcjeVar, byte[] bArr) {
        zzcls zzclsVar = zzcls.zza;
        this.zzd.zzi(2, 0, zzcjeVar, zzey.zzb(bArr));
        try {
            zzcha zzchaVar = this.zzc;
            zzchaVar.zzj(zzcjeVar, bArr);
            zzchaVar.zze();
        } catch (IOException e) {
            this.zzb.zzg(e);
        }
    }

    public final void zzk(int i, long j) {
        this.zzd.zzj(2, i, j);
        try {
            this.zzc.zzk(i, j);
        } catch (IOException e) {
            this.zzb.zzg(e);
        }
    }
}
