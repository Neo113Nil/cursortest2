package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverydraftrequest;

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
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.PointTypeDto;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\"\u0010\u0016\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\f¨\u0006\u0017"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverydraftrequest/DraftPointDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverydraftrequest/DraftPointDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PointTypeDto;", "pointTypeDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableStringAdapter", "", "", "listOfDoubleAdapter", "stringAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/ContactDto;", "nullableContactDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PhotoInfoDto;", "nullableListOfPhotoInfoDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DraftPointDtoJsonAdapter extends JsonAdapter<DraftPointDto> {
    private final JsonAdapter<List<Double>> listOfDoubleAdapter;
    private final JsonAdapter<ContactDto> nullableContactDtoAdapter;
    private final JsonAdapter<List<PhotoInfoDto>> nullableListOfPhotoInfoDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("type", LaunchBrowserActivity.KEY_URI, "coordinates", "full_text", "short_text", "area_description", "entrance", "floor", "room", AuthSdkActivity.RESPONSE_TYPE_CODE, "contact", "comment", "comment_images");
    private final JsonAdapter<PointTypeDto> pointTypeDtoAdapter;
    private final JsonAdapter<String> stringAdapter;

    public DraftPointDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.pointTypeDtoAdapter = moshi.adapter(PointTypeDto.class, emptySet, "type");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, LaunchBrowserActivity.KEY_URI);
        this.listOfDoubleAdapter = moshi.adapter(Types.newParameterizedType(List.class, Double.class), emptySet, "coordinates");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "fullText");
        this.nullableContactDtoAdapter = moshi.adapter(ContactDto.class, emptySet, "contact");
        this.nullableListOfPhotoInfoDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, PhotoInfoDto.class), emptySet, "commentImages");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DraftPointDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        PointTypeDto pointTypeDto = null;
        String str = null;
        List<Double> list = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        ContactDto contactDto = null;
        String str9 = null;
        List<PhotoInfoDto> list2 = null;
        while (true) {
            PointTypeDto pointTypeDto2 = pointTypeDto;
            String str10 = str;
            List<Double> list3 = list;
            String str11 = str2;
            String str12 = str3;
            String str13 = str4;
            if (!jsonReader.hasNext()) {
                String str14 = str5;
                jsonReader.endObject();
                if (pointTypeDto2 == null) {
                    throw Util.missingProperty("type", "type", jsonReader);
                }
                if (list3 == null) {
                    throw Util.missingProperty("coordinates", "coordinates", jsonReader);
                }
                if (str11 == null) {
                    throw Util.missingProperty("fullText", "full_text", jsonReader);
                }
                if (str12 == null) {
                    throw Util.missingProperty("shortText", "short_text", jsonReader);
                }
                if (str13 != null) {
                    return new DraftPointDto(pointTypeDto2, str10, list3, str11, str12, str13, str14, str6, str7, str8, contactDto, str9, list2);
                }
                throw Util.missingProperty("areaDescription", "area_description", jsonReader);
            }
            String str15 = str5;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    str5 = str15;
                    pointTypeDto = pointTypeDto2;
                    str = str10;
                    list = list3;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                case 0:
                    pointTypeDto = this.pointTypeDtoAdapter.fromJson(jsonReader);
                    if (pointTypeDto == null) {
                        throw Util.unexpectedNull("type", "type", jsonReader);
                    }
                    str5 = str15;
                    str = str10;
                    list = list3;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                case 1:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    str5 = str15;
                    pointTypeDto = pointTypeDto2;
                    list = list3;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                case 2:
                    list = this.listOfDoubleAdapter.fromJson(jsonReader);
                    if (list == null) {
                        throw Util.unexpectedNull("coordinates", "coordinates", jsonReader);
                    }
                    str5 = str15;
                    pointTypeDto = pointTypeDto2;
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                case 3:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("fullText", "full_text", jsonReader);
                    }
                    str5 = str15;
                    pointTypeDto = pointTypeDto2;
                    str = str10;
                    list = list3;
                    str3 = str12;
                    str4 = str13;
                case 4:
                    str3 = this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("shortText", "short_text", jsonReader);
                    }
                    str5 = str15;
                    pointTypeDto = pointTypeDto2;
                    str = str10;
                    list = list3;
                    str2 = str11;
                    str4 = str13;
                case 5:
                    str4 = this.stringAdapter.fromJson(jsonReader);
                    if (str4 == null) {
                        throw Util.unexpectedNull("areaDescription", "area_description", jsonReader);
                    }
                    str5 = str15;
                    pointTypeDto = pointTypeDto2;
                    str = str10;
                    list = list3;
                    str2 = str11;
                    str3 = str12;
                case 6:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    pointTypeDto = pointTypeDto2;
                    str = str10;
                    list = list3;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                case 7:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader);
                    str5 = str15;
                    pointTypeDto = pointTypeDto2;
                    str = str10;
                    list = list3;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                case 8:
                    str7 = this.nullableStringAdapter.fromJson(jsonReader);
                    str5 = str15;
                    pointTypeDto = pointTypeDto2;
                    str = str10;
                    list = list3;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                case 9:
                    str8 = this.nullableStringAdapter.fromJson(jsonReader);
                    str5 = str15;
                    pointTypeDto = pointTypeDto2;
                    str = str10;
                    list = list3;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                case 10:
                    contactDto = this.nullableContactDtoAdapter.fromJson(jsonReader);
                    str5 = str15;
                    pointTypeDto = pointTypeDto2;
                    str = str10;
                    list = list3;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                case 11:
                    str9 = this.nullableStringAdapter.fromJson(jsonReader);
                    str5 = str15;
                    pointTypeDto = pointTypeDto2;
                    str = str10;
                    list = list3;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                case 12:
                    list2 = this.nullableListOfPhotoInfoDtoAdapter.fromJson(jsonReader);
                    str5 = str15;
                    pointTypeDto = pointTypeDto2;
                    str = str10;
                    list = list3;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                default:
                    str5 = str15;
                    pointTypeDto = pointTypeDto2;
                    str = str10;
                    list = list3;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DraftPointDto draftPointDto) {
        DraftPointDto draftPointDto2 = draftPointDto;
        if (draftPointDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("type");
        this.pointTypeDtoAdapter.toJson(jsonWriter, (JsonWriter) draftPointDto2.getType());
        jsonWriter.name(LaunchBrowserActivity.KEY_URI);
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) draftPointDto2.getUri());
        jsonWriter.name("coordinates");
        this.listOfDoubleAdapter.toJson(jsonWriter, (JsonWriter) draftPointDto2.getCoordinates());
        jsonWriter.name("full_text");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) draftPointDto2.getFullText());
        jsonWriter.name("short_text");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) draftPointDto2.getShortText());
        jsonWriter.name("area_description");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) draftPointDto2.getAreaDescription());
        jsonWriter.name("entrance");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) draftPointDto2.getEntrance());
        jsonWriter.name("floor");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) draftPointDto2.getFloor());
        jsonWriter.name("room");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) draftPointDto2.getRoom());
        jsonWriter.name(AuthSdkActivity.RESPONSE_TYPE_CODE);
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) draftPointDto2.getCode());
        jsonWriter.name("contact");
        this.nullableContactDtoAdapter.toJson(jsonWriter, (JsonWriter) draftPointDto2.getContact());
        jsonWriter.name("comment");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) draftPointDto2.getComment());
        jsonWriter.name("comment_images");
        this.nullableListOfPhotoInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) draftPointDto2.getCommentImages());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(35, "GeneratedJsonAdapter(DraftPointDto)");
    }
}
