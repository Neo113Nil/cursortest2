package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ir1 implements sdr {
    public final List a;
    public final ldt b;
    public final Function1 c;
    public final x6k d;
    public boolean e = true;

    public ir1(List list, Object obj, ldt ldtVar, nsh nshVar, Function1 function1, vg0 vg0Var) {
        this.a = list;
        this.b = ldtVar;
        this.c = function1;
        this.d = szf.g0(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00ad A[Catch: all -> 0x0036, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0036, blocks: (B:13:0x0031, B:16:0x00ad), top: B:12:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00ad -> B:14:0x00b6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        hr1 hr1Var;
        int i;
        ir1 ir1Var;
        int size;
        List list;
        int i2;
        if (cg6Var instanceof hr1) {
            hr1Var = (hr1) cg6Var;
            int i3 = hr1Var.q;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                hr1Var.q = i3 - Integer.MIN_VALUE;
                Object obj = hr1Var.o;
                nm6 nm6Var = nm6.a;
                i = hr1Var.q;
                if (i == 0) {
                    if (i == 1) {
                        int i4 = hr1Var.n;
                        int i5 = hr1Var.m;
                        t2o t2oVar = hr1Var.l;
                        List list2 = hr1Var.k;
                        ir1 ir1Var2 = hr1Var.j;
                        try {
                            qgg.h0(obj);
                            if (obj != null) {
                                ldt ldtVar = ir1Var2.b;
                                x6k x6kVar = ir1Var2.d;
                                x6kVar.setValue(ild.F(ldtVar.d, obj, t2oVar, ldtVar.b, ldtVar.c));
                                Unit unit = Unit.a;
                                boolean X = saf.X(hr1Var.getContext());
                                ir1Var2.e = false;
                                ir1Var2.c.invoke(new ndt(x6kVar.getValue(), X));
                                return unit;
                            }
                            hr1Var.j = ir1Var2;
                            hr1Var.k = list2;
                            hr1Var.l = null;
                            hr1Var.m = i5;
                            hr1Var.n = i4;
                            hr1Var.q = 2;
                            if (a4g.T(hr1Var) == nm6Var) {
                                return nm6Var;
                            }
                            size = i4;
                            i2 = i5;
                            list = list2;
                            ir1Var = ir1Var2;
                        } catch (Throwable th) {
                            th = th;
                            ir1Var = ir1Var2;
                        }
                    } else {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        size = hr1Var.n;
                        i2 = hr1Var.m;
                        list = hr1Var.k;
                        ir1Var = hr1Var.j;
                        try {
                            qgg.h0(obj);
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    i2++;
                    if (i2 < size) {
                        ((t2o) list.get(i2)).getClass();
                        i2++;
                        if (i2 < size) {
                            boolean X2 = saf.X(hr1Var.getContext());
                            ir1Var.e = false;
                            ir1Var.c.invoke(new ndt(ir1Var.d.getValue(), X2));
                            return Unit.a;
                        }
                    }
                } else {
                    qgg.h0(obj);
                    try {
                        List list3 = this.a;
                        size = list3.size();
                        ir1Var = this;
                        list = list3;
                        i2 = 0;
                        if (i2 < size) {
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        ir1Var = this;
                    }
                }
                boolean X3 = saf.X(hr1Var.getContext());
                ir1Var.e = false;
                ir1Var.c.invoke(new ndt(ir1Var.d.getValue(), X3));
                throw th;
            }
        }
        hr1Var = new hr1(this, cg6Var);
        Object obj2 = hr1Var.o;
        nm6 nm6Var2 = nm6.a;
        i = hr1Var.q;
        if (i == 0) {
        }
        boolean X32 = saf.X(hr1Var.getContext());
        ir1Var.e = false;
        ir1Var.c.invoke(new ndt(ir1Var.d.getValue(), X32));
        throw th;
    }

    @Override // defpackage.sdr
    public final Object getValue() {
        return this.d.getValue();
    }
}
