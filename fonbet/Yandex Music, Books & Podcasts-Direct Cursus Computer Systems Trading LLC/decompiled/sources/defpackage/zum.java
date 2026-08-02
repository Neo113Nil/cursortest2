package defpackage;

import androidx.compose.ui.layout.a;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class zum implements kfh {
    public final /* synthetic */ float a;

    public zum(float f) {
        this.a = f;
    }

    @Override // defpackage.kfh
    public final lfh b(mfh mfhVar, List list, long j) {
        mfhVar.getClass();
        list.getClass();
        List<ffh> list2 = list;
        for (ffh ffhVar : list2) {
            if (Intrinsics.d(a.a(ffhVar), "progress_layout")) {
                ksk M = ffhVar.M(j);
                for (ffh ffhVar2 : list2) {
                    if (Intrinsics.d(a.a(ffhVar2), "durations_layout")) {
                        ksk M2 = ffhVar2.M(j);
                        int L = mfhVar.L(g6h.a);
                        return mfh.m0(mfhVar, Math.max(M.a, M2.a), mfhVar.L(this.a), new v50(M, L, M2, 16));
                    }
                }
                wvs.h("Collection contains no element matching the predicate.");
                return null;
            }
        }
        wvs.h("Collection contains no element matching the predicate.");
        return null;
    }
}
