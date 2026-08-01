package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class L7 extends Q7 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f26066h = 3;
    public final Object i;

    public L7(C4196y7 c4196y7, C3979u6 c3979u6, int i, View view) {
        super(c4196y7, "K/Oo81d3D7QQWAvkxOkmH49qSlOsGQFHscMya6S21HBqr+GdnpBDhLtEJWB1CCZB", "Ge8je/arysmNa4UdtKuRe+4JSpIyhDOrTZ5OtsYb5ag=", c3979u6, i, 57);
        this.i = view;
    }

    @Override // com.google.android.gms.internal.ads.Q7
    public final void a() {
        switch (this.f26066h) {
            case 0:
                Method method = this.f26983e;
                F0 f02 = (F0) this.i;
                long[] jArr = (long[]) method.invoke(null, Long.valueOf(f02.f24703c), Long.valueOf(f02.f24704d), Long.valueOf(f02.f24705e), Long.valueOf(f02.f24706f));
                C3979u6 c3979u6 = this.f26982d;
                synchronized (c3979u6) {
                    long j6 = jArr[0];
                    c3979u6.h();
                    ((H6) c3979u6.f27721u).j0(j6);
                    long j9 = jArr[1];
                    c3979u6.h();
                    ((H6) c3979u6.f27721u).k0(j9);
                }
                return;
            case 1:
                Method method2 = this.f26983e;
                Qx qx = (Qx) this.i;
                List list = (List) qx.f27139u;
                qx.f27139u = Collections.EMPTY_LIST;
                int intValue = ((Integer) method2.invoke(null, list)).intValue();
                C3979u6 c3979u62 = this.f26982d;
                synchronized (c3979u62) {
                    int a9 = AbstractC3043cl.a(intValue);
                    c3979u62.h();
                    ((H6) c3979u62.f27721u).u0(a9);
                }
                return;
            case 2:
                StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) this.i;
                if (stackTraceElementArr != null) {
                    C3603n7 c3603n7 = new C3603n7((String) this.f26983e.invoke(null, stackTraceElementArr));
                    C3979u6 c3979u63 = this.f26982d;
                    synchronized (c3979u63) {
                        try {
                            long longValue = c3603n7.f32687K.longValue();
                            c3979u63.h();
                            ((H6) c3979u63.f27721u).N(longValue);
                            if (((Boolean) c3603n7.f32688L).booleanValue()) {
                                int i = true != ((Boolean) c3603n7.f32689M).booleanValue() ? 2 : 1;
                                c3979u63.h();
                                ((H6) c3979u63.f27721u).r0(i);
                            } else {
                                c3979u63.h();
                                ((H6) c3979u63.f27721u).r0(3);
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
                    C3301ha c3301ha = AbstractC3569ma.f32301l4;
                    q2.r rVar = q2.r.f40207e;
                    Boolean bool = (Boolean) rVar.f40210c.a(c3301ha);
                    Boolean bool2 = (Boolean) rVar.f40210c.a(AbstractC3569ma.rc);
                    String str = (String) this.f26983e.invoke(null, view, this.f26979a.f35095a.getResources().getDisplayMetrics(), bool, bool2);
                    B7 b72 = new B7(19);
                    HashMap p9 = MA.p(str);
                    if (p9 != null) {
                        b72.J = (Long) p9.get(0);
                        b72.f23850K = (Long) p9.get(1);
                        b72.f23851L = (Long) p9.get(2);
                        b72.f23852M = (Long) p9.get(3);
                        b72.f23853N = (Long) p9.get(4);
                    }
                    E6 A9 = F6.A();
                    long longValue2 = b72.J.longValue();
                    A9.h();
                    ((F6) A9.f27721u).C(longValue2);
                    long longValue3 = b72.f23850K.longValue();
                    A9.h();
                    ((F6) A9.f27721u).D(longValue3);
                    long longValue4 = b72.f23851L.longValue();
                    A9.h();
                    ((F6) A9.f27721u).E(longValue4);
                    if (bool2.booleanValue()) {
                        long longValue5 = b72.f23853N.longValue();
                        A9.h();
                        ((F6) A9.f27721u).B(longValue5);
                    }
                    if (bool.booleanValue()) {
                        long longValue6 = b72.f23852M.longValue();
                        A9.h();
                        ((F6) A9.f27721u).F(longValue6);
                    }
                    F6 f62 = (F6) A9.j();
                    C3979u6 c3979u64 = this.f26982d;
                    c3979u64.h();
                    ((H6) c3979u64.f27721u).W(f62);
                    return;
                }
                return;
        }
    }

    public L7(C4196y7 c4196y7, C3979u6 c3979u6, int i, F0 f02) {
        super(c4196y7, "4UiqdD16WGcqj9vsERkA6tbA4c/2yE/sXnYMi3TR5nPXoyMXncc0iB8g5zhndeqU", "5yR6P4d4j2VnbvLNLQtiv9yBd7AWiKZJ6Mp0Kq9QPto=", c3979u6, i, 85);
        this.i = f02;
    }

    public L7(C4196y7 c4196y7, C3979u6 c3979u6, int i, Qx qx) {
        super(c4196y7, "/BhgxpXYgahRBmZkS3xjCzPdid3mZtzdZmJFkhACyEa2oS6asfWgI5KysEGcSPE9", "ngST2QkCVNtF272EQbVjeXMfCtACYPfIcakPMgsny7g=", c3979u6, i, 94);
        this.i = qx;
    }

    public L7(C4196y7 c4196y7, C3979u6 c3979u6, int i, StackTraceElement[] stackTraceElementArr) {
        super(c4196y7, "X/GUPFxOS4avlKtq36LXcZb7PXup/zZuW1HHrjvnbrOdArq87fiVHm1/XdqEH3+6", "yUIicuApz/OaGeh0f0RdAIADq1zJ0l0UU+b4jbryt0s=", c3979u6, i, 45);
        this.i = stackTraceElementArr;
    }
}
