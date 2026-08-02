package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.events;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/AiPostcardFailedDto;", "", "requestId", "", "deliveryId", "generationId", "failureReason", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRequestId", "()Ljava/lang/String;", "getDeliveryId", "getGenerationId", "getFailureReason", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AiPostcardFailedDto {
    private final String deliveryId;
    private final String failureReason;
    private final String generationId;
    private final String requestId;

    public AiPostcardFailedDto(@Json(name = "request_id") String str, @Json(name = "delivery_id") String str2, @Json(name = "generation_id") String str3, @Json(name = "failure_reason") String str4) {
        this.requestId = str;
        this.deliveryId = str2;
        this.generationId = str3;
        this.failureReason = str4;
    }

    public static /* synthetic */ AiPostcardFailedDto copy$default(AiPostcardFailedDto aiPostcardFailedDto, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aiPostcardFailedDto.requestId;
        }
        if ((i & 2) != 0) {
            str2 = aiPostcardFailedDto.deliveryId;
        }
        if ((i & 4) != 0) {
            str3 = aiPostcardFailedDto.generationId;
        }
        if ((i & 8) != 0) {
            str4 = aiPostcardFailedDto.failureReason;
        }
        return aiPostcardFailedDto.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDeliveryId() {
        return this.deliveryId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getGenerationId() {
        return this.generationId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getFailureReason() {
        return this.failureReason;
    }

    public final AiPostcardFailedDto copy(@Json(name = "request_id") String requestId, @Json(name = "delivery_id") String deliveryId, @Json(name = "generation_id") String generationId, @Json(name = "failure_reason") String failureReason) {
        return new AiPostcardFailedDto(requestId, deliveryId, generationId, failureReason);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiPostcardFailedDto)) {
            return false;
        }
        AiPostcardFailedDto aiPostcardFailedDto = (AiPostcardFailedDto) other;
        return jl40.l(this.requestId, aiPostcardFailedDto.requestId) && jl40.l(this.deliveryId, aiPostcardFailedDto.deliveryId) && jl40.l(this.generationId, aiPostcardFailedDto.generationId) && jl40.l(this.failureReason, aiPostcardFailedDto.failureReason);
    }

    public final String getDeliveryId() {
        return this.deliveryId;
    }

    public final String getFailureReason() {
        return this.failureReason;
    }

    public final String getGenerationId() {
        return this.generationId;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public int hashCode() {
        String str = this.requestId;
        return this.failureReason.hashCode() + unr0.b(unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.deliveryId), 31, this.generationId);
    }

    public String toString() {
        String str = this.requestId;
        String str2 = this.deliveryId;
        return g8e.r(b64.v("AiPostcardFailedDto(requestId=", str, ", deliveryId=", str2, ", generationId="), this.generationId, ", failureReason=", this.failureReason, Extension.C_BRAKE);
    }
}
