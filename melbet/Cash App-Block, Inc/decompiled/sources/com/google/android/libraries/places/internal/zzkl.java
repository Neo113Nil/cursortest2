package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.api.model.zzdg;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class zzkl {
    public static final ArrayList zza(zzbkb zzbkbVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = zzbkbVar.iterator();
        while (it.hasNext()) {
            zzbcr zzbcrVar = (zzbcr) it.next();
            arrayList.add(new zzdg(zzbcrVar.zza(), zzbcrVar.zzc() - zzbcrVar.zza()));
        }
        return arrayList;
    }
}
