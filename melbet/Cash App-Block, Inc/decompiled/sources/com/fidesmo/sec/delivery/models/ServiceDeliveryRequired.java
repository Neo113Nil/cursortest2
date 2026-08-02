package com.fidesmo.sec.delivery.models;

import bo.app.re$$ExternalSyntheticOutline0;
import com.fidesmo.sec.core.models.ClientInfo;
import com.fidesmo.sec.utils.Hex;
import com.google.gson.annotations.SerializedName;
import io.reactivex.rxjava3.core.Single;
import java.security.PublicKey;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 +2\u00020\u0001:\u0001+B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\bR\u0015\u0010#\u001a\u0004\u0018\u00010\u001a¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u0013\u0010'\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\bR\u0015\u0010)\u001a\u0004\u0018\u00010\u001a¢\u0006\n\n\u0002\u0010&\u001a\u0004\b*\u0010%¨\u0006,"}, d2 = {"Lcom/fidesmo/sec/delivery/models/ServiceDeliveryRequired;", "", "serviceDeliveryRequiredBuilder", "Lcom/fidesmo/sec/delivery/models/ServiceDeliveryRequiredBuilder;", "(Lcom/fidesmo/sec/delivery/models/ServiceDeliveryRequiredBuilder;)V", "appId", "", "getAppId", "()Ljava/lang/String;", "authHeader", "Lio/reactivex/rxjava3/core/Single;", "getAuthHeader", "()Lio/reactivex/rxjava3/core/Single;", "cin", "", "getCin", "()[B", "clientInfo", "Lcom/fidesmo/sec/core/models/ClientInfo;", "getClientInfo", "()Lcom/fidesmo/sec/core/models/ClientInfo;", "fields", "", "getFields", "()Ljava/util/Map;", "ignoreFirstError", "", "getIgnoreFirstError", "()Z", "publicKey", "Ljava/security/PublicKey;", "getPublicKey", "()Ljava/security/PublicKey;", "serviceId", "getServiceId", "useExternalEncryption", "getUseExternalEncryption", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "userLanguage", "getUserLanguage", "waitForErrors", "getWaitForErrors", "Companion", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ServiceDeliveryRequired {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String appId;
    private final Single authHeader;

    @SerializedName("cin")
    private final byte[] cin;
    private final ClientInfo clientInfo;
    private final Map<String, String> fields;
    private final boolean ignoreFirstError;
    private final transient PublicKey publicKey;
    private final String serviceId;
    private final Boolean useExternalEncryption;
    private final String userLanguage;
    private final Boolean waitForErrors;

    public ServiceDeliveryRequired(ServiceDeliveryRequiredBuilder serviceDeliveryRequiredBuilder) {
        serviceDeliveryRequiredBuilder.getClass();
        this.appId = serviceDeliveryRequiredBuilder.getAppId();
        this.serviceId = serviceDeliveryRequiredBuilder.getServiceId();
        this.cin = serviceDeliveryRequiredBuilder.getCin();
        this.fields = serviceDeliveryRequiredBuilder.getFields$sec_client_core_release() != null ? Collections.unmodifiableMap(serviceDeliveryRequiredBuilder.getFields$sec_client_core_release()) : null;
        this.userLanguage = serviceDeliveryRequiredBuilder.getUserLanguage();
        this.publicKey = serviceDeliveryRequiredBuilder.getPublicKey();
        this.ignoreFirstError = serviceDeliveryRequiredBuilder.getIgnoreFirstError();
        this.waitForErrors = serviceDeliveryRequiredBuilder.getWaitForErrors();
        this.clientInfo = serviceDeliveryRequiredBuilder.getClientInfo();
        this.authHeader = serviceDeliveryRequiredBuilder.getAuthHeader();
        Boolean useExternalEncryption = serviceDeliveryRequiredBuilder.getUseExternalEncryption();
        this.useExternalEncryption = useExternalEncryption == null ? Boolean.FALSE : useExternalEncryption;
    }

    public static final ServiceDeliveryRequired of(String str, String str2, String str3) {
        return INSTANCE.of(str, str2, str3);
    }

    public final String getAppId() {
        return this.appId;
    }

    public final Single getAuthHeader() {
        return this.authHeader;
    }

    public final byte[] getCin() {
        return this.cin;
    }

    public final ClientInfo getClientInfo() {
        return this.clientInfo;
    }

    public final Map<String, String> getFields() {
        return this.fields;
    }

    public final boolean getIgnoreFirstError() {
        return this.ignoreFirstError;
    }

    public final PublicKey getPublicKey() {
        return this.publicKey;
    }

    public final String getServiceId() {
        return this.serviceId;
    }

    public final Boolean getUseExternalEncryption() {
        return this.useExternalEncryption;
    }

    public final String getUserLanguage() {
        return this.userLanguage;
    }

    public final Boolean getWaitForErrors() {
        return this.waitForErrors;
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006J \u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007¨\u0006\u000b"}, d2 = {"Lcom/fidesmo/sec/delivery/models/ServiceDeliveryRequired$Companion;", "", "()V", "builder", "Lcom/fidesmo/sec/delivery/models/ServiceDeliveryRequiredBuilder;", "appId", "", "serviceId", "cin", "of", "Lcom/fidesmo/sec/delivery/models/ServiceDeliveryRequired;", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ServiceDeliveryRequiredBuilder builder(String appId, String serviceId, String cin) {
            appId.getClass();
            serviceId.getClass();
            cin.getClass();
            byte[] decodeHex = Hex.decodeHex(cin);
            decodeHex.getClass();
            return new ServiceDeliveryRequiredBuilder(appId, serviceId, decodeHex);
        }

        public final ServiceDeliveryRequired of(String appId, String serviceId, String cin) {
            re$$ExternalSyntheticOutline0.m1432m(appId, serviceId, cin);
            return builder(appId, serviceId, cin).build();
        }

        private Companion() {
        }
    }
}
