package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formaddressdetails;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.tse0;
import defpackage.unr0;
import defpackage.x4e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.AddressFlowDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.ImageDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.LeadIconSpotDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.SlotLeadDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.SectionDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B¥\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u0012\u0010\b\u0001\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0010\b\u0001\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0003\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0003\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0003\u0010\u0019\u001a\u00020\u0013¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u00102\u001a\u00020\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u00106\u001a\u00020\nHÆ\u0003J\u0011\u00107\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\u0011\u00108\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\fHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\t\u0010:\u001a\u00020\u0013HÆ\u0003J\t\u0010;\u001a\u00020\u0013HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\t\u0010>\u001a\u00020\u0013HÆ\u0003J§\u0001\u0010?\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0003\u0010\t\u001a\u00020\n2\u0010\b\u0003\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0010\b\u0003\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0003\u0010\u0012\u001a\u00020\u00132\b\b\u0003\u0010\u0014\u001a\u00020\u00132\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\b\u0003\u0010\u0019\u001a\u00020\u0013HÆ\u0001J\u0013\u0010@\u001a\u00020\u00132\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010B\u001a\u00020CHÖ\u0001J\t\u0010D\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0014\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b,\u0010+R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u0019\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b1\u0010+¨\u0006E"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formaddressdetails/RoutePointDescriptionDto;", "", "icon", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;", "selectedLead", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/SlotLeadDto;", "unselectedLead", "mapPin", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/LeadIconSpotDto;", "additionalTitleInfo", "", "bubbles", "", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formaddressdetails/AddressDetailsBubbleDto;", "hiddenFields", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formaddressdetails/AddressDetailsFieldTypeDto;", "section", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SectionDto;", "closeDetailsAfterAddressSelection", "", "showDeleteButton", "addressFlow", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressFlowDto;", "commentPopup", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formaddressdetails/CommentPopupDto;", "showMiniMap", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/SlotLeadDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/SlotLeadDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/LeadIconSpotDto;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SectionDto;ZZLru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressFlowDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formaddressdetails/CommentPopupDto;Z)V", "getIcon", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;", "getSelectedLead", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/SlotLeadDto;", "getUnselectedLead", "getMapPin", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/LeadIconSpotDto;", "getAdditionalTitleInfo", "()Ljava/lang/String;", "getBubbles", "()Ljava/util/List;", "getHiddenFields", "getSection", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SectionDto;", "getCloseDetailsAfterAddressSelection", "()Z", "getShowDeleteButton", "getAddressFlow", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressFlowDto;", "getCommentPopup", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formaddressdetails/CommentPopupDto;", "getShowMiniMap", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RoutePointDescriptionDto {
    private final String additionalTitleInfo;
    private final AddressFlowDto addressFlow;
    private final List<AddressDetailsBubbleDto> bubbles;
    private final boolean closeDetailsAfterAddressSelection;
    private final CommentPopupDto commentPopup;
    private final List<AddressDetailsFieldTypeDto> hiddenFields;
    private final ImageDto icon;
    private final LeadIconSpotDto mapPin;
    private final SectionDto section;
    private final SlotLeadDto selectedLead;
    private final boolean showDeleteButton;
    private final boolean showMiniMap;
    private final SlotLeadDto unselectedLead;

    public /* synthetic */ RoutePointDescriptionDto(ImageDto imageDto, SlotLeadDto slotLeadDto, SlotLeadDto slotLeadDto2, LeadIconSpotDto leadIconSpotDto, String str, List list, List list2, SectionDto sectionDto, boolean z, boolean z2, AddressFlowDto addressFlowDto, CommentPopupDto commentPopupDto, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageDto, slotLeadDto, slotLeadDto2, leadIconSpotDto, str, list, list2, sectionDto, (i & 256) != 0 ? false : z, (i & 512) != 0 ? false : z2, addressFlowDto, commentPopupDto, (i & 4096) != 0 ? true : z3);
    }

    public static /* synthetic */ RoutePointDescriptionDto copy$default(RoutePointDescriptionDto routePointDescriptionDto, ImageDto imageDto, SlotLeadDto slotLeadDto, SlotLeadDto slotLeadDto2, LeadIconSpotDto leadIconSpotDto, String str, List list, List list2, SectionDto sectionDto, boolean z, boolean z2, AddressFlowDto addressFlowDto, CommentPopupDto commentPopupDto, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            imageDto = routePointDescriptionDto.icon;
        }
        return routePointDescriptionDto.copy(imageDto, (i & 2) != 0 ? routePointDescriptionDto.selectedLead : slotLeadDto, (i & 4) != 0 ? routePointDescriptionDto.unselectedLead : slotLeadDto2, (i & 8) != 0 ? routePointDescriptionDto.mapPin : leadIconSpotDto, (i & 16) != 0 ? routePointDescriptionDto.additionalTitleInfo : str, (i & 32) != 0 ? routePointDescriptionDto.bubbles : list, (i & 64) != 0 ? routePointDescriptionDto.hiddenFields : list2, (i & 128) != 0 ? routePointDescriptionDto.section : sectionDto, (i & 256) != 0 ? routePointDescriptionDto.closeDetailsAfterAddressSelection : z, (i & 512) != 0 ? routePointDescriptionDto.showDeleteButton : z2, (i & 1024) != 0 ? routePointDescriptionDto.addressFlow : addressFlowDto, (i & 2048) != 0 ? routePointDescriptionDto.commentPopup : commentPopupDto, (i & 4096) != 0 ? routePointDescriptionDto.showMiniMap : z3);
    }

    /* renamed from: component1, reason: from getter */
    public final ImageDto getIcon() {
        return this.icon;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getShowDeleteButton() {
        return this.showDeleteButton;
    }

    /* renamed from: component11, reason: from getter */
    public final AddressFlowDto getAddressFlow() {
        return this.addressFlow;
    }

    /* renamed from: component12, reason: from getter */
    public final CommentPopupDto getCommentPopup() {
        return this.commentPopup;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getShowMiniMap() {
        return this.showMiniMap;
    }

    /* renamed from: component2, reason: from getter */
    public final SlotLeadDto getSelectedLead() {
        return this.selectedLead;
    }

    /* renamed from: component3, reason: from getter */
    public final SlotLeadDto getUnselectedLead() {
        return this.unselectedLead;
    }

    /* renamed from: component4, reason: from getter */
    public final LeadIconSpotDto getMapPin() {
        return this.mapPin;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAdditionalTitleInfo() {
        return this.additionalTitleInfo;
    }

    public final List<AddressDetailsBubbleDto> component6() {
        return this.bubbles;
    }

    public final List<AddressDetailsFieldTypeDto> component7() {
        return this.hiddenFields;
    }

    /* renamed from: component8, reason: from getter */
    public final SectionDto getSection() {
        return this.section;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getCloseDetailsAfterAddressSelection() {
        return this.closeDetailsAfterAddressSelection;
    }

    public final RoutePointDescriptionDto copy(@Json(name = "icon") ImageDto icon, @Json(name = "selected_lead") SlotLeadDto selectedLead, @Json(name = "unselected_lead") SlotLeadDto unselectedLead, @Json(name = "map_pin") LeadIconSpotDto mapPin, @Json(name = "additional_title_info") String additionalTitleInfo, @Json(name = "bubbles") List<AddressDetailsBubbleDto> bubbles, @Json(name = "hidden_fields") List<? extends AddressDetailsFieldTypeDto> hiddenFields, @Json(name = "section") SectionDto section, @Json(name = "close_details_after_address_selection") boolean closeDetailsAfterAddressSelection, @Json(name = "show_delete_button") boolean showDeleteButton, @Json(name = "address_flow") AddressFlowDto addressFlow, @Json(name = "comment_popup") CommentPopupDto commentPopup, @Json(name = "show_mini_map") boolean showMiniMap) {
        return new RoutePointDescriptionDto(icon, selectedLead, unselectedLead, mapPin, additionalTitleInfo, bubbles, hiddenFields, section, closeDetailsAfterAddressSelection, showDeleteButton, addressFlow, commentPopup, showMiniMap);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoutePointDescriptionDto)) {
            return false;
        }
        RoutePointDescriptionDto routePointDescriptionDto = (RoutePointDescriptionDto) other;
        return jl40.l(this.icon, routePointDescriptionDto.icon) && jl40.l(this.selectedLead, routePointDescriptionDto.selectedLead) && jl40.l(this.unselectedLead, routePointDescriptionDto.unselectedLead) && jl40.l(this.mapPin, routePointDescriptionDto.mapPin) && jl40.l(this.additionalTitleInfo, routePointDescriptionDto.additionalTitleInfo) && jl40.l(this.bubbles, routePointDescriptionDto.bubbles) && jl40.l(this.hiddenFields, routePointDescriptionDto.hiddenFields) && jl40.l(this.section, routePointDescriptionDto.section) && this.closeDetailsAfterAddressSelection == routePointDescriptionDto.closeDetailsAfterAddressSelection && this.showDeleteButton == routePointDescriptionDto.showDeleteButton && jl40.l(this.addressFlow, routePointDescriptionDto.addressFlow) && jl40.l(this.commentPopup, routePointDescriptionDto.commentPopup) && this.showMiniMap == routePointDescriptionDto.showMiniMap;
    }

    public final String getAdditionalTitleInfo() {
        return this.additionalTitleInfo;
    }

    public final AddressFlowDto getAddressFlow() {
        return this.addressFlow;
    }

    public final List<AddressDetailsBubbleDto> getBubbles() {
        return this.bubbles;
    }

    public final boolean getCloseDetailsAfterAddressSelection() {
        return this.closeDetailsAfterAddressSelection;
    }

    public final CommentPopupDto getCommentPopup() {
        return this.commentPopup;
    }

    public final List<AddressDetailsFieldTypeDto> getHiddenFields() {
        return this.hiddenFields;
    }

    public final ImageDto getIcon() {
        return this.icon;
    }

    public final LeadIconSpotDto getMapPin() {
        return this.mapPin;
    }

    public final SectionDto getSection() {
        return this.section;
    }

    public final SlotLeadDto getSelectedLead() {
        return this.selectedLead;
    }

    public final boolean getShowDeleteButton() {
        return this.showDeleteButton;
    }

    public final boolean getShowMiniMap() {
        return this.showMiniMap;
    }

    public final SlotLeadDto getUnselectedLead() {
        return this.unselectedLead;
    }

    public int hashCode() {
        int hashCode = this.icon.hashCode() * 31;
        SlotLeadDto slotLeadDto = this.selectedLead;
        int hashCode2 = (hashCode + (slotLeadDto == null ? 0 : slotLeadDto.hashCode())) * 31;
        SlotLeadDto slotLeadDto2 = this.unselectedLead;
        int hashCode3 = (hashCode2 + (slotLeadDto2 == null ? 0 : slotLeadDto2.hashCode())) * 31;
        LeadIconSpotDto leadIconSpotDto = this.mapPin;
        int b = unr0.b((hashCode3 + (leadIconSpotDto == null ? 0 : leadIconSpotDto.hashCode())) * 31, 31, this.additionalTitleInfo);
        List<AddressDetailsBubbleDto> list = this.bubbles;
        int hashCode4 = (b + (list == null ? 0 : list.hashCode())) * 31;
        List<AddressDetailsFieldTypeDto> list2 = this.hiddenFields;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        SectionDto sectionDto = this.section;
        int e = unr0.e(unr0.e((hashCode5 + (sectionDto == null ? 0 : sectionDto.hashCode())) * 31, 31, this.closeDetailsAfterAddressSelection), 31, this.showDeleteButton);
        AddressFlowDto addressFlowDto = this.addressFlow;
        int hashCode6 = (e + (addressFlowDto == null ? 0 : addressFlowDto.hashCode())) * 31;
        CommentPopupDto commentPopupDto = this.commentPopup;
        return Boolean.hashCode(this.showMiniMap) + ((hashCode6 + (commentPopupDto != null ? commentPopupDto.hashCode() : 0)) * 31);
    }

    public String toString() {
        ImageDto imageDto = this.icon;
        SlotLeadDto slotLeadDto = this.selectedLead;
        SlotLeadDto slotLeadDto2 = this.unselectedLead;
        LeadIconSpotDto leadIconSpotDto = this.mapPin;
        String str = this.additionalTitleInfo;
        List<AddressDetailsBubbleDto> list = this.bubbles;
        List<AddressDetailsFieldTypeDto> list2 = this.hiddenFields;
        SectionDto sectionDto = this.section;
        boolean z = this.closeDetailsAfterAddressSelection;
        boolean z2 = this.showDeleteButton;
        AddressFlowDto addressFlowDto = this.addressFlow;
        CommentPopupDto commentPopupDto = this.commentPopup;
        boolean z3 = this.showMiniMap;
        StringBuilder sb = new StringBuilder("RoutePointDescriptionDto(icon=");
        sb.append(imageDto);
        sb.append(", selectedLead=");
        sb.append(slotLeadDto);
        sb.append(", unselectedLead=");
        sb.append(slotLeadDto2);
        sb.append(", mapPin=");
        sb.append(leadIconSpotDto);
        sb.append(", additionalTitleInfo=");
        tse0.x(str, ", bubbles=", ", hiddenFields=", sb, list);
        sb.append(list2);
        sb.append(", section=");
        sb.append(sectionDto);
        sb.append(", closeDetailsAfterAddressSelection=");
        nnm.v(", showDeleteButton=", ", addressFlow=", sb, z, z2);
        sb.append(addressFlowDto);
        sb.append(", commentPopup=");
        sb.append(commentPopupDto);
        sb.append(", showMiniMap=");
        return x4e.i(sb, z3, Extension.C_BRAKE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RoutePointDescriptionDto(@Json(name = "icon") ImageDto imageDto, @Json(name = "selected_lead") SlotLeadDto slotLeadDto, @Json(name = "unselected_lead") SlotLeadDto slotLeadDto2, @Json(name = "map_pin") LeadIconSpotDto leadIconSpotDto, @Json(name = "additional_title_info") String str, @Json(name = "bubbles") List<AddressDetailsBubbleDto> list, @Json(name = "hidden_fields") List<? extends AddressDetailsFieldTypeDto> list2, @Json(name = "section") SectionDto sectionDto, @Json(name = "close_details_after_address_selection") boolean z, @Json(name = "show_delete_button") boolean z2, @Json(name = "address_flow") AddressFlowDto addressFlowDto, @Json(name = "comment_popup") CommentPopupDto commentPopupDto, @Json(name = "show_mini_map") boolean z3) {
        this.icon = imageDto;
        this.selectedLead = slotLeadDto;
        this.unselectedLead = slotLeadDto2;
        this.mapPin = leadIconSpotDto;
        this.additionalTitleInfo = str;
        this.bubbles = list;
        this.hiddenFields = list2;
        this.section = sectionDto;
        this.closeDetailsAfterAddressSelection = z;
        this.showDeleteButton = z2;
        this.addressFlow = addressFlowDto;
        this.commentPopup = commentPopupDto;
        this.showMiniMap = z3;
    }
}
