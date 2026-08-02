package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class epr extends cg6 {
    public fpr j;
    public LinkedHashMap k;
    public /* synthetic */ Object l;
    public final /* synthetic */ fpr m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public epr(fpr fprVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = fprVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(this);
    }
}
