package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.contentbaseitems.ContentIconItemDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.contentbaseitems.ContentTextItemDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003JC\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/RemotePaymentItemDto;", "", "title", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentTextItemDto;", "subtitle", "trailTitle", "trailSubtitle", "leadIcon", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentIconItemDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentTextItemDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentTextItemDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentTextItemDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentTextItemDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentIconItemDto;)V", "getTitle", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentTextItemDto;", "getSubtitle", "getTrailTitle", "getTrailSubtitle", "getLeadIcon", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentIconItemDto;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class RemotePaymentItemDto {
    private final ContentIconItemDto leadIcon;
    private final ContentTextItemDto subtitle;
    private final ContentTextItemDto title;
    private final ContentTextItemDto trailSubtitle;
    private final ContentTextItemDto trailTitle;

    public RemotePaymentItemDto(@Json(name = "title") ContentTextItemDto contentTextItemDto, @Json(name = "subtitle") ContentTextItemDto contentTextItemDto2, @Json(name = "trail_title") ContentTextItemDto contentTextItemDto3, @Json(name = "trail_subtitle") ContentTextItemDto contentTextItemDto4, @Json(name = "lead_icon") ContentIconItemDto contentIconItemDto) {
        this.title = contentTextItemDto;
        this.subtitle = contentTextItemDto2;
        this.trailTitle = contentTextItemDto3;
        this.trailSubtitle = contentTextItemDto4;
        this.leadIcon = contentIconItemDto;
    }

    public static /* synthetic */ RemotePaymentItemDto copy$default(RemotePaymentItemDto remotePaymentItemDto, ContentTextItemDto contentTextItemDto, ContentTextItemDto contentTextItemDto2, ContentTextItemDto contentTextItemDto3, ContentTextItemDto contentTextItemDto4, ContentIconItemDto contentIconItemDto, int i, Object obj) {
        if ((i & 1) != 0) {
            contentTextItemDto = remotePaymentItemDto.title;
        }
        if ((i & 2) != 0) {
            contentTextItemDto2 = remotePaymentItemDto.subtitle;
        }
        if ((i & 4) != 0) {
            contentTextItemDto3 = remotePaymentItemDto.trailTitle;
        }
        if ((i & 8) != 0) {
            contentTextItemDto4 = remotePaymentItemDto.trailSubtitle;
        }
        if ((i & 16) != 0) {
            contentIconItemDto = remotePaymentItemDto.leadIcon;
        }
        ContentIconItemDto contentIconItemDto2 = contentIconItemDto;
        ContentTextItemDto contentTextItemDto5 = contentTextItemDto3;
        return remotePaymentItemDto.copy(contentTextItemDto, contentTextItemDto2, contentTextItemDto5, contentTextItemDto4, contentIconItemDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final ContentTextItemDto getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final ContentTextItemDto getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final ContentTextItemDto getTrailTitle() {
        return this.trailTitle;
    }

    /* renamed from: component4, reason: from getter */
    public final ContentTextItemDto getTrailSubtitle() {
        return this.trailSubtitle;
    }

    /* renamed from: component5, reason: from getter */
    public final ContentIconItemDto getLeadIcon() {
        return this.leadIcon;
    }

    public final RemotePaymentItemDto copy(@Json(name = "title") ContentTextItemDto title, @Json(name = "subtitle") ContentTextItemDto subtitle, @Json(name = "trail_title") ContentTextItemDto trailTitle, @Json(name = "trail_subtitle") ContentTextItemDto trailSubtitle, @Json(name = "lead_icon") ContentIconItemDto leadIcon) {
        return new RemotePaymentItemDto(title, subtitle, trailTitle, trailSubtitle, leadIcon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemotePaymentItemDto)) {
            return false;
        }
        RemotePaymentItemDto remotePaymentItemDto = (RemotePaymentItemDto) other;
        return jl40.l(this.title, remotePaymentItemDto.title) && jl40.l(this.subtitle, remotePaymentItemDto.subtitle) && jl40.l(this.trailTitle, remotePaymentItemDto.trailTitle) && jl40.l(this.trailSubtitle, remotePaymentItemDto.trailSubtitle) && jl40.l(this.leadIcon, remotePaymentItemDto.leadIcon);
    }

    public final ContentIconItemDto getLeadIcon() {
        return this.leadIcon;
    }

    public final ContentTextItemDto getSubtitle() {
        return this.subtitle;
    }

    public final ContentTextItemDto getTitle() {
        return this.title;
    }

    public final ContentTextItemDto getTrailSubtitle() {
        return this.trailSubtitle;
    }

    public final ContentTextItemDto getTrailTitle() {
        return this.trailTitle;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        ContentTextItemDto contentTextItemDto = this.subtitle;
        int hashCode2 = (hashCode + (contentTextItemDto == null ? 0 : contentTextItemDto.hashCode())) * 31;
        ContentTextItemDto contentTextItemDto2 = this.trailTitle;
        int hashCode3 = (hashCode2 + (contentTextItemDto2 == null ? 0 : contentTextItemDto2.hashCode())) * 31;
        ContentTextItemDto contentTextItemDto3 = this.trailSubtitle;
        int hashCode4 = (hashCode3 + (contentTextItemDto3 == null ? 0 : contentTextItemDto3.hashCode())) * 31;
        ContentIconItemDto contentIconItemDto = this.leadIcon;
        return hashCode4 + (contentIconItemDto != null ? contentIconItemDto.hashCode() : 0);
    }

    public String toString() {
        return "RemotePaymentItemDto(title=" + this.title + ", subtitle=" + this.subtitle + ", trailTitle=" + this.trailTitle + ", trailSubtitle=" + this.trailSubtitle + ", leadIcon=" + this.leadIcon + Extension.C_BRAKE;
    }
}
