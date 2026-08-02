package com.yandex.plus.core.templating.render;

import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* loaded from: classes4.dex */
public class c implements z {
    public final a a;
    public final b b;
    public final com.yandex.plus.log.api.b c;
    public final String d;
    public final String e;
    public final Object f;
    public Object g;
    public Pair h;

    public c(a aVar, b bVar, Object obj, com.yandex.plus.log.api.b bVar2, String str, String str2) {
        aVar.getClass();
        bVar.getClass();
        bVar2.getClass();
        this.a = aVar;
        this.b = bVar;
        this.c = bVar2;
        this.d = str;
        this.e = str2;
        this.f = obj;
    }

    @Override // com.yandex.plus.core.templating.render.z
    public final void a(Map map) {
        map.getClass();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.log.api.b bVar = this.c;
        boolean b = bVar.b(aVar);
        String str = this.d;
        if (b) {
            bVar.c(aVar, str, "render(); data = " + map);
        }
        if (b()) {
            if (bVar.b(aVar)) {
                bVar.c(aVar, str, "render(); already rendered");
                return;
            }
            return;
        }
        Pair pair = this.h;
        if (pair == null) {
            pair = this.a.b(this.f);
        }
        Object obj = pair.b;
        if (bVar.b(aVar)) {
            bVar.c(aVar, str, "render(); templates = " + obj);
        }
        this.g = this.b.a(obj, map);
        this.h = null;
    }

    @Override // com.yandex.plus.core.templating.render.z
    public final boolean b() {
        boolean z = this.g != null;
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.log.api.b bVar = this.c;
        if (bVar.b(aVar)) {
            bVar.c(aVar, this.d, "isRendered() = " + z);
        }
        return z;
    }

    @Override // com.yandex.plus.core.templating.render.z
    public final Set c() {
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.log.api.b bVar = this.c;
        boolean b = bVar.b(aVar);
        String str = this.d;
        if (b) {
            bVar.c(aVar, str, "getPlaceholders()");
        }
        if (b()) {
            if (!bVar.b(aVar)) {
                return null;
            }
            bVar.c(aVar, str, "getPlaceholders(); already rendered");
            return null;
        }
        Pair pair = this.h;
        if (pair == null) {
            pair = this.a.b(this.f);
        }
        Object obj = pair.a;
        this.h = pair;
        if (bVar.b(aVar)) {
            bVar.c(aVar, str, "getPlaceholders(); placeholders = " + obj);
        }
        return (Set) obj;
    }
}
