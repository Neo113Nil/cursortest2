package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class nbm extends cg6 {
    public List j;
    public vam k;
    public jx7 l;
    public fvf m;
    public aqi n;
    public eoe o;
    public float p;
    public int q;
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ fa3 t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nbm(fa3 fa3Var, Continuation continuation) {
        super(continuation);
        this.t = fa3Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.b(null, this);
    }
}
