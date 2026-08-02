package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressCoordinateSourceDto;", "", "resultPosition", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ResultPositionDto;", "addressFlow", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressFlowDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ResultPositionDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressFlowDto;)V", "getResultPosition", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ResultPositionDto;", "getAddressFlow", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressFlowDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AddressCoordinateSourceDto {
    private final AddressFlowDto addressFlow;
    private final ResultPositionDto resultPosition;

    public AddressCoordinateSourceDto(@Json(name = "result_position") ResultPositionDto resultPositionDto, @Json(name = "address_flow") AddressFlowDto addressFlowDto) {
        this.resultPosition = resultPositionDto;
        this.addressFlow = addressFlowDto;
    }

    public static /* synthetic */ AddressCoordinateSourceDto copy$default(AddressCoordinateSourceDto addressCoordinateSourceDto, ResultPositionDto resultPositionDto, AddressFlowDto addressFlowDto, int i, Object obj) {
        if ((i & 1) != 0) {
            resultPositionDto = addressCoordinateSourceDto.resultPosition;
        }
        if ((i & 2) != 0) {
            addressFlowDto = addressCoordinateSourceDto.addressFlow;
        }
        return addressCoordinateSourceDto.copy(resultPositionDto, addressFlowDto);
    }

    /* renamed from: component1, reason: from getter */
    public final ResultPositionDto getResultPosition() {
        return this.resultPosition;
    }

    /* renamed from: component2, reason: from getter */
    public final AddressFlowDto getAddressFlow() {
        return this.addressFlow;
    }

    public final AddressCoordinateSourceDto copy(@Json(name = "result_position") ResultPositionDto resultPosition, @Json(name = "address_flow") AddressFlowDto addressFlow) {
        return new AddressCoordinateSourceDto(resultPosition, addressFlow);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressCoordinateSourceDto)) {
            return false;
        }
        AddressCoordinateSourceDto addressCoordinateSourceDto = (AddressCoordinateSourceDto) other;
        return jl40.l(this.resultPosition, addressCoordinateSourceDto.resultPosition) && jl40.l(this.addressFlow, addressCoordinateSourceDto.addressFlow);
    }

    public final AddressFlowDto getAddressFlow() {
        return this.addressFlow;
    }

    public final ResultPositionDto getResultPosition() {
        return this.resultPosition;
    }

    public int hashCode() {
        int hashCode = this.resultPosition.hashCode() * 31;
        AddressFlowDto addressFlowDto = this.addressFlow;
        return hashCode + (addressFlowDto == null ? 0 : addressFlowDto.hashCode());
    }

    public String toString() {
        return "AddressCoordinateSourceDto(resultPosition=" + this.resultPosition + ", addressFlow=" + this.addressFlow + Extension.C_BRAKE;
    }
}
