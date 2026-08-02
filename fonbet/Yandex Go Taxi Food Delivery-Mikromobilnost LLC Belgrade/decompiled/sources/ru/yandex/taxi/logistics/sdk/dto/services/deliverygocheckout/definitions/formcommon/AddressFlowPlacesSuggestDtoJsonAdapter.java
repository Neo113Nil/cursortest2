package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon;

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
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.AddressFlowPlacesSuggestDto;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressFlowPlacesSuggestDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressFlowPlacesSuggestDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressFlowPlacesSuggestDto$CardsOverMapRevealingDto;", "cardsOverMapRevealingDtoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AddressFlowPlacesSuggestDtoJsonAdapter extends JsonAdapter<AddressFlowPlacesSuggestDto> {
    private final JsonAdapter<AddressFlowPlacesSuggestDto.CardsOverMapRevealingDto> cardsOverMapRevealingDtoAdapter;
    private volatile Constructor<AddressFlowPlacesSuggestDto> constructorRef;
    private final JsonReader.Options options = JsonReader.Options.of("mode", "cards_over_map_revealing");
    private final JsonAdapter<String> stringAdapter;

    public AddressFlowPlacesSuggestDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "mode");
        this.cardsOverMapRevealingDtoAdapter = moshi.adapter(AddressFlowPlacesSuggestDto.CardsOverMapRevealingDto.class, emptySet, "cardsOverMapRevealing");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final AddressFlowPlacesSuggestDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        AddressFlowPlacesSuggestDto.CardsOverMapRevealingDto cardsOverMapRevealingDto = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("mode", "mode", jsonReader);
                }
            } else if (selectName == 1) {
                cardsOverMapRevealingDto = this.cardsOverMapRevealingDtoAdapter.fromJson(jsonReader);
                if (cardsOverMapRevealingDto == null) {
                    throw Util.unexpectedNull("cardsOverMapRevealing", "cards_over_map_revealing", jsonReader);
                }
                i = -3;
            } else {
                continue;
            }
        }
        jsonReader.endObject();
        if (i == -3) {
            if (str != null) {
                return new AddressFlowPlacesSuggestDto(str, cardsOverMapRevealingDto);
            }
            throw Util.missingProperty("mode", "mode", jsonReader);
        }
        Constructor<AddressFlowPlacesSuggestDto> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = AddressFlowPlacesSuggestDto.class.getDeclaredConstructor(String.class, AddressFlowPlacesSuggestDto.CardsOverMapRevealingDto.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (str != null) {
            return constructor.newInstance(str, cardsOverMapRevealingDto, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("mode", "mode", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, AddressFlowPlacesSuggestDto addressFlowPlacesSuggestDto) {
        AddressFlowPlacesSuggestDto addressFlowPlacesSuggestDto2 = addressFlowPlacesSuggestDto;
        if (addressFlowPlacesSuggestDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("mode");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) addressFlowPlacesSuggestDto2.getMode());
        jsonWriter.name("cards_over_map_revealing");
        this.cardsOverMapRevealingDtoAdapter.toJson(jsonWriter, (JsonWriter) addressFlowPlacesSuggestDto2.getCardsOverMapRevealing());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(49, "GeneratedJsonAdapter(AddressFlowPlacesSuggestDto)");
    }
}
