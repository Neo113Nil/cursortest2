package com.yandex.plus.home.graphql.panel;

import defpackage.nm6;
import defpackage.pjc;
import defpackage.rjc;
import defpackage.xqn;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class f implements pjc {
    public final /* synthetic */ pjc a;
    public final /* synthetic */ xqn b;
    public final /* synthetic */ g c;
    public final /* synthetic */ xqn d;
    public final /* synthetic */ String e;

    public f(pjc pjcVar, xqn xqnVar, g gVar, xqn xqnVar2, String str) {
        this.a = pjcVar;
        this.b = xqnVar;
        this.c = gVar;
        this.d = xqnVar2;
        this.e = str;
    }

    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        Object collect = this.a.collect(new e(rjcVar, this.b, this.c, this.d, this.e), continuation);
        return collect == nm6.a ? collect : Unit.a;
    }
}
