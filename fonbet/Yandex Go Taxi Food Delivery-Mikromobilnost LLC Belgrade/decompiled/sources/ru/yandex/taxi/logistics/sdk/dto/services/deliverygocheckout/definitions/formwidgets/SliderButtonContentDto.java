package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.jl40;
import defpackage.x4e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0003\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003JA\u0010\u001a\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0003\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0014¨\u0006 "}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SliderButtonContentDto;", "", "title", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "subtitle", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "", "handler", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SliderHandlerDto;", "isShimmering", "", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SliderHandlerDto;Z)V", "getTitle", "()Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "getSubtitle", "getBackgroundColor", "()Ljava/lang/String;", "getHandler", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SliderHandlerDto;", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SliderButtonContentDto {
    private final String backgroundColor;
    private final SliderHandlerDto handler;
    private final boolean isShimmering;
    private final AttributedTextDto subtitle;
    private final AttributedTextDto title;

    public /* synthetic */ SliderButtonContentDto(AttributedTextDto attributedTextDto, AttributedTextDto attributedTextDto2, String str, SliderHandlerDto sliderHandlerDto, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(attributedTextDto, attributedTextDto2, str, sliderHandlerDto, (i & 16) != 0 ? false : z);
    }

    public static /* synthetic */ SliderButtonContentDto copy$default(SliderButtonContentDto sliderButtonContentDto, AttributedTextDto attributedTextDto, AttributedTextDto attributedTextDto2, String str, SliderHandlerDto sliderHandlerDto, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            attributedTextDto = sliderButtonContentDto.title;
        }
        if ((i & 2) != 0) {
            attributedTextDto2 = sliderButtonContentDto.subtitle;
        }
        if ((i & 4) != 0) {
            str = sliderButtonContentDto.backgroundColor;
        }
        if ((i & 8) != 0) {
            sliderHandlerDto = sliderButtonContentDto.handler;
        }
        if ((i & 16) != 0) {
            z = sliderButtonContentDto.isShimmering;
        }
        boolean z2 = z;
        String str2 = str;
        return sliderButtonContentDto.copy(attributedTextDto, attributedTextDto2, str2, sliderHandlerDto, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final AttributedTextDto getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final AttributedTextDto getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component4, reason: from getter */
    public final SliderHandlerDto getHandler() {
        return this.handler;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsShimmering() {
        return this.isShimmering;
    }

    public final SliderButtonContentDto copy(@Json(name = "title") AttributedTextDto title, @Json(name = "subtitle") AttributedTextDto subtitle, @Json(name = "background_color") String backgroundColor, @Json(name = "handler") SliderHandlerDto handler, @Json(name = "is_shimmering") boolean isShimmering) {
        return new SliderButtonContentDto(title, subtitle, backgroundColor, handler, isShimmering);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SliderButtonContentDto)) {
            return false;
        }
        SliderButtonContentDto sliderButtonContentDto = (SliderButtonContentDto) other;
        return jl40.l(this.title, sliderButtonContentDto.title) && jl40.l(this.subtitle, sliderButtonContentDto.subtitle) && jl40.l(this.backgroundColor, sliderButtonContentDto.backgroundColor) && jl40.l(this.handler, sliderButtonContentDto.handler) && this.isShimmering == sliderButtonContentDto.isShimmering;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final SliderHandlerDto getHandler() {
        return this.handler;
    }

    public final AttributedTextDto getSubtitle() {
        return this.subtitle;
    }

    public final AttributedTextDto getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        AttributedTextDto attributedTextDto = this.subtitle;
        int hashCode2 = (hashCode + (attributedTextDto == null ? 0 : attributedTextDto.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        SliderHandlerDto sliderHandlerDto = this.handler;
        return Boolean.hashCode(this.isShimmering) + ((hashCode3 + (sliderHandlerDto != null ? sliderHandlerDto.hashCode() : 0)) * 31);
    }

    public final boolean isShimmering() {
        return this.isShimmering;
    }

    public String toString() {
        AttributedTextDto attributedTextDto = this.title;
        AttributedTextDto attributedTextDto2 = this.subtitle;
        String str = this.backgroundColor;
        SliderHandlerDto sliderHandlerDto = this.handler;
        boolean z = this.isShimmering;
        StringBuilder sb = new StringBuilder("SliderButtonContentDto(title=");
        sb.append(attributedTextDto);
        sb.append(", subtitle=");
        sb.append(attributedTextDto2);
        sb.append(", backgroundColor=");
        sb.append(str);
        sb.append(", handler=");
        sb.append(sliderHandlerDto);
        sb.append(", isShimmering=");
        return x4e.i(sb, z, Extension.C_BRAKE);
    }

    public SliderButtonContentDto(@Json(name = "title") AttributedTextDto attributedTextDto, @Json(name = "subtitle") AttributedTextDto attributedTextDto2, @Json(name = "background_color") String str, @Json(name = "handler") SliderHandlerDto sliderHandlerDto, @Json(name = "is_shimmering") boolean z) {
        this.title = attributedTextDto;
        this.subtitle = attributedTextDto2;
        this.backgroundColor = str;
        this.handler = sliderHandlerDto;
        this.isShimmering = z;
    }
}
