package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

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
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.TapActionDto;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TabOptionDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TabOptionDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "attributedTextDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "anyAdapter", "", "nullableBooleanAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "nullableTapActionDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TabOptionDtoJsonAdapter extends JsonAdapter<TabOptionDto> {
    private final JsonAdapter<Object> anyAdapter;
    private final JsonAdapter<AttributedTextDto> attributedTextDtoAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<TapActionDto> nullableTapActionDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("selected_text", "unselected_text", "value", "default", "selection_action");

    public TabOptionDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.attributedTextDtoAdapter = moshi.adapter(AttributedTextDto.class, emptySet, "selectedText");
        this.anyAdapter = moshi.adapter(Object.class, emptySet, "value");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "default");
        this.nullableTapActionDtoAdapter = moshi.adapter(TapActionDto.class, emptySet, "selectionAction");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TabOptionDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        AttributedTextDto attributedTextDto = null;
        AttributedTextDto attributedTextDto2 = null;
        Object obj = null;
        Boolean bool = null;
        TapActionDto tapActionDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                attributedTextDto = this.attributedTextDtoAdapter.fromJson(jsonReader);
                if (attributedTextDto == null) {
                    throw Util.unexpectedNull("selectedText", "selected_text", jsonReader);
                }
            } else if (selectName == 1) {
                attributedTextDto2 = this.attributedTextDtoAdapter.fromJson(jsonReader);
                if (attributedTextDto2 == null) {
                    throw Util.unexpectedNull("unselectedText", "unselected_text", jsonReader);
                }
            } else if (selectName == 2) {
                obj = this.anyAdapter.fromJson(jsonReader);
                if (obj == null) {
                    throw Util.unexpectedNull("value__", "value", jsonReader);
                }
            } else if (selectName == 3) {
                bool = this.nullableBooleanAdapter.fromJson(jsonReader);
            } else if (selectName == 4) {
                tapActionDto = this.nullableTapActionDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (attributedTextDto == null) {
            throw Util.missingProperty("selectedText", "selected_text", jsonReader);
        }
        if (attributedTextDto2 == null) {
            throw Util.missingProperty("unselectedText", "unselected_text", jsonReader);
        }
        if (obj != null) {
            return new TabOptionDto(attributedTextDto, attributedTextDto2, obj, bool, tapActionDto);
        }
        throw Util.missingProperty("value__", "value", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TabOptionDto tabOptionDto) {
        TabOptionDto tabOptionDto2 = tabOptionDto;
        if (tabOptionDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("selected_text");
        this.attributedTextDtoAdapter.toJson(jsonWriter, (JsonWriter) tabOptionDto2.getSelectedText());
        jsonWriter.name("unselected_text");
        this.attributedTextDtoAdapter.toJson(jsonWriter, (JsonWriter) tabOptionDto2.getUnselectedText());
        jsonWriter.name("value");
        this.anyAdapter.toJson(jsonWriter, (JsonWriter) tabOptionDto2.getValue());
        jsonWriter.name("default");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) tabOptionDto2.getDefault());
        jsonWriter.name("selection_action");
        this.nullableTapActionDtoAdapter.toJson(jsonWriter, (JsonWriter) tabOptionDto2.getSelectionAction());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(34, "GeneratedJsonAdapter(TabOptionDto)");
    }
}
