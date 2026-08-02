package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class ahf extends cg6 {
    public List j;
    public yfa k;
    public jhf l;
    public /* synthetic */ Object m;
    public final /* synthetic */ fhf n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahf(fhf fhfVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = fhfVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.G(null, null, this);
    }
}
