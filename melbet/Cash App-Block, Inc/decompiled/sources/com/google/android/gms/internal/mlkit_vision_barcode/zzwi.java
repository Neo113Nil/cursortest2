package com.google.android.gms.internal.mlkit_vision_barcode;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import org.brotli.dec.HuffmanTreeGroup;

/* loaded from: classes4.dex */
public final class zzwi implements zzwf {
    public final ArrayList zza;

    public zzwi(Context context, zzwd zzwdVar) {
        ArrayList arrayList = new ArrayList();
        this.zza = arrayList;
        zzwdVar.getClass();
        arrayList.add(new zzwx(context, zzwdVar));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwf
    public final void zza(HuffmanTreeGroup huffmanTreeGroup) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzwf) it.next()).zza(huffmanTreeGroup);
        }
    }
}
