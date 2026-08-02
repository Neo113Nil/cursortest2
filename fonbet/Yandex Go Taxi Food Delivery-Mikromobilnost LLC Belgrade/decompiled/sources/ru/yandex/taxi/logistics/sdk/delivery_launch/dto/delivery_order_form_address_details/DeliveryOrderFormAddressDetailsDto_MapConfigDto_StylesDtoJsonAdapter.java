package ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_order_form_address_details;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_order_form_address_details.DeliveryOrderFormAddressDetailsDto;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/DeliveryOrderFormAddressDetailsDto_MapConfigDto_StylesDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/DeliveryOrderFormAddressDetailsDto$MapConfigDto$StylesDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/DeliveryOrderFormAddressDetailsDto$MapConfigDto$StylesDto$ThemeDto;", "themeDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "sdk-delivery-launch"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeliveryOrderFormAddressDetailsDto_MapConfigDto_StylesDtoJsonAdapter extends JsonAdapter<DeliveryOrderFormAddressDetailsDto.MapConfigDto.StylesDto> {
    private final JsonReader.Options options = JsonReader.Options.of(DivkitThemeChangeListener.THEME_VARIABLE_NAME, "value");
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<DeliveryOrderFormAddressDetailsDto.MapConfigDto.StylesDto.ThemeDto> themeDtoAdapter;

    public DeliveryOrderFormAddressDetailsDto_MapConfigDto_StylesDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.themeDtoAdapter = moshi.adapter(DeliveryOrderFormAddressDetailsDto.MapConfigDto.StylesDto.ThemeDto.class, emptySet, DivkitThemeChangeListener.THEME_VARIABLE_NAME);
        this.stringAdapter = moshi.adapter(String.class, emptySet, "value");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DeliveryOrderFormAddressDetailsDto.MapConfigDto.StylesDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        DeliveryOrderFormAddressDetailsDto.MapConfigDto.StylesDto.ThemeDto themeDto = null;
        String str = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                themeDto = this.themeDtoAdapter.fromJson(jsonReader);
                if (themeDto == null) {
                    throw Util.unexpectedNull(DivkitThemeChangeListener.THEME_VARIABLE_NAME, DivkitThemeChangeListener.THEME_VARIABLE_NAME, jsonReader);
                }
            } else if (selectName == 1 && (str = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("value__", "value", jsonReader);
            }
        }
        jsonReader.endObject();
        if (themeDto == null) {
            throw Util.missingProperty(DivkitThemeChangeListener.THEME_VARIABLE_NAME, DivkitThemeChangeListener.THEME_VARIABLE_NAME, jsonReader);
        }
        if (str != null) {
            return new DeliveryOrderFormAddressDetailsDto.MapConfigDto.StylesDto(themeDto, str);
        }
        throw Util.missingProperty("value__", "value", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DeliveryOrderFormAddressDetailsDto.MapConfigDto.StylesDto stylesDto) {
        DeliveryOrderFormAddressDetailsDto.MapConfigDto.StylesDto stylesDto2 = stylesDto;
        if (stylesDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(DivkitThemeChangeListener.THEME_VARIABLE_NAME);
        this.themeDtoAdapter.toJson(jsonWriter, (JsonWriter) stylesDto2.getTheme());
        jsonWriter.name("value");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) stylesDto2.getValue());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(79, "GeneratedJsonAdapter(DeliveryOrderFormAddressDetailsDto.MapConfigDto.StylesDto)");
    }
}
