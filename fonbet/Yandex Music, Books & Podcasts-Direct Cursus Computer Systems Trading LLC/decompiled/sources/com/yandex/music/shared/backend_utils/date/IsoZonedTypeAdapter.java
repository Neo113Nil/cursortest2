package com.yandex.music.shared.backend_utils.date;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import defpackage.wye;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.format.DateTimeParseException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/music/shared/backend_utils/date/IsoZonedTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lwye;", "<init>", "()V", "shared-music-backend-utils"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class IsoZonedTypeAdapter extends TypeAdapter<wye> {
    public IsoZonedTypeAdapter() {
        new TypeAdapterFactory() { // from class: com.yandex.music.shared.backend_utils.date.IsoZonedTypeAdapter$factory$1
            @Override // com.google.gson.TypeAdapterFactory
            public final TypeAdapter b(Gson gson, TypeToken typeToken) {
                gson.getClass();
                typeToken.getClass();
                if (IsoZonedTypeAdapter.class.isAssignableFrom(typeToken.getRawType())) {
                    return new IsoZonedTypeAdapter();
                }
                return null;
            }
        };
    }

    @Override // com.google.gson.TypeAdapter
    public final Object b(JsonReader jsonReader) {
        String f0;
        ZonedDateTime zonedDateTime = null;
        if ((jsonReader != null ? jsonReader.H0() : null) == JsonToken.NULL) {
            jsonReader.u0();
            return null;
        }
        if (jsonReader == null || (f0 = jsonReader.f0()) == null) {
            return null;
        }
        try {
            zonedDateTime = ZonedDateTime.parse(f0, DateTimeFormatter.ISO_ZONED_DATE_TIME);
        } catch (DateTimeParseException unused) {
        }
        return new wye(f0, zonedDateTime);
    }

    @Override // com.google.gson.TypeAdapter
    public final void c(JsonWriter jsonWriter, Object obj) {
        wye wyeVar = (wye) obj;
        if (jsonWriter != null) {
            jsonWriter.U0(wyeVar != null ? wyeVar.a : null);
        }
    }
}
