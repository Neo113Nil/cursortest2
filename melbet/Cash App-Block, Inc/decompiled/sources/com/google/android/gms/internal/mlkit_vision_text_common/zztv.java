package com.google.android.gms.internal.mlkit_vision_text_common;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import org.brotli.dec.HuffmanTreeGroup;

/* loaded from: classes4.dex */
public final class zztv implements zzts {
    public final ArrayList zza;

    public zztv(Context context, zztq zztqVar) {
        ArrayList arrayList = new ArrayList();
        this.zza = arrayList;
        zztqVar.getClass();
        arrayList.add(new zzuk(context, zztqVar));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzts
    public final void zza$8(HuffmanTreeGroup huffmanTreeGroup) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzts) it.next()).zza$8(huffmanTreeGroup);
        }
    }
}
