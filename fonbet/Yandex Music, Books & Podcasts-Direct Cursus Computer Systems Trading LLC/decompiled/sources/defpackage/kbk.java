package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class kbk extends cg6 {
    public lbk j;
    public Function1 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ lbk m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kbk(lbk lbkVar, Continuation continuation) {
        super(continuation);
        this.m = lbkVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.P(null, this);
    }
}
