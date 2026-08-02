package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formaddressdetails;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.AddressFlowDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.SectionDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b(\b\u0087\b\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0003\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0003\u0010\u0012\u001a\u00020\u0013\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u00101\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u00105\u001a\u00020\u0011HÆ\u0003J\t\u00106\u001a\u00020\u0013HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u009b\u0001\u00109\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0003\u0010\u0010\u001a\u00020\u00112\b\b\u0003\u0010\u0012\u001a\u00020\u00132\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÆ\u0001J\u0013\u0010:\u001a\u00020\u00112\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020\u0013HÖ\u0001J\t\u0010=\u001a\u00020\u000eHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b*\u0010$R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,¨\u0006>"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formaddressdetails/AddressDetailsLayoutDto;", "", "header", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formaddressdetails/AddressDetailsHeaderDto;", "topSection", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SectionDto;", "bottomSection", "stickyBottomSection", "routePoints", "", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formaddressdetails/RoutePointDescriptionDto;", "addressFlow", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressFlowDto;", "metricaLabel", "", "openEventStateKey", "showDefaultFinishButton", "", "spacingHeight", "", "spacingColor", "verticalBar", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formaddressdetails/VerticalBarDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formaddressdetails/AddressDetailsHeaderDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SectionDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SectionDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SectionDto;Ljava/util/List;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressFlowDto;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formaddressdetails/VerticalBarDto;)V", "getHeader", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formaddressdetails/AddressDetailsHeaderDto;", "getTopSection", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SectionDto;", "getBottomSection", "getStickyBottomSection", "getRoutePoints", "()Ljava/util/List;", "getAddressFlow", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressFlowDto;", "getMetricaLabel", "()Ljava/lang/String;", "getOpenEventStateKey", "getShowDefaultFinishButton", "()Z", "getSpacingHeight", "()I", "getSpacingColor", "getVerticalBar", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formaddressdetails/VerticalBarDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AddressDetailsLayoutDto {
    private final AddressFlowDto addressFlow;
    private final SectionDto bottomSection;
    private final AddressDetailsHeaderDto header;
    private final String metricaLabel;
    private final String openEventStateKey;
    private final List<RoutePointDescriptionDto> routePoints;
    private final boolean showDefaultFinishButton;
    private final String spacingColor;
    private final int spacingHeight;
    private final SectionDto stickyBottomSection;
    private final SectionDto topSection;
    private final VerticalBarDto verticalBar;

    public /* synthetic */ AddressDetailsLayoutDto(AddressDetailsHeaderDto addressDetailsHeaderDto, SectionDto sectionDto, SectionDto sectionDto2, SectionDto sectionDto3, List list, AddressFlowDto addressFlowDto, String str, String str2, boolean z, int i, String str3, VerticalBarDto verticalBarDto, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(addressDetailsHeaderDto, sectionDto, sectionDto2, sectionDto3, list, addressFlowDto, str, str2, (i2 & 256) != 0 ? true : z, (i2 & 512) != 0 ? 2 : i, str3, verticalBarDto);
    }

    public static /* synthetic */ AddressDetailsLayoutDto copy$default(AddressDetailsLayoutDto addressDetailsLayoutDto, AddressDetailsHeaderDto addressDetailsHeaderDto, SectionDto sectionDto, SectionDto sectionDto2, SectionDto sectionDto3, List list, AddressFlowDto addressFlowDto, String str, String str2, boolean z, int i, String str3, VerticalBarDto verticalBarDto, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            addressDetailsHeaderDto = addressDetailsLayoutDto.header;
        }
        if ((i2 & 2) != 0) {
            sectionDto = addressDetailsLayoutDto.topSection;
        }
        if ((i2 & 4) != 0) {
            sectionDto2 = addressDetailsLayoutDto.bottomSection;
        }
        if ((i2 & 8) != 0) {
            sectionDto3 = addressDetailsLayoutDto.stickyBottomSection;
        }
        if ((i2 & 16) != 0) {
            list = addressDetailsLayoutDto.routePoints;
        }
        if ((i2 & 32) != 0) {
            addressFlowDto = addressDetailsLayoutDto.addressFlow;
        }
        if ((i2 & 64) != 0) {
            str = addressDetailsLayoutDto.metricaLabel;
        }
        if ((i2 & 128) != 0) {
            str2 = addressDetailsLayoutDto.openEventStateKey;
        }
        if ((i2 & 256) != 0) {
            z = addressDetailsLayoutDto.showDefaultFinishButton;
        }
        if ((i2 & 512) != 0) {
            i = addressDetailsLayoutDto.spacingHeight;
        }
        if ((i2 & 1024) != 0) {
            str3 = addressDetailsLayoutDto.spacingColor;
        }
        if ((i2 & 2048) != 0) {
            verticalBarDto = addressDetailsLayoutDto.verticalBar;
        }
        String str4 = str3;
        VerticalBarDto verticalBarDto2 = verticalBarDto;
        boolean z2 = z;
        int i3 = i;
        String str5 = str;
        String str6 = str2;
        List list2 = list;
        AddressFlowDto addressFlowDto2 = addressFlowDto;
        return addressDetailsLayoutDto.copy(addressDetailsHeaderDto, sectionDto, sectionDto2, sectionDto3, list2, addressFlowDto2, str5, str6, z2, i3, str4, verticalBarDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final AddressDetailsHeaderDto getHeader() {
        return this.header;
    }

    /* renamed from: component10, reason: from getter */
    public final int getSpacingHeight() {
        return this.spacingHeight;
    }

    /* renamed from: component11, reason: from getter */
    public final String getSpacingColor() {
        return this.spacingColor;
    }

    /* renamed from: component12, reason: from getter */
    public final VerticalBarDto getVerticalBar() {
        return this.verticalBar;
    }

    /* renamed from: component2, reason: from getter */
    public final SectionDto getTopSection() {
        return this.topSection;
    }

    /* renamed from: component3, reason: from getter */
    public final SectionDto getBottomSection() {
        return this.bottomSection;
    }

    /* renamed from: component4, reason: from getter */
    public final SectionDto getStickyBottomSection() {
        return this.stickyBottomSection;
    }

    public final List<RoutePointDescriptionDto> component5() {
        return this.routePoints;
    }

    /* renamed from: component6, reason: from getter */
    public final AddressFlowDto getAddressFlow() {
        return this.addressFlow;
    }

    /* renamed from: component7, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    /* renamed from: component8, reason: from getter */
    public final String getOpenEventStateKey() {
        return this.openEventStateKey;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getShowDefaultFinishButton() {
        return this.showDefaultFinishButton;
    }

    public final AddressDetailsLayoutDto copy(@Json(name = "header") AddressDetailsHeaderDto header, @Json(name = "top_section") SectionDto topSection, @Json(name = "bottom_section") SectionDto bottomSection, @Json(name = "sticky_bottom_section") SectionDto stickyBottomSection, @Json(name = "route_points") List<RoutePointDescriptionDto> routePoints, @Json(name = "address_flow") AddressFlowDto addressFlow, @Json(name = "metrica_label") String metricaLabel, @Json(name = "open_event_state_key") String openEventStateKey, @Json(name = "show_default_finish_button") boolean showDefaultFinishButton, @Json(name = "spacing_height") int spacingHeight, @Json(name = "spacing_color") String spacingColor, @Json(name = "vertical_bar") VerticalBarDto verticalBar) {
        return new AddressDetailsLayoutDto(header, topSection, bottomSection, stickyBottomSection, routePoints, addressFlow, metricaLabel, openEventStateKey, showDefaultFinishButton, spacingHeight, spacingColor, verticalBar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressDetailsLayoutDto)) {
            return false;
        }
        AddressDetailsLayoutDto addressDetailsLayoutDto = (AddressDetailsLayoutDto) other;
        return jl40.l(this.header, addressDetailsLayoutDto.header) && jl40.l(this.topSection, addressDetailsLayoutDto.topSection) && jl40.l(this.bottomSection, addressDetailsLayoutDto.bottomSection) && jl40.l(this.stickyBottomSection, addressDetailsLayoutDto.stickyBottomSection) && jl40.l(this.routePoints, addressDetailsLayoutDto.routePoints) && jl40.l(this.addressFlow, addressDetailsLayoutDto.addressFlow) && jl40.l(this.metricaLabel, addressDetailsLayoutDto.metricaLabel) && jl40.l(this.openEventStateKey, addressDetailsLayoutDto.openEventStateKey) && this.showDefaultFinishButton == addressDetailsLayoutDto.showDefaultFinishButton && this.spacingHeight == addressDetailsLayoutDto.spacingHeight && jl40.l(this.spacingColor, addressDetailsLayoutDto.spacingColor) && jl40.l(this.verticalBar, addressDetailsLayoutDto.verticalBar);
    }

    public final AddressFlowDto getAddressFlow() {
        return this.addressFlow;
    }

    public final SectionDto getBottomSection() {
        return this.bottomSection;
    }

    public final AddressDetailsHeaderDto getHeader() {
        return this.header;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final String getOpenEventStateKey() {
        return this.openEventStateKey;
    }

    public final List<RoutePointDescriptionDto> getRoutePoints() {
        return this.routePoints;
    }

    public final boolean getShowDefaultFinishButton() {
        return this.showDefaultFinishButton;
    }

    public final String getSpacingColor() {
        return this.spacingColor;
    }

    public final int getSpacingHeight() {
        return this.spacingHeight;
    }

    public final SectionDto getStickyBottomSection() {
        return this.stickyBottomSection;
    }

    public final SectionDto getTopSection() {
        return this.topSection;
    }

    public final VerticalBarDto getVerticalBar() {
        return this.verticalBar;
    }

    public int hashCode() {
        AddressDetailsHeaderDto addressDetailsHeaderDto = this.header;
        int hashCode = (addressDetailsHeaderDto == null ? 0 : addressDetailsHeaderDto.hashCode()) * 31;
        SectionDto sectionDto = this.topSection;
        int hashCode2 = (hashCode + (sectionDto == null ? 0 : sectionDto.hashCode())) * 31;
        SectionDto sectionDto2 = this.bottomSection;
        int hashCode3 = (hashCode2 + (sectionDto2 == null ? 0 : sectionDto2.hashCode())) * 31;
        SectionDto sectionDto3 = this.stickyBottomSection;
        int hashCode4 = (hashCode3 + (sectionDto3 == null ? 0 : sectionDto3.hashCode())) * 31;
        List<RoutePointDescriptionDto> list = this.routePoints;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        AddressFlowDto addressFlowDto = this.addressFlow;
        int hashCode6 = (hashCode5 + (addressFlowDto == null ? 0 : addressFlowDto.hashCode())) * 31;
        String str = this.metricaLabel;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.openEventStateKey;
        int b = oyr.b(this.spacingHeight, unr0.e((hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.showDefaultFinishButton), 31);
        String str3 = this.spacingColor;
        int hashCode8 = (b + (str3 == null ? 0 : str3.hashCode())) * 31;
        VerticalBarDto verticalBarDto = this.verticalBar;
        return hashCode8 + (verticalBarDto != null ? verticalBarDto.hashCode() : 0);
    }

    public String toString() {
        AddressDetailsHeaderDto addressDetailsHeaderDto = this.header;
        SectionDto sectionDto = this.topSection;
        SectionDto sectionDto2 = this.bottomSection;
        SectionDto sectionDto3 = this.stickyBottomSection;
        List<RoutePointDescriptionDto> list = this.routePoints;
        AddressFlowDto addressFlowDto = this.addressFlow;
        String str = this.metricaLabel;
        String str2 = this.openEventStateKey;
        boolean z = this.showDefaultFinishButton;
        int i = this.spacingHeight;
        String str3 = this.spacingColor;
        VerticalBarDto verticalBarDto = this.verticalBar;
        StringBuilder sb = new StringBuilder("AddressDetailsLayoutDto(header=");
        sb.append(addressDetailsHeaderDto);
        sb.append(", topSection=");
        sb.append(sectionDto);
        sb.append(", bottomSection=");
        sb.append(sectionDto2);
        sb.append(", stickyBottomSection=");
        sb.append(sectionDto3);
        sb.append(", routePoints=");
        sb.append(list);
        sb.append(", addressFlow=");
        sb.append(addressFlowDto);
        sb.append(", metricaLabel=");
        g8e.D(sb, str, ", openEventStateKey=", str2, ", showDefaultFinishButton=");
        sb.append(z);
        sb.append(", spacingHeight=");
        sb.append(i);
        sb.append(", spacingColor=");
        sb.append(str3);
        sb.append(", verticalBar=");
        sb.append(verticalBarDto);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public AddressDetailsLayoutDto(@Json(name = "header") AddressDetailsHeaderDto addressDetailsHeaderDto, @Json(name = "top_section") SectionDto sectionDto, @Json(name = "bottom_section") SectionDto sectionDto2, @Json(name = "sticky_bottom_section") SectionDto sectionDto3, @Json(name = "route_points") List<RoutePointDescriptionDto> list, @Json(name = "address_flow") AddressFlowDto addressFlowDto, @Json(name = "metrica_label") String str, @Json(name = "open_event_state_key") String str2, @Json(name = "show_default_finish_button") boolean z, @Json(name = "spacing_height") int i, @Json(name = "spacing_color") String str3, @Json(name = "vertical_bar") VerticalBarDto verticalBarDto) {
        this.header = addressDetailsHeaderDto;
        this.topSection = sectionDto;
        this.bottomSection = sectionDto2;
        this.stickyBottomSection = sectionDto3;
        this.routePoints = list;
        this.addressFlow = addressFlowDto;
        this.metricaLabel = str;
        this.openEventStateKey = str2;
        this.showDefaultFinishButton = z;
        this.spacingHeight = i;
        this.spacingColor = str3;
        this.verticalBar = verticalBarDto;
    }
}
