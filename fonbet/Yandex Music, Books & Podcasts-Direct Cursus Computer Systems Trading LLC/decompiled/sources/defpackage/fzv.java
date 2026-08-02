package defpackage;

import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class fzv implements ggi {
    public final /* synthetic */ sdr a;
    public final /* synthetic */ d8t b;

    public fzv(z7t z7tVar, d8t d8tVar) {
        this.a = z7tVar;
        this.b = d8tVar;
    }

    @Override // defpackage.ggi
    public final lfh b(mfh mfhVar, List list, long j) {
        Pair pair;
        mfhVar.getClass();
        list.getClass();
        List list2 = (List) list.get(0);
        List list3 = (List) list.get(1);
        sdr sdrVar = this.a;
        ksk M = ((Number) sdrVar.getValue()).floatValue() > 0.0f ? ((ffh) CollectionsKt.k0(list2)).M(j) : null;
        ksk M2 = ((Number) sdrVar.getValue()).floatValue() < 1.0f ? ((ffh) CollectionsKt.k0(list3)).M(j) : null;
        if (this.b.c() instanceof e1w) {
            pair = new Pair(0, 0);
        } else {
            float f = 0;
            pair = new Pair(Float.valueOf(f - ((1 - ((Number) sdrVar.getValue()).floatValue()) * (M != null ? M.a : 0))), Float.valueOf((((Number) sdrVar.getValue()).floatValue() * (M != null ? M.a : 0)) + f));
        }
        return mfh.m0(mfhVar, ga6.i(j), ga6.h(j), new i50(M, pair.a, M2, pair.b, 26));
    }
}
