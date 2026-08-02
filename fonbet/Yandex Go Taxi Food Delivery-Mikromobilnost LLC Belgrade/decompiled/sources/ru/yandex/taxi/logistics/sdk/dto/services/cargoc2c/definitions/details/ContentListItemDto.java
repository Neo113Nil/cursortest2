package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.contentbaseitems.ContentIconItemDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.contentbaseitems.ContentTextItemDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b$\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010\"J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u008e\u0001\u00100\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00101J\u0013\u00102\u001a\u00020\u00102\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u000205HÖ\u0001J\t\u00106\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0015¨\u00067"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentListItemDto;", "", "id", "", "title", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentTextItemDto;", "subtitle", "trailText", "trailSubtitle", "leadIcon", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentIconItemDto;", "trailIcon", "trailPayload", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadDto;", "generalPayload", "shimmering", "", "metricaLabel", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentTextItemDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentTextItemDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentTextItemDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentTextItemDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentIconItemDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentIconItemDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadDto;Ljava/lang/Boolean;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getTitle", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentTextItemDto;", "getSubtitle", "getTrailText", "getTrailSubtitle", "getLeadIcon", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentIconItemDto;", "getTrailIcon", "getTrailPayload", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadDto;", "getGeneralPayload", "getShimmering", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMetricaLabel", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentTextItemDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentTextItemDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentTextItemDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentTextItemDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentIconItemDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentIconItemDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadDto;Ljava/lang/Boolean;Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentListItemDto;", "equals", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ContentListItemDto {
    private final PayloadDto generalPayload;
    private final String id;
    private final ContentIconItemDto leadIcon;
    private final String metricaLabel;
    private final Boolean shimmering;
    private final ContentTextItemDto subtitle;
    private final ContentTextItemDto title;
    private final ContentIconItemDto trailIcon;
    private final PayloadDto trailPayload;
    private final ContentTextItemDto trailSubtitle;
    private final ContentTextItemDto trailText;

    public ContentListItemDto(@Json(name = "id") String str, @Json(name = "title") ContentTextItemDto contentTextItemDto, @Json(name = "subtitle") ContentTextItemDto contentTextItemDto2, @Json(name = "trail_text") ContentTextItemDto contentTextItemDto3, @Json(name = "trail_subtitle") ContentTextItemDto contentTextItemDto4, @Json(name = "lead_icon") ContentIconItemDto contentIconItemDto, @Json(name = "trail_icon") ContentIconItemDto contentIconItemDto2, @Json(name = "trail_payload") PayloadDto payloadDto, @Json(name = "general_payload") PayloadDto payloadDto2, @Json(name = "shimmering") Boolean bool, @Json(name = "metrica_label") String str2) {
        this.id = str;
        this.title = contentTextItemDto;
        this.subtitle = contentTextItemDto2;
        this.trailText = contentTextItemDto3;
        this.trailSubtitle = contentTextItemDto4;
        this.leadIcon = contentIconItemDto;
        this.trailIcon = contentIconItemDto2;
        this.trailPayload = payloadDto;
        this.generalPayload = payloadDto2;
        this.shimmering = bool;
        this.metricaLabel = str2;
    }

    public static /* synthetic */ ContentListItemDto copy$default(ContentListItemDto contentListItemDto, String str, ContentTextItemDto contentTextItemDto, ContentTextItemDto contentTextItemDto2, ContentTextItemDto contentTextItemDto3, ContentTextItemDto contentTextItemDto4, ContentIconItemDto contentIconItemDto, ContentIconItemDto contentIconItemDto2, PayloadDto payloadDto, PayloadDto payloadDto2, Boolean bool, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contentListItemDto.id;
        }
        if ((i & 2) != 0) {
            contentTextItemDto = contentListItemDto.title;
        }
        if ((i & 4) != 0) {
            contentTextItemDto2 = contentListItemDto.subtitle;
        }
        if ((i & 8) != 0) {
            contentTextItemDto3 = contentListItemDto.trailText;
        }
        if ((i & 16) != 0) {
            contentTextItemDto4 = contentListItemDto.trailSubtitle;
        }
        if ((i & 32) != 0) {
            contentIconItemDto = contentListItemDto.leadIcon;
        }
        if ((i & 64) != 0) {
            contentIconItemDto2 = contentListItemDto.trailIcon;
        }
        if ((i & 128) != 0) {
            payloadDto = contentListItemDto.trailPayload;
        }
        if ((i & 256) != 0) {
            payloadDto2 = contentListItemDto.generalPayload;
        }
        if ((i & 512) != 0) {
            bool = contentListItemDto.shimmering;
        }
        if ((i & 1024) != 0) {
            str2 = contentListItemDto.metricaLabel;
        }
        Boolean bool2 = bool;
        String str3 = str2;
        PayloadDto payloadDto3 = payloadDto;
        PayloadDto payloadDto4 = payloadDto2;
        ContentIconItemDto contentIconItemDto3 = contentIconItemDto;
        ContentIconItemDto contentIconItemDto4 = contentIconItemDto2;
        ContentTextItemDto contentTextItemDto5 = contentTextItemDto4;
        ContentTextItemDto contentTextItemDto6 = contentTextItemDto2;
        return contentListItemDto.copy(str, contentTextItemDto, contentTextItemDto6, contentTextItemDto3, contentTextItemDto5, contentIconItemDto3, contentIconItemDto4, payloadDto3, payloadDto4, bool2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final Boolean getShimmering() {
        return this.shimmering;
    }

    /* renamed from: component11, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
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
    public final ContentTextItemDto getTrailText() {
        return this.trailText;
    }

    /* renamed from: component5, reason: from getter */
    public final ContentTextItemDto getTrailSubtitle() {
        return this.trailSubtitle;
    }

    /* renamed from: component6, reason: from getter */
    public final ContentIconItemDto getLeadIcon() {
        return this.leadIcon;
    }

    /* renamed from: component7, reason: from getter */
    public final ContentIconItemDto getTrailIcon() {
        return this.trailIcon;
    }

    /* renamed from: component8, reason: from getter */
    public final PayloadDto getTrailPayload() {
        return this.trailPayload;
    }

    /* renamed from: component9, reason: from getter */
    public final PayloadDto getGeneralPayload() {
        return this.generalPayload;
    }

    public final ContentListItemDto copy(@Json(name = "id") String id, @Json(name = "title") ContentTextItemDto title, @Json(name = "subtitle") ContentTextItemDto subtitle, @Json(name = "trail_text") ContentTextItemDto trailText, @Json(name = "trail_subtitle") ContentTextItemDto trailSubtitle, @Json(name = "lead_icon") ContentIconItemDto leadIcon, @Json(name = "trail_icon") ContentIconItemDto trailIcon, @Json(name = "trail_payload") PayloadDto trailPayload, @Json(name = "general_payload") PayloadDto generalPayload, @Json(name = "shimmering") Boolean shimmering, @Json(name = "metrica_label") String metricaLabel) {
        return new ContentListItemDto(id, title, subtitle, trailText, trailSubtitle, leadIcon, trailIcon, trailPayload, generalPayload, shimmering, metricaLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContentListItemDto)) {
            return false;
        }
        ContentListItemDto contentListItemDto = (ContentListItemDto) other;
        return jl40.l(this.id, contentListItemDto.id) && jl40.l(this.title, contentListItemDto.title) && jl40.l(this.subtitle, contentListItemDto.subtitle) && jl40.l(this.trailText, contentListItemDto.trailText) && jl40.l(this.trailSubtitle, contentListItemDto.trailSubtitle) && jl40.l(this.leadIcon, contentListItemDto.leadIcon) && jl40.l(this.trailIcon, contentListItemDto.trailIcon) && jl40.l(this.trailPayload, contentListItemDto.trailPayload) && jl40.l(this.generalPayload, contentListItemDto.generalPayload) && jl40.l(this.shimmering, contentListItemDto.shimmering) && jl40.l(this.metricaLabel, contentListItemDto.metricaLabel);
    }

    public final PayloadDto getGeneralPayload() {
        return this.generalPayload;
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

    public final Boolean getShimmering() {
        return this.shimmering;
    }

    public final ContentTextItemDto getSubtitle() {
        return this.subtitle;
    }

    public final ContentTextItemDto getTitle() {
        return this.title;
    }

    public final ContentIconItemDto getTrailIcon() {
        return this.trailIcon;
    }

    public final PayloadDto getTrailPayload() {
        return this.trailPayload;
    }

    public final ContentTextItemDto getTrailSubtitle() {
        return this.trailSubtitle;
    }

    public final ContentTextItemDto getTrailText() {
        return this.trailText;
    }

    public int hashCode() {
        int hashCode = (this.title.hashCode() + (this.id.hashCode() * 31)) * 31;
        ContentTextItemDto contentTextItemDto = this.subtitle;
        int hashCode2 = (hashCode + (contentTextItemDto == null ? 0 : contentTextItemDto.hashCode())) * 31;
        ContentTextItemDto contentTextItemDto2 = this.trailText;
        int hashCode3 = (hashCode2 + (contentTextItemDto2 == null ? 0 : contentTextItemDto2.hashCode())) * 31;
        ContentTextItemDto contentTextItemDto3 = this.trailSubtitle;
        int hashCode4 = (hashCode3 + (contentTextItemDto3 == null ? 0 : contentTextItemDto3.hashCode())) * 31;
        ContentIconItemDto contentIconItemDto = this.leadIcon;
        int hashCode5 = (hashCode4 + (contentIconItemDto == null ? 0 : contentIconItemDto.hashCode())) * 31;
        ContentIconItemDto contentIconItemDto2 = this.trailIcon;
        int hashCode6 = (hashCode5 + (contentIconItemDto2 == null ? 0 : contentIconItemDto2.hashCode())) * 31;
        PayloadDto payloadDto = this.trailPayload;
        int hashCode7 = (hashCode6 + (payloadDto == null ? 0 : payloadDto.hashCode())) * 31;
        PayloadDto payloadDto2 = this.generalPayload;
        int hashCode8 = (hashCode7 + (payloadDto2 == null ? 0 : payloadDto2.hashCode())) * 31;
        Boolean bool = this.shimmering;
        int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.metricaLabel;
        return hashCode9 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        ContentTextItemDto contentTextItemDto = this.title;
        ContentTextItemDto contentTextItemDto2 = this.subtitle;
        ContentTextItemDto contentTextItemDto3 = this.trailText;
        ContentTextItemDto contentTextItemDto4 = this.trailSubtitle;
        ContentIconItemDto contentIconItemDto = this.leadIcon;
        ContentIconItemDto contentIconItemDto2 = this.trailIcon;
        PayloadDto payloadDto = this.trailPayload;
        PayloadDto payloadDto2 = this.generalPayload;
        Boolean bool = this.shimmering;
        String str2 = this.metricaLabel;
        StringBuilder sb = new StringBuilder("ContentListItemDto(id=");
        sb.append(str);
        sb.append(", title=");
        sb.append(contentTextItemDto);
        sb.append(", subtitle=");
        sb.append(contentTextItemDto2);
        sb.append(", trailText=");
        sb.append(contentTextItemDto3);
        sb.append(", trailSubtitle=");
        sb.append(contentTextItemDto4);
        sb.append(", leadIcon=");
        sb.append(contentIconItemDto);
        sb.append(", trailIcon=");
        sb.append(contentIconItemDto2);
        sb.append(", trailPayload=");
        sb.append(payloadDto);
        sb.append(", generalPayload=");
        sb.append(payloadDto2);
        sb.append(", shimmering=");
        sb.append(bool);
        sb.append(", metricaLabel=");
        return oyr.t(sb, str2, Extension.C_BRAKE);
    }
}
