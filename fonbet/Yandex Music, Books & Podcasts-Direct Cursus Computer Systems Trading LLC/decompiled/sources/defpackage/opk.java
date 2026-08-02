package defpackage;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class opk extends cg6 {
    public String j;
    public Iterator k;
    public /* synthetic */ Object l;
    public final /* synthetic */ vpk m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public opk(vpk vpkVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = vpkVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.h(null, this);
    }
}
