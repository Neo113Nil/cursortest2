package com.google.android.gms.internal.mlkit_common;

import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzsf implements Callable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SharedPrefManager zza;

    public /* synthetic */ zzsf(SharedPrefManager sharedPrefManager, int i) {
        this.$r8$classId = i;
        this.zza = sharedPrefManager;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$r8$classId) {
        }
        return this.zza.getMlSdkInstanceId();
    }
}
