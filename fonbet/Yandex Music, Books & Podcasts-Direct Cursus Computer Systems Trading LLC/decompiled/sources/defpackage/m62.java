package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class m62 extends cg6 {
    public List j;
    public ArrayList k;
    public long l;
    public /* synthetic */ Object m;
    public final /* synthetic */ o62 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m62(o62 o62Var, cg6 cg6Var) {
        super(cg6Var);
        this.n = o62Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return o62.b(this.n, null, this);
    }
}
