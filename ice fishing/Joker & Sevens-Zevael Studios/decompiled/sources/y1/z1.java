package y1;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Set;
import m0.j2;
import m0.m2;
import org.fortheloss.st.R;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class z1 extends pc.k implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f8728g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a2 f8729h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ oc.e f8730i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z1(a2 a2Var, oc.e eVar, int i10) {
        super(2);
        this.f8728g = i10;
        this.f8729h = a2Var;
        this.f8730i = eVar;
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8728g) {
            case 0:
                m0.r rVar = (m0.r) obj;
                int intValue = ((Number) obj2).intValue();
                if (rVar.P(intValue & 1, (intValue & 3) != 2)) {
                    AndroidCompositionLocals_androidKt.a(this.f8729h.f8468g, this.f8730i, rVar, 0);
                } else {
                    rVar.S();
                }
                break;
            default:
                m0.r rVar2 = (m0.r) obj;
                int intValue2 = ((Number) obj2).intValue();
                if (rVar2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    a2 a2Var = this.f8729h;
                    r rVar3 = a2Var.f8468g;
                    Object tag = rVar3.getTag(R.id.inspection_slot_table_set);
                    fc.d dVar = null;
                    Set set = (!(tag instanceof Set) || ((tag instanceof qc.a) && !(tag instanceof qc.f))) ? null : (Set) tag;
                    if (set == null) {
                        Object parent = rVar3.getParent();
                        View view = parent instanceof View ? (View) parent : null;
                        Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                        set = (!(tag2 instanceof Set) || ((tag2 instanceof qc.a) && !(tag2 instanceof qc.f))) ? null : (Set) tag2;
                    }
                    if (set != null) {
                        m0.x xVar = rVar2.U;
                        if (xVar == null) {
                            xVar = new m0.x(rVar2.f4728h);
                            rVar2.U = xVar;
                        }
                        set.add(xVar);
                        rVar2.f4737q = true;
                        rVar2.C = true;
                        rVar2.f4723c.b();
                        rVar2.H.b();
                        m2 m2Var = rVar2.I;
                        j2 j2Var = m2Var.f4658a;
                        m2Var.f4662e = j2Var.f4640p;
                        m2Var.f4663f = j2Var.f4641q;
                    }
                    boolean h10 = rVar2.h(a2Var);
                    Object M = rVar2.M();
                    m0.z0 z0Var = m0.l.f4646a;
                    if (h10 || M == z0Var) {
                        M = new y1(a2Var, dVar, 0);
                        rVar2.i0(M);
                    }
                    m0.z.f(rVar3, rVar2, (oc.e) M);
                    boolean h11 = rVar2.h(a2Var);
                    Object M2 = rVar2.M();
                    if (h11 || M2 == z0Var) {
                        M2 = new y1(a2Var, dVar, 1);
                        rVar2.i0(M2);
                    }
                    m0.z.f(rVar3, rVar2, (oc.e) M2);
                    m0.z.a(x0.e.f7966a.a(set), u0.e.e(-280240369, new z1(a2Var, this.f8730i, 0), rVar2), rVar2, 56);
                } else {
                    rVar2.S();
                }
                break;
        }
        return ac.o.f277a;
    }
}
