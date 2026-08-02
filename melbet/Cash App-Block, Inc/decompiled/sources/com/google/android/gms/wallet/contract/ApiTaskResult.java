package com.google.android.gms.wallet.contract;

import androidx.work.impl.WorkLauncherImpl;
import com.google.android.gms.common.api.Status;

/* loaded from: classes4.dex */
public final class ApiTaskResult {
    public final Object zza;
    public final Status zzb;

    public ApiTaskResult(Object obj, Status status) {
        this.zza = obj;
        this.zzb = status;
    }

    public final String toString() {
        WorkLauncherImpl workLauncherImpl = new WorkLauncherImpl(this);
        workLauncherImpl.add(this.zzb, "status");
        workLauncherImpl.add(this.zza, "result");
        return workLauncherImpl.toString();
    }
}
