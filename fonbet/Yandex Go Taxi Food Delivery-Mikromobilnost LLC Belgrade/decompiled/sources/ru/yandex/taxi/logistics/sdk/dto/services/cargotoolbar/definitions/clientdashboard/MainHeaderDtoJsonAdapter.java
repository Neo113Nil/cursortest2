package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard;

import com.adjust.sdk.Constants;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.IconDto;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\fR\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\fR\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\fR\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/MainHeaderDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/MainHeaderDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/StyledTextDto;", "nullableStyledTextDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/IconDto;", "iconDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TrailElementDto;", "nullableTrailElementDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/AddressButtonDto;", "nullableAddressButtonDtoAdapter", "", "booleanAdapter", "nullableStringAdapter", "", "nullableAnyAdapter", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/MiddleElementDto;", "nullableListOfMiddleElementDtoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MainHeaderDtoJsonAdapter extends JsonAdapter<MainHeaderDto> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<MainHeaderDto> constructorRef;
    private final JsonAdapter<IconDto> iconDtoAdapter;
    private final JsonAdapter<AddressButtonDto> nullableAddressButtonDtoAdapter;
    private final JsonAdapter<Object> nullableAnyAdapter;
    private final JsonAdapter<List<MiddleElementDto>> nullableListOfMiddleElementDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<StyledTextDto> nullableStyledTextDtoAdapter;
    private final JsonAdapter<TrailElementDto> nullableTrailElementDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("lead_text", "styled_lead_text", "lead_icon", "trail_element", "address_button", "show_when_section_collapsed", "metrica_label", Constants.REFERRER_API_META, "middle_elements");
    private final JsonAdapter<String> stringAdapter;

    public MainHeaderDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "leadText");
        this.nullableStyledTextDtoAdapter = moshi.adapter(StyledTextDto.class, emptySet, "styledLeadText");
        this.iconDtoAdapter = moshi.adapter(IconDto.class, emptySet, "leadIcon");
        this.nullableTrailElementDtoAdapter = moshi.adapter(TrailElementDto.class, emptySet, "trailElement");
        this.nullableAddressButtonDtoAdapter = moshi.adapter(AddressButtonDto.class, emptySet, "addressButton");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "showWhenSectionCollapsed");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "metricaLabel");
        this.nullableAnyAdapter = moshi.adapter(Object.class, emptySet, Constants.REFERRER_API_META);
        this.nullableListOfMiddleElementDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, MiddleElementDto.class), emptySet, "middleElements");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final MainHeaderDto fromJson(JsonReader jsonReader) {
        IconDto iconDto;
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        IconDto iconDto2 = null;
        Boolean bool2 = bool;
        StyledTextDto styledTextDto = null;
        String str = null;
        String str2 = null;
        Object obj = null;
        AddressButtonDto addressButtonDto = null;
        List<MiddleElementDto> list = null;
        int i = -1;
        TrailElementDto trailElementDto = null;
        while (true) {
            StyledTextDto styledTextDto2 = styledTextDto;
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (i == -33) {
                    if (str == null) {
                        throw Util.missingProperty("leadText", "lead_text", jsonReader);
                    }
                    if (iconDto2 == null) {
                        throw Util.missingProperty("leadIcon", "lead_icon", jsonReader);
                    }
                    return new MainHeaderDto(str, styledTextDto2, iconDto2, trailElementDto, addressButtonDto, bool2.booleanValue(), str2, obj, list);
                }
                Constructor<MainHeaderDto> constructor = this.constructorRef;
                if (constructor == null) {
                    iconDto = iconDto2;
                    constructor = MainHeaderDto.class.getDeclaredConstructor(String.class, StyledTextDto.class, IconDto.class, TrailElementDto.class, AddressButtonDto.class, Boolean.TYPE, String.class, Object.class, List.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
                    this.constructorRef = constructor;
                } else {
                    iconDto = iconDto2;
                }
                Constructor<MainHeaderDto> constructor2 = constructor;
                if (str == null) {
                    throw Util.missingProperty("leadText", "lead_text", jsonReader);
                }
                if (iconDto == null) {
                    throw Util.missingProperty("leadIcon", "lead_icon", jsonReader);
                }
                return constructor2.newInstance(str, styledTextDto2, iconDto, trailElementDto, addressButtonDto, bool2, str2, obj, list, Integer.valueOf(i), null);
            }
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("leadText", "lead_text", jsonReader);
                    }
                    break;
                case 1:
                    styledTextDto = this.nullableStyledTextDtoAdapter.fromJson(jsonReader);
                    continue;
                case 2:
                    iconDto2 = this.iconDtoAdapter.fromJson(jsonReader);
                    if (iconDto2 == null) {
                        throw Util.unexpectedNull("leadIcon", "lead_icon", jsonReader);
                    }
                    break;
                case 3:
                    trailElementDto = this.nullableTrailElementDtoAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    addressButtonDto = this.nullableAddressButtonDtoAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    bool2 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool2 == null) {
                        throw Util.unexpectedNull("showWhenSectionCollapsed", "show_when_section_collapsed", jsonReader);
                    }
                    styledTextDto = styledTextDto2;
                    i = -33;
                    continue;
                case 6:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    obj = this.nullableAnyAdapter.fromJson(jsonReader);
                    break;
                case 8:
                    list = this.nullableListOfMiddleElementDtoAdapter.fromJson(jsonReader);
                    break;
            }
            styledTextDto = styledTextDto2;
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, MainHeaderDto mainHeaderDto) {
        MainHeaderDto mainHeaderDto2 = mainHeaderDto;
        if (mainHeaderDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("lead_text");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) mainHeaderDto2.getLeadText());
        jsonWriter.name("styled_lead_text");
        this.nullableStyledTextDtoAdapter.toJson(jsonWriter, (JsonWriter) mainHeaderDto2.getStyledLeadText());
        jsonWriter.name("lead_icon");
        this.iconDtoAdapter.toJson(jsonWriter, (JsonWriter) mainHeaderDto2.getLeadIcon());
        jsonWriter.name("trail_element");
        this.nullableTrailElementDtoAdapter.toJson(jsonWriter, (JsonWriter) mainHeaderDto2.getTrailElement());
        jsonWriter.name("address_button");
        this.nullableAddressButtonDtoAdapter.toJson(jsonWriter, (JsonWriter) mainHeaderDto2.getAddressButton());
        jsonWriter.name("show_when_section_collapsed");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(mainHeaderDto2.getShowWhenSectionCollapsed()));
        jsonWriter.name("metrica_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) mainHeaderDto2.getMetricaLabel());
        jsonWriter.name(Constants.REFERRER_API_META);
        this.nullableAnyAdapter.toJson(jsonWriter, (JsonWriter) mainHeaderDto2.getMeta());
        jsonWriter.name("middle_elements");
        this.nullableListOfMiddleElementDtoAdapter.toJson(jsonWriter, (JsonWriter) mainHeaderDto2.getMiddleElements());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(35, "GeneratedJsonAdapter(MainHeaderDto)");
    }
}
