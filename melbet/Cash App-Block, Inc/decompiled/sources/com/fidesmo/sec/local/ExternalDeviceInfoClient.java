package com.fidesmo.sec.local;

import com.fidesmo.sec.core.FidesmoApiClient;
import com.fidesmo.sec.core.models.Translations;
import com.fidesmo.sec.local.models.ImplicitDeviceCinBatch;
import com.fidesmo.sec.utils.TranslationsAdapter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import io.reactivex.rxjava3.core.Observable;

/* loaded from: classes4.dex */
public class ExternalDeviceInfoClient implements DeviceInfoClient {
    private final FidesmoApiClient apiClient;
    private final Gson gson = new GsonBuilder().registerTypeAdapter(Translations.class, new TranslationsAdapter()).create();

    public ExternalDeviceInfoClient(FidesmoApiClient fidesmoApiClient) {
        this.apiClient = fidesmoApiClient;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DeviceDescriptionResponse lambda$getDeviceDescription$0(JsonObject jsonObject) {
        return (DeviceDescriptionResponse) this.gson.fromJson((JsonElement) jsonObject, DeviceDescriptionResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ImplicitDeviceCinBatch lambda$getImplicitBatch$2(JsonObject jsonObject) {
        return (ImplicitDeviceCinBatch) this.gson.fromJson((JsonElement) jsonObject, ImplicitDeviceCinBatch.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ InstalledAppsResponse lambda$getInstalledApps$1(JsonObject jsonObject) {
        return (InstalledAppsResponse) this.gson.fromJson((JsonElement) jsonObject, InstalledAppsResponse.class);
    }

    @Override // com.fidesmo.sec.local.DeviceInfoClient
    public Observable<DeviceDescriptionResponse> getDeviceDescription(String str, Integer num) {
        return this.apiClient.send("", FidesmoApiClient.HttpMethod.GET, "/v3/devices/" + str + "?batchId=" + num, new JsonObject()).map(new ExternalDeviceInfoClient$$ExternalSyntheticLambda0(this, 1));
    }

    @Override // com.fidesmo.sec.local.DeviceInfoClient
    public Observable<ImplicitDeviceCinBatch> getImplicitBatch(String str, String str2) {
        FidesmoApiClient fidesmoApiClient = this.apiClient;
        FidesmoApiClient.HttpMethod httpMethod = FidesmoApiClient.HttpMethod.GET;
        StringBuilder sb = new StringBuilder("/v3/devices/identify?");
        sb.append(str != null ? "cplc=".concat(str) : "");
        sb.append(str2 != null ? "cert=".concat(str2) : "");
        return fidesmoApiClient.send("", httpMethod, sb.toString(), new JsonObject()).map(new ExternalDeviceInfoClient$$ExternalSyntheticLambda0(this, 0));
    }

    @Override // com.fidesmo.sec.local.DeviceInfoClient
    public Observable<InstalledAppsResponse> getInstalledApps(String str, String str2) {
        return this.apiClient.send("", FidesmoApiClient.HttpMethod.GET, JsonLogicResult$Success$$ExternalSyntheticOutline0.m("/v3/devices/", str, "/apps"), new JsonObject()).map(new ExternalDeviceInfoClient$$ExternalSyntheticLambda0(this, 2));
    }
}
