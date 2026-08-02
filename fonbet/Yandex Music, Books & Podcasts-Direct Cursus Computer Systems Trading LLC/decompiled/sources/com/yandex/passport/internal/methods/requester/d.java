package com.yandex.passport.internal.methods.requester;

import android.os.Bundle;
import com.yandex.passport.internal.methods.w5;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.xqn;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class d extends cg6 {
    public w5 j;
    public Bundle k;
    public xqn l;
    public int[] m;
    public int n;
    public int o;
    public int p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ f s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, cg6 cg6Var) {
        super(cg6Var);
        this.s = fVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        Object a = f.a(this.s, null, null, this);
        return a == nm6.a ? a : new z7o(a);
    }
}
