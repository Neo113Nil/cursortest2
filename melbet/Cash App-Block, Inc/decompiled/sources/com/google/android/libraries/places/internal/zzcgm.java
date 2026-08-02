package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public interface zzcgm {
    public static final zzcgm zza;

    static {
        zzcgm zzbweVar;
        try {
            Class.forName("java.time.Instant");
            zzbweVar = new zzbzn();
        } catch (ClassNotFoundException unused) {
            zzbweVar = new zzbwe();
        }
        zza = zzbweVar;
    }

    long zza();
}
