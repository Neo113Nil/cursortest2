package com.yandex.music.shared.radio.model.parsers.adapter;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.yandex.music.shared.radio.model.parsers.dto.RadioFmStreamDto;
import com.yandex.music.shared.radio.model.parsers.dto.RadioStreamDto;
import defpackage.v3w;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/music/shared/radio/model/parsers/adapter/RadioStreamJsonAdapter;", "Lcom/google/gson/JsonDeserializer;", "Lcom/yandex/music/shared/radio/model/parsers/dto/RadioStreamDto;", "<init>", "()V", "shared-radio-model-parsers"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
final class RadioStreamJsonAdapter implements JsonDeserializer<RadioStreamDto> {
    @Override // com.google.gson.JsonDeserializer
    public final Object a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        if (jsonElement != null && (jsonElement instanceof JsonObject)) {
            JsonElement v = jsonElement.m().v("type");
            String q = v != null ? v.q() : null;
            if (!Intrinsics.d(q, "fm-online")) {
                v3w.l("deserialize<RadioStreamDto>(): unknown type ", q, 6, null, null);
            } else if (jsonDeserializationContext != null) {
                return (RadioStreamDto) jsonDeserializationContext.a(jsonElement, RadioFmStreamDto.class);
            }
        }
        return null;
    }
}
