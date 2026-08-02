package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class dfo extends jpf {
    public static final dfo c = new dfo("Undefined intrinsics block and it is required", 0);
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dfo(String str, int i) {
        super(str);
        this.b = i;
    }

    @Override // defpackage.kfh
    public final lfh b(mfh mfhVar, List list, long j) {
        switch (this.b) {
            case 0:
                int size = list.size();
                if (size == 0) {
                    return mfh.m0(mfhVar, ga6.k(j), ga6.j(j), hhm.D);
                }
                if (size == 1) {
                    ksk M = ((ffh) list.get(0)).M(j);
                    return mfh.m0(mfhVar, ia6.g(M.a, j), ia6.f(M.b, j), new ai0(M, 14));
                }
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < size2; i3++) {
                    ksk M2 = ((ffh) list.get(i3)).M(j);
                    i = Math.max(M2.a, i);
                    i2 = Math.max(M2.b, i2);
                    arrayList.add(M2);
                }
                return mfh.m0(mfhVar, ia6.g(i, j), ia6.f(i2, j), new wyl(arrayList, 2));
            default:
                throw new IllegalStateException("Undefined measure and it is required");
        }
    }
}
