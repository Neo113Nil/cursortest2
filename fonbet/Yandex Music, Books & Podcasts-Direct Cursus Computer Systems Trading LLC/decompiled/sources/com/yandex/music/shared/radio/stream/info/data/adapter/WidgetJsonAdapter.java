package com.yandex.music.shared.radio.stream.info.data.adapter;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.yandex.music.shared.radio.stream.info.data.dto.MusicTrackWidgetDto;
import com.yandex.music.shared.radio.stream.info.data.dto.ShowWidgetDto;
import defpackage.v3w;
import defpackage.xlv;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/music/shared/radio/stream/info/data/adapter/WidgetJsonAdapter;", "Lcom/google/gson/JsonDeserializer;", "Lxlv;", "<init>", "()V", "shared-radio-stream-info"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
final class WidgetJsonAdapter implements JsonDeserializer<xlv> {
    @Override // com.google.gson.JsonDeserializer
    public final Object a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        Class cls;
        if (jsonElement != null && (jsonElement instanceof JsonObject)) {
            JsonElement v = jsonElement.m().v("type");
            String q = v != null ? v.q() : null;
            if (Intrinsics.d(q, "music_track")) {
                cls = MusicTrackWidgetDto.class;
            } else if (Intrinsics.d(q, "show")) {
                cls = ShowWidgetDto.class;
            } else {
                v3w.l("deserialize<WidgetDto>(): unknown type ", q, 6, "WidgetDtoDeserializer", null);
            }
            if (jsonDeserializationContext != null) {
                return (xlv) jsonDeserializationContext.a(jsonElement, cls);
            }
        }
        return null;
    }
}
