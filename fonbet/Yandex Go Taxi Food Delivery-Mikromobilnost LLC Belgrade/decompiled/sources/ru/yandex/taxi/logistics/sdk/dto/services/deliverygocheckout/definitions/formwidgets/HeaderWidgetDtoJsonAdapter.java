package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.AddressFlowDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.ImageDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.HeaderWidgetDto;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\fR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\fR\u001e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/HeaderWidgetDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/HeaderWidgetDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;", "nullableImageDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/HeaderWidgetDto$TitleDto;", "titleDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextParametersDto;", "nullableTextParametersDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotTrailDto;", "slotTrailDtoAdapter", "nullableSlotTrailDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressFlowDto;", "nullableAddressFlowDtoAdapter", "", "booleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HeaderWidgetDtoJsonAdapter extends JsonAdapter<HeaderWidgetDto> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<HeaderWidgetDto> constructorRef;
    private final JsonAdapter<AddressFlowDto> nullableAddressFlowDtoAdapter;
    private final JsonAdapter<ImageDto> nullableImageDtoAdapter;
    private final JsonAdapter<SlotTrailDto> nullableSlotTrailDtoAdapter;
    private final JsonAdapter<TextParametersDto> nullableTextParametersDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("widget_id", "image", "title", "subtitle_style", "trail", "trail2", "address_flow", "show_subtitle");
    private final JsonAdapter<SlotTrailDto> slotTrailDtoAdapter;
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<HeaderWidgetDto.TitleDto> titleDtoAdapter;

    public HeaderWidgetDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "widgetId");
        this.nullableImageDtoAdapter = moshi.adapter(ImageDto.class, emptySet, "image");
        this.titleDtoAdapter = moshi.adapter(HeaderWidgetDto.TitleDto.class, emptySet, "title");
        this.nullableTextParametersDtoAdapter = moshi.adapter(TextParametersDto.class, emptySet, "subtitleStyle");
        this.slotTrailDtoAdapter = moshi.adapter(SlotTrailDto.class, emptySet, "trail");
        this.nullableSlotTrailDtoAdapter = moshi.adapter(SlotTrailDto.class, emptySet, "trail2");
        this.nullableAddressFlowDtoAdapter = moshi.adapter(AddressFlowDto.class, emptySet, "addressFlow");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "showSubtitle");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final HeaderWidgetDto fromJson(JsonReader jsonReader) {
        ImageDto imageDto;
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        HeaderWidgetDto.TitleDto titleDto = null;
        Boolean bool2 = bool;
        ImageDto imageDto2 = null;
        String str = null;
        SlotTrailDto slotTrailDto = null;
        AddressFlowDto addressFlowDto = null;
        SlotTrailDto slotTrailDto2 = null;
        int i = -1;
        TextParametersDto textParametersDto = null;
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
                    imageDto2 = this.nullableImageDtoAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    titleDto = this.titleDtoAdapter.fromJson(jsonReader);
                    if (titleDto == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    break;
                case 3:
                    textParametersDto = this.nullableTextParametersDtoAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    slotTrailDto2 = this.slotTrailDtoAdapter.fromJson(jsonReader);
                    if (slotTrailDto2 == null) {
                        throw Util.unexpectedNull("trail", "trail", jsonReader);
                    }
                    break;
                case 5:
                    slotTrailDto = this.nullableSlotTrailDtoAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    addressFlowDto = this.nullableAddressFlowDtoAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    bool2 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool2 == null) {
                        throw Util.unexpectedNull("showSubtitle", "show_subtitle", jsonReader);
                    }
                    i = -129;
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -129) {
            if (str == null) {
                throw Util.missingProperty("widgetId", "widget_id", jsonReader);
            }
            if (titleDto == null) {
                throw Util.missingProperty("title", "title", jsonReader);
            }
            if (slotTrailDto2 == null) {
                throw Util.missingProperty("trail", "trail", jsonReader);
            }
            return new HeaderWidgetDto(str, imageDto2, titleDto, textParametersDto, slotTrailDto2, slotTrailDto, addressFlowDto, bool2.booleanValue());
        }
        Constructor<HeaderWidgetDto> constructor = this.constructorRef;
        if (constructor == null) {
            imageDto = imageDto2;
            constructor = HeaderWidgetDto.class.getDeclaredConstructor(String.class, ImageDto.class, HeaderWidgetDto.TitleDto.class, TextParametersDto.class, SlotTrailDto.class, SlotTrailDto.class, AddressFlowDto.class, Boolean.TYPE, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        } else {
            imageDto = imageDto2;
        }
        Constructor<HeaderWidgetDto> constructor2 = constructor;
        if (str == null) {
            throw Util.missingProperty("widgetId", "widget_id", jsonReader);
        }
        if (titleDto == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (slotTrailDto2 == null) {
            throw Util.missingProperty("trail", "trail", jsonReader);
        }
        return constructor2.newInstance(str, imageDto, titleDto, textParametersDto, slotTrailDto2, slotTrailDto, addressFlowDto, bool2, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, HeaderWidgetDto headerWidgetDto) {
        HeaderWidgetDto headerWidgetDto2 = headerWidgetDto;
        if (headerWidgetDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("widget_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) headerWidgetDto2.getWidgetId());
        jsonWriter.name("image");
        this.nullableImageDtoAdapter.toJson(jsonWriter, (JsonWriter) headerWidgetDto2.getImage());
        jsonWriter.name("title");
        this.titleDtoAdapter.toJson(jsonWriter, (JsonWriter) headerWidgetDto2.getTitle());
        jsonWriter.name("subtitle_style");
        this.nullableTextParametersDtoAdapter.toJson(jsonWriter, (JsonWriter) headerWidgetDto2.getSubtitleStyle());
        jsonWriter.name("trail");
        this.slotTrailDtoAdapter.toJson(jsonWriter, (JsonWriter) headerWidgetDto2.getTrail());
        jsonWriter.name("trail2");
        this.nullableSlotTrailDtoAdapter.toJson(jsonWriter, (JsonWriter) headerWidgetDto2.getTrail2());
        jsonWriter.name("address_flow");
        this.nullableAddressFlowDtoAdapter.toJson(jsonWriter, (JsonWriter) headerWidgetDto2.getAddressFlow());
        jsonWriter.name("show_subtitle");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(headerWidgetDto2.getShowSubtitle()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(37, "GeneratedJsonAdapter(HeaderWidgetDto)");
    }
}
