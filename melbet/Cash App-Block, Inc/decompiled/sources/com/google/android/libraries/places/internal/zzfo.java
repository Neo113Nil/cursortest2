package com.google.android.libraries.places.internal;

import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzfo implements Callable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object zza;

    public /* synthetic */ zzfo(Object obj, int i) {
        this.$r8$classId = i;
        this.zza = obj;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        int i = this.$r8$classId;
        Object obj = this.zza;
        switch (i) {
            case 0:
                return ((zzfp) obj).zza.getSharedPreferences("com.google.geo_sdk.PREFERENCES_FILE", 0);
            default:
                return ((zzjt) obj).zzb();
        }
    }
}
