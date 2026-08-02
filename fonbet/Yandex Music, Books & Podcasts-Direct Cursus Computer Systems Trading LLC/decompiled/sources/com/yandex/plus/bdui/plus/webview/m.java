package com.yandex.plus.bdui.plus.webview;

import defpackage.cg6;
import defpackage.h8e;
import defpackage.nm6;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class m extends cg6 {
    public com.yandex.plus.bdui.plus.content.r j;
    public String k;
    public com.yandex.passport.internal.entities.j l;
    public h8e m;
    public /* synthetic */ Object n;
    public final /* synthetic */ com.yandex.plus.bdui.flex.ui.s o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.yandex.plus.bdui.flex.ui.s sVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = sVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        Object q = this.o.q(null, null, null, null, null, null, this);
        return q == nm6.a ? q : new z7o(q);
    }
}
