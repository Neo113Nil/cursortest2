package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public final class qus extends cg6 {
    public LinkedHashMap j;
    public /* synthetic */ Object k;
    public final /* synthetic */ rus l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qus(rus rusVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = rusVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.l(null, null, this);
    }
}
