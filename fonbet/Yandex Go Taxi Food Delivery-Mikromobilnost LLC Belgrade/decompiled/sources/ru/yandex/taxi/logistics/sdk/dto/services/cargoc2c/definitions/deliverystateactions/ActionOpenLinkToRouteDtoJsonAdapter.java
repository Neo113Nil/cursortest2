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

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionOpenLinkToRouteDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionOpenLinkToRouteDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/DialogDto;", "nullableDialogDtoAdapter", "", "booleanAdapter", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ActionOpenLinkToRouteDtoJsonAdapter extends JsonAdapter<ActionOpenLinkToRouteDto> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<ActionOpenLinkToRouteDto> constructorRef;
    private final JsonAdapter<DialogDto> nullableDialogDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("title", "image_tag", "dialog", "url", "should_authorize", "metrica_label");
    private final JsonAdapter<String> stringAdapter;

    public ActionOpenLinkToRouteDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.nullableDialogDtoAdapter = moshi.adapter(DialogDto.class, emptySet, "dialog");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "shouldAuthorize");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "metricaLabel");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ActionOpenLinkToRouteDto fromJson(JsonReader jsonReader) {
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        DialogDto dialogDto = null;
        Boolean bool2 = bool;
        String str = null;
        String str2 = null;
        String str3 = null;
        int i = -1;
        String str4 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    break;
                case 1:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("imageTag", "image_tag", jsonReader);
                    }
                    break;
                case 2:
                    dialogDto = this.nullableDialogDtoAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    str4 = this.stringAdapter.fromJson(jsonReader);
                    if (str4 == null) {
                        throw Util.unexpectedNull("url", "url", jsonReader);
                    }
                    break;
                case 4:
                    bool2 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool2 == null) {
                        throw Util.unexpectedNull("shouldAuthorize", "should_authorize", jsonReader);
                    }
                    i = -17;
                    break;
                case 5:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -17) {
            if (str2 == null) {
                throw Util.missingProperty("title", "title", jsonReader);
            }
            if (str == null) {
                throw Util.missingProperty("imageTag", "image_tag", jsonReader);
            }
            if (str4 != null) {
                return new ActionOpenLinkToRouteDto(str2, str, dialogDto, str4, bool2.booleanValue(), str3);
            }
            throw Util.missingProperty("url", "url", jsonReader);
        }
        String str5 = str2;
        Constructor<ActionOpenLinkToRouteDto> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ActionOpenLinkToRouteDto.class.getDeclaredConstructor(String.class, String.class, DialogDto.class, String.class, Boolean.TYPE, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        Constructor<ActionOpenLinkToRouteDto> constructor2 = constructor;
        if (str5 == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (str == null) {
            throw Util.missingProperty("imageTag", "image_tag", jsonReader);
        }
        if (str4 == null) {
            throw Util.missingProperty("url", "url", jsonReader);
        }
        return constructor2.newInstance(str5, str, dialogDto, str4, bool2, str3, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ActionOpenLinkToRouteDto actionOpenLinkToRouteDto) {
        ActionOpenLinkToRouteDto actionOpenLinkToRouteDto2 = actionOpenLinkToRouteDto;
        if (actionOpenLinkToRouteDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) actionOpenLinkToRouteDto2.getTitle());
        jsonWriter.name("image_tag");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) actionOpenLinkToRouteDto2.getImageTag());
        jsonWriter.name("dialog");
        this.nullableDialogDtoAdapter.toJson(jsonWriter, (JsonWriter) actionOpenLinkToRouteDto2.getDialog());
        jsonWriter.name("url");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) actionOpenLinkToRouteDto2.getUrl());
        jsonWriter.name("should_authorize");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(actionOpenLinkToRouteDto2.getShouldAuthorize()));
        jsonWriter.name("metrica_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) actionOpenLinkToRouteDto2.getMetricaLabel());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(46, "GeneratedJsonAdapter(ActionOpenLinkToRouteDto)");
    }
}
