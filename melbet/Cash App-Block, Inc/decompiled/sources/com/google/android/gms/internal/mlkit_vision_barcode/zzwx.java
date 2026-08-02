package com.google.android.gms.internal.mlkit_vision_barcode;

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
public final class zzwx implements zzwf {
    public final Lazy zza;
    public final Lazy zzb;
    public final zzwd zzc;

    public zzwx(Context context, zzwd zzwdVar) {
        this.zzc = zzwdVar;
        CCTDestination cCTDestination = CCTDestination.INSTANCE;
        TransportRuntime.initialize(context);
        TransportFactoryImpl newFactory = TransportRuntime.getInstance().newFactory(cCTDestination);
        if (CCTDestination.SUPPORTED_ENCODINGS.contains(new Encoding("json"))) {
            this.zza = new Lazy(new com.google.android.gms.internal.mlkit_vision_face.zzoh(newFactory, 1));
        }
        this.zzb = new Lazy(new com.google.android.gms.internal.mlkit_vision_face.zzoh(newFactory, 2));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwf
    public final void zza(HuffmanTreeGroup huffmanTreeGroup) {
        zzwd zzwdVar = this.zzc;
        int i = zzwdVar.zzc;
        int i2 = zzwdVar.zzc;
        Priority priority = Priority.VERY_LOW;
        Priority priority2 = Priority.DEFAULT;
        if (i != 0) {
            ((TransportImpl) this.zzb.get()).send(huffmanTreeGroup.alphabetSize != 0 ? new AutoValue_Event(huffmanTreeGroup.zze(i2), priority2, null) : new AutoValue_Event(huffmanTreeGroup.zze(i2), priority, null));
            return;
        }
        Lazy lazy = this.zza;
        if (lazy != null) {
            ((TransportImpl) lazy.get()).send(huffmanTreeGroup.alphabetSize != 0 ? new AutoValue_Event(huffmanTreeGroup.zze(i2), priority2, null) : new AutoValue_Event(huffmanTreeGroup.zze(i2), priority, null));
        }
    }
}
