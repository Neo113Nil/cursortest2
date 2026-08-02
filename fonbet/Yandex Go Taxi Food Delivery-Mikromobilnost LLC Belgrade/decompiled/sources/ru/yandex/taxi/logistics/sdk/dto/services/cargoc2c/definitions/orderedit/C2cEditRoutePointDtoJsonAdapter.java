package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.orderedit;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.PhotoInfoDto;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\"\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/C2cEditRoutePointDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/C2cEditRoutePointDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PhotoInfoDto;", "nullableListOfPhotoInfoDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/ContactInfoDto;", "nullableContactInfoDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class C2cEditRoutePointDtoJsonAdapter extends JsonAdapter<C2cEditRoutePointDto> {
    private final JsonAdapter<ContactInfoDto> nullableContactInfoDtoAdapter;
    private final JsonAdapter<List<PhotoInfoDto>> nullableListOfPhotoInfoDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("point_id", "comment", "comment_images", "entrance", "floor", "apartment", "door_phone", "contact");
    private final JsonAdapter<String> stringAdapter;

    public C2cEditRoutePointDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "pointId");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "comment");
        this.nullableListOfPhotoInfoDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, PhotoInfoDto.class), emptySet, "commentImages");
        this.nullableContactInfoDtoAdapter = moshi.adapter(ContactInfoDto.class, emptySet, "contact");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final C2cEditRoutePointDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        List<PhotoInfoDto> list = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        ContactInfoDto contactInfoDto = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("pointId", "point_id", jsonReader);
                    }
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    list = this.nullableListOfPhotoInfoDtoAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    contactInfoDto = this.nullableContactInfoDtoAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (str != null) {
            return new C2cEditRoutePointDto(str, str2, list, str3, str4, str5, str6, contactInfoDto);
        }
        throw Util.missingProperty("pointId", "point_id", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, C2cEditRoutePointDto c2cEditRoutePointDto) {
        C2cEditRoutePointDto c2cEditRoutePointDto2 = c2cEditRoutePointDto;
        if (c2cEditRoutePointDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("point_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) c2cEditRoutePointDto2.getPointId());
        jsonWriter.name("comment");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) c2cEditRoutePointDto2.getComment());
        jsonWriter.name("comment_images");
        this.nullableListOfPhotoInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) c2cEditRoutePointDto2.getCommentImages());
        jsonWriter.name("entrance");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) c2cEditRoutePointDto2.getEntrance());
        jsonWriter.name("floor");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) c2cEditRoutePointDto2.getFloor());
        jsonWriter.name("apartment");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) c2cEditRoutePointDto2.getApartment());
        jsonWriter.name("door_phone");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) c2cEditRoutePointDto2.getDoorPhone());
        jsonWriter.name("contact");
        this.nullableContactInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) c2cEditRoutePointDto2.getContact());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(42, "GeneratedJsonAdapter(C2cEditRoutePointDto)");
    }
}
