package com.yandex.plus.core.network.uri;

import android.net.Uri;
import com.yandex.passport.data.network.l;
import defpackage.cg6;

/* loaded from: classes4.dex */
public final class c extends cg6 {
    public Uri.Builder j;
    public /* synthetic */ Object k;
    public final /* synthetic */ l l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(l lVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = lVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return l.M(this.l, null, this);
    }
}
