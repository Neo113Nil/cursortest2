package com.fidesmo.sec.delivery;

import com.fidesmo.sec.core.models.RequiredField;
import com.fidesmo.sec.delivery.models.DeliveryProgress;
import com.fidesmo.sec.delivery.models.ServiceStatus;
import com.fidesmo.sec.delivery.models.UiAction;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 F2\u00020\u0001:\u0001FB\u007f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0012\b\u0002\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014J\u0010\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u00107\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0013\u0010:\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000bHÆ\u0003J\u0011\u0010;\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000bHÆ\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010=\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0088\u0001\u0010?\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0012\b\u0002\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u0010@J\u0013\u0010A\u001a\u00020\u00032\b\u0010B\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010C\u001a\u00020DHÖ\u0001J\t\u0010E\u001a\u00020\u0011HÖ\u0001R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR$\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0016\"\u0004\b!\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u0006G"}, d2 = {"Lcom/fidesmo/sec/delivery/FetchOperationResponse;", "", "completed", "", "operationId", "Ljava/util/UUID;", "status", "Lcom/fidesmo/sec/delivery/models/ServiceStatus;", "operationType", "Lcom/fidesmo/sec/delivery/OperationType;", "fields", "", "Lcom/fidesmo/sec/core/models/RequiredField;", "actions", "Lcom/fidesmo/sec/delivery/models/UiAction;", "encrypted", "waitingMessage", "", "progress", "Lcom/fidesmo/sec/delivery/models/DeliveryProgress;", "(Ljava/lang/Boolean;Ljava/util/UUID;Lcom/fidesmo/sec/delivery/models/ServiceStatus;Lcom/fidesmo/sec/delivery/OperationType;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Lcom/fidesmo/sec/delivery/models/DeliveryProgress;)V", "getActions", "()Ljava/util/List;", "setActions", "(Ljava/util/List;)V", "getCompleted", "()Ljava/lang/Boolean;", "setCompleted", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getEncrypted", "setEncrypted", "getFields", "setFields", "getOperationId", "()Ljava/util/UUID;", "setOperationId", "(Ljava/util/UUID;)V", "getOperationType", "()Lcom/fidesmo/sec/delivery/OperationType;", "setOperationType", "(Lcom/fidesmo/sec/delivery/OperationType;)V", "getProgress", "()Lcom/fidesmo/sec/delivery/models/DeliveryProgress;", "setProgress", "(Lcom/fidesmo/sec/delivery/models/DeliveryProgress;)V", "getStatus", "()Lcom/fidesmo/sec/delivery/models/ServiceStatus;", "setStatus", "(Lcom/fidesmo/sec/delivery/models/ServiceStatus;)V", "getWaitingMessage", "()Ljava/lang/String;", "setWaitingMessage", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Boolean;Ljava/util/UUID;Lcom/fidesmo/sec/delivery/models/ServiceStatus;Lcom/fidesmo/sec/delivery/OperationType;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Lcom/fidesmo/sec/delivery/models/DeliveryProgress;)Lcom/fidesmo/sec/delivery/FetchOperationResponse;", "equals", "other", "hashCode", "", "toString", "Companion", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FetchOperationResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private List<UiAction> actions;
    private Boolean completed;
    private Boolean encrypted;
    private List<RequiredField> fields;
    private UUID operationId;
    private OperationType operationType;
    private DeliveryProgress progress;
    private ServiceStatus status;
    private String waitingMessage;

    public /* synthetic */ FetchOperationResponse(Boolean bool, UUID uuid, ServiceStatus serviceStatus, OperationType operationType, List list, List list2, Boolean bool2, String str, DeliveryProgress deliveryProgress, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : uuid, (i & 4) != 0 ? null : serviceStatus, (i & 8) != 0 ? OperationType.TRANSCEIVE : operationType, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : list2, (i & 64) != 0 ? null : bool2, (i & 128) != 0 ? null : str, (i & 256) != 0 ? null : deliveryProgress);
    }

    public static /* synthetic */ FetchOperationResponse copy$default(FetchOperationResponse fetchOperationResponse, Boolean bool, UUID uuid, ServiceStatus serviceStatus, OperationType operationType, List list, List list2, Boolean bool2, String str, DeliveryProgress deliveryProgress, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = fetchOperationResponse.completed;
        }
        if ((i & 2) != 0) {
            uuid = fetchOperationResponse.operationId;
        }
        if ((i & 4) != 0) {
            serviceStatus = fetchOperationResponse.status;
        }
        if ((i & 8) != 0) {
            operationType = fetchOperationResponse.operationType;
        }
        if ((i & 16) != 0) {
            list = fetchOperationResponse.fields;
        }
        if ((i & 32) != 0) {
            list2 = fetchOperationResponse.actions;
        }
        if ((i & 64) != 0) {
            bool2 = fetchOperationResponse.encrypted;
        }
        if ((i & 128) != 0) {
            str = fetchOperationResponse.waitingMessage;
        }
        if ((i & 256) != 0) {
            deliveryProgress = fetchOperationResponse.progress;
        }
        String str2 = str;
        DeliveryProgress deliveryProgress2 = deliveryProgress;
        List list3 = list2;
        Boolean bool3 = bool2;
        List list4 = list;
        ServiceStatus serviceStatus2 = serviceStatus;
        return fetchOperationResponse.copy(bool, uuid, serviceStatus2, operationType, list4, list3, bool3, str2, deliveryProgress2);
    }

    public static final FetchOperationResponse status(ServiceStatus serviceStatus) {
        return INSTANCE.status(serviceStatus);
    }

    public static final FetchOperationResponse transceiveOperation(UUID uuid) {
        return INSTANCE.transceiveOperation(uuid);
    }

    public static final FetchOperationResponse uiOperation(UUID uuid, List<RequiredField> list) {
        return INSTANCE.uiOperation(uuid, list);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getCompleted() {
        return this.completed;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getOperationId() {
        return this.operationId;
    }

    /* renamed from: component3, reason: from getter */
    public final ServiceStatus getStatus() {
        return this.status;
    }

    /* renamed from: component4, reason: from getter */
    public final OperationType getOperationType() {
        return this.operationType;
    }

    public final List<RequiredField> component5() {
        return this.fields;
    }

    public final List<UiAction> component6() {
        return this.actions;
    }

    /* renamed from: component7, reason: from getter */
    public final Boolean getEncrypted() {
        return this.encrypted;
    }

    /* renamed from: component8, reason: from getter */
    public final String getWaitingMessage() {
        return this.waitingMessage;
    }

    /* renamed from: component9, reason: from getter */
    public final DeliveryProgress getProgress() {
        return this.progress;
    }

    public final FetchOperationResponse copy(Boolean completed, UUID operationId, ServiceStatus status, OperationType operationType, List<RequiredField> fields, List<UiAction> actions, Boolean encrypted, String waitingMessage, DeliveryProgress progress) {
        return new FetchOperationResponse(completed, operationId, status, operationType, fields, actions, encrypted, waitingMessage, progress);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FetchOperationResponse)) {
            return false;
        }
        FetchOperationResponse fetchOperationResponse = (FetchOperationResponse) other;
        return Intrinsics.areEqual(this.completed, fetchOperationResponse.completed) && Intrinsics.areEqual(this.operationId, fetchOperationResponse.operationId) && Intrinsics.areEqual(this.status, fetchOperationResponse.status) && this.operationType == fetchOperationResponse.operationType && Intrinsics.areEqual(this.fields, fetchOperationResponse.fields) && Intrinsics.areEqual(this.actions, fetchOperationResponse.actions) && Intrinsics.areEqual(this.encrypted, fetchOperationResponse.encrypted) && Intrinsics.areEqual(this.waitingMessage, fetchOperationResponse.waitingMessage) && Intrinsics.areEqual(this.progress, fetchOperationResponse.progress);
    }

    public final List<UiAction> getActions() {
        return this.actions;
    }

    public final Boolean getCompleted() {
        return this.completed;
    }

    public final Boolean getEncrypted() {
        return this.encrypted;
    }

    public final List<RequiredField> getFields() {
        return this.fields;
    }

    public final UUID getOperationId() {
        return this.operationId;
    }

    public final OperationType getOperationType() {
        return this.operationType;
    }

    public final DeliveryProgress getProgress() {
        return this.progress;
    }

    public final ServiceStatus getStatus() {
        return this.status;
    }

    public final String getWaitingMessage() {
        return this.waitingMessage;
    }

    public int hashCode() {
        Boolean bool = this.completed;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        UUID uuid = this.operationId;
        int hashCode2 = (hashCode + (uuid == null ? 0 : uuid.hashCode())) * 31;
        ServiceStatus serviceStatus = this.status;
        int hashCode3 = (hashCode2 + (serviceStatus == null ? 0 : serviceStatus.hashCode())) * 31;
        OperationType operationType = this.operationType;
        int hashCode4 = (hashCode3 + (operationType == null ? 0 : operationType.hashCode())) * 31;
        List<RequiredField> list = this.fields;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<UiAction> list2 = this.actions;
        int hashCode6 = (hashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool2 = this.encrypted;
        int hashCode7 = (hashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.waitingMessage;
        int hashCode8 = (hashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        DeliveryProgress deliveryProgress = this.progress;
        return hashCode8 + (deliveryProgress != null ? deliveryProgress.hashCode() : 0);
    }

    public final void setActions(List<UiAction> list) {
        this.actions = list;
    }

    public final void setCompleted(Boolean bool) {
        this.completed = bool;
    }

    public final void setEncrypted(Boolean bool) {
        this.encrypted = bool;
    }

    public final void setFields(List<RequiredField> list) {
        this.fields = list;
    }

    public final void setOperationId(UUID uuid) {
        this.operationId = uuid;
    }

    public final void setOperationType(OperationType operationType) {
        this.operationType = operationType;
    }

    public final void setProgress(DeliveryProgress deliveryProgress) {
        this.progress = deliveryProgress;
    }

    public final void setStatus(ServiceStatus serviceStatus) {
        this.status = serviceStatus;
    }

    public final void setWaitingMessage(String str) {
        this.waitingMessage = str;
    }

    public String toString() {
        return "FetchOperationResponse(completed=" + this.completed + ", operationId=" + this.operationId + ", status=" + this.status + ", operationType=" + this.operationType + ", fields=" + this.fields + ", actions=" + this.actions + ", encrypted=" + this.encrypted + ", waitingMessage=" + this.waitingMessage + ", progress=" + this.progress + ')';
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0005H\u0007J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J$\u0010\t\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000bH\u0007¨\u0006\r"}, d2 = {"Lcom/fidesmo/sec/delivery/FetchOperationResponse$Companion;", "", "()V", "status", "Lcom/fidesmo/sec/delivery/FetchOperationResponse;", "Lcom/fidesmo/sec/delivery/models/ServiceStatus;", "transceiveOperation", "operationId", "Ljava/util/UUID;", "uiOperation", "fields", "", "Lcom/fidesmo/sec/core/models/RequiredField;", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FetchOperationResponse status(ServiceStatus status) {
            return new FetchOperationResponse(Boolean.TRUE, null, status, null, null, null, Boolean.FALSE, null, null);
        }

        public final FetchOperationResponse transceiveOperation(UUID operationId) {
            Boolean bool = Boolean.FALSE;
            return new FetchOperationResponse(bool, operationId, null, OperationType.TRANSCEIVE, null, null, bool, null, null);
        }

        public final FetchOperationResponse uiOperation(UUID operationId, List<RequiredField> fields) {
            Boolean bool = Boolean.FALSE;
            return new FetchOperationResponse(bool, operationId, null, OperationType.USER_INTERACTION, fields, null, bool, null, null);
        }

        private Companion() {
        }
    }

    public FetchOperationResponse(Boolean bool, UUID uuid, ServiceStatus serviceStatus, OperationType operationType, List<RequiredField> list, List<UiAction> list2, Boolean bool2, String str, DeliveryProgress deliveryProgress) {
        this.completed = bool;
        this.operationId = uuid;
        this.status = serviceStatus;
        this.operationType = operationType;
        this.fields = list;
        this.actions = list2;
        this.encrypted = bool2;
        this.waitingMessage = str;
        this.progress = deliveryProgress;
    }

    public FetchOperationResponse() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }
}
