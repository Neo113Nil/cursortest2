package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class rsf extends cg6 {
    public tsf j;
    public hqi k;
    public aur l;
    public /* synthetic */ Object m;
    public final /* synthetic */ tsf n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rsf(tsf tsfVar, Continuation continuation) {
        super(continuation);
        this.n = tsfVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.a(null, null, this);
    }
}
