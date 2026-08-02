package ru.yandex.taxi.logistics.sdk.dto.libraries.deliverygooffers.definitions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/libraries/deliverygooffers/definitions/PaymentInfoComplementDto;", "", "type", "", "id", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PaymentInfoComplementDto {
    private final String id;
    private final String type;

    public PaymentInfoComplementDto(@Json(name = "type") String str, @Json(name = "id") String str2) {
        this.type = str;
        this.id = str2;
    }

    public static /* synthetic */ PaymentInfoComplementDto copy$default(PaymentInfoComplementDto paymentInfoComplementDto, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentInfoComplementDto.type;
        }
        if ((i & 2) != 0) {
            str2 = paymentInfoComplementDto.id;
        }
        return paymentInfoComplementDto.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final PaymentInfoComplementDto copy(@Json(name = "type") String type, @Json(name = "id") String id) {
        return new PaymentInfoComplementDto(type, id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentInfoComplementDto)) {
            return false;
        }
        PaymentInfoComplementDto paymentInfoComplementDto = (PaymentInfoComplementDto) other;
        return jl40.l(this.type, paymentInfoComplementDto.type) && jl40.l(this.id, paymentInfoComplementDto.id);
    }

    public final String getId() {
        return this.id;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.id;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return unr0.p("PaymentInfoComplementDto(type=", this.type, ", id=", this.id, Extension.C_BRAKE);
    }
}
