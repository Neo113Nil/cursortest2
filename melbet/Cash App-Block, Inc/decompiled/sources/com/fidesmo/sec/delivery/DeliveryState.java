package com.fidesmo.sec.delivery;

import com.fidesmo.sec.delivery.models.DataRequirement;
import com.fidesmo.sec.delivery.models.DeliveryUpdate;
import com.fidesmo.sec.delivery.models.ServiceDeliveryRequired;
import com.fidesmo.sec.delivery.models.ServiceStatus;
import com.fidesmo.sec.delivery.models.UiAction;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010j\u001a\u00020\u0003HÆ\u0003J\u0013\u0010k\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010l\u001a\u0002072\b\u0010m\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0010\u0010n\u001a\u00020(2\b\u0010J\u001a\u0004\u0018\u00010KJ\u001e\u0010o\u001a\u00020(2\u0006\u0010C\u001a\u00020D2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006J\u0010\u0010p\u001a\u00020(2\b\u0010q\u001a\u0004\u0018\u00010\u0018J)\u0010r\u001a\u00020(2\b\u00103\u001a\u0004\u0018\u00010\u001e2\b\u00106\u001a\u0004\u0018\u0001072\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\u0002\u0010sJ_\u0010t\u001a\u00020(2\u0006\u0010C\u001a\u00020D2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00062\b\u0010u\u001a\u0004\u0018\u00010722\u0010v\u001a.\u0012\u001a\u0012\u0018\u0012\b\u0012\u00060\u001ej\u0002`&\u0012\u0006\u0012\u0004\u0018\u00010\u001e0%j\u0002`'\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020(0$j\u0002`)¢\u0006\u0002\u0010wJ\u001e\u0010x\u001a\u00020(2\u0006\u0010C\u001a\u00020D2\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006J+\u0010y\u001a\u00020(2\u0006\u0010C\u001a\u00020D2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00062\b\u0010u\u001a\u0004\u0018\u000107¢\u0006\u0002\u0010zJ\u0006\u0010{\u001a\u00020(J&\u0010|\u001a\u00020(2\u0014\u0010}\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e\u0018\u00010%2\b\u0010.\u001a\u0004\u0018\u00010\rJ\u0016\u0010~\u001a\u00020(2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006J\n\u0010\u007f\u001a\u00030\u0080\u0001HÖ\u0001J7\u0010\u0081\u0001\u001a\u00020(2\u0006\u0010C\u001a\u00020D2\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0016\u0010v\u001a\u0012\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020(0[j\u0002`\\J[\u0010\u0082\u0001\u001a\u00020(2\u0006\u0010C\u001a\u00020D2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00062\b\u0010u\u001a\u0004\u0018\u0001072,\u0010v\u001a(\u0012\u001a\u0012\u0018\u0012\b\u0012\u00060\u001ej\u0002`&\u0012\u0006\u0012\u0004\u0018\u00010\u001e0%j\u0002`'\u0012\u0004\u0012\u00020(0[j\u0002`g¢\u0006\u0003\u0010\u0083\u0001J\n\u0010\u0084\u0001\u001a\u00020\u001eHÖ\u0001R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\t\"\u0004\b\u0012\u0010\u000bR\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\t\"\u0004\b\u0016\u0010\u000bR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"RJ\u0010#\u001a2\u0012\u001a\u0012\u0018\u0012\b\u0012\u00060\u001ej\u0002`&\u0012\u0006\u0012\u0004\u0018\u00010\u001e0%j\u0002`'\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020(\u0018\u00010$j\u0004\u0018\u0001`)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u0010.\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001c\u00103\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010 \"\u0004\b5\u0010\"R\u001e\u00106\u001a\u0004\u0018\u000107X\u0086\u000e¢\u0006\u0010\n\u0002\u0010<\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001a\u0010=\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010\u0004R\u001e\u0010A\u001a\u0004\u0018\u000107X\u0086\u000e¢\u0006\u0010\n\u0002\u0010<\u001a\u0004\bA\u00109\"\u0004\bB\u0010;R\u001c\u0010C\u001a\u0004\u0018\u00010DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bI\u0010?R\u001c\u0010J\u001a\u0004\u0018\u00010KX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u001a\u0010P\u001a\u00020QX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u0011\u0010V\u001a\u00020W8F¢\u0006\u0006\u001a\u0004\bX\u0010YR.\u0010Z\u001a\u0016\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020(\u0018\u00010[j\u0004\u0018\u0001`\\X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R(\u0010a\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e\u0018\u00010%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eRD\u0010f\u001a,\u0012\u001a\u0012\u0018\u0012\b\u0012\u00060\u001ej\u0002`&\u0012\u0006\u0012\u0004\u0018\u00010\u001e0%j\u0002`'\u0012\u0004\u0012\u00020(\u0018\u00010[j\u0004\u0018\u0001`gX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010^\"\u0004\bi\u0010`¨\u0006\u0085\u0001"}, d2 = {"Lcom/fidesmo/sec/delivery/DeliveryState;", "", "request", "Lcom/fidesmo/sec/delivery/models/ServiceDeliveryRequired;", "(Lcom/fidesmo/sec/delivery/models/ServiceDeliveryRequired;)V", "actions", "", "Lcom/fidesmo/sec/delivery/models/UiAction;", "getActions", "()Ljava/util/List;", "setActions", "(Ljava/util/List;)V", "answers", "", "getAnswers", "setAnswers", "commands", "getCommands", "setCommands", "dataRequirements", "Lcom/fidesmo/sec/delivery/models/DataRequirement;", "getDataRequirements", "setDataRequirements", "deliveryResult", "Lcom/fidesmo/sec/delivery/models/ServiceStatus;", "getDeliveryResult", "()Lcom/fidesmo/sec/delivery/models/ServiceStatus;", "setDeliveryResult", "(Lcom/fidesmo/sec/delivery/models/ServiceStatus;)V", "details", "", "getDetails", "()Ljava/lang/String;", "setDetails", "(Ljava/lang/String;)V", "encryptedUserResponseHandler", "Lkotlin/Function2;", "", "Lcom/fidesmo/sec/delivery/models/DataRequirementId;", "Lcom/fidesmo/sec/delivery/models/UserDataResponse;", "", "Lcom/fidesmo/sec/delivery/models/EncryptedUserResponseHandler;", "getEncryptedUserResponseHandler", "()Lkotlin/jvm/functions/Function2;", "setEncryptedUserResponseHandler", "(Lkotlin/jvm/functions/Function2;)V", "ephKey", "getEphKey", "()[B", "setEphKey", "([B)V", "errorMessage", "getErrorMessage", "setErrorMessage", "fatal", "", "getFatal", "()Ljava/lang/Boolean;", "setFatal", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "initialRequest", "getInitialRequest", "()Lcom/fidesmo/sec/delivery/models/ServiceDeliveryRequired;", "setInitialRequest", "isEncrypted", "setEncrypted", "operation", "Lcom/fidesmo/sec/delivery/Operation;", "getOperation", "()Lcom/fidesmo/sec/delivery/Operation;", "setOperation", "(Lcom/fidesmo/sec/delivery/Operation;)V", "getRequest", "session", "Lcom/fidesmo/sec/delivery/Session;", "getSession", "()Lcom/fidesmo/sec/delivery/Session;", "setSession", "(Lcom/fidesmo/sec/delivery/Session;)V", "step", "Lcom/fidesmo/sec/delivery/DeliveryStep;", "getStep", "()Lcom/fidesmo/sec/delivery/DeliveryStep;", "setStep", "(Lcom/fidesmo/sec/delivery/DeliveryStep;)V", "update", "Lcom/fidesmo/sec/delivery/models/DeliveryUpdate;", "getUpdate", "()Lcom/fidesmo/sec/delivery/models/DeliveryUpdate;", "userActionHandler", "Lkotlin/Function1;", "Lcom/fidesmo/sec/delivery/models/UserActionHandler;", "getUserActionHandler", "()Lkotlin/jvm/functions/Function1;", "setUserActionHandler", "(Lkotlin/jvm/functions/Function1;)V", "userResponse", "getUserResponse", "()Ljava/util/Map;", "setUserResponse", "(Ljava/util/Map;)V", "userResponseHandler", "Lcom/fidesmo/sec/delivery/models/UserResponseHandler;", "getUserResponseHandler", "setUserResponseHandler", "component1", "copy", "equals", "other", "goToFetchNextOperation", "goToFetchRemoteCommands", "goToFinished", "result", "goToReportError", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "goToRequesEncryptedtUserData", "encrypted", "handler", "(Lcom/fidesmo/sec/delivery/Operation;Ljava/util/List;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function2;)V", "goToRequestUserAction", "goToRequestUserData", "(Lcom/fidesmo/sec/delivery/Operation;Ljava/util/List;Ljava/lang/Boolean;)V", "goToSendUserAction", "goToSendUserData", "response", "goToTransceiving", "hashCode", "", "newGoToRequestUserAction", "newGoToRequestUserData", "(Lcom/fidesmo/sec/delivery/Operation;Ljava/util/List;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;)V", "toString", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DeliveryState {
    private List<UiAction> actions;
    private List<byte[]> answers;
    private List<byte[]> commands;
    private List<? extends DataRequirement> dataRequirements;
    private ServiceStatus deliveryResult;
    private String details;
    private Function2<? super Map<String, String>, ? super byte[], Unit> encryptedUserResponseHandler;
    private byte[] ephKey;
    private String errorMessage;
    private Boolean fatal;
    private ServiceDeliveryRequired initialRequest;
    private Boolean isEncrypted;
    private Operation operation;
    private final ServiceDeliveryRequired request;
    private Session session;
    private DeliveryStep step;
    private Function1<? super Boolean, Unit> userActionHandler;
    private Map<String, String> userResponse;
    private Function1<? super Map<String, String>, Unit> userResponseHandler;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DeliveryStep.values().length];
            try {
                iArr[DeliveryStep.readyToStart.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DeliveryStep.fetchNextOperation.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DeliveryStep.sendUserData.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DeliveryStep.reportError.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DeliveryStep.fetchRemoteCommands.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DeliveryStep.transceiving.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DeliveryStep.requestUserData.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[DeliveryStep.requestUserAction.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[DeliveryStep.newRequestUserData.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[DeliveryStep.requestEncryptedUserData.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[DeliveryStep.newRequestUserAction.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[DeliveryStep.finished.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[DeliveryStep.sendUserAction.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DeliveryState(ServiceDeliveryRequired serviceDeliveryRequired) {
        serviceDeliveryRequired.getClass();
        this.request = serviceDeliveryRequired;
        this.step = DeliveryStep.readyToStart;
        this.initialRequest = serviceDeliveryRequired;
    }

    public static /* synthetic */ DeliveryState copy$default(DeliveryState deliveryState, ServiceDeliveryRequired serviceDeliveryRequired, int i, Object obj) {
        if ((i & 1) != 0) {
            serviceDeliveryRequired = deliveryState.request;
        }
        return deliveryState.copy(serviceDeliveryRequired);
    }

    /* renamed from: component1, reason: from getter */
    public final ServiceDeliveryRequired getRequest() {
        return this.request;
    }

    public final DeliveryState copy(ServiceDeliveryRequired request) {
        request.getClass();
        return new DeliveryState(request);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DeliveryState) && Intrinsics.areEqual(this.request, ((DeliveryState) other).request);
    }

    public final List<UiAction> getActions() {
        return this.actions;
    }

    public final List<byte[]> getAnswers() {
        return this.answers;
    }

    public final List<byte[]> getCommands() {
        return this.commands;
    }

    public final List<DataRequirement> getDataRequirements() {
        return this.dataRequirements;
    }

    public final ServiceStatus getDeliveryResult() {
        return this.deliveryResult;
    }

    public final String getDetails() {
        return this.details;
    }

    public final Function2<Map<String, String>, byte[], Unit> getEncryptedUserResponseHandler() {
        return this.encryptedUserResponseHandler;
    }

    public final byte[] getEphKey() {
        return this.ephKey;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final Boolean getFatal() {
        return this.fatal;
    }

    public final ServiceDeliveryRequired getInitialRequest() {
        return this.initialRequest;
    }

    public final Operation getOperation() {
        return this.operation;
    }

    public final ServiceDeliveryRequired getRequest() {
        return this.request;
    }

    public final Session getSession() {
        return this.session;
    }

    public final DeliveryStep getStep() {
        return this.step;
    }

    public final DeliveryUpdate getUpdate() {
        switch (WhenMappings.$EnumSwitchMapping$0[this.step.ordinal()]) {
            case 1:
                return new DeliveryUpdate.NotStarted();
            case 2:
            case 3:
            case 4:
                Session session = this.session;
                return new DeliveryUpdate.OperationInProgress(session != null ? session.getUuid() : null, null, DeliveryUpdate.DataFlow.talkingToServer, null);
            case 5:
                Session session2 = this.session;
                UUID uuid = session2 != null ? session2.getUuid() : null;
                Operation operation2 = this.operation;
                return new DeliveryUpdate.OperationInProgress(uuid, operation2 != null ? operation2.getProgress() : null, DeliveryUpdate.DataFlow.apdusToServer, this.answers);
            case 6:
                Session session3 = this.session;
                UUID uuid2 = session3 != null ? session3.getUuid() : null;
                Operation operation3 = this.operation;
                return new DeliveryUpdate.OperationInProgress(uuid2, operation3 != null ? operation3.getProgress() : null, DeliveryUpdate.DataFlow.apdusToDevice, this.commands);
            case 7:
                List list = this.dataRequirements;
                if (list == null) {
                    list = EmptyList.INSTANCE;
                }
                Function1 function1 = this.userResponseHandler;
                if (function1 == null) {
                    function1 = new Function1<Map<String, ? extends String>, Unit>() { // from class: com.fidesmo.sec.delivery.DeliveryState$update$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((Map<String, String>) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Map<String, String> map) {
                            map.getClass();
                        }
                    };
                }
                return new DeliveryUpdate.NeedsUserInteractionUsingHandler(list, function1);
            case 8:
                List list2 = this.actions;
                if (list2 == null) {
                    list2 = EmptyList.INSTANCE;
                }
                Function1 function12 = this.userActionHandler;
                if (function12 == null) {
                    function12 = new Function1<Boolean, Unit>() { // from class: com.fidesmo.sec.delivery.DeliveryState$update$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke(((Boolean) obj).booleanValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(boolean z) {
                        }
                    };
                }
                return new DeliveryUpdate.NeedsUserActionUsingHandler(list2, function12);
            case 9:
                List list3 = this.dataRequirements;
                if (list3 == null) {
                    list3 = EmptyList.INSTANCE;
                }
                Function1 function13 = this.userResponseHandler;
                if (function13 == null) {
                    function13 = new Function1<Map<String, ? extends String>, Unit>() { // from class: com.fidesmo.sec.delivery.DeliveryState$update$3
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((Map<String, String>) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Map<String, String> map) {
                            map.getClass();
                        }
                    };
                }
                return new DeliveryUpdate.NeedsUserInteractionUsingHandler(list3, function13);
            case 10:
                List list4 = this.dataRequirements;
                if (list4 == null) {
                    list4 = EmptyList.INSTANCE;
                }
                Function2 function2 = this.encryptedUserResponseHandler;
                if (function2 == null) {
                    function2 = new Function2<Map<String, ? extends String>, byte[], Unit>() { // from class: com.fidesmo.sec.delivery.DeliveryState$update$4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Map<String, String>) obj, (byte[]) obj2);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Map<String, String> map, byte[] bArr) {
                            map.getClass();
                            bArr.getClass();
                        }
                    };
                }
                return new DeliveryUpdate.NeedsEncryptedUserInteraction(list4, function2);
            case 11:
                List list5 = this.actions;
                if (list5 == null) {
                    list5 = EmptyList.INSTANCE;
                }
                Function1 function14 = this.userActionHandler;
                if (function14 == null) {
                    function14 = new Function1<Boolean, Unit>() { // from class: com.fidesmo.sec.delivery.DeliveryState$update$5
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke(((Boolean) obj).booleanValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(boolean z) {
                        }
                    };
                }
                return new DeliveryUpdate.NeedsUserActionUsingHandler(list5, function14);
            case 12:
                ServiceStatus serviceStatus = this.deliveryResult;
                if (serviceStatus == null) {
                    serviceStatus = new ServiceStatus(null, null, null, null, null, 31, null);
                }
                return new DeliveryUpdate.Finished(serviceStatus);
            case 13:
                return new DeliveryUpdate.NotStarted();
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
    }

    public final Function1<Boolean, Unit> getUserActionHandler() {
        return this.userActionHandler;
    }

    public final Map<String, String> getUserResponse() {
        return this.userResponse;
    }

    public final Function1<Map<String, String>, Unit> getUserResponseHandler() {
        return this.userResponseHandler;
    }

    public final void goToFetchNextOperation(Session session) {
        this.step = DeliveryStep.fetchNextOperation;
        this.operation = null;
        this.session = session;
    }

    public final void goToFetchRemoteCommands(Operation operation2, List<byte[]> answers) {
        operation2.getClass();
        this.step = DeliveryStep.fetchRemoteCommands;
        this.operation = operation2;
        this.answers = answers;
    }

    public final void goToFinished(ServiceStatus result) {
        this.step = DeliveryStep.finished;
        this.deliveryResult = result;
    }

    public final void goToReportError(String errorMessage, Boolean fatal, String details) {
        this.errorMessage = errorMessage;
        this.fatal = fatal;
        this.details = details;
        this.step = DeliveryStep.reportError;
    }

    public final void goToRequesEncryptedtUserData(Operation operation2, List<? extends DataRequirement> dataRequirements, Boolean encrypted, Function2<? super Map<String, String>, ? super byte[], Unit> handler) {
        operation2.getClass();
        dataRequirements.getClass();
        handler.getClass();
        this.step = DeliveryStep.requestEncryptedUserData;
        this.operation = operation2;
        this.dataRequirements = dataRequirements;
        this.isEncrypted = encrypted;
        this.encryptedUserResponseHandler = handler;
    }

    public final void goToRequestUserAction(Operation operation2, List<UiAction> actions) {
        operation2.getClass();
        this.step = DeliveryStep.requestUserAction;
        this.operation = operation2;
        this.actions = actions;
    }

    public final void goToRequestUserData(Operation operation2, List<? extends DataRequirement> dataRequirements, Boolean encrypted) {
        operation2.getClass();
        dataRequirements.getClass();
        this.step = DeliveryStep.requestUserData;
        this.operation = operation2;
        this.dataRequirements = dataRequirements;
        this.isEncrypted = encrypted;
    }

    public final void goToSendUserAction() {
        this.step = DeliveryStep.sendUserAction;
    }

    public final void goToSendUserData(Map<String, String> response, byte[] ephKey) {
        this.step = DeliveryStep.sendUserData;
        this.userResponse = response;
        this.ephKey = ephKey;
    }

    public final void goToTransceiving(List<byte[]> commands) {
        this.step = DeliveryStep.transceiving;
        this.commands = commands;
    }

    public int hashCode() {
        return this.request.hashCode();
    }

    /* renamed from: isEncrypted, reason: from getter */
    public final Boolean getIsEncrypted() {
        return this.isEncrypted;
    }

    public final void newGoToRequestUserAction(Operation operation2, List<UiAction> actions, Function1<? super Boolean, Unit> handler) {
        operation2.getClass();
        handler.getClass();
        this.step = DeliveryStep.newRequestUserAction;
        this.operation = operation2;
        this.actions = actions;
        this.userActionHandler = handler;
    }

    public final void newGoToRequestUserData(Operation operation2, List<? extends DataRequirement> dataRequirements, Boolean encrypted, Function1<? super Map<String, String>, Unit> handler) {
        operation2.getClass();
        dataRequirements.getClass();
        handler.getClass();
        this.step = DeliveryStep.newRequestUserData;
        this.operation = operation2;
        this.dataRequirements = dataRequirements;
        this.isEncrypted = encrypted;
        this.userResponseHandler = handler;
    }

    public final void setActions(List<UiAction> list) {
        this.actions = list;
    }

    public final void setAnswers(List<byte[]> list) {
        this.answers = list;
    }

    public final void setCommands(List<byte[]> list) {
        this.commands = list;
    }

    public final void setDataRequirements(List<? extends DataRequirement> list) {
        this.dataRequirements = list;
    }

    public final void setDeliveryResult(ServiceStatus serviceStatus) {
        this.deliveryResult = serviceStatus;
    }

    public final void setDetails(String str) {
        this.details = str;
    }

    public final void setEncrypted(Boolean bool) {
        this.isEncrypted = bool;
    }

    public final void setEncryptedUserResponseHandler(Function2<? super Map<String, String>, ? super byte[], Unit> function2) {
        this.encryptedUserResponseHandler = function2;
    }

    public final void setEphKey(byte[] bArr) {
        this.ephKey = bArr;
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setFatal(Boolean bool) {
        this.fatal = bool;
    }

    public final void setInitialRequest(ServiceDeliveryRequired serviceDeliveryRequired) {
        serviceDeliveryRequired.getClass();
        this.initialRequest = serviceDeliveryRequired;
    }

    public final void setOperation(Operation operation2) {
        this.operation = operation2;
    }

    public final void setSession(Session session) {
        this.session = session;
    }

    public final void setStep(DeliveryStep deliveryStep) {
        deliveryStep.getClass();
        this.step = deliveryStep;
    }

    public final void setUserActionHandler(Function1<? super Boolean, Unit> function1) {
        this.userActionHandler = function1;
    }

    public final void setUserResponse(Map<String, String> map) {
        this.userResponse = map;
    }

    public final void setUserResponseHandler(Function1<? super Map<String, String>, Unit> function1) {
        this.userResponseHandler = function1;
    }

    public String toString() {
        return "DeliveryState(request=" + this.request + ')';
    }
}
