package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.yandex.messaging.core.net.entities.BackendConfig;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ScenarioSelectorOptionDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ScenarioSelectorOptionDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "anyAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotDto;", "slotDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/AttributedImageDto;", "attributedImageDtoAdapter", "", "stringAdapter", "", "nullableBooleanAdapter", "booleanAdapter", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ScenarioSelectorOptionDtoJsonAdapter extends JsonAdapter<ScenarioSelectorOptionDto> {
    private final JsonAdapter<Object> anyAdapter;
    private final JsonAdapter<AttributedImageDto> attributedImageDtoAdapter;
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<ScenarioSelectorOptionDto> constructorRef;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("value", "slot", "selected_image", "background_color", "default", BackendConfig.Restrictions.ENABLED, "metrica_label");
    private final JsonAdapter<SlotDto> slotDtoAdapter;
    private final JsonAdapter<String> stringAdapter;

    public ScenarioSelectorOptionDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.anyAdapter = moshi.adapter(Object.class, emptySet, "value");
        this.slotDtoAdapter = moshi.adapter(SlotDto.class, emptySet, "slot");
        this.attributedImageDtoAdapter = moshi.adapter(AttributedImageDto.class, emptySet, "selectedImage");
        this.stringAdapter = moshi.adapter(String.class, emptySet, UrbanAdsBottomSheetFragment.BACKGROUND_COLOR);
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "default");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, BackendConfig.Restrictions.ENABLED);
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "metricaLabel");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ScenarioSelectorOptionDto fromJson(JsonReader jsonReader) {
        String str;
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        AttributedImageDto attributedImageDto = null;
        Boolean bool2 = bool;
        SlotDto slotDto = null;
        Object obj = null;
        String str2 = null;
        Boolean bool3 = null;
        int i = -1;
        String str3 = null;
        while (true) {
            SlotDto slotDto2 = slotDto;
            AttributedImageDto attributedImageDto2 = attributedImageDto;
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (i == -33) {
                    if (obj == null) {
                        throw Util.missingProperty("value__", "value", jsonReader);
                    }
                    if (slotDto2 == null) {
                        throw Util.missingProperty("slot", "slot", jsonReader);
                    }
                    if (attributedImageDto2 == null) {
                        throw Util.missingProperty("selectedImage", "selected_image", jsonReader);
                    }
                    if (str3 == null) {
                        throw Util.missingProperty(UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "background_color", jsonReader);
                    }
                    return new ScenarioSelectorOptionDto(obj, slotDto2, attributedImageDto2, str3, bool3, bool2.booleanValue(), str2);
                }
                Constructor<ScenarioSelectorOptionDto> constructor = this.constructorRef;
                if (constructor == null) {
                    str = str3;
                    constructor = ScenarioSelectorOptionDto.class.getDeclaredConstructor(Object.class, SlotDto.class, AttributedImageDto.class, String.class, Boolean.class, Boolean.TYPE, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
                    this.constructorRef = constructor;
                } else {
                    str = str3;
                }
                Constructor<ScenarioSelectorOptionDto> constructor2 = constructor;
                if (obj == null) {
                    throw Util.missingProperty("value__", "value", jsonReader);
                }
                if (slotDto2 == null) {
                    throw Util.missingProperty("slot", "slot", jsonReader);
                }
                if (attributedImageDto2 == null) {
                    throw Util.missingProperty("selectedImage", "selected_image", jsonReader);
                }
                if (str == null) {
                    throw Util.missingProperty(UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "background_color", jsonReader);
                }
                return constructor2.newInstance(obj, slotDto2, attributedImageDto2, str, bool3, bool2, str2, Integer.valueOf(i), null);
            }
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    slotDto = slotDto2;
                    attributedImageDto = attributedImageDto2;
                case 0:
                    obj = this.anyAdapter.fromJson(jsonReader);
                    if (obj == null) {
                        throw Util.unexpectedNull("value__", "value", jsonReader);
                    }
                    slotDto = slotDto2;
                    attributedImageDto = attributedImageDto2;
                case 1:
                    slotDto = this.slotDtoAdapter.fromJson(jsonReader);
                    if (slotDto == null) {
                        throw Util.unexpectedNull("slot", "slot", jsonReader);
                    }
                    attributedImageDto = attributedImageDto2;
                case 2:
                    attributedImageDto = this.attributedImageDtoAdapter.fromJson(jsonReader);
                    if (attributedImageDto == null) {
                        throw Util.unexpectedNull("selectedImage", "selected_image", jsonReader);
                    }
                    slotDto = slotDto2;
                case 3:
                    str3 = this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull(UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "background_color", jsonReader);
                    }
                    slotDto = slotDto2;
                    attributedImageDto = attributedImageDto2;
                case 4:
                    bool3 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    slotDto = slotDto2;
                    attributedImageDto = attributedImageDto2;
                case 5:
                    bool2 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool2 == null) {
                        throw Util.unexpectedNull(BackendConfig.Restrictions.ENABLED, BackendConfig.Restrictions.ENABLED, jsonReader);
                    }
                    slotDto = slotDto2;
                    attributedImageDto = attributedImageDto2;
                    i = -33;
                case 6:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    slotDto = slotDto2;
                    attributedImageDto = attributedImageDto2;
                default:
                    slotDto = slotDto2;
                    attributedImageDto = attributedImageDto2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ScenarioSelectorOptionDto scenarioSelectorOptionDto) {
        ScenarioSelectorOptionDto scenarioSelectorOptionDto2 = scenarioSelectorOptionDto;
        if (scenarioSelectorOptionDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("value");
        this.anyAdapter.toJson(jsonWriter, (JsonWriter) scenarioSelectorOptionDto2.getValue());
        jsonWriter.name("slot");
        this.slotDtoAdapter.toJson(jsonWriter, (JsonWriter) scenarioSelectorOptionDto2.getSlot());
        jsonWriter.name("selected_image");
        this.attributedImageDtoAdapter.toJson(jsonWriter, (JsonWriter) scenarioSelectorOptionDto2.getSelectedImage());
        jsonWriter.name("background_color");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) scenarioSelectorOptionDto2.getBackgroundColor());
        jsonWriter.name("default");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) scenarioSelectorOptionDto2.getDefault());
        jsonWriter.name(BackendConfig.Restrictions.ENABLED);
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(scenarioSelectorOptionDto2.getEnabled()));
        jsonWriter.name("metrica_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) scenarioSelectorOptionDto2.getMetricaLabel());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(47, "GeneratedJsonAdapter(ScenarioSelectorOptionDto)");
    }
}
