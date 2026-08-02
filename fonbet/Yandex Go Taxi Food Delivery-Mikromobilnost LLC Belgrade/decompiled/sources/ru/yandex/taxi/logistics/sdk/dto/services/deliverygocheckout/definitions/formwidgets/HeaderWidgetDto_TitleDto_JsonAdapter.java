package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import defpackage.w511;
import kotlin.Metadata;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.HeaderWidgetDto;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/HeaderWidgetDto_TitleDto_JsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/HeaderWidgetDto$TitleDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/Moshi;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HeaderWidgetDto_TitleDto_JsonAdapter extends JsonAdapter<HeaderWidgetDto.TitleDto> {
    private final Moshi moshi;

    public HeaderWidgetDto_TitleDto_JsonAdapter(Moshi moshi) {
        this.moshi = moshi;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final HeaderWidgetDto.TitleDto fromJson(JsonReader jsonReader) {
        try {
            if (this.moshi.adapter(LogotypeTitleDto.class).fromJson(jsonReader.peekJson()) != null) {
                return new a((LogotypeTitleDto) this.moshi.adapter(LogotypeTitleDto.class).fromJson(jsonReader));
            }
        } catch (Exception unused) {
        }
        try {
            if (this.moshi.adapter(AttributedTextDto.class).fromJson(jsonReader.peekJson()) != null) {
                return new b((AttributedTextDto) this.moshi.adapter(AttributedTextDto.class).fromJson(jsonReader));
            }
        } catch (Exception unused2) {
        }
        return c.a;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, HeaderWidgetDto.TitleDto titleDto) {
        HeaderWidgetDto.TitleDto titleDto2 = titleDto;
        if (titleDto2 == null) {
            return;
        }
        if (titleDto2 instanceof a) {
            this.moshi.adapter(LogotypeTitleDto.class).toJson(jsonWriter, (JsonWriter) ((a) titleDto2).a);
        } else if (titleDto2 instanceof b) {
            this.moshi.adapter(AttributedTextDto.class).toJson(jsonWriter, (JsonWriter) ((b) titleDto2).a);
        } else {
            if (titleDto2 instanceof c) {
                return;
            }
            w511.b();
        }
    }
}
