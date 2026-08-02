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
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.CollapsedStateConfigDto;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CollapsedStateConfigDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CollapsedStateConfigDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CollapsedStateConfigDto$InitialStateDto;", "initialStateDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ScenarioSelectorButtonDto;", "scenarioSelectorButtonDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CollapsedStateConfigDtoJsonAdapter extends JsonAdapter<CollapsedStateConfigDto> {
    private final JsonAdapter<CollapsedStateConfigDto.InitialStateDto> initialStateDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("initial_state", "collapse_button", "expand_button");
    private final JsonAdapter<ScenarioSelectorButtonDto> scenarioSelectorButtonDtoAdapter;

    public CollapsedStateConfigDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.initialStateDtoAdapter = moshi.adapter(CollapsedStateConfigDto.InitialStateDto.class, emptySet, "initialState");
        this.scenarioSelectorButtonDtoAdapter = moshi.adapter(ScenarioSelectorButtonDto.class, emptySet, "collapseButton");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CollapsedStateConfigDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        CollapsedStateConfigDto.InitialStateDto initialStateDto = null;
        ScenarioSelectorButtonDto scenarioSelectorButtonDto = null;
        ScenarioSelectorButtonDto scenarioSelectorButtonDto2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                initialStateDto = this.initialStateDtoAdapter.fromJson(jsonReader);
                if (initialStateDto == null) {
                    throw Util.unexpectedNull("initialState", "initial_state", jsonReader);
                }
            } else if (selectName == 1) {
                scenarioSelectorButtonDto = this.scenarioSelectorButtonDtoAdapter.fromJson(jsonReader);
                if (scenarioSelectorButtonDto == null) {
                    throw Util.unexpectedNull("collapseButton", "collapse_button", jsonReader);
                }
            } else if (selectName == 2 && (scenarioSelectorButtonDto2 = this.scenarioSelectorButtonDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("expandButton", "expand_button", jsonReader);
            }
        }
        jsonReader.endObject();
        if (initialStateDto == null) {
            throw Util.missingProperty("initialState", "initial_state", jsonReader);
        }
        if (scenarioSelectorButtonDto == null) {
            throw Util.missingProperty("collapseButton", "collapse_button", jsonReader);
        }
        if (scenarioSelectorButtonDto2 != null) {
            return new CollapsedStateConfigDto(initialStateDto, scenarioSelectorButtonDto, scenarioSelectorButtonDto2);
        }
        throw Util.missingProperty("expandButton", "expand_button", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CollapsedStateConfigDto collapsedStateConfigDto) {
        CollapsedStateConfigDto collapsedStateConfigDto2 = collapsedStateConfigDto;
        if (collapsedStateConfigDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("initial_state");
        this.initialStateDtoAdapter.toJson(jsonWriter, (JsonWriter) collapsedStateConfigDto2.getInitialState());
        jsonWriter.name("collapse_button");
        this.scenarioSelectorButtonDtoAdapter.toJson(jsonWriter, (JsonWriter) collapsedStateConfigDto2.getCollapseButton());
        jsonWriter.name("expand_button");
        this.scenarioSelectorButtonDtoAdapter.toJson(jsonWriter, (JsonWriter) collapsedStateConfigDto2.getExpandButton());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(45, "GeneratedJsonAdapter(CollapsedStateConfigDto)");
    }
}
