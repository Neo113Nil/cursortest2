package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class afs extends uif implements Function2 {
    public final /* synthetic */ boolean r;
    public final /* synthetic */ wbl s;
    public final /* synthetic */ wn5 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afs(boolean z, wbl wblVar, wn5 wn5Var, int i) {
        super(2);
        this.r = z;
        this.s = wblVar;
        this.t = wn5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int R = rvf.R(385);
        cfs.a(this.r, this.s, this.t, (hq5) obj, R);
        return Unit.a;
    }
}
