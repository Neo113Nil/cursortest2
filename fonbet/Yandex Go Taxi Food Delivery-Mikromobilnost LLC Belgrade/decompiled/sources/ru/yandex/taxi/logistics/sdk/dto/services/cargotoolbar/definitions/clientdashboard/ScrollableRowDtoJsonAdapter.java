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
import java.lang.reflect.ParameterizedType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\rR\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/ScrollableRowDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/ScrollableRowDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/ScrollableRowTileDto;", "listOfScrollableRowTileDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableIntAdapter", "", "booleanAdapter", "", "nullableStringAdapter", "", "nullableAnyAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ScrollableRowDtoJsonAdapter extends JsonAdapter<ScrollableRowDto> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<ScrollableRowDto> constructorRef;
    private final JsonAdapter<List<ScrollableRowTileDto>> listOfScrollableRowTileDtoAdapter;
    private final JsonAdapter<Object> nullableAnyAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("tiles", "columns", "show_when_section_collapsed", "metrica_label", Constants.REFERRER_API_META);

    public ScrollableRowDtoJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(List.class, ScrollableRowTileDto.class);
        EmptySet emptySet = EmptySet.a;
        this.listOfScrollableRowTileDtoAdapter = moshi.adapter(newParameterizedType, emptySet, "tiles");
        this.nullableIntAdapter = moshi.adapter(Integer.class, emptySet, "columns");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "showWhenSectionCollapsed");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "metricaLabel");
        this.nullableAnyAdapter = moshi.adapter(Object.class, emptySet, Constants.REFERRER_API_META);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ScrollableRowDto fromJson(JsonReader jsonReader) {
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        Boolean bool2 = bool;
        List<ScrollableRowTileDto> list = null;
        Integer num = null;
        String str = null;
        Object obj = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                list = this.listOfScrollableRowTileDtoAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("tiles", "tiles", jsonReader);
                }
            } else if (selectName == 1) {
                num = this.nullableIntAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                bool2 = this.booleanAdapter.fromJson(jsonReader);
                if (bool2 == null) {
                    throw Util.unexpectedNull("showWhenSectionCollapsed", "show_when_section_collapsed", jsonReader);
                }
                i = -5;
            } else if (selectName == 3) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 4) {
                obj = this.nullableAnyAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (i == -5) {
            String str2 = str;
            if (list == null) {
                throw Util.missingProperty("tiles", "tiles", jsonReader);
            }
            return new ScrollableRowDto(list, num, bool2.booleanValue(), str2, obj);
        }
        String str3 = str;
        Constructor<ScrollableRowDto> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ScrollableRowDto.class.getDeclaredConstructor(List.class, Integer.class, Boolean.TYPE, String.class, Object.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (list != null) {
            return constructor.newInstance(list, num, bool2, str3, obj, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("tiles", "tiles", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ScrollableRowDto scrollableRowDto) {
        ScrollableRowDto scrollableRowDto2 = scrollableRowDto;
        if (scrollableRowDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("tiles");
        this.listOfScrollableRowTileDtoAdapter.toJson(jsonWriter, (JsonWriter) scrollableRowDto2.getTiles());
        jsonWriter.name("columns");
        this.nullableIntAdapter.toJson(jsonWriter, (JsonWriter) scrollableRowDto2.getColumns());
        jsonWriter.name("show_when_section_collapsed");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(scrollableRowDto2.getShowWhenSectionCollapsed()));
        jsonWriter.name("metrica_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) scrollableRowDto2.getMetricaLabel());
        jsonWriter.name(Constants.REFERRER_API_META);
        this.nullableAnyAdapter.toJson(jsonWriter, (JsonWriter) scrollableRowDto2.getMeta());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(38, "GeneratedJsonAdapter(ScrollableRowDto)");
    }
}
