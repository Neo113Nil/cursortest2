package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.smw0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.AccessibilityInfoDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.FormBadgeDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\f\b\u0001\u0010\u0005\u001a\u00060\u0001j\u0002`\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\r\u0010(\u001a\u00060\u0001j\u0002`\u0006HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010*\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010+\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0084\u0001\u00100\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\f\b\u0003\u0010\u0005\u001a\u00060\u0001j\u0002`\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0002\u00101J\u0013\u00102\u001a\u00020\b2\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u000205HÖ\u0001J\t\u00106\u001a\u000207HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0015\u0010\u0005\u001a\u00060\u0001j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\t\u0010\u001bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$¨\u00068"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/SegmentOptionDto;", "", "selectedText", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/SegmentTextDto;", "unselectedText", "value", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/FormStateValueDto;", "default", "", "isAvailable", "accessibilityInfo", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AccessibilityInfoDto;", "badge", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/FormBadgeDto;", "hint", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/SegmentHintDto;", "selectionAction", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "unselectionAction", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/SegmentTextDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/SegmentTextDto;Ljava/lang/Object;Ljava/lang/Boolean;Ljava/lang/Boolean;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AccessibilityInfoDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/FormBadgeDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/SegmentHintDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;)V", "getSelectedText", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/SegmentTextDto;", "getUnselectedText", "getValue", "()Ljava/lang/Object;", "getDefault", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAccessibilityInfo", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AccessibilityInfoDto;", "getBadge", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/FormBadgeDto;", "getHint", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/SegmentHintDto;", "getSelectionAction", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "getUnselectionAction", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/SegmentTextDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/SegmentTextDto;Ljava/lang/Object;Ljava/lang/Boolean;Ljava/lang/Boolean;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AccessibilityInfoDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/FormBadgeDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/SegmentHintDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/SegmentOptionDto;", "equals", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SegmentOptionDto {
    private final AccessibilityInfoDto accessibilityInfo;
    private final FormBadgeDto badge;
    private final Boolean default;
    private final SegmentHintDto hint;
    private final Boolean isAvailable;
    private final SegmentTextDto selectedText;
    private final TapActionDto selectionAction;
    private final SegmentTextDto unselectedText;
    private final TapActionDto unselectionAction;
    private final Object value;

    public SegmentOptionDto(@Json(name = "selected_text") SegmentTextDto segmentTextDto, @Json(name = "unselected_text") SegmentTextDto segmentTextDto2, @Json(name = "value") Object obj, @Json(name = "default") Boolean bool, @Json(name = "is_available") Boolean bool2, @Json(name = "accessibility_info") AccessibilityInfoDto accessibilityInfoDto, @Json(name = "badge") FormBadgeDto formBadgeDto, @Json(name = "hint") SegmentHintDto segmentHintDto, @Json(name = "selection_action") TapActionDto tapActionDto, @Json(name = "unselection_action") TapActionDto tapActionDto2) {
        this.selectedText = segmentTextDto;
        this.unselectedText = segmentTextDto2;
        this.value = obj;
        this.default = bool;
        this.isAvailable = bool2;
        this.accessibilityInfo = accessibilityInfoDto;
        this.badge = formBadgeDto;
        this.hint = segmentHintDto;
        this.selectionAction = tapActionDto;
        this.unselectionAction = tapActionDto2;
    }

    public static /* synthetic */ SegmentOptionDto copy$default(SegmentOptionDto segmentOptionDto, SegmentTextDto segmentTextDto, SegmentTextDto segmentTextDto2, Object obj, Boolean bool, Boolean bool2, AccessibilityInfoDto accessibilityInfoDto, FormBadgeDto formBadgeDto, SegmentHintDto segmentHintDto, TapActionDto tapActionDto, TapActionDto tapActionDto2, int i, Object obj2) {
        if ((i & 1) != 0) {
            segmentTextDto = segmentOptionDto.selectedText;
        }
        if ((i & 2) != 0) {
            segmentTextDto2 = segmentOptionDto.unselectedText;
        }
        if ((i & 4) != 0) {
            obj = segmentOptionDto.value;
        }
        if ((i & 8) != 0) {
            bool = segmentOptionDto.default;
        }
        if ((i & 16) != 0) {
            bool2 = segmentOptionDto.isAvailable;
        }
        if ((i & 32) != 0) {
            accessibilityInfoDto = segmentOptionDto.accessibilityInfo;
        }
        if ((i & 64) != 0) {
            formBadgeDto = segmentOptionDto.badge;
        }
        if ((i & 128) != 0) {
            segmentHintDto = segmentOptionDto.hint;
        }
        if ((i & 256) != 0) {
            tapActionDto = segmentOptionDto.selectionAction;
        }
        if ((i & 512) != 0) {
            tapActionDto2 = segmentOptionDto.unselectionAction;
        }
        TapActionDto tapActionDto3 = tapActionDto;
        TapActionDto tapActionDto4 = tapActionDto2;
        FormBadgeDto formBadgeDto2 = formBadgeDto;
        SegmentHintDto segmentHintDto2 = segmentHintDto;
        Boolean bool3 = bool2;
        AccessibilityInfoDto accessibilityInfoDto2 = accessibilityInfoDto;
        return segmentOptionDto.copy(segmentTextDto, segmentTextDto2, obj, bool, bool3, accessibilityInfoDto2, formBadgeDto2, segmentHintDto2, tapActionDto3, tapActionDto4);
    }

    /* renamed from: component1, reason: from getter */
    public final SegmentTextDto getSelectedText() {
        return this.selectedText;
    }

    /* renamed from: component10, reason: from getter */
    public final TapActionDto getUnselectionAction() {
        return this.unselectionAction;
    }

    /* renamed from: component2, reason: from getter */
    public final SegmentTextDto getUnselectedText() {
        return this.unselectedText;
    }

    /* renamed from: component3, reason: from getter */
    public final Object getValue() {
        return this.value;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getDefault() {
        return this.default;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getIsAvailable() {
        return this.isAvailable;
    }

    /* renamed from: component6, reason: from getter */
    public final AccessibilityInfoDto getAccessibilityInfo() {
        return this.accessibilityInfo;
    }

    /* renamed from: component7, reason: from getter */
    public final FormBadgeDto getBadge() {
        return this.badge;
    }

    /* renamed from: component8, reason: from getter */
    public final SegmentHintDto getHint() {
        return this.hint;
    }

    /* renamed from: component9, reason: from getter */
    public final TapActionDto getSelectionAction() {
        return this.selectionAction;
    }

    public final SegmentOptionDto copy(@Json(name = "selected_text") SegmentTextDto selectedText, @Json(name = "unselected_text") SegmentTextDto unselectedText, @Json(name = "value") Object value, @Json(name = "default") Boolean r4, @Json(name = "is_available") Boolean isAvailable, @Json(name = "accessibility_info") AccessibilityInfoDto accessibilityInfo, @Json(name = "badge") FormBadgeDto badge, @Json(name = "hint") SegmentHintDto hint, @Json(name = "selection_action") TapActionDto selectionAction, @Json(name = "unselection_action") TapActionDto unselectionAction) {
        return new SegmentOptionDto(selectedText, unselectedText, value, r4, isAvailable, accessibilityInfo, badge, hint, selectionAction, unselectionAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SegmentOptionDto)) {
            return false;
        }
        SegmentOptionDto segmentOptionDto = (SegmentOptionDto) other;
        return jl40.l(this.selectedText, segmentOptionDto.selectedText) && jl40.l(this.unselectedText, segmentOptionDto.unselectedText) && jl40.l(this.value, segmentOptionDto.value) && jl40.l(this.default, segmentOptionDto.default) && jl40.l(this.isAvailable, segmentOptionDto.isAvailable) && jl40.l(this.accessibilityInfo, segmentOptionDto.accessibilityInfo) && jl40.l(this.badge, segmentOptionDto.badge) && jl40.l(this.hint, segmentOptionDto.hint) && jl40.l(this.selectionAction, segmentOptionDto.selectionAction) && jl40.l(this.unselectionAction, segmentOptionDto.unselectionAction);
    }

    public final AccessibilityInfoDto getAccessibilityInfo() {
        return this.accessibilityInfo;
    }

    public final FormBadgeDto getBadge() {
        return this.badge;
    }

    public final Boolean getDefault() {
        return this.default;
    }

    public final SegmentHintDto getHint() {
        return this.hint;
    }

    public final SegmentTextDto getSelectedText() {
        return this.selectedText;
    }

    public final TapActionDto getSelectionAction() {
        return this.selectionAction;
    }

    public final SegmentTextDto getUnselectedText() {
        return this.unselectedText;
    }

    public final TapActionDto getUnselectionAction() {
        return this.unselectionAction;
    }

    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        int c = smw0.c((this.unselectedText.hashCode() + (this.selectedText.hashCode() * 31)) * 31, 31, this.value);
        Boolean bool = this.default;
        int hashCode = (c + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isAvailable;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        AccessibilityInfoDto accessibilityInfoDto = this.accessibilityInfo;
        int hashCode3 = (hashCode2 + (accessibilityInfoDto == null ? 0 : accessibilityInfoDto.hashCode())) * 31;
        FormBadgeDto formBadgeDto = this.badge;
        int hashCode4 = (hashCode3 + (formBadgeDto == null ? 0 : formBadgeDto.hashCode())) * 31;
        SegmentHintDto segmentHintDto = this.hint;
        int hashCode5 = (hashCode4 + (segmentHintDto == null ? 0 : segmentHintDto.hashCode())) * 31;
        TapActionDto tapActionDto = this.selectionAction;
        int hashCode6 = (hashCode5 + (tapActionDto == null ? 0 : tapActionDto.hashCode())) * 31;
        TapActionDto tapActionDto2 = this.unselectionAction;
        return hashCode6 + (tapActionDto2 != null ? tapActionDto2.hashCode() : 0);
    }

    public final Boolean isAvailable() {
        return this.isAvailable;
    }

    public String toString() {
        return "SegmentOptionDto(selectedText=" + this.selectedText + ", unselectedText=" + this.unselectedText + ", value=" + this.value + ", default=" + this.default + ", isAvailable=" + this.isAvailable + ", accessibilityInfo=" + this.accessibilityInfo + ", badge=" + this.badge + ", hint=" + this.hint + ", selectionAction=" + this.selectionAction + ", unselectionAction=" + this.unselectionAction + Extension.C_BRAKE;
    }
}
