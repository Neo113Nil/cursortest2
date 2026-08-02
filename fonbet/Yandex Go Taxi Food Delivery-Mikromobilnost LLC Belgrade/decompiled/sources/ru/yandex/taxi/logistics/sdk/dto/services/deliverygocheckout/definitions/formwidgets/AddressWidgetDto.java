package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.adjust.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.ly3;
import defpackage.oyr;
import defpackage.x4e;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.AddressFlowDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.PaddingsDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.ResultPositionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.SlotLeadDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.TapActionDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001OB·\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\r\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u001b\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0005HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010=\u001a\u00020\tHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010?\u001a\u00020\rHÆ\u0003J\t\u0010@\u001a\u00020\rHÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010H\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u001cHÆ\u0003J¹\u0001\u0010I\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\b\u001a\u00020\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0003\u0010\f\u001a\u00020\r2\b\b\u0003\u0010\u000e\u001a\u00020\r2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u001b\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u001cHÆ\u0001J\u0013\u0010J\u001a\u00020K2\b\u0010L\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010M\u001a\u00020\u0005HÖ\u0001J\t\u0010N\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b+\u0010*R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b0\u0010/R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010 R\u0019\u0010\u001b\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u001c¢\u0006\b\n\u0000\u001a\u0004\b8\u00109¨\u0006P"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/AddressWidgetDto;", "", "widgetId", "", "routePointIndex", "", "resultPosition", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ResultPositionDto;", "addressPosition", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/AddressWidgetDto$AddressPositionDto;", "flow", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressFlowDto;", "selectedDescription", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "unselectedDescription", "addressStyle", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextParametersDto;", "selectedLead", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/SlotLeadDto;", "unselectedLead", "trail", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotTrailDto;", "action", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "paddings", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/PaddingsDto;", "metricaLabel", Constants.REFERRER_API_META, "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/MetadataDto;", "<init>", "(Ljava/lang/String;ILru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ResultPositionDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/AddressWidgetDto$AddressPositionDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressFlowDto;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextParametersDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/SlotLeadDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/SlotLeadDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotTrailDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/PaddingsDto;Ljava/lang/String;Ljava/lang/Object;)V", "getWidgetId", "()Ljava/lang/String;", "getRoutePointIndex", "()I", "getResultPosition", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ResultPositionDto;", "getAddressPosition", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/AddressWidgetDto$AddressPositionDto;", "getFlow", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressFlowDto;", "getSelectedDescription", "()Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "getUnselectedDescription", "getAddressStyle", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextParametersDto;", "getSelectedLead", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/SlotLeadDto;", "getUnselectedLead", "getTrail", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotTrailDto;", "getAction", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "getPaddings", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/PaddingsDto;", "getMetricaLabel", "getMeta", "()Ljava/lang/Object;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "equals", "", "other", "hashCode", "toString", "AddressPositionDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AddressWidgetDto {
    private final TapActionDto action;
    private final AddressPositionDto addressPosition;
    private final TextParametersDto addressStyle;
    private final AddressFlowDto flow;
    private final Object meta;
    private final String metricaLabel;
    private final PaddingsDto paddings;
    private final ResultPositionDto resultPosition;
    private final int routePointIndex;
    private final AttributedTextDto selectedDescription;
    private final SlotLeadDto selectedLead;
    private final SlotTrailDto trail;
    private final AttributedTextDto unselectedDescription;
    private final SlotLeadDto unselectedLead;
    private final String widgetId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/AddressWidgetDto$AddressPositionDto;", "", "<init>", "(Ljava/lang/String;I)V", "TITLE", "SUBTITLE", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AddressPositionDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ AddressPositionDto[] $VALUES;

        @Json(name = "title")
        public static final AddressPositionDto TITLE = new AddressPositionDto("TITLE", 0);

        @Json(name = "subtitle")
        public static final AddressPositionDto SUBTITLE = new AddressPositionDto("SUBTITLE", 1);

        private static final /* synthetic */ AddressPositionDto[] $values() {
            return new AddressPositionDto[]{TITLE, SUBTITLE};
        }

        static {
            AddressPositionDto[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private AddressPositionDto(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static AddressPositionDto valueOf(String str) {
            return (AddressPositionDto) Enum.valueOf(AddressPositionDto.class, str);
        }

        public static AddressPositionDto[] values() {
            return (AddressPositionDto[]) $VALUES.clone();
        }
    }

    public AddressWidgetDto(@Json(name = "widget_id") String str, @Json(name = "route_point_index") int i, @Json(name = "result_position") ResultPositionDto resultPositionDto, @Json(name = "address_position") AddressPositionDto addressPositionDto, @Json(name = "flow") AddressFlowDto addressFlowDto, @Json(name = "selected_description") AttributedTextDto attributedTextDto, @Json(name = "unselected_description") AttributedTextDto attributedTextDto2, @Json(name = "address_style") TextParametersDto textParametersDto, @Json(name = "selected_lead") SlotLeadDto slotLeadDto, @Json(name = "unselected_lead") SlotLeadDto slotLeadDto2, @Json(name = "trail") SlotTrailDto slotTrailDto, @Json(name = "action") TapActionDto tapActionDto, @Json(name = "paddings") PaddingsDto paddingsDto, @Json(name = "metrica_label") String str2, @Json(name = "meta") Object obj) {
        this.widgetId = str;
        this.routePointIndex = i;
        this.resultPosition = resultPositionDto;
        this.addressPosition = addressPositionDto;
        this.flow = addressFlowDto;
        this.selectedDescription = attributedTextDto;
        this.unselectedDescription = attributedTextDto2;
        this.addressStyle = textParametersDto;
        this.selectedLead = slotLeadDto;
        this.unselectedLead = slotLeadDto2;
        this.trail = slotTrailDto;
        this.action = tapActionDto;
        this.paddings = paddingsDto;
        this.metricaLabel = str2;
        this.meta = obj;
    }

    /* renamed from: component1, reason: from getter */
    public final String getWidgetId() {
        return this.widgetId;
    }

    /* renamed from: component10, reason: from getter */
    public final SlotLeadDto getUnselectedLead() {
        return this.unselectedLead;
    }

    /* renamed from: component11, reason: from getter */
    public final SlotTrailDto getTrail() {
        return this.trail;
    }

    /* renamed from: component12, reason: from getter */
    public final TapActionDto getAction() {
        return this.action;
    }

    /* renamed from: component13, reason: from getter */
    public final PaddingsDto getPaddings() {
        return this.paddings;
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
    public final int getRoutePointIndex() {
        return this.routePointIndex;
    }

    /* renamed from: component3, reason: from getter */
    public final ResultPositionDto getResultPosition() {
        return this.resultPosition;
    }

    /* renamed from: component4, reason: from getter */
    public final AddressPositionDto getAddressPosition() {
        return this.addressPosition;
    }

    /* renamed from: component5, reason: from getter */
    public final AddressFlowDto getFlow() {
        return this.flow;
    }

    /* renamed from: component6, reason: from getter */
    public final AttributedTextDto getSelectedDescription() {
        return this.selectedDescription;
    }

    /* renamed from: component7, reason: from getter */
    public final AttributedTextDto getUnselectedDescription() {
        return this.unselectedDescription;
    }

    /* renamed from: component8, reason: from getter */
    public final TextParametersDto getAddressStyle() {
        return this.addressStyle;
    }

    /* renamed from: component9, reason: from getter */
    public final SlotLeadDto getSelectedLead() {
        return this.selectedLead;
    }

    public final AddressWidgetDto copy(@Json(name = "widget_id") String widgetId, @Json(name = "route_point_index") int routePointIndex, @Json(name = "result_position") ResultPositionDto resultPosition, @Json(name = "address_position") AddressPositionDto addressPosition, @Json(name = "flow") AddressFlowDto flow, @Json(name = "selected_description") AttributedTextDto selectedDescription, @Json(name = "unselected_description") AttributedTextDto unselectedDescription, @Json(name = "address_style") TextParametersDto addressStyle, @Json(name = "selected_lead") SlotLeadDto selectedLead, @Json(name = "unselected_lead") SlotLeadDto unselectedLead, @Json(name = "trail") SlotTrailDto trail, @Json(name = "action") TapActionDto action, @Json(name = "paddings") PaddingsDto paddings, @Json(name = "metrica_label") String metricaLabel, @Json(name = "meta") Object meta) {
        return new AddressWidgetDto(widgetId, routePointIndex, resultPosition, addressPosition, flow, selectedDescription, unselectedDescription, addressStyle, selectedLead, unselectedLead, trail, action, paddings, metricaLabel, meta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressWidgetDto)) {
            return false;
        }
        AddressWidgetDto addressWidgetDto = (AddressWidgetDto) other;
        return jl40.l(this.widgetId, addressWidgetDto.widgetId) && this.routePointIndex == addressWidgetDto.routePointIndex && jl40.l(this.resultPosition, addressWidgetDto.resultPosition) && this.addressPosition == addressWidgetDto.addressPosition && jl40.l(this.flow, addressWidgetDto.flow) && jl40.l(this.selectedDescription, addressWidgetDto.selectedDescription) && jl40.l(this.unselectedDescription, addressWidgetDto.unselectedDescription) && jl40.l(this.addressStyle, addressWidgetDto.addressStyle) && jl40.l(this.selectedLead, addressWidgetDto.selectedLead) && jl40.l(this.unselectedLead, addressWidgetDto.unselectedLead) && jl40.l(this.trail, addressWidgetDto.trail) && jl40.l(this.action, addressWidgetDto.action) && jl40.l(this.paddings, addressWidgetDto.paddings) && jl40.l(this.metricaLabel, addressWidgetDto.metricaLabel) && jl40.l(this.meta, addressWidgetDto.meta);
    }

    public final TapActionDto getAction() {
        return this.action;
    }

    public final AddressPositionDto getAddressPosition() {
        return this.addressPosition;
    }

    public final TextParametersDto getAddressStyle() {
        return this.addressStyle;
    }

    public final AddressFlowDto getFlow() {
        return this.flow;
    }

    public final Object getMeta() {
        return this.meta;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final PaddingsDto getPaddings() {
        return this.paddings;
    }

    public final ResultPositionDto getResultPosition() {
        return this.resultPosition;
    }

    public final int getRoutePointIndex() {
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

    public final String getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        int b = oyr.b(this.routePointIndex, this.widgetId.hashCode() * 31, 31);
        ResultPositionDto resultPositionDto = this.resultPosition;
        int hashCode = (this.addressPosition.hashCode() + ((b + (resultPositionDto == null ? 0 : resultPositionDto.hashCode())) * 31)) * 31;
        AddressFlowDto addressFlowDto = this.flow;
        int e = ly3.e(this.unselectedDescription, ly3.e(this.selectedDescription, (hashCode + (addressFlowDto == null ? 0 : addressFlowDto.hashCode())) * 31, 31), 31);
        TextParametersDto textParametersDto = this.addressStyle;
        int hashCode2 = (e + (textParametersDto == null ? 0 : textParametersDto.hashCode())) * 31;
        SlotLeadDto slotLeadDto = this.selectedLead;
        int hashCode3 = (hashCode2 + (slotLeadDto == null ? 0 : slotLeadDto.hashCode())) * 31;
        SlotLeadDto slotLeadDto2 = this.unselectedLead;
        int hashCode4 = (hashCode3 + (slotLeadDto2 == null ? 0 : slotLeadDto2.hashCode())) * 31;
        SlotTrailDto slotTrailDto = this.trail;
        int hashCode5 = (hashCode4 + (slotTrailDto == null ? 0 : slotTrailDto.hashCode())) * 31;
        TapActionDto tapActionDto = this.action;
        int hashCode6 = (hashCode5 + (tapActionDto == null ? 0 : tapActionDto.hashCode())) * 31;
        PaddingsDto paddingsDto = this.paddings;
        int hashCode7 = (hashCode6 + (paddingsDto == null ? 0 : paddingsDto.hashCode())) * 31;
        String str = this.metricaLabel;
        int hashCode8 = (hashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        Object obj = this.meta;
        return hashCode8 + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        String str = this.widgetId;
        int i = this.routePointIndex;
        ResultPositionDto resultPositionDto = this.resultPosition;
        AddressPositionDto addressPositionDto = this.addressPosition;
        AddressFlowDto addressFlowDto = this.flow;
        AttributedTextDto attributedTextDto = this.selectedDescription;
        AttributedTextDto attributedTextDto2 = this.unselectedDescription;
        TextParametersDto textParametersDto = this.addressStyle;
        SlotLeadDto slotLeadDto = this.selectedLead;
        SlotLeadDto slotLeadDto2 = this.unselectedLead;
        SlotTrailDto slotTrailDto = this.trail;
        TapActionDto tapActionDto = this.action;
        PaddingsDto paddingsDto = this.paddings;
        String str2 = this.metricaLabel;
        Object obj = this.meta;
        StringBuilder u = b64.u(i, "AddressWidgetDto(widgetId=", str, ", routePointIndex=", ", resultPosition=");
        u.append(resultPositionDto);
        u.append(", addressPosition=");
        u.append(addressPositionDto);
        u.append(", flow=");
        u.append(addressFlowDto);
        u.append(", selectedDescription=");
        u.append(attributedTextDto);
        u.append(", unselectedDescription=");
        u.append(attributedTextDto2);
        u.append(", addressStyle=");
        u.append(textParametersDto);
        u.append(", selectedLead=");
        u.append(slotLeadDto);
        u.append(", unselectedLead=");
        u.append(slotLeadDto2);
        u.append(", trail=");
        u.append(slotTrailDto);
        u.append(", action=");
        u.append(tapActionDto);
        u.append(", paddings=");
        u.append(paddingsDto);
        u.append(", metricaLabel=");
        u.append(str2);
        u.append(", meta=");
        return x4e.h(u, obj, Extension.C_BRAKE);
    }
}
