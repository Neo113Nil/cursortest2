package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import defpackage.w511;
import kotlin.Metadata;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.TileDto;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileDto_HeaderDto_JsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileDto$HeaderDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/Moshi;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TileDto_HeaderDto_JsonAdapter extends JsonAdapter<TileDto.HeaderDto> {
    private final Moshi moshi;

    public TileDto_HeaderDto_JsonAdapter(Moshi moshi) {
        this.moshi = moshi;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TileDto.HeaderDto fromJson(JsonReader jsonReader) {
        try {
            if (this.moshi.adapter(TileHeaderDto.class).fromJson(jsonReader.peekJson()) != null) {
                return new a((TileHeaderDto) this.moshi.adapter(TileHeaderDto.class).fromJson(jsonReader));
            }
        } catch (Exception unused) {
        }
        try {
            if (this.moshi.adapter(TileAttributedHeaderDto.class).fromJson(jsonReader.peekJson()) != null) {
                return new b((TileAttributedHeaderDto) this.moshi.adapter(TileAttributedHeaderDto.class).fromJson(jsonReader));
            }
        } catch (Exception unused2) {
        }
        return c.a;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TileDto.HeaderDto headerDto) {
        TileDto.HeaderDto headerDto2 = headerDto;
        if (headerDto2 == null) {
            return;
        }
        if (headerDto2 instanceof a) {
            this.moshi.adapter(TileHeaderDto.class).toJson(jsonWriter, (JsonWriter) ((a) headerDto2).a);
        } else if (headerDto2 instanceof b) {
            this.moshi.adapter(TileAttributedHeaderDto.class).toJson(jsonWriter, (JsonWriter) ((b) headerDto2).a);
        } else {
            if (headerDto2 instanceof c) {
                return;
            }
            w511.b();
        }
    }
}
