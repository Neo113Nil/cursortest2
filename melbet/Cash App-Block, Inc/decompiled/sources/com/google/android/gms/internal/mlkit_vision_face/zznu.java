package com.google.android.gms.internal.mlkit_vision_face;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import org.brotli.dec.HuffmanTreeGroup;

/* loaded from: classes4.dex */
public final class zznu implements zzob {
    public final ArrayList zza;

    public zznu(Context context, zznq zznqVar) {
        ArrayList arrayList = new ArrayList();
        this.zza = arrayList;
        zznqVar.getClass();
        arrayList.add(new zzok(context, zznqVar));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzob
    public final void zza$7(HuffmanTreeGroup huffmanTreeGroup) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzob) it.next()).zza$7(huffmanTreeGroup);
        }
    }
}
