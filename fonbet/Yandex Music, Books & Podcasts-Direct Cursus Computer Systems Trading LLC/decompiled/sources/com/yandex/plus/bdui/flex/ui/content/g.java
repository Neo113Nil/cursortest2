package com.yandex.plus.bdui.flex.ui.content;

import com.yandex.passport.internal.methods.performer.v0;
import com.yandex.plus.bdui.flex.ui.o;
import com.yandex.plus.bdui.m;
import defpackage.btf;
import defpackage.ern;
import defpackage.f9f;
import defpackage.jyr;
import defpackage.kb6;
import defpackage.os7;
import defpackage.r7b;
import defpackage.tf6;
import defpackage.ub6;
import defpackage.vb6;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class g implements vb6 {
    public final com.yandex.plus.bdui.flex.utils.b a;
    public final Function2 b;
    public final com.yandex.plus.bdui.flex.factory.e c;
    public final com.yandex.plus.bdui.plus.content.controller.f d;
    public final o e;
    public final kotlinx.coroutines.a f;
    public final tf6 g;
    public final com.yandex.plus.log.api.b h;
    public final jyr i;

    public g(com.yandex.plus.bdui.flex.utils.b bVar, Map map, v0 v0Var, com.yandex.plus.bdui.flex.factory.e eVar, com.yandex.plus.bdui.plus.content.controller.f fVar, o oVar, kotlinx.coroutines.a aVar, tf6 tf6Var, com.yandex.plus.log.api.b bVar2) {
        map.getClass();
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
        this.i = btf.b(new f(0, map));
    }

    @Override // defpackage.vb6
    public final ub6 a(r7b r7bVar, kb6 kb6Var) {
        r7bVar.getClass();
        kb6Var.getClass();
        com.yandex.plus.core.reflect.c cVar = (com.yandex.plus.core.reflect.c) this.i.getValue();
        com.yandex.plus.bdui.content.a aVar = ((com.yandex.plus.bdui.flex.content.a) kb6Var).a;
        Pair a = cVar.a(aVar);
        if (a != null) {
            f9f f9fVar = (f9f) a.a;
            Function1 function1 = (Function1) a.b;
            com.yandex.plus.bdui.flex.utils.b bVar = this.a;
            m e = bVar.e(r7bVar);
            com.yandex.plus.bdui.ui.a aVar2 = (com.yandex.plus.bdui.ui.a) function1.invoke(e);
            return new e(bVar, aVar2, new os7(e, f9fVar, aVar2, this, 3));
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unsupported content type " + ern.a(aVar.getClass()));
        com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.e;
        com.yandex.plus.log.api.b bVar2 = this.h;
        if (!bVar2.b(aVar3)) {
            throw illegalArgumentException;
        }
        bVar2.a(aVar3, "FlexContentControllerFactory", "Render content " + aVar + " failed!", illegalArgumentException);
        throw illegalArgumentException;
    }
}
