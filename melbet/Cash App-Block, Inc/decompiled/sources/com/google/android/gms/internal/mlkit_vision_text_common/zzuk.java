package com.google.android.gms.internal.mlkit_vision_text_common;

import android.content.Context;
import com.google.android.datatransport.AutoValue_Event;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.cct.CCTDestination;
import com.google.android.datatransport.runtime.TransportFactoryImpl;
import com.google.android.datatransport.runtime.TransportImpl;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.gms.internal.mlkit_vision_face.zzoh;
import com.google.firebase.components.Lazy;
import org.brotli.dec.HuffmanTreeGroup;

/* loaded from: classes4.dex */
public final class zzuk implements zzts {
    public final Lazy zzb;
    public final zztq zzc;

    public zzuk(Context context, zztq zztqVar) {
        this.zzc = zztqVar;
        CCTDestination cCTDestination = CCTDestination.INSTANCE;
        TransportRuntime.initialize(context);
        TransportFactoryImpl newFactory = TransportRuntime.getInstance().newFactory(cCTDestination);
        if (CCTDestination.SUPPORTED_ENCODINGS.contains(new Encoding("json"))) {
            new Lazy(new zzoh(newFactory, 6));
        }
        this.zzb = new Lazy(new zzoh(newFactory, 7));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzts
    public final void zza$8(HuffmanTreeGroup huffmanTreeGroup) {
        this.zzc.getClass();
        ((TransportImpl) this.zzb.get()).send(huffmanTreeGroup.alphabetSize != 0 ? new AutoValue_Event(huffmanTreeGroup.zze(), Priority.DEFAULT, null) : new AutoValue_Event(huffmanTreeGroup.zze(), Priority.VERY_LOW, null));
    }
}
