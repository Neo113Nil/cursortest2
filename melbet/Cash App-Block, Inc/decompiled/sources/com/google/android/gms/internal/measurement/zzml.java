package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.ApiException;
import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzml implements AsyncFunction {
    public static final /* synthetic */ zzml zza = new zzml(0);
    public static final /* synthetic */ zzml zza$1 = new zzml(2);
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ zzml(int i) {
        this.$r8$classId = i;
    }

    @Override // com.google.common.util.concurrent.AsyncFunction
    public final ListenableFuture apply(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ApiException apiException = (ApiException) obj;
                throw new zzmk(apiException.mStatus.zza, apiException.getMessage(), apiException);
            case 1:
                throw null;
            default:
                return Futures.immediateFuture("");
        }
    }
}
