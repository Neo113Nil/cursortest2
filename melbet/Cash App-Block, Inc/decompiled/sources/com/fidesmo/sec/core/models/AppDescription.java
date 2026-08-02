package com.fidesmo.sec.core.models;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import java.net.URI;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\nHÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030\fHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jq\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012¨\u0006/"}, d2 = {"Lcom/fidesmo/sec/core/models/AppDescription;", "", "appId", "", "name", "Lcom/fidesmo/sec/core/models/ParametrisedTranslation;", "description", "organization", "Lcom/fidesmo/sec/core/models/Org;", "logo", "Ljava/net/URI;", "installServices", "", "suspendService", "unsuspendService", "uninstallService", "(Ljava/lang/String;Lcom/fidesmo/sec/core/models/ParametrisedTranslation;Lcom/fidesmo/sec/core/models/ParametrisedTranslation;Lcom/fidesmo/sec/core/models/Org;Ljava/net/URI;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppId", "()Ljava/lang/String;", "getDescription", "()Lcom/fidesmo/sec/core/models/ParametrisedTranslation;", "getInstallServices", "()Ljava/util/List;", "getLogo", "()Ljava/net/URI;", "getName", "getOrganization", "()Lcom/fidesmo/sec/core/models/Org;", "getSuspendService", "getUninstallService", "getUnsuspendService", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AppDescription {
    private final String appId;
    private final ParametrisedTranslation description;
    private final List<String> installServices;
    private final URI logo;
    private final ParametrisedTranslation name;
    private final Org organization;
    private final String suspendService;
    private final String uninstallService;
    private final String unsuspendService;

    public AppDescription(String str, ParametrisedTranslation parametrisedTranslation, ParametrisedTranslation parametrisedTranslation2, Org org2, URI uri, List<String> list, String str2, String str3, String str4) {
        str.getClass();
        parametrisedTranslation.getClass();
        org2.getClass();
        uri.getClass();
        list.getClass();
        this.appId = str;
        this.name = parametrisedTranslation;
        this.description = parametrisedTranslation2;
        this.organization = org2;
        this.logo = uri;
        this.installServices = list;
        this.suspendService = str2;
        this.unsuspendService = str3;
        this.uninstallService = str4;
    }

    public static /* synthetic */ AppDescription copy$default(AppDescription appDescription, String str, ParametrisedTranslation parametrisedTranslation, ParametrisedTranslation parametrisedTranslation2, Org org2, URI uri, List list, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appDescription.appId;
        }
        if ((i & 2) != 0) {
            parametrisedTranslation = appDescription.name;
        }
        if ((i & 4) != 0) {
            parametrisedTranslation2 = appDescription.description;
        }
        if ((i & 8) != 0) {
            org2 = appDescription.organization;
        }
        if ((i & 16) != 0) {
            uri = appDescription.logo;
        }
        if ((i & 32) != 0) {
            list = appDescription.installServices;
        }
        if ((i & 64) != 0) {
            str2 = appDescription.suspendService;
        }
        if ((i & 128) != 0) {
            str3 = appDescription.unsuspendService;
        }
        if ((i & 256) != 0) {
            str4 = appDescription.uninstallService;
        }
        String str5 = str3;
        String str6 = str4;
        List list2 = list;
        String str7 = str2;
        URI uri2 = uri;
        ParametrisedTranslation parametrisedTranslation3 = parametrisedTranslation2;
        return appDescription.copy(str, parametrisedTranslation, parametrisedTranslation3, org2, uri2, list2, str7, str5, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAppId() {
        return this.appId;
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
    public final Org getOrganization() {
        return this.organization;
    }

    /* renamed from: component5, reason: from getter */
    public final URI getLogo() {
        return this.logo;
    }

    public final List<String> component6() {
        return this.installServices;
    }

    /* renamed from: component7, reason: from getter */
    public final String getSuspendService() {
        return this.suspendService;
    }

    /* renamed from: component8, reason: from getter */
    public final String getUnsuspendService() {
        return this.unsuspendService;
    }

    /* renamed from: component9, reason: from getter */
    public final String getUninstallService() {
        return this.uninstallService;
    }

    public final AppDescription copy(String appId, ParametrisedTranslation name, ParametrisedTranslation description, Org organization, URI logo, List<String> installServices, String suspendService, String unsuspendService, String uninstallService) {
        appId.getClass();
        name.getClass();
        organization.getClass();
        logo.getClass();
        installServices.getClass();
        return new AppDescription(appId, name, description, organization, logo, installServices, suspendService, unsuspendService, uninstallService);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppDescription)) {
            return false;
        }
        AppDescription appDescription = (AppDescription) other;
        return Intrinsics.areEqual(this.appId, appDescription.appId) && Intrinsics.areEqual(this.name, appDescription.name) && Intrinsics.areEqual(this.description, appDescription.description) && Intrinsics.areEqual(this.organization, appDescription.organization) && Intrinsics.areEqual(this.logo, appDescription.logo) && Intrinsics.areEqual(this.installServices, appDescription.installServices) && Intrinsics.areEqual(this.suspendService, appDescription.suspendService) && Intrinsics.areEqual(this.unsuspendService, appDescription.unsuspendService) && Intrinsics.areEqual(this.uninstallService, appDescription.uninstallService);
    }

    public final String getAppId() {
        return this.appId;
    }

    public final ParametrisedTranslation getDescription() {
        return this.description;
    }

    public final List<String> getInstallServices() {
        return this.installServices;
    }

    public final URI getLogo() {
        return this.logo;
    }

    public final ParametrisedTranslation getName() {
        return this.name;
    }

    public final Org getOrganization() {
        return this.organization;
    }

    public final String getSuspendService() {
        return this.suspendService;
    }

    public final String getUninstallService() {
        return this.uninstallService;
    }

    public final String getUnsuspendService() {
        return this.unsuspendService;
    }

    public int hashCode() {
        int hashCode = (this.name.hashCode() + (this.appId.hashCode() * 31)) * 31;
        ParametrisedTranslation parametrisedTranslation = this.description;
        int m = Recorder$$ExternalSyntheticOutline2.m((this.logo.hashCode() + ((this.organization.hashCode() + ((hashCode + (parametrisedTranslation == null ? 0 : parametrisedTranslation.hashCode())) * 31)) * 31)) * 31, 31, this.installServices);
        String str = this.suspendService;
        int hashCode2 = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.unsuspendService;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.uninstallService;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AppDescription(appId=");
        sb.append(this.appId);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", organization=");
        sb.append(this.organization);
        sb.append(", logo=");
        sb.append(this.logo);
        sb.append(", installServices=");
        sb.append(this.installServices);
        sb.append(", suspendService=");
        sb.append(this.suspendService);
        sb.append(", unsuspendService=");
        sb.append(this.unsuspendService);
        sb.append(", uninstallService=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.uninstallService, ')');
    }

    public AppDescription(String str, ParametrisedTranslation parametrisedTranslation, ParametrisedTranslation parametrisedTranslation2, Org org2, URI uri, List list, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, parametrisedTranslation, (i & 4) != 0 ? null : parametrisedTranslation2, org2, uri, (i & 32) != 0 ? EmptyList.INSTANCE : list, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? null : str4);
    }
}
