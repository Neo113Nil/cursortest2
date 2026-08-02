package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import androidx.loader.content.ModernAsyncTask$1;
import coil3.memory.MemoryCacheService;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.internal.measurement.zzaeh;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.internal.measurement.zzfd;
import com.google.android.gms.internal.measurement.zzfe;
import com.google.android.gms.internal.measurement.zzff;
import com.google.android.gms.internal.measurement.zzfg;
import com.google.android.gms.internal.measurement.zzfh;
import com.google.android.gms.internal.measurement.zzfm;
import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zzfu;
import com.google.android.gms.internal.measurement.zziy;
import com.google.android.gms.internal.measurement.zzja;
import com.squareup.util.cash.Countries;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzht extends zzos implements zzak {
    public final ArrayMap zza;
    public final ArrayMap zzb;
    public final ArrayMap zzc;
    public final ArrayMap zzd;
    public final zzhm zze;
    public final MemoryCacheService zzf;
    public final ArrayMap zzh;
    public final ArrayMap zzi;
    public final ArrayMap zzj;
    public final ArrayMap zzk;
    public final ArrayMap zzl;
    public final ArrayMap zzm;

    public zzht(zzpg zzpgVar) {
        super(zzpgVar);
        this.zzh = new ArrayMap(0);
        this.zza = new ArrayMap(0);
        this.zzb = new ArrayMap(0);
        this.zzc = new ArrayMap(0);
        this.zzd = new ArrayMap(0);
        this.zzi = new ArrayMap(0);
        this.zzk = new ArrayMap(0);
        this.zzl = new ArrayMap(0);
        this.zzm = new ArrayMap(0);
        this.zzj = new ArrayMap(0);
        this.zze = new zzhm(this);
        this.zzf = new MemoryCacheService(this, 27);
    }

    public static final ArrayMap zzJ(com.google.android.gms.internal.measurement.zzgl zzglVar) {
        ArrayMap arrayMap = new ArrayMap(0);
        for (com.google.android.gms.internal.measurement.zzgt zzgtVar : zzglVar.zze()) {
            arrayMap.put(zzgtVar.zza(), zzgtVar.zzb());
        }
        return arrayMap;
    }

    public static final zzjk zzK(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return zzjk.AD_STORAGE;
        }
        if (i2 == 2) {
            return zzjk.ANALYTICS_STORAGE;
        }
        if (i2 == 3) {
            return zzjk.AD_USER_DATA;
        }
        if (i2 != 4) {
            return null;
        }
        return zzjk.AD_PERSONALIZATION;
    }

    public final zzji zzB(String str, zzjk zzjkVar) {
        zzg();
        zzF(str);
        com.google.android.gms.internal.measurement.zzgf zzy = zzy(str);
        if (zzy != null) {
            Iterator it = zzy.zzf().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                zzfu zzfuVar = (zzfu) it.next();
                if (zzK(zzfuVar.zzb()) == zzjkVar) {
                    int zzc$1 = zzfuVar.zzc$1() - 1;
                    if (zzc$1 == 1) {
                        return zzji.GRANTED;
                    }
                    if (zzc$1 == 2) {
                        return zzji.DENIED;
                    }
                }
            }
        }
        return zzji.UNINITIALIZED;
    }

    public final boolean zzC(String str) {
        zzg();
        zzF(str);
        com.google.android.gms.internal.measurement.zzgf zzy = zzy(str);
        if (zzy == null) {
            return false;
        }
        for (zzfu zzfuVar : zzy.zza()) {
            if (zzfuVar.zzb() == 3 && zzfuVar.zzd() == 3) {
                return true;
            }
        }
        return false;
    }

    public final void zzF(String str) {
        zzay();
        zzg();
        zzae.checkNotEmpty(str);
        ArrayMap arrayMap = this.zzi;
        if (arrayMap.get(str) == null) {
            zzaw zzawVar = this.zzg.zze;
            zzpg.zzaT(zzawVar);
            com.google.android.gms.maps.zzah zzy = zzawVar.zzy(str);
            ArrayMap arrayMap2 = this.zzm;
            ArrayMap arrayMap3 = this.zzl;
            ArrayMap arrayMap4 = this.zzk;
            ArrayMap arrayMap5 = this.zzh;
            if (zzy != null) {
                com.google.android.gms.internal.measurement.zzgk zzgkVar = (com.google.android.gms.internal.measurement.zzgk) zzI(str, (byte[]) zzy.f68zza).zzco();
                zzG(str, zzgkVar);
                arrayMap5.put(str, zzJ((com.google.android.gms.internal.measurement.zzgl) zzgkVar.zzbd()));
                arrayMap.put(str, (com.google.android.gms.internal.measurement.zzgl) zzgkVar.zzbd());
                zzH(str, (com.google.android.gms.internal.measurement.zzgl) zzgkVar.zzbd());
                arrayMap4.put(str, zzgkVar.zzh());
                arrayMap3.put(str, (String) zzy.zzb);
                arrayMap2.put(str, (String) zzy.zzc);
                return;
            }
            arrayMap5.put(str, null);
            this.zzb.put(str, null);
            this.zza.put(str, null);
            this.zzc.put(str, null);
            this.zzd.put(str, null);
            arrayMap.put(str, null);
            arrayMap4.put(str, null);
            arrayMap3.put(str, null);
            arrayMap2.put(str, null);
            this.zzj.put(str, null);
        }
    }

    public final void zzG(String str, com.google.android.gms.internal.measurement.zzgk zzgkVar) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        ArrayMap arrayMap = new ArrayMap(0);
        ArrayMap arrayMap2 = new ArrayMap(0);
        ArrayMap arrayMap3 = new ArrayMap(0);
        Iterator it = zzgkVar.zzg().iterator();
        while (it.hasNext()) {
            hashSet.add(((com.google.android.gms.internal.measurement.zzgh) it.next()).zza());
        }
        zzic zzicVar = (zzic) this.$$delegate_0;
        zzal zzalVar = zzicVar.zzg;
        zzgu zzguVar = zzicVar.zzi;
        zzfx zzfxVar = zzfy.zzaV;
        if (zzalVar.zzp(null, zzfxVar)) {
            arrayList.addAll(zzgkVar.zzi());
        }
        for (int i = 0; i < zzgkVar.zza(); i++) {
            com.google.android.gms.internal.measurement.zzgi zzgiVar = (com.google.android.gms.internal.measurement.zzgi) zzgkVar.zzb(i).zzco();
            if (zzgiVar.zza().isEmpty()) {
                zzic.zzP(zzguVar);
                zzguVar.zzg.zza("EventConfig contained null event name");
            } else {
                String zza = zzgiVar.zza();
                String zzb = zzjm.zzb(zzgiVar.zza());
                if (!TextUtils.isEmpty(zzb)) {
                    zzgiVar.zzb$2(zzb);
                    zzgkVar.zzc(i, zzgiVar);
                }
                if (zzgiVar.zzc() && zzgiVar.zzd()) {
                    arrayMap.put(zza, Boolean.TRUE);
                }
                if (zzgiVar.zze() && zzgiVar.zzf()) {
                    arrayMap2.put(zzgiVar.zza(), Boolean.TRUE);
                }
                if (zzgiVar.zzg()) {
                    if (zzgiVar.zzh() < 2 || zzgiVar.zzh() > 65535) {
                        zzic.zzP(zzguVar);
                        zzguVar.zzg.zzc("Invalid sampling rate. Event name, sample rate", zzgiVar.zza(), Integer.valueOf(zzgiVar.zzh()));
                    } else {
                        arrayMap3.put(zzgiVar.zza(), Integer.valueOf(zzgiVar.zzh()));
                    }
                }
            }
        }
        this.zza.put(str, hashSet);
        if (zzicVar.zzg.zzp(null, zzfxVar)) {
            this.zzd.put(str, arrayList);
        }
        this.zzb.put(str, arrayMap);
        this.zzc.put(str, arrayMap2);
        this.zzj.put(str, arrayMap3);
    }

    public final void zzH(String str, com.google.android.gms.internal.measurement.zzgl zzglVar) {
        zzic zzicVar = (zzic) this.$$delegate_0;
        int zzk = zzglVar.zzk();
        zzhm zzhmVar = this.zze;
        if (zzk == 0) {
            zzhmVar.remove(str);
            return;
        }
        zzgu zzguVar = zzicVar.zzi;
        zzic.zzP(zzguVar);
        zzguVar.zzl.zzb(Integer.valueOf(zzglVar.zzk()), "EES programs found");
        int i = 0;
        zzja zzjaVar = (zzja) zzglVar.zzj().get(0);
        try {
            com.google.android.gms.internal.measurement.zzc zzcVar = new com.google.android.gms.internal.measurement.zzc();
            zzcVar.zza("internal.remoteConfig", new zzhp(this, str, 2));
            zzcVar.zza("internal.appMetadata", new zzhp(this, str, i));
            zzcVar.zza("internal.logger", new ModernAsyncTask$1(this, 8));
            zzcVar.zzf(zzjaVar);
            zzhmVar.put(str, zzcVar);
            zzic.zzP(zzguVar);
            zzgs zzgsVar = zzguVar.zzl;
            zzgsVar.zzc("EES program loaded for appId, activities", str, Integer.valueOf(zzjaVar.zzb().zzb()));
            for (zziy zziyVar : zzjaVar.zzb().zza()) {
                zzic.zzP(zzguVar);
                zzgsVar.zzb(zziyVar.zza(), "EES program activity");
            }
        } catch (com.google.android.gms.internal.measurement.zzd unused) {
            zzgu zzguVar2 = zzicVar.zzi;
            zzic.zzP(zzguVar2);
            zzguVar2.zzd.zzb(str, "Failed to load EES program. appId");
        }
    }

    public final com.google.android.gms.internal.measurement.zzgl zzI(String str, byte[] bArr) {
        zzic zzicVar = (zzic) this.$$delegate_0;
        if (bArr == null) {
            return com.google.android.gms.internal.measurement.zzgl.zzt();
        }
        try {
            com.google.android.gms.internal.measurement.zzgl zzglVar = (com.google.android.gms.internal.measurement.zzgl) ((com.google.android.gms.internal.measurement.zzgk) zzpk.zzw(com.google.android.gms.internal.measurement.zzgl.zzs(), bArr)).zzbd();
            zzgu zzguVar = zzicVar.zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzl.zzc("Parsed config. version, gmp_app_id", zzglVar.zza() ? Long.valueOf(zzglVar.zzb()) : null, zzglVar.zzc() ? zzglVar.zzd() : null);
            return zzglVar;
        } catch (zzaeh e) {
            zzgu zzguVar2 = zzicVar.zzi;
            zzic.zzP(zzguVar2);
            zzguVar2.zzg.zzc("Unable to merge remote config. appId", zzgu.zzl(str), e);
            return com.google.android.gms.internal.measurement.zzgl.zzt();
        } catch (RuntimeException e2) {
            zzgu zzguVar3 = zzicVar.zzi;
            zzic.zzP(zzguVar3);
            zzguVar3.zzg.zzc("Unable to merge remote config. appId", zzgu.zzl(str), e2);
            return com.google.android.gms.internal.measurement.zzgl.zzt();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzak
    public final String zza(String str, String str2) {
        zzg();
        zzF(str);
        Map map = (Map) this.zzh.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    public final com.google.android.gms.internal.measurement.zzgl zzb(String str) {
        zzay();
        zzg();
        zzae.checkNotEmpty(str);
        zzF(str);
        return (com.google.android.gms.internal.measurement.zzgl) this.zzi.get(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzos
    public final void zzbc() {
    }

    public final String zzc(String str) {
        zzg();
        zzF(str);
        return (String) this.zzk.get(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x041e, code lost:
    
        r1 = r24;
        r3 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02de, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02c2, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0268, code lost:
    
        r0 = r14.zzi;
        com.google.android.gms.measurement.internal.zzic.zzP(r0);
        r0 = r0.zzg;
        r4 = com.google.android.gms.measurement.internal.zzgu.zzl(r29);
        r6 = java.lang.Integer.valueOf(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x027d, code lost:
    
        if (r7.zza() == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x027f, code lost:
    
        r21 = java.lang.Integer.valueOf(r7.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x028f, code lost:
    
        r0.zzd("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r4, r6, java.lang.String.valueOf(r21));
        r25 = r3;
        r26 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x028d, code lost:
    
        r21 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x028a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x05a8, code lost:
    
        r24.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x05ab, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0322, code lost:
    
        r25 = r3;
        r26 = r5;
        r3 = r23.zzc().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0332, code lost:
    
        if (r3.hasNext() == false) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0334, code lost:
    
        r5 = (com.google.android.gms.internal.measurement.zzfn) r3.next();
        r9.zzay();
        r9.zzg();
        com.google.android.gms.common.internal.zzae.checkNotEmpty(r29);
        com.google.android.gms.common.internal.zzae.checkNotNull(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x034e, code lost:
    
        if (r5.zzc().isEmpty() == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x037a, code lost:
    
        r6 = r5.zzcd();
        r7 = new android.content.ContentValues();
        r7.put(r1, r29);
        r23 = r1;
        r7.put(r0, java.lang.Integer.valueOf(r26));
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0393, code lost:
    
        if (r5.zza() == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0395, code lost:
    
        r1 = java.lang.Integer.valueOf(r5.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x039f, code lost:
    
        r7.put("filter_id", r1);
        r27 = r0;
        r7.put("property_name", r5.zzc());
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x03b2, code lost:
    
        if (r5.zzh() == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x03b4, code lost:
    
        r0 = java.lang.Boolean.valueOf(r5.zzi());
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x03be, code lost:
    
        r7.put("session_scoped", r0);
        r7.put("data", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x03d0, code lost:
    
        if (r9.zze().insertWithOnConflict("property_filters", null, r7, 5) != (-1)) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x03e5, code lost:
    
        r1 = r23;
        r0 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x03d2, code lost:
    
        r0 = r14.zzi;
        com.google.android.gms.measurement.internal.zzic.zzP(r0);
        r0.zzd.zzb(com.google.android.gms.measurement.internal.zzgu.zzl(r29), "Failed to insert property filter (got -1). appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x03e3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x03eb, code lost:
    
        r1 = r14.zzi;
        com.google.android.gms.measurement.internal.zzic.zzP(r1);
        r1.zzd.zzc("Error storing property filter. appId", com.google.android.gms.measurement.internal.zzgu.zzl(r29), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x03bd, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x039e, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0350, code lost:
    
        r0 = r14.zzi;
        com.google.android.gms.measurement.internal.zzic.zzP(r0);
        r0 = r0.zzg;
        r3 = com.google.android.gms.measurement.internal.zzgu.zzl(r29);
        r4 = java.lang.Integer.valueOf(r26);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0365, code lost:
    
        if (r5.zza() == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0367, code lost:
    
        r5 = java.lang.Integer.valueOf(r5.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0371, code lost:
    
        r0.zzd("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r3, r4, java.lang.String.valueOf(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0370, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01fd, code lost:
    
        r6 = r0.zzc().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0209, code lost:
    
        if (r6.hasNext() == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0215, code lost:
    
        if (((com.google.android.gms.internal.measurement.zzfn) r6.next()).zza() != false) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0217, code lost:
    
        r0 = r14.zzi;
        com.google.android.gms.measurement.internal.zzic.zzP(r0);
        r0.zzg.zzc("Property filter with no ID. Audience definition ignored. appId, audienceId", com.google.android.gms.measurement.internal.zzgu.zzl(r29), java.lang.Integer.valueOf(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x022d, code lost:
    
        r6 = r0.zzf().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0239, code lost:
    
        r23 = r0;
        r0 = "audience_id";
        r24 = r1;
        r1 = "app_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x024a, code lost:
    
        if (r6.hasNext() == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x024c, code lost:
    
        r7 = (com.google.android.gms.internal.measurement.zzff) r6.next();
        r9.zzay();
        r9.zzg();
        com.google.android.gms.common.internal.zzae.checkNotEmpty(r29);
        com.google.android.gms.common.internal.zzae.checkNotNull(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0266, code lost:
    
        if (r7.zzc().isEmpty() == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x029c, code lost:
    
        r25 = r3;
        r3 = r7.zzcd();
        r26 = r5;
        r5 = new android.content.ContentValues();
        r5.put("app_id", r29);
        r5.put("audience_id", java.lang.Integer.valueOf(r26));
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02b7, code lost:
    
        if (r7.zza() == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02b9, code lost:
    
        r0 = java.lang.Integer.valueOf(r7.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02c3, code lost:
    
        r5.put("filter_id", r0);
        r5.put("event_name", r7.zzc());
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02d3, code lost:
    
        if (r7.zzl() == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02d5, code lost:
    
        r0 = java.lang.Boolean.valueOf(r7.zzm());
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02df, code lost:
    
        r5.put("session_scoped", r0);
        r5.put("data", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02f1, code lost:
    
        if (r9.zze().insertWithOnConflict("event_filters", null, r5, 5) != (-1)) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02f3, code lost:
    
        r0 = r14.zzi;
        com.google.android.gms.measurement.internal.zzic.zzP(r0);
        r0.zzd.zzb(com.google.android.gms.measurement.internal.zzgu.zzl(r29), "Failed to insert event filter (got -1). appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0306, code lost:
    
        r0 = r23;
        r1 = r24;
        r3 = r25;
        r5 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0304, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0310, code lost:
    
        r1 = r14.zzi;
        com.google.android.gms.measurement.internal.zzic.zzP(r1);
        r1.zzd.zzc("Error storing event filter. appId", com.google.android.gms.measurement.internal.zzgu.zzl(r29), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x03fb, code lost:
    
        r9.zzay();
        r9.zzg();
        com.google.android.gms.common.internal.zzae.checkNotEmpty(r29);
        r0 = r9.zze();
        r0.delete("property_filters", "app_id=? and audience_id=?", new java.lang.String[]{r29, java.lang.String.valueOf(r26)});
        r0.delete("event_filters", "app_id=? and audience_id=?", new java.lang.String[]{r29, java.lang.String.valueOf(r26)});
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzi(String str, String str2, String str3, byte[] bArr) {
        SQLiteDatabase sQLiteDatabase;
        byte[] bArr2;
        com.google.android.gms.internal.measurement.zzgk zzgkVar;
        ArrayMap arrayMap;
        boolean z;
        zzay();
        zzg();
        zzae.checkNotEmpty(str);
        com.google.android.gms.internal.measurement.zzgk zzgkVar2 = (com.google.android.gms.internal.measurement.zzgk) zzI(str, bArr).zzco();
        zzG(str, zzgkVar2);
        zzH(str, (com.google.android.gms.internal.measurement.zzgl) zzgkVar2.zzbd());
        com.google.android.gms.internal.measurement.zzgl zzglVar = (com.google.android.gms.internal.measurement.zzgl) zzgkVar2.zzbd();
        ArrayMap arrayMap2 = this.zzi;
        arrayMap2.put(str, zzglVar);
        this.zzk.put(str, zzgkVar2.zzh());
        this.zzl.put(str, str2);
        this.zzm.put(str, str3);
        this.zzh.put(str, zzJ((com.google.android.gms.internal.measurement.zzgl) zzgkVar2.zzbd()));
        zzpg zzpgVar = this.zzg;
        zzaw zzawVar = zzpgVar.zze;
        zzpg.zzaT(zzawVar);
        ArrayList arrayList = new ArrayList(zzgkVar2.zzd());
        zzic zzicVar = (zzic) zzawVar.$$delegate_0;
        int i = 0;
        while (i < arrayList.size()) {
            zzfc zzfcVar = (zzfc) ((zzfd) arrayList.get(i)).zzco();
            if (zzfcVar.zzd() != 0) {
                zzgkVar = zzgkVar2;
                arrayMap = arrayMap2;
                int i2 = 0;
                while (i2 < zzfcVar.zzd()) {
                    zzfe zzfeVar = (zzfe) zzfcVar.zze(i2).zzco();
                    zzfe zzfeVar2 = (zzfe) zzfeVar.clone();
                    String zzb = zzjm.zzb(zzfeVar.zza());
                    if (zzb != null) {
                        zzfeVar2.zzb$1(zzb);
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean z2 = z;
                    zzpg zzpgVar2 = zzpgVar;
                    int i3 = 0;
                    while (i3 < zzfeVar.zzc$1()) {
                        zzfh zzd = zzfeVar.zzd(i3);
                        zzfe zzfeVar3 = zzfeVar;
                        String zzc = Countries.zzc(zzjm.zza$1, zzd.zzi(), zzjm.zzb$1);
                        if (zzc != null) {
                            zzfg zzfgVar = (zzfg) zzd.zzco();
                            zzfgVar.zza$1(zzc);
                            zzfeVar2.zze(i3, (zzfh) zzfgVar.zzbd());
                            z2 = true;
                        }
                        i3++;
                        zzfeVar = zzfeVar3;
                    }
                    if (z2) {
                        zzfcVar.zzf(i2, zzfeVar2);
                        arrayList.set(i, (zzfd) zzfcVar.zzbd());
                    }
                    i2++;
                    zzpgVar = zzpgVar2;
                }
            } else {
                zzgkVar = zzgkVar2;
                arrayMap = arrayMap2;
            }
            zzpg zzpgVar3 = zzpgVar;
            if (zzfcVar.zza() != 0) {
                for (int i4 = 0; i4 < zzfcVar.zza(); i4++) {
                    zzfn zzb2 = zzfcVar.zzb(i4);
                    String zzc2 = Countries.zzc(zzjm.zza$2, zzb2.zzc(), zzjm.zzb$2);
                    if (zzc2 != null) {
                        zzfm zzfmVar = (zzfm) zzb2.zzco();
                        zzfmVar.zza$2(zzc2);
                        zzfcVar.zzc(i4, zzfmVar);
                        arrayList.set(i, (zzfd) zzfcVar.zzbd());
                    }
                }
            }
            i++;
            zzgkVar2 = zzgkVar;
            arrayMap2 = arrayMap;
            zzpgVar = zzpgVar3;
        }
        com.google.android.gms.internal.measurement.zzgk zzgkVar3 = zzgkVar2;
        ArrayMap arrayMap3 = arrayMap2;
        zzpg zzpgVar4 = zzpgVar;
        zzawVar.zzay();
        zzawVar.zzg();
        zzae.checkNotEmpty(str);
        SQLiteDatabase zze = zzawVar.zze();
        zze.beginTransaction();
        try {
            zzawVar.zzay();
            zzawVar.zzg();
            zzae.checkNotEmpty(str);
            SQLiteDatabase zze2 = zzawVar.zze();
            zze2.delete("property_filters", "app_id=?", new String[]{str});
            zze2.delete("event_filters", "app_id=?", new String[]{str});
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                zzfd zzfdVar = (zzfd) it.next();
                zzawVar.zzay();
                zzawVar.zzg();
                zzae.checkNotEmpty(str);
                zzae.checkNotNull(zzfdVar);
                if (zzfdVar.zza()) {
                    int zzb3 = zzfdVar.zzb();
                    Iterator it2 = zzfdVar.zzf().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (!((zzff) it2.next()).zza()) {
                            zzgu zzguVar = zzicVar.zzi;
                            zzic.zzP(zzguVar);
                            zzguVar.zzg.zzc("Event filter with no ID. Audience definition ignored. appId, audienceId", zzgu.zzl(str), Integer.valueOf(zzb3));
                            break;
                        }
                    }
                } else {
                    zzgu zzguVar2 = zzicVar.zzi;
                    zzic.zzP(zzguVar2);
                    zzguVar2.zzg.zzb(zzgu.zzl(str), "Audience with no ID. appId");
                }
            }
            sQLiteDatabase = zze;
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                zzfd zzfdVar2 = (zzfd) it3.next();
                arrayList2.add(zzfdVar2.zza() ? Integer.valueOf(zzfdVar2.zzb()) : null);
            }
            zzae.checkNotEmpty(str);
            zzawVar.zzay();
            zzawVar.zzg();
            SQLiteDatabase zze3 = zzawVar.zze();
            try {
                long zzaA = zzawVar.zzaA("select count(1) from audience_filter_values where app_id=?", new String[]{str});
                int max = Math.max(0, Math.min(2000, zzicVar.zzg.zzm(str, zzfy.zzU)));
                if (zzaA > max) {
                    ArrayList arrayList3 = new ArrayList();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= arrayList2.size()) {
                            String join = TextUtils.join(",", arrayList3);
                            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
                            sb.append("(");
                            sb.append(join);
                            sb.append(")");
                            String sb2 = sb.toString();
                            StringBuilder sb3 = new StringBuilder(sb2.length() + 140);
                            sb3.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
                            sb3.append(sb2);
                            sb3.append(" order by rowid desc limit -1 offset ?)");
                            zze3.delete("audience_filter_values", sb3.toString(), new String[]{str, Integer.toString(max)});
                            break;
                        }
                        Integer num = (Integer) arrayList2.get(i5);
                        if (num == null) {
                            break;
                        }
                        arrayList3.add(Integer.toString(num.intValue()));
                        i5++;
                    }
                }
            } catch (SQLiteException e) {
                zzgu zzguVar3 = zzicVar.zzi;
                zzic.zzP(zzguVar3);
                zzguVar3.zzd.zzc("Database error querying filters. appId", zzgu.zzl(str), e);
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            try {
                zzgkVar3.zze();
                bArr2 = ((com.google.android.gms.internal.measurement.zzgl) zzgkVar3.zzbd()).zzcd();
            } catch (RuntimeException e2) {
                zzgu zzguVar4 = ((zzic) this.$$delegate_0).zzi;
                zzic.zzP(zzguVar4);
                zzguVar4.zzg.zzc("Unable to serialize reduced-size config. Storing full config instead. appId", zzgu.zzl(str), e2);
                bArr2 = bArr;
            }
            zzaw zzawVar2 = zzpgVar4.zze;
            zzpg.zzaT(zzawVar2);
            zzic zzicVar2 = (zzic) zzawVar2.$$delegate_0;
            zzae.checkNotEmpty(str);
            zzawVar2.zzg();
            zzawVar2.zzay();
            ContentValues contentValues = new ContentValues();
            contentValues.put("remote_config", bArr2);
            contentValues.put("config_last_modified_time", str2);
            contentValues.put("e_tag", str3);
            try {
                if (zzawVar2.zze().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                    zzgu zzguVar5 = zzicVar2.zzi;
                    zzic.zzP(zzguVar5);
                    zzguVar5.zzd.zzb(zzgu.zzl(str), "Failed to update remote config (got 0). appId");
                }
            } catch (SQLiteException e3) {
                zzgu zzguVar6 = zzicVar2.zzi;
                zzic.zzP(zzguVar6);
                zzguVar6.zzd.zzc("Error storing remote config. appId", zzgu.zzl(str), e3);
            }
            zzgkVar3.zzf();
            arrayMap3.put(str, (com.google.android.gms.internal.measurement.zzgl) zzgkVar3.zzbd());
        } catch (Throwable th) {
            th = th;
            sQLiteDatabase = zze;
        }
    }

    public final boolean zzj(String str, String str2) {
        Boolean bool;
        zzg();
        zzF(str);
        if ("1".equals(zza(str, "measurement.upload.blacklist_internal")) && zzpp.zzac(str2)) {
            return true;
        }
        if ("1".equals(zza(str, "measurement.upload.blacklist_public")) && zzpp.zzh(str2)) {
            return true;
        }
        Map map = (Map) this.zzb.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean zzk(String str, String str2) {
        Boolean bool;
        zzg();
        zzF(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.zzc.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final List zzm(String str) {
        zzg();
        zzF(str);
        return (List) this.zzd.get(str);
    }

    public final int zzn(String str, String str2) {
        Integer num;
        zzg();
        zzF(str);
        Map map = (Map) this.zzj.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final boolean zzr(String str) {
        zzg();
        zzF(str);
        ArrayMap arrayMap = this.zza;
        if (arrayMap.get(str) != null) {
            return ((Set) arrayMap.get(str)).contains("os_version") || ((Set) arrayMap.get(str)).contains("device_info");
        }
        return false;
    }

    public final boolean zzu(String str) {
        zzg();
        zzF(str);
        ArrayMap arrayMap = this.zza;
        return arrayMap.get(str) != null && ((Set) arrayMap.get(str)).contains("app_instance_id");
    }

    public final boolean zzw(String str, zzjk zzjkVar) {
        zzg();
        zzF(str);
        com.google.android.gms.internal.measurement.zzgf zzy = zzy(str);
        if (zzy == null) {
            return false;
        }
        for (zzfu zzfuVar : zzy.zza()) {
            if (zzjkVar == zzK(zzfuVar.zzb())) {
                return zzfuVar.zzc$1() == 2;
            }
        }
        return false;
    }

    public final com.google.android.gms.internal.measurement.zzgf zzy(String str) {
        zzg();
        zzF(str);
        com.google.android.gms.internal.measurement.zzgl zzb = zzb(str);
        if (zzb == null || !zzb.zzn()) {
            return null;
        }
        return zzb.zzo();
    }
}
