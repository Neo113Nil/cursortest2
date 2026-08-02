package defpackage;

import android.app.Activity;

/* loaded from: classes5.dex */
public final class g7h extends cg6 {
    public Activity j;
    public /* synthetic */ Object k;
    public final /* synthetic */ h7h l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7h(h7h h7hVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = h7hVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.d(null, this);
    }
}
