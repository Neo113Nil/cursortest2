package com.google.android.libraries.places.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.Closeable;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public final class zzcjp implements Closeable {
    public final zzclx zza;
    public final zzclo zzb;
    public final zzcjk zzc;
    public int zzd;
    public boolean zze;

    public zzcjp(zzclx zzclxVar) {
        this.zza = zzclxVar;
        zzclo zzcloVar = new zzclo();
        this.zzb = zzcloVar;
        this.zzc = new zzcjk(zzcloVar);
        this.zzd = 16384;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.zze = true;
        this.zza.close();
    }

    public final void zzl(int i, int i2, byte b, byte b2) {
        Logger logger = zzcjq.zza;
        Level level = Level.FINE;
        if (logger.isLoggable(level)) {
            logger.logp(level, "io.grpc.okhttp.internal.framed.Http2$Writer", "frameHeader", zzcjn.zza(false, i, i2, b, b2));
        }
        int i3 = this.zzd;
        if (i2 > i3) {
            Locale locale = Locale.US;
            a$$ExternalSyntheticBUOutline0.m$3(Recorder$$ExternalSyntheticOutline2.m("FRAME_SIZE_ERROR length > ", i3, i2, ": "));
            return;
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            Locale locale2 = Locale.US;
            a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "reserved bit set: "));
            return;
        }
        zzclx zzclxVar = this.zza;
        zzclxVar.zzJ((i2 >>> 16) & 255);
        zzclxVar.zzJ((i2 >>> 8) & 255);
        zzclxVar.zzJ(i2 & 255);
        zzclxVar.zzJ(b);
        zzclxVar.zzJ(b2);
        zzclxVar.zzL(i & Integer.MAX_VALUE);
    }
}
