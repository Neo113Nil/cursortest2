package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class wn5 implements sn5 {
    public final int a;
    public final boolean b;
    public Object c;
    public xmn d;
    public ArrayList e;

    public wn5(Object obj, int i, boolean z) {
        this.a = i;
        this.b = z;
        this.c = obj;
    }

    public final Object a(int i, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(this.a);
        m(oq5Var);
        int r = i | (oq5Var.f(this) ? ild.r(2, 0) : ild.r(1, 0));
        Object obj = this.c;
        obj.getClass();
        wct.o(2, obj);
        Object invoke = ((Function2) obj).invoke(oq5Var, Integer.valueOf(r));
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new tn5(2, this, wn5.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8, 0);
        }
        return invoke;
    }

    @Override // defpackage.uyc
    public final /* bridge */ /* synthetic */ Object b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return j(obj, obj2, obj3, obj4, (hq5) obj5, ((Number) obj6).intValue());
    }

    public final Object d(int i, hq5 hq5Var, Object obj) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(this.a);
        m(oq5Var);
        int r = oq5Var.f(this) ? ild.r(2, 1) : ild.r(1, 1);
        Object obj2 = this.c;
        obj2.getClass();
        wct.o(3, obj2);
        Object invoke = ((pyc) obj2).invoke(obj, oq5Var, Integer.valueOf(r | i));
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new kg0(this, obj, i, 4);
        }
        return invoke;
    }

    @Override // defpackage.vyc
    public final /* bridge */ /* synthetic */ Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Serializable serializable) {
        return k(obj, obj2, obj3, obj4, obj5, (hq5) obj6, ((Number) serializable).intValue());
    }

    public final Object g(Object obj, Object obj2, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(this.a);
        m(oq5Var);
        int r = oq5Var.f(this) ? ild.r(2, 2) : ild.r(1, 2);
        Object obj3 = this.c;
        obj3.getClass();
        wct.o(4, obj3);
        Object invoke = ((ryc) obj3).invoke(obj, obj2, oq5Var, Integer.valueOf(r | i));
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new ig0(this, obj, obj2, i);
        }
        return invoke;
    }

    public final Object h(Object obj, Object obj2, Object obj3, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(this.a);
        m(oq5Var);
        int r = oq5Var.f(this) ? ild.r(2, 3) : ild.r(1, 3);
        Object obj4 = this.c;
        obj4.getClass();
        wct.o(5, obj4);
        Object invoke = ((tyc) obj4).invoke(obj, obj2, obj3, oq5Var, Integer.valueOf(r | i));
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new un5(i, 0, this, obj, obj2, obj3);
        }
        return invoke;
    }

    @Override // defpackage.xyc
    public final /* bridge */ /* synthetic */ Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        return l(obj, obj2, obj3, obj4, obj5, obj6, obj7, (hq5) obj8, ((Number) obj9).intValue());
    }

    @Override // defpackage.tyc
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return h(obj, obj2, obj3, (hq5) obj4, ((Number) obj5).intValue());
    }

    public final Object j(Object obj, Object obj2, Object obj3, Object obj4, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(this.a);
        m(oq5Var);
        int r = oq5Var.f(this) ? ild.r(2, 4) : ild.r(1, 4);
        Object obj5 = this.c;
        obj5.getClass();
        wct.o(6, obj5);
        Object b = ((uyc) obj5).b(obj, obj2, obj3, obj4, oq5Var, Integer.valueOf(r | i));
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new vl0(this, obj, obj2, obj3, obj4, i);
        }
        return b;
    }

    public final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(this.a);
        m(oq5Var);
        int r = oq5Var.f(this) ? ild.r(2, 5) : ild.r(1, 5);
        Object obj6 = this.c;
        obj6.getClass();
        wct.o(7, obj6);
        Object f = ((vyc) obj6).f(obj, obj2, obj3, obj4, obj5, oq5Var, Integer.valueOf(i | r));
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new al0(this, obj, obj2, obj3, obj4, obj5, i);
        }
        return f;
    }

    public final Object l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(this.a);
        m(oq5Var);
        int r = oq5Var.f(this) ? ild.r(2, 7) : ild.r(1, 7);
        Object obj8 = this.c;
        obj8.getClass();
        wct.o(9, obj8);
        Object i2 = ((xyc) obj8).i(obj, obj2, obj3, obj4, obj5, obj6, obj7, oq5Var, Integer.valueOf(i | r));
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new vn5(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, i);
        }
        return i2;
    }

    public final void m(hq5 hq5Var) {
        oq5 oq5Var;
        xmn x;
        if (!this.b || (x = (oq5Var = (oq5) hq5Var).x()) == null) {
            return;
        }
        oq5Var.getClass();
        x.a |= 1;
        if (ild.D(this.d, x)) {
            this.d = x;
            return;
        }
        ArrayList arrayList = this.e;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.e = arrayList2;
            arrayList2.add(x);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (ild.D((xmn) arrayList.get(i), x)) {
                arrayList.set(i, x);
                return;
            }
        }
        arrayList.add(x);
    }

    public final void n(syc sycVar) {
        if (Intrinsics.d(this.c, sycVar)) {
            return;
        }
        boolean z = this.c == null;
        this.c = sycVar;
        if (z || !this.b) {
            return;
        }
        xmn xmnVar = this.d;
        if (xmnVar != null) {
            ymn ymnVar = xmnVar.b;
            if (ymnVar != null) {
                ymnVar.b(xmnVar, null);
            }
            this.d = null;
        }
        ArrayList arrayList = this.e;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                xmn xmnVar2 = (xmn) arrayList.get(i);
                ymn ymnVar2 = xmnVar2.b;
                if (ymnVar2 != null) {
                    ymnVar2.b(xmnVar2, null);
                }
            }
            arrayList.clear();
        }
    }

    @Override // defpackage.pyc
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return d(((Number) obj3).intValue(), (hq5) obj2, obj);
    }

    @Override // defpackage.ryc
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return g(obj, obj2, (hq5) obj3, ((Number) obj4).intValue());
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return a(((Number) obj2).intValue(), (hq5) obj);
    }
}
