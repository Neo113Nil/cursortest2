package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/AccentStateButtonDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/AccentStateButtonDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/AccentButtonActionDto;", "accentButtonActionDtoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AccentStateButtonDtoJsonAdapter extends JsonAdapter<AccentStateButtonDto> {
    private final JsonAdapter<AccentButtonActionDto> accentButtonActionDtoAdapter;
    private volatile Constructor<AccentStateButtonDto> constructorRef;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("background_color", "title", "title_color", "subtitle", "subtitle_color", "lead_icon_tag", "action", "metrica_label");
    private final JsonAdapter<String> stringAdapter;

    public AccentStateButtonDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, UrbanAdsBottomSheetFragment.BACKGROUND_COLOR);
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "subtitle");
        this.accentButtonActionDtoAdapter = moshi.adapter(AccentButtonActionDto.class, emptySet, "action");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final AccentStateButtonDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        AccentButtonActionDto accentButtonActionDto = null;
        String str7 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull(UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "background_color", jsonReader);
                    }
                    i &= -2;
                    break;
                case 1:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    break;
                case 2:
                    str3 = this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("titleColor", "title_color", jsonReader);
                    }
                    i &= -5;
                    break;
                case 3:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    str5 = this.stringAdapter.fromJson(jsonReader);
                    if (str5 == null) {
                        throw Util.unexpectedNull("subtitleColor", "subtitle_color", jsonReader);
                    }
                    i &= -17;
                    break;
                case 5:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    accentButtonActionDto = this.accentButtonActionDtoAdapter.fromJson(jsonReader);
                    if (accentButtonActionDto == null) {
                        throw Util.unexpectedNull("action", "action", jsonReader);
                    }
                    break;
                case 7:
                    str7 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -22) {
            String str8 = str7;
            AccentButtonActionDto accentButtonActionDto2 = accentButtonActionDto;
            String str9 = str6;
            String str10 = str5;
            String str11 = str4;
            String str12 = str3;
            String str13 = str2;
            String str14 = str;
            if (str13 == null) {
                throw Util.missingProperty("title", "title", jsonReader);
            }
            if (accentButtonActionDto2 != null) {
                return new AccentStateButtonDto(str14, str13, str12, str11, str10, str9, accentButtonActionDto2, str8);
            }
            throw Util.missingProperty("action", "action", jsonReader);
        }
        String str15 = str7;
        AccentButtonActionDto accentButtonActionDto3 = accentButtonActionDto;
        String str16 = str6;
        String str17 = str5;
        String str18 = str4;
        String str19 = str3;
        String str20 = str2;
        String str21 = str;
        Constructor<AccentStateButtonDto> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = AccentStateButtonDto.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, String.class, AccentButtonActionDto.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        Constructor<AccentStateButtonDto> constructor2 = constructor;
        if (str20 == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (accentButtonActionDto3 != null) {
            return constructor2.newInstance(str21, str20, str19, str18, str17, str16, accentButtonActionDto3, str15, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("action", "action", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, AccentStateButtonDto accentStateButtonDto) {
        AccentStateButtonDto accentStateButtonDto2 = accentStateButtonDto;
        if (accentStateButtonDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("background_color");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) accentStateButtonDto2.getBackgroundColor());
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) accentStateButtonDto2.getTitle());
        jsonWriter.name("title_color");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) accentStateButtonDto2.getTitleColor());
        jsonWriter.name("subtitle");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) accentStateButtonDto2.getSubtitle());
        jsonWriter.name("subtitle_color");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) accentStateButtonDto2.getSubtitleColor());
        jsonWriter.name("lead_icon_tag");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) accentStateButtonDto2.getLeadIconTag());
        jsonWriter.name("action");
        this.accentButtonActionDtoAdapter.toJson(jsonWriter, (JsonWriter) accentStateButtonDto2.getAction());
        jsonWriter.name("metrica_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) accentStateButtonDto2.getMetricaLabel());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(42, "GeneratedJsonAdapter(AccentStateButtonDto)");
    }
}
