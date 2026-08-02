package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.libraries.deliverygooffers.definitions.RoutePointCommentImageDto;
import ru.yandex.taxi.logistics.sdk.dto.libraries.deliverygooffers.definitions.RoutePointContactDto;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\"\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\f¨\u0006\u0014"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/RoutePointDetailsDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/RoutePointDetailsDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableStringAdapter", "Lru/yandex/taxi/logistics/sdk/dto/libraries/deliverygooffers/definitions/RoutePointContactDto;", "nullableRoutePointContactDtoAdapter", "", "Lru/yandex/taxi/logistics/sdk/dto/libraries/deliverygooffers/definitions/RoutePointCommentImageDto;", "nullableListOfRoutePointCommentImageDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RoutePointDetailsDtoJsonAdapter extends JsonAdapter<RoutePointDetailsDto> {
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<List<RoutePointCommentImageDto>> nullableListOfRoutePointCommentImageDtoAdapter;
    private final JsonAdapter<RoutePointContactDto> nullableRoutePointContactDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("route_point_index", "entrance", AuthSdkActivity.RESPONSE_TYPE_CODE, "floor", "room", "contact", "comment", "comment_images");

    public RoutePointDetailsDtoJsonAdapter(Moshi moshi) {
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.intAdapter = moshi.adapter(cls, emptySet, "routePointIndex");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "entrance");
        this.nullableRoutePointContactDtoAdapter = moshi.adapter(RoutePointContactDto.class, emptySet, "contact");
        this.nullableListOfRoutePointCommentImageDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, RoutePointCommentImageDto.class), emptySet, "commentImages");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final RoutePointDetailsDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        RoutePointContactDto routePointContactDto = null;
        String str5 = null;
        List<RoutePointCommentImageDto> list = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    num = this.intAdapter.fromJson(jsonReader);
                    if (num == null) {
                        throw Util.unexpectedNull("routePointIndex", "route_point_index", jsonReader);
                    }
                    break;
                case 1:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    routePointContactDto = this.nullableRoutePointContactDtoAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    list = this.nullableListOfRoutePointCommentImageDtoAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (num != null) {
            return new RoutePointDetailsDto(num.intValue(), str, str2, str3, str4, routePointContactDto, str5, list);
        }
        throw Util.missingProperty("routePointIndex", "route_point_index", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, RoutePointDetailsDto routePointDetailsDto) {
        RoutePointDetailsDto routePointDetailsDto2 = routePointDetailsDto;
        if (routePointDetailsDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("route_point_index");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(routePointDetailsDto2.getRoutePointIndex()));
        jsonWriter.name("entrance");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) routePointDetailsDto2.getEntrance());
        jsonWriter.name(AuthSdkActivity.RESPONSE_TYPE_CODE);
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) routePointDetailsDto2.getCode());
        jsonWriter.name("floor");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) routePointDetailsDto2.getFloor());
        jsonWriter.name("room");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) routePointDetailsDto2.getRoom());
        jsonWriter.name("contact");
        this.nullableRoutePointContactDtoAdapter.toJson(jsonWriter, (JsonWriter) routePointDetailsDto2.getContact());
        jsonWriter.name("comment");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) routePointDetailsDto2.getComment());
        jsonWriter.name("comment_images");
        this.nullableListOfRoutePointCommentImageDtoAdapter.toJson(jsonWriter, (JsonWriter) routePointDetailsDto2.getCommentImages());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(42, "GeneratedJsonAdapter(RoutePointDetailsDto)");
    }
}
