package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.core.view.PointerIconCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
final class zzko extends zzm implements zzjj {
    public static final /* synthetic */ int zzd = 0;
    private final zzmo zzA;
    private final long zzB;
    private int zzC;
    private int zzD;
    private boolean zzE;
    private int zzF;
    private zzmj zzG;
    private zzck zzH;
    private zzbv zzI;
    private zzbv zzJ;
    private zzam zzK;
    private zzam zzL;
    private Object zzM;
    private Surface zzN;
    private int zzO;
    private zzfq zzP;
    private zzir zzQ;
    private zzir zzR;
    private int zzS;
    private zzk zzT;
    private float zzU;
    private boolean zzV;
    private zzee zzW;
    private boolean zzX;
    private boolean zzY;
    private zzaa zzZ;
    private zzdp zzaa;
    private zzbv zzab;
    private zzly zzac;
    private int zzad;
    private long zzae;
    private final zzjk zzaf;
    private zzwk zzag;
    final zzyp zzb;
    final zzck zzc;
    private final zzeo zze;
    private final Context zzf;
    private final zzco zzg;
    private final zzmf[] zzh;
    private final zzyo zzi;
    private final zzew zzj;
    private final zzkz zzk;
    private final zzfc zzl;
    private final CopyOnWriteArraySet zzm;
    private final zzcu zzn;
    private final List zzo;
    private final boolean zzp;
    private final zzuq zzq;
    private final zzmp zzr;
    private final Looper zzs;
    private final zzyw zzt;
    private final zzel zzu;
    private final zzkk zzv;
    private final zzkm zzw;
    private final zzil zzx;
    private final zzip zzy;
    private final zzmn zzz;

