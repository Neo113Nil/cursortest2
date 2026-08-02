package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions;

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
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.SelectDueActionDto;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/SelectDueActionDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/SelectDueActionDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/DueButtonsConfigDto;", "nullableDueButtonsConfigDtoAdapter", "", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/SelectDueActionDto$SlotsDto;", "listOfSlotsDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/SelectDueActionDto$DescriptionDto;", "descriptionDtoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SelectDueActionDtoJsonAdapter extends JsonAdapter<SelectDueActionDto> {
    private volatile Constructor<SelectDueActionDto> constructorRef;
    private final JsonAdapter<SelectDueActionDto.DescriptionDto> descriptionDtoAdapter;
    private final JsonAdapter<List<SelectDueActionDto.SlotsDto>> listOfSlotsDtoAdapter;
    private final JsonAdapter<DueButtonsConfigDto> nullableDueButtonsConfigDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("form_state_key", "title", "subtitle", "metrica_label", "buttons_config", "slots", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
    private final JsonAdapter<String> stringAdapter;

    public SelectDueActionDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "formStateKey");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "subtitle");
        this.nullableDueButtonsConfigDtoAdapter = moshi.adapter(DueButtonsConfigDto.class, emptySet, "buttonsConfig");
        this.listOfSlotsDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, SelectDueActionDto.SlotsDto.class), emptySet, "slots");
        this.descriptionDtoAdapter = moshi.adapter(SelectDueActionDto.DescriptionDto.class, emptySet, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SelectDueActionDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        DueButtonsConfigDto dueButtonsConfigDto = null;
        List<SelectDueActionDto.SlotsDto> list = null;
        SelectDueActionDto.DescriptionDto descriptionDto = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("formStateKey", "form_state_key", jsonReader);
                    }
                    i = -2;
                    break;
                case 1:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    break;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    dueButtonsConfigDto = this.nullableDueButtonsConfigDtoAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    list = this.listOfSlotsDtoAdapter.fromJson(jsonReader);
                    if (list == null) {
                        throw Util.unexpectedNull("slots", "slots", jsonReader);
                    }
                    break;
                case 6:
                    descriptionDto = this.descriptionDtoAdapter.fromJson(jsonReader);
                    if (descriptionDto == null) {
                        throw Util.unexpectedNull(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, jsonReader);
                    }
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -2) {
            SelectDueActionDto.DescriptionDto descriptionDto2 = descriptionDto;
            List<SelectDueActionDto.SlotsDto> list2 = list;
            DueButtonsConfigDto dueButtonsConfigDto2 = dueButtonsConfigDto;
            String str5 = str4;
            String str6 = str3;
            String str7 = str2;
            String str8 = str;
            if (str7 == null) {
                throw Util.missingProperty("title", "title", jsonReader);
            }
            if (list2 == null) {
                throw Util.missingProperty("slots", "slots", jsonReader);
            }
            if (descriptionDto2 != null) {
                return new SelectDueActionDto(str8, str7, str6, str5, dueButtonsConfigDto2, list2, descriptionDto2);
            }
            throw Util.missingProperty(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, jsonReader);
        }
        SelectDueActionDto.DescriptionDto descriptionDto3 = descriptionDto;
        List<SelectDueActionDto.SlotsDto> list3 = list;
        DueButtonsConfigDto dueButtonsConfigDto3 = dueButtonsConfigDto;
        String str9 = str4;
        String str10 = str3;
        String str11 = str2;
        String str12 = str;
        Constructor<SelectDueActionDto> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = SelectDueActionDto.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, DueButtonsConfigDto.class, List.class, SelectDueActionDto.DescriptionDto.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (str11 == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (list3 == null) {
            throw Util.missingProperty("slots", "slots", jsonReader);
        }
        if (descriptionDto3 != null) {
            return constructor.newInstance(str12, str11, str10, str9, dueButtonsConfigDto3, list3, descriptionDto3, Integer.valueOf(i), null);
        }
        throw Util.missingProperty(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SelectDueActionDto selectDueActionDto) {
        SelectDueActionDto selectDueActionDto2 = selectDueActionDto;
        if (selectDueActionDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("form_state_key");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) selectDueActionDto2.getFormStateKey());
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) selectDueActionDto2.getTitle());
        jsonWriter.name("subtitle");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) selectDueActionDto2.getSubtitle());
        jsonWriter.name("metrica_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) selectDueActionDto2.getMetricaLabel());
        jsonWriter.name("buttons_config");
        this.nullableDueButtonsConfigDtoAdapter.toJson(jsonWriter, (JsonWriter) selectDueActionDto2.getButtonsConfig());
        jsonWriter.name("slots");
        this.listOfSlotsDtoAdapter.toJson(jsonWriter, (JsonWriter) selectDueActionDto2.getSlots());
        jsonWriter.name(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.descriptionDtoAdapter.toJson(jsonWriter, (JsonWriter) selectDueActionDto2.getDescription());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(40, "GeneratedJsonAdapter(SelectDueActionDto)");
    }
}
