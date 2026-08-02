package com.google.android.gms.internal.measurement;

import android.net.Uri;
import coil3.ComponentRegistry;
import com.google.common.collect.ImmutableList;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class zzzm {
    public static final zzzk zza;
    public static final zzzl zzb;
    public final Object zzc;
    public final Serializable zzd;
    public final Object zze;
    public Object zzf;

    static {
        int i = 0;
        zza = new zzzk(i);
        zzb = new zzzl(i);
    }

    public zzzm(zzzm zzzmVar) {
        HashMap hashMap = new HashMap();
        this.zzc = hashMap;
        HashMap hashMap2 = new HashMap();
        this.zzd = hashMap2;
        hashMap.putAll((HashMap) zzzmVar.zzc);
        hashMap2.putAll((HashMap) zzzmVar.zzd);
        this.zze = (zzzk) zzzmVar.zze;
        this.zzf = (zzzl) zzzmVar.zzf;
    }

    public void zza(zzyl zzylVar, Object obj, zzzc zzzcVar) {
        zzzk zzzkVar = (zzzk) ((HashMap) this.zzc).get(zzylVar);
        if (zzzkVar != null) {
            zzzkVar.zza(zzylVar, obj, zzzcVar);
        } else {
            ((zzzk) this.zze).zza(zzylVar, obj, zzzcVar);
        }
    }

    public void zzb(zzyl zzylVar, Iterator it, zzzc zzzcVar) {
        zzzl zzzlVar = (zzzl) ((HashMap) this.zzd).get(zzylVar);
        if (zzzlVar != null) {
            zzzlVar.zza(zzylVar, it, zzzcVar);
            return;
        }
        zzzl zzzlVar2 = (zzzl) this.zzf;
        if (zzzlVar2 != null && !((HashMap) this.zzc).containsKey(zzylVar)) {
            zzzlVar2.zza(zzylVar, it, zzzcVar);
        } else {
            while (it.hasNext()) {
                zza(zzylVar, it.next(), zzzcVar);
            }
        }
    }

    public ArrayList zzd(OutputStream outputStream) {
        zzrq zza2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(outputStream);
        ArrayList arrayList2 = (ArrayList) this.zze;
        if (!arrayList2.isEmpty() && (zza2 = zzrq.zza(outputStream, arrayList2)) != null) {
            arrayList.add(zza2);
        }
        Iterator it = ((ImmutableList) this.zzd).iterator();
        if (!it.hasNext()) {
            Collections.reverse(arrayList);
            return arrayList;
        }
        JsonLogicResult$Success$$ExternalSyntheticOutline0.m4m(it.next());
        throw null;
    }

    public zzzm(ComponentRegistry.Builder builder) {
        this.zzc = (zzsx) builder.mappers;
        this.zzd = (ImmutableList) builder.keyers;
        this.zze = (ArrayList) builder.interceptors;
        this.zzf = (Uri) builder.lazyDecoderFactories;
    }

    public /* synthetic */ zzzm() {
        this.zzc = new HashMap();
        this.zzd = new HashMap();
        this.zzf = null;
        this.zze = zzxm.zza;
    }
}
