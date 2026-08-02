package com.yandex.plus.bdui.plus.action;

import com.yandex.passport.internal.report.we;
import com.yandex.passport.internal.ui.sloth.authsdk.h0;
import defpackage.btf;
import defpackage.jyr;
import defpackage.mm6;
import defpackage.x97;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class g implements com.yandex.plus.bdui.action.d {
    public final com.yandex.plus.bdui.flex.action.b a;
    public final com.yandex.plus.bdui.templating.render.a b;
    public final kotlinx.coroutines.a c;
    public final com.yandex.plus.log.api.b d;
    public final jyr e;

    public g(com.yandex.plus.bdui.flex.action.b bVar, com.yandex.plus.bdui.templating.render.a aVar, kotlinx.coroutines.a aVar2, kotlinx.coroutines.a aVar3, com.yandex.plus.log.api.b bVar2) {
        bVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        bVar2.getClass();
        this.a = bVar;
        this.b = aVar;
        this.c = aVar3;
        this.d = bVar2;
        this.e = btf.b(new h0(28, aVar2));
    }

    @Override // com.yandex.plus.bdui.action.d
    public final void a(com.yandex.plus.bdui.action.a aVar, com.yandex.plus.bdui.action.i iVar) {
        f fVar = (f) aVar;
        fVar.getClass();
        x97.y((mm6) this.e.getValue(), null, null, new we(fVar, this, iVar, (Continuation) null, 21), 3);
    }
}
