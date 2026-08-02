package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverydraftrequest;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.oyr;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.ContactDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.PhotoInfoDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.PointTypeDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B©\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0012\b\u0001\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0001\u0010\f\u001a\u00020\u0005\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0013\u0010+\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\tHÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u00105\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0007HÆ\u0003J«\u0001\u00106\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0012\b\u0003\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t2\b\b\u0003\u0010\n\u001a\u00020\u00052\b\b\u0003\u0010\u000b\u001a\u00020\u00052\b\b\u0003\u0010\f\u001a\u00020\u00052\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0010\b\u0003\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0007HÆ\u0001J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020;HÖ\u0001J\t\u0010<\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001bR\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001d¨\u0006="}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverydraftrequest/DraftPointDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PointTypeDto;", LaunchBrowserActivity.KEY_URI, "", "coordinates", "", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/CoordinatesDto;", "fullText", "shortText", "areaDescription", "entrance", "floor", "room", AuthSdkActivity.RESPONSE_TYPE_CODE, "contact", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/ContactDto;", "comment", "commentImages", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PhotoInfoDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PointTypeDto;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/ContactDto;Ljava/lang/String;Ljava/util/List;)V", "getType", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PointTypeDto;", "getUri", "()Ljava/lang/String;", "getCoordinates", "()Ljava/util/List;", "getFullText", "getShortText", "getAreaDescription", "getEntrance", "getFloor", "getRoom", "getCode", "getContact", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/ContactDto;", "getComment", "getCommentImages", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DraftPointDto {
    private final String areaDescription;
    private final String code;
    private final String comment;
    private final List<PhotoInfoDto> commentImages;
    private final ContactDto contact;
    private final List<Double> coordinates;
    private final String entrance;
    private final String floor;
    private final String fullText;
    private final String room;
    private final String shortText;
    private final PointTypeDto type;
    private final String uri;

    public DraftPointDto(@Json(name = "type") PointTypeDto pointTypeDto, @Json(name = "uri") String str, @Json(name = "coordinates") List<Double> list, @Json(name = "full_text") String str2, @Json(name = "short_text") String str3, @Json(name = "area_description") String str4, @Json(name = "entrance") String str5, @Json(name = "floor") String str6, @Json(name = "room") String str7, @Json(name = "code") String str8, @Json(name = "contact") ContactDto contactDto, @Json(name = "comment") String str9, @Json(name = "comment_images") List<PhotoInfoDto> list2) {
        this.type = pointTypeDto;
        this.uri = str;
        this.coordinates = list;
        this.fullText = str2;
        this.shortText = str3;
        this.areaDescription = str4;
        this.entrance = str5;
        this.floor = str6;
        this.room = str7;
        this.code = str8;
        this.contact = contactDto;
        this.comment = str9;
        this.commentImages = list2;
    }

    public static /* synthetic */ DraftPointDto copy$default(DraftPointDto draftPointDto, PointTypeDto pointTypeDto, String str, List list, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ContactDto contactDto, String str9, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            pointTypeDto = draftPointDto.type;
        }
        return draftPointDto.copy(pointTypeDto, (i & 2) != 0 ? draftPointDto.uri : str, (i & 4) != 0 ? draftPointDto.coordinates : list, (i & 8) != 0 ? draftPointDto.fullText : str2, (i & 16) != 0 ? draftPointDto.shortText : str3, (i & 32) != 0 ? draftPointDto.areaDescription : str4, (i & 64) != 0 ? draftPointDto.entrance : str5, (i & 128) != 0 ? draftPointDto.floor : str6, (i & 256) != 0 ? draftPointDto.room : str7, (i & 512) != 0 ? draftPointDto.code : str8, (i & 1024) != 0 ? draftPointDto.contact : contactDto, (i & 2048) != 0 ? draftPointDto.comment : str9, (i & 4096) != 0 ? draftPointDto.commentImages : list2);
    }

    /* renamed from: component1, reason: from getter */
    public final PointTypeDto getType() {
        return this.type;
    }

    /* renamed from: component10, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: component11, reason: from getter */
    public final ContactDto getContact() {
        return this.contact;
    }

    /* renamed from: component12, reason: from getter */
    public final String getComment() {
        return this.comment;
    }

    public final List<PhotoInfoDto> component13() {
        return this.commentImages;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    public final List<Double> component3() {
        return this.coordinates;
    }

    /* renamed from: component4, reason: from getter */
    public final String getFullText() {
        return this.fullText;
    }

    /* renamed from: component5, reason: from getter */
    public final String getShortText() {
        return this.shortText;
    }

    /* renamed from: component6, reason: from getter */
    public final String getAreaDescription() {
        return this.areaDescription;
    }

    /* renamed from: component7, reason: from getter */
    public final String getEntrance() {
        return this.entrance;
    }

    /* renamed from: component8, reason: from getter */
    public final String getFloor() {
        return this.floor;
    }

    /* renamed from: component9, reason: from getter */
    public final String getRoom() {
        return this.room;
    }

    public final DraftPointDto copy(@Json(name = "type") PointTypeDto type, @Json(name = "uri") String uri, @Json(name = "coordinates") List<Double> coordinates, @Json(name = "full_text") String fullText, @Json(name = "short_text") String shortText, @Json(name = "area_description") String areaDescription, @Json(name = "entrance") String entrance, @Json(name = "floor") String floor, @Json(name = "room") String room, @Json(name = "code") String code, @Json(name = "contact") ContactDto contact, @Json(name = "comment") String comment, @Json(name = "comment_images") List<PhotoInfoDto> commentImages) {
        return new DraftPointDto(type, uri, coordinates, fullText, shortText, areaDescription, entrance, floor, room, code, contact, comment, commentImages);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DraftPointDto)) {
            return false;
        }
        DraftPointDto draftPointDto = (DraftPointDto) other;
        return this.type == draftPointDto.type && jl40.l(this.uri, draftPointDto.uri) && jl40.l(this.coordinates, draftPointDto.coordinates) && jl40.l(this.fullText, draftPointDto.fullText) && jl40.l(this.shortText, draftPointDto.shortText) && jl40.l(this.areaDescription, draftPointDto.areaDescription) && jl40.l(this.entrance, draftPointDto.entrance) && jl40.l(this.floor, draftPointDto.floor) && jl40.l(this.room, draftPointDto.room) && jl40.l(this.code, draftPointDto.code) && jl40.l(this.contact, draftPointDto.contact) && jl40.l(this.comment, draftPointDto.comment) && jl40.l(this.commentImages, draftPointDto.commentImages);
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

    public final String getRoom() {
        return this.room;
    }

    public final String getShortText() {
        return this.shortText;
    }

    public final PointTypeDto getType() {
        return this.type;
    }

    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.uri;
        int b = unr0.b(unr0.b(unr0.b(unr0.c((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.coordinates), 31, this.fullText), 31, this.shortText), 31, this.areaDescription);
        String str2 = this.entrance;
        int hashCode2 = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.floor;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.room;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.code;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        ContactDto contactDto = this.contact;
        int hashCode6 = (hashCode5 + (contactDto == null ? 0 : contactDto.hashCode())) * 31;
        String str6 = this.comment;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<PhotoInfoDto> list = this.commentImages;
        return hashCode7 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        PointTypeDto pointTypeDto = this.type;
        String str = this.uri;
        List<Double> list = this.coordinates;
        String str2 = this.fullText;
        String str3 = this.shortText;
        String str4 = this.areaDescription;
        String str5 = this.entrance;
        String str6 = this.floor;
        String str7 = this.room;
        String str8 = this.code;
        ContactDto contactDto = this.contact;
        String str9 = this.comment;
        List<PhotoInfoDto> list2 = this.commentImages;
        StringBuilder sb = new StringBuilder("DraftPointDto(type=");
        sb.append(pointTypeDto);
        sb.append(", uri=");
        sb.append(str);
        sb.append(", coordinates=");
        oyr.D(", fullText=", str2, ", shortText=", sb, list);
        g8e.D(sb, str3, ", areaDescription=", str4, ", entrance=");
        g8e.D(sb, str5, ", floor=", str6, ", room=");
        g8e.D(sb, str7, ", code=", str8, ", contact=");
        sb.append(contactDto);
        sb.append(", comment=");
        sb.append(str9);
        sb.append(", commentImages=");
        return ly3.s(sb, list2, Extension.C_BRAKE);
    }
}
