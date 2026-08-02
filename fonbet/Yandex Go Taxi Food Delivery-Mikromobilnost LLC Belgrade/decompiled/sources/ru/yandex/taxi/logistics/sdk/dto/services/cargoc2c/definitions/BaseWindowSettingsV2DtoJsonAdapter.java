package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions;

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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/BaseWindowSettingsV2DtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/BaseWindowSettingsV2Dto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "attributedTextDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableAttributedTextDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BaseWindowSettingsV2DtoJsonAdapter extends JsonAdapter<BaseWindowSettingsV2Dto> {
    private final JsonAdapter<AttributedTextDto> attributedTextDtoAdapter;
    private final JsonAdapter<AttributedTextDto> nullableAttributedTextDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("attributed_title", "attributed_subtitle", "done_button_attributed_title", "done_button_attributed_subtitle", "cancel_button_attributed_title", "cancel_button_attributed_subtitle");

    public BaseWindowSettingsV2DtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.attributedTextDtoAdapter = moshi.adapter(AttributedTextDto.class, emptySet, "attributedTitle");
        this.nullableAttributedTextDtoAdapter = moshi.adapter(AttributedTextDto.class, emptySet, "attributedSubtitle");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final BaseWindowSettingsV2Dto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        AttributedTextDto attributedTextDto = null;
        AttributedTextDto attributedTextDto2 = null;
        AttributedTextDto attributedTextDto3 = null;
        AttributedTextDto attributedTextDto4 = null;
        AttributedTextDto attributedTextDto5 = null;
        AttributedTextDto attributedTextDto6 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    attributedTextDto = this.attributedTextDtoAdapter.fromJson(jsonReader);
                    if (attributedTextDto == null) {
                        throw Util.unexpectedNull("attributedTitle", "attributed_title", jsonReader);
                    }
                    break;
                case 1:
                    attributedTextDto2 = this.nullableAttributedTextDtoAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    attributedTextDto3 = this.attributedTextDtoAdapter.fromJson(jsonReader);
                    if (attributedTextDto3 == null) {
                        throw Util.unexpectedNull("doneButtonAttributedTitle", "done_button_attributed_title", jsonReader);
                    }
                    break;
                case 3:
                    attributedTextDto4 = this.nullableAttributedTextDtoAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    attributedTextDto5 = this.nullableAttributedTextDtoAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    attributedTextDto6 = this.nullableAttributedTextDtoAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (attributedTextDto == null) {
            throw Util.missingProperty("attributedTitle", "attributed_title", jsonReader);
        }
        if (attributedTextDto3 != null) {
            return new BaseWindowSettingsV2Dto(attributedTextDto, attributedTextDto2, attributedTextDto3, attributedTextDto4, attributedTextDto5, attributedTextDto6);
        }
        throw Util.missingProperty("doneButtonAttributedTitle", "done_button_attributed_title", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, BaseWindowSettingsV2Dto baseWindowSettingsV2Dto) {
        BaseWindowSettingsV2Dto baseWindowSettingsV2Dto2 = baseWindowSettingsV2Dto;
        if (baseWindowSettingsV2Dto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("attributed_title");
        this.attributedTextDtoAdapter.toJson(jsonWriter, (JsonWriter) baseWindowSettingsV2Dto2.getAttributedTitle());
        jsonWriter.name("attributed_subtitle");
        this.nullableAttributedTextDtoAdapter.toJson(jsonWriter, (JsonWriter) baseWindowSettingsV2Dto2.getAttributedSubtitle());
        jsonWriter.name("done_button_attributed_title");
        this.attributedTextDtoAdapter.toJson(jsonWriter, (JsonWriter) baseWindowSettingsV2Dto2.getDoneButtonAttributedTitle());
        jsonWriter.name("done_button_attributed_subtitle");
        this.nullableAttributedTextDtoAdapter.toJson(jsonWriter, (JsonWriter) baseWindowSettingsV2Dto2.getDoneButtonAttributedSubtitle());
        jsonWriter.name("cancel_button_attributed_title");
        this.nullableAttributedTextDtoAdapter.toJson(jsonWriter, (JsonWriter) baseWindowSettingsV2Dto2.getCancelButtonAttributedTitle());
        jsonWriter.name("cancel_button_attributed_subtitle");
        this.nullableAttributedTextDtoAdapter.toJson(jsonWriter, (JsonWriter) baseWindowSettingsV2Dto2.getCancelButtonAttributedSubtitle());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(45, "GeneratedJsonAdapter(BaseWindowSettingsV2Dto)");
    }
}
