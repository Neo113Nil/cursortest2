package com.google.android.gms.internal.measurement;

import androidx.media3.common.util.StuckPlayerDetector;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.model.zzdi;
import com.google.android.libraries.places.api.net.zzt;
import com.google.android.libraries.places.internal.zzbcc;
import com.google.android.libraries.places.internal.zzbch;
import com.google.android.libraries.places.internal.zzbcv;
import com.google.android.libraries.places.internal.zzbgl;
import com.google.android.libraries.places.internal.zzbgp;
import com.google.android.libraries.places.internal.zzbhm;
import com.google.android.libraries.places.internal.zzbhv;
import com.google.android.libraries.places.internal.zzbhx;
import com.google.android.libraries.places.internal.zzbjc;
import com.google.android.libraries.places.internal.zzbov;
import com.google.android.libraries.places.internal.zzbow;
import com.google.android.libraries.places.internal.zzbso;
import com.google.android.libraries.places.internal.zzbsq;
import com.google.android.libraries.places.internal.zzcka;
import com.google.android.libraries.places.internal.zzckb;
import com.google.android.libraries.places.internal.zzcko;
import com.google.android.libraries.places.internal.zzjn;
import com.google.common.util.concurrent.AbstractTransformFuture;
import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SequentialExecutor;
import com.squareup.workflow1.internal.SubtreeManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import net.oneformapp.schema.Schema;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzuc implements AsyncFunction {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object zza;
    public final /* synthetic */ Object zzb;
    public final /* synthetic */ Object zzc;

    public /* synthetic */ zzuc(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    @Override // com.google.common.util.concurrent.AsyncFunction
    public final ListenableFuture apply(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                StuckPlayerDetector stuckPlayerDetector = (StuckPlayerDetector) this.zza;
                AbstractTransformFuture.AsyncTransformFuture asyncTransformFuture = (AbstractTransformFuture.AsyncTransformFuture) this.zzb;
                AbstractTransformFuture.AsyncTransformFuture asyncTransformFuture2 = (AbstractTransformFuture.AsyncTransformFuture) this.zzc;
                if (Futures.getDone(asyncTransformFuture).equals(Futures.getDone(asyncTransformFuture2))) {
                    return Futures.immediateFuture(obj);
                }
                zzqa zzqaVar = new zzqa(2, stuckPlayerDetector, asyncTransformFuture2);
                int i = zzxa.$r8$clinit;
                AbstractTransformFuture.AsyncTransformFuture transformAsync = Futures.transformAsync(asyncTransformFuture2, new zzqa(4, zzvy.zzb(), zzqaVar), (SequentialExecutor) stuckPlayerDetector.clock);
                synchronized (stuckPlayerDetector.stuckPlayingDetector) {
                }
                return transformAsync;
            case 1:
                zztp zztpVar = (zztp) this.zza;
                return zztpVar.zzc.zzb((zzqa) this.zzb, (Executor) this.zzc);
            case 2:
                SubtreeManager subtreeManager = (SubtreeManager) this.zza;
                com.google.android.libraries.places.internal.zzns zznsVar = (com.google.android.libraries.places.internal.zzns) this.zzb;
                com.google.android.libraries.places.api.net.zzk zzkVar = (com.google.android.libraries.places.api.net.zzk) this.zzc;
                zzbgl zzy = subtreeManager.zzy(zznsVar, "", (com.google.android.libraries.places.api.auth.zzd) obj, 4);
                Locale zzf = Places.zza.zzf();
                zzbcc zza$1 = zzbch.zza$1();
                String str = zzkVar.zza;
                str.getClass();
                zza$1.zzy();
                ((zzbch) zza$1.zza).zzd(str);
                String languageTag = zzf.toLanguageTag();
                zza$1.zzy();
                ((zzbch) zza$1.zza).zzi(languageTag);
                for (String str2 : zzkVar.zze) {
                    zza$1.zzy();
                    ((zzbch) zza$1.zza).zzh$1(str2);
                }
                zzdi zzdiVar = zzkVar.zzf;
                if (zzdiVar != null) {
                    String zzdiVar2 = zzdiVar.toString();
                    zza$1.zzy();
                    ((zzbch) zza$1.zza).zzm(zzdiVar2);
                }
                for (String str3 : zzkVar.zzg) {
                    zza$1.zzy();
                    ((zzbch) zza$1.zza).zzg(str3);
                }
                zzbch zzbchVar = (zzbch) zza$1.zzD();
                zzbow zzbowVar = (zzbow) zzy.zza;
                Schema schema = zzjn.zze;
                if (schema == null) {
                    synchronized (zzjn.class) {
                        try {
                            schema = zzjn.zze;
                            if (schema == null) {
                                zzbso zzi = Schema.zzi();
                                zzi.zzc = zzbsq.zza;
                                zzi.zzd = Schema.zzh("google.maps.places.v1.Places", "AutocompletePlaces");
                                zzi.zze = true;
                                zzbch zzc = zzbch.zzc();
                                zzbjc zzbjcVar = zzckb.zza;
                                zzi.zza = new zzcka(zzc);
                                zzi.zzb = new zzcka(zzbcv.zzc());
                                Schema zzf2 = zzi.zzf();
                                zzjn.zze = zzf2;
                                schema = zzf2;
                            }
                        } finally {
                        }
                    }
                }
                return zzcko.zzb(zzbowVar.zza(schema, (zzbov) zzy.zzd), zzbchVar);
            default:
                SubtreeManager subtreeManager2 = (SubtreeManager) this.zza;
                com.google.android.libraries.places.internal.zzns zznsVar2 = com.google.android.libraries.places.internal.zzns.zzc;
                String str4 = (String) this.zzb;
                zzt zztVar = (zzt) this.zzc;
                zzbgl zzy2 = subtreeManager2.zzy(zznsVar2, str4, (com.google.android.libraries.places.api.auth.zzd) obj, 3);
                Locale zzf3 = Places.zza.zzf();
                zzbhm zza$12 = zzbhv.zza$1();
                zza$12.zzy();
                ((zzbhv) zza$12.zza).zzh(false);
                List list = zztVar.zzi;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    int intValue = ((Integer) it.next()).intValue();
                    if (intValue == 0) {
                        arrayList.add(zzbgp.PRICE_LEVEL_FREE);
                    } else if (intValue == 1) {
                        arrayList.add(zzbgp.PRICE_LEVEL_INEXPENSIVE);
                    } else if (intValue == 2) {
                        arrayList.add(zzbgp.PRICE_LEVEL_MODERATE);
                    } else if (intValue == 3) {
                        arrayList.add(zzbgp.PRICE_LEVEL_EXPENSIVE);
                    } else if (intValue == 4) {
                        arrayList.add(zzbgp.PRICE_LEVEL_VERY_EXPENSIVE);
                    }
                }
                zza$12.zzy();
                ((zzbhv) zza$12.zza).zzl(arrayList);
                zza$12.zzy();
                ((zzbhv) zza$12.zza).zzu(2);
                zza$12.zzy();
                ((zzbhv) zza$12.zza).zzm(false);
                String str5 = zztVar.zzm;
                zza$12.zzy();
                ((zzbhv) zza$12.zza).zzd(str5);
                String languageTag2 = zzf3.toLanguageTag();
                zza$12.zzy();
                ((zzbhv) zza$12.zza).zze(languageTag2);
                zzbhv zzbhvVar = (zzbhv) zza$12.zzD();
                zzbow zzbowVar2 = (zzbow) zzy2.zza;
                Schema schema2 = zzjn.f73zzb;
                if (schema2 == null) {
                    synchronized (zzjn.class) {
                        try {
                            schema2 = zzjn.f73zzb;
                            if (schema2 == null) {
                                zzbso zzi2 = Schema.zzi();
                                zzi2.zzc = zzbsq.zza;
                                zzi2.zzd = Schema.zzh("google.maps.places.v1.Places", "SearchText");
                                zzi2.zze = true;
                                zzbhv zzc2 = zzbhv.zzc();
                                zzbjc zzbjcVar2 = zzckb.zza;
                                zzi2.zza = new zzcka(zzc2);
                                zzi2.zzb = new zzcka(zzbhx.zzf());
                                Schema zzf4 = zzi2.zzf();
                                zzjn.f73zzb = zzf4;
                                schema2 = zzf4;
                            }
                        } finally {
                        }
                    }
                }
                return zzcko.zzb(zzbowVar2.zza(schema2, (zzbov) zzy2.zzd), zzbhvVar);
        }
    }
}
