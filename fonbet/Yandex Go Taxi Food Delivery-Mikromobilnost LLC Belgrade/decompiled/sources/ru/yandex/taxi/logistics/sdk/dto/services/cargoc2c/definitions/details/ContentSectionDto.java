package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.n;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006\u001e"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentSectionDto;", "", "id", "", "header", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentSectionHeaderDto;", "items", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentItemDto;", "metricaLabel", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentSectionHeaderDto;Ljava/util/List;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getHeader", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentSectionHeaderDto;", "getItems", "()Ljava/util/List;", "getMetricaLabel", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ContentSectionDto {
    private final ContentSectionHeaderDto header;
    private final String id;
    private final List<ContentItemDto> items;
    private final String metricaLabel;

    /* JADX WARN: Multi-variable type inference failed */
    public ContentSectionDto(@Json(name = "id") String str, @Json(name = "header") ContentSectionHeaderDto contentSectionHeaderDto, @Json(name = "items") List<? extends ContentItemDto> list, @Json(name = "metrica_label") String str2) {
        this.id = str;
        this.header = contentSectionHeaderDto;
        this.items = list;
        this.metricaLabel = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ContentSectionDto copy$default(ContentSectionDto contentSectionDto, String str, ContentSectionHeaderDto contentSectionHeaderDto, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contentSectionDto.id;
        }
        if ((i & 2) != 0) {
            contentSectionHeaderDto = contentSectionDto.header;
        }
        if ((i & 4) != 0) {
            list = contentSectionDto.items;
        }
        if ((i & 8) != 0) {
            str2 = contentSectionDto.metricaLabel;
        }
        return contentSectionDto.copy(str, contentSectionHeaderDto, list, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final ContentSectionHeaderDto getHeader() {
        return this.header;
    }

    public final List<ContentItemDto> component3() {
        return this.items;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final ContentSectionDto copy(@Json(name = "id") String id, @Json(name = "header") ContentSectionHeaderDto header, @Json(name = "items") List<? extends ContentItemDto> items, @Json(name = "metrica_label") String metricaLabel) {
        return new ContentSectionDto(id, header, items, metricaLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContentSectionDto)) {
            return false;
        }
        ContentSectionDto contentSectionDto = (ContentSectionDto) other;
        return jl40.l(this.id, contentSectionDto.id) && jl40.l(this.header, contentSectionDto.header) && jl40.l(this.items, contentSectionDto.items) && jl40.l(this.metricaLabel, contentSectionDto.metricaLabel);
    }

    public final ContentSectionHeaderDto getHeader() {
        return this.header;
    }

    public final String getId() {
        return this.id;
    }

    public final List<ContentItemDto> getItems() {
        return this.items;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        ContentSectionHeaderDto contentSectionHeaderDto = this.header;
        int c = unr0.c((hashCode + (contentSectionHeaderDto == null ? 0 : contentSectionHeaderDto.hashCode())) * 31, 31, this.items);
        String str = this.metricaLabel;
        return c + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        ContentSectionHeaderDto contentSectionHeaderDto = this.header;
        List<ContentItemDto> list = this.items;
        String str2 = this.metricaLabel;
        StringBuilder sb = new StringBuilder("ContentSectionDto(id=");
        sb.append(str);
        sb.append(", header=");
        sb.append(contentSectionHeaderDto);
        sb.append(", items=");
        return n.l(", metricaLabel=", str2, Extension.C_BRAKE, sb, list);
    }
}
