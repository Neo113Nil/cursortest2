package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.form;

import com.adjust.sdk.Constants;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.SectionDto;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\"\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\"\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\fR\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/FormLayoutDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/FormLayoutDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SectionDto;", "nullableSectionDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "listOfSectionDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/ScrollTagDto;", "nullableListOfScrollTagDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/PopupDto;", "nullableListOfPopupDtoAdapter", "", "nullableStringAdapter", "", "intAdapter", "", "nullableAnyAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FormLayoutDtoJsonAdapter extends JsonAdapter<FormLayoutDto> {
    private volatile Constructor<FormLayoutDto> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<List<SectionDto>> listOfSectionDtoAdapter;
    private final JsonAdapter<Object> nullableAnyAdapter;
    private final JsonAdapter<List<PopupDto>> nullableListOfPopupDtoAdapter;
    private final JsonAdapter<List<ScrollTagDto>> nullableListOfScrollTagDtoAdapter;
    private final JsonAdapter<SectionDto> nullableSectionDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("header_section", "sections", "bottom_section", "scroll_tags", "popups", "background_color", "spacing_height", "metrica_label", Constants.REFERRER_API_META);

    public FormLayoutDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableSectionDtoAdapter = moshi.adapter(SectionDto.class, emptySet, "headerSection");
        this.listOfSectionDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, SectionDto.class), emptySet, "sections");
        this.nullableListOfScrollTagDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, ScrollTagDto.class), emptySet, "scrollTags");
        this.nullableListOfPopupDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, PopupDto.class), emptySet, "popups");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, UrbanAdsBottomSheetFragment.BACKGROUND_COLOR);
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "spacingHeight");
        this.nullableAnyAdapter = moshi.adapter(Object.class, emptySet, Constants.REFERRER_API_META);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final FormLayoutDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        SectionDto sectionDto = null;
        Integer num = 0;
        List<SectionDto> list = null;
        SectionDto sectionDto2 = null;
        String str = null;
        String str2 = null;
        List<PopupDto> list2 = null;
        Object obj = null;
        int i = -1;
        List<ScrollTagDto> list3 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    sectionDto2 = this.nullableSectionDtoAdapter.fromJson(jsonReader);
                    break;
                case 1:
                    list = this.listOfSectionDtoAdapter.fromJson(jsonReader);
                    if (list == null) {
                        throw Util.unexpectedNull("sections", "sections", jsonReader);
                    }
                    break;
                case 2:
                    sectionDto = this.nullableSectionDtoAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    list3 = this.nullableListOfScrollTagDtoAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    list2 = this.nullableListOfPopupDtoAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    num = this.intAdapter.fromJson(jsonReader);
                    if (num == null) {
                        throw Util.unexpectedNull("spacingHeight", "spacing_height", jsonReader);
                    }
                    i = -65;
                    break;
                case 7:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 8:
                    obj = this.nullableAnyAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -65) {
            if (list == null) {
                throw Util.missingProperty("sections", "sections", jsonReader);
            }
            return new FormLayoutDto(sectionDto2, list, sectionDto, list3, list2, str, num.intValue(), str2, obj);
        }
        Constructor<FormLayoutDto> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = Util.DEFAULT_CONSTRUCTOR_MARKER;
            Class cls2 = Integer.TYPE;
            constructor = FormLayoutDto.class.getDeclaredConstructor(SectionDto.class, List.class, SectionDto.class, List.class, List.class, String.class, cls2, String.class, Object.class, cls2, cls);
            this.constructorRef = constructor;
        }
        Constructor<FormLayoutDto> constructor2 = constructor;
        if (list == null) {
            throw Util.missingProperty("sections", "sections", jsonReader);
        }
        return constructor2.newInstance(sectionDto2, list, sectionDto, list3, list2, str, num, str2, obj, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, FormLayoutDto formLayoutDto) {
        FormLayoutDto formLayoutDto2 = formLayoutDto;
        if (formLayoutDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("header_section");
        this.nullableSectionDtoAdapter.toJson(jsonWriter, (JsonWriter) formLayoutDto2.getHeaderSection());
        jsonWriter.name("sections");
        this.listOfSectionDtoAdapter.toJson(jsonWriter, (JsonWriter) formLayoutDto2.getSections());
        jsonWriter.name("bottom_section");
        this.nullableSectionDtoAdapter.toJson(jsonWriter, (JsonWriter) formLayoutDto2.getBottomSection());
        jsonWriter.name("scroll_tags");
        this.nullableListOfScrollTagDtoAdapter.toJson(jsonWriter, (JsonWriter) formLayoutDto2.getScrollTags());
        jsonWriter.name("popups");
        this.nullableListOfPopupDtoAdapter.toJson(jsonWriter, (JsonWriter) formLayoutDto2.getPopups());
        jsonWriter.name("background_color");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) formLayoutDto2.getBackgroundColor());
        jsonWriter.name("spacing_height");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(formLayoutDto2.getSpacingHeight()));
        jsonWriter.name("metrica_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) formLayoutDto2.getMetricaLabel());
        jsonWriter.name(Constants.REFERRER_API_META);
        this.nullableAnyAdapter.toJson(jsonWriter, (JsonWriter) formLayoutDto2.getMeta());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(35, "GeneratedJsonAdapter(FormLayoutDto)");
    }
}
