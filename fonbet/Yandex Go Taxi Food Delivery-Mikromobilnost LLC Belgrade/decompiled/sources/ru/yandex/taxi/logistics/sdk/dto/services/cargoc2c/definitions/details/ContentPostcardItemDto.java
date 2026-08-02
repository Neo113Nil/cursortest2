package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.PostcardConsumerInfoDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.contentbaseitems.ContentTextItemDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentPostcardItemDto;", "", "id", "", "title", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentTextItemDto;", "subtitle", "postcard", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PostcardConsumerInfoDto;", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentTextItemDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentTextItemDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PostcardConsumerInfoDto;)V", "getId", "()Ljava/lang/String;", "getTitle", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentTextItemDto;", "getSubtitle", "getPostcard", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PostcardConsumerInfoDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ContentPostcardItemDto {
    private final String id;
    private final PostcardConsumerInfoDto postcard;
    private final ContentTextItemDto subtitle;
    private final ContentTextItemDto title;

    public ContentPostcardItemDto(@Json(name = "id") String str, @Json(name = "title") ContentTextItemDto contentTextItemDto, @Json(name = "subtitle") ContentTextItemDto contentTextItemDto2, @Json(name = "postcard") PostcardConsumerInfoDto postcardConsumerInfoDto) {
        this.id = str;
        this.title = contentTextItemDto;
        this.subtitle = contentTextItemDto2;
        this.postcard = postcardConsumerInfoDto;
    }

    public static /* synthetic */ ContentPostcardItemDto copy$default(ContentPostcardItemDto contentPostcardItemDto, String str, ContentTextItemDto contentTextItemDto, ContentTextItemDto contentTextItemDto2, PostcardConsumerInfoDto postcardConsumerInfoDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contentPostcardItemDto.id;
        }
        if ((i & 2) != 0) {
            contentTextItemDto = contentPostcardItemDto.title;
        }
        if ((i & 4) != 0) {
            contentTextItemDto2 = contentPostcardItemDto.subtitle;
        }
        if ((i & 8) != 0) {
            postcardConsumerInfoDto = contentPostcardItemDto.postcard;
        }
        return contentPostcardItemDto.copy(str, contentTextItemDto, contentTextItemDto2, postcardConsumerInfoDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final ContentTextItemDto getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final ContentTextItemDto getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final PostcardConsumerInfoDto getPostcard() {
        return this.postcard;
    }

    public final ContentPostcardItemDto copy(@Json(name = "id") String id, @Json(name = "title") ContentTextItemDto title, @Json(name = "subtitle") ContentTextItemDto subtitle, @Json(name = "postcard") PostcardConsumerInfoDto postcard) {
        return new ContentPostcardItemDto(id, title, subtitle, postcard);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContentPostcardItemDto)) {
            return false;
        }
        ContentPostcardItemDto contentPostcardItemDto = (ContentPostcardItemDto) other;
        return jl40.l(this.id, contentPostcardItemDto.id) && jl40.l(this.title, contentPostcardItemDto.title) && jl40.l(this.subtitle, contentPostcardItemDto.subtitle) && jl40.l(this.postcard, contentPostcardItemDto.postcard);
    }

    public final String getId() {
        return this.id;
    }

    public final PostcardConsumerInfoDto getPostcard() {
        return this.postcard;
    }

    public final ContentTextItemDto getSubtitle() {
        return this.subtitle;
    }

    public final ContentTextItemDto getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = (this.title.hashCode() + (this.id.hashCode() * 31)) * 31;
        ContentTextItemDto contentTextItemDto = this.subtitle;
        return this.postcard.hashCode() + ((hashCode + (contentTextItemDto == null ? 0 : contentTextItemDto.hashCode())) * 31);
    }

    public String toString() {
        return "ContentPostcardItemDto(id=" + this.id + ", title=" + this.title + ", subtitle=" + this.subtitle + ", postcard=" + this.postcard + Extension.C_BRAKE;
    }
}
