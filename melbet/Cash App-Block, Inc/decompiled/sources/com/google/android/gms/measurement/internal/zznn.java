package com.google.android.gms.measurement.internal;

import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.common.util.DefaultClock;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import org.intellij.markdown.MarkdownElementType;

/* loaded from: classes.dex */
public final class zznn extends zzos {
    public final zzhe zza;
    public final zzhe zzb;
    public final zzhe zzc;
    public final zzhe zzd;
    public final zzhe zze;
    public final zzhe zzf;
    public final HashMap zzh;

    public zznn(zzpg zzpgVar) {
        super(zzpgVar);
        this.zzh = new HashMap();
        zzhh zzhhVar = ((zzic) this.$$delegate_0).zzh;
        zzic.zzN(zzhhVar);
        this.zza = new zzhe(zzhhVar, "last_delete_stale", 0L);
        zzhh zzhhVar2 = ((zzic) this.$$delegate_0).zzh;
        zzic.zzN(zzhhVar2);
        this.zzb = new zzhe(zzhhVar2, "last_delete_stale_batch", 0L);
        zzhh zzhhVar3 = ((zzic) this.$$delegate_0).zzh;
        zzic.zzN(zzhhVar3);
        this.zzc = new zzhe(zzhhVar3, "backoff", 0L);
        zzhh zzhhVar4 = ((zzic) this.$$delegate_0).zzh;
        zzic.zzN(zzhhVar4);
        this.zzd = new zzhe(zzhhVar4, "last_upload", 0L);
        zzhh zzhhVar5 = ((zzic) this.$$delegate_0).zzh;
        zzic.zzN(zzhhVar5);
        this.zze = new zzhe(zzhhVar5, "last_upload_attempt", 0L);
        zzhh zzhhVar6 = ((zzic) this.$$delegate_0).zzh;
        zzic.zzN(zzhhVar6);
        this.zzf = new zzhe(zzhhVar6, "midnight_offset", 0L);
    }

    @Override // com.google.android.gms.measurement.internal.zzos
    public final void zzbc() {
    }

    public final Pair zzc(zzr zzrVar, zzjl zzjlVar) {
        String str = zzrVar.zza;
        zzae.checkNotEmpty(str);
        return (zzjlVar.zzo(zzjk.AD_STORAGE) && zzrVar.zzn) ? zzd(str) : new Pair("", Boolean.FALSE);
    }

    public final Pair zzd(String str) {
        zznm zznmVar;
        MarkdownElementType markdownElementType;
        zzg();
        zzic zzicVar = (zzic) this.$$delegate_0;
        DefaultClock defaultClock = zzicVar.zzn;
        zzal zzalVar = zzicVar.zzg;
        defaultClock.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = this.zzh;
        zznm zznmVar2 = (zznm) hashMap.get(str);
        if (zznmVar2 != null && elapsedRealtime < zznmVar2.zzc) {
            return new Pair(zznmVar2.zza, Boolean.valueOf(zznmVar2.zzb));
        }
        long zzl = zzalVar.zzl(str, zzfy.zza) + elapsedRealtime;
        try {
            try {
                markdownElementType = AdvertisingIdClient.getAdvertisingIdInfo(zzicVar.zzd);
            } catch (PackageManager.NameNotFoundException unused) {
                if (zznmVar2 != null && elapsedRealtime < zznmVar2.zzc + zzalVar.zzl(str, zzfy.zzb)) {
                    return new Pair(zznmVar2.zza, Boolean.valueOf(zznmVar2.zzb));
                }
                markdownElementType = null;
            }
        } catch (Exception e) {
            zzgu zzguVar = zzicVar.zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzk.zzb(e, "Unable to get advertising id");
            zznmVar = new zznm(zzl, "", false);
        }
        if (markdownElementType == null) {
            return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String id = markdownElementType.getId();
        zznmVar = id != null ? new zznm(zzl, id, markdownElementType.isLimitAdTrackingEnabled()) : new zznm(zzl, "", markdownElementType.isLimitAdTrackingEnabled());
        hashMap.put(str, zznmVar);
        return new Pair(zznmVar.zza, Boolean.valueOf(zznmVar.zzb));
    }

    public final String zzf(zzr zzrVar, zzjl zzjlVar) {
        String str = zzrVar.zza;
        zzae.checkNotEmpty(str);
        if (!zzjlVar.zzo(zzjk.AD_STORAGE) || !zzrVar.zzn) {
            return "";
        }
        zzg();
        String str2 = (String) zzd(str).first;
        MessageDigest zzQ = zzpp.zzQ();
        if (zzQ == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, zzQ.digest(str2.getBytes())));
    }
}
