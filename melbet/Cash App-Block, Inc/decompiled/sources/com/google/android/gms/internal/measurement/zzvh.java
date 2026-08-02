package com.google.android.gms.internal.measurement;

import com.google.android.libraries.places.internal.zzka;
import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzvh implements AsyncFunction {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object zza;
    public final /* synthetic */ int zzb;

    public /* synthetic */ zzvh(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.zza = obj;
        this.zzb = i;
    }

    @Override // com.google.common.util.concurrent.AsyncFunction
    public final /* synthetic */ ListenableFuture apply(Object obj) {
        int i = this.$r8$classId;
        int i2 = this.zzb;
        Object obj2 = this.zza;
        switch (i) {
            case 0:
                break;
        }
        return ((zzka) obj2).zzd(i2, (String) obj);
    }
}
