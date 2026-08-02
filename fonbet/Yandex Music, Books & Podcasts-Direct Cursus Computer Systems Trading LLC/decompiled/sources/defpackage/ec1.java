package defpackage;

import java.util.HashMap;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class ec1 extends cg6 {
    public String j;
    public HashMap k;
    public /* synthetic */ Object l;
    public final /* synthetic */ mc1 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ec1(mc1 mc1Var, Continuation continuation) {
        super(continuation);
        this.m = mc1Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return mc1.b(this.m, null, this);
    }
}
