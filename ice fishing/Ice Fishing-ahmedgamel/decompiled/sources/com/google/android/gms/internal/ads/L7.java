package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class L7 extends Q7 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f26866h = 3;
    public final Object i;

    public L7(C4219y7 c4219y7, C4002u6 c4002u6, int i, View view) {
        super(c4219y7, "K/Oo81d3D7QQWAvkxOkmH49qSlOsGQFHscMya6S21HBqr+GdnpBDhLtEJWB1CCZB", "Ge8je/arysmNa4UdtKuRe+4JSpIyhDOrTZ5OtsYb5ag=", c4002u6, i, 57);
        this.i = view;
    }

    @Override // com.google.android.gms.internal.ads.Q7
    public final void a() {
        switch (this.f26866h) {
            case 0:
                Method method = this.f27770e;
                F0 f02 = (F0) this.i;
                long[] jArr = (long[]) method.invoke(null, Long.valueOf(f02.f25459c), Long.valueOf(f02.f25460d), Long.valueOf(f02.f25461e), Long.valueOf(f02.f25462f));
                C4002u6 c4002u6 = this.f27769d;
                synchronized (c4002u6) {
                    long j6 = jArr[0];
                    c4002u6.h();
                    ((H6) c4002u6.f28504u).j0(j6);
                    long j9 = jArr[1];
                    c4002u6.h();
                    ((H6) c4002u6.f28504u).k0(j9);
                }
                return;
            case 1:
                Method method2 = this.f27770e;
                Qx qx = (Qx) this.i;
                List list = (List) qx.f27895u;
                qx.f27895u = Collections.EMPTY_LIST;
                int intValue = ((Integer) method2.invoke(null, list)).intValue();
                C4002u6 c4002u62 = this.f27769d;
                synchronized (c4002u62) {
                    int a9 = AbstractC3066cl.a(intValue);
                    c4002u62.h();
                    ((H6) c4002u62.f28504u).u0(a9);
                }
                return;
            case 2:
                StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) this.i;
                if (stackTraceElementArr != null) {
                    C3626n7 c3626n7 = new C3626n7((String) this.f27770e.invoke(null, stackTraceElementArr));
                    C4002u6 c4002u63 = this.f27769d;
                    synchronized (c4002u63) {
                        try {
                            long longValue = c3626n7.f33465K.longValue();
                            c4002u63.h();
                            ((H6) c4002u63.f28504u).N(longValue);
                            if (((Boolean) c3626n7.f33466L).booleanValue()) {
                                int i = true != ((Boolean) c3626n7.f33467M).booleanValue() ? 2 : 1;
                                c4002u63.h();
                                ((H6) c4002u63.f28504u).r0(i);
                            } else {
                                c4002u63.h();
                                ((H6) c4002u63.f28504u).r0(3);
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            default:
                View view = (View) this.i;
                if (view != null) {
                    C3324ha c3324ha = AbstractC3592ma.f33080l4;
                    s2.r rVar = s2.r.f40506e;
                    Boolean bool = (Boolean) rVar.f40509c.a(c3324ha);
                    Boolean bool2 = (Boolean) rVar.f40509c.a(AbstractC3592ma.rc);
                    String str = (String) this.f27770e.invoke(null, view, this.f27766a.f35881a.getResources().getDisplayMetrics(), bool, bool2);
                    B7 b72 = new B7(19);
                    HashMap p9 = MA.p(str);
                    if (p9 != null) {
                        b72.J = (Long) p9.get(0);
                        b72.f24621K = (Long) p9.get(1);
                        b72.f24622L = (Long) p9.get(2);
                        b72.f24623M = (Long) p9.get(3);
                        b72.f24624N = (Long) p9.get(4);
                    }
                    E6 A9 = F6.A();
                    long longValue2 = b72.J.longValue();
                    A9.h();
                    ((F6) A9.f28504u).C(longValue2);
                    long longValue3 = b72.f24621K.longValue();
                    A9.h();
                    ((F6) A9.f28504u).D(longValue3);
                    long longValue4 = b72.f24622L.longValue();
                    A9.h();
                    ((F6) A9.f28504u).E(longValue4);
                    if (bool2.booleanValue()) {
                        long longValue5 = b72.f24624N.longValue();
                        A9.h();
                        ((F6) A9.f28504u).B(longValue5);
                    }
                    if (bool.booleanValue()) {
                        long longValue6 = b72.f24623M.longValue();
                        A9.h();
                        ((F6) A9.f28504u).F(longValue6);
                    }
                    F6 f62 = (F6) A9.j();
                    C4002u6 c4002u64 = this.f27769d;
                    c4002u64.h();
                    ((H6) c4002u64.f28504u).W(f62);
                    return;
                }
                return;
        }
    }

    public L7(C4219y7 c4219y7, C4002u6 c4002u6, int i, F0 f02) {
        super(c4219y7, "4UiqdD16WGcqj9vsERkA6tbA4c/2yE/sXnYMi3TR5nPXoyMXncc0iB8g5zhndeqU", "5yR6P4d4j2VnbvLNLQtiv9yBd7AWiKZJ6Mp0Kq9QPto=", c4002u6, i, 85);
        this.i = f02;
    }

    public L7(C4219y7 c4219y7, C4002u6 c4002u6, int i, Qx qx) {
        super(c4219y7, "/BhgxpXYgahRBmZkS3xjCzPdid3mZtzdZmJFkhACyEa2oS6asfWgI5KysEGcSPE9", "ngST2QkCVNtF272EQbVjeXMfCtACYPfIcakPMgsny7g=", c4002u6, i, 94);
        this.i = qx;
    }

    public L7(C4219y7 c4219y7, C4002u6 c4002u6, int i, StackTraceElement[] stackTraceElementArr) {
        super(c4219y7, "X/GUPFxOS4avlKtq36LXcZb7PXup/zZuW1HHrjvnbrOdArq87fiVHm1/XdqEH3+6", "yUIicuApz/OaGeh0f0RdAIADq1zJ0l0UU+b4jbryt0s=", c4002u6, i, 45);
        this.i = stackTraceElementArr;
    }
}
