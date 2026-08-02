package com.yandex.passport.internal.sloth.performers.usermenu;

import defpackage.cg6;
import defpackage.gm5;

/* loaded from: classes4.dex */
public final class d extends cg6 {
    public gm5 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ b l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = bVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(null, this);
    }
}
