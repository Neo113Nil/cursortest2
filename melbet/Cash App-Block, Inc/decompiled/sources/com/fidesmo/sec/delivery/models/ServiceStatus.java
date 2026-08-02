package com.fidesmo.sec.delivery.models;

import com.fidesmo.sec.core.models.InstanceElement;
import com.fidesmo.sec.core.models.ParametrisedTranslation;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0002\u0010\rJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\\\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\fHÖ\u0001R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lcom/fidesmo/sec/delivery/models/ServiceStatus;", "", "success", "", "instanceElements", "", "Lcom/fidesmo/sec/core/models/InstanceElement;", "message", "Lcom/fidesmo/sec/core/models/ParametrisedTranslation;", "scriptStatus", "clientMetadata", "", "", "(Ljava/lang/Boolean;Ljava/util/List;Lcom/fidesmo/sec/core/models/ParametrisedTranslation;Lcom/fidesmo/sec/core/models/ParametrisedTranslation;Ljava/util/Map;)V", "getClientMetadata", "()Ljava/util/Map;", "getInstanceElements", "()Ljava/util/List;", "getMessage", "()Lcom/fidesmo/sec/core/models/ParametrisedTranslation;", "getScriptStatus", "getSuccess", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Boolean;Ljava/util/List;Lcom/fidesmo/sec/core/models/ParametrisedTranslation;Lcom/fidesmo/sec/core/models/ParametrisedTranslation;Ljava/util/Map;)Lcom/fidesmo/sec/delivery/models/ServiceStatus;", "equals", "other", "hashCode", "", "toString", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ServiceStatus {
    private final Map<String, String> clientMetadata;
    private final List<InstanceElement> instanceElements;
    private final ParametrisedTranslation message;
    private final ParametrisedTranslation scriptStatus;
    private final Boolean success;

    public /* synthetic */ ServiceStatus(Boolean bool, List list, ParametrisedTranslation parametrisedTranslation, ParametrisedTranslation parametrisedTranslation2, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : parametrisedTranslation, (i & 8) != 0 ? null : parametrisedTranslation2, (i & 16) != 0 ? null : map);
    }

    public static /* synthetic */ ServiceStatus copy$default(ServiceStatus serviceStatus, Boolean bool, List list, ParametrisedTranslation parametrisedTranslation, ParametrisedTranslation parametrisedTranslation2, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = serviceStatus.success;
        }
        if ((i & 2) != 0) {
            list = serviceStatus.instanceElements;
        }
        if ((i & 4) != 0) {
            parametrisedTranslation = serviceStatus.message;
        }
        if ((i & 8) != 0) {
            parametrisedTranslation2 = serviceStatus.scriptStatus;
        }
        if ((i & 16) != 0) {
            map = serviceStatus.clientMetadata;
        }
        Map map2 = map;
        ParametrisedTranslation parametrisedTranslation3 = parametrisedTranslation;
        return serviceStatus.copy(bool, list, parametrisedTranslation3, parametrisedTranslation2, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getSuccess() {
        return this.success;
    }

    public final List<InstanceElement> component2() {
        return this.instanceElements;
    }

    /* renamed from: component3, reason: from getter */
    public final ParametrisedTranslation getMessage() {
        return this.message;
    }

    /* renamed from: component4, reason: from getter */
    public final ParametrisedTranslation getScriptStatus() {
        return this.scriptStatus;
    }

    public final Map<String, String> component5() {
        return this.clientMetadata;
    }

    public final ServiceStatus copy(Boolean success, List<InstanceElement> instanceElements, ParametrisedTranslation message, ParametrisedTranslation scriptStatus, Map<String, String> clientMetadata) {
        return new ServiceStatus(success, instanceElements, message, scriptStatus, clientMetadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServiceStatus)) {
            return false;
        }
        ServiceStatus serviceStatus = (ServiceStatus) other;
        return Intrinsics.areEqual(this.success, serviceStatus.success) && Intrinsics.areEqual(this.instanceElements, serviceStatus.instanceElements) && Intrinsics.areEqual(this.message, serviceStatus.message) && Intrinsics.areEqual(this.scriptStatus, serviceStatus.scriptStatus) && Intrinsics.areEqual(this.clientMetadata, serviceStatus.clientMetadata);
    }

    public final Map<String, String> getClientMetadata() {
        return this.clientMetadata;
    }

    public final List<InstanceElement> getInstanceElements() {
        return this.instanceElements;
    }

    public final ParametrisedTranslation getMessage() {
        return this.message;
    }

    public final ParametrisedTranslation getScriptStatus() {
        return this.scriptStatus;
    }

    public final Boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        Boolean bool = this.success;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        List<InstanceElement> list = this.instanceElements;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        ParametrisedTranslation parametrisedTranslation = this.message;
        int hashCode3 = (hashCode2 + (parametrisedTranslation == null ? 0 : parametrisedTranslation.hashCode())) * 31;
        ParametrisedTranslation parametrisedTranslation2 = this.scriptStatus;
        int hashCode4 = (hashCode3 + (parametrisedTranslation2 == null ? 0 : parametrisedTranslation2.hashCode())) * 31;
        Map<String, String> map = this.clientMetadata;
        return hashCode4 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "ServiceStatus(success=" + this.success + ", instanceElements=" + this.instanceElements + ", message=" + this.message + ", scriptStatus=" + this.scriptStatus + ", clientMetadata=" + this.clientMetadata + ')';
    }

    public ServiceStatus(Boolean bool, List<InstanceElement> list, ParametrisedTranslation parametrisedTranslation, ParametrisedTranslation parametrisedTranslation2, Map<String, String> map) {
        this.success = bool;
        this.instanceElements = list;
        this.message = parametrisedTranslation;
        this.scriptStatus = parametrisedTranslation2;
        this.clientMetadata = map;
    }

    public ServiceStatus() {
        this(null, null, null, null, null, 31, null);
    }
}
