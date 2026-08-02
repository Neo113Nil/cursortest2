package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.AccessibilityInfoDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.FormBadgeDto;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\f¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/SegmentOptionDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/SegmentOptionDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/SegmentTextDto;", "segmentTextDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "anyAdapter", "", "nullableBooleanAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AccessibilityInfoDto;", "nullableAccessibilityInfoDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/FormBadgeDto;", "nullableFormBadgeDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/SegmentHintDto;", "nullableSegmentHintDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "nullableTapActionDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SegmentOptionDtoJsonAdapter extends JsonAdapter<SegmentOptionDto> {
    private final JsonAdapter<Object> anyAdapter;
    private final JsonAdapter<AccessibilityInfoDto> nullableAccessibilityInfoDtoAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<FormBadgeDto> nullableFormBadgeDtoAdapter;
    private final JsonAdapter<SegmentHintDto> nullableSegmentHintDtoAdapter;
    private final JsonAdapter<TapActionDto> nullableTapActionDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("selected_text", "unselected_text", "value", "default", "is_available", "accessibility_info", "badge", "hint", "selection_action", "unselection_action");
    private final JsonAdapter<SegmentTextDto> segmentTextDtoAdapter;

    public SegmentOptionDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.segmentTextDtoAdapter = moshi.adapter(SegmentTextDto.class, emptySet, "selectedText");
        this.anyAdapter = moshi.adapter(Object.class, emptySet, "value");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "default");
        this.nullableAccessibilityInfoDtoAdapter = moshi.adapter(AccessibilityInfoDto.class, emptySet, "accessibilityInfo");
        this.nullableFormBadgeDtoAdapter = moshi.adapter(FormBadgeDto.class, emptySet, "badge");
        this.nullableSegmentHintDtoAdapter = moshi.adapter(SegmentHintDto.class, emptySet, "hint");
        this.nullableTapActionDtoAdapter = moshi.adapter(TapActionDto.class, emptySet, "selectionAction");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SegmentOptionDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        SegmentTextDto segmentTextDto = null;
        SegmentTextDto segmentTextDto2 = null;
        Object obj = null;
        Boolean bool = null;
        Boolean bool2 = null;
        AccessibilityInfoDto accessibilityInfoDto = null;
        FormBadgeDto formBadgeDto = null;
        SegmentHintDto segmentHintDto = null;
        TapActionDto tapActionDto = null;
        TapActionDto tapActionDto2 = null;
        while (true) {
            SegmentTextDto segmentTextDto3 = segmentTextDto;
            SegmentTextDto segmentTextDto4 = segmentTextDto2;
            if (!jsonReader.hasNext()) {
                Object obj2 = obj;
                jsonReader.endObject();
                if (segmentTextDto3 == null) {
                    throw Util.missingProperty("selectedText", "selected_text", jsonReader);
                }
                if (segmentTextDto4 == null) {
                    throw Util.missingProperty("unselectedText", "unselected_text", jsonReader);
                }
                if (obj2 != null) {
                    return new SegmentOptionDto(segmentTextDto3, segmentTextDto4, obj2, bool, bool2, accessibilityInfoDto, formBadgeDto, segmentHintDto, tapActionDto, tapActionDto2);
                }
                throw Util.missingProperty("value__", "value", jsonReader);
            }
            Object obj3 = obj;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    obj = obj3;
                    segmentTextDto = segmentTextDto3;
                    segmentTextDto2 = segmentTextDto4;
                case 0:
                    segmentTextDto = this.segmentTextDtoAdapter.fromJson(jsonReader);
                    if (segmentTextDto == null) {
                        throw Util.unexpectedNull("selectedText", "selected_text", jsonReader);
                    }
                    obj = obj3;
                    segmentTextDto2 = segmentTextDto4;
                case 1:
                    segmentTextDto2 = this.segmentTextDtoAdapter.fromJson(jsonReader);
                    if (segmentTextDto2 == null) {
                        throw Util.unexpectedNull("unselectedText", "unselected_text", jsonReader);
                    }
                    obj = obj3;
                    segmentTextDto = segmentTextDto3;
                case 2:
                    obj = this.anyAdapter.fromJson(jsonReader);
                    if (obj == null) {
                        throw Util.unexpectedNull("value__", "value", jsonReader);
                    }
                    segmentTextDto = segmentTextDto3;
                    segmentTextDto2 = segmentTextDto4;
                case 3:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader);
                    obj = obj3;
                    segmentTextDto = segmentTextDto3;
                    segmentTextDto2 = segmentTextDto4;
                case 4:
                    bool2 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    obj = obj3;
                    segmentTextDto = segmentTextDto3;
                    segmentTextDto2 = segmentTextDto4;
                case 5:
                    accessibilityInfoDto = this.nullableAccessibilityInfoDtoAdapter.fromJson(jsonReader);
                    obj = obj3;
                    segmentTextDto = segmentTextDto3;
                    segmentTextDto2 = segmentTextDto4;
                case 6:
                    formBadgeDto = this.nullableFormBadgeDtoAdapter.fromJson(jsonReader);
                    obj = obj3;
                    segmentTextDto = segmentTextDto3;
                    segmentTextDto2 = segmentTextDto4;
                case 7:
                    segmentHintDto = this.nullableSegmentHintDtoAdapter.fromJson(jsonReader);
                    obj = obj3;
                    segmentTextDto = segmentTextDto3;
                    segmentTextDto2 = segmentTextDto4;
                case 8:
                    tapActionDto = this.nullableTapActionDtoAdapter.fromJson(jsonReader);
                    obj = obj3;
                    segmentTextDto = segmentTextDto3;
                    segmentTextDto2 = segmentTextDto4;
                case 9:
                    tapActionDto2 = this.nullableTapActionDtoAdapter.fromJson(jsonReader);
                    obj = obj3;
                    segmentTextDto = segmentTextDto3;
                    segmentTextDto2 = segmentTextDto4;
                default:
                    obj = obj3;
                    segmentTextDto = segmentTextDto3;
                    segmentTextDto2 = segmentTextDto4;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SegmentOptionDto segmentOptionDto) {
        SegmentOptionDto segmentOptionDto2 = segmentOptionDto;
        if (segmentOptionDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("selected_text");
        this.segmentTextDtoAdapter.toJson(jsonWriter, (JsonWriter) segmentOptionDto2.getSelectedText());
        jsonWriter.name("unselected_text");
        this.segmentTextDtoAdapter.toJson(jsonWriter, (JsonWriter) segmentOptionDto2.getUnselectedText());
        jsonWriter.name("value");
        this.anyAdapter.toJson(jsonWriter, (JsonWriter) segmentOptionDto2.getValue());
        jsonWriter.name("default");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) segmentOptionDto2.getDefault());
        jsonWriter.name("is_available");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) segmentOptionDto2.isAvailable());
        jsonWriter.name("accessibility_info");
        this.nullableAccessibilityInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) segmentOptionDto2.getAccessibilityInfo());
        jsonWriter.name("badge");
        this.nullableFormBadgeDtoAdapter.toJson(jsonWriter, (JsonWriter) segmentOptionDto2.getBadge());
        jsonWriter.name("hint");
        this.nullableSegmentHintDtoAdapter.toJson(jsonWriter, (JsonWriter) segmentOptionDto2.getHint());
        jsonWriter.name("selection_action");
        this.nullableTapActionDtoAdapter.toJson(jsonWriter, (JsonWriter) segmentOptionDto2.getSelectionAction());
        jsonWriter.name("unselection_action");
        this.nullableTapActionDtoAdapter.toJson(jsonWriter, (JsonWriter) segmentOptionDto2.getUnselectionAction());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(38, "GeneratedJsonAdapter(SegmentOptionDto)");
    }
}
