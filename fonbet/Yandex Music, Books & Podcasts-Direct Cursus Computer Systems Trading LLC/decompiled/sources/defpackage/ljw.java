package defpackage;

import java.util.List;

/* loaded from: classes4.dex */
public final class ljw extends cg6 {
    public List j;
    public boolean k;
    public boolean l;
    public /* synthetic */ Object m;
    public final /* synthetic */ akw n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ljw(akw akwVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = akwVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.d(null, false, false, this);
    }
}
