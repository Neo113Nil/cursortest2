package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.tse0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\n\u001a\u00020\t2\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b¨\u0006\u0017"}, d2 = {"ru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/Responses$DraftBulkResponseDto", "", "", "", "deliveryIds", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/Responses$DraftBulkResponseDto;", "copy", "(Ljava/util/List;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/Responses$DraftBulkResponseDto;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getDeliveryIds", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Responses$DraftBulkResponseDto {
    private final List<String> deliveryIds;

    public Responses$DraftBulkResponseDto(@Json(name = "delivery_ids") List<String> list) {
        this.deliveryIds = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Responses$DraftBulkResponseDto copy$default(Responses$DraftBulkResponseDto responses$DraftBulkResponseDto, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = responses$DraftBulkResponseDto.deliveryIds;
        }
        return responses$DraftBulkResponseDto.copy(list);
    }

    public final List<String> component1() {
        return this.deliveryIds;
    }

    public final Responses$DraftBulkResponseDto copy(@Json(name = "delivery_ids") List<String> deliveryIds) {
        return new Responses$DraftBulkResponseDto(deliveryIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Responses$DraftBulkResponseDto) && jl40.l(this.deliveryIds, ((Responses$DraftBulkResponseDto) other).deliveryIds);
    }

    public final List<String> getDeliveryIds() {
        return this.deliveryIds;
    }

    public int hashCode() {
        return this.deliveryIds.hashCode();
    }

    public String toString() {
        return tse0.k("DraftBulkResponseDto(deliveryIds=", Extension.C_BRAKE, this.deliveryIds);
    }
}
