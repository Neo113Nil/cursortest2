package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ActionShowContentSectionsDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ActionShowContentSectionsDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentSectionDto;", "listOfContentSectionDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableBooleanAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ActionShowContentSectionsDtoJsonAdapter extends JsonAdapter<ActionShowContentSectionsDto> {
    private final JsonAdapter<List<ContentSectionDto>> listOfContentSectionDtoAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("content_sections", "maximize_screen_brightness");

    public ActionShowContentSectionsDtoJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(List.class, ContentSectionDto.class);
        EmptySet emptySet = EmptySet.a;
        this.listOfContentSectionDtoAdapter = moshi.adapter(newParameterizedType, emptySet, "contentSections");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "maximizeScreenBrightness");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ActionShowContentSectionsDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        List<ContentSectionDto> list = null;
        Boolean bool = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                list = this.listOfContentSectionDtoAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("contentSections", "content_sections", jsonReader);
                }
            } else if (selectName == 1) {
                bool = this.nullableBooleanAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (list != null) {
            return new ActionShowContentSectionsDto(list, bool);
        }
        throw Util.missingProperty("contentSections", "content_sections", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ActionShowContentSectionsDto actionShowContentSectionsDto) {
        ActionShowContentSectionsDto actionShowContentSectionsDto2 = actionShowContentSectionsDto;
        if (actionShowContentSectionsDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("content_sections");
        this.listOfContentSectionDtoAdapter.toJson(jsonWriter, (JsonWriter) actionShowContentSectionsDto2.getContentSections());
        jsonWriter.name("maximize_screen_brightness");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) actionShowContentSectionsDto2.getMaximizeScreenBrightness());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(50, "GeneratedJsonAdapter(ActionShowContentSectionsDto)");
    }
}
