package com.yandex.passport.sloth.url;

import android.net.Uri;
import defpackage.cg6;
import defpackage.nm6;

/* loaded from: classes4.dex */
public final class c extends cg6 {
    public Uri j;
    public com.yandex.passport.common.core.f k;
    public com.yandex.passport.common.core.c l;
    public boolean m;
    public /* synthetic */ Object n;
    public final /* synthetic */ v o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(v vVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = vVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        Object f = this.o.f(null, null, false, null, this);
        return f == nm6.a ? f : new com.yandex.passport.common.url.b((String) f);
    }
}
