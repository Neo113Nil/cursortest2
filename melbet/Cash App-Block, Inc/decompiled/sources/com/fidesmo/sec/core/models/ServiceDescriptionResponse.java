package com.fidesmo.sec.core.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/fidesmo/sec/core/models/ServiceDescriptionResponse;", "", "serviceId", "", "app", "Lcom/fidesmo/sec/core/models/AppDescription;", "description", "Lcom/fidesmo/sec/core/models/ServiceDescription;", "(Ljava/lang/String;Lcom/fidesmo/sec/core/models/AppDescription;Lcom/fidesmo/sec/core/models/ServiceDescription;)V", "getApp", "()Lcom/fidesmo/sec/core/models/AppDescription;", "getDescription", "()Lcom/fidesmo/sec/core/models/ServiceDescription;", "getServiceId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ServiceDescriptionResponse {
    private final AppDescription app;
    private final ServiceDescription description;
    private final String serviceId;

    public ServiceDescriptionResponse(String str, AppDescription appDescription, ServiceDescription serviceDescription) {
        str.getClass();
        serviceDescription.getClass();
        this.serviceId = str;
        this.app = appDescription;
        this.description = serviceDescription;
    }

    public static /* synthetic */ ServiceDescriptionResponse copy$default(ServiceDescriptionResponse serviceDescriptionResponse, String str, AppDescription appDescription, ServiceDescription serviceDescription, int i, Object obj) {
        if ((i & 1) != 0) {
            str = serviceDescriptionResponse.serviceId;
        }
        if ((i & 2) != 0) {
            appDescription = serviceDescriptionResponse.app;
        }
        if ((i & 4) != 0) {
            serviceDescription = serviceDescriptionResponse.description;
        }
        return serviceDescriptionResponse.copy(str, appDescription, serviceDescription);
    }

    /* renamed from: component1, reason: from getter */
    public final String getServiceId() {
        return this.serviceId;
    }

    /* renamed from: component2, reason: from getter */
    public final AppDescription getApp() {
        return this.app;
    }

    /* renamed from: component3, reason: from getter */
    public final ServiceDescription getDescription() {
        return this.description;
    }

    public final ServiceDescriptionResponse copy(String serviceId, AppDescription app2, ServiceDescription description) {
        serviceId.getClass();
        description.getClass();
        return new ServiceDescriptionResponse(serviceId, app2, description);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServiceDescriptionResponse)) {
            return false;
        }
        ServiceDescriptionResponse serviceDescriptionResponse = (ServiceDescriptionResponse) other;
        return Intrinsics.areEqual(this.serviceId, serviceDescriptionResponse.serviceId) && Intrinsics.areEqual(this.app, serviceDescriptionResponse.app) && Intrinsics.areEqual(this.description, serviceDescriptionResponse.description);
    }

    public final AppDescription getApp() {
        return this.app;
    }

    public final ServiceDescription getDescription() {
        return this.description;
    }

    public final String getServiceId() {
        return this.serviceId;
    }

    public int hashCode() {
        int hashCode = this.serviceId.hashCode() * 31;
        AppDescription appDescription = this.app;
        return this.description.hashCode() + ((hashCode + (appDescription == null ? 0 : appDescription.hashCode())) * 31);
    }

    public String toString() {
        return "ServiceDescriptionResponse(serviceId=" + this.serviceId + ", app=" + this.app + ", description=" + this.description + ')';
    }

    public /* synthetic */ ServiceDescriptionResponse(String str, AppDescription appDescription, ServiceDescription serviceDescription, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : appDescription, serviceDescription);
    }
}
