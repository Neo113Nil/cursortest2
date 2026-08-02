package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import defpackage.w511;
import kotlin.Metadata;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.TextWidgetDto;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextWidgetDto_TextDto_JsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextWidgetDto$TextDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/Moshi;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TextWidgetDto_TextDto_JsonAdapter extends JsonAdapter<TextWidgetDto.TextDto> {
    private final Moshi moshi;

    public TextWidgetDto_TextDto_JsonAdapter(Moshi moshi) {
        this.moshi = moshi;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TextWidgetDto.TextDto fromJson(JsonReader jsonReader) {
        try {
            if (this.moshi.adapter(FormStateTextDto.class).fromJson(jsonReader.peekJson()) != null) {
                return new g((FormStateTextDto) this.moshi.adapter(FormStateTextDto.class).fromJson(jsonReader));
            }
        } catch (Exception unused) {
        }
        try {
            if (this.moshi.adapter(AttributedTextDto.class).fromJson(jsonReader.peekJson()) != null) {
                return new h((AttributedTextDto) this.moshi.adapter(AttributedTextDto.class).fromJson(jsonReader));
            }
        } catch (Exception unused2) {
        }
        return i.a;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TextWidgetDto.TextDto textDto) {
        TextWidgetDto.TextDto textDto2 = textDto;
        if (textDto2 == null) {
            return;
        }
        if (textDto2 instanceof g) {
            this.moshi.adapter(FormStateTextDto.class).toJson(jsonWriter, (JsonWriter) ((g) textDto2).a);
        } else if (textDto2 instanceof h) {
            this.moshi.adapter(AttributedTextDto.class).toJson(jsonWriter, (JsonWriter) ((h) textDto2).a);
        } else {
            if (textDto2 instanceof i) {
                return;
            }
            w511.b();
        }
    }
}
