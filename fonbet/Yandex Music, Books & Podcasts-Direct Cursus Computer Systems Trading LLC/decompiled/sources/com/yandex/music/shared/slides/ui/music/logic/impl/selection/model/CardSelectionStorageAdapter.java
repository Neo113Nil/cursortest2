package com.yandex.music.shared.slides.ui.music.logic.impl.selection.model;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import defpackage.b6e;
import defpackage.ux3;
import java.lang.reflect.Type;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/music/shared/slides/ui/music/logic/impl/selection/model/CardSelectionStorageAdapter;", "Lcom/google/gson/JsonDeserializer;", "Lux3;", "Lcom/google/gson/JsonSerializer;", "<init>", "()V", "shared-slides-ui-music-logic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class CardSelectionStorageAdapter implements JsonDeserializer<ux3>, JsonSerializer<ux3> {
    @Override // com.google.gson.JsonDeserializer
    public final Object a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        JsonObject m;
        JsonElement v;
        String q;
        if (jsonElement == null || !(jsonElement instanceof JsonObject) || (v = (m = jsonElement.m()).v("type")) == null || (q = v.q()) == null || !q.equals("artist") || jsonDeserializationContext == null) {
            return null;
        }
        return (ux3) jsonDeserializationContext.a(m, CardSelectionStorage$ArtistSelection.class);
    }

    @Override // com.google.gson.JsonSerializer
    public final JsonElement b(Object obj, Type type, JsonSerializationContext jsonSerializationContext) {
        ux3 ux3Var = (ux3) obj;
        if (ux3Var == null) {
            return null;
        }
        JsonElement b = jsonSerializationContext != null ? jsonSerializationContext.b(ux3Var) : null;
        if (b == null) {
            return b;
        }
        JsonObject m = b.m();
        if (ux3Var instanceof CardSelectionStorage$ArtistSelection) {
            m.u("type", "artist");
            return b;
        }
        b6e.s();
        return null;
    }
}
