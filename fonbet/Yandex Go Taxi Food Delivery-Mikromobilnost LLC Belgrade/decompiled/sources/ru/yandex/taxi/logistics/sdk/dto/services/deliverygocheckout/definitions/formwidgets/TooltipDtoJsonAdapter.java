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
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.TooltipDto;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TooltipDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TooltipDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TooltipDto$PositionDto;", "positionDtoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TooltipDtoJsonAdapter extends JsonAdapter<TooltipDto> {
    private volatile Constructor<TooltipDto> constructorRef;
    private final JsonReader.Options options = JsonReader.Options.of("text", "position");
    private final JsonAdapter<TooltipDto.PositionDto> positionDtoAdapter;
    private final JsonAdapter<String> stringAdapter;

    public TooltipDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "text");
        this.positionDtoAdapter = moshi.adapter(TooltipDto.PositionDto.class, emptySet, "position");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TooltipDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        TooltipDto.PositionDto positionDto = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("text", "text", jsonReader);
                }
            } else if (selectName == 1) {
                positionDto = this.positionDtoAdapter.fromJson(jsonReader);
                if (positionDto == null) {
                    throw Util.unexpectedNull("position", "position", jsonReader);
                }
                i = -3;
            } else {
                continue;
            }
        }
        jsonReader.endObject();
        if (i == -3) {
            if (str != null) {
                return new TooltipDto(str, positionDto);
            }
            throw Util.missingProperty("text", "text", jsonReader);
        }
        Constructor<TooltipDto> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = TooltipDto.class.getDeclaredConstructor(String.class, TooltipDto.PositionDto.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (str != null) {
            return constructor.newInstance(str, positionDto, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("text", "text", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TooltipDto tooltipDto) {
        TooltipDto tooltipDto2 = tooltipDto;
        if (tooltipDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("text");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) tooltipDto2.getText());
        jsonWriter.name("position");
        this.positionDtoAdapter.toJson(jsonWriter, (JsonWriter) tooltipDto2.getPosition());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(32, "GeneratedJsonAdapter(TooltipDto)");
    }
}
