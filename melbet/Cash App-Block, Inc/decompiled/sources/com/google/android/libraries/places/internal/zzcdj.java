package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.filament.Box;
import com.google.android.gms.auth.api.zbc;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.RegularImmutableList;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.net.SocketAddress;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public final class zzcdj extends zzbrv {
    public static final boolean zzf;
    public static final Logger zzh = Logger.getLogger(zzcdj.class.getName());
    public final boolean zzi;
    public final zzbrm zzj;
    public final HashMap zzk;
    public final com.google.android.gms.internal.fido.zzfz zzl;
    public int zzm;
    public boolean zzn;
    public Box zzo;
    public zzbpq zzp;
    public zzbpq zzq;
    public boolean zzr;
    public Box zzs;
    public final boolean zzt;
    public zzbyl zzu;

    static {
        Logger logger = zzbzg.zzp;
        zzf = zzbqe.zzb("GRPC_EXPERIMENTAL_PF_WEIGHTED_SHUFFLING", true);
    }

    public zzcdj(zzbrm zzbrmVar) {
        boolean z;
        Logger logger = zzbzg.zzp;
        if (!zzbqe.zzb("GRPC_SERIALIZE_RETRIES", false)) {
            boolean z2 = zzcdp.zza;
            if (zzbqe.zzb("GRPC_PF_USE_HAPPY_EYEBALLS", false)) {
                z = true;
                this.zzi = z;
                this.zzk = new HashMap();
                ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
                RegularImmutableList regularImmutableList = RegularImmutableList.EMPTY;
                com.google.android.gms.internal.fido.zzfz zzfzVar = new com.google.android.gms.internal.fido.zzfz();
                zzfzVar.zzb = 0;
                zzfzVar.zzc = z;
                zzfzVar.zzg(regularImmutableList);
                this.zzl = zzfzVar;
                this.zzm = 0;
                this.zzn = true;
                this.zzo = null;
                zzbpq zzbpqVar = zzbpq.zzd;
                this.zzp = zzbpqVar;
                this.zzq = zzbpqVar;
                this.zzr = true;
                this.zzs = null;
                this.zzt = zzbqe.zzb("GRPC_SERIALIZE_RETRIES", false);
                Trace.checkNotNull(zzbrmVar, "helper");
                this.zzj = zzbrmVar;
            }
        }
        z = false;
        this.zzi = z;
        this.zzk = new HashMap();
        ImmutableList.Itr itr2 = ImmutableList.EMPTY_ITR;
        RegularImmutableList regularImmutableList2 = RegularImmutableList.EMPTY;
        com.google.android.gms.internal.fido.zzfz zzfzVar2 = new com.google.android.gms.internal.fido.zzfz();
        zzfzVar2.zzb = 0;
        zzfzVar2.zzc = z;
        zzfzVar2.zzg(regularImmutableList2);
        this.zzl = zzfzVar2;
        this.zzm = 0;
        this.zzn = true;
        this.zzo = null;
        zzbpq zzbpqVar2 = zzbpq.zzd;
        this.zzp = zzbpqVar2;
        this.zzq = zzbpqVar2;
        this.zzr = true;
        this.zzs = null;
        this.zzt = zzbqe.zzb("GRPC_SERIALIZE_RETRIES", false);
        Trace.checkNotNull(zzbrmVar, "helper");
        this.zzj = zzbrmVar;
    }

    public static AbstractList zzf(List list, Random random) {
        if (!zzf) {
            ArrayList arrayList = new ArrayList(list);
            Collections.shuffle(arrayList, random);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzbqd zzbqdVar = (zzbqd) it.next();
            Long l = (Long) zzbqdVar.zze.zzb.get(zzbqd.zzc);
            if (l == null) {
                l = 1L;
            }
            arrayList2.add(new zzcdi(zzbqdVar, Math.pow(random.nextDouble(), 1.0d / l.longValue())));
        }
        Collections.sort(arrayList2, Collections.reverseOrder());
        return Maps.transform(arrayList2, new Function() { // from class: com.google.android.libraries.places.internal.zzcdd
            @Override // com.google.common.base.Function
            public final /* synthetic */ Object apply(Object obj) {
                Logger logger = zzcdj.zzh;
                return ((zzcdi) obj).zza;
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (r3.size() == 1) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final SocketAddress zzv(zzbrs zzbrsVar) {
        boolean z;
        zzcbw zzcbwVar = (zzcbw) zzbrsVar;
        zzcbwVar.zzj.zze.zzc();
        Trace.checkState("not started", zzcbwVar.zzg);
        List list = zzcbwVar.zze;
        if (list != null) {
            z = true;
        }
        z = false;
        Trace.checkState("%s does not have exactly one group", list, z);
        return (SocketAddress) ((zzbqd) list.get(0)).zzd.get(0);
    }

    @Override // com.google.android.libraries.places.internal.zzbrv
    public final zzbtx zza(zzbrr zzbrrVar) {
        if (this.zzp == zzbpq.zze) {
            return zzbtx.zzg.zze("Already shut down");
        }
        zzbor zzborVar = zzbrrVar.zzb;
        List<zzbqd> list = zzbrrVar.zza;
        Boolean bool = (Boolean) zzborVar.zzb.get(zzbrv.zze);
        this.zzr = bool == null || !bool.booleanValue();
        if (list.isEmpty()) {
            zzbtx zzbtxVar = zzbtx.zzi;
            String valueOf = String.valueOf(list);
            String valueOf2 = String.valueOf(zzborVar);
            zzbtx zze = zzbtxVar.zze(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(valueOf.length() + 55 + valueOf2.length()), "NameResolver returned no usable address. addrs=", valueOf, ", attrs=", valueOf2));
            zzb(zze);
            return zze;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((zzbqd) it.next()) == null) {
                zzbtx zzbtxVar2 = zzbtx.zzi;
                String valueOf3 = String.valueOf(list);
                String valueOf4 = String.valueOf(zzborVar);
                zzbtx zze2 = zzbtxVar2.zze(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(valueOf3.length() + 69 + valueOf4.length()), "NameResolver returned address list with null endpoint. addrs=", valueOf3, ", attrs=", valueOf4));
                zzb(zze2);
                return zze2;
            }
        }
        this.zzn = true;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (zzbqd zzbqdVar : list) {
            ArrayList arrayList2 = new ArrayList();
            for (SocketAddress socketAddress : zzbqdVar.zzd) {
                if (hashSet.add(socketAddress)) {
                    arrayList2.add(socketAddress);
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList.add(new zzbqd(arrayList2, zzbqdVar.zze));
            }
        }
        Object obj = zzbrrVar.zzc;
        AbstractCollection abstractCollection = arrayList;
        if (obj instanceof zzcde) {
            Boolean bool2 = ((zzcde) obj).zza;
            abstractCollection = arrayList;
            if (bool2 != null) {
                abstractCollection = arrayList;
                if (bool2.booleanValue()) {
                    abstractCollection = zzf(arrayList, new Random());
                }
            }
        }
        ImmutableList copyOf = ImmutableList.copyOf((Collection) abstractCollection);
        zzbpq zzbpqVar = this.zzp;
        com.google.android.gms.internal.fido.zzfz zzfzVar = this.zzl;
        zzbpq zzbpqVar2 = zzbpq.zza;
        zzbpq zzbpqVar3 = zzbpq.zzb;
        if (zzbpqVar == zzbpqVar3 || (zzbpqVar == zzbpqVar2 && (!this.zzi || zzfzVar.zza()))) {
            SocketAddress zzd = zzfzVar.zzd();
            zzfzVar.zzg(copyOf);
            if (zzfzVar.zzh(zzd)) {
                zzbrs zzbrsVar = ((zzcdh) this.zzk.get(zzd)).zza;
                if (!zzfzVar.zza()) {
                    a$$ExternalSyntheticBUOutline0.m$1("Index is past the end of the address group list");
                    return null;
                }
                zzcda zzcdaVar = (zzcda) ((List) zzfzVar.zza).get(zzfzVar.zzb);
                zzbrsVar.zzd(Collections.singletonList(new zzbqd(Collections.singletonList(zzcdaVar.zzb), zzcdaVar.zza)));
                zzp(copyOf);
                return zzbtx.zza;
            }
        } else {
            zzfzVar.zzg(copyOf);
        }
        if (zzp(copyOf)) {
            this.zzp = zzbpqVar2;
            zzs(zzbpqVar2, new zzbrl(zzbro.zza));
        }
        zzbpq zzbpqVar4 = this.zzp;
        if (zzbpqVar4 == zzbpqVar3) {
            zzbpq zzbpqVar5 = zzbpq.zzd;
            this.zzp = zzbpqVar5;
            zzs(zzbpqVar5, new zzcdg(this, this));
        } else if (zzbpqVar4 == zzbpqVar2 || zzbpqVar4 == zzbpq.zzc) {
            Box box = this.zzo;
            if (box != null) {
                box.zza();
                this.zzo = null;
            }
            zzd();
        }
        return zzbtx.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzbrv
    public final void zzb(zzbtx zzbtxVar) {
        if (this.zzp == zzbpq.zze) {
            return;
        }
        HashMap hashMap = this.zzk;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            ((zzcdh) it.next()).zza.zzb();
        }
        hashMap.clear();
        ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
        this.zzl.zzg(RegularImmutableList.EMPTY);
        zzbpq zzbpqVar = zzbpq.zzc;
        this.zzp = zzbpqVar;
        zzs(zzbpqVar, new zzbrl(zzbro.zzb(zzbtxVar)));
    }

    @Override // com.google.android.libraries.places.internal.zzbrv
    public final void zzc() {
        Level level = Level.FINE;
        HashMap hashMap = this.zzk;
        zzh.logp(level, "io.grpc.internal.PickFirstLeafLoadBalancer", "shutdown", "Shutting down, currently have {} subchannels created", Integer.valueOf(hashMap.size()));
        zzbpq zzbpqVar = zzbpq.zze;
        this.zzp = zzbpqVar;
        this.zzq = zzbpqVar;
        Box box = this.zzo;
        if (box != null) {
            box.zza();
            this.zzo = null;
        }
        Box box2 = this.zzs;
        if (box2 != null) {
            box2.zza();
            this.zzs = null;
        }
        this.zzu = null;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            ((zzcdh) it.next()).zza.zzb();
        }
        hashMap.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a7, code lost:
    
        if (r1.zzb.get(com.google.android.libraries.places.internal.zzbrv.zzd) == null) goto L17;
     */
    @Override // com.google.android.libraries.places.internal.zzbrv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd() {
        com.google.android.gms.internal.fido.zzfz zzfzVar = this.zzl;
        if (zzfzVar.zza() && this.zzp != zzbpq.zze && this.zzs == null) {
            SocketAddress zzd = zzfzVar.zzd();
            HashMap hashMap = this.zzk;
            zzcdh zzcdhVar = (zzcdh) hashMap.get(zzd);
            boolean z = this.zzt;
            if (zzcdhVar == null) {
                if (!zzfzVar.zza()) {
                    a$$ExternalSyntheticBUOutline0.m$1("Index is off the end of the address group list");
                    return;
                }
                zzbor zzborVar = ((zzcda) ((List) zzfzVar.zza).get(zzfzVar.zzb)).zza;
                zbc zbcVar = new zbc(this);
                zzbrh zzbrhVar = new zzbrh();
                ArrayList newArrayList = Maps.newArrayList(new zzbqd(Collections.singletonList(zzd), zzborVar));
                Trace.checkArgument("addrs is empty", !newArrayList.isEmpty());
                zzbrhVar.zzb = Collections.unmodifiableList(new ArrayList(newArrayList));
                zzbrhVar.zza(zzbrv.zzb, zbcVar);
                zzbrhVar.zza(zzbrv.zzc, Boolean.valueOf(z));
                zzbrs zza = this.zzj.zza(new com.google.android.gms.maps.zzah(zzbrhVar.zzb, zzbrhVar.zzc, zzbrhVar.zzd));
                zzcdh zzcdhVar2 = new zzcdh(zza);
                zbcVar.zba = zzcdhVar2;
                hashMap.put(zzd, zzcdhVar2);
                zzbor zzborVar2 = (zzbor) ((zzcbw) zza).zza.zzb;
                if (!this.zzr) {
                }
                zzcdhVar2.zzd = zzbpr.zza(zzbpq.zzb);
                zza.zza(new Box(25, this, zzcdhVar2));
                zzcdhVar = zzcdhVar2;
            }
            zzbrs zzbrsVar = zzcdhVar.zza;
            int ordinal = zzcdhVar.zzb.ordinal();
            if (ordinal == 0) {
                zzt();
                return;
            }
            zzbpq zzbpqVar = zzbpq.zza;
            if (ordinal != 2) {
                if (ordinal != 3) {
                    return;
                }
                zzbrsVar.zzc();
                zzcdhVar.zzd(zzbpqVar);
                zzt();
                return;
            }
            if (!z) {
                zzfzVar.zzb();
                zzd();
            } else if (!zzfzVar.zza()) {
                zzq();
            } else {
                zzbrsVar.zzc();
                zzcdhVar.zzd(zzbpqVar);
            }
        }
    }

    public final boolean zzp(ImmutableList immutableList) {
        HashMap hashMap = this.zzk;
        HashSet hashSet = new HashSet(hashMap.keySet());
        HashSet hashSet2 = new HashSet();
        int size = immutableList.size();
        for (int i = 0; i < size; i++) {
            hashSet2.addAll(((zzbqd) immutableList.get(i)).zzd);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            SocketAddress socketAddress = (SocketAddress) it.next();
            if (!hashSet2.contains(socketAddress)) {
                ((zzcdh) hashMap.remove(socketAddress)).zza.zzb();
            }
        }
        return hashSet.isEmpty();
    }

    public final void zzq() {
        if (this.zzt && this.zzs == null) {
            if (this.zzu == null) {
                this.zzu = new zzbyl();
            }
            long zza = this.zzu.zza();
            zzbrm zzbrmVar = this.zzj;
            this.zzs = zzbrmVar.zzd().zzd(zzbrmVar.zze(), new zzccx(this, 0), zza, TimeUnit.NANOSECONDS);
        }
    }

    public final void zzr(zzcdh zzcdhVar) {
        zzbpr zzbprVar;
        zzbpq zzbpqVar;
        zzbpq zzbpqVar2 = zzcdhVar.zzb;
        zzbpq zzbpqVar3 = zzbpq.zzb;
        if (zzbpqVar2 != zzbpqVar3) {
            return;
        }
        if (this.zzr || (zzbpqVar = (zzbprVar = zzcdhVar.zzd).zza) == zzbpqVar3) {
            zzbrs zzbrsVar = zzcdhVar.zza;
            Trace.checkNotNull(zzbrsVar, "subchannel");
            zzs(zzbpqVar3, new zzbrl(new zzbro(zzbrsVar, zzbtx.zza, false)));
            return;
        }
        zzbpq zzbpqVar4 = zzbpq.zzc;
        if (zzbpqVar == zzbpqVar4) {
            zzs(zzbpqVar4, new zzbrl(zzbro.zzb(zzbprVar.zzb)));
        } else if (this.zzq != zzbpqVar4) {
            zzs(zzbpqVar, new zzbrl(zzbro.zza));
        }
    }

    public final void zzs(zzbpq zzbpqVar, zzbrt zzbrtVar) {
        if (zzbpqVar == this.zzq && (zzbpqVar == zzbpq.zzd || zzbpqVar == zzbpq.zza)) {
            return;
        }
        this.zzq = zzbpqVar;
        this.zzj.zzb(zzbpqVar, zzbrtVar);
    }

    public final void zzt() {
        if (this.zzi) {
            Box box = this.zzo;
            if (box != null) {
                zzbud zzbudVar = (zzbud) box.mCenter;
                if (!zzbudVar.zzc && !zzbudVar.zzb) {
                    return;
                }
            }
            zzbrm zzbrmVar = this.zzj;
            this.zzo = zzbrmVar.zzd().zzd(zzbrmVar.zze(), new zzccx(this, 1), 250L, TimeUnit.MILLISECONDS);
        }
    }
}
