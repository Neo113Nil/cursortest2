package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.tse0;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.ContactDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.PhotoInfoDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.PointPinDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.PointVisitStatusDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B½\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\u0012\b\u0001\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\t0\bj\u0002`\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\f\u001a\u00020\u0003\u0012\b\b\u0001\u0010\r\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\b\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u0013\u00102\u001a\f\u0012\u0004\u0012\u00020\t0\bj\u0002`\nHÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\bHÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0018HÆ\u0003J¿\u0001\u0010>\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\u0012\b\u0003\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\t0\bj\u0002`\n2\b\b\u0003\u0010\u000b\u001a\u00020\u00032\b\b\u0003\u0010\f\u001a\u00020\u00032\b\b\u0003\u0010\r\u001a\u00020\u00032\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\b2\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÆ\u0001J\u0013\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010B\u001a\u00020CHÖ\u0001J\t\u0010D\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u001b\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\t0\bj\u0002`\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001cR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001cR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001cR\u0019\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b,\u0010!R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.¨\u0006E"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/OrderPointDto;", "", "pointId", "", "visitStatus", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PointVisitStatusDto;", LaunchBrowserActivity.KEY_URI, "coordinates", "", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/CoordinatesDto;", "fullText", "shortText", "areaDescription", "entrance", "floor", "room", AuthSdkActivity.RESPONSE_TYPE_CODE, "contact", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/ContactDto;", "comment", "commentImages", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PhotoInfoDto;", "pin", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PointPinDto;", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PointVisitStatusDto;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/ContactDto;Ljava/lang/String;Ljava/util/List;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PointPinDto;)V", "getPointId", "()Ljava/lang/String;", "getVisitStatus", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PointVisitStatusDto;", "getUri", "getCoordinates", "()Ljava/util/List;", "getFullText", "getShortText", "getAreaDescription", "getEntrance", "getFloor", "getRoom", "getCode", "getContact", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/ContactDto;", "getComment", "getCommentImages", "getPin", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PointPinDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class OrderPointDto {
    private final String areaDescription;
    private final String code;
    private final String comment;
    private final List<PhotoInfoDto> commentImages;
    private final ContactDto contact;
    private final List<Double> coordinates;
    private final String entrance;
    private final String floor;
    private final String fullText;
    private final PointPinDto pin;
    private final String pointId;
    private final String room;
    private final String shortText;
    private final String uri;
    private final PointVisitStatusDto visitStatus;

    public OrderPointDto(@Json(name = "point_id") String str, @Json(name = "visit_status") PointVisitStatusDto pointVisitStatusDto, @Json(name = "uri") String str2, @Json(name = "coordinates") List<Double> list, @Json(name = "full_text") String str3, @Json(name = "short_text") String str4, @Json(name = "area_description") String str5, @Json(name = "entrance") String str6, @Json(name = "floor") String str7, @Json(name = "room") String str8, @Json(name = "code") String str9, @Json(name = "contact") ContactDto contactDto, @Json(name = "comment") String str10, @Json(name = "comment_images") List<PhotoInfoDto> list2, @Json(name = "pin") PointPinDto pointPinDto) {
        this.pointId = str;
        this.visitStatus = pointVisitStatusDto;
        this.uri = str2;
        this.coordinates = list;
        this.fullText = str3;
        this.shortText = str4;
        this.areaDescription = str5;
        this.entrance = str6;
        this.floor = str7;
        this.room = str8;
        this.code = str9;
        this.contact = contactDto;
        this.comment = str10;
        this.commentImages = list2;
        this.pin = pointPinDto;
    }

    /* renamed from: component1, reason: from getter */
    public final String getPointId() {
        return this.pointId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getRoom() {
        return this.room;
    }

    /* renamed from: component11, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: component12, reason: from getter */
    public final ContactDto getContact() {
        return this.contact;
    }

    /* renamed from: component13, reason: from getter */
    public final String getComment() {
        return this.comment;
    }

    public final List<PhotoInfoDto> component14() {
        return this.commentImages;
    }

    /* renamed from: component15, reason: from getter */
    public final PointPinDto getPin() {
        return this.pin;
    }

    /* renamed from: component2, reason: from getter */
    public final PointVisitStatusDto getVisitStatus() {
        return this.visitStatus;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    public final List<Double> component4() {
        return this.coordinates;
    }

    /* renamed from: component5, reason: from getter */
    public final String getFullText() {
        return this.fullText;
    }

    /* renamed from: component6, reason: from getter */
    public final String getShortText() {
        return this.shortText;
    }

    /* renamed from: component7, reason: from getter */
    public final String getAreaDescription() {
        return this.areaDescription;
    }

    /* renamed from: component8, reason: from getter */
    public final String getEntrance() {
        return this.entrance;
    }

    /* renamed from: component9, reason: from getter */
    public final String getFloor() {
        return this.floor;
    }

    public final OrderPointDto copy(@Json(name = "point_id") String pointId, @Json(name = "visit_status") PointVisitStatusDto visitStatus, @Json(name = "uri") String uri, @Json(name = "coordinates") List<Double> coordinates, @Json(name = "full_text") String fullText, @Json(name = "short_text") String shortText, @Json(name = "area_description") String areaDescription, @Json(name = "entrance") String entrance, @Json(name = "floor") String floor, @Json(name = "room") String room, @Json(name = "code") String code, @Json(name = "contact") ContactDto contact, @Json(name = "comment") String comment, @Json(name = "comment_images") List<PhotoInfoDto> commentImages, @Json(name = "pin") PointPinDto pin) {
        return new OrderPointDto(pointId, visitStatus, uri, coordinates, fullText, shortText, areaDescription, entrance, floor, room, code, contact, comment, commentImages, pin);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderPointDto)) {
            return false;
        }
        OrderPointDto orderPointDto = (OrderPointDto) other;
        return jl40.l(this.pointId, orderPointDto.pointId) && this.visitStatus == orderPointDto.visitStatus && jl40.l(this.uri, orderPointDto.uri) && jl40.l(this.coordinates, orderPointDto.coordinates) && jl40.l(this.fullText, orderPointDto.fullText) && jl40.l(this.shortText, orderPointDto.shortText) && jl40.l(this.areaDescription, orderPointDto.areaDescription) && jl40.l(this.entrance, orderPointDto.entrance) && jl40.l(this.floor, orderPointDto.floor) && jl40.l(this.room, orderPointDto.room) && jl40.l(this.code, orderPointDto.code) && jl40.l(this.contact, orderPointDto.contact) && jl40.l(this.comment, orderPointDto.comment) && jl40.l(this.commentImages, orderPointDto.commentImages) && jl40.l(this.pin, orderPointDto.pin);
    }

    public final String getAreaDescription() {
        return this.areaDescription;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getComment() {
        return this.comment;
    }

    public final List<PhotoInfoDto> getCommentImages() {
        return this.commentImages;
    }

    public final ContactDto getContact() {
        return this.contact;
    }

    public final List<Double> getCoordinates() {
        return this.coordinates;
    }

    public final String getEntrance() {
        return this.entrance;
    }

    public final String getFloor() {
        return this.floor;
    }

    public final String getFullText() {
        return this.fullText;
    }

    public final PointPinDto getPin() {
        return this.pin;
    }

    public final String getPointId() {
        return this.pointId;
    }

    public final String getRoom() {
        return this.room;
    }

    public final String getShortText() {
        return this.shortText;
    }

    public final String getUri() {
        return this.uri;
    }

    public final PointVisitStatusDto getVisitStatus() {
        return this.visitStatus;
    }

    public int hashCode() {
        int b = unr0.b(unr0.b(unr0.b(unr0.c(unr0.b((this.visitStatus.hashCode() + (this.pointId.hashCode() * 31)) * 31, 31, this.uri), 31, this.coordinates), 31, this.fullText), 31, this.shortText), 31, this.areaDescription);
        String str = this.entrance;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.floor;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.room;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.code;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ContactDto contactDto = this.contact;
        int hashCode5 = (hashCode4 + (contactDto == null ? 0 : contactDto.hashCode())) * 31;
        String str5 = this.comment;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<PhotoInfoDto> list = this.commentImages;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        PointPinDto pointPinDto = this.pin;
        return hashCode7 + (pointPinDto != null ? pointPinDto.hashCode() : 0);
    }

    public String toString() {
        String str = this.pointId;
        PointVisitStatusDto pointVisitStatusDto = this.visitStatus;
        String str2 = this.uri;
        List<Double> list = this.coordinates;
        String str3 = this.fullText;
        String str4 = this.shortText;
        String str5 = this.areaDescription;
        String str6 = this.entrance;
        String str7 = this.floor;
        String str8 = this.room;
        String str9 = this.code;
        ContactDto contactDto = this.contact;
        String str10 = this.comment;
        List<PhotoInfoDto> list2 = this.commentImages;
        PointPinDto pointPinDto = this.pin;
        StringBuilder sb = new StringBuilder("OrderPointDto(pointId=");
        sb.append(str);
        sb.append(", visitStatus=");
        sb.append(pointVisitStatusDto);
        sb.append(", uri=");
        tse0.x(str2, ", coordinates=", ", fullText=", sb, list);
        g8e.D(sb, str3, ", shortText=", str4, ", areaDescription=");
        g8e.D(sb, str5, ", entrance=", str6, ", floor=");
        g8e.D(sb, str7, ", room=", str8, ", code=");
        sb.append(str9);
        sb.append(", contact=");
        sb.append(contactDto);
        sb.append(", comment=");
        tse0.x(str10, ", commentImages=", ", pin=", sb, list2);
        sb.append(pointPinDto);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
