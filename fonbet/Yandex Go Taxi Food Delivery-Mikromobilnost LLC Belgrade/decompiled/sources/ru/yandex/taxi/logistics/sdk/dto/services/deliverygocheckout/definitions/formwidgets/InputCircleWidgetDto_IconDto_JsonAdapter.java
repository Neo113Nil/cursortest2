package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import defpackage.w511;
import kotlin.Metadata;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.ImageDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.InputCircleWidgetDto;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/InputCircleWidgetDto_IconDto_JsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/InputCircleWidgetDto$IconDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/Moshi;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class InputCircleWidgetDto_IconDto_JsonAdapter extends JsonAdapter<InputCircleWidgetDto.IconDto> {
    private final Moshi moshi;

    public InputCircleWidgetDto_IconDto_JsonAdapter(Moshi moshi) {
        this.moshi = moshi;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final InputCircleWidgetDto.IconDto fromJson(JsonReader jsonReader) {
        try {
            if (this.moshi.adapter(InputCircleIconsDto.class).fromJson(jsonReader.peekJson()) != null) {
                return new d((InputCircleIconsDto) this.moshi.adapter(InputCircleIconsDto.class).fromJson(jsonReader));
            }
        } catch (Exception unused) {
        }
        try {
            if (this.moshi.adapter(ImageDto.class).fromJson(jsonReader.peekJson()) != null) {
                return new e((ImageDto) this.moshi.adapter(ImageDto.class).fromJson(jsonReader));
            }
        } catch (Exception unused2) {
        }
        return f.a;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, InputCircleWidgetDto.IconDto iconDto) {
        InputCircleWidgetDto.IconDto iconDto2 = iconDto;
        if (iconDto2 == null) {
            return;
        }
        if (iconDto2 instanceof d) {
            this.moshi.adapter(InputCircleIconsDto.class).toJson(jsonWriter, (JsonWriter) ((d) iconDto2).a);
        } else if (iconDto2 instanceof e) {
            this.moshi.adapter(ImageDto.class).toJson(jsonWriter, (JsonWriter) ((e) iconDto2).a);
        } else {
            if (iconDto2 instanceof f) {
                return;
            }
            w511.b();
        }
    }
}
