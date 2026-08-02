package defpackage;

import com.yandex.passport.sloth.ui.dependencies.m;

/* loaded from: classes4.dex */
public final class nok extends cg6 {
    public String j;
    public cr k;
    public f9b l;
    public f9b m;
    public /* synthetic */ Object n;
    public final /* synthetic */ m o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nok(m mVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = mVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.m(null, null, null, this);
    }
}
