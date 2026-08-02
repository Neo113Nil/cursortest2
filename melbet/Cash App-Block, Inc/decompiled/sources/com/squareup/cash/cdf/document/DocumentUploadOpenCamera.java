package com.squareup.cash.cdf.document;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class DocumentUploadOpenCamera implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final String client_scenario;
    public final String flow_token;
    public final LinkedHashMap parameters;
    public final PermissionStatus permission_status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes9.dex */
    public final class PermissionStatus {
        public static final /* synthetic */ PermissionStatus[] $VALUES;
        public static final PermissionStatus APPROVED;
        public static final PermissionStatus DENIED;

        static {
            PermissionStatus permissionStatus = new PermissionStatus("APPROVED", 0);
            APPROVED = permissionStatus;
            PermissionStatus permissionStatus2 = new PermissionStatus("DENIED", 1);
            DENIED = permissionStatus2;
            $VALUES = new PermissionStatus[]{permissionStatus, permissionStatus2};
        }

        public static PermissionStatus valueOf(String str) {
            return (PermissionStatus) Enum.valueOf(PermissionStatus.class, str);
        }

        public static PermissionStatus[] values() {
            return (PermissionStatus[]) $VALUES.clone();
        }
    }

    public DocumentUploadOpenCamera(String str, String str2, PermissionStatus permissionStatus) {
        this.client_scenario = str;
        this.flow_token = str2;
        this.permission_status = permissionStatus;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "Document", "cdf_action", "Upload");
        Countries.putSafe(m, "client_scenario", str);
        Countries.putSafe(m, "flow_token", str2);
        Countries.putSafe(m, "source", "FilesetUpload");
        Countries.putSafe(m, "permission_status", permissionStatus);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocumentUploadOpenCamera)) {
            return false;
        }
        DocumentUploadOpenCamera documentUploadOpenCamera = (DocumentUploadOpenCamera) obj;
        return this.client_scenario.equals(documentUploadOpenCamera.client_scenario) && Intrinsics.areEqual(this.flow_token, documentUploadOpenCamera.flow_token) && this.permission_status == documentUploadOpenCamera.permission_status;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Document Upload OpenCamera";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.client_scenario.hashCode() * 31;
        return this.permission_status.hashCode() + ((((hashCode + (this.flow_token == null ? 0 : r1.hashCode())) * 31) - 1217000729) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DocumentUploadOpenCamera(client_scenario=", this.client_scenario, ", flow_token=", this.flow_token, ", source=FilesetUpload, permission_status=");
        m.append(this.permission_status);
        m.append(")");
        return m.toString();
    }
}
