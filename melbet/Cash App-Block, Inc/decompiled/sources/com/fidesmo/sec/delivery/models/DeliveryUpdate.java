package com.fidesmo.sec.delivery.models;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b&\u0018\u00002\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\n"}, d2 = {"Lcom/fidesmo/sec/delivery/models/DeliveryUpdate;", "", "()V", "DataFlow", "Finished", "NeedsEncryptedUserInteraction", "NeedsUserActionUsingHandler", "NeedsUserInteractionUsingHandler", "NotStarted", "OperationInProgress", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class DeliveryUpdate {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/fidesmo/sec/delivery/models/DeliveryUpdate$DataFlow;", "", "(Ljava/lang/String;I)V", "talkingToServer", "apdusToDevice", "apdusToServer", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum DataFlow {
        talkingToServer,
        apdusToDevice,
        apdusToServer
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/fidesmo/sec/delivery/models/DeliveryUpdate$Finished;", "Lcom/fidesmo/sec/delivery/models/DeliveryUpdate;", "status", "Lcom/fidesmo/sec/delivery/models/ServiceStatus;", "(Lcom/fidesmo/sec/delivery/models/ServiceStatus;)V", "getStatus", "()Lcom/fidesmo/sec/delivery/models/ServiceStatus;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Finished extends DeliveryUpdate {
        private final ServiceStatus status;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Finished(ServiceStatus serviceStatus) {
            super(null);
            serviceStatus.getClass();
            this.status = serviceStatus;
        }

        public static /* synthetic */ Finished copy$default(Finished finished, ServiceStatus serviceStatus, int i, Object obj) {
            if ((i & 1) != 0) {
                serviceStatus = finished.status;
            }
            return finished.copy(serviceStatus);
        }

        /* renamed from: component1, reason: from getter */
        public final ServiceStatus getStatus() {
            return this.status;
        }

        public final Finished copy(ServiceStatus status) {
            status.getClass();
            return new Finished(status);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Finished) && Intrinsics.areEqual(this.status, ((Finished) other).status);
        }

        public final ServiceStatus getStatus() {
            return this.status;
        }

        public int hashCode() {
            return this.status.hashCode();
        }

        public String toString() {
            return "Finished(status=" + this.status + ')';
        }
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00122\u0010\u0005\u001a.\u0012\u001a\u0012\u0018\u0012\b\u0012\u00060\bj\u0002`\t\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007j\u0002`\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u0006j\u0002`\r¢\u0006\u0002\u0010\u000eJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J5\u0010\u0014\u001a.\u0012\u001a\u0012\u0018\u0012\b\u0012\u00060\bj\u0002`\t\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007j\u0002`\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u0006j\u0002`\rHÆ\u0003JO\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u000324\b\u0002\u0010\u0005\u001a.\u0012\u001a\u0012\u0018\u0012\b\u0012\u00060\bj\u0002`\t\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007j\u0002`\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u0006j\u0002`\rHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\bHÖ\u0001R=\u0010\u0005\u001a.\u0012\u001a\u0012\u0018\u0012\b\u0012\u00060\bj\u0002`\t\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007j\u0002`\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u0006j\u0002`\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/fidesmo/sec/delivery/models/DeliveryUpdate$NeedsEncryptedUserInteraction;", "Lcom/fidesmo/sec/delivery/models/DeliveryUpdate;", "requirements", "", "Lcom/fidesmo/sec/delivery/models/DataRequirement;", "handler", "Lkotlin/Function2;", "", "", "Lcom/fidesmo/sec/delivery/models/DataRequirementId;", "Lcom/fidesmo/sec/delivery/models/UserDataResponse;", "", "", "Lcom/fidesmo/sec/delivery/models/EncryptedUserResponseHandler;", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;)V", "getHandler", "()Lkotlin/jvm/functions/Function2;", "getRequirements", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class NeedsEncryptedUserInteraction extends DeliveryUpdate {
        private final Function2<Map<String, String>, byte[], Unit> handler;
        private final List<DataRequirement> requirements;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public NeedsEncryptedUserInteraction(List<? extends DataRequirement> list, Function2<? super Map<String, String>, ? super byte[], Unit> function2) {
            super(null);
            list.getClass();
            function2.getClass();
            this.requirements = list;
            this.handler = function2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ NeedsEncryptedUserInteraction copy$default(NeedsEncryptedUserInteraction needsEncryptedUserInteraction, List list, Function2 function2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = needsEncryptedUserInteraction.requirements;
            }
            if ((i & 2) != 0) {
                function2 = needsEncryptedUserInteraction.handler;
            }
            return needsEncryptedUserInteraction.copy(list, function2);
        }

        public final List<DataRequirement> component1() {
            return this.requirements;
        }

        public final Function2<Map<String, String>, byte[], Unit> component2() {
            return this.handler;
        }

        public final NeedsEncryptedUserInteraction copy(List<? extends DataRequirement> requirements, Function2<? super Map<String, String>, ? super byte[], Unit> handler) {
            requirements.getClass();
            handler.getClass();
            return new NeedsEncryptedUserInteraction(requirements, handler);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NeedsEncryptedUserInteraction)) {
                return false;
            }
            NeedsEncryptedUserInteraction needsEncryptedUserInteraction = (NeedsEncryptedUserInteraction) other;
            return Intrinsics.areEqual(this.requirements, needsEncryptedUserInteraction.requirements) && Intrinsics.areEqual(this.handler, needsEncryptedUserInteraction.handler);
        }

        public final Function2<Map<String, String>, byte[], Unit> getHandler() {
            return this.handler;
        }

        public final List<DataRequirement> getRequirements() {
            return this.requirements;
        }

        public int hashCode() {
            return this.handler.hashCode() + (this.requirements.hashCode() * 31);
        }

        public String toString() {
            return "NeedsEncryptedUserInteraction(requirements=" + this.requirements + ", handler=" + this.handler + ')';
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0002\u0010\nJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\tHÆ\u0003J3\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\tHÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR!\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/fidesmo/sec/delivery/models/DeliveryUpdate$NeedsUserActionUsingHandler;", "Lcom/fidesmo/sec/delivery/models/DeliveryUpdate;", "actions", "", "Lcom/fidesmo/sec/delivery/models/UiAction;", "handler", "Lkotlin/Function1;", "", "", "Lcom/fidesmo/sec/delivery/models/UserActionHandler;", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "getActions", "()Ljava/util/List;", "getHandler", "()Lkotlin/jvm/functions/Function1;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class NeedsUserActionUsingHandler extends DeliveryUpdate {
        private final List<UiAction> actions;
        private final Function1<Boolean, Unit> handler;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public NeedsUserActionUsingHandler(List<UiAction> list, Function1<? super Boolean, Unit> function1) {
            super(null);
            list.getClass();
            function1.getClass();
            this.actions = list;
            this.handler = function1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ NeedsUserActionUsingHandler copy$default(NeedsUserActionUsingHandler needsUserActionUsingHandler, List list, Function1 function1, int i, Object obj) {
            if ((i & 1) != 0) {
                list = needsUserActionUsingHandler.actions;
            }
            if ((i & 2) != 0) {
                function1 = needsUserActionUsingHandler.handler;
            }
            return needsUserActionUsingHandler.copy(list, function1);
        }

        public final List<UiAction> component1() {
            return this.actions;
        }

        public final Function1<Boolean, Unit> component2() {
            return this.handler;
        }

        public final NeedsUserActionUsingHandler copy(List<UiAction> actions, Function1<? super Boolean, Unit> handler) {
            actions.getClass();
            handler.getClass();
            return new NeedsUserActionUsingHandler(actions, handler);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NeedsUserActionUsingHandler)) {
                return false;
            }
            NeedsUserActionUsingHandler needsUserActionUsingHandler = (NeedsUserActionUsingHandler) other;
            return Intrinsics.areEqual(this.actions, needsUserActionUsingHandler.actions) && Intrinsics.areEqual(this.handler, needsUserActionUsingHandler.handler);
        }

        public final List<UiAction> getActions() {
            return this.actions;
        }

        public final Function1<Boolean, Unit> getHandler() {
            return this.handler;
        }

        public int hashCode() {
            return this.handler.hashCode() + (this.actions.hashCode() * 31);
        }

        public String toString() {
            return "NeedsUserActionUsingHandler(actions=" + this.actions + ", handler=" + this.handler + ')';
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012,\u0010\u0005\u001a(\u0012\u001a\u0012\u0018\u0012\b\u0012\u00060\bj\u0002`\t\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007j\u0002`\n\u0012\u0004\u0012\u00020\u000b0\u0006j\u0002`\f¢\u0006\u0002\u0010\rJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J/\u0010\u0013\u001a(\u0012\u001a\u0012\u0018\u0012\b\u0012\u00060\bj\u0002`\t\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007j\u0002`\n\u0012\u0004\u0012\u00020\u000b0\u0006j\u0002`\fHÆ\u0003JI\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032.\b\u0002\u0010\u0005\u001a(\u0012\u001a\u0012\u0018\u0012\b\u0012\u00060\bj\u0002`\t\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007j\u0002`\n\u0012\u0004\u0012\u00020\u000b0\u0006j\u0002`\fHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\bHÖ\u0001R7\u0010\u0005\u001a(\u0012\u001a\u0012\u0018\u0012\b\u0012\u00060\bj\u0002`\t\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007j\u0002`\n\u0012\u0004\u0012\u00020\u000b0\u0006j\u0002`\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/fidesmo/sec/delivery/models/DeliveryUpdate$NeedsUserInteractionUsingHandler;", "Lcom/fidesmo/sec/delivery/models/DeliveryUpdate;", "requirements", "", "Lcom/fidesmo/sec/delivery/models/DataRequirement;", "handler", "Lkotlin/Function1;", "", "", "Lcom/fidesmo/sec/delivery/models/DataRequirementId;", "Lcom/fidesmo/sec/delivery/models/UserDataResponse;", "", "Lcom/fidesmo/sec/delivery/models/UserResponseHandler;", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "getHandler", "()Lkotlin/jvm/functions/Function1;", "getRequirements", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class NeedsUserInteractionUsingHandler extends DeliveryUpdate {
        private final Function1<Map<String, String>, Unit> handler;
        private final List<DataRequirement> requirements;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public NeedsUserInteractionUsingHandler(List<? extends DataRequirement> list, Function1<? super Map<String, String>, Unit> function1) {
            super(null);
            list.getClass();
            function1.getClass();
            this.requirements = list;
            this.handler = function1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ NeedsUserInteractionUsingHandler copy$default(NeedsUserInteractionUsingHandler needsUserInteractionUsingHandler, List list, Function1 function1, int i, Object obj) {
            if ((i & 1) != 0) {
                list = needsUserInteractionUsingHandler.requirements;
            }
            if ((i & 2) != 0) {
                function1 = needsUserInteractionUsingHandler.handler;
            }
            return needsUserInteractionUsingHandler.copy(list, function1);
        }

        public final List<DataRequirement> component1() {
            return this.requirements;
        }

        public final Function1<Map<String, String>, Unit> component2() {
            return this.handler;
        }

        public final NeedsUserInteractionUsingHandler copy(List<? extends DataRequirement> requirements, Function1<? super Map<String, String>, Unit> handler) {
            requirements.getClass();
            handler.getClass();
            return new NeedsUserInteractionUsingHandler(requirements, handler);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NeedsUserInteractionUsingHandler)) {
                return false;
            }
            NeedsUserInteractionUsingHandler needsUserInteractionUsingHandler = (NeedsUserInteractionUsingHandler) other;
            return Intrinsics.areEqual(this.requirements, needsUserInteractionUsingHandler.requirements) && Intrinsics.areEqual(this.handler, needsUserInteractionUsingHandler.handler);
        }

        public final Function1<Map<String, String>, Unit> getHandler() {
            return this.handler;
        }

        public final List<DataRequirement> getRequirements() {
            return this.requirements;
        }

        public int hashCode() {
            return this.handler.hashCode() + (this.requirements.hashCode() * 31);
        }

        public String toString() {
            return "NeedsUserInteractionUsingHandler(requirements=" + this.requirements + ", handler=" + this.handler + ')';
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/fidesmo/sec/delivery/models/DeliveryUpdate$NotStarted;", "Lcom/fidesmo/sec/delivery/models/DeliveryUpdate;", "()V", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NotStarted extends DeliveryUpdate {
        public NotStarted() {
            super(null);
        }
    }

    public /* synthetic */ DeliveryUpdate(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private DeliveryUpdate() {
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0012\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J?\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lcom/fidesmo/sec/delivery/models/DeliveryUpdate$OperationInProgress;", "Lcom/fidesmo/sec/delivery/models/DeliveryUpdate;", "sessionId", "Ljava/util/UUID;", "progress", "Lcom/fidesmo/sec/delivery/models/DeliveryProgress;", "dataFlow", "Lcom/fidesmo/sec/delivery/models/DeliveryUpdate$DataFlow;", "apdus", "", "", "(Ljava/util/UUID;Lcom/fidesmo/sec/delivery/models/DeliveryProgress;Lcom/fidesmo/sec/delivery/models/DeliveryUpdate$DataFlow;Ljava/util/List;)V", "getApdus", "()Ljava/util/List;", "getDataFlow", "()Lcom/fidesmo/sec/delivery/models/DeliveryUpdate$DataFlow;", "getProgress", "()Lcom/fidesmo/sec/delivery/models/DeliveryProgress;", "getSessionId", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class OperationInProgress extends DeliveryUpdate {
        private final List<byte[]> apdus;
        private final DataFlow dataFlow;
        private final DeliveryProgress progress;
        private final UUID sessionId;

        public /* synthetic */ OperationInProgress(UUID uuid, DeliveryProgress deliveryProgress, DataFlow dataFlow, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uuid, (i & 2) != 0 ? null : deliveryProgress, (i & 4) != 0 ? null : dataFlow, (i & 8) != 0 ? null : list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ OperationInProgress copy$default(OperationInProgress operationInProgress, UUID uuid, DeliveryProgress deliveryProgress, DataFlow dataFlow, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = operationInProgress.sessionId;
            }
            if ((i & 2) != 0) {
                deliveryProgress = operationInProgress.progress;
            }
            if ((i & 4) != 0) {
                dataFlow = operationInProgress.dataFlow;
            }
            if ((i & 8) != 0) {
                list = operationInProgress.apdus;
            }
            return operationInProgress.copy(uuid, deliveryProgress, dataFlow, list);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getSessionId() {
            return this.sessionId;
        }

        /* renamed from: component2, reason: from getter */
        public final DeliveryProgress getProgress() {
            return this.progress;
        }

        /* renamed from: component3, reason: from getter */
        public final DataFlow getDataFlow() {
            return this.dataFlow;
        }

        public final List<byte[]> component4() {
            return this.apdus;
        }

        public final OperationInProgress copy(UUID sessionId, DeliveryProgress progress, DataFlow dataFlow, List<byte[]> apdus) {
            return new OperationInProgress(sessionId, progress, dataFlow, apdus);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OperationInProgress)) {
                return false;
            }
            OperationInProgress operationInProgress = (OperationInProgress) other;
            return Intrinsics.areEqual(this.sessionId, operationInProgress.sessionId) && Intrinsics.areEqual(this.progress, operationInProgress.progress) && this.dataFlow == operationInProgress.dataFlow && Intrinsics.areEqual(this.apdus, operationInProgress.apdus);
        }

        public final List<byte[]> getApdus() {
            return this.apdus;
        }

        public final DataFlow getDataFlow() {
            return this.dataFlow;
        }

        public final DeliveryProgress getProgress() {
            return this.progress;
        }

        public final UUID getSessionId() {
            return this.sessionId;
        }

        public int hashCode() {
            UUID uuid = this.sessionId;
            int hashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
            DeliveryProgress deliveryProgress = this.progress;
            int hashCode2 = (hashCode + (deliveryProgress == null ? 0 : deliveryProgress.hashCode())) * 31;
            DataFlow dataFlow = this.dataFlow;
            int hashCode3 = (hashCode2 + (dataFlow == null ? 0 : dataFlow.hashCode())) * 31;
            List<byte[]> list = this.apdus;
            return hashCode3 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("OperationInProgress(sessionId=");
            sb.append(this.sessionId);
            sb.append(", progress=");
            sb.append(this.progress);
            sb.append(", dataFlow=");
            sb.append(this.dataFlow);
            sb.append(", apdus=");
            return CameraState$Type$EnumUnboxingLocalUtility.m(sb, (List) this.apdus, ')');
        }

        public OperationInProgress() {
            this(null, null, null, null, 15, null);
        }

        public OperationInProgress(UUID uuid, DeliveryProgress deliveryProgress, DataFlow dataFlow, List<byte[]> list) {
            super(null);
            this.sessionId = uuid;
            this.progress = deliveryProgress;
            this.dataFlow = dataFlow;
            this.apdus = list;
        }
    }
}
