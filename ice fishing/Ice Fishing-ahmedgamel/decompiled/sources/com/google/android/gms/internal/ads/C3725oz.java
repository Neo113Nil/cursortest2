package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.oz, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3725oz extends AbstractC3833qz {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f33772f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final Map f33773g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f33774h;
    public final Object i;

    public C3725oz(C4002u6 c4002u6, C3241fz c3241fz, EnumC3616my enumC3616my, Context context, Map map, C4006uA c4006uA) {
        super("VfejF6jLqZSis5lDsrO62jUDAXJqP6cPz4mgjtZND5tZ2P5VWHtedQvP3pauMLAi", "2mDHoFGLT7ybGaRwjjkTGPAVzRPlkIteOrAkiSTAkLw=", c4002u6, c3241fz, c4006uA.a(121));
        this.f33774h = enumC3616my;
        this.i = context;
        this.f33773g = map;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3833qz
    public final void a(Method method, C4002u6 c4002u6) {
        switch (this.f33772f) {
            case 0:
                EnumC3616my enumC3616my = (EnumC3616my) this.f33774h;
                Integer valueOf = Integer.valueOf(enumC3616my.ordinal());
                Context context = (Context) this.i;
                Object obj = this.f33773g.get("up");
                Boolean bool = Boolean.TRUE;
                if (obj == null) {
                    obj = bool;
                }
                Object[] objArr = (Object[]) method.invoke("", valueOf, context, obj);
                objArr.getClass();
                synchronized (c4002u6) {
                    try {
                        if (enumC3616my == EnumC3616my.f33409n) {
                            Object obj2 = objArr[0];
                            if (obj2 == null) {
                                obj2 = r4;
                            }
                            long longValue = ((Long) obj2).longValue();
                            c4002u6.h();
                            ((H6) c4002u6.f28504u).B(longValue);
                            Object obj3 = objArr[1];
                            long longValue2 = ((Long) (obj3 != null ? obj3 : -1L)).longValue();
                            c4002u6.h();
                            ((H6) c4002u6.f28504u).C(longValue2);
                        }
                        long longValue3 = ((Long) objArr[2]).longValue();
                        c4002u6.h();
                        ((H6) c4002u6.f28504u).K0(longValue3);
                        long longValue4 = ((Long) objArr[3]).longValue();
                        c4002u6.h();
                        ((H6) c4002u6.f28504u).b0(longValue4);
                    } finally {
                    }
                }
                return;
            default:
                Map map = this.f33773g;
                MotionEvent motionEvent = (MotionEvent) map.get("nv");
                DisplayMetrics displayMetrics = (DisplayMetrics) this.i;
                Object[] objArr2 = (Object[]) method.invoke("", motionEvent, displayMetrics);
                objArr2.getClass();
                C6 A9 = D6.A();
                Object obj4 = objArr2[0];
                boolean z6 = true;
                if (obj4 != null && objArr2[1] != null) {
                    long longValue5 = ((Long) obj4).longValue();
                    A9.h();
                    ((D6) A9.f28504u).B(longValue5);
                    long longValue6 = ((Long) objArr2[1]).longValue();
                    A9.h();
                    ((D6) A9.f28504u).C(longValue6);
                }
                Object obj5 = objArr2[2];
                if (obj5 != null) {
                    long longValue7 = ((Long) obj5).longValue();
                    A9.h();
                    ((D6) A9.f28504u).I(longValue7);
                }
                Object obj6 = objArr2[3];
                if (obj6 != null) {
                    long longValue8 = ((Long) obj6).longValue();
                    A9.h();
                    ((D6) A9.f28504u).G(longValue8);
                }
                Object obj7 = objArr2[4];
                if (obj7 != null) {
                    long longValue9 = ((Long) obj7).longValue();
                    A9.h();
                    ((D6) A9.f28504u).D(longValue9);
                }
                Object obj8 = objArr2[5];
                if (obj8 != null) {
                    int i = ((Long) obj8).longValue() != 0 ? 2 : 1;
                    A9.h();
                    ((D6) A9.f28504u).T(i);
                }
                Object obj9 = objArr2[6];
                if (obj9 != null) {
                    long longValue10 = ((Long) obj9).longValue();
                    A9.h();
                    ((D6) A9.f28504u).K(longValue10);
                }
                Object obj10 = objArr2[7];
                if (obj10 != null) {
                    long longValue11 = ((Long) obj10).longValue();
                    A9.h();
                    ((D6) A9.f28504u).J(longValue11);
                }
                Object obj11 = objArr2[8];
                if (obj11 != null) {
                    int i4 = ((Long) obj11).longValue() != 0 ? 2 : 1;
                    A9.h();
                    ((D6) A9.f28504u).U(i4);
                }
                synchronized (c4002u6) {
                    try {
                        Method b9 = ((C3241fz) this.f33774h).b("ha9rMPg9+yg7CQJd8hulZYYnWyvcb9rIbXzM+WEcFYbGtaIOAjDJnYEoauGRuKjN", "nl2mD60ZrulhoIB3vhnGQRCpmcQlp+xDYCmCtO11lLQ=");
                        if (b9 == null) {
                            throw null;
                        }
                        Object[] objArr3 = (Object[]) b9.invoke("", (MotionEvent) map.get("nv"), displayMetrics);
                        if (objArr3 == null) {
                            throw null;
                        }
                        Object obj12 = objArr3[0];
                        if (obj12 != null) {
                            long longValue12 = ((Long) obj12).longValue();
                            c4002u6.h();
                            ((H6) c4002u6.f28504u).L0(longValue12);
                        }
                        Object obj13 = objArr3[1];
                        if (obj13 != null) {
                            long longValue13 = ((Long) obj13).longValue();
                            c4002u6.h();
                            ((H6) c4002u6.f28504u).M0(longValue13);
                        }
                        Object obj14 = objArr3[2];
                        if (obj14 != null) {
                            long longValue14 = ((Long) obj14).longValue();
                            c4002u6.h();
                            ((H6) c4002u6.f28504u).N0(longValue14);
                        }
                        Object obj15 = objArr3[3];
                        if (obj15 != null) {
                            long longValue15 = ((Long) obj15).longValue();
                            c4002u6.h();
                            ((H6) c4002u6.f28504u).G(longValue15);
                        }
                        Object obj16 = objArr3[4];
                        if (obj16 != null) {
                            long longValue16 = ((Long) obj16).longValue();
                            c4002u6.h();
                            ((H6) c4002u6.f28504u).H(longValue16);
                        }
                        Ry ry = (Ry) map.get("oe");
                        if (ry != null) {
                            long j6 = ry.f28095a;
                            if (j6 > 0) {
                                c4002u6.h();
                                ((H6) c4002u6.f28504u).K(j6);
                            }
                            long j9 = ry.f28096b;
                            if (j9 > 0) {
                                c4002u6.h();
                                ((H6) c4002u6.f28504u).J(j9);
                            }
                            long j10 = ry.f28097c;
                            if (j10 > 0) {
                                c4002u6.h();
                                ((H6) c4002u6.f28504u).I(j10);
                            }
                            long j11 = ry.f28098d;
                            if (j11 > 0) {
                                c4002u6.h();
                                ((H6) c4002u6.f28504u).L(j11);
                            }
                        }
                        Ry ry2 = (Ry) map.get("oe");
                        if (ry2 != null && ry2.f28095a != 0) {
                            if ((displayMetrics == null || displayMetrics.density == 0.0f) ? false : true) {
                                double d9 = ry2.f28101g;
                                if (displayMetrics == null) {
                                    throw null;
                                }
                                long round = Math.round(d9 / displayMetrics.density);
                                A9.h();
                                ((D6) A9.f28504u).M(round);
                                long round2 = Math.round((ry2.f28103j - ry2.f28102h) / displayMetrics.density);
                                A9.h();
                                ((D6) A9.f28504u).N(round2);
                                long round3 = Math.round((ry2.f28104k - ry2.i) / displayMetrics.density);
                                A9.h();
                                ((D6) A9.f28504u).O(round3);
                                long round4 = Math.round(ry2.f28102h / displayMetrics.density);
                                A9.h();
                                ((D6) A9.f28504u).R(round4);
                                long round5 = Math.round(ry2.i / displayMetrics.density);
                                A9.h();
                                ((D6) A9.f28504u).S(round5);
                                if (((MotionEvent) map.get("nv")) != null) {
                                    long round6 = Math.round((((ry2.f28102h - ry2.f28103j) + r7.getRawX()) - r7.getX()) / displayMetrics.density);
                                    if (round6 != 0) {
                                        A9.h();
                                        ((D6) A9.f28504u).P(round6);
                                    }
                                    long round7 = Math.round((((ry2.i - ry2.f28104k) + r7.getRawY()) - r7.getY()) / displayMetrics.density);
                                    if (round7 != 0) {
                                        A9.h();
                                        ((D6) A9.f28504u).Q(round7);
                                    }
                                }
                            }
                        }
                        c4002u6.h();
                        ((H6) c4002u6.f28504u).T((D6) A9.j());
                        Sy[] syArr = (Sy[]) map.get("ro");
                        if (syArr != null) {
                            if (displayMetrics == null || displayMetrics.density == 0.0f) {
                                z6 = false;
                            }
                            if (z6) {
                                for (int i6 = 0; i6 <= syArr.length - 2; i6++) {
                                    Sy sy = syArr[i6];
                                    C6 A10 = D6.A();
                                    double d10 = sy.f28445a;
                                    if (displayMetrics == null) {
                                        throw null;
                                    }
                                    long round8 = Math.round(d10 / displayMetrics.density);
                                    A10.h();
                                    ((D6) A10.f28504u).B(round8);
                                    long round9 = Math.round(sy.f28446b / displayMetrics.density);
                                    A10.h();
                                    ((D6) A10.f28504u).C(round9);
                                    D6 d62 = (D6) A10.j();
                                    c4002u6.h();
                                    ((H6) c4002u6.f28504u).U(d62);
                                }
                            }
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    public C3725oz(C4002u6 c4002u6, C3241fz c3241fz, Map map, DisplayMetrics displayMetrics, C4006uA c4006uA) {
        super("yEN9KgeW2ShR+kJNMVm4gRcjBaCiP+NkfaG+4w0YdiFdjOQUuGzxN01qjMkIt53T", "+ZwABUDFslQ7udw7VsU5AeCjEmTqogfLUUw0gHzd544=", c4002u6, c3241fz, c4006uA.a(123));
        this.f33774h = c3241fz;
        this.f33773g = map;
        this.i = displayMetrics;
    }
}
