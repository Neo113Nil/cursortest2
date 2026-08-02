package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/CityDiscoveryScreenDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/CityDiscoveryScreenDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "attributedTextDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;", "nullableImageDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CityDiscoveryScreenDtoJsonAdapter extends JsonAdapter<CityDiscoveryScreenDto> {
    private final JsonAdapter<AttributedTextDto> attributedTextDtoAdapter;
    private final JsonAdapter<ImageDto> nullableImageDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("screen_name", "header_title", "header_lead_image", "search_button_title", "search_button_lead_image");
    private final JsonAdapter<String> stringAdapter;

    public CityDiscoveryScreenDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "screenName");
        this.attributedTextDtoAdapter = moshi.adapter(AttributedTextDto.class, emptySet, "headerTitle");
        this.nullableImageDtoAdapter = moshi.adapter(ImageDto.class, emptySet, "headerLeadImage");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CityDiscoveryScreenDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        AttributedTextDto attributedTextDto = null;
        ImageDto imageDto = null;
        AttributedTextDto attributedTextDto2 = null;
        ImageDto imageDto2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("screenName", "screen_name", jsonReader);
                }
            } else if (selectName == 1) {
                attributedTextDto = this.attributedTextDtoAdapter.fromJson(jsonReader);
                if (attributedTextDto == null) {
                    throw Util.unexpectedNull("headerTitle", "header_title", jsonReader);
                }
            } else if (selectName == 2) {
                imageDto = this.nullableImageDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                attributedTextDto2 = this.attributedTextDtoAdapter.fromJson(jsonReader);
                if (attributedTextDto2 == null) {
                    throw Util.unexpectedNull("searchButtonTitle", "search_button_title", jsonReader);
                }
            } else if (selectName == 4) {
                imageDto2 = this.nullableImageDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("screenName", "screen_name", jsonReader);
        }
        if (attributedTextDto == null) {
            throw Util.missingProperty("headerTitle", "header_title", jsonReader);
        }
        if (attributedTextDto2 != null) {
            return new CityDiscoveryScreenDto(str, attributedTextDto, imageDto, attributedTextDto2, imageDto2);
        }
        throw Util.missingProperty("searchButtonTitle", "search_button_title", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CityDiscoveryScreenDto cityDiscoveryScreenDto) {
        CityDiscoveryScreenDto cityDiscoveryScreenDto2 = cityDiscoveryScreenDto;
        if (cityDiscoveryScreenDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("screen_name");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) cityDiscoveryScreenDto2.getScreenName());
        jsonWriter.name("header_title");
        this.attributedTextDtoAdapter.toJson(jsonWriter, (JsonWriter) cityDiscoveryScreenDto2.getHeaderTitle());
        jsonWriter.name("header_lead_image");
        this.nullableImageDtoAdapter.toJson(jsonWriter, (JsonWriter) cityDiscoveryScreenDto2.getHeaderLeadImage());
        jsonWriter.name("search_button_title");
        this.attributedTextDtoAdapter.toJson(jsonWriter, (JsonWriter) cityDiscoveryScreenDto2.getSearchButtonTitle());
        jsonWriter.name("search_button_lead_image");
        this.nullableImageDtoAdapter.toJson(jsonWriter, (JsonWriter) cityDiscoveryScreenDto2.getSearchButtonLeadImage());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(44, "GeneratedJsonAdapter(CityDiscoveryScreenDto)");
    }
}
