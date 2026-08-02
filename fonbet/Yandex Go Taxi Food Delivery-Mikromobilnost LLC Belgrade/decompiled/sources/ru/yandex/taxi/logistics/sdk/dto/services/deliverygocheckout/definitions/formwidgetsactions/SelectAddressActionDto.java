package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.AddressFlowDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.ResultPositionDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/SelectAddressActionDto;", "", "position", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ResultPositionDto;", "flow", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressFlowDto;", "actionOnAddressSelected", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ResultPositionDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressFlowDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;)V", "getPosition", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ResultPositionDto;", "getFlow", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressFlowDto;", "getActionOnAddressSelected", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SelectAddressActionDto {
    private final TapActionDto actionOnAddressSelected;
    private final AddressFlowDto flow;
    private final ResultPositionDto position;

    public SelectAddressActionDto(@Json(name = "position") ResultPositionDto resultPositionDto, @Json(name = "flow") AddressFlowDto addressFlowDto, @Json(name = "action_on_address_selected") TapActionDto tapActionDto) {
        this.position = resultPositionDto;
        this.flow = addressFlowDto;
        this.actionOnAddressSelected = tapActionDto;
    }

    public static /* synthetic */ SelectAddressActionDto copy$default(SelectAddressActionDto selectAddressActionDto, ResultPositionDto resultPositionDto, AddressFlowDto addressFlowDto, TapActionDto tapActionDto, int i, Object obj) {
        if ((i & 1) != 0) {
            resultPositionDto = selectAddressActionDto.position;
        }
        if ((i & 2) != 0) {
            addressFlowDto = selectAddressActionDto.flow;
        }
        if ((i & 4) != 0) {
            tapActionDto = selectAddressActionDto.actionOnAddressSelected;
        }
        return selectAddressActionDto.copy(resultPositionDto, addressFlowDto, tapActionDto);
    }

    /* renamed from: component1, reason: from getter */
    public final ResultPositionDto getPosition() {
        return this.position;
    }

    /* renamed from: component2, reason: from getter */
    public final AddressFlowDto getFlow() {
        return this.flow;
    }

    /* renamed from: component3, reason: from getter */
    public final TapActionDto getActionOnAddressSelected() {
        return this.actionOnAddressSelected;
    }

    public final SelectAddressActionDto copy(@Json(name = "position") ResultPositionDto position, @Json(name = "flow") AddressFlowDto flow, @Json(name = "action_on_address_selected") TapActionDto actionOnAddressSelected) {
        return new SelectAddressActionDto(position, flow, actionOnAddressSelected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectAddressActionDto)) {
            return false;
        }
        SelectAddressActionDto selectAddressActionDto = (SelectAddressActionDto) other;
        return jl40.l(this.position, selectAddressActionDto.position) && jl40.l(this.flow, selectAddressActionDto.flow) && jl40.l(this.actionOnAddressSelected, selectAddressActionDto.actionOnAddressSelected);
    }

    public final TapActionDto getActionOnAddressSelected() {
        return this.actionOnAddressSelected;
    }

    public final AddressFlowDto getFlow() {
        return this.flow;
    }

    public final ResultPositionDto getPosition() {
        return this.position;
    }

    public int hashCode() {
        int hashCode = this.position.hashCode() * 31;
        AddressFlowDto addressFlowDto = this.flow;
        int hashCode2 = (hashCode + (addressFlowDto == null ? 0 : addressFlowDto.hashCode())) * 31;
        TapActionDto tapActionDto = this.actionOnAddressSelected;
        return hashCode2 + (tapActionDto != null ? tapActionDto.hashCode() : 0);
    }

    public String toString() {
        return "SelectAddressActionDto(position=" + this.position + ", flow=" + this.flow + ", actionOnAddressSelected=" + this.actionOnAddressSelected + Extension.C_BRAKE;
    }
}
