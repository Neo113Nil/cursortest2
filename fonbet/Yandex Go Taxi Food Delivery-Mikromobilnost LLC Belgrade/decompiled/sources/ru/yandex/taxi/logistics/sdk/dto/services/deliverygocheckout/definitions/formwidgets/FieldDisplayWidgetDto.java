package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.ly3;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.SlotLeadDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.TapActionDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001?B\u008d\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0001\u0010\r\u001a\u00020\n\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\bHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u00102\u001a\u00020\nHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u008f\u0001\u00108\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0003\u0010\r\u001a\u00020\n2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020=HÖ\u0001J\t\u0010>\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0019¨\u0006@"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/FieldDisplayWidgetDto;", "", "widgetId", "", "fieldPosition", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/FieldDisplayWidgetDto$FieldPositionDto;", "formStateKey", "fieldStyle", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextParametersDto;", "filledDescription", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "filledLead", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/SlotLeadDto;", "emptyDescription", "emptyLead", "trail", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotTrailDto;", "action", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "style", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotStyleDto;", "metricaLabel", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/FieldDisplayWidgetDto$FieldPositionDto;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextParametersDto;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/SlotLeadDto;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/SlotLeadDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotTrailDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotStyleDto;Ljava/lang/String;)V", "getWidgetId", "()Ljava/lang/String;", "getFieldPosition", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/FieldDisplayWidgetDto$FieldPositionDto;", "getFormStateKey", "getFieldStyle", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextParametersDto;", "getFilledDescription", "()Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "getFilledLead", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/SlotLeadDto;", "getEmptyDescription", "getEmptyLead", "getTrail", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotTrailDto;", "getAction", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "getStyle", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotStyleDto;", "getMetricaLabel", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", "other", "hashCode", "", "toString", "FieldPositionDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FieldDisplayWidgetDto {
    private final TapActionDto action;
    private final AttributedTextDto emptyDescription;
    private final SlotLeadDto emptyLead;
    private final FieldPositionDto fieldPosition;
    private final TextParametersDto fieldStyle;
    private final AttributedTextDto filledDescription;
    private final SlotLeadDto filledLead;
    private final String formStateKey;
    private final String metricaLabel;
    private final SlotStyleDto style;
    private final SlotTrailDto trail;
    private final String widgetId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/FieldDisplayWidgetDto$FieldPositionDto;", "", "<init>", "(Ljava/lang/String;I)V", "TITLE", "SUBTITLE", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FieldPositionDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ FieldPositionDto[] $VALUES;

        @Json(name = "title")
        public static final FieldPositionDto TITLE = new FieldPositionDto("TITLE", 0);

        @Json(name = "subtitle")
        public static final FieldPositionDto SUBTITLE = new FieldPositionDto("SUBTITLE", 1);

        private static final /* synthetic */ FieldPositionDto[] $values() {
            return new FieldPositionDto[]{TITLE, SUBTITLE};
        }

        static {
            FieldPositionDto[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private FieldPositionDto(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static FieldPositionDto valueOf(String str) {
            return (FieldPositionDto) Enum.valueOf(FieldPositionDto.class, str);
        }

        public static FieldPositionDto[] values() {
            return (FieldPositionDto[]) $VALUES.clone();
        }
    }

    public FieldDisplayWidgetDto(@Json(name = "widget_id") String str, @Json(name = "field_position") FieldPositionDto fieldPositionDto, @Json(name = "form_state_key") String str2, @Json(name = "field_style") TextParametersDto textParametersDto, @Json(name = "filled_description") AttributedTextDto attributedTextDto, @Json(name = "filled_lead") SlotLeadDto slotLeadDto, @Json(name = "empty_description") AttributedTextDto attributedTextDto2, @Json(name = "empty_lead") SlotLeadDto slotLeadDto2, @Json(name = "trail") SlotTrailDto slotTrailDto, @Json(name = "action") TapActionDto tapActionDto, @Json(name = "style") SlotStyleDto slotStyleDto, @Json(name = "metrica_label") String str3) {
        this.widgetId = str;
        this.fieldPosition = fieldPositionDto;
        this.formStateKey = str2;
        this.fieldStyle = textParametersDto;
        this.filledDescription = attributedTextDto;
        this.filledLead = slotLeadDto;
        this.emptyDescription = attributedTextDto2;
        this.emptyLead = slotLeadDto2;
        this.trail = slotTrailDto;
        this.action = tapActionDto;
        this.style = slotStyleDto;
        this.metricaLabel = str3;
    }

    public static /* synthetic */ FieldDisplayWidgetDto copy$default(FieldDisplayWidgetDto fieldDisplayWidgetDto, String str, FieldPositionDto fieldPositionDto, String str2, TextParametersDto textParametersDto, AttributedTextDto attributedTextDto, SlotLeadDto slotLeadDto, AttributedTextDto attributedTextDto2, SlotLeadDto slotLeadDto2, SlotTrailDto slotTrailDto, TapActionDto tapActionDto, SlotStyleDto slotStyleDto, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fieldDisplayWidgetDto.widgetId;
        }
        if ((i & 2) != 0) {
            fieldPositionDto = fieldDisplayWidgetDto.fieldPosition;
        }
        if ((i & 4) != 0) {
            str2 = fieldDisplayWidgetDto.formStateKey;
        }
        if ((i & 8) != 0) {
            textParametersDto = fieldDisplayWidgetDto.fieldStyle;
        }
        if ((i & 16) != 0) {
            attributedTextDto = fieldDisplayWidgetDto.filledDescription;
        }
        if ((i & 32) != 0) {
            slotLeadDto = fieldDisplayWidgetDto.filledLead;
        }
        if ((i & 64) != 0) {
            attributedTextDto2 = fieldDisplayWidgetDto.emptyDescription;
        }
        if ((i & 128) != 0) {
            slotLeadDto2 = fieldDisplayWidgetDto.emptyLead;
        }
        if ((i & 256) != 0) {
            slotTrailDto = fieldDisplayWidgetDto.trail;
        }
        if ((i & 512) != 0) {
            tapActionDto = fieldDisplayWidgetDto.action;
        }
        if ((i & 1024) != 0) {
            slotStyleDto = fieldDisplayWidgetDto.style;
        }
        if ((i & 2048) != 0) {
            str3 = fieldDisplayWidgetDto.metricaLabel;
        }
        SlotStyleDto slotStyleDto2 = slotStyleDto;
        String str4 = str3;
        SlotTrailDto slotTrailDto2 = slotTrailDto;
        TapActionDto tapActionDto2 = tapActionDto;
        AttributedTextDto attributedTextDto3 = attributedTextDto2;
        SlotLeadDto slotLeadDto3 = slotLeadDto2;
        AttributedTextDto attributedTextDto4 = attributedTextDto;
        SlotLeadDto slotLeadDto4 = slotLeadDto;
        return fieldDisplayWidgetDto.copy(str, fieldPositionDto, str2, textParametersDto, attributedTextDto4, slotLeadDto4, attributedTextDto3, slotLeadDto3, slotTrailDto2, tapActionDto2, slotStyleDto2, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getWidgetId() {
        return this.widgetId;
    }

    /* renamed from: component10, reason: from getter */
    public final TapActionDto getAction() {
        return this.action;
    }

    /* renamed from: component11, reason: from getter */
    public final SlotStyleDto getStyle() {
        return this.style;
    }

    /* renamed from: component12, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    /* renamed from: component2, reason: from getter */
    public final FieldPositionDto getFieldPosition() {
        return this.fieldPosition;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFormStateKey() {
        return this.formStateKey;
    }

    /* renamed from: component4, reason: from getter */
    public final TextParametersDto getFieldStyle() {
        return this.fieldStyle;
    }

    /* renamed from: component5, reason: from getter */
    public final AttributedTextDto getFilledDescription() {
        return this.filledDescription;
    }

    /* renamed from: component6, reason: from getter */
    public final SlotLeadDto getFilledLead() {
        return this.filledLead;
    }

    /* renamed from: component7, reason: from getter */
    public final AttributedTextDto getEmptyDescription() {
        return this.emptyDescription;
    }

    /* renamed from: component8, reason: from getter */
    public final SlotLeadDto getEmptyLead() {
        return this.emptyLead;
    }

    /* renamed from: component9, reason: from getter */
    public final SlotTrailDto getTrail() {
        return this.trail;
    }

    public final FieldDisplayWidgetDto copy(@Json(name = "widget_id") String widgetId, @Json(name = "field_position") FieldPositionDto fieldPosition, @Json(name = "form_state_key") String formStateKey, @Json(name = "field_style") TextParametersDto fieldStyle, @Json(name = "filled_description") AttributedTextDto filledDescription, @Json(name = "filled_lead") SlotLeadDto filledLead, @Json(name = "empty_description") AttributedTextDto emptyDescription, @Json(name = "empty_lead") SlotLeadDto emptyLead, @Json(name = "trail") SlotTrailDto trail, @Json(name = "action") TapActionDto action, @Json(name = "style") SlotStyleDto style, @Json(name = "metrica_label") String metricaLabel) {
        return new FieldDisplayWidgetDto(widgetId, fieldPosition, formStateKey, fieldStyle, filledDescription, filledLead, emptyDescription, emptyLead, trail, action, style, metricaLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FieldDisplayWidgetDto)) {
            return false;
        }
        FieldDisplayWidgetDto fieldDisplayWidgetDto = (FieldDisplayWidgetDto) other;
        return jl40.l(this.widgetId, fieldDisplayWidgetDto.widgetId) && this.fieldPosition == fieldDisplayWidgetDto.fieldPosition && jl40.l(this.formStateKey, fieldDisplayWidgetDto.formStateKey) && jl40.l(this.fieldStyle, fieldDisplayWidgetDto.fieldStyle) && jl40.l(this.filledDescription, fieldDisplayWidgetDto.filledDescription) && jl40.l(this.filledLead, fieldDisplayWidgetDto.filledLead) && jl40.l(this.emptyDescription, fieldDisplayWidgetDto.emptyDescription) && jl40.l(this.emptyLead, fieldDisplayWidgetDto.emptyLead) && jl40.l(this.trail, fieldDisplayWidgetDto.trail) && jl40.l(this.action, fieldDisplayWidgetDto.action) && jl40.l(this.style, fieldDisplayWidgetDto.style) && jl40.l(this.metricaLabel, fieldDisplayWidgetDto.metricaLabel);
    }

    public final TapActionDto getAction() {
        return this.action;
    }

    public final AttributedTextDto getEmptyDescription() {
        return this.emptyDescription;
    }

    public final SlotLeadDto getEmptyLead() {
        return this.emptyLead;
    }

    public final FieldPositionDto getFieldPosition() {
        return this.fieldPosition;
    }

    public final TextParametersDto getFieldStyle() {
        return this.fieldStyle;
    }

    public final AttributedTextDto getFilledDescription() {
        return this.filledDescription;
    }

    public final SlotLeadDto getFilledLead() {
        return this.filledLead;
    }

    public final String getFormStateKey() {
        return this.formStateKey;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final SlotStyleDto getStyle() {
        return this.style;
    }

    public final SlotTrailDto getTrail() {
        return this.trail;
    }

    public final String getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        int hashCode = (this.fieldStyle.hashCode() + unr0.b((this.fieldPosition.hashCode() + (this.widgetId.hashCode() * 31)) * 31, 31, this.formStateKey)) * 31;
        AttributedTextDto attributedTextDto = this.filledDescription;
        int hashCode2 = (hashCode + (attributedTextDto == null ? 0 : attributedTextDto.hashCode())) * 31;
        SlotLeadDto slotLeadDto = this.filledLead;
        int e = ly3.e(this.emptyDescription, (hashCode2 + (slotLeadDto == null ? 0 : slotLeadDto.hashCode())) * 31, 31);
        SlotLeadDto slotLeadDto2 = this.emptyLead;
        int hashCode3 = (e + (slotLeadDto2 == null ? 0 : slotLeadDto2.hashCode())) * 31;
        SlotTrailDto slotTrailDto = this.trail;
        int hashCode4 = (hashCode3 + (slotTrailDto == null ? 0 : slotTrailDto.hashCode())) * 31;
        TapActionDto tapActionDto = this.action;
        int hashCode5 = (hashCode4 + (tapActionDto == null ? 0 : tapActionDto.hashCode())) * 31;
        SlotStyleDto slotStyleDto = this.style;
        int hashCode6 = (hashCode5 + (slotStyleDto == null ? 0 : slotStyleDto.hashCode())) * 31;
        String str = this.metricaLabel;
        return hashCode6 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "FieldDisplayWidgetDto(widgetId=" + this.widgetId + ", fieldPosition=" + this.fieldPosition + ", formStateKey=" + this.formStateKey + ", fieldStyle=" + this.fieldStyle + ", filledDescription=" + this.filledDescription + ", filledLead=" + this.filledLead + ", emptyDescription=" + this.emptyDescription + ", emptyLead=" + this.emptyLead + ", trail=" + this.trail + ", action=" + this.action + ", style=" + this.style + ", metricaLabel=" + this.metricaLabel + Extension.C_BRAKE;
    }
}
