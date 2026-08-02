package defpackage;

import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class ii4 extends cg6 {
    public cvl j;
    public Map k;
    public Set l;
    public boolean m;
    public /* synthetic */ Object n;
    public final /* synthetic */ pi4 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii4(pi4 pi4Var, cg6 cg6Var) {
        super(cg6Var);
        this.o = pi4Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.a(null, false, this);
    }
}
