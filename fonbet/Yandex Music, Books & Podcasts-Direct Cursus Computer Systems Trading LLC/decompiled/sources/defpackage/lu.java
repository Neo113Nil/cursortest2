package defpackage;

import java.util.HashMap;

/* loaded from: classes4.dex */
public final class lu extends cg6 {
    public HashMap j;
    public /* synthetic */ Object k;
    public final /* synthetic */ mu l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lu(mu muVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = muVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.h(null, null, this);
    }
}
