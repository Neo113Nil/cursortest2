package com.google.android.gms.internal.mlkit_vision_barcode;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class zzbw extends zzbv implements Serializable {
    public final transient zzci zza;
    public transient int zzb;

    public zzbw() {
        zzci zzciVar = new zzci();
        if (zzciVar.isEmpty()) {
            this.zza = zzciVar;
        } else {
            Path$$ExternalSyntheticBUOutline0.m$3();
            throw null;
        }
    }

    public final void zzs() {
        zzci zzciVar = this.zza;
        Iterator it = zzciVar.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        zzciVar.clear();
        this.zzb = 0;
    }

    public final boolean zzt(Object obj, Object obj2) {
        zzci zzciVar = this.zza;
        Collection collection = (Collection) zzciVar.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.zzb++;
            return true;
        }
        ArrayList arrayList = new ArrayList(3);
        if (!arrayList.add(obj2)) {
            a$$ExternalSyntheticBUOutline0.m$1((Object) "New Collection violated the Collection spec");
            return false;
        }
        this.zzb++;
        zzciVar.put(obj, arrayList);
        return true;
    }
}
