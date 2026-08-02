package ru.yandex.taxi.logistics.sdk.dto.libraries.deliverygooffers.formclientstate;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.ly3;
import defpackage.tse0;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.libraries.deliverygooffers.definitions.RoutePointCommentImageDto;
import ru.yandex.taxi.logistics.sdk.dto.libraries.deliverygooffers.definitions.RoutePointContactDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001<B©\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\r\u001a\u00020\u000e\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0012\b\u0001\u0010\u0010\u001a\f\u0012\u0004\u0012\u00020\u00030\u0011j\u0002`\u0012\u0012\u0010\b\u0001\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00101\u001a\u00020\u000eHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0013\u00103\u001a\f\u0012\u0004\u0012\u00020\u00030\u0011j\u0002`\u0012HÆ\u0003J\u0011\u00104\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0011HÆ\u0003J«\u0001\u00105\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\r\u001a\u00020\u000e2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0012\b\u0003\u0010\u0010\u001a\f\u0012\u0004\u0012\u00020\u00030\u0011j\u0002`\u00122\u0010\b\u0003\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0011HÆ\u0001J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020:HÖ\u0001J\t\u0010;\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u001b\u0010\u0010\u001a\f\u0012\u0004\u0012\u00020\u00030\u0011j\u0002`\u0012¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0019\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&¨\u0006="}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/libraries/deliverygooffers/formclientstate/FormStateRoutePointDto;", "", "fullText", "", "shortText", "areaDescription", "entrance", AuthSdkActivity.RESPONSE_TYPE_CODE, "floor", "room", "contact", "Lru/yandex/taxi/logistics/sdk/dto/libraries/deliverygooffers/definitions/RoutePointContactDto;", "comment", "type", "Lru/yandex/taxi/logistics/sdk/dto/libraries/deliverygooffers/formclientstate/FormStateRoutePointDto$TypeDto;", LaunchBrowserActivity.KEY_URI, "coordinates", "", "Lru/yandex/taxi/logistics/sdk/dto/libraries/deliverygooffers/formclientstate/FormStateCoordinatesDto;", "commentImages", "Lru/yandex/taxi/logistics/sdk/dto/libraries/deliverygooffers/definitions/RoutePointCommentImageDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/libraries/deliverygooffers/definitions/RoutePointContactDto;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/libraries/deliverygooffers/formclientstate/FormStateRoutePointDto$TypeDto;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getFullText", "()Ljava/lang/String;", "getShortText", "getAreaDescription", "getEntrance", "getCode", "getFloor", "getRoom", "getContact", "()Lru/yandex/taxi/logistics/sdk/dto/libraries/deliverygooffers/definitions/RoutePointContactDto;", "getComment", "getType", "()Lru/yandex/taxi/logistics/sdk/dto/libraries/deliverygooffers/formclientstate/FormStateRoutePointDto$TypeDto;", "getUri", "getCoordinates", "()Ljava/util/List;", "getCommentImages", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "", "other", "hashCode", "", "toString", "TypeDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FormStateRoutePointDto {
    private final String areaDescription;
    private final String code;
    private final String comment;
    private final List<RoutePointCommentImageDto> commentImages;
    private final RoutePointContactDto contact;
    private final List<String> coordinates;
    private final String entrance;
    private final String floor;
    private final String fullText;
    private final String room;
    private final String shortText;
    private final TypeDto type;
    private final String uri;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/libraries/deliverygooffers/formclientstate/FormStateRoutePointDto$TypeDto;", "", "<init>", "(Ljava/lang/String;I)V", "SOURCE", "DESTINATION", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TypeDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @Json(name = "source")
        public static final TypeDto SOURCE = new TypeDto("SOURCE", 0);

        @Json(name = "destination")
        public static final TypeDto DESTINATION = new TypeDto("DESTINATION", 1);

        private static final /* synthetic */ TypeDto[] $values() {
            return new TypeDto[]{SOURCE, DESTINATION};
        }

        static {
            TypeDto[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private TypeDto(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static TypeDto valueOf(String str) {
            return (TypeDto) Enum.valueOf(TypeDto.class, str);
        }

        public static TypeDto[] values() {
            return (TypeDto[]) $VALUES.clone();
        }
    }

    public FormStateRoutePointDto(@Json(name = "full_text") String str, @Json(name = "short_text") String str2, @Json(name = "area_description") String str3, @Json(name = "entrance") String str4, @Json(name = "code") String str5, @Json(name = "floor") String str6, @Json(name = "room") String str7, @Json(name = "contact") RoutePointContactDto routePointContactDto, @Json(name = "comment") String str8, @Json(name = "type") TypeDto typeDto, @Json(name = "uri") String str9, @Json(name = "coordinates") List<String> list, @Json(name = "comment_images") List<RoutePointCommentImageDto> list2) {
        this.fullText = str;
        this.shortText = str2;
        this.areaDescription = str3;
        this.entrance = str4;
        this.code = str5;
        this.floor = str6;
        this.room = str7;
        this.contact = routePointContactDto;
        this.comment = str8;
        this.type = typeDto;
        this.uri = str9;
        this.coordinates = list;
        this.commentImages = list2;
    }

    public static /* synthetic */ FormStateRoutePointDto copy$default(FormStateRoutePointDto formStateRoutePointDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, RoutePointContactDto routePointContactDto, String str8, TypeDto typeDto, String str9, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = formStateRoutePointDto.fullText;
        }
        return formStateRoutePointDto.copy(str, (i & 2) != 0 ? formStateRoutePointDto.shortText : str2, (i & 4) != 0 ? formStateRoutePointDto.areaDescription : str3, (i & 8) != 0 ? formStateRoutePointDto.entrance : str4, (i & 16) != 0 ? formStateRoutePointDto.code : str5, (i & 32) != 0 ? formStateRoutePointDto.floor : str6, (i & 64) != 0 ? formStateRoutePointDto.room : str7, (i & 128) != 0 ? formStateRoutePointDto.contact : routePointContactDto, (i & 256) != 0 ? formStateRoutePointDto.comment : str8, (i & 512) != 0 ? formStateRoutePointDto.type : typeDto, (i & 1024) != 0 ? formStateRoutePointDto.uri : str9, (i & 2048) != 0 ? formStateRoutePointDto.coordinates : list, (i & 4096) != 0 ? formStateRoutePointDto.commentImages : list2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFullText() {
        return this.fullText;
    }

    /* renamed from: component10, reason: from getter */
    public final TypeDto getType() {
        return this.type;
    }

    /* renamed from: component11, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    public final List<String> component12() {
        return this.coordinates;
    }

    public final List<RoutePointCommentImageDto> component13() {
        return this.commentImages;
    }

    /* renamed from: component2, reason: from getter */
    public final String getShortText() {
        return this.shortText;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAreaDescription() {
        return this.areaDescription;
    }

    /* renamed from: component4, reason: from getter */
    public final String getEntrance() {
        return this.entrance;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: component6, reason: from getter */
    public final String getFloor() {
        return this.floor;
    }

    /* renamed from: component7, reason: from getter */
    public final String getRoom() {
        return this.room;
    }

    /* renamed from: component8, reason: from getter */
    public final RoutePointContactDto getContact() {
        return this.contact;
    }

    /* renamed from: component9, reason: from getter */
    public final String getComment() {
        return this.comment;
    }

    public final FormStateRoutePointDto copy(@Json(name = "full_text") String fullText, @Json(name = "short_text") String shortText, @Json(name = "area_description") String areaDescription, @Json(name = "entrance") String entrance, @Json(name = "code") String code, @Json(name = "floor") String floor, @Json(name = "room") String room, @Json(name = "contact") RoutePointContactDto contact, @Json(name = "comment") String comment, @Json(name = "type") TypeDto type, @Json(name = "uri") String uri, @Json(name = "coordinates") List<String> coordinates, @Json(name = "comment_images") List<RoutePointCommentImageDto> commentImages) {
        return new FormStateRoutePointDto(fullText, shortText, areaDescription, entrance, code, floor, room, contact, comment, type, uri, coordinates, commentImages);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormStateRoutePointDto)) {
            return false;
        }
        FormStateRoutePointDto formStateRoutePointDto = (FormStateRoutePointDto) other;
        return jl40.l(this.fullText, formStateRoutePointDto.fullText) && jl40.l(this.shortText, formStateRoutePointDto.shortText) && jl40.l(this.areaDescription, formStateRoutePointDto.areaDescription) && jl40.l(this.entrance, formStateRoutePointDto.entrance) && jl40.l(this.code, formStateRoutePointDto.code) && jl40.l(this.floor, formStateRoutePointDto.floor) && jl40.l(this.room, formStateRoutePointDto.room) && jl40.l(this.contact, formStateRoutePointDto.contact) && jl40.l(this.comment, formStateRoutePointDto.comment) && this.type == formStateRoutePointDto.type && jl40.l(this.uri, formStateRoutePointDto.uri) && jl40.l(this.coordinates, formStateRoutePointDto.coordinates) && jl40.l(this.commentImages, formStateRoutePointDto.commentImages);
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

    public final List<RoutePointCommentImageDto> getCommentImages() {
        return this.commentImages;
    }

    public final RoutePointContactDto getContact() {
        return this.contact;
    }

    public final List<String> getCoordinates() {
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

    public final TypeDto getType() {
        return this.type;
    }

    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        int b = unr0.b(unr0.b(this.fullText.hashCode() * 31, 31, this.shortText), 31, this.areaDescription);
        String str = this.entrance;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.code;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.floor;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.room;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        RoutePointContactDto routePointContactDto = this.contact;
        int hashCode5 = (hashCode4 + (routePointContactDto == null ? 0 : routePointContactDto.hashCode())) * 31;
        String str5 = this.comment;
        int hashCode6 = (this.type.hashCode() + ((hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31)) * 31;
        String str6 = this.uri;
        int c = unr0.c((hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.coordinates);
        List<RoutePointCommentImageDto> list = this.commentImages;
        return c + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.fullText;
        String str2 = this.shortText;
        String str3 = this.areaDescription;
        String str4 = this.entrance;
        String str5 = this.code;
        String str6 = this.floor;
        String str7 = this.room;
        RoutePointContactDto routePointContactDto = this.contact;
        String str8 = this.comment;
        TypeDto typeDto = this.type;
        String str9 = this.uri;
        List<String> list = this.coordinates;
        List<RoutePointCommentImageDto> list2 = this.commentImages;
        StringBuilder v = b64.v("FormStateRoutePointDto(fullText=", str, ", shortText=", str2, ", areaDescription=");
        g8e.D(v, str3, ", entrance=", str4, ", code=");
        g8e.D(v, str5, ", floor=", str6, ", room=");
        v.append(str7);
        v.append(", contact=");
        v.append(routePointContactDto);
        v.append(", comment=");
        v.append(str8);
        v.append(", type=");
        v.append(typeDto);
        v.append(", uri=");
        tse0.x(str9, ", coordinates=", ", commentImages=", v, list);
        return ly3.s(v, list2, Extension.C_BRAKE);
    }
}
