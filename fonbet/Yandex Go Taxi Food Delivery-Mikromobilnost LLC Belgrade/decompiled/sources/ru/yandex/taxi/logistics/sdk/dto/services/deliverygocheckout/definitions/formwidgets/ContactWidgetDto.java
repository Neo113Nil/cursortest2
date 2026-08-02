package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.adjust.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.ly3;
import defpackage.n;
import defpackage.x4e;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.HorizontalPaddingsDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.ResultPositionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.SlotLeadDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001OB»\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u001a\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u00109\u001a\u00020\u0003HÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010!J\u000b\u0010;\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010=\u001a\u00020\u000bHÆ\u0003J\t\u0010>\u001a\u00020\u000bHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010G\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u001bHÆ\u0003JÂ\u0001\u0010H\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0003\u0010\n\u001a\u00020\u000b2\b\b\u0003\u0010\f\u001a\u00020\u000b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u001a\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u001bHÆ\u0001¢\u0006\u0002\u0010IJ\u0013\u0010J\u001a\u00020K2\b\u0010L\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010M\u001a\u00020\u0005HÖ\u0001J\t\u0010N\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b.\u0010-R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b1\u00100R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u001fR\u0019\u0010\u001a\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u001b¢\u0006\b\n\u0000\u001a\u0004\b7\u00108¨\u0006P"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ContactWidgetDto;", "", "widgetId", "", "routePointIndex", "", "resultPosition", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ResultPositionDto;", "contactPosition", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ContactWidgetDto$ContactPositionDto;", "selectedDescription", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "unselectedDescription", "contactStyle", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextParametersDto;", "selectedLead", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/SlotLeadDto;", "unselectedLead", "trail", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotTrailDto;", "unselectedTrail", "prefill", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ContactPrefillDto;", "horizontalPaddings", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/HorizontalPaddingsDto;", "metricaLabel", Constants.REFERRER_API_META, "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/MetadataDto;", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ResultPositionDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ContactWidgetDto$ContactPositionDto;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextParametersDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/SlotLeadDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/SlotLeadDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotTrailDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotTrailDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ContactPrefillDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/HorizontalPaddingsDto;Ljava/lang/String;Ljava/lang/Object;)V", "getWidgetId", "()Ljava/lang/String;", "getRoutePointIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getResultPosition", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ResultPositionDto;", "getContactPosition", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ContactWidgetDto$ContactPositionDto;", "getSelectedDescription", "()Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "getUnselectedDescription", "getContactStyle", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextParametersDto;", "getSelectedLead", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/SlotLeadDto;", "getUnselectedLead", "getTrail", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotTrailDto;", "getUnselectedTrail", "getPrefill", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ContactPrefillDto;", "getHorizontalPaddings", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/HorizontalPaddingsDto;", "getMetricaLabel", "getMeta", "()Ljava/lang/Object;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ResultPositionDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ContactWidgetDto$ContactPositionDto;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextParametersDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/SlotLeadDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/SlotLeadDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotTrailDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotTrailDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ContactPrefillDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/HorizontalPaddingsDto;Ljava/lang/String;Ljava/lang/Object;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ContactWidgetDto;", "equals", "", "other", "hashCode", "toString", "ContactPositionDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ContactWidgetDto {
    private final ContactPositionDto contactPosition;
    private final TextParametersDto contactStyle;
    private final HorizontalPaddingsDto horizontalPaddings;
    private final Object meta;
    private final String metricaLabel;
    private final ContactPrefillDto prefill;
    private final ResultPositionDto resultPosition;
    private final Integer routePointIndex;
    private final AttributedTextDto selectedDescription;
    private final SlotLeadDto selectedLead;
    private final SlotTrailDto trail;
    private final AttributedTextDto unselectedDescription;
    private final SlotLeadDto unselectedLead;
    private final SlotTrailDto unselectedTrail;
    private final String widgetId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ContactWidgetDto$ContactPositionDto;", "", "<init>", "(Ljava/lang/String;I)V", "TITLE", "SUBTITLE", "TRAIL", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ContactPositionDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ContactPositionDto[] $VALUES;

        @Json(name = "title")
        public static final ContactPositionDto TITLE = new ContactPositionDto("TITLE", 0);

        @Json(name = "subtitle")
        public static final ContactPositionDto SUBTITLE = new ContactPositionDto("SUBTITLE", 1);

        @Json(name = "trail")
        public static final ContactPositionDto TRAIL = new ContactPositionDto("TRAIL", 2);

        private static final /* synthetic */ ContactPositionDto[] $values() {
            return new ContactPositionDto[]{TITLE, SUBTITLE, TRAIL};
        }

        static {
            ContactPositionDto[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private ContactPositionDto(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static ContactPositionDto valueOf(String str) {
            return (ContactPositionDto) Enum.valueOf(ContactPositionDto.class, str);
        }

        public static ContactPositionDto[] values() {
            return (ContactPositionDto[]) $VALUES.clone();
        }
    }

    public ContactWidgetDto(@Json(name = "widget_id") String str, @Json(name = "route_point_index") Integer num, @Json(name = "result_position") ResultPositionDto resultPositionDto, @Json(name = "contact_position") ContactPositionDto contactPositionDto, @Json(name = "selected_description") AttributedTextDto attributedTextDto, @Json(name = "unselected_description") AttributedTextDto attributedTextDto2, @Json(name = "contact_style") TextParametersDto textParametersDto, @Json(name = "selected_lead") SlotLeadDto slotLeadDto, @Json(name = "unselected_lead") SlotLeadDto slotLeadDto2, @Json(name = "trail") SlotTrailDto slotTrailDto, @Json(name = "unselected_trail") SlotTrailDto slotTrailDto2, @Json(name = "prefill") ContactPrefillDto contactPrefillDto, @Json(name = "horizontal_paddings") HorizontalPaddingsDto horizontalPaddingsDto, @Json(name = "metrica_label") String str2, @Json(name = "meta") Object obj) {
        this.widgetId = str;
        this.routePointIndex = num;
        this.resultPosition = resultPositionDto;
        this.contactPosition = contactPositionDto;
        this.selectedDescription = attributedTextDto;
        this.unselectedDescription = attributedTextDto2;
        this.contactStyle = textParametersDto;
        this.selectedLead = slotLeadDto;
        this.unselectedLead = slotLeadDto2;
        this.trail = slotTrailDto;
        this.unselectedTrail = slotTrailDto2;
        this.prefill = contactPrefillDto;
        this.horizontalPaddings = horizontalPaddingsDto;
        this.metricaLabel = str2;
        this.meta = obj;
    }

    /* renamed from: component1, reason: from getter */
    public final String getWidgetId() {
        return this.widgetId;
    }

    /* renamed from: component10, reason: from getter */
    public final SlotTrailDto getTrail() {
        return this.trail;
    }

    /* renamed from: component11, reason: from getter */
    public final SlotTrailDto getUnselectedTrail() {
        return this.unselectedTrail;
    }

    /* renamed from: component12, reason: from getter */
    public final ContactPrefillDto getPrefill() {
        return this.prefill;
    }

    /* renamed from: component13, reason: from getter */
    public final HorizontalPaddingsDto getHorizontalPaddings() {
        return this.horizontalPaddings;
    }

    /* renamed from: component14, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    /* renamed from: component15, reason: from getter */
    public final Object getMeta() {
        return this.meta;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getRoutePointIndex() {
        return this.routePointIndex;
    }

    /* renamed from: component3, reason: from getter */
    public final ResultPositionDto getResultPosition() {
        return this.resultPosition;
    }

    /* renamed from: component4, reason: from getter */
    public final ContactPositionDto getContactPosition() {
        return this.contactPosition;
    }

    /* renamed from: component5, reason: from getter */
    public final AttributedTextDto getSelectedDescription() {
        return this.selectedDescription;
    }

    /* renamed from: component6, reason: from getter */
    public final AttributedTextDto getUnselectedDescription() {
        return this.unselectedDescription;
    }

    /* renamed from: component7, reason: from getter */
    public final TextParametersDto getContactStyle() {
        return this.contactStyle;
    }

    /* renamed from: component8, reason: from getter */
    public final SlotLeadDto getSelectedLead() {
        return this.selectedLead;
    }

    /* renamed from: component9, reason: from getter */
    public final SlotLeadDto getUnselectedLead() {
        return this.unselectedLead;
    }

    public final ContactWidgetDto copy(@Json(name = "widget_id") String widgetId, @Json(name = "route_point_index") Integer routePointIndex, @Json(name = "result_position") ResultPositionDto resultPosition, @Json(name = "contact_position") ContactPositionDto contactPosition, @Json(name = "selected_description") AttributedTextDto selectedDescription, @Json(name = "unselected_description") AttributedTextDto unselectedDescription, @Json(name = "contact_style") TextParametersDto contactStyle, @Json(name = "selected_lead") SlotLeadDto selectedLead, @Json(name = "unselected_lead") SlotLeadDto unselectedLead, @Json(name = "trail") SlotTrailDto trail, @Json(name = "unselected_trail") SlotTrailDto unselectedTrail, @Json(name = "prefill") ContactPrefillDto prefill, @Json(name = "horizontal_paddings") HorizontalPaddingsDto horizontalPaddings, @Json(name = "metrica_label") String metricaLabel, @Json(name = "meta") Object meta) {
        return new ContactWidgetDto(widgetId, routePointIndex, resultPosition, contactPosition, selectedDescription, unselectedDescription, contactStyle, selectedLead, unselectedLead, trail, unselectedTrail, prefill, horizontalPaddings, metricaLabel, meta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContactWidgetDto)) {
            return false;
        }
        ContactWidgetDto contactWidgetDto = (ContactWidgetDto) other;
        return jl40.l(this.widgetId, contactWidgetDto.widgetId) && jl40.l(this.routePointIndex, contactWidgetDto.routePointIndex) && jl40.l(this.resultPosition, contactWidgetDto.resultPosition) && this.contactPosition == contactWidgetDto.contactPosition && jl40.l(this.selectedDescription, contactWidgetDto.selectedDescription) && jl40.l(this.unselectedDescription, contactWidgetDto.unselectedDescription) && jl40.l(this.contactStyle, contactWidgetDto.contactStyle) && jl40.l(this.selectedLead, contactWidgetDto.selectedLead) && jl40.l(this.unselectedLead, contactWidgetDto.unselectedLead) && jl40.l(this.trail, contactWidgetDto.trail) && jl40.l(this.unselectedTrail, contactWidgetDto.unselectedTrail) && jl40.l(this.prefill, contactWidgetDto.prefill) && jl40.l(this.horizontalPaddings, contactWidgetDto.horizontalPaddings) && jl40.l(this.metricaLabel, contactWidgetDto.metricaLabel) && jl40.l(this.meta, contactWidgetDto.meta);
    }

    public final ContactPositionDto getContactPosition() {
        return this.contactPosition;
    }

    public final TextParametersDto getContactStyle() {
        return this.contactStyle;
    }

    public final HorizontalPaddingsDto getHorizontalPaddings() {
        return this.horizontalPaddings;
    }

    public final Object getMeta() {
        return this.meta;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final ContactPrefillDto getPrefill() {
        return this.prefill;
    }

    public final ResultPositionDto getResultPosition() {
        return this.resultPosition;
    }

    public final Integer getRoutePointIndex() {
        return this.routePointIndex;
    }

    public final AttributedTextDto getSelectedDescription() {
        return this.selectedDescription;
    }

    public final SlotLeadDto getSelectedLead() {
        return this.selectedLead;
    }

    public final SlotTrailDto getTrail() {
        return this.trail;
    }

    public final AttributedTextDto getUnselectedDescription() {
        return this.unselectedDescription;
    }

    public final SlotLeadDto getUnselectedLead() {
        return this.unselectedLead;
    }

    public final SlotTrailDto getUnselectedTrail() {
        return this.unselectedTrail;
    }

    public final String getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        int hashCode = this.widgetId.hashCode() * 31;
        Integer num = this.routePointIndex;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        ResultPositionDto resultPositionDto = this.resultPosition;
        int hashCode3 = (hashCode2 + (resultPositionDto == null ? 0 : resultPositionDto.hashCode())) * 31;
        ContactPositionDto contactPositionDto = this.contactPosition;
        int e = ly3.e(this.unselectedDescription, ly3.e(this.selectedDescription, (hashCode3 + (contactPositionDto == null ? 0 : contactPositionDto.hashCode())) * 31, 31), 31);
        TextParametersDto textParametersDto = this.contactStyle;
        int hashCode4 = (e + (textParametersDto == null ? 0 : textParametersDto.hashCode())) * 31;
        SlotLeadDto slotLeadDto = this.selectedLead;
        int hashCode5 = (hashCode4 + (slotLeadDto == null ? 0 : slotLeadDto.hashCode())) * 31;
        SlotLeadDto slotLeadDto2 = this.unselectedLead;
        int hashCode6 = (hashCode5 + (slotLeadDto2 == null ? 0 : slotLeadDto2.hashCode())) * 31;
        SlotTrailDto slotTrailDto = this.trail;
        int hashCode7 = (hashCode6 + (slotTrailDto == null ? 0 : slotTrailDto.hashCode())) * 31;
        SlotTrailDto slotTrailDto2 = this.unselectedTrail;
        int hashCode8 = (hashCode7 + (slotTrailDto2 == null ? 0 : slotTrailDto2.hashCode())) * 31;
        ContactPrefillDto contactPrefillDto = this.prefill;
        int hashCode9 = (hashCode8 + (contactPrefillDto == null ? 0 : contactPrefillDto.hashCode())) * 31;
        HorizontalPaddingsDto horizontalPaddingsDto = this.horizontalPaddings;
        int hashCode10 = (hashCode9 + (horizontalPaddingsDto == null ? 0 : horizontalPaddingsDto.hashCode())) * 31;
        String str = this.metricaLabel;
        int hashCode11 = (hashCode10 + (str == null ? 0 : str.hashCode())) * 31;
        Object obj = this.meta;
        return hashCode11 + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        String str = this.widgetId;
        Integer num = this.routePointIndex;
        ResultPositionDto resultPositionDto = this.resultPosition;
        ContactPositionDto contactPositionDto = this.contactPosition;
        AttributedTextDto attributedTextDto = this.selectedDescription;
        AttributedTextDto attributedTextDto2 = this.unselectedDescription;
        TextParametersDto textParametersDto = this.contactStyle;
        SlotLeadDto slotLeadDto = this.selectedLead;
        SlotLeadDto slotLeadDto2 = this.unselectedLead;
        SlotTrailDto slotTrailDto = this.trail;
        SlotTrailDto slotTrailDto2 = this.unselectedTrail;
        ContactPrefillDto contactPrefillDto = this.prefill;
        HorizontalPaddingsDto horizontalPaddingsDto = this.horizontalPaddings;
        String str2 = this.metricaLabel;
        Object obj = this.meta;
        StringBuilder q = n.q("ContactWidgetDto(widgetId=", num, str, ", routePointIndex=", ", resultPosition=");
        q.append(resultPositionDto);
        q.append(", contactPosition=");
        q.append(contactPositionDto);
        q.append(", selectedDescription=");
        q.append(attributedTextDto);
        q.append(", unselectedDescription=");
        q.append(attributedTextDto2);
        q.append(", contactStyle=");
        q.append(textParametersDto);
        q.append(", selectedLead=");
        q.append(slotLeadDto);
        q.append(", unselectedLead=");
        q.append(slotLeadDto2);
        q.append(", trail=");
        q.append(slotTrailDto);
        q.append(", unselectedTrail=");
        q.append(slotTrailDto2);
        q.append(", prefill=");
        q.append(contactPrefillDto);
        q.append(", horizontalPaddings=");
        q.append(horizontalPaddingsDto);
        q.append(", metricaLabel=");
        q.append(str2);
        q.append(", meta=");
        return x4e.h(q, obj, Extension.C_BRAKE);
    }
}
