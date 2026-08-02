package com.google.android.libraries.places.internal;

import androidx.compose.runtime.OffsetApplier;
import androidx.tracing.Trace;
import com.android.volley.Response;
import com.google.android.filament.Box;
import com.google.android.gms.auth.api.zbc;
import com.google.common.base.Ascii;
import com.google.common.base.Stopwatch;
import com.google.common.base.Supplier;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes4.dex */
public final class zzcah implements zzbqz {
    public final String zzA;
    public zzbyl zzB;
    public final zzbra zza;
    public final String zzb;
    public final String zzc;
    public final zzcbu zzd;
    public final zzbvw zze;
    public final ScheduledExecutorService zzf;
    public final zzbqr zzg;
    public final zzyr zzh;
    public final zzboy zzi;
    public final boolean zzj;
    public final List zzk;
    public final zzbuf zzl;
    public final OffsetApplier zzm;
    public volatile List zzn;
    public final Stopwatch zzo;
    public Box zzp;
    public Box zzq;
    public zzcck zzr;
    public zzbzz zzu;
    public volatile zzbzz zzv;
    public zzbtx zzx;
    public final zzcgl zzz;
    public final ArrayList zzs = new ArrayList();
    public final zzbzo zzt = new zzbzo(this, 0);
    public volatile zzbpr zzw = zzbpr.zza(zzbpq.zzd);

    public zzcah(com.google.android.gms.maps.zzah zzahVar, String str, String str2, zzbvf zzbvfVar, ScheduledExecutorService scheduledExecutorService, Supplier supplier, zzbuf zzbufVar, zzcbu zzcbuVar, zzbqr zzbqrVar, zzyr zzyrVar, zzbvj zzbvjVar, zzbra zzbraVar, zzboy zzboyVar, ArrayList arrayList, String str3, zzfv zzfvVar) {
        Object obj;
        List list = (List) zzahVar.f68zza;
        Trace.checkNotNull(list, "addressGroups");
        Trace.checkArgument("addressGroups is empty", !list.isEmpty());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Trace.checkNotNull(it.next(), "addressGroups contains null entry");
        }
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.zzn = unmodifiableList;
        OffsetApplier offsetApplier = new OffsetApplier(6);
        offsetApplier.applier = unmodifiableList;
        this.zzm = offsetApplier;
        this.zzb = str;
        this.zzc = str2;
        this.zze = zzbvfVar;
        this.zzf = scheduledExecutorService;
        this.zzo = (Stopwatch) supplier.get();
        this.zzl = zzbufVar;
        this.zzd = zzcbuVar;
        this.zzg = zzbqrVar;
        this.zzh = zzyrVar;
        Trace.checkNotNull(zzbvjVar, "channelTracer");
        Trace.checkNotNull(zzbraVar, "logId");
        this.zza = zzbraVar;
        Trace.checkNotNull(zzboyVar, "channelLogger");
        this.zzi = zzboyVar;
        this.zzk = arrayList;
        zbc zbcVar = zzbrv.zzc;
        int i = 0;
        while (true) {
            Object[][] objArr = (Object[][]) zzahVar.zzc;
            if (i >= objArr.length) {
                obj = Boolean.FALSE;
                break;
            }
            Object[] objArr2 = objArr[i];
            if (zbcVar == objArr2[0]) {
                obj = objArr2[1];
                break;
            }
            i++;
        }
        this.zzj = ((Boolean) obj).booleanValue();
        this.zzA = str3;
        this.zzz = new zzcgl(zzfvVar);
    }

    public static final String zzO(zzbtx zzbtxVar) {
        StringBuilder sb = new StringBuilder();
        zzbtu zzbtuVar = zzbtxVar.zzn;
        Throwable th = zzbtxVar.zzp;
        sb.append(zzbtuVar);
        String str = zzbtxVar.zzo;
        if (str != null) {
            sb.append("(");
            sb.append(str);
            sb.append(")");
        }
        if (th != null) {
            sb.append("[");
            sb.append(th);
            sb.append("]");
        }
        return sb.toString();
    }

    public final String toString() {
        Response stringHelper = Ascii.toStringHelper(this);
        stringHelper.add(this.zza.zzd, "logId");
        stringHelper.add(this.zzn, "addressGroups");
        return stringHelper.toString();
    }

    public final void zzM(zzbpr zzbprVar) {
        this.zzl.zzc();
        if (this.zzw.zza != zzbprVar.zza) {
            Trace.checkState("Cannot transition out of SHUTDOWN to %s", zzbprVar.zza, this.zzw.zza != zzbpq.zze);
            if (this.zzj && zzbprVar.zza == zzbpq.zzc) {
                this.zzw = zzbpr.zza(zzbpq.zzd);
            } else {
                this.zzw = zzbprVar;
            }
            this.zzd.zza.zza(zzbprVar);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbqz
    public final zzbra zzc() {
        return this.zza;
    }

    public final void zzf() {
        zzbqm zzbqmVar;
        this.zzl.zzc();
        Trace.checkState("Should have no reconnectTask scheduled", this.zzp == null);
        OffsetApplier offsetApplier = this.zzm;
        if (offsetApplier.offset == 0 && offsetApplier.nesting == 0) {
            Stopwatch stopwatch = this.zzo;
            stopwatch.isRunning = false;
            stopwatch.start();
        }
        SocketAddress socketAddress = (SocketAddress) ((zzbqd) ((List) offsetApplier.applier).get(offsetApplier.offset)).zzd.get(offsetApplier.nesting);
        if (socketAddress instanceof zzbqm) {
            zzbqm zzbqmVar2 = (zzbqm) socketAddress;
            zzbqmVar = zzbqmVar2;
            socketAddress = zzbqmVar2.zzb;
        } else {
            zzbqmVar = null;
        }
        zzbor zzf = offsetApplier.zzf();
        String str = (String) zzf.zzb.get(zzbqd.zza);
        zzbvv zzbvvVar = new zzbvv();
        if (str == null) {
            str = this.zzb;
        }
        Trace.checkNotNull(str, "authority");
        zzbvvVar.zza = str;
        zzbvvVar.zzb = zzf;
        zzbvvVar.zzc = this.zzc;
        zzbvvVar.zzd = zzbqmVar;
        zzcag zzcagVar = new zzcag();
        zzcagVar.zza = this.zza;
        zzbzz zzbzzVar = new zzbzz(this.zze.zza(socketAddress, zzbvvVar, zzcagVar), this.zzh);
        zzcagVar.zza = zzbzzVar.zzc();
        this.zzu = zzbzzVar;
        this.zzs.add(zzbzzVar);
        zzcaf zzcafVar = new zzcaf();
        zzcafVar.zzc = this;
        zzcafVar.zzb = false;
        zzcafVar.zza = zzbzzVar;
        zzbzzVar.zzaq(zzcafVar);
        this.zzi.zzb("Started transport {0}", 2, zzcagVar.zza);
    }

    public final /* synthetic */ void zzh(zzbpq zzbpqVar) {
        this.zzl.zzc();
        zzM(zzbpr.zza(zzbpqVar));
    }
}
