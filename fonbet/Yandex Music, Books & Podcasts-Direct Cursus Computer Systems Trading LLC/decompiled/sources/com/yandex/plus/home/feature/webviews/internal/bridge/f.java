package com.yandex.plus.home.feature.webviews.internal.bridge;

import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import defpackage.e5b;
import defpackage.e7f;
import defpackage.q5f;
import defpackage.t9f;
import defpackage.uah;
import defpackage.w4f;
import defpackage.x4f;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes5.dex */
public final class f extends e7f {
    public final String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(t9f t9fVar) {
        super(t9fVar);
        t9fVar.getClass();
        this.b = "dtoMessageType";
    }

    @Override // defpackage.e7f
    public final w4f a(w4f w4fVar) {
        Map map;
        w4fVar.getClass();
        q5f f = x4f.f(w4fVar);
        w4f w4fVar2 = (w4f) f.get("trackId");
        w4f w4fVar3 = (w4f) f.get("type");
        Object obj = (w4f) f.get("payload");
        LinkedHashMap v = r1.v(new Pair("trackId", w4fVar2), new Pair(this.b, w4fVar3));
        if (obj instanceof q5f) {
            map = (Map) obj;
        } else {
            map = e5b.a;
            map.getClass();
        }
        return new q5f(uah.i(v, map));
    }

    @Override // defpackage.e7f
    public final w4f b(w4f w4fVar) {
        w4fVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(x4f.f(w4fVar));
        return new q5f(r1.v(new Pair("type", linkedHashMap.remove(this.b)), new Pair("trackId", linkedHashMap.remove("trackId")), new Pair("payload", !linkedHashMap.isEmpty() ? new q5f(linkedHashMap) : null)));
    }
}
