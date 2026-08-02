package defpackage;

import kotlin.coroutines.Continuation;
import retrofit2.Call;

/* loaded from: classes4.dex */
public final class tci extends cg6 {
    public Call j;
    public /* synthetic */ Object k;
    public final /* synthetic */ uci l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tci(uci uciVar, Continuation continuation) {
        super(continuation);
        this.l = uciVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return uci.y(this.l, null, this);
    }
}
