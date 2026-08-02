package com.fidesmo.sec.delivery;

import com.fidesmo.sec.core.FidesmoApiClient;
import com.fidesmo.sec.delivery.models.ServiceDeliveryRequired;
import com.fidesmo.sec.utils.HexTypeAdapter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import io.reactivex.rxjava3.core.Observable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public class ExternalDeliverySecClient implements DeliverySecClient {
    private final FidesmoApiClient apiClient;
    private final Gson gson = new GsonBuilder().registerTypeAdapter(byte[].class, new HexTypeAdapter()).create();
    private final Logger logger = LoggerFactory.getLogger("ExternalDeliverySecClient");

    public ExternalDeliverySecClient(FidesmoApiClient fidesmoApiClient) {
        this.apiClient = fidesmoApiClient;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ SecResponse lambda$connector$0(JsonObject jsonObject) {
        try {
            this.logger.info("Received response: " + jsonObject.toString());
            return (SecResponse) this.gson.fromJson((JsonElement) jsonObject, SecResponse.class);
        } catch (JsonParseException e) {
            this.logger.info("Error occured while parsing json response to connector");
            Handlers$$ExternalSyntheticBUOutline0.m("Error occured while parsing json response to connector", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ServiceDeliveryResponse lambda$serviceDeliver$1(JsonObject jsonObject) {
        try {
            this.logger.info("Received response: " + jsonObject.toString());
            return (ServiceDeliveryResponse) this.gson.fromJson((JsonElement) jsonObject, ServiceDeliveryResponse.class);
        } catch (JsonParseException e) {
            this.logger.info("Error occured while parsing json response to serviceDeliver");
            Handlers$$ExternalSyntheticBUOutline0.m("Error occured while parsing json response to serviceDeliver", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ SecResponse lambda$serviceError$3(JsonObject jsonObject) {
        this.logger.info("Received response: " + jsonObject.toString());
        try {
            return (SecResponse) this.gson.fromJson((JsonElement) jsonObject, SecResponse.class);
        } catch (JsonParseException e) {
            this.logger.info("Error occured while parsing json response to serviceError");
            Handlers$$ExternalSyntheticBUOutline0.m("Error occured while parsing json response to serviceError", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ FetchOperationResponse lambda$serviceFetch$2(JsonObject jsonObject) {
        try {
            this.logger.info("Received response: " + jsonObject.toString());
            return (FetchOperationResponse) this.gson.fromJson((JsonElement) jsonObject, FetchOperationResponse.class);
        } catch (JsonParseException e) {
            this.logger.info("Error occured while parsing json response to serviceFetch");
            Handlers$$ExternalSyntheticBUOutline0.m("Error occured while parsing json response to serviceFetch", e);
            return null;
        }
    }

    @Override // com.fidesmo.sec.delivery.DeliverySecClient
    public Observable<SecResponse> connector(SecRequest secRequest, String str) {
        JsonObject asJsonObject = this.gson.toJsonTree(secRequest, SecRequest.class).getAsJsonObject();
        Logger logger = this.logger;
        StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("Sent request ", str, ": ");
        m3m.append(asJsonObject.toString());
        logger.info(m3m.toString());
        return this.apiClient.send(str, FidesmoApiClient.HttpMethod.POST, "/v3/connector/json", asJsonObject).map(new ExternalDeliverySecClient$$ExternalSyntheticLambda0(this, 3));
    }

    @Override // com.fidesmo.sec.delivery.DeliverySecClient
    public Observable<ServiceDeliveryResponse> serviceDeliver(ServiceDeliveryRequired serviceDeliveryRequired, String str) {
        JsonObject asJsonObject = this.gson.toJsonTree(serviceDeliveryRequired, ServiceDeliveryRequired.class).getAsJsonObject();
        Logger logger = this.logger;
        StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("Sent request ", str, ": ");
        m3m.append(asJsonObject.toString());
        logger.info(m3m.toString());
        return this.apiClient.send(str, FidesmoApiClient.HttpMethod.POST, "/v3/service/deliver", asJsonObject).map(new ExternalDeliverySecClient$$ExternalSyntheticLambda0(this, 0));
    }

    @Override // com.fidesmo.sec.delivery.DeliverySecClient
    public Observable<SecResponse> serviceError(ServiceErrorRequest serviceErrorRequest, String str) {
        JsonObject asJsonObject = this.gson.toJsonTree(serviceErrorRequest, ServiceErrorRequest.class).getAsJsonObject();
        Logger logger = this.logger;
        StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("Sent request ", str, ": ");
        m3m.append(asJsonObject.toString());
        logger.info(m3m.toString());
        return this.apiClient.send(str, FidesmoApiClient.HttpMethod.POST, "/v3/service/error", asJsonObject).map(new ExternalDeliverySecClient$$ExternalSyntheticLambda0(this, 1));
    }

    @Override // com.fidesmo.sec.delivery.DeliverySecClient
    public Observable<FetchOperationResponse> serviceFetch(FetchOperationRequest fetchOperationRequest, String str) {
        JsonObject asJsonObject = this.gson.toJsonTree(fetchOperationRequest, FetchOperationRequest.class).getAsJsonObject();
        Logger logger = this.logger;
        StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("Sent request ", str, ": ");
        m3m.append(asJsonObject.toString());
        logger.info(m3m.toString());
        return this.apiClient.send(str, FidesmoApiClient.HttpMethod.POST, "/v3/service/fetch", asJsonObject).map(new ExternalDeliverySecClient$$ExternalSyntheticLambda0(this, 2));
    }

    @Override // com.fidesmo.sec.delivery.DeliverySecClient
    public Observable<ServiceDeliveryResponse> serviceDeliver(ServiceDeliveryRequired serviceDeliveryRequired, String str, String str2) {
        return serviceDeliver(serviceDeliveryRequired, str);
    }
}
