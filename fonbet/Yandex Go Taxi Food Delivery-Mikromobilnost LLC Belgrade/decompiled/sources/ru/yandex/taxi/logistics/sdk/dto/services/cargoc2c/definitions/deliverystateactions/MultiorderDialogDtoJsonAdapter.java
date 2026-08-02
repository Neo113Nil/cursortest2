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

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/MultiorderDialogDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/MultiorderDialogDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/DialogButtonDto;", "dialogButtonDtoAdapter", "nullableDialogButtonDtoAdapter", "", "booleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MultiorderDialogDtoJsonAdapter extends JsonAdapter<MultiorderDialogDto> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<MultiorderDialogDto> constructorRef;
    private final JsonAdapter<DialogButtonDto> dialogButtonDtoAdapter;
    private final JsonAdapter<DialogButtonDto> nullableDialogButtonDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("title", "text", "primary_button", "secondary_button", "shimmering", "header_icon_image_tag");
    private final JsonAdapter<String> stringAdapter;

    public MultiorderDialogDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "text");
        this.dialogButtonDtoAdapter = moshi.adapter(DialogButtonDto.class, emptySet, "primaryButton");
        this.nullableDialogButtonDtoAdapter = moshi.adapter(DialogButtonDto.class, emptySet, "secondaryButton");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "shimmering");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final MultiorderDialogDto fromJson(JsonReader jsonReader) {
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        DialogButtonDto dialogButtonDto = null;
        Boolean bool2 = bool;
        String str = null;
        String str2 = null;
        String str3 = null;
        int i = -1;
        DialogButtonDto dialogButtonDto2 = null;
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
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    dialogButtonDto = this.dialogButtonDtoAdapter.fromJson(jsonReader);
                    if (dialogButtonDto == null) {
                        throw Util.unexpectedNull("primaryButton", "primary_button", jsonReader);
                    }
                    break;
                case 3:
                    dialogButtonDto2 = this.nullableDialogButtonDtoAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    bool2 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool2 == null) {
                        throw Util.unexpectedNull("shimmering", "shimmering", jsonReader);
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
            if (dialogButtonDto != null) {
                return new MultiorderDialogDto(str2, str, dialogButtonDto, dialogButtonDto2, bool2.booleanValue(), str3);
            }
            throw Util.missingProperty("primaryButton", "primary_button", jsonReader);
        }
        String str4 = str2;
        Constructor<MultiorderDialogDto> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = MultiorderDialogDto.class.getDeclaredConstructor(String.class, String.class, DialogButtonDto.class, DialogButtonDto.class, Boolean.TYPE, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        Constructor<MultiorderDialogDto> constructor2 = constructor;
        if (str4 == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (dialogButtonDto == null) {
            throw Util.missingProperty("primaryButton", "primary_button", jsonReader);
        }
        return constructor2.newInstance(str4, str, dialogButtonDto, dialogButtonDto2, bool2, str3, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, MultiorderDialogDto multiorderDialogDto) {
        MultiorderDialogDto multiorderDialogDto2 = multiorderDialogDto;
        if (multiorderDialogDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) multiorderDialogDto2.getTitle());
        jsonWriter.name("text");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) multiorderDialogDto2.getText());
        jsonWriter.name("primary_button");
        this.dialogButtonDtoAdapter.toJson(jsonWriter, (JsonWriter) multiorderDialogDto2.getPrimaryButton());
        jsonWriter.name("secondary_button");
        this.nullableDialogButtonDtoAdapter.toJson(jsonWriter, (JsonWriter) multiorderDialogDto2.getSecondaryButton());
        jsonWriter.name("shimmering");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(multiorderDialogDto2.getShimmering()));
        jsonWriter.name("header_icon_image_tag");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) multiorderDialogDto2.getHeaderIconImageTag());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(41, "GeneratedJsonAdapter(MultiorderDialogDto)");
    }
}
