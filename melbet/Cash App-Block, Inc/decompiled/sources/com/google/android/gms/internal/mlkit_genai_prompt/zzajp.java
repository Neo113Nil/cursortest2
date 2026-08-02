package com.google.android.gms.internal.mlkit_genai_prompt;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class zzajp implements zzajm {
    public final ArrayList zza;

    public zzajp(Context context, zzajk zzajkVar) {
        ArrayList arrayList = new ArrayList();
        this.zza = arrayList;
        zzajkVar.getClass();
        arrayList.add(new zzajz(context, zzajkVar));
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzajm
    public final void zza(zzfr zzfrVar) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzajm) it.next()).zza(zzfrVar);
        }
    }
}
