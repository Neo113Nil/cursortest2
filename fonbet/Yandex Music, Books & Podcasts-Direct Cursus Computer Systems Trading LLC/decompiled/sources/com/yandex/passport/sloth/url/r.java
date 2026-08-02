package com.yandex.passport.sloth.url;

import android.net.Uri;
import defpackage.cg6;
import defpackage.nm6;

/* loaded from: classes4.dex */
public final class r extends cg6 {
    public Uri j;
    public /* synthetic */ Object k;
    public final /* synthetic */ v l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(v vVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = vVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        Object t = this.l.t(null, null, this);
        return t == nm6.a ? t : new com.yandex.passport.common.url.b((String) t);
    }
}
