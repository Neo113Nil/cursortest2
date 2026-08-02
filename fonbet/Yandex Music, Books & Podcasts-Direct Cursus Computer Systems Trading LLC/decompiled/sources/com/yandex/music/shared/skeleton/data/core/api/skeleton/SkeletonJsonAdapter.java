package com.yandex.music.shared.skeleton.data.core.api.skeleton;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import defpackage.fnq;
import defpackage.gnq;
import defpackage.inq;
import java.lang.reflect.Type;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/music/shared/skeleton/data/core/api/skeleton/SkeletonJsonAdapter;", "Lcom/google/gson/JsonDeserializer;", "Linq;", "Lcom/google/gson/JsonSerializer;", "shared-skeleton-data-core"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class SkeletonJsonAdapter implements JsonDeserializer<inq>, JsonSerializer<inq> {
    public final gnq a;

    public SkeletonJsonAdapter(gnq gnqVar) {
        gnqVar.getClass();
        this.a = gnqVar;
    }

    @Override // com.google.gson.JsonDeserializer
    public final Object a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        String q;
        jsonElement.getClass();
        type.getClass();
        jsonDeserializationContext.getClass();
        JsonElement v = jsonElement.m().v("type");
        if (v != null && (q = v.q()) != null) {
            fnq b = this.a.b(q);
            Class a = b != null ? b.a() : null;
            if (a != null) {
                return (inq) jsonDeserializationContext.a(jsonElement, a);
            }
        }
        return null;
    }

    @Override // com.google.gson.JsonSerializer
    public final JsonElement b(Object obj, Type type, JsonSerializationContext jsonSerializationContext) {
        inq inqVar = (inq) obj;
        inqVar.getClass();
        type.getClass();
        jsonSerializationContext.getClass();
        JsonElement b = jsonSerializationContext.b(inqVar);
        b.getClass();
        return b;
    }
}
