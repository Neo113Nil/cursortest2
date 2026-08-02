package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class qkv extends cg6 {
    public rkd j;
    public ukv k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ ukv n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qkv(ukv ukvVar, Continuation continuation) {
        super(continuation);
        this.n = ukvVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.b(null, this);
    }
}
