package com.yandex.passport.sloth.command.performers;

import defpackage.cg6;
import defpackage.gm5;

/* loaded from: classes4.dex */
public final class n extends cg6 {
    public gm5 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ o l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = oVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(this);
    }
}
