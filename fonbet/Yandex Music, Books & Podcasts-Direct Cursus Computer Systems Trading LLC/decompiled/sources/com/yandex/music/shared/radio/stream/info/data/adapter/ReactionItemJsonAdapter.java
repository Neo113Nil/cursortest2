package com.yandex.music.shared.radio.stream.info.data.adapter;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.yandex.music.shared.radio.stream.info.data.dto.LiveReactionsReactionDto;
import com.yandex.music.shared.radio.stream.info.data.dto.TrackLikeReactionDto;
import defpackage.njn;
import defpackage.v3w;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/music/shared/radio/stream/info/data/adapter/ReactionItemJsonAdapter;", "Lcom/google/gson/JsonDeserializer;", "Lnjn;", "<init>", "()V", "shared-radio-stream-info"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
final class ReactionItemJsonAdapter implements JsonDeserializer<njn> {
    @Override // com.google.gson.JsonDeserializer
    public final Object a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        Class cls;
        if (jsonElement != null && (jsonElement instanceof JsonObject)) {
            JsonElement v = jsonElement.m().v("type");
            String q = v != null ? v.q() : null;
            if (Intrinsics.d(q, "live-reactions")) {
                cls = LiveReactionsReactionDto.class;
            } else if (Intrinsics.d(q, "track-like")) {
                cls = TrackLikeReactionDto.class;
            } else {
                v3w.l("deserialize<ReactionItemDto>(): unknown type ", q, 6, "ReactionItemDtoDeserializer", null);
            }
            if (jsonDeserializationContext != null) {
                return (njn) jsonDeserializationContext.a(jsonElement, cls);
            }
        }
        return null;
    }
}
