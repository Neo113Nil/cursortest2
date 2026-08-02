package com.yandex.music.shared.radio.model.parsers.adapter;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.yandex.music.shared.radio.model.parsers.dto.RadioStationAgeRestrictionDto;
import com.yandex.music.shared.radio.model.parsers.dto.RadioStationCitiesOfBroadcastingDto;
import com.yandex.music.shared.radio.model.parsers.dto.RadioStationCompanyDto;
import com.yandex.music.shared.radio.model.parsers.dto.RadioStationExtraInfoDto;
import com.yandex.music.shared.radio.model.parsers.dto.RadioStationTextDto;
import defpackage.v3w;
import java.lang.reflect.Type;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/music/shared/radio/model/parsers/adapter/RadioStationExtraInfoJsonAdapter;", "Lcom/google/gson/JsonDeserializer;", "Lcom/yandex/music/shared/radio/model/parsers/dto/RadioStationExtraInfoDto;", "<init>", "()V", "shared-radio-model-parsers"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
final class RadioStationExtraInfoJsonAdapter implements JsonDeserializer<RadioStationExtraInfoDto> {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    @Override // com.google.gson.JsonDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        Class cls;
        if (jsonElement != null && (jsonElement instanceof JsonObject)) {
            JsonElement v = jsonElement.m().v("type");
            String q = v != null ? v.q() : null;
            if (q != null) {
                switch (q.hashCode()) {
                    case -513539789:
                        if (q.equals("cities-of-broadcasting")) {
                            cls = RadioStationCitiesOfBroadcastingDto.class;
                            if (jsonDeserializationContext != null) {
                                return (RadioStationExtraInfoDto) jsonDeserializationContext.a(jsonElement, cls);
                            }
                        }
                        break;
                    case 3556653:
                        if (q.equals("text")) {
                            cls = RadioStationTextDto.class;
                            if (jsonDeserializationContext != null) {
                            }
                        }
                        break;
                    case 950484093:
                        if (q.equals("company")) {
                            cls = RadioStationCompanyDto.class;
                            if (jsonDeserializationContext != null) {
                            }
                        }
                        break;
                    case 1688463413:
                        if (q.equals("age-restrictions")) {
                            cls = RadioStationAgeRestrictionDto.class;
                            if (jsonDeserializationContext != null) {
                            }
                        }
                        break;
                }
            }
            v3w.l("deserialize<RadioStationExtraInfoDto>(): unknown type ", q, 6, null, null);
        }
        return null;
    }
}
