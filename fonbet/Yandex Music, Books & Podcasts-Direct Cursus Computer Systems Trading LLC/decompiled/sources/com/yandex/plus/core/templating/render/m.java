package com.yandex.plus.core.templating.render;

import defpackage.ezc;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class m extends ezc implements Function1 {
    public static final m a = new m(1, q.class, "<init>", "constructor-impl(Ljava/util/Map;)Ljava/util/Map;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Map map = (Map) obj;
        map.getClass();
        return new q(map);
    }
}
