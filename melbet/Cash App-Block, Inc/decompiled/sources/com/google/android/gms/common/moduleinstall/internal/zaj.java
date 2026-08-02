package com.google.android.gms.common.moduleinstall.internal;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;

/* loaded from: classes4.dex */
public final class zaj extends zab implements IInterface {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TaskCompletionSource zaa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zaj(zay zayVar, TaskCompletionSource taskCompletionSource, int i) {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks", 0);
        this.$r8$classId = i;
        this.zaa = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.base.zab
    public final boolean zaa(int i, Parcel parcel, Parcel parcel2) {
        TaskCompletionSource taskCompletionSource = this.zaa;
        int i2 = this.$r8$classId;
        if (i == 1) {
            Status status = (Status) zac.zaa(parcel, Status.CREATOR);
            ModuleAvailabilityResponse moduleAvailabilityResponse = (ModuleAvailabilityResponse) zac.zaa(parcel, ModuleAvailabilityResponse.CREATOR);
            zac.zad(parcel);
            switch (i2) {
                case 0:
                    TaskUtil.trySetResultOrApiException(status, moduleAvailabilityResponse, taskCompletionSource);
                    return true;
                default:
                    throw new UnsupportedOperationException();
            }
        }
        if (i == 2) {
            Status status2 = (Status) zac.zaa(parcel, Status.CREATOR);
            ModuleInstallResponse moduleInstallResponse = (ModuleInstallResponse) zac.zaa(parcel, ModuleInstallResponse.CREATOR);
            zac.zad(parcel);
            switch (i2) {
                case 1:
                    TaskUtil.trySetResultOrApiException(status2, moduleInstallResponse, taskCompletionSource);
                    return true;
                default:
                    throw new UnsupportedOperationException();
            }
        }
        if (i == 3) {
            zac.zad(parcel);
            OptionalProvider$$ExternalSyntheticLambda0.m();
            return false;
        }
        if (i != 4) {
            return false;
        }
        zac.zad(parcel);
        OptionalProvider$$ExternalSyntheticLambda0.m();
        return false;
    }
}
