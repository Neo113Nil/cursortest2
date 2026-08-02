package com.google.android.libraries.places.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.RegularImmutableList;
import java.util.ArrayList;
import java.util.UUID;
import java.util.WeakHashMap;

/* loaded from: classes4.dex */
public abstract class zzun {
    public static final WeakHashMap zza = new WeakHashMap();
    public static final WeakHashMap zzb = new WeakHashMap();

    public static void zza(Throwable th) {
        Throwable th2;
        zzmg zzmgVar;
        zzuh zzuhVar;
        WeakHashMap weakHashMap = zzb;
        synchronized (weakHashMap) {
            th2 = th;
            while (th2 != null) {
                try {
                    if (weakHashMap.containsKey(th2)) {
                        break;
                    } else {
                        th2 = th2.getCause();
                    }
                } finally {
                }
            }
            weakHashMap.put(th, Boolean.valueOf(th2 != null));
        }
        if (th2 != null) {
            return;
        }
        WeakHashMap weakHashMap2 = zza;
        synchronized (weakHashMap2) {
            Throwable th3 = th;
            while (th3 != null) {
                try {
                    if (weakHashMap2.containsKey(th3)) {
                        break;
                    } else {
                        th3 = th3.getCause();
                    }
                } finally {
                }
            }
            if (th3 == null) {
                zzmgVar = null;
            } else {
                weakHashMap2.put(th, (zzuj) weakHashMap2.get(th3));
                zzmgVar = new zzmg();
            }
        }
        if (zzmgVar != null || (zzuhVar = zzur.zzd().zzb) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (zzuhVar = zzur.zzd().zzb; zzuhVar != null; zzuhVar = null) {
            arrayList.add(zzuhVar);
        }
        UUID uuid = ((zzuh) arrayList.get(0)).zza;
        if (uuid == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null rootTraceId");
            return;
        }
        ((zzuh) arrayList.get(0)).getClass();
        ImmutableList.Builder builderWithExpectedSize = ImmutableList.builderWithExpectedSize(arrayList.size());
        ImmutableList.Builder builderWithExpectedSize2 = ImmutableList.builderWithExpectedSize(arrayList.size());
        for (zzuh zzuhVar2 : Maps.reverse(arrayList)) {
            builderWithExpectedSize2.m2032add((Object) zzuhVar2.zzc);
            builderWithExpectedSize.m2032add((Object) zzuhVar2.zzg());
        }
        WeakHashMap weakHashMap3 = zza;
        synchronized (weakHashMap3) {
            try {
                RegularImmutableList build = builderWithExpectedSize2.build();
                if (build == null) {
                    throw new NullPointerException("Null spansNames");
                }
                RegularImmutableList build2 = builderWithExpectedSize.build();
                if (build2 == null) {
                    throw new NullPointerException("Null extras");
                }
                weakHashMap3.put(th, new zzuj(build, build2, uuid));
            } finally {
            }
        }
    }
}
