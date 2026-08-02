package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.form;

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
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.form.TextHintPopupDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.ShowPolicyDto;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/TextHintPopupDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/TextHintPopupDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "attributedTextDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableStringAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/TextHintPopupDto$ArrowDirectionDto;", "arrowDirectionDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/ShowPolicyDto;", "nullableShowPolicyDtoAdapter", "", "booleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TextHintPopupDtoJsonAdapter extends JsonAdapter<TextHintPopupDto> {
    private final JsonAdapter<TextHintPopupDto.ArrowDirectionDto> arrowDirectionDtoAdapter;
    private final JsonAdapter<AttributedTextDto> attributedTextDtoAdapter;
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<TextHintPopupDto> constructorRef;
    private final JsonAdapter<ShowPolicyDto> nullableShowPolicyDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("text", "background_color", "arrow_direction", "show_policy", "is_dismissable");

    public TextHintPopupDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.attributedTextDtoAdapter = moshi.adapter(AttributedTextDto.class, emptySet, "text");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, UrbanAdsBottomSheetFragment.BACKGROUND_COLOR);
        this.arrowDirectionDtoAdapter = moshi.adapter(TextHintPopupDto.ArrowDirectionDto.class, emptySet, "arrowDirection");
        this.nullableShowPolicyDtoAdapter = moshi.adapter(ShowPolicyDto.class, emptySet, "showPolicy");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "isDismissable");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TextHintPopupDto fromJson(JsonReader jsonReader) {
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        Boolean bool2 = bool;
        AttributedTextDto attributedTextDto = null;
        String str = null;
        TextHintPopupDto.ArrowDirectionDto arrowDirectionDto = null;
        ShowPolicyDto showPolicyDto = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                attributedTextDto = this.attributedTextDtoAdapter.fromJson(jsonReader);
                if (attributedTextDto == null) {
                    throw Util.unexpectedNull("text", "text", jsonReader);
                }
            } else if (selectName == 1) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                arrowDirectionDto = this.arrowDirectionDtoAdapter.fromJson(jsonReader);
                if (arrowDirectionDto == null) {
                    throw Util.unexpectedNull("arrowDirection", "arrow_direction", jsonReader);
                }
            } else if (selectName == 3) {
                showPolicyDto = this.nullableShowPolicyDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 4) {
                bool2 = this.booleanAdapter.fromJson(jsonReader);
                if (bool2 == null) {
                    throw Util.unexpectedNull("isDismissable", "is_dismissable", jsonReader);
                }
                i = -17;
            } else {
                continue;
            }
        }
        jsonReader.endObject();
        if (i == -17) {
            if (attributedTextDto == null) {
                throw Util.missingProperty("text", "text", jsonReader);
            }
            if (arrowDirectionDto == null) {
                throw Util.missingProperty("arrowDirection", "arrow_direction", jsonReader);
            }
            return new TextHintPopupDto(attributedTextDto, str, arrowDirectionDto, showPolicyDto, bool2.booleanValue());
        }
        Constructor<TextHintPopupDto> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = TextHintPopupDto.class.getDeclaredConstructor(AttributedTextDto.class, String.class, TextHintPopupDto.ArrowDirectionDto.class, ShowPolicyDto.class, Boolean.TYPE, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (attributedTextDto == null) {
            throw Util.missingProperty("text", "text", jsonReader);
        }
        if (arrowDirectionDto == null) {
            throw Util.missingProperty("arrowDirection", "arrow_direction", jsonReader);
        }
        return constructor.newInstance(attributedTextDto, str, arrowDirectionDto, showPolicyDto, bool2, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TextHintPopupDto textHintPopupDto) {
        TextHintPopupDto textHintPopupDto2 = textHintPopupDto;
        if (textHintPopupDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("text");
        this.attributedTextDtoAdapter.toJson(jsonWriter, (JsonWriter) textHintPopupDto2.getText());
        jsonWriter.name("background_color");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) textHintPopupDto2.getBackgroundColor());
        jsonWriter.name("arrow_direction");
        this.arrowDirectionDtoAdapter.toJson(jsonWriter, (JsonWriter) textHintPopupDto2.getArrowDirection());
        jsonWriter.name("show_policy");
        this.nullableShowPolicyDtoAdapter.toJson(jsonWriter, (JsonWriter) textHintPopupDto2.getShowPolicy());
        jsonWriter.name("is_dismissable");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(textHintPopupDto2.isDismissable()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(38, "GeneratedJsonAdapter(TextHintPopupDto)");
    }
}
