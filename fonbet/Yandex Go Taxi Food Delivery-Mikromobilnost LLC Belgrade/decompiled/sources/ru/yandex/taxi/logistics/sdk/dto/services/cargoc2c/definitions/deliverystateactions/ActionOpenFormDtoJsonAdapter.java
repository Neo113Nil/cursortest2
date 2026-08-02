package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions;

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
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionOpenFormDto;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\fR\u001e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionOpenFormDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionOpenFormDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/CardModeDto;", "cardModeDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionOpenFormDto$TopButtonDto;", "topButtonDtoAdapter", "", "nullableAnyAdapter", "", "booleanAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionGuardPolicyDto;", "nullableActionGuardPolicyDtoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ActionOpenFormDtoJsonAdapter extends JsonAdapter<ActionOpenFormDto> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<CardModeDto> cardModeDtoAdapter;
    private volatile Constructor<ActionOpenFormDto> constructorRef;
    private final JsonAdapter<ActionGuardPolicyDto> nullableActionGuardPolicyDtoAdapter;
    private final JsonAdapter<Object> nullableAnyAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("mode", "scenario", "card_mode", "top_button", "client_state", "async_task_id", "is_cache_state", "title", "image_tag", "badge_text", "metrica_label", "action_guard_policy");
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<ActionOpenFormDto.TopButtonDto> topButtonDtoAdapter;

    public ActionOpenFormDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "mode");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "scenario");
        this.cardModeDtoAdapter = moshi.adapter(CardModeDto.class, emptySet, "cardMode");
        this.topButtonDtoAdapter = moshi.adapter(ActionOpenFormDto.TopButtonDto.class, emptySet, "topButton");
        this.nullableAnyAdapter = moshi.adapter(Object.class, emptySet, "clientState");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "isCacheState");
        this.nullableActionGuardPolicyDtoAdapter = moshi.adapter(ActionGuardPolicyDto.class, emptySet, "actionGuardPolicy");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ActionOpenFormDto fromJson(JsonReader jsonReader) {
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        int i = -1;
        Boolean bool2 = bool;
        String str = null;
        String str2 = null;
        CardModeDto cardModeDto = null;
        ActionOpenFormDto.TopButtonDto topButtonDto = null;
        Object obj = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        ActionGuardPolicyDto actionGuardPolicyDto = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("mode", "mode", jsonReader);
                    }
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    cardModeDto = this.cardModeDtoAdapter.fromJson(jsonReader);
                    if (cardModeDto == null) {
                        throw Util.unexpectedNull("cardMode", "card_mode", jsonReader);
                    }
                    break;
                case 3:
                    topButtonDto = this.topButtonDtoAdapter.fromJson(jsonReader);
                    if (topButtonDto == null) {
                        throw Util.unexpectedNull("topButton", "top_button", jsonReader);
                    }
                    i &= -9;
                    break;
                case 4:
                    obj = this.nullableAnyAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    bool2 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool2 == null) {
                        throw Util.unexpectedNull("isCacheState", "is_cache_state", jsonReader);
                    }
                    i &= -65;
                    break;
                case 7:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 8:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 9:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 10:
                    str7 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 11:
                    actionGuardPolicyDto = this.nullableActionGuardPolicyDtoAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -73) {
            if (str == null) {
                throw Util.missingProperty("mode", "mode", jsonReader);
            }
            if (cardModeDto == null) {
                throw Util.missingProperty("cardMode", "card_mode", jsonReader);
            }
            return new ActionOpenFormDto(str, str2, cardModeDto, topButtonDto, obj, str3, bool2.booleanValue(), str4, str5, str6, str7, actionGuardPolicyDto);
        }
        Constructor<ActionOpenFormDto> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ActionOpenFormDto.class.getDeclaredConstructor(String.class, String.class, CardModeDto.class, ActionOpenFormDto.TopButtonDto.class, Object.class, String.class, Boolean.TYPE, String.class, String.class, String.class, String.class, ActionGuardPolicyDto.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (str == null) {
            throw Util.missingProperty("mode", "mode", jsonReader);
        }
        if (cardModeDto == null) {
            throw Util.missingProperty("cardMode", "card_mode", jsonReader);
        }
        return constructor.newInstance(str, str2, cardModeDto, topButtonDto, obj, str3, bool2, str4, str5, str6, str7, actionGuardPolicyDto, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ActionOpenFormDto actionOpenFormDto) {
        ActionOpenFormDto actionOpenFormDto2 = actionOpenFormDto;
        if (actionOpenFormDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("mode");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) actionOpenFormDto2.getMode());
        jsonWriter.name("scenario");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) actionOpenFormDto2.getScenario());
        jsonWriter.name("card_mode");
        this.cardModeDtoAdapter.toJson(jsonWriter, (JsonWriter) actionOpenFormDto2.getCardMode());
        jsonWriter.name("top_button");
        this.topButtonDtoAdapter.toJson(jsonWriter, (JsonWriter) actionOpenFormDto2.getTopButton());
        jsonWriter.name("client_state");
        this.nullableAnyAdapter.toJson(jsonWriter, (JsonWriter) actionOpenFormDto2.getClientState());
        jsonWriter.name("async_task_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) actionOpenFormDto2.getAsyncTaskId());
        jsonWriter.name("is_cache_state");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(actionOpenFormDto2.isCacheState()));
        jsonWriter.name("title");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) actionOpenFormDto2.getTitle());
        jsonWriter.name("image_tag");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) actionOpenFormDto2.getImageTag());
        jsonWriter.name("badge_text");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) actionOpenFormDto2.getBadgeText());
        jsonWriter.name("metrica_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) actionOpenFormDto2.getMetricaLabel());
        jsonWriter.name("action_guard_policy");
        this.nullableActionGuardPolicyDtoAdapter.toJson(jsonWriter, (JsonWriter) actionOpenFormDto2.getActionGuardPolicy());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(39, "GeneratedJsonAdapter(ActionOpenFormDto)");
    }
}
