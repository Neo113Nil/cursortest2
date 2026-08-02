package com.yandex.plus.bdui.plus.content.serializer;

import com.yandex.plus.core.reflect.TraversableCollectionField;
import defpackage.ern;
import defpackage.s9f;
import defpackage.yxm;
import java.util.Map;

/* loaded from: classes4.dex */
public final class t0 implements com.yandex.plus.bdui.plus.content.i {
    public static final /* synthetic */ s9f[] e;
    public final com.yandex.plus.core.templating.template.k a;
    public final Map b;
    public final com.yandex.plus.bdui.plus.content.h c;
    public final com.yandex.plus.bdui.action.a d;

    @TraversableCollectionField
    private final Map<String, com.yandex.plus.bdui.plus.content.g> layoutParams;

    static {
        yxm yxmVar = new yxm(t0.class, "layout", "getLayout()Lorg/json/JSONObject;", 0);
        ern.a.getClass();
        e = new s9f[]{yxmVar};
    }

    public t0(com.yandex.plus.core.templating.render.c cVar, Map map, Map map2, com.yandex.plus.bdui.plus.content.h hVar, com.yandex.plus.bdui.action.a aVar) {
        this.a = new com.yandex.plus.core.templating.template.k(cVar);
        this.layoutParams = map;
        this.b = map2;
        this.c = hVar;
        this.d = aVar;
    }

    public final Map a() {
        return this.layoutParams;
    }

    @Override // com.yandex.plus.bdui.action.j
    public final com.yandex.plus.bdui.action.a b() {
        return this.d;
    }
}
