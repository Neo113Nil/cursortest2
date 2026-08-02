package com.yandex.plus.bdui.flex.ui.scaffold;

import com.yandex.passport.internal.methods.performer.v0;
import com.yandex.plus.bdui.flex.factory.e;
import com.yandex.plus.bdui.flex.ui.o;
import com.yandex.plus.bdui.m;
import com.yandex.plus.bdui.plus.content.controller.f;
import defpackage.btf;
import defpackage.ern;
import defpackage.f9f;
import defpackage.jyr;
import defpackage.os7;
import defpackage.r7b;
import defpackage.sro;
import defpackage.tf6;
import defpackage.tro;
import defpackage.uro;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class c implements uro {
    public final com.yandex.plus.bdui.flex.utils.b a;
    public final Function2 b;
    public final e c;
    public final f d;
    public final o e;
    public final kotlinx.coroutines.a f;
    public final tf6 g;
    public final com.yandex.plus.log.api.b h;
    public final jyr i;
    public final jyr j;

    public c(com.yandex.plus.bdui.flex.utils.b bVar, Map map, Map map2, v0 v0Var, e eVar, f fVar, o oVar, kotlinx.coroutines.a aVar, tf6 tf6Var, com.yandex.plus.log.api.b bVar2) {
        map.getClass();
        map2.getClass();
        aVar.getClass();
        bVar2.getClass();
        this.a = bVar;
        this.b = v0Var;
        this.c = eVar;
        this.d = fVar;
        this.e = oVar;
        this.f = aVar;
        this.g = tf6Var;
        this.h = bVar2;
        this.i = btf.b(new com.yandex.plus.bdui.flex.ui.content.f(1, map));
        this.j = btf.b(new com.yandex.plus.bdui.flex.ui.content.f(2, map2));
    }

    @Override // defpackage.uro
    public final tro a(r7b r7bVar, sro sroVar) {
        r7bVar.getClass();
        sroVar.getClass();
        com.yandex.plus.core.reflect.c cVar = (com.yandex.plus.core.reflect.c) this.j.getValue();
        com.yandex.plus.bdui.plus.scaffold.a aVar = ((com.yandex.plus.bdui.flex.scaffold.a) sroVar).a;
        Pair a = cVar.a(aVar);
        if (a != null) {
            f9f f9fVar = (f9f) a.a;
            Function1 function1 = (Function1) a.b;
            com.yandex.plus.bdui.flex.utils.b bVar = this.a;
            m e = bVar.e(r7bVar);
            com.yandex.plus.bdui.plus.scaffold.controller.e eVar = (com.yandex.plus.bdui.plus.scaffold.controller.e) function1.invoke(e);
            return new b(bVar, eVar, new os7(e, f9fVar, eVar, this, 4));
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unsupported scaffold type " + ern.a(aVar.getClass()));
        com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.e;
        com.yandex.plus.log.api.b bVar2 = this.h;
        if (!bVar2.b(aVar2)) {
            throw illegalArgumentException;
        }
        bVar2.a(aVar2, "FlexScaffoldControllerFactory", "Render scaffold " + aVar + " failed!", illegalArgumentException);
        throw illegalArgumentException;
    }
}
