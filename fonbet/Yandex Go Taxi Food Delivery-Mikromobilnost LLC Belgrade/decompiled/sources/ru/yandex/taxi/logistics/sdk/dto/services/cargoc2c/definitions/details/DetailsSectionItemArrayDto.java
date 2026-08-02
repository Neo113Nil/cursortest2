package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.nnm;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemArrayDto;", "", "type", "", "items", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemDto;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getType", "()Ljava/lang/String;", "getItems", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DetailsSectionItemArrayDto {
    private final List<DetailsSectionItemDto> items;
    private final String type;

    /* JADX WARN: Multi-variable type inference failed */
    public DetailsSectionItemArrayDto(@Json(name = "type") String str, @Json(name = "items") List<? extends DetailsSectionItemDto> list) {
        this.type = str;
        this.items = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DetailsSectionItemArrayDto copy$default(DetailsSectionItemArrayDto detailsSectionItemArrayDto, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = detailsSectionItemArrayDto.type;
        }
        if ((i & 2) != 0) {
            list = detailsSectionItemArrayDto.items;
        }
        return detailsSectionItemArrayDto.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final List<DetailsSectionItemDto> component2() {
        return this.items;
    }

    public final DetailsSectionItemArrayDto copy(@Json(name = "type") String type, @Json(name = "items") List<? extends DetailsSectionItemDto> items) {
        return new DetailsSectionItemArrayDto(type, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DetailsSectionItemArrayDto)) {
            return false;
        }
        DetailsSectionItemArrayDto detailsSectionItemArrayDto = (DetailsSectionItemArrayDto) other;
        return jl40.l(this.type, detailsSectionItemArrayDto.type) && jl40.l(this.items, detailsSectionItemArrayDto.items);
    }

    public final List<DetailsSectionItemDto> getItems() {
        return this.items;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.items.hashCode() + (this.type.hashCode() * 31);
    }

    public String toString() {
        return nnm.h("DetailsSectionItemArrayDto(type=", this.type, ", items=", Extension.C_BRAKE, this.items);
    }
}
