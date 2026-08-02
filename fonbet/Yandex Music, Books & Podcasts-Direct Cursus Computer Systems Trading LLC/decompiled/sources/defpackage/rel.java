package defpackage;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class rel extends cg6 {
    public ArrayList j;
    public /* synthetic */ Object k;
    public final /* synthetic */ uel l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rel(uel uelVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = uelVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, this);
    }
}
