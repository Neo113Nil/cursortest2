package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class m3k extends cg6 {
    public o3k j;
    public hqi k;
    public aur l;
    public /* synthetic */ Object m;
    public final /* synthetic */ o3k n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3k(o3k o3kVar, Continuation continuation) {
        super(continuation);
        this.n = o3kVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return o3k.u(this.n, null, null, this);
    }
}
