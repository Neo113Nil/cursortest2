package com.google.android.libraries.places.internal;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.core.provider.CallbackWrapper$2;
import androidx.recyclerview.widget.DiffUtil;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.browsersdk.Fillr;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.AbstractTransformFuture;
import com.google.common.util.concurrent.DirectExecutor;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SequentialExecutor;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import net.oneformapp.schema.Schema;

/* loaded from: classes4.dex */
public final class zzaze extends zzbpa {
    public final zzbow zza;
    public final Schema zzb;
    public final ImmutableList zzc;
    public final zzayv zzd;
    public final zzbov zzj;
    public int zzk;
    public DiffUtil.Snake zzl;
    public int zzn;
    public zzaza zzo;
    public zzbsn zzp;
    public final zzazc zzr;
    public zzbpa zzt;
    public final Set zze = Collections.newSetFromMap(new IdentityHashMap());
    public final LinkedHashMap zzf = new LinkedHashMap();
    public final Set zzg = Collections.newSetFromMap(new IdentityHashMap());
    public boolean zzq = false;
    public boolean zzs = false;
    public final ArrayDeque zzh = new ArrayDeque();
    public final ArrayDeque zzm = new ArrayDeque();
    public final ArrayDeque zzi = new ArrayDeque();

    public zzaze(zzbow zzbowVar, Schema schema, zzbov zzbovVar, ImmutableList immutableList) {
        int i = 0;
        this.zza = zzbowVar;
        this.zzb = schema;
        this.zzj = zzbovVar;
        this.zzc = immutableList;
        this.zzl = new DiffUtil.Snake(immutableList.size(), 1, 0, 0);
        Executor executor = zzbovVar.zzc;
        executor = executor == null ? DirectExecutor.INSTANCE : executor;
        zzazc zzazcVar = new zzazc();
        zzazcVar.zza = executor;
        this.zzr = zzazcVar;
        this.zzd = new zzayv(i, this, new SequentialExecutor(zzazcVar));
    }

