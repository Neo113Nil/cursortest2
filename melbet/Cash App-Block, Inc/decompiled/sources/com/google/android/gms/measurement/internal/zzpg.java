package com.google.android.gms.measurement.internal;

import android.app.BroadcastOptions;
import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.PersistableBundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.collection.ArrayMap;
import app.cash.trifle.Trifle;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.Extras;
import coil3.request.OneShotDisposable;
import com.bugsnag.android.Client;
import com.bugsnag.android.internal.dag.ContextModule;
import com.datadog.trace.relocate.api.RatelimitedLogger;
import com.fillr.n;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzaef;
import com.google.android.gms.internal.measurement.zzaeh;
import com.google.android.gms.internal.measurement.zzagr;
import com.google.android.gms.internal.measurement.zzahh;
import com.google.android.gms.internal.measurement.zzahk;
import com.google.android.gms.internal.measurement.zzaif;
import com.google.android.gms.internal.measurement.zzair;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.internal.measurement.zzfu;
import com.google.android.gms.internal.measurement.zzfw;
import com.google.android.gms.internal.measurement.zzha;
import com.google.android.gms.internal.measurement.zzhd;
import com.google.android.gms.internal.measurement.zzhk;
import com.google.android.gms.internal.measurement.zzhl;
import com.google.android.gms.internal.measurement.zzho;
import com.google.android.gms.internal.measurement.zzhr;
import com.google.android.gms.internal.measurement.zzhs;
import com.google.android.gms.internal.measurement.zzib;
import com.google.android.gms.internal.measurement.zzid;
import com.google.android.gms.internal.measurement.zzis;
import com.google.android.gms.internal.measurement.zzit;
import com.google.android.gms.internal.measurement.zziu;
import com.google.android.gms.internal.time.zzel$EnumUnboxingLocalUtility;
import com.plaid.internal.EnumC0170g;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;

/* loaded from: classes.dex */
public final class zzpg implements zzjg {
    public static volatile zzpg zzb;
    public ArrayList zzA;
    public final HashMap zzC;
    public final HashMap zzD;
    public final HashMap zzE;
    public zzlu zzG;
    public String zzH;
    public zzju zzI;
    public long zzJ;
    public long zza;
    public final zzht zzc;
    public final zzgz zzd;
    public zzaw zze;
    public zzhb zzf;
    public zzok zzg;
    public zzad zzh;
    public final zzpk zzi;
    public zzgz zzj;
    public zznn zzk;
    public zzx zzm;
    public final zzic zzn;
    public boolean zzp;
    public ArrayList zzq;
    public int zzs;
    public int zzt;
    public boolean zzu;
    public boolean zzv;
    public boolean zzw;
    public FileLock zzx;
    public FileChannel zzy;
    public ArrayList zzz;
    public final AtomicBoolean zzo = new AtomicBoolean(false);
    public final LinkedList zzr = new LinkedList();
    public final HashMap zzF = new HashMap();
    public final Extras.Key zzK = new Extras.Key(this);
    public long zzB = -1;
    public final zzou zzl = new zzou(this);

    public zzpg(ContextModule contextModule) {
        this.zzn = zzic.zzy(contextModule.ctx, null, null, null);
        zzpk zzpkVar = new zzpk(this);
        zzpkVar.zzaz();
        this.zzi = zzpkVar;
        zzgz zzgzVar = new zzgz(this, 0);
        zzgzVar.zzaz();
        this.zzd = zzgzVar;
        zzht zzhtVar = new zzht(this);
        zzhtVar.zzaz();
        this.zzc = zzhtVar;
        this.zzC = new HashMap();
        this.zzD = new HashMap();
        this.zzE = new HashMap();
        zzaX().zzj(new Client.AnonymousClass3(this, contextModule));
    }

    public static zzpg zza(Context context) {
        zzae.checkNotNull(context);
        zzae.checkNotNull(context.getApplicationContext());
        if (zzb == null) {
            synchronized (zzpg.class) {
                try {
                    if (zzb == null) {
                        zzb = new zzpg(new ContextModule(context, 4));
                    }
                } finally {
                }
            }
        }
        return zzb;
    }

    public static final void zzaB(zzhr zzhrVar, int i, String str) {
        List zza = zzhrVar.zza();
        for (int i2 = 0; i2 < zza.size(); i2++) {
            if ("_err".equals(((com.google.android.gms.internal.measurement.zzhw) zza.get(i2)).zzb())) {
                return;
            }
        }
        com.google.android.gms.internal.measurement.zzhv zzn = com.google.android.gms.internal.measurement.zzhw.zzn();
        zzn.zzb$3("_err");
        zzn.zzf(i);
        com.google.android.gms.internal.measurement.zzhw zzhwVar = (com.google.android.gms.internal.measurement.zzhw) zzn.zzbd();
        com.google.android.gms.internal.measurement.zzhv zzn2 = com.google.android.gms.internal.measurement.zzhw.zzn();
        zzn2.zzb$3("_ev");
        zzn2.zzd$1(str);
        com.google.android.gms.internal.measurement.zzhw zzhwVar2 = (com.google.android.gms.internal.measurement.zzhw) zzn2.zzbd();
        zzhrVar.zzf(zzhwVar);
        zzhrVar.zzf(zzhwVar2);
    }

    public static final void zzaC(zzhr zzhrVar, String str) {
        List zza = zzhrVar.zza();
        for (int i = 0; i < zza.size(); i++) {
            if (str.equals(((com.google.android.gms.internal.measurement.zzhw) zza.get(i)).zzb())) {
                zzhrVar.zzj$1(i);
                return;
            }
        }
    }

    public static void zzaR(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT < 34) {
            context.sendBroadcast(intent);
        } else {
            context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
        }
    }

    public static final boolean zzaS(zzr zzrVar) {
        return !TextUtils.isEmpty(zzrVar.zzb);
    }

    public static final void zzaT(zzos zzosVar) {
        if (zzosVar == null) {
            a$$ExternalSyntheticBUOutline0.m$1("Upload Component not created");
        } else {
            if (zzosVar.zza) {
                return;
            }
            a$$ExternalSyntheticBUOutline0.m$1("Component not initialized: ".concat(String.valueOf(zzosVar.getClass())));
        }
    }

    public static final Boolean zzaU(zzr zzrVar) {
        Boolean bool = zzrVar.zzp;
        String str = zzrVar.zzC;
        if (!TextUtils.isEmpty(str)) {
            int ordinal = OneShotDisposable.zzc(str).zza().ordinal();
            if (ordinal == 0 || ordinal == 1) {
                return null;
            }
            if (ordinal == 2) {
                return Boolean.TRUE;
            }
            if (ordinal == 3) {
                return Boolean.FALSE;
            }
        }
        return bool;
    }

    public final zzjl zzB(String str) {
        zzjl zzjlVar = zzjl.zza;
        zzaX().zzg();
        zzu$3();
        HashMap hashMap = this.zzC;
        zzjl zzjlVar2 = (zzjl) hashMap.get(str);
        if (zzjlVar2 == null) {
            zzaw zzawVar = this.zze;
            zzaT(zzawVar);
            zzjlVar2 = zzawVar.zzY(str);
            if (zzjlVar2 == null) {
                zzjlVar2 = zzjl.zza;
            }
            zzaX().zzg();
            zzu$3();
            hashMap.put(str, zzjlVar2);
            zzaw zzawVar2 = this.zze;
            zzaT(zzawVar2);
            zzawVar2.zzaa(str, zzjlVar2);
        }
        return zzjlVar2;
    }

    public final long zzC() {
        zzba().getClass();
        long currentTimeMillis = System.currentTimeMillis();
        zznn zznnVar = this.zzk;
        zznnVar.zzay();
        zznnVar.zzg();
        zzhe zzheVar = zznnVar.zzf;
        long zza = zzheVar.zza();
        if (zza == 0) {
            zzic.zzN(((zzic) zznnVar.$$delegate_0).zzl);
            zza = r7.zzf().nextInt(86400000) + 1;
            zzheVar.zzb(zza);
        }
        return ((((currentTimeMillis + zza) / 1000) / 60) / 60) / 24;
    }

    public final void zzD(zzbh zzbhVar, String str) {
        zzaw zzawVar = this.zze;
        zzaT(zzawVar);
        zzh zzu = zzawVar.zzu(str);
        if (zzu == null || TextUtils.isEmpty(zzu.zzr())) {
            zzaW().zzk.zzb(str, "No app data available; dropping event");
            return;
        }
        Boolean zzaO = zzaO(zzu);
        if (zzaO == null) {
            if (!"_ui".equals(zzbhVar.zza)) {
                zzaW().zzg.zzb(zzgu.zzl(str), "Could not find package. appId");
            }
        } else if (!zzaO.booleanValue()) {
            zzaW().zzd.zzb(zzgu.zzl(str), "App version does not match; dropping event. appId");
            return;
        }
        zzE(zzbhVar, new zzr(str, zzu.zzf(), zzu.zzr(), zzu.zzt(), zzu.zzv(), zzu.zzx(), zzu.zzz(), (String) null, zzu.zzD(), false, zzu.zzl(), 0L, 0, zzu.zzac(), false, zzu.zzae(), zzu.zzB(), (List) zzu.zzag(), zzB(str).zzl(), "", (String) null, zzu.zzai(), zzu.zzak(), zzB(str).zzc, zzx(str).zzc, zzu.zzao(), zzu.zzaw(), zzu.zzay(), zzu.zzaH(), 0L, zzu.zzaL(), 0L));
    }

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x007e: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:37:0x007e */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzE(zzbh zzbhVar, zzr zzrVar) {
        Throwable th;
        Cursor cursor;
        Cursor cursor2;
        Bundle bundle;
        zzbh zzb2;
        zzbf zzbfVar;
        String str = zzrVar.zza;
        zzae.checkNotEmpty(str);
        zzgv zza = zzgv.zza(zzbhVar);
        Bundle bundle2 = zza.zze;
        zzpp zzt = zzt();
        zzaw zzawVar = this.zze;
        zzaT(zzawVar);
        zzic zzicVar = (zzic) zzawVar.$$delegate_0;
        zzawVar.zzg();
        zzawVar.zzay();
        Cursor cursor3 = null;
        try {
            try {
                cursor = zzawVar.zze().rawQuery("select parameters from default_event_params where app_id=?", new String[]{str});
                try {
                } catch (SQLiteException e) {
                    e = e;
                    zzgu zzguVar = zzicVar.zzi;
                    zzic.zzP(zzguVar);
                    zzguVar.zzd.zzb(e, "Error selecting default event parameters");
                    if (cursor != null) {
                    }
                    bundle = null;
                    zzt.zzK(bundle2, bundle);
                    zzpp zzt2 = zzt();
                    zzal zzd = zzd();
                    zzd.getClass();
                    zzt2.zzI(zza, Math.max(Math.min(zzd.zzm(str, zzfy.zzX), 100), 25));
                    zzb2 = zza.zzb();
                    if (!zzd().zzp(null, zzfy.zzaZ)) {
                    }
                    zzF(zzb2, zzrVar);
                }
            } catch (Throwable th2) {
                th = th2;
                cursor3 = cursor2;
                if (cursor3 != null) {
                    throw th;
                }
                cursor3.close();
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor3 != null) {
            }
        }
        if (cursor.moveToFirst()) {
            try {
                zzhs zzhsVar = (zzhs) ((zzhr) zzpk.zzw(zzhs.zzp(), cursor.getBlob(0))).zzbd();
                zzawVar.zzg.zzp();
                bundle = zzpk.zzH(zzhsVar.zza());
                cursor.close();
            } catch (IOException e3) {
                zzgu zzguVar2 = zzicVar.zzi;
                zzic.zzP(zzguVar2);
                zzguVar2.zzd.zzc("Failed to retrieve default event parameters. appId", zzgu.zzl(str), e3);
            }
            zzt.zzK(bundle2, bundle);
            zzpp zzt22 = zzt();
            zzal zzd2 = zzd();
            zzd2.getClass();
            zzt22.zzI(zza, Math.max(Math.min(zzd2.zzm(str, zzfy.zzX), 100), 25));
            zzb2 = zza.zzb();
            if (!zzd().zzp(null, zzfy.zzaZ) && "_cmp".equals(zzb2.zza)) {
                zzbfVar = zzb2.zzb;
                if ("referrer API v2".equals(zzbfVar.zzd("_cis"))) {
                    String zzd3 = zzbfVar.zzd("gclid");
                    if (!TextUtils.isEmpty(zzd3)) {
                        zzad(new zzpl(zzb2.zzd, zzd3, "_lgclid", "auto"), zzrVar);
                    }
                }
            }
            zzF(zzb2, zzrVar);
        }
        zzgu zzguVar3 = zzicVar.zzi;
        zzic.zzP(zzguVar3);
        zzguVar3.zzl.zza("Default event parameters not found");
        if (cursor != null) {
            cursor.close();
        }
        bundle = null;
        zzt.zzK(bundle2, bundle);
        zzpp zzt222 = zzt();
        zzal zzd22 = zzd();
        zzd22.getClass();
        zzt222.zzI(zza, Math.max(Math.min(zzd22.zzm(str, zzfy.zzX), 100), 25));
        zzb2 = zza.zzb();
        if (!zzd().zzp(null, zzfy.zzaZ)) {
            zzbfVar = zzb2.zzb;
            if ("referrer API v2".equals(zzbfVar.zzd("_cis"))) {
            }
        }
        zzF(zzb2, zzrVar);
    }

    public final void zzF(zzbh zzbhVar, zzr zzrVar) {
        long j;
        List zzt;
        zzic zzicVar;
        List zzt2;
        List<zzah> zzt3;
        long j2;
        String str;
        zzae.checkNotNull(zzrVar);
        String str2 = zzrVar.zza;
        zzae.checkNotEmpty(str2);
        zzaX().zzg();
        zzu$3();
        long j3 = zzbhVar.zzd;
        long j4 = zzbhVar.zze;
        zzgv zza = zzgv.zza(zzbhVar);
        zzaX().zzg();
        zzlu zzluVar = this.zzG;
        if (zzluVar == null || (str = this.zzH) == null || !str.equals(str2)) {
            zzluVar = null;
        }
        zzpp.zzay(zzluVar, zza.zze, false);
        zzbh zzb2 = zza.zzb();
        zzp();
        if (TextUtils.isEmpty(zzrVar.zzb)) {
            return;
        }
        if (!zzrVar.zzh) {
            zzap(zzrVar);
            return;
        }
        List list = zzrVar.zzr;
        if (list != null) {
            String str3 = zzb2.zza;
            if (!list.contains(str3)) {
                zzaW().zzk.zzd("Dropping non-safelisted event. appId, event name, origin", str2, str3, zzb2.zzc);
                return;
            }
            Bundle zzf = zzb2.zzb.zzf();
            j = j3;
            zzf.putLong("ga_safelisted", 1L);
            zzb2 = new zzbh(str3, new zzbf(zzf), zzb2.zzc, zzb2.zzd, zzb2.zze);
        } else {
            j = j3;
        }
        zzaw zzawVar = this.zze;
        zzaT(zzawVar);
        zzawVar.zzb$1();
        try {
            String str4 = zzb2.zza;
            if ("_s".equals(str4)) {
                zzaw zzawVar2 = this.zze;
                zzaT(zzawVar2);
                if (!zzawVar2.zzQ(str2, "_s") && zzb2.zzb.zzb("_sid").longValue() != 0) {
                    zzaw zzawVar3 = this.zze;
                    zzaT(zzawVar3);
                    if (!zzawVar3.zzQ(str2, "_f")) {
                        zzaw zzawVar4 = this.zze;
                        zzaT(zzawVar4);
                        if (!zzawVar4.zzQ(str2, "_v")) {
                            zzaw zzawVar5 = this.zze;
                            zzaT(zzawVar5);
                            zzba().getClass();
                            zzawVar5.zzX(str2, Long.valueOf(System.currentTimeMillis() - 15000), "_sid", zzG(zzb2, str2));
                        }
                    }
                    zzaw zzawVar6 = this.zze;
                    zzaT(zzawVar6);
                    zzawVar6.zzX(str2, null, "_sid", zzG(zzb2, str2));
                }
            }
            zzaw zzawVar7 = this.zze;
            zzaT(zzawVar7);
            zzae.checkNotEmpty(str2);
            zzawVar7.zzg();
            zzawVar7.zzay();
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i < 0) {
                zzgu zzguVar = ((zzic) zzawVar7.$$delegate_0).zzi;
                zzic.zzP(zzguVar);
                zzguVar.zzg.zzc("Invalid time querying timed out conditional properties", zzgu.zzl(str2), Long.valueOf(j));
                zzt = Collections.EMPTY_LIST;
            } else {
                zzt = zzawVar7.zzt("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j)});
            }
            Iterator it = zzt.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                zzicVar = this.zzn;
                if (!hasNext) {
                    break;
                }
                zzah zzahVar = (zzah) it.next();
                if (zzahVar != null) {
                    zzaW().zzl.zzd("User property timed out", zzahVar.zza, zzicVar.zzm.zzc(zzahVar.zzc.zzb), zzahVar.zzc.zza());
                    zzbh zzbhVar2 = zzahVar.zzg;
                    if (zzbhVar2 != null) {
                        j2 = j;
                        zzH(new zzbh(zzbhVar2, j2, j4), zzrVar);
                    } else {
                        j2 = j;
                    }
                    zzaw zzawVar8 = this.zze;
                    zzaT(zzawVar8);
                    zzawVar8.zzr(str2, zzahVar.zzc.zzb);
                    j = j2;
                }
            }
            long j5 = j;
            zzaw zzawVar9 = this.zze;
            zzaT(zzawVar9);
            zzae.checkNotEmpty(str2);
            zzawVar9.zzg();
            zzawVar9.zzay();
            if (i < 0) {
                zzgu zzguVar2 = ((zzic) zzawVar9.$$delegate_0).zzi;
                zzic.zzP(zzguVar2);
                zzguVar2.zzg.zzc("Invalid time querying expired conditional properties", zzgu.zzl(str2), Long.valueOf(j5));
                zzt2 = Collections.EMPTY_LIST;
            } else {
                zzt2 = zzawVar9.zzt("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j5)});
            }
            ArrayList arrayList = new ArrayList(zzt2.size());
            Iterator it2 = zzt2.iterator();
            while (it2.hasNext()) {
                zzah zzahVar2 = (zzah) it2.next();
                if (zzahVar2 != null) {
                    Iterator it3 = it2;
                    int i2 = i;
                    long j6 = j5;
                    zzaW().zzl.zzd("User property expired", zzahVar2.zza, zzicVar.zzm.zzc(zzahVar2.zzc.zzb), zzahVar2.zzc.zza());
                    zzaw zzawVar10 = this.zze;
                    zzaT(zzawVar10);
                    zzawVar10.zzk(str2, zzahVar2.zzc.zzb);
                    zzbh zzbhVar3 = zzahVar2.zzk;
                    if (zzbhVar3 != null) {
                        arrayList.add(zzbhVar3);
                    }
                    zzaw zzawVar11 = this.zze;
                    zzaT(zzawVar11);
                    zzawVar11.zzr(str2, zzahVar2.zzc.zzb);
                    it2 = it3;
                    i = i2;
                    j5 = j6;
                }
            }
            int i3 = i;
            long j7 = j5;
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                long j8 = j7;
                zzH(new zzbh((zzbh) it4.next(), j8, j4), zzrVar);
                j7 = j8;
                j4 = j4;
            }
            long j9 = j4;
            long j10 = j7;
            zzaw zzawVar12 = this.zze;
            zzaT(zzawVar12);
            zzae.checkNotEmpty(str2);
            zzae.checkNotEmpty(str4);
            zzawVar12.zzg();
            zzawVar12.zzay();
            if (i3 < 0) {
                zzic zzicVar2 = (zzic) zzawVar12.$$delegate_0;
                zzgu zzguVar3 = zzicVar2.zzi;
                zzic.zzP(zzguVar3);
                zzguVar3.zzg.zzd("Invalid time querying triggered conditional properties", zzgu.zzl(str2), zzicVar2.zzm.zza(str4), Long.valueOf(j10));
                zzt3 = Collections.EMPTY_LIST;
            } else {
                zzt3 = zzawVar12.zzt("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str4, String.valueOf(j10)});
            }
            ArrayList arrayList2 = new ArrayList(zzt3.size());
            for (zzah zzahVar3 : zzt3) {
                if (zzahVar3 != null) {
                    zzpl zzplVar = zzahVar3.zzc;
                    String str5 = zzahVar3.zza;
                    zzae.checkNotNull(str5);
                    long j11 = j10;
                    String str6 = zzahVar3.zzb;
                    String str7 = zzplVar.zzb;
                    Object zza2 = zzplVar.zza();
                    zzae.checkNotNull(zza2);
                    zzpn zzpnVar = new zzpn(str5, str6, str7, j11, zza2);
                    j10 = j11;
                    Object obj = zzpnVar.zze;
                    String str8 = zzpnVar.zzc;
                    zzaw zzawVar13 = this.zze;
                    zzaT(zzawVar13);
                    if (zzawVar13.zzl(zzpnVar)) {
                        zzaW().zzl.zzd("User property triggered", zzahVar3.zza, zzicVar.zzm.zzc(str8), obj);
                    } else {
                        zzaW().zzd.zzd("Too many active user properties, ignoring", zzgu.zzl(zzahVar3.zza), zzicVar.zzm.zzc(str8), obj);
                    }
                    zzbh zzbhVar4 = zzahVar3.zzi;
                    if (zzbhVar4 != null) {
                        arrayList2.add(zzbhVar4);
                    }
                    zzahVar3.zzc = new zzpl(zzpnVar);
                    zzahVar3.zze = true;
                    zzaw zzawVar14 = this.zze;
                    zzaT(zzawVar14);
                    zzawVar14.zzp(zzahVar3);
                }
            }
            zzH(zzb2, zzrVar);
            Iterator it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                long j12 = j9;
                zzH(new zzbh((zzbh) it5.next(), j10, j12), zzrVar);
                j9 = j12;
            }
            zzaw zzawVar15 = this.zze;
            zzaT(zzawVar15);
            zzawVar15.zzc();
            zzaw zzawVar16 = this.zze;
            zzaT(zzawVar16);
            zzawVar16.zzd();
        } catch (Throwable th) {
            zzaw zzawVar17 = this.zze;
            zzaT(zzawVar17);
            zzawVar17.zzd();
            throw th;
        }
    }

    public final Bundle zzG(zzbh zzbhVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", zzbhVar.zzb.zzb("_sid").longValue());
        zzaw zzawVar = this.zze;
        zzaT(zzawVar);
        zzpn zzm = zzawVar.zzm(str, "_sno");
        if (zzm != null) {
            Object obj = zzm.zze;
            if (obj instanceof Long) {
                bundle.putLong("_sno", ((Long) obj).longValue());
            }
        }
        return bundle;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:(2:130|(38:132|(1:136)|137|(1:139)(1:288)|140|(1:142)(15:259|(1:261)(1:287)|262|(1:264)(1:286)|265|(1:267)(1:285)|268|(1:270)(1:284)|271|(1:273)(1:283)|274|(1:276)(1:282)|277|(1:279)(1:281)|280)|143|(1:145)|146|(1:148)|149|(1:153)|154|(2:158|(4:161|(1:163)|164|(28:172|(1:174)(1:257)|175|(1:177)|178|179|(2:181|(1:183))|184|(3:186|(1:188)|189)(1:256)|190|(1:194)|195|(1:197)|198|(4:201|(2:215|216)(4:205|(1:207)(1:214)|208|(2:210|211)(1:213))|212|199)|217|218|219|220|221|(2:222|(2:224|(2:226|227)(1:241))(3:242|243|(1:248)(1:247)))|228|229|230|(1:232)(2:237|238)|233|234|235)))|258|179|(0)|184|(0)(0)|190|(2:192|194)|195|(0)|198|(1:199)|217|218|219|220|221|(3:222|(0)(0)|241)|228|229|230|(0)(0)|233|234|235))|(3:156|158|(4:161|(0)|164|(31:166|168|170|172|(0)(0)|175|(0)|178|179|(0)|184|(0)(0)|190|(0)|195|(0)|198|(1:199)|217|218|219|220|221|(3:222|(0)(0)|241)|228|229|230|(0)(0)|233|234|235)))|219|220|221|(3:222|(0)(0)|241)|228|229|230|(0)(0)|233|234|235) */
    /* JADX WARN: Can't wrap try/catch for region: R(18:323|(2:325|(9:327|328|(1:330)(1:331)|55|(0)(0)|58|(0)(0)|64|65))|332|333|334|335|336|337|338|339|328|(0)(0)|55|(0)(0)|58|(0)(0)|64|65) */
    /* JADX WARN: Can't wrap try/catch for region: R(50:(2:67|(3:69|(1:71)|72))|73|(2:75|(3:77|(1:79)|80))|81|82|(1:84)|85|(2:89|(1:91))|92|(3:93|94|95)|96|(1:98)|99|(2:101|(2:107|108)(1:106))(1:291)|109|(1:111)|112|(1:114)|115|(1:117)|118|(1:120)|121|(1:123)|124|(1:126)(1:290)|127|128|(13:(2:130|(38:132|(1:136)|137|(1:139)(1:288)|140|(1:142)(15:259|(1:261)(1:287)|262|(1:264)(1:286)|265|(1:267)(1:285)|268|(1:270)(1:284)|271|(1:273)(1:283)|274|(1:276)(1:282)|277|(1:279)(1:281)|280)|143|(1:145)|146|(1:148)|149|(1:153)|154|(2:158|(4:161|(1:163)|164|(28:172|(1:174)(1:257)|175|(1:177)|178|179|(2:181|(1:183))|184|(3:186|(1:188)|189)(1:256)|190|(1:194)|195|(1:197)|198|(4:201|(2:215|216)(4:205|(1:207)(1:214)|208|(2:210|211)(1:213))|212|199)|217|218|219|220|221|(2:222|(2:224|(2:226|227)(1:241))(3:242|243|(1:248)(1:247)))|228|229|230|(1:232)(2:237|238)|233|234|235)))|258|179|(0)|184|(0)(0)|190|(2:192|194)|195|(0)|198|(1:199)|217|218|219|220|221|(3:222|(0)(0)|241)|228|229|230|(0)(0)|233|234|235))|(3:156|158|(4:161|(0)|164|(31:166|168|170|172|(0)(0)|175|(0)|178|179|(0)|184|(0)(0)|190|(0)|195|(0)|198|(1:199)|217|218|219|220|221|(3:222|(0)(0)|241)|228|229|230|(0)(0)|233|234|235)))|219|220|221|(3:222|(0)(0)|241)|228|229|230|(0)(0)|233|234|235)|289|143|(0)|146|(0)|149|(2:151|153)|154|258|179|(0)|184|(0)(0)|190|(0)|195|(0)|198|(1:199)|217|218) */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0b0b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0b12, code lost:
    
        ((com.google.android.gms.measurement.internal.zzic) r2.$$delegate_0).zzaW().zzb().zzc("Error storing raw event. appId", com.google.android.gms.measurement.internal.zzgu.zzl((java.lang.String) r5.zza), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0b2c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0b49, code lost:
    
        zzaW().zzb().zzc("Data loss. Failed to insert raw event metadata. appId", com.google.android.gms.measurement.internal.zzgu.zzl(r6.zzK()), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x02ed, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x02f2, code lost:
    
        ((com.google.android.gms.measurement.internal.zzic) r15.$$delegate_0).zzaW().zzb().zzc("Error pruning currencies. appId", com.google.android.gms.measurement.internal.zzgu.zzl(r11), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x02ef, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x02f0, code lost:
    
        r16 = r13;
     */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0789 A[Catch: all -> 0x01b9, TryCatch #1 {all -> 0x01b9, blocks: (B:41:0x0195, B:44:0x01a5, B:46:0x01ae, B:49:0x01bc, B:55:0x0367, B:58:0x0398, B:60:0x03dc, B:62:0x03e1, B:63:0x03f8, B:67:0x0403, B:69:0x041d, B:71:0x0423, B:72:0x043a, B:75:0x0457, B:79:0x0476, B:80:0x048d, B:81:0x0496, B:84:0x04b3, B:85:0x04c7, B:87:0x04cf, B:89:0x04d9, B:91:0x04df, B:92:0x04e6, B:94:0x04f3, B:98:0x0539, B:99:0x054e, B:101:0x057e, B:104:0x05a6, B:106:0x05b0, B:108:0x05f9, B:109:0x0624, B:111:0x0653, B:112:0x0656, B:114:0x065e, B:115:0x0661, B:117:0x0669, B:118:0x066c, B:120:0x0674, B:121:0x0677, B:123:0x0680, B:124:0x0684, B:126:0x068f, B:127:0x069b, B:130:0x06cc, B:132:0x06de, B:136:0x06f5, B:140:0x0703, B:143:0x0783, B:145:0x0789, B:146:0x078c, B:148:0x07a0, B:149:0x07aa, B:151:0x07b7, B:153:0x07c1, B:154:0x07c6, B:156:0x07da, B:158:0x07de, B:161:0x07f0, B:163:0x07fb, B:164:0x0804, B:166:0x0810, B:168:0x081c, B:170:0x0826, B:172:0x082c, B:174:0x083e, B:175:0x085c, B:177:0x0862, B:178:0x086b, B:179:0x087c, B:181:0x08b6, B:183:0x08c0, B:184:0x08c3, B:186:0x08cd, B:188:0x08eb, B:189:0x08f4, B:190:0x092c, B:192:0x0934, B:194:0x093e, B:195:0x0948, B:197:0x0952, B:198:0x095c, B:199:0x0965, B:201:0x096b, B:203:0x09a7, B:205:0x09b1, B:208:0x09cc, B:210:0x09d4, B:214:0x09c0, B:218:0x09df, B:220:0x0a22, B:221:0x0a2e, B:222:0x0a3b, B:224:0x0a41, B:228:0x0a8a, B:230:0x0ae4, B:232:0x0af5, B:233:0x0b5e, B:238:0x0b0f, B:240:0x0b12, B:243:0x0a4c, B:245:0x0a76, B:251:0x0b2f, B:252:0x0b48, B:255:0x0b49, B:259:0x070c, B:262:0x071a, B:265:0x0729, B:268:0x0738, B:271:0x0747, B:274:0x0756, B:277:0x0763, B:280:0x0772, B:291:0x0614, B:294:0x051e, B:295:0x0379, B:296:0x0380, B:298:0x0386, B:301:0x0392, B:306:0x01db, B:309:0x01ec, B:311:0x0201, B:316:0x021d, B:319:0x0251, B:321:0x0257, B:323:0x0265, B:325:0x0273, B:327:0x0288, B:328:0x032e, B:330:0x0338, B:333:0x02c0, B:335:0x02d9, B:338:0x02df, B:339:0x0307, B:342:0x02f2, B:346:0x0229, B:348:0x0247), top: B:40:0x0195, inners: #2, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x07a0 A[Catch: all -> 0x01b9, TryCatch #1 {all -> 0x01b9, blocks: (B:41:0x0195, B:44:0x01a5, B:46:0x01ae, B:49:0x01bc, B:55:0x0367, B:58:0x0398, B:60:0x03dc, B:62:0x03e1, B:63:0x03f8, B:67:0x0403, B:69:0x041d, B:71:0x0423, B:72:0x043a, B:75:0x0457, B:79:0x0476, B:80:0x048d, B:81:0x0496, B:84:0x04b3, B:85:0x04c7, B:87:0x04cf, B:89:0x04d9, B:91:0x04df, B:92:0x04e6, B:94:0x04f3, B:98:0x0539, B:99:0x054e, B:101:0x057e, B:104:0x05a6, B:106:0x05b0, B:108:0x05f9, B:109:0x0624, B:111:0x0653, B:112:0x0656, B:114:0x065e, B:115:0x0661, B:117:0x0669, B:118:0x066c, B:120:0x0674, B:121:0x0677, B:123:0x0680, B:124:0x0684, B:126:0x068f, B:127:0x069b, B:130:0x06cc, B:132:0x06de, B:136:0x06f5, B:140:0x0703, B:143:0x0783, B:145:0x0789, B:146:0x078c, B:148:0x07a0, B:149:0x07aa, B:151:0x07b7, B:153:0x07c1, B:154:0x07c6, B:156:0x07da, B:158:0x07de, B:161:0x07f0, B:163:0x07fb, B:164:0x0804, B:166:0x0810, B:168:0x081c, B:170:0x0826, B:172:0x082c, B:174:0x083e, B:175:0x085c, B:177:0x0862, B:178:0x086b, B:179:0x087c, B:181:0x08b6, B:183:0x08c0, B:184:0x08c3, B:186:0x08cd, B:188:0x08eb, B:189:0x08f4, B:190:0x092c, B:192:0x0934, B:194:0x093e, B:195:0x0948, B:197:0x0952, B:198:0x095c, B:199:0x0965, B:201:0x096b, B:203:0x09a7, B:205:0x09b1, B:208:0x09cc, B:210:0x09d4, B:214:0x09c0, B:218:0x09df, B:220:0x0a22, B:221:0x0a2e, B:222:0x0a3b, B:224:0x0a41, B:228:0x0a8a, B:230:0x0ae4, B:232:0x0af5, B:233:0x0b5e, B:238:0x0b0f, B:240:0x0b12, B:243:0x0a4c, B:245:0x0a76, B:251:0x0b2f, B:252:0x0b48, B:255:0x0b49, B:259:0x070c, B:262:0x071a, B:265:0x0729, B:268:0x0738, B:271:0x0747, B:274:0x0756, B:277:0x0763, B:280:0x0772, B:291:0x0614, B:294:0x051e, B:295:0x0379, B:296:0x0380, B:298:0x0386, B:301:0x0392, B:306:0x01db, B:309:0x01ec, B:311:0x0201, B:316:0x021d, B:319:0x0251, B:321:0x0257, B:323:0x0265, B:325:0x0273, B:327:0x0288, B:328:0x032e, B:330:0x0338, B:333:0x02c0, B:335:0x02d9, B:338:0x02df, B:339:0x0307, B:342:0x02f2, B:346:0x0229, B:348:0x0247), top: B:40:0x0195, inners: #2, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x07fb A[Catch: all -> 0x01b9, TryCatch #1 {all -> 0x01b9, blocks: (B:41:0x0195, B:44:0x01a5, B:46:0x01ae, B:49:0x01bc, B:55:0x0367, B:58:0x0398, B:60:0x03dc, B:62:0x03e1, B:63:0x03f8, B:67:0x0403, B:69:0x041d, B:71:0x0423, B:72:0x043a, B:75:0x0457, B:79:0x0476, B:80:0x048d, B:81:0x0496, B:84:0x04b3, B:85:0x04c7, B:87:0x04cf, B:89:0x04d9, B:91:0x04df, B:92:0x04e6, B:94:0x04f3, B:98:0x0539, B:99:0x054e, B:101:0x057e, B:104:0x05a6, B:106:0x05b0, B:108:0x05f9, B:109:0x0624, B:111:0x0653, B:112:0x0656, B:114:0x065e, B:115:0x0661, B:117:0x0669, B:118:0x066c, B:120:0x0674, B:121:0x0677, B:123:0x0680, B:124:0x0684, B:126:0x068f, B:127:0x069b, B:130:0x06cc, B:132:0x06de, B:136:0x06f5, B:140:0x0703, B:143:0x0783, B:145:0x0789, B:146:0x078c, B:148:0x07a0, B:149:0x07aa, B:151:0x07b7, B:153:0x07c1, B:154:0x07c6, B:156:0x07da, B:158:0x07de, B:161:0x07f0, B:163:0x07fb, B:164:0x0804, B:166:0x0810, B:168:0x081c, B:170:0x0826, B:172:0x082c, B:174:0x083e, B:175:0x085c, B:177:0x0862, B:178:0x086b, B:179:0x087c, B:181:0x08b6, B:183:0x08c0, B:184:0x08c3, B:186:0x08cd, B:188:0x08eb, B:189:0x08f4, B:190:0x092c, B:192:0x0934, B:194:0x093e, B:195:0x0948, B:197:0x0952, B:198:0x095c, B:199:0x0965, B:201:0x096b, B:203:0x09a7, B:205:0x09b1, B:208:0x09cc, B:210:0x09d4, B:214:0x09c0, B:218:0x09df, B:220:0x0a22, B:221:0x0a2e, B:222:0x0a3b, B:224:0x0a41, B:228:0x0a8a, B:230:0x0ae4, B:232:0x0af5, B:233:0x0b5e, B:238:0x0b0f, B:240:0x0b12, B:243:0x0a4c, B:245:0x0a76, B:251:0x0b2f, B:252:0x0b48, B:255:0x0b49, B:259:0x070c, B:262:0x071a, B:265:0x0729, B:268:0x0738, B:271:0x0747, B:274:0x0756, B:277:0x0763, B:280:0x0772, B:291:0x0614, B:294:0x051e, B:295:0x0379, B:296:0x0380, B:298:0x0386, B:301:0x0392, B:306:0x01db, B:309:0x01ec, B:311:0x0201, B:316:0x021d, B:319:0x0251, B:321:0x0257, B:323:0x0265, B:325:0x0273, B:327:0x0288, B:328:0x032e, B:330:0x0338, B:333:0x02c0, B:335:0x02d9, B:338:0x02df, B:339:0x0307, B:342:0x02f2, B:346:0x0229, B:348:0x0247), top: B:40:0x0195, inners: #2, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x083e A[Catch: all -> 0x01b9, TryCatch #1 {all -> 0x01b9, blocks: (B:41:0x0195, B:44:0x01a5, B:46:0x01ae, B:49:0x01bc, B:55:0x0367, B:58:0x0398, B:60:0x03dc, B:62:0x03e1, B:63:0x03f8, B:67:0x0403, B:69:0x041d, B:71:0x0423, B:72:0x043a, B:75:0x0457, B:79:0x0476, B:80:0x048d, B:81:0x0496, B:84:0x04b3, B:85:0x04c7, B:87:0x04cf, B:89:0x04d9, B:91:0x04df, B:92:0x04e6, B:94:0x04f3, B:98:0x0539, B:99:0x054e, B:101:0x057e, B:104:0x05a6, B:106:0x05b0, B:108:0x05f9, B:109:0x0624, B:111:0x0653, B:112:0x0656, B:114:0x065e, B:115:0x0661, B:117:0x0669, B:118:0x066c, B:120:0x0674, B:121:0x0677, B:123:0x0680, B:124:0x0684, B:126:0x068f, B:127:0x069b, B:130:0x06cc, B:132:0x06de, B:136:0x06f5, B:140:0x0703, B:143:0x0783, B:145:0x0789, B:146:0x078c, B:148:0x07a0, B:149:0x07aa, B:151:0x07b7, B:153:0x07c1, B:154:0x07c6, B:156:0x07da, B:158:0x07de, B:161:0x07f0, B:163:0x07fb, B:164:0x0804, B:166:0x0810, B:168:0x081c, B:170:0x0826, B:172:0x082c, B:174:0x083e, B:175:0x085c, B:177:0x0862, B:178:0x086b, B:179:0x087c, B:181:0x08b6, B:183:0x08c0, B:184:0x08c3, B:186:0x08cd, B:188:0x08eb, B:189:0x08f4, B:190:0x092c, B:192:0x0934, B:194:0x093e, B:195:0x0948, B:197:0x0952, B:198:0x095c, B:199:0x0965, B:201:0x096b, B:203:0x09a7, B:205:0x09b1, B:208:0x09cc, B:210:0x09d4, B:214:0x09c0, B:218:0x09df, B:220:0x0a22, B:221:0x0a2e, B:222:0x0a3b, B:224:0x0a41, B:228:0x0a8a, B:230:0x0ae4, B:232:0x0af5, B:233:0x0b5e, B:238:0x0b0f, B:240:0x0b12, B:243:0x0a4c, B:245:0x0a76, B:251:0x0b2f, B:252:0x0b48, B:255:0x0b49, B:259:0x070c, B:262:0x071a, B:265:0x0729, B:268:0x0738, B:271:0x0747, B:274:0x0756, B:277:0x0763, B:280:0x0772, B:291:0x0614, B:294:0x051e, B:295:0x0379, B:296:0x0380, B:298:0x0386, B:301:0x0392, B:306:0x01db, B:309:0x01ec, B:311:0x0201, B:316:0x021d, B:319:0x0251, B:321:0x0257, B:323:0x0265, B:325:0x0273, B:327:0x0288, B:328:0x032e, B:330:0x0338, B:333:0x02c0, B:335:0x02d9, B:338:0x02df, B:339:0x0307, B:342:0x02f2, B:346:0x0229, B:348:0x0247), top: B:40:0x0195, inners: #2, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0862 A[Catch: all -> 0x01b9, TryCatch #1 {all -> 0x01b9, blocks: (B:41:0x0195, B:44:0x01a5, B:46:0x01ae, B:49:0x01bc, B:55:0x0367, B:58:0x0398, B:60:0x03dc, B:62:0x03e1, B:63:0x03f8, B:67:0x0403, B:69:0x041d, B:71:0x0423, B:72:0x043a, B:75:0x0457, B:79:0x0476, B:80:0x048d, B:81:0x0496, B:84:0x04b3, B:85:0x04c7, B:87:0x04cf, B:89:0x04d9, B:91:0x04df, B:92:0x04e6, B:94:0x04f3, B:98:0x0539, B:99:0x054e, B:101:0x057e, B:104:0x05a6, B:106:0x05b0, B:108:0x05f9, B:109:0x0624, B:111:0x0653, B:112:0x0656, B:114:0x065e, B:115:0x0661, B:117:0x0669, B:118:0x066c, B:120:0x0674, B:121:0x0677, B:123:0x0680, B:124:0x0684, B:126:0x068f, B:127:0x069b, B:130:0x06cc, B:132:0x06de, B:136:0x06f5, B:140:0x0703, B:143:0x0783, B:145:0x0789, B:146:0x078c, B:148:0x07a0, B:149:0x07aa, B:151:0x07b7, B:153:0x07c1, B:154:0x07c6, B:156:0x07da, B:158:0x07de, B:161:0x07f0, B:163:0x07fb, B:164:0x0804, B:166:0x0810, B:168:0x081c, B:170:0x0826, B:172:0x082c, B:174:0x083e, B:175:0x085c, B:177:0x0862, B:178:0x086b, B:179:0x087c, B:181:0x08b6, B:183:0x08c0, B:184:0x08c3, B:186:0x08cd, B:188:0x08eb, B:189:0x08f4, B:190:0x092c, B:192:0x0934, B:194:0x093e, B:195:0x0948, B:197:0x0952, B:198:0x095c, B:199:0x0965, B:201:0x096b, B:203:0x09a7, B:205:0x09b1, B:208:0x09cc, B:210:0x09d4, B:214:0x09c0, B:218:0x09df, B:220:0x0a22, B:221:0x0a2e, B:222:0x0a3b, B:224:0x0a41, B:228:0x0a8a, B:230:0x0ae4, B:232:0x0af5, B:233:0x0b5e, B:238:0x0b0f, B:240:0x0b12, B:243:0x0a4c, B:245:0x0a76, B:251:0x0b2f, B:252:0x0b48, B:255:0x0b49, B:259:0x070c, B:262:0x071a, B:265:0x0729, B:268:0x0738, B:271:0x0747, B:274:0x0756, B:277:0x0763, B:280:0x0772, B:291:0x0614, B:294:0x051e, B:295:0x0379, B:296:0x0380, B:298:0x0386, B:301:0x0392, B:306:0x01db, B:309:0x01ec, B:311:0x0201, B:316:0x021d, B:319:0x0251, B:321:0x0257, B:323:0x0265, B:325:0x0273, B:327:0x0288, B:328:0x032e, B:330:0x0338, B:333:0x02c0, B:335:0x02d9, B:338:0x02df, B:339:0x0307, B:342:0x02f2, B:346:0x0229, B:348:0x0247), top: B:40:0x0195, inners: #2, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x08b6 A[Catch: all -> 0x01b9, TryCatch #1 {all -> 0x01b9, blocks: (B:41:0x0195, B:44:0x01a5, B:46:0x01ae, B:49:0x01bc, B:55:0x0367, B:58:0x0398, B:60:0x03dc, B:62:0x03e1, B:63:0x03f8, B:67:0x0403, B:69:0x041d, B:71:0x0423, B:72:0x043a, B:75:0x0457, B:79:0x0476, B:80:0x048d, B:81:0x0496, B:84:0x04b3, B:85:0x04c7, B:87:0x04cf, B:89:0x04d9, B:91:0x04df, B:92:0x04e6, B:94:0x04f3, B:98:0x0539, B:99:0x054e, B:101:0x057e, B:104:0x05a6, B:106:0x05b0, B:108:0x05f9, B:109:0x0624, B:111:0x0653, B:112:0x0656, B:114:0x065e, B:115:0x0661, B:117:0x0669, B:118:0x066c, B:120:0x0674, B:121:0x0677, B:123:0x0680, B:124:0x0684, B:126:0x068f, B:127:0x069b, B:130:0x06cc, B:132:0x06de, B:136:0x06f5, B:140:0x0703, B:143:0x0783, B:145:0x0789, B:146:0x078c, B:148:0x07a0, B:149:0x07aa, B:151:0x07b7, B:153:0x07c1, B:154:0x07c6, B:156:0x07da, B:158:0x07de, B:161:0x07f0, B:163:0x07fb, B:164:0x0804, B:166:0x0810, B:168:0x081c, B:170:0x0826, B:172:0x082c, B:174:0x083e, B:175:0x085c, B:177:0x0862, B:178:0x086b, B:179:0x087c, B:181:0x08b6, B:183:0x08c0, B:184:0x08c3, B:186:0x08cd, B:188:0x08eb, B:189:0x08f4, B:190:0x092c, B:192:0x0934, B:194:0x093e, B:195:0x0948, B:197:0x0952, B:198:0x095c, B:199:0x0965, B:201:0x096b, B:203:0x09a7, B:205:0x09b1, B:208:0x09cc, B:210:0x09d4, B:214:0x09c0, B:218:0x09df, B:220:0x0a22, B:221:0x0a2e, B:222:0x0a3b, B:224:0x0a41, B:228:0x0a8a, B:230:0x0ae4, B:232:0x0af5, B:233:0x0b5e, B:238:0x0b0f, B:240:0x0b12, B:243:0x0a4c, B:245:0x0a76, B:251:0x0b2f, B:252:0x0b48, B:255:0x0b49, B:259:0x070c, B:262:0x071a, B:265:0x0729, B:268:0x0738, B:271:0x0747, B:274:0x0756, B:277:0x0763, B:280:0x0772, B:291:0x0614, B:294:0x051e, B:295:0x0379, B:296:0x0380, B:298:0x0386, B:301:0x0392, B:306:0x01db, B:309:0x01ec, B:311:0x0201, B:316:0x021d, B:319:0x0251, B:321:0x0257, B:323:0x0265, B:325:0x0273, B:327:0x0288, B:328:0x032e, B:330:0x0338, B:333:0x02c0, B:335:0x02d9, B:338:0x02df, B:339:0x0307, B:342:0x02f2, B:346:0x0229, B:348:0x0247), top: B:40:0x0195, inners: #2, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x08cd A[Catch: all -> 0x01b9, TryCatch #1 {all -> 0x01b9, blocks: (B:41:0x0195, B:44:0x01a5, B:46:0x01ae, B:49:0x01bc, B:55:0x0367, B:58:0x0398, B:60:0x03dc, B:62:0x03e1, B:63:0x03f8, B:67:0x0403, B:69:0x041d, B:71:0x0423, B:72:0x043a, B:75:0x0457, B:79:0x0476, B:80:0x048d, B:81:0x0496, B:84:0x04b3, B:85:0x04c7, B:87:0x04cf, B:89:0x04d9, B:91:0x04df, B:92:0x04e6, B:94:0x04f3, B:98:0x0539, B:99:0x054e, B:101:0x057e, B:104:0x05a6, B:106:0x05b0, B:108:0x05f9, B:109:0x0624, B:111:0x0653, B:112:0x0656, B:114:0x065e, B:115:0x0661, B:117:0x0669, B:118:0x066c, B:120:0x0674, B:121:0x0677, B:123:0x0680, B:124:0x0684, B:126:0x068f, B:127:0x069b, B:130:0x06cc, B:132:0x06de, B:136:0x06f5, B:140:0x0703, B:143:0x0783, B:145:0x0789, B:146:0x078c, B:148:0x07a0, B:149:0x07aa, B:151:0x07b7, B:153:0x07c1, B:154:0x07c6, B:156:0x07da, B:158:0x07de, B:161:0x07f0, B:163:0x07fb, B:164:0x0804, B:166:0x0810, B:168:0x081c, B:170:0x0826, B:172:0x082c, B:174:0x083e, B:175:0x085c, B:177:0x0862, B:178:0x086b, B:179:0x087c, B:181:0x08b6, B:183:0x08c0, B:184:0x08c3, B:186:0x08cd, B:188:0x08eb, B:189:0x08f4, B:190:0x092c, B:192:0x0934, B:194:0x093e, B:195:0x0948, B:197:0x0952, B:198:0x095c, B:199:0x0965, B:201:0x096b, B:203:0x09a7, B:205:0x09b1, B:208:0x09cc, B:210:0x09d4, B:214:0x09c0, B:218:0x09df, B:220:0x0a22, B:221:0x0a2e, B:222:0x0a3b, B:224:0x0a41, B:228:0x0a8a, B:230:0x0ae4, B:232:0x0af5, B:233:0x0b5e, B:238:0x0b0f, B:240:0x0b12, B:243:0x0a4c, B:245:0x0a76, B:251:0x0b2f, B:252:0x0b48, B:255:0x0b49, B:259:0x070c, B:262:0x071a, B:265:0x0729, B:268:0x0738, B:271:0x0747, B:274:0x0756, B:277:0x0763, B:280:0x0772, B:291:0x0614, B:294:0x051e, B:295:0x0379, B:296:0x0380, B:298:0x0386, B:301:0x0392, B:306:0x01db, B:309:0x01ec, B:311:0x0201, B:316:0x021d, B:319:0x0251, B:321:0x0257, B:323:0x0265, B:325:0x0273, B:327:0x0288, B:328:0x032e, B:330:0x0338, B:333:0x02c0, B:335:0x02d9, B:338:0x02df, B:339:0x0307, B:342:0x02f2, B:346:0x0229, B:348:0x0247), top: B:40:0x0195, inners: #2, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0934 A[Catch: all -> 0x01b9, TryCatch #1 {all -> 0x01b9, blocks: (B:41:0x0195, B:44:0x01a5, B:46:0x01ae, B:49:0x01bc, B:55:0x0367, B:58:0x0398, B:60:0x03dc, B:62:0x03e1, B:63:0x03f8, B:67:0x0403, B:69:0x041d, B:71:0x0423, B:72:0x043a, B:75:0x0457, B:79:0x0476, B:80:0x048d, B:81:0x0496, B:84:0x04b3, B:85:0x04c7, B:87:0x04cf, B:89:0x04d9, B:91:0x04df, B:92:0x04e6, B:94:0x04f3, B:98:0x0539, B:99:0x054e, B:101:0x057e, B:104:0x05a6, B:106:0x05b0, B:108:0x05f9, B:109:0x0624, B:111:0x0653, B:112:0x0656, B:114:0x065e, B:115:0x0661, B:117:0x0669, B:118:0x066c, B:120:0x0674, B:121:0x0677, B:123:0x0680, B:124:0x0684, B:126:0x068f, B:127:0x069b, B:130:0x06cc, B:132:0x06de, B:136:0x06f5, B:140:0x0703, B:143:0x0783, B:145:0x0789, B:146:0x078c, B:148:0x07a0, B:149:0x07aa, B:151:0x07b7, B:153:0x07c1, B:154:0x07c6, B:156:0x07da, B:158:0x07de, B:161:0x07f0, B:163:0x07fb, B:164:0x0804, B:166:0x0810, B:168:0x081c, B:170:0x0826, B:172:0x082c, B:174:0x083e, B:175:0x085c, B:177:0x0862, B:178:0x086b, B:179:0x087c, B:181:0x08b6, B:183:0x08c0, B:184:0x08c3, B:186:0x08cd, B:188:0x08eb, B:189:0x08f4, B:190:0x092c, B:192:0x0934, B:194:0x093e, B:195:0x0948, B:197:0x0952, B:198:0x095c, B:199:0x0965, B:201:0x096b, B:203:0x09a7, B:205:0x09b1, B:208:0x09cc, B:210:0x09d4, B:214:0x09c0, B:218:0x09df, B:220:0x0a22, B:221:0x0a2e, B:222:0x0a3b, B:224:0x0a41, B:228:0x0a8a, B:230:0x0ae4, B:232:0x0af5, B:233:0x0b5e, B:238:0x0b0f, B:240:0x0b12, B:243:0x0a4c, B:245:0x0a76, B:251:0x0b2f, B:252:0x0b48, B:255:0x0b49, B:259:0x070c, B:262:0x071a, B:265:0x0729, B:268:0x0738, B:271:0x0747, B:274:0x0756, B:277:0x0763, B:280:0x0772, B:291:0x0614, B:294:0x051e, B:295:0x0379, B:296:0x0380, B:298:0x0386, B:301:0x0392, B:306:0x01db, B:309:0x01ec, B:311:0x0201, B:316:0x021d, B:319:0x0251, B:321:0x0257, B:323:0x0265, B:325:0x0273, B:327:0x0288, B:328:0x032e, B:330:0x0338, B:333:0x02c0, B:335:0x02d9, B:338:0x02df, B:339:0x0307, B:342:0x02f2, B:346:0x0229, B:348:0x0247), top: B:40:0x0195, inners: #2, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0952 A[Catch: all -> 0x01b9, TryCatch #1 {all -> 0x01b9, blocks: (B:41:0x0195, B:44:0x01a5, B:46:0x01ae, B:49:0x01bc, B:55:0x0367, B:58:0x0398, B:60:0x03dc, B:62:0x03e1, B:63:0x03f8, B:67:0x0403, B:69:0x041d, B:71:0x0423, B:72:0x043a, B:75:0x0457, B:79:0x0476, B:80:0x048d, B:81:0x0496, B:84:0x04b3, B:85:0x04c7, B:87:0x04cf, B:89:0x04d9, B:91:0x04df, B:92:0x04e6, B:94:0x04f3, B:98:0x0539, B:99:0x054e, B:101:0x057e, B:104:0x05a6, B:106:0x05b0, B:108:0x05f9, B:109:0x0624, B:111:0x0653, B:112:0x0656, B:114:0x065e, B:115:0x0661, B:117:0x0669, B:118:0x066c, B:120:0x0674, B:121:0x0677, B:123:0x0680, B:124:0x0684, B:126:0x068f, B:127:0x069b, B:130:0x06cc, B:132:0x06de, B:136:0x06f5, B:140:0x0703, B:143:0x0783, B:145:0x0789, B:146:0x078c, B:148:0x07a0, B:149:0x07aa, B:151:0x07b7, B:153:0x07c1, B:154:0x07c6, B:156:0x07da, B:158:0x07de, B:161:0x07f0, B:163:0x07fb, B:164:0x0804, B:166:0x0810, B:168:0x081c, B:170:0x0826, B:172:0x082c, B:174:0x083e, B:175:0x085c, B:177:0x0862, B:178:0x086b, B:179:0x087c, B:181:0x08b6, B:183:0x08c0, B:184:0x08c3, B:186:0x08cd, B:188:0x08eb, B:189:0x08f4, B:190:0x092c, B:192:0x0934, B:194:0x093e, B:195:0x0948, B:197:0x0952, B:198:0x095c, B:199:0x0965, B:201:0x096b, B:203:0x09a7, B:205:0x09b1, B:208:0x09cc, B:210:0x09d4, B:214:0x09c0, B:218:0x09df, B:220:0x0a22, B:221:0x0a2e, B:222:0x0a3b, B:224:0x0a41, B:228:0x0a8a, B:230:0x0ae4, B:232:0x0af5, B:233:0x0b5e, B:238:0x0b0f, B:240:0x0b12, B:243:0x0a4c, B:245:0x0a76, B:251:0x0b2f, B:252:0x0b48, B:255:0x0b49, B:259:0x070c, B:262:0x071a, B:265:0x0729, B:268:0x0738, B:271:0x0747, B:274:0x0756, B:277:0x0763, B:280:0x0772, B:291:0x0614, B:294:0x051e, B:295:0x0379, B:296:0x0380, B:298:0x0386, B:301:0x0392, B:306:0x01db, B:309:0x01ec, B:311:0x0201, B:316:0x021d, B:319:0x0251, B:321:0x0257, B:323:0x0265, B:325:0x0273, B:327:0x0288, B:328:0x032e, B:330:0x0338, B:333:0x02c0, B:335:0x02d9, B:338:0x02df, B:339:0x0307, B:342:0x02f2, B:346:0x0229, B:348:0x0247), top: B:40:0x0195, inners: #2, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x096b A[Catch: all -> 0x01b9, TryCatch #1 {all -> 0x01b9, blocks: (B:41:0x0195, B:44:0x01a5, B:46:0x01ae, B:49:0x01bc, B:55:0x0367, B:58:0x0398, B:60:0x03dc, B:62:0x03e1, B:63:0x03f8, B:67:0x0403, B:69:0x041d, B:71:0x0423, B:72:0x043a, B:75:0x0457, B:79:0x0476, B:80:0x048d, B:81:0x0496, B:84:0x04b3, B:85:0x04c7, B:87:0x04cf, B:89:0x04d9, B:91:0x04df, B:92:0x04e6, B:94:0x04f3, B:98:0x0539, B:99:0x054e, B:101:0x057e, B:104:0x05a6, B:106:0x05b0, B:108:0x05f9, B:109:0x0624, B:111:0x0653, B:112:0x0656, B:114:0x065e, B:115:0x0661, B:117:0x0669, B:118:0x066c, B:120:0x0674, B:121:0x0677, B:123:0x0680, B:124:0x0684, B:126:0x068f, B:127:0x069b, B:130:0x06cc, B:132:0x06de, B:136:0x06f5, B:140:0x0703, B:143:0x0783, B:145:0x0789, B:146:0x078c, B:148:0x07a0, B:149:0x07aa, B:151:0x07b7, B:153:0x07c1, B:154:0x07c6, B:156:0x07da, B:158:0x07de, B:161:0x07f0, B:163:0x07fb, B:164:0x0804, B:166:0x0810, B:168:0x081c, B:170:0x0826, B:172:0x082c, B:174:0x083e, B:175:0x085c, B:177:0x0862, B:178:0x086b, B:179:0x087c, B:181:0x08b6, B:183:0x08c0, B:184:0x08c3, B:186:0x08cd, B:188:0x08eb, B:189:0x08f4, B:190:0x092c, B:192:0x0934, B:194:0x093e, B:195:0x0948, B:197:0x0952, B:198:0x095c, B:199:0x0965, B:201:0x096b, B:203:0x09a7, B:205:0x09b1, B:208:0x09cc, B:210:0x09d4, B:214:0x09c0, B:218:0x09df, B:220:0x0a22, B:221:0x0a2e, B:222:0x0a3b, B:224:0x0a41, B:228:0x0a8a, B:230:0x0ae4, B:232:0x0af5, B:233:0x0b5e, B:238:0x0b0f, B:240:0x0b12, B:243:0x0a4c, B:245:0x0a76, B:251:0x0b2f, B:252:0x0b48, B:255:0x0b49, B:259:0x070c, B:262:0x071a, B:265:0x0729, B:268:0x0738, B:271:0x0747, B:274:0x0756, B:277:0x0763, B:280:0x0772, B:291:0x0614, B:294:0x051e, B:295:0x0379, B:296:0x0380, B:298:0x0386, B:301:0x0392, B:306:0x01db, B:309:0x01ec, B:311:0x0201, B:316:0x021d, B:319:0x0251, B:321:0x0257, B:323:0x0265, B:325:0x0273, B:327:0x0288, B:328:0x032e, B:330:0x0338, B:333:0x02c0, B:335:0x02d9, B:338:0x02df, B:339:0x0307, B:342:0x02f2, B:346:0x0229, B:348:0x0247), top: B:40:0x0195, inners: #2, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0a41 A[Catch: all -> 0x01b9, TryCatch #1 {all -> 0x01b9, blocks: (B:41:0x0195, B:44:0x01a5, B:46:0x01ae, B:49:0x01bc, B:55:0x0367, B:58:0x0398, B:60:0x03dc, B:62:0x03e1, B:63:0x03f8, B:67:0x0403, B:69:0x041d, B:71:0x0423, B:72:0x043a, B:75:0x0457, B:79:0x0476, B:80:0x048d, B:81:0x0496, B:84:0x04b3, B:85:0x04c7, B:87:0x04cf, B:89:0x04d9, B:91:0x04df, B:92:0x04e6, B:94:0x04f3, B:98:0x0539, B:99:0x054e, B:101:0x057e, B:104:0x05a6, B:106:0x05b0, B:108:0x05f9, B:109:0x0624, B:111:0x0653, B:112:0x0656, B:114:0x065e, B:115:0x0661, B:117:0x0669, B:118:0x066c, B:120:0x0674, B:121:0x0677, B:123:0x0680, B:124:0x0684, B:126:0x068f, B:127:0x069b, B:130:0x06cc, B:132:0x06de, B:136:0x06f5, B:140:0x0703, B:143:0x0783, B:145:0x0789, B:146:0x078c, B:148:0x07a0, B:149:0x07aa, B:151:0x07b7, B:153:0x07c1, B:154:0x07c6, B:156:0x07da, B:158:0x07de, B:161:0x07f0, B:163:0x07fb, B:164:0x0804, B:166:0x0810, B:168:0x081c, B:170:0x0826, B:172:0x082c, B:174:0x083e, B:175:0x085c, B:177:0x0862, B:178:0x086b, B:179:0x087c, B:181:0x08b6, B:183:0x08c0, B:184:0x08c3, B:186:0x08cd, B:188:0x08eb, B:189:0x08f4, B:190:0x092c, B:192:0x0934, B:194:0x093e, B:195:0x0948, B:197:0x0952, B:198:0x095c, B:199:0x0965, B:201:0x096b, B:203:0x09a7, B:205:0x09b1, B:208:0x09cc, B:210:0x09d4, B:214:0x09c0, B:218:0x09df, B:220:0x0a22, B:221:0x0a2e, B:222:0x0a3b, B:224:0x0a41, B:228:0x0a8a, B:230:0x0ae4, B:232:0x0af5, B:233:0x0b5e, B:238:0x0b0f, B:240:0x0b12, B:243:0x0a4c, B:245:0x0a76, B:251:0x0b2f, B:252:0x0b48, B:255:0x0b49, B:259:0x070c, B:262:0x071a, B:265:0x0729, B:268:0x0738, B:271:0x0747, B:274:0x0756, B:277:0x0763, B:280:0x0772, B:291:0x0614, B:294:0x051e, B:295:0x0379, B:296:0x0380, B:298:0x0386, B:301:0x0392, B:306:0x01db, B:309:0x01ec, B:311:0x0201, B:316:0x021d, B:319:0x0251, B:321:0x0257, B:323:0x0265, B:325:0x0273, B:327:0x0288, B:328:0x032e, B:330:0x0338, B:333:0x02c0, B:335:0x02d9, B:338:0x02df, B:339:0x0307, B:342:0x02f2, B:346:0x0229, B:348:0x0247), top: B:40:0x0195, inners: #2, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0af5 A[Catch: all -> 0x01b9, SQLiteException -> 0x0b0b, TRY_LEAVE, TryCatch #2 {SQLiteException -> 0x0b0b, blocks: (B:230:0x0ae4, B:232:0x0af5), top: B:229:0x0ae4, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0b0d  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0a4c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0929  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0856  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0379 A[Catch: all -> 0x01b9, TryCatch #1 {all -> 0x01b9, blocks: (B:41:0x0195, B:44:0x01a5, B:46:0x01ae, B:49:0x01bc, B:55:0x0367, B:58:0x0398, B:60:0x03dc, B:62:0x03e1, B:63:0x03f8, B:67:0x0403, B:69:0x041d, B:71:0x0423, B:72:0x043a, B:75:0x0457, B:79:0x0476, B:80:0x048d, B:81:0x0496, B:84:0x04b3, B:85:0x04c7, B:87:0x04cf, B:89:0x04d9, B:91:0x04df, B:92:0x04e6, B:94:0x04f3, B:98:0x0539, B:99:0x054e, B:101:0x057e, B:104:0x05a6, B:106:0x05b0, B:108:0x05f9, B:109:0x0624, B:111:0x0653, B:112:0x0656, B:114:0x065e, B:115:0x0661, B:117:0x0669, B:118:0x066c, B:120:0x0674, B:121:0x0677, B:123:0x0680, B:124:0x0684, B:126:0x068f, B:127:0x069b, B:130:0x06cc, B:132:0x06de, B:136:0x06f5, B:140:0x0703, B:143:0x0783, B:145:0x0789, B:146:0x078c, B:148:0x07a0, B:149:0x07aa, B:151:0x07b7, B:153:0x07c1, B:154:0x07c6, B:156:0x07da, B:158:0x07de, B:161:0x07f0, B:163:0x07fb, B:164:0x0804, B:166:0x0810, B:168:0x081c, B:170:0x0826, B:172:0x082c, B:174:0x083e, B:175:0x085c, B:177:0x0862, B:178:0x086b, B:179:0x087c, B:181:0x08b6, B:183:0x08c0, B:184:0x08c3, B:186:0x08cd, B:188:0x08eb, B:189:0x08f4, B:190:0x092c, B:192:0x0934, B:194:0x093e, B:195:0x0948, B:197:0x0952, B:198:0x095c, B:199:0x0965, B:201:0x096b, B:203:0x09a7, B:205:0x09b1, B:208:0x09cc, B:210:0x09d4, B:214:0x09c0, B:218:0x09df, B:220:0x0a22, B:221:0x0a2e, B:222:0x0a3b, B:224:0x0a41, B:228:0x0a8a, B:230:0x0ae4, B:232:0x0af5, B:233:0x0b5e, B:238:0x0b0f, B:240:0x0b12, B:243:0x0a4c, B:245:0x0a76, B:251:0x0b2f, B:252:0x0b48, B:255:0x0b49, B:259:0x070c, B:262:0x071a, B:265:0x0729, B:268:0x0738, B:271:0x0747, B:274:0x0756, B:277:0x0763, B:280:0x0772, B:291:0x0614, B:294:0x051e, B:295:0x0379, B:296:0x0380, B:298:0x0386, B:301:0x0392, B:306:0x01db, B:309:0x01ec, B:311:0x0201, B:316:0x021d, B:319:0x0251, B:321:0x0257, B:323:0x0265, B:325:0x0273, B:327:0x0288, B:328:0x032e, B:330:0x0338, B:333:0x02c0, B:335:0x02d9, B:338:0x02df, B:339:0x0307, B:342:0x02f2, B:346:0x0229, B:348:0x0247), top: B:40:0x0195, inners: #2, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0338 A[Catch: all -> 0x01b9, TryCatch #1 {all -> 0x01b9, blocks: (B:41:0x0195, B:44:0x01a5, B:46:0x01ae, B:49:0x01bc, B:55:0x0367, B:58:0x0398, B:60:0x03dc, B:62:0x03e1, B:63:0x03f8, B:67:0x0403, B:69:0x041d, B:71:0x0423, B:72:0x043a, B:75:0x0457, B:79:0x0476, B:80:0x048d, B:81:0x0496, B:84:0x04b3, B:85:0x04c7, B:87:0x04cf, B:89:0x04d9, B:91:0x04df, B:92:0x04e6, B:94:0x04f3, B:98:0x0539, B:99:0x054e, B:101:0x057e, B:104:0x05a6, B:106:0x05b0, B:108:0x05f9, B:109:0x0624, B:111:0x0653, B:112:0x0656, B:114:0x065e, B:115:0x0661, B:117:0x0669, B:118:0x066c, B:120:0x0674, B:121:0x0677, B:123:0x0680, B:124:0x0684, B:126:0x068f, B:127:0x069b, B:130:0x06cc, B:132:0x06de, B:136:0x06f5, B:140:0x0703, B:143:0x0783, B:145:0x0789, B:146:0x078c, B:148:0x07a0, B:149:0x07aa, B:151:0x07b7, B:153:0x07c1, B:154:0x07c6, B:156:0x07da, B:158:0x07de, B:161:0x07f0, B:163:0x07fb, B:164:0x0804, B:166:0x0810, B:168:0x081c, B:170:0x0826, B:172:0x082c, B:174:0x083e, B:175:0x085c, B:177:0x0862, B:178:0x086b, B:179:0x087c, B:181:0x08b6, B:183:0x08c0, B:184:0x08c3, B:186:0x08cd, B:188:0x08eb, B:189:0x08f4, B:190:0x092c, B:192:0x0934, B:194:0x093e, B:195:0x0948, B:197:0x0952, B:198:0x095c, B:199:0x0965, B:201:0x096b, B:203:0x09a7, B:205:0x09b1, B:208:0x09cc, B:210:0x09d4, B:214:0x09c0, B:218:0x09df, B:220:0x0a22, B:221:0x0a2e, B:222:0x0a3b, B:224:0x0a41, B:228:0x0a8a, B:230:0x0ae4, B:232:0x0af5, B:233:0x0b5e, B:238:0x0b0f, B:240:0x0b12, B:243:0x0a4c, B:245:0x0a76, B:251:0x0b2f, B:252:0x0b48, B:255:0x0b49, B:259:0x070c, B:262:0x071a, B:265:0x0729, B:268:0x0738, B:271:0x0747, B:274:0x0756, B:277:0x0763, B:280:0x0772, B:291:0x0614, B:294:0x051e, B:295:0x0379, B:296:0x0380, B:298:0x0386, B:301:0x0392, B:306:0x01db, B:309:0x01ec, B:311:0x0201, B:316:0x021d, B:319:0x0251, B:321:0x0257, B:323:0x0265, B:325:0x0273, B:327:0x0288, B:328:0x032e, B:330:0x0338, B:333:0x02c0, B:335:0x02d9, B:338:0x02df, B:339:0x0307, B:342:0x02f2, B:346:0x0229, B:348:0x0247), top: B:40:0x0195, inners: #2, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x03dc A[Catch: all -> 0x01b9, TryCatch #1 {all -> 0x01b9, blocks: (B:41:0x0195, B:44:0x01a5, B:46:0x01ae, B:49:0x01bc, B:55:0x0367, B:58:0x0398, B:60:0x03dc, B:62:0x03e1, B:63:0x03f8, B:67:0x0403, B:69:0x041d, B:71:0x0423, B:72:0x043a, B:75:0x0457, B:79:0x0476, B:80:0x048d, B:81:0x0496, B:84:0x04b3, B:85:0x04c7, B:87:0x04cf, B:89:0x04d9, B:91:0x04df, B:92:0x04e6, B:94:0x04f3, B:98:0x0539, B:99:0x054e, B:101:0x057e, B:104:0x05a6, B:106:0x05b0, B:108:0x05f9, B:109:0x0624, B:111:0x0653, B:112:0x0656, B:114:0x065e, B:115:0x0661, B:117:0x0669, B:118:0x066c, B:120:0x0674, B:121:0x0677, B:123:0x0680, B:124:0x0684, B:126:0x068f, B:127:0x069b, B:130:0x06cc, B:132:0x06de, B:136:0x06f5, B:140:0x0703, B:143:0x0783, B:145:0x0789, B:146:0x078c, B:148:0x07a0, B:149:0x07aa, B:151:0x07b7, B:153:0x07c1, B:154:0x07c6, B:156:0x07da, B:158:0x07de, B:161:0x07f0, B:163:0x07fb, B:164:0x0804, B:166:0x0810, B:168:0x081c, B:170:0x0826, B:172:0x082c, B:174:0x083e, B:175:0x085c, B:177:0x0862, B:178:0x086b, B:179:0x087c, B:181:0x08b6, B:183:0x08c0, B:184:0x08c3, B:186:0x08cd, B:188:0x08eb, B:189:0x08f4, B:190:0x092c, B:192:0x0934, B:194:0x093e, B:195:0x0948, B:197:0x0952, B:198:0x095c, B:199:0x0965, B:201:0x096b, B:203:0x09a7, B:205:0x09b1, B:208:0x09cc, B:210:0x09d4, B:214:0x09c0, B:218:0x09df, B:220:0x0a22, B:221:0x0a2e, B:222:0x0a3b, B:224:0x0a41, B:228:0x0a8a, B:230:0x0ae4, B:232:0x0af5, B:233:0x0b5e, B:238:0x0b0f, B:240:0x0b12, B:243:0x0a4c, B:245:0x0a76, B:251:0x0b2f, B:252:0x0b48, B:255:0x0b49, B:259:0x070c, B:262:0x071a, B:265:0x0729, B:268:0x0738, B:271:0x0747, B:274:0x0756, B:277:0x0763, B:280:0x0772, B:291:0x0614, B:294:0x051e, B:295:0x0379, B:296:0x0380, B:298:0x0386, B:301:0x0392, B:306:0x01db, B:309:0x01ec, B:311:0x0201, B:316:0x021d, B:319:0x0251, B:321:0x0257, B:323:0x0265, B:325:0x0273, B:327:0x0288, B:328:0x032e, B:330:0x0338, B:333:0x02c0, B:335:0x02d9, B:338:0x02df, B:339:0x0307, B:342:0x02f2, B:346:0x0229, B:348:0x0247), top: B:40:0x0195, inners: #2, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0401  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzH(zzbh zzbhVar, zzr zzrVar) {
        String str;
        String str2;
        String str3;
        long longValue;
        String str4;
        zzpn zzpnVar;
        String str5;
        boolean z;
        zzbf zzbfVar;
        String str6;
        Extras.Key key;
        long j;
        long intValue;
        long j2;
        Extras.Key key2;
        zzbc zzbcVar;
        zzbd zzbdVar;
        String str7;
        String str8;
        String str9;
        Extras.Key key3;
        long j3;
        zzjl zzs;
        long j4;
        String str10;
        zzjl zzjlVar;
        zzh zzu;
        zzjl zzjlVar2;
        int i;
        List zzn;
        int i2;
        zzaw zzj;
        zzid zzidVar;
        zzaw zzj2;
        zzbe zzbeVar;
        ContentValues contentValues;
        String str11;
        long zzt;
        boolean z2;
        Pair zzc;
        Object obj;
        String str12;
        zzh zzu2;
        Long zzas;
        Long zzau;
        List zzm;
        zzpn zzm2;
        zzae.checkNotNull(zzrVar);
        boolean z3 = zzrVar.zzh;
        String str13 = zzrVar.zza;
        zzae.checkNotEmpty(str13);
        long nanoTime = System.nanoTime();
        zzaX().zzg();
        zzu$3();
        zzp();
        String str14 = zzrVar.zzb;
        if (TextUtils.isEmpty(str14)) {
            return;
        }
        if (!z3) {
            zzap(zzrVar);
            return;
        }
        zzht zzh = zzh();
        String str15 = zzbhVar.zza;
        boolean zzj3 = zzh.zzj(str13, str15);
        zzic zzicVar = this.zzn;
        Extras.Key key4 = this.zzK;
        if (zzj3) {
            zzaW().zze().zzc("Dropping blocked event. appId", zzgu.zzl(str13), zzicVar.zzl().zza(str15));
            if (!"1".equals(zzh().zza(str13, "measurement.upload.blacklist_internal")) && !"1".equals(zzh().zza(str13, "measurement.upload.blacklist_public"))) {
                if ("_err".equals(str15)) {
                    return;
                }
                zzt();
                zzpp.zzP(key4, str13, 11, "_ev", str15, 0);
                return;
            }
            zzh zzu3 = zzj().zzu(str13);
            if (zzu3 != null) {
                long max = Math.max(zzu3.zzJ(), zzu3.zzH());
                zzba().getClass();
                long abs = Math.abs(System.currentTimeMillis() - max);
                zzd();
                if (abs > ((Long) zzfy.zzN.zzb(null)).longValue()) {
                    zzaW().zzj().zza("Fetching config for blocked app");
                    zzX(zzu3);
                    return;
                }
                return;
            }
            return;
        }
        zzgv zza = zzgv.zza(zzbhVar);
        zzpp zzt2 = zzt();
        zzal zzd = zzd();
        zzd.getClass();
        zzt2.zzI(zza, Math.max(Math.min(zzd.zzm(str13, zzfy.zzX), 100), 25));
        int max2 = Math.max(Math.min(zzd().zzm(str13, zzfy.zzaf), 35), 10);
        Bundle bundle = zza.zze;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            String str16 = (String) it.next();
            Iterator it2 = it;
            if ("items".equals(str16)) {
                zzt().zzJ(bundle.getParcelableArray(str16), max2);
            }
            it = it2;
        }
        zzbh zzb2 = zza.zzb();
        zzbf zzbfVar2 = zzb2.zzb;
        String str17 = zzb2.zza;
        if (Log.isLoggable(zzaW().zzn(), 2)) {
            str = "_err";
            zzaW().zzk().zzb(zzicVar.zzl().zzd(zzb2), "Logging event");
        } else {
            str = "_err";
        }
        zzj().zzb$1();
        try {
            zzap(zzrVar);
            int i3 = 1;
            boolean z4 = "ecommerce_purchase".equals(str17) || "purchase".equals(str17) || "refund".equals(str17);
            if (!"_iap".equals(str17)) {
                if (!z4) {
                    str2 = "app_id";
                    str3 = "_fx";
                    z = z3;
                    zzbfVar = zzbfVar2;
                    str6 = str17;
                    str5 = str14;
                    key = key4;
                    str4 = str;
                    boolean zzh2 = zzpp.zzh(str6);
                    String str18 = str6;
                    boolean equals = str4.equals(str18);
                    zzt();
                    if (zzbfVar == null) {
                        j = 0;
                    } else {
                        zzbe zzbeVar2 = new zzbe(zzbfVar);
                        j = 0;
                        while (zzbeVar2.hasNext()) {
                            if (zzbfVar.zza(zzbeVar2.zza()) instanceof Parcelable[]) {
                                j += ((Parcelable[]) r5).length;
                            }
                        }
                    }
                    zzar zzx = zzj().zzx(zzC(), str13, j + 1, true, zzh2, false, equals, false, false, false);
                    long j5 = zzx.zzb;
                    zzd();
                    intValue = j5 - ((Integer) zzfy.zzk.zzb(null)).intValue();
                    if (intValue > 0) {
                        if (intValue % 1000 == 1) {
                            zzaW().zzb().zzc("Data loss. Too many events logged. appId, count", zzgu.zzl(str13), Long.valueOf(zzx.zzb));
                        }
                        zzj().zzc();
                    } else {
                        if (zzh2) {
                            long j6 = zzx.zza;
                            zzd();
                            long intValue2 = j6 - ((Integer) zzfy.zzm.zzb(null)).intValue();
                            if (intValue2 > 0) {
                                if (intValue2 % 1000 == 1) {
                                    zzaW().zzb().zzc("Data loss. Too many public events logged. appId, count", zzgu.zzl(str13), Long.valueOf(zzx.zza));
                                }
                                zzt();
                                zzpp.zzP(key, str13, 16, "_ev", zzb2.zza, 0);
                                zzj().zzc();
                            }
                        }
                        if (equals) {
                            long max3 = zzx.zzd - Math.max(0, Math.min(1000000, zzd().zzm(str13, zzfy.zzl)));
                            if (max3 > 0) {
                                if (max3 == 1) {
                                    zzaW().zzb().zzc("Too many error events logged. appId, count", zzgu.zzl(str13), Long.valueOf(zzx.zzd));
                                }
                                zzj().zzc();
                            }
                        }
                        Bundle zzf = zzbfVar.zzf();
                        zzt().zzO(zzf, "_o", zzb2.zzc);
                        if (zzt().zzad(str13, zzrVar.zzB)) {
                            zzt().zzO(zzf, "_dbg", 1L);
                            zzt().zzO(zzf, "_r", 1L);
                        }
                        if ("_s".equals(str18) && (zzm2 = zzj().zzm(str13, "_sno")) != null) {
                            Object obj2 = zzm2.zze;
                            if (obj2 instanceof Long) {
                                zzt().zzO(zzf, "_sno", obj2);
                            }
                        }
                        zzaw zzj4 = zzj();
                        zzae.checkNotEmpty(str13);
                        zzj4.zzg();
                        zzj4.zzay();
                        try {
                            j2 = zzj4.zze().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str13, String.valueOf(Math.max(0, Math.min(1000000, ((zzic) zzj4.$$delegate_0).zzg.zzm(str13, zzfy.zzp))))});
                        } catch (SQLiteException e) {
                            ((zzic) zzj4.$$delegate_0).zzaW().zzb().zzc("Error deleting over the limit events. appId", zzgu.zzl(str13), e);
                            j2 = 0;
                        }
                        if (j2 > 0) {
                            zzaW().zze().zzc("Data lost. Too many events stored on disk, deleted. appId", zzgu.zzl(str13), Long.valueOf(j2));
                        }
                        zzic zzicVar2 = this.zzn;
                        zzbc zzbcVar2 = new zzbc(zzicVar2, zzb2.zzc, str13, zzb2.zza, zzb2.zzd, zzb2.zze, 0L, zzf);
                        zzaw zzj5 = zzj();
                        String str19 = (String) zzbcVar2.zzb;
                        zzbd zzaE = zzj5.zzaE("events", str13, str19);
                        if (zzaE == null) {
                            long zzT = zzj().zzT(str13);
                            zzd().getClass();
                            zzfx zzfxVar = zzfy.zzW;
                            if (zzT < Math.max(Math.min(r5.zzm(str13, zzfxVar), 2000), 500) || !zzh2 || zzt().zzq(str19)) {
                                key2 = key;
                                zzbdVar = new zzbd(str13, str19, 0L, 0L, 0L, zzbcVar2.zzd, 0L, null, null, null, null);
                                zzbcVar = zzbcVar2;
                            } else {
                                zzgs zzb3 = zzaW().zzb();
                                zzgt zzl = zzgu.zzl(str13);
                                String zza2 = zzicVar2.zzl().zza(str19);
                                zzal zzd2 = zzd();
                                zzd2.getClass();
                                zzb3.zzd("Too many event names used, ignoring event. appId, name, supported count", zzl, zza2, Integer.valueOf(Math.max(Math.min(zzd2.zzm(str13, zzfxVar), 2000), 500)));
                                zzt();
                                zzpp.zzP(key, str13, 8, null, null, 0);
                            }
                        } else {
                            key2 = key;
                            zzbc zza3 = zzbcVar2.zza(zzicVar2, zzaE.zzf);
                            zzbd zza4 = zzaE.zza(zza3.zzd);
                            zzbcVar = zza3;
                            zzbdVar = zza4;
                        }
                        zzj().zzaF("events", zzbdVar);
                        zzaX().zzg();
                        zzu$3();
                        String str20 = (String) zzbcVar.zza;
                        zzae.checkNotEmpty(str20);
                        zzae.checkArgument(str20.equals(str13));
                        com.google.android.gms.internal.measurement.zzic zzaE2 = zzid.zzaE();
                        zzaE2.zza();
                        zzaE2.zzC$1();
                        if (!TextUtils.isEmpty(str13)) {
                            zzaE2.zzL$1(str13);
                        }
                        String str21 = zzrVar.zzd;
                        if (!TextUtils.isEmpty(str21)) {
                            zzaE2.zzJ(str21);
                        }
                        String str22 = zzrVar.zzc;
                        if (!TextUtils.isEmpty(str22)) {
                            zzaE2.zzM(str22);
                        }
                        String str23 = zzrVar.zzu;
                        if (!TextUtils.isEmpty(str23)) {
                            zzaE2.zzau(str23);
                        }
                        long j7 = zzrVar.zzj;
                        if (j7 != -2147483648L) {
                            zzaE2.zzaj((int) j7);
                        }
                        long j8 = zzrVar.zze;
                        zzaE2.zzN(j8);
                        if (TextUtils.isEmpty(str5)) {
                            str7 = "raw_events";
                            str8 = str5;
                        } else {
                            str7 = "raw_events";
                            str8 = str5;
                            zzaE2.zzad(str8);
                        }
                        zzae.checkNotNull(str13);
                        String str24 = str23;
                        zzjl zzB = zzB(str13);
                        String str25 = zzrVar.zzs;
                        zzjl zzs2 = zzB.zzs(zzjl.zzf(100, str25));
                        zzaE2.zzat(zzs2.zzk());
                        zzaif.zza();
                        boolean zzp = zzd().zzp(str13, zzfy.zzaO);
                        zzjk zzjkVar = zzjk.AD_STORAGE;
                        try {
                            if (zzp) {
                                zzt();
                                if (zzpp.zzaE((String) zzfy.zzaq.zzb(null), str13)) {
                                    zzaE2.zzaH(zzrVar.zzz);
                                    str9 = str8;
                                    key3 = key2;
                                    long j9 = zzrVar.zzA;
                                    if (!zzs2.zzo(zzjkVar) && j9 != 0) {
                                        j9 = (j9 & (-2)) | 32;
                                    }
                                    zzaE2.zzaz(j9 == 1);
                                    if (j9 != 0) {
                                        zzhd zzi = com.google.android.gms.internal.measurement.zzhe.zzi();
                                        zzi.zza((j9 & 1) != 0);
                                        zzi.zzb((j9 & 2) != 0);
                                        zzi.zzc((j9 & 4) != 0);
                                        zzi.zzd((j9 & 8) != 0);
                                        zzi.zze((j9 & 16) != 0);
                                        zzi.zzf((j9 & 32) != 0);
                                        zzi.zzg((j9 & 64) != 0);
                                        zzaE2.zzaI((com.google.android.gms.internal.measurement.zzhe) zzi.zzbd());
                                    }
                                    j3 = zzrVar.zzf;
                                    if (j3 != 0) {
                                        zzaE2.zzY(j3);
                                    }
                                    long j10 = zzrVar.zzq;
                                    zzaE2.zzar(j10);
                                    if (zzd().zzp(null, zzfy.zzaU)) {
                                        zzd();
                                        zzaE2.zzaQ(zzagr.zza());
                                    }
                                    if (zzd().zzp(null, zzfy.zzaV) && (zzm = zzh().zzm(str13)) != null) {
                                        zzaE2.zzaq(zzm);
                                    }
                                    zzs = zzB(str13).zzs(zzjl.zzf(100, str25));
                                    if (zzs.zzo(zzjkVar) && (z2 = zzrVar.zzn)) {
                                        zzc = this.zzk.zzc(zzrVar, zzs);
                                        if (!TextUtils.isEmpty((CharSequence) zzc.first) && z2) {
                                            zzaE2.zzQ((String) zzc.first);
                                            obj = zzc.second;
                                            if (obj != null) {
                                                zzaE2.zzT(((Boolean) obj).booleanValue());
                                            }
                                            str12 = str3;
                                            if (!((String) zzbcVar.zzb).equals(str12) && !((String) zzc.first).equals("00000000-0000-0000-0000-000000000000") && (zzu2 = zzj().zzu(str13)) != null && zzu2.zzaq()) {
                                                zzR(str13, false, null, null);
                                                Bundle bundle2 = new Bundle();
                                                zzas = zzu2.zzas();
                                                if (zzas == null) {
                                                    j4 = j10;
                                                    str10 = str22;
                                                    zzjlVar = zzs;
                                                    bundle2.putLong("_pfo", Math.max(0L, zzas.longValue()));
                                                } else {
                                                    j4 = j10;
                                                    str10 = str22;
                                                    zzjlVar = zzs;
                                                }
                                                zzau = zzu2.zzau();
                                                if (zzau != null) {
                                                    bundle2.putLong("_uwa", zzau.longValue());
                                                }
                                                bundle2.putLong("_r", 1L);
                                                key3.zza(str13, str12, bundle2);
                                                zzicVar2.zzu().zzw();
                                                String str26 = Build.MODEL;
                                                zzaE2.zzF$1();
                                                zzicVar2.zzu().zzw();
                                                zzaE2.zzE$1(Build.VERSION.RELEASE);
                                                zzaE2.zzI((int) zzicVar2.zzu().zzb());
                                                zzaE2.zzH(zzicVar2.zzu().zzc());
                                                zzaE2.zzay(zzrVar.zzw);
                                                if (zzicVar2.zzB()) {
                                                    zzaE2.zzK();
                                                    if (!TextUtils.isEmpty(null)) {
                                                        zzaE2.zzam(null);
                                                    }
                                                }
                                                zzu = zzj().zzu(str13);
                                                if (zzu != null) {
                                                    zzu = new zzh(zzicVar2, str13);
                                                    zzjlVar2 = zzjlVar;
                                                    zzu.zze(zzK(zzjlVar2));
                                                    zzu.zzm(zzrVar.zzk);
                                                    zzu.zzg(str9);
                                                    if (zzjlVar2.zzo(zzjkVar)) {
                                                        zzu.zzk(this.zzk.zzf(zzrVar, zzjlVar2));
                                                    }
                                                    zzu.zzF(0L);
                                                    zzu.zzo(0L);
                                                    zzu.zzq(0L);
                                                    zzu.zzs(str10);
                                                    zzu.zzu(j7);
                                                    zzu.zzw(str21);
                                                    zzu.zzy(j8);
                                                    zzu.zzA(j3);
                                                    zzu.zzE(z);
                                                    zzu.zzC(j4);
                                                    i = 0;
                                                    zzj().zzv(zzu, false);
                                                } else {
                                                    zzjlVar2 = zzjlVar;
                                                    i = 0;
                                                }
                                                if (zzjlVar2.zzo(zzjk.ANALYTICS_STORAGE) && !TextUtils.isEmpty(zzu.zzd())) {
                                                    String zzd3 = zzu.zzd();
                                                    zzae.checkNotNull(zzd3);
                                                    zzaE2.zzW(zzd3);
                                                }
                                                if (!TextUtils.isEmpty(zzu.zzl())) {
                                                    String zzl2 = zzu.zzl();
                                                    zzae.checkNotNull(zzl2);
                                                    zzaE2.zzah(zzl2);
                                                }
                                                zzn = zzj().zzn(str13);
                                                i2 = i;
                                                while (i2 < zzn.size()) {
                                                    zzit zzm3 = zziu.zzm();
                                                    zzm3.zzb$4(((zzpn) zzn.get(i2)).zzc);
                                                    zzm3.zza(((zzpn) zzn.get(i2)).zzd);
                                                    zzp().zzc(zzm3, ((zzpn) zzn.get(i2)).zze);
                                                    zzaE2.zzp(zzm3);
                                                    if (!"_sid".equals(((zzpn) zzn.get(i2)).zzc) || zzu.zzam() == 0) {
                                                        str11 = str24;
                                                    } else {
                                                        zzpk zzp2 = zzp();
                                                        if (TextUtils.isEmpty(str24)) {
                                                            str11 = str24;
                                                            zzt = 0;
                                                        } else {
                                                            str11 = str24;
                                                            zzt = zzp2.zzt(str11.getBytes(StandardCharsets.UTF_8));
                                                        }
                                                        if (zzt != zzu.zzam()) {
                                                            zzaE2.zzav();
                                                        }
                                                    }
                                                    i2++;
                                                    str24 = str11;
                                                }
                                                zzj = zzj();
                                                zzidVar = (zzid) zzaE2.zzbd();
                                                zzj.zzg();
                                                zzj.zzay();
                                                zzae.checkNotEmpty(zzidVar.zzA());
                                                byte[] zzcd = zzidVar.zzcd();
                                                long zzt3 = zzj.zzg.zzp().zzt(zzcd);
                                                ContentValues contentValues2 = new ContentValues();
                                                String str27 = str2;
                                                contentValues2.put(str27, zzidVar.zzA());
                                                contentValues2.put("metadata_fingerprint", Long.valueOf(zzt3));
                                                contentValues2.put("metadata", zzcd);
                                                zzj.zze().insertWithOnConflict("raw_events_metadata", null, contentValues2, 4);
                                                zzj2 = zzj();
                                                zzbeVar = new zzbe((zzbf) zzbcVar.zzg);
                                                while (true) {
                                                    if (zzbeVar.hasNext()) {
                                                        zzht zzh3 = zzh();
                                                        String str28 = (String) zzbcVar.zza;
                                                        boolean zzk = zzh3.zzk(str28, (String) zzbcVar.zzb);
                                                        zzar zzw = zzj().zzw(zzC(), str28, false, false, false, false);
                                                        if (!zzk || zzw.zze >= zzd().zzm(str28, zzfy.zzo)) {
                                                            i3 = i;
                                                        }
                                                    } else if ("_r".equals(zzbeVar.zza())) {
                                                        break;
                                                    }
                                                }
                                                zzj2.zzg();
                                                zzj2.zzay();
                                                String str29 = (String) zzbcVar.zza;
                                                zzae.checkNotEmpty(str29);
                                                byte[] zzcd2 = zzj2.zzg.zzp().zzh(zzbcVar).zzcd();
                                                contentValues = new ContentValues();
                                                contentValues.put(str27, str29);
                                                contentValues.put("name", (String) zzbcVar.zzb);
                                                contentValues.put("timestamp", Long.valueOf(zzbcVar.zzd));
                                                contentValues.put("metadata_fingerprint", Long.valueOf(zzt3));
                                                contentValues.put("data", zzcd2);
                                                contentValues.put("realtime", Integer.valueOf(i3));
                                                contentValues.put("elapsed_time", Long.valueOf(zzbcVar.zze));
                                                if (zzj2.zze().insert(str7, null, contentValues) != -1) {
                                                    ((zzic) zzj2.$$delegate_0).zzaW().zzb().zzb(zzgu.zzl(str29), "Failed to insert raw event (got -1). appId");
                                                } else {
                                                    this.zza = 0L;
                                                }
                                                zzj().zzc();
                                                zzj().zzd();
                                                zzaM();
                                                zzaW().zzk().zzb(Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000), "Background event processing time, ms");
                                                return;
                                            }
                                        }
                                    }
                                    j4 = j10;
                                    str10 = str22;
                                    zzjlVar = zzs;
                                    zzicVar2.zzu().zzw();
                                    String str262 = Build.MODEL;
                                    zzaE2.zzF$1();
                                    zzicVar2.zzu().zzw();
                                    zzaE2.zzE$1(Build.VERSION.RELEASE);
                                    zzaE2.zzI((int) zzicVar2.zzu().zzb());
                                    zzaE2.zzH(zzicVar2.zzu().zzc());
                                    zzaE2.zzay(zzrVar.zzw);
                                    if (zzicVar2.zzB()) {
                                    }
                                    zzu = zzj().zzu(str13);
                                    if (zzu != null) {
                                    }
                                    if (zzjlVar2.zzo(zzjk.ANALYTICS_STORAGE)) {
                                        String zzd32 = zzu.zzd();
                                        zzae.checkNotNull(zzd32);
                                        zzaE2.zzW(zzd32);
                                    }
                                    if (!TextUtils.isEmpty(zzu.zzl())) {
                                    }
                                    zzn = zzj().zzn(str13);
                                    i2 = i;
                                    while (i2 < zzn.size()) {
                                    }
                                    zzj = zzj();
                                    zzidVar = (zzid) zzaE2.zzbd();
                                    zzj.zzg();
                                    zzj.zzay();
                                    zzae.checkNotEmpty(zzidVar.zzA());
                                    byte[] zzcd3 = zzidVar.zzcd();
                                    long zzt32 = zzj.zzg.zzp().zzt(zzcd3);
                                    ContentValues contentValues22 = new ContentValues();
                                    String str272 = str2;
                                    contentValues22.put(str272, zzidVar.zzA());
                                    contentValues22.put("metadata_fingerprint", Long.valueOf(zzt32));
                                    contentValues22.put("metadata", zzcd3);
                                    zzj.zze().insertWithOnConflict("raw_events_metadata", null, contentValues22, 4);
                                    zzj2 = zzj();
                                    zzbeVar = new zzbe((zzbf) zzbcVar.zzg);
                                    while (true) {
                                        if (zzbeVar.hasNext()) {
                                        }
                                    }
                                    zzj2.zzg();
                                    zzj2.zzay();
                                    String str292 = (String) zzbcVar.zza;
                                    zzae.checkNotEmpty(str292);
                                    byte[] zzcd22 = zzj2.zzg.zzp().zzh(zzbcVar).zzcd();
                                    contentValues = new ContentValues();
                                    contentValues.put(str272, str292);
                                    contentValues.put("name", (String) zzbcVar.zzb);
                                    contentValues.put("timestamp", Long.valueOf(zzbcVar.zzd));
                                    contentValues.put("metadata_fingerprint", Long.valueOf(zzt32));
                                    contentValues.put("data", zzcd22);
                                    contentValues.put("realtime", Integer.valueOf(i3));
                                    contentValues.put("elapsed_time", Long.valueOf(zzbcVar.zze));
                                    if (zzj2.zze().insert(str7, null, contentValues) != -1) {
                                    }
                                    zzj().zzc();
                                    zzj().zzd();
                                    zzaM();
                                    zzaW().zzk().zzb(Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000), "Background event processing time, ms");
                                    return;
                                }
                            }
                            if (zzs.zzo(zzjkVar)) {
                                zzc = this.zzk.zzc(zzrVar, zzs);
                                if (!TextUtils.isEmpty((CharSequence) zzc.first)) {
                                    zzaE2.zzQ((String) zzc.first);
                                    obj = zzc.second;
                                    if (obj != null) {
                                    }
                                    str12 = str3;
                                    if (!((String) zzbcVar.zzb).equals(str12)) {
                                        zzR(str13, false, null, null);
                                        Bundle bundle22 = new Bundle();
                                        zzas = zzu2.zzas();
                                        if (zzas == null) {
                                        }
                                        zzau = zzu2.zzau();
                                        if (zzau != null) {
                                        }
                                        bundle22.putLong("_r", 1L);
                                        key3.zza(str13, str12, bundle22);
                                        zzicVar2.zzu().zzw();
                                        String str2622 = Build.MODEL;
                                        zzaE2.zzF$1();
                                        zzicVar2.zzu().zzw();
                                        zzaE2.zzE$1(Build.VERSION.RELEASE);
                                        zzaE2.zzI((int) zzicVar2.zzu().zzb());
                                        zzaE2.zzH(zzicVar2.zzu().zzc());
                                        zzaE2.zzay(zzrVar.zzw);
                                        if (zzicVar2.zzB()) {
                                        }
                                        zzu = zzj().zzu(str13);
                                        if (zzu != null) {
                                        }
                                        if (zzjlVar2.zzo(zzjk.ANALYTICS_STORAGE)) {
                                        }
                                        if (!TextUtils.isEmpty(zzu.zzl())) {
                                        }
                                        zzn = zzj().zzn(str13);
                                        i2 = i;
                                        while (i2 < zzn.size()) {
                                        }
                                        zzj = zzj();
                                        zzidVar = (zzid) zzaE2.zzbd();
                                        zzj.zzg();
                                        zzj.zzay();
                                        zzae.checkNotEmpty(zzidVar.zzA());
                                        byte[] zzcd32 = zzidVar.zzcd();
                                        long zzt322 = zzj.zzg.zzp().zzt(zzcd32);
                                        ContentValues contentValues222 = new ContentValues();
                                        String str2722 = str2;
                                        contentValues222.put(str2722, zzidVar.zzA());
                                        contentValues222.put("metadata_fingerprint", Long.valueOf(zzt322));
                                        contentValues222.put("metadata", zzcd32);
                                        zzj.zze().insertWithOnConflict("raw_events_metadata", null, contentValues222, 4);
                                        zzj2 = zzj();
                                        zzbeVar = new zzbe((zzbf) zzbcVar.zzg);
                                        while (true) {
                                            if (zzbeVar.hasNext()) {
                                            }
                                        }
                                        zzj2.zzg();
                                        zzj2.zzay();
                                        String str2922 = (String) zzbcVar.zza;
                                        zzae.checkNotEmpty(str2922);
                                        byte[] zzcd222 = zzj2.zzg.zzp().zzh(zzbcVar).zzcd();
                                        contentValues = new ContentValues();
                                        contentValues.put(str2722, str2922);
                                        contentValues.put("name", (String) zzbcVar.zzb);
                                        contentValues.put("timestamp", Long.valueOf(zzbcVar.zzd));
                                        contentValues.put("metadata_fingerprint", Long.valueOf(zzt322));
                                        contentValues.put("data", zzcd222);
                                        contentValues.put("realtime", Integer.valueOf(i3));
                                        contentValues.put("elapsed_time", Long.valueOf(zzbcVar.zze));
                                        if (zzj2.zze().insert(str7, null, contentValues) != -1) {
                                        }
                                        zzj().zzc();
                                        zzj().zzd();
                                        zzaM();
                                        zzaW().zzk().zzb(Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000), "Background event processing time, ms");
                                        return;
                                    }
                                }
                            }
                            zzj.zze().insertWithOnConflict("raw_events_metadata", null, contentValues222, 4);
                            zzj2 = zzj();
                            zzbeVar = new zzbe((zzbf) zzbcVar.zzg);
                            while (true) {
                                if (zzbeVar.hasNext()) {
                                }
                            }
                            zzj2.zzg();
                            zzj2.zzay();
                            String str29222 = (String) zzbcVar.zza;
                            zzae.checkNotEmpty(str29222);
                            byte[] zzcd2222 = zzj2.zzg.zzp().zzh(zzbcVar).zzcd();
                            contentValues = new ContentValues();
                            contentValues.put(str2722, str29222);
                            contentValues.put("name", (String) zzbcVar.zzb);
                            contentValues.put("timestamp", Long.valueOf(zzbcVar.zzd));
                            contentValues.put("metadata_fingerprint", Long.valueOf(zzt322));
                            contentValues.put("data", zzcd2222);
                            contentValues.put("realtime", Integer.valueOf(i3));
                            contentValues.put("elapsed_time", Long.valueOf(zzbcVar.zze));
                            if (zzj2.zze().insert(str7, null, contentValues) != -1) {
                            }
                            zzj().zzc();
                            zzj().zzd();
                            zzaM();
                            zzaW().zzk().zzb(Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000), "Background event processing time, ms");
                            return;
                        } catch (SQLiteException e2) {
                            ((zzic) zzj.$$delegate_0).zzaW().zzb().zzc("Error storing raw event metadata. appId", zzgu.zzl(zzidVar.zzA()), e2);
                            throw e2;
                        }
                        str9 = str8;
                        key3 = key2;
                        j3 = zzrVar.zzf;
                        if (j3 != 0) {
                        }
                        long j102 = zzrVar.zzq;
                        zzaE2.zzar(j102);
                        if (zzd().zzp(null, zzfy.zzaU)) {
                        }
                        if (zzd().zzp(null, zzfy.zzaV)) {
                            zzaE2.zzaq(zzm);
                        }
                        zzs = zzB(str13).zzs(zzjl.zzf(100, str25));
                        j4 = j102;
                        str10 = str22;
                        zzjlVar = zzs;
                        zzicVar2.zzu().zzw();
                        String str26222 = Build.MODEL;
                        zzaE2.zzF$1();
                        zzicVar2.zzu().zzw();
                        zzaE2.zzE$1(Build.VERSION.RELEASE);
                        zzaE2.zzI((int) zzicVar2.zzu().zzb());
                        zzaE2.zzH(zzicVar2.zzu().zzc());
                        zzaE2.zzay(zzrVar.zzw);
                        if (zzicVar2.zzB()) {
                        }
                        zzu = zzj().zzu(str13);
                        if (zzu != null) {
                        }
                        if (zzjlVar2.zzo(zzjk.ANALYTICS_STORAGE)) {
                        }
                        if (!TextUtils.isEmpty(zzu.zzl())) {
                        }
                        zzn = zzj().zzn(str13);
                        i2 = i;
                        while (i2 < zzn.size()) {
                        }
                        zzj = zzj();
                        zzidVar = (zzid) zzaE2.zzbd();
                        zzj.zzg();
                        zzj.zzay();
                        zzae.checkNotEmpty(zzidVar.zzA());
                        byte[] zzcd322 = zzidVar.zzcd();
                        long zzt3222 = zzj.zzg.zzp().zzt(zzcd322);
                        ContentValues contentValues2222 = new ContentValues();
                        String str27222 = str2;
                        contentValues2222.put(str27222, zzidVar.zzA());
                        contentValues2222.put("metadata_fingerprint", Long.valueOf(zzt3222));
                        contentValues2222.put("metadata", zzcd322);
                    }
                    zzj().zzd();
                }
                z4 = true;
            }
            String zzd4 = zzbfVar2.zzd("currency");
            str2 = "app_id";
            if (z4) {
                double doubleValue = zzbfVar2.zzc().doubleValue() * 1000000.0d;
                if (doubleValue == 0.0d) {
                    str3 = "_fx";
                    doubleValue = zzbfVar2.zzb("value").longValue() * 1000000.0d;
                } else {
                    str3 = "_fx";
                }
                if (doubleValue > 9.223372036854776E18d || doubleValue < -9.223372036854776E18d) {
                    zzaW().zze().zzc("Data lost. Currency value is too big. appId", zzgu.zzl(str13), Double.valueOf(doubleValue));
                    zzj().zzc();
                    zzj().zzd();
                } else {
                    longValue = Math.round(doubleValue);
                    if ("refund".equals(str17)) {
                        longValue = -longValue;
                    }
                }
            } else {
                str3 = "_fx";
                longValue = zzbfVar2.zzb("value").longValue();
            }
            if (!TextUtils.isEmpty(zzd4)) {
                String upperCase = zzd4.toUpperCase(Locale.US);
                if (upperCase.matches("[A-Z]{3}")) {
                    String concat = "_ltv_".concat(upperCase);
                    zzpn zzm4 = zzj().zzm(str13, concat);
                    if (zzm4 != null) {
                        Object obj3 = zzm4.zze;
                        if (obj3 instanceof Long) {
                            long longValue2 = ((Long) obj3).longValue();
                            String str30 = zzb2.zzc;
                            zzba().getClass();
                            str4 = str;
                            zzpnVar = new zzpn(str13, str30, concat, System.currentTimeMillis(), Long.valueOf(longValue2 + longValue));
                            str5 = str14;
                            z = z3;
                            zzbfVar = zzbfVar2;
                            str6 = str17;
                            if (zzj().zzl(zzpnVar)) {
                                key = key4;
                            } else {
                                zzaW().zzb().zzd("Too many unique user properties are set. Ignoring user property. appId", zzgu.zzl(str13), zzicVar.zzl().zzc(zzpnVar.zzc), zzpnVar.zze);
                                zzt();
                                zzpp.zzP(key4, str13, 9, null, null, 0);
                                key = key4;
                            }
                            boolean zzh22 = zzpp.zzh(str6);
                            String str182 = str6;
                            boolean equals2 = str4.equals(str182);
                            zzt();
                            if (zzbfVar == null) {
                            }
                            zzar zzx2 = zzj().zzx(zzC(), str13, j + 1, true, zzh22, false, equals2, false, false, false);
                            long j52 = zzx2.zzb;
                            zzd();
                            intValue = j52 - ((Integer) zzfy.zzk.zzb(null)).intValue();
                            if (intValue > 0) {
                            }
                            zzj().zzd();
                        }
                    }
                    long j11 = longValue;
                    str4 = str;
                    zzaw zzj6 = zzj();
                    int zzm5 = zzd().zzm(str13, zzfy.zzT) - 1;
                    zzae.checkNotEmpty(str13);
                    zzj6.zzg();
                    zzj6.zzay();
                    String str31 = concat;
                    zzj6.zze().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '!_ltv!_%' escape '!'order by set_timestamp desc limit ?,10);", new String[]{str13, str13, String.valueOf(zzm5)});
                    String str32 = zzb2.zzc;
                    zzba().getClass();
                    str5 = str14;
                    z = z3;
                    zzbfVar = zzbfVar2;
                    str6 = str17;
                    zzpnVar = new zzpn(str13, str32, str31, System.currentTimeMillis(), Long.valueOf(j11));
                    if (zzj().zzl(zzpnVar)) {
                    }
                    boolean zzh222 = zzpp.zzh(str6);
                    String str1822 = str6;
                    boolean equals22 = str4.equals(str1822);
                    zzt();
                    if (zzbfVar == null) {
                    }
                    zzar zzx22 = zzj().zzx(zzC(), str13, j + 1, true, zzh222, false, equals22, false, false, false);
                    long j522 = zzx22.zzb;
                    zzd();
                    intValue = j522 - ((Integer) zzfy.zzk.zzb(null)).intValue();
                    if (intValue > 0) {
                    }
                    zzj().zzd();
                }
            }
            z = z3;
            zzbfVar = zzbfVar2;
            str6 = str17;
            str5 = str14;
            key = key4;
            str4 = str;
            boolean zzh2222 = zzpp.zzh(str6);
            String str18222 = str6;
            boolean equals222 = str4.equals(str18222);
            zzt();
            if (zzbfVar == null) {
            }
            zzar zzx222 = zzj().zzx(zzC(), str13, j + 1, true, zzh2222, false, equals222, false, false, false);
            long j5222 = zzx222.zzb;
            zzd();
            intValue = j5222 - ((Integer) zzfy.zzk.zzb(null)).intValue();
            if (intValue > 0) {
            }
            zzj().zzd();
        } catch (Throwable th) {
            zzj().zzd();
            throw th;
        }
    }

    public final void zzI(zzh zzhVar, com.google.android.gms.internal.measurement.zzic zzicVar) {
        zziu zziuVar;
        zzaX().zzg();
        zzu$3();
        n.b zzd = n.b.zzd(zzicVar.zzaA());
        String zzc = zzhVar.zzc();
        zzaX().zzg();
        zzu$3();
        zzjl zzB = zzB(zzc);
        EnumMap enumMap = zzB.zzb;
        zzjk zzjkVar = zzjk.AD_STORAGE;
        zzji zzjiVar = (zzji) enumMap.get(zzjkVar);
        zzji zzjiVar2 = zzji.UNINITIALIZED;
        if (zzjiVar == null) {
            zzjiVar = zzjiVar2;
        }
        int i = zzB.zzc;
        int ordinal = zzjiVar.ordinal();
        zzam zzamVar = zzam.REMOTE_ENFORCED_DEFAULT;
        zzam zzamVar2 = zzam.FAILSAFE;
        if (ordinal == 1) {
            zzd.zzc(zzjkVar, zzamVar);
        } else if (ordinal == 2 || ordinal == 3) {
            zzd.zzb(zzjkVar, i);
        } else {
            zzd.zzc(zzjkVar, zzamVar2);
        }
        zzjk zzjkVar2 = zzjk.ANALYTICS_STORAGE;
        zzji zzjiVar3 = (zzji) enumMap.get(zzjkVar2);
        if (zzjiVar3 != null) {
            zzjiVar2 = zzjiVar3;
        }
        int ordinal2 = zzjiVar2.ordinal();
        if (ordinal2 == 1) {
            zzd.zzc(zzjkVar2, zzamVar);
        } else if (ordinal2 == 2 || ordinal2 == 3) {
            zzd.zzb(zzjkVar2, i);
        } else {
            zzd.zzc(zzjkVar2, zzamVar2);
        }
        String zzc2 = zzhVar.zzc();
        zzaX().zzg();
        zzu$3();
        zzba zzz = zzz(zzc2, zzx(zzc2), zzB(zzc2), zzd);
        String str = zzz.zze;
        Boolean bool = zzz.zzd;
        zzae.checkNotNull(bool);
        zzicVar.zzaD(bool.booleanValue());
        if (!TextUtils.isEmpty(str)) {
            zzicVar.zzaF(str);
        }
        zzaX().zzg();
        zzu$3();
        Iterator it = zzicVar.zzk().iterator();
        while (true) {
            if (it.hasNext()) {
                zziuVar = (zziu) it.next();
                if ("_npa".equals(zziuVar.zzc())) {
                    break;
                }
            } else {
                zziuVar = null;
                break;
            }
        }
        if (zziuVar == null) {
            int zzaD = zzaD(zzhVar.zzc(), zzd);
            zzit zzm = zziu.zzm();
            zzm.zzb$4("_npa");
            zzba().getClass();
            zzm.zza(System.currentTimeMillis());
            zzm.zze$1(zzaD);
            zzicVar.zzo((zziu) zzm.zzbd());
            zzaW().zzl.zzc("Setting user property", "non_personalized_ads(_npa)", Integer.valueOf(zzaD));
        } else if (zzd.zza() == zzam.UNSET) {
            zzaw zzawVar = this.zze;
            zzaT(zzawVar);
            zzpn zzm2 = zzawVar.zzm(zzhVar.zzc(), "_npa");
            zzam zzamVar3 = zzam.MANIFEST;
            zzam zzamVar4 = zzam.API;
            zzjk zzjkVar3 = zzjk.AD_PERSONALIZATION;
            if (zzm2 != null) {
                String str2 = zzm2.zzb;
                if ("tcf".equals(str2)) {
                    zzd.zzc(zzjkVar3, zzam.TCF);
                } else if ("app".equals(str2)) {
                    zzd.zzc(zzjkVar3, zzamVar4);
                } else {
                    zzd.zzc(zzjkVar3, zzamVar3);
                }
            } else {
                Boolean zzae = zzhVar.zzae();
                if (zzae == null || ((zzae.booleanValue() && zziuVar.zzh() != 1) || !(zzae.booleanValue() || zziuVar.zzh() == 0))) {
                    zzd.zzc(zzjkVar3, zzamVar4);
                } else {
                    zzd.zzc(zzjkVar3, zzamVar3);
                }
            }
        }
        zzicVar.zzaB(zzd.toString());
        String zzc3 = zzhVar.zzc();
        zzht zzhtVar = this.zzc;
        zzhtVar.zzg();
        zzhtVar.zzF(zzc3);
        com.google.android.gms.internal.measurement.zzgf zzy = zzhtVar.zzy(zzc3);
        int i2 = 0;
        boolean z = zzy == null || !zzy.zzd() || zzy.zze();
        List zzb2 = zzicVar.zzb();
        for (int i3 = 0; i3 < zzb2.size(); i3++) {
            if ("_tcf".equals(((zzhs) zzb2.get(i3)).zzd())) {
                zzhr zzhrVar = (zzhr) ((zzhs) zzb2.get(i3)).zzco();
                List zza = zzhrVar.zza();
                int i4 = 0;
                while (true) {
                    if (i4 >= zza.size()) {
                        break;
                    }
                    if ("_tcfd".equals(((com.google.android.gms.internal.measurement.zzhw) zza.get(i4)).zzb())) {
                        String zzd2 = ((com.google.android.gms.internal.measurement.zzhw) zza.get(i4)).zzd();
                        if (z && zzd2.length() > 4) {
                            char[] charArray = zzd2.toCharArray();
                            int i5 = 1;
                            while (true) {
                                if (i5 >= 64) {
                                    break;
                                }
                                if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i5)) {
                                    i2 = i5;
                                    break;
                                }
                                i5++;
                            }
                            charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i2 | 1);
                            zzd2 = String.valueOf(charArray);
                        }
                        com.google.android.gms.internal.measurement.zzhv zzn = com.google.android.gms.internal.measurement.zzhw.zzn();
                        zzn.zzb$3("_tcfd");
                        zzn.zzd$1(zzd2);
                        zzhrVar.zze(i4, zzn);
                    } else {
                        i4++;
                    }
                }
                zzicVar.zzf(i3, zzhrVar);
                return;
            }
        }
    }

    public final void zzJ(zzh zzhVar, com.google.android.gms.internal.measurement.zzic zzicVar) {
        Serializable zzT;
        zzaX().zzg();
        zzu$3();
        com.google.android.gms.internal.measurement.zzgx zzt = zzha.zzt();
        byte[] zzaJ = zzhVar.zzaJ();
        if (zzaJ != null) {
            try {
                zzt = (com.google.android.gms.internal.measurement.zzgx) zzpk.zzw(zzt, zzaJ);
            } catch (zzaeh unused) {
                zzaW().zzg.zzb(zzgu.zzl(zzhVar.zzc()), "Failed to parse locally stored ad campaign info. appId");
            }
        }
        for (zzhs zzhsVar : zzicVar.zzb()) {
            if (zzhsVar.zzd().equals("_cmp")) {
                com.google.android.gms.internal.measurement.zzhw zzI = zzpk.zzI(zzhsVar, "gclid");
                Serializable zzT2 = zzI == null ? null : zzpk.zzT(zzI);
                if (zzT2 == null) {
                    zzT2 = "";
                }
                String str = (String) zzT2;
                com.google.android.gms.internal.measurement.zzhw zzI2 = zzpk.zzI(zzhsVar, "gbraid");
                Serializable zzT3 = zzI2 == null ? null : zzpk.zzT(zzI2);
                if (zzT3 == null) {
                    zzT3 = "";
                }
                String str2 = (String) zzT3;
                com.google.android.gms.internal.measurement.zzhw zzI3 = zzpk.zzI(zzhsVar, "gad_source");
                Serializable zzT4 = zzI3 == null ? null : zzpk.zzT(zzI3);
                if (zzT4 == null) {
                    zzT4 = "";
                }
                String str3 = (String) zzT4;
                com.google.android.gms.internal.measurement.zzhw zzI4 = zzpk.zzI(zzhsVar, "deep_link_url");
                Object zzT5 = zzI4 == null ? null : zzpk.zzT(zzI4);
                String str4 = (String) (zzT5 != null ? zzT5 : "");
                String[] split = ((String) zzfy.zzbb.zzb(null)).split(",");
                zzp();
                HashMap hashMap = new HashMap();
                for (com.google.android.gms.internal.measurement.zzhw zzhwVar : zzhsVar.zza()) {
                    if (Arrays.asList(split).contains(zzhwVar.zzb()) && (zzT = zzpk.zzT(zzhwVar)) != null) {
                        hashMap.put(zzhwVar.zzb(), zzT);
                    }
                }
                if (!hashMap.isEmpty()) {
                    com.google.android.gms.internal.measurement.zzhw zzI5 = zzpk.zzI(zzhsVar, "click_timestamp");
                    Object zzT6 = zzI5 == null ? null : zzpk.zzT(zzI5);
                    long longValue = ((Long) (zzT6 != null ? zzT6 : 0L)).longValue();
                    if (longValue <= 0) {
                        longValue = zzhsVar.zzf();
                    }
                    com.google.android.gms.internal.measurement.zzhw zzI6 = zzpk.zzI(zzhsVar, "_cis");
                    if ("referrer API v2".equals(zzI6 == null ? null : zzpk.zzT(zzI6))) {
                        if (longValue > zzt.zzo()) {
                            if (str.isEmpty()) {
                                zzt.zzj();
                            } else {
                                zzt.zzi$1(str);
                            }
                            if (str2.isEmpty()) {
                                zzt.zzl();
                            } else {
                                zzt.zzk$1(str2);
                            }
                            if (str3.isEmpty()) {
                                zzt.zzn();
                            } else {
                                zzt.zzm(str3);
                            }
                            zzt.zzp(longValue);
                            zzt.zzs();
                            zzt.zzt(zzaE(zzhsVar));
                        }
                    } else if (longValue > zzt.zzg()) {
                        if (str.isEmpty()) {
                            zzt.zzb$1();
                        } else {
                            zzt.zza$3(str);
                        }
                        if (str2.isEmpty()) {
                            zzt.zzd();
                        } else {
                            zzt.zzc$1(str2);
                        }
                        if (str3.isEmpty()) {
                            zzt.zzf$1();
                        } else {
                            zzt.zze(str3);
                        }
                        if (zzd().zzp(null, zzfy.zzba)) {
                            if (str4.isEmpty()) {
                                zzt.zzv$1();
                            } else {
                                zzt.zzu(str4);
                            }
                        }
                        zzt.zzh(longValue);
                        zzt.zzq();
                        zzt.zzr(zzaE(zzhsVar));
                    }
                }
            }
        }
        if (!((zzha) zzt.zzbd()).equals(zzha.zzu())) {
            zzicVar.zzaM((zzha) zzt.zzbd());
        }
        zzhVar.zzaI(((zzha) zzt.zzbd()).zzcd());
        if (zzhVar.zza()) {
            zzaw zzawVar = this.zze;
            zzaT(zzawVar);
            zzawVar.zzv(zzhVar, false);
        }
        if (zzd().zzp(null, zzfy.zzba)) {
            for (int i = 0; i < zzicVar.zzc$1(); i++) {
                zzhs zzd = zzicVar.zzd(i);
                if ("_cmp".equals(zzd.zzd())) {
                    zzhr zzhrVar = (zzhr) zzd.zzco();
                    List zza = zzhrVar.zza();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= zza.size()) {
                            break;
                        }
                        if ("deep_link_url".equals(((com.google.android.gms.internal.measurement.zzhw) zza.get(i2)).zzb())) {
                            zzhrVar.zzj$1(i2);
                            zzicVar.zzf(i, zzhrVar);
                            break;
                        }
                        i2++;
                    }
                }
            }
        }
        if (zzd().zzp(null, zzfy.zzaZ)) {
            zzaw zzawVar2 = this.zze;
            zzaT(zzawVar2);
            zzawVar2.zzk(zzhVar.zzc(), "_lgclid");
        }
    }

    public final String zzK(zzjl zzjlVar) {
        if (!zzjlVar.zzo(zzjk.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        zzt().zzf().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final void zzL(ArrayList arrayList) {
        zzae.checkArgument(!arrayList.isEmpty());
        if (this.zzz != null) {
            zzaW().zzd.zza("Set uploading progress before finishing the previous upload");
        } else {
            this.zzz = new ArrayList(arrayList);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0128, code lost:
    
        if (r7 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01a4, code lost:
    
        if (r1 == 0) goto L71;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.google.android.gms.measurement.internal.zzpg] */
    /* JADX WARN: Type inference failed for: r1v12, types: [long] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v22, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v25, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzM() {
        zzaw zzawVar;
        long longValue;
        SQLiteException e;
        zzaX().zzg();
        zzu$3();
        this.zzw = true;
        try {
            zzic zzicVar = this.zzn;
            zzicVar.getClass();
            Boolean bool = zzicVar.zzt().zzc;
            if (bool == null) {
                zzaW().zzg.zza("Upload data called on the client side before use of service was decided");
            } else if (bool.booleanValue()) {
                zzaW().zzd.zza("Upload called in the client side when service should be used");
            } else if (this.zza > 0) {
                zzaM();
            } else {
                zzaX().zzg();
                if (this.zzz != null) {
                    zzaW().zzl.zza("Uploading requested multiple times");
                } else {
                    zzgz zzgzVar = this.zzd;
                    zzaT(zzgzVar);
                    if (zzgzVar.zzb()) {
                        zzba().getClass();
                        ?? currentTimeMillis = System.currentTimeMillis();
                        Cursor cursor = null;
                        r7 = null;
                        Cursor cursor2 = null;
                        r7 = null;
                        r7 = null;
                        String str = null;
                        int zzm = zzd().zzm(null, zzfy.zzah);
                        zzd();
                        long longValue2 = currentTimeMillis - ((Long) zzfy.zzd.zzb(null)).longValue();
                        for (int i = 0; i < zzm && zzaH(longValue2, null); i++) {
                        }
                        zzaif.zza();
                        zzaX().zzg();
                        zzaG();
                        long zza = this.zzk.zzd.zza();
                        if (zza != 0) {
                            zzaW().zzk.zzb(Long.valueOf(Math.abs(currentTimeMillis - zza)), "Uploading events. Elapsed time since last upload attempt (ms)");
                        }
                        zzaw zzawVar2 = this.zze;
                        zzaT(zzawVar2);
                        String zzF = zzawVar2.zzF();
                        long j = -1;
                        if (TextUtils.isEmpty(zzF)) {
                            try {
                                this.zzB = -1L;
                                zzawVar = this.zze;
                                zzaT(zzawVar);
                                zzd();
                                longValue = currentTimeMillis - ((Long) zzfy.zzd.zzb(null)).longValue();
                                zzawVar.zzg();
                                zzawVar.zzay();
                            } catch (Throwable th) {
                                th = th;
                                cursor = currentTimeMillis;
                            }
                            try {
                                currentTimeMillis = zzawVar.zze().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(longValue)});
                                try {
                                    if (currentTimeMillis.moveToFirst()) {
                                        str = currentTimeMillis.getString(0);
                                    } else {
                                        zzgu zzguVar = ((zzic) zzawVar.$$delegate_0).zzi;
                                        zzic.zzP(zzguVar);
                                        zzguVar.zzl.zza("No expired configs for apps with pending events");
                                    }
                                } catch (SQLiteException e2) {
                                    e = e2;
                                    zzgu zzguVar2 = ((zzic) zzawVar.$$delegate_0).zzi;
                                    zzic.zzP(zzguVar2);
                                    zzguVar2.zzd.zzb(e, "Error selecting expired configs");
                                }
                            } catch (SQLiteException e3) {
                                e = e3;
                                currentTimeMillis = 0;
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                            currentTimeMillis.close();
                            if (!TextUtils.isEmpty(str)) {
                                zzaw zzawVar3 = this.zze;
                                zzaT(zzawVar3);
                                zzh zzu = zzawVar3.zzu(str);
                                if (zzu != null) {
                                    zzX(zzu);
                                }
                            }
                        } else {
                            if (this.zzB == -1) {
                                zzaw zzawVar4 = this.zze;
                                zzaT(zzawVar4);
                                try {
                                    try {
                                        cursor2 = zzawVar4.zze().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                                        if (cursor2.moveToFirst()) {
                                            j = cursor2.getLong(0);
                                        }
                                    } catch (SQLiteException e4) {
                                        zzgu zzguVar3 = ((zzic) zzawVar4.$$delegate_0).zzi;
                                        zzic.zzP(zzguVar3);
                                        zzguVar3.zzd.zzb(e4, "Error querying raw events");
                                    }
                                    cursor2.close();
                                    this.zzB = j;
                                } finally {
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                }
                            }
                            zzN(currentTimeMillis, zzF);
                        }
                    } else {
                        zzaW().zzl.zza("Network not connected, ignoring upload request");
                        zzaM();
                    }
                }
            }
            this.zzw = false;
            zzaN();
        } catch (Throwable th3) {
            this.zzw = false;
            zzaN();
            throw th3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:375:0x0222, code lost:
    
        if (r11 != null) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0751  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x077e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x078c A[EDGE_INSN: B:158:0x078c->B:159:0x078c BREAK  A[LOOP:4: B:97:0x0633->B:126:0x077e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0794  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x07a3  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x09cd  */
    /* JADX WARN: Removed duplicated region for block: B:226:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:245:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:341:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0637  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzN(long j, String str) {
        Cursor cursor;
        zzic zzicVar;
        long j2;
        Cursor cursor2;
        List list;
        List<Pair> list2;
        List list3;
        zzjl zzB;
        zzjk zzjkVar;
        int i;
        List list4;
        com.google.android.gms.internal.measurement.zzhz zzi;
        int size;
        int i2;
        boolean zzo;
        boolean zzp;
        List list5;
        zzic zzicVar2;
        boolean z;
        Object obj;
        zzib zzibVar;
        zzgz zzgzVar;
        String str2;
        zzot zzotVar;
        int i3;
        boolean z2;
        int i4;
        List list6;
        boolean z3;
        String str3;
        List list7;
        boolean isEmpty;
        Cursor cursor3;
        zzic zzicVar3;
        List list8;
        Cursor cursor4;
        List list9;
        Iterator it;
        Iterator it2;
        int i5;
        int i6;
        ArrayList arrayList;
        zzaw zzawVar;
        byte[] byteArray;
        long j3;
        long j4;
        String str4 = str;
        int zzm = zzd().zzm(str4, zzfy.zzg);
        int i7 = 0;
        int max = Math.max(0, zzd().zzm(str4, zzfy.zzh));
        zzaw zzj = zzj();
        zzic zzicVar4 = (zzic) zzj.$$delegate_0;
        zzj.zzg();
        zzj.zzay();
        int i8 = 1;
        zzae.checkArgument(zzm > 0);
        zzae.checkArgument(max > 0);
        zzae.checkNotEmpty(str4);
        try {
            try {
                j2 = -1;
                try {
                    cursor2 = zzj.zze().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str4}, null, null, "rowid", String.valueOf(zzm));
                } catch (SQLiteException e) {
                    e = e;
                    zzicVar = zzicVar4;
                    cursor2 = null;
                    zzicVar.zzaW().zzb().zzc("Error querying bundles. appId", zzgu.zzl(str4), e);
                    list = Collections.EMPTY_LIST;
                }
            } catch (SQLiteException e2) {
                e = e2;
                zzicVar = zzicVar4;
                j2 = -1;
            }
            try {
                try {
                } catch (SQLiteException e3) {
                    e = e3;
                    zzicVar = zzicVar4;
                }
                if (cursor2.moveToFirst()) {
                    ArrayList arrayList2 = new ArrayList();
                    int i9 = 0;
                    while (true) {
                        long j5 = cursor2.getLong(i7);
                        try {
                            byte[] blob = cursor2.getBlob(i8);
                            zzpk zzp2 = zzj.zzg.zzp();
                            try {
                                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(blob);
                                GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                byte[] bArr = new byte[1024];
                                zzawVar = zzj;
                                while (true) {
                                    try {
                                        int read = gZIPInputStream.read(bArr);
                                        if (read <= 0) {
                                            break;
                                        }
                                        zzicVar = zzicVar4;
                                        try {
                                            try {
                                                byteArrayOutputStream.write(bArr, 0, read);
                                                zzicVar4 = zzicVar;
                                            } catch (IOException e4) {
                                                e = e4;
                                                try {
                                                    ((zzic) zzp2.$$delegate_0).zzaW().zzb().zzb(e, "Failed to ungzip content");
                                                    throw e;
                                                } catch (IOException e5) {
                                                    e = e5;
                                                    zzicVar.zzaW().zzb().zzc("Failed to unzip queued bundle. appId", zzgu.zzl(str4), e);
                                                    if (cursor2.moveToNext()) {
                                                        break;
                                                    }
                                                    zzj = zzawVar;
                                                    zzicVar4 = zzicVar;
                                                    i7 = 0;
                                                    i8 = 1;
                                                    cursor2.close();
                                                    list2 = arrayList2;
                                                    if (list2.isEmpty()) {
                                                    }
                                                }
                                            }
                                        } catch (SQLiteException e6) {
                                            e = e6;
                                            zzicVar.zzaW().zzb().zzc("Error querying bundles. appId", zzgu.zzl(str4), e);
                                            list = Collections.EMPTY_LIST;
                                        }
                                    } catch (IOException e7) {
                                        e = e7;
                                        zzicVar = zzicVar4;
                                        ((zzic) zzp2.$$delegate_0).zzaW().zzb().zzb(e, "Failed to ungzip content");
                                        throw e;
                                    }
                                }
                                gZIPInputStream.close();
                                byteArrayInputStream.close();
                                byteArray = byteArrayOutputStream.toByteArray();
                            } catch (IOException e8) {
                                e = e8;
                                zzawVar = zzj;
                            }
                        } catch (IOException e9) {
                            e = e9;
                            zzawVar = zzj;
                            zzicVar = zzicVar4;
                        }
                        if (!arrayList2.isEmpty() && byteArray.length + i9 > max) {
                            break;
                        }
                        try {
                            com.google.android.gms.internal.measurement.zzic zzicVar5 = (com.google.android.gms.internal.measurement.zzic) zzpk.zzw(zzid.zzaE(), byteArray);
                            if (!arrayList2.isEmpty()) {
                                zzid zzidVar = (zzid) ((Pair) arrayList2.get(0)).first;
                                zzid zzidVar2 = (zzid) zzicVar5.zzbd();
                                if (!zzidVar.zzaf().equals(zzidVar2.zzaf()) || !zzidVar.zzam().equals(zzidVar2.zzam()) || zzidVar.zzao() != zzidVar2.zzao() || !zzidVar.zzaq().equals(zzidVar2.zzaq())) {
                                    break;
                                }
                                Iterator it3 = zzidVar.zzf().iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        j3 = -1;
                                        break;
                                    }
                                    zziu zziuVar = (zziu) it3.next();
                                    Iterator it4 = it3;
                                    if ("_npa".equals(zziuVar.zzc())) {
                                        j3 = zziuVar.zzh();
                                        break;
                                    }
                                    it3 = it4;
                                }
                                Iterator it5 = zzidVar2.zzf().iterator();
                                while (true) {
                                    if (!it5.hasNext()) {
                                        j4 = -1;
                                        break;
                                    }
                                    zziu zziuVar2 = (zziu) it5.next();
                                    if ("_npa".equals(zziuVar2.zzc())) {
                                        j4 = zziuVar2.zzh();
                                        break;
                                    }
                                }
                                if (j3 != j4) {
                                    break;
                                }
                            }
                            if (!cursor2.isNull(2)) {
                                zzicVar5.zzao(cursor2.getInt(2));
                            }
                            i9 += byteArray.length;
                            arrayList2.add(Pair.create((zzid) zzicVar5.zzbd(), Long.valueOf(j5)));
                        } catch (IOException e10) {
                            zzicVar4.zzaW().zzb().zzc("Failed to merge queued bundle. appId", zzgu.zzl(str4), e10);
                        }
                        zzicVar = zzicVar4;
                        if (cursor2.moveToNext() || i9 > max) {
                            break;
                            break;
                        }
                        zzj = zzawVar;
                        zzicVar4 = zzicVar;
                        i7 = 0;
                        i8 = 1;
                    }
                    cursor2.close();
                    list2 = arrayList2;
                    if (list2.isEmpty()) {
                    }
                } else {
                    list = Collections.EMPTY_LIST;
                    cursor2.close();
                    list2 = list;
                    if (list2.isEmpty()) {
                        return;
                    }
                    zzahh.zza();
                    zzal zzd = zzd();
                    zzfx zzfxVar = zzfy.zzbc;
                    boolean zzp3 = zzd.zzp(null, zzfxVar);
                    zzjk zzjkVar2 = zzjk.ANALYTICS_STORAGE;
                    if (zzp3) {
                        zzahh.zza();
                        if (!zzd().zzp(null, zzfxVar)) {
                            list7 = list2;
                        } else if (zzB(str4).zzo(zzjkVar2) || !zzh().zzC(str4)) {
                            ArrayList arrayList3 = new ArrayList(list2.size());
                            zzaw zzj2 = zzj();
                            zzic zzicVar6 = (zzic) zzj2.$$delegate_0;
                            zzae.checkNotEmpty(str4);
                            zzj2.zzg();
                            zzj2.zzay();
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                try {
                                    SQLiteDatabase zze = zzj2.zze();
                                    zzicVar6.zzba().getClass();
                                    long currentTimeMillis = System.currentTimeMillis();
                                    Cursor query = zze.query("no_data_mode_events", new String[]{"data"}, "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str4, String.valueOf(currentTimeMillis)}, null, null, "rowid", null);
                                    zzicVar3 = zzicVar6;
                                    try {
                                        try {
                                            if (query.moveToFirst()) {
                                                list8 = list2;
                                                while (true) {
                                                    try {
                                                        try {
                                                            arrayList4.add((zzhs) ((zzhr) zzpk.zzw(zzhs.zzp(), query.getBlob(0))).zzbd());
                                                            cursor4 = query;
                                                            arrayList = arrayList4;
                                                        } catch (zzaeh e11) {
                                                            cursor4 = query;
                                                            try {
                                                                try {
                                                                    arrayList = arrayList4;
                                                                    zzicVar3.zzaW().zzi.zzc("Failed to parse stored NO_DATA mode event, appId", zzgu.zzl(str4), e11);
                                                                } catch (SQLiteException e12) {
                                                                    e = e12;
                                                                    zzicVar3.zzaW().zzb().zzc("Error flushing NO_DATA mode events. appId", zzgu.zzl(str4), e);
                                                                    list9 = Collections.EMPTY_LIST;
                                                                    if (cursor4 != null) {
                                                                        cursor4.close();
                                                                    }
                                                                    it = list8.iterator();
                                                                    boolean z4 = true;
                                                                    while (it.hasNext()) {
                                                                    }
                                                                    list7 = arrayList3;
                                                                    isEmpty = list7.isEmpty();
                                                                    list3 = list7;
                                                                    if (isEmpty) {
                                                                    }
                                                                    zzB = zzB(str4);
                                                                    zzjkVar = zzjk.AD_STORAGE;
                                                                    if (zzB.zzo(zzjkVar)) {
                                                                    }
                                                                    i = 0;
                                                                    list4 = list3;
                                                                    zzi = zzib.zzi();
                                                                    size = list4.size();
                                                                    ArrayList arrayList5 = new ArrayList(list4.size());
                                                                    if (zzd().zzC(str4)) {
                                                                    }
                                                                    boolean zzo2 = zzB(str4).zzo(zzjkVar);
                                                                    zzo = zzB(str4).zzo(zzjkVar2);
                                                                    zzair.zza();
                                                                    zzp = zzd().zzp(str4, zzfy.zzaM);
                                                                    zzou zzouVar = this.zzl;
                                                                    zzot zza = zzouVar.zza(str4);
                                                                    list5 = list4;
                                                                    while (true) {
                                                                        zzicVar2 = this.zzn;
                                                                        if (i < size) {
                                                                        }
                                                                        i = i3 + 1;
                                                                        size = r23;
                                                                        zzo = z2;
                                                                        list5 = list6;
                                                                        i2 = i4;
                                                                        zzp = z3;
                                                                    }
                                                                    if (zzi.zzb() != 0) {
                                                                    }
                                                                }
                                                            } catch (Throwable th) {
                                                                th = th;
                                                                cursor3 = cursor4;
                                                                if (cursor3 != null) {
                                                                }
                                                                throw th;
                                                            }
                                                        }
                                                        if (!cursor4.moveToNext()) {
                                                            break;
                                                        }
                                                        query = cursor4;
                                                        arrayList4 = arrayList;
                                                    } catch (SQLiteException e13) {
                                                        e = e13;
                                                        cursor4 = query;
                                                        zzicVar3.zzaW().zzb().zzc("Error flushing NO_DATA mode events. appId", zzgu.zzl(str4), e);
                                                        list9 = Collections.EMPTY_LIST;
                                                        if (cursor4 != null) {
                                                        }
                                                        it = list8.iterator();
                                                        boolean z42 = true;
                                                        while (it.hasNext()) {
                                                        }
                                                        list7 = arrayList3;
                                                        isEmpty = list7.isEmpty();
                                                        list3 = list7;
                                                        if (isEmpty) {
                                                        }
                                                        zzB = zzB(str4);
                                                        zzjkVar = zzjk.AD_STORAGE;
                                                        if (zzB.zzo(zzjkVar)) {
                                                        }
                                                        i = 0;
                                                        list4 = list3;
                                                        zzi = zzib.zzi();
                                                        size = list4.size();
                                                        ArrayList arrayList52 = new ArrayList(list4.size());
                                                        if (zzd().zzC(str4)) {
                                                        }
                                                        boolean zzo22 = zzB(str4).zzo(zzjkVar);
                                                        zzo = zzB(str4).zzo(zzjkVar2);
                                                        zzair.zza();
                                                        zzp = zzd().zzp(str4, zzfy.zzaM);
                                                        zzou zzouVar2 = this.zzl;
                                                        zzot zza2 = zzouVar2.zza(str4);
                                                        list5 = list4;
                                                        while (true) {
                                                            zzicVar2 = this.zzn;
                                                            if (i < size) {
                                                            }
                                                            i = i3 + 1;
                                                            size = r23;
                                                            zzo = z2;
                                                            list5 = list6;
                                                            i2 = i4;
                                                            zzp = z3;
                                                        }
                                                        if (zzi.zzb() != 0) {
                                                        }
                                                    }
                                                }
                                                cursor4.close();
                                                try {
                                                    int delete = zze.delete("no_data_mode_events", "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str4, String.valueOf(currentTimeMillis)});
                                                    zzgs zzk = zzicVar3.zzaW().zzk();
                                                    StringBuilder sb = new StringBuilder(String.valueOf(delete).length() + 34);
                                                    sb.append("Pruned ");
                                                    sb.append(delete);
                                                    sb.append(" NO_DATA mode events. appId");
                                                    zzk.zzb(str4, sb.toString());
                                                } catch (SQLiteException e14) {
                                                    e = e14;
                                                    cursor4 = null;
                                                    zzicVar3.zzaW().zzb().zzc("Error flushing NO_DATA mode events. appId", zzgu.zzl(str4), e);
                                                    list9 = Collections.EMPTY_LIST;
                                                    if (cursor4 != null) {
                                                    }
                                                    it = list8.iterator();
                                                    boolean z422 = true;
                                                    while (it.hasNext()) {
                                                    }
                                                    list7 = arrayList3;
                                                    isEmpty = list7.isEmpty();
                                                    list3 = list7;
                                                    if (isEmpty) {
                                                    }
                                                    zzB = zzB(str4);
                                                    zzjkVar = zzjk.AD_STORAGE;
                                                    if (zzB.zzo(zzjkVar)) {
                                                    }
                                                    i = 0;
                                                    list4 = list3;
                                                    zzi = zzib.zzi();
                                                    size = list4.size();
                                                    ArrayList arrayList522 = new ArrayList(list4.size());
                                                    if (zzd().zzC(str4)) {
                                                    }
                                                    boolean zzo222 = zzB(str4).zzo(zzjkVar);
                                                    zzo = zzB(str4).zzo(zzjkVar2);
                                                    zzair.zza();
                                                    zzp = zzd().zzp(str4, zzfy.zzaM);
                                                    zzou zzouVar22 = this.zzl;
                                                    zzot zza22 = zzouVar22.zza(str4);
                                                    list5 = list4;
                                                    while (true) {
                                                        zzicVar2 = this.zzn;
                                                        if (i < size) {
                                                        }
                                                        i = i3 + 1;
                                                        size = r23;
                                                        zzo = z2;
                                                        list5 = list6;
                                                        i2 = i4;
                                                        zzp = z3;
                                                    }
                                                    if (zzi.zzb() != 0) {
                                                    }
                                                }
                                            } else {
                                                arrayList = arrayList4;
                                                list8 = list2;
                                                query.close();
                                            }
                                            list9 = arrayList;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            cursor4 = query;
                                            cursor3 = cursor4;
                                            if (cursor3 != null) {
                                            }
                                            throw th;
                                        }
                                    } catch (SQLiteException e15) {
                                        e = e15;
                                        cursor4 = query;
                                        list8 = list2;
                                    }
                                } catch (SQLiteException e16) {
                                    e = e16;
                                    zzicVar3 = zzicVar6;
                                    list8 = list2;
                                }
                                it = list8.iterator();
                                boolean z4222 = true;
                                while (it.hasNext()) {
                                    Pair pair = (Pair) it.next();
                                    com.google.android.gms.internal.measurement.zzic zzicVar7 = (com.google.android.gms.internal.measurement.zzic) ((zzid) pair.first).zzco();
                                    if (z4222 && !list9.isEmpty()) {
                                        List zzb2 = zzicVar7.zzb();
                                        zzicVar7.zzi$2();
                                        zzicVar7.zzh(list9);
                                        zzicVar7.zzh(zzb2);
                                        z4222 = false;
                                    }
                                    com.google.android.gms.internal.measurement.zzhh zzb3 = zzho.zzb();
                                    com.google.android.gms.internal.measurement.zzgf zzy = zzh().zzy(str4);
                                    ArrayList arrayList6 = new ArrayList();
                                    if (zzy != null) {
                                        Iterator it6 = zzy.zza().iterator();
                                        while (it6.hasNext()) {
                                            zzfu zzfuVar = (zzfu) it6.next();
                                            Iterator it7 = it;
                                            zzhk zza3 = zzhl.zza();
                                            boolean z5 = z4222;
                                            int zzb4 = zzfuVar.zzb() - 1;
                                            List list10 = list9;
                                            if (zzb4 == 1) {
                                                it2 = it6;
                                                i5 = 3;
                                                i6 = 2;
                                            } else if (zzb4 != 2) {
                                                it2 = it6;
                                                i5 = 3;
                                                i6 = zzb4 != 3 ? zzb4 != 4 ? 1 : 5 : 4;
                                            } else {
                                                it2 = it6;
                                                i5 = 3;
                                                i6 = 3;
                                            }
                                            zza3.zza(i6);
                                            int zzd2 = zzfuVar.zzd() - 1;
                                            if (zzd2 == 1) {
                                                i5 = 2;
                                            } else if (zzd2 != 2) {
                                                i5 = 1;
                                            }
                                            zza3.zzb(i5);
                                            arrayList6.add((zzhl) zza3.zzbd());
                                            it = it7;
                                            list9 = list10;
                                            z4222 = z5;
                                            it6 = it2;
                                        }
                                    }
                                    Iterator it8 = it;
                                    boolean z6 = z4222;
                                    List list11 = list9;
                                    zzb3.zza(arrayList6);
                                    zzicVar7.zzaP(zzb3);
                                    arrayList3.add(Pair.create((zzid) zzicVar7.zzbd(), (Long) pair.second));
                                    it = it8;
                                    list9 = list11;
                                    z4222 = z6;
                                }
                                list7 = arrayList3;
                            } catch (Throwable th3) {
                                th = th3;
                                cursor3 = null;
                                if (cursor3 != null) {
                                    cursor3.close();
                                }
                                throw th;
                            }
                        } else {
                            List asList = Arrays.asList(((String) zzfy.zzbd.zzb(null)).split(","));
                            for (Pair pair2 : list2) {
                                try {
                                    zzj().zzH(((Long) pair2.second).longValue());
                                    for (zzhs zzhsVar : ((zzid) pair2.first).zzc()) {
                                        if (asList.contains(zzhsVar.zzd())) {
                                            if (zzhsVar.zzd().equals("_f") || zzhsVar.zzd().equals("_v")) {
                                                zzhr zzhrVar = (zzhr) zzhsVar.zzco();
                                                zzp();
                                                zzpk.zzF(zzhrVar, "_dac", 1L);
                                                zzhsVar = (zzhs) zzhrVar.zzbd();
                                            }
                                            zzaw zzj3 = zzj();
                                            zzj3.zzg();
                                            zzj3.zzay();
                                            zzae.checkNotEmpty(str4);
                                            zzic zzicVar8 = (zzic) zzj3.$$delegate_0;
                                            zzicVar8.zzaW().zzk().zzb(zzhsVar, "Caching events in NO_DATA mode");
                                            ContentValues contentValues = new ContentValues();
                                            contentValues.put("app_id", str4);
                                            zzhs zzhsVar2 = zzhsVar;
                                            contentValues.put("name", zzhsVar2.zzd());
                                            contentValues.put("data", zzhsVar2.zzcd());
                                            contentValues.put("timestamp_millis", Long.valueOf(zzhsVar2.zzf()));
                                            try {
                                                if (zzj3.zze().insert("no_data_mode_events", null, contentValues) == j2) {
                                                    zzicVar8.zzaW().zzb().zzb(zzgu.zzl(str4), "Failed to insert NO_DATA mode event (got -1). appId");
                                                }
                                            } catch (SQLiteException e17) {
                                                ((zzic) zzj3.$$delegate_0).zzaW().zzb().zzc("Error storing NO_DATA mode event. appId", zzgu.zzl(str4), e17);
                                            }
                                        }
                                    }
                                } catch (SQLiteException unused) {
                                    zzaW().zzi.zzb(str4, "Failed handling NO_DATA mode bundles. appId");
                                }
                            }
                            list7 = Collections.EMPTY_LIST;
                        }
                        isEmpty = list7.isEmpty();
                        list3 = list7;
                        if (isEmpty) {
                            return;
                        }
                    } else {
                        list3 = list2;
                    }
                    zzB = zzB(str4);
                    zzjkVar = zzjk.AD_STORAGE;
                    if (zzB.zzo(zzjkVar)) {
                        Iterator it9 = list3.iterator();
                        while (true) {
                            if (!it9.hasNext()) {
                                str3 = null;
                                break;
                            }
                            zzid zzidVar3 = (zzid) ((Pair) it9.next()).first;
                            if (!zzidVar3.zzG().isEmpty()) {
                                str3 = zzidVar3.zzG();
                                break;
                            }
                        }
                        if (str3 != null) {
                            for (int i10 = 0; i10 < list3.size(); i10++) {
                                zzid zzidVar4 = (zzid) ((Pair) list3.get(i10)).first;
                                if (!zzidVar4.zzG().isEmpty() && !zzidVar4.zzG().equals(str3)) {
                                    i = 0;
                                    list4 = list3.subList(0, i10);
                                    break;
                                }
                            }
                        }
                    }
                    i = 0;
                    list4 = list3;
                    zzi = zzib.zzi();
                    size = list4.size();
                    ArrayList arrayList5222 = new ArrayList(list4.size());
                    i2 = (zzd().zzC(str4) || !zzB(str4).zzo(zzjkVar)) ? i : 1;
                    boolean zzo2222 = zzB(str4).zzo(zzjkVar);
                    zzo = zzB(str4).zzo(zzjkVar2);
                    zzair.zza();
                    zzp = zzd().zzp(str4, zzfy.zzaM);
                    zzou zzouVar222 = this.zzl;
                    zzot zza222 = zzouVar222.zza(str4);
                    list5 = list4;
                    while (true) {
                        zzicVar2 = this.zzn;
                        if (i < size) {
                            break;
                        }
                        com.google.android.gms.internal.measurement.zzic zzicVar9 = (com.google.android.gms.internal.measurement.zzic) ((zzid) ((Pair) list5.get(i)).first).zzco();
                        int i11 = size;
                        arrayList5222.add((Long) ((Pair) list5.get(i)).second);
                        zzd().zzi();
                        zzicVar9.zzO();
                        zzicVar9.zzs(j);
                        zzicVar2.getClass();
                        zzicVar9.zzae();
                        if (i2 == 0) {
                            zzicVar9.zzan();
                        }
                        if (!zzo2222) {
                            zzicVar9.zzR();
                            zzicVar9.zzU();
                        }
                        if (!zzo) {
                            zzicVar9.zzX();
                        }
                        zzS(zzicVar9, str4);
                        if (!zzp) {
                            zzicVar9.zzav();
                        }
                        if (!zzo) {
                            zzicVar9.zzag();
                        }
                        String zzP = zzicVar9.zzP();
                        if (TextUtils.isEmpty(zzP)) {
                            i3 = i;
                        } else {
                            i3 = i;
                            if (!zzP.equals("00000000-0000-0000-0000-000000000000")) {
                                z2 = zzo;
                                i4 = i2;
                                list6 = list5;
                                z3 = zzp;
                                if (zzicVar9.zzc$1() != 0) {
                                    if (zzd().zzp(str4, zzfy.zzaC)) {
                                        zzicVar9.zzas(zzp().zzt(((zzid) zzicVar9.zzbd()).zzcd()));
                                    }
                                    zzis zzd3 = zza222.zzd();
                                    if (zzd3 != null) {
                                        zzicVar9.zzaN(zzd3);
                                    }
                                    zzi.zze(zzicVar9);
                                }
                                i = i3 + 1;
                                size = i11;
                                zzo = z2;
                                list5 = list6;
                                i2 = i4;
                                zzp = z3;
                            }
                        }
                        ArrayList arrayList7 = new ArrayList(zzicVar9.zzb());
                        Iterator it10 = arrayList7.iterator();
                        z2 = zzo;
                        Long l = null;
                        Long l2 = null;
                        boolean z7 = false;
                        boolean z8 = false;
                        while (it10.hasNext()) {
                            int i12 = i2;
                            zzhs zzhsVar3 = (zzhs) it10.next();
                            List list12 = list5;
                            boolean z9 = zzp;
                            if ("_fx".equals(zzhsVar3.zzd())) {
                                it10.remove();
                                list5 = list12;
                                i2 = i12;
                                zzp = z9;
                                z7 = true;
                            } else if ("_f".equals(zzhsVar3.zzd())) {
                                zzp();
                                com.google.android.gms.internal.measurement.zzhw zzI = zzpk.zzI(zzhsVar3, "_pfo");
                                if (zzI != null) {
                                    l = Long.valueOf(zzI.zzf());
                                }
                                zzp();
                                com.google.android.gms.internal.measurement.zzhw zzI2 = zzpk.zzI(zzhsVar3, "_uwa");
                                if (zzI2 != null) {
                                    l2 = Long.valueOf(zzI2.zzf());
                                }
                                list5 = list12;
                                i2 = i12;
                                zzp = z9;
                            } else {
                                list5 = list12;
                                i2 = i12;
                                zzp = z9;
                            }
                            z8 = true;
                        }
                        i4 = i2;
                        list6 = list5;
                        z3 = zzp;
                        if (z7) {
                            zzicVar9.zzi$2();
                            zzicVar9.zzh(arrayList7);
                        }
                        if (z8) {
                            zzR(zzicVar9.zzK(), true, l, l2);
                        }
                        if (zzicVar9.zzc$1() != 0) {
                        }
                        i = i3 + 1;
                        size = i11;
                        zzo = z2;
                        list5 = list6;
                        i2 = i4;
                        zzp = z3;
                    }
                    if (zzi.zzb() != 0) {
                        zzL(arrayList5222);
                        zzW(false, EnumC0170g.SDK_ASSET_ICON_CLEARED_REC_VALUE, null, null, str4, Collections.EMPTY_LIST, null);
                        return;
                    }
                    zzib zzibVar2 = (zzib) zzi.zzbd();
                    ArrayList arrayList8 = new ArrayList();
                    boolean z10 = zza222.zzc() == zzls.SGTM_CLIENT;
                    if (zza222.zzc() == zzls.SGTM) {
                        z = z10;
                    } else {
                        if (!z10) {
                            zzibVar = zzibVar2;
                            obj = null;
                            zzgzVar = this.zzd;
                            zzaT(zzgzVar);
                            if (zzgzVar.zzb()) {
                                return;
                            }
                            Object zzi2 = Log.isLoggable(zzaW().zzn(), 2) ? zzp().zzi(zzibVar) : obj;
                            zzp();
                            byte[] zzcd = zzibVar.zzcd();
                            zzL(arrayList5222);
                            this.zzk.zze.zzb(j);
                            zzaW().zzk().zzd("Uploading data. app, uncompressed size, data", str4, Integer.valueOf(zzcd.length), zzi2);
                            this.zzv = true;
                            zzaT(zzgzVar);
                            zzgzVar.zzc(str4, zza222, zzibVar, new com.google.android.gms.maps.zzah(this, str4, arrayList8, false, 15));
                            return;
                        }
                        z = true;
                    }
                    Iterator it11 = ((zzib) zzi.zzbd()).zza().iterator();
                    while (true) {
                        if (it11.hasNext()) {
                            if (((zzid) it11.next()).zzY()) {
                                str2 = UUID.randomUUID().toString();
                                break;
                            }
                        } else {
                            str2 = null;
                            break;
                        }
                    }
                    zzib zzibVar3 = (zzib) zzi.zzbd();
                    zzaX().zzg();
                    zzu$3();
                    com.google.android.gms.internal.measurement.zzhz zzj4 = zzib.zzj(zzibVar3);
                    if (!TextUtils.isEmpty(str2)) {
                        zzj4.zzi$2(str2);
                    }
                    String zzc = zzh().zzc(str4);
                    if (!TextUtils.isEmpty(zzc)) {
                        zzj4.zzj(zzc);
                    }
                    ArrayList arrayList9 = new ArrayList();
                    Iterator it12 = zzibVar3.zza().iterator();
                    while (it12.hasNext()) {
                        com.google.android.gms.internal.measurement.zzic zzaF = zzid.zzaF((zzid) it12.next());
                        zzaF.zzan();
                        arrayList9.add((zzid) zzaF.zzbd());
                    }
                    zzj4.zzg$1();
                    zzj4.zzf(arrayList9);
                    zzaW().zzk().zzb(TextUtils.isEmpty(str2) ? "null" : zzj4.zzh(), "[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ");
                    zzib zzibVar4 = (zzib) zzj4.zzbd();
                    if (TextUtils.isEmpty(str2)) {
                        obj = null;
                    } else {
                        zzib zzibVar5 = (zzib) zzi.zzbd();
                        zzaX().zzg();
                        zzu$3();
                        com.google.android.gms.internal.measurement.zzhz zzi3 = zzib.zzi();
                        zzaW().zzk().zzb(str2, "[sgtm] Processing Google Signal, sgtmJoinId:");
                        zzi3.zzi$2(str2);
                        for (zzid zzidVar5 : zzibVar5.zza()) {
                            com.google.android.gms.internal.measurement.zzic zzaE = zzid.zzaE();
                            zzaE.zzam(zzidVar5.zzZ());
                            zzaE.zzaJ(zzidVar5.zzav());
                            zzi3.zze(zzaE);
                        }
                        zzib zzibVar6 = (zzib) zzi3.zzbd();
                        String zzc2 = zzouVar222.zzg.zzh().zzc(str4);
                        boolean isEmpty2 = TextUtils.isEmpty(zzc2);
                        zzls zzlsVar = zzls.GOOGLE_SIGNAL;
                        zzls zzlsVar2 = zzls.GOOGLE_SIGNAL_PENDING;
                        if (isEmpty2) {
                            obj = null;
                            String str5 = (String) zzfy.zzr.zzb(null);
                            if (z) {
                                zzlsVar = zzlsVar2;
                            }
                            zzotVar = new zzot(str5, Collections.EMPTY_MAP, zzlsVar, null);
                        } else {
                            Uri parse = Uri.parse((String) zzfy.zzr.zzb(null));
                            Uri.Builder buildUpon = parse.buildUpon();
                            String authority = parse.getAuthority();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(zzc2).length() + 1 + String.valueOf(authority).length());
                            sb2.append(zzc2);
                            sb2.append(".");
                            sb2.append(authority);
                            buildUpon.authority(sb2.toString());
                            String uri = buildUpon.build().toString();
                            if (z) {
                                zzlsVar = zzlsVar2;
                            }
                            obj = null;
                            zzotVar = new zzot(uri, Collections.EMPTY_MAP, zzlsVar, null);
                        }
                        arrayList8.add(Pair.create(zzibVar6, zzotVar));
                    }
                    if (z) {
                        com.google.android.gms.internal.measurement.zzhz zzhzVar = (com.google.android.gms.internal.measurement.zzhz) zzibVar4.zzco();
                        for (int i13 = 0; i13 < zzibVar4.zzb(); i13++) {
                            com.google.android.gms.internal.measurement.zzic zzicVar10 = (com.google.android.gms.internal.measurement.zzic) zzibVar4.zzc(i13).zzco();
                            zzicVar10.zzt$1();
                            zzicVar10.zzaO(j);
                            zzhzVar.zzd(i13, zzicVar10);
                        }
                        arrayList8.add(Pair.create((zzib) zzhzVar.zzbd(), zza222));
                        zzL(arrayList5222);
                        zzW(false, EnumC0170g.SDK_ASSET_ICON_CLEARED_REC_VALUE, null, null, str, arrayList8, null);
                        if (zzO(str, zza222.zza())) {
                            zzaW().zzk().zzb(str, "[sgtm] Sending sgtm batches available notification to app");
                            Intent intent = new Intent();
                            intent.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                            intent.setPackage(str);
                            zzaR(zzicVar2.zzaZ(), intent);
                            return;
                        }
                        return;
                    }
                    str4 = str;
                    zzibVar = zzibVar4;
                    zzgzVar = this.zzd;
                    zzaT(zzgzVar);
                    if (zzgzVar.zzb()) {
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                cursor = cursor2;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            cursor = null;
        }
    }

    public final boolean zzO(String str, String str2) {
        zzaw zzawVar = this.zze;
        zzaT(zzawVar);
        zzh zzu = zzawVar.zzu(str);
        HashMap hashMap = this.zzF;
        if (zzu != null && zzt().zzad(str, zzu.zzay())) {
            hashMap.remove(str2);
            return true;
        }
        zzpe zzpeVar = (zzpe) hashMap.get(str2);
        if (zzpeVar == null) {
            return true;
        }
        return zzpeVar.zzb();
    }

    public final void zzP(String str) {
        zzpg zzpgVar;
        Throwable th;
        zzib zzd;
        zzaX().zzg();
        zzu$3();
        this.zzw = true;
        try {
            zzic zzicVar = this.zzn;
            zzicVar.getClass();
            Boolean bool = zzicVar.zzt().zzc;
            try {
                if (bool == null) {
                    zzaW().zzg.zza("Upload data called on the client side before use of service was decided");
                } else if (bool.booleanValue()) {
                    zzaW().zzd.zza("Upload called in the client side when service should be used");
                } else if (this.zza > 0) {
                    zzaM();
                } else {
                    try {
                        zzgz zzgzVar = this.zzd;
                        zzaT(zzgzVar);
                        if (zzgzVar.zzb()) {
                            zzaw zzawVar = this.zze;
                            zzaT(zzawVar);
                            if (zzawVar.zzD(str)) {
                                zzaw zzawVar2 = this.zze;
                                zzaT(zzawVar2);
                                zzae.checkNotEmpty(str);
                                zzawVar2.zzg();
                                zzawVar2.zzay();
                                List zzC = zzawVar2.zzC(str, zzoo.zza(zzls.GOOGLE_SIGNAL), 1);
                                zzpj zzpjVar = zzC.isEmpty() ? null : (zzpj) zzC.get(0);
                                if (zzpjVar != null && (zzd = zzpjVar.zzd()) != null) {
                                    zzaW().zzl.zzd("[sgtm] Uploading data from upload queue. appId, type, url", str, zzpjVar.zzf(), zzpjVar.zze());
                                    byte[] zzcd = zzd.zzcd();
                                    if (Log.isLoggable(zzaW().zzn(), 2)) {
                                        zzpk zzpkVar = this.zzi;
                                        zzaT(zzpkVar);
                                        zzaW().zzl.zzd("[sgtm] Uploading data from upload queue. appId, uncompressed size, data", str, Integer.valueOf(zzcd.length), zzpkVar.zzi(zzd));
                                    }
                                    zzot zza = zzpjVar.zza();
                                    this.zzv = true;
                                    zzgz zzgzVar2 = this.zzd;
                                    zzaT(zzgzVar2);
                                    zzpgVar = this;
                                    try {
                                        zzgzVar2.zzc(str, zza, zzd, new com.google.android.gms.maps.zzah(zzpgVar, str, zzpjVar, false, 16));
                                        zzpgVar.zzw = false;
                                        zzpgVar.zzaN();
                                    } catch (Throwable th2) {
                                        th = th2;
                                        th = th;
                                        zzpgVar.zzw = false;
                                        zzpgVar.zzaN();
                                        throw th;
                                    }
                                }
                            } else {
                                zzaW().zzl.zzb(str, "[sgtm] Upload queue has no batches for appId");
                            }
                        } else {
                            zzaW().zzl.zza("Network not connected, ignoring upload request");
                            zzaM();
                        }
                    } catch (Throwable th3) {
                        zzpgVar = this;
                        th = th3;
                        zzpgVar.zzw = false;
                        zzpgVar.zzaN();
                        throw th;
                    }
                }
                zzpgVar = this;
                zzpgVar.zzw = false;
                zzpgVar.zzaN();
            } catch (Throwable th4) {
                th = th4;
                zzpgVar = this;
            }
        } catch (Throwable th5) {
            th = th5;
            zzpgVar = this;
        }
    }

    public final void zzR(String str, boolean z, Long l, Long l2) {
        zzaw zzawVar = this.zze;
        zzaT(zzawVar);
        zzh zzu = zzawVar.zzu(str);
        if (zzu != null) {
            zzu.zzar(z);
            zzu.zzat(l);
            zzu.zzav(l2);
            if (zzu.zza()) {
                zzaw zzawVar2 = this.zze;
                zzaT(zzawVar2);
                zzawVar2.zzv(zzu, false);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f2, code lost:
    
        if (r6 < android.os.SystemClock.elapsedRealtime()) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzS(com.google.android.gms.internal.measurement.zzic zzicVar, String str) {
        int zzx;
        int indexOf;
        zzht zzhtVar = this.zzc;
        zzaT(zzhtVar);
        zzhtVar.zzg();
        zzhtVar.zzF(str);
        ArrayMap arrayMap = zzhtVar.zza;
        Set set = (Set) arrayMap.get(str);
        if (set != null) {
            zzicVar.zzaw(set);
        }
        zzaT(zzhtVar);
        zzhtVar.zzg();
        zzhtVar.zzF(str);
        if (arrayMap.get(str) != null && (((Set) arrayMap.get(str)).contains("device_model") || ((Set) arrayMap.get(str)).contains("device_info"))) {
            zzicVar.zzG();
        }
        zzaT(zzhtVar);
        if (zzhtVar.zzr(str)) {
            String zzD = zzicVar.zzD();
            if (!TextUtils.isEmpty(zzD) && (indexOf = zzD.indexOf(".")) != -1) {
                zzicVar.zzE$1(zzD.substring(0, indexOf));
            }
        }
        zzaT(zzhtVar);
        zzhtVar.zzg();
        zzhtVar.zzF(str);
        if (arrayMap.get(str) != null && ((Set) arrayMap.get(str)).contains("user_id") && (zzx = zzpk.zzx(zzicVar, "_id")) != -1) {
            zzicVar.zzr(zzx);
        }
        zzaT(zzhtVar);
        zzhtVar.zzg();
        zzhtVar.zzF(str);
        if (arrayMap.get(str) != null && ((Set) arrayMap.get(str)).contains("google_signals")) {
            zzicVar.zzan();
        }
        zzaT(zzhtVar);
        if (zzhtVar.zzu(str)) {
            zzicVar.zzX();
            if (zzB(str).zzo(zzjk.ANALYTICS_STORAGE)) {
                HashMap hashMap = this.zzE;
                zzpd zzpdVar = (zzpd) hashMap.get(str);
                if (zzpdVar != null) {
                    long zzl = zzd().zzl(str, zzfy.zzaj) + zzpdVar.zzb;
                    zzba().getClass();
                }
                zzpdVar = new zzpd(this);
                hashMap.put(str, zzpdVar);
                zzicVar.zzax(zzpdVar.zza);
            }
        }
        zzaT(zzhtVar);
        zzhtVar.zzg();
        zzhtVar.zzF(str);
        if (arrayMap.get(str) == null || !((Set) arrayMap.get(str)).contains("enhanced_user_id")) {
            return;
        }
        zzicVar.zzav();
    }

    public final void zzT(com.google.android.gms.internal.measurement.zzic zzicVar, RatelimitedLogger ratelimitedLogger) {
        String str;
        String str2;
        for (int i = 0; i < zzicVar.zzc$1(); i++) {
            zzhr zzhrVar = (zzhr) zzicVar.zzd(i).zzco();
            Iterator it = zzhrVar.zza().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if ("_c".equals(((com.google.android.gms.internal.measurement.zzhw) it.next()).zzb())) {
                    if (((zzid) ratelimitedLogger.log).zzar() >= zzd().zzm(((zzid) ratelimitedLogger.log).zzA(), zzfy.zzak)) {
                        int zzm = zzd().zzm(((zzid) ratelimitedLogger.log).zzA(), zzfy.zzax);
                        LinkedList linkedList = this.zzr;
                        zzpk zzpkVar = this.zzi;
                        if (zzm > 0) {
                            zzaw zzawVar = this.zze;
                            zzaT(zzawVar);
                            if (zzawVar.zzw(zzC(), ((zzid) ratelimitedLogger.log).zzA(), false, false, false, true).zzg > zzm) {
                                com.google.android.gms.internal.measurement.zzhv zzn = com.google.android.gms.internal.measurement.zzhw.zzn();
                                zzn.zzb$3("_tnr");
                                zzn.zzf(1L);
                                zzhrVar.zzf((com.google.android.gms.internal.measurement.zzhw) zzn.zzbd());
                            } else {
                                if (zzd().zzp(((zzid) ratelimitedLogger.log).zzA(), zzfy.zzaQ)) {
                                    str2 = zzt().zzaz();
                                    com.google.android.gms.internal.measurement.zzhv zzn2 = com.google.android.gms.internal.measurement.zzhw.zzn();
                                    zzn2.zzb$3("_tu");
                                    zzn2.zzd$1(str2);
                                    zzhrVar.zzf((com.google.android.gms.internal.measurement.zzhw) zzn2.zzbd());
                                } else {
                                    str2 = null;
                                }
                                com.google.android.gms.internal.measurement.zzhv zzn3 = com.google.android.gms.internal.measurement.zzhw.zzn();
                                zzn3.zzb$3("_tr");
                                zzn3.zzf(1L);
                                zzhrVar.zzf((com.google.android.gms.internal.measurement.zzhw) zzn3.zzbd());
                                zzaT(zzpkVar);
                                zzoh zzf = zzpkVar.zzf(((zzid) ratelimitedLogger.log).zzA(), zzicVar, zzhrVar, str2);
                                if (zzf != null) {
                                    zzaW().zzl.zzc("Generated trigger URI. appId, uri", ((zzid) ratelimitedLogger.log).zzA(), zzf.zza);
                                    zzaw zzawVar2 = this.zze;
                                    zzaT(zzawVar2);
                                    zzawVar2.zzZ(((zzid) ratelimitedLogger.log).zzA(), zzf);
                                    if (!linkedList.contains(((zzid) ratelimitedLogger.log).zzA())) {
                                        linkedList.add(((zzid) ratelimitedLogger.log).zzA());
                                    }
                                }
                            }
                        } else {
                            if (zzd().zzp(((zzid) ratelimitedLogger.log).zzA(), zzfy.zzaQ)) {
                                str = zzt().zzaz();
                                com.google.android.gms.internal.measurement.zzhv zzn4 = com.google.android.gms.internal.measurement.zzhw.zzn();
                                zzn4.zzb$3("_tu");
                                zzn4.zzd$1(str);
                                zzhrVar.zzf((com.google.android.gms.internal.measurement.zzhw) zzn4.zzbd());
                            } else {
                                str = null;
                            }
                            com.google.android.gms.internal.measurement.zzhv zzn5 = com.google.android.gms.internal.measurement.zzhw.zzn();
                            zzn5.zzb$3("_tr");
                            zzn5.zzf(1L);
                            zzhrVar.zzf((com.google.android.gms.internal.measurement.zzhw) zzn5.zzbd());
                            zzaT(zzpkVar);
                            zzoh zzf2 = zzpkVar.zzf(((zzid) ratelimitedLogger.log).zzA(), zzicVar, zzhrVar, str);
                            if (zzf2 != null) {
                                zzaW().zzl.zzc("Generated trigger URI. appId, uri", ((zzid) ratelimitedLogger.log).zzA(), zzf2.zza);
                                zzaw zzawVar3 = this.zze;
                                zzaT(zzawVar3);
                                zzawVar3.zzZ(((zzid) ratelimitedLogger.log).zzA(), zzf2);
                                if (!linkedList.contains(((zzid) ratelimitedLogger.log).zzA())) {
                                    linkedList.add(((zzid) ratelimitedLogger.log).zzA());
                                }
                            }
                        }
                    }
                    zzicVar.zze(i, (zzhs) zzhrVar.zzbd());
                }
            }
        }
    }

    public final void zzU(String str, com.google.android.gms.internal.measurement.zzhv zzhvVar, Bundle bundle, String str2) {
        int zzf;
        List listOf = zzd().zzp(str2, zzfy.zzba) ? Hex.listOf("_o", "_sn", "_sc", "_si", "deep_link_url") : Hex.listOf("_o", "_sn", "_sc", "_si");
        if (zzpp.zzac(zzhvVar.zza()) || zzpp.zzac(str)) {
            zzf = zzd().zzf(str2, true);
        } else {
            zzal zzd = zzd();
            zzd.getClass();
            zzf = Math.max(Math.min(zzd.zzm(str2, zzfy.zzag), 500), 100);
        }
        long j = zzf;
        long codePointCount = zzhvVar.zzc().codePointCount(0, zzhvVar.zzc().length());
        zzt();
        String zza = zzhvVar.zza();
        zzd();
        String zzE = zzpp.zzE(zza, 40, true);
        if (codePointCount <= j || listOf.contains(zzhvVar.zza())) {
            return;
        }
        if ("_ev".equals(zzhvVar.zza())) {
            zzt();
            bundle.putString("_ev", zzpp.zzE(zzhvVar.zzc(), zzd().zzf(str2, true), true));
            return;
        }
        zzaW().zzi.zzc("Param value is too long; discarded. Name, value length", zzE, Long.valueOf(codePointCount));
        if (bundle.getLong("_err") == 0) {
            bundle.putLong("_err", 4L);
            if (bundle.getString("_ev") == null) {
                bundle.putString("_ev", zzE);
                bundle.putLong("_el", codePointCount);
            }
        }
        bundle.remove(zzhvVar.zza());
    }

    public final boolean zzV(zzhr zzhrVar) {
        ArrayList arrayList = new ArrayList(zzhrVar.zza());
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if ("value".equals(((com.google.android.gms.internal.measurement.zzhw) arrayList.get(i3)).zzb())) {
                i = i3;
            } else if ("currency".equals(((com.google.android.gms.internal.measurement.zzhw) arrayList.get(i3)).zzb())) {
                i2 = i3;
            }
        }
        if (i == -1) {
            if (!zzd().zzp(null, zzfy.zzbf) || !"_iap".equals(zzhrVar.zzk())) {
                return true;
            }
            zzaC(zzhrVar, "_c");
            zzaB(zzhrVar, 18, "value");
            return false;
        }
        if (!((com.google.android.gms.internal.measurement.zzhw) arrayList.get(i)).zze() && !((com.google.android.gms.internal.measurement.zzhw) arrayList.get(i)).zzj()) {
            zzaW().zzi.zza("Value must be specified with a numeric type.");
            zzhrVar.zzj$1(i);
            zzaC(zzhrVar, "_c");
            zzaB(zzhrVar, 18, "value");
            return false;
        }
        if (i2 != -1) {
            String zzd = ((com.google.android.gms.internal.measurement.zzhw) arrayList.get(i2)).zzd();
            if (zzd.length() == 3) {
                int i4 = 0;
                while (i4 < zzd.length()) {
                    int codePointAt = zzd.codePointAt(i4);
                    if (Character.isLetter(codePointAt)) {
                        i4 += Character.charCount(codePointAt);
                    }
                }
                return true;
            }
        }
        zzaW().zzi.zza("Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter.");
        zzhrVar.zzj$1(i);
        zzaC(zzhrVar, "_c");
        zzaB(zzhrVar, 19, "currency");
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        if (r22 != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzW(boolean z, int i, Throwable th, byte[] bArr, String str, List list, Map map) {
        byte[] bArr2;
        zzls zzlsVar;
        int i2 = i;
        zzgz zzgzVar = this.zzd;
        zzaX().zzg();
        zzu$3();
        if (bArr == null) {
            try {
                bArr2 = new byte[0];
            } catch (Throwable th2) {
                this.zzv = false;
                zzaN();
                throw th2;
            }
        } else {
            bArr2 = bArr;
        }
        if (zzd().zzp(null, zzfy.zzbe)) {
            zzpk zzpkVar = this.zzi;
            zzaT(zzpkVar);
            zzpkVar.zzD(map);
        }
        ArrayList<Long> arrayList = this.zzz;
        zzae.checkNotNull(arrayList);
        this.zzz = null;
        try {
            if (z) {
                if (i2 != 200) {
                    if (i2 == 204) {
                        i2 = 204;
                    }
                    String str2 = new String(bArr2, StandardCharsets.UTF_8);
                    zzaW().zzi.zzd("Network upload failed. Will retry later. code, error", Integer.valueOf(i2), th, str2.substring(0, Math.min(32, str2.length())));
                    zzhe zzheVar = this.zzk.zze;
                    zzba().getClass();
                    zzheVar.zzb(System.currentTimeMillis());
                    if (i2 == 503 || i2 == 429) {
                        zzhe zzheVar2 = this.zzk.zzc;
                        zzba().getClass();
                        zzheVar2.zzb(System.currentTimeMillis());
                    }
                    zzaw zzawVar = this.zze;
                    zzaT(zzawVar);
                    zzawVar.zzJ(arrayList);
                    zzaM();
                    this.zzv = false;
                    zzaN();
                    return;
                }
            }
            HashMap hashMap = new HashMap();
            Iterator it = list.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                zzlsVar = zzls.SGTM_CLIENT;
                if (!hasNext) {
                    break;
                }
                Pair pair = (Pair) it.next();
                zzib zzibVar = (zzib) pair.first;
                zzot zzotVar = (zzot) pair.second;
                if (zzotVar.zzc() != zzlsVar) {
                    zzaw zzawVar2 = this.zze;
                    zzaT(zzawVar2);
                    long zzA = zzawVar2.zzA(str, zzibVar, zzotVar.zza(), zzotVar.zzb(), zzotVar.zzc(), null);
                    if (zzotVar.zzc() == zzls.GOOGLE_SIGNAL_PENDING && zzA != -1 && !zzibVar.zze().isEmpty()) {
                        hashMap.put(zzibVar.zze(), Long.valueOf(zzA));
                    }
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Pair pair2 = (Pair) it2.next();
                zzib zzibVar2 = (zzib) pair2.first;
                zzot zzotVar2 = (zzot) pair2.second;
                if (zzotVar2.zzc() == zzlsVar) {
                    Long l = (Long) hashMap.get(zzibVar2.zze());
                    zzaw zzawVar3 = this.zze;
                    zzaT(zzawVar3);
                    zzawVar3.zzA(str, zzibVar2, zzotVar2.zza(), zzotVar2.zzb(), zzotVar2.zzc(), l);
                    zzlsVar = zzlsVar;
                }
            }
            zzaw zzawVar4 = this.zze;
            zzaT(zzawVar4);
            List zzC = zzawVar4.zzC(str, zzoo.zza(zzlsVar), 1);
            if (!zzC.isEmpty()) {
                long zzg = ((zzpj) zzC.get(0)).zzg();
                zzba().getClass();
                if (System.currentTimeMillis() > ((Long) zzfy.zzE.zzb(null)).longValue() + zzg) {
                    zzaW().zzg.zzc("[sgtm] client batches are queued too long. appId, creationTime", str, Long.valueOf(zzg));
                }
            }
            for (Long l2 : arrayList) {
                try {
                    zzaw zzawVar5 = this.zze;
                    zzaT(zzawVar5);
                    zzawVar5.zzH(l2.longValue());
                } catch (SQLiteException e) {
                    ArrayList arrayList2 = this.zzA;
                    if (arrayList2 == null || !arrayList2.contains(l2)) {
                        throw e;
                    }
                }
            }
            zzaw zzawVar6 = this.zze;
            zzaT(zzawVar6);
            zzawVar6.zzc();
            zzaw zzawVar7 = this.zze;
            zzaT(zzawVar7);
            zzawVar7.zzd();
            this.zzA = null;
            zzaT(zzgzVar);
            if (zzgzVar.zzb()) {
                zzaw zzawVar8 = this.zze;
                zzaT(zzawVar8);
                if (zzawVar8.zzD(str)) {
                    zzP(str);
                    this.zza = 0L;
                    this.zzv = false;
                    zzaN();
                    return;
                }
            }
            zzaT(zzgzVar);
            if (zzgzVar.zzb() && zzaL()) {
                zzM();
            } else {
                this.zzB = -1L;
                zzaM();
            }
            this.zza = 0L;
            this.zzv = false;
            zzaN();
            return;
        } catch (Throwable th3) {
            zzaw zzawVar9 = this.zze;
            zzaT(zzawVar9);
            zzawVar9.zzd();
            throw th3;
        }
        zzgs zzgsVar = zzaW().zzl;
        Integer valueOf = Integer.valueOf(i2);
        zzgsVar.zzc("Network upload successful with code, uploadAttempted", valueOf, Boolean.valueOf(z));
        if (z) {
            try {
                zzhe zzheVar3 = this.zzk.zzd;
                zzba().getClass();
                zzheVar3.zzb(System.currentTimeMillis());
            } catch (SQLiteException e2) {
                zzaW().zzd.zzb(e2, "Database error while trying to delete uploaded bundles");
                zzba().getClass();
                this.zza = SystemClock.elapsedRealtime();
                zzaW().zzl.zzb(Long.valueOf(this.zza), "Disable upload, time");
            }
        }
        this.zzk.zze.zzb(0L);
        zzaM();
        if (z) {
            zzaW().zzl.zzc("Successful upload. Got network response. code, size", valueOf, Integer.valueOf(bArr2.length));
        } else {
            zzaW().zzl.zza("Purged empty bundles");
        }
        zzaw zzawVar10 = this.zze;
        zzaT(zzawVar10);
        zzawVar10.zzb$1();
    }

    public final void zzX(zzh zzhVar) {
        ArrayMap arrayMap;
        zzaX().zzg();
        if (TextUtils.isEmpty(zzhVar.zzf())) {
            String zzc = zzhVar.zzc();
            zzae.checkNotNull(zzc);
            zzY(zzc, EnumC0170g.SDK_ASSET_ICON_CLEARED_REC_VALUE, null, null, null);
            return;
        }
        String zzc2 = zzhVar.zzc();
        zzae.checkNotNull(zzc2);
        zzaW().zzl.zzb(zzc2, "Fetching remote configuration");
        zzht zzhtVar = this.zzc;
        zzaT(zzhtVar);
        com.google.android.gms.internal.measurement.zzgl zzb2 = zzhtVar.zzb(zzc2);
        zzaT(zzhtVar);
        zzhtVar.zzg();
        String str = (String) zzhtVar.zzl.get(zzc2);
        if (zzb2 != null) {
            ArrayMap m = !TextUtils.isEmpty(str) ? zzel$EnumUnboxingLocalUtility.m(0, "If-Modified-Since", str) : null;
            zzaT(zzhtVar);
            zzhtVar.zzg();
            String str2 = (String) zzhtVar.zzm.get(zzc2);
            if (!TextUtils.isEmpty(str2)) {
                if (m == null) {
                    m = new ArrayMap(0);
                }
                m.put("If-None-Match", str2);
            }
            arrayMap = m;
        } else {
            arrayMap = null;
        }
        this.zzu = true;
        zzgz zzgzVar = this.zzd;
        zzaT(zzgzVar);
        n.b bVar = new n.b(this, 28);
        zzic zzicVar = (zzic) zzgzVar.$$delegate_0;
        zzgzVar.zzg();
        zzgzVar.zzay();
        zzou zzouVar = zzgzVar.zzg.zzl;
        Uri.Builder builder = new Uri.Builder();
        Uri.Builder appendQueryParameter = builder.scheme((String) zzfy.zze.zzb(null)).encodedAuthority((String) zzfy.zzf.zzb(null)).path("config/app/".concat(String.valueOf(zzhVar.zzf()))).appendQueryParameter("platform", "android");
        ((zzic) zzouVar.$$delegate_0).zzg.zzi();
        appendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(161000L)).appendQueryParameter("runtime_version", "0");
        String uri = builder.build().toString();
        try {
            URL url = new URI(uri).toURL();
            zzhz zzhzVar = zzicVar.zzj;
            zzic.zzP(zzhzVar);
            zzhzVar.zzm(new zzgy(zzgzVar, zzhVar.zzc(), url, (byte[]) null, arrayMap, bVar));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            zzgu zzguVar = zzicVar.zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzd.zzc("Failed to parse config URL. Not fetching. appId", zzgu.zzl(zzhVar.zzc()), uri);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0064 A[Catch: all -> 0x0075, TRY_LEAVE, TryCatch #0 {all -> 0x0075, blocks: (B:8:0x0046, B:16:0x0064, B:17:0x0178, B:26:0x0081, B:30:0x00dd, B:31:0x00cb, B:32:0x00e2, B:36:0x00f9, B:37:0x010f, B:39:0x0127, B:40:0x0142, B:42:0x014b, B:44:0x0151, B:45:0x0155, B:47:0x015e, B:49:0x016d, B:50:0x0175, B:51:0x0133, B:52:0x0100, B:54:0x0109), top: B:7:0x0046, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0127 A[Catch: all -> 0x0075, TryCatch #0 {all -> 0x0075, blocks: (B:8:0x0046, B:16:0x0064, B:17:0x0178, B:26:0x0081, B:30:0x00dd, B:31:0x00cb, B:32:0x00e2, B:36:0x00f9, B:37:0x010f, B:39:0x0127, B:40:0x0142, B:42:0x014b, B:44:0x0151, B:45:0x0155, B:47:0x015e, B:49:0x016d, B:50:0x0175, B:51:0x0133, B:52:0x0100, B:54:0x0109), top: B:7:0x0046, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015e A[Catch: all -> 0x0075, TryCatch #0 {all -> 0x0075, blocks: (B:8:0x0046, B:16:0x0064, B:17:0x0178, B:26:0x0081, B:30:0x00dd, B:31:0x00cb, B:32:0x00e2, B:36:0x00f9, B:37:0x010f, B:39:0x0127, B:40:0x0142, B:42:0x014b, B:44:0x0151, B:45:0x0155, B:47:0x015e, B:49:0x016d, B:50:0x0175, B:51:0x0133, B:52:0x0100, B:54:0x0109), top: B:7:0x0046, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0133 A[Catch: all -> 0x0075, TryCatch #0 {all -> 0x0075, blocks: (B:8:0x0046, B:16:0x0064, B:17:0x0178, B:26:0x0081, B:30:0x00dd, B:31:0x00cb, B:32:0x00e2, B:36:0x00f9, B:37:0x010f, B:39:0x0127, B:40:0x0142, B:42:0x014b, B:44:0x0151, B:45:0x0155, B:47:0x015e, B:49:0x016d, B:50:0x0175, B:51:0x0133, B:52:0x0100, B:54:0x0109), top: B:7:0x0046, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzY(String str, int i, Throwable th, byte[] bArr, Map map) {
        boolean z;
        zzgz zzgzVar = this.zzd;
        zzaX().zzg();
        zzu$3();
        zzae.checkNotEmpty(str);
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.zzu = false;
                zzaN();
                throw th2;
            }
        }
        zzgs zzgsVar = zzaW().zzl;
        Integer valueOf = Integer.valueOf(bArr.length);
        zzgsVar.zzb(valueOf, "onConfigFetched. Response size");
        if (zzd().zzp(null, zzfy.zzbe)) {
            zzpk zzpkVar = this.zzi;
            zzaT(zzpkVar);
            zzpkVar.zzD(map);
        }
        zzaw zzawVar = this.zze;
        zzaT(zzawVar);
        zzawVar.zzb$1();
        try {
            zzaw zzawVar2 = this.zze;
            zzaT(zzawVar2);
            zzh zzu = zzawVar2.zzu(str);
            if (i != 200 && i != 204) {
                if (i == 304) {
                    i = 304;
                }
                z = false;
                if (zzu == null) {
                    zzaW().zzg.zzb(zzgu.zzl(str), "App does not exist in onConfigFetched. appId");
                } else {
                    zzht zzhtVar = this.zzc;
                    if (z || i == 404) {
                        zzp();
                        String zzJ = zzpk.zzJ("Last-Modified", map);
                        zzp();
                        String zzJ2 = zzpk.zzJ("ETag", map);
                        if (i != 404 && i != 304) {
                            zzaT(zzhtVar);
                            zzhtVar.zzi(str, zzJ, zzJ2, bArr);
                            zzba().getClass();
                            zzu.zzI(System.currentTimeMillis());
                            zzaw zzawVar3 = this.zze;
                            zzaT(zzawVar3);
                            zzawVar3.zzv(zzu, false);
                            if (i != 404) {
                                zzaW().zzi.zzb(str, "Config not found. Using empty config. appId");
                            } else {
                                zzaW().zzl.zzc("Successfully fetched config. Got network response. code, size", Integer.valueOf(i), valueOf);
                            }
                            zzaT(zzgzVar);
                            if (zzgzVar.zzb() || !zzaL()) {
                                zzaT(zzgzVar);
                                if (zzgzVar.zzb()) {
                                    zzaw zzawVar4 = this.zze;
                                    zzaT(zzawVar4);
                                    if (zzawVar4.zzD(zzu.zzc())) {
                                        zzP(zzu.zzc());
                                    }
                                }
                                zzaM();
                            } else {
                                zzM();
                            }
                        }
                        zzaT(zzhtVar);
                        if (zzhtVar.zzb(str) == null) {
                            zzaT(zzhtVar);
                            zzhtVar.zzi(str, null, null, null);
                        }
                        zzba().getClass();
                        zzu.zzI(System.currentTimeMillis());
                        zzaw zzawVar32 = this.zze;
                        zzaT(zzawVar32);
                        zzawVar32.zzv(zzu, false);
                        if (i != 404) {
                        }
                        zzaT(zzgzVar);
                        if (zzgzVar.zzb()) {
                        }
                        zzaT(zzgzVar);
                        if (zzgzVar.zzb()) {
                        }
                        zzaM();
                    } else {
                        zzba().getClass();
                        zzu.zzK(System.currentTimeMillis());
                        zzaw zzawVar5 = this.zze;
                        zzaT(zzawVar5);
                        zzawVar5.zzv(zzu, false);
                        zzaW().zzl.zzc("Fetching config failed. code, error", Integer.valueOf(i), th);
                        zzaT(zzhtVar);
                        zzhtVar.zzg();
                        zzhtVar.zzl.put(str, null);
                        zzhe zzheVar = this.zzk.zze;
                        zzba().getClass();
                        zzheVar.zzb(System.currentTimeMillis());
                        if (i == 503 || i == 429) {
                            zzhe zzheVar2 = this.zzk.zzc;
                            zzba().getClass();
                            zzheVar2.zzb(System.currentTimeMillis());
                        }
                        zzaM();
                    }
                }
                zzaw zzawVar6 = this.zze;
                zzaT(zzawVar6);
                zzawVar6.zzc();
                this.zzu = false;
                zzaN();
            }
            if (th == null) {
                z = true;
                if (zzu == null) {
                }
                zzaw zzawVar62 = this.zze;
                zzaT(zzawVar62);
                zzawVar62.zzc();
                this.zzu = false;
                zzaN();
            }
            z = false;
            if (zzu == null) {
            }
            zzaw zzawVar622 = this.zze;
            zzaT(zzawVar622);
            zzawVar622.zzc();
            this.zzu = false;
            zzaN();
        } finally {
            zzaw zzawVar7 = this.zze;
            zzaT(zzawVar7);
            zzawVar7.zzd();
        }
    }

    public final int zzaD(String str, n.b bVar) {
        zzji zzB;
        zzht zzhtVar = this.zzc;
        com.google.android.gms.internal.measurement.zzgf zzy = zzhtVar.zzy(str);
        zzjk zzjkVar = zzjk.AD_PERSONALIZATION;
        if (zzy == null) {
            bVar.zzc(zzjkVar, zzam.FAILSAFE);
            return 1;
        }
        zzaw zzawVar = this.zze;
        zzaT(zzawVar);
        zzh zzu = zzawVar.zzu(str);
        if (zzu == null || OneShotDisposable.zzc(zzu.zzaH()).zza() != zzji.POLICY || (zzB = zzhtVar.zzB(str, zzjkVar)) == zzji.UNINITIALIZED) {
            bVar.zzc(zzjkVar, zzam.REMOTE_DEFAULT);
            if (zzhtVar.zzw(str, zzjkVar)) {
                return 0;
            }
        } else {
            bVar.zzc(zzjkVar, zzam.REMOTE_ENFORCED_DEFAULT);
            if (zzB == zzji.GRANTED) {
                return 0;
            }
        }
        return 1;
    }

    public final HashMap zzaE(zzhs zzhsVar) {
        Serializable zzT;
        HashMap hashMap = new HashMap();
        zzp();
        HashMap hashMap2 = new HashMap();
        for (com.google.android.gms.internal.measurement.zzhw zzhwVar : zzhsVar.zza()) {
            if (zzhwVar.zzb().startsWith("gad_") && (zzT = zzpk.zzT(zzhwVar)) != null) {
                hashMap2.put(zzhwVar.zzb(), zzT);
            }
        }
        for (Map.Entry entry : hashMap2.entrySet()) {
            hashMap.put((String) entry.getKey(), String.valueOf(entry.getValue()));
        }
        return hashMap;
    }

    public final void zzaG() {
        zzaX().zzg();
        if (this.zzr.isEmpty()) {
            return;
        }
        int i = 3;
        if (this.zzI == null) {
            this.zzI = new zzju(this, this.zzn, i);
        }
        if (this.zzI.zzd != 0) {
            return;
        }
        zzba().getClass();
        long max = Math.max(0L, ((Integer) zzfy.zzaA.zzb(null)).intValue() - (SystemClock.elapsedRealtime() - this.zzJ));
        zzaW().zzl.zzb(Long.valueOf(max), "Scheduling notify next app runnable, delay in ms");
        if (this.zzI == null) {
            this.zzI = new zzju(this, this.zzn, i);
        }
        this.zzI.zzb(max);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x04bb A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x001a, B:5:0x0036, B:7:0x003f, B:8:0x0058, B:11:0x0074, B:14:0x00a0, B:16:0x00df, B:19:0x00f8, B:21:0x0102, B:24:0x0728, B:25:0x012f, B:28:0x0145, B:30:0x014b, B:32:0x0151, B:34:0x0164, B:37:0x0171, B:39:0x017c, B:41:0x018a, B:43:0x0190, B:46:0x019d, B:48:0x01ab, B:50:0x01b9, B:53:0x01d9, B:55:0x01df, B:57:0x01ef, B:59:0x01fd, B:61:0x020d, B:63:0x0218, B:68:0x021b, B:70:0x0228, B:72:0x0232, B:73:0x0242, B:75:0x0261, B:77:0x026b, B:79:0x0281, B:80:0x028d, B:83:0x0298, B:84:0x02a2, B:87:0x02ab, B:89:0x02bc, B:93:0x02bf, B:95:0x02d6, B:102:0x04bb, B:103:0x04be, B:105:0x04ca, B:108:0x04db, B:110:0x04ec, B:112:0x04f8, B:113:0x05c3, B:115:0x05d0, B:117:0x05d6, B:119:0x05dc, B:121:0x05ec, B:122:0x05ef, B:123:0x05f4, B:125:0x05fa, B:126:0x0606, B:128:0x060c, B:130:0x061c, B:132:0x0626, B:133:0x063b, B:135:0x0641, B:136:0x065c, B:138:0x0662, B:140:0x0680, B:142:0x068d, B:144:0x06b6, B:145:0x0693, B:147:0x06a1, B:151:0x06be, B:152:0x06d6, B:154:0x06dc, B:157:0x06ef, B:162:0x06fc, B:163:0x0700, B:165:0x0706, B:167:0x0714, B:175:0x051b, B:177:0x052b, B:180:0x053e, B:182:0x0550, B:184:0x055c, B:186:0x0570, B:189:0x057e, B:191:0x0588, B:193:0x0592, B:196:0x059d, B:198:0x05a3, B:202:0x05b3, B:200:0x05be, B:205:0x02fc, B:208:0x0306, B:210:0x0314, B:212:0x0357, B:213:0x032f, B:215:0x033d, B:221:0x035e, B:223:0x0391, B:224:0x03b9, B:226:0x03ee, B:227:0x03f4, B:230:0x0400, B:232:0x0435, B:233:0x0452, B:235:0x0458, B:237:0x0466, B:239:0x047a, B:240:0x046e, B:248:0x0481, B:251:0x0488, B:252:0x04a0, B:259:0x073f, B:261:0x074d, B:263:0x0756, B:265:0x0788, B:266:0x075e, B:268:0x0767, B:270:0x076d, B:272:0x0779, B:274:0x0783, B:281:0x078b, B:282:0x0797, B:285:0x079f, B:288:0x07b1, B:289:0x07bc, B:291:0x07c4, B:292:0x07ec, B:294:0x0808, B:295:0x081d, B:297:0x0839, B:298:0x084e, B:299:0x085c, B:301:0x0862, B:303:0x0872, B:304:0x0879, B:306:0x0885, B:308:0x088c, B:311:0x088f, B:313:0x08d9, B:315:0x08df, B:316:0x090a, B:318:0x0912, B:319:0x091b, B:321:0x0921, B:322:0x0927, B:324:0x093e, B:326:0x0958, B:328:0x096a, B:330:0x0974, B:331:0x0977, B:333:0x09c1, B:334:0x09d4, B:337:0x09dc, B:340:0x09f7, B:342:0x0a10, B:344:0x0a25, B:346:0x0a2a, B:348:0x0a2e, B:350:0x0a32, B:352:0x0a3c, B:353:0x0a45, B:355:0x0a49, B:357:0x0a4f, B:358:0x0a5a, B:359:0x0a68, B:362:0x0c75, B:366:0x0a70, B:430:0x0a8c, B:369:0x0aa9, B:371:0x0acb, B:372:0x0ad3, B:374:0x0ad9, B:378:0x0ae9, B:383:0x0b13, B:384:0x0b36, B:386:0x0b42, B:388:0x0b5a, B:389:0x0b9d, B:394:0x0bb9, B:396:0x0bc4, B:398:0x0bc8, B:400:0x0bcc, B:402:0x0bd0, B:403:0x0bdc, B:404:0x0be1, B:406:0x0be7, B:408:0x0bff, B:409:0x0c04, B:411:0x0c72, B:413:0x0c15, B:415:0x0c1b, B:418:0x0c2f, B:420:0x0c4d, B:421:0x0c54, B:423:0x0c66, B:424:0x0c20, B:428:0x0afd, B:433:0x0a92, B:435:0x0c7f, B:437:0x0c8b, B:438:0x0c91, B:439:0x0c99, B:441:0x0c9f, B:444:0x0cb5, B:446:0x0cc7, B:447:0x0d4a, B:449:0x0d50, B:451:0x0d67, B:454:0x0d72, B:456:0x0d7c, B:458:0x0d9b, B:460:0x0dab, B:461:0x0db0, B:463:0x0dbe, B:464:0x0dc3, B:465:0x0dce, B:467:0x0de0, B:470:0x0de7, B:471:0x0e1c, B:472:0x0def, B:474:0x0dfd, B:475:0x0e03, B:476:0x0e2b, B:478:0x0e3e, B:479:0x0e5e, B:485:0x0e49, B:486:0x0ce1, B:488:0x0ce7, B:490:0x0cf1, B:491:0x0cf8, B:496:0x0d08, B:497:0x0d0f, B:499:0x0d3b, B:500:0x0d42, B:501:0x0d3f, B:502:0x0d0c, B:504:0x0cf5, B:505:0x08ef, B:507:0x08f5, B:509:0x08fb, B:510:0x084b, B:511:0x081a, B:512:0x07ca, B:514:0x07d0, B:518:0x0e67), top: B:2:0x001a, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x04ca A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x001a, B:5:0x0036, B:7:0x003f, B:8:0x0058, B:11:0x0074, B:14:0x00a0, B:16:0x00df, B:19:0x00f8, B:21:0x0102, B:24:0x0728, B:25:0x012f, B:28:0x0145, B:30:0x014b, B:32:0x0151, B:34:0x0164, B:37:0x0171, B:39:0x017c, B:41:0x018a, B:43:0x0190, B:46:0x019d, B:48:0x01ab, B:50:0x01b9, B:53:0x01d9, B:55:0x01df, B:57:0x01ef, B:59:0x01fd, B:61:0x020d, B:63:0x0218, B:68:0x021b, B:70:0x0228, B:72:0x0232, B:73:0x0242, B:75:0x0261, B:77:0x026b, B:79:0x0281, B:80:0x028d, B:83:0x0298, B:84:0x02a2, B:87:0x02ab, B:89:0x02bc, B:93:0x02bf, B:95:0x02d6, B:102:0x04bb, B:103:0x04be, B:105:0x04ca, B:108:0x04db, B:110:0x04ec, B:112:0x04f8, B:113:0x05c3, B:115:0x05d0, B:117:0x05d6, B:119:0x05dc, B:121:0x05ec, B:122:0x05ef, B:123:0x05f4, B:125:0x05fa, B:126:0x0606, B:128:0x060c, B:130:0x061c, B:132:0x0626, B:133:0x063b, B:135:0x0641, B:136:0x065c, B:138:0x0662, B:140:0x0680, B:142:0x068d, B:144:0x06b6, B:145:0x0693, B:147:0x06a1, B:151:0x06be, B:152:0x06d6, B:154:0x06dc, B:157:0x06ef, B:162:0x06fc, B:163:0x0700, B:165:0x0706, B:167:0x0714, B:175:0x051b, B:177:0x052b, B:180:0x053e, B:182:0x0550, B:184:0x055c, B:186:0x0570, B:189:0x057e, B:191:0x0588, B:193:0x0592, B:196:0x059d, B:198:0x05a3, B:202:0x05b3, B:200:0x05be, B:205:0x02fc, B:208:0x0306, B:210:0x0314, B:212:0x0357, B:213:0x032f, B:215:0x033d, B:221:0x035e, B:223:0x0391, B:224:0x03b9, B:226:0x03ee, B:227:0x03f4, B:230:0x0400, B:232:0x0435, B:233:0x0452, B:235:0x0458, B:237:0x0466, B:239:0x047a, B:240:0x046e, B:248:0x0481, B:251:0x0488, B:252:0x04a0, B:259:0x073f, B:261:0x074d, B:263:0x0756, B:265:0x0788, B:266:0x075e, B:268:0x0767, B:270:0x076d, B:272:0x0779, B:274:0x0783, B:281:0x078b, B:282:0x0797, B:285:0x079f, B:288:0x07b1, B:289:0x07bc, B:291:0x07c4, B:292:0x07ec, B:294:0x0808, B:295:0x081d, B:297:0x0839, B:298:0x084e, B:299:0x085c, B:301:0x0862, B:303:0x0872, B:304:0x0879, B:306:0x0885, B:308:0x088c, B:311:0x088f, B:313:0x08d9, B:315:0x08df, B:316:0x090a, B:318:0x0912, B:319:0x091b, B:321:0x0921, B:322:0x0927, B:324:0x093e, B:326:0x0958, B:328:0x096a, B:330:0x0974, B:331:0x0977, B:333:0x09c1, B:334:0x09d4, B:337:0x09dc, B:340:0x09f7, B:342:0x0a10, B:344:0x0a25, B:346:0x0a2a, B:348:0x0a2e, B:350:0x0a32, B:352:0x0a3c, B:353:0x0a45, B:355:0x0a49, B:357:0x0a4f, B:358:0x0a5a, B:359:0x0a68, B:362:0x0c75, B:366:0x0a70, B:430:0x0a8c, B:369:0x0aa9, B:371:0x0acb, B:372:0x0ad3, B:374:0x0ad9, B:378:0x0ae9, B:383:0x0b13, B:384:0x0b36, B:386:0x0b42, B:388:0x0b5a, B:389:0x0b9d, B:394:0x0bb9, B:396:0x0bc4, B:398:0x0bc8, B:400:0x0bcc, B:402:0x0bd0, B:403:0x0bdc, B:404:0x0be1, B:406:0x0be7, B:408:0x0bff, B:409:0x0c04, B:411:0x0c72, B:413:0x0c15, B:415:0x0c1b, B:418:0x0c2f, B:420:0x0c4d, B:421:0x0c54, B:423:0x0c66, B:424:0x0c20, B:428:0x0afd, B:433:0x0a92, B:435:0x0c7f, B:437:0x0c8b, B:438:0x0c91, B:439:0x0c99, B:441:0x0c9f, B:444:0x0cb5, B:446:0x0cc7, B:447:0x0d4a, B:449:0x0d50, B:451:0x0d67, B:454:0x0d72, B:456:0x0d7c, B:458:0x0d9b, B:460:0x0dab, B:461:0x0db0, B:463:0x0dbe, B:464:0x0dc3, B:465:0x0dce, B:467:0x0de0, B:470:0x0de7, B:471:0x0e1c, B:472:0x0def, B:474:0x0dfd, B:475:0x0e03, B:476:0x0e2b, B:478:0x0e3e, B:479:0x0e5e, B:485:0x0e49, B:486:0x0ce1, B:488:0x0ce7, B:490:0x0cf1, B:491:0x0cf8, B:496:0x0d08, B:497:0x0d0f, B:499:0x0d3b, B:500:0x0d42, B:501:0x0d3f, B:502:0x0d0c, B:504:0x0cf5, B:505:0x08ef, B:507:0x08f5, B:509:0x08fb, B:510:0x084b, B:511:0x081a, B:512:0x07ca, B:514:0x07d0, B:518:0x0e67), top: B:2:0x001a, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x05d0 A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x001a, B:5:0x0036, B:7:0x003f, B:8:0x0058, B:11:0x0074, B:14:0x00a0, B:16:0x00df, B:19:0x00f8, B:21:0x0102, B:24:0x0728, B:25:0x012f, B:28:0x0145, B:30:0x014b, B:32:0x0151, B:34:0x0164, B:37:0x0171, B:39:0x017c, B:41:0x018a, B:43:0x0190, B:46:0x019d, B:48:0x01ab, B:50:0x01b9, B:53:0x01d9, B:55:0x01df, B:57:0x01ef, B:59:0x01fd, B:61:0x020d, B:63:0x0218, B:68:0x021b, B:70:0x0228, B:72:0x0232, B:73:0x0242, B:75:0x0261, B:77:0x026b, B:79:0x0281, B:80:0x028d, B:83:0x0298, B:84:0x02a2, B:87:0x02ab, B:89:0x02bc, B:93:0x02bf, B:95:0x02d6, B:102:0x04bb, B:103:0x04be, B:105:0x04ca, B:108:0x04db, B:110:0x04ec, B:112:0x04f8, B:113:0x05c3, B:115:0x05d0, B:117:0x05d6, B:119:0x05dc, B:121:0x05ec, B:122:0x05ef, B:123:0x05f4, B:125:0x05fa, B:126:0x0606, B:128:0x060c, B:130:0x061c, B:132:0x0626, B:133:0x063b, B:135:0x0641, B:136:0x065c, B:138:0x0662, B:140:0x0680, B:142:0x068d, B:144:0x06b6, B:145:0x0693, B:147:0x06a1, B:151:0x06be, B:152:0x06d6, B:154:0x06dc, B:157:0x06ef, B:162:0x06fc, B:163:0x0700, B:165:0x0706, B:167:0x0714, B:175:0x051b, B:177:0x052b, B:180:0x053e, B:182:0x0550, B:184:0x055c, B:186:0x0570, B:189:0x057e, B:191:0x0588, B:193:0x0592, B:196:0x059d, B:198:0x05a3, B:202:0x05b3, B:200:0x05be, B:205:0x02fc, B:208:0x0306, B:210:0x0314, B:212:0x0357, B:213:0x032f, B:215:0x033d, B:221:0x035e, B:223:0x0391, B:224:0x03b9, B:226:0x03ee, B:227:0x03f4, B:230:0x0400, B:232:0x0435, B:233:0x0452, B:235:0x0458, B:237:0x0466, B:239:0x047a, B:240:0x046e, B:248:0x0481, B:251:0x0488, B:252:0x04a0, B:259:0x073f, B:261:0x074d, B:263:0x0756, B:265:0x0788, B:266:0x075e, B:268:0x0767, B:270:0x076d, B:272:0x0779, B:274:0x0783, B:281:0x078b, B:282:0x0797, B:285:0x079f, B:288:0x07b1, B:289:0x07bc, B:291:0x07c4, B:292:0x07ec, B:294:0x0808, B:295:0x081d, B:297:0x0839, B:298:0x084e, B:299:0x085c, B:301:0x0862, B:303:0x0872, B:304:0x0879, B:306:0x0885, B:308:0x088c, B:311:0x088f, B:313:0x08d9, B:315:0x08df, B:316:0x090a, B:318:0x0912, B:319:0x091b, B:321:0x0921, B:322:0x0927, B:324:0x093e, B:326:0x0958, B:328:0x096a, B:330:0x0974, B:331:0x0977, B:333:0x09c1, B:334:0x09d4, B:337:0x09dc, B:340:0x09f7, B:342:0x0a10, B:344:0x0a25, B:346:0x0a2a, B:348:0x0a2e, B:350:0x0a32, B:352:0x0a3c, B:353:0x0a45, B:355:0x0a49, B:357:0x0a4f, B:358:0x0a5a, B:359:0x0a68, B:362:0x0c75, B:366:0x0a70, B:430:0x0a8c, B:369:0x0aa9, B:371:0x0acb, B:372:0x0ad3, B:374:0x0ad9, B:378:0x0ae9, B:383:0x0b13, B:384:0x0b36, B:386:0x0b42, B:388:0x0b5a, B:389:0x0b9d, B:394:0x0bb9, B:396:0x0bc4, B:398:0x0bc8, B:400:0x0bcc, B:402:0x0bd0, B:403:0x0bdc, B:404:0x0be1, B:406:0x0be7, B:408:0x0bff, B:409:0x0c04, B:411:0x0c72, B:413:0x0c15, B:415:0x0c1b, B:418:0x0c2f, B:420:0x0c4d, B:421:0x0c54, B:423:0x0c66, B:424:0x0c20, B:428:0x0afd, B:433:0x0a92, B:435:0x0c7f, B:437:0x0c8b, B:438:0x0c91, B:439:0x0c99, B:441:0x0c9f, B:444:0x0cb5, B:446:0x0cc7, B:447:0x0d4a, B:449:0x0d50, B:451:0x0d67, B:454:0x0d72, B:456:0x0d7c, B:458:0x0d9b, B:460:0x0dab, B:461:0x0db0, B:463:0x0dbe, B:464:0x0dc3, B:465:0x0dce, B:467:0x0de0, B:470:0x0de7, B:471:0x0e1c, B:472:0x0def, B:474:0x0dfd, B:475:0x0e03, B:476:0x0e2b, B:478:0x0e3e, B:479:0x0e5e, B:485:0x0e49, B:486:0x0ce1, B:488:0x0ce7, B:490:0x0cf1, B:491:0x0cf8, B:496:0x0d08, B:497:0x0d0f, B:499:0x0d3b, B:500:0x0d42, B:501:0x0d3f, B:502:0x0d0c, B:504:0x0cf5, B:505:0x08ef, B:507:0x08f5, B:509:0x08fb, B:510:0x084b, B:511:0x081a, B:512:0x07ca, B:514:0x07d0, B:518:0x0e67), top: B:2:0x001a, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x05ec A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x001a, B:5:0x0036, B:7:0x003f, B:8:0x0058, B:11:0x0074, B:14:0x00a0, B:16:0x00df, B:19:0x00f8, B:21:0x0102, B:24:0x0728, B:25:0x012f, B:28:0x0145, B:30:0x014b, B:32:0x0151, B:34:0x0164, B:37:0x0171, B:39:0x017c, B:41:0x018a, B:43:0x0190, B:46:0x019d, B:48:0x01ab, B:50:0x01b9, B:53:0x01d9, B:55:0x01df, B:57:0x01ef, B:59:0x01fd, B:61:0x020d, B:63:0x0218, B:68:0x021b, B:70:0x0228, B:72:0x0232, B:73:0x0242, B:75:0x0261, B:77:0x026b, B:79:0x0281, B:80:0x028d, B:83:0x0298, B:84:0x02a2, B:87:0x02ab, B:89:0x02bc, B:93:0x02bf, B:95:0x02d6, B:102:0x04bb, B:103:0x04be, B:105:0x04ca, B:108:0x04db, B:110:0x04ec, B:112:0x04f8, B:113:0x05c3, B:115:0x05d0, B:117:0x05d6, B:119:0x05dc, B:121:0x05ec, B:122:0x05ef, B:123:0x05f4, B:125:0x05fa, B:126:0x0606, B:128:0x060c, B:130:0x061c, B:132:0x0626, B:133:0x063b, B:135:0x0641, B:136:0x065c, B:138:0x0662, B:140:0x0680, B:142:0x068d, B:144:0x06b6, B:145:0x0693, B:147:0x06a1, B:151:0x06be, B:152:0x06d6, B:154:0x06dc, B:157:0x06ef, B:162:0x06fc, B:163:0x0700, B:165:0x0706, B:167:0x0714, B:175:0x051b, B:177:0x052b, B:180:0x053e, B:182:0x0550, B:184:0x055c, B:186:0x0570, B:189:0x057e, B:191:0x0588, B:193:0x0592, B:196:0x059d, B:198:0x05a3, B:202:0x05b3, B:200:0x05be, B:205:0x02fc, B:208:0x0306, B:210:0x0314, B:212:0x0357, B:213:0x032f, B:215:0x033d, B:221:0x035e, B:223:0x0391, B:224:0x03b9, B:226:0x03ee, B:227:0x03f4, B:230:0x0400, B:232:0x0435, B:233:0x0452, B:235:0x0458, B:237:0x0466, B:239:0x047a, B:240:0x046e, B:248:0x0481, B:251:0x0488, B:252:0x04a0, B:259:0x073f, B:261:0x074d, B:263:0x0756, B:265:0x0788, B:266:0x075e, B:268:0x0767, B:270:0x076d, B:272:0x0779, B:274:0x0783, B:281:0x078b, B:282:0x0797, B:285:0x079f, B:288:0x07b1, B:289:0x07bc, B:291:0x07c4, B:292:0x07ec, B:294:0x0808, B:295:0x081d, B:297:0x0839, B:298:0x084e, B:299:0x085c, B:301:0x0862, B:303:0x0872, B:304:0x0879, B:306:0x0885, B:308:0x088c, B:311:0x088f, B:313:0x08d9, B:315:0x08df, B:316:0x090a, B:318:0x0912, B:319:0x091b, B:321:0x0921, B:322:0x0927, B:324:0x093e, B:326:0x0958, B:328:0x096a, B:330:0x0974, B:331:0x0977, B:333:0x09c1, B:334:0x09d4, B:337:0x09dc, B:340:0x09f7, B:342:0x0a10, B:344:0x0a25, B:346:0x0a2a, B:348:0x0a2e, B:350:0x0a32, B:352:0x0a3c, B:353:0x0a45, B:355:0x0a49, B:357:0x0a4f, B:358:0x0a5a, B:359:0x0a68, B:362:0x0c75, B:366:0x0a70, B:430:0x0a8c, B:369:0x0aa9, B:371:0x0acb, B:372:0x0ad3, B:374:0x0ad9, B:378:0x0ae9, B:383:0x0b13, B:384:0x0b36, B:386:0x0b42, B:388:0x0b5a, B:389:0x0b9d, B:394:0x0bb9, B:396:0x0bc4, B:398:0x0bc8, B:400:0x0bcc, B:402:0x0bd0, B:403:0x0bdc, B:404:0x0be1, B:406:0x0be7, B:408:0x0bff, B:409:0x0c04, B:411:0x0c72, B:413:0x0c15, B:415:0x0c1b, B:418:0x0c2f, B:420:0x0c4d, B:421:0x0c54, B:423:0x0c66, B:424:0x0c20, B:428:0x0afd, B:433:0x0a92, B:435:0x0c7f, B:437:0x0c8b, B:438:0x0c91, B:439:0x0c99, B:441:0x0c9f, B:444:0x0cb5, B:446:0x0cc7, B:447:0x0d4a, B:449:0x0d50, B:451:0x0d67, B:454:0x0d72, B:456:0x0d7c, B:458:0x0d9b, B:460:0x0dab, B:461:0x0db0, B:463:0x0dbe, B:464:0x0dc3, B:465:0x0dce, B:467:0x0de0, B:470:0x0de7, B:471:0x0e1c, B:472:0x0def, B:474:0x0dfd, B:475:0x0e03, B:476:0x0e2b, B:478:0x0e3e, B:479:0x0e5e, B:485:0x0e49, B:486:0x0ce1, B:488:0x0ce7, B:490:0x0cf1, B:491:0x0cf8, B:496:0x0d08, B:497:0x0d0f, B:499:0x0d3b, B:500:0x0d42, B:501:0x0d3f, B:502:0x0d0c, B:504:0x0cf5, B:505:0x08ef, B:507:0x08f5, B:509:0x08fb, B:510:0x084b, B:511:0x081a, B:512:0x07ca, B:514:0x07d0, B:518:0x0e67), top: B:2:0x001a, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x05fa A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x001a, B:5:0x0036, B:7:0x003f, B:8:0x0058, B:11:0x0074, B:14:0x00a0, B:16:0x00df, B:19:0x00f8, B:21:0x0102, B:24:0x0728, B:25:0x012f, B:28:0x0145, B:30:0x014b, B:32:0x0151, B:34:0x0164, B:37:0x0171, B:39:0x017c, B:41:0x018a, B:43:0x0190, B:46:0x019d, B:48:0x01ab, B:50:0x01b9, B:53:0x01d9, B:55:0x01df, B:57:0x01ef, B:59:0x01fd, B:61:0x020d, B:63:0x0218, B:68:0x021b, B:70:0x0228, B:72:0x0232, B:73:0x0242, B:75:0x0261, B:77:0x026b, B:79:0x0281, B:80:0x028d, B:83:0x0298, B:84:0x02a2, B:87:0x02ab, B:89:0x02bc, B:93:0x02bf, B:95:0x02d6, B:102:0x04bb, B:103:0x04be, B:105:0x04ca, B:108:0x04db, B:110:0x04ec, B:112:0x04f8, B:113:0x05c3, B:115:0x05d0, B:117:0x05d6, B:119:0x05dc, B:121:0x05ec, B:122:0x05ef, B:123:0x05f4, B:125:0x05fa, B:126:0x0606, B:128:0x060c, B:130:0x061c, B:132:0x0626, B:133:0x063b, B:135:0x0641, B:136:0x065c, B:138:0x0662, B:140:0x0680, B:142:0x068d, B:144:0x06b6, B:145:0x0693, B:147:0x06a1, B:151:0x06be, B:152:0x06d6, B:154:0x06dc, B:157:0x06ef, B:162:0x06fc, B:163:0x0700, B:165:0x0706, B:167:0x0714, B:175:0x051b, B:177:0x052b, B:180:0x053e, B:182:0x0550, B:184:0x055c, B:186:0x0570, B:189:0x057e, B:191:0x0588, B:193:0x0592, B:196:0x059d, B:198:0x05a3, B:202:0x05b3, B:200:0x05be, B:205:0x02fc, B:208:0x0306, B:210:0x0314, B:212:0x0357, B:213:0x032f, B:215:0x033d, B:221:0x035e, B:223:0x0391, B:224:0x03b9, B:226:0x03ee, B:227:0x03f4, B:230:0x0400, B:232:0x0435, B:233:0x0452, B:235:0x0458, B:237:0x0466, B:239:0x047a, B:240:0x046e, B:248:0x0481, B:251:0x0488, B:252:0x04a0, B:259:0x073f, B:261:0x074d, B:263:0x0756, B:265:0x0788, B:266:0x075e, B:268:0x0767, B:270:0x076d, B:272:0x0779, B:274:0x0783, B:281:0x078b, B:282:0x0797, B:285:0x079f, B:288:0x07b1, B:289:0x07bc, B:291:0x07c4, B:292:0x07ec, B:294:0x0808, B:295:0x081d, B:297:0x0839, B:298:0x084e, B:299:0x085c, B:301:0x0862, B:303:0x0872, B:304:0x0879, B:306:0x0885, B:308:0x088c, B:311:0x088f, B:313:0x08d9, B:315:0x08df, B:316:0x090a, B:318:0x0912, B:319:0x091b, B:321:0x0921, B:322:0x0927, B:324:0x093e, B:326:0x0958, B:328:0x096a, B:330:0x0974, B:331:0x0977, B:333:0x09c1, B:334:0x09d4, B:337:0x09dc, B:340:0x09f7, B:342:0x0a10, B:344:0x0a25, B:346:0x0a2a, B:348:0x0a2e, B:350:0x0a32, B:352:0x0a3c, B:353:0x0a45, B:355:0x0a49, B:357:0x0a4f, B:358:0x0a5a, B:359:0x0a68, B:362:0x0c75, B:366:0x0a70, B:430:0x0a8c, B:369:0x0aa9, B:371:0x0acb, B:372:0x0ad3, B:374:0x0ad9, B:378:0x0ae9, B:383:0x0b13, B:384:0x0b36, B:386:0x0b42, B:388:0x0b5a, B:389:0x0b9d, B:394:0x0bb9, B:396:0x0bc4, B:398:0x0bc8, B:400:0x0bcc, B:402:0x0bd0, B:403:0x0bdc, B:404:0x0be1, B:406:0x0be7, B:408:0x0bff, B:409:0x0c04, B:411:0x0c72, B:413:0x0c15, B:415:0x0c1b, B:418:0x0c2f, B:420:0x0c4d, B:421:0x0c54, B:423:0x0c66, B:424:0x0c20, B:428:0x0afd, B:433:0x0a92, B:435:0x0c7f, B:437:0x0c8b, B:438:0x0c91, B:439:0x0c99, B:441:0x0c9f, B:444:0x0cb5, B:446:0x0cc7, B:447:0x0d4a, B:449:0x0d50, B:451:0x0d67, B:454:0x0d72, B:456:0x0d7c, B:458:0x0d9b, B:460:0x0dab, B:461:0x0db0, B:463:0x0dbe, B:464:0x0dc3, B:465:0x0dce, B:467:0x0de0, B:470:0x0de7, B:471:0x0e1c, B:472:0x0def, B:474:0x0dfd, B:475:0x0e03, B:476:0x0e2b, B:478:0x0e3e, B:479:0x0e5e, B:485:0x0e49, B:486:0x0ce1, B:488:0x0ce7, B:490:0x0cf1, B:491:0x0cf8, B:496:0x0d08, B:497:0x0d0f, B:499:0x0d3b, B:500:0x0d42, B:501:0x0d3f, B:502:0x0d0c, B:504:0x0cf5, B:505:0x08ef, B:507:0x08f5, B:509:0x08fb, B:510:0x084b, B:511:0x081a, B:512:0x07ca, B:514:0x07d0, B:518:0x0e67), top: B:2:0x001a, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x051b A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x001a, B:5:0x0036, B:7:0x003f, B:8:0x0058, B:11:0x0074, B:14:0x00a0, B:16:0x00df, B:19:0x00f8, B:21:0x0102, B:24:0x0728, B:25:0x012f, B:28:0x0145, B:30:0x014b, B:32:0x0151, B:34:0x0164, B:37:0x0171, B:39:0x017c, B:41:0x018a, B:43:0x0190, B:46:0x019d, B:48:0x01ab, B:50:0x01b9, B:53:0x01d9, B:55:0x01df, B:57:0x01ef, B:59:0x01fd, B:61:0x020d, B:63:0x0218, B:68:0x021b, B:70:0x0228, B:72:0x0232, B:73:0x0242, B:75:0x0261, B:77:0x026b, B:79:0x0281, B:80:0x028d, B:83:0x0298, B:84:0x02a2, B:87:0x02ab, B:89:0x02bc, B:93:0x02bf, B:95:0x02d6, B:102:0x04bb, B:103:0x04be, B:105:0x04ca, B:108:0x04db, B:110:0x04ec, B:112:0x04f8, B:113:0x05c3, B:115:0x05d0, B:117:0x05d6, B:119:0x05dc, B:121:0x05ec, B:122:0x05ef, B:123:0x05f4, B:125:0x05fa, B:126:0x0606, B:128:0x060c, B:130:0x061c, B:132:0x0626, B:133:0x063b, B:135:0x0641, B:136:0x065c, B:138:0x0662, B:140:0x0680, B:142:0x068d, B:144:0x06b6, B:145:0x0693, B:147:0x06a1, B:151:0x06be, B:152:0x06d6, B:154:0x06dc, B:157:0x06ef, B:162:0x06fc, B:163:0x0700, B:165:0x0706, B:167:0x0714, B:175:0x051b, B:177:0x052b, B:180:0x053e, B:182:0x0550, B:184:0x055c, B:186:0x0570, B:189:0x057e, B:191:0x0588, B:193:0x0592, B:196:0x059d, B:198:0x05a3, B:202:0x05b3, B:200:0x05be, B:205:0x02fc, B:208:0x0306, B:210:0x0314, B:212:0x0357, B:213:0x032f, B:215:0x033d, B:221:0x035e, B:223:0x0391, B:224:0x03b9, B:226:0x03ee, B:227:0x03f4, B:230:0x0400, B:232:0x0435, B:233:0x0452, B:235:0x0458, B:237:0x0466, B:239:0x047a, B:240:0x046e, B:248:0x0481, B:251:0x0488, B:252:0x04a0, B:259:0x073f, B:261:0x074d, B:263:0x0756, B:265:0x0788, B:266:0x075e, B:268:0x0767, B:270:0x076d, B:272:0x0779, B:274:0x0783, B:281:0x078b, B:282:0x0797, B:285:0x079f, B:288:0x07b1, B:289:0x07bc, B:291:0x07c4, B:292:0x07ec, B:294:0x0808, B:295:0x081d, B:297:0x0839, B:298:0x084e, B:299:0x085c, B:301:0x0862, B:303:0x0872, B:304:0x0879, B:306:0x0885, B:308:0x088c, B:311:0x088f, B:313:0x08d9, B:315:0x08df, B:316:0x090a, B:318:0x0912, B:319:0x091b, B:321:0x0921, B:322:0x0927, B:324:0x093e, B:326:0x0958, B:328:0x096a, B:330:0x0974, B:331:0x0977, B:333:0x09c1, B:334:0x09d4, B:337:0x09dc, B:340:0x09f7, B:342:0x0a10, B:344:0x0a25, B:346:0x0a2a, B:348:0x0a2e, B:350:0x0a32, B:352:0x0a3c, B:353:0x0a45, B:355:0x0a49, B:357:0x0a4f, B:358:0x0a5a, B:359:0x0a68, B:362:0x0c75, B:366:0x0a70, B:430:0x0a8c, B:369:0x0aa9, B:371:0x0acb, B:372:0x0ad3, B:374:0x0ad9, B:378:0x0ae9, B:383:0x0b13, B:384:0x0b36, B:386:0x0b42, B:388:0x0b5a, B:389:0x0b9d, B:394:0x0bb9, B:396:0x0bc4, B:398:0x0bc8, B:400:0x0bcc, B:402:0x0bd0, B:403:0x0bdc, B:404:0x0be1, B:406:0x0be7, B:408:0x0bff, B:409:0x0c04, B:411:0x0c72, B:413:0x0c15, B:415:0x0c1b, B:418:0x0c2f, B:420:0x0c4d, B:421:0x0c54, B:423:0x0c66, B:424:0x0c20, B:428:0x0afd, B:433:0x0a92, B:435:0x0c7f, B:437:0x0c8b, B:438:0x0c91, B:439:0x0c99, B:441:0x0c9f, B:444:0x0cb5, B:446:0x0cc7, B:447:0x0d4a, B:449:0x0d50, B:451:0x0d67, B:454:0x0d72, B:456:0x0d7c, B:458:0x0d9b, B:460:0x0dab, B:461:0x0db0, B:463:0x0dbe, B:464:0x0dc3, B:465:0x0dce, B:467:0x0de0, B:470:0x0de7, B:471:0x0e1c, B:472:0x0def, B:474:0x0dfd, B:475:0x0e03, B:476:0x0e2b, B:478:0x0e3e, B:479:0x0e5e, B:485:0x0e49, B:486:0x0ce1, B:488:0x0ce7, B:490:0x0cf1, B:491:0x0cf8, B:496:0x0d08, B:497:0x0d0f, B:499:0x0d3b, B:500:0x0d42, B:501:0x0d3f, B:502:0x0d0c, B:504:0x0cf5, B:505:0x08ef, B:507:0x08f5, B:509:0x08fb, B:510:0x084b, B:511:0x081a, B:512:0x07ca, B:514:0x07d0, B:518:0x0e67), top: B:2:0x001a, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0306 A[Catch: all -> 0x011f, TRY_ENTER, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x001a, B:5:0x0036, B:7:0x003f, B:8:0x0058, B:11:0x0074, B:14:0x00a0, B:16:0x00df, B:19:0x00f8, B:21:0x0102, B:24:0x0728, B:25:0x012f, B:28:0x0145, B:30:0x014b, B:32:0x0151, B:34:0x0164, B:37:0x0171, B:39:0x017c, B:41:0x018a, B:43:0x0190, B:46:0x019d, B:48:0x01ab, B:50:0x01b9, B:53:0x01d9, B:55:0x01df, B:57:0x01ef, B:59:0x01fd, B:61:0x020d, B:63:0x0218, B:68:0x021b, B:70:0x0228, B:72:0x0232, B:73:0x0242, B:75:0x0261, B:77:0x026b, B:79:0x0281, B:80:0x028d, B:83:0x0298, B:84:0x02a2, B:87:0x02ab, B:89:0x02bc, B:93:0x02bf, B:95:0x02d6, B:102:0x04bb, B:103:0x04be, B:105:0x04ca, B:108:0x04db, B:110:0x04ec, B:112:0x04f8, B:113:0x05c3, B:115:0x05d0, B:117:0x05d6, B:119:0x05dc, B:121:0x05ec, B:122:0x05ef, B:123:0x05f4, B:125:0x05fa, B:126:0x0606, B:128:0x060c, B:130:0x061c, B:132:0x0626, B:133:0x063b, B:135:0x0641, B:136:0x065c, B:138:0x0662, B:140:0x0680, B:142:0x068d, B:144:0x06b6, B:145:0x0693, B:147:0x06a1, B:151:0x06be, B:152:0x06d6, B:154:0x06dc, B:157:0x06ef, B:162:0x06fc, B:163:0x0700, B:165:0x0706, B:167:0x0714, B:175:0x051b, B:177:0x052b, B:180:0x053e, B:182:0x0550, B:184:0x055c, B:186:0x0570, B:189:0x057e, B:191:0x0588, B:193:0x0592, B:196:0x059d, B:198:0x05a3, B:202:0x05b3, B:200:0x05be, B:205:0x02fc, B:208:0x0306, B:210:0x0314, B:212:0x0357, B:213:0x032f, B:215:0x033d, B:221:0x035e, B:223:0x0391, B:224:0x03b9, B:226:0x03ee, B:227:0x03f4, B:230:0x0400, B:232:0x0435, B:233:0x0452, B:235:0x0458, B:237:0x0466, B:239:0x047a, B:240:0x046e, B:248:0x0481, B:251:0x0488, B:252:0x04a0, B:259:0x073f, B:261:0x074d, B:263:0x0756, B:265:0x0788, B:266:0x075e, B:268:0x0767, B:270:0x076d, B:272:0x0779, B:274:0x0783, B:281:0x078b, B:282:0x0797, B:285:0x079f, B:288:0x07b1, B:289:0x07bc, B:291:0x07c4, B:292:0x07ec, B:294:0x0808, B:295:0x081d, B:297:0x0839, B:298:0x084e, B:299:0x085c, B:301:0x0862, B:303:0x0872, B:304:0x0879, B:306:0x0885, B:308:0x088c, B:311:0x088f, B:313:0x08d9, B:315:0x08df, B:316:0x090a, B:318:0x0912, B:319:0x091b, B:321:0x0921, B:322:0x0927, B:324:0x093e, B:326:0x0958, B:328:0x096a, B:330:0x0974, B:331:0x0977, B:333:0x09c1, B:334:0x09d4, B:337:0x09dc, B:340:0x09f7, B:342:0x0a10, B:344:0x0a25, B:346:0x0a2a, B:348:0x0a2e, B:350:0x0a32, B:352:0x0a3c, B:353:0x0a45, B:355:0x0a49, B:357:0x0a4f, B:358:0x0a5a, B:359:0x0a68, B:362:0x0c75, B:366:0x0a70, B:430:0x0a8c, B:369:0x0aa9, B:371:0x0acb, B:372:0x0ad3, B:374:0x0ad9, B:378:0x0ae9, B:383:0x0b13, B:384:0x0b36, B:386:0x0b42, B:388:0x0b5a, B:389:0x0b9d, B:394:0x0bb9, B:396:0x0bc4, B:398:0x0bc8, B:400:0x0bcc, B:402:0x0bd0, B:403:0x0bdc, B:404:0x0be1, B:406:0x0be7, B:408:0x0bff, B:409:0x0c04, B:411:0x0c72, B:413:0x0c15, B:415:0x0c1b, B:418:0x0c2f, B:420:0x0c4d, B:421:0x0c54, B:423:0x0c66, B:424:0x0c20, B:428:0x0afd, B:433:0x0a92, B:435:0x0c7f, B:437:0x0c8b, B:438:0x0c91, B:439:0x0c99, B:441:0x0c9f, B:444:0x0cb5, B:446:0x0cc7, B:447:0x0d4a, B:449:0x0d50, B:451:0x0d67, B:454:0x0d72, B:456:0x0d7c, B:458:0x0d9b, B:460:0x0dab, B:461:0x0db0, B:463:0x0dbe, B:464:0x0dc3, B:465:0x0dce, B:467:0x0de0, B:470:0x0de7, B:471:0x0e1c, B:472:0x0def, B:474:0x0dfd, B:475:0x0e03, B:476:0x0e2b, B:478:0x0e3e, B:479:0x0e5e, B:485:0x0e49, B:486:0x0ce1, B:488:0x0ce7, B:490:0x0cf1, B:491:0x0cf8, B:496:0x0d08, B:497:0x0d0f, B:499:0x0d3b, B:500:0x0d42, B:501:0x0d3f, B:502:0x0d0c, B:504:0x0cf5, B:505:0x08ef, B:507:0x08f5, B:509:0x08fb, B:510:0x084b, B:511:0x081a, B:512:0x07ca, B:514:0x07d0, B:518:0x0e67), top: B:2:0x001a, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x035c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0391 A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x001a, B:5:0x0036, B:7:0x003f, B:8:0x0058, B:11:0x0074, B:14:0x00a0, B:16:0x00df, B:19:0x00f8, B:21:0x0102, B:24:0x0728, B:25:0x012f, B:28:0x0145, B:30:0x014b, B:32:0x0151, B:34:0x0164, B:37:0x0171, B:39:0x017c, B:41:0x018a, B:43:0x0190, B:46:0x019d, B:48:0x01ab, B:50:0x01b9, B:53:0x01d9, B:55:0x01df, B:57:0x01ef, B:59:0x01fd, B:61:0x020d, B:63:0x0218, B:68:0x021b, B:70:0x0228, B:72:0x0232, B:73:0x0242, B:75:0x0261, B:77:0x026b, B:79:0x0281, B:80:0x028d, B:83:0x0298, B:84:0x02a2, B:87:0x02ab, B:89:0x02bc, B:93:0x02bf, B:95:0x02d6, B:102:0x04bb, B:103:0x04be, B:105:0x04ca, B:108:0x04db, B:110:0x04ec, B:112:0x04f8, B:113:0x05c3, B:115:0x05d0, B:117:0x05d6, B:119:0x05dc, B:121:0x05ec, B:122:0x05ef, B:123:0x05f4, B:125:0x05fa, B:126:0x0606, B:128:0x060c, B:130:0x061c, B:132:0x0626, B:133:0x063b, B:135:0x0641, B:136:0x065c, B:138:0x0662, B:140:0x0680, B:142:0x068d, B:144:0x06b6, B:145:0x0693, B:147:0x06a1, B:151:0x06be, B:152:0x06d6, B:154:0x06dc, B:157:0x06ef, B:162:0x06fc, B:163:0x0700, B:165:0x0706, B:167:0x0714, B:175:0x051b, B:177:0x052b, B:180:0x053e, B:182:0x0550, B:184:0x055c, B:186:0x0570, B:189:0x057e, B:191:0x0588, B:193:0x0592, B:196:0x059d, B:198:0x05a3, B:202:0x05b3, B:200:0x05be, B:205:0x02fc, B:208:0x0306, B:210:0x0314, B:212:0x0357, B:213:0x032f, B:215:0x033d, B:221:0x035e, B:223:0x0391, B:224:0x03b9, B:226:0x03ee, B:227:0x03f4, B:230:0x0400, B:232:0x0435, B:233:0x0452, B:235:0x0458, B:237:0x0466, B:239:0x047a, B:240:0x046e, B:248:0x0481, B:251:0x0488, B:252:0x04a0, B:259:0x073f, B:261:0x074d, B:263:0x0756, B:265:0x0788, B:266:0x075e, B:268:0x0767, B:270:0x076d, B:272:0x0779, B:274:0x0783, B:281:0x078b, B:282:0x0797, B:285:0x079f, B:288:0x07b1, B:289:0x07bc, B:291:0x07c4, B:292:0x07ec, B:294:0x0808, B:295:0x081d, B:297:0x0839, B:298:0x084e, B:299:0x085c, B:301:0x0862, B:303:0x0872, B:304:0x0879, B:306:0x0885, B:308:0x088c, B:311:0x088f, B:313:0x08d9, B:315:0x08df, B:316:0x090a, B:318:0x0912, B:319:0x091b, B:321:0x0921, B:322:0x0927, B:324:0x093e, B:326:0x0958, B:328:0x096a, B:330:0x0974, B:331:0x0977, B:333:0x09c1, B:334:0x09d4, B:337:0x09dc, B:340:0x09f7, B:342:0x0a10, B:344:0x0a25, B:346:0x0a2a, B:348:0x0a2e, B:350:0x0a32, B:352:0x0a3c, B:353:0x0a45, B:355:0x0a49, B:357:0x0a4f, B:358:0x0a5a, B:359:0x0a68, B:362:0x0c75, B:366:0x0a70, B:430:0x0a8c, B:369:0x0aa9, B:371:0x0acb, B:372:0x0ad3, B:374:0x0ad9, B:378:0x0ae9, B:383:0x0b13, B:384:0x0b36, B:386:0x0b42, B:388:0x0b5a, B:389:0x0b9d, B:394:0x0bb9, B:396:0x0bc4, B:398:0x0bc8, B:400:0x0bcc, B:402:0x0bd0, B:403:0x0bdc, B:404:0x0be1, B:406:0x0be7, B:408:0x0bff, B:409:0x0c04, B:411:0x0c72, B:413:0x0c15, B:415:0x0c1b, B:418:0x0c2f, B:420:0x0c4d, B:421:0x0c54, B:423:0x0c66, B:424:0x0c20, B:428:0x0afd, B:433:0x0a92, B:435:0x0c7f, B:437:0x0c8b, B:438:0x0c91, B:439:0x0c99, B:441:0x0c9f, B:444:0x0cb5, B:446:0x0cc7, B:447:0x0d4a, B:449:0x0d50, B:451:0x0d67, B:454:0x0d72, B:456:0x0d7c, B:458:0x0d9b, B:460:0x0dab, B:461:0x0db0, B:463:0x0dbe, B:464:0x0dc3, B:465:0x0dce, B:467:0x0de0, B:470:0x0de7, B:471:0x0e1c, B:472:0x0def, B:474:0x0dfd, B:475:0x0e03, B:476:0x0e2b, B:478:0x0e3e, B:479:0x0e5e, B:485:0x0e49, B:486:0x0ce1, B:488:0x0ce7, B:490:0x0cf1, B:491:0x0cf8, B:496:0x0d08, B:497:0x0d0f, B:499:0x0d3b, B:500:0x0d42, B:501:0x0d3f, B:502:0x0d0c, B:504:0x0cf5, B:505:0x08ef, B:507:0x08f5, B:509:0x08fb, B:510:0x084b, B:511:0x081a, B:512:0x07ca, B:514:0x07d0, B:518:0x0e67), top: B:2:0x001a, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03ee A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x001a, B:5:0x0036, B:7:0x003f, B:8:0x0058, B:11:0x0074, B:14:0x00a0, B:16:0x00df, B:19:0x00f8, B:21:0x0102, B:24:0x0728, B:25:0x012f, B:28:0x0145, B:30:0x014b, B:32:0x0151, B:34:0x0164, B:37:0x0171, B:39:0x017c, B:41:0x018a, B:43:0x0190, B:46:0x019d, B:48:0x01ab, B:50:0x01b9, B:53:0x01d9, B:55:0x01df, B:57:0x01ef, B:59:0x01fd, B:61:0x020d, B:63:0x0218, B:68:0x021b, B:70:0x0228, B:72:0x0232, B:73:0x0242, B:75:0x0261, B:77:0x026b, B:79:0x0281, B:80:0x028d, B:83:0x0298, B:84:0x02a2, B:87:0x02ab, B:89:0x02bc, B:93:0x02bf, B:95:0x02d6, B:102:0x04bb, B:103:0x04be, B:105:0x04ca, B:108:0x04db, B:110:0x04ec, B:112:0x04f8, B:113:0x05c3, B:115:0x05d0, B:117:0x05d6, B:119:0x05dc, B:121:0x05ec, B:122:0x05ef, B:123:0x05f4, B:125:0x05fa, B:126:0x0606, B:128:0x060c, B:130:0x061c, B:132:0x0626, B:133:0x063b, B:135:0x0641, B:136:0x065c, B:138:0x0662, B:140:0x0680, B:142:0x068d, B:144:0x06b6, B:145:0x0693, B:147:0x06a1, B:151:0x06be, B:152:0x06d6, B:154:0x06dc, B:157:0x06ef, B:162:0x06fc, B:163:0x0700, B:165:0x0706, B:167:0x0714, B:175:0x051b, B:177:0x052b, B:180:0x053e, B:182:0x0550, B:184:0x055c, B:186:0x0570, B:189:0x057e, B:191:0x0588, B:193:0x0592, B:196:0x059d, B:198:0x05a3, B:202:0x05b3, B:200:0x05be, B:205:0x02fc, B:208:0x0306, B:210:0x0314, B:212:0x0357, B:213:0x032f, B:215:0x033d, B:221:0x035e, B:223:0x0391, B:224:0x03b9, B:226:0x03ee, B:227:0x03f4, B:230:0x0400, B:232:0x0435, B:233:0x0452, B:235:0x0458, B:237:0x0466, B:239:0x047a, B:240:0x046e, B:248:0x0481, B:251:0x0488, B:252:0x04a0, B:259:0x073f, B:261:0x074d, B:263:0x0756, B:265:0x0788, B:266:0x075e, B:268:0x0767, B:270:0x076d, B:272:0x0779, B:274:0x0783, B:281:0x078b, B:282:0x0797, B:285:0x079f, B:288:0x07b1, B:289:0x07bc, B:291:0x07c4, B:292:0x07ec, B:294:0x0808, B:295:0x081d, B:297:0x0839, B:298:0x084e, B:299:0x085c, B:301:0x0862, B:303:0x0872, B:304:0x0879, B:306:0x0885, B:308:0x088c, B:311:0x088f, B:313:0x08d9, B:315:0x08df, B:316:0x090a, B:318:0x0912, B:319:0x091b, B:321:0x0921, B:322:0x0927, B:324:0x093e, B:326:0x0958, B:328:0x096a, B:330:0x0974, B:331:0x0977, B:333:0x09c1, B:334:0x09d4, B:337:0x09dc, B:340:0x09f7, B:342:0x0a10, B:344:0x0a25, B:346:0x0a2a, B:348:0x0a2e, B:350:0x0a32, B:352:0x0a3c, B:353:0x0a45, B:355:0x0a49, B:357:0x0a4f, B:358:0x0a5a, B:359:0x0a68, B:362:0x0c75, B:366:0x0a70, B:430:0x0a8c, B:369:0x0aa9, B:371:0x0acb, B:372:0x0ad3, B:374:0x0ad9, B:378:0x0ae9, B:383:0x0b13, B:384:0x0b36, B:386:0x0b42, B:388:0x0b5a, B:389:0x0b9d, B:394:0x0bb9, B:396:0x0bc4, B:398:0x0bc8, B:400:0x0bcc, B:402:0x0bd0, B:403:0x0bdc, B:404:0x0be1, B:406:0x0be7, B:408:0x0bff, B:409:0x0c04, B:411:0x0c72, B:413:0x0c15, B:415:0x0c1b, B:418:0x0c2f, B:420:0x0c4d, B:421:0x0c54, B:423:0x0c66, B:424:0x0c20, B:428:0x0afd, B:433:0x0a92, B:435:0x0c7f, B:437:0x0c8b, B:438:0x0c91, B:439:0x0c99, B:441:0x0c9f, B:444:0x0cb5, B:446:0x0cc7, B:447:0x0d4a, B:449:0x0d50, B:451:0x0d67, B:454:0x0d72, B:456:0x0d7c, B:458:0x0d9b, B:460:0x0dab, B:461:0x0db0, B:463:0x0dbe, B:464:0x0dc3, B:465:0x0dce, B:467:0x0de0, B:470:0x0de7, B:471:0x0e1c, B:472:0x0def, B:474:0x0dfd, B:475:0x0e03, B:476:0x0e2b, B:478:0x0e3e, B:479:0x0e5e, B:485:0x0e49, B:486:0x0ce1, B:488:0x0ce7, B:490:0x0cf1, B:491:0x0cf8, B:496:0x0d08, B:497:0x0d0f, B:499:0x0d3b, B:500:0x0d42, B:501:0x0d3f, B:502:0x0d0c, B:504:0x0cf5, B:505:0x08ef, B:507:0x08f5, B:509:0x08fb, B:510:0x084b, B:511:0x081a, B:512:0x07ca, B:514:0x07d0, B:518:0x0e67), top: B:2:0x001a, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03fe A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0458 A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x001a, B:5:0x0036, B:7:0x003f, B:8:0x0058, B:11:0x0074, B:14:0x00a0, B:16:0x00df, B:19:0x00f8, B:21:0x0102, B:24:0x0728, B:25:0x012f, B:28:0x0145, B:30:0x014b, B:32:0x0151, B:34:0x0164, B:37:0x0171, B:39:0x017c, B:41:0x018a, B:43:0x0190, B:46:0x019d, B:48:0x01ab, B:50:0x01b9, B:53:0x01d9, B:55:0x01df, B:57:0x01ef, B:59:0x01fd, B:61:0x020d, B:63:0x0218, B:68:0x021b, B:70:0x0228, B:72:0x0232, B:73:0x0242, B:75:0x0261, B:77:0x026b, B:79:0x0281, B:80:0x028d, B:83:0x0298, B:84:0x02a2, B:87:0x02ab, B:89:0x02bc, B:93:0x02bf, B:95:0x02d6, B:102:0x04bb, B:103:0x04be, B:105:0x04ca, B:108:0x04db, B:110:0x04ec, B:112:0x04f8, B:113:0x05c3, B:115:0x05d0, B:117:0x05d6, B:119:0x05dc, B:121:0x05ec, B:122:0x05ef, B:123:0x05f4, B:125:0x05fa, B:126:0x0606, B:128:0x060c, B:130:0x061c, B:132:0x0626, B:133:0x063b, B:135:0x0641, B:136:0x065c, B:138:0x0662, B:140:0x0680, B:142:0x068d, B:144:0x06b6, B:145:0x0693, B:147:0x06a1, B:151:0x06be, B:152:0x06d6, B:154:0x06dc, B:157:0x06ef, B:162:0x06fc, B:163:0x0700, B:165:0x0706, B:167:0x0714, B:175:0x051b, B:177:0x052b, B:180:0x053e, B:182:0x0550, B:184:0x055c, B:186:0x0570, B:189:0x057e, B:191:0x0588, B:193:0x0592, B:196:0x059d, B:198:0x05a3, B:202:0x05b3, B:200:0x05be, B:205:0x02fc, B:208:0x0306, B:210:0x0314, B:212:0x0357, B:213:0x032f, B:215:0x033d, B:221:0x035e, B:223:0x0391, B:224:0x03b9, B:226:0x03ee, B:227:0x03f4, B:230:0x0400, B:232:0x0435, B:233:0x0452, B:235:0x0458, B:237:0x0466, B:239:0x047a, B:240:0x046e, B:248:0x0481, B:251:0x0488, B:252:0x04a0, B:259:0x073f, B:261:0x074d, B:263:0x0756, B:265:0x0788, B:266:0x075e, B:268:0x0767, B:270:0x076d, B:272:0x0779, B:274:0x0783, B:281:0x078b, B:282:0x0797, B:285:0x079f, B:288:0x07b1, B:289:0x07bc, B:291:0x07c4, B:292:0x07ec, B:294:0x0808, B:295:0x081d, B:297:0x0839, B:298:0x084e, B:299:0x085c, B:301:0x0862, B:303:0x0872, B:304:0x0879, B:306:0x0885, B:308:0x088c, B:311:0x088f, B:313:0x08d9, B:315:0x08df, B:316:0x090a, B:318:0x0912, B:319:0x091b, B:321:0x0921, B:322:0x0927, B:324:0x093e, B:326:0x0958, B:328:0x096a, B:330:0x0974, B:331:0x0977, B:333:0x09c1, B:334:0x09d4, B:337:0x09dc, B:340:0x09f7, B:342:0x0a10, B:344:0x0a25, B:346:0x0a2a, B:348:0x0a2e, B:350:0x0a32, B:352:0x0a3c, B:353:0x0a45, B:355:0x0a49, B:357:0x0a4f, B:358:0x0a5a, B:359:0x0a68, B:362:0x0c75, B:366:0x0a70, B:430:0x0a8c, B:369:0x0aa9, B:371:0x0acb, B:372:0x0ad3, B:374:0x0ad9, B:378:0x0ae9, B:383:0x0b13, B:384:0x0b36, B:386:0x0b42, B:388:0x0b5a, B:389:0x0b9d, B:394:0x0bb9, B:396:0x0bc4, B:398:0x0bc8, B:400:0x0bcc, B:402:0x0bd0, B:403:0x0bdc, B:404:0x0be1, B:406:0x0be7, B:408:0x0bff, B:409:0x0c04, B:411:0x0c72, B:413:0x0c15, B:415:0x0c1b, B:418:0x0c2f, B:420:0x0c4d, B:421:0x0c54, B:423:0x0c66, B:424:0x0c20, B:428:0x0afd, B:433:0x0a92, B:435:0x0c7f, B:437:0x0c8b, B:438:0x0c91, B:439:0x0c99, B:441:0x0c9f, B:444:0x0cb5, B:446:0x0cc7, B:447:0x0d4a, B:449:0x0d50, B:451:0x0d67, B:454:0x0d72, B:456:0x0d7c, B:458:0x0d9b, B:460:0x0dab, B:461:0x0db0, B:463:0x0dbe, B:464:0x0dc3, B:465:0x0dce, B:467:0x0de0, B:470:0x0de7, B:471:0x0e1c, B:472:0x0def, B:474:0x0dfd, B:475:0x0e03, B:476:0x0e2b, B:478:0x0e3e, B:479:0x0e5e, B:485:0x0e49, B:486:0x0ce1, B:488:0x0ce7, B:490:0x0cf1, B:491:0x0cf8, B:496:0x0d08, B:497:0x0d0f, B:499:0x0d3b, B:500:0x0d42, B:501:0x0d3f, B:502:0x0d0c, B:504:0x0cf5, B:505:0x08ef, B:507:0x08f5, B:509:0x08fb, B:510:0x084b, B:511:0x081a, B:512:0x07ca, B:514:0x07d0, B:518:0x0e67), top: B:2:0x001a, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0488 A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x001a, B:5:0x0036, B:7:0x003f, B:8:0x0058, B:11:0x0074, B:14:0x00a0, B:16:0x00df, B:19:0x00f8, B:21:0x0102, B:24:0x0728, B:25:0x012f, B:28:0x0145, B:30:0x014b, B:32:0x0151, B:34:0x0164, B:37:0x0171, B:39:0x017c, B:41:0x018a, B:43:0x0190, B:46:0x019d, B:48:0x01ab, B:50:0x01b9, B:53:0x01d9, B:55:0x01df, B:57:0x01ef, B:59:0x01fd, B:61:0x020d, B:63:0x0218, B:68:0x021b, B:70:0x0228, B:72:0x0232, B:73:0x0242, B:75:0x0261, B:77:0x026b, B:79:0x0281, B:80:0x028d, B:83:0x0298, B:84:0x02a2, B:87:0x02ab, B:89:0x02bc, B:93:0x02bf, B:95:0x02d6, B:102:0x04bb, B:103:0x04be, B:105:0x04ca, B:108:0x04db, B:110:0x04ec, B:112:0x04f8, B:113:0x05c3, B:115:0x05d0, B:117:0x05d6, B:119:0x05dc, B:121:0x05ec, B:122:0x05ef, B:123:0x05f4, B:125:0x05fa, B:126:0x0606, B:128:0x060c, B:130:0x061c, B:132:0x0626, B:133:0x063b, B:135:0x0641, B:136:0x065c, B:138:0x0662, B:140:0x0680, B:142:0x068d, B:144:0x06b6, B:145:0x0693, B:147:0x06a1, B:151:0x06be, B:152:0x06d6, B:154:0x06dc, B:157:0x06ef, B:162:0x06fc, B:163:0x0700, B:165:0x0706, B:167:0x0714, B:175:0x051b, B:177:0x052b, B:180:0x053e, B:182:0x0550, B:184:0x055c, B:186:0x0570, B:189:0x057e, B:191:0x0588, B:193:0x0592, B:196:0x059d, B:198:0x05a3, B:202:0x05b3, B:200:0x05be, B:205:0x02fc, B:208:0x0306, B:210:0x0314, B:212:0x0357, B:213:0x032f, B:215:0x033d, B:221:0x035e, B:223:0x0391, B:224:0x03b9, B:226:0x03ee, B:227:0x03f4, B:230:0x0400, B:232:0x0435, B:233:0x0452, B:235:0x0458, B:237:0x0466, B:239:0x047a, B:240:0x046e, B:248:0x0481, B:251:0x0488, B:252:0x04a0, B:259:0x073f, B:261:0x074d, B:263:0x0756, B:265:0x0788, B:266:0x075e, B:268:0x0767, B:270:0x076d, B:272:0x0779, B:274:0x0783, B:281:0x078b, B:282:0x0797, B:285:0x079f, B:288:0x07b1, B:289:0x07bc, B:291:0x07c4, B:292:0x07ec, B:294:0x0808, B:295:0x081d, B:297:0x0839, B:298:0x084e, B:299:0x085c, B:301:0x0862, B:303:0x0872, B:304:0x0879, B:306:0x0885, B:308:0x088c, B:311:0x088f, B:313:0x08d9, B:315:0x08df, B:316:0x090a, B:318:0x0912, B:319:0x091b, B:321:0x0921, B:322:0x0927, B:324:0x093e, B:326:0x0958, B:328:0x096a, B:330:0x0974, B:331:0x0977, B:333:0x09c1, B:334:0x09d4, B:337:0x09dc, B:340:0x09f7, B:342:0x0a10, B:344:0x0a25, B:346:0x0a2a, B:348:0x0a2e, B:350:0x0a32, B:352:0x0a3c, B:353:0x0a45, B:355:0x0a49, B:357:0x0a4f, B:358:0x0a5a, B:359:0x0a68, B:362:0x0c75, B:366:0x0a70, B:430:0x0a8c, B:369:0x0aa9, B:371:0x0acb, B:372:0x0ad3, B:374:0x0ad9, B:378:0x0ae9, B:383:0x0b13, B:384:0x0b36, B:386:0x0b42, B:388:0x0b5a, B:389:0x0b9d, B:394:0x0bb9, B:396:0x0bc4, B:398:0x0bc8, B:400:0x0bcc, B:402:0x0bd0, B:403:0x0bdc, B:404:0x0be1, B:406:0x0be7, B:408:0x0bff, B:409:0x0c04, B:411:0x0c72, B:413:0x0c15, B:415:0x0c1b, B:418:0x0c2f, B:420:0x0c4d, B:421:0x0c54, B:423:0x0c66, B:424:0x0c20, B:428:0x0afd, B:433:0x0a92, B:435:0x0c7f, B:437:0x0c8b, B:438:0x0c91, B:439:0x0c99, B:441:0x0c9f, B:444:0x0cb5, B:446:0x0cc7, B:447:0x0d4a, B:449:0x0d50, B:451:0x0d67, B:454:0x0d72, B:456:0x0d7c, B:458:0x0d9b, B:460:0x0dab, B:461:0x0db0, B:463:0x0dbe, B:464:0x0dc3, B:465:0x0dce, B:467:0x0de0, B:470:0x0de7, B:471:0x0e1c, B:472:0x0def, B:474:0x0dfd, B:475:0x0e03, B:476:0x0e2b, B:478:0x0e3e, B:479:0x0e5e, B:485:0x0e49, B:486:0x0ce1, B:488:0x0ce7, B:490:0x0cf1, B:491:0x0cf8, B:496:0x0d08, B:497:0x0d0f, B:499:0x0d3b, B:500:0x0d42, B:501:0x0d3f, B:502:0x0d0c, B:504:0x0cf5, B:505:0x08ef, B:507:0x08f5, B:509:0x08fb, B:510:0x084b, B:511:0x081a, B:512:0x07ca, B:514:0x07d0, B:518:0x0e67), top: B:2:0x001a, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x04a0 A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x001a, B:5:0x0036, B:7:0x003f, B:8:0x0058, B:11:0x0074, B:14:0x00a0, B:16:0x00df, B:19:0x00f8, B:21:0x0102, B:24:0x0728, B:25:0x012f, B:28:0x0145, B:30:0x014b, B:32:0x0151, B:34:0x0164, B:37:0x0171, B:39:0x017c, B:41:0x018a, B:43:0x0190, B:46:0x019d, B:48:0x01ab, B:50:0x01b9, B:53:0x01d9, B:55:0x01df, B:57:0x01ef, B:59:0x01fd, B:61:0x020d, B:63:0x0218, B:68:0x021b, B:70:0x0228, B:72:0x0232, B:73:0x0242, B:75:0x0261, B:77:0x026b, B:79:0x0281, B:80:0x028d, B:83:0x0298, B:84:0x02a2, B:87:0x02ab, B:89:0x02bc, B:93:0x02bf, B:95:0x02d6, B:102:0x04bb, B:103:0x04be, B:105:0x04ca, B:108:0x04db, B:110:0x04ec, B:112:0x04f8, B:113:0x05c3, B:115:0x05d0, B:117:0x05d6, B:119:0x05dc, B:121:0x05ec, B:122:0x05ef, B:123:0x05f4, B:125:0x05fa, B:126:0x0606, B:128:0x060c, B:130:0x061c, B:132:0x0626, B:133:0x063b, B:135:0x0641, B:136:0x065c, B:138:0x0662, B:140:0x0680, B:142:0x068d, B:144:0x06b6, B:145:0x0693, B:147:0x06a1, B:151:0x06be, B:152:0x06d6, B:154:0x06dc, B:157:0x06ef, B:162:0x06fc, B:163:0x0700, B:165:0x0706, B:167:0x0714, B:175:0x051b, B:177:0x052b, B:180:0x053e, B:182:0x0550, B:184:0x055c, B:186:0x0570, B:189:0x057e, B:191:0x0588, B:193:0x0592, B:196:0x059d, B:198:0x05a3, B:202:0x05b3, B:200:0x05be, B:205:0x02fc, B:208:0x0306, B:210:0x0314, B:212:0x0357, B:213:0x032f, B:215:0x033d, B:221:0x035e, B:223:0x0391, B:224:0x03b9, B:226:0x03ee, B:227:0x03f4, B:230:0x0400, B:232:0x0435, B:233:0x0452, B:235:0x0458, B:237:0x0466, B:239:0x047a, B:240:0x046e, B:248:0x0481, B:251:0x0488, B:252:0x04a0, B:259:0x073f, B:261:0x074d, B:263:0x0756, B:265:0x0788, B:266:0x075e, B:268:0x0767, B:270:0x076d, B:272:0x0779, B:274:0x0783, B:281:0x078b, B:282:0x0797, B:285:0x079f, B:288:0x07b1, B:289:0x07bc, B:291:0x07c4, B:292:0x07ec, B:294:0x0808, B:295:0x081d, B:297:0x0839, B:298:0x084e, B:299:0x085c, B:301:0x0862, B:303:0x0872, B:304:0x0879, B:306:0x0885, B:308:0x088c, B:311:0x088f, B:313:0x08d9, B:315:0x08df, B:316:0x090a, B:318:0x0912, B:319:0x091b, B:321:0x0921, B:322:0x0927, B:324:0x093e, B:326:0x0958, B:328:0x096a, B:330:0x0974, B:331:0x0977, B:333:0x09c1, B:334:0x09d4, B:337:0x09dc, B:340:0x09f7, B:342:0x0a10, B:344:0x0a25, B:346:0x0a2a, B:348:0x0a2e, B:350:0x0a32, B:352:0x0a3c, B:353:0x0a45, B:355:0x0a49, B:357:0x0a4f, B:358:0x0a5a, B:359:0x0a68, B:362:0x0c75, B:366:0x0a70, B:430:0x0a8c, B:369:0x0aa9, B:371:0x0acb, B:372:0x0ad3, B:374:0x0ad9, B:378:0x0ae9, B:383:0x0b13, B:384:0x0b36, B:386:0x0b42, B:388:0x0b5a, B:389:0x0b9d, B:394:0x0bb9, B:396:0x0bc4, B:398:0x0bc8, B:400:0x0bcc, B:402:0x0bd0, B:403:0x0bdc, B:404:0x0be1, B:406:0x0be7, B:408:0x0bff, B:409:0x0c04, B:411:0x0c72, B:413:0x0c15, B:415:0x0c1b, B:418:0x0c2f, B:420:0x0c4d, B:421:0x0c54, B:423:0x0c66, B:424:0x0c20, B:428:0x0afd, B:433:0x0a92, B:435:0x0c7f, B:437:0x0c8b, B:438:0x0c91, B:439:0x0c99, B:441:0x0c9f, B:444:0x0cb5, B:446:0x0cc7, B:447:0x0d4a, B:449:0x0d50, B:451:0x0d67, B:454:0x0d72, B:456:0x0d7c, B:458:0x0d9b, B:460:0x0dab, B:461:0x0db0, B:463:0x0dbe, B:464:0x0dc3, B:465:0x0dce, B:467:0x0de0, B:470:0x0de7, B:471:0x0e1c, B:472:0x0def, B:474:0x0dfd, B:475:0x0e03, B:476:0x0e2b, B:478:0x0e3e, B:479:0x0e5e, B:485:0x0e49, B:486:0x0ce1, B:488:0x0ce7, B:490:0x0cf1, B:491:0x0cf8, B:496:0x0d08, B:497:0x0d0f, B:499:0x0d3b, B:500:0x0d42, B:501:0x0d3f, B:502:0x0d0c, B:504:0x0cf5, B:505:0x08ef, B:507:0x08f5, B:509:0x08fb, B:510:0x084b, B:511:0x081a, B:512:0x07ca, B:514:0x07d0, B:518:0x0e67), top: B:2:0x001a, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0acb A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x001a, B:5:0x0036, B:7:0x003f, B:8:0x0058, B:11:0x0074, B:14:0x00a0, B:16:0x00df, B:19:0x00f8, B:21:0x0102, B:24:0x0728, B:25:0x012f, B:28:0x0145, B:30:0x014b, B:32:0x0151, B:34:0x0164, B:37:0x0171, B:39:0x017c, B:41:0x018a, B:43:0x0190, B:46:0x019d, B:48:0x01ab, B:50:0x01b9, B:53:0x01d9, B:55:0x01df, B:57:0x01ef, B:59:0x01fd, B:61:0x020d, B:63:0x0218, B:68:0x021b, B:70:0x0228, B:72:0x0232, B:73:0x0242, B:75:0x0261, B:77:0x026b, B:79:0x0281, B:80:0x028d, B:83:0x0298, B:84:0x02a2, B:87:0x02ab, B:89:0x02bc, B:93:0x02bf, B:95:0x02d6, B:102:0x04bb, B:103:0x04be, B:105:0x04ca, B:108:0x04db, B:110:0x04ec, B:112:0x04f8, B:113:0x05c3, B:115:0x05d0, B:117:0x05d6, B:119:0x05dc, B:121:0x05ec, B:122:0x05ef, B:123:0x05f4, B:125:0x05fa, B:126:0x0606, B:128:0x060c, B:130:0x061c, B:132:0x0626, B:133:0x063b, B:135:0x0641, B:136:0x065c, B:138:0x0662, B:140:0x0680, B:142:0x068d, B:144:0x06b6, B:145:0x0693, B:147:0x06a1, B:151:0x06be, B:152:0x06d6, B:154:0x06dc, B:157:0x06ef, B:162:0x06fc, B:163:0x0700, B:165:0x0706, B:167:0x0714, B:175:0x051b, B:177:0x052b, B:180:0x053e, B:182:0x0550, B:184:0x055c, B:186:0x0570, B:189:0x057e, B:191:0x0588, B:193:0x0592, B:196:0x059d, B:198:0x05a3, B:202:0x05b3, B:200:0x05be, B:205:0x02fc, B:208:0x0306, B:210:0x0314, B:212:0x0357, B:213:0x032f, B:215:0x033d, B:221:0x035e, B:223:0x0391, B:224:0x03b9, B:226:0x03ee, B:227:0x03f4, B:230:0x0400, B:232:0x0435, B:233:0x0452, B:235:0x0458, B:237:0x0466, B:239:0x047a, B:240:0x046e, B:248:0x0481, B:251:0x0488, B:252:0x04a0, B:259:0x073f, B:261:0x074d, B:263:0x0756, B:265:0x0788, B:266:0x075e, B:268:0x0767, B:270:0x076d, B:272:0x0779, B:274:0x0783, B:281:0x078b, B:282:0x0797, B:285:0x079f, B:288:0x07b1, B:289:0x07bc, B:291:0x07c4, B:292:0x07ec, B:294:0x0808, B:295:0x081d, B:297:0x0839, B:298:0x084e, B:299:0x085c, B:301:0x0862, B:303:0x0872, B:304:0x0879, B:306:0x0885, B:308:0x088c, B:311:0x088f, B:313:0x08d9, B:315:0x08df, B:316:0x090a, B:318:0x0912, B:319:0x091b, B:321:0x0921, B:322:0x0927, B:324:0x093e, B:326:0x0958, B:328:0x096a, B:330:0x0974, B:331:0x0977, B:333:0x09c1, B:334:0x09d4, B:337:0x09dc, B:340:0x09f7, B:342:0x0a10, B:344:0x0a25, B:346:0x0a2a, B:348:0x0a2e, B:350:0x0a32, B:352:0x0a3c, B:353:0x0a45, B:355:0x0a49, B:357:0x0a4f, B:358:0x0a5a, B:359:0x0a68, B:362:0x0c75, B:366:0x0a70, B:430:0x0a8c, B:369:0x0aa9, B:371:0x0acb, B:372:0x0ad3, B:374:0x0ad9, B:378:0x0ae9, B:383:0x0b13, B:384:0x0b36, B:386:0x0b42, B:388:0x0b5a, B:389:0x0b9d, B:394:0x0bb9, B:396:0x0bc4, B:398:0x0bc8, B:400:0x0bcc, B:402:0x0bd0, B:403:0x0bdc, B:404:0x0be1, B:406:0x0be7, B:408:0x0bff, B:409:0x0c04, B:411:0x0c72, B:413:0x0c15, B:415:0x0c1b, B:418:0x0c2f, B:420:0x0c4d, B:421:0x0c54, B:423:0x0c66, B:424:0x0c20, B:428:0x0afd, B:433:0x0a92, B:435:0x0c7f, B:437:0x0c8b, B:438:0x0c91, B:439:0x0c99, B:441:0x0c9f, B:444:0x0cb5, B:446:0x0cc7, B:447:0x0d4a, B:449:0x0d50, B:451:0x0d67, B:454:0x0d72, B:456:0x0d7c, B:458:0x0d9b, B:460:0x0dab, B:461:0x0db0, B:463:0x0dbe, B:464:0x0dc3, B:465:0x0dce, B:467:0x0de0, B:470:0x0de7, B:471:0x0e1c, B:472:0x0def, B:474:0x0dfd, B:475:0x0e03, B:476:0x0e2b, B:478:0x0e3e, B:479:0x0e5e, B:485:0x0e49, B:486:0x0ce1, B:488:0x0ce7, B:490:0x0cf1, B:491:0x0cf8, B:496:0x0d08, B:497:0x0d0f, B:499:0x0d3b, B:500:0x0d42, B:501:0x0d3f, B:502:0x0d0c, B:504:0x0cf5, B:505:0x08ef, B:507:0x08f5, B:509:0x08fb, B:510:0x084b, B:511:0x081a, B:512:0x07ca, B:514:0x07d0, B:518:0x0e67), top: B:2:0x001a, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0b13 A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x001a, B:5:0x0036, B:7:0x003f, B:8:0x0058, B:11:0x0074, B:14:0x00a0, B:16:0x00df, B:19:0x00f8, B:21:0x0102, B:24:0x0728, B:25:0x012f, B:28:0x0145, B:30:0x014b, B:32:0x0151, B:34:0x0164, B:37:0x0171, B:39:0x017c, B:41:0x018a, B:43:0x0190, B:46:0x019d, B:48:0x01ab, B:50:0x01b9, B:53:0x01d9, B:55:0x01df, B:57:0x01ef, B:59:0x01fd, B:61:0x020d, B:63:0x0218, B:68:0x021b, B:70:0x0228, B:72:0x0232, B:73:0x0242, B:75:0x0261, B:77:0x026b, B:79:0x0281, B:80:0x028d, B:83:0x0298, B:84:0x02a2, B:87:0x02ab, B:89:0x02bc, B:93:0x02bf, B:95:0x02d6, B:102:0x04bb, B:103:0x04be, B:105:0x04ca, B:108:0x04db, B:110:0x04ec, B:112:0x04f8, B:113:0x05c3, B:115:0x05d0, B:117:0x05d6, B:119:0x05dc, B:121:0x05ec, B:122:0x05ef, B:123:0x05f4, B:125:0x05fa, B:126:0x0606, B:128:0x060c, B:130:0x061c, B:132:0x0626, B:133:0x063b, B:135:0x0641, B:136:0x065c, B:138:0x0662, B:140:0x0680, B:142:0x068d, B:144:0x06b6, B:145:0x0693, B:147:0x06a1, B:151:0x06be, B:152:0x06d6, B:154:0x06dc, B:157:0x06ef, B:162:0x06fc, B:163:0x0700, B:165:0x0706, B:167:0x0714, B:175:0x051b, B:177:0x052b, B:180:0x053e, B:182:0x0550, B:184:0x055c, B:186:0x0570, B:189:0x057e, B:191:0x0588, B:193:0x0592, B:196:0x059d, B:198:0x05a3, B:202:0x05b3, B:200:0x05be, B:205:0x02fc, B:208:0x0306, B:210:0x0314, B:212:0x0357, B:213:0x032f, B:215:0x033d, B:221:0x035e, B:223:0x0391, B:224:0x03b9, B:226:0x03ee, B:227:0x03f4, B:230:0x0400, B:232:0x0435, B:233:0x0452, B:235:0x0458, B:237:0x0466, B:239:0x047a, B:240:0x046e, B:248:0x0481, B:251:0x0488, B:252:0x04a0, B:259:0x073f, B:261:0x074d, B:263:0x0756, B:265:0x0788, B:266:0x075e, B:268:0x0767, B:270:0x076d, B:272:0x0779, B:274:0x0783, B:281:0x078b, B:282:0x0797, B:285:0x079f, B:288:0x07b1, B:289:0x07bc, B:291:0x07c4, B:292:0x07ec, B:294:0x0808, B:295:0x081d, B:297:0x0839, B:298:0x084e, B:299:0x085c, B:301:0x0862, B:303:0x0872, B:304:0x0879, B:306:0x0885, B:308:0x088c, B:311:0x088f, B:313:0x08d9, B:315:0x08df, B:316:0x090a, B:318:0x0912, B:319:0x091b, B:321:0x0921, B:322:0x0927, B:324:0x093e, B:326:0x0958, B:328:0x096a, B:330:0x0974, B:331:0x0977, B:333:0x09c1, B:334:0x09d4, B:337:0x09dc, B:340:0x09f7, B:342:0x0a10, B:344:0x0a25, B:346:0x0a2a, B:348:0x0a2e, B:350:0x0a32, B:352:0x0a3c, B:353:0x0a45, B:355:0x0a49, B:357:0x0a4f, B:358:0x0a5a, B:359:0x0a68, B:362:0x0c75, B:366:0x0a70, B:430:0x0a8c, B:369:0x0aa9, B:371:0x0acb, B:372:0x0ad3, B:374:0x0ad9, B:378:0x0ae9, B:383:0x0b13, B:384:0x0b36, B:386:0x0b42, B:388:0x0b5a, B:389:0x0b9d, B:394:0x0bb9, B:396:0x0bc4, B:398:0x0bc8, B:400:0x0bcc, B:402:0x0bd0, B:403:0x0bdc, B:404:0x0be1, B:406:0x0be7, B:408:0x0bff, B:409:0x0c04, B:411:0x0c72, B:413:0x0c15, B:415:0x0c1b, B:418:0x0c2f, B:420:0x0c4d, B:421:0x0c54, B:423:0x0c66, B:424:0x0c20, B:428:0x0afd, B:433:0x0a92, B:435:0x0c7f, B:437:0x0c8b, B:438:0x0c91, B:439:0x0c99, B:441:0x0c9f, B:444:0x0cb5, B:446:0x0cc7, B:447:0x0d4a, B:449:0x0d50, B:451:0x0d67, B:454:0x0d72, B:456:0x0d7c, B:458:0x0d9b, B:460:0x0dab, B:461:0x0db0, B:463:0x0dbe, B:464:0x0dc3, B:465:0x0dce, B:467:0x0de0, B:470:0x0de7, B:471:0x0e1c, B:472:0x0def, B:474:0x0dfd, B:475:0x0e03, B:476:0x0e2b, B:478:0x0e3e, B:479:0x0e5e, B:485:0x0e49, B:486:0x0ce1, B:488:0x0ce7, B:490:0x0cf1, B:491:0x0cf8, B:496:0x0d08, B:497:0x0d0f, B:499:0x0d3b, B:500:0x0d42, B:501:0x0d3f, B:502:0x0d0c, B:504:0x0cf5, B:505:0x08ef, B:507:0x08f5, B:509:0x08fb, B:510:0x084b, B:511:0x081a, B:512:0x07ca, B:514:0x07d0, B:518:0x0e67), top: B:2:0x001a, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0b36 A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x001a, B:5:0x0036, B:7:0x003f, B:8:0x0058, B:11:0x0074, B:14:0x00a0, B:16:0x00df, B:19:0x00f8, B:21:0x0102, B:24:0x0728, B:25:0x012f, B:28:0x0145, B:30:0x014b, B:32:0x0151, B:34:0x0164, B:37:0x0171, B:39:0x017c, B:41:0x018a, B:43:0x0190, B:46:0x019d, B:48:0x01ab, B:50:0x01b9, B:53:0x01d9, B:55:0x01df, B:57:0x01ef, B:59:0x01fd, B:61:0x020d, B:63:0x0218, B:68:0x021b, B:70:0x0228, B:72:0x0232, B:73:0x0242, B:75:0x0261, B:77:0x026b, B:79:0x0281, B:80:0x028d, B:83:0x0298, B:84:0x02a2, B:87:0x02ab, B:89:0x02bc, B:93:0x02bf, B:95:0x02d6, B:102:0x04bb, B:103:0x04be, B:105:0x04ca, B:108:0x04db, B:110:0x04ec, B:112:0x04f8, B:113:0x05c3, B:115:0x05d0, B:117:0x05d6, B:119:0x05dc, B:121:0x05ec, B:122:0x05ef, B:123:0x05f4, B:125:0x05fa, B:126:0x0606, B:128:0x060c, B:130:0x061c, B:132:0x0626, B:133:0x063b, B:135:0x0641, B:136:0x065c, B:138:0x0662, B:140:0x0680, B:142:0x068d, B:144:0x06b6, B:145:0x0693, B:147:0x06a1, B:151:0x06be, B:152:0x06d6, B:154:0x06dc, B:157:0x06ef, B:162:0x06fc, B:163:0x0700, B:165:0x0706, B:167:0x0714, B:175:0x051b, B:177:0x052b, B:180:0x053e, B:182:0x0550, B:184:0x055c, B:186:0x0570, B:189:0x057e, B:191:0x0588, B:193:0x0592, B:196:0x059d, B:198:0x05a3, B:202:0x05b3, B:200:0x05be, B:205:0x02fc, B:208:0x0306, B:210:0x0314, B:212:0x0357, B:213:0x032f, B:215:0x033d, B:221:0x035e, B:223:0x0391, B:224:0x03b9, B:226:0x03ee, B:227:0x03f4, B:230:0x0400, B:232:0x0435, B:233:0x0452, B:235:0x0458, B:237:0x0466, B:239:0x047a, B:240:0x046e, B:248:0x0481, B:251:0x0488, B:252:0x04a0, B:259:0x073f, B:261:0x074d, B:263:0x0756, B:265:0x0788, B:266:0x075e, B:268:0x0767, B:270:0x076d, B:272:0x0779, B:274:0x0783, B:281:0x078b, B:282:0x0797, B:285:0x079f, B:288:0x07b1, B:289:0x07bc, B:291:0x07c4, B:292:0x07ec, B:294:0x0808, B:295:0x081d, B:297:0x0839, B:298:0x084e, B:299:0x085c, B:301:0x0862, B:303:0x0872, B:304:0x0879, B:306:0x0885, B:308:0x088c, B:311:0x088f, B:313:0x08d9, B:315:0x08df, B:316:0x090a, B:318:0x0912, B:319:0x091b, B:321:0x0921, B:322:0x0927, B:324:0x093e, B:326:0x0958, B:328:0x096a, B:330:0x0974, B:331:0x0977, B:333:0x09c1, B:334:0x09d4, B:337:0x09dc, B:340:0x09f7, B:342:0x0a10, B:344:0x0a25, B:346:0x0a2a, B:348:0x0a2e, B:350:0x0a32, B:352:0x0a3c, B:353:0x0a45, B:355:0x0a49, B:357:0x0a4f, B:358:0x0a5a, B:359:0x0a68, B:362:0x0c75, B:366:0x0a70, B:430:0x0a8c, B:369:0x0aa9, B:371:0x0acb, B:372:0x0ad3, B:374:0x0ad9, B:378:0x0ae9, B:383:0x0b13, B:384:0x0b36, B:386:0x0b42, B:388:0x0b5a, B:389:0x0b9d, B:394:0x0bb9, B:396:0x0bc4, B:398:0x0bc8, B:400:0x0bcc, B:402:0x0bd0, B:403:0x0bdc, B:404:0x0be1, B:406:0x0be7, B:408:0x0bff, B:409:0x0c04, B:411:0x0c72, B:413:0x0c15, B:415:0x0c1b, B:418:0x0c2f, B:420:0x0c4d, B:421:0x0c54, B:423:0x0c66, B:424:0x0c20, B:428:0x0afd, B:433:0x0a92, B:435:0x0c7f, B:437:0x0c8b, B:438:0x0c91, B:439:0x0c99, B:441:0x0c9f, B:444:0x0cb5, B:446:0x0cc7, B:447:0x0d4a, B:449:0x0d50, B:451:0x0d67, B:454:0x0d72, B:456:0x0d7c, B:458:0x0d9b, B:460:0x0dab, B:461:0x0db0, B:463:0x0dbe, B:464:0x0dc3, B:465:0x0dce, B:467:0x0de0, B:470:0x0de7, B:471:0x0e1c, B:472:0x0def, B:474:0x0dfd, B:475:0x0e03, B:476:0x0e2b, B:478:0x0e3e, B:479:0x0e5e, B:485:0x0e49, B:486:0x0ce1, B:488:0x0ce7, B:490:0x0cf1, B:491:0x0cf8, B:496:0x0d08, B:497:0x0d0f, B:499:0x0d3b, B:500:0x0d42, B:501:0x0d3f, B:502:0x0d0c, B:504:0x0cf5, B:505:0x08ef, B:507:0x08f5, B:509:0x08fb, B:510:0x084b, B:511:0x081a, B:512:0x07ca, B:514:0x07d0, B:518:0x0e67), top: B:2:0x001a, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b9 A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x001a, B:5:0x0036, B:7:0x003f, B:8:0x0058, B:11:0x0074, B:14:0x00a0, B:16:0x00df, B:19:0x00f8, B:21:0x0102, B:24:0x0728, B:25:0x012f, B:28:0x0145, B:30:0x014b, B:32:0x0151, B:34:0x0164, B:37:0x0171, B:39:0x017c, B:41:0x018a, B:43:0x0190, B:46:0x019d, B:48:0x01ab, B:50:0x01b9, B:53:0x01d9, B:55:0x01df, B:57:0x01ef, B:59:0x01fd, B:61:0x020d, B:63:0x0218, B:68:0x021b, B:70:0x0228, B:72:0x0232, B:73:0x0242, B:75:0x0261, B:77:0x026b, B:79:0x0281, B:80:0x028d, B:83:0x0298, B:84:0x02a2, B:87:0x02ab, B:89:0x02bc, B:93:0x02bf, B:95:0x02d6, B:102:0x04bb, B:103:0x04be, B:105:0x04ca, B:108:0x04db, B:110:0x04ec, B:112:0x04f8, B:113:0x05c3, B:115:0x05d0, B:117:0x05d6, B:119:0x05dc, B:121:0x05ec, B:122:0x05ef, B:123:0x05f4, B:125:0x05fa, B:126:0x0606, B:128:0x060c, B:130:0x061c, B:132:0x0626, B:133:0x063b, B:135:0x0641, B:136:0x065c, B:138:0x0662, B:140:0x0680, B:142:0x068d, B:144:0x06b6, B:145:0x0693, B:147:0x06a1, B:151:0x06be, B:152:0x06d6, B:154:0x06dc, B:157:0x06ef, B:162:0x06fc, B:163:0x0700, B:165:0x0706, B:167:0x0714, B:175:0x051b, B:177:0x052b, B:180:0x053e, B:182:0x0550, B:184:0x055c, B:186:0x0570, B:189:0x057e, B:191:0x0588, B:193:0x0592, B:196:0x059d, B:198:0x05a3, B:202:0x05b3, B:200:0x05be, B:205:0x02fc, B:208:0x0306, B:210:0x0314, B:212:0x0357, B:213:0x032f, B:215:0x033d, B:221:0x035e, B:223:0x0391, B:224:0x03b9, B:226:0x03ee, B:227:0x03f4, B:230:0x0400, B:232:0x0435, B:233:0x0452, B:235:0x0458, B:237:0x0466, B:239:0x047a, B:240:0x046e, B:248:0x0481, B:251:0x0488, B:252:0x04a0, B:259:0x073f, B:261:0x074d, B:263:0x0756, B:265:0x0788, B:266:0x075e, B:268:0x0767, B:270:0x076d, B:272:0x0779, B:274:0x0783, B:281:0x078b, B:282:0x0797, B:285:0x079f, B:288:0x07b1, B:289:0x07bc, B:291:0x07c4, B:292:0x07ec, B:294:0x0808, B:295:0x081d, B:297:0x0839, B:298:0x084e, B:299:0x085c, B:301:0x0862, B:303:0x0872, B:304:0x0879, B:306:0x0885, B:308:0x088c, B:311:0x088f, B:313:0x08d9, B:315:0x08df, B:316:0x090a, B:318:0x0912, B:319:0x091b, B:321:0x0921, B:322:0x0927, B:324:0x093e, B:326:0x0958, B:328:0x096a, B:330:0x0974, B:331:0x0977, B:333:0x09c1, B:334:0x09d4, B:337:0x09dc, B:340:0x09f7, B:342:0x0a10, B:344:0x0a25, B:346:0x0a2a, B:348:0x0a2e, B:350:0x0a32, B:352:0x0a3c, B:353:0x0a45, B:355:0x0a49, B:357:0x0a4f, B:358:0x0a5a, B:359:0x0a68, B:362:0x0c75, B:366:0x0a70, B:430:0x0a8c, B:369:0x0aa9, B:371:0x0acb, B:372:0x0ad3, B:374:0x0ad9, B:378:0x0ae9, B:383:0x0b13, B:384:0x0b36, B:386:0x0b42, B:388:0x0b5a, B:389:0x0b9d, B:394:0x0bb9, B:396:0x0bc4, B:398:0x0bc8, B:400:0x0bcc, B:402:0x0bd0, B:403:0x0bdc, B:404:0x0be1, B:406:0x0be7, B:408:0x0bff, B:409:0x0c04, B:411:0x0c72, B:413:0x0c15, B:415:0x0c1b, B:418:0x0c2f, B:420:0x0c4d, B:421:0x0c54, B:423:0x0c66, B:424:0x0c20, B:428:0x0afd, B:433:0x0a92, B:435:0x0c7f, B:437:0x0c8b, B:438:0x0c91, B:439:0x0c99, B:441:0x0c9f, B:444:0x0cb5, B:446:0x0cc7, B:447:0x0d4a, B:449:0x0d50, B:451:0x0d67, B:454:0x0d72, B:456:0x0d7c, B:458:0x0d9b, B:460:0x0dab, B:461:0x0db0, B:463:0x0dbe, B:464:0x0dc3, B:465:0x0dce, B:467:0x0de0, B:470:0x0de7, B:471:0x0e1c, B:472:0x0def, B:474:0x0dfd, B:475:0x0e03, B:476:0x0e2b, B:478:0x0e3e, B:479:0x0e5e, B:485:0x0e49, B:486:0x0ce1, B:488:0x0ce7, B:490:0x0cf1, B:491:0x0cf8, B:496:0x0d08, B:497:0x0d0f, B:499:0x0d3b, B:500:0x0d42, B:501:0x0d3f, B:502:0x0d0c, B:504:0x0cf5, B:505:0x08ef, B:507:0x08f5, B:509:0x08fb, B:510:0x084b, B:511:0x081a, B:512:0x07ca, B:514:0x07d0, B:518:0x0e67), top: B:2:0x001a, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0228 A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x001a, B:5:0x0036, B:7:0x003f, B:8:0x0058, B:11:0x0074, B:14:0x00a0, B:16:0x00df, B:19:0x00f8, B:21:0x0102, B:24:0x0728, B:25:0x012f, B:28:0x0145, B:30:0x014b, B:32:0x0151, B:34:0x0164, B:37:0x0171, B:39:0x017c, B:41:0x018a, B:43:0x0190, B:46:0x019d, B:48:0x01ab, B:50:0x01b9, B:53:0x01d9, B:55:0x01df, B:57:0x01ef, B:59:0x01fd, B:61:0x020d, B:63:0x0218, B:68:0x021b, B:70:0x0228, B:72:0x0232, B:73:0x0242, B:75:0x0261, B:77:0x026b, B:79:0x0281, B:80:0x028d, B:83:0x0298, B:84:0x02a2, B:87:0x02ab, B:89:0x02bc, B:93:0x02bf, B:95:0x02d6, B:102:0x04bb, B:103:0x04be, B:105:0x04ca, B:108:0x04db, B:110:0x04ec, B:112:0x04f8, B:113:0x05c3, B:115:0x05d0, B:117:0x05d6, B:119:0x05dc, B:121:0x05ec, B:122:0x05ef, B:123:0x05f4, B:125:0x05fa, B:126:0x0606, B:128:0x060c, B:130:0x061c, B:132:0x0626, B:133:0x063b, B:135:0x0641, B:136:0x065c, B:138:0x0662, B:140:0x0680, B:142:0x068d, B:144:0x06b6, B:145:0x0693, B:147:0x06a1, B:151:0x06be, B:152:0x06d6, B:154:0x06dc, B:157:0x06ef, B:162:0x06fc, B:163:0x0700, B:165:0x0706, B:167:0x0714, B:175:0x051b, B:177:0x052b, B:180:0x053e, B:182:0x0550, B:184:0x055c, B:186:0x0570, B:189:0x057e, B:191:0x0588, B:193:0x0592, B:196:0x059d, B:198:0x05a3, B:202:0x05b3, B:200:0x05be, B:205:0x02fc, B:208:0x0306, B:210:0x0314, B:212:0x0357, B:213:0x032f, B:215:0x033d, B:221:0x035e, B:223:0x0391, B:224:0x03b9, B:226:0x03ee, B:227:0x03f4, B:230:0x0400, B:232:0x0435, B:233:0x0452, B:235:0x0458, B:237:0x0466, B:239:0x047a, B:240:0x046e, B:248:0x0481, B:251:0x0488, B:252:0x04a0, B:259:0x073f, B:261:0x074d, B:263:0x0756, B:265:0x0788, B:266:0x075e, B:268:0x0767, B:270:0x076d, B:272:0x0779, B:274:0x0783, B:281:0x078b, B:282:0x0797, B:285:0x079f, B:288:0x07b1, B:289:0x07bc, B:291:0x07c4, B:292:0x07ec, B:294:0x0808, B:295:0x081d, B:297:0x0839, B:298:0x084e, B:299:0x085c, B:301:0x0862, B:303:0x0872, B:304:0x0879, B:306:0x0885, B:308:0x088c, B:311:0x088f, B:313:0x08d9, B:315:0x08df, B:316:0x090a, B:318:0x0912, B:319:0x091b, B:321:0x0921, B:322:0x0927, B:324:0x093e, B:326:0x0958, B:328:0x096a, B:330:0x0974, B:331:0x0977, B:333:0x09c1, B:334:0x09d4, B:337:0x09dc, B:340:0x09f7, B:342:0x0a10, B:344:0x0a25, B:346:0x0a2a, B:348:0x0a2e, B:350:0x0a32, B:352:0x0a3c, B:353:0x0a45, B:355:0x0a49, B:357:0x0a4f, B:358:0x0a5a, B:359:0x0a68, B:362:0x0c75, B:366:0x0a70, B:430:0x0a8c, B:369:0x0aa9, B:371:0x0acb, B:372:0x0ad3, B:374:0x0ad9, B:378:0x0ae9, B:383:0x0b13, B:384:0x0b36, B:386:0x0b42, B:388:0x0b5a, B:389:0x0b9d, B:394:0x0bb9, B:396:0x0bc4, B:398:0x0bc8, B:400:0x0bcc, B:402:0x0bd0, B:403:0x0bdc, B:404:0x0be1, B:406:0x0be7, B:408:0x0bff, B:409:0x0c04, B:411:0x0c72, B:413:0x0c15, B:415:0x0c1b, B:418:0x0c2f, B:420:0x0c4d, B:421:0x0c54, B:423:0x0c66, B:424:0x0c20, B:428:0x0afd, B:433:0x0a92, B:435:0x0c7f, B:437:0x0c8b, B:438:0x0c91, B:439:0x0c99, B:441:0x0c9f, B:444:0x0cb5, B:446:0x0cc7, B:447:0x0d4a, B:449:0x0d50, B:451:0x0d67, B:454:0x0d72, B:456:0x0d7c, B:458:0x0d9b, B:460:0x0dab, B:461:0x0db0, B:463:0x0dbe, B:464:0x0dc3, B:465:0x0dce, B:467:0x0de0, B:470:0x0de7, B:471:0x0e1c, B:472:0x0def, B:474:0x0dfd, B:475:0x0e03, B:476:0x0e2b, B:478:0x0e3e, B:479:0x0e5e, B:485:0x0e49, B:486:0x0ce1, B:488:0x0ce7, B:490:0x0cf1, B:491:0x0cf8, B:496:0x0d08, B:497:0x0d0f, B:499:0x0d3b, B:500:0x0d42, B:501:0x0d3f, B:502:0x0d0c, B:504:0x0cf5, B:505:0x08ef, B:507:0x08f5, B:509:0x08fb, B:510:0x084b, B:511:0x081a, B:512:0x07ca, B:514:0x07d0, B:518:0x0e67), top: B:2:0x001a, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0261 A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x001a, B:5:0x0036, B:7:0x003f, B:8:0x0058, B:11:0x0074, B:14:0x00a0, B:16:0x00df, B:19:0x00f8, B:21:0x0102, B:24:0x0728, B:25:0x012f, B:28:0x0145, B:30:0x014b, B:32:0x0151, B:34:0x0164, B:37:0x0171, B:39:0x017c, B:41:0x018a, B:43:0x0190, B:46:0x019d, B:48:0x01ab, B:50:0x01b9, B:53:0x01d9, B:55:0x01df, B:57:0x01ef, B:59:0x01fd, B:61:0x020d, B:63:0x0218, B:68:0x021b, B:70:0x0228, B:72:0x0232, B:73:0x0242, B:75:0x0261, B:77:0x026b, B:79:0x0281, B:80:0x028d, B:83:0x0298, B:84:0x02a2, B:87:0x02ab, B:89:0x02bc, B:93:0x02bf, B:95:0x02d6, B:102:0x04bb, B:103:0x04be, B:105:0x04ca, B:108:0x04db, B:110:0x04ec, B:112:0x04f8, B:113:0x05c3, B:115:0x05d0, B:117:0x05d6, B:119:0x05dc, B:121:0x05ec, B:122:0x05ef, B:123:0x05f4, B:125:0x05fa, B:126:0x0606, B:128:0x060c, B:130:0x061c, B:132:0x0626, B:133:0x063b, B:135:0x0641, B:136:0x065c, B:138:0x0662, B:140:0x0680, B:142:0x068d, B:144:0x06b6, B:145:0x0693, B:147:0x06a1, B:151:0x06be, B:152:0x06d6, B:154:0x06dc, B:157:0x06ef, B:162:0x06fc, B:163:0x0700, B:165:0x0706, B:167:0x0714, B:175:0x051b, B:177:0x052b, B:180:0x053e, B:182:0x0550, B:184:0x055c, B:186:0x0570, B:189:0x057e, B:191:0x0588, B:193:0x0592, B:196:0x059d, B:198:0x05a3, B:202:0x05b3, B:200:0x05be, B:205:0x02fc, B:208:0x0306, B:210:0x0314, B:212:0x0357, B:213:0x032f, B:215:0x033d, B:221:0x035e, B:223:0x0391, B:224:0x03b9, B:226:0x03ee, B:227:0x03f4, B:230:0x0400, B:232:0x0435, B:233:0x0452, B:235:0x0458, B:237:0x0466, B:239:0x047a, B:240:0x046e, B:248:0x0481, B:251:0x0488, B:252:0x04a0, B:259:0x073f, B:261:0x074d, B:263:0x0756, B:265:0x0788, B:266:0x075e, B:268:0x0767, B:270:0x076d, B:272:0x0779, B:274:0x0783, B:281:0x078b, B:282:0x0797, B:285:0x079f, B:288:0x07b1, B:289:0x07bc, B:291:0x07c4, B:292:0x07ec, B:294:0x0808, B:295:0x081d, B:297:0x0839, B:298:0x084e, B:299:0x085c, B:301:0x0862, B:303:0x0872, B:304:0x0879, B:306:0x0885, B:308:0x088c, B:311:0x088f, B:313:0x08d9, B:315:0x08df, B:316:0x090a, B:318:0x0912, B:319:0x091b, B:321:0x0921, B:322:0x0927, B:324:0x093e, B:326:0x0958, B:328:0x096a, B:330:0x0974, B:331:0x0977, B:333:0x09c1, B:334:0x09d4, B:337:0x09dc, B:340:0x09f7, B:342:0x0a10, B:344:0x0a25, B:346:0x0a2a, B:348:0x0a2e, B:350:0x0a32, B:352:0x0a3c, B:353:0x0a45, B:355:0x0a49, B:357:0x0a4f, B:358:0x0a5a, B:359:0x0a68, B:362:0x0c75, B:366:0x0a70, B:430:0x0a8c, B:369:0x0aa9, B:371:0x0acb, B:372:0x0ad3, B:374:0x0ad9, B:378:0x0ae9, B:383:0x0b13, B:384:0x0b36, B:386:0x0b42, B:388:0x0b5a, B:389:0x0b9d, B:394:0x0bb9, B:396:0x0bc4, B:398:0x0bc8, B:400:0x0bcc, B:402:0x0bd0, B:403:0x0bdc, B:404:0x0be1, B:406:0x0be7, B:408:0x0bff, B:409:0x0c04, B:411:0x0c72, B:413:0x0c15, B:415:0x0c1b, B:418:0x0c2f, B:420:0x0c4d, B:421:0x0c54, B:423:0x0c66, B:424:0x0c20, B:428:0x0afd, B:433:0x0a92, B:435:0x0c7f, B:437:0x0c8b, B:438:0x0c91, B:439:0x0c99, B:441:0x0c9f, B:444:0x0cb5, B:446:0x0cc7, B:447:0x0d4a, B:449:0x0d50, B:451:0x0d67, B:454:0x0d72, B:456:0x0d7c, B:458:0x0d9b, B:460:0x0dab, B:461:0x0db0, B:463:0x0dbe, B:464:0x0dc3, B:465:0x0dce, B:467:0x0de0, B:470:0x0de7, B:471:0x0e1c, B:472:0x0def, B:474:0x0dfd, B:475:0x0e03, B:476:0x0e2b, B:478:0x0e3e, B:479:0x0e5e, B:485:0x0e49, B:486:0x0ce1, B:488:0x0ce7, B:490:0x0cf1, B:491:0x0cf8, B:496:0x0d08, B:497:0x0d0f, B:499:0x0d3b, B:500:0x0d42, B:501:0x0d3f, B:502:0x0d0c, B:504:0x0cf5, B:505:0x08ef, B:507:0x08f5, B:509:0x08fb, B:510:0x084b, B:511:0x081a, B:512:0x07ca, B:514:0x07d0, B:518:0x0e67), top: B:2:0x001a, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0281 A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x001a, B:5:0x0036, B:7:0x003f, B:8:0x0058, B:11:0x0074, B:14:0x00a0, B:16:0x00df, B:19:0x00f8, B:21:0x0102, B:24:0x0728, B:25:0x012f, B:28:0x0145, B:30:0x014b, B:32:0x0151, B:34:0x0164, B:37:0x0171, B:39:0x017c, B:41:0x018a, B:43:0x0190, B:46:0x019d, B:48:0x01ab, B:50:0x01b9, B:53:0x01d9, B:55:0x01df, B:57:0x01ef, B:59:0x01fd, B:61:0x020d, B:63:0x0218, B:68:0x021b, B:70:0x0228, B:72:0x0232, B:73:0x0242, B:75:0x0261, B:77:0x026b, B:79:0x0281, B:80:0x028d, B:83:0x0298, B:84:0x02a2, B:87:0x02ab, B:89:0x02bc, B:93:0x02bf, B:95:0x02d6, B:102:0x04bb, B:103:0x04be, B:105:0x04ca, B:108:0x04db, B:110:0x04ec, B:112:0x04f8, B:113:0x05c3, B:115:0x05d0, B:117:0x05d6, B:119:0x05dc, B:121:0x05ec, B:122:0x05ef, B:123:0x05f4, B:125:0x05fa, B:126:0x0606, B:128:0x060c, B:130:0x061c, B:132:0x0626, B:133:0x063b, B:135:0x0641, B:136:0x065c, B:138:0x0662, B:140:0x0680, B:142:0x068d, B:144:0x06b6, B:145:0x0693, B:147:0x06a1, B:151:0x06be, B:152:0x06d6, B:154:0x06dc, B:157:0x06ef, B:162:0x06fc, B:163:0x0700, B:165:0x0706, B:167:0x0714, B:175:0x051b, B:177:0x052b, B:180:0x053e, B:182:0x0550, B:184:0x055c, B:186:0x0570, B:189:0x057e, B:191:0x0588, B:193:0x0592, B:196:0x059d, B:198:0x05a3, B:202:0x05b3, B:200:0x05be, B:205:0x02fc, B:208:0x0306, B:210:0x0314, B:212:0x0357, B:213:0x032f, B:215:0x033d, B:221:0x035e, B:223:0x0391, B:224:0x03b9, B:226:0x03ee, B:227:0x03f4, B:230:0x0400, B:232:0x0435, B:233:0x0452, B:235:0x0458, B:237:0x0466, B:239:0x047a, B:240:0x046e, B:248:0x0481, B:251:0x0488, B:252:0x04a0, B:259:0x073f, B:261:0x074d, B:263:0x0756, B:265:0x0788, B:266:0x075e, B:268:0x0767, B:270:0x076d, B:272:0x0779, B:274:0x0783, B:281:0x078b, B:282:0x0797, B:285:0x079f, B:288:0x07b1, B:289:0x07bc, B:291:0x07c4, B:292:0x07ec, B:294:0x0808, B:295:0x081d, B:297:0x0839, B:298:0x084e, B:299:0x085c, B:301:0x0862, B:303:0x0872, B:304:0x0879, B:306:0x0885, B:308:0x088c, B:311:0x088f, B:313:0x08d9, B:315:0x08df, B:316:0x090a, B:318:0x0912, B:319:0x091b, B:321:0x0921, B:322:0x0927, B:324:0x093e, B:326:0x0958, B:328:0x096a, B:330:0x0974, B:331:0x0977, B:333:0x09c1, B:334:0x09d4, B:337:0x09dc, B:340:0x09f7, B:342:0x0a10, B:344:0x0a25, B:346:0x0a2a, B:348:0x0a2e, B:350:0x0a32, B:352:0x0a3c, B:353:0x0a45, B:355:0x0a49, B:357:0x0a4f, B:358:0x0a5a, B:359:0x0a68, B:362:0x0c75, B:366:0x0a70, B:430:0x0a8c, B:369:0x0aa9, B:371:0x0acb, B:372:0x0ad3, B:374:0x0ad9, B:378:0x0ae9, B:383:0x0b13, B:384:0x0b36, B:386:0x0b42, B:388:0x0b5a, B:389:0x0b9d, B:394:0x0bb9, B:396:0x0bc4, B:398:0x0bc8, B:400:0x0bcc, B:402:0x0bd0, B:403:0x0bdc, B:404:0x0be1, B:406:0x0be7, B:408:0x0bff, B:409:0x0c04, B:411:0x0c72, B:413:0x0c15, B:415:0x0c1b, B:418:0x0c2f, B:420:0x0c4d, B:421:0x0c54, B:423:0x0c66, B:424:0x0c20, B:428:0x0afd, B:433:0x0a92, B:435:0x0c7f, B:437:0x0c8b, B:438:0x0c91, B:439:0x0c99, B:441:0x0c9f, B:444:0x0cb5, B:446:0x0cc7, B:447:0x0d4a, B:449:0x0d50, B:451:0x0d67, B:454:0x0d72, B:456:0x0d7c, B:458:0x0d9b, B:460:0x0dab, B:461:0x0db0, B:463:0x0dbe, B:464:0x0dc3, B:465:0x0dce, B:467:0x0de0, B:470:0x0de7, B:471:0x0e1c, B:472:0x0def, B:474:0x0dfd, B:475:0x0e03, B:476:0x0e2b, B:478:0x0e3e, B:479:0x0e5e, B:485:0x0e49, B:486:0x0ce1, B:488:0x0ce7, B:490:0x0cf1, B:491:0x0cf8, B:496:0x0d08, B:497:0x0d0f, B:499:0x0d3b, B:500:0x0d42, B:501:0x0d3f, B:502:0x0d0c, B:504:0x0cf5, B:505:0x08ef, B:507:0x08f5, B:509:0x08fb, B:510:0x084b, B:511:0x081a, B:512:0x07ca, B:514:0x07d0, B:518:0x0e67), top: B:2:0x001a, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0298 A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x001a, B:5:0x0036, B:7:0x003f, B:8:0x0058, B:11:0x0074, B:14:0x00a0, B:16:0x00df, B:19:0x00f8, B:21:0x0102, B:24:0x0728, B:25:0x012f, B:28:0x0145, B:30:0x014b, B:32:0x0151, B:34:0x0164, B:37:0x0171, B:39:0x017c, B:41:0x018a, B:43:0x0190, B:46:0x019d, B:48:0x01ab, B:50:0x01b9, B:53:0x01d9, B:55:0x01df, B:57:0x01ef, B:59:0x01fd, B:61:0x020d, B:63:0x0218, B:68:0x021b, B:70:0x0228, B:72:0x0232, B:73:0x0242, B:75:0x0261, B:77:0x026b, B:79:0x0281, B:80:0x028d, B:83:0x0298, B:84:0x02a2, B:87:0x02ab, B:89:0x02bc, B:93:0x02bf, B:95:0x02d6, B:102:0x04bb, B:103:0x04be, B:105:0x04ca, B:108:0x04db, B:110:0x04ec, B:112:0x04f8, B:113:0x05c3, B:115:0x05d0, B:117:0x05d6, B:119:0x05dc, B:121:0x05ec, B:122:0x05ef, B:123:0x05f4, B:125:0x05fa, B:126:0x0606, B:128:0x060c, B:130:0x061c, B:132:0x0626, B:133:0x063b, B:135:0x0641, B:136:0x065c, B:138:0x0662, B:140:0x0680, B:142:0x068d, B:144:0x06b6, B:145:0x0693, B:147:0x06a1, B:151:0x06be, B:152:0x06d6, B:154:0x06dc, B:157:0x06ef, B:162:0x06fc, B:163:0x0700, B:165:0x0706, B:167:0x0714, B:175:0x051b, B:177:0x052b, B:180:0x053e, B:182:0x0550, B:184:0x055c, B:186:0x0570, B:189:0x057e, B:191:0x0588, B:193:0x0592, B:196:0x059d, B:198:0x05a3, B:202:0x05b3, B:200:0x05be, B:205:0x02fc, B:208:0x0306, B:210:0x0314, B:212:0x0357, B:213:0x032f, B:215:0x033d, B:221:0x035e, B:223:0x0391, B:224:0x03b9, B:226:0x03ee, B:227:0x03f4, B:230:0x0400, B:232:0x0435, B:233:0x0452, B:235:0x0458, B:237:0x0466, B:239:0x047a, B:240:0x046e, B:248:0x0481, B:251:0x0488, B:252:0x04a0, B:259:0x073f, B:261:0x074d, B:263:0x0756, B:265:0x0788, B:266:0x075e, B:268:0x0767, B:270:0x076d, B:272:0x0779, B:274:0x0783, B:281:0x078b, B:282:0x0797, B:285:0x079f, B:288:0x07b1, B:289:0x07bc, B:291:0x07c4, B:292:0x07ec, B:294:0x0808, B:295:0x081d, B:297:0x0839, B:298:0x084e, B:299:0x085c, B:301:0x0862, B:303:0x0872, B:304:0x0879, B:306:0x0885, B:308:0x088c, B:311:0x088f, B:313:0x08d9, B:315:0x08df, B:316:0x090a, B:318:0x0912, B:319:0x091b, B:321:0x0921, B:322:0x0927, B:324:0x093e, B:326:0x0958, B:328:0x096a, B:330:0x0974, B:331:0x0977, B:333:0x09c1, B:334:0x09d4, B:337:0x09dc, B:340:0x09f7, B:342:0x0a10, B:344:0x0a25, B:346:0x0a2a, B:348:0x0a2e, B:350:0x0a32, B:352:0x0a3c, B:353:0x0a45, B:355:0x0a49, B:357:0x0a4f, B:358:0x0a5a, B:359:0x0a68, B:362:0x0c75, B:366:0x0a70, B:430:0x0a8c, B:369:0x0aa9, B:371:0x0acb, B:372:0x0ad3, B:374:0x0ad9, B:378:0x0ae9, B:383:0x0b13, B:384:0x0b36, B:386:0x0b42, B:388:0x0b5a, B:389:0x0b9d, B:394:0x0bb9, B:396:0x0bc4, B:398:0x0bc8, B:400:0x0bcc, B:402:0x0bd0, B:403:0x0bdc, B:404:0x0be1, B:406:0x0be7, B:408:0x0bff, B:409:0x0c04, B:411:0x0c72, B:413:0x0c15, B:415:0x0c1b, B:418:0x0c2f, B:420:0x0c4d, B:421:0x0c54, B:423:0x0c66, B:424:0x0c20, B:428:0x0afd, B:433:0x0a92, B:435:0x0c7f, B:437:0x0c8b, B:438:0x0c91, B:439:0x0c99, B:441:0x0c9f, B:444:0x0cb5, B:446:0x0cc7, B:447:0x0d4a, B:449:0x0d50, B:451:0x0d67, B:454:0x0d72, B:456:0x0d7c, B:458:0x0d9b, B:460:0x0dab, B:461:0x0db0, B:463:0x0dbe, B:464:0x0dc3, B:465:0x0dce, B:467:0x0de0, B:470:0x0de7, B:471:0x0e1c, B:472:0x0def, B:474:0x0dfd, B:475:0x0e03, B:476:0x0e2b, B:478:0x0e3e, B:479:0x0e5e, B:485:0x0e49, B:486:0x0ce1, B:488:0x0ce7, B:490:0x0cf1, B:491:0x0cf8, B:496:0x0d08, B:497:0x0d0f, B:499:0x0d3b, B:500:0x0d42, B:501:0x0d3f, B:502:0x0d0c, B:504:0x0cf5, B:505:0x08ef, B:507:0x08f5, B:509:0x08fb, B:510:0x084b, B:511:0x081a, B:512:0x07ca, B:514:0x07d0, B:518:0x0e67), top: B:2:0x001a, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02d6 A[Catch: all -> 0x011f, TRY_LEAVE, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x001a, B:5:0x0036, B:7:0x003f, B:8:0x0058, B:11:0x0074, B:14:0x00a0, B:16:0x00df, B:19:0x00f8, B:21:0x0102, B:24:0x0728, B:25:0x012f, B:28:0x0145, B:30:0x014b, B:32:0x0151, B:34:0x0164, B:37:0x0171, B:39:0x017c, B:41:0x018a, B:43:0x0190, B:46:0x019d, B:48:0x01ab, B:50:0x01b9, B:53:0x01d9, B:55:0x01df, B:57:0x01ef, B:59:0x01fd, B:61:0x020d, B:63:0x0218, B:68:0x021b, B:70:0x0228, B:72:0x0232, B:73:0x0242, B:75:0x0261, B:77:0x026b, B:79:0x0281, B:80:0x028d, B:83:0x0298, B:84:0x02a2, B:87:0x02ab, B:89:0x02bc, B:93:0x02bf, B:95:0x02d6, B:102:0x04bb, B:103:0x04be, B:105:0x04ca, B:108:0x04db, B:110:0x04ec, B:112:0x04f8, B:113:0x05c3, B:115:0x05d0, B:117:0x05d6, B:119:0x05dc, B:121:0x05ec, B:122:0x05ef, B:123:0x05f4, B:125:0x05fa, B:126:0x0606, B:128:0x060c, B:130:0x061c, B:132:0x0626, B:133:0x063b, B:135:0x0641, B:136:0x065c, B:138:0x0662, B:140:0x0680, B:142:0x068d, B:144:0x06b6, B:145:0x0693, B:147:0x06a1, B:151:0x06be, B:152:0x06d6, B:154:0x06dc, B:157:0x06ef, B:162:0x06fc, B:163:0x0700, B:165:0x0706, B:167:0x0714, B:175:0x051b, B:177:0x052b, B:180:0x053e, B:182:0x0550, B:184:0x055c, B:186:0x0570, B:189:0x057e, B:191:0x0588, B:193:0x0592, B:196:0x059d, B:198:0x05a3, B:202:0x05b3, B:200:0x05be, B:205:0x02fc, B:208:0x0306, B:210:0x0314, B:212:0x0357, B:213:0x032f, B:215:0x033d, B:221:0x035e, B:223:0x0391, B:224:0x03b9, B:226:0x03ee, B:227:0x03f4, B:230:0x0400, B:232:0x0435, B:233:0x0452, B:235:0x0458, B:237:0x0466, B:239:0x047a, B:240:0x046e, B:248:0x0481, B:251:0x0488, B:252:0x04a0, B:259:0x073f, B:261:0x074d, B:263:0x0756, B:265:0x0788, B:266:0x075e, B:268:0x0767, B:270:0x076d, B:272:0x0779, B:274:0x0783, B:281:0x078b, B:282:0x0797, B:285:0x079f, B:288:0x07b1, B:289:0x07bc, B:291:0x07c4, B:292:0x07ec, B:294:0x0808, B:295:0x081d, B:297:0x0839, B:298:0x084e, B:299:0x085c, B:301:0x0862, B:303:0x0872, B:304:0x0879, B:306:0x0885, B:308:0x088c, B:311:0x088f, B:313:0x08d9, B:315:0x08df, B:316:0x090a, B:318:0x0912, B:319:0x091b, B:321:0x0921, B:322:0x0927, B:324:0x093e, B:326:0x0958, B:328:0x096a, B:330:0x0974, B:331:0x0977, B:333:0x09c1, B:334:0x09d4, B:337:0x09dc, B:340:0x09f7, B:342:0x0a10, B:344:0x0a25, B:346:0x0a2a, B:348:0x0a2e, B:350:0x0a32, B:352:0x0a3c, B:353:0x0a45, B:355:0x0a49, B:357:0x0a4f, B:358:0x0a5a, B:359:0x0a68, B:362:0x0c75, B:366:0x0a70, B:430:0x0a8c, B:369:0x0aa9, B:371:0x0acb, B:372:0x0ad3, B:374:0x0ad9, B:378:0x0ae9, B:383:0x0b13, B:384:0x0b36, B:386:0x0b42, B:388:0x0b5a, B:389:0x0b9d, B:394:0x0bb9, B:396:0x0bc4, B:398:0x0bc8, B:400:0x0bcc, B:402:0x0bd0, B:403:0x0bdc, B:404:0x0be1, B:406:0x0be7, B:408:0x0bff, B:409:0x0c04, B:411:0x0c72, B:413:0x0c15, B:415:0x0c1b, B:418:0x0c2f, B:420:0x0c4d, B:421:0x0c54, B:423:0x0c66, B:424:0x0c20, B:428:0x0afd, B:433:0x0a92, B:435:0x0c7f, B:437:0x0c8b, B:438:0x0c91, B:439:0x0c99, B:441:0x0c9f, B:444:0x0cb5, B:446:0x0cc7, B:447:0x0d4a, B:449:0x0d50, B:451:0x0d67, B:454:0x0d72, B:456:0x0d7c, B:458:0x0d9b, B:460:0x0dab, B:461:0x0db0, B:463:0x0dbe, B:464:0x0dc3, B:465:0x0dce, B:467:0x0de0, B:470:0x0de7, B:471:0x0e1c, B:472:0x0def, B:474:0x0dfd, B:475:0x0e03, B:476:0x0e2b, B:478:0x0e3e, B:479:0x0e5e, B:485:0x0e49, B:486:0x0ce1, B:488:0x0ce7, B:490:0x0cf1, B:491:0x0cf8, B:496:0x0d08, B:497:0x0d0f, B:499:0x0d3b, B:500:0x0d42, B:501:0x0d3f, B:502:0x0d0c, B:504:0x0cf5, B:505:0x08ef, B:507:0x08f5, B:509:0x08fb, B:510:0x084b, B:511:0x081a, B:512:0x07ca, B:514:0x07d0, B:518:0x0e67), top: B:2:0x001a, inners: #0, #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzaH(long j, String str) {
        boolean z;
        int i;
        Long l;
        zzic zzicVar;
        zzh zzu;
        Long l2;
        long parseLong;
        int zzn;
        String str2;
        RatelimitedLogger ratelimitedLogger;
        long zzp;
        String str3;
        com.google.android.gms.internal.measurement.zzic zzicVar2;
        int i2;
        int i3;
        zzal zzd;
        zzfx zzfxVar;
        boolean zzk;
        int i4;
        boolean z2;
        boolean z3;
        boolean z4;
        String str4;
        String str5;
        int i5;
        boolean z5;
        com.google.android.gms.internal.measurement.zzhv zzhvVar;
        int i6;
        int i7;
        String str6;
        String str7;
        int i8;
        int i9;
        String str8;
        long zzE;
        String str9;
        zzpg zzpgVar = this;
        String str10 = "1";
        String str11 = "_ai";
        String str12 = "purchase";
        String str13 = "items";
        Long l3 = 1L;
        zzpgVar.zzj().zzb$1();
        try {
            RatelimitedLogger ratelimitedLogger2 = new RatelimitedLogger(zzpgVar);
            zzpgVar.zzj().zzav(str, j, zzpgVar.zzB, ratelimitedLogger2);
            RatelimitedLogger ratelimitedLogger3 = ratelimitedLogger2;
            ArrayList arrayList = (ArrayList) ratelimitedLogger3.timeSource;
            if (arrayList == null || arrayList.isEmpty()) {
                zzj().zzc();
                z = false;
            } else {
                com.google.android.gms.internal.measurement.zzic zzicVar3 = (com.google.android.gms.internal.measurement.zzic) ((zzid) ratelimitedLogger3.log).zzco();
                zzicVar3.zzi$2();
                int i10 = -1;
                int i11 = -1;
                int i12 = 0;
                int i13 = 0;
                boolean z6 = false;
                zzhr zzhrVar = null;
                zzhr zzhrVar2 = null;
                boolean z7 = false;
                while (true) {
                    int size = ((ArrayList) ratelimitedLogger3.timeSource).size();
                    i = i13;
                    l = l3;
                    zzicVar = zzpgVar.zzn;
                    if (i12 >= size) {
                        break;
                    }
                    zzhr zzhrVar3 = (zzhr) ((zzhs) ((ArrayList) ratelimitedLogger3.timeSource).get(i12)).zzco();
                    int i14 = i12;
                    if (zzpgVar.zzh().zzj(((zzid) ratelimitedLogger3.log).zzA(), zzhrVar3.zzk())) {
                        String str14 = str13;
                        zzpgVar.zzaW().zze().zzc("Dropping blocked raw event. appId", zzgu.zzl(((zzid) ratelimitedLogger3.log).zzA()), zzicVar.zzl().zza(zzhrVar3.zzk()));
                        if (!str10.equals(zzpgVar.zzh().zza(((zzid) ratelimitedLogger3.log).zzA(), "measurement.upload.blacklist_internal")) && !str10.equals(zzpgVar.zzh().zza(((zzid) ratelimitedLogger3.log).zzA(), "measurement.upload.blacklist_public")) && !"_err".equals(zzhrVar3.zzk())) {
                            zzpgVar.zzt();
                            zzpp.zzP(zzpgVar.zzK, ((zzid) ratelimitedLogger3.log).zzA(), 11, "_ev", zzhrVar3.zzk(), 0);
                        }
                        str3 = str10;
                        str5 = str12;
                        i13 = i;
                        i8 = i14;
                        str6 = str14;
                        str7 = str11;
                    } else {
                        String str15 = str13;
                        String zzk2 = zzhrVar3.zzk();
                        str3 = str10;
                        if (zzk2.equals(str12) || zzk2.equals("_iap") || zzk2.equals("ecommerce_purchase")) {
                            zzicVar2 = zzicVar3;
                            i2 = i10;
                            i3 = i11;
                        } else {
                            i3 = i11;
                            zzicVar2 = zzicVar3;
                            i2 = i10;
                            if (zzpgVar.zzd().zzp(null, zzfy.zzbf) && zzk2.equals("in_app_purchase")) {
                            }
                            if (zzhrVar3.zzk().equals(zzjm.zza(str11))) {
                                zzhrVar3.zzl(str11);
                                zzpgVar.zzaW().zzk().zza("Renaming ad_impression to _ai");
                                if (Log.isLoggable(zzpgVar.zzaW().zzn(), 5)) {
                                    for (int i15 = 0; i15 < zzhrVar3.zzb(); i15++) {
                                        if ("ad_platform".equals(zzhrVar3.zzc(i15).zzb()) && !zzhrVar3.zzc(i15).zzd().isEmpty() && "admob".equalsIgnoreCase(zzhrVar3.zzc(i15).zzd())) {
                                            zzpgVar.zzaW().zzi.zza("AdMob ad impression logged from app. Potentially duplicative.");
                                        }
                                    }
                                }
                            }
                            zzd = zzpgVar.zzd();
                            zzfxVar = zzfy.zzbf;
                            if (zzd.zzp(null, zzfxVar) && zzhrVar3.zzk().equals("in_app_purchase")) {
                                zzhrVar3.zzl("_iap");
                                zzpgVar.zzaW().zzk().zza("Renaming in_app_purchase to _iap");
                            }
                            zzk = zzpgVar.zzh().zzk(((zzid) ratelimitedLogger3.log).zzA(), zzhrVar3.zzk());
                            if (zzpgVar.zzd().zzp(null, zzfxVar) && "_iap".equals(zzhrVar3.zzk())) {
                                zzk = zzpgVar.zzV(zzhrVar3);
                                String zzA = ((zzid) ratelimitedLogger3.log).zzA();
                                if ("_iap".equals(zzhrVar3.zzk())) {
                                    zzpgVar.zzaK(zzhrVar3, "value", zzA);
                                    zzpgVar.zzaK(zzhrVar3, "price", zzA);
                                }
                                if (!"_iap".equals(zzhrVar3.zzk())) {
                                    ArrayList arrayList2 = new ArrayList(zzhrVar3.zza());
                                    int i16 = 0;
                                    while (true) {
                                        if (i16 >= arrayList2.size()) {
                                            com.google.android.gms.internal.measurement.zzhv zzn2 = com.google.android.gms.internal.measurement.zzhw.zzn();
                                            zzn2.zzb$3("quantity");
                                            zzn2.zzf(1L);
                                            zzhrVar3.zzf((com.google.android.gms.internal.measurement.zzhw) zzn2.zzbd());
                                            break;
                                        }
                                        if ("quantity".equals(((com.google.android.gms.internal.measurement.zzhw) arrayList2.get(i16)).zzb())) {
                                            break;
                                        }
                                        i16++;
                                    }
                                }
                            }
                            if (!zzk) {
                                zzpgVar.zzp();
                                String zzk3 = zzhrVar3.zzk();
                                zzae.checkNotEmpty(zzk3);
                                if (zzk3.hashCode() != 95027 || !zzk3.equals("_ui")) {
                                    str4 = str11;
                                    str5 = str12;
                                    z4 = false;
                                    if (z4) {
                                        zzpgVar.zzV(zzhrVar3);
                                    }
                                    if ("_e".equals(zzhrVar3.zzk())) {
                                        zzicVar3 = zzicVar2;
                                        i6 = i2;
                                        if ("_vs".equals(zzhrVar3.zzk())) {
                                            zzpgVar.zzp();
                                            if (zzpk.zzI((zzhs) zzhrVar3.zzbd(), "_et") == null) {
                                                if (zzhrVar != null && Math.abs(zzhrVar.zzn() - zzhrVar3.zzn()) <= 1000) {
                                                    zzhr zzhrVar4 = (zzhr) zzhrVar.clone();
                                                    if (zzpgVar.zzaJ(zzhrVar4, zzhrVar3)) {
                                                        i7 = i3;
                                                        zzicVar3.zzf(i7, zzhrVar4);
                                                        i10 = i6;
                                                        zzhrVar = null;
                                                        zzhrVar2 = null;
                                                    }
                                                }
                                                i11 = i3;
                                                zzhrVar2 = zzhrVar3;
                                                i10 = i;
                                                if (zzpgVar.zzd().zzp(null, zzfy.zzbe)) {
                                                }
                                                if (zzhrVar3.zzb() != 0) {
                                                }
                                                i8 = i14;
                                                ((ArrayList) ratelimitedLogger3.timeSource).set(i8, (zzhs) zzhrVar3.zzbd());
                                                zzicVar3.zzg(zzhrVar3);
                                                i13 = i + 1;
                                            }
                                            i7 = i3;
                                            i10 = i6;
                                        } else {
                                            i7 = i3;
                                            if (("_f".equals(zzhrVar3.zzk()) || "_v".equals(zzhrVar3.zzk())) && ("_f".equals(zzhrVar3.zzk()) || "_v".equals(zzhrVar3.zzk()))) {
                                                int i17 = 0;
                                                while (true) {
                                                    if (i17 >= zzhrVar3.zzb()) {
                                                        break;
                                                    }
                                                    com.google.android.gms.internal.measurement.zzhw zzc = zzhrVar3.zzc(i17);
                                                    if ("_elt".equals(zzc.zzb())) {
                                                        zzhrVar3.zzr(zzc.zzf());
                                                        zzhrVar3.zzj$1(i17);
                                                        break;
                                                    }
                                                    i17++;
                                                }
                                            }
                                            i10 = i6;
                                        }
                                    } else {
                                        zzpgVar.zzp();
                                        if (zzpk.zzI((zzhs) zzhrVar3.zzbd(), "_fr") == null) {
                                            if (zzhrVar2 != null && Math.abs(zzhrVar2.zzn() - zzhrVar3.zzn()) <= 1000) {
                                                zzhr zzhrVar5 = (zzhr) zzhrVar2.clone();
                                                if (zzpgVar.zzaJ(zzhrVar3, zzhrVar5)) {
                                                    zzicVar3 = zzicVar2;
                                                    int i18 = i2;
                                                    zzicVar3.zzf(i18, zzhrVar5);
                                                    i10 = i18;
                                                    i11 = i3;
                                                    zzhrVar = null;
                                                    zzhrVar2 = null;
                                                    if (zzpgVar.zzd().zzp(null, zzfy.zzbe) && zzhrVar3.zzu() && !zzhrVar3.zzs()) {
                                                        zzE = zzpgVar.zzp().zzE(zzhrVar3.zzv());
                                                        if (zzE != 0) {
                                                            zzhrVar3.zzt(zzE);
                                                        }
                                                        zzhrVar3.zzw(0L);
                                                    }
                                                    if (zzhrVar3.zzb() != 0) {
                                                        zzpgVar.zzp();
                                                        Bundle zzH = zzpk.zzH(zzhrVar3.zza());
                                                        int i19 = 0;
                                                        while (i19 < zzhrVar3.zzb()) {
                                                            com.google.android.gms.internal.measurement.zzhw zzc2 = zzhrVar3.zzc(i19);
                                                            String str16 = str15;
                                                            if (!zzc2.zzb().equals(str16) || zzc2.zzl().isEmpty()) {
                                                                i9 = i19;
                                                                str8 = str4;
                                                                if (!zzc2.zzb().equals(str16)) {
                                                                    zzpgVar.zzU(zzhrVar3.zzk(), (com.google.android.gms.internal.measurement.zzhv) zzc2.zzco(), zzH, ((zzid) ratelimitedLogger3.log).zzA());
                                                                }
                                                            } else {
                                                                String zzA2 = ((zzid) ratelimitedLogger3.log).zzA();
                                                                zzaef zzl = zzc2.zzl();
                                                                Bundle[] bundleArr = new Bundle[zzl.size()];
                                                                i9 = i19;
                                                                int i20 = 0;
                                                                while (i20 < zzl.size()) {
                                                                    com.google.android.gms.internal.measurement.zzhw zzhwVar = (com.google.android.gms.internal.measurement.zzhw) zzl.get(i20);
                                                                    zzpgVar.zzp();
                                                                    Bundle zzH2 = zzpk.zzH(zzhwVar.zzl());
                                                                    Iterator it = zzhwVar.zzl().iterator();
                                                                    while (it.hasNext()) {
                                                                        zzpgVar.zzU(zzhrVar3.zzk(), (com.google.android.gms.internal.measurement.zzhv) ((com.google.android.gms.internal.measurement.zzhw) it.next()).zzco(), zzH2, zzA2);
                                                                        zzl = zzl;
                                                                        str4 = str4;
                                                                    }
                                                                    bundleArr[i20] = zzH2;
                                                                    i20++;
                                                                    zzl = zzl;
                                                                    str4 = str4;
                                                                }
                                                                str8 = str4;
                                                                zzH.putParcelableArray(str16, bundleArr);
                                                            }
                                                            i19 = i9 + 1;
                                                            str4 = str8;
                                                            str15 = str16;
                                                        }
                                                        str6 = str15;
                                                        str7 = str4;
                                                        zzhrVar3.zzi();
                                                        zzpk zzp2 = zzpgVar.zzp();
                                                        ArrayList arrayList3 = new ArrayList();
                                                        for (String str17 : zzH.keySet()) {
                                                            com.google.android.gms.internal.measurement.zzhv zzn3 = com.google.android.gms.internal.measurement.zzhw.zzn();
                                                            zzn3.zzb$3(str17);
                                                            Object obj = zzH.get(str17);
                                                            if (obj != null) {
                                                                zzp2.zzd(zzn3, obj);
                                                                arrayList3.add((com.google.android.gms.internal.measurement.zzhw) zzn3.zzbd());
                                                            }
                                                        }
                                                        Iterator it2 = arrayList3.iterator();
                                                        while (it2.hasNext()) {
                                                            zzhrVar3.zzf((com.google.android.gms.internal.measurement.zzhw) it2.next());
                                                        }
                                                    } else {
                                                        str6 = str15;
                                                        str7 = str4;
                                                    }
                                                    i8 = i14;
                                                    ((ArrayList) ratelimitedLogger3.timeSource).set(i8, (zzhs) zzhrVar3.zzbd());
                                                    zzicVar3.zzg(zzhrVar3);
                                                    i13 = i + 1;
                                                }
                                            }
                                            zzicVar3 = zzicVar2;
                                            zzhrVar = zzhrVar3;
                                            i10 = i2;
                                            i11 = i;
                                            if (zzpgVar.zzd().zzp(null, zzfy.zzbe)) {
                                                zzE = zzpgVar.zzp().zzE(zzhrVar3.zzv());
                                                if (zzE != 0) {
                                                }
                                                zzhrVar3.zzw(0L);
                                            }
                                            if (zzhrVar3.zzb() != 0) {
                                            }
                                            i8 = i14;
                                            ((ArrayList) ratelimitedLogger3.timeSource).set(i8, (zzhs) zzhrVar3.zzbd());
                                            zzicVar3.zzg(zzhrVar3);
                                            i13 = i + 1;
                                        } else {
                                            zzicVar3 = zzicVar2;
                                            i6 = i2;
                                            i7 = i3;
                                            i10 = i6;
                                        }
                                    }
                                    i11 = i7;
                                    if (zzpgVar.zzd().zzp(null, zzfy.zzbe)) {
                                    }
                                    if (zzhrVar3.zzb() != 0) {
                                    }
                                    i8 = i14;
                                    ((ArrayList) ratelimitedLogger3.timeSource).set(i8, (zzhs) zzhrVar3.zzbd());
                                    zzicVar3.zzg(zzhrVar3);
                                    i13 = i + 1;
                                }
                            }
                            z2 = false;
                            z3 = false;
                            for (i4 = 0; i4 < zzhrVar3.zzb(); i4++) {
                                if ("_c".equals(zzhrVar3.zzc(i4).zzb())) {
                                    com.google.android.gms.internal.measurement.zzhv zzhvVar2 = (com.google.android.gms.internal.measurement.zzhv) zzhrVar3.zzc(i4).zzco();
                                    zzhvVar2.zzf(1L);
                                    zzhrVar3.zzd(i4, (com.google.android.gms.internal.measurement.zzhw) zzhvVar2.zzbd());
                                    z2 = true;
                                } else if ("_r".equals(zzhrVar3.zzc(i4).zzb())) {
                                    com.google.android.gms.internal.measurement.zzhv zzhvVar3 = (com.google.android.gms.internal.measurement.zzhv) zzhrVar3.zzc(i4).zzco();
                                    zzhvVar3.zzf(1L);
                                    zzhrVar3.zzd(i4, (com.google.android.gms.internal.measurement.zzhw) zzhvVar3.zzbd());
                                    z3 = true;
                                }
                            }
                            if (z2 && zzk) {
                                z4 = zzk;
                                zzpgVar.zzaW().zzk().zzb(zzicVar.zzl().zza(zzhrVar3.zzk()), "Marking event as conversion");
                                com.google.android.gms.internal.measurement.zzhv zzn4 = com.google.android.gms.internal.measurement.zzhw.zzn();
                                zzn4.zzb$3("_c");
                                str4 = str11;
                                str5 = str12;
                                zzn4.zzf(1L);
                                zzhrVar3.zzg(zzn4);
                            } else {
                                z4 = zzk;
                                str4 = str11;
                                str5 = str12;
                            }
                            if (!z3) {
                                zzpgVar.zzaW().zzk().zzb(zzicVar.zzl().zza(zzhrVar3.zzk()), "Marking event as real-time");
                                com.google.android.gms.internal.measurement.zzhv zzn5 = com.google.android.gms.internal.measurement.zzhw.zzn();
                                zzn5.zzb$3("_r");
                                zzn5.zzf(1L);
                                zzhrVar3.zzg(zzn5);
                            }
                            if (zzpgVar.zzj().zzw(zzpgVar.zzC(), ((zzid) ratelimitedLogger3.log).zzA(), false, true, false, false).zze > zzpgVar.zzd().zzm(((zzid) ratelimitedLogger3.log).zzA(), zzfy.zzo)) {
                                zzaC(zzhrVar3, "_r");
                            } else {
                                z7 = true;
                            }
                            if (zzpp.zzh(zzhrVar3.zzk()) && z4 && zzpgVar.zzj().zzw(zzpgVar.zzC(), ((zzid) ratelimitedLogger3.log).zzA(), true, false, false, false).zzc > zzpgVar.zzd().zzm(((zzid) ratelimitedLogger3.log).zzA(), zzfy.zzn)) {
                                zzpgVar.zzaW().zze().zzb(zzgu.zzl(((zzid) ratelimitedLogger3.log).zzA()), "Too many conversions. Not logging as conversion. appId");
                                z5 = false;
                                zzhvVar = null;
                                int i21 = -1;
                                for (i5 = 0; i5 < zzhrVar3.zzb(); i5++) {
                                    com.google.android.gms.internal.measurement.zzhw zzc3 = zzhrVar3.zzc(i5);
                                    if ("_c".equals(zzc3.zzb())) {
                                        zzhvVar = (com.google.android.gms.internal.measurement.zzhv) zzc3.zzco();
                                        i21 = i5;
                                    } else if ("_err".equals(zzc3.zzb())) {
                                        z5 = true;
                                    }
                                }
                                if (z5) {
                                    if (zzhvVar != null) {
                                        zzhrVar3.zzj$1(i21);
                                    } else {
                                        zzhvVar = null;
                                    }
                                }
                                if (zzhvVar == null) {
                                    com.google.android.gms.internal.measurement.zzhv zzhvVar4 = (com.google.android.gms.internal.measurement.zzhv) zzhvVar.clone();
                                    zzhvVar4.zzb$3("_err");
                                    zzhvVar4.zzf(10L);
                                    zzhrVar3.zzd(i21, (com.google.android.gms.internal.measurement.zzhw) zzhvVar4.zzbd());
                                } else {
                                    zzpgVar.zzaW().zzb().zzb(zzgu.zzl(((zzid) ratelimitedLogger3.log).zzA()), "Did not find conversion parameter. appId");
                                }
                            }
                            if (z4) {
                            }
                            if ("_e".equals(zzhrVar3.zzk())) {
                            }
                            i11 = i7;
                            if (zzpgVar.zzd().zzp(null, zzfy.zzbe)) {
                            }
                            if (zzhrVar3.zzb() != 0) {
                            }
                            i8 = i14;
                            ((ArrayList) ratelimitedLogger3.timeSource).set(i8, (zzhs) zzhrVar3.zzbd());
                            zzicVar3.zzg(zzhrVar3);
                            i13 = i + 1;
                        }
                        com.google.android.gms.internal.measurement.zzhv zzn6 = com.google.android.gms.internal.measurement.zzhw.zzn();
                        zzn6.zzb$3("_ct");
                        if (!z6) {
                            String zzA3 = ((zzid) ratelimitedLogger3.log).zzA();
                            if (zzpgVar.zzaQ(zzA3, str12) && zzpgVar.zzaQ(zzA3, "_iap") && zzpgVar.zzaQ(zzA3, "ecommerce_purchase")) {
                                str9 = "new";
                                zzn6.zzd$1(str9);
                                zzhrVar3.zzf((com.google.android.gms.internal.measurement.zzhw) zzn6.zzbd());
                                z6 = true;
                                if (zzhrVar3.zzk().equals(zzjm.zza(str11))) {
                                }
                                zzd = zzpgVar.zzd();
                                zzfxVar = zzfy.zzbf;
                                if (zzd.zzp(null, zzfxVar)) {
                                    zzhrVar3.zzl("_iap");
                                    zzpgVar.zzaW().zzk().zza("Renaming in_app_purchase to _iap");
                                }
                                zzk = zzpgVar.zzh().zzk(((zzid) ratelimitedLogger3.log).zzA(), zzhrVar3.zzk());
                                if (zzpgVar.zzd().zzp(null, zzfxVar)) {
                                    zzk = zzpgVar.zzV(zzhrVar3);
                                    String zzA4 = ((zzid) ratelimitedLogger3.log).zzA();
                                    if ("_iap".equals(zzhrVar3.zzk())) {
                                    }
                                    if (!"_iap".equals(zzhrVar3.zzk())) {
                                    }
                                }
                                if (!zzk) {
                                }
                                z2 = false;
                                z3 = false;
                                while (i4 < zzhrVar3.zzb()) {
                                }
                                if (z2) {
                                }
                                z4 = zzk;
                                str4 = str11;
                                str5 = str12;
                                if (!z3) {
                                }
                                if (zzpgVar.zzj().zzw(zzpgVar.zzC(), ((zzid) ratelimitedLogger3.log).zzA(), false, true, false, false).zze > zzpgVar.zzd().zzm(((zzid) ratelimitedLogger3.log).zzA(), zzfy.zzo)) {
                                }
                                if (zzpp.zzh(zzhrVar3.zzk())) {
                                    zzpgVar.zzaW().zze().zzb(zzgu.zzl(((zzid) ratelimitedLogger3.log).zzA()), "Too many conversions. Not logging as conversion. appId");
                                    z5 = false;
                                    zzhvVar = null;
                                    int i212 = -1;
                                    while (i5 < zzhrVar3.zzb()) {
                                    }
                                    if (z5) {
                                    }
                                    if (zzhvVar == null) {
                                    }
                                }
                                if (z4) {
                                }
                                if ("_e".equals(zzhrVar3.zzk())) {
                                }
                                i11 = i7;
                                if (zzpgVar.zzd().zzp(null, zzfy.zzbe)) {
                                }
                                if (zzhrVar3.zzb() != 0) {
                                }
                                i8 = i14;
                                ((ArrayList) ratelimitedLogger3.timeSource).set(i8, (zzhs) zzhrVar3.zzbd());
                                zzicVar3.zzg(zzhrVar3);
                                i13 = i + 1;
                            }
                        }
                        str9 = "returning";
                        zzn6.zzd$1(str9);
                        zzhrVar3.zzf((com.google.android.gms.internal.measurement.zzhw) zzn6.zzbd());
                        z6 = true;
                        if (zzhrVar3.zzk().equals(zzjm.zza(str11))) {
                        }
                        zzd = zzpgVar.zzd();
                        zzfxVar = zzfy.zzbf;
                        if (zzd.zzp(null, zzfxVar)) {
                        }
                        zzk = zzpgVar.zzh().zzk(((zzid) ratelimitedLogger3.log).zzA(), zzhrVar3.zzk());
                        if (zzpgVar.zzd().zzp(null, zzfxVar)) {
                        }
                        if (!zzk) {
                        }
                        z2 = false;
                        z3 = false;
                        while (i4 < zzhrVar3.zzb()) {
                        }
                        if (z2) {
                        }
                        z4 = zzk;
                        str4 = str11;
                        str5 = str12;
                        if (!z3) {
                        }
                        if (zzpgVar.zzj().zzw(zzpgVar.zzC(), ((zzid) ratelimitedLogger3.log).zzA(), false, true, false, false).zze > zzpgVar.zzd().zzm(((zzid) ratelimitedLogger3.log).zzA(), zzfy.zzo)) {
                        }
                        if (zzpp.zzh(zzhrVar3.zzk())) {
                        }
                        if (z4) {
                        }
                        if ("_e".equals(zzhrVar3.zzk())) {
                        }
                        i11 = i7;
                        if (zzpgVar.zzd().zzp(null, zzfy.zzbe)) {
                        }
                        if (zzhrVar3.zzb() != 0) {
                        }
                        i8 = i14;
                        ((ArrayList) ratelimitedLogger3.timeSource).set(i8, (zzhs) zzhrVar3.zzbd());
                        zzicVar3.zzg(zzhrVar3);
                        i13 = i + 1;
                    }
                    i12 = i8 + 1;
                    str12 = str5;
                    str13 = str6;
                    l3 = l;
                    str11 = str7;
                    str10 = str3;
                }
                int i22 = i;
                int i23 = 0;
                long j2 = 0;
                while (i23 < i22) {
                    zzhs zzd2 = zzicVar3.zzd(i23);
                    if ("_e".equals(zzd2.zzd())) {
                        zzpgVar.zzp();
                        if (zzpk.zzI(zzd2, "_fr") != null) {
                            zzicVar3.zzj$2(i23);
                            i22--;
                            i23--;
                            i23++;
                        }
                    }
                    zzpgVar.zzp();
                    com.google.android.gms.internal.measurement.zzhw zzI = zzpk.zzI(zzd2, "_et");
                    if (zzI != null) {
                        Long valueOf = zzI.zze() ? Long.valueOf(zzI.zzf()) : null;
                        if (valueOf != null && valueOf.longValue() > 0) {
                            j2 += valueOf.longValue();
                        }
                    }
                    i23++;
                }
                zzpgVar.zzaI(zzicVar3, j2, false);
                Iterator it3 = zzicVar3.zzb().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    if ("_s".equals(((zzhs) it3.next()).zzd())) {
                        zzpgVar.zzj().zzk(zzicVar3.zzK(), "_se");
                        break;
                    }
                }
                if (zzpk.zzx(zzicVar3, "_sid") >= 0) {
                    zzpgVar.zzaI(zzicVar3, j2, true);
                } else {
                    int zzx = zzpk.zzx(zzicVar3, "_se");
                    if (zzx >= 0) {
                        zzicVar3.zzr(zzx);
                        zzpgVar.zzaW().zzb().zzb(zzgu.zzl(((zzid) ratelimitedLogger3.log).zzA()), "Session engagement user property is in the bundle without session ID. appId");
                    }
                }
                String zzA5 = ((zzid) ratelimitedLogger3.log).zzA();
                zzpgVar.zzaX().zzg();
                zzpgVar.zzu$3();
                zzh zzu2 = zzpgVar.zzj().zzu(zzA5);
                if (zzu2 == null) {
                    zzpgVar.zzaW().zzb().zzb(zzgu.zzl(zzA5), "Cannot fix consent fields without appInfo. appId");
                } else {
                    zzpgVar.zzI(zzu2, zzicVar3);
                }
                String zzA6 = ((zzid) ratelimitedLogger3.log).zzA();
                zzpgVar.zzaX().zzg();
                zzpgVar.zzu$3();
                zzh zzu3 = zzpgVar.zzj().zzu(zzA6);
                if (zzu3 == null) {
                    zzpgVar.zzaW().zze().zzb(zzgu.zzl(zzA6), "Cannot populate ad_campaign_info without appInfo. appId");
                } else {
                    zzpgVar.zzJ(zzu3, zzicVar3);
                }
                zzicVar3.zzv(Long.MAX_VALUE);
                zzicVar3.zzx$1(Long.MIN_VALUE);
                for (int i24 = 0; i24 < zzicVar3.zzc$1(); i24++) {
                    zzhs zzd3 = zzicVar3.zzd(i24);
                    if (zzd3.zzf() < zzicVar3.zzu()) {
                        zzicVar3.zzv(zzd3.zzf());
                    }
                    if (zzd3.zzf() > zzicVar3.zzw()) {
                        zzicVar3.zzx$1(zzd3.zzf());
                    }
                }
                zzicVar3.zzak();
                zzjl zzjlVar = zzjl.zza;
                zzjl zzs = zzpgVar.zzB(((zzid) ratelimitedLogger3.log).zzA()).zzs(zzjl.zzf(100, ((zzid) ratelimitedLogger3.log).zzaf()));
                zzjl zzaf = zzpgVar.zzj().zzaf(((zzid) ratelimitedLogger3.log).zzA());
                zzpgVar.zzj().zzae(((zzid) ratelimitedLogger3.log).zzA(), zzs);
                zzjk zzjkVar = zzjk.ANALYTICS_STORAGE;
                if (!zzs.zzo(zzjkVar) && zzaf.zzo(zzjkVar)) {
                    zzpgVar.zzj().zzi(((zzid) ratelimitedLogger3.log).zzA());
                } else if (zzs.zzo(zzjkVar) && !zzaf.zzo(zzjkVar)) {
                    zzpgVar.zzj().zzj(((zzid) ratelimitedLogger3.log).zzA());
                }
                zzjk zzjkVar2 = zzjk.AD_STORAGE;
                if (!zzs.zzo(zzjkVar2)) {
                    zzicVar3.zzR();
                    zzicVar3.zzU();
                    zzicVar3.zzan();
                }
                if (!zzs.zzo(zzjkVar)) {
                    zzicVar3.zzX();
                    zzicVar3.zzav();
                }
                zzaif.zza();
                if (zzpgVar.zzd().zzp(((zzid) ratelimitedLogger3.log).zzA(), zzfy.zzaO)) {
                    zzpgVar.zzt();
                    if (zzpp.zzaE((String) zzfy.zzaq.zzb(null), ((zzid) ratelimitedLogger3.log).zzA()) && zzpgVar.zzB(((zzid) ratelimitedLogger3.log).zzA()).zzo(zzjkVar2) && ((zzid) ratelimitedLogger3.log).zzak()) {
                        zzpgVar.zzT(zzicVar3, ratelimitedLogger3);
                    }
                }
                zzicVar3.zzag();
                zzicVar3.zzaf(zzpgVar.zzm().zzb(zzicVar3.zzK(), zzicVar3.zzb(), zzicVar3.zzk(), Long.valueOf(zzicVar3.zzu()), Long.valueOf(zzicVar3.zzw()), !zzs.zzo(zzjkVar)));
                if (zzpgVar.zzd().zzD(((zzid) ratelimitedLogger3.log).zzA())) {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList4 = new ArrayList();
                    SecureRandom zzf = zzpgVar.zzt().zzf();
                    int i25 = 0;
                    while (i25 < zzicVar3.zzc$1()) {
                        zzhr zzhrVar6 = (zzhr) zzicVar3.zzd(i25).zzco();
                        if (zzhrVar6.zzk().equals("_ep")) {
                            zzpgVar.zzp();
                            String str18 = (String) zzpk.zzM((zzhs) zzhrVar6.zzbd(), "_en");
                            zzbd zzbdVar = (zzbd) hashMap.get(str18);
                            if (zzbdVar == null) {
                                zzaw zzj = zzpgVar.zzj();
                                String zzA7 = ((zzid) ratelimitedLogger3.log).zzA();
                                zzae.checkNotNull(str18);
                                zzbdVar = zzj.zzaE("events", zzA7, str18);
                                if (zzbdVar != null) {
                                    hashMap.put(str18, zzbdVar);
                                }
                            }
                            if (zzbdVar == null || zzbdVar.zzi != null) {
                                l2 = l;
                            } else {
                                Long l4 = zzbdVar.zzj;
                                if (l4 != null && l4.longValue() > 1) {
                                    zzpgVar.zzp();
                                    zzpk.zzF(zzhrVar6, "_sr", l4);
                                }
                                Boolean bool = zzbdVar.zzk;
                                if (bool == null || !bool.booleanValue()) {
                                    l2 = l;
                                } else {
                                    zzpgVar.zzp();
                                    l2 = l;
                                    zzpk.zzF(zzhrVar6, "_efs", l2);
                                }
                                arrayList4.add((zzhs) zzhrVar6.zzbd());
                            }
                            zzicVar3.zzf(i25, zzhrVar6);
                        } else {
                            l2 = l;
                            zzht zzh = zzpgVar.zzh();
                            String zzA8 = ((zzid) ratelimitedLogger3.log).zzA();
                            String zza = zzh.zza(zzA8, "measurement.account.time_zone_offset_minutes");
                            if (!TextUtils.isEmpty(zza)) {
                                try {
                                    parseLong = Long.parseLong(zza);
                                } catch (NumberFormatException e) {
                                    ((zzic) zzh.$$delegate_0).zzaW().zze().zzc("Unable to parse timezone offset. appId", zzgu.zzl(zzA8), e);
                                }
                                zzpgVar.zzt();
                                long j3 = parseLong * 60000;
                                long zzn7 = (zzhrVar6.zzn() + j3) / 86400000;
                                zzhs zzhsVar = (zzhs) zzhrVar6.zzbd();
                                if (!TextUtils.isEmpty("_dbg")) {
                                    Iterator it4 = zzhsVar.zza().iterator();
                                    while (true) {
                                        if (!it4.hasNext()) {
                                            break;
                                        }
                                        com.google.android.gms.internal.measurement.zzhw zzhwVar2 = (com.google.android.gms.internal.measurement.zzhw) it4.next();
                                        if ("_dbg".equals(zzhwVar2.zzb())) {
                                            if (l2.equals(Long.valueOf(zzhwVar2.zzf()))) {
                                                zzn = 1;
                                            }
                                        }
                                    }
                                }
                                zzn = zzh().zzn(((zzid) ratelimitedLogger3.log).zzA(), zzhrVar6.zzk());
                                if (zzn > 0) {
                                    zzaW().zze().zzc("Sample rate must be positive. event, rate", zzhrVar6.zzk(), Integer.valueOf(zzn));
                                    arrayList4.add((zzhs) zzhrVar6.zzbd());
                                    zzicVar3.zzf(i25, zzhrVar6);
                                } else {
                                    zzbd zzbdVar2 = (zzbd) hashMap.get(zzhrVar6.zzk());
                                    if (zzbdVar2 == null) {
                                        str2 = "_efs";
                                        zzbdVar2 = zzj().zzaE("events", ((zzid) ratelimitedLogger3.log).zzA(), zzhrVar6.zzk());
                                        if (zzbdVar2 == null) {
                                            zzaW().zze().zzc("Event being bundled has no eventAggregate. appId, eventName", ((zzid) ratelimitedLogger3.log).zzA(), zzhrVar6.zzk());
                                            zzbdVar2 = new zzbd(((zzid) ratelimitedLogger3.log).zzA(), zzhrVar6.zzk(), 1L, 1L, 1L, zzhrVar6.zzn(), 0L, null, null, null, null);
                                        }
                                    } else {
                                        str2 = "_efs";
                                    }
                                    zzp();
                                    Long l5 = (Long) zzpk.zzM((zzhs) zzhrVar6.zzbd(), "_eid");
                                    boolean z8 = l5 != null;
                                    if (zzn == 1) {
                                        arrayList4.add((zzhs) zzhrVar6.zzbd());
                                        if (z8 && (zzbdVar2.zzi != null || zzbdVar2.zzj != null || zzbdVar2.zzk != null)) {
                                            hashMap.put(zzhrVar6.zzk(), zzbdVar2.zzc(null, null, null));
                                        }
                                        zzicVar3.zzf(i25, zzhrVar6);
                                    } else {
                                        if (zzf.nextInt(zzn) == 0) {
                                            zzp();
                                            ratelimitedLogger = ratelimitedLogger3;
                                            Long valueOf2 = Long.valueOf(zzn);
                                            zzpk.zzF(zzhrVar6, "_sr", valueOf2);
                                            arrayList4.add((zzhs) zzhrVar6.zzbd());
                                            if (z8) {
                                                zzbdVar2 = zzbdVar2.zzc(null, valueOf2, null);
                                            }
                                            hashMap.put(zzhrVar6.zzk(), zzbdVar2.zzb(zzhrVar6.zzn(), zzn7));
                                        } else {
                                            ratelimitedLogger = ratelimitedLogger3;
                                            Long l6 = zzbdVar2.zzh;
                                            if (l6 != null) {
                                                zzp = l6.longValue();
                                            } else {
                                                zzt();
                                                zzp = (j3 + zzhrVar6.zzp()) / 86400000;
                                            }
                                            if (zzp != zzn7) {
                                                zzp();
                                                zzpk.zzF(zzhrVar6, str2, l2);
                                                zzp();
                                                Long valueOf3 = Long.valueOf(zzn);
                                                zzpk.zzF(zzhrVar6, "_sr", valueOf3);
                                                arrayList4.add((zzhs) zzhrVar6.zzbd());
                                                if (z8) {
                                                    zzbdVar2 = zzbdVar2.zzc(null, valueOf3, Boolean.TRUE);
                                                }
                                                hashMap.put(zzhrVar6.zzk(), zzbdVar2.zzb(zzhrVar6.zzn(), zzn7));
                                            } else if (z8) {
                                                hashMap.put(zzhrVar6.zzk(), zzbdVar2.zzc(l5, null, null));
                                                zzicVar3.zzf(i25, zzhrVar6);
                                                i25++;
                                                zzpgVar = this;
                                                l = l2;
                                                ratelimitedLogger3 = ratelimitedLogger;
                                            }
                                        }
                                        zzicVar3.zzf(i25, zzhrVar6);
                                        i25++;
                                        zzpgVar = this;
                                        l = l2;
                                        ratelimitedLogger3 = ratelimitedLogger;
                                    }
                                }
                            }
                            parseLong = 0;
                            zzpgVar.zzt();
                            long j32 = parseLong * 60000;
                            long zzn72 = (zzhrVar6.zzn() + j32) / 86400000;
                            zzhs zzhsVar2 = (zzhs) zzhrVar6.zzbd();
                            if (!TextUtils.isEmpty("_dbg")) {
                            }
                            zzn = zzh().zzn(((zzid) ratelimitedLogger3.log).zzA(), zzhrVar6.zzk());
                            if (zzn > 0) {
                            }
                        }
                        ratelimitedLogger = ratelimitedLogger3;
                        i25++;
                        zzpgVar = this;
                        l = l2;
                        ratelimitedLogger3 = ratelimitedLogger;
                    }
                    RatelimitedLogger ratelimitedLogger4 = ratelimitedLogger3;
                    if (arrayList4.size() < zzicVar3.zzc$1()) {
                        zzicVar3.zzi$2();
                        zzicVar3.zzh(arrayList4);
                    }
                    Iterator it5 = hashMap.entrySet().iterator();
                    while (it5.hasNext()) {
                        zzj().zzaF("events", (zzbd) ((Map.Entry) it5.next()).getValue());
                    }
                    ratelimitedLogger3 = ratelimitedLogger4;
                }
                String zzA9 = ((zzid) ratelimitedLogger3.log).zzA();
                zzh zzu4 = zzj().zzu(zzA9);
                if (zzu4 == null) {
                    zzaW().zzb().zzb(zzgu.zzl(((zzid) ratelimitedLogger3.log).zzA()), "Bundling raw events w/o app info. appId");
                } else if (zzicVar3.zzc$1() > 0) {
                    long zzp3 = zzu4.zzp();
                    if (zzp3 != 0) {
                        zzicVar3.zzA$1(zzp3);
                    } else {
                        zzicVar3.zzB();
                    }
                    long zzn8 = zzu4.zzn();
                    if (zzn8 != 0) {
                        zzp3 = zzn8;
                    }
                    if (zzp3 != 0) {
                        zzicVar3.zzy$1(zzp3);
                    } else {
                        zzicVar3.zzz$1();
                    }
                    zzu4.zzM(zzicVar3.zzc$1());
                    zzicVar3.zzaJ((int) zzu4.zzaF());
                    zzicVar3.zzZ((int) zzu4.zzG());
                    zzu4.zzo(zzicVar3.zzu());
                    zzu4.zzq(zzicVar3.zzw());
                    String zzaa = zzu4.zzaa();
                    if (zzaa != null) {
                        zzicVar3.zzaa(zzaa);
                    } else {
                        zzicVar3.zzab();
                    }
                    zzj().zzv(zzu4, false);
                }
                if (zzicVar3.zzc$1() > 0) {
                    zzicVar.getClass();
                    if (zzd().zzp(((zzid) ratelimitedLogger3.log).zzA(), zzfy.zzbj)) {
                        String zzK = zzicVar3.zzK();
                        if (!TextUtils.isEmpty(zzK) && (zzu = zzj().zzu(zzK)) != null) {
                            zzba().getClass();
                            long currentTimeMillis = System.currentTimeMillis();
                            if (currentTimeMillis - zzu.zzaN() >= zzd().zzl(zzK, zzfy.zzaB)) {
                                List zzac = zzj().zzac("");
                                if (!zzac.isEmpty()) {
                                    zzicVar3.zzaR(zzac);
                                }
                                List zzac2 = zzj().zzac(zzK);
                                if (!zzac2.isEmpty()) {
                                    zzicVar3.zzaR(zzac2);
                                }
                                zzu.zzaM(currentTimeMillis);
                                zzj().zzv(zzu, false);
                            }
                        }
                    }
                    com.google.android.gms.internal.measurement.zzgl zzb2 = zzh().zzb(((zzid) ratelimitedLogger3.log).zzA());
                    if (zzb2 != null && zzb2.zza()) {
                        zzicVar3.zzal(zzb2.zzb());
                        zzj().zzz((zzid) zzicVar3.zzbd(), z7);
                    }
                    if (((zzid) ratelimitedLogger3.log).zzP().isEmpty()) {
                        zzicVar3.zzal(-1L);
                    } else {
                        zzaW().zze().zzb(zzgu.zzl(((zzid) ratelimitedLogger3.log).zzA()), "Did not find measurement config or missing version info. appId");
                    }
                    zzj().zzz((zzid) zzicVar3.zzbd(), z7);
                }
                zzj().zzS((ArrayList) ratelimitedLogger3.noLogMessage);
                zzaw zzj2 = zzj();
                try {
                    zzj2.zze().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{zzA9, zzA9});
                } catch (SQLiteException e2) {
                    ((zzic) zzj2.$$delegate_0).zzaW().zzb().zzc("Failed to remove unused event metadata. appId", zzgu.zzl(zzA9), e2);
                }
                zzj().zzc();
                z = true;
            }
            zzj().zzd();
            return z;
        } catch (Throwable th) {
            zzj().zzd();
            throw th;
        }
    }

    public final void zzaI(com.google.android.gms.internal.measurement.zzic zzicVar, long j, boolean z) {
        zzpn zzpnVar;
        Object obj;
        String str = true != z ? "_lte" : "_se";
        zzaw zzawVar = this.zze;
        zzaT(zzawVar);
        zzpn zzm = zzawVar.zzm(zzicVar.zzK(), str);
        if (zzm == null || (obj = zzm.zze) == null) {
            String zzK = zzicVar.zzK();
            zzba().getClass();
            zzpnVar = new zzpn(zzK, "auto", str, System.currentTimeMillis(), Long.valueOf(j));
        } else {
            String zzK2 = zzicVar.zzK();
            zzba().getClass();
            zzpnVar = new zzpn(zzK2, "auto", str, System.currentTimeMillis(), Long.valueOf(((Long) obj).longValue() + j));
        }
        zzit zzm2 = zziu.zzm();
        zzm2.zzb$4(str);
        zzba().getClass();
        zzm2.zza(System.currentTimeMillis());
        Object obj2 = zzpnVar.zze;
        zzm2.zze$1(((Long) obj2).longValue());
        zziu zziuVar = (zziu) zzm2.zzbd();
        int zzx = zzpk.zzx(zzicVar, str);
        if (zzx >= 0) {
            zzicVar.zzn(zzx, zziuVar);
        } else {
            zzicVar.zzo(zziuVar);
        }
        if (j > 0) {
            zzaw zzawVar2 = this.zze;
            zzaT(zzawVar2);
            zzawVar2.zzl(zzpnVar);
            zzaW().zzl.zzc("Updated engagement user property. scope, value", true != z ? "lifetime" : "session-scoped", obj2);
        }
    }

    public final boolean zzaJ(zzhr zzhrVar, zzhr zzhrVar2) {
        zzae.checkArgument("_e".equals(zzhrVar.zzk()));
        zzp();
        com.google.android.gms.internal.measurement.zzhw zzI = zzpk.zzI((zzhs) zzhrVar.zzbd(), "_sc");
        String zzd = zzI == null ? null : zzI.zzd();
        zzp();
        com.google.android.gms.internal.measurement.zzhw zzI2 = zzpk.zzI((zzhs) zzhrVar2.zzbd(), "_pc");
        String zzd2 = zzI2 != null ? zzI2.zzd() : null;
        if (zzd2 == null || !zzd2.equals(zzd)) {
            return false;
        }
        zzae.checkArgument("_e".equals(zzhrVar.zzk()));
        zzp();
        com.google.android.gms.internal.measurement.zzhw zzI3 = zzpk.zzI((zzhs) zzhrVar.zzbd(), "_et");
        if (zzI3 == null || !zzI3.zze() || zzI3.zzf() <= 0) {
            return true;
        }
        long zzf = zzI3.zzf();
        zzp();
        com.google.android.gms.internal.measurement.zzhw zzI4 = zzpk.zzI((zzhs) zzhrVar2.zzbd(), "_et");
        if (zzI4 != null && zzI4.zzf() > 0) {
            zzf += zzI4.zzf();
        }
        zzp();
        zzpk.zzF(zzhrVar2, "_et", Long.valueOf(zzf));
        zzp();
        zzpk.zzF(zzhrVar, "_fr", 1L);
        return true;
    }

    public final void zzaK(zzhr zzhrVar, String str, String str2) {
        ArrayList arrayList = new ArrayList(zzhrVar.zza());
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                i = -1;
                break;
            } else if (str.equals(((com.google.android.gms.internal.measurement.zzhw) arrayList.get(i)).zzb())) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        double zzk = zzhrVar.zzc(i).zzk() * 1000000.0d;
        if (zzk == 0.0d) {
            zzk = zzhrVar.zzc(i).zzf() * 1000000.0d;
        }
        if (zzk > 9.223372036854776E18d || zzk < -9.223372036854776E18d) {
            zzaW().zzg.zzc(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Data lost. Purchase ", str, " is too big. appId"), zzgu.zzl(str2), Double.valueOf(zzk));
            return;
        }
        zzhrVar.zzj$1(i);
        com.google.android.gms.internal.measurement.zzhv zzn = com.google.android.gms.internal.measurement.zzhw.zzn();
        zzn.zzb$3(str);
        zzn.zzf(Math.round(zzk));
        zzhrVar.zzf((com.google.android.gms.internal.measurement.zzhw) zzn.zzbd());
    }

    public final boolean zzaL() {
        zzaX().zzg();
        zzu$3();
        zzaw zzawVar = this.zze;
        zzaT(zzawVar);
        if (zzawVar.zzaA("select count(1) > 0 from raw_events", null) != 0) {
            return true;
        }
        zzaw zzawVar2 = this.zze;
        zzaT(zzawVar2);
        return !TextUtils.isEmpty(zzawVar2.zzF());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzaM() {
        boolean z;
        long max;
        long max2;
        long j;
        zzpk zzpkVar = this.zzi;
        zzaX().zzg();
        zzu$3();
        if (this.zza > 0) {
            zzba().getClass();
            long abs = 3600000 - Math.abs(SystemClock.elapsedRealtime() - this.zza);
            if (abs > 0) {
                zzaW().zzl.zzb(Long.valueOf(abs), "Upload has been suspended. Will update scheduling later in approximately ms");
                zzk().zzb();
                zzok zzokVar = this.zzg;
                zzaT(zzokVar);
                zzokVar.zzf$1();
                return;
            }
            this.zza = 0L;
        }
        if (!this.zzn.zzH() || !zzaL()) {
            zzaW().zzl.zza("Nothing to upload or uploading impossible");
            zzk().zzb();
            zzok zzokVar2 = this.zzg;
            zzaT(zzokVar2);
            zzokVar2.zzf$1();
            return;
        }
        zzba().getClass();
        long currentTimeMillis = System.currentTimeMillis();
        zzd();
        long max3 = Math.max(0L, ((Long) zzfy.zzO.zzb(null)).longValue());
        zzaw zzawVar = this.zze;
        zzaT(zzawVar);
        if (zzawVar.zzaA("select count(1) > 0 from raw_events where realtime = 1", null) == 0) {
            zzaw zzawVar2 = this.zze;
            zzaT(zzawVar2);
            if (zzawVar2.zzaA("select count(1) > 0 from queue where has_realtime = 1", null) == 0) {
                z = false;
                if (z) {
                    zzd();
                    max = Math.max(0L, ((Long) zzfy.zzH.zzb(null)).longValue());
                } else {
                    String zzK = zzd().zzK("debug.firebase.analytics.app");
                    if (TextUtils.isEmpty(zzK) || ".none.".equals(zzK)) {
                        zzd();
                        max = Math.max(0L, ((Long) zzfy.zzI.zzb(null)).longValue());
                    } else {
                        zzd();
                        max = Math.max(0L, ((Long) zzfy.zzJ.zzb(null)).longValue());
                    }
                }
                long zza = this.zzk.zzd.zza();
                long zza2 = this.zzk.zze.zza();
                zzaw zzawVar3 = this.zze;
                zzaT(zzawVar3);
                long zzaB = zzawVar3.zzaB("select max(bundle_end_timestamp) from queue", null, 0L);
                zzaw zzawVar4 = this.zze;
                zzaT(zzawVar4);
                max2 = Math.max(zzaB, zzawVar4.zzaB("select max(timestamp) from raw_events", null, 0L));
                if (max2 != 0) {
                    long abs2 = currentTimeMillis - Math.abs(max2 - currentTimeMillis);
                    long abs3 = currentTimeMillis - Math.abs(zza - currentTimeMillis);
                    long abs4 = currentTimeMillis - Math.abs(zza2 - currentTimeMillis);
                    long j2 = max3 + abs2;
                    long max4 = Math.max(abs3, abs4);
                    if (z && max4 > 0) {
                        j2 = Math.min(abs2, max4) + max;
                    }
                    zzaT(zzpkVar);
                    j = !zzpkVar.zzs(max4, max) ? max4 + max : j2;
                    if (abs4 != 0 && abs4 >= abs2) {
                        int i = 0;
                        while (true) {
                            zzd();
                            if (i >= Math.min(20, Math.max(0, ((Integer) zzfy.zzQ.zzb(null)).intValue()))) {
                                break;
                            }
                            zzd();
                            j += Math.max(0L, ((Long) zzfy.zzP.zzb(null)).longValue()) * (1 << i);
                            if (j > abs4) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                    if (j == 0) {
                        zzaW().zzl.zza("Next upload time is 0");
                        zzk().zzb();
                        zzok zzokVar3 = this.zzg;
                        zzaT(zzokVar3);
                        zzokVar3.zzf$1();
                        return;
                    }
                    zzgz zzgzVar = this.zzd;
                    zzaT(zzgzVar);
                    if (!zzgzVar.zzb()) {
                        zzaW().zzl.zza("No network");
                        zzhb zzk = zzk();
                        zzpg zzpgVar = zzk.zza;
                        zzpgVar.zzu$3();
                        zzpgVar.zzaX().zzg();
                        if (!zzk.zzb) {
                            zzpgVar.zzn.zzd.registerReceiver(zzk, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                            zzgz zzgzVar2 = zzpgVar.zzd;
                            zzaT(zzgzVar2);
                            zzk.zzc = zzgzVar2.zzb();
                            zzpgVar.zzaW().zzl.zzb(Boolean.valueOf(zzk.zzc), "Registering connectivity change receiver. Network connected");
                            zzk.zzb = true;
                        }
                        zzok zzokVar4 = this.zzg;
                        zzaT(zzokVar4);
                        zzokVar4.zzf$1();
                        return;
                    }
                    long zza3 = this.zzk.zzc.zza();
                    zzd();
                    long max5 = Math.max(0L, ((Long) zzfy.zzF.zzb(null)).longValue());
                    zzaT(zzpkVar);
                    if (!zzpkVar.zzs(zza3, max5)) {
                        j = Math.max(j, zza3 + max5);
                    }
                    zzk().zzb();
                    zzba().getClass();
                    long currentTimeMillis2 = j - System.currentTimeMillis();
                    if (currentTimeMillis2 <= 0) {
                        zzd();
                        currentTimeMillis2 = Math.max(0L, ((Long) zzfy.zzK.zzb(null)).longValue());
                        zzhe zzheVar = this.zzk.zzd;
                        zzba().getClass();
                        zzheVar.zzb(System.currentTimeMillis());
                    }
                    zzaW().zzl.zzb(Long.valueOf(currentTimeMillis2), "Upload scheduled in approximately ms");
                    zzok zzokVar5 = this.zzg;
                    zzaT(zzokVar5);
                    zzokVar5.zzay();
                    zzic zzicVar = (zzic) zzokVar5.$$delegate_0;
                    zzicVar.getClass();
                    zzgu zzguVar = zzicVar.zzi;
                    Context context = zzicVar.zzd;
                    if (!zzpp.zzax(context)) {
                        zzic.zzP(zzguVar);
                        zzguVar.zzk.zza("Receiver not registered/enabled");
                    }
                    if (!zzpp.zzT(context)) {
                        zzic.zzP(zzguVar);
                        zzguVar.zzk.zza("Service not registered/enabled");
                    }
                    zzokVar5.zzf$1();
                    zzic.zzP(zzguVar);
                    zzguVar.zzl.zzb(Long.valueOf(currentTimeMillis2), "Scheduling upload, millis");
                    zzicVar.zzn.getClass();
                    SystemClock.elapsedRealtime();
                    if (currentTimeMillis2 < Math.max(0L, ((Long) zzfy.zzL.zzb(null)).longValue()) && zzokVar5.zzc().zzd == 0) {
                        zzokVar5.zzc().zzb(currentTimeMillis2);
                    }
                    ComponentName componentName = new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService");
                    int zzi$1 = zzokVar5.zzi$1();
                    PersistableBundle persistableBundle = new PersistableBundle();
                    persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
                    zzcf.zza(context, new JobInfo.Builder(zzi$1, componentName).setMinimumLatency(currentTimeMillis2).setOverrideDeadline(currentTimeMillis2 + currentTimeMillis2).setExtras(persistableBundle).build());
                    return;
                }
                j = 0;
                if (j == 0) {
                }
            }
        }
        z = true;
        if (z) {
        }
        long zza4 = this.zzk.zzd.zza();
        long zza22 = this.zzk.zze.zza();
        zzaw zzawVar32 = this.zze;
        zzaT(zzawVar32);
        long zzaB2 = zzawVar32.zzaB("select max(bundle_end_timestamp) from queue", null, 0L);
        zzaw zzawVar42 = this.zze;
        zzaT(zzawVar42);
        max2 = Math.max(zzaB2, zzawVar42.zzaB("select max(timestamp) from raw_events", null, 0L));
        if (max2 != 0) {
        }
        j = 0;
        if (j == 0) {
        }
    }

    public final void zzaN() {
        zzaX().zzg();
        if (this.zzu || this.zzv || this.zzw) {
            zzaW().zzl.zzd("Not stopping services. fetch, network, upload", Boolean.valueOf(this.zzu), Boolean.valueOf(this.zzv), Boolean.valueOf(this.zzw));
            return;
        }
        zzaW().zzl.zza("Stopping uploading service(s)");
        ArrayList arrayList = this.zzq;
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        ArrayList arrayList2 = this.zzq;
        zzae.checkNotNull(arrayList2);
        arrayList2.clear();
    }

    public final Boolean zzaO(zzh zzhVar) {
        try {
            long zzt = zzhVar.zzt();
            zzic zzicVar = this.zzn;
            if (zzt != -2147483648L) {
                if (zzhVar.zzt() == Wrappers.packageManager(zzicVar.zzd).getPackageInfo(0, zzhVar.zzc()).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = Wrappers.packageManager(zzicVar.zzd).getPackageInfo(0, zzhVar.zzc()).versionName;
                String zzr = zzhVar.zzr();
                if (zzr != null && zzr.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final zzr zzaP(String str) {
        zzaw zzawVar = this.zze;
        zzaT(zzawVar);
        zzh zzu = zzawVar.zzu(str);
        if (zzu == null || TextUtils.isEmpty(zzu.zzr())) {
            zzaW().zzk.zzb(str, "No app data available; dropping");
            return null;
        }
        Boolean zzaO = zzaO(zzu);
        if (zzaO == null || zzaO.booleanValue()) {
            return new zzr(str, zzu.zzf(), zzu.zzr(), zzu.zzt(), zzu.zzv(), zzu.zzx(), zzu.zzz(), (String) null, zzu.zzD(), false, zzu.zzl(), 0L, 0, zzu.zzac(), false, zzu.zzae(), zzu.zzB(), (List) zzu.zzag(), zzB(str).zzl(), "", (String) null, zzu.zzai(), zzu.zzak(), zzB(str).zzc, zzx(str).zzc, zzu.zzao(), zzu.zzaw(), zzu.zzay(), zzu.zzaH(), 0L, zzu.zzaL(), 0L);
        }
        zzaW().zzd.zzb(zzgu.zzl(str), "App version does not match; dropping. appId");
        return null;
    }

    public final boolean zzaQ(String str, String str2) {
        zzaw zzawVar = this.zze;
        zzaT(zzawVar);
        zzbd zzaE = zzawVar.zzaE("events", str, str2);
        return zzaE == null || zzaE.zzc < 1;
    }

    @Override // com.google.android.gms.measurement.internal.zzjg
    public final Trifle zzaV() {
        return this.zzn.zzf;
    }

    @Override // com.google.android.gms.measurement.internal.zzjg
    public final zzgu zzaW() {
        zzic zzicVar = this.zzn;
        zzae.checkNotNull(zzicVar);
        zzgu zzguVar = zzicVar.zzi;
        zzic.zzP(zzguVar);
        return zzguVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzjg
    public final zzhz zzaX() {
        zzic zzicVar = this.zzn;
        zzae.checkNotNull(zzicVar);
        zzhz zzhzVar = zzicVar.zzj;
        zzic.zzP(zzhzVar);
        return zzhzVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzjg
    public final Context zzaZ() {
        return this.zzn.zzd;
    }

    public final void zzaa$1() {
        zzaX().zzg();
        zzu$3();
        if (this.zzp) {
            return;
        }
        this.zzp = true;
        zzaX().zzg();
        FileLock fileLock = this.zzx;
        zzic zzicVar = this.zzn;
        if (fileLock == null || !fileLock.isValid()) {
            ((zzic) this.zze.$$delegate_0).getClass();
            try {
                FileChannel channel = new RandomAccessFile(new File(new File(zzicVar.zzd.getFilesDir(), "google_app_measurement.db").getPath()), "rw").getChannel();
                this.zzy = channel;
                FileLock tryLock = channel.tryLock();
                this.zzx = tryLock;
                if (tryLock == null) {
                    zzaW().zzd.zza("Storage concurrent data access panic");
                    return;
                }
                zzaW().zzl.zza("Storage concurrent access okay");
            } catch (FileNotFoundException e) {
                zzaW().zzd.zzb(e, "Failed to acquire storage lock");
                return;
            } catch (IOException e2) {
                zzaW().zzd.zzb(e2, "Failed to access storage lock file");
                return;
            } catch (OverlappingFileLockException e3) {
                zzaW().zzg.zzb(e3, "Storage lock already acquired");
                return;
            }
        } else {
            zzaW().zzl.zza("Storage concurrent access okay");
        }
        FileChannel fileChannel = this.zzy;
        zzaX().zzg();
        int i = 0;
        if (fileChannel == null || !fileChannel.isOpen()) {
            zzaW().zzd.zza("Bad channel to read from");
        } else {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            try {
                fileChannel.position(0L);
                int read = fileChannel.read(allocate);
                if (read == 4) {
                    allocate.flip();
                    i = allocate.getInt();
                } else if (read != -1) {
                    zzaW().zzg.zzb(Integer.valueOf(read), "Unexpected data length. Bytes read");
                }
            } catch (IOException e4) {
                zzaW().zzd.zzb(e4, "Failed to read from channel");
            }
        }
        zzgi zzv = zzicVar.zzv();
        zzv.zzb$1();
        int i2 = zzv.zzc;
        zzaX().zzg();
        if (i > i2) {
            zzaW().zzd.zzc("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i), Integer.valueOf(i2));
            return;
        }
        if (i < i2) {
            FileChannel fileChannel2 = this.zzy;
            zzaX().zzg();
            if (fileChannel2 == null || !fileChannel2.isOpen()) {
                zzaW().zzd.zza("Bad channel to read from");
            } else {
                ByteBuffer allocate2 = ByteBuffer.allocate(4);
                allocate2.putInt(i2);
                allocate2.flip();
                try {
                    fileChannel2.truncate(0L);
                    fileChannel2.write(allocate2);
                    fileChannel2.force(true);
                    if (fileChannel2.size() != 4) {
                        zzaW().zzd.zzb(Long.valueOf(fileChannel2.size()), "Error writing to channel. Bytes written");
                    }
                    zzaW().zzl.zzc("Storage version upgraded. Previous, current version", Integer.valueOf(i), Integer.valueOf(i2));
                    return;
                } catch (IOException e5) {
                    zzaW().zzd.zzb(e5, "Failed to write to channel");
                }
            }
            zzaW().zzd.zzc("Storage version upgrade failed. Previous, current version", Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    public final void zzad(zzpl zzplVar, zzr zzrVar) {
        String str;
        long j;
        zzaX().zzg();
        zzu$3();
        boolean zzaS = zzaS(zzrVar);
        String str2 = zzrVar.zza;
        if (zzaS) {
            if (!zzrVar.zzh) {
                zzap(zzrVar);
                return;
            }
            zzpp zzt = zzt();
            String str3 = zzplVar.zzb;
            int zzs = zzt.zzs(str3);
            Extras.Key key = this.zzK;
            if (zzs != 0) {
                zzt();
                zzd();
                String zzE = zzpp.zzE(str3, 24, true);
                int length = str3 != null ? str3.length() : 0;
                zzt();
                zzpp.zzP(key, zzrVar.zza, zzs, "_ev", zzE, length);
                return;
            }
            int zzM = zzt().zzM(zzplVar.zza(), str3);
            if (zzM != 0) {
                zzt();
                zzd();
                String zzE2 = zzpp.zzE(str3, 24, true);
                Object zza = zzplVar.zza();
                int length2 = (zza == null || !((zza instanceof String) || (zza instanceof CharSequence))) ? 0 : zza.toString().length();
                zzt();
                zzpp.zzP(key, zzrVar.zza, zzM, "_ev", zzE2, length2);
                return;
            }
            Object zzN = zzt().zzN(zzplVar.zza(), str3);
            if (zzN != null) {
                if ("_sid".equals(str3)) {
                    long j2 = zzplVar.zzc;
                    String str4 = zzplVar.zzf;
                    zzae.checkNotNull(str2);
                    zzaw zzawVar = this.zze;
                    zzaT(zzawVar);
                    zzpn zzm = zzawVar.zzm(str2, "_sno");
                    if (zzm != null) {
                        Object obj = zzm.zze;
                        if (obj instanceof Long) {
                            j = ((Long) obj).longValue();
                            str = "_sid";
                            zzad(new zzpl(j2, Long.valueOf(j + 1), "_sno", str4), zzrVar);
                        }
                    }
                    if (zzm != null) {
                        zzaW().zzg.zzb(zzm.zze, "Retrieved last session number from database does not contain a valid (long) value");
                    }
                    zzaw zzawVar2 = this.zze;
                    zzaT(zzawVar2);
                    zzbd zzaE = zzawVar2.zzaE("events", str2, "_s");
                    if (zzaE != null) {
                        zzgs zzgsVar = zzaW().zzl;
                        str = "_sid";
                        long j3 = zzaE.zzc;
                        zzgsVar.zzb(Long.valueOf(j3), "Backfill the session number. Last used session number");
                        j = j3;
                    } else {
                        str = "_sid";
                        j = 0;
                    }
                    zzad(new zzpl(j2, Long.valueOf(j + 1), "_sno", str4), zzrVar);
                } else {
                    str = "_sid";
                }
                zzae.checkNotNull(str2);
                String str5 = zzplVar.zzf;
                zzae.checkNotNull(str5);
                zzpn zzpnVar = new zzpn(str2, str5, str3, zzplVar.zzc, zzN);
                zzgs zzgsVar2 = zzaW().zzl;
                zzic zzicVar = this.zzn;
                zzgn zzgnVar = zzicVar.zzm;
                String str6 = zzpnVar.zzc;
                zzgsVar2.zzc("Setting user property", zzgnVar.zzc(str6), zzN);
                zzaw zzawVar3 = this.zze;
                zzaT(zzawVar3);
                zzawVar3.zzb$1();
                try {
                    boolean equals = "_id".equals(str6);
                    Object obj2 = zzpnVar.zze;
                    if (equals) {
                        zzaw zzawVar4 = this.zze;
                        zzaT(zzawVar4);
                        zzpn zzm2 = zzawVar4.zzm(str2, "_id");
                        if (zzm2 != null && !obj2.equals(zzm2.zze)) {
                            zzaw zzawVar5 = this.zze;
                            zzaT(zzawVar5);
                            zzawVar5.zzk(str2, "_lair");
                        }
                    }
                    zzap(zzrVar);
                    zzaw zzawVar6 = this.zze;
                    zzaT(zzawVar6);
                    boolean zzl = zzawVar6.zzl(zzpnVar);
                    if (str.equals(str3)) {
                        zzpk zzpkVar = this.zzi;
                        zzaT(zzpkVar);
                        String str7 = zzrVar.zzu;
                        long zzt2 = TextUtils.isEmpty(str7) ? 0L : zzpkVar.zzt(str7.getBytes(StandardCharsets.UTF_8));
                        zzaw zzawVar7 = this.zze;
                        zzaT(zzawVar7);
                        zzh zzu = zzawVar7.zzu(str2);
                        if (zzu != null) {
                            zzu.zzan(zzt2);
                            if (zzu.zza()) {
                                zzaw zzawVar8 = this.zze;
                                zzaT(zzawVar8);
                                zzawVar8.zzv(zzu, false);
                            }
                        }
                    }
                    zzaw zzawVar9 = this.zze;
                    zzaT(zzawVar9);
                    zzawVar9.zzc();
                    if (!zzl) {
                        zzaW().zzd.zzc("Too many unique user properties are set. Ignoring user property", zzicVar.zzm.zzc(str6), obj2);
                        zzt();
                        zzpp.zzP(key, str2, 9, null, null, 0);
                    }
                    zzaw zzawVar10 = this.zze;
                    zzaT(zzawVar10);
                    zzawVar10.zzd();
                } catch (Throwable th) {
                    zzaw zzawVar11 = this.zze;
                    zzaT(zzawVar11);
                    zzawVar11.zzd();
                    throw th;
                }
            }
        }
    }

    public final void zzae(String str, zzr zzrVar) {
        zzaX().zzg();
        zzu$3();
        boolean zzaS = zzaS(zzrVar);
        String str2 = zzrVar.zza;
        if (zzaS) {
            if (!zzrVar.zzh) {
                zzap(zzrVar);
                return;
            }
            Boolean zzaU = zzaU(zzrVar);
            if ("_npa".equals(str) && zzaU != null) {
                zzaW().zzk.zza("Falling back to manifest metadata value for ad personalization");
                zzba().getClass();
                zzad(new zzpl(System.currentTimeMillis(), Long.valueOf(true != zzaU.booleanValue() ? 0L : 1L), "_npa", "auto"), zzrVar);
                return;
            }
            zzgs zzgsVar = zzaW().zzk;
            zzic zzicVar = this.zzn;
            zzgsVar.zzb(zzicVar.zzm.zzc(str), "Removing user property");
            zzaw zzawVar = this.zze;
            zzaT(zzawVar);
            zzawVar.zzb$1();
            try {
                zzap(zzrVar);
                if ("_id".equals(str)) {
                    zzaw zzawVar2 = this.zze;
                    zzaT(zzawVar2);
                    zzae.checkNotNull(str2);
                    zzawVar2.zzk(str2, "_lair");
                }
                zzaw zzawVar3 = this.zze;
                zzaT(zzawVar3);
                zzae.checkNotNull(str2);
                zzawVar3.zzk(str2, str);
                zzaw zzawVar4 = this.zze;
                zzaT(zzawVar4);
                zzawVar4.zzc();
                zzaW().zzk.zzb(zzicVar.zzm.zzc(str), "User property removed");
                zzaw zzawVar5 = this.zze;
                zzaT(zzawVar5);
                zzawVar5.zzd();
            } catch (Throwable th) {
                zzaw zzawVar6 = this.zze;
                zzaT(zzawVar6);
                zzawVar6.zzd();
                throw th;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:(2:79|80)|(2:82|(8:84|(3:86|(2:88|(1:90))(1:110)|109)(1:111)|91|(1:93)(1:108)|94|95|96|(4:98|(1:100)(1:104)|101|(1:103))))|112|95|96|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x037f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0380, code lost:
    
        zzaW().zzd.zzc("Application info is null, first open report might be inaccurate. appId", com.google.android.gms.measurement.internal.zzgu.zzl(r3), r0);
        r12 = r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:150:0x043b A[Catch: all -> 0x00fc, TryCatch #2 {all -> 0x00fc, blocks: (B:31:0x00dc, B:33:0x00ec, B:37:0x0103, B:40:0x0113, B:42:0x0122, B:44:0x0137, B:46:0x0144, B:47:0x014f, B:50:0x0158, B:52:0x016f, B:55:0x0188, B:58:0x01ac, B:60:0x01bc, B:62:0x01d4, B:63:0x0299, B:65:0x02c5, B:66:0x02c8, B:68:0x02e9, B:73:0x03b1, B:74:0x03b4, B:75:0x0460, B:80:0x0300, B:82:0x031f, B:84:0x0327, B:86:0x032d, B:90:0x0340, B:91:0x0353, B:94:0x035f, B:96:0x0373, B:98:0x0392, B:100:0x039a, B:101:0x03a2, B:103:0x03a8, B:107:0x0380, B:110:0x034b, B:115:0x030d, B:116:0x01e4, B:118:0x020e, B:119:0x021a, B:121:0x0221, B:123:0x0227, B:125:0x0231, B:127:0x0237, B:129:0x023d, B:131:0x0243, B:133:0x0248, B:136:0x0262, B:141:0x0266, B:142:0x0277, B:143:0x0282, B:145:0x028d, B:146:0x03dd, B:148:0x0412, B:149:0x0415, B:150:0x043b, B:152:0x0442, B:153:0x0163, B:154:0x014b, B:155:0x012c, B:159:0x0134), top: B:30:0x00dc, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0163 A[Catch: all -> 0x00fc, TryCatch #2 {all -> 0x00fc, blocks: (B:31:0x00dc, B:33:0x00ec, B:37:0x0103, B:40:0x0113, B:42:0x0122, B:44:0x0137, B:46:0x0144, B:47:0x014f, B:50:0x0158, B:52:0x016f, B:55:0x0188, B:58:0x01ac, B:60:0x01bc, B:62:0x01d4, B:63:0x0299, B:65:0x02c5, B:66:0x02c8, B:68:0x02e9, B:73:0x03b1, B:74:0x03b4, B:75:0x0460, B:80:0x0300, B:82:0x031f, B:84:0x0327, B:86:0x032d, B:90:0x0340, B:91:0x0353, B:94:0x035f, B:96:0x0373, B:98:0x0392, B:100:0x039a, B:101:0x03a2, B:103:0x03a8, B:107:0x0380, B:110:0x034b, B:115:0x030d, B:116:0x01e4, B:118:0x020e, B:119:0x021a, B:121:0x0221, B:123:0x0227, B:125:0x0231, B:127:0x0237, B:129:0x023d, B:131:0x0243, B:133:0x0248, B:136:0x0262, B:141:0x0266, B:142:0x0277, B:143:0x0282, B:145:0x028d, B:146:0x03dd, B:148:0x0412, B:149:0x0415, B:150:0x043b, B:152:0x0442, B:153:0x0163, B:154:0x014b, B:155:0x012c, B:159:0x0134), top: B:30:0x00dc, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x014b A[Catch: all -> 0x00fc, TryCatch #2 {all -> 0x00fc, blocks: (B:31:0x00dc, B:33:0x00ec, B:37:0x0103, B:40:0x0113, B:42:0x0122, B:44:0x0137, B:46:0x0144, B:47:0x014f, B:50:0x0158, B:52:0x016f, B:55:0x0188, B:58:0x01ac, B:60:0x01bc, B:62:0x01d4, B:63:0x0299, B:65:0x02c5, B:66:0x02c8, B:68:0x02e9, B:73:0x03b1, B:74:0x03b4, B:75:0x0460, B:80:0x0300, B:82:0x031f, B:84:0x0327, B:86:0x032d, B:90:0x0340, B:91:0x0353, B:94:0x035f, B:96:0x0373, B:98:0x0392, B:100:0x039a, B:101:0x03a2, B:103:0x03a8, B:107:0x0380, B:110:0x034b, B:115:0x030d, B:116:0x01e4, B:118:0x020e, B:119:0x021a, B:121:0x0221, B:123:0x0227, B:125:0x0231, B:127:0x0237, B:129:0x023d, B:131:0x0243, B:133:0x0248, B:136:0x0262, B:141:0x0266, B:142:0x0277, B:143:0x0282, B:145:0x028d, B:146:0x03dd, B:148:0x0412, B:149:0x0415, B:150:0x043b, B:152:0x0442, B:153:0x0163, B:154:0x014b, B:155:0x012c, B:159:0x0134), top: B:30:0x00dc, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0144 A[Catch: all -> 0x00fc, TryCatch #2 {all -> 0x00fc, blocks: (B:31:0x00dc, B:33:0x00ec, B:37:0x0103, B:40:0x0113, B:42:0x0122, B:44:0x0137, B:46:0x0144, B:47:0x014f, B:50:0x0158, B:52:0x016f, B:55:0x0188, B:58:0x01ac, B:60:0x01bc, B:62:0x01d4, B:63:0x0299, B:65:0x02c5, B:66:0x02c8, B:68:0x02e9, B:73:0x03b1, B:74:0x03b4, B:75:0x0460, B:80:0x0300, B:82:0x031f, B:84:0x0327, B:86:0x032d, B:90:0x0340, B:91:0x0353, B:94:0x035f, B:96:0x0373, B:98:0x0392, B:100:0x039a, B:101:0x03a2, B:103:0x03a8, B:107:0x0380, B:110:0x034b, B:115:0x030d, B:116:0x01e4, B:118:0x020e, B:119:0x021a, B:121:0x0221, B:123:0x0227, B:125:0x0231, B:127:0x0237, B:129:0x023d, B:131:0x0243, B:133:0x0248, B:136:0x0262, B:141:0x0266, B:142:0x0277, B:143:0x0282, B:145:0x028d, B:146:0x03dd, B:148:0x0412, B:149:0x0415, B:150:0x043b, B:152:0x0442, B:153:0x0163, B:154:0x014b, B:155:0x012c, B:159:0x0134), top: B:30:0x00dc, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0158 A[Catch: all -> 0x00fc, TRY_ENTER, TryCatch #2 {all -> 0x00fc, blocks: (B:31:0x00dc, B:33:0x00ec, B:37:0x0103, B:40:0x0113, B:42:0x0122, B:44:0x0137, B:46:0x0144, B:47:0x014f, B:50:0x0158, B:52:0x016f, B:55:0x0188, B:58:0x01ac, B:60:0x01bc, B:62:0x01d4, B:63:0x0299, B:65:0x02c5, B:66:0x02c8, B:68:0x02e9, B:73:0x03b1, B:74:0x03b4, B:75:0x0460, B:80:0x0300, B:82:0x031f, B:84:0x0327, B:86:0x032d, B:90:0x0340, B:91:0x0353, B:94:0x035f, B:96:0x0373, B:98:0x0392, B:100:0x039a, B:101:0x03a2, B:103:0x03a8, B:107:0x0380, B:110:0x034b, B:115:0x030d, B:116:0x01e4, B:118:0x020e, B:119:0x021a, B:121:0x0221, B:123:0x0227, B:125:0x0231, B:127:0x0237, B:129:0x023d, B:131:0x0243, B:133:0x0248, B:136:0x0262, B:141:0x0266, B:142:0x0277, B:143:0x0282, B:145:0x028d, B:146:0x03dd, B:148:0x0412, B:149:0x0415, B:150:0x043b, B:152:0x0442, B:153:0x0163, B:154:0x014b, B:155:0x012c, B:159:0x0134), top: B:30:0x00dc, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016f A[Catch: all -> 0x00fc, TRY_LEAVE, TryCatch #2 {all -> 0x00fc, blocks: (B:31:0x00dc, B:33:0x00ec, B:37:0x0103, B:40:0x0113, B:42:0x0122, B:44:0x0137, B:46:0x0144, B:47:0x014f, B:50:0x0158, B:52:0x016f, B:55:0x0188, B:58:0x01ac, B:60:0x01bc, B:62:0x01d4, B:63:0x0299, B:65:0x02c5, B:66:0x02c8, B:68:0x02e9, B:73:0x03b1, B:74:0x03b4, B:75:0x0460, B:80:0x0300, B:82:0x031f, B:84:0x0327, B:86:0x032d, B:90:0x0340, B:91:0x0353, B:94:0x035f, B:96:0x0373, B:98:0x0392, B:100:0x039a, B:101:0x03a2, B:103:0x03a8, B:107:0x0380, B:110:0x034b, B:115:0x030d, B:116:0x01e4, B:118:0x020e, B:119:0x021a, B:121:0x0221, B:123:0x0227, B:125:0x0231, B:127:0x0237, B:129:0x023d, B:131:0x0243, B:133:0x0248, B:136:0x0262, B:141:0x0266, B:142:0x0277, B:143:0x0282, B:145:0x028d, B:146:0x03dd, B:148:0x0412, B:149:0x0415, B:150:0x043b, B:152:0x0442, B:153:0x0163, B:154:0x014b, B:155:0x012c, B:159:0x0134), top: B:30:0x00dc, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0392 A[Catch: all -> 0x00fc, TryCatch #2 {all -> 0x00fc, blocks: (B:31:0x00dc, B:33:0x00ec, B:37:0x0103, B:40:0x0113, B:42:0x0122, B:44:0x0137, B:46:0x0144, B:47:0x014f, B:50:0x0158, B:52:0x016f, B:55:0x0188, B:58:0x01ac, B:60:0x01bc, B:62:0x01d4, B:63:0x0299, B:65:0x02c5, B:66:0x02c8, B:68:0x02e9, B:73:0x03b1, B:74:0x03b4, B:75:0x0460, B:80:0x0300, B:82:0x031f, B:84:0x0327, B:86:0x032d, B:90:0x0340, B:91:0x0353, B:94:0x035f, B:96:0x0373, B:98:0x0392, B:100:0x039a, B:101:0x03a2, B:103:0x03a8, B:107:0x0380, B:110:0x034b, B:115:0x030d, B:116:0x01e4, B:118:0x020e, B:119:0x021a, B:121:0x0221, B:123:0x0227, B:125:0x0231, B:127:0x0237, B:129:0x023d, B:131:0x0243, B:133:0x0248, B:136:0x0262, B:141:0x0266, B:142:0x0277, B:143:0x0282, B:145:0x028d, B:146:0x03dd, B:148:0x0412, B:149:0x0415, B:150:0x043b, B:152:0x0442, B:153:0x0163, B:154:0x014b, B:155:0x012c, B:159:0x0134), top: B:30:0x00dc, inners: #0, #1, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzai(zzr zzrVar) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        int i;
        zzbd zzaE;
        boolean z;
        zzic zzicVar;
        String str;
        String str2;
        String str3;
        PackageInfo packageInfo;
        zzr zzrVar2;
        ApplicationInfo applicationInfo;
        ApplicationInfo applicationInfo2;
        long j7;
        boolean z2;
        long j8;
        zzic zzicVar2 = this.zzn;
        zzaX().zzg();
        zzu$3();
        zzae.checkNotNull(zzrVar);
        boolean z3 = zzrVar.zzo;
        String str4 = zzrVar.zza;
        zzae.checkNotEmpty(str4);
        if (zzaS(zzrVar)) {
            zzaw zzawVar = this.zze;
            zzaT(zzawVar);
            zzh zzu = zzawVar.zzu(str4);
            if (zzu != null && TextUtils.isEmpty(zzu.zzf()) && !TextUtils.isEmpty(zzrVar.zzb)) {
                zzu.zzI(0L);
                zzaw zzawVar2 = this.zze;
                zzaT(zzawVar2);
                zzawVar2.zzv(zzu, false);
                zzht zzhtVar = this.zzc;
                zzaT(zzhtVar);
                zzhtVar.zzg();
                zzhtVar.zzi.remove(str4);
            }
            if (!zzrVar.zzh) {
                zzap(zzrVar);
                return;
            }
            long j9 = zzrVar.zzl;
            zzal zzd = zzd();
            zzfx zzfxVar = zzfy.zzbe;
            if (zzd.zzp(null, zzfxVar)) {
                j = j9;
                j2 = zzrVar.zzF;
            } else {
                j = j9;
                j2 = 0;
            }
            if (j == 0) {
                zzba().getClass();
                long currentTimeMillis = System.currentTimeMillis();
                if (zzd().zzp(null, zzfxVar)) {
                    zzba().getClass();
                    j8 = SystemClock.elapsedRealtime();
                } else {
                    j8 = 0;
                }
                j4 = currentTimeMillis;
                j3 = j8;
            } else {
                j3 = j2;
                j4 = j;
            }
            int i2 = zzrVar.zzm;
            if (i2 != 0 && i2 != 1) {
                zzaW().zzg.zzc("Incorrect app type, assuming installed app. appId, appType", zzgu.zzl(str4), Integer.valueOf(i2));
                i2 = 0;
            }
            zzaw zzawVar3 = this.zze;
            zzaT(zzawVar3);
            zzawVar3.zzb$1();
            try {
                zzaw zzawVar4 = this.zze;
                zzaT(zzawVar4);
                zzpn zzm = zzawVar4.zzm(str4, "_npa");
                Boolean zzaU = zzaU(zzrVar);
                if (zzm != null) {
                    j5 = 1;
                    if (!"auto".equals(zzm.zzb)) {
                        j6 = j4;
                        if (zzd().zzp(null, zzfy.zzaW)) {
                            i = i2;
                            zzao(zzrVar, j6);
                        } else {
                            i = i2;
                            zzao(zzrVar, zzrVar.zzD);
                        }
                        zzap(zzrVar);
                        zzaw zzawVar5 = this.zze;
                        if (i != 0) {
                            zzaT(zzawVar5);
                            zzaE = zzawVar5.zzaE("events", str4, "_f");
                            z = false;
                        } else {
                            zzaT(zzawVar5);
                            zzaE = zzawVar5.zzaE("events", str4, "_v");
                            z = true;
                        }
                        if (zzaE != null) {
                            long j10 = ((j6 / 3600000) + j5) * 3600000;
                            if (z) {
                                Long valueOf = Long.valueOf(j10);
                                long j11 = j6;
                                zzad(new zzpl(j11, valueOf, "_fvt", "auto"), zzrVar);
                                zzaX().zzg();
                                zzu$3();
                                Bundle bundle = new Bundle();
                                bundle.putLong("_c", 1L);
                                bundle.putLong("_r", 1L);
                                bundle.putLong("_et", 1L);
                                if (z3) {
                                    bundle.putLong("_dac", 1L);
                                }
                                zzba().getClass();
                                bundle.putLong("_elt", System.currentTimeMillis());
                                zzE(new zzbh("_v", new zzbf(bundle), "auto", j11, j3), zzrVar);
                            } else {
                                Long valueOf2 = Long.valueOf(j10);
                                long j12 = j6;
                                zzad(new zzpl(j12, valueOf2, "_fot", "auto"), zzrVar);
                                zzaX().zzg();
                                zzx zzxVar = this.zzm;
                                zzae.checkNotNull(zzxVar);
                                zzic zzicVar3 = zzxVar.zza;
                                if (str4 == null || str4.isEmpty()) {
                                    zzicVar = zzicVar2;
                                    str = "_elt";
                                    str2 = str4;
                                    str3 = "_et";
                                    zzgu zzguVar = zzicVar3.zzi;
                                    zzic.zzP(zzguVar);
                                    zzguVar.zzh.zza("Install Referrer Reporter was called with invalid app package name");
                                } else {
                                    str3 = "_et";
                                    zzhz zzhzVar = zzicVar3.zzj;
                                    zzgu zzguVar2 = zzicVar3.zzi;
                                    str = "_elt";
                                    Context context = zzicVar3.zzd;
                                    zzic.zzP(zzhzVar);
                                    zzhzVar.zzg();
                                    if (zzxVar.zza()) {
                                        zzhj zzhjVar = new zzhj(zzxVar, str4);
                                        zzhz zzhzVar2 = zzicVar3.zzj;
                                        zzic.zzP(zzhzVar2);
                                        zzhzVar2.zzg();
                                        zzicVar = zzicVar2;
                                        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                                        str2 = str4;
                                        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                                        PackageManager packageManager = context.getPackageManager();
                                        if (packageManager == null) {
                                            zzic.zzP(zzguVar2);
                                            zzguVar2.zzh.zza("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                                        } else {
                                            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                                            if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                                                zzic.zzP(zzguVar2);
                                                zzguVar2.zzj.zza("Play Service for fetching Install Referrer is unavailable on device");
                                            } else {
                                                ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                                                if (serviceInfo != null) {
                                                    String str5 = serviceInfo.packageName;
                                                    if (serviceInfo.name != null && "com.android.vending".equals(str5) && zzxVar.zza()) {
                                                        try {
                                                            boolean bindService = ConnectionTracker.getInstance().bindService(context, new Intent(intent), zzhjVar, 1);
                                                            zzic.zzP(zzguVar2);
                                                            zzguVar2.zzl.zzb(bindService ? "available" : "not available", "Install Referrer Service is");
                                                        } catch (RuntimeException e) {
                                                            zzgu zzguVar3 = zzicVar3.zzi;
                                                            zzic.zzP(zzguVar3);
                                                            zzguVar3.zzd.zzb(e.getMessage(), "Exception occurred while binding to Install Referrer Service");
                                                        }
                                                    } else {
                                                        zzic.zzP(zzguVar2);
                                                        zzguVar2.zzg.zza("Play Store version 8.3.73 or higher required for Install Referrer");
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        zzic.zzP(zzguVar2);
                                        zzguVar2.zzj.zza("Install Referrer Reporter is not available");
                                        zzicVar = zzicVar2;
                                        str2 = str4;
                                    }
                                }
                                zzaX().zzg();
                                zzu$3();
                                Bundle bundle2 = new Bundle();
                                long j13 = j5;
                                bundle2.putLong("_c", j13);
                                bundle2.putLong("_r", j13);
                                bundle2.putLong("_uwa", 0L);
                                bundle2.putLong("_pfo", 0L);
                                bundle2.putLong("_sys", 0L);
                                bundle2.putLong("_sysu", 0L);
                                bundle2.putLong(str3, j13);
                                if (z3) {
                                    bundle2.putLong("_dac", j13);
                                }
                                zzae.checkNotNull(str2);
                                zzaw zzawVar6 = this.zze;
                                zzaT(zzawVar6);
                                zzae.checkNotEmpty(str2);
                                zzawVar6.zzg();
                                zzawVar6.zzay();
                                String str6 = str2;
                                long zzN = zzawVar6.zzN(str6);
                                zzic zzicVar4 = zzicVar;
                                if (zzicVar4.zzd.getPackageManager() == null) {
                                    zzaW().zzd.zzb(zzgu.zzl(str6), "PackageManager is null, first open report might be inaccurate. appId");
                                    zzrVar2 = zzrVar;
                                } else {
                                    try {
                                        packageInfo = Wrappers.packageManager(zzicVar4.zzd).getPackageInfo(0, str6);
                                    } catch (PackageManager.NameNotFoundException e2) {
                                        zzaW().zzd.zzc("Package info is null, first open report might be inaccurate. appId", zzgu.zzl(str6), e2);
                                        packageInfo = null;
                                    }
                                    if (packageInfo != null) {
                                        long j14 = packageInfo.firstInstallTime;
                                        if (j14 != 0) {
                                            if (j14 != packageInfo.lastUpdateTime) {
                                                applicationInfo = null;
                                                if (!zzd().zzp(null, zzfy.zzaI)) {
                                                    bundle2.putLong("_uwa", 1L);
                                                } else if (zzN == 0) {
                                                    bundle2.putLong("_uwa", 1L);
                                                    z2 = false;
                                                    zzN = 0;
                                                }
                                                z2 = false;
                                            } else {
                                                applicationInfo = null;
                                                z2 = true;
                                            }
                                            zzrVar2 = zzrVar;
                                            zzad(new zzpl(j12, Long.valueOf(true != z2 ? 0L : 1L), "_fi", "auto"), zzrVar2);
                                            applicationInfo2 = Wrappers.packageManager(zzicVar4.zzd).getApplicationInfo(0, str6);
                                            if (applicationInfo2 != null) {
                                                if ((applicationInfo2.flags & 1) != 0) {
                                                    j7 = 1;
                                                    bundle2.putLong("_sys", 1L);
                                                } else {
                                                    j7 = 1;
                                                }
                                                if ((applicationInfo2.flags & 128) != 0) {
                                                    bundle2.putLong("_sysu", j7);
                                                }
                                            }
                                        }
                                    }
                                    zzrVar2 = zzrVar;
                                    applicationInfo = null;
                                    applicationInfo2 = Wrappers.packageManager(zzicVar4.zzd).getApplicationInfo(0, str6);
                                    if (applicationInfo2 != null) {
                                    }
                                }
                                long j15 = zzN;
                                if (j15 >= 0) {
                                    bundle2.putLong("_pfo", j15);
                                }
                                zzba().getClass();
                                bundle2.putLong(str, System.currentTimeMillis());
                                zzE(new zzbh("_f", new zzbf(bundle2), "auto", j12, j3), zzrVar2);
                            }
                        } else {
                            long j16 = j6;
                            if (zzrVar.zzi) {
                                zzE(new zzbh("_cd", new zzbf(new Bundle()), "auto", j16, 0L), zzrVar);
                            }
                        }
                        zzaw zzawVar7 = this.zze;
                        zzaT(zzawVar7);
                        zzawVar7.zzc();
                        zzaw zzawVar8 = this.zze;
                        zzaT(zzawVar8);
                        zzawVar8.zzd();
                    }
                } else {
                    j5 = 1;
                }
                if (zzaU != null) {
                    zzpl zzplVar = new zzpl(j4, Long.valueOf(true != zzaU.booleanValue() ? 0L : j5), "_npa", "auto");
                    j6 = j4;
                    if (zzm == null || !zzm.zze.equals(zzplVar.zzd)) {
                        zzad(zzplVar, zzrVar);
                    }
                } else {
                    j6 = j4;
                    if (zzm != null) {
                        zzae("_npa", zzrVar);
                    }
                }
                if (zzd().zzp(null, zzfy.zzaW)) {
                }
                zzap(zzrVar);
                zzaw zzawVar52 = this.zze;
                if (i != 0) {
                }
                if (zzaE != null) {
                }
                zzaw zzawVar72 = this.zze;
                zzaT(zzawVar72);
                zzawVar72.zzc();
                zzaw zzawVar82 = this.zze;
                zzaT(zzawVar82);
                zzawVar82.zzd();
            } catch (Throwable th) {
                zzaw zzawVar9 = this.zze;
                zzaT(zzawVar9);
                zzawVar9.zzd();
                throw th;
            }
        }
    }

    public final void zzal(zzah zzahVar, zzr zzrVar) {
        zzbh zzbhVar;
        zzae.checkNotEmpty(zzahVar.zza);
        zzae.checkNotNull(zzahVar.zzb);
        zzae.checkNotNull(zzahVar.zzc);
        zzae.checkNotEmpty(zzahVar.zzc.zzb);
        zzaX().zzg();
        zzu$3();
        if (zzaS(zzrVar)) {
            if (!zzrVar.zzh) {
                zzap(zzrVar);
                return;
            }
            zzah zzahVar2 = new zzah(zzahVar);
            boolean z = false;
            zzahVar2.zze = false;
            zzaw zzawVar = this.zze;
            zzaT(zzawVar);
            zzawVar.zzb$1();
            try {
                zzaw zzawVar2 = this.zze;
                zzaT(zzawVar2);
                String str = zzahVar2.zza;
                zzae.checkNotNull(str);
                zzah zzq = zzawVar2.zzq(str, zzahVar2.zzc.zzb);
                zzic zzicVar = this.zzn;
                if (zzq != null && !zzq.zzb.equals(zzahVar2.zzb)) {
                    zzaW().zzg.zzd("Updating a conditional user property with different origin. name, origin, origin (from DB)", zzicVar.zzm.zzc(zzahVar2.zzc.zzb), zzahVar2.zzb, zzq.zzb);
                }
                if (zzq != null && zzq.zze) {
                    zzahVar2.zzb = zzq.zzb;
                    zzahVar2.zzd = zzq.zzd;
                    zzahVar2.zzh = zzq.zzh;
                    zzahVar2.zzf = zzq.zzf;
                    zzahVar2.zzi = zzq.zzi;
                    zzahVar2.zze = true;
                    zzpl zzplVar = zzahVar2.zzc;
                    zzahVar2.zzc = new zzpl(zzq.zzc.zzc, zzplVar.zza(), zzplVar.zzb, zzq.zzc.zzf);
                } else if (TextUtils.isEmpty(zzahVar2.zzf)) {
                    zzpl zzplVar2 = zzahVar2.zzc;
                    zzahVar2.zzc = new zzpl(zzahVar2.zzd, zzplVar2.zza(), zzplVar2.zzb, zzahVar2.zzc.zzf);
                    zzahVar2.zze = true;
                    z = true;
                }
                if (zzahVar2.zze) {
                    zzpl zzplVar3 = zzahVar2.zzc;
                    String str2 = zzahVar2.zza;
                    zzae.checkNotNull(str2);
                    String str3 = zzahVar2.zzb;
                    String str4 = zzplVar3.zzb;
                    long j = zzplVar3.zzc;
                    Object zza = zzplVar3.zza();
                    zzae.checkNotNull(zza);
                    zzpn zzpnVar = new zzpn(str2, str3, str4, j, zza);
                    Object obj = zzpnVar.zze;
                    String str5 = zzpnVar.zzc;
                    zzaw zzawVar3 = this.zze;
                    zzaT(zzawVar3);
                    if (zzawVar3.zzl(zzpnVar)) {
                        zzaW().zzk.zzd("User property updated immediately", zzahVar2.zza, zzicVar.zzm.zzc(str5), obj);
                    } else {
                        zzaW().zzd.zzd("(2)Too many active user properties, ignoring", zzgu.zzl(zzahVar2.zza), zzicVar.zzm.zzc(str5), obj);
                    }
                    if (z && (zzbhVar = zzahVar2.zzi) != null) {
                        zzH(new zzbh(zzbhVar, zzahVar2.zzd, 0L), zzrVar);
                    }
                }
                zzaw zzawVar4 = this.zze;
                zzaT(zzawVar4);
                if (zzawVar4.zzp(zzahVar2)) {
                    zzaW().zzk.zzd("Conditional property added", zzahVar2.zza, zzicVar.zzm.zzc(zzahVar2.zzc.zzb), zzahVar2.zzc.zza());
                } else {
                    zzaW().zzd.zzd("Too many conditional properties, ignoring", zzgu.zzl(zzahVar2.zza), zzicVar.zzm.zzc(zzahVar2.zzc.zzb), zzahVar2.zzc.zza());
                }
                zzaw zzawVar5 = this.zze;
                zzaT(zzawVar5);
                zzawVar5.zzc();
                zzaw zzawVar6 = this.zze;
                zzaT(zzawVar6);
                zzawVar6.zzd();
            } catch (Throwable th) {
                zzaw zzawVar7 = this.zze;
                zzaT(zzawVar7);
                zzawVar7.zzd();
                throw th;
            }
        }
    }

    public final void zzan(zzah zzahVar, zzr zzrVar) {
        zzae.checkNotEmpty(zzahVar.zza);
        zzae.checkNotNull(zzahVar.zzc);
        zzae.checkNotEmpty(zzahVar.zzc.zzb);
        zzaX().zzg();
        zzu$3();
        if (zzaS(zzrVar)) {
            if (!zzrVar.zzh) {
                zzap(zzrVar);
                return;
            }
            zzaw zzawVar = this.zze;
            zzaT(zzawVar);
            zzawVar.zzb$1();
            try {
                zzap(zzrVar);
                String str = zzahVar.zza;
                zzae.checkNotNull(str);
                zzaw zzawVar2 = this.zze;
                zzaT(zzawVar2);
                zzah zzq = zzawVar2.zzq(str, zzahVar.zzc.zzb);
                zzic zzicVar = this.zzn;
                if (zzq != null) {
                    zzaW().zzk.zzc("Removing conditional user property", zzahVar.zza, zzicVar.zzm.zzc(zzahVar.zzc.zzb));
                    zzaw zzawVar3 = this.zze;
                    zzaT(zzawVar3);
                    zzawVar3.zzr(str, zzahVar.zzc.zzb);
                    if (zzq.zze) {
                        zzaw zzawVar4 = this.zze;
                        zzaT(zzawVar4);
                        zzawVar4.zzk(str, zzahVar.zzc.zzb);
                    }
                    zzbh zzbhVar = zzahVar.zzk;
                    if (zzbhVar != null) {
                        zzbf zzbfVar = zzbhVar.zzb;
                        zzbh zzaf = zzt().zzaf(zzbhVar.zza, zzbfVar != null ? zzbfVar.zzf() : null, zzq.zzb, zzbhVar.zzd, zzbhVar.zze, true);
                        zzae.checkNotNull(zzaf);
                        zzH(zzaf, zzrVar);
                    }
                } else {
                    zzaW().zzg.zzc("Conditional user property doesn't exist", zzgu.zzl(zzahVar.zza), zzicVar.zzm.zzc(zzahVar.zzc.zzb));
                }
                zzaw zzawVar5 = this.zze;
                zzaT(zzawVar5);
                zzawVar5.zzc();
                zzaw zzawVar6 = this.zze;
                zzaT(zzawVar6);
                zzawVar6.zzd();
            } catch (Throwable th) {
                zzaw zzawVar7 = this.zze;
                zzaT(zzawVar7);
                zzawVar7.zzd();
                throw th;
            }
        }
    }

    public final void zzao(zzr zzrVar, long j) {
        zzaw zzawVar = this.zze;
        zzaT(zzawVar);
        String str = zzrVar.zza;
        zzae.checkNotNull(str);
        zzh zzu = zzawVar.zzu(str);
        if (zzu != null) {
            zzt();
            String str2 = zzrVar.zzb;
            String zzf = zzu.zzf();
            boolean isEmpty = TextUtils.isEmpty(str2);
            boolean isEmpty2 = TextUtils.isEmpty(zzf);
            if (!isEmpty && !isEmpty2) {
                zzae.checkNotNull(str2);
                if (!str2.equals(zzf)) {
                    zzaW().zzg.zzb(zzgu.zzl(zzu.zzc()), "New GMP App Id passed in. Removing cached database data. appId");
                    zzaw zzawVar2 = this.zze;
                    zzaT(zzawVar2);
                    zzic zzicVar = (zzic) zzawVar2.$$delegate_0;
                    String zzc = zzu.zzc();
                    zzawVar2.zzay();
                    zzawVar2.zzg();
                    zzae.checkNotEmpty(zzc);
                    try {
                        SQLiteDatabase zze = zzawVar2.zze();
                        String[] strArr = {zzc};
                        int delete = zze.delete("events", "app_id=?", strArr) + zze.delete("user_attributes", "app_id=?", strArr) + zze.delete("conditional_properties", "app_id=?", strArr) + zze.delete("apps", "app_id=?", strArr) + zze.delete("raw_events", "app_id=?", strArr) + zze.delete("raw_events_metadata", "app_id=?", strArr) + zze.delete("event_filters", "app_id=?", strArr) + zze.delete("property_filters", "app_id=?", strArr) + zze.delete("audience_filter_values", "app_id=?", strArr) + zze.delete("consent_settings", "app_id=?", strArr) + zze.delete("default_event_params", "app_id=?", strArr) + zze.delete("trigger_uris", "app_id=?", strArr) + zze.delete("diagnostic_signals", "app_id=?", strArr);
                        zzahh.zza();
                        if (zzicVar.zzg.zzp(null, zzfy.zzbc)) {
                            delete += zze.delete("no_data_mode_events", "app_id=?", strArr);
                        }
                        if (delete > 0) {
                            zzgu zzguVar = zzicVar.zzi;
                            zzic.zzP(zzguVar);
                            zzguVar.zzl.zzc("Deleted application data. app, records", zzc, Integer.valueOf(delete));
                        }
                    } catch (SQLiteException e) {
                        zzgu zzguVar2 = zzicVar.zzi;
                        zzic.zzP(zzguVar2);
                        zzguVar2.zzd.zzc("Error deleting application data. appId, error", zzgu.zzl(zzc), e);
                    }
                    zzu = null;
                }
            }
        }
        if (zzu != null) {
            boolean z = (zzu.zzt() == -2147483648L || zzu.zzt() == zzrVar.zzj) ? false : true;
            String zzr = zzu.zzr();
            if (z || ((zzu.zzt() != -2147483648L || zzr == null || zzr.equals(zzrVar.zzc)) ? false : true)) {
                Bundle bundle = new Bundle();
                bundle.putString("_pv", zzr);
                zzbh zzbhVar = new zzbh("_au", new zzbf(bundle), "auto", j, 0L);
                if (zzd().zzp(null, zzfy.zzaX)) {
                    zzE(zzbhVar, zzrVar);
                } else {
                    zzF(zzbhVar, zzrVar);
                }
            }
        }
    }

    public final zzh zzap(zzr zzrVar) {
        boolean z;
        zzaX().zzg();
        zzu$3();
        zzae.checkNotNull(zzrVar);
        boolean z2 = zzrVar.zzn;
        String str = zzrVar.zza;
        zzae.checkNotEmpty(str);
        String str2 = zzrVar.zzt;
        boolean z3 = false;
        if (!str2.isEmpty()) {
            this.zzE.put(str, new zzpd(this, str2, 0));
        }
        zzaw zzawVar = this.zze;
        zzaT(zzawVar);
        zzh zzu = zzawVar.zzu(str);
        zzjl zzs = zzB(str).zzs(zzjl.zzf(100, zzrVar.zzs));
        String zzf = this.zzk.zzf(zzrVar, zzs);
        boolean z4 = true;
        zzjk zzjkVar = zzjk.AD_STORAGE;
        zzjk zzjkVar2 = zzjk.ANALYTICS_STORAGE;
        if (zzu == null) {
            zzu = new zzh(this.zzn, str);
            if (zzs.zzo(zzjkVar2)) {
                zzu.zze(zzK(zzs));
            }
            if (zzs.zzo(zzjkVar)) {
                zzu.zzk(zzf);
            }
        } else if (zzs.zzo(zzjkVar) && zzf != null && !zzf.equals(zzu.zzj())) {
            boolean isEmpty = TextUtils.isEmpty(zzu.zzj());
            zzu.zzk(zzf);
            if (z2 && !"00000000-0000-0000-0000-000000000000".equals(this.zzk.zzc(zzrVar, zzs).first) && !isEmpty) {
                if (zzs.zzo(zzjkVar2)) {
                    zzu.zze(zzK(zzs));
                    z = false;
                } else {
                    z = true;
                }
                zzaw zzawVar2 = this.zze;
                zzaT(zzawVar2);
                if (zzawVar2.zzm(str, "_id") != null) {
                    zzaw zzawVar3 = this.zze;
                    zzaT(zzawVar3);
                    if (zzawVar3.zzm(str, "_lair") == null) {
                        zzba().getClass();
                        zzpn zzpnVar = new zzpn(str, "auto", "_lair", System.currentTimeMillis(), 1L);
                        zzaw zzawVar4 = this.zze;
                        zzaT(zzawVar4);
                        zzawVar4.zzl(zzpnVar);
                    }
                }
                z3 = z;
            } else if (TextUtils.isEmpty(zzu.zzd()) && zzs.zzo(zzjkVar2)) {
                zzu.zze(zzK(zzs));
            }
        } else if (TextUtils.isEmpty(zzu.zzd()) && zzs.zzo(zzjkVar2)) {
            zzu.zze(zzK(zzs));
        }
        zzu.zzg(zzrVar.zzb);
        String str3 = zzrVar.zzk;
        if (!TextUtils.isEmpty(str3)) {
            zzu.zzm(str3);
        }
        long j = zzrVar.zze;
        if (j != 0) {
            zzu.zzy(j);
        }
        String str4 = zzrVar.zzc;
        if (!TextUtils.isEmpty(str4)) {
            zzu.zzs(str4);
        }
        zzu.zzu(zzrVar.zzj);
        String str5 = zzrVar.zzd;
        if (str5 != null) {
            zzu.zzw(str5);
        }
        zzu.zzA(zzrVar.zzf);
        zzu.zzE(zzrVar.zzh);
        String str6 = zzrVar.zzg;
        if (!TextUtils.isEmpty(str6)) {
            zzu.zzab(str6);
        }
        zzu.zzad(z2);
        zzu.zzaf(zzrVar.zzp);
        zzu.zzC(zzrVar.zzq);
        zzu.zzi(zzrVar.zzu);
        zzahk.zza();
        if (zzd().zzp(null, zzfy.zzaL)) {
            zzu.zzah(zzrVar.zzr);
        } else {
            zzahk.zza();
            if (zzd().zzp(null, zzfy.zzaK)) {
                zzu.zzah(null);
            }
        }
        zzu.zzaj(zzrVar.zzv);
        zzu.zzaz(zzrVar.zzB);
        zzaif.zza();
        if (zzd().zzp(null, zzfy.zzaO)) {
            zzu.zzap(zzrVar.zzz);
        }
        zzu.zzal(zzrVar.zzw);
        zzu.zzaG(zzrVar.zzC);
        zzu.zzaK(zzrVar.zzE);
        if (zzu.zza()) {
            z4 = z3;
        } else if (!z3) {
            return zzu;
        }
        zzaw zzawVar5 = this.zze;
        zzaT(zzawVar5);
        zzawVar5.zzv(zzu, z4);
        return zzu;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    public final List zzar(Bundle bundle, zzr zzrVar) {
        int[] iArr;
        zzaX().zzg();
        zzaif.zza();
        zzal zzd = zzd();
        String str = zzrVar.zza;
        if (!zzd.zzp(str, zzfy.zzaO) || str == null) {
            return new ArrayList();
        }
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("uriSources");
            long[] longArray = bundle.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    zzaW().zzd.zza("Uri sources and timestamps do not match");
                } else {
                    int i = 0;
                    while (i < intArray.length) {
                        zzaw zzawVar = this.zze;
                        zzaT(zzawVar);
                        zzic zzicVar = (zzic) zzawVar.$$delegate_0;
                        int i2 = intArray[i];
                        long j = longArray[i];
                        zzae.checkNotEmpty(str);
                        zzawVar.zzg();
                        zzawVar.zzay();
                        try {
                            iArr = intArray;
                            try {
                                int delete = zzawVar.zze().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i2), String.valueOf(j)});
                                zzgu zzguVar = zzicVar.zzi;
                                zzic.zzP(zzguVar);
                                zzgs zzgsVar = zzguVar.zzl;
                                StringBuilder sb = new StringBuilder(String.valueOf(delete).length() + 46);
                                sb.append("Pruned ");
                                sb.append(delete);
                                sb.append(" trigger URIs. appId, source, timestamp");
                                zzgsVar.zzd(sb.toString(), str, Integer.valueOf(i2), Long.valueOf(j));
                            } catch (SQLiteException e) {
                                e = e;
                                zzgu zzguVar2 = zzicVar.zzi;
                                zzic.zzP(zzguVar2);
                                zzguVar2.zzd.zzc("Error pruning trigger URIs. appId", zzgu.zzl(str), e);
                                i++;
                                intArray = iArr;
                            }
                        } catch (SQLiteException e2) {
                            e = e2;
                            iArr = intArray;
                        }
                        i++;
                        intArray = iArr;
                    }
                }
            }
        }
        zzaw zzawVar2 = this.zze;
        zzaT(zzawVar2);
        String str2 = zzrVar.zza;
        zzae.checkNotEmpty(str2);
        zzawVar2.zzg();
        zzawVar2.zzay();
        ?? arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = zzawVar2.zze().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str2}, null, null, "rowid", null);
                if (cursor.moveToFirst()) {
                    do {
                        String string2 = cursor.getString(0);
                        if (string2 == null) {
                            string2 = "";
                        }
                        arrayList.add(new zzoh(string2, cursor.getLong(1), cursor.getInt(2)));
                    } while (cursor.moveToNext());
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            zzgu zzguVar3 = ((zzic) zzawVar2.$$delegate_0).zzi;
            zzic.zzP(zzguVar3);
            zzguVar3.zzd.zzc("Error querying trigger uris. appId", zzgu.zzl(str2), e3);
            arrayList = Collections.EMPTY_LIST;
        }
        if (cursor != null) {
            cursor.close();
        }
        return arrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzjg
    public final DefaultClock zzba() {
        zzic zzicVar = this.zzn;
        zzae.checkNotNull(zzicVar);
        return zzicVar.zzn;
    }

    public final zzal zzd() {
        zzic zzicVar = this.zzn;
        zzae.checkNotNull(zzicVar);
        return zzicVar.zzg;
    }

    public final zzht zzh() {
        zzht zzhtVar = this.zzc;
        zzaT(zzhtVar);
        return zzhtVar;
    }

    public final zzaw zzj() {
        zzaw zzawVar = this.zze;
        zzaT(zzawVar);
        return zzawVar;
    }

    public final zzhb zzk() {
        zzhb zzhbVar = this.zzf;
        if (zzhbVar != null) {
            return zzhbVar;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Network broadcast receiver not created");
        return null;
    }

    public final zzad zzm() {
        zzad zzadVar = this.zzh;
        zzaT(zzadVar);
        return zzadVar;
    }

    public final zzpk zzp() {
        zzpk zzpkVar = this.zzi;
        zzaT(zzpkVar);
        return zzpkVar;
    }

    public final zzpp zzt() {
        zzic zzicVar = this.zzn;
        zzae.checkNotNull(zzicVar);
        zzpp zzppVar = zzicVar.zzl;
        zzic.zzN(zzppVar);
        return zzppVar;
    }

    public final void zzu$3() {
        if (this.zzo.get()) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$1("UploadController is not initialized");
    }

    public final void zzv(zzr zzrVar) {
        zzaX().zzg();
        zzu$3();
        String str = zzrVar.zza;
        zzae.checkNotEmpty(str);
        zzjl zzf = zzjl.zzf(zzrVar.zzx, zzrVar.zzs);
        zzB(str);
        zzaW().zzl.zzc("Setting storage consent for package", str, zzf);
        zzaX().zzg();
        zzu$3();
        this.zzC.put(str, zzf);
        zzaw zzawVar = this.zze;
        zzaT(zzawVar);
        zzawVar.zzaa(str, zzf);
    }

    public final void zzw(zzr zzrVar) {
        zzaX().zzg();
        zzu$3();
        String str = zzrVar.zza;
        zzae.checkNotEmpty(str);
        zzba zzg = zzba.zzg(zzrVar.zzy);
        zzaW().zzl.zzc("Setting DMA consent for package", str, zzg);
        zzaX().zzg();
        zzu$3();
        zzji zzc = zzba.zzh(100, zzy(str)).zzc();
        this.zzD.put(str, zzg);
        zzaw zzawVar = this.zze;
        zzaT(zzawVar);
        zzae.checkNotNull(str);
        zzae.checkNotNull(zzg);
        zzawVar.zzg();
        zzawVar.zzay();
        zzjl zzY = zzawVar.zzY(str);
        zzjl zzjlVar = zzjl.zza;
        if (zzY == zzjlVar) {
            zzawVar.zzaa(str, zzjlVar);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("dma_consent_settings", zzg.zzc);
        zzawVar.zzaD(contentValues);
        zzji zzc2 = zzba.zzh(100, zzy(str)).zzc();
        zzaX().zzg();
        zzu$3();
        zzji zzjiVar = zzji.GRANTED;
        zzji zzjiVar2 = zzji.DENIED;
        boolean z = zzc == zzjiVar2 && zzc2 == zzjiVar;
        boolean z2 = zzc == zzjiVar && zzc2 == zzjiVar2;
        if (z || z2) {
            zzaW().zzl.zzb(str, "Generated _dcu event for");
            Bundle bundle = new Bundle();
            zzaw zzawVar2 = this.zze;
            zzaT(zzawVar2);
            if (zzawVar2.zzw(zzC(), str, false, false, false, false).zzf < zzd().zzm(str, zzfy.zzal)) {
                bundle.putLong("_r", 1L);
                zzaw zzawVar3 = this.zze;
                zzaT(zzawVar3);
                zzaW().zzl.zzc("_dcu realtime event count", str, Long.valueOf(zzawVar3.zzw(zzC(), str, false, false, true, false).zzf));
            }
            this.zzK.zza(str, "_dcu", bundle);
        }
    }

    public final zzba zzx(String str) {
        zzaX().zzg();
        zzu$3();
        HashMap hashMap = this.zzD;
        zzba zzbaVar = (zzba) hashMap.get(str);
        if (zzbaVar != null) {
            return zzbaVar;
        }
        zzaw zzawVar = this.zze;
        zzaT(zzawVar);
        zzae.checkNotNull(str);
        zzawVar.zzg();
        zzawVar.zzay();
        zzba zzg = zzba.zzg(zzawVar.zzaC("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}));
        hashMap.put(str, zzg);
        return zzg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Bundle zzy(String str) {
        zzaX().zzg();
        zzu$3();
        zzht zzhtVar = this.zzc;
        zzaT(zzhtVar);
        if (zzhtVar.zzy(str) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        zzjl zzB = zzB(str);
        Bundle bundle2 = new Bundle();
        Iterator it = zzB.zzb.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            int ordinal = ((zzji) entry.getValue()).ordinal();
            String str2 = ordinal != 2 ? ordinal != 3 ? null : "granted" : "denied";
            if (str2 != null) {
                bundle2.putString(((zzjk) entry.getKey()).zze, str2);
            }
        }
        bundle.putAll(bundle2);
        zzba zzz = zzz(str, zzx(str), zzB, new n.b());
        Bundle bundle3 = new Bundle();
        for (Map.Entry entry2 : zzz.zzf.entrySet()) {
            int ordinal2 = ((zzji) entry2.getValue()).ordinal();
            String str3 = ordinal2 != 2 ? ordinal2 != 3 ? null : "granted" : "denied";
            if (str3 != null) {
                bundle3.putString(((zzjk) entry2.getKey()).zze, str3);
            }
        }
        Boolean bool = zzz.zzd;
        if (bool != null) {
            bundle3.putString("is_dma_region", bool.toString());
        }
        String str4 = zzz.zze;
        if (str4 != null) {
            bundle3.putString("cps_display_str", str4);
        }
        bundle.putAll(bundle3);
        zzaw zzawVar = this.zze;
        zzaT(zzawVar);
        zzpn zzm = zzawVar.zzm(str, "_npa");
        bundle.putString("ad_personalization", 1 != (zzm != null ? zzm.zze.equals(1L) : zzaD(str, new n.b())) ? "granted" : "denied");
        return bundle;
    }

    public final zzba zzz(String str, zzba zzbaVar, zzjl zzjlVar, n.b bVar) {
        zzjk zzjkVar;
        zzji zzB;
        zzht zzhtVar = this.zzc;
        zzaT(zzhtVar);
        com.google.android.gms.internal.measurement.zzgf zzy = zzhtVar.zzy(str);
        int i = 90;
        zzji zzjiVar = zzji.DENIED;
        zzjk zzjkVar2 = zzjk.AD_USER_DATA;
        if (zzy == null) {
            if (zzbaVar.zzc() == zzjiVar) {
                i = zzbaVar.zzb;
                bVar.zzb(zzjkVar2, i);
            } else {
                bVar.zzc(zzjkVar2, zzam.FAILSAFE);
            }
            return new zzba(Boolean.FALSE, i, Boolean.TRUE, "-");
        }
        zzji zzc = zzbaVar.zzc();
        zzji zzjiVar2 = zzji.GRANTED;
        if (zzc == zzjiVar2 || zzc == zzjiVar) {
            i = zzbaVar.zzb;
            bVar.zzb(zzjkVar2, i);
        } else {
            zzji zzjiVar3 = zzji.POLICY;
            zzji zzjiVar4 = zzji.UNINITIALIZED;
            if (zzc != zzjiVar3 || (zzB = zzhtVar.zzB(str, zzjkVar2)) == zzjiVar4) {
                zzhtVar.zzg();
                zzhtVar.zzF(str);
                com.google.android.gms.internal.measurement.zzgf zzy2 = zzhtVar.zzy(str);
                if (zzy2 != null) {
                    for (zzfw zzfwVar : zzy2.zzb()) {
                        if (zzjkVar2 == zzht.zzK(zzfwVar.zzb())) {
                            zzjkVar = zzht.zzK(zzfwVar.zzc$1());
                            break;
                        }
                    }
                }
                zzjkVar = null;
                EnumMap enumMap = zzjlVar.zzb;
                zzjk zzjkVar3 = zzjk.AD_STORAGE;
                zzji zzjiVar5 = (zzji) enumMap.get(zzjkVar3);
                if (zzjiVar5 != null) {
                    zzjiVar4 = zzjiVar5;
                }
                boolean z = zzjiVar4 == zzjiVar2 || zzjiVar4 == zzjiVar;
                if (zzjkVar == zzjkVar3 && z) {
                    bVar.zzc(zzjkVar2, zzam.REMOTE_DELEGATION);
                    zzc = zzjiVar4;
                } else {
                    bVar.zzc(zzjkVar2, zzam.REMOTE_DEFAULT);
                    zzc = true != zzhtVar.zzw(str, zzjkVar2) ? zzjiVar : zzjiVar2;
                }
            } else {
                bVar.zzc(zzjkVar2, zzam.REMOTE_ENFORCED_DEFAULT);
                zzc = zzB;
            }
        }
        zzhtVar.zzg();
        zzhtVar.zzF(str);
        com.google.android.gms.internal.measurement.zzgf zzy3 = zzhtVar.zzy(str);
        boolean z2 = zzy3 == null || !zzy3.zzd() || zzy3.zze();
        zzaT(zzhtVar);
        zzhtVar.zzg();
        zzhtVar.zzF(str);
        TreeSet treeSet = new TreeSet();
        com.google.android.gms.internal.measurement.zzgf zzy4 = zzhtVar.zzy(str);
        if (zzy4 != null) {
            Iterator it = zzy4.zzc().iterator();
            while (it.hasNext()) {
                treeSet.add(((com.google.android.gms.internal.measurement.zzgc) it.next()).zza());
            }
        }
        if (zzc == zzjiVar || treeSet.isEmpty()) {
            return new zzba(Boolean.FALSE, i, Boolean.valueOf(z2), "-");
        }
        return new zzba(Boolean.TRUE, i, Boolean.valueOf(z2), z2 ? TextUtils.join("", treeSet) : "");
    }
}
