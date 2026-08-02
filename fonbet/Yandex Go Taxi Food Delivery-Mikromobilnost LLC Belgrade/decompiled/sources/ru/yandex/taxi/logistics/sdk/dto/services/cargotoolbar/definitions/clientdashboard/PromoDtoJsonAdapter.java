package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard;

import com.adjust.sdk.Constants;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import io.appmetrica.analytics.impl.C0553n3;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.ActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.BackgroundDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.ColorDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.IconDto;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\fR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\fR\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\fR\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\fR\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/PromoDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/PromoDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/StyledTextDto;", "styledTextDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStyledTextDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;", "nullableColorDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/BackgroundDto;", "nullableBackgroundDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/IconDto;", "nullableIconDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto;", "actionDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TrailElementDto;", "nullableTrailElementDtoAdapter", "", "booleanAdapter", "", "nullableStringAdapter", "", "nullableAnyAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PromoDtoJsonAdapter extends JsonAdapter<PromoDto> {
    private final JsonAdapter<ActionDto> actionDtoAdapter;
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<PromoDto> constructorRef;
    private final JsonAdapter<Object> nullableAnyAdapter;
    private final JsonAdapter<BackgroundDto> nullableBackgroundDtoAdapter;
    private final JsonAdapter<ColorDto> nullableColorDtoAdapter;
    private final JsonAdapter<IconDto> nullableIconDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<StyledTextDto> nullableStyledTextDtoAdapter;
    private final JsonAdapter<TrailElementDto> nullableTrailElementDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("title", "subtitle", "text_color", "subtitle_color", C0553n3.g, "lead_icon", "action", "trail_element", "new", "show_when_section_collapsed", "metrica_label", Constants.REFERRER_API_META);
    private final JsonAdapter<StyledTextDto> styledTextDtoAdapter;

    public PromoDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.styledTextDtoAdapter = moshi.adapter(StyledTextDto.class, emptySet, "title");
        this.nullableStyledTextDtoAdapter = moshi.adapter(StyledTextDto.class, emptySet, "subtitle");
        this.nullableColorDtoAdapter = moshi.adapter(ColorDto.class, emptySet, "textColor");
        this.nullableBackgroundDtoAdapter = moshi.adapter(BackgroundDto.class, emptySet, C0553n3.g);
        this.nullableIconDtoAdapter = moshi.adapter(IconDto.class, emptySet, "leadIcon");
        this.actionDtoAdapter = moshi.adapter(ActionDto.class, emptySet, "action");
        this.nullableTrailElementDtoAdapter = moshi.adapter(TrailElementDto.class, emptySet, "trailElement");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "new");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "metricaLabel");
        this.nullableAnyAdapter = moshi.adapter(Object.class, emptySet, Constants.REFERRER_API_META);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PromoDto fromJson(JsonReader jsonReader) {
        StyledTextDto styledTextDto;
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        ColorDto colorDto = null;
        Boolean bool2 = bool;
        Boolean bool3 = bool2;
        StyledTextDto styledTextDto2 = null;
        StyledTextDto styledTextDto3 = null;
        IconDto iconDto = null;
        ActionDto actionDto = null;
        TrailElementDto trailElementDto = null;
        BackgroundDto backgroundDto = null;
        String str = null;
        Object obj = null;
        int i = -1;
        ColorDto colorDto2 = null;
        while (true) {
            StyledTextDto styledTextDto4 = styledTextDto2;
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (i == -769) {
                    if (styledTextDto3 == null) {
                        throw Util.missingProperty("title", "title", jsonReader);
                    }
                    if (actionDto != null) {
                        return new PromoDto(styledTextDto3, styledTextDto4, colorDto, colorDto2, backgroundDto, iconDto, actionDto, trailElementDto, bool2.booleanValue(), bool3.booleanValue(), str, obj);
                    }
                    throw Util.missingProperty("action", "action", jsonReader);
                }
                BackgroundDto backgroundDto2 = backgroundDto;
                StyledTextDto styledTextDto5 = styledTextDto3;
                Constructor<PromoDto> constructor = this.constructorRef;
                if (constructor == null) {
                    Class cls = Integer.TYPE;
                    Class<?> cls2 = Util.DEFAULT_CONSTRUCTOR_MARKER;
                    Class cls3 = Boolean.TYPE;
                    styledTextDto = styledTextDto5;
                    constructor = PromoDto.class.getDeclaredConstructor(StyledTextDto.class, StyledTextDto.class, ColorDto.class, ColorDto.class, BackgroundDto.class, IconDto.class, ActionDto.class, TrailElementDto.class, cls3, cls3, String.class, Object.class, cls, cls2);
                    this.constructorRef = constructor;
                } else {
                    styledTextDto = styledTextDto5;
                }
                Constructor<PromoDto> constructor2 = constructor;
                if (styledTextDto == null) {
                    throw Util.missingProperty("title", "title", jsonReader);
                }
                if (actionDto == null) {
                    throw Util.missingProperty("action", "action", jsonReader);
                }
                return constructor2.newInstance(styledTextDto, styledTextDto4, colorDto, colorDto2, backgroundDto2, iconDto, actionDto, trailElementDto, bool2, bool3, str, obj, Integer.valueOf(i), null);
            }
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    styledTextDto3 = this.styledTextDtoAdapter.fromJson(jsonReader);
                    if (styledTextDto3 == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    break;
                case 1:
                    styledTextDto2 = this.nullableStyledTextDtoAdapter.fromJson(jsonReader);
                    continue;
                case 2:
                    colorDto = this.nullableColorDtoAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    colorDto2 = this.nullableColorDtoAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    backgroundDto = this.nullableBackgroundDtoAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    iconDto = this.nullableIconDtoAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    actionDto = this.actionDtoAdapter.fromJson(jsonReader);
                    if (actionDto == null) {
                        throw Util.unexpectedNull("action", "action", jsonReader);
                    }
                    break;
                case 7:
                    trailElementDto = this.nullableTrailElementDtoAdapter.fromJson(jsonReader);
                    break;
                case 8:
                    bool2 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool2 == null) {
                        throw Util.unexpectedNull("new", "new", jsonReader);
                    }
                    i &= -257;
                    break;
                case 9:
                    bool3 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool3 == null) {
                        throw Util.unexpectedNull("showWhenSectionCollapsed", "show_when_section_collapsed", jsonReader);
                    }
                    i &= -513;
                    break;
                case 10:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 11:
                    obj = this.nullableAnyAdapter.fromJson(jsonReader);
                    break;
            }
            styledTextDto2 = styledTextDto4;
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PromoDto promoDto) {
        PromoDto promoDto2 = promoDto;
        if (promoDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.styledTextDtoAdapter.toJson(jsonWriter, (JsonWriter) promoDto2.getTitle());
        jsonWriter.name("subtitle");
        this.nullableStyledTextDtoAdapter.toJson(jsonWriter, (JsonWriter) promoDto2.getSubtitle());
        jsonWriter.name("text_color");
        this.nullableColorDtoAdapter.toJson(jsonWriter, (JsonWriter) promoDto2.getTextColor());
        jsonWriter.name("subtitle_color");
        this.nullableColorDtoAdapter.toJson(jsonWriter, (JsonWriter) promoDto2.getSubtitleColor());
        jsonWriter.name(C0553n3.g);
        this.nullableBackgroundDtoAdapter.toJson(jsonWriter, (JsonWriter) promoDto2.getBackground());
        jsonWriter.name("lead_icon");
        this.nullableIconDtoAdapter.toJson(jsonWriter, (JsonWriter) promoDto2.getLeadIcon());
        jsonWriter.name("action");
        this.actionDtoAdapter.toJson(jsonWriter, (JsonWriter) promoDto2.getAction());
        jsonWriter.name("trail_element");
        this.nullableTrailElementDtoAdapter.toJson(jsonWriter, (JsonWriter) promoDto2.getTrailElement());
        jsonWriter.name("new");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(promoDto2.getNew()));
        jsonWriter.name("show_when_section_collapsed");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(promoDto2.getShowWhenSectionCollapsed()));
        jsonWriter.name("metrica_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) promoDto2.getMetricaLabel());
        jsonWriter.name(Constants.REFERRER_API_META);
        this.nullableAnyAdapter.toJson(jsonWriter, (JsonWriter) promoDto2.getMeta());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(30, "GeneratedJsonAdapter(PromoDto)");
    }
}
