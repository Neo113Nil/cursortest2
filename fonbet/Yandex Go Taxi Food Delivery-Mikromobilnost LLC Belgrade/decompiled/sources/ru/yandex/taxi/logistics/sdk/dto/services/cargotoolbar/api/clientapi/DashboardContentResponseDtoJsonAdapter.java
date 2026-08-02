package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.api.clientapi;

import com.adjust.sdk.Constants;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.StickyWidgetDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.SectionDto;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\"\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\r¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/api/clientapi/DashboardContentResponseDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/api/clientapi/DashboardContentResponseDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/SectionDto;", "listOfSectionDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableSectionDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/StickyWidgetDto;", "nullableListOfStickyWidgetDtoAdapter", "", "nullableAnyAdapter", "", "nullableStringAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DashboardContentResponseDtoJsonAdapter extends JsonAdapter<DashboardContentResponseDto> {
    private final JsonAdapter<List<SectionDto>> listOfSectionDtoAdapter;
    private final JsonAdapter<Object> nullableAnyAdapter;
    private final JsonAdapter<List<StickyWidgetDto>> nullableListOfStickyWidgetDtoAdapter;
    private final JsonAdapter<SectionDto> nullableSectionDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("sections", "header_section", "sticky_widgets", Constants.REFERRER_API_META, "metrica_label");

    public DashboardContentResponseDtoJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(List.class, SectionDto.class);
        EmptySet emptySet = EmptySet.a;
        this.listOfSectionDtoAdapter = moshi.adapter(newParameterizedType, emptySet, "sections");
        this.nullableSectionDtoAdapter = moshi.adapter(SectionDto.class, emptySet, "headerSection");
        this.nullableListOfStickyWidgetDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, StickyWidgetDto.class), emptySet, "stickyWidgets");
        this.nullableAnyAdapter = moshi.adapter(Object.class, emptySet, Constants.REFERRER_API_META);
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "metricaLabel");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DashboardContentResponseDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        List<SectionDto> list = null;
        SectionDto sectionDto = null;
        List<StickyWidgetDto> list2 = null;
        Object obj = null;
        String str = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                list = this.listOfSectionDtoAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("sections", "sections", jsonReader);
                }
            } else if (selectName == 1) {
                sectionDto = this.nullableSectionDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                list2 = this.nullableListOfStickyWidgetDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                obj = this.nullableAnyAdapter.fromJson(jsonReader);
            } else if (selectName == 4) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (list != null) {
            return new DashboardContentResponseDto(list, sectionDto, list2, obj, str);
        }
        throw Util.missingProperty("sections", "sections", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DashboardContentResponseDto dashboardContentResponseDto) {
        DashboardContentResponseDto dashboardContentResponseDto2 = dashboardContentResponseDto;
        if (dashboardContentResponseDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("sections");
        this.listOfSectionDtoAdapter.toJson(jsonWriter, (JsonWriter) dashboardContentResponseDto2.getSections());
        jsonWriter.name("header_section");
        this.nullableSectionDtoAdapter.toJson(jsonWriter, (JsonWriter) dashboardContentResponseDto2.getHeaderSection());
        jsonWriter.name("sticky_widgets");
        this.nullableListOfStickyWidgetDtoAdapter.toJson(jsonWriter, (JsonWriter) dashboardContentResponseDto2.getStickyWidgets());
        jsonWriter.name(Constants.REFERRER_API_META);
        this.nullableAnyAdapter.toJson(jsonWriter, (JsonWriter) dashboardContentResponseDto2.getMeta());
        jsonWriter.name("metrica_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) dashboardContentResponseDto2.getMetricaLabel());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(49, "GeneratedJsonAdapter(DashboardContentResponseDto)");
    }
}
