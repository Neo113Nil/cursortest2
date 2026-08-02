package com.yandex.passport.internal.sloth;

import defpackage.cg6;
import defpackage.nm6;

/* loaded from: classes4.dex */
public final class y extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ z k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = zVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        Object b = this.k.b(this);
        if (b == nm6.a) {
            return b;
        }
        String str = (String) b;
        if (str != null) {
            return new com.yandex.passport.common.value.b(str);
        }
        return null;
    }
}
