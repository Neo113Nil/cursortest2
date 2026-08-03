package n0;

import java.util.List;
import m0.m2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g extends i0 {

    /* renamed from: c, reason: collision with root package name */
    public static final g f5002c = new g(0, 2, 1);

    @Override // n0.i0
    public final void a(k0 k0Var, m0.c cVar, m2 m2Var, x4.q qVar, j0 j0Var) {
        int i10 = ((u0.f) k0Var.b(0)).f6671a;
        List list = (List) k0Var.b(1);
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            int i12 = i10 + i11;
            cVar.c(i12, obj);
            cVar.g(i12, obj);
        }
    }
}
