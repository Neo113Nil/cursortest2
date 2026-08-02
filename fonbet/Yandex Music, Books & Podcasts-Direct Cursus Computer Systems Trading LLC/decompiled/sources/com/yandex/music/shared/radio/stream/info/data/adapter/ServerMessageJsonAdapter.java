package com.yandex.music.shared.radio.stream.info.data.adapter;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.yandex.music.shared.radio.stream.info.data.dto.ReactionsUpdateEventDto;
import com.yandex.music.shared.radio.stream.info.data.dto.UnauthorizedDto;
import com.yandex.music.shared.radio.stream.info.data.dto.WidgetsUpdateEventDto;
import defpackage.ojp;
import defpackage.v3w;
import java.lang.reflect.Type;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/music/shared/radio/stream/info/data/adapter/ServerMessageJsonAdapter;", "Lcom/google/gson/JsonDeserializer;", "Lojp;", "<init>", "()V", "shared-radio-stream-info"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
final class ServerMessageJsonAdapter implements JsonDeserializer<ojp> {
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    @Override // com.google.gson.JsonDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        Class cls;
        if (jsonElement != null && (jsonElement instanceof JsonObject)) {
            JsonElement v = jsonElement.m().v("messageType");
            String q = v != null ? v.q() : null;
            if (q != null) {
                int hashCode = q.hashCode();
                if (hashCode != -1415890724) {
                    if (hashCode != 136175191) {
                        if (hashCode == 572200826 && q.equals("auth.unauthorized")) {
                            cls = UnauthorizedDto.class;
                            if (jsonDeserializationContext != null) {
                                return (ojp) jsonDeserializationContext.a(jsonElement, cls);
                            }
                        }
                    } else if (q.equals("stream_event.reactions")) {
                        cls = ReactionsUpdateEventDto.class;
                        if (jsonDeserializationContext != null) {
                        }
                    }
                } else if (q.equals("stream_event.widgets")) {
                    cls = WidgetsUpdateEventDto.class;
                    if (jsonDeserializationContext != null) {
                    }
                }
            }
            v3w.l("deserialize<ServerMessageDto>(): unknown messageType ", q, 6, "ServerMessageDtoDeserializer", null);
        }
        return null;
    }
}
