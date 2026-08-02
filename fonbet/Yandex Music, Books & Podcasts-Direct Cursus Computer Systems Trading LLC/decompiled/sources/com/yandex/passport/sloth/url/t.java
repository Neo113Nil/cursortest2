package com.yandex.passport.sloth.url;

import android.net.Uri;
import com.yandex.passport.sloth.data.o0;
import defpackage.cg6;
import defpackage.nm6;

/* loaded from: classes4.dex */
public final class t extends cg6 {
    public Uri j;
    public o0 k;
    public v l;
    public com.yandex.passport.common.core.f m;
    public /* synthetic */ Object n;
    public final /* synthetic */ v o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(v vVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = vVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        Object v = this.o.v(null, null, this);
        if (v == nm6.a) {
            return v;
        }
        String str = (String) v;
        if (str != null) {
            return new com.yandex.passport.common.url.b(str);
        }
        return null;
    }
}
