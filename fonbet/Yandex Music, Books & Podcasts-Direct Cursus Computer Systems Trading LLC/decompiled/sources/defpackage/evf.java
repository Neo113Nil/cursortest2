package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class evf extends cg6 {
    public fvf j;
    public hqi k;
    public aur l;
    public /* synthetic */ Object m;
    public final /* synthetic */ fvf n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public evf(fvf fvfVar, Continuation continuation) {
        super(continuation);
        this.n = fvfVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.a(null, null, this);
    }
}
