package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class nvr {
    public final tm0 a;
    public final Function1 b;
    public final x6k c;
    public final x6k d;
    public final t6k e;
    public final t6k f;
    public final t6k g;
    public final x6k h;
    public final x6k i;
    public final h7a j;
    public float k;
    public float l;
    public final x6k m;
    public final t6k n;
    public final x6k o;
    public final nl7 p;

    public nvr(tm0 tm0Var, Function1 function1) {
        whm whmVar = whm.b;
        this.a = tm0Var;
        this.b = function1;
        this.c = szf.g0(whmVar);
        this.d = szf.g0(Boolean.FALSE);
        this.e = new t6k(0.0f);
        this.f = new t6k(0.0f);
        this.g = new t6k(0.0f);
        this.h = szf.g0(null);
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        this.i = szf.g0(e5bVar);
        this.j = zsd.H0(new qk3(szf.s0(new kgk(27, this)), 9), 1);
        this.k = Float.NEGATIVE_INFINITY;
        this.l = Float.POSITIVE_INFINITY;
        this.m = szf.g0(epo.y0);
        this.n = new t6k(0.0f);
        this.o = szf.g0(null);
        hxo hxoVar = new hxo(17, this);
        kr3 kr3Var = zoa.a;
        this.p = new nl7(hxoVar);
    }

    public static Object b(nvr nvrVar, Object obj, Continuation continuation) {
        Object collect = nvrVar.j.collect(new hyl(6, obj, nvrVar, nvrVar.a), continuation);
        return collect == nm6.a ? collect : Unit.a;
    }

    public final Object a(float f, tm0 tm0Var, Continuation continuation) {
        Object a = this.p.a(hqi.a, new en0(this, f, tm0Var, (Continuation) null), continuation);
        return a == nm6.a ? a : Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a9, code lost:
    
        if (r11 == r1) goto L92;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0229 A[Catch: all -> 0x004e, TRY_LEAVE, TryCatch #4 {all -> 0x004e, blocks: (B:26:0x0049, B:30:0x020c, B:36:0x0229), top: B:25:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Map map, Map map2, cg6 cg6Var) {
        lvr lvrVar;
        int i;
        Object next;
        float floatValue;
        nvr nvrVar;
        nvr nvrVar2;
        Object next2;
        Object a;
        if (cg6Var instanceof lvr) {
            lvrVar = (lvr) cg6Var;
            int i2 = lvrVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lvrVar.o = i2 - Integer.MIN_VALUE;
                Object obj = lvrVar.m;
                nm6 nm6Var = nm6.a;
                i = lvrVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    boolean isEmpty = map.isEmpty();
                    x6k x6kVar = this.c;
                    if (isEmpty) {
                        Float c0 = CollectionsKt.c0(map2.keySet());
                        c0.getClass();
                        this.k = c0.floatValue();
                        Float a0 = CollectionsKt.a0(map2.keySet());
                        a0.getClass();
                        this.l = a0.floatValue();
                        Float v = q7g.v(x6kVar.getValue(), map2);
                        if (v == null) {
                            xq0.x("The initial value must have an associated anchor.");
                            return null;
                        }
                        float floatValue2 = v.floatValue();
                        lvrVar.o = 1;
                        Object a2 = this.p.a(hqi.a, new jwo(floatValue2, this, (Continuation) null), lvrVar);
                        if (a2 != nm6Var) {
                            a2 = Unit.a;
                        }
                    } else if (!Intrinsics.d(map2, map)) {
                        this.k = Float.NEGATIVE_INFINITY;
                        this.l = Float.POSITIVE_INFINITY;
                        Float f = (Float) this.h.getValue();
                        if (f != null) {
                            Float v2 = q7g.v(map.get(f), map2);
                            if (v2 != null) {
                                floatValue = v2.floatValue();
                            } else {
                                Iterator it = map2.keySet().iterator();
                                if (it.hasNext()) {
                                    next2 = it.next();
                                    if (it.hasNext()) {
                                        float abs = Math.abs(((Number) next2).floatValue() - f.floatValue());
                                        do {
                                            Object next3 = it.next();
                                            float abs2 = Math.abs(((Number) next3).floatValue() - f.floatValue());
                                            if (Float.compare(abs, abs2) > 0) {
                                                next2 = next3;
                                                abs = abs2;
                                            }
                                        } while (it.hasNext());
                                    }
                                } else {
                                    next2 = null;
                                }
                                next2.getClass();
                                floatValue = ((Number) next2).floatValue();
                            }
                        } else {
                            t6k t6kVar = this.e;
                            Object obj2 = map.get(t6kVar.getValue());
                            if (Intrinsics.d(obj2, x6kVar.getValue())) {
                                obj2 = x6kVar.getValue();
                            }
                            Float v3 = q7g.v(obj2, map2);
                            if (v3 != null) {
                                floatValue = v3.floatValue();
                            } else {
                                Iterator it2 = map2.keySet().iterator();
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    if (it2.hasNext()) {
                                        float abs3 = Math.abs(((Number) next).floatValue() - ((Number) t6kVar.getValue()).floatValue());
                                        do {
                                            Object next4 = it2.next();
                                            float abs4 = Math.abs(((Number) next4).floatValue() - ((Number) t6kVar.getValue()).floatValue());
                                            if (Float.compare(abs3, abs4) > 0) {
                                                next = next4;
                                                abs3 = abs4;
                                            }
                                        } while (it2.hasNext());
                                    }
                                } else {
                                    next = null;
                                }
                                next.getClass();
                                floatValue = ((Number) next).floatValue();
                            }
                        }
                        try {
                            tm0 tm0Var = this.a;
                            lvrVar.j = this;
                            lvrVar.k = map2;
                            lvrVar.l = floatValue;
                            lvrVar.o = 2;
                            if (a(floatValue, tm0Var, lvrVar) != nm6Var) {
                                nvrVar2 = this;
                                nvrVar2.d(uah.c(new Float(floatValue), map2));
                                Float c02 = CollectionsKt.c0(map2.keySet());
                                c02.getClass();
                                nvrVar2.k = c02.floatValue();
                                Float a02 = CollectionsKt.a0(map2.keySet());
                                a02.getClass();
                                nvrVar2.l = a02.floatValue();
                            }
                        } catch (CancellationException unused) {
                            nvrVar2 = this;
                            lvrVar.j = nvrVar2;
                            lvrVar.k = map2;
                            lvrVar.l = floatValue;
                            lvrVar.o = 3;
                            a = nvrVar2.p.a(hqi.a, new jwo(floatValue, nvrVar2, (Continuation) null), lvrVar);
                            if (a == nm6.a) {
                            }
                            if (a != nm6Var) {
                            }
                            return nm6Var;
                        } catch (Throwable th) {
                            th = th;
                            nvrVar = this;
                            nvrVar.d(uah.c(new Float(floatValue), map2));
                            Float c03 = CollectionsKt.c0(map2.keySet());
                            c03.getClass();
                            nvrVar.k = c03.floatValue();
                            Float a03 = CollectionsKt.a0(map2.keySet());
                            a03.getClass();
                            nvrVar.l = a03.floatValue();
                            throw th;
                        }
                    }
                    return nm6Var;
                }
                if (i == 1) {
                    qgg.h0(obj);
                    return Unit.a;
                }
                if (i == 2) {
                    floatValue = lvrVar.l;
                    map2 = lvrVar.k;
                    nvrVar2 = lvrVar.j;
                    try {
                        try {
                            qgg.h0(obj);
                            nvrVar2.d(uah.c(new Float(floatValue), map2));
                            Float c022 = CollectionsKt.c0(map2.keySet());
                            c022.getClass();
                            nvrVar2.k = c022.floatValue();
                            Float a022 = CollectionsKt.a0(map2.keySet());
                            a022.getClass();
                            nvrVar2.l = a022.floatValue();
                        } catch (CancellationException unused2) {
                            lvrVar.j = nvrVar2;
                            lvrVar.k = map2;
                            lvrVar.l = floatValue;
                            lvrVar.o = 3;
                            a = nvrVar2.p.a(hqi.a, new jwo(floatValue, nvrVar2, (Continuation) null), lvrVar);
                            if (a == nm6.a) {
                                a = Unit.a;
                            }
                            if (a != nm6Var) {
                                nvrVar = nvrVar2;
                                nvrVar.d(uah.c(new Float(floatValue), map2));
                                Float c04 = CollectionsKt.c0(map2.keySet());
                                c04.getClass();
                                nvrVar.k = c04.floatValue();
                                Float a04 = CollectionsKt.a0(map2.keySet());
                                a04.getClass();
                                nvrVar.l = a04.floatValue();
                                return Unit.a;
                            }
                            return nm6Var;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        nvrVar = nvrVar2;
                        nvrVar.d(uah.c(new Float(floatValue), map2));
                        Float c032 = CollectionsKt.c0(map2.keySet());
                        c032.getClass();
                        nvrVar.k = c032.floatValue();
                        Float a032 = CollectionsKt.a0(map2.keySet());
                        a032.getClass();
                        nvrVar.l = a032.floatValue();
                        throw th;
                    }
                } else {
                    if (i != 3) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    floatValue = lvrVar.l;
                    map2 = lvrVar.k;
                    nvrVar = lvrVar.j;
                    try {
                        qgg.h0(obj);
                        nvrVar.d(uah.c(new Float(floatValue), map2));
                        Float c042 = CollectionsKt.c0(map2.keySet());
                        c042.getClass();
                        nvrVar.k = c042.floatValue();
                        Float a042 = CollectionsKt.a0(map2.keySet());
                        a042.getClass();
                        nvrVar.l = a042.floatValue();
                    } catch (Throwable th3) {
                        th = th3;
                        nvrVar.d(uah.c(new Float(floatValue), map2));
                        Float c0322 = CollectionsKt.c0(map2.keySet());
                        c0322.getClass();
                        nvrVar.k = c0322.floatValue();
                        Float a0322 = CollectionsKt.a0(map2.keySet());
                        a0322.getClass();
                        nvrVar.l = a0322.floatValue();
                        throw th;
                    }
                }
                return Unit.a;
            }
        }
        lvrVar = new lvr(this, cg6Var);
        Object obj3 = lvrVar.m;
        nm6 nm6Var2 = nm6.a;
        i = lvrVar.o;
        if (i != 0) {
        }
        return Unit.a;
    }

    public final void d(Object obj) {
        this.c.setValue(obj);
    }
}
