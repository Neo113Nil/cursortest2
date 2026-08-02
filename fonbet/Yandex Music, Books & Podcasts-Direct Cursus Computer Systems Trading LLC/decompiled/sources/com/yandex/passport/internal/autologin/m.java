package com.yandex.passport.internal.autologin;

import defpackage.cg6;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class m extends cg6 {
    public o j;
    public l k;
    public List l;
    public com.yandex.passport.internal.d m;
    public List n;
    public Map o;
    public Iterator p;
    public Map q;
    public com.yandex.passport.common.core.f r;
    public int s;
    public int t;
    public int u;
    public int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ o x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, cg6 cg6Var) {
        super(cg6Var);
        this.x = oVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= Integer.MIN_VALUE;
        return o.x(this.x, null, this);
    }
}
