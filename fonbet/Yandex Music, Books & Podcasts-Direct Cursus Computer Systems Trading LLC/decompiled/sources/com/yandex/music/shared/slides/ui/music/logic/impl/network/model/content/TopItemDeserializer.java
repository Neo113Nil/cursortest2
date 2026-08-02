package com.yandex.music.shared.slides.ui.music.logic.impl.network.model.content;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.content.TopBlockDto;
import defpackage.dfi;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/music/shared/slides/ui/music/logic/impl/network/model/content/TopItemDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/yandex/music/shared/slides/ui/music/logic/impl/network/model/content/TopBlockDto$TopItemDto;", "<init>", "()V", "shared-slides-ui-music-logic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class TopItemDeserializer implements JsonDeserializer<TopBlockDto.TopItemDto> {
    @Override // com.google.gson.JsonDeserializer
    public final Object a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        Class cls;
        if (jsonElement != null && (jsonElement instanceof JsonObject)) {
            JsonElement v = jsonElement.m().v("type");
            String q = v != null ? v.q() : null;
            if (Intrinsics.d(q, "CHOSEN_IMAGE")) {
                cls = TopBlockDto.TopItemDto.ChosenImageTopItemDto.class;
            } else if (Intrinsics.d(q, "IMAGE")) {
                cls = TopBlockDto.TopItemDto.ImageTopItemDto.class;
            } else {
                if (q == null) {
                    dfi.r("deserialize<TopItemDto>(): got item with null type", "TopItemDeserializer");
                    return null;
                }
                dfi.r("deserialize<TopItemDto>(): unknown type ".concat(q), "TopItemDeserializer");
            }
            if (jsonDeserializationContext != null) {
                return (TopBlockDto.TopItemDto) jsonDeserializationContext.a(jsonElement, cls);
            }
        }
        return null;
    }
}
