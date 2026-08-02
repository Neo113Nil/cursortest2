package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class en7 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ en7(boolean z, Object obj, int i) {
        super(1);
        this.r = i;
        this.s = z;
        this.t = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        int ordinal;
        String id;
        int i = this.r;
        Object obj2 = this.t;
        boolean z2 = this.s;
        switch (i) {
            case 0:
                r7f r7fVar = (r7f) obj;
                r7fVar.getClass();
                if (z2) {
                    r7fVar.Z("extensions");
                    r7fVar.j();
                    r7fVar.Z("persistedQuery");
                    r7fVar.j();
                    r7fVar.Z("version").u(1);
                    r7fVar.Z("sha256Hash").m0((String) obj2);
                    r7fVar.p();
                    r7fVar.p();
                }
                return Unit.a;
            default:
                k79 k79Var = (k79) obj;
                zx0 zx0Var = (zx0) obj2;
                jc8 jc8Var = k79Var.a;
                xzb xzbVar = k79Var.b;
                dp8 d = jc8Var.d();
                List l = d.l();
                if (l != null) {
                    z = l.contains(nw9.DATA_CHANGE);
                } else {
                    mw9 mw9Var = (mw9) zx0Var.r();
                    z = mw9Var != null && ((ordinal = mw9Var.ordinal()) == 1 || ordinal == 3);
                }
                if (!z || (id = d.getId()) == null) {
                    return null;
                }
                if (z2) {
                    un8 A = d.A();
                    if (A != null) {
                        return new f8t(id, t75.c(new ew9(A, 1)), xzbVar);
                    }
                    return null;
                }
                sq8 E = d.E();
                fw9 fw9Var = E != null ? new fw9(E) : null;
                un8 D = d.D();
                ew9 ew9Var = D != null ? new ew9(D, 2) : null;
                if (fw9Var == null && ew9Var == null) {
                    return null;
                }
                return new f8t(id, xz0.w(new gw9[]{fw9Var, ew9Var}), xzbVar);
        }
    }
}
