package com.fidesmo.sec.local;

import com.fidesmo.sec.local.models.ImplicitDeviceCinBatch;
import com.google.gson.JsonObject;
import io.reactivex.rxjava3.functions.Function;

/* loaded from: classes4.dex */
public final /* synthetic */ class ExternalDeviceInfoClient$$ExternalSyntheticLambda0 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ExternalDeviceInfoClient f$0;

    public /* synthetic */ ExternalDeviceInfoClient$$ExternalSyntheticLambda0(ExternalDeviceInfoClient externalDeviceInfoClient, int i) {
        this.$r8$classId = i;
        this.f$0 = externalDeviceInfoClient;
    }

    @Override // io.reactivex.rxjava3.functions.Function, com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    /* renamed from: apply */
    public final Object mo39apply(Object obj) {
        ImplicitDeviceCinBatch lambda$getImplicitBatch$2;
        DeviceDescriptionResponse lambda$getDeviceDescription$0;
        InstalledAppsResponse lambda$getInstalledApps$1;
        int i = this.$r8$classId;
        ExternalDeviceInfoClient externalDeviceInfoClient = this.f$0;
        JsonObject jsonObject = (JsonObject) obj;
        switch (i) {
            case 0:
                lambda$getImplicitBatch$2 = externalDeviceInfoClient.lambda$getImplicitBatch$2(jsonObject);
                return lambda$getImplicitBatch$2;
            case 1:
                lambda$getDeviceDescription$0 = externalDeviceInfoClient.lambda$getDeviceDescription$0(jsonObject);
                return lambda$getDeviceDescription$0;
            default:
                lambda$getInstalledApps$1 = externalDeviceInfoClient.lambda$getInstalledApps$1(jsonObject);
                return lambda$getInstalledApps$1;
        }
    }
}
