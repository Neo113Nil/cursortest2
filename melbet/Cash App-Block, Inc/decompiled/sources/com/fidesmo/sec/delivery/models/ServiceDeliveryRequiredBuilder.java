package com.fidesmo.sec.delivery.models;

import com.fidesmo.sec.core.models.ClientInfo;
import io.reactivex.rxjava3.core.Single;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u00108\u001a\u00020\u00002\u0006\u00109\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u0003J\u0006\u0010;\u001a\u00020<J\u0014\u0010=\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bJ\u000e\u0010>\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0013J\u001c\u0010?\u001a\u00020\u00002\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010@J\u000e\u0010A\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001fJ\u0010\u0010B\u001a\u00020\u00002\b\u0010$\u001a\u0004\u0018\u00010%J\u000e\u0010C\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u001fJ\u000e\u0010D\u001a\u00020\u00002\u0006\u0010E\u001a\u00020FJ\u000e\u0010G\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u001fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R(\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0019X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010$\u001a\u0004\u0018\u00010%X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0014\u0010\u0004\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\tR\u001e\u0010+\u001a\u0004\u0018\u00010\u001fX\u0080\u000e¢\u0006\u0010\n\u0002\u00100\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001c\u00101\u001a\u0004\u0018\u00010\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\t\"\u0004\b3\u00104R\u001e\u00105\u001a\u0004\u0018\u00010\u001fX\u0080\u000e¢\u0006\u0010\n\u0002\u00100\u001a\u0004\b6\u0010-\"\u0004\b7\u0010/¨\u0006H"}, d2 = {"Lcom/fidesmo/sec/delivery/models/ServiceDeliveryRequiredBuilder;", "", "appId", "", "serviceId", "cin", "", "(Ljava/lang/String;Ljava/lang/String;[B)V", "getAppId$sec_client_core_release", "()Ljava/lang/String;", "authHeader", "Lio/reactivex/rxjava3/core/Single;", "getAuthHeader$sec_client_core_release", "()Lio/reactivex/rxjava3/core/Single;", "setAuthHeader$sec_client_core_release", "(Lio/reactivex/rxjava3/core/Single;)V", "getCin$sec_client_core_release", "()[B", "clientInfo", "Lcom/fidesmo/sec/core/models/ClientInfo;", "getClientInfo$sec_client_core_release", "()Lcom/fidesmo/sec/core/models/ClientInfo;", "setClientInfo$sec_client_core_release", "(Lcom/fidesmo/sec/core/models/ClientInfo;)V", "fields", "", "getFields$sec_client_core_release", "()Ljava/util/Map;", "setFields$sec_client_core_release", "(Ljava/util/Map;)V", "ignoreFirstError", "", "getIgnoreFirstError$sec_client_core_release", "()Z", "setIgnoreFirstError$sec_client_core_release", "(Z)V", "publicKey", "Ljava/security/PublicKey;", "getPublicKey$sec_client_core_release", "()Ljava/security/PublicKey;", "setPublicKey$sec_client_core_release", "(Ljava/security/PublicKey;)V", "getServiceId$sec_client_core_release", "useExternalEncryption", "getUseExternalEncryption$sec_client_core_release", "()Ljava/lang/Boolean;", "setUseExternalEncryption$sec_client_core_release", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "userLanguage", "getUserLanguage$sec_client_core_release", "setUserLanguage$sec_client_core_release", "(Ljava/lang/String;)V", "waitForErrors", "getWaitForErrors$sec_client_core_release", "setWaitForErrors$sec_client_core_release", "addField", "id", "value", "build", "Lcom/fidesmo/sec/delivery/models/ServiceDeliveryRequired;", "setAuthHeader", "setClientInfo", "setFields", "", "setIgnoreFirstError", "setServicePublicKey", "setUseExternalEncryption", "setUserLocale", "locale", "Ljava/util/Locale;", "setWaitForErrors", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ServiceDeliveryRequiredBuilder {
    private final String appId;
    private Single authHeader;
    private final byte[] cin;
    private ClientInfo clientInfo;
    private Map<String, String> fields;
    private boolean ignoreFirstError;
    private PublicKey publicKey;
    private final String serviceId;
    private Boolean useExternalEncryption;
    private String userLanguage;
    private Boolean waitForErrors;

    public ServiceDeliveryRequiredBuilder(String str, String str2, byte[] bArr) {
        str.getClass();
        str2.getClass();
        bArr.getClass();
        this.appId = str;
        this.serviceId = str2;
        this.cin = bArr;
        this.ignoreFirstError = true;
        this.clientInfo = ClientInfo.INSTANCE.defaultClientInfo();
        this.useExternalEncryption = Boolean.FALSE;
    }

    public final ServiceDeliveryRequiredBuilder addField(String id, String value) {
        id.getClass();
        value.getClass();
        if (this.fields == null) {
            this.fields = new HashMap();
        }
        Map<String, String> map = this.fields;
        map.getClass();
        map.put(id, value);
        return this;
    }

    public final ServiceDeliveryRequired build() {
        return new ServiceDeliveryRequired(this);
    }

    /* renamed from: getAppId$sec_client_core_release, reason: from getter */
    public final String getAppId() {
        return this.appId;
    }

    /* renamed from: getAuthHeader$sec_client_core_release, reason: from getter */
    public final Single getAuthHeader() {
        return this.authHeader;
    }

    /* renamed from: getCin$sec_client_core_release, reason: from getter */
    public final byte[] getCin() {
        return this.cin;
    }

    /* renamed from: getClientInfo$sec_client_core_release, reason: from getter */
    public final ClientInfo getClientInfo() {
        return this.clientInfo;
    }

    public final Map<String, String> getFields$sec_client_core_release() {
        return this.fields;
    }

    /* renamed from: getIgnoreFirstError$sec_client_core_release, reason: from getter */
    public final boolean getIgnoreFirstError() {
        return this.ignoreFirstError;
    }

    /* renamed from: getPublicKey$sec_client_core_release, reason: from getter */
    public final PublicKey getPublicKey() {
        return this.publicKey;
    }

    /* renamed from: getServiceId$sec_client_core_release, reason: from getter */
    public final String getServiceId() {
        return this.serviceId;
    }

    /* renamed from: getUseExternalEncryption$sec_client_core_release, reason: from getter */
    public final Boolean getUseExternalEncryption() {
        return this.useExternalEncryption;
    }

    /* renamed from: getUserLanguage$sec_client_core_release, reason: from getter */
    public final String getUserLanguage() {
        return this.userLanguage;
    }

    /* renamed from: getWaitForErrors$sec_client_core_release, reason: from getter */
    public final Boolean getWaitForErrors() {
        return this.waitForErrors;
    }

    public final ServiceDeliveryRequiredBuilder setAuthHeader(Single authHeader) {
        authHeader.getClass();
        this.authHeader = authHeader;
        return this;
    }

    public final void setAuthHeader$sec_client_core_release(Single single) {
        this.authHeader = single;
    }

    public final ServiceDeliveryRequiredBuilder setClientInfo(ClientInfo clientInfo) {
        clientInfo.getClass();
        this.clientInfo = clientInfo;
        return this;
    }

    public final void setClientInfo$sec_client_core_release(ClientInfo clientInfo) {
        clientInfo.getClass();
        this.clientInfo = clientInfo;
    }

    public final ServiceDeliveryRequiredBuilder setFields(Map<String, String> fields) {
        this.fields = fields != null ? new LinkedHashMap(fields) : null;
        return this;
    }

    public final void setFields$sec_client_core_release(Map<String, String> map) {
        this.fields = map;
    }

    public final ServiceDeliveryRequiredBuilder setIgnoreFirstError(boolean ignoreFirstError) {
        this.ignoreFirstError = ignoreFirstError;
        return this;
    }

    public final void setIgnoreFirstError$sec_client_core_release(boolean z) {
        this.ignoreFirstError = z;
    }

    public final void setPublicKey$sec_client_core_release(PublicKey publicKey) {
        this.publicKey = publicKey;
    }

    public final ServiceDeliveryRequiredBuilder setServicePublicKey(PublicKey publicKey) {
        this.publicKey = publicKey;
        return this;
    }

    public final ServiceDeliveryRequiredBuilder setUseExternalEncryption(boolean useExternalEncryption) {
        this.useExternalEncryption = Boolean.valueOf(useExternalEncryption);
        return this;
    }

    public final void setUseExternalEncryption$sec_client_core_release(Boolean bool) {
        this.useExternalEncryption = bool;
    }

    public final void setUserLanguage$sec_client_core_release(String str) {
        this.userLanguage = str;
    }

    public final ServiceDeliveryRequiredBuilder setUserLocale(Locale locale) {
        locale.getClass();
        this.userLanguage = locale.toLanguageTag();
        return this;
    }

    public final ServiceDeliveryRequiredBuilder setWaitForErrors(boolean waitForErrors) {
        this.waitForErrors = Boolean.valueOf(waitForErrors);
        return this;
    }

    public final void setWaitForErrors$sec_client_core_release(Boolean bool) {
        this.waitForErrors = bool;
    }
}
