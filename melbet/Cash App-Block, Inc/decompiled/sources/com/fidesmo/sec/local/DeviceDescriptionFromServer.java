package com.fidesmo.sec.local;

import com.fidesmo.sec.core.models.ParametrisedTranslation;
import com.fidesmo.sec.local.models.Capabilities;
import com.fidesmo.sec.local.models.DeviceBatch;
import com.fidesmo.sec.local.models.SupportInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\rHÆ\u0003JY\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006)"}, d2 = {"Lcom/fidesmo/sec/local/DeviceDescriptionFromServer;", "", "name", "Lcom/fidesmo/sec/core/models/ParametrisedTranslation;", "description", "batch", "Lcom/fidesmo/sec/local/models/DeviceBatch;", "imageUrl", "", "siteUrl", "capabilities", "Lcom/fidesmo/sec/local/models/Capabilities;", "support", "Lcom/fidesmo/sec/local/models/SupportInfo;", "(Lcom/fidesmo/sec/core/models/ParametrisedTranslation;Lcom/fidesmo/sec/core/models/ParametrisedTranslation;Lcom/fidesmo/sec/local/models/DeviceBatch;Ljava/lang/String;Ljava/lang/String;Lcom/fidesmo/sec/local/models/Capabilities;Lcom/fidesmo/sec/local/models/SupportInfo;)V", "getBatch", "()Lcom/fidesmo/sec/local/models/DeviceBatch;", "getCapabilities", "()Lcom/fidesmo/sec/local/models/Capabilities;", "getDescription", "()Lcom/fidesmo/sec/core/models/ParametrisedTranslation;", "getImageUrl", "()Ljava/lang/String;", "getName", "getSiteUrl", "getSupport", "()Lcom/fidesmo/sec/local/models/SupportInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DeviceDescriptionFromServer {
    private final DeviceBatch batch;
    private final Capabilities capabilities;
    private final ParametrisedTranslation description;
    private final String imageUrl;
    private final ParametrisedTranslation name;
    private final String siteUrl;
    private final SupportInfo support;

    public /* synthetic */ DeviceDescriptionFromServer(ParametrisedTranslation parametrisedTranslation, ParametrisedTranslation parametrisedTranslation2, DeviceBatch deviceBatch, String str, String str2, Capabilities capabilities, SupportInfo supportInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parametrisedTranslation, (i & 2) != 0 ? null : parametrisedTranslation2, deviceBatch, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : capabilities, (i & 64) != 0 ? null : supportInfo);
    }

    public static /* synthetic */ DeviceDescriptionFromServer copy$default(DeviceDescriptionFromServer deviceDescriptionFromServer, ParametrisedTranslation parametrisedTranslation, ParametrisedTranslation parametrisedTranslation2, DeviceBatch deviceBatch, String str, String str2, Capabilities capabilities, SupportInfo supportInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            parametrisedTranslation = deviceDescriptionFromServer.name;
        }
        if ((i & 2) != 0) {
            parametrisedTranslation2 = deviceDescriptionFromServer.description;
        }
        if ((i & 4) != 0) {
            deviceBatch = deviceDescriptionFromServer.batch;
        }
        if ((i & 8) != 0) {
            str = deviceDescriptionFromServer.imageUrl;
        }
        if ((i & 16) != 0) {
            str2 = deviceDescriptionFromServer.siteUrl;
        }
        if ((i & 32) != 0) {
            capabilities = deviceDescriptionFromServer.capabilities;
        }
        if ((i & 64) != 0) {
            supportInfo = deviceDescriptionFromServer.support;
        }
        Capabilities capabilities2 = capabilities;
        SupportInfo supportInfo2 = supportInfo;
        String str3 = str2;
        DeviceBatch deviceBatch2 = deviceBatch;
        return deviceDescriptionFromServer.copy(parametrisedTranslation, parametrisedTranslation2, deviceBatch2, str, str3, capabilities2, supportInfo2);
    }

    /* renamed from: component1, reason: from getter */
    public final ParametrisedTranslation getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final ParametrisedTranslation getDescription() {
        return this.description;
    }

    /* renamed from: component3, reason: from getter */
    public final DeviceBatch getBatch() {
        return this.batch;
    }

    /* renamed from: component4, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSiteUrl() {
        return this.siteUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final Capabilities getCapabilities() {
        return this.capabilities;
    }

    /* renamed from: component7, reason: from getter */
    public final SupportInfo getSupport() {
        return this.support;
    }

    public final DeviceDescriptionFromServer copy(ParametrisedTranslation name, ParametrisedTranslation description, DeviceBatch batch, String imageUrl, String siteUrl, Capabilities capabilities, SupportInfo support) {
        name.getClass();
        batch.getClass();
        return new DeviceDescriptionFromServer(name, description, batch, imageUrl, siteUrl, capabilities, support);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceDescriptionFromServer)) {
            return false;
        }
        DeviceDescriptionFromServer deviceDescriptionFromServer = (DeviceDescriptionFromServer) other;
        return Intrinsics.areEqual(this.name, deviceDescriptionFromServer.name) && Intrinsics.areEqual(this.description, deviceDescriptionFromServer.description) && Intrinsics.areEqual(this.batch, deviceDescriptionFromServer.batch) && Intrinsics.areEqual(this.imageUrl, deviceDescriptionFromServer.imageUrl) && Intrinsics.areEqual(this.siteUrl, deviceDescriptionFromServer.siteUrl) && Intrinsics.areEqual(this.capabilities, deviceDescriptionFromServer.capabilities) && Intrinsics.areEqual(this.support, deviceDescriptionFromServer.support);
    }

    public final DeviceBatch getBatch() {
        return this.batch;
    }

    public final Capabilities getCapabilities() {
        return this.capabilities;
    }

    public final ParametrisedTranslation getDescription() {
        return this.description;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final ParametrisedTranslation getName() {
        return this.name;
    }

    public final String getSiteUrl() {
        return this.siteUrl;
    }

    public final SupportInfo getSupport() {
        return this.support;
    }

    public int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        ParametrisedTranslation parametrisedTranslation = this.description;
        int hashCode2 = (this.batch.hashCode() + ((hashCode + (parametrisedTranslation == null ? 0 : parametrisedTranslation.hashCode())) * 31)) * 31;
        String str = this.imageUrl;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.siteUrl;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Capabilities capabilities = this.capabilities;
        int hashCode5 = (hashCode4 + (capabilities == null ? 0 : capabilities.hashCode())) * 31;
        SupportInfo supportInfo = this.support;
        return hashCode5 + (supportInfo != null ? supportInfo.hashCode() : 0);
    }

    public String toString() {
        return "DeviceDescriptionFromServer(name=" + this.name + ", description=" + this.description + ", batch=" + this.batch + ", imageUrl=" + this.imageUrl + ", siteUrl=" + this.siteUrl + ", capabilities=" + this.capabilities + ", support=" + this.support + ')';
    }

    public DeviceDescriptionFromServer(ParametrisedTranslation parametrisedTranslation, ParametrisedTranslation parametrisedTranslation2, DeviceBatch deviceBatch, String str, String str2, Capabilities capabilities, SupportInfo supportInfo) {
        parametrisedTranslation.getClass();
        deviceBatch.getClass();
        this.name = parametrisedTranslation;
        this.description = parametrisedTranslation2;
        this.batch = deviceBatch;
        this.imageUrl = str;
        this.siteUrl = str2;
        this.capabilities = capabilities;
        this.support = supportInfo;
    }
}
