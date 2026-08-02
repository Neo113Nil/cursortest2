package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class w9j extends cg6 {
    public String j;
    public /* synthetic */ Object k;
    public final /* synthetic */ z0j l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w9j(z0j z0jVar, Continuation continuation) {
        super(continuation);
        this.l = z0jVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a0(null, null, this);
    }
}
