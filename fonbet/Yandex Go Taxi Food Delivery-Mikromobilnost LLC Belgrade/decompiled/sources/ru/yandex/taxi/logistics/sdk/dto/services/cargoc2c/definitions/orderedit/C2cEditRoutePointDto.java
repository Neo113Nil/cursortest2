package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.orderedit;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.oyr;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.PhotoInfoDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\rHÆ\u0003Jm\u0010#\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006*"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/C2cEditRoutePointDto;", "", "pointId", "", "comment", "commentImages", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PhotoInfoDto;", "entrance", "floor", "apartment", "doorPhone", "contact", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/ContactInfoDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/ContactInfoDto;)V", "getPointId", "()Ljava/lang/String;", "getComment", "getCommentImages", "()Ljava/util/List;", "getEntrance", "getFloor", "getApartment", "getDoorPhone", "getContact", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/ContactInfoDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class C2cEditRoutePointDto {
    private final String apartment;
    private final String comment;
    private final List<PhotoInfoDto> commentImages;
    private final ContactInfoDto contact;
    private final String doorPhone;
    private final String entrance;
    private final String floor;
    private final String pointId;

    public C2cEditRoutePointDto(@Json(name = "point_id") String str, @Json(name = "comment") String str2, @Json(name = "comment_images") List<PhotoInfoDto> list, @Json(name = "entrance") String str3, @Json(name = "floor") String str4, @Json(name = "apartment") String str5, @Json(name = "door_phone") String str6, @Json(name = "contact") ContactInfoDto contactInfoDto) {
        this.pointId = str;
        this.comment = str2;
        this.commentImages = list;
        this.entrance = str3;
        this.floor = str4;
        this.apartment = str5;
        this.doorPhone = str6;
        this.contact = contactInfoDto;
    }

    public static /* synthetic */ C2cEditRoutePointDto copy$default(C2cEditRoutePointDto c2cEditRoutePointDto, String str, String str2, List list, String str3, String str4, String str5, String str6, ContactInfoDto contactInfoDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c2cEditRoutePointDto.pointId;
        }
        if ((i & 2) != 0) {
            str2 = c2cEditRoutePointDto.comment;
        }
        if ((i & 4) != 0) {
            list = c2cEditRoutePointDto.commentImages;
        }
        if ((i & 8) != 0) {
            str3 = c2cEditRoutePointDto.entrance;
        }
        if ((i & 16) != 0) {
            str4 = c2cEditRoutePointDto.floor;
        }
        if ((i & 32) != 0) {
            str5 = c2cEditRoutePointDto.apartment;
        }
        if ((i & 64) != 0) {
            str6 = c2cEditRoutePointDto.doorPhone;
        }
        if ((i & 128) != 0) {
            contactInfoDto = c2cEditRoutePointDto.contact;
        }
        String str7 = str6;
        ContactInfoDto contactInfoDto2 = contactInfoDto;
        String str8 = str4;
        String str9 = str5;
        return c2cEditRoutePointDto.copy(str, str2, list, str3, str8, str9, str7, contactInfoDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPointId() {
        return this.pointId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getComment() {
        return this.comment;
    }

    public final List<PhotoInfoDto> component3() {
        return this.commentImages;
    }

    /* renamed from: component4, reason: from getter */
    public final String getEntrance() {
        return this.entrance;
    }

    /* renamed from: component5, reason: from getter */
    public final String getFloor() {
        return this.floor;
    }

    /* renamed from: component6, reason: from getter */
    public final String getApartment() {
        return this.apartment;
    }

    /* renamed from: component7, reason: from getter */
    public final String getDoorPhone() {
        return this.doorPhone;
    }

    /* renamed from: component8, reason: from getter */
    public final ContactInfoDto getContact() {
        return this.contact;
    }

    public final C2cEditRoutePointDto copy(@Json(name = "point_id") String pointId, @Json(name = "comment") String comment, @Json(name = "comment_images") List<PhotoInfoDto> commentImages, @Json(name = "entrance") String entrance, @Json(name = "floor") String floor, @Json(name = "apartment") String apartment, @Json(name = "door_phone") String doorPhone, @Json(name = "contact") ContactInfoDto contact) {
        return new C2cEditRoutePointDto(pointId, comment, commentImages, entrance, floor, apartment, doorPhone, contact);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C2cEditRoutePointDto)) {
            return false;
        }
        C2cEditRoutePointDto c2cEditRoutePointDto = (C2cEditRoutePointDto) other;
        return jl40.l(this.pointId, c2cEditRoutePointDto.pointId) && jl40.l(this.comment, c2cEditRoutePointDto.comment) && jl40.l(this.commentImages, c2cEditRoutePointDto.commentImages) && jl40.l(this.entrance, c2cEditRoutePointDto.entrance) && jl40.l(this.floor, c2cEditRoutePointDto.floor) && jl40.l(this.apartment, c2cEditRoutePointDto.apartment) && jl40.l(this.doorPhone, c2cEditRoutePointDto.doorPhone) && jl40.l(this.contact, c2cEditRoutePointDto.contact);
    }

    public final String getApartment() {
        return this.apartment;
    }

    public final String getComment() {
        return this.comment;
    }

    public final List<PhotoInfoDto> getCommentImages() {
        return this.commentImages;
    }

    public final ContactInfoDto getContact() {
        return this.contact;
    }

    public final String getDoorPhone() {
        return this.doorPhone;
    }

    public final String getEntrance() {
        return this.entrance;
    }

    public final String getFloor() {
        return this.floor;
    }

    public final String getPointId() {
        return this.pointId;
    }

    public int hashCode() {
        int hashCode = this.pointId.hashCode() * 31;
        String str = this.comment;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<PhotoInfoDto> list = this.commentImages;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.entrance;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.floor;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.apartment;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.doorPhone;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        ContactInfoDto contactInfoDto = this.contact;
        return hashCode7 + (contactInfoDto != null ? contactInfoDto.hashCode() : 0);
    }

    public String toString() {
        String str = this.pointId;
        String str2 = this.comment;
        List<PhotoInfoDto> list = this.commentImages;
        String str3 = this.entrance;
        String str4 = this.floor;
        String str5 = this.apartment;
        String str6 = this.doorPhone;
        ContactInfoDto contactInfoDto = this.contact;
        StringBuilder v = b64.v("C2cEditRoutePointDto(pointId=", str, ", comment=", str2, ", commentImages=");
        oyr.D(", entrance=", str3, ", floor=", v, list);
        g8e.D(v, str4, ", apartment=", str5, ", doorPhone=");
        v.append(str6);
        v.append(", contact=");
        v.append(contactInfoDto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
