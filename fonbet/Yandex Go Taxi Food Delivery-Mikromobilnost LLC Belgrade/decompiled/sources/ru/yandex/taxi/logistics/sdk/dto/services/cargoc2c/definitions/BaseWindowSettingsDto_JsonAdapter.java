package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import defpackage.ld5;
import defpackage.md5;
import defpackage.nd5;
import defpackage.w511;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/BaseWindowSettingsDto_JsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/BaseWindowSettingsDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/Moshi;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BaseWindowSettingsDto_JsonAdapter extends JsonAdapter<BaseWindowSettingsDto> {
    private final Moshi moshi;

    public BaseWindowSettingsDto_JsonAdapter(Moshi moshi) {
        this.moshi = moshi;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final BaseWindowSettingsDto fromJson(JsonReader jsonReader) {
        try {
            if (this.moshi.adapter(BaseWindowSettingsV1Dto.class).fromJson(jsonReader.peekJson()) != null) {
                return new ld5((BaseWindowSettingsV1Dto) this.moshi.adapter(BaseWindowSettingsV1Dto.class).fromJson(jsonReader));
            }
        } catch (Exception unused) {
        }
        try {
            if (this.moshi.adapter(BaseWindowSettingsV2Dto.class).fromJson(jsonReader.peekJson()) != null) {
                return new md5((BaseWindowSettingsV2Dto) this.moshi.adapter(BaseWindowSettingsV2Dto.class).fromJson(jsonReader));
            }
        } catch (Exception unused2) {
        }
        return nd5.a;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, BaseWindowSettingsDto baseWindowSettingsDto) {
        BaseWindowSettingsDto baseWindowSettingsDto2 = baseWindowSettingsDto;
        if (baseWindowSettingsDto2 == null) {
            return;
        }
        if (baseWindowSettingsDto2 instanceof ld5) {
            this.moshi.adapter(BaseWindowSettingsV1Dto.class).toJson(jsonWriter, (JsonWriter) ((ld5) baseWindowSettingsDto2).a);
        } else if (baseWindowSettingsDto2 instanceof md5) {
            this.moshi.adapter(BaseWindowSettingsV2Dto.class).toJson(jsonWriter, (JsonWriter) ((md5) baseWindowSettingsDto2).a);
        } else {
            if (baseWindowSettingsDto2 instanceof nd5) {
                return;
            }
            w511.b();
        }
    }
}
