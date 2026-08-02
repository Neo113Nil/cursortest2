package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard;

import com.adjust.sdk.Constants;
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
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.ActionDto;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/AddressButtonDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/AddressButtonDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto;", "actionDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TrailAddressButtonDto;", "nullableTrailAddressButtonDtoAdapter", "", "booleanAdapter", "", "nullableAnyAdapter", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AddressButtonDtoJsonAdapter extends JsonAdapter<AddressButtonDto> {
    private final JsonAdapter<ActionDto> actionDtoAdapter;
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<AddressButtonDto> constructorRef;
    private final JsonAdapter<Object> nullableAnyAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<TrailAddressButtonDto> nullableTrailAddressButtonDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("text", "action", "trail_button", "show_when_section_collapsed", Constants.REFERRER_API_META, "metrica_label");
    private final JsonAdapter<String> stringAdapter;

    public AddressButtonDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "text");
        this.actionDtoAdapter = moshi.adapter(ActionDto.class, emptySet, "action");
        this.nullableTrailAddressButtonDtoAdapter = moshi.adapter(TrailAddressButtonDto.class, emptySet, "trailButton");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "showWhenSectionCollapsed");
        this.nullableAnyAdapter = moshi.adapter(Object.class, emptySet, Constants.REFERRER_API_META);
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "metricaLabel");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final AddressButtonDto fromJson(JsonReader jsonReader) {
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        TrailAddressButtonDto trailAddressButtonDto = null;
        int i = -1;
        Boolean bool2 = bool;
        ActionDto actionDto = null;
        String str = null;
        String str2 = null;
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
                        throw Util.unexpectedNull("text", "text", jsonReader);
                    }
                    break;
                case 1:
                    actionDto = this.actionDtoAdapter.fromJson(jsonReader);
                    if (actionDto == null) {
                        throw Util.unexpectedNull("action", "action", jsonReader);
                    }
                    break;
                case 2:
                    trailAddressButtonDto = this.nullableTrailAddressButtonDtoAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    bool2 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool2 == null) {
                        throw Util.unexpectedNull("showWhenSectionCollapsed", "show_when_section_collapsed", jsonReader);
                    }
                    i = -9;
                    break;
                case 4:
                    obj = this.nullableAnyAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -9) {
            if (str == null) {
                throw Util.missingProperty("text", "text", jsonReader);
            }
            if (actionDto == null) {
                throw Util.missingProperty("action", "action", jsonReader);
            }
            return new AddressButtonDto(str, actionDto, trailAddressButtonDto, bool2.booleanValue(), obj, str2);
        }
        Constructor<AddressButtonDto> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = AddressButtonDto.class.getDeclaredConstructor(String.class, ActionDto.class, TrailAddressButtonDto.class, Boolean.TYPE, Object.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        Constructor<AddressButtonDto> constructor2 = constructor;
        if (str == null) {
            throw Util.missingProperty("text", "text", jsonReader);
        }
        if (actionDto == null) {
            throw Util.missingProperty("action", "action", jsonReader);
        }
        return constructor2.newInstance(str, actionDto, trailAddressButtonDto, bool2, obj, str2, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, AddressButtonDto addressButtonDto) {
        AddressButtonDto addressButtonDto2 = addressButtonDto;
        if (addressButtonDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("text");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) addressButtonDto2.getText());
        jsonWriter.name("action");
        this.actionDtoAdapter.toJson(jsonWriter, (JsonWriter) addressButtonDto2.getAction());
        jsonWriter.name("trail_button");
        this.nullableTrailAddressButtonDtoAdapter.toJson(jsonWriter, (JsonWriter) addressButtonDto2.getTrailButton());
        jsonWriter.name("show_when_section_collapsed");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(addressButtonDto2.getShowWhenSectionCollapsed()));
        jsonWriter.name(Constants.REFERRER_API_META);
        this.nullableAnyAdapter.toJson(jsonWriter, (JsonWriter) addressButtonDto2.getMeta());
        jsonWriter.name("metrica_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) addressButtonDto2.getMetricaLabel());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(38, "GeneratedJsonAdapter(AddressButtonDto)");
    }
}
