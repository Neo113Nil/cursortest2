package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.ButtonStyleDto;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonStyleDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonStyleDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotBodyDto;", "slotBodyDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonStyleDto$StyleDto;", "styleDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CustomButtonStyleDto;", "nullableCustomButtonStyleDtoAdapter", "", "booleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ButtonStyleDtoJsonAdapter extends JsonAdapter<ButtonStyleDto> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<ButtonStyleDto> constructorRef;
    private final JsonAdapter<CustomButtonStyleDto> nullableCustomButtonStyleDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("slot", "style", "custom_style", BackendConfig.Restrictions.ENABLED);
    private final JsonAdapter<SlotBodyDto> slotBodyDtoAdapter;
    private final JsonAdapter<ButtonStyleDto.StyleDto> styleDtoAdapter;

    public ButtonStyleDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.slotBodyDtoAdapter = moshi.adapter(SlotBodyDto.class, emptySet, "slot");
        this.styleDtoAdapter = moshi.adapter(ButtonStyleDto.StyleDto.class, emptySet, "style");
        this.nullableCustomButtonStyleDtoAdapter = moshi.adapter(CustomButtonStyleDto.class, emptySet, "customStyle");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, BackendConfig.Restrictions.ENABLED);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ButtonStyleDto fromJson(JsonReader jsonReader) {
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        Boolean bool2 = bool;
        SlotBodyDto slotBodyDto = null;
        ButtonStyleDto.StyleDto styleDto = null;
        CustomButtonStyleDto customButtonStyleDto = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                slotBodyDto = this.slotBodyDtoAdapter.fromJson(jsonReader);
                if (slotBodyDto == null) {
                    throw Util.unexpectedNull("slot", "slot", jsonReader);
                }
            } else if (selectName == 1) {
                styleDto = this.styleDtoAdapter.fromJson(jsonReader);
                if (styleDto == null) {
                    throw Util.unexpectedNull("style", "style", jsonReader);
                }
            } else if (selectName == 2) {
                customButtonStyleDto = this.nullableCustomButtonStyleDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                bool2 = this.booleanAdapter.fromJson(jsonReader);
                if (bool2 == null) {
                    throw Util.unexpectedNull(BackendConfig.Restrictions.ENABLED, BackendConfig.Restrictions.ENABLED, jsonReader);
                }
                i = -9;
            } else {
                continue;
            }
        }
        jsonReader.endObject();
        if (i == -9) {
            if (slotBodyDto == null) {
                throw Util.missingProperty("slot", "slot", jsonReader);
            }
            if (styleDto != null) {
                return new ButtonStyleDto(slotBodyDto, styleDto, customButtonStyleDto, bool2.booleanValue());
            }
            throw Util.missingProperty("style", "style", jsonReader);
        }
        Constructor<ButtonStyleDto> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ButtonStyleDto.class.getDeclaredConstructor(SlotBodyDto.class, ButtonStyleDto.StyleDto.class, CustomButtonStyleDto.class, Boolean.TYPE, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (slotBodyDto == null) {
            throw Util.missingProperty("slot", "slot", jsonReader);
        }
        if (styleDto != null) {
            return constructor.newInstance(slotBodyDto, styleDto, customButtonStyleDto, bool2, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("style", "style", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ButtonStyleDto buttonStyleDto) {
        ButtonStyleDto buttonStyleDto2 = buttonStyleDto;
        if (buttonStyleDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("slot");
        this.slotBodyDtoAdapter.toJson(jsonWriter, (JsonWriter) buttonStyleDto2.getSlot());
        jsonWriter.name("style");
        this.styleDtoAdapter.toJson(jsonWriter, (JsonWriter) buttonStyleDto2.getStyle());
        jsonWriter.name("custom_style");
        this.nullableCustomButtonStyleDtoAdapter.toJson(jsonWriter, (JsonWriter) buttonStyleDto2.getCustomStyle());
        jsonWriter.name(BackendConfig.Restrictions.ENABLED);
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(buttonStyleDto2.getEnabled()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(36, "GeneratedJsonAdapter(ButtonStyleDto)");
    }
}
