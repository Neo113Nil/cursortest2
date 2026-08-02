package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.tse0;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.libraries.deliverygooffers.definitions.RoutePointCommentImageDto;
import ru.yandex.taxi.logistics.sdk.dto.libraries.deliverygooffers.definitions.RoutePointContactDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003Jm\u0010%\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0010\b\u0003\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\t\u0010*\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006+"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/RoutePointDetailsDto;", "", "routePointIndex", "", "entrance", "", AuthSdkActivity.RESPONSE_TYPE_CODE, "floor", "room", "contact", "Lru/yandex/taxi/logistics/sdk/dto/libraries/deliverygooffers/definitions/RoutePointContactDto;", "comment", "commentImages", "", "Lru/yandex/taxi/logistics/sdk/dto/libraries/deliverygooffers/definitions/RoutePointCommentImageDto;", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/libraries/deliverygooffers/definitions/RoutePointContactDto;Ljava/lang/String;Ljava/util/List;)V", "getRoutePointIndex", "()I", "getEntrance", "()Ljava/lang/String;", "getCode", "getFloor", "getRoom", "getContact", "()Lru/yandex/taxi/logistics/sdk/dto/libraries/deliverygooffers/definitions/RoutePointContactDto;", "getComment", "getCommentImages", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RoutePointDetailsDto {
    private final String code;
    private final String comment;
    private final List<RoutePointCommentImageDto> commentImages;
    private final RoutePointContactDto contact;
    private final String entrance;
    private final String floor;
    private final String room;
    private final int routePointIndex;

    public RoutePointDetailsDto(@Json(name = "route_point_index") int i, @Json(name = "entrance") String str, @Json(name = "code") String str2, @Json(name = "floor") String str3, @Json(name = "room") String str4, @Json(name = "contact") RoutePointContactDto routePointContactDto, @Json(name = "comment") String str5, @Json(name = "comment_images") List<RoutePointCommentImageDto> list) {
        this.routePointIndex = i;
        this.entrance = str;
        this.code = str2;
        this.floor = str3;
        this.room = str4;
        this.contact = routePointContactDto;
        this.comment = str5;
        this.commentImages = list;
    }

    public static /* synthetic */ RoutePointDetailsDto copy$default(RoutePointDetailsDto routePointDetailsDto, int i, String str, String str2, String str3, String str4, RoutePointContactDto routePointContactDto, String str5, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = routePointDetailsDto.routePointIndex;
        }
        if ((i2 & 2) != 0) {
            str = routePointDetailsDto.entrance;
        }
        if ((i2 & 4) != 0) {
            str2 = routePointDetailsDto.code;
        }
        if ((i2 & 8) != 0) {
            str3 = routePointDetailsDto.floor;
        }
        if ((i2 & 16) != 0) {
            str4 = routePointDetailsDto.room;
        }
        if ((i2 & 32) != 0) {
            routePointContactDto = routePointDetailsDto.contact;
        }
        if ((i2 & 64) != 0) {
            str5 = routePointDetailsDto.comment;
        }
        if ((i2 & 128) != 0) {
            list = routePointDetailsDto.commentImages;
        }
        String str6 = str5;
        List list2 = list;
        String str7 = str4;
        RoutePointContactDto routePointContactDto2 = routePointContactDto;
        return routePointDetailsDto.copy(i, str, str2, str3, str7, routePointContactDto2, str6, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getRoutePointIndex() {
        return this.routePointIndex;
    }

    /* renamed from: component2, reason: from getter */
    public final String getEntrance() {
        return this.entrance;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: component4, reason: from getter */
    public final String getFloor() {
        return this.floor;
    }

    /* renamed from: component5, reason: from getter */
    public final String getRoom() {
        return this.room;
    }

    /* renamed from: component6, reason: from getter */
    public final RoutePointContactDto getContact() {
        return this.contact;
    }

    /* renamed from: component7, reason: from getter */
    public final String getComment() {
        return this.comment;
    }

    public final List<RoutePointCommentImageDto> component8() {
        return this.commentImages;
    }

    public final RoutePointDetailsDto copy(@Json(name = "route_point_index") int routePointIndex, @Json(name = "entrance") String entrance, @Json(name = "code") String code, @Json(name = "floor") String floor, @Json(name = "room") String room, @Json(name = "contact") RoutePointContactDto contact, @Json(name = "comment") String comment, @Json(name = "comment_images") List<RoutePointCommentImageDto> commentImages) {
        return new RoutePointDetailsDto(routePointIndex, entrance, code, floor, room, contact, comment, commentImages);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoutePointDetailsDto)) {
            return false;
        }
        RoutePointDetailsDto routePointDetailsDto = (RoutePointDetailsDto) other;
        return this.routePointIndex == routePointDetailsDto.routePointIndex && jl40.l(this.entrance, routePointDetailsDto.entrance) && jl40.l(this.code, routePointDetailsDto.code) && jl40.l(this.floor, routePointDetailsDto.floor) && jl40.l(this.room, routePointDetailsDto.room) && jl40.l(this.contact, routePointDetailsDto.contact) && jl40.l(this.comment, routePointDetailsDto.comment) && jl40.l(this.commentImages, routePointDetailsDto.commentImages);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getComment() {
        return this.comment;
    }

    public final List<RoutePointCommentImageDto> getCommentImages() {
        return this.commentImages;
    }

    public final RoutePointContactDto getContact() {
        return this.contact;
    }

    public final String getEntrance() {
        return this.entrance;
    }

    public final String getFloor() {
        return this.floor;
    }

    public final String getRoom() {
        return this.room;
    }

    public final int getRoutePointIndex() {
        return this.routePointIndex;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.routePointIndex) * 31;
        String str = this.entrance;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.code;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.floor;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.room;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        RoutePointContactDto routePointContactDto = this.contact;
        int hashCode6 = (hashCode5 + (routePointContactDto == null ? 0 : routePointContactDto.hashCode())) * 31;
        String str5 = this.comment;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<RoutePointCommentImageDto> list = this.commentImages;
        return hashCode7 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        int i = this.routePointIndex;
        String str = this.entrance;
        String str2 = this.code;
        String str3 = this.floor;
        String str4 = this.room;
        RoutePointContactDto routePointContactDto = this.contact;
        String str5 = this.comment;
        List<RoutePointCommentImageDto> list = this.commentImages;
        StringBuilder v = unr0.v(i, "RoutePointDetailsDto(routePointIndex=", ", entrance=", str, ", code=");
        g8e.D(v, str2, ", floor=", str3, ", room=");
        v.append(str4);
        v.append(", contact=");
        v.append(routePointContactDto);
        v.append(", comment=");
        return tse0.j(str5, ", commentImages=", Extension.C_BRAKE, v, list);
    }
}
