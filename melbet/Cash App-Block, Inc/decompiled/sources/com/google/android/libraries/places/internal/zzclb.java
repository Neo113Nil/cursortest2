package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import com.google.common.collect.AbstractIndexedListIterator;
import com.google.common.collect.Iterators$ConcatenatedIterator;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes4.dex */
public final class zzclb extends zzbrv {
    public static final Logger zzi$1 = Logger.getLogger(zzclb.class.getName());
    public static final int zzj$1 = new Random().nextInt();
    public boolean zzf;
    public zzbpq zzh;
    public final AtomicInteger zzi;
    public zzbrt zzj;
    public final zzbrm zzl;
    public ArrayList zzk = new ArrayList(0);
    public final zzcdp zzg = new zzcdp();

    public zzclb(zzbrm zzbrmVar) {
        Trace.checkNotNull(zzbrmVar, "helper");
        this.zzl = zzbrmVar;
        zzi$1.logp(Level.FINE, "io.grpc.util.MultiChildLoadBalancer", "<init>", "Created");
        this.zzi = new AtomicInteger(new Random().nextInt());
        this.zzj = new zzbrl(zzbro.zza);
    }

    @Override // com.google.android.libraries.places.internal.zzbrv
    public final zzbtx zza(zzbrr zzbrrVar) {
        zzbtx zzbtxVar;
        zzi$1.logp(Level.FINE, "io.grpc.util.MultiChildLoadBalancer", "acceptResolvedAddresses", "Received resolution result: {0}", zzbrrVar);
        final int i = 1;
        final int i2 = 0;
        try {
            this.zzf = true;
            List<zzbqd> list = zzbrrVar.zza;
            LinkedHashMap linkedHashMap = new LinkedHashMap(Maps.capacity(list.size()));
            for (zzbqd zzbqdVar : list) {
                zzbrq zzbrqVar = new zzbrq();
                zzbrqVar.zza = list;
                zzbrqVar.zzc = zzbrrVar.zzc;
                zzbrqVar.zza = Collections.singletonList(zzbqdVar);
                zzbor zzborVar = zzbor.zza;
                zzboq zzboqVar = zzbrv.zze;
                Boolean bool = Boolean.TRUE;
                IdentityHashMap identityHashMap = new IdentityHashMap(zzborVar.zzb.size() + 1);
                identityHashMap.putAll(zzborVar.zzb);
                identityHashMap.put(zzboqVar, bool);
                linkedHashMap.put(new zzckw(zzbqdVar), new zzbrr(zzbrqVar.zza, new zzbor(identityHashMap, 0), null));
            }
            if (linkedHashMap.isEmpty()) {
                zzbtx zzbtxVar2 = zzbtx.zzi;
                String zzbrrVar2 = zzbrrVar.toString();
                StringBuilder sb = new StringBuilder(zzbrrVar2.length() + 41);
                sb.append("NameResolver returned no usable address. ");
                sb.append(zzbrrVar2);
                zzbtxVar = zzbtxVar2.zze(sb.toString());
                zzb(zzbtxVar);
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(Maps.capacity(this.zzk.size()));
                Iterator it = this.zzk.iterator();
                while (it.hasNext()) {
                    zzckz zzckzVar = (zzckz) it.next();
                    linkedHashMap2.put(zzckzVar.zzb$1, zzckzVar);
                }
                zzbtxVar = zzbtx.zza;
                final ArrayList arrayList = new ArrayList(linkedHashMap.size());
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    zzckz zzckzVar2 = (zzckz) linkedHashMap2.remove(entry.getKey());
                    if (zzckzVar2 == null) {
                        zzckzVar2 = new zzckz(this, entry.getKey(), this.zzg);
                    }
                    arrayList.add(zzckzVar2);
                }
                final int size = arrayList.isEmpty() ? 0 : (int) ((zzj$1 & BodyPartID.bodyIdMax) % (arrayList.size() & BodyPartID.bodyIdMax));
                Trace.checkArgument("number to skip cannot be negative", size >= 0);
                Iterable iterable = new Iterable() { // from class: com.google.common.collect.Iterables$6
                    @Override // java.lang.Iterable
                    public final Iterator iterator() {
                        int i3 = i2;
                        int i4 = size;
                        ArrayList arrayList2 = arrayList;
                        switch (i3) {
                            case 0:
                                return arrayList2.subList(Math.min(arrayList2.size(), i4), arrayList2.size()).iterator();
                            default:
                                Iterator it2 = arrayList2.iterator();
                                it2.getClass();
                                Trace.checkArgument("limit is negative", i4 >= 0);
                                return new Iterators$7(it2, i4);
                        }
                    }

                    public final String toString() {
                        Iterator it2 = iterator();
                        StringBuilder sb2 = new StringBuilder("[");
                        boolean z = true;
                        while (it2.hasNext()) {
                            if (!z) {
                                sb2.append(", ");
                            }
                            sb2.append(it2.next());
                            z = false;
                        }
                        sb2.append(']');
                        return sb2.toString();
                    }
                };
                Trace.checkArgument("limit is negative", size >= 0);
                final Iterable[] iterableArr = {iterable, new Iterable() { // from class: com.google.common.collect.Iterables$6
                    @Override // java.lang.Iterable
                    public final Iterator iterator() {
                        int i3 = i;
                        int i4 = size;
                        ArrayList arrayList2 = arrayList;
                        switch (i3) {
                            case 0:
                                return arrayList2.subList(Math.min(arrayList2.size(), i4), arrayList2.size()).iterator();
                            default:
                                Iterator it2 = arrayList2.iterator();
                                it2.getClass();
                                Trace.checkArgument("limit is negative", i4 >= 0);
                                return new Iterators$7(it2, i4);
                        }
                    }

                    public final String toString() {
                        Iterator it2 = iterator();
                        StringBuilder sb2 = new StringBuilder("[");
                        boolean z = true;
                        while (it2.hasNext()) {
                            if (!z) {
                                sb2.append(", ");
                            }
                            sb2.append(it2.next());
                            z = false;
                        }
                        sb2.append(']');
                        return sb2.toString();
                    }
                }};
                for (int i3 = 0; i3 < 2; i3++) {
                    iterableArr[i3].getClass();
                }
                final int length = iterableArr.length;
                AbstractIndexedListIterator abstractIndexedListIterator = new AbstractIndexedListIterator(length) { // from class: com.google.common.collect.FluentIterable$3$1
                    @Override // com.google.common.collect.AbstractIndexedListIterator
                    public final Object get(int i4) {
                        return iterableArr[i4].iterator();
                    }
                };
                Iterators$ConcatenatedIterator iterators$ConcatenatedIterator = new Iterators$ConcatenatedIterator();
                iterators$ConcatenatedIterator.iterator = new AbstractIndexedListIterator(new Object[0]) { // from class: com.google.common.collect.Iterators$ArrayItr

                    /* renamed from: array, reason: collision with root package name */
                    public final Object[] f997array;

                    {
                        super(r3.length, 0);
                        this.f997array = r3;
                    }

                    @Override // com.google.common.collect.AbstractIndexedListIterator
                    public final Object get(int i4) {
                        return this.f997array[i4];
                    }
                };
                iterators$ConcatenatedIterator.topMetaIterator = abstractIndexedListIterator;
                while (iterators$ConcatenatedIterator.hasNext()) {
                    zzckz zzckzVar3 = (zzckz) iterators$ConcatenatedIterator.next();
                    zzbrr zzbrrVar3 = (zzbrr) linkedHashMap.get(zzckzVar3.zzb$1);
                    if (zzbrrVar3 != null) {
                        zzbtx zza = zzckzVar3.zzc.zza(zzbrrVar3);
                        if (!zza.zzj()) {
                            zzbtxVar = zza;
                        }
                    }
                }
                this.zzk = arrayList;
                zze$1();
                for (zzckz zzckzVar4 : linkedHashMap2.values()) {
                    zzckzVar4.zzc.zzc();
                    zzckzVar4.zzd = zzbpq.zze;
                    zzi$1.logp(Level.FINE, "io.grpc.util.MultiChildLoadBalancer$ChildLbState", "shutdown", "Child balancer {0} deleted", zzckzVar4.zzb$1);
                }
            }
            this.zzf = false;
            return zzbtxVar;
        } catch (Throwable th) {
            this.zzf = false;
            throw th;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbrv
    public final void zzb(zzbtx zzbtxVar) {
        if (this.zzh != zzbpq.zzb) {
            this.zzl.zzb(zzbpq.zzc, new zzbrl(zzbro.zzb(zzbtxVar)));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbrv
    public final void zzc() {
        zzi$1.logp(Level.FINE, "io.grpc.util.MultiChildLoadBalancer", "shutdown", "Shutdown");
        Iterator it = this.zzk.iterator();
        while (it.hasNext()) {
            zzckz zzckzVar = (zzckz) it.next();
            zzckzVar.zzc.zzc();
            zzckzVar.zzd = zzbpq.zze;
            zzi$1.logp(Level.FINE, "io.grpc.util.MultiChildLoadBalancer$ChildLbState", "shutdown", "Child balancer {0} deleted", zzckzVar.zzb$1);
        }
        this.zzk.clear();
    }

    public final void zze$1() {
        zzbpq zzbpqVar;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.zzk.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            zzbpqVar = zzbpq.zzb;
            if (!hasNext) {
                break;
            }
            zzckz zzckzVar = (zzckz) it.next();
            if (zzckzVar.zzd == zzbpqVar) {
                arrayList.add(zzckzVar);
            }
        }
        if (!arrayList.isEmpty()) {
            zzl(zzbpqVar, zzm(arrayList));
            return;
        }
        Iterator it2 = this.zzk.iterator();
        while (it2.hasNext()) {
            zzbpq zzbpqVar2 = ((zzckz) it2.next()).zzd;
            zzbpq zzbpqVar3 = zzbpq.zza;
            if (zzbpqVar2 == zzbpqVar3 || zzbpqVar2 == zzbpq.zzd) {
                zzl(zzbpqVar3, new zzbrl(zzbro.zza));
                return;
            }
        }
        zzl(zzbpq.zzc, zzm(this.zzk));
    }

    public final void zzl(zzbpq zzbpqVar, zzbrt zzbrtVar) {
        if (zzbpqVar == this.zzh && zzbrtVar.equals(this.zzj)) {
            return;
        }
        this.zzl.zzb(zzbpqVar, zzbrtVar);
        this.zzh = zzbpqVar;
        this.zzj = zzbrtVar;
    }

    public final zzcla zzm(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((zzckz) it.next()).zze);
        }
        return new zzcla(arrayList2, this.zzi);
    }
}
