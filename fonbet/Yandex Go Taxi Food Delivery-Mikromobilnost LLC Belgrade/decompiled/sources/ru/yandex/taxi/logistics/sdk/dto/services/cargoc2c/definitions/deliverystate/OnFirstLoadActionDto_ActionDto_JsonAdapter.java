package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import defpackage.w511;
import kotlin.Metadata;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.OnFirstLoadActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionOpenFormDto;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/OnFirstLoadActionDto_ActionDto_JsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/OnFirstLoadActionDto$ActionDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/Moshi;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class OnFirstLoadActionDto_ActionDto_JsonAdapter extends JsonAdapter<OnFirstLoadActionDto.ActionDto> {
    private final Moshi moshi;

    public OnFirstLoadActionDto_ActionDto_JsonAdapter(Moshi moshi) {
        this.moshi = moshi;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final OnFirstLoadActionDto.ActionDto fromJson(JsonReader jsonReader) {
        try {
            if (this.moshi.adapter(ActionOpenFormDto.class).fromJson(jsonReader.peekJson()) != null) {
                return new a((ActionOpenFormDto) this.moshi.adapter(ActionOpenFormDto.class).fromJson(jsonReader));
            }
        } catch (Exception unused) {
        }
        return b.a;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, OnFirstLoadActionDto.ActionDto actionDto) {
        OnFirstLoadActionDto.ActionDto actionDto2 = actionDto;
        if (actionDto2 == null) {
            return;
        }
        if (actionDto2 instanceof a) {
            this.moshi.adapter(ActionOpenFormDto.class).toJson(jsonWriter, (JsonWriter) ((a) actionDto2).a);
        } else {
            if (actionDto2 instanceof b) {
                return;
            }
            w511.b();
        }
    }
}
