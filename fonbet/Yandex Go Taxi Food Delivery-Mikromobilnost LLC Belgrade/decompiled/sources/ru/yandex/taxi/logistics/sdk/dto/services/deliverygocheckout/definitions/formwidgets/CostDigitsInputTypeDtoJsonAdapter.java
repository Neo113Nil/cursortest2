package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

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
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.CostDigitsInputTypeDto;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CostDigitsInputTypeDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CostDigitsInputTypeDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CostDigitsInputTypeDto$CurrencySymbolAnchorDto;", "currencySymbolAnchorDtoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CostDigitsInputTypeDtoJsonAdapter extends JsonAdapter<CostDigitsInputTypeDto> {
    private volatile Constructor<CostDigitsInputTypeDto> constructorRef;
    private final JsonAdapter<CostDigitsInputTypeDto.CurrencySymbolAnchorDto> currencySymbolAnchorDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("currency_symbol", "currency_symbol_anchor");

    public CostDigitsInputTypeDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "currencySymbol");
        this.currencySymbolAnchorDtoAdapter = moshi.adapter(CostDigitsInputTypeDto.CurrencySymbolAnchorDto.class, emptySet, "currencySymbolAnchor");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CostDigitsInputTypeDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        CostDigitsInputTypeDto.CurrencySymbolAnchorDto currencySymbolAnchorDto = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                currencySymbolAnchorDto = this.currencySymbolAnchorDtoAdapter.fromJson(jsonReader);
                if (currencySymbolAnchorDto == null) {
                    throw Util.unexpectedNull("currencySymbolAnchor", "currency_symbol_anchor", jsonReader);
                }
                i = -3;
            } else {
                continue;
            }
        }
        jsonReader.endObject();
        if (i == -3) {
            return new CostDigitsInputTypeDto(str, currencySymbolAnchorDto);
        }
        Constructor<CostDigitsInputTypeDto> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = CostDigitsInputTypeDto.class.getDeclaredConstructor(String.class, CostDigitsInputTypeDto.CurrencySymbolAnchorDto.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        return constructor.newInstance(str, currencySymbolAnchorDto, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CostDigitsInputTypeDto costDigitsInputTypeDto) {
        CostDigitsInputTypeDto costDigitsInputTypeDto2 = costDigitsInputTypeDto;
        if (costDigitsInputTypeDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("currency_symbol");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) costDigitsInputTypeDto2.getCurrencySymbol());
        jsonWriter.name("currency_symbol_anchor");
        this.currencySymbolAnchorDtoAdapter.toJson(jsonWriter, (JsonWriter) costDigitsInputTypeDto2.getCurrencySymbolAnchor());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(44, "GeneratedJsonAdapter(CostDigitsInputTypeDto)");
    }
}
