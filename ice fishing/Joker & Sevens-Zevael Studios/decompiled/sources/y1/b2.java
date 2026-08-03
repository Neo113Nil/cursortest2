package y1;

import android.view.View;
import android.view.ViewGroup;
import org.fortheloss.st.R;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class b2 {

    /* renamed from: a, reason: collision with root package name */
    public static final ViewGroup.LayoutParams f8479a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00af  */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Collection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final a2 a(a aVar, m0.v vVar, u0.d dVar) {
        r rVar;
        a2 a2Var;
        Object[] objArr = 0;
        if (e1.f8506a.compareAndSet(false, true)) {
            ad.e a6 = a.a.a(1, 6, null);
            yc.a0.q(yc.a0.a((fc.i) j0.f8558s.getValue()), null, new c0.c((Object) a6, (fc.d) (objArr == true ? 1 : 0), 15), 3);
            wc.i iVar = new wc.i(10, a6);
            synchronized (w0.m.f7580c) {
                w0.m.f7586i = bc.m.Z(w0.m.f7586i, iVar);
            }
            w0.m.a();
        }
        if (aVar.getChildCount() > 0) {
            View childAt = aVar.getChildAt(0);
            if (childAt instanceof r) {
                rVar = (r) childAt;
                if (rVar == null) {
                    rVar = new r(aVar.getContext(), vVar.i());
                    aVar.addView(rVar.getView(), f8479a);
                }
                Object tag = rVar.getView().getTag(R.id.wrapped_composition_tag);
                a2Var = tag instanceof a2 ? (a2) tag : null;
                if (a2Var == null) {
                    a2Var = new a2(rVar, new m0.y(vVar, new a5.c(rVar.getRoot())));
                    rVar.getView().setTag(R.id.wrapped_composition_tag, a2Var);
                }
                a2Var.e(dVar);
                if (!pc.j.a(rVar.getCoroutineContext(), vVar.i())) {
                    rVar.setCoroutineContext(vVar.i());
                }
                return a2Var;
            }
        } else {
            aVar.removeAllViews();
        }
        rVar = null;
        if (rVar == null) {
        }
        Object tag2 = rVar.getView().getTag(R.id.wrapped_composition_tag);
        if (tag2 instanceof a2) {
        }
        if (a2Var == null) {
        }
        a2Var.e(dVar);
        if (!pc.j.a(rVar.getCoroutineContext(), vVar.i())) {
        }
        return a2Var;
    }
}
