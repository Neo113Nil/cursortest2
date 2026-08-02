package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.ContactDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.PhotoInfoDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.PointPinDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.PointVisitStatusDto;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\"\u0010\u0016\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\f¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/OrderPointDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/OrderPointDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PointVisitStatusDto;", "pointVisitStatusDtoAdapter", "", "", "listOfDoubleAdapter", "nullableStringAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/ContactDto;", "nullableContactDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PhotoInfoDto;", "nullableListOfPhotoInfoDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PointPinDto;", "nullablePointPinDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class OrderPointDtoJsonAdapter extends JsonAdapter<OrderPointDto> {
    private final JsonAdapter<List<Double>> listOfDoubleAdapter;
    private final JsonAdapter<ContactDto> nullableContactDtoAdapter;
    private final JsonAdapter<List<PhotoInfoDto>> nullableListOfPhotoInfoDtoAdapter;
    private final JsonAdapter<PointPinDto> nullablePointPinDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("point_id", "visit_status", LaunchBrowserActivity.KEY_URI, "coordinates", "full_text", "short_text", "area_description", "entrance", "floor", "room", AuthSdkActivity.RESPONSE_TYPE_CODE, "contact", "comment", "comment_images", "pin");
    private final JsonAdapter<PointVisitStatusDto> pointVisitStatusDtoAdapter;
    private final JsonAdapter<String> stringAdapter;

    public OrderPointDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "pointId");
        this.pointVisitStatusDtoAdapter = moshi.adapter(PointVisitStatusDto.class, emptySet, "visitStatus");
        this.listOfDoubleAdapter = moshi.adapter(Types.newParameterizedType(List.class, Double.class), emptySet, "coordinates");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "entrance");
        this.nullableContactDtoAdapter = moshi.adapter(ContactDto.class, emptySet, "contact");
        this.nullableListOfPhotoInfoDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, PhotoInfoDto.class), emptySet, "commentImages");
        this.nullablePointPinDtoAdapter = moshi.adapter(PointPinDto.class, emptySet, "pin");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final OrderPointDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        PointVisitStatusDto pointVisitStatusDto = null;
        String str2 = null;
        List<Double> list = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        ContactDto contactDto = null;
        String str10 = null;
        List<PhotoInfoDto> list2 = null;
        PointPinDto pointPinDto = null;
        while (true) {
            String str11 = str;
            PointVisitStatusDto pointVisitStatusDto2 = pointVisitStatusDto;
            String str12 = str2;
            List<Double> list3 = list;
            String str13 = str3;
            String str14 = str4;
            String str15 = str5;
            String str16 = str6;
            String str17 = str7;
            String str18 = str8;
            if (!jsonReader.hasNext()) {
                String str19 = str9;
                jsonReader.endObject();
                if (str11 == null) {
                    throw Util.missingProperty("pointId", "point_id", jsonReader);
                }
                if (pointVisitStatusDto2 == null) {
                    throw Util.missingProperty("visitStatus", "visit_status", jsonReader);
                }
                if (str12 == null) {
                    throw Util.missingProperty(LaunchBrowserActivity.KEY_URI, LaunchBrowserActivity.KEY_URI, jsonReader);
                }
                if (list3 == null) {
                    throw Util.missingProperty("coordinates", "coordinates", jsonReader);
                }
                if (str13 == null) {
                    throw Util.missingProperty("fullText", "full_text", jsonReader);
                }
                if (str14 == null) {
                    throw Util.missingProperty("shortText", "short_text", jsonReader);
                }
                if (str15 != null) {
                    return new OrderPointDto(str11, pointVisitStatusDto2, str12, list3, str13, str14, str15, str16, str17, str18, str19, contactDto, str10, list2, pointPinDto);
                }
                throw Util.missingProperty("areaDescription", "area_description", jsonReader);
            }
            String str20 = str9;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    str9 = str20;
                    str = str11;
                    pointVisitStatusDto = pointVisitStatusDto2;
                    str2 = str12;
                    list = list3;
                    str3 = str13;
                    str4 = str14;
                    str5 = str15;
                    str6 = str16;
                    str7 = str17;
                    str8 = str18;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("pointId", "point_id", jsonReader);
                    }
                    str9 = str20;
                    pointVisitStatusDto = pointVisitStatusDto2;
                    str2 = str12;
                    list = list3;
                    str3 = str13;
                    str4 = str14;
                    str5 = str15;
                    str6 = str16;
                    str7 = str17;
                    str8 = str18;
                case 1:
                    PointVisitStatusDto fromJson = this.pointVisitStatusDtoAdapter.fromJson(jsonReader);
                    if (fromJson == null) {
                        throw Util.unexpectedNull("visitStatus", "visit_status", jsonReader);
                    }
                    pointVisitStatusDto = fromJson;
                    str9 = str20;
                    str = str11;
                    str2 = str12;
                    list = list3;
                    str3 = str13;
                    str4 = str14;
                    str5 = str15;
                    str6 = str16;
                    str7 = str17;
                    str8 = str18;
                case 2:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull(LaunchBrowserActivity.KEY_URI, LaunchBrowserActivity.KEY_URI, jsonReader);
                    }
                    str9 = str20;
                    str = str11;
                    pointVisitStatusDto = pointVisitStatusDto2;
                    list = list3;
                    str3 = str13;
                    str4 = str14;
                    str5 = str15;
                    str6 = str16;
                    str7 = str17;
                    str8 = str18;
                case 3:
                    list = this.listOfDoubleAdapter.fromJson(jsonReader);
                    if (list == null) {
                        throw Util.unexpectedNull("coordinates", "coordinates", jsonReader);
                    }
                    str9 = str20;
                    str = str11;
                    pointVisitStatusDto = pointVisitStatusDto2;
                    str2 = str12;
                    str3 = str13;
                    str4 = str14;
                    str5 = str15;
                    str6 = str16;
                    str7 = str17;
                    str8 = str18;
                case 4:
                    str3 = this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("fullText", "full_text", jsonReader);
                    }
                    str9 = str20;
                    str = str11;
                    pointVisitStatusDto = pointVisitStatusDto2;
                    str2 = str12;
                    list = list3;
                    str4 = str14;
                    str5 = str15;
                    str6 = str16;
                    str7 = str17;
                    str8 = str18;
                case 5:
                    String fromJson2 = this.stringAdapter.fromJson(jsonReader);
                    if (fromJson2 == null) {
                        throw Util.unexpectedNull("shortText", "short_text", jsonReader);
                    }
                    str4 = fromJson2;
                    str9 = str20;
                    str = str11;
                    pointVisitStatusDto = pointVisitStatusDto2;
                    str2 = str12;
                    list = list3;
                    str3 = str13;
                    str5 = str15;
                    str6 = str16;
                    str7 = str17;
                    str8 = str18;
                case 6:
                    String fromJson3 = this.stringAdapter.fromJson(jsonReader);
                    if (fromJson3 == null) {
                        throw Util.unexpectedNull("areaDescription", "area_description", jsonReader);
                    }
                    str5 = fromJson3;
                    str9 = str20;
                    str = str11;
                    pointVisitStatusDto = pointVisitStatusDto2;
                    str2 = str12;
                    list = list3;
                    str3 = str13;
                    str4 = str14;
                    str6 = str16;
                    str7 = str17;
                    str8 = str18;
                case 7:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader);
                    str9 = str20;
                    str = str11;
                    pointVisitStatusDto = pointVisitStatusDto2;
                    str2 = str12;
                    list = list3;
                    str3 = str13;
                    str4 = str14;
                    str5 = str15;
                    str7 = str17;
                    str8 = str18;
                case 8:
                    str7 = this.nullableStringAdapter.fromJson(jsonReader);
                    str9 = str20;
                    str = str11;
                    pointVisitStatusDto = pointVisitStatusDto2;
                    str2 = str12;
                    list = list3;
                    str3 = str13;
                    str4 = str14;
                    str5 = str15;
                    str6 = str16;
                    str8 = str18;
                case 9:
                    str8 = this.nullableStringAdapter.fromJson(jsonReader);
                    str9 = str20;
                    str = str11;
                    pointVisitStatusDto = pointVisitStatusDto2;
                    str2 = str12;
                    list = list3;
                    str3 = str13;
                    str4 = str14;
                    str5 = str15;
                    str6 = str16;
                    str7 = str17;
                case 10:
                    str9 = this.nullableStringAdapter.fromJson(jsonReader);
                    str = str11;
                    pointVisitStatusDto = pointVisitStatusDto2;
                    str2 = str12;
                    list = list3;
                    str3 = str13;
                    str4 = str14;
                    str5 = str15;
                    str6 = str16;
                    str7 = str17;
                    str8 = str18;
                case 11:
                    contactDto = this.nullableContactDtoAdapter.fromJson(jsonReader);
                    str9 = str20;
                    str = str11;
                    pointVisitStatusDto = pointVisitStatusDto2;
                    str2 = str12;
                    list = list3;
                    str3 = str13;
                    str4 = str14;
                    str5 = str15;
                    str6 = str16;
                    str7 = str17;
                    str8 = str18;
                case 12:
                    str10 = this.nullableStringAdapter.fromJson(jsonReader);
                    str9 = str20;
                    str = str11;
                    pointVisitStatusDto = pointVisitStatusDto2;
                    str2 = str12;
                    list = list3;
                    str3 = str13;
                    str4 = str14;
                    str5 = str15;
                    str6 = str16;
                    str7 = str17;
                    str8 = str18;
                case 13:
                    list2 = this.nullableListOfPhotoInfoDtoAdapter.fromJson(jsonReader);
                    str9 = str20;
                    str = str11;
                    pointVisitStatusDto = pointVisitStatusDto2;
                    str2 = str12;
                    list = list3;
                    str3 = str13;
                    str4 = str14;
                    str5 = str15;
                    str6 = str16;
                    str7 = str17;
                    str8 = str18;
                case 14:
                    pointPinDto = this.nullablePointPinDtoAdapter.fromJson(jsonReader);
                    str9 = str20;
                    str = str11;
                    pointVisitStatusDto = pointVisitStatusDto2;
                    str2 = str12;
                    list = list3;
                    str3 = str13;
                    str4 = str14;
                    str5 = str15;
                    str6 = str16;
                    str7 = str17;
                    str8 = str18;
                default:
                    str9 = str20;
                    str = str11;
                    pointVisitStatusDto = pointVisitStatusDto2;
                    str2 = str12;
                    list = list3;
                    str3 = str13;
                    str4 = str14;
                    str5 = str15;
                    str6 = str16;
                    str7 = str17;
                    str8 = str18;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, OrderPointDto orderPointDto) {
        OrderPointDto orderPointDto2 = orderPointDto;
        if (orderPointDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("point_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) orderPointDto2.getPointId());
        jsonWriter.name("visit_status");
        this.pointVisitStatusDtoAdapter.toJson(jsonWriter, (JsonWriter) orderPointDto2.getVisitStatus());
        jsonWriter.name(LaunchBrowserActivity.KEY_URI);
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) orderPointDto2.getUri());
        jsonWriter.name("coordinates");
        this.listOfDoubleAdapter.toJson(jsonWriter, (JsonWriter) orderPointDto2.getCoordinates());
        jsonWriter.name("full_text");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) orderPointDto2.getFullText());
        jsonWriter.name("short_text");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) orderPointDto2.getShortText());
        jsonWriter.name("area_description");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) orderPointDto2.getAreaDescription());
        jsonWriter.name("entrance");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) orderPointDto2.getEntrance());
        jsonWriter.name("floor");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) orderPointDto2.getFloor());
        jsonWriter.name("room");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) orderPointDto2.getRoom());
        jsonWriter.name(AuthSdkActivity.RESPONSE_TYPE_CODE);
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) orderPointDto2.getCode());
        jsonWriter.name("contact");
        this.nullableContactDtoAdapter.toJson(jsonWriter, (JsonWriter) orderPointDto2.getContact());
        jsonWriter.name("comment");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) orderPointDto2.getComment());
        jsonWriter.name("comment_images");
        this.nullableListOfPhotoInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) orderPointDto2.getCommentImages());
        jsonWriter.name("pin");
        this.nullablePointPinDtoAdapter.toJson(jsonWriter, (JsonWriter) orderPointDto2.getPin());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(35, "GeneratedJsonAdapter(OrderPointDto)");
    }
}
