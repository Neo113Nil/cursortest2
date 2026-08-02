package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1voiceforwarding;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ForwardingIdDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1voiceforwarding/VoiceforwardingRequestDto;", "", "deliveryId", "", "forwardingId", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ForwardingIdDto;", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ForwardingIdDto;)V", "getDeliveryId", "()Ljava/lang/String;", "getForwardingId", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ForwardingIdDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class VoiceforwardingRequestDto {
    private final String deliveryId;
    private final ForwardingIdDto forwardingId;

    public VoiceforwardingRequestDto(@Json(name = "delivery_id") String str, @Json(name = "forwarding_id") ForwardingIdDto forwardingIdDto) {
        this.deliveryId = str;
        this.forwardingId = forwardingIdDto;
    }

    public static /* synthetic */ VoiceforwardingRequestDto copy$default(VoiceforwardingRequestDto voiceforwardingRequestDto, String str, ForwardingIdDto forwardingIdDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = voiceforwardingRequestDto.deliveryId;
        }
        if ((i & 2) != 0) {
            forwardingIdDto = voiceforwardingRequestDto.forwardingId;
        }
        return voiceforwardingRequestDto.copy(str, forwardingIdDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDeliveryId() {
        return this.deliveryId;
    }

    /* renamed from: component2, reason: from getter */
    public final ForwardingIdDto getForwardingId() {
        return this.forwardingId;
    }

    public final VoiceforwardingRequestDto copy(@Json(name = "delivery_id") String deliveryId, @Json(name = "forwarding_id") ForwardingIdDto forwardingId) {
        return new VoiceforwardingRequestDto(deliveryId, forwardingId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoiceforwardingRequestDto)) {
            return false;
        }
        VoiceforwardingRequestDto voiceforwardingRequestDto = (VoiceforwardingRequestDto) other;
        return jl40.l(this.deliveryId, voiceforwardingRequestDto.deliveryId) && this.forwardingId == voiceforwardingRequestDto.forwardingId;
    }

    public final String getDeliveryId() {
        return this.deliveryId;
    }

    public final ForwardingIdDto getForwardingId() {
        return this.forwardingId;
    }

    public int hashCode() {
        return this.forwardingId.hashCode() + (this.deliveryId.hashCode() * 31);
    }

    public String toString() {
        return "VoiceforwardingRequestDto(deliveryId=" + this.deliveryId + ", forwardingId=" + this.forwardingId + Extension.C_BRAKE;
    }
}
