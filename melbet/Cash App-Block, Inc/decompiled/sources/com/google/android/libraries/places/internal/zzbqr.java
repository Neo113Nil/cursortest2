package com.google.android.libraries.places.internal;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public final class zzbqr {
    public static final Logger zzb = Logger.getLogger(zzbqr.class.getName());
    public static final zzbqr zzc = new zzbqr();
    public final ConcurrentSkipListMap zzd;
    public final ConcurrentHashMap zze;
    public final ConcurrentHashMap zzf;

    public zzbqr() {
        new ConcurrentSkipListMap();
        this.zzd = new ConcurrentSkipListMap();
        this.zze = new ConcurrentHashMap();
        this.zzf = new ConcurrentHashMap();
        new ConcurrentHashMap();
    }
}
