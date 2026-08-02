package com.google.android.gms.internal.mlkit_vision_common;

import android.content.Context;
import com.android.volley.RequestQueue;
import com.google.android.datatransport.AutoValue_Event;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.cct.CCTDestination;
import com.google.android.datatransport.runtime.TransportFactoryImpl;
import com.google.android.datatransport.runtime.TransportImpl;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.gms.auth.api.zbc;
import com.google.android.gms.internal.mlkit_vision_face.zzoh;
import com.google.firebase.components.Lazy;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class zzmp implements zzmc {
    public final Lazy zzb;
    public final zzma zzc;

    public zzmp(Context context, zzma zzmaVar) {
        this.zzc = zzmaVar;
        CCTDestination cCTDestination = CCTDestination.INSTANCE;
        TransportRuntime.initialize(context);
        TransportFactoryImpl newFactory = TransportRuntime.getInstance().newFactory(cCTDestination);
        if (CCTDestination.SUPPORTED_ENCODINGS.contains(new Encoding("json"))) {
            new Lazy(new zzoh(newFactory, 3));
        }
        this.zzb = new Lazy(new zzoh(newFactory, 4));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmc
    public final void zza(zbc zbcVar) {
        zzak zzakVar;
        ObjectEncoder objectEncoder;
        zzma zzmaVar = this.zzc;
        zzmaVar.getClass();
        TransportImpl transportImpl = (TransportImpl) this.zzb.get();
        zzmaVar.getClass();
        zzmw zzmwVar = zzmw.zza$1;
        com.google.android.gms.maps.zzah zzahVar = (com.google.android.gms.maps.zzah) zbcVar.zba;
        ((RequestQueue) zbcVar.zbb).mCacheDispatcher = false;
        RequestQueue requestQueue = (RequestQueue) zbcVar.zbb;
        requestQueue.mDelivery = Boolean.FALSE;
        zzahVar.f68zza = new zzla(requestQueue);
        try {
            zzmw.zza();
            zziy zziyVar = new zziy(zzahVar);
            com.google.android.gms.maps.zzah zzahVar2 = new com.google.android.gms.maps.zzah(6);
            zzmwVar.configure(zzahVar2);
            HashMap hashMap = new HashMap((HashMap) zzahVar2.f68zza);
            HashMap hashMap2 = new HashMap((HashMap) zzahVar2.zzb);
            zzaj zzajVar = (zzaj) zzahVar2.zzc;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                zzakVar = new zzak(byteArrayOutputStream, hashMap, hashMap2, zzajVar);
                objectEncoder = (ObjectEncoder) hashMap.get(zziy.class);
            } catch (IOException unused) {
            }
            if (objectEncoder == null) {
                throw new EncodingException("No encoder for ".concat(String.valueOf(zziy.class)));
            }
            objectEncoder.encode(zziyVar, zzakVar);
            transportImpl.send(new AutoValue_Event(byteArrayOutputStream.toByteArray(), Priority.VERY_LOW, null));
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }
}
