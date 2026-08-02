package com.squareup.cash.cdf.contact;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ContactSyncSendToServer implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Double duration_of_upload;
    public final String error_description;
    public final Integer number_of_contacts_deleted;
    public final Integer number_of_contacts_uploaded;
    public final LinkedHashMap parameters;
    public final ServerResponse server_response;
    public final Boolean was_fresh_sync;
    public final SyncLogicType which_sync_path;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ServerResponse {
        public static final /* synthetic */ ServerResponse[] $VALUES;
        public static final ServerResponse ERROR;
        public static final ServerResponse INVALID;
        public static final ServerResponse SUCCESS;
        public static final ServerResponse TOO_MANY_ATTEMPTS;
        public static final ServerResponse UNKNOWN;

        static {
            ServerResponse serverResponse = new ServerResponse("SUCCESS", 0);
            SUCCESS = serverResponse;
            ServerResponse serverResponse2 = new ServerResponse("ERROR", 1);
            ERROR = serverResponse2;
            ServerResponse serverResponse3 = new ServerResponse("NO_RESPONSE_NO_ERROR", 2);
            ServerResponse serverResponse4 = new ServerResponse("TOO_MANY_ATTEMPTS", 3);
            TOO_MANY_ATTEMPTS = serverResponse4;
            ServerResponse serverResponse5 = new ServerResponse("INVALID", 4);
            INVALID = serverResponse5;
            ServerResponse serverResponse6 = new ServerResponse("UNKNOWN", 5);
            UNKNOWN = serverResponse6;
            $VALUES = new ServerResponse[]{serverResponse, serverResponse2, serverResponse3, serverResponse4, serverResponse5, serverResponse6};
        }

        public static ServerResponse valueOf(String str) {
            return (ServerResponse) Enum.valueOf(ServerResponse.class, str);
        }

        public static ServerResponse[] values() {
            return (ServerResponse[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class SyncLogicType {
        public static final /* synthetic */ SyncLogicType[] $VALUES;
        public static final SyncLogicType LEGACY;
        public static final SyncLogicType MODERN;

        static {
            SyncLogicType syncLogicType = new SyncLogicType("LEGACY", 0);
            LEGACY = syncLogicType;
            SyncLogicType syncLogicType2 = new SyncLogicType("MODERN", 1);
            MODERN = syncLogicType2;
            $VALUES = new SyncLogicType[]{syncLogicType, syncLogicType2};
        }

        public static SyncLogicType valueOf(String str) {
            return (SyncLogicType) Enum.valueOf(SyncLogicType.class, str);
        }

        public static SyncLogicType[] values() {
            return (SyncLogicType[]) $VALUES.clone();
        }
    }

    public ContactSyncSendToServer(Boolean bool, Integer num, Integer num2, Double d, ServerResponse serverResponse, SyncLogicType syncLogicType, String str) {
        SyncLogicType syncLogicType2 = SyncLogicType.MODERN;
        this.was_fresh_sync = bool;
        this.number_of_contacts_uploaded = num;
        this.number_of_contacts_deleted = num2;
        this.duration_of_upload = d;
        this.server_response = serverResponse;
        this.which_sync_path = syncLogicType;
        this.error_description = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 10, "Contact", "cdf_action", "Sync");
        Countries.putSafe(m, "sync_logic_type", syncLogicType2);
        Countries.putSafe(m, "was_fresh_sync", bool);
        Countries.putSafe(m, "number_of_contacts_uploaded", num);
        Countries.putSafe(m, "number_of_contacts_deleted", num2);
        Countries.putSafe(m, "duration_of_upload", d);
        Countries.putSafe(m, "server_response", serverResponse);
        Countries.putSafe(m, "which_sync_path", syncLogicType);
        Countries.putSafe(m, "error_description", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactSyncSendToServer)) {
            return false;
        }
        ContactSyncSendToServer contactSyncSendToServer = (ContactSyncSendToServer) obj;
        SyncLogicType syncLogicType = SyncLogicType.LEGACY;
        return this.was_fresh_sync.equals(contactSyncSendToServer.was_fresh_sync) && this.number_of_contacts_uploaded.equals(contactSyncSendToServer.number_of_contacts_uploaded) && this.number_of_contacts_deleted.equals(contactSyncSendToServer.number_of_contacts_deleted) && this.duration_of_upload.equals(contactSyncSendToServer.duration_of_upload) && this.server_response == contactSyncSendToServer.server_response && this.which_sync_path == contactSyncSendToServer.which_sync_path && Intrinsics.areEqual(this.error_description, contactSyncSendToServer.error_description);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Contact Sync SendToServer";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = (this.which_sync_path.hashCode() + ((this.server_response.hashCode() + ((this.duration_of_upload.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(CameraState$Type$EnumUnboxingLocalUtility.m(ViewEvent$State$EnumUnboxingLocalUtility.m(this.was_fresh_sync, SyncLogicType.MODERN.hashCode() * 31, 31), 31, this.number_of_contacts_uploaded), 31, this.number_of_contacts_deleted)) * 31)) * 31)) * 31;
        String str = this.error_description;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        SyncLogicType syncLogicType = SyncLogicType.MODERN;
        StringBuilder sb = new StringBuilder("ContactSyncSendToServer(sync_logic_type=");
        sb.append(syncLogicType);
        sb.append(", was_fresh_sync=");
        sb.append(this.was_fresh_sync);
        sb.append(", number_of_contacts_uploaded=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.number_of_contacts_uploaded, ", number_of_contacts_deleted=", this.number_of_contacts_deleted, ", duration_of_upload=");
        sb.append(this.duration_of_upload);
        sb.append(", server_response=");
        sb.append(this.server_response);
        sb.append(", which_sync_path=");
        sb.append(this.which_sync_path);
        sb.append(", error_description=");
        sb.append(this.error_description);
        sb.append(")");
        return sb.toString();
    }
}
