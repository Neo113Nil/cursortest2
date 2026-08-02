package com.yandex.music.shared.myshelf.data.remote;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/music/shared/myshelf/data/remote/MyShelfBlockDtoJsonAdapter;", "Lcom/google/gson/JsonDeserializer;", "Lcom/yandex/music/shared/myshelf/data/remote/MyShelfBlockDto;", "Lcom/google/gson/JsonSerializer;", "<init>", "()V", "shared-myshelf"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class MyShelfBlockDtoJsonAdapter implements JsonDeserializer<MyShelfBlockDto>, JsonSerializer<MyShelfBlockDto> {
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        if (r6.equals("recently-played") == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        if (r6.equals("new-episodes") == false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b A[RETURN] */
    @Override // com.google.gson.JsonDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        Class cls;
        jsonElement.getClass();
        type.getClass();
        jsonDeserializationContext.getClass();
        JsonElement v = jsonElement.m().v("type");
        String q = v != null ? v.q() : null;
        if (q != null) {
            int hashCode = q.hashCode();
            cls = MyShelfEntitiesBlockDto.class;
            if (hashCode != -2063552667) {
                if (hashCode != -913850600) {
                    if (hashCode == -799212381 && q.equals("promotion")) {
                        cls = MyShelfPromotionBlockDto.class;
                    }
                }
            }
            if (cls == null) {
                return (MyShelfBlockDto) jsonDeserializationContext.a(jsonElement, cls);
            }
            return null;
        }
        cls = null;
        if (cls == null) {
        }
    }

    @Override // com.google.gson.JsonSerializer
    public final JsonElement b(Object obj, Type type, JsonSerializationContext jsonSerializationContext) {
        MyShelfBlockDto myShelfBlockDto = (MyShelfBlockDto) obj;
        myShelfBlockDto.getClass();
        type.getClass();
        jsonSerializationContext.getClass();
        JsonElement b = jsonSerializationContext.b(myShelfBlockDto);
        b.getClass();
        return b;
    }
}
