package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard;

import com.adjust.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.x4e;
import defpackage.xvz;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0001\u0010\u0007\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\bHÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0003\u0010\u0007\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0007\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/DiscountShowcaseDto;", "", "coupons", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/DiscountCouponDto;", "metricaLabel", "", Constants.REFERRER_API_META, "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/MetadataDto;", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Object;)V", "getCoupons", "()Ljava/util/List;", "getMetricaLabel", "()Ljava/lang/String;", "getMeta", "()Ljava/lang/Object;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DiscountShowcaseDto {
    private final List<DiscountCouponDto> coupons;
    private final Object meta;
    private final String metricaLabel;

    public DiscountShowcaseDto(@Json(name = "coupons") List<DiscountCouponDto> list, @Json(name = "metrica_label") String str, @Json(name = "meta") Object obj) {
        this.coupons = list;
        this.metricaLabel = str;
        this.meta = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DiscountShowcaseDto copy$default(DiscountShowcaseDto discountShowcaseDto, List list, String str, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            list = discountShowcaseDto.coupons;
        }
        if ((i & 2) != 0) {
            str = discountShowcaseDto.metricaLabel;
        }
        if ((i & 4) != 0) {
            obj = discountShowcaseDto.meta;
        }
        return discountShowcaseDto.copy(list, str, obj);
    }

    public final List<DiscountCouponDto> component1() {
        return this.coupons;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    /* renamed from: component3, reason: from getter */
    public final Object getMeta() {
        return this.meta;
    }

    public final DiscountShowcaseDto copy(@Json(name = "coupons") List<DiscountCouponDto> coupons, @Json(name = "metrica_label") String metricaLabel, @Json(name = "meta") Object meta) {
        return new DiscountShowcaseDto(coupons, metricaLabel, meta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DiscountShowcaseDto)) {
            return false;
        }
        DiscountShowcaseDto discountShowcaseDto = (DiscountShowcaseDto) other;
        return jl40.l(this.coupons, discountShowcaseDto.coupons) && jl40.l(this.metricaLabel, discountShowcaseDto.metricaLabel) && jl40.l(this.meta, discountShowcaseDto.meta);
    }

    public final List<DiscountCouponDto> getCoupons() {
        return this.coupons;
    }

    public final Object getMeta() {
        return this.meta;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public int hashCode() {
        int hashCode = this.coupons.hashCode() * 31;
        String str = this.metricaLabel;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Object obj = this.meta;
        return hashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        List<DiscountCouponDto> list = this.coupons;
        String str = this.metricaLabel;
        return x4e.h(xvz.s("DiscountShowcaseDto(coupons=", list, ", metricaLabel=", str, ", meta="), this.meta, Extension.C_BRAKE);
    }
}
