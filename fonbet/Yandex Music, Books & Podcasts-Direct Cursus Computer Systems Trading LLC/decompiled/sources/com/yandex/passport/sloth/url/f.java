package com.yandex.passport.sloth.url;

import android.net.Uri;
import com.yandex.passport.sloth.data.o0;
import defpackage.cg6;

/* loaded from: classes4.dex */
public final class f extends cg6 {
    public o0 j;
    public Uri.Builder k;
    public /* synthetic */ Object l;
    public final /* synthetic */ v m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(v vVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = vVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.i(null, this);
    }
}
