package com.yandex.passport.sloth.url;

import defpackage.aur;
import defpackage.cg6;
import defpackage.nm6;

/* loaded from: classes4.dex */
public final class i extends cg6 {
    public aur j;
    public boolean k;
    public /* synthetic */ Object l;
    public final /* synthetic */ v m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(v vVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = vVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        Object l = this.m.l(null, null, false, null, this);
        if (l == nm6.a) {
            return l;
        }
        String str = (String) l;
        if (str != null) {
            return new com.yandex.passport.common.url.b(str);
        }
        return null;
    }
}
