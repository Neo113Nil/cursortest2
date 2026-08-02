package com.google.android.gms.internal.mlkit_vision_face;

import android.content.Context;
import com.google.android.datatransport.AutoValue_Event;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.cct.CCTDestination;
import com.google.android.datatransport.runtime.TransportFactoryImpl;
import com.google.android.datatransport.runtime.TransportImpl;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.firebase.components.Lazy;
import org.brotli.dec.HuffmanTreeGroup;

/* loaded from: classes4.dex */
public final class zzok implements zzob {
    public final Lazy zzb;
    public final zznq zzc;

    public zzok(Context context, zznq zznqVar) {
        this.zzc = zznqVar;
        CCTDestination cCTDestination = CCTDestination.INSTANCE;
        TransportRuntime.initialize(context);
        TransportFactoryImpl newFactory = TransportRuntime.getInstance().newFactory(cCTDestination);
        if (CCTDestination.SUPPORTED_ENCODINGS.contains(new Encoding("json"))) {
            new Lazy(new zzoh(newFactory, 0));
        }
        this.zzb = new Lazy(new zzoh(newFactory, 5));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzob
    public final void zza$7(HuffmanTreeGroup huffmanTreeGroup) {
        this.zzc.getClass();
        ((TransportImpl) this.zzb.get()).send(huffmanTreeGroup.alphabetSize != 0 ? new AutoValue_Event(huffmanTreeGroup.zze(), Priority.DEFAULT, null) : new AutoValue_Event(huffmanTreeGroup.zze(), Priority.VERY_LOW, null));
    }
}
