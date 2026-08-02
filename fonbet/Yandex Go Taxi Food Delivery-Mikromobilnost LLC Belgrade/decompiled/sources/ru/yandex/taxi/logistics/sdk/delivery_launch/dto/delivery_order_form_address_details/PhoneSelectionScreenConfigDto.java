package ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_order_form_address_details;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003Je\u0010 \u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0014\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010$\u001a\u00020%HÖ\u0081\u0004J\n\u0010&\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006'"}, d2 = {"Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/PhoneSelectionScreenConfigDto;", "", "readContactsPermissionKey", "", "titleKey", "descriptionKey", "userContactNameKey", "emptyContactTitleKey", "emptyContactSubtitleKey", "buttonTitleKey", "testKeyObject", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/TestConfigDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/TestConfigDto;)V", "getReadContactsPermissionKey", "()Ljava/lang/String;", "getTitleKey", "getDescriptionKey", "getUserContactNameKey", "getEmptyContactTitleKey", "getEmptyContactSubtitleKey", "getButtonTitleKey", "getTestKeyObject", "()Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/TestConfigDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk-delivery-launch"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PhoneSelectionScreenConfigDto {
    private final String buttonTitleKey;
    private final String descriptionKey;
    private final String emptyContactSubtitleKey;
    private final String emptyContactTitleKey;
    private final String readContactsPermissionKey;
    private final TestConfigDto testKeyObject;
    private final String titleKey;
    private final String userContactNameKey;

    public PhoneSelectionScreenConfigDto(@Json(name = "read_contacts_permission_key") String str, @Json(name = "title_key") String str2, @Json(name = "description_key") String str3, @Json(name = "user_contact_name_key") String str4, @Json(name = "empty_contact_title_key") String str5, @Json(name = "empty_contact_subtitle_key") String str6, @Json(name = "button_title_key") String str7, @Json(name = "test_key_object") TestConfigDto testConfigDto) {
        this.readContactsPermissionKey = str;
        this.titleKey = str2;
        this.descriptionKey = str3;
        this.userContactNameKey = str4;
        this.emptyContactTitleKey = str5;
        this.emptyContactSubtitleKey = str6;
        this.buttonTitleKey = str7;
        this.testKeyObject = testConfigDto;
    }

    public static /* synthetic */ PhoneSelectionScreenConfigDto copy$default(PhoneSelectionScreenConfigDto phoneSelectionScreenConfigDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, TestConfigDto testConfigDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = phoneSelectionScreenConfigDto.readContactsPermissionKey;
        }
        if ((i & 2) != 0) {
            str2 = phoneSelectionScreenConfigDto.titleKey;
        }
        if ((i & 4) != 0) {
            str3 = phoneSelectionScreenConfigDto.descriptionKey;
        }
        if ((i & 8) != 0) {
            str4 = phoneSelectionScreenConfigDto.userContactNameKey;
        }
        if ((i & 16) != 0) {
            str5 = phoneSelectionScreenConfigDto.emptyContactTitleKey;
        }
        if ((i & 32) != 0) {
            str6 = phoneSelectionScreenConfigDto.emptyContactSubtitleKey;
        }
        if ((i & 64) != 0) {
            str7 = phoneSelectionScreenConfigDto.buttonTitleKey;
        }
        if ((i & 128) != 0) {
            testConfigDto = phoneSelectionScreenConfigDto.testKeyObject;
        }
        String str8 = str7;
        TestConfigDto testConfigDto2 = testConfigDto;
        String str9 = str5;
        String str10 = str6;
        return phoneSelectionScreenConfigDto.copy(str, str2, str3, str4, str9, str10, str8, testConfigDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getReadContactsPermissionKey() {
        return this.readContactsPermissionKey;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitleKey() {
        return this.titleKey;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescriptionKey() {
        return this.descriptionKey;
    }

    /* renamed from: component4, reason: from getter */
    public final String getUserContactNameKey() {
        return this.userContactNameKey;
    }

    /* renamed from: component5, reason: from getter */
    public final String getEmptyContactTitleKey() {
        return this.emptyContactTitleKey;
    }

    /* renamed from: component6, reason: from getter */
    public final String getEmptyContactSubtitleKey() {
        return this.emptyContactSubtitleKey;
    }

    /* renamed from: component7, reason: from getter */
    public final String getButtonTitleKey() {
        return this.buttonTitleKey;
    }

    /* renamed from: component8, reason: from getter */
    public final TestConfigDto getTestKeyObject() {
        return this.testKeyObject;
    }

    public final PhoneSelectionScreenConfigDto copy(@Json(name = "read_contacts_permission_key") String readContactsPermissionKey, @Json(name = "title_key") String titleKey, @Json(name = "description_key") String descriptionKey, @Json(name = "user_contact_name_key") String userContactNameKey, @Json(name = "empty_contact_title_key") String emptyContactTitleKey, @Json(name = "empty_contact_subtitle_key") String emptyContactSubtitleKey, @Json(name = "button_title_key") String buttonTitleKey, @Json(name = "test_key_object") TestConfigDto testKeyObject) {
        return new PhoneSelectionScreenConfigDto(readContactsPermissionKey, titleKey, descriptionKey, userContactNameKey, emptyContactTitleKey, emptyContactSubtitleKey, buttonTitleKey, testKeyObject);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhoneSelectionScreenConfigDto)) {
            return false;
        }
        PhoneSelectionScreenConfigDto phoneSelectionScreenConfigDto = (PhoneSelectionScreenConfigDto) other;
        return jl40.l(this.readContactsPermissionKey, phoneSelectionScreenConfigDto.readContactsPermissionKey) && jl40.l(this.titleKey, phoneSelectionScreenConfigDto.titleKey) && jl40.l(this.descriptionKey, phoneSelectionScreenConfigDto.descriptionKey) && jl40.l(this.userContactNameKey, phoneSelectionScreenConfigDto.userContactNameKey) && jl40.l(this.emptyContactTitleKey, phoneSelectionScreenConfigDto.emptyContactTitleKey) && jl40.l(this.emptyContactSubtitleKey, phoneSelectionScreenConfigDto.emptyContactSubtitleKey) && jl40.l(this.buttonTitleKey, phoneSelectionScreenConfigDto.buttonTitleKey) && jl40.l(this.testKeyObject, phoneSelectionScreenConfigDto.testKeyObject);
    }

    public final String getButtonTitleKey() {
        return this.buttonTitleKey;
    }

    public final String getDescriptionKey() {
        return this.descriptionKey;
    }

    public final String getEmptyContactSubtitleKey() {
        return this.emptyContactSubtitleKey;
    }

    public final String getEmptyContactTitleKey() {
        return this.emptyContactTitleKey;
    }

    public final String getReadContactsPermissionKey() {
        return this.readContactsPermissionKey;
    }

    public final TestConfigDto getTestKeyObject() {
        return this.testKeyObject;
    }

    public final String getTitleKey() {
        return this.titleKey;
    }

    public final String getUserContactNameKey() {
        return this.userContactNameKey;
    }

    public int hashCode() {
        int b = unr0.b(this.readContactsPermissionKey.hashCode() * 31, 31, this.titleKey);
        String str = this.descriptionKey;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.userContactNameKey;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.emptyContactTitleKey;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.emptyContactSubtitleKey;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.buttonTitleKey;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        TestConfigDto testConfigDto = this.testKeyObject;
        return hashCode5 + (testConfigDto != null ? testConfigDto.hashCode() : 0);
    }

    public String toString() {
        String str = this.readContactsPermissionKey;
        String str2 = this.titleKey;
        String str3 = this.descriptionKey;
        String str4 = this.userContactNameKey;
        String str5 = this.emptyContactTitleKey;
        String str6 = this.emptyContactSubtitleKey;
        String str7 = this.buttonTitleKey;
        TestConfigDto testConfigDto = this.testKeyObject;
        StringBuilder v = b64.v("PhoneSelectionScreenConfigDto(readContactsPermissionKey=", str, ", titleKey=", str2, ", descriptionKey=");
        g8e.D(v, str3, ", userContactNameKey=", str4, ", emptyContactTitleKey=");
        g8e.D(v, str5, ", emptyContactSubtitleKey=", str6, ", buttonTitleKey=");
        v.append(str7);
        v.append(", testKeyObject=");
        v.append(testConfigDto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
