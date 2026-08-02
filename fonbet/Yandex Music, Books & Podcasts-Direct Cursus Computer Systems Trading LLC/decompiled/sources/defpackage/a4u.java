package defpackage;

import java.util.Collection;

/* loaded from: classes4.dex */
public final class a4u extends cg6 {
    public Collection j;
    public /* synthetic */ Object k;
    public final /* synthetic */ b4u l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4u(b4u b4uVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = b4uVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.m(null, null, this);
    }
}
