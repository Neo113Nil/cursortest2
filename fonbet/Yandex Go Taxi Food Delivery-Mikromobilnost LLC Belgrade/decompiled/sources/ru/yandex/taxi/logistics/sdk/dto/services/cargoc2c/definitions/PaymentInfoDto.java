package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.tse0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J=\u0010\u0015\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PaymentInfoDto;", "", "type", "", "id", "coupon", "complements", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PaymentInfoComplementDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getType", "()Ljava/lang/String;", "getId", "getCoupon", "getComplements", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PaymentInfoDto {
    private final List<PaymentInfoComplementDto> complements;
    private final String coupon;
    private final String id;
    private final String type;

    public PaymentInfoDto(@Json(name = "type") String str, @Json(name = "id") String str2, @Json(name = "coupon") String str3, @Json(name = "complements") List<PaymentInfoComplementDto> list) {
        this.type = str;
        this.id = str2;
        this.coupon = str3;
        this.complements = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaymentInfoDto copy$default(PaymentInfoDto paymentInfoDto, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentInfoDto.type;
        }
        if ((i & 2) != 0) {
            str2 = paymentInfoDto.id;
        }
        if ((i & 4) != 0) {
            str3 = paymentInfoDto.coupon;
        }
        if ((i & 8) != 0) {
            list = paymentInfoDto.complements;
        }
        return paymentInfoDto.copy(str, str2, str3, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCoupon() {
        return this.coupon;
    }

    public final List<PaymentInfoComplementDto> component4() {
        return this.complements;
    }

    public final PaymentInfoDto copy(@Json(name = "type") String type, @Json(name = "id") String id, @Json(name = "coupon") String coupon, @Json(name = "complements") List<PaymentInfoComplementDto> complements) {
        return new PaymentInfoDto(type, id, coupon, complements);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentInfoDto)) {
            return false;
        }
        PaymentInfoDto paymentInfoDto = (PaymentInfoDto) other;
        return jl40.l(this.type, paymentInfoDto.type) && jl40.l(this.id, paymentInfoDto.id) && jl40.l(this.coupon, paymentInfoDto.coupon) && jl40.l(this.complements, paymentInfoDto.complements);
    }

    public final List<PaymentInfoComplementDto> getComplements() {
        return this.complements;
    }

    public final String getCoupon() {
        return this.coupon;
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
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.coupon;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<PaymentInfoComplementDto> list = this.complements;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.type;
        String str2 = this.id;
        return tse0.j(this.coupon, ", complements=", Extension.C_BRAKE, b64.v("PaymentInfoDto(type=", str, ", id=", str2, ", coupon="), this.complements);
    }
}
