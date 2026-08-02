package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.fillr.browsersdk.Fillr;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.DefaultClock;
import com.plaid.internal.EnumC0170g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zznl extends zzg {
    public final zznf zza;
    public zzgb zzb;
    public volatile Boolean zzc;
    public final zzmm zzd;
    public ScheduledExecutorService zze;
    public final com.google.android.gms.ads.identifier.zzc zzf;
    public final ArrayList zzg;
    public final zzmm zzh;

    public zznl(zzic zzicVar) {
        super(zzicVar);
        this.zzg = new ArrayList();
        this.zzf = new com.google.android.gms.ads.identifier.zzc(zzicVar.zzn);
        this.zza = new zznf(this);
        this.zzd = new zzmm(this, zzicVar, 0);
        this.zzh = new zzmm(this, zzicVar, 1);
    }

    public final void zzC(AtomicReference atomicReference) {
        zzg();
        zzb$1();
        zzaf(new Fillr.AnonymousClass2(this, atomicReference, zzah(false)));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzH(Bundle bundle) {
        boolean z;
        boolean zzs;
        zzg();
        zzb$1();
        zzbf zzbfVar = new zzbf(bundle);
        zzad$1();
        zzic zzicVar = (zzic) this.$$delegate_0;
        if (zzicVar.zzg.zzp(null, zzfy.zzaW)) {
            zzgl zzm = zzicVar.zzm();
            zzic zzicVar2 = (zzic) zzm.$$delegate_0;
            zzpp zzppVar = zzicVar2.zzl;
            zzgu zzguVar = zzicVar2.zzi;
            zzic.zzN(zzppVar);
            byte[] zzah = zzpp.zzah(zzbfVar);
            if (zzah == null) {
                zzic.zzP(zzguVar);
                zzguVar.zze.zza("Null default event parameters; not writing to database");
            } else if (zzah.length > 131072) {
                zzic.zzP(zzguVar);
                zzguVar.zze.zza("Default event parameters too long for local database. Sending directly to service");
            } else {
                zzs = zzm.zzs(4, zzah);
                if (zzs) {
                    z = true;
                    zzaf(new zzk(this, zzah(false), z, zzbfVar, bundle));
                }
            }
            zzs = false;
            if (zzs) {
            }
        }
        z = false;
        zzaf(new zzk(this, zzah(false), z, zzbfVar, bundle));
    }

    public final void zzI() {
        zzg();
        zzb$1();
        if (zzh()) {
            return;
        }
        if (zzK()) {
            zznf zznfVar = this.zza;
            zznl zznlVar = zznfVar.zza;
            zznlVar.zzg();
            Context context = ((zzic) zznlVar.$$delegate_0).zzd;
            synchronized (zznfVar) {
                try {
                    if (zznfVar.zzb) {
                        zzgu zzguVar = ((zzic) zznfVar.zza.$$delegate_0).zzi;
                        zzic.zzP(zzguVar);
                        zzguVar.zzl.zza("Connection attempt already in progress");
                        return;
                    } else {
                        if (zznfVar.zzc != null && (zznfVar.zzc.isConnecting() || zznfVar.zzc.isConnected())) {
                            zzgu zzguVar2 = ((zzic) zznfVar.zza.$$delegate_0).zzi;
                            zzic.zzP(zzguVar2);
                            zzguVar2.zzl.zza("Already awaiting connection attempt");
                            return;
                        }
                        zznfVar.zzc = new zzgo(context, Looper.getMainLooper(), zznfVar, zznfVar);
                        zzgu zzguVar3 = ((zzic) zznfVar.zza.$$delegate_0).zzi;
                        zzic.zzP(zzguVar3);
                        zzguVar3.zzl.zza("Connecting to remote service");
                        zznfVar.zzb = true;
                        zzae.checkNotNull(zznfVar.zzc);
                        zznfVar.zzc.checkAvailabilityAndConnect();
                        return;
                    }
                } finally {
                }
            }
        }
        zzic zzicVar = (zzic) this.$$delegate_0;
        if (zzicVar.zzg.zzE()) {
            return;
        }
        List<ResolveInfo> queryIntentServices = zzicVar.zzd.getPackageManager().queryIntentServices(new Intent().setClassName(zzicVar.zzd, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            zzgu zzguVar4 = zzicVar.zzi;
            zzic.zzP(zzguVar4);
            zzguVar4.zzd.zza("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(zzicVar.zzd, "com.google.android.gms.measurement.AppMeasurementService"));
        zznf zznfVar2 = this.zza;
        zznl zznlVar2 = zznfVar2.zza;
        zznlVar2.zzg();
        Context context2 = ((zzic) zznlVar2.$$delegate_0).zzd;
        ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
        synchronized (zznfVar2) {
            try {
                boolean z = zznfVar2.zzb;
                zznl zznlVar3 = zznfVar2.zza;
                if (z) {
                    zzgu zzguVar5 = ((zzic) zznlVar3.$$delegate_0).zzi;
                    zzic.zzP(zzguVar5);
                    zzguVar5.zzl.zza("Connection attempt already in progress");
                } else {
                    zzgu zzguVar6 = ((zzic) zznlVar3.$$delegate_0).zzi;
                    zzic.zzP(zzguVar6);
                    zzguVar6.zzl.zza("Using local app measurement service");
                    zznfVar2.zzb = true;
                    connectionTracker.bindService(context2, intent, zznlVar3.zza, EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE);
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzK() {
        zzg();
        zzb$1();
        if (this.zzc == null) {
            zzg();
            zzb$1();
            zzic zzicVar = (zzic) this.$$delegate_0;
            zzhh zzhhVar = zzicVar.zzh;
            zzic.zzN(zzhhVar);
            zzhhVar.zzg();
            boolean z = false;
            Boolean valueOf = !zzhhVar.zzd().contains("use_service") ? null : Boolean.valueOf(zzhhVar.zzd().getBoolean("use_service", false));
            if (valueOf == null || !valueOf.booleanValue()) {
                zzgi zzv = ((zzic) this.$$delegate_0).zzv();
                zzv.zzb$1();
                if (zzv.zzl != 1) {
                    zzgu zzguVar = zzicVar.zzi;
                    zzic.zzP(zzguVar);
                    zzguVar.zzl.zza("Checking service availability");
                    zzpp zzppVar = zzicVar.zzl;
                    zzic.zzN(zzppVar);
                    int isGooglePlayServicesAvailable = GoogleApiAvailabilityLight.zza.isGooglePlayServicesAvailable(((zzic) zzppVar.$$delegate_0).zzd, 12451000);
                    if (isGooglePlayServicesAvailable != 0) {
                        if (isGooglePlayServicesAvailable == 1) {
                            zzgu zzguVar2 = zzicVar.zzi;
                            zzic.zzP(zzguVar2);
                            zzguVar2.zzl.zza("Service missing");
                        } else if (isGooglePlayServicesAvailable != 2) {
                            if (isGooglePlayServicesAvailable != 3) {
                                zzgu zzguVar3 = zzicVar.zzi;
                                if (isGooglePlayServicesAvailable == 9) {
                                    zzic.zzP(zzguVar3);
                                    zzguVar3.zzg.zza("Service invalid");
                                } else if (isGooglePlayServicesAvailable != 18) {
                                    zzic.zzP(zzguVar3);
                                    zzguVar3.zzg.zzb(Integer.valueOf(isGooglePlayServicesAvailable), "Unexpected service status");
                                } else {
                                    zzic.zzP(zzguVar3);
                                    zzguVar3.zzg.zza("Service updating");
                                }
                            } else {
                                zzgu zzguVar4 = zzicVar.zzi;
                                zzic.zzP(zzguVar4);
                                zzguVar4.zzg.zza("Service disabled");
                            }
                            r2 = false;
                        } else {
                            zzgu zzguVar5 = zzicVar.zzi;
                            zzic.zzP(zzguVar5);
                            zzguVar5.zzk.zza("Service container out of date");
                            zzpp zzppVar2 = zzicVar.zzl;
                            zzic.zzN(zzppVar2);
                            if (zzppVar2.zzak() >= 17443) {
                                z = valueOf == null;
                                r2 = false;
                            }
                        }
                        if (z && zzicVar.zzg.zzE()) {
                            zzgu zzguVar6 = zzicVar.zzi;
                            zzic.zzP(zzguVar6);
                            zzguVar6.zzd.zza("No way to upload. Consider using the full version of Analytics");
                        } else if (r2) {
                            zzhh zzhhVar2 = zzicVar.zzh;
                            zzic.zzN(zzhhVar2);
                            zzhhVar2.zzg();
                            SharedPreferences.Editor edit = zzhhVar2.zzd().edit();
                            edit.putBoolean("use_service", z);
                            edit.apply();
                        }
                        r2 = z;
                    } else {
                        zzgu zzguVar7 = zzicVar.zzi;
                        zzic.zzP(zzguVar7);
                        zzguVar7.zzl.zza("Service available");
                    }
                }
                z = true;
                if (z) {
                }
                if (r2) {
                }
                r2 = z;
            }
            this.zzc = Boolean.valueOf(r2);
        }
        return this.zzc.booleanValue();
    }

    public final void zzM() {
        zzg();
        zzb$1();
        zznf zznfVar = this.zza;
        if (zznfVar.zzc != null && (zznfVar.zzc.isConnected() || zznfVar.zzc.isConnecting())) {
            zznfVar.zzc.disconnect();
        }
        zznfVar.zzc = null;
        try {
            ConnectionTracker.getInstance().unbindService(((zzic) this.$$delegate_0).zzd, zznfVar);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.zzb = null;
    }

    public final boolean zzO() {
        zzg();
        zzb$1();
        if (!zzK()) {
            return true;
        }
        zzpp zzppVar = ((zzic) this.$$delegate_0).zzl;
        zzic.zzN(zzppVar);
        return zzppVar.zzak() >= ((Integer) zzfy.zzaJ.zzb(null)).intValue();
    }

    public final boolean zzP() {
        zzg();
        zzb$1();
        if (!zzK()) {
            return true;
        }
        zzpp zzppVar = ((zzic) this.$$delegate_0).zzl;
        zzic.zzN(zzppVar);
        return zzppVar.zzak() >= 241200;
    }

    public final void zzW(ComponentName componentName) {
        zzg();
        if (this.zzb != null) {
            this.zzb = null;
            zzgu zzguVar = ((zzic) this.$$delegate_0).zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzl.zzb(componentName, "Disconnected from device MeasurementService");
            zzg();
            zzI();
        }
    }

    public final void zzad$1() {
        ((zzic) this.$$delegate_0).getClass();
    }

    public final void zzae() {
        zzg();
        com.google.android.gms.ads.identifier.zzc zzcVar = this.zzf;
        ((DefaultClock) zzcVar.zza).getClass();
        zzcVar.zzb = SystemClock.elapsedRealtime();
        ((zzic) this.$$delegate_0).getClass();
        this.zzd.zzb(((Long) zzfy.zzY.zzb(null)).longValue());
    }

    public final void zzaf(Runnable runnable) {
        zzg();
        if (zzh()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.zzg;
        long size = arrayList.size();
        zzic zzicVar = (zzic) this.$$delegate_0;
        zzicVar.getClass();
        if (size >= 1000) {
            zzgu zzguVar = zzicVar.zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzd.zza("Discarding data. Max runnable queue size reached");
        } else {
            arrayList.add(runnable);
            this.zzh.zzb(60000L);
            zzI();
        }
    }

    public final void zzag$2() {
        zzg();
        zzic zzicVar = (zzic) this.$$delegate_0;
        zzgu zzguVar = zzicVar.zzi;
        zzic.zzP(zzguVar);
        zzgs zzgsVar = zzguVar.zzl;
        ArrayList arrayList = this.zzg;
        zzgsVar.zzb(Integer.valueOf(arrayList.size()), "Processing queued up service tasks");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e) {
                zzgu zzguVar2 = zzicVar.zzi;
                zzic.zzP(zzguVar2);
                zzguVar2.zzd.zzb(e, "Task exception while flushing queue");
            }
        }
        arrayList.clear();
        this.zzh.zzd();
    }

    public final zzr zzah(boolean z) {
        long abs;
        Pair pair;
        zzic zzicVar = (zzic) this.$$delegate_0;
        zzicVar.getClass();
        zzgi zzv = zzicVar.zzv();
        String str = null;
        if (z) {
            zzgu zzguVar = zzicVar.zzi;
            zzic.zzP(zzguVar);
            zzic zzicVar2 = (zzic) zzguVar.$$delegate_0;
            zzhh zzhhVar = zzicVar2.zzh;
            zzic.zzN(zzhhVar);
            if (zzhhVar.zzb != null) {
                zzhh zzhhVar2 = zzicVar2.zzh;
                zzic.zzN(zzhhVar2);
                zzhf zzhfVar = zzhhVar2.zzb;
                zzhh zzhhVar3 = (zzhh) zzhfVar.zzb;
                zzhhVar3.zzg();
                zzhhVar3.zzg();
                long j = ((zzhh) zzhfVar.zzb).zzd().getLong((String) zzhfVar.zza, 0L);
                if (j == 0) {
                    zzhfVar.zzc();
                    abs = 0;
                } else {
                    ((zzic) zzhhVar3.$$delegate_0).zzn.getClass();
                    abs = Math.abs(j - System.currentTimeMillis());
                }
                long j2 = zzhfVar.zze;
                if (abs >= j2) {
                    if (abs > j2 + j2) {
                        zzhfVar.zzc();
                    } else {
                        String string2 = zzhhVar3.zzd().getString((String) zzhfVar.zzd, null);
                        long j3 = zzhhVar3.zzd().getLong((String) zzhfVar.zzc, 0L);
                        zzhfVar.zzc();
                        pair = (string2 == null || j3 <= 0) ? zzhh.zza : new Pair(string2, Long.valueOf(j3));
                        if (pair != null && pair != zzhh.zza) {
                            String valueOf = String.valueOf(pair.second);
                            String str2 = (String) pair.first;
                            str = Recorder$$ExternalSyntheticOutline2.m(new StringBuilder(valueOf.length() + 1 + String.valueOf(str2).length()), valueOf, ":", str2);
                        }
                    }
                }
                pair = null;
                if (pair != null) {
                    String valueOf2 = String.valueOf(pair.second);
                    String str22 = (String) pair.first;
                    str = Recorder$$ExternalSyntheticOutline2.m(new StringBuilder(valueOf2.length() + 1 + String.valueOf(str22).length()), valueOf2, ":", str22);
                }
            }
        }
        return zzv.zzh(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    public final boolean zze() {
        return false;
    }

    public final boolean zzh() {
        zzg();
        zzb$1();
        return this.zzb != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x04de A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x04a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0440 A[Catch: all -> 0x047c, TRY_ENTER, TryCatch #58 {all -> 0x047c, blocks: (B:179:0x046c, B:202:0x0440, B:204:0x0446, B:205:0x0449, B:193:0x048d, B:333:0x0375, B:337:0x037f, B:338:0x0390), top: B:178:0x046c }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0626  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x02da A[Catch: all -> 0x01fc, SQLiteException -> 0x02b4, SQLiteDatabaseLockedException -> 0x02b9, SQLiteFullException -> 0x02bd, TryCatch #59 {all -> 0x01fc, blocks: (B:159:0x01eb, B:161:0x01f0, B:214:0x021a, B:215:0x021d, B:212:0x0216, B:222:0x0223, B:225:0x0237, B:227:0x024f, B:230:0x0258, B:231:0x025b, B:233:0x0249, B:236:0x025f, B:239:0x0273, B:241:0x028b, B:246:0x0295, B:247:0x0298, B:244:0x0285, B:257:0x029c, B:265:0x02b0, B:267:0x02da, B:277:0x02e4, B:278:0x02e7, B:283:0x02d4, B:252:0x02f6, B:254:0x0301, B:330:0x035f), top: B:158:0x01eb }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x059f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x04d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzm(zzgb zzgbVar, AbstractSafeParcelable abstractSafeParcelable, zzr zzrVar) {
        ArrayList arrayList;
        DefaultClock defaultClock;
        zzgu zzguVar;
        int i;
        int i2;
        Cursor cursor;
        SQLiteDatabase sQLiteDatabase;
        String str;
        int i3;
        String str2;
        String str3;
        int i4;
        Cursor cursor2;
        Cursor cursor3;
        long j;
        String str4;
        String[] strArr;
        int i5;
        long j2;
        String str5;
        Parcel obtain;
        zzbf zzbfVar;
        int i6;
        zzah zzahVar;
        zzpl zzplVar;
        int i7;
        int size;
        int i8;
        int i9;
        zzgu zzguVar2;
        long j3;
        long j4;
        zzg();
        zzb$1();
        zzad$1();
        zzic zzicVar = (zzic) this.$$delegate_0;
        zzicVar.getClass();
        zzal zzalVar = zzicVar.zzg;
        zzgu zzguVar3 = zzicVar.zzi;
        DefaultClock defaultClock2 = zzicVar.zzn;
        zzr zzrVar2 = zzrVar;
        int i10 = 100;
        int i11 = 0;
        for (int i12 = 100; i11 < 1001 && i10 == i12; i12 = 100) {
            ArrayList arrayList2 = new ArrayList();
            zzgl zzm = zzicVar.zzm();
            String str6 = "entry";
            String str7 = "type";
            int i13 = i12;
            String str8 = "rowid";
            zzic zzicVar2 = (zzic) zzm.$$delegate_0;
            zzm.zzg();
            zzic zzicVar3 = zzicVar;
            if (zzm.zzc) {
                zzguVar = zzguVar3;
                defaultClock = defaultClock2;
                i = i11;
            } else {
                arrayList = new ArrayList();
                defaultClock = defaultClock2;
                if (((zzic) zzm.$$delegate_0).zzd.getDatabasePath("google_app_measurement_local.db").exists()) {
                    int i14 = 5;
                    zzguVar = zzguVar3;
                    int i15 = 5;
                    i = i11;
                    int i16 = 0;
                    while (true) {
                        if (i16 >= i14) {
                            i2 = 0;
                            zzgu zzguVar4 = zzicVar2.zzi;
                            zzic.zzP(zzguVar4);
                            zzguVar4.zzg.zza("Failed to read events from database in reasonable time");
                            arrayList = null;
                            break;
                        }
                        try {
                            SQLiteDatabase zzp = zzm.zzp();
                            if (zzp == null) {
                                try {
                                    try {
                                        zzm.zzc = true;
                                        break;
                                    } catch (Throwable th) {
                                        th = th;
                                        sQLiteDatabase = zzp;
                                        cursor = null;
                                        if (cursor != null) {
                                        }
                                        if (sQLiteDatabase != null) {
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteDatabaseLockedException unused) {
                                    str = str8;
                                    i3 = i16;
                                    str3 = str7;
                                    sQLiteDatabase = zzp;
                                    i4 = 5;
                                    str2 = str6;
                                    cursor2 = null;
                                    try {
                                        SystemClock.sleep(i15);
                                        i15 += 20;
                                        if (cursor2 != null) {
                                        }
                                        if (sQLiteDatabase == null) {
                                        }
                                        sQLiteDatabase.close();
                                        i16 = i3 + 1;
                                        i14 = i4;
                                        str6 = str2;
                                        str7 = str3;
                                        str8 = str;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        cursor = cursor2;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.close();
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteFullException e) {
                                    e = e;
                                    str = str8;
                                    i3 = i16;
                                    str3 = str7;
                                    sQLiteDatabase = zzp;
                                    i4 = 5;
                                    str2 = str6;
                                    cursor2 = null;
                                    zzgu zzguVar5 = zzicVar2.zzi;
                                    zzic.zzP(zzguVar5);
                                    zzguVar5.zzd.zzb(e, "Error reading entries from local database");
                                    zzm.zzc = true;
                                    if (cursor2 != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i16 = i3 + 1;
                                    i14 = i4;
                                    str6 = str2;
                                    str7 = str3;
                                    str8 = str;
                                } catch (SQLiteException e2) {
                                    e = e2;
                                    str = str8;
                                    i3 = i16;
                                    str3 = str7;
                                    sQLiteDatabase = zzp;
                                    i4 = 5;
                                    str2 = str6;
                                    cursor2 = null;
                                    if (sQLiteDatabase != null) {
                                    }
                                    zzgu zzguVar6 = zzicVar2.zzi;
                                    zzic.zzP(zzguVar6);
                                    zzguVar6.zzd.zzb(e, "Error reading entries from local database");
                                    zzm.zzc = true;
                                    if (cursor2 != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i16 = i3 + 1;
                                    i14 = i4;
                                    str6 = str2;
                                    str7 = str3;
                                    str8 = str;
                                }
                            } else {
                                zzp.beginTransaction();
                                try {
                                    cursor3 = zzp.query("messages", new String[]{str8}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
                                    try {
                                        long j5 = -1;
                                        if (cursor3.moveToFirst()) {
                                            i3 = i16;
                                            try {
                                                j = cursor3.getLong(0);
                                                try {
                                                    cursor3.close();
                                                } catch (SQLiteDatabaseLockedException unused2) {
                                                    str = str8;
                                                    str3 = str7;
                                                    sQLiteDatabase = zzp;
                                                    i4 = 5;
                                                    str2 = str6;
                                                    cursor2 = null;
                                                    SystemClock.sleep(i15);
                                                    i15 += 20;
                                                    if (cursor2 != null) {
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                    }
                                                    sQLiteDatabase.close();
                                                    i16 = i3 + 1;
                                                    i14 = i4;
                                                    str6 = str2;
                                                    str7 = str3;
                                                    str8 = str;
                                                } catch (SQLiteFullException e3) {
                                                    e = e3;
                                                    str = str8;
                                                    str3 = str7;
                                                    sQLiteDatabase = zzp;
                                                    i4 = 5;
                                                    str2 = str6;
                                                    cursor2 = null;
                                                    zzgu zzguVar52 = zzicVar2.zzi;
                                                    zzic.zzP(zzguVar52);
                                                    zzguVar52.zzd.zzb(e, "Error reading entries from local database");
                                                    zzm.zzc = true;
                                                    if (cursor2 != null) {
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                    }
                                                    sQLiteDatabase.close();
                                                    i16 = i3 + 1;
                                                    i14 = i4;
                                                    str6 = str2;
                                                    str7 = str3;
                                                    str8 = str;
                                                } catch (SQLiteException e4) {
                                                    e = e4;
                                                    str = str8;
                                                    str3 = str7;
                                                    sQLiteDatabase = zzp;
                                                    i4 = 5;
                                                    str2 = str6;
                                                    cursor2 = null;
                                                    if (sQLiteDatabase != null) {
                                                    }
                                                    zzgu zzguVar62 = zzicVar2.zzi;
                                                    zzic.zzP(zzguVar62);
                                                    zzguVar62.zzd.zzb(e, "Error reading entries from local database");
                                                    zzm.zzc = true;
                                                    if (cursor2 != null) {
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                    }
                                                    sQLiteDatabase.close();
                                                    i16 = i3 + 1;
                                                    i14 = i4;
                                                    str6 = str2;
                                                    str7 = str3;
                                                    str8 = str;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                str = str8;
                                                str3 = str7;
                                                sQLiteDatabase = zzp;
                                                i4 = 5;
                                                str2 = str6;
                                                if (cursor3 != null) {
                                                    try {
                                                        cursor3.close();
                                                    } catch (SQLiteDatabaseLockedException unused3) {
                                                        cursor2 = null;
                                                        SystemClock.sleep(i15);
                                                        i15 += 20;
                                                        if (cursor2 != null) {
                                                        }
                                                        if (sQLiteDatabase == null) {
                                                        }
                                                        sQLiteDatabase.close();
                                                        i16 = i3 + 1;
                                                        i14 = i4;
                                                        str6 = str2;
                                                        str7 = str3;
                                                        str8 = str;
                                                    } catch (SQLiteFullException e5) {
                                                        e = e5;
                                                        cursor2 = null;
                                                        zzgu zzguVar522 = zzicVar2.zzi;
                                                        zzic.zzP(zzguVar522);
                                                        zzguVar522.zzd.zzb(e, "Error reading entries from local database");
                                                        zzm.zzc = true;
                                                        if (cursor2 != null) {
                                                        }
                                                        if (sQLiteDatabase == null) {
                                                        }
                                                        sQLiteDatabase.close();
                                                        i16 = i3 + 1;
                                                        i14 = i4;
                                                        str6 = str2;
                                                        str7 = str3;
                                                        str8 = str;
                                                    } catch (SQLiteException e6) {
                                                        e = e6;
                                                        cursor2 = null;
                                                        if (sQLiteDatabase != null) {
                                                        }
                                                        zzgu zzguVar622 = zzicVar2.zzi;
                                                        zzic.zzP(zzguVar622);
                                                        zzguVar622.zzd.zzb(e, "Error reading entries from local database");
                                                        zzm.zzc = true;
                                                        if (cursor2 != null) {
                                                        }
                                                        if (sQLiteDatabase == null) {
                                                        }
                                                        sQLiteDatabase.close();
                                                        i16 = i3 + 1;
                                                        i14 = i4;
                                                        str6 = str2;
                                                        str7 = str3;
                                                        str8 = str;
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        cursor = null;
                                                        if (cursor != null) {
                                                        }
                                                        if (sQLiteDatabase != null) {
                                                        }
                                                        throw th;
                                                    }
                                                }
                                                throw th;
                                            }
                                        } else {
                                            i3 = i16;
                                            cursor3.close();
                                            j = -1;
                                        }
                                        if (j != -1) {
                                            str4 = "rowid<?";
                                            strArr = new String[]{String.valueOf(j)};
                                        } else {
                                            str4 = null;
                                            strArr = null;
                                        }
                                        try {
                                            String[] strArr2 = {str8, str7, str6};
                                            zzal zzalVar2 = zzicVar2.zzg;
                                            zzfx zzfxVar = zzfy.zzaW;
                                            str = str8;
                                            try {
                                                try {
                                                    int i17 = 4;
                                                    int i18 = 3;
                                                    if (zzalVar2.zzp(null, zzfxVar)) {
                                                        i5 = 5;
                                                        try {
                                                            strArr2 = new String[]{str, str7, str6, "app_version", "app_version_int"};
                                                        } catch (SQLiteDatabaseLockedException unused4) {
                                                            i4 = 5;
                                                            str3 = str7;
                                                            sQLiteDatabase = zzp;
                                                            str2 = str6;
                                                            cursor2 = null;
                                                            SystemClock.sleep(i15);
                                                            i15 += 20;
                                                            if (cursor2 != null) {
                                                            }
                                                            if (sQLiteDatabase == null) {
                                                            }
                                                            sQLiteDatabase.close();
                                                            i16 = i3 + 1;
                                                            i14 = i4;
                                                            str6 = str2;
                                                            str7 = str3;
                                                            str8 = str;
                                                        } catch (SQLiteFullException e7) {
                                                            e = e7;
                                                            i4 = 5;
                                                            str3 = str7;
                                                            sQLiteDatabase = zzp;
                                                            str2 = str6;
                                                            cursor2 = null;
                                                            zzgu zzguVar5222 = zzicVar2.zzi;
                                                            zzic.zzP(zzguVar5222);
                                                            zzguVar5222.zzd.zzb(e, "Error reading entries from local database");
                                                            zzm.zzc = true;
                                                            if (cursor2 != null) {
                                                            }
                                                            if (sQLiteDatabase == null) {
                                                            }
                                                            sQLiteDatabase.close();
                                                            i16 = i3 + 1;
                                                            i14 = i4;
                                                            str6 = str2;
                                                            str7 = str3;
                                                            str8 = str;
                                                        } catch (SQLiteException e8) {
                                                            e = e8;
                                                            i4 = 5;
                                                            str3 = str7;
                                                            sQLiteDatabase = zzp;
                                                            str2 = str6;
                                                            cursor2 = null;
                                                            if (sQLiteDatabase != null) {
                                                            }
                                                            zzgu zzguVar6222 = zzicVar2.zzi;
                                                            zzic.zzP(zzguVar6222);
                                                            zzguVar6222.zzd.zzb(e, "Error reading entries from local database");
                                                            zzm.zzc = true;
                                                            if (cursor2 != null) {
                                                            }
                                                            if (sQLiteDatabase == null) {
                                                            }
                                                            sQLiteDatabase.close();
                                                            i16 = i3 + 1;
                                                            i14 = i4;
                                                            str6 = str2;
                                                            str7 = str3;
                                                            str8 = str;
                                                        }
                                                    } else {
                                                        i5 = 5;
                                                    }
                                                    try {
                                                        Cursor query = zzp.query("messages", strArr2, str4, strArr, null, null, "rowid asc", Integer.toString(i13));
                                                        while (query.moveToNext()) {
                                                            try {
                                                                try {
                                                                    try {
                                                                        j5 = query.getLong(0);
                                                                        try {
                                                                            int i19 = query.getInt(1);
                                                                            str2 = str6;
                                                                            try {
                                                                                byte[] blob = query.getBlob(2);
                                                                                str3 = str7;
                                                                                try {
                                                                                    if (zzicVar2.zzg.zzp(null, zzfxVar)) {
                                                                                        try {
                                                                                            str5 = query.getString(i18);
                                                                                            j2 = query.getLong(i17);
                                                                                        } catch (SQLiteDatabaseLockedException unused5) {
                                                                                            cursor2 = query;
                                                                                            sQLiteDatabase = zzp;
                                                                                            i4 = 5;
                                                                                            SystemClock.sleep(i15);
                                                                                            i15 += 20;
                                                                                            if (cursor2 != null) {
                                                                                            }
                                                                                            if (sQLiteDatabase == null) {
                                                                                            }
                                                                                            sQLiteDatabase.close();
                                                                                            i16 = i3 + 1;
                                                                                            i14 = i4;
                                                                                            str6 = str2;
                                                                                            str7 = str3;
                                                                                            str8 = str;
                                                                                        } catch (SQLiteFullException e9) {
                                                                                            e = e9;
                                                                                            cursor2 = query;
                                                                                            sQLiteDatabase = zzp;
                                                                                            i4 = 5;
                                                                                            zzgu zzguVar52222 = zzicVar2.zzi;
                                                                                            zzic.zzP(zzguVar52222);
                                                                                            zzguVar52222.zzd.zzb(e, "Error reading entries from local database");
                                                                                            zzm.zzc = true;
                                                                                            if (cursor2 != null) {
                                                                                            }
                                                                                            if (sQLiteDatabase == null) {
                                                                                            }
                                                                                            sQLiteDatabase.close();
                                                                                            i16 = i3 + 1;
                                                                                            i14 = i4;
                                                                                            str6 = str2;
                                                                                            str7 = str3;
                                                                                            str8 = str;
                                                                                        } catch (SQLiteException e10) {
                                                                                            e = e10;
                                                                                            cursor2 = query;
                                                                                            sQLiteDatabase = zzp;
                                                                                            i4 = 5;
                                                                                            if (sQLiteDatabase != null) {
                                                                                            }
                                                                                            zzgu zzguVar62222 = zzicVar2.zzi;
                                                                                            zzic.zzP(zzguVar62222);
                                                                                            zzguVar62222.zzd.zzb(e, "Error reading entries from local database");
                                                                                            zzm.zzc = true;
                                                                                            if (cursor2 != null) {
                                                                                            }
                                                                                            if (sQLiteDatabase == null) {
                                                                                            }
                                                                                            sQLiteDatabase.close();
                                                                                            i16 = i3 + 1;
                                                                                            i14 = i4;
                                                                                            str6 = str2;
                                                                                            str7 = str3;
                                                                                            str8 = str;
                                                                                        }
                                                                                    } else {
                                                                                        j2 = 0;
                                                                                        str5 = null;
                                                                                    }
                                                                                    if (i19 == 0) {
                                                                                        obtain = Parcel.obtain();
                                                                                        try {
                                                                                            cursor2 = query;
                                                                                            try {
                                                                                                try {
                                                                                                    obtain.unmarshall(blob, 0, blob.length);
                                                                                                    obtain.setDataPosition(0);
                                                                                                    zzbh createFromParcel = zzbh.CREATOR.createFromParcel(obtain);
                                                                                                    try {
                                                                                                        try {
                                                                                                            if (createFromParcel != null) {
                                                                                                                arrayList.add(new zzgk(createFromParcel, str5, j2));
                                                                                                            }
                                                                                                        } catch (Throwable th5) {
                                                                                                            th = th5;
                                                                                                            sQLiteDatabase = zzp;
                                                                                                            cursor = cursor2;
                                                                                                            if (cursor != null) {
                                                                                                            }
                                                                                                            if (sQLiteDatabase != null) {
                                                                                                            }
                                                                                                            throw th;
                                                                                                        }
                                                                                                    } catch (SQLiteDatabaseLockedException unused6) {
                                                                                                        sQLiteDatabase = zzp;
                                                                                                        i4 = 5;
                                                                                                        SystemClock.sleep(i15);
                                                                                                        i15 += 20;
                                                                                                        if (cursor2 != null) {
                                                                                                        }
                                                                                                        if (sQLiteDatabase == null) {
                                                                                                        }
                                                                                                        sQLiteDatabase.close();
                                                                                                        i16 = i3 + 1;
                                                                                                        i14 = i4;
                                                                                                        str6 = str2;
                                                                                                        str7 = str3;
                                                                                                        str8 = str;
                                                                                                    } catch (SQLiteFullException e11) {
                                                                                                        e = e11;
                                                                                                        sQLiteDatabase = zzp;
                                                                                                        i4 = 5;
                                                                                                        zzgu zzguVar522222 = zzicVar2.zzi;
                                                                                                        zzic.zzP(zzguVar522222);
                                                                                                        zzguVar522222.zzd.zzb(e, "Error reading entries from local database");
                                                                                                        zzm.zzc = true;
                                                                                                        if (cursor2 != null) {
                                                                                                            cursor2.close();
                                                                                                        }
                                                                                                        if (sQLiteDatabase == null) {
                                                                                                            i16 = i3 + 1;
                                                                                                            i14 = i4;
                                                                                                            str6 = str2;
                                                                                                            str7 = str3;
                                                                                                            str8 = str;
                                                                                                        }
                                                                                                        sQLiteDatabase.close();
                                                                                                        i16 = i3 + 1;
                                                                                                        i14 = i4;
                                                                                                        str6 = str2;
                                                                                                        str7 = str3;
                                                                                                        str8 = str;
                                                                                                    } catch (SQLiteException e12) {
                                                                                                        e = e12;
                                                                                                        sQLiteDatabase = zzp;
                                                                                                        i4 = 5;
                                                                                                        if (sQLiteDatabase != null && sQLiteDatabase.inTransaction()) {
                                                                                                            sQLiteDatabase.endTransaction();
                                                                                                        }
                                                                                                        zzgu zzguVar622222 = zzicVar2.zzi;
                                                                                                        zzic.zzP(zzguVar622222);
                                                                                                        zzguVar622222.zzd.zzb(e, "Error reading entries from local database");
                                                                                                        zzm.zzc = true;
                                                                                                        if (cursor2 != null) {
                                                                                                            cursor2.close();
                                                                                                        }
                                                                                                        if (sQLiteDatabase == null) {
                                                                                                            i16 = i3 + 1;
                                                                                                            i14 = i4;
                                                                                                            str6 = str2;
                                                                                                            str7 = str3;
                                                                                                            str8 = str;
                                                                                                        }
                                                                                                        sQLiteDatabase.close();
                                                                                                        i16 = i3 + 1;
                                                                                                        i14 = i4;
                                                                                                        str6 = str2;
                                                                                                        str7 = str3;
                                                                                                        str8 = str;
                                                                                                    }
                                                                                                } catch (SafeParcelReader$ParseException unused7) {
                                                                                                    zzgu zzguVar7 = zzicVar2.zzi;
                                                                                                    zzic.zzP(zzguVar7);
                                                                                                    zzguVar7.zzd.zza("Failed to load event from local database");
                                                                                                    obtain.recycle();
                                                                                                    i6 = 3;
                                                                                                    i18 = i6;
                                                                                                    str6 = str2;
                                                                                                    str7 = str3;
                                                                                                    query = cursor2;
                                                                                                    i17 = 4;
                                                                                                }
                                                                                            } catch (Throwable th6) {
                                                                                                th = th6;
                                                                                                throw th;
                                                                                            }
                                                                                        } catch (SafeParcelReader$ParseException unused8) {
                                                                                            cursor2 = query;
                                                                                        } catch (Throwable th7) {
                                                                                            th = th7;
                                                                                        }
                                                                                    } else {
                                                                                        cursor2 = query;
                                                                                        if (i19 == 1) {
                                                                                            obtain = Parcel.obtain();
                                                                                            try {
                                                                                                try {
                                                                                                    obtain.unmarshall(blob, 0, blob.length);
                                                                                                    obtain.setDataPosition(0);
                                                                                                    zzplVar = zzpl.CREATOR.createFromParcel(obtain);
                                                                                                } finally {
                                                                                                }
                                                                                            } catch (SafeParcelReader$ParseException unused9) {
                                                                                                zzgu zzguVar8 = zzicVar2.zzi;
                                                                                                zzic.zzP(zzguVar8);
                                                                                                zzguVar8.zzd.zza("Failed to load user property from local database");
                                                                                                obtain.recycle();
                                                                                                zzplVar = null;
                                                                                            }
                                                                                            if (zzplVar != null) {
                                                                                                arrayList.add(new zzgk(zzplVar, str5, j2));
                                                                                            }
                                                                                        } else if (i19 == 2) {
                                                                                            obtain = Parcel.obtain();
                                                                                            try {
                                                                                                try {
                                                                                                    obtain.unmarshall(blob, 0, blob.length);
                                                                                                    obtain.setDataPosition(0);
                                                                                                    zzahVar = zzah.CREATOR.createFromParcel(obtain);
                                                                                                } catch (SafeParcelReader$ParseException unused10) {
                                                                                                    zzgu zzguVar9 = zzicVar2.zzi;
                                                                                                    zzic.zzP(zzguVar9);
                                                                                                    zzguVar9.zzd.zza("Failed to load conditional user property from local database");
                                                                                                    obtain.recycle();
                                                                                                    zzahVar = null;
                                                                                                }
                                                                                                if (zzahVar != null) {
                                                                                                    arrayList.add(new zzgk(zzahVar, str5, j2));
                                                                                                }
                                                                                            } finally {
                                                                                            }
                                                                                        } else {
                                                                                            if (i19 == 4) {
                                                                                                try {
                                                                                                    obtain = Parcel.obtain();
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                obtain.unmarshall(blob, 0, blob.length);
                                                                                                                obtain.setDataPosition(0);
                                                                                                                zzbfVar = zzbf.CREATOR.createFromParcel(obtain);
                                                                                                            } catch (Throwable th8) {
                                                                                                                th = th8;
                                                                                                                throw th;
                                                                                                            }
                                                                                                        } catch (SafeParcelReader$ParseException unused11) {
                                                                                                            zzgu zzguVar10 = zzicVar2.zzi;
                                                                                                            zzic.zzP(zzguVar10);
                                                                                                            zzguVar10.zzd.zza("Failed to load default event parameters from local database");
                                                                                                            obtain.recycle();
                                                                                                            zzbfVar = null;
                                                                                                            if (zzbfVar != null) {
                                                                                                            }
                                                                                                            i6 = 3;
                                                                                                            i18 = i6;
                                                                                                            str6 = str2;
                                                                                                            str7 = str3;
                                                                                                            query = cursor2;
                                                                                                            i17 = 4;
                                                                                                        }
                                                                                                    } catch (SafeParcelReader$ParseException unused12) {
                                                                                                    } catch (Throwable th9) {
                                                                                                        th = th9;
                                                                                                    }
                                                                                                } catch (SQLiteDatabaseLockedException unused13) {
                                                                                                    sQLiteDatabase = zzp;
                                                                                                    i4 = 5;
                                                                                                    SystemClock.sleep(i15);
                                                                                                    i15 += 20;
                                                                                                    if (cursor2 != null) {
                                                                                                    }
                                                                                                    if (sQLiteDatabase == null) {
                                                                                                    }
                                                                                                    sQLiteDatabase.close();
                                                                                                    i16 = i3 + 1;
                                                                                                    i14 = i4;
                                                                                                    str6 = str2;
                                                                                                    str7 = str3;
                                                                                                    str8 = str;
                                                                                                } catch (SQLiteFullException e13) {
                                                                                                    e = e13;
                                                                                                    sQLiteDatabase = zzp;
                                                                                                    i4 = 5;
                                                                                                    zzgu zzguVar5222222 = zzicVar2.zzi;
                                                                                                    zzic.zzP(zzguVar5222222);
                                                                                                    zzguVar5222222.zzd.zzb(e, "Error reading entries from local database");
                                                                                                    zzm.zzc = true;
                                                                                                    if (cursor2 != null) {
                                                                                                    }
                                                                                                    if (sQLiteDatabase == null) {
                                                                                                    }
                                                                                                    sQLiteDatabase.close();
                                                                                                    i16 = i3 + 1;
                                                                                                    i14 = i4;
                                                                                                    str6 = str2;
                                                                                                    str7 = str3;
                                                                                                    str8 = str;
                                                                                                } catch (SQLiteException e14) {
                                                                                                    e = e14;
                                                                                                    sQLiteDatabase = zzp;
                                                                                                    i4 = 5;
                                                                                                    if (sQLiteDatabase != null) {
                                                                                                    }
                                                                                                    zzgu zzguVar6222222 = zzicVar2.zzi;
                                                                                                    zzic.zzP(zzguVar6222222);
                                                                                                    zzguVar6222222.zzd.zzb(e, "Error reading entries from local database");
                                                                                                    zzm.zzc = true;
                                                                                                    if (cursor2 != null) {
                                                                                                    }
                                                                                                    if (sQLiteDatabase == null) {
                                                                                                    }
                                                                                                    sQLiteDatabase.close();
                                                                                                    i16 = i3 + 1;
                                                                                                    i14 = i4;
                                                                                                    str6 = str2;
                                                                                                    str7 = str3;
                                                                                                    str8 = str;
                                                                                                }
                                                                                                try {
                                                                                                    if (zzbfVar != null) {
                                                                                                        arrayList.add(new zzgk(zzbfVar, str5, j2));
                                                                                                    }
                                                                                                    i6 = 3;
                                                                                                } catch (SQLiteDatabaseLockedException unused14) {
                                                                                                    sQLiteDatabase = zzp;
                                                                                                    i4 = 5;
                                                                                                    SystemClock.sleep(i15);
                                                                                                    i15 += 20;
                                                                                                    if (cursor2 != null) {
                                                                                                    }
                                                                                                    if (sQLiteDatabase == null) {
                                                                                                    }
                                                                                                    sQLiteDatabase.close();
                                                                                                    i16 = i3 + 1;
                                                                                                    i14 = i4;
                                                                                                    str6 = str2;
                                                                                                    str7 = str3;
                                                                                                    str8 = str;
                                                                                                } catch (SQLiteFullException e15) {
                                                                                                    e = e15;
                                                                                                    sQLiteDatabase = zzp;
                                                                                                    i4 = 5;
                                                                                                    zzgu zzguVar52222222 = zzicVar2.zzi;
                                                                                                    zzic.zzP(zzguVar52222222);
                                                                                                    zzguVar52222222.zzd.zzb(e, "Error reading entries from local database");
                                                                                                    zzm.zzc = true;
                                                                                                    if (cursor2 != null) {
                                                                                                    }
                                                                                                    if (sQLiteDatabase == null) {
                                                                                                    }
                                                                                                    sQLiteDatabase.close();
                                                                                                    i16 = i3 + 1;
                                                                                                    i14 = i4;
                                                                                                    str6 = str2;
                                                                                                    str7 = str3;
                                                                                                    str8 = str;
                                                                                                } catch (SQLiteException e16) {
                                                                                                    e = e16;
                                                                                                    sQLiteDatabase = zzp;
                                                                                                    i4 = 5;
                                                                                                    if (sQLiteDatabase != null) {
                                                                                                    }
                                                                                                    zzgu zzguVar62222222 = zzicVar2.zzi;
                                                                                                    zzic.zzP(zzguVar62222222);
                                                                                                    zzguVar62222222.zzd.zzb(e, "Error reading entries from local database");
                                                                                                    zzm.zzc = true;
                                                                                                    if (cursor2 != null) {
                                                                                                    }
                                                                                                    if (sQLiteDatabase == null) {
                                                                                                    }
                                                                                                    sQLiteDatabase.close();
                                                                                                    i16 = i3 + 1;
                                                                                                    i14 = i4;
                                                                                                    str6 = str2;
                                                                                                    str7 = str3;
                                                                                                    str8 = str;
                                                                                                }
                                                                                            } else {
                                                                                                zzgu zzguVar11 = zzicVar2.zzi;
                                                                                                i6 = 3;
                                                                                                if (i19 == 3) {
                                                                                                    zzic.zzP(zzguVar11);
                                                                                                    zzguVar11.zzl.zza("Skipping app launch break");
                                                                                                } else {
                                                                                                    zzic.zzP(zzguVar11);
                                                                                                    zzguVar11.zzd.zza("Unknown record type in local database");
                                                                                                }
                                                                                            }
                                                                                            i18 = i6;
                                                                                            str6 = str2;
                                                                                            str7 = str3;
                                                                                            query = cursor2;
                                                                                            i17 = 4;
                                                                                        }
                                                                                    }
                                                                                    i6 = 3;
                                                                                    i18 = i6;
                                                                                    str6 = str2;
                                                                                    str7 = str3;
                                                                                    query = cursor2;
                                                                                    i17 = 4;
                                                                                } catch (SQLiteDatabaseLockedException unused15) {
                                                                                    cursor2 = query;
                                                                                } catch (SQLiteFullException e17) {
                                                                                    e = e17;
                                                                                    cursor2 = query;
                                                                                } catch (SQLiteException e18) {
                                                                                    e = e18;
                                                                                    cursor2 = query;
                                                                                }
                                                                            } catch (SQLiteDatabaseLockedException unused16) {
                                                                                cursor2 = query;
                                                                                str3 = str7;
                                                                                sQLiteDatabase = zzp;
                                                                                i4 = 5;
                                                                                SystemClock.sleep(i15);
                                                                                i15 += 20;
                                                                                if (cursor2 != null) {
                                                                                }
                                                                                if (sQLiteDatabase == null) {
                                                                                }
                                                                                sQLiteDatabase.close();
                                                                                i16 = i3 + 1;
                                                                                i14 = i4;
                                                                                str6 = str2;
                                                                                str7 = str3;
                                                                                str8 = str;
                                                                            } catch (SQLiteFullException e19) {
                                                                                e = e19;
                                                                                cursor2 = query;
                                                                                str3 = str7;
                                                                                sQLiteDatabase = zzp;
                                                                                i4 = 5;
                                                                                zzgu zzguVar522222222 = zzicVar2.zzi;
                                                                                zzic.zzP(zzguVar522222222);
                                                                                zzguVar522222222.zzd.zzb(e, "Error reading entries from local database");
                                                                                zzm.zzc = true;
                                                                                if (cursor2 != null) {
                                                                                }
                                                                                if (sQLiteDatabase == null) {
                                                                                }
                                                                                sQLiteDatabase.close();
                                                                                i16 = i3 + 1;
                                                                                i14 = i4;
                                                                                str6 = str2;
                                                                                str7 = str3;
                                                                                str8 = str;
                                                                            } catch (SQLiteException e20) {
                                                                                e = e20;
                                                                                cursor2 = query;
                                                                                str3 = str7;
                                                                                sQLiteDatabase = zzp;
                                                                                i4 = 5;
                                                                                if (sQLiteDatabase != null) {
                                                                                }
                                                                                zzgu zzguVar622222222 = zzicVar2.zzi;
                                                                                zzic.zzP(zzguVar622222222);
                                                                                zzguVar622222222.zzd.zzb(e, "Error reading entries from local database");
                                                                                zzm.zzc = true;
                                                                                if (cursor2 != null) {
                                                                                }
                                                                                if (sQLiteDatabase == null) {
                                                                                }
                                                                                sQLiteDatabase.close();
                                                                                i16 = i3 + 1;
                                                                                i14 = i4;
                                                                                str6 = str2;
                                                                                str7 = str3;
                                                                                str8 = str;
                                                                            }
                                                                        } catch (SQLiteDatabaseLockedException unused17) {
                                                                            cursor2 = query;
                                                                            str2 = str6;
                                                                        } catch (SQLiteFullException e21) {
                                                                            e = e21;
                                                                            cursor2 = query;
                                                                            str2 = str6;
                                                                        } catch (SQLiteException e22) {
                                                                            e = e22;
                                                                            cursor2 = query;
                                                                            str2 = str6;
                                                                        }
                                                                    } catch (SQLiteDatabaseLockedException unused18) {
                                                                        cursor2 = query;
                                                                        str2 = str6;
                                                                        str3 = str7;
                                                                    } catch (SQLiteFullException e23) {
                                                                        e = e23;
                                                                        cursor2 = query;
                                                                        str2 = str6;
                                                                        str3 = str7;
                                                                    } catch (SQLiteException e24) {
                                                                        e = e24;
                                                                        cursor2 = query;
                                                                        str2 = str6;
                                                                        str3 = str7;
                                                                    }
                                                                } catch (Throwable th10) {
                                                                    th = th10;
                                                                    cursor2 = query;
                                                                }
                                                            } catch (SQLiteDatabaseLockedException unused19) {
                                                                cursor2 = query;
                                                                str2 = str6;
                                                                str3 = str7;
                                                            } catch (SQLiteFullException e25) {
                                                                e = e25;
                                                                cursor2 = query;
                                                                str2 = str6;
                                                                str3 = str7;
                                                            } catch (SQLiteException e26) {
                                                                e = e26;
                                                                cursor2 = query;
                                                                str2 = str6;
                                                                str3 = str7;
                                                            }
                                                        }
                                                        cursor2 = query;
                                                        str2 = str6;
                                                        str3 = str7;
                                                        i2 = 0;
                                                        sQLiteDatabase = zzp;
                                                    } catch (SQLiteDatabaseLockedException unused20) {
                                                        str3 = str7;
                                                        sQLiteDatabase = zzp;
                                                        str2 = str6;
                                                        i4 = i5;
                                                        cursor2 = null;
                                                        SystemClock.sleep(i15);
                                                        i15 += 20;
                                                        if (cursor2 != null) {
                                                            cursor2.close();
                                                        }
                                                        if (sQLiteDatabase == null) {
                                                            i16 = i3 + 1;
                                                            i14 = i4;
                                                            str6 = str2;
                                                            str7 = str3;
                                                            str8 = str;
                                                        }
                                                        sQLiteDatabase.close();
                                                        i16 = i3 + 1;
                                                        i14 = i4;
                                                        str6 = str2;
                                                        str7 = str3;
                                                        str8 = str;
                                                    }
                                                } catch (SQLiteDatabaseLockedException unused21) {
                                                    str3 = str7;
                                                    sQLiteDatabase = zzp;
                                                    str2 = str6;
                                                    i4 = 5;
                                                    cursor2 = null;
                                                    SystemClock.sleep(i15);
                                                    i15 += 20;
                                                    if (cursor2 != null) {
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                    }
                                                    sQLiteDatabase.close();
                                                    i16 = i3 + 1;
                                                    i14 = i4;
                                                    str6 = str2;
                                                    str7 = str3;
                                                    str8 = str;
                                                }
                                                try {
                                                    if (sQLiteDatabase.delete("messages", "rowid <= ?", new String[]{Long.toString(j5)}) < arrayList.size()) {
                                                        zzgu zzguVar12 = zzicVar2.zzi;
                                                        zzic.zzP(zzguVar12);
                                                        zzguVar12.zzd.zza("Fewer entries removed from local database than expected");
                                                    }
                                                    sQLiteDatabase.setTransactionSuccessful();
                                                    sQLiteDatabase.endTransaction();
                                                    cursor2.close();
                                                    sQLiteDatabase.close();
                                                } catch (SQLiteDatabaseLockedException unused22) {
                                                    i4 = 5;
                                                    SystemClock.sleep(i15);
                                                    i15 += 20;
                                                    if (cursor2 != null) {
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                    }
                                                    sQLiteDatabase.close();
                                                    i16 = i3 + 1;
                                                    i14 = i4;
                                                    str6 = str2;
                                                    str7 = str3;
                                                    str8 = str;
                                                } catch (SQLiteFullException e27) {
                                                    e = e27;
                                                    i4 = 5;
                                                    zzgu zzguVar5222222222 = zzicVar2.zzi;
                                                    zzic.zzP(zzguVar5222222222);
                                                    zzguVar5222222222.zzd.zzb(e, "Error reading entries from local database");
                                                    zzm.zzc = true;
                                                    if (cursor2 != null) {
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                    }
                                                    sQLiteDatabase.close();
                                                    i16 = i3 + 1;
                                                    i14 = i4;
                                                    str6 = str2;
                                                    str7 = str3;
                                                    str8 = str;
                                                } catch (SQLiteException e28) {
                                                    e = e28;
                                                    i4 = 5;
                                                    if (sQLiteDatabase != null) {
                                                        sQLiteDatabase.endTransaction();
                                                    }
                                                    zzgu zzguVar6222222222 = zzicVar2.zzi;
                                                    zzic.zzP(zzguVar6222222222);
                                                    zzguVar6222222222.zzd.zzb(e, "Error reading entries from local database");
                                                    zzm.zzc = true;
                                                    if (cursor2 != null) {
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                    }
                                                    sQLiteDatabase.close();
                                                    i16 = i3 + 1;
                                                    i14 = i4;
                                                    str6 = str2;
                                                    str7 = str3;
                                                    str8 = str;
                                                }
                                            } catch (SQLiteFullException e29) {
                                                e = e29;
                                                str3 = str7;
                                                sQLiteDatabase = zzp;
                                                str2 = str6;
                                                i4 = 5;
                                                cursor2 = null;
                                                zzgu zzguVar52222222222 = zzicVar2.zzi;
                                                zzic.zzP(zzguVar52222222222);
                                                zzguVar52222222222.zzd.zzb(e, "Error reading entries from local database");
                                                zzm.zzc = true;
                                                if (cursor2 != null) {
                                                }
                                                if (sQLiteDatabase == null) {
                                                }
                                                sQLiteDatabase.close();
                                                i16 = i3 + 1;
                                                i14 = i4;
                                                str6 = str2;
                                                str7 = str3;
                                                str8 = str;
                                            } catch (SQLiteException e30) {
                                                e = e30;
                                                str3 = str7;
                                                sQLiteDatabase = zzp;
                                                str2 = str6;
                                                i4 = 5;
                                                cursor2 = null;
                                                if (sQLiteDatabase != null) {
                                                }
                                                zzgu zzguVar62222222222 = zzicVar2.zzi;
                                                zzic.zzP(zzguVar62222222222);
                                                zzguVar62222222222.zzd.zzb(e, "Error reading entries from local database");
                                                zzm.zzc = true;
                                                if (cursor2 != null) {
                                                }
                                                if (sQLiteDatabase == null) {
                                                }
                                                sQLiteDatabase.close();
                                                i16 = i3 + 1;
                                                i14 = i4;
                                                str6 = str2;
                                                str7 = str3;
                                                str8 = str;
                                            }
                                        } catch (SQLiteDatabaseLockedException unused23) {
                                            str = str8;
                                        } catch (SQLiteFullException e31) {
                                            e = e31;
                                            str = str8;
                                        } catch (SQLiteException e32) {
                                            e = e32;
                                            str = str8;
                                        }
                                    } catch (Throwable th11) {
                                        th = th11;
                                        i3 = i16;
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                    str = str8;
                                    i3 = i16;
                                    str3 = str7;
                                    sQLiteDatabase = zzp;
                                    i4 = 5;
                                    str2 = str6;
                                    cursor3 = null;
                                }
                            }
                        } catch (SQLiteDatabaseLockedException unused24) {
                            str = str8;
                            i3 = i16;
                            str2 = str6;
                            str3 = str7;
                            i4 = 5;
                            sQLiteDatabase = null;
                        } catch (SQLiteFullException e33) {
                            e = e33;
                            str = str8;
                            i3 = i16;
                            str2 = str6;
                            str3 = str7;
                            i4 = 5;
                            sQLiteDatabase = null;
                        } catch (SQLiteException e34) {
                            e = e34;
                            str = str8;
                            i3 = i16;
                            str2 = str6;
                            str3 = str7;
                            i4 = 5;
                            sQLiteDatabase = null;
                        } catch (Throwable th13) {
                            th = th13;
                            cursor = null;
                            sQLiteDatabase = null;
                        }
                        i16 = i3 + 1;
                        i14 = i4;
                        str6 = str2;
                        str7 = str3;
                        str8 = str;
                    }
                    if (arrayList != null) {
                        arrayList2.addAll(arrayList);
                        i7 = arrayList.size();
                    } else {
                        i7 = i2;
                    }
                    if (abstractSafeParcelable == null && i7 < i13) {
                        arrayList2.add(new zzgk(abstractSafeParcelable, zzrVar2.zzc, zzrVar2.zzj));
                    }
                    size = arrayList2.size();
                    i8 = i2;
                    while (i8 < size) {
                        zzgk zzgkVar = (zzgk) arrayList2.get(i8);
                        AbstractSafeParcelable abstractSafeParcelable2 = zzgkVar.zza;
                        zzfx zzfxVar2 = zzfy.zzaW;
                        if (zzalVar.zzp(null, zzfxVar2)) {
                            String str9 = zzgkVar.zzb;
                            if (!TextUtils.isEmpty(str9)) {
                                i9 = i7;
                                zzrVar2 = new zzr(zzrVar2.zza, zzrVar2.zzb, str9, zzgkVar.zzc, zzrVar2.zzd, zzrVar2.zze, zzrVar2.zzf, zzrVar2.zzg, zzrVar2.zzh, zzrVar2.zzi, zzrVar2.zzk, zzrVar2.zzl, zzrVar2.zzm, zzrVar2.zzn, zzrVar2.zzo, zzrVar2.zzp, zzrVar2.zzq, zzrVar2.zzr, zzrVar2.zzs, zzrVar2.zzt, zzrVar2.zzu, zzrVar2.zzv, zzrVar2.zzw, zzrVar2.zzx, zzrVar2.zzy, zzrVar2.zzz, zzrVar2.zzA, zzrVar2.zzB, zzrVar2.zzC, zzrVar2.zzD, zzrVar2.zzE, zzrVar2.zzF);
                                if (abstractSafeParcelable2 instanceof zzbh) {
                                    zzguVar2 = zzguVar;
                                    if (abstractSafeParcelable2 instanceof zzpl) {
                                        try {
                                            zzgbVar.zzf((zzpl) abstractSafeParcelable2, zzrVar2);
                                        } catch (RemoteException e35) {
                                            zzic.zzP(zzguVar2);
                                            zzguVar2.zzd.zzb(e35, "Failed to send user property to the service");
                                        }
                                    } else if (abstractSafeParcelable2 instanceof zzah) {
                                        try {
                                            zzgbVar.zzn((zzah) abstractSafeParcelable2, zzrVar2);
                                        } catch (RemoteException e36) {
                                            zzic.zzP(zzguVar2);
                                            zzguVar2.zzd.zzb(e36, "Failed to send conditional user property to the service");
                                        }
                                    } else {
                                        if (zzalVar.zzp(null, zzfxVar2) && (abstractSafeParcelable2 instanceof zzbf)) {
                                            try {
                                                zzgbVar.zzu(((zzbf) abstractSafeParcelable2).zzf(), zzrVar2);
                                            } catch (RemoteException e37) {
                                                zzic.zzP(zzguVar2);
                                                zzguVar2.zzd.zzb(e37, "Failed to send default event parameters to the service");
                                            }
                                        } else {
                                            zzic.zzP(zzguVar2);
                                            zzguVar2.zzd.zza("Discarding data. Unrecognized parcel type.");
                                        }
                                        i8++;
                                        zzguVar = zzguVar2;
                                        i7 = i9;
                                    }
                                } else {
                                    try {
                                        defaultClock.getClass();
                                        long currentTimeMillis = System.currentTimeMillis();
                                        try {
                                            defaultClock.getClass();
                                            j3 = SystemClock.elapsedRealtime();
                                            try {
                                                try {
                                                    zzgbVar.zze((zzbh) abstractSafeParcelable2, zzrVar2);
                                                    zzic.zzP(zzguVar);
                                                    zzguVar2 = zzguVar;
                                                } catch (RemoteException e38) {
                                                    e = e38;
                                                    zzguVar2 = zzguVar;
                                                    j4 = currentTimeMillis;
                                                    zzic.zzP(zzguVar2);
                                                    zzguVar2.zzd.zzb(e, "Failed to send event to the service");
                                                    if (j4 != 0) {
                                                        com.google.android.gms.maps.zzah zza = com.google.android.gms.maps.zzah.zza(zzicVar3);
                                                        defaultClock.getClass();
                                                        long currentTimeMillis2 = System.currentTimeMillis();
                                                        defaultClock.getClass();
                                                        zza.zzb(j4, currentTimeMillis2, 13, (int) (SystemClock.elapsedRealtime() - j3));
                                                    }
                                                    i8++;
                                                    zzguVar = zzguVar2;
                                                    i7 = i9;
                                                }
                                                try {
                                                    zzguVar2.zzl.zza("Logging telemetry for logEvent from database");
                                                    com.google.android.gms.maps.zzah zza2 = com.google.android.gms.maps.zzah.zza(zzicVar3);
                                                    defaultClock.getClass();
                                                    long currentTimeMillis3 = System.currentTimeMillis();
                                                    defaultClock.getClass();
                                                    zza2.zzb(currentTimeMillis, currentTimeMillis3, 0, (int) (SystemClock.elapsedRealtime() - j3));
                                                } catch (RemoteException e39) {
                                                    e = e39;
                                                    j4 = currentTimeMillis;
                                                    zzic.zzP(zzguVar2);
                                                    zzguVar2.zzd.zzb(e, "Failed to send event to the service");
                                                    if (j4 != 0) {
                                                    }
                                                    i8++;
                                                    zzguVar = zzguVar2;
                                                    i7 = i9;
                                                }
                                            } catch (RemoteException e40) {
                                                e = e40;
                                            }
                                        } catch (RemoteException e41) {
                                            e = e41;
                                            zzguVar2 = zzguVar;
                                            j3 = 0;
                                        }
                                    } catch (RemoteException e42) {
                                        e = e42;
                                        zzguVar2 = zzguVar;
                                        j3 = 0;
                                        j4 = 0;
                                    }
                                }
                                i8++;
                                zzguVar = zzguVar2;
                                i7 = i9;
                            }
                        }
                        i9 = i7;
                        if (abstractSafeParcelable2 instanceof zzbh) {
                        }
                        i8++;
                        zzguVar = zzguVar2;
                        i7 = i9;
                    }
                    i11 = i + 1;
                    zzguVar3 = zzguVar;
                    i10 = i7;
                    zzicVar = zzicVar3;
                    defaultClock2 = defaultClock;
                } else {
                    zzguVar = zzguVar3;
                    i = i11;
                    i2 = 0;
                    if (arrayList != null) {
                    }
                    if (abstractSafeParcelable == null) {
                    }
                    size = arrayList2.size();
                    i8 = i2;
                    while (i8 < size) {
                    }
                    i11 = i + 1;
                    zzguVar3 = zzguVar;
                    i10 = i7;
                    zzicVar = zzicVar3;
                    defaultClock2 = defaultClock;
                }
            }
            arrayList = null;
            i2 = 0;
            if (arrayList != null) {
            }
            if (abstractSafeParcelable == null) {
            }
            size = arrayList2.size();
            i8 = i2;
            while (i8 < size) {
            }
            i11 = i + 1;
            zzguVar3 = zzguVar;
            i10 = i7;
            zzicVar = zzicVar3;
            defaultClock2 = defaultClock;
        }
    }

    public final void zzp(zzah zzahVar) {
        boolean zzs;
        zzg();
        zzb$1();
        zzic zzicVar = (zzic) this.$$delegate_0;
        zzicVar.getClass();
        zzgl zzm = zzicVar.zzm();
        zzic zzicVar2 = (zzic) zzm.$$delegate_0;
        zzic.zzN(zzicVar2.zzl);
        byte[] zzah = zzpp.zzah(zzahVar);
        if (zzah.length > 131072) {
            zzgu zzguVar = zzicVar2.zzi;
            zzic.zzP(zzguVar);
            zzguVar.zze.zza("Conditional user property too long for local database. Sending directly to service");
            zzs = false;
        } else {
            zzs = zzm.zzs(2, zzah);
        }
        zzaf(new com.google.android.gms.cloudmessaging.zzh(this, zzah(true), zzs, new zzah(zzahVar)));
    }
}
