package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions;

import com.adjust.sdk.Constants;
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
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\"\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\f¨\u0006\u0018"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/StickyWidgetAIChatDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/StickyWidgetAIChatDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "nullableAttributedTextDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/AIChatDynamicTextItemDto;", "nullableListOfAIChatDynamicTextItemDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto;", "actionDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/IconDto;", "nullableIconDtoAdapter", "", "nullableAnyAdapter", "", "nullableStringAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StickyWidgetAIChatDtoJsonAdapter extends JsonAdapter<StickyWidgetAIChatDto> {
    private final JsonAdapter<ActionDto> actionDtoAdapter;
    private final JsonAdapter<Object> nullableAnyAdapter;
    private final JsonAdapter<AttributedTextDto> nullableAttributedTextDtoAdapter;
    private final JsonAdapter<IconDto> nullableIconDtoAdapter;
    private final JsonAdapter<List<AIChatDynamicTextItemDto>> nullableListOfAIChatDynamicTextItemDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("text", "dynamic_text", "action", "lead_image", "trail_image", Constants.REFERRER_API_META, "metrica_label");

    public StickyWidgetAIChatDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableAttributedTextDtoAdapter = moshi.adapter(AttributedTextDto.class, emptySet, "text");
        this.nullableListOfAIChatDynamicTextItemDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, AIChatDynamicTextItemDto.class), emptySet, "dynamicText");
        this.actionDtoAdapter = moshi.adapter(ActionDto.class, emptySet, "action");
        this.nullableIconDtoAdapter = moshi.adapter(IconDto.class, emptySet, "leadImage");
        this.nullableAnyAdapter = moshi.adapter(Object.class, emptySet, Constants.REFERRER_API_META);
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "metricaLabel");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final StickyWidgetAIChatDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        AttributedTextDto attributedTextDto = null;
        List<AIChatDynamicTextItemDto> list = null;
        ActionDto actionDto = null;
        IconDto iconDto = null;
        IconDto iconDto2 = null;
        Object obj = null;
        String str = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    attributedTextDto = this.nullableAttributedTextDtoAdapter.fromJson(jsonReader);
                    break;
                case 1:
                    list = this.nullableListOfAIChatDynamicTextItemDtoAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    actionDto = this.actionDtoAdapter.fromJson(jsonReader);
                    if (actionDto == null) {
                        throw Util.unexpectedNull("action", "action", jsonReader);
                    }
                    break;
                case 3:
                    iconDto = this.nullableIconDtoAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    iconDto2 = this.nullableIconDtoAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    obj = this.nullableAnyAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (actionDto != null) {
            return new StickyWidgetAIChatDto(attributedTextDto, list, actionDto, iconDto, iconDto2, obj, str);
        }
        throw Util.missingProperty("action", "action", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, StickyWidgetAIChatDto stickyWidgetAIChatDto) {
        StickyWidgetAIChatDto stickyWidgetAIChatDto2 = stickyWidgetAIChatDto;
        if (stickyWidgetAIChatDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("text");
        this.nullableAttributedTextDtoAdapter.toJson(jsonWriter, (JsonWriter) stickyWidgetAIChatDto2.getText());
        jsonWriter.name("dynamic_text");
        this.nullableListOfAIChatDynamicTextItemDtoAdapter.toJson(jsonWriter, (JsonWriter) stickyWidgetAIChatDto2.getDynamicText());
        jsonWriter.name("action");
        this.actionDtoAdapter.toJson(jsonWriter, (JsonWriter) stickyWidgetAIChatDto2.getAction());
        jsonWriter.name("lead_image");
        this.nullableIconDtoAdapter.toJson(jsonWriter, (JsonWriter) stickyWidgetAIChatDto2.getLeadImage());
        jsonWriter.name("trail_image");
        this.nullableIconDtoAdapter.toJson(jsonWriter, (JsonWriter) stickyWidgetAIChatDto2.getTrailImage());
        jsonWriter.name(Constants.REFERRER_API_META);
        this.nullableAnyAdapter.toJson(jsonWriter, (JsonWriter) stickyWidgetAIChatDto2.getMeta());
        jsonWriter.name("metrica_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) stickyWidgetAIChatDto2.getMetricaLabel());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(43, "GeneratedJsonAdapter(StickyWidgetAIChatDto)");
    }
}
