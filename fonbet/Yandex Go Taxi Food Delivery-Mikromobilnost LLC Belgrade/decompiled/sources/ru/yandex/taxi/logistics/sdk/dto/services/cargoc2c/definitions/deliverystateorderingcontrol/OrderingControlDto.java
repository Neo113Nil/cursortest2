package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateorderingcontrol;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/OrderingControlDto;", "", "detailForm", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/PostOrderDetailFormDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/PostOrderDetailFormDto;)V", "getDetailForm", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/PostOrderDetailFormDto;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class OrderingControlDto {
    private final PostOrderDetailFormDto detailForm;

    public OrderingControlDto(@Json(name = "detail_form") PostOrderDetailFormDto postOrderDetailFormDto) {
        this.detailForm = postOrderDetailFormDto;
    }

    public static /* synthetic */ OrderingControlDto copy$default(OrderingControlDto orderingControlDto, PostOrderDetailFormDto postOrderDetailFormDto, int i, Object obj) {
        if ((i & 1) != 0) {
            postOrderDetailFormDto = orderingControlDto.detailForm;
        }
        return orderingControlDto.copy(postOrderDetailFormDto);
    }

    /* renamed from: component1, reason: from getter */
    public final PostOrderDetailFormDto getDetailForm() {
        return this.detailForm;
    }

    public final OrderingControlDto copy(@Json(name = "detail_form") PostOrderDetailFormDto detailForm) {
        return new OrderingControlDto(detailForm);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OrderingControlDto) && jl40.l(this.detailForm, ((OrderingControlDto) other).detailForm);
    }

    public final PostOrderDetailFormDto getDetailForm() {
        return this.detailForm;
    }

    public int hashCode() {
        PostOrderDetailFormDto postOrderDetailFormDto = this.detailForm;
        if (postOrderDetailFormDto == null) {
            return 0;
        }
        return postOrderDetailFormDto.hashCode();
    }

    public String toString() {
        return "OrderingControlDto(detailForm=" + this.detailForm + Extension.C_BRAKE;
    }
}
