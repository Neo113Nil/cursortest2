package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class skk extends cg6 {
    public wkk j;
    public /* synthetic */ Object k;
    public final /* synthetic */ tek l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public skk(tek tekVar, Continuation continuation) {
        super(continuation);
        this.l = tekVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(null, this);
    }
}
