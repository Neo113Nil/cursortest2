package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class rnc extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public rjc l;
    public final /* synthetic */ snc m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rnc(snc sncVar, Continuation continuation) {
        super(continuation);
        this.m = sncVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.m.emit(null, this);
    }
}
