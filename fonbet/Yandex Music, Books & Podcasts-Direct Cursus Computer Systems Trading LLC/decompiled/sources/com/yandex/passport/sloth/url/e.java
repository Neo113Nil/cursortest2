package com.yandex.passport.sloth.url;

import defpackage.cg6;
import kotlin.Pair;

/* loaded from: classes4.dex */
public final class e extends cg6 {
    public Pair[] j;
    public Pair[] k;
    public String l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ v o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(v vVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = vVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.h(null, null, this);
    }
}
