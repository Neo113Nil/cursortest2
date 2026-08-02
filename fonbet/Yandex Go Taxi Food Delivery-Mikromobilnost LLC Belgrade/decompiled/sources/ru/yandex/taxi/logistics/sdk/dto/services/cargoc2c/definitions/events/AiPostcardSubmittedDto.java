package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.events;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/AiPostcardSubmittedDto;", "", "requestId", "", "deliveryId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getRequestId", "()Ljava/lang/String;", "getDeliveryId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AiPostcardSubmittedDto {
    private final String deliveryId;
    private final String requestId;

    public AiPostcardSubmittedDto(@Json(name = "request_id") String str, @Json(name = "delivery_id") String str2) {
        this.requestId = str;
        this.deliveryId = str2;
    }

    public static /* synthetic */ AiPostcardSubmittedDto copy$default(AiPostcardSubmittedDto aiPostcardSubmittedDto, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aiPostcardSubmittedDto.requestId;
        }
        if ((i & 2) != 0) {
            str2 = aiPostcardSubmittedDto.deliveryId;
        }
        return aiPostcardSubmittedDto.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDeliveryId() {
        return this.deliveryId;
    }

    public final AiPostcardSubmittedDto copy(@Json(name = "request_id") String requestId, @Json(name = "delivery_id") String deliveryId) {
        return new AiPostcardSubmittedDto(requestId, deliveryId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiPostcardSubmittedDto)) {
            return false;
        }
        AiPostcardSubmittedDto aiPostcardSubmittedDto = (AiPostcardSubmittedDto) other;
        return jl40.l(this.requestId, aiPostcardSubmittedDto.requestId) && jl40.l(this.deliveryId, aiPostcardSubmittedDto.deliveryId);
    }

    public final String getDeliveryId() {
        return this.deliveryId;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public int hashCode() {
        return this.deliveryId.hashCode() + (this.requestId.hashCode() * 31);
    }

    public String toString() {
        return unr0.p("AiPostcardSubmittedDto(requestId=", this.requestId, ", deliveryId=", this.deliveryId, Extension.C_BRAKE);
    }
}
