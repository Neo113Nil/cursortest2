package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.AddressFlowDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.ImageDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00010B_\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0003\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010&\u001a\u00020\u000bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010)\u001a\u00020\u0010HÆ\u0003Ja\u0010*\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0003\u0010\n\u001a\u00020\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0003\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0013\u0010+\u001a\u00020\u00102\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00061"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/HeaderWidgetDto;", "", "widgetId", "", "image", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;", "title", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/HeaderWidgetDto$TitleDto;", "subtitleStyle", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextParametersDto;", "trail", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotTrailDto;", "trail2", "addressFlow", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressFlowDto;", "showSubtitle", "", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/HeaderWidgetDto$TitleDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextParametersDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotTrailDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotTrailDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressFlowDto;Z)V", "getWidgetId", "()Ljava/lang/String;", "getImage", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;", "getTitle", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/HeaderWidgetDto$TitleDto;", "getSubtitleStyle", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextParametersDto;", "getTrail", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotTrailDto;", "getTrail2", "getAddressFlow", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressFlowDto;", "getShowSubtitle", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "TitleDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class HeaderWidgetDto {
    private final AddressFlowDto addressFlow;
    private final ImageDto image;
    private final boolean showSubtitle;
    private final TextParametersDto subtitleStyle;
    private final TitleDto title;
    private final SlotTrailDto trail;
    private final SlotTrailDto trail2;
    private final String widgetId;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/HeaderWidgetDto$TitleDto;", "", "ru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/a", "ru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/b", "ru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/c", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class TitleDto {
    }

    public /* synthetic */ HeaderWidgetDto(String str, ImageDto imageDto, TitleDto titleDto, TextParametersDto textParametersDto, SlotTrailDto slotTrailDto, SlotTrailDto slotTrailDto2, AddressFlowDto addressFlowDto, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, imageDto, titleDto, textParametersDto, slotTrailDto, slotTrailDto2, addressFlowDto, (i & 128) != 0 ? true : z);
    }

    public static /* synthetic */ HeaderWidgetDto copy$default(HeaderWidgetDto headerWidgetDto, String str, ImageDto imageDto, TitleDto titleDto, TextParametersDto textParametersDto, SlotTrailDto slotTrailDto, SlotTrailDto slotTrailDto2, AddressFlowDto addressFlowDto, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = headerWidgetDto.widgetId;
        }
        if ((i & 2) != 0) {
            imageDto = headerWidgetDto.image;
        }
        if ((i & 4) != 0) {
            titleDto = headerWidgetDto.title;
        }
        if ((i & 8) != 0) {
            textParametersDto = headerWidgetDto.subtitleStyle;
        }
        if ((i & 16) != 0) {
            slotTrailDto = headerWidgetDto.trail;
        }
        if ((i & 32) != 0) {
            slotTrailDto2 = headerWidgetDto.trail2;
        }
        if ((i & 64) != 0) {
            addressFlowDto = headerWidgetDto.addressFlow;
        }
        if ((i & 128) != 0) {
            z = headerWidgetDto.showSubtitle;
        }
        AddressFlowDto addressFlowDto2 = addressFlowDto;
        boolean z2 = z;
        SlotTrailDto slotTrailDto3 = slotTrailDto;
        SlotTrailDto slotTrailDto4 = slotTrailDto2;
        return headerWidgetDto.copy(str, imageDto, titleDto, textParametersDto, slotTrailDto3, slotTrailDto4, addressFlowDto2, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getWidgetId() {
        return this.widgetId;
    }

    /* renamed from: component2, reason: from getter */
    public final ImageDto getImage() {
        return this.image;
    }

    /* renamed from: component3, reason: from getter */
    public final TitleDto getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final TextParametersDto getSubtitleStyle() {
        return this.subtitleStyle;
    }

    /* renamed from: component5, reason: from getter */
    public final SlotTrailDto getTrail() {
        return this.trail;
    }

    /* renamed from: component6, reason: from getter */
    public final SlotTrailDto getTrail2() {
        return this.trail2;
    }

    /* renamed from: component7, reason: from getter */
    public final AddressFlowDto getAddressFlow() {
        return this.addressFlow;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getShowSubtitle() {
        return this.showSubtitle;
    }

    public final HeaderWidgetDto copy(@Json(name = "widget_id") String widgetId, @Json(name = "image") ImageDto image, @Json(name = "title") TitleDto title, @Json(name = "subtitle_style") TextParametersDto subtitleStyle, @Json(name = "trail") SlotTrailDto trail, @Json(name = "trail2") SlotTrailDto trail2, @Json(name = "address_flow") AddressFlowDto addressFlow, @Json(name = "show_subtitle") boolean showSubtitle) {
        return new HeaderWidgetDto(widgetId, image, title, subtitleStyle, trail, trail2, addressFlow, showSubtitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeaderWidgetDto)) {
            return false;
        }
        HeaderWidgetDto headerWidgetDto = (HeaderWidgetDto) other;
        return jl40.l(this.widgetId, headerWidgetDto.widgetId) && jl40.l(this.image, headerWidgetDto.image) && jl40.l(this.title, headerWidgetDto.title) && jl40.l(this.subtitleStyle, headerWidgetDto.subtitleStyle) && jl40.l(this.trail, headerWidgetDto.trail) && jl40.l(this.trail2, headerWidgetDto.trail2) && jl40.l(this.addressFlow, headerWidgetDto.addressFlow) && this.showSubtitle == headerWidgetDto.showSubtitle;
    }

    public final AddressFlowDto getAddressFlow() {
        return this.addressFlow;
    }

    public final ImageDto getImage() {
        return this.image;
    }

    public final boolean getShowSubtitle() {
        return this.showSubtitle;
    }

    public final TextParametersDto getSubtitleStyle() {
        return this.subtitleStyle;
    }

    public final TitleDto getTitle() {
        return this.title;
    }

    public final SlotTrailDto getTrail() {
        return this.trail;
    }

    public final SlotTrailDto getTrail2() {
        return this.trail2;
    }

    public final String getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        int hashCode = this.widgetId.hashCode() * 31;
        ImageDto imageDto = this.image;
        int hashCode2 = (this.title.hashCode() + ((hashCode + (imageDto == null ? 0 : imageDto.hashCode())) * 31)) * 31;
        TextParametersDto textParametersDto = this.subtitleStyle;
        int hashCode3 = (this.trail.hashCode() + ((hashCode2 + (textParametersDto == null ? 0 : textParametersDto.hashCode())) * 31)) * 31;
        SlotTrailDto slotTrailDto = this.trail2;
        int hashCode4 = (hashCode3 + (slotTrailDto == null ? 0 : slotTrailDto.hashCode())) * 31;
        AddressFlowDto addressFlowDto = this.addressFlow;
        return Boolean.hashCode(this.showSubtitle) + ((hashCode4 + (addressFlowDto != null ? addressFlowDto.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "HeaderWidgetDto(widgetId=" + this.widgetId + ", image=" + this.image + ", title=" + this.title + ", subtitleStyle=" + this.subtitleStyle + ", trail=" + this.trail + ", trail2=" + this.trail2 + ", addressFlow=" + this.addressFlow + ", showSubtitle=" + this.showSubtitle + Extension.C_BRAKE;
    }

    public HeaderWidgetDto(@Json(name = "widget_id") String str, @Json(name = "image") ImageDto imageDto, @Json(name = "title") TitleDto titleDto, @Json(name = "subtitle_style") TextParametersDto textParametersDto, @Json(name = "trail") SlotTrailDto slotTrailDto, @Json(name = "trail2") SlotTrailDto slotTrailDto2, @Json(name = "address_flow") AddressFlowDto addressFlowDto, @Json(name = "show_subtitle") boolean z) {
        this.widgetId = str;
        this.image = imageDto;
        this.title = titleDto;
        this.subtitleStyle = textParametersDto;
        this.trail = slotTrailDto;
        this.trail2 = slotTrailDto2;
        this.addressFlow = addressFlowDto;
        this.showSubtitle = z;
    }
}
