package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class mli extends cg6 {
    public List j;
    public /* synthetic */ Object k;
    public final /* synthetic */ nli l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mli(nli nliVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = nliVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(null, this);
    }
}
