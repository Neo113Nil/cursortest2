package com.google.android.gms.internal.mlkit_genai_prompt;

import android.content.Context;
import com.android.volley.RequestQueue;
import com.google.android.datatransport.AutoValue_Event;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.cct.CCTDestination;
import com.google.android.datatransport.runtime.TransportFactoryImpl;
import com.google.android.datatransport.runtime.TransportImpl;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.ObjectEncoder;
import com.nimbusds.jose.JWECryptoParts;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class zzajz implements zzajm {
    public final zzlg zzb;
    public final zzajk zzc;

    public zzajz(Context context, zzajk zzajkVar) {
        this.zzc = zzajkVar;
        CCTDestination cCTDestination = CCTDestination.INSTANCE;
        TransportRuntime.initialize(context);
        final TransportFactoryImpl newFactory = TransportRuntime.getInstance().newFactory(cCTDestination);
        if (CCTDestination.SUPPORTED_ENCODINGS.contains(new Encoding("json"))) {
            final int i = 0;
            new zzlg(new zzlt() { // from class: com.google.android.gms.internal.mlkit_genai_prompt.zzajw
                @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzlt
                public final Object zza() {
                    int i2 = i;
                    TransportFactoryImpl transportFactoryImpl = newFactory;
                    switch (i2) {
                        case 0:
                            return transportFactoryImpl.getTransport("FIREBASE_ML_SDK", new Encoding("json"), new zzzx(4));
                        default:
                            return transportFactoryImpl.getTransport("FIREBASE_ML_SDK", new Encoding("proto"), new zzzx(5));
                    }
                }
            });
        }
        final int i2 = 1;
        this.zzb = new zzlg(new zzlt() { // from class: com.google.android.gms.internal.mlkit_genai_prompt.zzajw
            @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzlt
            public final Object zza() {
                int i22 = i2;
                TransportFactoryImpl transportFactoryImpl = newFactory;
                switch (i22) {
                    case 0:
                        return transportFactoryImpl.getTransport("FIREBASE_ML_SDK", new Encoding("json"), new zzzx(4));
                    default:
                        return transportFactoryImpl.getTransport("FIREBASE_ML_SDK", new Encoding("proto"), new zzzx(5));
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzajm
    public final void zza(zzfr zzfrVar) {
        zzlo zzloVar;
        ObjectEncoder objectEncoder;
        zzajk zzajkVar = this.zzc;
        zzajkVar.getClass();
        TransportImpl transportImpl = (TransportImpl) this.zzb.zza();
        zzajkVar.getClass();
        zzzx zzzxVar = zzzx.zza;
        ((RequestQueue) zzfrVar.zzb).mCacheDispatcher = false;
        RequestQueue requestQueue = (RequestQueue) zzfrVar.zzb;
        requestQueue.mDelivery = Boolean.FALSE;
        zzahn zzahnVar = new zzahn(requestQueue);
        JWECryptoParts jWECryptoParts = (JWECryptoParts) zzfrVar.zza;
        jWECryptoParts.header = zzahnVar;
        try {
            zzzx.zza();
            zzacd zzacdVar = new zzacd(jWECryptoParts);
            zzlq zzlqVar = new zzlq();
            zzzxVar.configure(zzlqVar);
            HashMap hashMap = new HashMap((HashMap) zzlqVar.zzc);
            HashMap hashMap2 = new HashMap((HashMap) zzlqVar.zzd);
            zzyj zzyjVar = (zzyj) zzlqVar.zze;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                zzloVar = new zzlo(byteArrayOutputStream, hashMap, hashMap2, zzyjVar);
                objectEncoder = (ObjectEncoder) hashMap.get(zzacd.class);
            } catch (IOException unused) {
            }
            if (objectEncoder == null) {
                throw new EncodingException("No encoder for ".concat(String.valueOf(zzacd.class)));
            }
            objectEncoder.encode(zzacdVar, zzloVar);
            transportImpl.send(new AutoValue_Event(byteArrayOutputStream.toByteArray(), Priority.VERY_LOW, null));
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }
}
