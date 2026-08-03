package androidx.compose.foundation.lazy.layout;

import ac.o;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.d0;
import b0.e0;
import b0.s;
import b0.v;
import java.util.Arrays;
import m0.d1;
import m0.j0;
import m0.l;
import m0.r;
import oc.e;
import oc.f;
import pc.k;
import v1.p0;
import v1.s0;
import y0.n;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b extends k implements f {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d0 f558g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n f559h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e f560i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d1 f561j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d0 d0Var, n nVar, e eVar, d1 d1Var) {
        super(3);
        this.f558g = d0Var;
        this.f559h = nVar;
        this.f560i = eVar;
        this.f561j = d1Var;
    }

    @Override // oc.f
    public final Object b(Object obj, Object obj2, Object obj3) {
        n d10;
        v0.c cVar = (v0.c) obj;
        r rVar = (r) obj2;
        ((Number) obj3).intValue();
        Object M = rVar.M();
        Object obj4 = l.f4646a;
        if (M == obj4) {
            M = new s(cVar, new a0.k(this.f561j, 1));
            rVar.i0(M);
        }
        s sVar = (s) M;
        Object M2 = rVar.M();
        if (M2 == obj4) {
            M2 = new s0(new x4.l(sVar));
            rVar.i0(M2);
        }
        s0 s0Var = (s0) M2;
        d0 d0Var = this.f558g;
        if (d0Var != null) {
            rVar.X(205264983);
            rVar.X(6622915);
            View view = (View) rVar.j(AndroidCompositionLocals_androidKt.f607f);
            boolean f10 = rVar.f(view);
            Object M3 = rVar.M();
            if (f10 || M3 == obj4) {
                M3 = new b0.b(view);
                rVar.i0(M3);
            }
            Object obj5 = (b0.b) M3;
            rVar.q(false);
            Object[] objArr = {d0Var, sVar, s0Var, obj5};
            boolean f11 = rVar.f(d0Var) | rVar.h(sVar) | rVar.h(s0Var) | rVar.h(obj5);
            Object M4 = rVar.M();
            if (f11 || M4 == obj4) {
                Object vVar = new v(d0Var, sVar, s0Var, obj5, 0);
                rVar.i0(vVar);
                M4 = vVar;
            }
            oc.c cVar2 = (oc.c) M4;
            boolean z10 = false;
            for (Object obj6 : Arrays.copyOf(objArr, 4)) {
                z10 |= rVar.f(obj6);
            }
            Object M5 = rVar.M();
            if (z10 || M5 == obj4) {
                rVar.i0(new j0(cVar2));
            }
            rVar.q(false);
        } else {
            rVar.X(205858881);
            rVar.q(false);
        }
        int i10 = e0.f817b;
        n nVar = this.f559h;
        if (d0Var != null && (d10 = nVar.d(new TraversablePrefetchStateModifierElement(d0Var))) != null) {
            nVar = d10;
        }
        boolean f12 = rVar.f(sVar);
        Object obj7 = this.f560i;
        boolean f13 = f12 | rVar.f(obj7);
        Object M6 = rVar.M();
        if (f13 || M6 == obj4) {
            M6 = new a1.f(2, sVar, obj7);
            rVar.i0(M6);
        }
        p0.a(s0Var, nVar, (e) M6, rVar, 8);
        return o.f277a;
    }
}
