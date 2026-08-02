package ru.yandex.music.nonmusic.shelf.data;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import defpackage.b6e;
import defpackage.dri;
import defpackage.eri;
import java.lang.reflect.Type;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/music/nonmusic/shelf/data/MyShelfBlockElementJsonAdapter;", "Lcom/google/gson/JsonDeserializer;", "Lru/yandex/music/nonmusic/shelf/data/MyShelfBlockElementDto;", "Lcom/google/gson/JsonSerializer;", "<init>", "()V", "yandexmusic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public final class MyShelfBlockElementJsonAdapter implements JsonDeserializer<MyShelfBlockElementDto>, JsonSerializer<MyShelfBlockElementDto> {
    @Override // com.google.gson.JsonDeserializer
    public final Object a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        Class cls;
        String q;
        jsonElement.getClass();
        type.getClass();
        jsonDeserializationContext.getClass();
        JsonElement v = jsonElement.m().v("type");
        eri b = (v == null || (q = v.q()) == null) ? null : a.b(q);
        int i = b == null ? -1 : dri.a[b.ordinal()];
        if (i == -1) {
            cls = null;
        } else if (i == 1) {
            cls = LastRecentlyPlayedElementDto.class;
        } else if (i == 2) {
            cls = BookShelfButtonElementDto.class;
        } else if (i == 3) {
            cls = NewEpisodesButtonElementDto.class;
        } else {
            if (i != 4) {
                b6e.s();
                return null;
            }
            cls = ArtistButtonElementDto.class;
        }
        if (cls != null) {
            return (MyShelfBlockElementDto) jsonDeserializationContext.a(jsonElement, cls);
        }
        return null;
    }

    @Override // com.google.gson.JsonSerializer
    public final JsonElement b(Object obj, Type type, JsonSerializationContext jsonSerializationContext) {
        MyShelfBlockElementDto myShelfBlockElementDto = (MyShelfBlockElementDto) obj;
        myShelfBlockElementDto.getClass();
        type.getClass();
        jsonSerializationContext.getClass();
        JsonElement b = jsonSerializationContext.b(myShelfBlockElementDto);
        b.getClass();
        return b;
    }
}
