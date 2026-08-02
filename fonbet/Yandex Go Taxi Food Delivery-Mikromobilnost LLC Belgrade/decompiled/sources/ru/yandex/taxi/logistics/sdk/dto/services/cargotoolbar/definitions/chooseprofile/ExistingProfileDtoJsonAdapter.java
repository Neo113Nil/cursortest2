package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.chooseprofile;

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
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.IconDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.PaymentOptionsDto;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\fR\u001e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/chooseprofile/ExistingProfileDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/chooseprofile/ExistingProfileDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/chooseprofile/ExistingProfileDescriptionDto;", "nullableExistingProfileDescriptionDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/IconDto;", "nullableIconDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/chooseprofile/ChooseProfileScreenActionDto;", "chooseProfileScreenActionDtoAdapter", "nullableStringAdapter", "", "booleanAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/PaymentOptionsDto;", "nullablePaymentOptionsDtoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ExistingProfileDtoJsonAdapter extends JsonAdapter<ExistingProfileDto> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<ChooseProfileScreenActionDto> chooseProfileScreenActionDtoAdapter;
    private volatile Constructor<ExistingProfileDto> constructorRef;
    private final JsonAdapter<ExistingProfileDescriptionDto> nullableExistingProfileDescriptionDtoAdapter;
    private final JsonAdapter<IconDto> nullableIconDtoAdapter;
    private final JsonAdapter<PaymentOptionsDto> nullablePaymentOptionsDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "icon", "action", "corp_client_id", "is_enabled", "payment_options");
    private final JsonAdapter<String> stringAdapter;

    public ExistingProfileDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.nullableExistingProfileDescriptionDtoAdapter = moshi.adapter(ExistingProfileDescriptionDto.class, emptySet, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.nullableIconDtoAdapter = moshi.adapter(IconDto.class, emptySet, "icon");
        this.chooseProfileScreenActionDtoAdapter = moshi.adapter(ChooseProfileScreenActionDto.class, emptySet, "action");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "corpClientId");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "isEnabled");
        this.nullablePaymentOptionsDtoAdapter = moshi.adapter(PaymentOptionsDto.class, emptySet, "paymentOptions");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ExistingProfileDto fromJson(JsonReader jsonReader) {
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        IconDto iconDto = null;
        Boolean bool2 = bool;
        ExistingProfileDescriptionDto existingProfileDescriptionDto = null;
        String str = null;
        PaymentOptionsDto paymentOptionsDto = null;
        String str2 = null;
        int i = -1;
        ChooseProfileScreenActionDto chooseProfileScreenActionDto = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    break;
                case 1:
                    existingProfileDescriptionDto = this.nullableExistingProfileDescriptionDtoAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    iconDto = this.nullableIconDtoAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    chooseProfileScreenActionDto = this.chooseProfileScreenActionDtoAdapter.fromJson(jsonReader);
                    if (chooseProfileScreenActionDto == null) {
                        throw Util.unexpectedNull("action", "action", jsonReader);
                    }
                    break;
                case 4:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    bool2 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool2 == null) {
                        throw Util.unexpectedNull("isEnabled", "is_enabled", jsonReader);
                    }
                    i = -33;
                    break;
                case 6:
                    paymentOptionsDto = this.nullablePaymentOptionsDtoAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -33) {
            if (str == null) {
                throw Util.missingProperty("title", "title", jsonReader);
            }
            if (chooseProfileScreenActionDto == null) {
                throw Util.missingProperty("action", "action", jsonReader);
            }
            return new ExistingProfileDto(str, existingProfileDescriptionDto, iconDto, chooseProfileScreenActionDto, str2, bool2.booleanValue(), paymentOptionsDto);
        }
        Constructor<ExistingProfileDto> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ExistingProfileDto.class.getDeclaredConstructor(String.class, ExistingProfileDescriptionDto.class, IconDto.class, ChooseProfileScreenActionDto.class, String.class, Boolean.TYPE, PaymentOptionsDto.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        Constructor<ExistingProfileDto> constructor2 = constructor;
        if (str == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (chooseProfileScreenActionDto == null) {
            throw Util.missingProperty("action", "action", jsonReader);
        }
        return constructor2.newInstance(str, existingProfileDescriptionDto, iconDto, chooseProfileScreenActionDto, str2, bool2, paymentOptionsDto, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ExistingProfileDto existingProfileDto) {
        ExistingProfileDto existingProfileDto2 = existingProfileDto;
        if (existingProfileDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) existingProfileDto2.getTitle());
        jsonWriter.name(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.nullableExistingProfileDescriptionDtoAdapter.toJson(jsonWriter, (JsonWriter) existingProfileDto2.getDescription());
        jsonWriter.name("icon");
        this.nullableIconDtoAdapter.toJson(jsonWriter, (JsonWriter) existingProfileDto2.getIcon());
        jsonWriter.name("action");
        this.chooseProfileScreenActionDtoAdapter.toJson(jsonWriter, (JsonWriter) existingProfileDto2.getAction());
        jsonWriter.name("corp_client_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) existingProfileDto2.getCorpClientId());
        jsonWriter.name("is_enabled");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(existingProfileDto2.isEnabled()));
        jsonWriter.name("payment_options");
        this.nullablePaymentOptionsDtoAdapter.toJson(jsonWriter, (JsonWriter) existingProfileDto2.getPaymentOptions());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(40, "GeneratedJsonAdapter(ExistingProfileDto)");
    }
}
