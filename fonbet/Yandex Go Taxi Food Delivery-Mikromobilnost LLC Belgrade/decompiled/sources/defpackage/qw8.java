package defpackage;

import com.yandex.go.places.impl.ui.organizations.recycler.viewholders.images.a;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes13.dex */
public final class qw8 extends bys {
    public final /* synthetic */ int z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qw8(pav pavVar, tls tlsVar, Integer num, Integer num2, Integer num3, int i) {
        super(scc.g(r9, new zxs(qoi0.a(g65.class).a(), 0, null, r13, null, new t240(pavVar, r4, tlsVar, 19))));
        this.z = 2;
        xvq xvqVar = new xvq(29);
        Integer num4 = (i & 8) != 0 ? null : num;
        Integer num5 = (i & 16) != 0 ? null : num2;
        Integer num6 = (i & 32) != 0 ? null : num3;
        int i2 = a.V;
        g0c a = qoi0.a(f65.class);
        t0 t0Var = new t0(pavVar, xvqVar, tlsVar, num4, num5, num6, 11);
        Class a2 = a.a();
        EmptyList emptyList = EmptyList.a;
        zxs zxsVar = new zxs(a2, 0, null, emptyList, null, t0Var);
        int i3 = ani.Z;
    }

    @Override // defpackage.bys
    public boolean j(Object obj, Object obj2) {
        switch (this.z) {
            case 7:
                j5p0 j5p0Var = (j5p0) obj;
                j5p0 j5p0Var2 = (j5p0) obj2;
                if (!(j5p0Var instanceof i5p0) || !(j5p0Var2 instanceof i5p0)) {
                    return jl40.l(j5p0Var, j5p0Var2);
                }
                i5p0 i5p0Var = (i5p0) j5p0Var;
                i5p0 i5p0Var2 = (i5p0) j5p0Var2;
                return i5p0Var.c == i5p0Var2.c && jl40.l(i5p0Var.d, i5p0Var2.d) && i5p0Var.e.equals(i5p0Var2.e) && i5p0Var.g.equals(i5p0Var2.g) && i5p0Var.f.equals(i5p0Var2.f);
            default:
                return super.j(obj, obj2);
        }
    }

    @Override // defpackage.bys
    public boolean k(Object obj, Object obj2) {
        switch (this.z) {
            case 7:
                j5p0 j5p0Var = (j5p0) obj;
                j5p0 j5p0Var2 = (j5p0) obj2;
                if ((j5p0Var instanceof e5p0) && (j5p0Var2 instanceof e5p0) && j5p0Var.getClass() == j5p0Var2.getClass()) {
                    e5p0 e5p0Var = (e5p0) j5p0Var;
                    e5p0 e5p0Var2 = (e5p0) j5p0Var2;
                    if (jl40.l(e5p0Var.a, e5p0Var2.a) && jl40.l(e5p0Var.b, e5p0Var2.b)) {
                        return true;
                    }
                }
                return false;
            default:
                return super.k(obj, obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qw8(List list, int i) {
        super(list);
        this.z = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qw8(ays aysVar, List list, int i) {
        super(aysVar, list);
        this.z = i;
    }
}
