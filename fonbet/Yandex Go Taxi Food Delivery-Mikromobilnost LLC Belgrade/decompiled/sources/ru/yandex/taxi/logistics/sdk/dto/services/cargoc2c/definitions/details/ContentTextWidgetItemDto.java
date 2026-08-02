package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.nzs;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.contentbaseitems.ContentTextItemDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b'\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u0010/\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010'J\u008e\u0001\u00104\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u00105J\u0013\u00106\u001a\u00020\u00132\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u00020\u000bHÖ\u0001J\t\u00109\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0017R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\n\n\u0002\u0010(\u001a\u0004\b\u0012\u0010'¨\u0006:"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentTextWidgetItemDto;", "", "id", "", "title", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentTextItemDto;", "subtitle", "titleAlignment", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentTextAlignmentDto;", "subtitleAlignment", "minHeight", "", "externalInsets", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/InsetsDto;", "internalInsets", "action", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadDto;", "metricaLabel", "isLoading", "", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentTextItemDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentTextItemDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentTextAlignmentDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentTextAlignmentDto;Ljava/lang/Integer;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/InsetsDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/InsetsDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadDto;Ljava/lang/String;Ljava/lang/Boolean;)V", "getId", "()Ljava/lang/String;", "getTitle", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentTextItemDto;", "getSubtitle", "getTitleAlignment", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentTextAlignmentDto;", "getSubtitleAlignment", "getMinHeight", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getExternalInsets", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/InsetsDto;", "getInternalInsets", "getAction", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadDto;", "getMetricaLabel", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentTextItemDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentTextItemDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentTextAlignmentDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentTextAlignmentDto;Ljava/lang/Integer;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/InsetsDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/InsetsDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadDto;Ljava/lang/String;Ljava/lang/Boolean;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentTextWidgetItemDto;", "equals", "other", "hashCode", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ContentTextWidgetItemDto {
    private final PayloadDto action;
    private final InsetsDto externalInsets;
    private final String id;
    private final InsetsDto internalInsets;
    private final Boolean isLoading;
    private final String metricaLabel;
    private final Integer minHeight;
    private final ContentTextItemDto subtitle;
    private final ContentTextAlignmentDto subtitleAlignment;
    private final ContentTextItemDto title;
    private final ContentTextAlignmentDto titleAlignment;

    public ContentTextWidgetItemDto(@Json(name = "id") String str, @Json(name = "title") ContentTextItemDto contentTextItemDto, @Json(name = "subtitle") ContentTextItemDto contentTextItemDto2, @Json(name = "title_alignment") ContentTextAlignmentDto contentTextAlignmentDto, @Json(name = "subtitle_alignment") ContentTextAlignmentDto contentTextAlignmentDto2, @Json(name = "min_height") Integer num, @Json(name = "external_insets") InsetsDto insetsDto, @Json(name = "internal_insets") InsetsDto insetsDto2, @Json(name = "action") PayloadDto payloadDto, @Json(name = "metrica_label") String str2, @Json(name = "is_loading") Boolean bool) {
        this.id = str;
        this.title = contentTextItemDto;
        this.subtitle = contentTextItemDto2;
        this.titleAlignment = contentTextAlignmentDto;
        this.subtitleAlignment = contentTextAlignmentDto2;
        this.minHeight = num;
        this.externalInsets = insetsDto;
        this.internalInsets = insetsDto2;
        this.action = payloadDto;
        this.metricaLabel = str2;
        this.isLoading = bool;
    }

    public static /* synthetic */ ContentTextWidgetItemDto copy$default(ContentTextWidgetItemDto contentTextWidgetItemDto, String str, ContentTextItemDto contentTextItemDto, ContentTextItemDto contentTextItemDto2, ContentTextAlignmentDto contentTextAlignmentDto, ContentTextAlignmentDto contentTextAlignmentDto2, Integer num, InsetsDto insetsDto, InsetsDto insetsDto2, PayloadDto payloadDto, String str2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contentTextWidgetItemDto.id;
        }
        if ((i & 2) != 0) {
            contentTextItemDto = contentTextWidgetItemDto.title;
        }
        if ((i & 4) != 0) {
            contentTextItemDto2 = contentTextWidgetItemDto.subtitle;
        }
        if ((i & 8) != 0) {
            contentTextAlignmentDto = contentTextWidgetItemDto.titleAlignment;
        }
        if ((i & 16) != 0) {
            contentTextAlignmentDto2 = contentTextWidgetItemDto.subtitleAlignment;
        }
        if ((i & 32) != 0) {
            num = contentTextWidgetItemDto.minHeight;
        }
        if ((i & 64) != 0) {
            insetsDto = contentTextWidgetItemDto.externalInsets;
        }
        if ((i & 128) != 0) {
            insetsDto2 = contentTextWidgetItemDto.internalInsets;
        }
        if ((i & 256) != 0) {
            payloadDto = contentTextWidgetItemDto.action;
        }
        if ((i & 512) != 0) {
            str2 = contentTextWidgetItemDto.metricaLabel;
        }
        if ((i & 1024) != 0) {
            bool = contentTextWidgetItemDto.isLoading;
        }
        String str3 = str2;
        Boolean bool2 = bool;
        InsetsDto insetsDto3 = insetsDto2;
        PayloadDto payloadDto2 = payloadDto;
        Integer num2 = num;
        InsetsDto insetsDto4 = insetsDto;
        ContentTextAlignmentDto contentTextAlignmentDto3 = contentTextAlignmentDto2;
        ContentTextItemDto contentTextItemDto3 = contentTextItemDto2;
        return contentTextWidgetItemDto.copy(str, contentTextItemDto, contentTextItemDto3, contentTextAlignmentDto, contentTextAlignmentDto3, num2, insetsDto4, insetsDto3, payloadDto2, str3, bool2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    /* renamed from: component11, reason: from getter */
    public final Boolean getIsLoading() {
        return this.isLoading;
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
    public final ContentTextAlignmentDto getTitleAlignment() {
        return this.titleAlignment;
    }

    /* renamed from: component5, reason: from getter */
    public final ContentTextAlignmentDto getSubtitleAlignment() {
        return this.subtitleAlignment;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getMinHeight() {
        return this.minHeight;
    }

    /* renamed from: component7, reason: from getter */
    public final InsetsDto getExternalInsets() {
        return this.externalInsets;
    }

    /* renamed from: component8, reason: from getter */
    public final InsetsDto getInternalInsets() {
        return this.internalInsets;
    }

    /* renamed from: component9, reason: from getter */
    public final PayloadDto getAction() {
        return this.action;
    }

    public final ContentTextWidgetItemDto copy(@Json(name = "id") String id, @Json(name = "title") ContentTextItemDto title, @Json(name = "subtitle") ContentTextItemDto subtitle, @Json(name = "title_alignment") ContentTextAlignmentDto titleAlignment, @Json(name = "subtitle_alignment") ContentTextAlignmentDto subtitleAlignment, @Json(name = "min_height") Integer minHeight, @Json(name = "external_insets") InsetsDto externalInsets, @Json(name = "internal_insets") InsetsDto internalInsets, @Json(name = "action") PayloadDto action, @Json(name = "metrica_label") String metricaLabel, @Json(name = "is_loading") Boolean isLoading) {
        return new ContentTextWidgetItemDto(id, title, subtitle, titleAlignment, subtitleAlignment, minHeight, externalInsets, internalInsets, action, metricaLabel, isLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContentTextWidgetItemDto)) {
            return false;
        }
        ContentTextWidgetItemDto contentTextWidgetItemDto = (ContentTextWidgetItemDto) other;
        return jl40.l(this.id, contentTextWidgetItemDto.id) && jl40.l(this.title, contentTextWidgetItemDto.title) && jl40.l(this.subtitle, contentTextWidgetItemDto.subtitle) && this.titleAlignment == contentTextWidgetItemDto.titleAlignment && this.subtitleAlignment == contentTextWidgetItemDto.subtitleAlignment && jl40.l(this.minHeight, contentTextWidgetItemDto.minHeight) && jl40.l(this.externalInsets, contentTextWidgetItemDto.externalInsets) && jl40.l(this.internalInsets, contentTextWidgetItemDto.internalInsets) && jl40.l(this.action, contentTextWidgetItemDto.action) && jl40.l(this.metricaLabel, contentTextWidgetItemDto.metricaLabel) && jl40.l(this.isLoading, contentTextWidgetItemDto.isLoading);
    }

    public final PayloadDto getAction() {
        return this.action;
    }

    public final InsetsDto getExternalInsets() {
        return this.externalInsets;
    }

    public final String getId() {
        return this.id;
    }

    public final InsetsDto getInternalInsets() {
        return this.internalInsets;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final Integer getMinHeight() {
        return this.minHeight;
    }

    public final ContentTextItemDto getSubtitle() {
        return this.subtitle;
    }

    public final ContentTextAlignmentDto getSubtitleAlignment() {
        return this.subtitleAlignment;
    }

    public final ContentTextItemDto getTitle() {
        return this.title;
    }

    public final ContentTextAlignmentDto getTitleAlignment() {
        return this.titleAlignment;
    }

    public int hashCode() {
        int hashCode = (this.title.hashCode() + (this.id.hashCode() * 31)) * 31;
        ContentTextItemDto contentTextItemDto = this.subtitle;
        int hashCode2 = (hashCode + (contentTextItemDto == null ? 0 : contentTextItemDto.hashCode())) * 31;
        ContentTextAlignmentDto contentTextAlignmentDto = this.titleAlignment;
        int hashCode3 = (hashCode2 + (contentTextAlignmentDto == null ? 0 : contentTextAlignmentDto.hashCode())) * 31;
        ContentTextAlignmentDto contentTextAlignmentDto2 = this.subtitleAlignment;
        int hashCode4 = (hashCode3 + (contentTextAlignmentDto2 == null ? 0 : contentTextAlignmentDto2.hashCode())) * 31;
        Integer num = this.minHeight;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        InsetsDto insetsDto = this.externalInsets;
        int hashCode6 = (hashCode5 + (insetsDto == null ? 0 : insetsDto.hashCode())) * 31;
        InsetsDto insetsDto2 = this.internalInsets;
        int hashCode7 = (hashCode6 + (insetsDto2 == null ? 0 : insetsDto2.hashCode())) * 31;
        PayloadDto payloadDto = this.action;
        int hashCode8 = (hashCode7 + (payloadDto == null ? 0 : payloadDto.hashCode())) * 31;
        String str = this.metricaLabel;
        int hashCode9 = (hashCode8 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isLoading;
        return hashCode9 + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean isLoading() {
        return this.isLoading;
    }

    public String toString() {
        String str = this.id;
        ContentTextItemDto contentTextItemDto = this.title;
        ContentTextItemDto contentTextItemDto2 = this.subtitle;
        ContentTextAlignmentDto contentTextAlignmentDto = this.titleAlignment;
        ContentTextAlignmentDto contentTextAlignmentDto2 = this.subtitleAlignment;
        Integer num = this.minHeight;
        InsetsDto insetsDto = this.externalInsets;
        InsetsDto insetsDto2 = this.internalInsets;
        PayloadDto payloadDto = this.action;
        String str2 = this.metricaLabel;
        Boolean bool = this.isLoading;
        StringBuilder sb = new StringBuilder("ContentTextWidgetItemDto(id=");
        sb.append(str);
        sb.append(", title=");
        sb.append(contentTextItemDto);
        sb.append(", subtitle=");
        sb.append(contentTextItemDto2);
        sb.append(", titleAlignment=");
        sb.append(contentTextAlignmentDto);
        sb.append(", subtitleAlignment=");
        sb.append(contentTextAlignmentDto2);
        sb.append(", minHeight=");
        sb.append(num);
        sb.append(", externalInsets=");
        sb.append(insetsDto);
        sb.append(", internalInsets=");
        sb.append(insetsDto2);
        sb.append(", action=");
        sb.append(payloadDto);
        sb.append(", metricaLabel=");
        sb.append(str2);
        sb.append(", isLoading=");
        return nzs.d(sb, bool, Extension.C_BRAKE);
    }
}
