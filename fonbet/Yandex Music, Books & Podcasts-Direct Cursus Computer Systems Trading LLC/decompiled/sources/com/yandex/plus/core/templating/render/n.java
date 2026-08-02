package com.yandex.plus.core.templating.render;

import defpackage.w4f;
import java.util.LinkedHashSet;
import kotlin.Pair;

/* loaded from: classes4.dex */
public final class n implements a {
    public final com.yandex.plus.core.templating.parser.b a;

    public n(com.yandex.plus.core.templating.parser.b bVar) {
        bVar.getClass();
        this.a = bVar;
    }

    @Override // com.yandex.plus.core.templating.render.a
    public final Pair b(Object obj) {
        w4f w4fVar = (w4f) obj;
        w4fVar.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        return new Pair(linkedHashSet, (y) com.yandex.plus.bdui.plus.analytics.b.s(w4fVar, new com.yandex.plus.core.graphql.daily.progress.s(12), g.a, h.a, i.a, j.a, k.a, new com.yandex.plus.bdui.templating.render.a(4, this, linkedHashSet), l.a, m.a));
    }
}
