package com.yandex.music.shared.player.informer.data.network;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.yandex.music.shared.player.informer.data.network.PlayerInformersItemDto;
import defpackage.v3w;
import java.lang.reflect.Type;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/music/shared/player/informer/data/network/PlayerInformersItemDtoJsonAdapter;", "Lcom/google/gson/JsonDeserializer;", "Lcom/yandex/music/shared/player/informer/data/network/PlayerInformersItemDto;", "<init>", "()V", "shared-player-informers"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class PlayerInformersItemDtoJsonAdapter implements JsonDeserializer<PlayerInformersItemDto> {
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
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
                int hashCode = q.hashCode();
                if (hashCode != -1354814997) {
                    if (hashCode != 951024294) {
                        if (hashCode == 1158383506 && q.equals("donation")) {
                            cls = PlayerInformersItemDto.Donation.class;
                            if (jsonDeserializationContext != null) {
                                return (PlayerInformersItemDto) jsonDeserializationContext.a(jsonElement, cls);
                            }
                        }
                    } else if (q.equals("concert")) {
                        cls = PlayerInformersItemDto.Concert.class;
                        if (jsonDeserializationContext != null) {
                        }
                    }
                } else if (q.equals("common")) {
                    cls = PlayerInformersItemDto.Common.class;
                    if (jsonDeserializationContext != null) {
                    }
                }
            }
            v3w.l("deserialize: unknown type ", q, 6, "PlayerInformersItemDtoJsonAdapter", null);
        }
        return null;
    }
}
