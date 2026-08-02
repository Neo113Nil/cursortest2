package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.n;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.contentbaseitems.ContentIconItemDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.contentbaseitems.ContentTextItemDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u001f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010¨\u0006&"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentDetailsItemDto;", "", "id", "", "title", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentTextItemDto;", "subtitle", "leadIcon", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentIconItemDto;", "sections", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionDto;", "metricaLabel", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentTextItemDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentTextItemDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentIconItemDto;Ljava/util/List;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getTitle", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentTextItemDto;", "getSubtitle", "getLeadIcon", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentIconItemDto;", "getSections", "()Ljava/util/List;", "getMetricaLabel", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ContentDetailsItemDto {
    private final String id;
    private final ContentIconItemDto leadIcon;
    private final String metricaLabel;
    private final List<DetailsSectionDto> sections;
    private final ContentTextItemDto subtitle;
    private final ContentTextItemDto title;

    public ContentDetailsItemDto(@Json(name = "id") String str, @Json(name = "title") ContentTextItemDto contentTextItemDto, @Json(name = "subtitle") ContentTextItemDto contentTextItemDto2, @Json(name = "lead_icon") ContentIconItemDto contentIconItemDto, @Json(name = "sections") List<DetailsSectionDto> list, @Json(name = "metrica_label") String str2) {
        this.id = str;
        this.title = contentTextItemDto;
        this.subtitle = contentTextItemDto2;
        this.leadIcon = contentIconItemDto;
        this.sections = list;
        this.metricaLabel = str2;
    }

    public static /* synthetic */ ContentDetailsItemDto copy$default(ContentDetailsItemDto contentDetailsItemDto, String str, ContentTextItemDto contentTextItemDto, ContentTextItemDto contentTextItemDto2, ContentIconItemDto contentIconItemDto, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contentDetailsItemDto.id;
        }
        if ((i & 2) != 0) {
            contentTextItemDto = contentDetailsItemDto.title;
        }
        if ((i & 4) != 0) {
            contentTextItemDto2 = contentDetailsItemDto.subtitle;
        }
        if ((i & 8) != 0) {
            contentIconItemDto = contentDetailsItemDto.leadIcon;
        }
        if ((i & 16) != 0) {
            list = contentDetailsItemDto.sections;
        }
        if ((i & 32) != 0) {
            str2 = contentDetailsItemDto.metricaLabel;
        }
        List list2 = list;
        String str3 = str2;
        return contentDetailsItemDto.copy(str, contentTextItemDto, contentTextItemDto2, contentIconItemDto, list2, str3);
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
    public final ContentIconItemDto getLeadIcon() {
        return this.leadIcon;
    }

    public final List<DetailsSectionDto> component5() {
        return this.sections;
    }

    /* renamed from: component6, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final ContentDetailsItemDto copy(@Json(name = "id") String id, @Json(name = "title") ContentTextItemDto title, @Json(name = "subtitle") ContentTextItemDto subtitle, @Json(name = "lead_icon") ContentIconItemDto leadIcon, @Json(name = "sections") List<DetailsSectionDto> sections, @Json(name = "metrica_label") String metricaLabel) {
        return new ContentDetailsItemDto(id, title, subtitle, leadIcon, sections, metricaLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContentDetailsItemDto)) {
            return false;
        }
        ContentDetailsItemDto contentDetailsItemDto = (ContentDetailsItemDto) other;
        return jl40.l(this.id, contentDetailsItemDto.id) && jl40.l(this.title, contentDetailsItemDto.title) && jl40.l(this.subtitle, contentDetailsItemDto.subtitle) && jl40.l(this.leadIcon, contentDetailsItemDto.leadIcon) && jl40.l(this.sections, contentDetailsItemDto.sections) && jl40.l(this.metricaLabel, contentDetailsItemDto.metricaLabel);
    }

    public final String getId() {
        return this.id;
    }

    public final ContentIconItemDto getLeadIcon() {
        return this.leadIcon;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final List<DetailsSectionDto> getSections() {
        return this.sections;
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
        int hashCode2 = (hashCode + (contentTextItemDto == null ? 0 : contentTextItemDto.hashCode())) * 31;
        ContentIconItemDto contentIconItemDto = this.leadIcon;
        int c = unr0.c((hashCode2 + (contentIconItemDto == null ? 0 : contentIconItemDto.hashCode())) * 31, 31, this.sections);
        String str = this.metricaLabel;
        return c + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        ContentTextItemDto contentTextItemDto = this.title;
        ContentTextItemDto contentTextItemDto2 = this.subtitle;
        ContentIconItemDto contentIconItemDto = this.leadIcon;
        List<DetailsSectionDto> list = this.sections;
        String str2 = this.metricaLabel;
        StringBuilder sb = new StringBuilder("ContentDetailsItemDto(id=");
        sb.append(str);
        sb.append(", title=");
        sb.append(contentTextItemDto);
        sb.append(", subtitle=");
        sb.append(contentTextItemDto2);
        sb.append(", leadIcon=");
        sb.append(contentIconItemDto);
        sb.append(", sections=");
        return n.l(", metricaLabel=", str2, Extension.C_BRAKE, sb, list);
    }
}
