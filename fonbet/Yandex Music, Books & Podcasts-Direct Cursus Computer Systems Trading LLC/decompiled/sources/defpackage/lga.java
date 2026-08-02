package defpackage;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class lga extends cg6 {
    public String j;
    public String k;
    public String l;
    public Boolean m;
    public Integer n;
    public ArrayList o;
    public String p;
    public /* synthetic */ Object q;
    public final /* synthetic */ oga r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lga(oga ogaVar, cg6 cg6Var) {
        super(cg6Var);
        this.r = ogaVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.e(null, null, null, this);
    }
}
