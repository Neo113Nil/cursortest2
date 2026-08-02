package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class et4 implements kfh {
    public final /* synthetic */ int a;
    public final /* synthetic */ fk0 b;
    public final /* synthetic */ boolean c;

    public et4(int i, fk0 fk0Var, boolean z) {
        this.a = i;
        this.b = fk0Var;
        this.c = z;
    }

    @Override // defpackage.kfh
    public final lfh b(mfh mfhVar, List list, long j) {
        mfhVar.getClass();
        list.getClass();
        ffh ffhVar = (ffh) CollectionsKt.firstOrNull(list);
        ksk M = ffhVar != null ? ffhVar.M(j) : null;
        int i = this.a;
        int b = M != null ? eeh.b(((Number) this.b.e()).floatValue() * (M.b + i)) : 0;
        Integer valueOf = this.c ? Integer.valueOf(i) : null;
        int max = Math.max(valueOf != null ? valueOf.intValue() : 0, b);
        return mfh.m0(mfhVar, ga6.i(j), max, new dt4(M, max, b, 0));
    }
}
