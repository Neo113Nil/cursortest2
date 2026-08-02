package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions;

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
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.ModalActionDto;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/ModalActionDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/ModalActionDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/ModalActionDto$TopButtonDto;", "topButtonDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/CardModeDto;", "nullableCardModeDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/ModalActionDto$ModalTypeDto;", "nullableModalTypeDtoAdapter", "", "booleanAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/ShowPolicyDto;", "nullableShowPolicyDtoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ModalActionDtoJsonAdapter extends JsonAdapter<ModalActionDto> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<ModalActionDto> constructorRef;
    private final JsonAdapter<CardModeDto> nullableCardModeDtoAdapter;
    private final JsonAdapter<ModalActionDto.ModalTypeDto> nullableModalTypeDtoAdapter;
    private final JsonAdapter<ShowPolicyDto> nullableShowPolicyDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("modal_id", "top_button", "card_mode", "modal_type", "close_by_hardware_back", "show_policy");
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<ModalActionDto.TopButtonDto> topButtonDtoAdapter;

    public ModalActionDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "modalId");
        this.topButtonDtoAdapter = moshi.adapter(ModalActionDto.TopButtonDto.class, emptySet, "topButton");
        this.nullableCardModeDtoAdapter = moshi.adapter(CardModeDto.class, emptySet, "cardMode");
        this.nullableModalTypeDtoAdapter = moshi.adapter(ModalActionDto.ModalTypeDto.class, emptySet, "modalType");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "closeByHardwareBack");
        this.nullableShowPolicyDtoAdapter = moshi.adapter(ShowPolicyDto.class, emptySet, "showPolicy");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ModalActionDto fromJson(JsonReader jsonReader) {
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        CardModeDto cardModeDto = null;
        Boolean bool2 = bool;
        ModalActionDto.TopButtonDto topButtonDto = null;
        String str = null;
        ShowPolicyDto showPolicyDto = null;
        int i = -1;
        ModalActionDto.ModalTypeDto modalTypeDto = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("modalId", "modal_id", jsonReader);
                    }
                    break;
                case 1:
                    topButtonDto = this.topButtonDtoAdapter.fromJson(jsonReader);
                    if (topButtonDto == null) {
                        throw Util.unexpectedNull("topButton", "top_button", jsonReader);
                    }
                    i &= -3;
                    break;
                case 2:
                    cardModeDto = this.nullableCardModeDtoAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    modalTypeDto = this.nullableModalTypeDtoAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    bool2 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool2 == null) {
                        throw Util.unexpectedNull("closeByHardwareBack", "close_by_hardware_back", jsonReader);
                    }
                    i &= -17;
                    break;
                case 5:
                    showPolicyDto = this.nullableShowPolicyDtoAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -19) {
            if (str != null) {
                return new ModalActionDto(str, topButtonDto, cardModeDto, modalTypeDto, bool2.booleanValue(), showPolicyDto);
            }
            throw Util.missingProperty("modalId", "modal_id", jsonReader);
        }
        String str2 = str;
        Constructor<ModalActionDto> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ModalActionDto.class.getDeclaredConstructor(String.class, ModalActionDto.TopButtonDto.class, CardModeDto.class, ModalActionDto.ModalTypeDto.class, Boolean.TYPE, ShowPolicyDto.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        Constructor<ModalActionDto> constructor2 = constructor;
        if (str2 == null) {
            throw Util.missingProperty("modalId", "modal_id", jsonReader);
        }
        return constructor2.newInstance(str2, topButtonDto, cardModeDto, modalTypeDto, bool2, showPolicyDto, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ModalActionDto modalActionDto) {
        ModalActionDto modalActionDto2 = modalActionDto;
        if (modalActionDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("modal_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) modalActionDto2.getModalId());
        jsonWriter.name("top_button");
        this.topButtonDtoAdapter.toJson(jsonWriter, (JsonWriter) modalActionDto2.getTopButton());
        jsonWriter.name("card_mode");
        this.nullableCardModeDtoAdapter.toJson(jsonWriter, (JsonWriter) modalActionDto2.getCardMode());
        jsonWriter.name("modal_type");
        this.nullableModalTypeDtoAdapter.toJson(jsonWriter, (JsonWriter) modalActionDto2.getModalType());
        jsonWriter.name("close_by_hardware_back");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(modalActionDto2.getCloseByHardwareBack()));
        jsonWriter.name("show_policy");
        this.nullableShowPolicyDtoAdapter.toJson(jsonWriter, (JsonWriter) modalActionDto2.getShowPolicy());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(36, "GeneratedJsonAdapter(ModalActionDto)");
    }
}
