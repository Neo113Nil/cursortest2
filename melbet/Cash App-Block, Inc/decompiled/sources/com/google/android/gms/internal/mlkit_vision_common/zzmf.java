package com.google.android.gms.internal.mlkit_vision_common;

import android.content.Context;
import com.google.android.gms.auth.api.zbc;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class zzmf implements zzmc {
    public final ArrayList zza;

    public zzmf(Context context, zzma zzmaVar) {
        ArrayList arrayList = new ArrayList();
        this.zza = arrayList;
        zzmaVar.getClass();
        arrayList.add(new zzmp(context, zzmaVar));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmc
    public final void zza(zbc zbcVar) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzmc) it.next()).zza(zbcVar);
        }
    }
}
