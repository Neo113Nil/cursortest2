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
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.IconDto;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\fR\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\fR\u001e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/HeaderDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/HeaderDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/StyledTextDto;", "nullableStyledTextDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/IconDto;", "nullableIconDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto;", "nullableActionDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/HeaderTrailElementDto;", "nullableHeaderTrailElementDtoAdapter", "", "booleanAdapter", "nullableStringAdapter", "", "nullableAnyAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HeaderDtoJsonAdapter extends JsonAdapter<HeaderDto> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<HeaderDto> constructorRef;
    private final JsonAdapter<ActionDto> nullableActionDtoAdapter;
    private final JsonAdapter<Object> nullableAnyAdapter;
    private final JsonAdapter<HeaderTrailElementDto> nullableHeaderTrailElementDtoAdapter;
    private final JsonAdapter<IconDto> nullableIconDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<StyledTextDto> nullableStyledTextDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("lead_text", "styled_lead_text", "lead_subtitle", "lead_icon", "trail_icon", "trail_action", "trail_element", "show_when_section_collapsed", "metrica_label", Constants.REFERRER_API_META);
    private final JsonAdapter<String> stringAdapter;

    public HeaderDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "leadText");
        this.nullableStyledTextDtoAdapter = moshi.adapter(StyledTextDto.class, emptySet, "styledLeadText");
        this.nullableIconDtoAdapter = moshi.adapter(IconDto.class, emptySet, "leadIcon");
        this.nullableActionDtoAdapter = moshi.adapter(ActionDto.class, emptySet, "trailAction");
        this.nullableHeaderTrailElementDtoAdapter = moshi.adapter(HeaderTrailElementDto.class, emptySet, "trailElement");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "showWhenSectionCollapsed");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "metricaLabel");
        this.nullableAnyAdapter = moshi.adapter(Object.class, emptySet, Constants.REFERRER_API_META);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final HeaderDto fromJson(JsonReader jsonReader) {
        StyledTextDto styledTextDto;
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        StyledTextDto styledTextDto2 = null;
        Boolean bool2 = bool;
        StyledTextDto styledTextDto3 = null;
        String str = null;
        ActionDto actionDto = null;
        HeaderTrailElementDto headerTrailElementDto = null;
        IconDto iconDto = null;
        String str2 = null;
        Object obj = null;
        int i = -1;
        IconDto iconDto2 = null;
        while (jsonReader.hasNext()) {
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
                    styledTextDto3 = this.nullableStyledTextDtoAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    styledTextDto2 = this.nullableStyledTextDtoAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    iconDto2 = this.nullableIconDtoAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    iconDto = this.nullableIconDtoAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    actionDto = this.nullableActionDtoAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    headerTrailElementDto = this.nullableHeaderTrailElementDtoAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    bool2 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool2 == null) {
                        throw Util.unexpectedNull("showWhenSectionCollapsed", "show_when_section_collapsed", jsonReader);
                    }
                    i = -129;
                    break;
                case 8:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 9:
                    obj = this.nullableAnyAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -129) {
            if (str == null) {
                throw Util.missingProperty("leadText", "lead_text", jsonReader);
            }
            return new HeaderDto(str, styledTextDto3, styledTextDto2, iconDto2, iconDto, actionDto, headerTrailElementDto, bool2.booleanValue(), str2, obj);
        }
        Constructor<HeaderDto> constructor = this.constructorRef;
        if (constructor == null) {
            styledTextDto = styledTextDto3;
            constructor = HeaderDto.class.getDeclaredConstructor(String.class, StyledTextDto.class, StyledTextDto.class, IconDto.class, IconDto.class, ActionDto.class, HeaderTrailElementDto.class, Boolean.TYPE, String.class, Object.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        } else {
            styledTextDto = styledTextDto3;
        }
        Constructor<HeaderDto> constructor2 = constructor;
        if (str == null) {
            throw Util.missingProperty("leadText", "lead_text", jsonReader);
        }
        return constructor2.newInstance(str, styledTextDto, styledTextDto2, iconDto2, iconDto, actionDto, headerTrailElementDto, bool2, str2, obj, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, HeaderDto headerDto) {
        HeaderDto headerDto2 = headerDto;
        if (headerDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("lead_text");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) headerDto2.getLeadText());
        jsonWriter.name("styled_lead_text");
        this.nullableStyledTextDtoAdapter.toJson(jsonWriter, (JsonWriter) headerDto2.getStyledLeadText());
        jsonWriter.name("lead_subtitle");
        this.nullableStyledTextDtoAdapter.toJson(jsonWriter, (JsonWriter) headerDto2.getLeadSubtitle());
        jsonWriter.name("lead_icon");
        this.nullableIconDtoAdapter.toJson(jsonWriter, (JsonWriter) headerDto2.getLeadIcon());
        jsonWriter.name("trail_icon");
        this.nullableIconDtoAdapter.toJson(jsonWriter, (JsonWriter) headerDto2.getTrailIcon());
        jsonWriter.name("trail_action");
        this.nullableActionDtoAdapter.toJson(jsonWriter, (JsonWriter) headerDto2.getTrailAction());
        jsonWriter.name("trail_element");
        this.nullableHeaderTrailElementDtoAdapter.toJson(jsonWriter, (JsonWriter) headerDto2.getTrailElement());
        jsonWriter.name("show_when_section_collapsed");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(headerDto2.getShowWhenSectionCollapsed()));
        jsonWriter.name("metrica_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) headerDto2.getMetricaLabel());
        jsonWriter.name(Constants.REFERRER_API_META);
        this.nullableAnyAdapter.toJson(jsonWriter, (JsonWriter) headerDto2.getMeta());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(31, "GeneratedJsonAdapter(HeaderDto)");
    }
}