    static {
        zzbq.zzb("media3.exoplayer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.google.android.gms.internal.ads.zzmp, com.google.android.gms.internal.ads.zzyv, java.lang.Object] */
    public zzko(zzji zzjiVar, zzco zzcoVar) {
        zzeo zzeoVar = new zzeo(zzel.zza);
        this.zze = zzeoVar;
        try {
            zzff.zze("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.2.1] [" + zzfy.zze + "]");
            Context applicationContext = zzjiVar.zza.getApplicationContext();
            this.zzf = applicationContext;
            ?? apply = zzjiVar.zzh.apply(zzjiVar.zzb);
            this.zzr = apply;
            this.zzT = zzjiVar.zzj;
            this.zzO = zzjiVar.zzk;
            this.zzV = false;
            this.zzB = zzjiVar.zzo;
            zzkk zzkkVar = new zzkk(this, null);
            this.zzv = zzkkVar;
            zzkm zzkmVar = new zzkm(null);
            this.zzw = zzkmVar;
            Handler handler = new Handler(zzjiVar.zzi);
            zzmf[] zza = ((zzjb) zzjiVar.zzc).zza.zza(handler, zzkkVar, zzkkVar, zzkkVar, zzkkVar);
            this.zzh = zza;
            int length = zza.length;
            zzyo zzyoVar = (zzyo) zzjiVar.zze.zza();
            this.zzi = zzyoVar;
            this.zzq = zzji.zza(((zzjc) zzjiVar.zzd).zza);
            zzza zzg = zzza.zzg(((zzjf) zzjiVar.zzg).zza);
            this.zzt = zzg;
            this.zzp = zzjiVar.zzl;
            this.zzG = zzjiVar.zzm;
            Looper looper = zzjiVar.zzi;
            this.zzs = looper;
            zzel zzelVar = zzjiVar.zzb;
            this.zzu = zzelVar;
            this.zzg = zzcoVar;
            zzfc zzfcVar = new zzfc(looper, zzelVar, new zzfa() { // from class: com.google.android.gms.internal.ads.zzke
                @Override // com.google.android.gms.internal.ads.zzfa
                public final void zza(Object obj, zzah zzahVar) {
                }
            });
            this.zzl = zzfcVar;
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.zzm = copyOnWriteArraySet;
            this.zzo = new ArrayList();
            this.zzag = new zzwk(0);
            int length2 = zza.length;
            zzyp zzypVar = new zzyp(new zzmi[2], new zzyi[2], zzdk.zza, null);
            this.zzb = zzypVar;
            this.zzn = new zzcu();
            zzci zzciVar = new zzci();
            zzciVar.zzc(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32);
            zzyoVar.zzn();
            zzciVar.zzd(29, true);
            zzciVar.zzd(23, false);
            zzciVar.zzd(25, false);
            zzciVar.zzd(33, false);
            zzciVar.zzd(26, false);
            zzciVar.zzd(34, false);
            zzck zze = zzciVar.zze();
            this.zzc = zze;
            zzci zzciVar2 = new zzci();
            zzciVar2.zzb(zze);
            zzciVar2.zza(4);
            zzciVar2.zza(10);
            this.zzH = zzciVar2.zze();
            this.zzj = zzelVar.zzb(looper, null);
            zzjk zzjkVar = new zzjk(this);
            this.zzaf = zzjkVar;
            this.zzac = zzly.zzg(zzypVar);
            apply.zzR(zzcoVar, looper);
            this.zzk = new zzkz(zza, zzyoVar, zzypVar, (zzlc) zzjiVar.zzf.zza(), zzg, 0, false, apply, this.zzG, zzjiVar.zzr, zzjiVar.zzn, false, looper, zzelVar, zzjkVar, zzfy.zza < 31 ? new zzpb() : zzkf.zza(applicationContext, this, zzjiVar.zzp), null);
            this.zzU = 1.0f;
            this.zzI = zzbv.zza;
            zzbv zzbvVar = zzbv.zza;
            this.zzJ = zzbvVar;
            this.zzab = zzbvVar;
            int i = -1;
            this.zzad = -1;
            AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
            if (audioManager != null) {
                i = audioManager.generateAudioSessionId();
            }
            this.zzS = i;
            this.zzW = zzee.zza;
            this.zzX = true;
            if (apply == 0) {
                throw null;
            }
            zzfcVar.zzb(apply);
            zzg.zze(new Handler(looper), apply);
            copyOnWriteArraySet.add(zzkkVar);
            this.zzx = new zzil(zzjiVar.zza, handler, zzkkVar);
            this.zzy = new zzip(zzjiVar.zza, handler, zzkkVar);
            zzfy.zzF(null, null);
            this.zzz = new zzmn(zzjiVar.zza);
            this.zzA = new zzmo(zzjiVar.zza);
            this.zzZ = new zzy(0).zza();
            this.zzaa = zzdp.zza;
            this.zzP = zzfq.zza;
            zzyoVar.zzk(this.zzT);
            zzag(1, 10, Integer.valueOf(this.zzS));
            zzag(2, 10, Integer.valueOf(this.zzS));
            zzag(1, 3, this.zzT);
            zzag(2, 4, Integer.valueOf(this.zzO));
            zzag(2, 5, 0);
            zzag(1, 9, Boolean.valueOf(this.zzV));
            zzag(2, 7, zzkmVar);
            zzag(6, 8, zzkmVar);
            zzeoVar.zze();
        } catch (Throwable th) {
            this.zze.zze();
            throw th;
        }
    }

    static /* bridge */ /* synthetic */ void zzP(zzko zzkoVar, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        zzkoVar.zzai(surface);
        zzkoVar.zzN = surface;
    }

    private final int zzW(zzly zzlyVar) {
        return zzlyVar.zza.zzo() ? this.zzad : zzlyVar.zza.zzn(zzlyVar.zzb.zza, this.zzn).zzd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzX(boolean z, int i) {
        return (!z || i == 1) ? 1 : 2;
    }

    private final long zzY(zzly zzlyVar) {
        if (!zzlyVar.zzb.zzb()) {
            return zzfy.zzt(zzZ(zzlyVar));
        }
        zzlyVar.zza.zzn(zzlyVar.zzb.zza, this.zzn);
        if (zzlyVar.zzc == -9223372036854775807L) {
            long j = zzlyVar.zza.zze(zzW(zzlyVar), this.zza, 0L).zzn;
            return zzfy.zzt(0L);
        }
        int i = zzfy.zza;
        return zzfy.zzt(0L) + zzfy.zzt(zzlyVar.zzc);
    }

    private final long zzZ(zzly zzlyVar) {
        if (zzlyVar.zza.zzo()) {
            return zzfy.zzq(this.zzae);
        }
        boolean z = zzlyVar.zzo;
        long j = zzlyVar.zzr;
        if (zzlyVar.zzb.zzb()) {
            return j;
        }
        zzab(zzlyVar.zza, zzlyVar.zzb, j);
        return j;
    }

    private static long zzaa(zzly zzlyVar) {
        zzcw zzcwVar = new zzcw();
        zzcu zzcuVar = new zzcu();
        zzlyVar.zza.zzn(zzlyVar.zzb.zza, zzcuVar);
        long j = zzlyVar.zzc;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = zzlyVar.zza.zze(zzcuVar.zzd, zzcwVar, 0L).zzn;
        return 0L;
    }

    private final long zzab(zzcx zzcxVar, zzur zzurVar, long j) {
        zzcxVar.zzn(zzurVar.zza, this.zzn);
        return j;
    }

    private final Pair zzac(zzcx zzcxVar, int i, long j) {
        if (zzcxVar.zzo()) {
            this.zzad = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.zzae = j;
            return null;
        }
        if (i == -1 || i >= zzcxVar.zzc()) {
            i = zzcxVar.zzg(false);
            long j2 = zzcxVar.zze(i, this.zza, 0L).zzn;
            j = zzfy.zzt(0L);
        }
        return zzcxVar.zzl(this.zza, this.zzn, i, zzfy.zzq(j));
    }

    private final zzly zzad(zzly zzlyVar, zzcx zzcxVar, Pair pair) {
        zzek.zzd(zzcxVar.zzo() || pair != null);
        zzcx zzcxVar2 = zzlyVar.zza;
        long zzY = zzY(zzlyVar);
        zzly zzf = zzlyVar.zzf(zzcxVar);
        if (zzcxVar.zzo()) {
            zzur zzh = zzly.zzh();
            long zzq = zzfy.zzq(this.zzae);
            zzly zza = zzf.zzb(zzh, zzq, zzq, zzq, 0L, zzws.zza, this.zzb, zzgaa.zzl()).zza(zzh);
            zza.zzp = zza.zzr;
            return zza;
        }
        Object obj = zzf.zzb.zza;
        int i = zzfy.zza;
        boolean equals = obj.equals(pair.first);
        zzur zzurVar = !equals ? new zzur(pair.first, -1L) : zzf.zzb;
        long longValue = ((Long) pair.second).longValue();
        long zzq2 = zzfy.zzq(zzY);
        if (!zzcxVar2.zzo()) {
            zzcxVar2.zzn(obj, this.zzn);
        }
        if (!equals || longValue < zzq2) {
            zzek.zzf(!zzurVar.zzb());
            zzly zza2 = zzf.zzb(zzurVar, longValue, longValue, longValue, 0L, !equals ? zzws.zza : zzf.zzh, !equals ? this.zzb : zzf.zzi, !equals ? zzgaa.zzl() : zzf.zzj).zza(zzurVar);
            zza2.zzp = longValue;
            return zza2;
        }
        if (longValue != zzq2) {
            zzek.zzf(!zzurVar.zzb());
            long max = Math.max(0L, zzf.zzq - (longValue - zzq2));
            long j = zzf.zzp;
            if (zzf.zzk.equals(zzf.zzb)) {
                j = longValue + max;
            }
            zzly zzb = zzf.zzb(zzurVar, longValue, longValue, longValue, max, zzf.zzh, zzf.zzi, zzf.zzj);
            zzb.zzp = j;
            return zzb;
        }
        int zza3 = zzcxVar.zza(zzf.zzk.zza);
        if (zza3 != -1 && zzcxVar.zzd(zza3, this.zzn, false).zzd == zzcxVar.zzn(zzurVar.zza, this.zzn).zzd) {
            return zzf;
        }
        zzcxVar.zzn(zzurVar.zza, this.zzn);
        long zzh2 = zzurVar.zzb() ? this.zzn.zzh(zzurVar.zzb, zzurVar.zzc) : this.zzn.zze;
        zzly zza4 = zzf.zzb(zzurVar, zzf.zzr, zzf.zzr, zzf.zzd, zzh2 - zzf.zzr, zzf.zzh, zzf.zzi, zzf.zzj).zza(zzurVar);
        zza4.zzp = zzh2;
        return zza4;
    }

    private final zzmb zzae(zzma zzmaVar) {
        int zzW = zzW(this.zzac);
        zzcx zzcxVar = this.zzac.zza;
        if (zzW == -1) {
            zzW = 0;
        }
        zzel zzelVar = this.zzu;
        zzkz zzkzVar = this.zzk;
        return new zzmb(zzkzVar, zzmaVar, zzcxVar, zzW, zzelVar, zzkzVar.zzb());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaf(final int i, final int i2) {
        if (i == this.zzP.zzb() && i2 == this.zzP.zza()) {
            return;
        }
        this.zzP = new zzfq(i, i2);
        zzfc zzfcVar = this.zzl;
        zzfcVar.zzd(24, new zzez() { // from class: com.google.android.gms.internal.ads.zzkb
            @Override // com.google.android.gms.internal.ads.zzez
            public final void zza(Object obj) {
                int i3 = zzko.zzd;
                ((zzcl) obj).zzo(i, i2);
            }
        });
        zzfcVar.zzc();
        zzag(2, 14, new zzfq(i, i2));
    }

    private final void zzag(int i, int i2, Object obj) {
        zzmf[] zzmfVarArr = this.zzh;
        int length = zzmfVarArr.length;
        for (int i3 = 0; i3 < 2; i3++) {
            zzmf zzmfVar = zzmfVarArr[i3];
            if (zzmfVar.zzbj() == i) {
                zzmb zzae = zzae(zzmfVar);
                zzae.zzf(i2);
                zzae.zze(obj);
                zzae.zzd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzah() {
        zzag(1, 2, Float.valueOf(this.zzU * this.zzy.zza()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzai(Object obj) {
        ArrayList arrayList = new ArrayList();
        zzmf[] zzmfVarArr = this.zzh;
        int length = zzmfVarArr.length;
        boolean z = false;
        for (int i = 0; i < 2; i++) {
            zzmf zzmfVar = zzmfVarArr[i];
            if (zzmfVar.zzbj() == 2) {
                zzmb zzae = zzae(zzmfVar);
                zzae.zzf(1);
                zzae.zze(obj);
                zzae.zzd();
                arrayList.add(zzae);
            }
        }
        Object obj2 = this.zzM;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((zzmb) it.next()).zzi(this.zzB);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z = true;
            }
            Object obj3 = this.zzM;
            Surface surface = this.zzN;
            if (obj3 == surface) {
                surface.release();
                this.zzN = null;
            }
        }
        this.zzM = obj;
        if (z) {
            zzaj(zziz.zzd(new zzla(3), PointerIconCompat.TYPE_HELP));
        }
    }

    private final void zzaj(zziz zzizVar) {
        zzly zzlyVar = this.zzac;
        zzly zza = zzlyVar.zza(zzlyVar.zzb);
        zza.zzp = zza.zzr;
        zza.zzq = 0L;
        zzly zze = zza.zze(1);
        if (zzizVar != null) {
            zze = zze.zzd(zzizVar);
        }
        this.zzC++;
        this.zzk.zzo();
        zzal(zze, 0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzak(boolean z, int i, int i2) {
        int i3 = 0;
        boolean z2 = z && i != -1;
        if (z2 && i != 1) {
            i3 = 1;
        }
        zzly zzlyVar = this.zzac;
        if (zzlyVar.zzl == z2 && zzlyVar.zzm == i3) {
            return;
        }
        this.zzC++;
        boolean z3 = zzlyVar.zzo;
        zzly zzc = zzlyVar.zzc(z2, i3);
        this.zzk.zzn(z2, i3);
        zzal(zzc, 0, i2, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0473 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x047d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0488 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0499 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04bc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x04c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00e9  */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzal(final zzly zzlyVar, final int i, final int i2, boolean z, int i3, long j, int i4, boolean z2) {
        int i5;
        boolean z3;
        boolean z4;
        Pair pair;
        boolean z5;
        int i6;
        boolean booleanValue;
        final zzbp zzbpVar;
        zzcx zzn;
        zzbv zzu;
        boolean equals;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        zzyp zzypVar;
        zzyp zzypVar2;
        zzm zzmVar;
        zzcx zzn2;
        zzck zzckVar;
        boolean z10;
        zzcx zzn3;
        ?? r8;
        int i7;
        boolean z11;
        zzcx zzn4;
        boolean z12;
        zzcx zzn5;
        long j2;
        boolean z13;
        int i8;
        boolean z14;
        zzck zze;
        int i9;
        Object obj;
        zzbp zzbpVar2;
        Object obj2;
        int i10;
        long j3;
        long zzaa;
        Object obj3;
        zzbp zzbpVar3;
        Object obj4;
        int i11;
        final int i12 = i3;
        zzly zzlyVar2 = this.zzac;
        this.zzac = zzlyVar;
        boolean equals2 = zzlyVar2.zza.equals(zzlyVar.zza);
        zzcx zzcxVar = zzlyVar2.zza;
        zzcx zzcxVar2 = zzlyVar.zza;
        if (zzcxVar2.zzo() && zzcxVar.zzo()) {
            pair = new Pair(false, -1);
        } else {
            if (zzcxVar2.zzo() == zzcxVar.zzo()) {
                if (zzcxVar.zze(zzcxVar.zzn(zzlyVar2.zzb.zza, this.zzn).zzd, this.zza, 0L).zzc.equals(zzcxVar2.zze(zzcxVar2.zzn(zzlyVar.zzb.zza, this.zzn).zzd, this.zza, 0L).zzc)) {
                    if (!z) {
                        i5 = i12;
                        z3 = false;
                    } else if (i12 != 0) {
                        i5 = i12;
                        z3 = true;
                    } else if (zzlyVar2.zzb.zzd < zzlyVar.zzb.zzd) {
                        pair = new Pair(true, 0);
                        z4 = true;
                        i12 = 0;
                    } else {
                        z3 = true;
                        i5 = 0;
                    }
                    z4 = z3;
                    i12 = i5;
                    pair = new Pair(false, -1);
                } else {
                    if (!z) {
                        z5 = false;
                        z4 = false;
                    } else if (i12 == 0) {
                        i6 = 1;
                        z4 = true;
                        i12 = 0;
                        pair = new Pair(true, Integer.valueOf(i6));
                    } else {
                        z5 = true;
                        z4 = true;
                    }
                    if (z5 && i12 == 1) {
                        i6 = 2;
                    } else {
                        if (equals2) {
                            throw new IllegalStateException();
                        }
                        z4 = z5;
                        i6 = 3;
                    }
                    pair = new Pair(true, Integer.valueOf(i6));
                }
                booleanValue = ((Boolean) pair.first).booleanValue();
                final int intValue = ((Integer) pair.second).intValue();
                if (booleanValue) {
                    zzbpVar = null;
                } else {
                    zzbpVar = !zzlyVar.zza.zzo() ? zzlyVar.zza.zze(zzlyVar.zza.zzn(zzlyVar.zzb.zza, this.zzn).zzd, this.zza, 0L).zze : null;
                    this.zzab = zzbv.zza;
                }
                if (!zzlyVar2.zzj.equals(zzlyVar.zzj)) {
                    zzbt zza = this.zzab.zza();
                    List list = zzlyVar.zzj;
                    for (int i13 = 0; i13 < list.size(); i13++) {
                        zzby zzbyVar = (zzby) list.get(i13);
                        for (int i14 = 0; i14 < zzbyVar.zza(); i14++) {
                            zzbyVar.zzb(i14).zza(zza);
                        }
                    }
                    this.zzab = zza.zzu();
                }
                zzn = zzn();
                if (zzn.zzo()) {
                    zzbp zzbpVar4 = zzn.zze(zzd(), this.zza, 0L).zze;
                    zzbt zza2 = this.zzab.zza();
                    zza2.zzb(zzbpVar4.zzg);
                    zzu = zza2.zzu();
                } else {
                    zzu = this.zzab;
                }
                equals = zzu.equals(this.zzI);
                this.zzI = zzu;
                z6 = zzlyVar2.zzl == zzlyVar.zzl;
                z7 = zzlyVar2.zze == zzlyVar.zze;
                if (!z7 || z6) {
                    zzam();
                }
                boolean z15 = zzlyVar2.zzg == zzlyVar.zzg;
                if (!equals2) {
                    this.zzl.zzd(0, new zzez() { // from class: com.google.android.gms.internal.ads.zzjm
                        @Override // com.google.android.gms.internal.ads.zzez
                        public final void zza(Object obj5) {
                            int i15 = zzko.zzd;
                            ((zzcl) obj5).zzp(zzly.this.zza, i);
                        }
                    });
                }
                if (z4) {
                    z8 = z7;
                    z9 = z15;
                } else {
                    zzcu zzcuVar = new zzcu();
                    if (zzlyVar2.zza.zzo()) {
                        z8 = z7;
                        z9 = z15;
                        i9 = i4;
                        obj = null;
                        zzbpVar2 = null;
                        obj2 = null;
                        i10 = -1;
                    } else {
                        Object obj5 = zzlyVar2.zzb.zza;
                        zzlyVar2.zza.zzn(obj5, zzcuVar);
                        int i15 = zzcuVar.zzd;
                        int zza3 = zzlyVar2.zza.zza(obj5);
                        z8 = z7;
                        z9 = z15;
                        obj2 = obj5;
                        obj = zzlyVar2.zza.zze(i15, this.zza, 0L).zzc;
                        zzbpVar2 = this.zza.zze;
                        i9 = i15;
                        i10 = zza3;
                    }
                    if (i12 == 0) {
                        if (zzlyVar2.zzb.zzb()) {
                            zzur zzurVar = zzlyVar2.zzb;
                            j3 = zzcuVar.zzh(zzurVar.zzb, zzurVar.zzc);
                            zzaa = zzaa(zzlyVar2);
                            int i16 = zzfy.zza;
                            zzur zzurVar2 = zzlyVar2.zzb;
                            final zzcn zzcnVar = new zzcn(obj, i9, zzbpVar2, obj2, i10, zzfy.zzt(j3), zzfy.zzt(zzaa), zzurVar2.zzb, zzurVar2.zzc);
                            int zzd2 = zzd();
                            if (this.zzac.zza.zzo()) {
                                zzly zzlyVar3 = this.zzac;
                                Object obj6 = zzlyVar3.zzb.zza;
                                zzlyVar3.zza.zzn(obj6, this.zzn);
                                i11 = this.zzac.zza.zza(obj6);
                                obj3 = this.zzac.zza.zze(zzd2, this.zza, 0L).zzc;
                                zzbpVar3 = this.zza.zze;
                                obj4 = obj6;
                            } else {
                                obj3 = null;
                                zzbpVar3 = null;
                                obj4 = null;
                                i11 = -1;
                            }
                            long zzt = zzfy.zzt(j);
                            long zzt2 = !this.zzac.zzb.zzb() ? zzfy.zzt(zzaa(this.zzac)) : zzt;
                            zzur zzurVar3 = this.zzac.zzb;
                            final zzcn zzcnVar2 = new zzcn(obj3, zzd2, zzbpVar3, obj4, i11, zzt, zzt2, zzurVar3.zzb, zzurVar3.zzc);
                            this.zzl.zzd(11, new zzez() { // from class: com.google.android.gms.internal.ads.zzjr
                                @Override // com.google.android.gms.internal.ads.zzez
                                public final void zza(Object obj7) {
                                    int i17 = zzko.zzd;
                                    ((zzcl) obj7).zzm(zzcnVar, zzcnVar2, i12);
                                }
                            });
                        } else {
                            j3 = zzlyVar2.zzb.zze != -1 ? zzaa(this.zzac) : zzcuVar.zze;
                            zzaa = j3;
                            int i162 = zzfy.zza;
                            zzur zzurVar22 = zzlyVar2.zzb;
                            final zzcn zzcnVar3 = new zzcn(obj, i9, zzbpVar2, obj2, i10, zzfy.zzt(j3), zzfy.zzt(zzaa), zzurVar22.zzb, zzurVar22.zzc);
                            int zzd22 = zzd();
                            if (this.zzac.zza.zzo()) {
                            }
                            long zzt3 = zzfy.zzt(j);
                            if (!this.zzac.zzb.zzb()) {
                            }
                            zzur zzurVar32 = this.zzac.zzb;
                            final zzcn zzcnVar22 = new zzcn(obj3, zzd22, zzbpVar3, obj4, i11, zzt3, zzt2, zzurVar32.zzb, zzurVar32.zzc);
                            this.zzl.zzd(11, new zzez() { // from class: com.google.android.gms.internal.ads.zzjr
                                @Override // com.google.android.gms.internal.ads.zzez
                                public final void zza(Object obj7) {
                                    int i17 = zzko.zzd;
                                    ((zzcl) obj7).zzm(zzcnVar3, zzcnVar22, i12);
                                }
                            });
                        }
                    } else if (zzlyVar2.zzb.zzb()) {
                        j3 = zzlyVar2.zzr;
                        zzaa = zzaa(zzlyVar2);
                        int i1622 = zzfy.zza;
                        zzur zzurVar222 = zzlyVar2.zzb;
                        final zzcn zzcnVar32 = new zzcn(obj, i9, zzbpVar2, obj2, i10, zzfy.zzt(j3), zzfy.zzt(zzaa), zzurVar222.zzb, zzurVar222.zzc);
                        int zzd222 = zzd();
                        if (this.zzac.zza.zzo()) {
                        }
                        long zzt32 = zzfy.zzt(j);
                        if (!this.zzac.zzb.zzb()) {
                        }
                        zzur zzurVar322 = this.zzac.zzb;
                        final zzcn zzcnVar222 = new zzcn(obj3, zzd222, zzbpVar3, obj4, i11, zzt32, zzt2, zzurVar322.zzb, zzurVar322.zzc);
                        this.zzl.zzd(11, new zzez() { // from class: com.google.android.gms.internal.ads.zzjr
                            @Override // com.google.android.gms.internal.ads.zzez
                            public final void zza(Object obj7) {
                                int i17 = zzko.zzd;
                                ((zzcl) obj7).zzm(zzcnVar32, zzcnVar222, i12);
                            }
                        });
                    } else {
                        j3 = zzlyVar2.zzr;
                        zzaa = j3;
                        int i16222 = zzfy.zza;
                        zzur zzurVar2222 = zzlyVar2.zzb;
                        final zzcn zzcnVar322 = new zzcn(obj, i9, zzbpVar2, obj2, i10, zzfy.zzt(j3), zzfy.zzt(zzaa), zzurVar2222.zzb, zzurVar2222.zzc);
                        int zzd2222 = zzd();
                        if (this.zzac.zza.zzo()) {
                        }
                        long zzt322 = zzfy.zzt(j);
                        if (!this.zzac.zzb.zzb()) {
                        }
                        zzur zzurVar3222 = this.zzac.zzb;
                        final zzcn zzcnVar2222 = new zzcn(obj3, zzd2222, zzbpVar3, obj4, i11, zzt322, zzt2, zzurVar3222.zzb, zzurVar3222.zzc);
                        this.zzl.zzd(11, new zzez() { // from class: com.google.android.gms.internal.ads.zzjr
                            @Override // com.google.android.gms.internal.ads.zzez
                            public final void zza(Object obj7) {
                                int i17 = zzko.zzd;
                                ((zzcl) obj7).zzm(zzcnVar322, zzcnVar2222, i12);
                            }
                        });
                    }
                }
                if (!booleanValue) {
                    this.zzl.zzd(1, new zzez() { // from class: com.google.android.gms.internal.ads.zzjt
                        @Override // com.google.android.gms.internal.ads.zzez
                        public final void zza(Object obj7) {
                            int i17 = zzko.zzd;
                            ((zzcl) obj7).zzd(zzbp.this, intValue);
                        }
                    });
                }
                if (zzlyVar2.zzf != zzlyVar.zzf) {
                    this.zzl.zzd(10, new zzez() { // from class: com.google.android.gms.internal.ads.zzju
                        @Override // com.google.android.gms.internal.ads.zzez
                        public final void zza(Object obj7) {
                            int i17 = zzko.zzd;
                            ((zzcl) obj7).zzk(zzly.this.zzf);
                        }
                    });
                    if (zzlyVar.zzf != null) {
                        this.zzl.zzd(10, new zzez() { // from class: com.google.android.gms.internal.ads.zzjv
                            @Override // com.google.android.gms.internal.ads.zzez
                            public final void zza(Object obj7) {
                                int i17 = zzko.zzd;
                                ((zzcl) obj7).zzj(zzly.this.zzf);
                            }
                        });
                    }
                }
                zzypVar = zzlyVar2.zzi;
                zzypVar2 = zzlyVar.zzi;
                if (zzypVar != zzypVar2) {
                    this.zzi.zzq(zzypVar2.zze);
                    this.zzl.zzd(2, new zzez() { // from class: com.google.android.gms.internal.ads.zzjw
                        @Override // com.google.android.gms.internal.ads.zzez
                        public final void zza(Object obj7) {
                            int i17 = zzko.zzd;
                            ((zzcl) obj7).zzq(zzly.this.zzi.zzd);
                        }
                    });
                }
                if (!equals) {
                    final zzbv zzbvVar = this.zzI;
                    this.zzl.zzd(14, new zzez() { // from class: com.google.android.gms.internal.ads.zzjx
                        @Override // com.google.android.gms.internal.ads.zzez
                        public final void zza(Object obj7) {
                            int i17 = zzko.zzd;
                            ((zzcl) obj7).zze(zzbv.this);
                        }
                    });
                }
                if (z9) {
                    this.zzl.zzd(3, new zzez() { // from class: com.google.android.gms.internal.ads.zzjy
                        @Override // com.google.android.gms.internal.ads.zzez
                        public final void zza(Object obj7) {
                            int i17 = zzko.zzd;
                            ((zzcl) obj7).zzb(zzly.this.zzg);
                        }
                    });
                }
                if (!z8 || z6) {
                    this.zzl.zzd(-1, new zzez() { // from class: com.google.android.gms.internal.ads.zzjz
                        @Override // com.google.android.gms.internal.ads.zzez
                        public final void zza(Object obj7) {
                            int i17 = zzko.zzd;
                            zzly zzlyVar4 = zzly.this;
                            ((zzcl) obj7).zzl(zzlyVar4.zzl, zzlyVar4.zze);
                        }
                    });
                }
                if (z8) {
                    this.zzl.zzd(4, new zzez() { // from class: com.google.android.gms.internal.ads.zzka
                        @Override // com.google.android.gms.internal.ads.zzez
                        public final void zza(Object obj7) {
                            int i17 = zzko.zzd;
                            ((zzcl) obj7).zzh(zzly.this.zze);
                        }
                    });
                }
                if (z6) {
                    this.zzl.zzd(5, new zzez() { // from class: com.google.android.gms.internal.ads.zzjn
                        @Override // com.google.android.gms.internal.ads.zzez
                        public final void zza(Object obj7) {
                            int i17 = zzko.zzd;
                            ((zzcl) obj7).zzf(zzly.this.zzl, i2);
                        }
                    });
                }
                if (zzlyVar2.zzm != zzlyVar.zzm) {
                    this.zzl.zzd(6, new zzez() { // from class: com.google.android.gms.internal.ads.zzjo
                        @Override // com.google.android.gms.internal.ads.zzez
                        public final void zza(Object obj7) {
                            int i17 = zzko.zzd;
                            ((zzcl) obj7).zzi(zzly.this.zzm);
                        }
                    });
                }
                if (zzlyVar2.zzi() != zzlyVar.zzi()) {
                    this.zzl.zzd(7, new zzez() { // from class: com.google.android.gms.internal.ads.zzjp
                        @Override // com.google.android.gms.internal.ads.zzez
                        public final void zza(Object obj7) {
                            int i17 = zzko.zzd;
                            ((zzcl) obj7).zzc(zzly.this.zzi());
                        }
                    });
                }
                if (!zzlyVar2.zzn.equals(zzlyVar.zzn)) {
                    this.zzl.zzd(12, new zzez() { // from class: com.google.android.gms.internal.ads.zzjq
                        @Override // com.google.android.gms.internal.ads.zzez
                        public final void zza(Object obj7) {
                            int i17 = zzko.zzd;
                            ((zzcl) obj7).zzg(zzly.this.zzn);
                        }
                    });
                }
                zzck zzckVar2 = this.zzH;
                zzco zzcoVar = this.zzg;
                zzck zzckVar3 = this.zzc;
                int i17 = zzfy.zza;
                boolean zzx = zzcoVar.zzx();
                zzmVar = (zzm) zzcoVar;
                zzn2 = zzmVar.zzn();
                if (zzn2.zzo()) {
                    zzckVar = zzckVar2;
                    if (zzn2.zze(zzmVar.zzd(), zzmVar.zza, 0L).zzi) {
                        z10 = true;
                        zzn3 = zzmVar.zzn();
                        if (zzn3.zzo()) {
                            i7 = -1;
                            r8 = 0;
                            z11 = false;
                        } else {
                            int zzd3 = zzmVar.zzd();
                            zzmVar.zzh();
                            zzmVar.zzw();
                            r8 = 0;
                            r8 = 0;
                            int zzk = zzn3.zzk(zzd3, 0, false);
                            i7 = -1;
                            z11 = zzk != -1;
                        }
                        zzn4 = zzmVar.zzn();
                        if (!zzn4.zzo()) {
                            int zzd4 = zzmVar.zzd();
                            zzmVar.zzh();
                            zzmVar.zzw();
                            if (zzn4.zzj(zzd4, r8, r8) != i7) {
                                z12 = true;
                                zzn5 = zzmVar.zzn();
                                if (zzn5.zzo()) {
                                    j2 = 0;
                                    if (zzn5.zze(zzmVar.zzd(), zzmVar.zza, 0L).zzb()) {
                                        z13 = true;
                                        zzcx zzn6 = zzmVar.zzn();
                                        boolean z16 = zzn6.zzo() && zzn6.zze(zzmVar.zzd(), zzmVar.zza, j2).zzj;
                                        boolean zzo = zzcoVar.zzn().zzo();
                                        zzci zzciVar = new zzci();
                                        zzciVar.zzb(zzckVar3);
                                        boolean z17 = !zzx;
                                        zzciVar.zzd(4, z17);
                                        zzciVar.zzd(5, (z10 || zzx) ? false : true);
                                        zzciVar.zzd(6, (z11 || zzx) ? false : true);
                                        zzciVar.zzd(7, zzo && (z11 || !z13 || z10) && !zzx);
                                        zzciVar.zzd(8, (z12 || zzx) ? false : true);
                                        zzciVar.zzd(9, zzo && (z12 || (z13 && z16)) && !zzx);
                                        zzciVar.zzd(10, z17);
                                        zzciVar.zzd(11, (z10 || zzx) ? false : true);
                                        if (z10 || zzx) {
                                            i8 = 12;
                                            z14 = false;
                                        } else {
                                            i8 = 12;
                                            z14 = true;
                                        }
                                        zzciVar.zzd(i8, z14);
                                        zze = zzciVar.zze();
                                        this.zzH = zze;
                                        if (!zze.equals(zzckVar)) {
                                            this.zzl.zzd(13, new zzez() { // from class: com.google.android.gms.internal.ads.zzjl
                                                @Override // com.google.android.gms.internal.ads.zzez
                                                public final void zza(Object obj7) {
                                                    zzko.this.zzU((zzcl) obj7);
                                                }
                                            });
                                        }
                                        this.zzl.zzc();
                                        boolean z18 = zzlyVar2.zzo;
                                        boolean z19 = zzlyVar.zzo;
                                    }
                                } else {
                                    j2 = 0;
                                }
                                z13 = false;
                                zzcx zzn62 = zzmVar.zzn();
                                if (zzn62.zzo()) {
                                }
                                boolean zzo2 = zzcoVar.zzn().zzo();
                                zzci zzciVar2 = new zzci();
                                zzciVar2.zzb(zzckVar3);
                                boolean z172 = !zzx;
                                zzciVar2.zzd(4, z172);
                                zzciVar2.zzd(5, (z10 || zzx) ? false : true);
                                zzciVar2.zzd(6, (z11 || zzx) ? false : true);
                                zzciVar2.zzd(7, zzo2 && (z11 || !z13 || z10) && !zzx);
                                zzciVar2.zzd(8, (z12 || zzx) ? false : true);
                                zzciVar2.zzd(9, zzo2 && (z12 || (z13 && z16)) && !zzx);
                                zzciVar2.zzd(10, z172);
                                zzciVar2.zzd(11, (z10 || zzx) ? false : true);
                                if (z10) {
                                }
                                i8 = 12;
                                z14 = false;
                                zzciVar2.zzd(i8, z14);
                                zze = zzciVar2.zze();
                                this.zzH = zze;
                                if (!zze.equals(zzckVar)) {
                                }
                                this.zzl.zzc();
                                boolean z182 = zzlyVar2.zzo;
                                boolean z192 = zzlyVar.zzo;
                            }
                        }
                        z12 = r8;
                        zzn5 = zzmVar.zzn();
                        if (zzn5.zzo()) {
                        }
                        z13 = false;
                        zzcx zzn622 = zzmVar.zzn();
                        if (zzn622.zzo()) {
                        }
                        boolean zzo22 = zzcoVar.zzn().zzo();
                        zzci zzciVar22 = new zzci();
                        zzciVar22.zzb(zzckVar3);
                        boolean z1722 = !zzx;
                        zzciVar22.zzd(4, z1722);
                        zzciVar22.zzd(5, (z10 || zzx) ? false : true);
                        zzciVar22.zzd(6, (z11 || zzx) ? false : true);
                        zzciVar22.zzd(7, zzo22 && (z11 || !z13 || z10) && !zzx);
                        zzciVar22.zzd(8, (z12 || zzx) ? false : true);
                        zzciVar22.zzd(9, zzo22 && (z12 || (z13 && z16)) && !zzx);
                        zzciVar22.zzd(10, z1722);
                        zzciVar22.zzd(11, (z10 || zzx) ? false : true);
                        if (z10) {
                        }
                        i8 = 12;
                        z14 = false;
                        zzciVar22.zzd(i8, z14);
                        zze = zzciVar22.zze();
                        this.zzH = zze;
                        if (!zze.equals(zzckVar)) {
                        }
                        this.zzl.zzc();
                        boolean z1822 = zzlyVar2.zzo;
                        boolean z1922 = zzlyVar.zzo;
                    }
                } else {
                    zzckVar = zzckVar2;
                }
                z10 = false;
                zzn3 = zzmVar.zzn();
                if (zzn3.zzo()) {
                }
                zzn4 = zzmVar.zzn();
                if (!zzn4.zzo()) {
                }
                z12 = r8;
                zzn5 = zzmVar.zzn();
                if (zzn5.zzo()) {
                }
                z13 = false;
                zzcx zzn6222 = zzmVar.zzn();
                if (zzn6222.zzo()) {
                }
                boolean zzo222 = zzcoVar.zzn().zzo();
                zzci zzciVar222 = new zzci();
                zzciVar222.zzb(zzckVar3);
                boolean z17222 = !zzx;
                zzciVar222.zzd(4, z17222);
                zzciVar222.zzd(5, (z10 || zzx) ? false : true);
                zzciVar222.zzd(6, (z11 || zzx) ? false : true);
                zzciVar222.zzd(7, zzo222 && (z11 || !z13 || z10) && !zzx);
                zzciVar222.zzd(8, (z12 || zzx) ? false : true);
                zzciVar222.zzd(9, zzo222 && (z12 || (z13 && z16)) && !zzx);
                zzciVar222.zzd(10, z17222);
                zzciVar222.zzd(11, (z10 || zzx) ? false : true);
                if (z10) {
                }
                i8 = 12;
                z14 = false;
                zzciVar222.zzd(i8, z14);
                zze = zzciVar222.zze();
                this.zzH = zze;
                if (!zze.equals(zzckVar)) {
                }
                this.zzl.zzc();
                boolean z18222 = zzlyVar2.zzo;
                boolean z19222 = zzlyVar.zzo;
            }
            pair = new Pair(true, 3);
        }
        z4 = z;
        booleanValue = ((Boolean) pair.first).booleanValue();
        final int intValue2 = ((Integer) pair.second).intValue();
        if (booleanValue) {
        }
        if (!zzlyVar2.zzj.equals(zzlyVar.zzj)) {
        }
        zzn = zzn();
        if (zzn.zzo()) {
        }
        equals = zzu.equals(this.zzI);
        this.zzI = zzu;
        if (zzlyVar2.zzl == zzlyVar.zzl) {
        }
        if (zzlyVar2.zze == zzlyVar.zze) {
        }
        if (!z7) {
        }
        zzam();
        if (zzlyVar2.zzg == zzlyVar.zzg) {
        }
        if (!equals2) {
        }
        if (z4) {
        }
        if (!booleanValue) {
        }
        if (zzlyVar2.zzf != zzlyVar.zzf) {
        }
        zzypVar = zzlyVar2.zzi;
        zzypVar2 = zzlyVar.zzi;
        if (zzypVar != zzypVar2) {
        }
        if (!equals) {
        }
        if (z9) {
        }
        if (!z8) {
        }
        this.zzl.zzd(-1, new zzez() { // from class: com.google.android.gms.internal.ads.zzjz
            @Override // com.google.android.gms.internal.ads.zzez
            public final void zza(Object obj7) {
                int i172 = zzko.zzd;
                zzly zzlyVar4 = zzly.this;
                ((zzcl) obj7).zzl(zzlyVar4.zzl, zzlyVar4.zze);
            }
        });
        if (z8) {
        }
        if (z6) {
        }
        if (zzlyVar2.zzm != zzlyVar.zzm) {
        }
        if (zzlyVar2.zzi() != zzlyVar.zzi()) {
        }
        if (!zzlyVar2.zzn.equals(zzlyVar.zzn)) {
        }
        zzck zzckVar22 = this.zzH;
        zzco zzcoVar2 = this.zzg;
        zzck zzckVar32 = this.zzc;
        int i172 = zzfy.zza;
        boolean zzx2 = zzcoVar2.zzx();
        zzmVar = (zzm) zzcoVar2;
        zzn2 = zzmVar.zzn();
        if (zzn2.zzo()) {
        }
        z10 = false;
        zzn3 = zzmVar.zzn();
        if (zzn3.zzo()) {
        }
        zzn4 = zzmVar.zzn();
        if (!zzn4.zzo()) {
        }
        z12 = r8;
        zzn5 = zzmVar.zzn();
        if (zzn5.zzo()) {
        }
        z13 = false;
        zzcx zzn62222 = zzmVar.zzn();
        if (zzn62222.zzo()) {
        }
        boolean zzo2222 = zzcoVar2.zzn().zzo();
        zzci zzciVar2222 = new zzci();
        zzciVar2222.zzb(zzckVar32);
        boolean z172222 = !zzx2;
        zzciVar2222.zzd(4, z172222);
        zzciVar2222.zzd(5, (z10 || zzx2) ? false : true);
        zzciVar2222.zzd(6, (z11 || zzx2) ? false : true);
        zzciVar2222.zzd(7, zzo2222 && (z11 || !z13 || z10) && !zzx2);
        zzciVar2222.zzd(8, (z12 || zzx2) ? false : true);
        zzciVar2222.zzd(9, zzo2222 && (z12 || (z13 && z16)) && !zzx2);
        zzciVar2222.zzd(10, z172222);
        zzciVar2222.zzd(11, (z10 || zzx2) ? false : true);
        if (z10) {
        }
        i8 = 12;
        z14 = false;
        zzciVar2222.zzd(i8, z14);
        zze = zzciVar2222.zze();
        this.zzH = zze;
        if (!zze.equals(zzckVar)) {
        }
        this.zzl.zzc();
        boolean z182222 = zzlyVar2.zzo;
        boolean z192222 = zzlyVar.zzo;
    }

    private final void zzam() {
        int zzf = zzf();
        if (zzf == 2 || zzf == 3) {
            zzan();
            boolean z = this.zzac.zzo;
            zzv();
            zzv();
        }
    }

    private final void zzan() {
        this.zze.zzb();
        if (Thread.currentThread() != this.zzs.getThread()) {
            String format = String.format(Locale.US, "Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.zzs.getThread().getName());
            if (this.zzX) {
                throw new IllegalStateException(format);
            }
            zzff.zzg("ExoPlayerImpl", format, this.zzY ? null : new IllegalStateException());
            this.zzY = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzjj
    public final void zzA(zzms zzmsVar) {
        zzan();
        this.zzr.zzQ(zzmsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzjj
    public final void zzB(zzut zzutVar) {
        zzan();
        List singletonList = Collections.singletonList(zzutVar);
        zzan();
        zzan();
        zzW(this.zzac);
        zzk();
        this.zzC++;
        if (!this.zzo.isEmpty()) {
            int size = this.zzo.size();
            for (int i = size - 1; i >= 0; i--) {
                this.zzo.remove(i);
            }
            this.zzag = this.zzag.zzh(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < singletonList.size(); i2++) {
            zzlv zzlvVar = new zzlv((zzut) singletonList.get(i2), this.zzp);
            arrayList.add(zzlvVar);
            this.zzo.add(i2, new zzkn(zzlvVar.zzb, zzlvVar.zza));
        }
        this.zzag = this.zzag.zzg(0, arrayList.size());
        zzmd zzmdVar = new zzmd(this.zzo, this.zzag);
        if (!zzmdVar.zzo() && zzmdVar.zzc() < 0) {
            throw new zzan(zzmdVar, -1, -9223372036854775807L);
        }
        int zzg = zzmdVar.zzg(false);
        zzly zzad = zzad(this.zzac, zzmdVar, zzac(zzmdVar, zzg, -9223372036854775807L));
        int i3 = zzad.zze;
        if (zzg != -1 && i3 != 1) {
            i3 = 4;
            if (!zzmdVar.zzo() && zzg < zzmdVar.zzc()) {
                i3 = 2;
            }
        }
        zzly zze = zzad.zze(i3);
        this.zzk.zzq(arrayList, zzg, zzfy.zzq(-9223372036854775807L), this.zzag);
        zzal(zze, 0, 1, (this.zzac.zzb.zza.equals(zze.zzb.zza) || this.zzac.zza.zzo()) ? false : true, 4, zzZ(zze), -1, false);
    }

    public final zziz zzE() {
        zzan();
        return this.zzac.zzf;
    }

    final /* synthetic */ void zzS(zzkx zzkxVar) {
        long j;
        boolean z;
        int i = this.zzC - zzkxVar.zzb;
        this.zzC = i;
        boolean z2 = true;
        if (zzkxVar.zzc) {
            this.zzD = zzkxVar.zzd;
            this.zzE = true;
        }
        if (zzkxVar.zze) {
            this.zzF = zzkxVar.zzf;
        }
        if (i == 0) {
            zzcx zzcxVar = zzkxVar.zza.zza;
            if (!this.zzac.zza.zzo() && zzcxVar.zzo()) {
                this.zzad = -1;
                this.zzae = 0L;
            }
            if (!zzcxVar.zzo()) {
                List zzw = ((zzmd) zzcxVar).zzw();
                zzek.zzf(zzw.size() == this.zzo.size());
                for (int i2 = 0; i2 < zzw.size(); i2++) {
                    ((zzkn) this.zzo.get(i2)).zzc((zzcx) zzw.get(i2));
                }
            }
            if (this.zzE) {
                if (zzkxVar.zza.zzb.equals(this.zzac.zzb) && zzkxVar.zza.zzd == this.zzac.zzr) {
                    z2 = false;
                }
                if (!z2) {
                    j = -9223372036854775807L;
                } else if (zzcxVar.zzo() || zzkxVar.zza.zzb.zzb()) {
                    j = zzkxVar.zza.zzd;
                } else {
                    zzly zzlyVar = zzkxVar.zza;
                    zzur zzurVar = zzlyVar.zzb;
                    j = zzlyVar.zzd;
                    zzab(zzcxVar, zzurVar, j);
                }
                z = z2;
            } else {
                j = -9223372036854775807L;
                z = false;
            }
            this.zzE = false;
            zzal(zzkxVar.zza, 1, this.zzF, z, this.zzD, j, -1, false);
        }
    }

    final /* synthetic */ void zzT(final zzkx zzkxVar) {
        this.zzj.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkd
            @Override // java.lang.Runnable
            public final void run() {
                zzko.this.zzS(zzkxVar);
            }
        });
    }

    final /* synthetic */ void zzU(zzcl zzclVar) {
        zzclVar.zza(this.zzH);
    }

    @Override // com.google.android.gms.internal.ads.zzm
    public final void zza(int i, long j, int i2, boolean z) {
        zzan();
        zzek.zzd(i >= 0);
        this.zzr.zzu();
        zzcx zzcxVar = this.zzac.zza;
        if (zzcxVar.zzo() || i < zzcxVar.zzc()) {
            this.zzC++;
            if (zzx()) {
                zzff.zzf("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                zzkx zzkxVar = new zzkx(this.zzac);
                zzkxVar.zza(1);
                this.zzaf.zza.zzT(zzkxVar);
                return;
            }
            zzly zzlyVar = this.zzac;
            int i3 = zzlyVar.zze;
            if (i3 == 3 || (i3 == 4 && !zzcxVar.zzo())) {
                zzlyVar = this.zzac.zze(2);
            }
            int zzd2 = zzd();
            zzly zzad = zzad(zzlyVar, zzcxVar, zzac(zzcxVar, i, j));
            this.zzk.zzl(zzcxVar, i, zzfy.zzq(j));
            zzal(zzad, 0, 1, true, 1, zzZ(zzad), zzd2, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final int zzb() {
        zzan();
        if (zzx()) {
            return this.zzac.zzb.zzb;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final int zzc() {
        zzan();
        if (zzx()) {
            return this.zzac.zzb.zzc;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final int zzd() {
        zzan();
        int zzW = zzW(this.zzac);
        if (zzW == -1) {
            return 0;
        }
        return zzW;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final int zze() {
        zzan();
        if (this.zzac.zza.zzo()) {
            return 0;
        }
        zzly zzlyVar = this.zzac;
        return zzlyVar.zza.zza(zzlyVar.zzb.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final int zzf() {
        zzan();
        return this.zzac.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final int zzg() {
        zzan();
        return this.zzac.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final int zzh() {
        zzan();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final long zzi() {
        zzan();
        if (zzx()) {
            zzly zzlyVar = this.zzac;
            return zzlyVar.zzk.equals(zzlyVar.zzb) ? zzfy.zzt(this.zzac.zzp) : zzl();
        }
        zzan();
        if (this.zzac.zza.zzo()) {
            return this.zzae;
        }
        zzly zzlyVar2 = this.zzac;
        long j = 0;
        if (zzlyVar2.zzk.zzd != zzlyVar2.zzb.zzd) {
            return zzfy.zzt(zzlyVar2.zza.zze(zzd(), this.zza, 0L).zzo);
        }
        long j2 = zzlyVar2.zzp;
        if (this.zzac.zzk.zzb()) {
            zzly zzlyVar3 = this.zzac;
            zzlyVar3.zza.zzn(zzlyVar3.zzk.zza, this.zzn).zzi(this.zzac.zzk.zzb);
        } else {
            j = j2;
        }
        zzly zzlyVar4 = this.zzac;
        zzab(zzlyVar4.zza, zzlyVar4.zzk, j);
        return zzfy.zzt(j);
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final long zzj() {
        zzan();
        return zzY(this.zzac);
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final long zzk() {
        zzan();
        return zzfy.zzt(zzZ(this.zzac));
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final long zzl() {
        zzan();
        if (zzx()) {
            zzly zzlyVar = this.zzac;
            zzur zzurVar = zzlyVar.zzb;
            zzlyVar.zza.zzn(zzurVar.zza, this.zzn);
            return zzfy.zzt(this.zzn.zzh(zzurVar.zzb, zzurVar.zzc));
        }
        zzcx zzn = zzn();
        if (zzn.zzo()) {
            return -9223372036854775807L;
        }
        return zzfy.zzt(zzn.zze(zzd(), this.zza, 0L).zzo);
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final long zzm() {
        zzan();
        return zzfy.zzt(this.zzac.zzq);
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final zzcx zzn() {
        zzan();
        return this.zzac.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final zzdk zzo() {
        zzan();
        return this.zzac.zzi.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzp() {
        zzan();
        zzip zzipVar = this.zzy;
        boolean zzv = zzv();
        int zzb = zzipVar.zzb(zzv, 2);
        zzak(zzv, zzb, zzX(zzv, zzb));
        zzly zzlyVar = this.zzac;
        if (zzlyVar.zze != 1) {
            return;
        }
        zzly zzd2 = zzlyVar.zzd(null);
        zzly zze = zzd2.zze(true == zzd2.zza.zzo() ? 4 : 2);
        this.zzC++;
        this.zzk.zzk();
        zzal(zze, 1, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzq() {
        zzff.zze("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.2.1] [" + zzfy.zze + "] [" + zzbq.zza() + "]");
        zzan();
        this.zzy.zzd();
        if (!this.zzk.zzp()) {
            zzfc zzfcVar = this.zzl;
            zzfcVar.zzd(10, new zzez() { // from class: com.google.android.gms.internal.ads.zzkc
                @Override // com.google.android.gms.internal.ads.zzez
                public final void zza(Object obj) {
                    ((zzcl) obj).zzj(zziz.zzd(new zzla(1), PointerIconCompat.TYPE_HELP));
                }
            });
            zzfcVar.zzc();
        }
        this.zzl.zze();
        this.zzj.zze(null);
        this.zzt.zzf(this.zzr);
        boolean z = this.zzac.zzo;
        zzly zze = this.zzac.zze(1);
        this.zzac = zze;
        zzly zza = zze.zza(zze.zzb);
        this.zzac = zza;
        zza.zzp = zza.zzr;
        this.zzac.zzq = 0L;
        this.zzr.zzP();
        this.zzi.zzj();
        Surface surface = this.zzN;
        if (surface != null) {
            surface.release();
            this.zzN = null;
        }
        this.zzW = zzee.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzr(boolean z) {
        zzan();
        int zzb = this.zzy.zzb(z, zzf());
        zzak(z, zzb, zzX(z, zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzs(Surface surface) {
        zzan();
        zzai(surface);
        int i = surface == null ? 0 : -1;
        zzaf(i, i);
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzt(float f) {
        zzan();
        final float max = Math.max(0.0f, Math.min(f, 1.0f));
        if (this.zzU == max) {
            return;
        }
        this.zzU = max;
        zzah();
        zzfc zzfcVar = this.zzl;
        zzfcVar.zzd(22, new zzez() { // from class: com.google.android.gms.internal.ads.zzjs
            @Override // com.google.android.gms.internal.ads.zzez
            public final void zza(Object obj) {
                int i = zzko.zzd;
                ((zzcl) obj).zzs(max);
            }
        });
        zzfcVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzu() {
        zzan();
        this.zzy.zzb(zzv(), 1);
        zzaj(null);
        this.zzW = new zzee(zzgaa.zzl(), this.zzac.zzr);
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final boolean zzv() {
        zzan();
        return this.zzac.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final boolean zzw() {
        zzan();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final boolean zzx() {
        zzan();
        return this.zzac.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzjj
    public final int zzy() {
        zzan();
        int length = this.zzh.length;
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzjj
    public final void zzz(zzms zzmsVar) {
        this.zzr.zzt(zzmsVar);
    }
}
