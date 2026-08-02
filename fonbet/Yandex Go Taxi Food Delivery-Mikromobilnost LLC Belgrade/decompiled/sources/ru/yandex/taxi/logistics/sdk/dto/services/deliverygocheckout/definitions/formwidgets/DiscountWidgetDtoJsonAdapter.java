package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.adjust.sdk.Constants;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.ImageDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.TapActionDto;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/DiscountWidgetDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/DiscountWidgetDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;", "nullableImageDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "attributedTextDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "nullableTapActionDtoAdapter", "nullableStringAdapter", "", "nullableAnyAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DiscountWidgetDtoJsonAdapter extends JsonAdapter<DiscountWidgetDto> {
    private final JsonAdapter<AttributedTextDto> attributedTextDtoAdapter;
    private final JsonAdapter<Object> nullableAnyAdapter;
    private final JsonAdapter<ImageDto> nullableImageDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<TapActionDto> nullableTapActionDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("widget_id", "lead_image", "background_color", "text", "trail_image", "action", "metrica_label", Constants.REFERRER_API_META);
    private final JsonAdapter<String> stringAdapter;

    public DiscountWidgetDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "widgetId");
        this.nullableImageDtoAdapter = moshi.adapter(ImageDto.class, emptySet, "leadImage");
        this.attributedTextDtoAdapter = moshi.adapter(AttributedTextDto.class, emptySet, "text");
        this.nullableTapActionDtoAdapter = moshi.adapter(TapActionDto.class, emptySet, "action");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "metricaLabel");
        this.nullableAnyAdapter = moshi.adapter(Object.class, emptySet, Constants.REFERRER_API_META);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DiscountWidgetDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        ImageDto imageDto = null;
        String str2 = null;
        AttributedTextDto attributedTextDto = null;
        ImageDto imageDto2 = null;
        TapActionDto tapActionDto = null;
        String str3 = null;
        Object obj = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("widgetId", "widget_id", jsonReader);
                    }
                    break;
                case 1:
                    imageDto = this.nullableImageDtoAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull(UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "background_color", jsonReader);
                    }
                    break;
                case 3:
                    attributedTextDto = this.attributedTextDtoAdapter.fromJson(jsonReader);
                    if (attributedTextDto == null) {
                        throw Util.unexpectedNull("text", "text", jsonReader);
                    }
                    break;
                case 4:
                    imageDto2 = this.nullableImageDtoAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    tapActionDto = this.nullableTapActionDtoAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    obj = this.nullableAnyAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("widgetId", "widget_id", jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty(UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "background_color", jsonReader);
        }
        if (attributedTextDto != null) {
            return new DiscountWidgetDto(str, imageDto, str2, attributedTextDto, imageDto2, tapActionDto, str3, obj);
        }
        throw Util.missingProperty("text", "text", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DiscountWidgetDto discountWidgetDto) {
        DiscountWidgetDto discountWidgetDto2 = discountWidgetDto;
        if (discountWidgetDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("widget_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) discountWidgetDto2.getWidgetId());
        jsonWriter.name("lead_image");
        this.nullableImageDtoAdapter.toJson(jsonWriter, (JsonWriter) discountWidgetDto2.getLeadImage());
        jsonWriter.name("background_color");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) discountWidgetDto2.getBackgroundColor());
        jsonWriter.name("text");
        this.attributedTextDtoAdapter.toJson(jsonWriter, (JsonWriter) discountWidgetDto2.getText());
        jsonWriter.name("trail_image");
        this.nullableImageDtoAdapter.toJson(jsonWriter, (JsonWriter) discountWidgetDto2.getTrailImage());
        jsonWriter.name("action");
        this.nullableTapActionDtoAdapter.toJson(jsonWriter, (JsonWriter) discountWidgetDto2.getAction());
        jsonWriter.name("metrica_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) discountWidgetDto2.getMetricaLabel());
        jsonWriter.name(Constants.REFERRER_API_META);
        this.nullableAnyAdapter.toJson(jsonWriter, (JsonWriter) discountWidgetDto2.getMeta());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(39, "GeneratedJsonAdapter(DiscountWidgetDto)");
    }
}
