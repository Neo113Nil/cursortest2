package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.contentbaseitems.ContentTextItemDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentHeaderItemDto;", "", "id", "", "title", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentTextItemDto;", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentTextItemDto;)V", "getId", "()Ljava/lang/String;", "getTitle", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentTextItemDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ContentHeaderItemDto {
    private final String id;
    private final ContentTextItemDto title;

    public ContentHeaderItemDto(@Json(name = "id") String str, @Json(name = "title") ContentTextItemDto contentTextItemDto) {
        this.id = str;
        this.title = contentTextItemDto;
    }

    public static /* synthetic */ ContentHeaderItemDto copy$default(ContentHeaderItemDto contentHeaderItemDto, String str, ContentTextItemDto contentTextItemDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contentHeaderItemDto.id;
        }
        if ((i & 2) != 0) {
            contentTextItemDto = contentHeaderItemDto.title;
        }
        return contentHeaderItemDto.copy(str, contentTextItemDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final ContentTextItemDto getTitle() {
        return this.title;
    }

    public final ContentHeaderItemDto copy(@Json(name = "id") String id, @Json(name = "title") ContentTextItemDto title) {
        return new ContentHeaderItemDto(id, title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContentHeaderItemDto)) {
            return false;
        }
        ContentHeaderItemDto contentHeaderItemDto = (ContentHeaderItemDto) other;
        return jl40.l(this.id, contentHeaderItemDto.id) && jl40.l(this.title, contentHeaderItemDto.title);
    }

    public final String getId() {
        return this.id;
    }

    public final ContentTextItemDto getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.title.hashCode() + (this.id.hashCode() * 31);
    }

    public String toString() {
        return "ContentHeaderItemDto(id=" + this.id + ", title=" + this.title + Extension.C_BRAKE;
    }
}
