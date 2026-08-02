package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class ww4 extends cg6 {
    public ArrayList j;
    public ArrayList k;
    public ArrayList l;
    public ArrayList m;
    public ArrayList n;
    public ArrayList o;
    public /* synthetic */ Object p;
    public final /* synthetic */ yx4 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww4(yx4 yx4Var, cg6 cg6Var) {
        super(cg6Var);
        this.q = yx4Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(this);
    }
}
