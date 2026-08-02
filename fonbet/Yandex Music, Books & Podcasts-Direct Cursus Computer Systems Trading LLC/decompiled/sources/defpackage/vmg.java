package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class vmg extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ wmg k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vmg(wmg wmgVar, Continuation continuation) {
        super(continuation);
        this.k = wmgVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(this);
    }
}
