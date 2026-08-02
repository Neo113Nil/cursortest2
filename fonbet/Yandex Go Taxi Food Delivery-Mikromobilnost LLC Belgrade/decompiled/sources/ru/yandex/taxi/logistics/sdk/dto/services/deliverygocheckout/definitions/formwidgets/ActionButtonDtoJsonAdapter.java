package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.adjust.sdk.Constants;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.TapActionDto;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\f¨\u0006\u0014"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ActionButtonDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ActionButtonDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonStyleDto;", "buttonStyleDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableButtonStyleDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "tapActionDtoAdapter", "", "nullableStringAdapter", "", "nullableAnyAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ActionButtonDtoJsonAdapter extends JsonAdapter<ActionButtonDto> {
    private final JsonAdapter<ButtonStyleDto> buttonStyleDtoAdapter;
    private final JsonAdapter<Object> nullableAnyAdapter;
    private final JsonAdapter<ButtonStyleDto> nullableButtonStyleDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("normal_style", "loading_style", "action", "metrica_label", Constants.REFERRER_API_META);
    private final JsonAdapter<TapActionDto> tapActionDtoAdapter;

    public ActionButtonDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.buttonStyleDtoAdapter = moshi.adapter(ButtonStyleDto.class, emptySet, "normalStyle");
        this.nullableButtonStyleDtoAdapter = moshi.adapter(ButtonStyleDto.class, emptySet, "loadingStyle");
        this.tapActionDtoAdapter = moshi.adapter(TapActionDto.class, emptySet, "action");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "metricaLabel");
        this.nullableAnyAdapter = moshi.adapter(Object.class, emptySet, Constants.REFERRER_API_META);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ActionButtonDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        ButtonStyleDto buttonStyleDto = null;
        ButtonStyleDto buttonStyleDto2 = null;
        TapActionDto tapActionDto = null;
        String str = null;
        Object obj = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                buttonStyleDto = this.buttonStyleDtoAdapter.fromJson(jsonReader);
                if (buttonStyleDto == null) {
                    throw Util.unexpectedNull("normalStyle", "normal_style", jsonReader);
                }
            } else if (selectName == 1) {
                buttonStyleDto2 = this.nullableButtonStyleDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                tapActionDto = this.tapActionDtoAdapter.fromJson(jsonReader);
                if (tapActionDto == null) {
                    throw Util.unexpectedNull("action", "action", jsonReader);
                }
            } else if (selectName == 3) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 4) {
                obj = this.nullableAnyAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (buttonStyleDto == null) {
            throw Util.missingProperty("normalStyle", "normal_style", jsonReader);
        }
        if (tapActionDto != null) {
            return new ActionButtonDto(buttonStyleDto, buttonStyleDto2, tapActionDto, str, obj);
        }
        throw Util.missingProperty("action", "action", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ActionButtonDto actionButtonDto) {
        ActionButtonDto actionButtonDto2 = actionButtonDto;
        if (actionButtonDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("normal_style");
        this.buttonStyleDtoAdapter.toJson(jsonWriter, (JsonWriter) actionButtonDto2.getNormalStyle());
        jsonWriter.name("loading_style");
        this.nullableButtonStyleDtoAdapter.toJson(jsonWriter, (JsonWriter) actionButtonDto2.getLoadingStyle());
        jsonWriter.name("action");
        this.tapActionDtoAdapter.toJson(jsonWriter, (JsonWriter) actionButtonDto2.getAction());
        jsonWriter.name("metrica_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) actionButtonDto2.getMetricaLabel());
        jsonWriter.name(Constants.REFERRER_API_META);
        this.nullableAnyAdapter.toJson(jsonWriter, (JsonWriter) actionButtonDto2.getMeta());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(37, "GeneratedJsonAdapter(ActionButtonDto)");
    }
}
