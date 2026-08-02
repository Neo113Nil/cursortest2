package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.contentbaseitems.ContentTextItemDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003JC\u0010\u0019\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010¨\u0006 "}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentActionButtonDto;", "", "title", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentTextItemDto;", "subtitle", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "", "actionPayload", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadDto;", "metricaLabel", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentTextItemDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentTextItemDto;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadDto;Ljava/lang/String;)V", "getTitle", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentTextItemDto;", "getSubtitle", "getBackgroundColor", "()Ljava/lang/String;", "getActionPayload", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadDto;", "getMetricaLabel", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ContentActionButtonDto {
    private final PayloadDto actionPayload;
    private final String backgroundColor;
    private final String metricaLabel;
    private final ContentTextItemDto subtitle;
    private final ContentTextItemDto title;

    public ContentActionButtonDto(@Json(name = "title") ContentTextItemDto contentTextItemDto, @Json(name = "subtitle") ContentTextItemDto contentTextItemDto2, @Json(name = "background_color") String str, @Json(name = "action_payload") PayloadDto payloadDto, @Json(name = "metrica_label") String str2) {
        this.title = contentTextItemDto;
        this.subtitle = contentTextItemDto2;
        this.backgroundColor = str;
        this.actionPayload = payloadDto;
        this.metricaLabel = str2;
    }

    public static /* synthetic */ ContentActionButtonDto copy$default(ContentActionButtonDto contentActionButtonDto, ContentTextItemDto contentTextItemDto, ContentTextItemDto contentTextItemDto2, String str, PayloadDto payloadDto, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            contentTextItemDto = contentActionButtonDto.title;
        }
        if ((i & 2) != 0) {
            contentTextItemDto2 = contentActionButtonDto.subtitle;
        }
        if ((i & 4) != 0) {
            str = contentActionButtonDto.backgroundColor;
        }
        if ((i & 8) != 0) {
            payloadDto = contentActionButtonDto.actionPayload;
        }
        if ((i & 16) != 0) {
            str2 = contentActionButtonDto.metricaLabel;
        }
        String str3 = str2;
        String str4 = str;
        return contentActionButtonDto.copy(contentTextItemDto, contentTextItemDto2, str4, payloadDto, str3);
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
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component4, reason: from getter */
    public final PayloadDto getActionPayload() {
        return this.actionPayload;
    }

    /* renamed from: component5, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final ContentActionButtonDto copy(@Json(name = "title") ContentTextItemDto title, @Json(name = "subtitle") ContentTextItemDto subtitle, @Json(name = "background_color") String backgroundColor, @Json(name = "action_payload") PayloadDto actionPayload, @Json(name = "metrica_label") String metricaLabel) {
        return new ContentActionButtonDto(title, subtitle, backgroundColor, actionPayload, metricaLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContentActionButtonDto)) {
            return false;
        }
        ContentActionButtonDto contentActionButtonDto = (ContentActionButtonDto) other;
        return jl40.l(this.title, contentActionButtonDto.title) && jl40.l(this.subtitle, contentActionButtonDto.subtitle) && jl40.l(this.backgroundColor, contentActionButtonDto.backgroundColor) && jl40.l(this.actionPayload, contentActionButtonDto.actionPayload) && jl40.l(this.metricaLabel, contentActionButtonDto.metricaLabel);
    }

    public final PayloadDto getActionPayload() {
        return this.actionPayload;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final ContentTextItemDto getSubtitle() {
        return this.subtitle;
    }

    public final ContentTextItemDto getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        ContentTextItemDto contentTextItemDto = this.subtitle;
        int hashCode2 = (hashCode + (contentTextItemDto == null ? 0 : contentTextItemDto.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        PayloadDto payloadDto = this.actionPayload;
        int hashCode4 = (hashCode3 + (payloadDto == null ? 0 : payloadDto.hashCode())) * 31;
        String str2 = this.metricaLabel;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        ContentTextItemDto contentTextItemDto = this.title;
        ContentTextItemDto contentTextItemDto2 = this.subtitle;
        String str = this.backgroundColor;
        PayloadDto payloadDto = this.actionPayload;
        String str2 = this.metricaLabel;
        StringBuilder sb = new StringBuilder("ContentActionButtonDto(title=");
        sb.append(contentTextItemDto);
        sb.append(", subtitle=");
        sb.append(contentTextItemDto2);
        sb.append(", backgroundColor=");
        sb.append(str);
        sb.append(", actionPayload=");
        sb.append(payloadDto);
        sb.append(", metricaLabel=");
        return oyr.t(sb, str2, Extension.C_BRAKE);
    }
}
