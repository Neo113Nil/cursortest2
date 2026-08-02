package com.yandex.music.core.ui.compose.draggable;

import defpackage.a3;
import defpackage.aur;
import defpackage.b6e;
import defpackage.b90;
import defpackage.bxj;
import defpackage.ca0;
import defpackage.cg6;
import defpackage.gld;
import defpackage.hqi;
import defpackage.imp;
import defpackage.ja0;
import defpackage.jx7;
import defpackage.l90;
import defpackage.ml7;
import defpackage.nm6;
import defpackage.nsh;
import defpackage.oa0;
import defpackage.poa;
import defpackage.qgg;
import defpackage.ra0;
import defpackage.ryc;
import defpackage.rz0;
import defpackage.s1r;
import defpackage.sa0;
import defpackage.tm0;
import defpackage.u10;
import defpackage.ua0;
import defpackage.uf7;
import defpackage.uoi;
import defpackage.uqn;
import defpackage.v5g;
import defpackage.va0;
import defpackage.w1r;
import defpackage.xq0;
import defpackage.yci;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class a {
    public static final uf7 a = new uf7(new imp());
    public static final StackTraceElement[] b = new StackTraceElement[0];
    public static final u10 c = new u10(21);

    public static final ja0 a(Object obj, Function1 function1, Function0 function0, tm0 tm0Var, uf7 uf7Var, Function1 function12) {
        tm0Var.getClass();
        uf7Var.getClass();
        function12.getClass();
        ja0 ja0Var = new ja0(obj);
        ja0Var.a = function12;
        ja0Var.b = function1;
        ja0Var.c = function0;
        ja0Var.d = tm0Var;
        ja0Var.e = uf7Var;
        return ja0Var;
    }

    public static final ml7 b(Function1 function1) {
        poa poaVar = new poa();
        function1.invoke(poaVar);
        float[] fArr = poaVar.b;
        ArrayList arrayList = poaVar.a;
        int size = arrayList.size();
        fArr.getClass();
        rz0.a(size, fArr.length);
        float[] copyOfRange = Arrays.copyOfRange(fArr, 0, size);
        copyOfRange.getClass();
        return new ml7(arrayList, copyOfRange);
    }

    public static final Object c(ja0 ja0Var, float f, ca0 ca0Var, ml7 ml7Var, Object obj, tm0 tm0Var, aur aurVar) {
        Object m;
        float d = ml7Var.d(obj);
        uqn uqnVar = new uqn();
        uqnVar.a = Float.isNaN(ja0Var.j.e()) ? 0.0f : ja0Var.j.e();
        if (!Float.isNaN(d)) {
            float f2 = uqnVar.a;
            if (f2 != d && (m = v5g.m(f2, d, f, tm0Var, new a3(2, ca0Var, uqnVar), aurVar)) == nm6.a) {
                return m;
            }
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(ml7 ml7Var, float f, float f2, Function1 function1, Function0 function0) {
        if (Float.isNaN(f)) {
            xq0.x("The offset provided to computeTarget must not be NaN.");
            return null;
        }
        boolean z = Math.abs(f2) > 0.0f;
        boolean z2 = z && f2 > 0.0f;
        if (!z) {
            Object a2 = ml7Var.a(f);
            a2.getClass();
            return a2;
        }
        if (Math.abs(f2) >= Math.abs(((Number) function0.invoke()).floatValue())) {
            Object b2 = ml7Var.b(z2, f);
            b2.getClass();
            return b2;
        }
        Object b3 = ml7Var.b(false, f);
        b3.getClass();
        float d = ml7Var.d(b3);
        Object b4 = ml7Var.b(true, f);
        b4.getClass();
        float d2 = ml7Var.d(b4);
        float abs = Math.abs(((Number) function1.invoke(Float.valueOf(Math.abs(d - d2)))).floatValue());
        if (!z2) {
            d = d2;
        }
        boolean z3 = Math.abs(d - f) >= abs;
        if (z3) {
            return z2 ? b4 : b3;
        }
        if (z3) {
            b6e.s();
            return null;
        }
        if (z2) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(Function0 function0, Function2 function2, cg6 cg6Var) {
        va0 va0Var;
        int i;
        if (cg6Var instanceof va0) {
            va0Var = (va0) cg6Var;
            int i2 = va0Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                va0Var.k = i2 - Integer.MIN_VALUE;
                Object obj = va0Var.j;
                nm6 nm6Var = nm6.a;
                i = va0Var.k;
                if (i != 0) {
                    qgg.h0(obj);
                    l90 l90Var = new l90(function0, function2, null, 2);
                    va0Var.k = 1;
                    if (gld.Q(l90Var, va0Var) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            }
        }
        va0Var = new va0(cg6Var);
        Object obj2 = va0Var.j;
        nm6 nm6Var2 = nm6.a;
        i = va0Var.k;
        if (i != 0) {
        }
        return Unit.a;
    }

    public static yci f(yci yciVar, ja0 ja0Var, bxj bxjVar, boolean z, uoi uoiVar, s1r s1rVar, int i) {
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        uoi uoiVar2 = (i & 8) != 0 ? null : uoiVar;
        s1r s1rVar2 = (i & 32) != 0 ? null : s1rVar;
        yciVar.getClass();
        ja0Var.getClass();
        return yciVar.f(new AnchoredDraggableElement(ja0Var, bxjVar, z2, uoiVar2, s1rVar2));
    }

    public static final s1r g(ja0 ja0Var, jx7 jx7Var, Function1 function1, tm0 tm0Var) {
        ja0Var.getClass();
        jx7Var.getClass();
        function1.getClass();
        tm0Var.getClass();
        nsh nshVar = new nsh(10, ja0Var, function1, new oa0(jx7Var, 1));
        float f = w1r.a;
        return new s1r(nshVar, a, tm0Var);
    }

    public static final Object h(ja0 ja0Var, Object obj, tm0 tm0Var, cg6 cg6Var) {
        Object a2 = ja0Var.a(obj, hqi.a, new ra0(ja0Var, tm0Var, null), cg6Var);
        return a2 == nm6.a ? a2 : Unit.a;
    }

    public static Object i(ja0 ja0Var, Enum r2, cg6 cg6Var) {
        tm0 tm0Var;
        if (ja0Var.d()) {
            tm0Var = ja0Var.d;
            if (tm0Var == null) {
                Intrinsics.j("snapAnimationSpec");
                throw null;
            }
        } else {
            tm0Var = b90.a;
        }
        return h(ja0Var, r2, tm0Var, cg6Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object j(ja0 ja0Var, Object obj, float f, tm0 tm0Var, uf7 uf7Var, cg6 cg6Var) {
        sa0 sa0Var;
        int i;
        float f2;
        uqn uqnVar;
        if (cg6Var instanceof sa0) {
            sa0Var = (sa0) cg6Var;
            int i2 = sa0Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sa0Var.m = i2 - Integer.MIN_VALUE;
                sa0 sa0Var2 = sa0Var;
                Object obj2 = sa0Var2.l;
                Object obj3 = nm6.a;
                i = sa0Var2.m;
                if (i != 0) {
                    qgg.h0(obj2);
                    uqn uqnVar2 = new uqn();
                    uqnVar2.a = f;
                    ryc ua0Var = new ua0(ja0Var, f, tm0Var, uqnVar2, uf7Var, null);
                    sa0Var2.j = uqnVar2;
                    sa0Var2.k = f;
                    sa0Var2.m = 1;
                    if (ja0Var.a(obj, hqi.a, ua0Var, sa0Var2) == obj3) {
                        return obj3;
                    }
                    f2 = f;
                    uqnVar = uqnVar2;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f2 = sa0Var2.k;
                    uqnVar = sa0Var2.j;
                    qgg.h0(obj2);
                }
                return new Float(f2 - uqnVar.a);
            }
        }
        sa0Var = new sa0(cg6Var);
        sa0 sa0Var22 = sa0Var;
        Object obj22 = sa0Var22.l;
        Object obj32 = nm6.a;
        i = sa0Var22.m;
        if (i != 0) {
        }
        return new Float(f2 - uqnVar.a);
    }

    public static Object k(ja0 ja0Var, Object obj, float f, cg6 cg6Var) {
        tm0 tm0Var;
        uf7 uf7Var;
        if (ja0Var.d()) {
            tm0Var = ja0Var.d;
            if (tm0Var == null) {
                Intrinsics.j("snapAnimationSpec");
                throw null;
            }
        } else {
            tm0Var = b90.a;
        }
        tm0 tm0Var2 = tm0Var;
        if (ja0Var.d()) {
            uf7Var = ja0Var.e;
            if (uf7Var == null) {
                Intrinsics.j("decayAnimationSpec");
                throw null;
            }
        } else {
            uf7Var = b90.c;
        }
        return j(ja0Var, obj, f, tm0Var2, uf7Var, cg6Var);
    }
}
