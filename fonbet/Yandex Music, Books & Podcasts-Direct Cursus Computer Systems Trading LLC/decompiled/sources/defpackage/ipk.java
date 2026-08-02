package defpackage;

import java.util.List;

/* loaded from: classes4.dex */
public final class ipk extends cg6 {
    public List j;
    public /* synthetic */ Object k;
    public final /* synthetic */ vpk l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ipk(vpk vpkVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = vpkVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(this, null, null);
    }
}
