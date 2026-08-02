package com.google.android.libraries.places.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.EnumSet;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocketFactory;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class zzchm extends zzbqf {
    public static final zzciq zza;
    public static final zzfv zzb;
    public final zzccd zzd;
    public SSLSocketFactory zzi;
    public final zzcar zze = zzcgr.zza;
    public final zzfv zzg = zzb;
    public final zzfv zzh = new zzfv(zzbzg.zzn, 9);
    public final zzciq zzj = zza;
    public int zzl = 1;
    public final long zzk = zzbzg.zzj;

    static {
        Logger.getLogger(zzchm.class.getName());
        zzcaf zzcafVar = new zzcaf(zzciq.zza);
        zzcio[] zzcioVarArr = {zzcio.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, zzcio.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, zzcio.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, zzcio.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, zzcio.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, zzcio.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256};
        String[] strArr = new String[6];
        for (int i = 0; i < 6; i++) {
            strArr[i] = zzcioVarArr[i].zzbb;
        }
        zzcafVar.zza = strArr;
        zzcafVar.zzc = new String[]{new zzcjc[]{zzcjc.TLS_1_2}[0].zzf};
        zzcafVar.zzb = true;
        zza = new zzciq(zzcafVar);
        zzb = new zzfv(new zzchh(), 9);
        EnumSet.of(zzbuh.zzb, zzbuh.zzc);
    }

    public zzchm(String str) {
        this.zzd = new zzccd(str, new zzchi(this), new zzchi(this));
    }

    public static zzchm zze(String str) {
        String str2;
        Logger logger = zzbzg.zzp;
        try {
            str2 = str;
        } catch (URISyntaxException e) {
            e = e;
            str2 = str;
        }
        try {
            return new zzchm(new URI(null, null, str2, 443, null, null, null).getAuthority());
        } catch (URISyntaxException e2) {
            e = e2;
            Handlers$$ExternalSyntheticBUOutline0.m(Recorder$$ExternalSyntheticOutline2.m(new StringBuilder(str2.length() + 26), "Invalid host or port: ", str2, " 443"), e);
            return null;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbqf
    public final zzccd zza() {
        return this.zzd;
    }
}
