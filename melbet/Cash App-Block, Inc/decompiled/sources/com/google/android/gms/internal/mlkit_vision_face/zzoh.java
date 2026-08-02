package com.google.android.gms.internal.mlkit_vision_face;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.TransportFactoryImpl;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxb;
import com.google.android.gms.internal.mlkit_vision_common.zzmw;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuo;
import com.google.firebase.inject.Provider;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzoh implements Provider {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TransportFactoryImpl zza;

    public /* synthetic */ zzoh(TransportFactoryImpl transportFactoryImpl, int i) {
        this.$r8$classId = i;
        this.zza = transportFactoryImpl;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        int i = this.$r8$classId;
        int i2 = 3;
        int i3 = 2;
        TransportFactoryImpl transportFactoryImpl = this.zza;
        switch (i) {
            case 0:
                return transportFactoryImpl.getTransport("FIREBASE_ML_SDK", new Encoding("json"), zzoo.zza$3);
            case 1:
                return transportFactoryImpl.getTransport("FIREBASE_ML_SDK", new Encoding("json"), new zzxb(i2));
            case 2:
                return transportFactoryImpl.getTransport("FIREBASE_ML_SDK", new Encoding("proto"), new zzxb(i3));
            case 3:
                return transportFactoryImpl.getTransport("FIREBASE_ML_SDK", new Encoding("json"), zzmw.zza$3);
            case 4:
                return transportFactoryImpl.getTransport("FIREBASE_ML_SDK", new Encoding("proto"), zzmw.zza$2);
            case 5:
                return transportFactoryImpl.getTransport("FIREBASE_ML_SDK", new Encoding("proto"), zzoo.zza$2);
            case 6:
                return transportFactoryImpl.getTransport("FIREBASE_ML_SDK", new Encoding("json"), new zzuo(i2));
            default:
                return transportFactoryImpl.getTransport("FIREBASE_ML_SDK", new Encoding("proto"), new zzuo(i3));
        }
    }
}
