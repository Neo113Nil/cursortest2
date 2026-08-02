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
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.PaddingsDto;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CostDetailWidgetDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CostDetailWidgetDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "attributedTextDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextParametersDto;", "textParametersDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/PaddingsDto;", "nullablePaddingsDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CostDetailWidgetDtoJsonAdapter extends JsonAdapter<CostDetailWidgetDto> {
    private final JsonAdapter<AttributedTextDto> attributedTextDtoAdapter;
    private final JsonAdapter<PaddingsDto> nullablePaddingsDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("widget_id", "lead_text", "trail_text", "dot_style", "paddings");
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<TextParametersDto> textParametersDtoAdapter;

    public CostDetailWidgetDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "widgetId");
        this.attributedTextDtoAdapter = moshi.adapter(AttributedTextDto.class, emptySet, "leadText");
        this.textParametersDtoAdapter = moshi.adapter(TextParametersDto.class, emptySet, "dotStyle");
        this.nullablePaddingsDtoAdapter = moshi.adapter(PaddingsDto.class, emptySet, "paddings");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CostDetailWidgetDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        AttributedTextDto attributedTextDto = null;
        AttributedTextDto attributedTextDto2 = null;
        TextParametersDto textParametersDto = null;
        PaddingsDto paddingsDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            String str2 = str;
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("widgetId", "widget_id", jsonReader);
                }
            } else if (selectName == 1) {
                attributedTextDto = this.attributedTextDtoAdapter.fromJson(jsonReader);
                if (attributedTextDto == null) {
                    throw Util.unexpectedNull("leadText", "lead_text", jsonReader);
                }
            } else if (selectName == 2) {
                attributedTextDto2 = this.attributedTextDtoAdapter.fromJson(jsonReader);
                if (attributedTextDto2 == null) {
                    throw Util.unexpectedNull("trailText", "trail_text", jsonReader);
                }
            } else if (selectName == 3) {
                textParametersDto = this.textParametersDtoAdapter.fromJson(jsonReader);
                if (textParametersDto == null) {
                    throw Util.unexpectedNull("dotStyle", "dot_style", jsonReader);
                }
            } else if (selectName == 4) {
                paddingsDto = this.nullablePaddingsDtoAdapter.fromJson(jsonReader);
            }
            str = str2;
        }
        String str3 = str;
        jsonReader.endObject();
        if (str3 == null) {
            throw Util.missingProperty("widgetId", "widget_id", jsonReader);
        }
        if (attributedTextDto == null) {
            throw Util.missingProperty("leadText", "lead_text", jsonReader);
        }
        if (attributedTextDto2 == null) {
            throw Util.missingProperty("trailText", "trail_text", jsonReader);
        }
        if (textParametersDto != null) {
            return new CostDetailWidgetDto(str3, attributedTextDto, attributedTextDto2, textParametersDto, paddingsDto);
        }
        throw Util.missingProperty("dotStyle", "dot_style", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CostDetailWidgetDto costDetailWidgetDto) {
        CostDetailWidgetDto costDetailWidgetDto2 = costDetailWidgetDto;
        if (costDetailWidgetDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("widget_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) costDetailWidgetDto2.getWidgetId());
        jsonWriter.name("lead_text");
        this.attributedTextDtoAdapter.toJson(jsonWriter, (JsonWriter) costDetailWidgetDto2.getLeadText());
        jsonWriter.name("trail_text");
        this.attributedTextDtoAdapter.toJson(jsonWriter, (JsonWriter) costDetailWidgetDto2.getTrailText());
        jsonWriter.name("dot_style");
        this.textParametersDtoAdapter.toJson(jsonWriter, (JsonWriter) costDetailWidgetDto2.getDotStyle());
        jsonWriter.name("paddings");
        this.nullablePaddingsDtoAdapter.toJson(jsonWriter, (JsonWriter) costDetailWidgetDto2.getPaddings());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(41, "GeneratedJsonAdapter(CostDetailWidgetDto)");
    }
}
