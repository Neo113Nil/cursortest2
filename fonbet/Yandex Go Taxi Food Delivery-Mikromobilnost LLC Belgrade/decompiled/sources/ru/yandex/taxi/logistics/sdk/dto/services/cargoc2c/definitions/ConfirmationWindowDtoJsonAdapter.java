package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/ConfirmationWindowDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/ConfirmationWindowDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/BaseWindowSettingsDto;", "baseWindowSettingsDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableBaseWindowSettingsDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ConfirmationWindowDtoJsonAdapter extends JsonAdapter<ConfirmationWindowDto> {
    private final JsonAdapter<BaseWindowSettingsDto> baseWindowSettingsDtoAdapter;
    private final JsonAdapter<BaseWindowSettingsDto> nullableBaseWindowSettingsDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("main_window", "alert_window");

    public ConfirmationWindowDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.baseWindowSettingsDtoAdapter = moshi.adapter(BaseWindowSettingsDto.class, emptySet, "mainWindow");
        this.nullableBaseWindowSettingsDtoAdapter = moshi.adapter(BaseWindowSettingsDto.class, emptySet, "alertWindow");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ConfirmationWindowDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        BaseWindowSettingsDto baseWindowSettingsDto = null;
        BaseWindowSettingsDto baseWindowSettingsDto2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                baseWindowSettingsDto = this.baseWindowSettingsDtoAdapter.fromJson(jsonReader);
                if (baseWindowSettingsDto == null) {
                    throw Util.unexpectedNull("mainWindow", "main_window", jsonReader);
                }
            } else if (selectName == 1) {
                baseWindowSettingsDto2 = this.nullableBaseWindowSettingsDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (baseWindowSettingsDto != null) {
            return new ConfirmationWindowDto(baseWindowSettingsDto, baseWindowSettingsDto2);
        }
        throw Util.missingProperty("mainWindow", "main_window", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ConfirmationWindowDto confirmationWindowDto) {
        ConfirmationWindowDto confirmationWindowDto2 = confirmationWindowDto;
        if (confirmationWindowDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("main_window");
        this.baseWindowSettingsDtoAdapter.toJson(jsonWriter, (JsonWriter) confirmationWindowDto2.getMainWindow());
        jsonWriter.name("alert_window");
        this.nullableBaseWindowSettingsDtoAdapter.toJson(jsonWriter, (JsonWriter) confirmationWindowDto2.getAlertWindow());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(43, "GeneratedJsonAdapter(ConfirmationWindowDto)");
    }
}
