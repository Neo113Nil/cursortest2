package u0;

import java.util.ArrayList;
import m0.a0;
import m0.r;
import m0.x1;
import m0.y;
import pc.v;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d implements b {

    /* renamed from: g, reason: collision with root package name */
    public final int f6663g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f6664h;

    /* renamed from: i, reason: collision with root package name */
    public Object f6665i;

    /* renamed from: j, reason: collision with root package name */
    public x1 f6666j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f6667k;

    public d(int i10, Object obj, boolean z10) {
        this.f6663g = i10;
        this.f6664h = z10;
        this.f6665i = obj;
    }

    public final Object a(int i10, r rVar) {
        rVar.Z(this.f6663g);
        f(rVar);
        int a6 = i10 | (rVar.f(this) ? e.a(2, 0) : e.a(1, 0));
        Object obj = this.f6665i;
        pc.j.c(obj, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        v.c(2, obj);
        Object invoke = ((oc.e) obj).invoke(rVar, Integer.valueOf(a6));
        x1 s10 = rVar.s();
        if (s10 != null) {
            s10.f4809d = new c(2, d.class, this, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;");
        }
        return invoke;
    }

    @Override // oc.f
    public final /* bridge */ /* synthetic */ Object b(Object obj, Object obj2, Object obj3) {
        return e(obj, (r) obj2, ((Number) obj3).intValue());
    }

    public final Object c(Object obj, Object obj2, r rVar, int i10) {
        rVar.Z(this.f6663g);
        f(rVar);
        int a6 = rVar.f(this) ? e.a(2, 2) : e.a(1, 2);
        Object obj3 = this.f6665i;
        pc.j.c(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        v.c(4, obj3);
        Object d10 = ((oc.g) obj3).d(obj, obj2, rVar, Integer.valueOf(a6 | i10));
        x1 s10 = rVar.s();
        if (s10 != null) {
            s10.f4809d = new rd.r(this, obj, obj2, i10, 2);
        }
        return d10;
    }

    @Override // oc.g
    public final /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        return c(obj, obj2, (r) obj3, ((Number) obj4).intValue());
    }

    public final Object e(Object obj, r rVar, int i10) {
        rVar.Z(this.f6663g);
        f(rVar);
        int a6 = rVar.f(this) ? e.a(2, 1) : e.a(1, 1);
        Object obj2 = this.f6665i;
        pc.j.c(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        v.c(3, obj2);
        Object b2 = ((oc.f) obj2).b(obj, rVar, Integer.valueOf(a6 | i10));
        x1 s10 = rVar.s();
        if (s10 != null) {
            s10.f4809d = new a0(this, obj, i10);
        }
        return b2;
    }

    public final void f(r rVar) {
        x1 y10;
        if (!this.f6664h || (y10 = rVar.y()) == null) {
            return;
        }
        y10.f4807b |= 1;
        if (e.f(this.f6666j, y10)) {
            this.f6666j = y10;
            return;
        }
        ArrayList arrayList = this.f6667k;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.f6667k = arrayList2;
            arrayList2.add(y10);
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (e.f((x1) arrayList.get(i10), y10)) {
                arrayList.set(i10, y10);
                return;
            }
        }
        arrayList.add(y10);
    }

    public final void g(ac.c cVar) {
        if (pc.j.a(this.f6665i, cVar)) {
            return;
        }
        boolean z10 = this.f6665i == null;
        this.f6665i = cVar;
        if (z10 || !this.f6664h) {
            return;
        }
        x1 x1Var = this.f6666j;
        if (x1Var != null) {
            y yVar = x1Var.f4806a;
            if (yVar != null) {
                yVar.r(x1Var, null);
            }
            this.f6666j = null;
        }
        ArrayList arrayList = this.f6667k;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                x1 x1Var2 = (x1) arrayList.get(i10);
                y yVar2 = x1Var2.f4806a;
                if (yVar2 != null) {
                    yVar2.r(x1Var2, null);
                }
            }
            arrayList.clear();
        }
    }

    @Override // oc.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return a(((Number) obj2).intValue(), (r) obj);
    }
}
