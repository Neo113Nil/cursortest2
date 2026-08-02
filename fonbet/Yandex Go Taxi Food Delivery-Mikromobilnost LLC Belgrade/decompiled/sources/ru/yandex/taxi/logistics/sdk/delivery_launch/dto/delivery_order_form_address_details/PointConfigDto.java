package ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_order_form_address_details;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0003\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\f\u001a\u00020\r\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001bJ\t\u0010*\u001a\u00020\nHÆ\u0003J\t\u0010+\u001a\u00020\rHÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010-\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0082\u0001\u0010.\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0003\u0010\u000b\u001a\u00020\n2\b\b\u0003\u0010\f\u001a\u00020\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u0010/J\u0014\u00100\u001a\u00020\n2\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00102\u001a\u000203HÖ\u0081\u0004J\n\u00104\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u000e\u0010\u001bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00065"}, d2 = {"Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/PointConfigDto;", "", "porchKey", "", "apartmentKey", "floorKey", "doorphoneKey", "commentKey", "contactKey", "shouldHidePhoneSelection", "", "shouldHideDetaisScreen", "phoneSelectionScreenConfig", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/PhoneSelectionScreenConfigDto;", "isContactBoundToPoint", "selectContactButtonConfig", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/SelectContactButtonConfigDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZLru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/PhoneSelectionScreenConfigDto;Ljava/lang/Boolean;Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/SelectContactButtonConfigDto;)V", "getPorchKey", "()Ljava/lang/String;", "getApartmentKey", "getFloorKey", "getDoorphoneKey", "getCommentKey", "getContactKey", "getShouldHidePhoneSelection", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getShouldHideDetaisScreen", "()Z", "getPhoneSelectionScreenConfig", "()Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/PhoneSelectionScreenConfigDto;", "getSelectContactButtonConfig", "()Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/SelectContactButtonConfigDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZLru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/PhoneSelectionScreenConfigDto;Ljava/lang/Boolean;Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/SelectContactButtonConfigDto;)Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/PointConfigDto;", "equals", "other", "hashCode", "", "toString", "sdk-delivery-launch"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PointConfigDto {
    private final String apartmentKey;
    private final String commentKey;
    private final String contactKey;
    private final String doorphoneKey;
    private final String floorKey;
    private final Boolean isContactBoundToPoint;
    private final PhoneSelectionScreenConfigDto phoneSelectionScreenConfig;
    private final String porchKey;
    private final SelectContactButtonConfigDto selectContactButtonConfig;
    private final boolean shouldHideDetaisScreen;
    private final Boolean shouldHidePhoneSelection;

    public /* synthetic */ PointConfigDto(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, boolean z, PhoneSelectionScreenConfigDto phoneSelectionScreenConfigDto, Boolean bool2, SelectContactButtonConfigDto selectContactButtonConfigDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, bool, (i & 128) != 0 ? false : z, phoneSelectionScreenConfigDto, bool2, selectContactButtonConfigDto);
    }

    public static /* synthetic */ PointConfigDto copy$default(PointConfigDto pointConfigDto, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, boolean z, PhoneSelectionScreenConfigDto phoneSelectionScreenConfigDto, Boolean bool2, SelectContactButtonConfigDto selectContactButtonConfigDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pointConfigDto.porchKey;
        }
        if ((i & 2) != 0) {
            str2 = pointConfigDto.apartmentKey;
        }
        if ((i & 4) != 0) {
            str3 = pointConfigDto.floorKey;
        }
        if ((i & 8) != 0) {
            str4 = pointConfigDto.doorphoneKey;
        }
        if ((i & 16) != 0) {
            str5 = pointConfigDto.commentKey;
        }
        if ((i & 32) != 0) {
            str6 = pointConfigDto.contactKey;
        }
        if ((i & 64) != 0) {
            bool = pointConfigDto.shouldHidePhoneSelection;
        }
        if ((i & 128) != 0) {
            z = pointConfigDto.shouldHideDetaisScreen;
        }
        if ((i & 256) != 0) {
            phoneSelectionScreenConfigDto = pointConfigDto.phoneSelectionScreenConfig;
        }
        if ((i & 512) != 0) {
            bool2 = pointConfigDto.isContactBoundToPoint;
        }
        if ((i & 1024) != 0) {
            selectContactButtonConfigDto = pointConfigDto.selectContactButtonConfig;
        }
        Boolean bool3 = bool2;
        SelectContactButtonConfigDto selectContactButtonConfigDto2 = selectContactButtonConfigDto;
        boolean z2 = z;
        PhoneSelectionScreenConfigDto phoneSelectionScreenConfigDto2 = phoneSelectionScreenConfigDto;
        String str7 = str6;
        Boolean bool4 = bool;
        String str8 = str5;
        String str9 = str3;
        return pointConfigDto.copy(str, str2, str9, str4, str8, str7, bool4, z2, phoneSelectionScreenConfigDto2, bool3, selectContactButtonConfigDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPorchKey() {
        return this.porchKey;
    }

    /* renamed from: component10, reason: from getter */
    public final Boolean getIsContactBoundToPoint() {
        return this.isContactBoundToPoint;
    }

    /* renamed from: component11, reason: from getter */
    public final SelectContactButtonConfigDto getSelectContactButtonConfig() {
        return this.selectContactButtonConfig;
    }

    /* renamed from: component2, reason: from getter */
    public final String getApartmentKey() {
        return this.apartmentKey;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFloorKey() {
        return this.floorKey;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDoorphoneKey() {
        return this.doorphoneKey;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCommentKey() {
        return this.commentKey;
    }

    /* renamed from: component6, reason: from getter */
    public final String getContactKey() {
        return this.contactKey;
    }

    /* renamed from: component7, reason: from getter */
    public final Boolean getShouldHidePhoneSelection() {
        return this.shouldHidePhoneSelection;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getShouldHideDetaisScreen() {
        return this.shouldHideDetaisScreen;
    }

    /* renamed from: component9, reason: from getter */
    public final PhoneSelectionScreenConfigDto getPhoneSelectionScreenConfig() {
        return this.phoneSelectionScreenConfig;
    }

    public final PointConfigDto copy(@Json(name = "porch_key") String porchKey, @Json(name = "apartment_key") String apartmentKey, @Json(name = "floor_key") String floorKey, @Json(name = "doorphone_key") String doorphoneKey, @Json(name = "comment_key") String commentKey, @Json(name = "contact_key") String contactKey, @Json(name = "should_hide_phone_selection") Boolean shouldHidePhoneSelection, @Json(name = "should_hide_detais_screen") boolean shouldHideDetaisScreen, @Json(name = "phone_selection_screen_config") PhoneSelectionScreenConfigDto phoneSelectionScreenConfig, @Json(name = "is_contact_bound_to_point") Boolean isContactBoundToPoint, @Json(name = "select_contact_button_config") SelectContactButtonConfigDto selectContactButtonConfig) {
        return new PointConfigDto(porchKey, apartmentKey, floorKey, doorphoneKey, commentKey, contactKey, shouldHidePhoneSelection, shouldHideDetaisScreen, phoneSelectionScreenConfig, isContactBoundToPoint, selectContactButtonConfig);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PointConfigDto)) {
            return false;
        }
        PointConfigDto pointConfigDto = (PointConfigDto) other;
        return jl40.l(this.porchKey, pointConfigDto.porchKey) && jl40.l(this.apartmentKey, pointConfigDto.apartmentKey) && jl40.l(this.floorKey, pointConfigDto.floorKey) && jl40.l(this.doorphoneKey, pointConfigDto.doorphoneKey) && jl40.l(this.commentKey, pointConfigDto.commentKey) && jl40.l(this.contactKey, pointConfigDto.contactKey) && jl40.l(this.shouldHidePhoneSelection, pointConfigDto.shouldHidePhoneSelection) && this.shouldHideDetaisScreen == pointConfigDto.shouldHideDetaisScreen && jl40.l(this.phoneSelectionScreenConfig, pointConfigDto.phoneSelectionScreenConfig) && jl40.l(this.isContactBoundToPoint, pointConfigDto.isContactBoundToPoint) && jl40.l(this.selectContactButtonConfig, pointConfigDto.selectContactButtonConfig);
    }

    public final String getApartmentKey() {
        return this.apartmentKey;
    }

    public final String getCommentKey() {
        return this.commentKey;
    }

    public final String getContactKey() {
        return this.contactKey;
    }

    public final String getDoorphoneKey() {
        return this.doorphoneKey;
    }

    public final String getFloorKey() {
        return this.floorKey;
    }

    public final PhoneSelectionScreenConfigDto getPhoneSelectionScreenConfig() {
        return this.phoneSelectionScreenConfig;
    }

    public final String getPorchKey() {
        return this.porchKey;
    }

    public final SelectContactButtonConfigDto getSelectContactButtonConfig() {
        return this.selectContactButtonConfig;
    }

    public final boolean getShouldHideDetaisScreen() {
        return this.shouldHideDetaisScreen;
    }

    public final Boolean getShouldHidePhoneSelection() {
        return this.shouldHidePhoneSelection;
    }

    public int hashCode() {
        int b = unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(this.porchKey.hashCode() * 31, 31, this.apartmentKey), 31, this.floorKey), 31, this.doorphoneKey), 31, this.commentKey), 31, this.contactKey);
        Boolean bool = this.shouldHidePhoneSelection;
        int hashCode = (this.phoneSelectionScreenConfig.hashCode() + unr0.e((b + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.shouldHideDetaisScreen)) * 31;
        Boolean bool2 = this.isContactBoundToPoint;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        SelectContactButtonConfigDto selectContactButtonConfigDto = this.selectContactButtonConfig;
        return hashCode2 + (selectContactButtonConfigDto != null ? selectContactButtonConfigDto.hashCode() : 0);
    }

    public final Boolean isContactBoundToPoint() {
        return this.isContactBoundToPoint;
    }

    public String toString() {
        String str = this.porchKey;
        String str2 = this.apartmentKey;
        String str3 = this.floorKey;
        String str4 = this.doorphoneKey;
        String str5 = this.commentKey;
        String str6 = this.contactKey;
        Boolean bool = this.shouldHidePhoneSelection;
        boolean z = this.shouldHideDetaisScreen;
        PhoneSelectionScreenConfigDto phoneSelectionScreenConfigDto = this.phoneSelectionScreenConfig;
        Boolean bool2 = this.isContactBoundToPoint;
        SelectContactButtonConfigDto selectContactButtonConfigDto = this.selectContactButtonConfig;
        StringBuilder v = b64.v("PointConfigDto(porchKey=", str, ", apartmentKey=", str2, ", floorKey=");
        g8e.D(v, str3, ", doorphoneKey=", str4, ", commentKey=");
        g8e.D(v, str5, ", contactKey=", str6, ", shouldHidePhoneSelection=");
        v.append(bool);
        v.append(", shouldHideDetaisScreen=");
        v.append(z);
        v.append(", phoneSelectionScreenConfig=");
        v.append(phoneSelectionScreenConfigDto);
        v.append(", isContactBoundToPoint=");
        v.append(bool2);
        v.append(", selectContactButtonConfig=");
        v.append(selectContactButtonConfigDto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public PointConfigDto(@Json(name = "porch_key") String str, @Json(name = "apartment_key") String str2, @Json(name = "floor_key") String str3, @Json(name = "doorphone_key") String str4, @Json(name = "comment_key") String str5, @Json(name = "contact_key") String str6, @Json(name = "should_hide_phone_selection") Boolean bool, @Json(name = "should_hide_detais_screen") boolean z, @Json(name = "phone_selection_screen_config") PhoneSelectionScreenConfigDto phoneSelectionScreenConfigDto, @Json(name = "is_contact_bound_to_point") Boolean bool2, @Json(name = "select_contact_button_config") SelectContactButtonConfigDto selectContactButtonConfigDto) {
        this.porchKey = str;
        this.apartmentKey = str2;
        this.floorKey = str3;
        this.doorphoneKey = str4;
        this.commentKey = str5;
        this.contactKey = str6;
        this.shouldHidePhoneSelection = bool;
        this.shouldHideDetaisScreen = z;
        this.phoneSelectionScreenConfig = phoneSelectionScreenConfigDto;
        this.isContactBoundToPoint = bool2;
        this.selectContactButtonConfig = selectContactButtonConfigDto;
    }
}
