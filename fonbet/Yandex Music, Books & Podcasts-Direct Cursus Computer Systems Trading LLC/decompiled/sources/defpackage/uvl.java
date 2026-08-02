package defpackage;

import java.util.HashMap;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class uvl extends cg6 {
    public String j;
    public HashMap k;
    public /* synthetic */ Object l;
    public final /* synthetic */ bwl m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uvl(bwl bwlVar, Continuation continuation) {
        super(continuation);
        this.m = bwlVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return bwl.b(this.m, null, this);
    }
}
