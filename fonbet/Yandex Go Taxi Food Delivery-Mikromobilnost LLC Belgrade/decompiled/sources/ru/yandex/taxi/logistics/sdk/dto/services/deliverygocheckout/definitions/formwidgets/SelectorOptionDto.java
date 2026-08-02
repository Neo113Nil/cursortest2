package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.TapActionDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\f\b\u0001\u0010\u0002\u001a\u00060\u0001j\u0002`\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u001d\u001a\u00060\u0001j\u0002`\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000eHÆ\u0003Jg\u0010%\u001a\u00020\u00002\f\b\u0003\u0010\u0002\u001a\u00060\u0001j\u0002`\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010&\u001a\u00020\u00052\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\nHÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0001j\u0002`\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006+"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SelectorOptionDto;", "", "value", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/FormStateValueDto;", "isAvailable", "", "title", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "subtitle", "imageTag", "", "bottomText", "bottomSubtitle", "action", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "<init>", "(Ljava/lang/Object;ZLru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;)V", "getValue", "()Ljava/lang/Object;", "()Z", "getTitle", "()Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "getSubtitle", "getImageTag", "()Ljava/lang/String;", "getBottomText", "getBottomSubtitle", "getAction", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SelectorOptionDto {
    private final TapActionDto action;
    private final AttributedTextDto bottomSubtitle;
    private final AttributedTextDto bottomText;
    private final String imageTag;
    private final boolean isAvailable;
    private final AttributedTextDto subtitle;
    private final AttributedTextDto title;
    private final Object value;

    public SelectorOptionDto(@Json(name = "value") Object obj, @Json(name = "is_available") boolean z, @Json(name = "title") AttributedTextDto attributedTextDto, @Json(name = "subtitle") AttributedTextDto attributedTextDto2, @Json(name = "image_tag") String str, @Json(name = "bottom_text") AttributedTextDto attributedTextDto3, @Json(name = "bottom_subtitle") AttributedTextDto attributedTextDto4, @Json(name = "action") TapActionDto tapActionDto) {
        this.value = obj;
        this.isAvailable = z;
        this.title = attributedTextDto;
        this.subtitle = attributedTextDto2;
        this.imageTag = str;
        this.bottomText = attributedTextDto3;
        this.bottomSubtitle = attributedTextDto4;
        this.action = tapActionDto;
    }

    public static /* synthetic */ SelectorOptionDto copy$default(SelectorOptionDto selectorOptionDto, Object obj, boolean z, AttributedTextDto attributedTextDto, AttributedTextDto attributedTextDto2, String str, AttributedTextDto attributedTextDto3, AttributedTextDto attributedTextDto4, TapActionDto tapActionDto, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = selectorOptionDto.value;
        }
        if ((i & 2) != 0) {
            z = selectorOptionDto.isAvailable;
        }
        if ((i & 4) != 0) {
            attributedTextDto = selectorOptionDto.title;
        }
        if ((i & 8) != 0) {
            attributedTextDto2 = selectorOptionDto.subtitle;
        }
        if ((i & 16) != 0) {
            str = selectorOptionDto.imageTag;
        }
        if ((i & 32) != 0) {
            attributedTextDto3 = selectorOptionDto.bottomText;
        }
        if ((i & 64) != 0) {
            attributedTextDto4 = selectorOptionDto.bottomSubtitle;
        }
        if ((i & 128) != 0) {
            tapActionDto = selectorOptionDto.action;
        }
        AttributedTextDto attributedTextDto5 = attributedTextDto4;
        TapActionDto tapActionDto2 = tapActionDto;
        String str2 = str;
        AttributedTextDto attributedTextDto6 = attributedTextDto3;
        return selectorOptionDto.copy(obj, z, attributedTextDto, attributedTextDto2, str2, attributedTextDto6, attributedTextDto5, tapActionDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final Object getValue() {
        return this.value;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsAvailable() {
        return this.isAvailable;
    }

    /* renamed from: component3, reason: from getter */
    public final AttributedTextDto getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final AttributedTextDto getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component5, reason: from getter */
    public final String getImageTag() {
        return this.imageTag;
    }

    /* renamed from: component6, reason: from getter */
    public final AttributedTextDto getBottomText() {
        return this.bottomText;
    }

    /* renamed from: component7, reason: from getter */
    public final AttributedTextDto getBottomSubtitle() {
        return this.bottomSubtitle;
    }

    /* renamed from: component8, reason: from getter */
    public final TapActionDto getAction() {
        return this.action;
    }

    public final SelectorOptionDto copy(@Json(name = "value") Object value, @Json(name = "is_available") boolean isAvailable, @Json(name = "title") AttributedTextDto title, @Json(name = "subtitle") AttributedTextDto subtitle, @Json(name = "image_tag") String imageTag, @Json(name = "bottom_text") AttributedTextDto bottomText, @Json(name = "bottom_subtitle") AttributedTextDto bottomSubtitle, @Json(name = "action") TapActionDto action) {
        return new SelectorOptionDto(value, isAvailable, title, subtitle, imageTag, bottomText, bottomSubtitle, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectorOptionDto)) {
            return false;
        }
        SelectorOptionDto selectorOptionDto = (SelectorOptionDto) other;
        return jl40.l(this.value, selectorOptionDto.value) && this.isAvailable == selectorOptionDto.isAvailable && jl40.l(this.title, selectorOptionDto.title) && jl40.l(this.subtitle, selectorOptionDto.subtitle) && jl40.l(this.imageTag, selectorOptionDto.imageTag) && jl40.l(this.bottomText, selectorOptionDto.bottomText) && jl40.l(this.bottomSubtitle, selectorOptionDto.bottomSubtitle) && jl40.l(this.action, selectorOptionDto.action);
    }

    public final TapActionDto getAction() {
        return this.action;
    }

    public final AttributedTextDto getBottomSubtitle() {
        return this.bottomSubtitle;
    }

    public final AttributedTextDto getBottomText() {
        return this.bottomText;
    }

    public final String getImageTag() {
        return this.imageTag;
    }

    public final AttributedTextDto getSubtitle() {
        return this.subtitle;
    }

    public final AttributedTextDto getTitle() {
        return this.title;
    }

    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        int e = ly3.e(this.title, unr0.e(this.value.hashCode() * 31, 31, this.isAvailable), 31);
        AttributedTextDto attributedTextDto = this.subtitle;
        int hashCode = (e + (attributedTextDto == null ? 0 : attributedTextDto.hashCode())) * 31;
        String str = this.imageTag;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        AttributedTextDto attributedTextDto2 = this.bottomText;
        int hashCode3 = (hashCode2 + (attributedTextDto2 == null ? 0 : attributedTextDto2.hashCode())) * 31;
        AttributedTextDto attributedTextDto3 = this.bottomSubtitle;
        int hashCode4 = (hashCode3 + (attributedTextDto3 == null ? 0 : attributedTextDto3.hashCode())) * 31;
        TapActionDto tapActionDto = this.action;
        return hashCode4 + (tapActionDto != null ? tapActionDto.hashCode() : 0);
    }

    public final boolean isAvailable() {
        return this.isAvailable;
    }

    public String toString() {
        return "SelectorOptionDto(value=" + this.value + ", isAvailable=" + this.isAvailable + ", title=" + this.title + ", subtitle=" + this.subtitle + ", imageTag=" + this.imageTag + ", bottomText=" + this.bottomText + ", bottomSubtitle=" + this.bottomSubtitle + ", action=" + this.action + Extension.C_BRAKE;
    }
}
