package com.fidesmo.sec.local.models;

import com.fidesmo.sec.core.models.ParametrisedTranslation;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010)\u001a\u00020\u0010HÆ\u0003Jm\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0013\u0010+\u001a\u00020\u00102\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00060"}, d2 = {"Lcom/fidesmo/sec/local/models/DeviceDescription;", "", "cin", "", "name", "Lcom/fidesmo/sec/core/models/ParametrisedTranslation;", "description", "batch", "Lcom/fidesmo/sec/local/models/DeviceBatch;", "imageUrl", "siteUrl", "capabilities", "Lcom/fidesmo/sec/local/models/Capabilities;", "support", "Lcom/fidesmo/sec/local/models/SupportInfo;", "ownedByAccount", "", "(Ljava/lang/String;Lcom/fidesmo/sec/core/models/ParametrisedTranslation;Lcom/fidesmo/sec/core/models/ParametrisedTranslation;Lcom/fidesmo/sec/local/models/DeviceBatch;Ljava/lang/String;Ljava/lang/String;Lcom/fidesmo/sec/local/models/Capabilities;Lcom/fidesmo/sec/local/models/SupportInfo;Z)V", "getBatch", "()Lcom/fidesmo/sec/local/models/DeviceBatch;", "getCapabilities", "()Lcom/fidesmo/sec/local/models/Capabilities;", "getCin", "()Ljava/lang/String;", "getDescription", "()Lcom/fidesmo/sec/core/models/ParametrisedTranslation;", "getImageUrl", "getName", "getOwnedByAccount", "()Z", "getSiteUrl", "getSupport", "()Lcom/fidesmo/sec/local/models/SupportInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DeviceDescription {
    private final DeviceBatch batch;
    private final Capabilities capabilities;
    private final String cin;
    private final ParametrisedTranslation description;
    private final String imageUrl;
    private final ParametrisedTranslation name;
    private final boolean ownedByAccount;
    private final String siteUrl;
    private final SupportInfo support;

    public /* synthetic */ DeviceDescription(String str, ParametrisedTranslation parametrisedTranslation, ParametrisedTranslation parametrisedTranslation2, DeviceBatch deviceBatch, String str2, String str3, Capabilities capabilities, SupportInfo supportInfo, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, parametrisedTranslation, (i & 4) != 0 ? null : parametrisedTranslation2, deviceBatch, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : capabilities, (i & 128) != 0 ? null : supportInfo, (i & 256) != 0 ? false : z);
    }

    public static /* synthetic */ DeviceDescription copy$default(DeviceDescription deviceDescription, String str, ParametrisedTranslation parametrisedTranslation, ParametrisedTranslation parametrisedTranslation2, DeviceBatch deviceBatch, String str2, String str3, Capabilities capabilities, SupportInfo supportInfo, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceDescription.cin;
        }
        if ((i & 2) != 0) {
            parametrisedTranslation = deviceDescription.name;
        }
        if ((i & 4) != 0) {
            parametrisedTranslation2 = deviceDescription.description;
        }
        if ((i & 8) != 0) {
            deviceBatch = deviceDescription.batch;
        }
        if ((i & 16) != 0) {
            str2 = deviceDescription.imageUrl;
        }
        if ((i & 32) != 0) {
            str3 = deviceDescription.siteUrl;
        }
        if ((i & 64) != 0) {
            capabilities = deviceDescription.capabilities;
        }
        if ((i & 128) != 0) {
            supportInfo = deviceDescription.support;
        }
        if ((i & 256) != 0) {
            z = deviceDescription.ownedByAccount;
        }
        SupportInfo supportInfo2 = supportInfo;
        boolean z2 = z;
        String str4 = str3;
        Capabilities capabilities2 = capabilities;
        String str5 = str2;
        ParametrisedTranslation parametrisedTranslation3 = parametrisedTranslation2;
        return deviceDescription.copy(str, parametrisedTranslation, parametrisedTranslation3, deviceBatch, str5, str4, capabilities2, supportInfo2, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCin() {
        return this.cin;
    }

    /* renamed from: component2, reason: from getter */
    public final ParametrisedTranslation getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final ParametrisedTranslation getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final DeviceBatch getBatch() {
        return this.batch;
    }

    /* renamed from: component5, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSiteUrl() {
        return this.siteUrl;
    }

    /* renamed from: component7, reason: from getter */
    public final Capabilities getCapabilities() {
        return this.capabilities;
    }

    /* renamed from: component8, reason: from getter */
    public final SupportInfo getSupport() {
        return this.support;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getOwnedByAccount() {
        return this.ownedByAccount;
    }

    public final DeviceDescription copy(String cin, ParametrisedTranslation name, ParametrisedTranslation description, DeviceBatch batch, String imageUrl, String siteUrl, Capabilities capabilities, SupportInfo support, boolean ownedByAccount) {
        cin.getClass();
        name.getClass();
        batch.getClass();
        return new DeviceDescription(cin, name, description, batch, imageUrl, siteUrl, capabilities, support, ownedByAccount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceDescription)) {
            return false;
        }
        DeviceDescription deviceDescription = (DeviceDescription) other;
        return Intrinsics.areEqual(this.cin, deviceDescription.cin) && Intrinsics.areEqual(this.name, deviceDescription.name) && Intrinsics.areEqual(this.description, deviceDescription.description) && Intrinsics.areEqual(this.batch, deviceDescription.batch) && Intrinsics.areEqual(this.imageUrl, deviceDescription.imageUrl) && Intrinsics.areEqual(this.siteUrl, deviceDescription.siteUrl) && Intrinsics.areEqual(this.capabilities, deviceDescription.capabilities) && Intrinsics.areEqual(this.support, deviceDescription.support) && this.ownedByAccount == deviceDescription.ownedByAccount;
    }

    public final DeviceBatch getBatch() {
        return this.batch;
    }

    public final Capabilities getCapabilities() {
        return this.capabilities;
    }

    public final String getCin() {
        return this.cin;
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

    public final boolean getOwnedByAccount() {
        return this.ownedByAccount;
    }

    public final String getSiteUrl() {
        return this.siteUrl;
    }

    public final SupportInfo getSupport() {
        return this.support;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = (this.name.hashCode() + (this.cin.hashCode() * 31)) * 31;
        ParametrisedTranslation parametrisedTranslation = this.description;
        int hashCode2 = (this.batch.hashCode() + ((hashCode + (parametrisedTranslation == null ? 0 : parametrisedTranslation.hashCode())) * 31)) * 31;
        String str = this.imageUrl;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.siteUrl;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Capabilities capabilities = this.capabilities;
        int hashCode5 = (hashCode4 + (capabilities == null ? 0 : capabilities.hashCode())) * 31;
        SupportInfo supportInfo = this.support;
        int hashCode6 = (hashCode5 + (supportInfo != null ? supportInfo.hashCode() : 0)) * 31;
        boolean z = this.ownedByAccount;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode6 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DeviceDescription(cin=");
        sb.append(this.cin);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", batch=");
        sb.append(this.batch);
        sb.append(", imageUrl=");
        sb.append(this.imageUrl);
        sb.append(", siteUrl=");
        sb.append(this.siteUrl);
        sb.append(", capabilities=");
        sb.append(this.capabilities);
        sb.append(", support=");
        sb.append(this.support);
        sb.append(", ownedByAccount=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.ownedByAccount, ')');
    }

    public DeviceDescription(String str, ParametrisedTranslation parametrisedTranslation, ParametrisedTranslation parametrisedTranslation2, DeviceBatch deviceBatch, String str2, String str3, Capabilities capabilities, SupportInfo supportInfo, boolean z) {
        str.getClass();
        parametrisedTranslation.getClass();
        deviceBatch.getClass();
        this.cin = str;
        this.name = parametrisedTranslation;
        this.description = parametrisedTranslation2;
        this.batch = deviceBatch;
        this.imageUrl = str2;
        this.siteUrl = str3;
        this.capabilities = capabilities;
        this.support = supportInfo;
        this.ownedByAccount = z;
    }
}
