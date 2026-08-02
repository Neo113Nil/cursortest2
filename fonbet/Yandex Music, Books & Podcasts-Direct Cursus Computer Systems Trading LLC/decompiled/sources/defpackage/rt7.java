package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class rt7 extends cg6 {
    public mwu j;
    public /* synthetic */ Object k;
    public final /* synthetic */ au7 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rt7(au7 au7Var, Continuation continuation) {
        super(continuation);
        this.l = au7Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return au7.a(this.l, null, null, null, this);
    }
}
