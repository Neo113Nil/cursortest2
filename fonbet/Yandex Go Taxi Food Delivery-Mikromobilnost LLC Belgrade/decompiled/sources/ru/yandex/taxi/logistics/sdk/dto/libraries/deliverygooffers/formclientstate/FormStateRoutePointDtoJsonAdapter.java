package ru.yandex.taxi.logistics.sdk.dto.libraries.deliverygooffers.formclientstate;

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
import ru.yandex.taxi.logistics.sdk.dto.libraries.deliverygooffers.definitions.RoutePointCommentImageDto;
import ru.yandex.taxi.logistics.sdk.dto.libraries.deliverygooffers.definitions.RoutePointContactDto;
import ru.yandex.taxi.logistics.sdk.dto.libraries.deliverygooffers.formclientstate.FormStateRoutePointDto;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR \u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\"\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/libraries/deliverygooffers/formclientstate/FormStateRoutePointDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/libraries/deliverygooffers/formclientstate/FormStateRoutePointDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lru/yandex/taxi/logistics/sdk/dto/libraries/deliverygooffers/definitions/RoutePointContactDto;", "nullableRoutePointContactDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/libraries/deliverygooffers/formclientstate/FormStateRoutePointDto$TypeDto;", "typeDtoAdapter", "", "listOfStringAdapter", "Lru/yandex/taxi/logistics/sdk/dto/libraries/deliverygooffers/definitions/RoutePointCommentImageDto;", "nullableListOfRoutePointCommentImageDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FormStateRoutePointDtoJsonAdapter extends JsonAdapter<FormStateRoutePointDto> {
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonAdapter<List<RoutePointCommentImageDto>> nullableListOfRoutePointCommentImageDtoAdapter;
    private final JsonAdapter<RoutePointContactDto> nullableRoutePointContactDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("full_text", "short_text", "area_description", "entrance", AuthSdkActivity.RESPONSE_TYPE_CODE, "floor", "room", "contact", "comment", "type", LaunchBrowserActivity.KEY_URI, "coordinates", "comment_images");
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<FormStateRoutePointDto.TypeDto> typeDtoAdapter;

    public FormStateRoutePointDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "fullText");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "entrance");
        this.nullableRoutePointContactDtoAdapter = moshi.adapter(RoutePointContactDto.class, emptySet, "contact");
        this.typeDtoAdapter = moshi.adapter(FormStateRoutePointDto.TypeDto.class, emptySet, "type");
        this.listOfStringAdapter = moshi.adapter(Types.newParameterizedType(List.class, String.class), emptySet, "coordinates");
        this.nullableListOfRoutePointCommentImageDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, RoutePointCommentImageDto.class), emptySet, "commentImages");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final FormStateRoutePointDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        RoutePointContactDto routePointContactDto = null;
        String str8 = null;
        FormStateRoutePointDto.TypeDto typeDto = null;
        String str9 = null;
        List<String> list = null;
        List<RoutePointCommentImageDto> list2 = null;
        while (true) {
            String str10 = str;
            String str11 = str2;
            String str12 = str3;
            String str13 = str4;
            String str14 = str5;
            String str15 = str6;
            if (!jsonReader.hasNext()) {
                String str16 = str7;
                jsonReader.endObject();
                if (str10 == null) {
                    throw Util.missingProperty("fullText", "full_text", jsonReader);
                }
                if (str11 == null) {
                    throw Util.missingProperty("shortText", "short_text", jsonReader);
                }
                if (str12 == null) {
                    throw Util.missingProperty("areaDescription", "area_description", jsonReader);
                }
                if (typeDto == null) {
                    throw Util.missingProperty("type", "type", jsonReader);
                }
                if (list != null) {
                    return new FormStateRoutePointDto(str10, str11, str12, str13, str14, str15, str16, routePointContactDto, str8, typeDto, str9, list, list2);
                }
                throw Util.missingProperty("coordinates", "coordinates", jsonReader);
            }
            String str17 = str7;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    str7 = str17;
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                    str5 = str14;
                    str6 = str15;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("fullText", "full_text", jsonReader);
                    }
                    str7 = str17;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                    str5 = str14;
                    str6 = str15;
                case 1:
                    String fromJson = this.stringAdapter.fromJson(jsonReader);
                    if (fromJson == null) {
                        throw Util.unexpectedNull("shortText", "short_text", jsonReader);
                    }
                    str2 = fromJson;
                    str7 = str17;
                    str = str10;
                    str3 = str12;
                    str4 = str13;
                    str5 = str14;
                    str6 = str15;
                case 2:
                    String fromJson2 = this.stringAdapter.fromJson(jsonReader);
                    if (fromJson2 == null) {
                        throw Util.unexpectedNull("areaDescription", "area_description", jsonReader);
                    }
                    str3 = fromJson2;
                    str7 = str17;
                    str = str10;
                    str2 = str11;
                    str4 = str13;
                    str5 = str14;
                    str6 = str15;
                case 3:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    str7 = str17;
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str5 = str14;
                    str6 = str15;
                case 4:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    str7 = str17;
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                    str6 = str15;
                case 5:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader);
                    str7 = str17;
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                    str5 = str14;
                case 6:
                    str7 = this.nullableStringAdapter.fromJson(jsonReader);
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                    str5 = str14;
                    str6 = str15;
                case 7:
                    routePointContactDto = this.nullableRoutePointContactDtoAdapter.fromJson(jsonReader);
                    str7 = str17;
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                    str5 = str14;
                    str6 = str15;
                case 8:
                    str8 = this.nullableStringAdapter.fromJson(jsonReader);
                    str7 = str17;
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                    str5 = str14;
                    str6 = str15;
                case 9:
                    typeDto = this.typeDtoAdapter.fromJson(jsonReader);
                    if (typeDto == null) {
                        throw Util.unexpectedNull("type", "type", jsonReader);
                    }
                    str7 = str17;
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                    str5 = str14;
                    str6 = str15;
                case 10:
                    str9 = this.nullableStringAdapter.fromJson(jsonReader);
                    str7 = str17;
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                    str5 = str14;
                    str6 = str15;
                case 11:
                    list = this.listOfStringAdapter.fromJson(jsonReader);
                    if (list == null) {
                        throw Util.unexpectedNull("coordinates", "coordinates", jsonReader);
                    }
                    str7 = str17;
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                    str5 = str14;
                    str6 = str15;
                case 12:
                    list2 = this.nullableListOfRoutePointCommentImageDtoAdapter.fromJson(jsonReader);
                    str7 = str17;
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                    str5 = str14;
                    str6 = str15;
                default:
                    str7 = str17;
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                    str5 = str14;
                    str6 = str15;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, FormStateRoutePointDto formStateRoutePointDto) {
        FormStateRoutePointDto formStateRoutePointDto2 = formStateRoutePointDto;
        if (formStateRoutePointDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("full_text");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) formStateRoutePointDto2.getFullText());
        jsonWriter.name("short_text");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) formStateRoutePointDto2.getShortText());
        jsonWriter.name("area_description");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) formStateRoutePointDto2.getAreaDescription());
        jsonWriter.name("entrance");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) formStateRoutePointDto2.getEntrance());
        jsonWriter.name(AuthSdkActivity.RESPONSE_TYPE_CODE);
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) formStateRoutePointDto2.getCode());
        jsonWriter.name("floor");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) formStateRoutePointDto2.getFloor());
        jsonWriter.name("room");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) formStateRoutePointDto2.getRoom());
        jsonWriter.name("contact");
        this.nullableRoutePointContactDtoAdapter.toJson(jsonWriter, (JsonWriter) formStateRoutePointDto2.getContact());
        jsonWriter.name("comment");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) formStateRoutePointDto2.getComment());
        jsonWriter.name("type");
        this.typeDtoAdapter.toJson(jsonWriter, (JsonWriter) formStateRoutePointDto2.getType());
        jsonWriter.name(LaunchBrowserActivity.KEY_URI);
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) formStateRoutePointDto2.getUri());
        jsonWriter.name("coordinates");
        this.listOfStringAdapter.toJson(jsonWriter, (JsonWriter) formStateRoutePointDto2.getCoordinates());
        jsonWriter.name("comment_images");
        this.nullableListOfRoutePointCommentImageDtoAdapter.toJson(jsonWriter, (JsonWriter) formStateRoutePointDto2.getCommentImages());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(44, "GeneratedJsonAdapter(FormStateRoutePointDto)");
    }
}
