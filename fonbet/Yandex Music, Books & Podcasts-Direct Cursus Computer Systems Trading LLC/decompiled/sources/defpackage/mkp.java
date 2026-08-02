package defpackage;

import android.content.Context;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class mkp extends cg6 {
    public aw0 j;
    public Context k;
    public Function1 l;
    public si3 m;
    public /* synthetic */ Object n;
    public final /* synthetic */ aw0 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mkp(aw0 aw0Var, cg6 cg6Var) {
        super(cg6Var);
        this.o = aw0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.d(null, null, this);
    }
}
