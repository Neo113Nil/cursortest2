package com.fidesmo.sec.core.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ>\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\n¨\u0006\u001e"}, d2 = {"Lcom/fidesmo/sec/core/models/ServiceRequirements;", "", "fixedUid", "", "javaCard", "mifare", "issuerAccountId", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getFixedUid", "()Ljava/lang/String;", "isDeviceRequiredForDelivery", "", "()Z", "getIssuerAccountId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getJavaCard", "getMifare", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/fidesmo/sec/core/models/ServiceRequirements;", "equals", "other", "hashCode", "", "toString", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ServiceRequirements {
    private final String fixedUid;
    private final Long issuerAccountId;
    private final String javaCard;
    private final String mifare;

    public /* synthetic */ ServiceRequirements(String str, String str2, String str3, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : l);
    }

    public static /* synthetic */ ServiceRequirements copy$default(ServiceRequirements serviceRequirements, String str, String str2, String str3, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = serviceRequirements.fixedUid;
        }
        if ((i & 2) != 0) {
            str2 = serviceRequirements.javaCard;
        }
        if ((i & 4) != 0) {
            str3 = serviceRequirements.mifare;
        }
        if ((i & 8) != 0) {
            l = serviceRequirements.issuerAccountId;
        }
        return serviceRequirements.copy(str, str2, str3, l);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFixedUid() {
        return this.fixedUid;
    }

    /* renamed from: component2, reason: from getter */
    public final String getJavaCard() {
        return this.javaCard;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMifare() {
        return this.mifare;
    }

    /* renamed from: component4, reason: from getter */
    public final Long getIssuerAccountId() {
        return this.issuerAccountId;
    }

    public final ServiceRequirements copy(String fixedUid, String javaCard, String mifare, Long issuerAccountId) {
        return new ServiceRequirements(fixedUid, javaCard, mifare, issuerAccountId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServiceRequirements)) {
            return false;
        }
        ServiceRequirements serviceRequirements = (ServiceRequirements) other;
        return Intrinsics.areEqual(this.fixedUid, serviceRequirements.fixedUid) && Intrinsics.areEqual(this.javaCard, serviceRequirements.javaCard) && Intrinsics.areEqual(this.mifare, serviceRequirements.mifare) && Intrinsics.areEqual(this.issuerAccountId, serviceRequirements.issuerAccountId);
    }

    public final String getFixedUid() {
        return this.fixedUid;
    }

    public final Long getIssuerAccountId() {
        return this.issuerAccountId;
    }

    public final String getJavaCard() {
        return this.javaCard;
    }

    public final String getMifare() {
        return this.mifare;
    }

    public int hashCode() {
        String str = this.fixedUid;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.javaCard;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.mifare;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.issuerAccountId;
        return hashCode3 + (l != null ? l.hashCode() : 0);
    }

    public final boolean isDeviceRequiredForDelivery() {
        return this.fixedUid == null;
    }

    public String toString() {
        return "ServiceRequirements(fixedUid=" + this.fixedUid + ", javaCard=" + this.javaCard + ", mifare=" + this.mifare + ", issuerAccountId=" + this.issuerAccountId + ')';
    }

    public ServiceRequirements(String str, String str2, String str3, Long l) {
        this.fixedUid = str;
        this.javaCard = str2;
        this.mifare = str3;
        this.issuerAccountId = l;
    }

    public ServiceRequirements() {
        this(null, null, null, null, 15, null);
    }
}
