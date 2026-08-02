package defpackage;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class w1o extends cg6 {
    public Iterator j;
    public /* synthetic */ Object k;
    public final /* synthetic */ cr l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1o(cr crVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = crVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return cr.j(this.l, null, this);
    }
}
