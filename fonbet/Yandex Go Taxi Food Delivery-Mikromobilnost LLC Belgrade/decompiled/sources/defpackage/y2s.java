package defpackage;

import com.yandex.delivery.mapper.model.PinStrategy$PinType;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.CryptoPro.reprov.x509.PolicyMappingsExtension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.PerformerPinLoadableDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.PerformerPositionResponseDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.formvalidation.FormValidationResponseDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formasynctask.AsyncTaskCommunicationDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formasynctask.AsyncTaskStatusDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formasynctask.V2FormAsyncTaskStatusResponseDto;

/* loaded from: classes9.dex */
public final /* synthetic */ class y2s implements kwj0, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y2s(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.kwj0
    public final Object a(Object obj) {
        Object d3sVar;
        rm91 i0c0Var;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((i3s) obj2).getClass();
                AsyncTaskStatusDto status = ((V2FormAsyncTaskStatusResponseDto) obj).getStatus();
                if (status instanceof AsyncTaskStatusDto.AsyncTaskStatus_ProcessingDto) {
                    AsyncTaskStatusDto.AsyncTaskStatus_ProcessingDto asyncTaskStatus_ProcessingDto = (AsyncTaskStatusDto.AsyncTaskStatus_ProcessingDto) status;
                    Object formStateValue = asyncTaskStatus_ProcessingDto.getB().getFormStateValue();
                    AsyncTaskCommunicationDto communication = asyncTaskStatus_ProcessingDto.getB().getCommunication();
                    d3sVar = new e3s(formStateValue, communication != null ? i3s.a(communication) : null);
                } else {
                    if (!(status instanceof AsyncTaskStatusDto.AsyncTaskStatus_CompletedDto)) {
                        if (status instanceof AsyncTaskStatusDto.Unknown_AsyncTaskStatusDto) {
                            return g3s.a;
                        }
                        w511.b();
                        return null;
                    }
                    AsyncTaskStatusDto.AsyncTaskStatus_CompletedDto asyncTaskStatus_CompletedDto = (AsyncTaskStatusDto.AsyncTaskStatus_CompletedDto) status;
                    Object formStateValue2 = asyncTaskStatus_CompletedDto.getB().getFormStateValue();
                    AsyncTaskCommunicationDto communication2 = asyncTaskStatus_CompletedDto.getB().getCommunication();
                    d3sVar = new d3s(formStateValue2, communication2 != null ? i3s.a(communication2) : null);
                }
                return d3sVar;
            case 1:
                PerformerPositionResponseDto performerPositionResponseDto = (PerformerPositionResponseDto) obj;
                m0c0 m0c0Var = ((jxa0) obj2).a;
                PerformerPositionResponseDto.PinDto pin = performerPositionResponseDto.getPin();
                m0c0Var.getClass();
                if (pin == null || (pin instanceof PerformerPositionResponseDto.PinDto.Unknown_PinDto)) {
                    i0c0Var = new i0c0(PinStrategy$PinType.AUTO);
                } else if (pin instanceof PerformerPositionResponseDto.PinDto.Pin_DefaultDto) {
                    int i2 = l0c0.a[((PerformerPositionResponseDto.PinDto.Pin_DefaultDto) pin).getB().getPinType().ordinal()];
                    i0c0Var = new i0c0(i2 != 1 ? i2 != 2 ? PinStrategy$PinType.AUTO : PinStrategy$PinType.PEDESTRIAN : PinStrategy$PinType.AUTO);
                } else {
                    if (!(pin instanceof PerformerPositionResponseDto.PinDto.Pin_LoadableDto)) {
                        w511.b();
                        return null;
                    }
                    PerformerPositionResponseDto.PinDto.Pin_LoadableDto pin_LoadableDto = (PerformerPositionResponseDto.PinDto.Pin_LoadableDto) pin;
                    String imageTag = pin_LoadableDto.getB().getImageTag();
                    boolean rotatable = pin_LoadableDto.getB().getRotatable();
                    PerformerPinLoadableDto.AnchorDto anchor = pin_LoadableDto.getB().getAnchor();
                    i0c0Var = new j0c0(imageTag, rotatable, new k0c0(anchor.getX(), anchor.getY()));
                }
                return new ixa0(i0c0Var, performerPositionResponseDto.getBubbleText(), performerPositionResponseDto.getPosition().getLat(), performerPositionResponseDto.getPosition().getLon(), performerPositionResponseDto.getPosition().getSpeed(), performerPositionResponseDto.getPosition().getDirection(), performerPositionResponseDto.getPosition().getTimestamp());
            default:
                ((yz21) obj2).getClass();
                FormValidationResponseDto.ResultDto result = ((FormValidationResponseDto) obj).getResult();
                if (result instanceof FormValidationResponseDto.ResultDto.Result_SuccessDto) {
                    return new d031(((FormValidationResponseDto.ResultDto.Result_SuccessDto) result).getB().getValidationKey());
                }
                if (result instanceof FormValidationResponseDto.ResultDto.Result_FailedDto) {
                    return new c031(((FormValidationResponseDto.ResultDto.Result_FailedDto) result).getB().getFailureDescription());
                }
                if (result instanceof FormValidationResponseDto.ResultDto.Result_ChallengeRequiredDto) {
                    return new b031(((FormValidationResponseDto.ResultDto.Result_ChallengeRequiredDto) result).getB().getChallengeUrl());
                }
                if (result instanceof FormValidationResponseDto.ResultDto.Unknown_ResultDto) {
                    return new e031(0);
                }
                w511.b();
                return null;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof kwj0) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof kwj0) && (obj instanceof jms)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof kwj0) && (obj instanceof jms)) {
                    break;
                }
                break;
        }
        return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        switch (this.a) {
            case 0:
                return new FunctionReferenceImpl(1, (i3s) this.b, i3s.class, PolicyMappingsExtension.MAP, "map(Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formasynctask/V2FormAsyncTaskStatusResponseDto;)Lru/yandex/logistics/cargo_form/async/impl/model/FormAsyncTaskStatusInternalModel;", 0);
            case 1:
                return new FunctionReferenceImpl(1, (jxa0) this.b, jxa0.class, PolicyMappingsExtension.MAP, "map(Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PerformerPositionResponseDto;)Lru/yandex/taxi/logistics/sdk/performer_position/api/PerformerPosition;", 0);
            default:
                return new FunctionReferenceImpl(1, (yz21) this.b, yz21.class, PolicyMappingsExtension.MAP, "map(Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/formvalidation/FormValidationResponseDto;)Lru/yandex/logistics/sdk/order_validation/api/ValidationResult;", 0);
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
