package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.HorizontalPaddingsDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.ResultPositionDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000eHÆ\u0003JW\u0010%\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0003\u0010\t\u001a\u00020\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006,"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/AddressDetailsInputFieldWidgetDto;", "", "widgetId", "", "resultPosition", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ResultPositionDto;", "placeholder", "bubble", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/AddressDetailsBubbleDto;", "field", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/AddressDetailsFieldTypeDto;", "trail1", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotTrailDto;", "horizontalPaddings", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/HorizontalPaddingsDto;", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ResultPositionDto;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/AddressDetailsBubbleDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/AddressDetailsFieldTypeDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotTrailDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/HorizontalPaddingsDto;)V", "getWidgetId", "()Ljava/lang/String;", "getResultPosition", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ResultPositionDto;", "getPlaceholder", "getBubble", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/AddressDetailsBubbleDto;", "getField", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/AddressDetailsFieldTypeDto;", "getTrail1", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotTrailDto;", "getHorizontalPaddings", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/HorizontalPaddingsDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AddressDetailsInputFieldWidgetDto {
    private final AddressDetailsBubbleDto bubble;
    private final AddressDetailsFieldTypeDto field;
    private final HorizontalPaddingsDto horizontalPaddings;
    private final String placeholder;
    private final ResultPositionDto resultPosition;
    private final SlotTrailDto trail1;
    private final String widgetId;

    public AddressDetailsInputFieldWidgetDto(@Json(name = "widget_id") String str, @Json(name = "result_position") ResultPositionDto resultPositionDto, @Json(name = "placeholder") String str2, @Json(name = "bubble") AddressDetailsBubbleDto addressDetailsBubbleDto, @Json(name = "field") AddressDetailsFieldTypeDto addressDetailsFieldTypeDto, @Json(name = "trail1") SlotTrailDto slotTrailDto, @Json(name = "horizontal_paddings") HorizontalPaddingsDto horizontalPaddingsDto) {
        this.widgetId = str;
        this.resultPosition = resultPositionDto;
        this.placeholder = str2;
        this.bubble = addressDetailsBubbleDto;
        this.field = addressDetailsFieldTypeDto;
        this.trail1 = slotTrailDto;
        this.horizontalPaddings = horizontalPaddingsDto;
    }

    public static /* synthetic */ AddressDetailsInputFieldWidgetDto copy$default(AddressDetailsInputFieldWidgetDto addressDetailsInputFieldWidgetDto, String str, ResultPositionDto resultPositionDto, String str2, AddressDetailsBubbleDto addressDetailsBubbleDto, AddressDetailsFieldTypeDto addressDetailsFieldTypeDto, SlotTrailDto slotTrailDto, HorizontalPaddingsDto horizontalPaddingsDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addressDetailsInputFieldWidgetDto.widgetId;
        }
        if ((i & 2) != 0) {
            resultPositionDto = addressDetailsInputFieldWidgetDto.resultPosition;
        }
        if ((i & 4) != 0) {
            str2 = addressDetailsInputFieldWidgetDto.placeholder;
        }
        if ((i & 8) != 0) {
            addressDetailsBubbleDto = addressDetailsInputFieldWidgetDto.bubble;
        }
        if ((i & 16) != 0) {
            addressDetailsFieldTypeDto = addressDetailsInputFieldWidgetDto.field;
        }
        if ((i & 32) != 0) {
            slotTrailDto = addressDetailsInputFieldWidgetDto.trail1;
        }
        if ((i & 64) != 0) {
            horizontalPaddingsDto = addressDetailsInputFieldWidgetDto.horizontalPaddings;
        }
        SlotTrailDto slotTrailDto2 = slotTrailDto;
        HorizontalPaddingsDto horizontalPaddingsDto2 = horizontalPaddingsDto;
        AddressDetailsFieldTypeDto addressDetailsFieldTypeDto2 = addressDetailsFieldTypeDto;
        String str3 = str2;
        return addressDetailsInputFieldWidgetDto.copy(str, resultPositionDto, str3, addressDetailsBubbleDto, addressDetailsFieldTypeDto2, slotTrailDto2, horizontalPaddingsDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getWidgetId() {
        return this.widgetId;
    }

    /* renamed from: component2, reason: from getter */
    public final ResultPositionDto getResultPosition() {
        return this.resultPosition;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    /* renamed from: component4, reason: from getter */
    public final AddressDetailsBubbleDto getBubble() {
        return this.bubble;
    }

    /* renamed from: component5, reason: from getter */
    public final AddressDetailsFieldTypeDto getField() {
        return this.field;
    }

    /* renamed from: component6, reason: from getter */
    public final SlotTrailDto getTrail1() {
        return this.trail1;
    }

    /* renamed from: component7, reason: from getter */
    public final HorizontalPaddingsDto getHorizontalPaddings() {
        return this.horizontalPaddings;
    }

    public final AddressDetailsInputFieldWidgetDto copy(@Json(name = "widget_id") String widgetId, @Json(name = "result_position") ResultPositionDto resultPosition, @Json(name = "placeholder") String placeholder, @Json(name = "bubble") AddressDetailsBubbleDto bubble, @Json(name = "field") AddressDetailsFieldTypeDto field, @Json(name = "trail1") SlotTrailDto trail1, @Json(name = "horizontal_paddings") HorizontalPaddingsDto horizontalPaddings) {
        return new AddressDetailsInputFieldWidgetDto(widgetId, resultPosition, placeholder, bubble, field, trail1, horizontalPaddings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressDetailsInputFieldWidgetDto)) {
            return false;
        }
        AddressDetailsInputFieldWidgetDto addressDetailsInputFieldWidgetDto = (AddressDetailsInputFieldWidgetDto) other;
        return jl40.l(this.widgetId, addressDetailsInputFieldWidgetDto.widgetId) && jl40.l(this.resultPosition, addressDetailsInputFieldWidgetDto.resultPosition) && jl40.l(this.placeholder, addressDetailsInputFieldWidgetDto.placeholder) && jl40.l(this.bubble, addressDetailsInputFieldWidgetDto.bubble) && this.field == addressDetailsInputFieldWidgetDto.field && jl40.l(this.trail1, addressDetailsInputFieldWidgetDto.trail1) && jl40.l(this.horizontalPaddings, addressDetailsInputFieldWidgetDto.horizontalPaddings);
    }

    public final AddressDetailsBubbleDto getBubble() {
        return this.bubble;
    }

    public final AddressDetailsFieldTypeDto getField() {
        return this.field;
    }

    public final HorizontalPaddingsDto getHorizontalPaddings() {
        return this.horizontalPaddings;
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final ResultPositionDto getResultPosition() {
        return this.resultPosition;
    }

    public final SlotTrailDto getTrail1() {
        return this.trail1;
    }

    public final String getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        int hashCode = (this.resultPosition.hashCode() + (this.widgetId.hashCode() * 31)) * 31;
        String str = this.placeholder;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        AddressDetailsBubbleDto addressDetailsBubbleDto = this.bubble;
        int hashCode3 = (this.field.hashCode() + ((hashCode2 + (addressDetailsBubbleDto == null ? 0 : addressDetailsBubbleDto.hashCode())) * 31)) * 31;
        SlotTrailDto slotTrailDto = this.trail1;
        int hashCode4 = (hashCode3 + (slotTrailDto == null ? 0 : slotTrailDto.hashCode())) * 31;
        HorizontalPaddingsDto horizontalPaddingsDto = this.horizontalPaddings;
        return hashCode4 + (horizontalPaddingsDto != null ? horizontalPaddingsDto.hashCode() : 0);
    }

    public String toString() {
        return "AddressDetailsInputFieldWidgetDto(widgetId=" + this.widgetId + ", resultPosition=" + this.resultPosition + ", placeholder=" + this.placeholder + ", bubble=" + this.bubble + ", field=" + this.field + ", trail1=" + this.trail1 + ", horizontalPaddings=" + this.horizontalPaddings + Extension.C_BRAKE;
    }
}