    public final void zzA(zzgc zzgcVar, zzazb zzazbVar) {
        LinkedHashMap linkedHashMap = zzazbVar.zzc;
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!((ListenableFuture) entry.getValue()).isDone()) {
                break;
            }
            it.remove();
            zzfr zzfrVar = (zzfr) entry.getKey();
            zzazm zzazmVar = zzazm.zza;
            if (CameraSelector$$ExternalSyntheticOutline0.equals(zzazmVar.zzb, 4)) {
                ListenableFuture zzd = zzazmVar.zzd();
                linkedHashMap.put(zzfrVar, zzd);
                zzd.addListener(zzvm.zza(new zzayq(this, zzgcVar, zzazbVar, 1)), this.zzd);
            }
            zzx(zzazmVar);
        }
        if (linkedHashMap.isEmpty()) {
            zzB();
            zzC();
        }
    }

    public final void zzB() {
        while (true) {
            ArrayDeque arrayDeque = this.zzh;
            if (arrayDeque.isEmpty()) {
                return;
            }
            zzazb zzazbVar = (zzazb) arrayDeque.peek();
            if (!zzazbVar.zzc.isEmpty() || zzazbVar.zzd != zzazbVar.zza.zzl.startX) {
                return;
            }
            Object obj = ((zzazb) arrayDeque.poll()).zzb;
            if (this.zzl.endY == 4) {
                this.zzt.zzb(obj);
            } else {
                this.zzi.add(obj);
            }
        }
    }

    public final void zzC() {
        if (this.zzq) {
            zzazb zzazbVar = (zzazb) this.zzh.peekLast();
            int i = this.zzl.endY - 1;
            if (i != 1) {
                if (i == 3 && zzazbVar == null) {
                    this.zzt.zzd();
                    return;
                }
                return;
            }
            if (zzazbVar == null || (zzazbVar.zzc.isEmpty() && zzazbVar.zzd == zzazbVar.zza.zzl.endX + 1)) {
                zzw();
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbpa
    public final void zza(zzboz zzbozVar, zzbsn zzbsnVar) {
        this.zzo = new zzaza(this, new zzazr(new zzazg(zzbozVar, this.zzc, this.zzg)));
        this.zzp = zzbsnVar;
        this.zzd.execute(zzvm.zza(new com.google.android.gms.tasks.zzc(this, zzbsnVar, false, 8)));
    }

    @Override // com.google.android.libraries.places.internal.zzbpa
    public final void zzb(Object obj) {
        this.zzd.execute(zzvm.zza(new com.google.android.gms.tasks.zzc(this, obj, false, 11)));
    }

    @Override // com.google.android.libraries.places.internal.zzbpa
    public final void zzc(int i) {
        synchronized (this.zzm) {
            this.zzn += i;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayDeque arrayDeque2 = this.zzm;
        synchronized (arrayDeque2) {
            try {
                if (!arrayDeque2.isEmpty()) {
                    int i2 = this.zzn;
                    for (int i3 = 0; i3 < i2; i3++) {
                        Object poll = arrayDeque2.poll();
                        if (poll != null) {
                            arrayDeque.add(poll);
                            this.zzn--;
                        }
                    }
                    boolean isEmpty = arrayDeque2.isEmpty();
                    Iterator it = arrayDeque.iterator();
                    while (it.hasNext()) {
                        this.zzo.zzb(it.next());
                    }
                    if (isEmpty) {
                        this.zzo.zzc(zzbtx.zza, null);
                    }
                }
            } finally {
            }
        }
        this.zzd.execute(zzvm.zza(new CallbackWrapper$2(this, i, 3)));
    }

    @Override // com.google.android.libraries.places.internal.zzbpa
    public final void zzd() {
        this.zzd.execute(zzvm.zza(new zzmu(this, 1)));
    }

    @Override // com.google.android.libraries.places.internal.zzbpa
    public final void zze(String str, Throwable th) {
        this.zzd.execute(zzvm.zza(new Fillr.AnonymousClass2(this, str, th)));
    }

    public final void zzt(zzbsn zzbsnVar) {
        LinkedHashMap linkedHashMap;
        String zzb = this.zza.zzb();
        Schema schema = this.zzb;
        schema.getClass();
        zzbov zzbovVar = this.zzj;
        zzbovVar.getClass();
        zzbsnVar.getClass();
        zzb.getClass();
        com.google.android.gms.maps.zzah zzahVar = new com.google.android.gms.maps.zzah(zzbovVar, zzbsnVar, zzb);
        ImmutableList immutableList = (ImmutableList) this.zzc.get(this.zzl.startY);
        int size = immutableList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            linkedHashMap = this.zzf;
            if (i2 >= size) {
                break;
            }
            zzfr zzfrVar = (zzfr) immutableList.get(i2);
            if (zzbovVar != ((zzbov) zzahVar.zzb)) {
                zzbsn zzbsnVar2 = (zzbsn) zzahVar.f68zza;
                String str = (String) zzahVar.zzc;
                schema.getClass();
                zzbovVar.getClass();
                zzbsnVar2.getClass();
                str.getClass();
            }
            zzfrVar.getClass();
            zzfp zzfpVar = zzfrVar.zzc;
            AbstractTransformFuture.TransformFuture transform = Futures.transform(zzfpVar.zzc, new zzfl(0), zzfpVar.zzb);
            zzfrVar.zza = transform;
            zzazm zzazmVar = new zzazm(4, transform);
            if (CameraSelector$$ExternalSyntheticOutline0.equals(4, 4)) {
                ListenableFuture zzd = zzazmVar.zzd();
                linkedHashMap.put(zzfrVar, zzd);
                zzd.addListener(zzvm.zza(new zzaym(this, zzahVar, i)), this.zzd);
            }
            zzx(zzazmVar);
            this.zzg.add(zzfrVar);
            i2++;
        }
        if (linkedHashMap.isEmpty()) {
            zzw();
        }
    }

    public final void zzu(com.google.android.gms.maps.zzah zzahVar) {
        com.google.android.gms.maps.zzah zzahVar2;
        zzazm zzazmVar;
        LinkedHashMap linkedHashMap = this.zzf;
        if (linkedHashMap.isEmpty()) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!((ListenableFuture) entry.getValue()).isDone()) {
                break;
            }
            it.remove();
            zzfr zzfrVar = (zzfr) entry.getKey();
            zzbov zzbovVar = (zzbov) zzahVar.zzb;
            zzbov zzbovVar2 = this.zzj;
            if (zzbovVar2 == zzbovVar) {
                zzahVar2 = zzahVar;
            } else {
                zzbsn zzbsnVar = (zzbsn) zzahVar.f68zza;
                String str = (String) zzahVar.zzc;
                this.zzb.getClass();
                zzbovVar2.getClass();
                zzbsnVar.getClass();
                str.getClass();
                zzahVar2 = new com.google.android.gms.maps.zzah(zzbovVar2, zzbsnVar, str);
            }
            zzfrVar.getClass();
            AbstractTransformFuture.TransformFuture transformFuture = zzfrVar.zza;
            if (transformFuture != null) {
                try {
                    Object done = Futures.getDone(transformFuture);
                    done.getClass();
                    String str2 = (String) done;
                    if (!str2.equals("")) {
                        zzbsn zzbsnVar2 = (zzbsn) zzahVar2.f68zza;
                        zzbsh zzbshVar = zzfr.zzb;
                        StringBuilder sb = new StringBuilder(str2.length() + 4);
                        sb.append("NID=");
                        sb.append(str2);
                        zzbsnVar2.zzc(zzbshVar, sb.toString());
                    }
                } catch (Exception unused) {
                }
                zzazmVar = zzazm.zza;
                zzazmVar.getClass();
            } else {
                zzazmVar = zzazm.zza;
                zzazmVar.getClass();
            }
            if (CameraSelector$$ExternalSyntheticOutline0.equals(zzazmVar.zzb, 4)) {
                ListenableFuture zzd = zzazmVar.zzd();
                linkedHashMap.put(zzfrVar, zzd);
                zzd.addListener(zzvm.zza(new zzaym(this, zzahVar, 1)), this.zzd);
            }
            zzx(zzazmVar);
        }
        if (!linkedHashMap.isEmpty() || this.zzs) {
            return;
        }
        zzw();
    }

    public final void zzw() {
        DiffUtil.Snake snake;
        DiffUtil.Snake snake2 = this.zzl;
        int i = snake2.endX;
        int i2 = snake2.startY;
        int i3 = snake2.startX;
        int i4 = snake2.endY;
        Trace.checkState("UNDERLYING_CALL_STARTED state is terminal, cannot transition", !(i4 == 4));
        if (i4 == 3) {
            snake = new DiffUtil.Snake(i3, 4, i2, i);
        } else if (i4 == 1 && snake2.reverse) {
            snake = new DiffUtil.Snake(i3, 2, i2, i2);
        } else {
            int i5 = i2 + 1;
            int i6 = i5 >= i3 ? 3 : 1;
            if (i5 < i3) {
                i2 = i5;
            }
            snake = new DiffUtil.Snake(i3, i6, i2, i);
        }
        this.zzl = snake;
        int i7 = snake.endY - 1;
        if (i7 == 0) {
            zzt(this.zzp);
            return;
        }
        if (i7 != 2) {
            zzy();
            return;
        }
        zzbpa zza = this.zza.zza(this.zzb, this.zzj);
        this.zzt = zza;
        zza.zza(this.zzo, this.zzp);
        int i8 = this.zzk;
        if (i8 > 0) {
            this.zzt.zzc(i8);
        }
        Iterator it = this.zzi.iterator();
        while (it.hasNext()) {
            this.zzt.zzb(it.next());
        }
        if (this.zzq && this.zzh.isEmpty()) {
            this.zzt.zzd();
        }
        zzw();
    }

    public final void zzx(zzazm zzazmVar) {
        int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(zzazmVar.zzb);
        if (ordinal != 0) {
            if (ordinal == 1) {
                throw null;
            }
            if (ordinal == 2) {
                throw null;
            }
            if (ordinal == 3) {
                ListenableFuture zzd = zzazmVar.zzd();
                this.zze.add(zzd);
                zzd.addListener(zzvm.zza(new com.google.android.gms.tasks.zzc(this, zzd, false, 10)), this.zzd);
            } else if (ordinal == 4) {
                this.zzl.reverse = true;
            } else {
                int i = zzazmVar.zzb;
                a$$ExternalSyntheticBUOutline0.m$1("Unrecognized outcome type: ".concat(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "DELAY_START" : "CONTINUE_AFTER" : "ABORT_WITH_RESPONSE" : "ABORT_WITH_EXCEPTION" : "PROCEED"));
            }
        }
    }

    public final void zzy() {
        int i = this.zzl.endY - 1;
        ArrayDeque arrayDeque = this.zzh;
        if (i != 1) {
            if (i != 3) {
                return;
            }
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                zzazb zzazbVar = (zzazb) it.next();
                zzz(zzazbVar, zzazbVar.zzd, this.zzl.startX);
            }
            return;
        }
        Iterator it2 = arrayDeque.iterator();
        while (it2.hasNext()) {
            zzazb zzazbVar2 = (zzazb) it2.next();
            int i2 = zzazbVar2.zzd;
            int i3 = this.zzl.endX;
            if (i2 <= i3) {
                zzz(zzazbVar2, i2, i3 + 1);
            }
        }
    }

    public final void zzz(zzazb zzazbVar, int i, int i2) {
        Object obj = zzazbVar.zzb;
        LinkedHashMap linkedHashMap = zzazbVar.zzc;
        zzgc zzgcVar = new zzgc(5);
        Trace.checkNotNull(obj, "Request message cannot be null");
        while (i < i2) {
            ImmutableList immutableList = (ImmutableList) this.zzc.get(i);
            int size = immutableList.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                zzfr zzfrVar = (zzfr) immutableList.get(i4);
                zzazm zzazmVar = zzazm.zza;
                if (CameraSelector$$ExternalSyntheticOutline0.equals(zzazmVar.zzb, 4)) {
                    ListenableFuture zzd = zzazmVar.zzd();
                    linkedHashMap.put(zzfrVar, zzd);
                    zzd.addListener(zzvm.zza(new zzayq(this, zzgcVar, zzazbVar, i3)), this.zzd);
                }
                zzx(zzazmVar);
            }
            i++;
        }
        zzazbVar.zzd = i2;
        if (linkedHashMap.isEmpty()) {
            zzB();
            zzC();
        }
    }
}
