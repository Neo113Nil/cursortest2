package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.google.firebase.DataCollectionDefaultChange;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

/* loaded from: classes.dex */
public final class zzpi {
    public volatile zzon zza;
    public zzpg zzb;

    public final zzpg zza(final zzlk zzlkVar) {
        final zzon zzonVar = this.zza;
        zzon zzonVar2 = zzpg.zza;
        if (zzonVar != zzonVar2) {
            zzxs zzxsVar = zzpg.zzc;
            zzxsVar.getClass();
            final DataCollectionDefaultChange dataCollectionDefaultChange = new DataCollectionDefaultChange();
            dataCollectionDefaultChange.enabled = false;
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) zzxsVar.zza$1;
            Context context = zzlkVar.zzh;
            String str = zzonVar.zzd;
            if (str == null) {
                str = (String) zzonVar.zza.apply(context);
                zzonVar.zzd = str;
            }
            zzoo zzooVar = (zzoo) concurrentHashMap.computeIfAbsent(str, new Function() { // from class: com.google.android.gms.internal.measurement.zzpb
                @Override // java.util.function.Function
                public final /* synthetic */ Object apply(Object obj) {
                    zzoo zzooVar2 = new zzoo(new zzpg(zzlk.this, zzonVar));
                    dataCollectionDefaultChange.enabled = true;
                    return zzooVar2;
                }
            });
            if (dataCollectionDefaultChange.enabled) {
                Context context2 = zzlkVar.zzh;
                zzxs zzxsVar2 = new zzxs(zzxsVar);
                if (zzql.zzb == null) {
                    synchronized (zzql.class) {
                        try {
                            if (zzql.zzb == null) {
                                if (!Objects.equals(context2.getPackageName(), "com.google.android.gms")) {
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        context2.registerReceiver(new zzql(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"), 2);
                                    } else {
                                        context2.registerReceiver(new zzql(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"));
                                    }
                                }
                                zzql.zzb = zzxsVar2;
                            }
                        } finally {
                        }
                    }
                }
            }
            this.zzb = zzooVar.zza;
            this.zza = zzonVar2;
        }
        return this.zzb;
    }
}
