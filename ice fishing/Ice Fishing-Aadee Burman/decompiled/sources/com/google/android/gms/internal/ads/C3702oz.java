package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.oz, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3702oz extends AbstractC3810qz {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f32982f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final Map f32983g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f32984h;
    public final Object i;

    public C3702oz(C3979u6 c3979u6, C3218fz c3218fz, EnumC3593my enumC3593my, Context context, Map map, C3983uA c3983uA) {
        super("VfejF6jLqZSis5lDsrO62jUDAXJqP6cPz4mgjtZND5tZ2P5VWHtedQvP3pauMLAi", "2mDHoFGLT7ybGaRwjjkTGPAVzRPlkIteOrAkiSTAkLw=", c3979u6, c3218fz, c3983uA.a(121));
        this.f32984h = enumC3593my;
        this.i = context;
        this.f32983g = map;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3810qz
    public final void a(Method method, C3979u6 c3979u6) {
        switch (this.f32982f) {
            case 0:
                EnumC3593my enumC3593my = (EnumC3593my) this.f32984h;
                Integer valueOf = Integer.valueOf(enumC3593my.ordinal());
                Context context = (Context) this.i;
                Object obj = this.f32983g.get("up");
                Boolean bool = Boolean.TRUE;
                if (obj == null) {
                    obj = bool;
                }
                Object[] objArr = (Object[]) method.invoke("", valueOf, context, obj);
                objArr.getClass();
                synchronized (c3979u6) {
                    try {
                        if (enumC3593my == EnumC3593my.f32631n) {
                            Object obj2 = objArr[0];
                            if (obj2 == null) {
                                obj2 = r4;
                            }
                            long longValue = ((Long) obj2).longValue();
                            c3979u6.h();
                            ((H6) c3979u6.f27721u).B(longValue);
                            Object obj3 = objArr[1];
                            long longValue2 = ((Long) (obj3 != null ? obj3 : -1L)).longValue();
                            c3979u6.h();
                            ((H6) c3979u6.f27721u).C(longValue2);
                        }
                        long longValue3 = ((Long) objArr[2]).longValue();
                        c3979u6.h();
                        ((H6) c3979u6.f27721u).K0(longValue3);
                        long longValue4 = ((Long) objArr[3]).longValue();
                        c3979u6.h();
                        ((H6) c3979u6.f27721u).b0(longValue4);
                    } finally {
                    }
                }
                return;
            default:
                Map map = this.f32983g;
                MotionEvent motionEvent = (MotionEvent) map.get("nv");
                DisplayMetrics displayMetrics = (DisplayMetrics) this.i;
                Object[] objArr2 = (Object[]) method.invoke("", motionEvent, displayMetrics);
                objArr2.getClass();
                C6 A9 = D6.A();
                Object obj4 = objArr2[0];
                boolean z3 = true;
                if (obj4 != null && objArr2[1] != null) {
                    long longValue5 = ((Long) obj4).longValue();
                    A9.h();
                    ((D6) A9.f27721u).B(longValue5);
                    long longValue6 = ((Long) objArr2[1]).longValue();
                    A9.h();
                    ((D6) A9.f27721u).C(longValue6);
                }
                Object obj5 = objArr2[2];
                if (obj5 != null) {
                    long longValue7 = ((Long) obj5).longValue();
                    A9.h();
                    ((D6) A9.f27721u).I(longValue7);
                }
                Object obj6 = objArr2[3];
                if (obj6 != null) {
                    long longValue8 = ((Long) obj6).longValue();
                    A9.h();
                    ((D6) A9.f27721u).G(longValue8);
                }
                Object obj7 = objArr2[4];
                if (obj7 != null) {
                    long longValue9 = ((Long) obj7).longValue();
                    A9.h();
                    ((D6) A9.f27721u).D(longValue9);
                }
                Object obj8 = objArr2[5];
                if (obj8 != null) {
                    int i = ((Long) obj8).longValue() != 0 ? 2 : 1;
                    A9.h();
                    ((D6) A9.f27721u).T(i);
                }
                Object obj9 = objArr2[6];
                if (obj9 != null) {
                    long longValue10 = ((Long) obj9).longValue();
                    A9.h();
                    ((D6) A9.f27721u).K(longValue10);
                }
                Object obj10 = objArr2[7];
                if (obj10 != null) {
                    long longValue11 = ((Long) obj10).longValue();
                    A9.h();
                    ((D6) A9.f27721u).J(longValue11);
                }
                Object obj11 = objArr2[8];
                if (obj11 != null) {
                    int i6 = ((Long) obj11).longValue() != 0 ? 2 : 1;
                    A9.h();
                    ((D6) A9.f27721u).U(i6);
                }
                synchronized (c3979u6) {
                    try {
                        Method b9 = ((C3218fz) this.f32984h).b("ha9rMPg9+yg7CQJd8hulZYYnWyvcb9rIbXzM+WEcFYbGtaIOAjDJnYEoauGRuKjN", "nl2mD60ZrulhoIB3vhnGQRCpmcQlp+xDYCmCtO11lLQ=");
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
                            c3979u6.h();
                            ((H6) c3979u6.f27721u).L0(longValue12);
                        }
                        Object obj13 = objArr3[1];
                        if (obj13 != null) {
                            long longValue13 = ((Long) obj13).longValue();
                            c3979u6.h();
                            ((H6) c3979u6.f27721u).M0(longValue13);
                        }
                        Object obj14 = objArr3[2];
                        if (obj14 != null) {
                            long longValue14 = ((Long) obj14).longValue();
                            c3979u6.h();
                            ((H6) c3979u6.f27721u).N0(longValue14);
                        }
                        Object obj15 = objArr3[3];
                        if (obj15 != null) {
                            long longValue15 = ((Long) obj15).longValue();
                            c3979u6.h();
                            ((H6) c3979u6.f27721u).G(longValue15);
                        }
                        Object obj16 = objArr3[4];
                        if (obj16 != null) {
                            long longValue16 = ((Long) obj16).longValue();
                            c3979u6.h();
                            ((H6) c3979u6.f27721u).H(longValue16);
                        }
                        Ry ry = (Ry) map.get("oe");
                        if (ry != null) {
                            long j6 = ry.f27381a;
                            if (j6 > 0) {
                                c3979u6.h();
                                ((H6) c3979u6.f27721u).K(j6);
                            }
                            long j9 = ry.f27382b;
                            if (j9 > 0) {
                                c3979u6.h();
                                ((H6) c3979u6.f27721u).J(j9);
                            }
                            long j10 = ry.f27383c;
                            if (j10 > 0) {
                                c3979u6.h();
                                ((H6) c3979u6.f27721u).I(j10);
                            }
                            long j11 = ry.f27384d;
                            if (j11 > 0) {
                                c3979u6.h();
                                ((H6) c3979u6.f27721u).L(j11);
                            }
                        }
                        Ry ry2 = (Ry) map.get("oe");
                        if (ry2 != null && ry2.f27381a != 0) {
                            if ((displayMetrics == null || displayMetrics.density == 0.0f) ? false : true) {
                                double d2 = ry2.f27387g;
                                if (displayMetrics == null) {
                                    throw null;
                                }
                                long round = Math.round(d2 / displayMetrics.density);
                                A9.h();
                                ((D6) A9.f27721u).M(round);
                                long round2 = Math.round((ry2.f27389j - ry2.f27388h) / displayMetrics.density);
                                A9.h();
                                ((D6) A9.f27721u).N(round2);
                                long round3 = Math.round((ry2.f27390k - ry2.i) / displayMetrics.density);
                                A9.h();
                                ((D6) A9.f27721u).O(round3);
                                long round4 = Math.round(ry2.f27388h / displayMetrics.density);
                                A9.h();
                                ((D6) A9.f27721u).R(round4);
                                long round5 = Math.round(ry2.i / displayMetrics.density);
                                A9.h();
                                ((D6) A9.f27721u).S(round5);
                                if (((MotionEvent) map.get("nv")) != null) {
                                    long round6 = Math.round((((ry2.f27388h - ry2.f27389j) + r7.getRawX()) - r7.getX()) / displayMetrics.density);
                                    if (round6 != 0) {
                                        A9.h();
                                        ((D6) A9.f27721u).P(round6);
                                    }
                                    long round7 = Math.round((((ry2.i - ry2.f27390k) + r7.getRawY()) - r7.getY()) / displayMetrics.density);
                                    if (round7 != 0) {
                                        A9.h();
                                        ((D6) A9.f27721u).Q(round7);
                                    }
                                }
                            }
                        }
                        c3979u6.h();
                        ((H6) c3979u6.f27721u).T((D6) A9.j());
                        Sy[] syArr = (Sy[]) map.get("ro");
                        if (syArr != null) {
                            if (displayMetrics == null || displayMetrics.density == 0.0f) {
                                z3 = false;
                            }
                            if (z3) {
                                for (int i9 = 0; i9 <= syArr.length - 2; i9++) {
                                    Sy sy = syArr[i9];
                                    C6 A10 = D6.A();
                                    double d9 = sy.f27662a;
                                    if (displayMetrics == null) {
                                        throw null;
                                    }
                                    long round8 = Math.round(d9 / displayMetrics.density);
                                    A10.h();
                                    ((D6) A10.f27721u).B(round8);
                                    long round9 = Math.round(sy.f27663b / displayMetrics.density);
                                    A10.h();
                                    ((D6) A10.f27721u).C(round9);
                                    D6 d62 = (D6) A10.j();
                                    c3979u6.h();
                                    ((H6) c3979u6.f27721u).U(d62);
                                }
                            }
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    public C3702oz(C3979u6 c3979u6, C3218fz c3218fz, Map map, DisplayMetrics displayMetrics, C3983uA c3983uA) {
        super("yEN9KgeW2ShR+kJNMVm4gRcjBaCiP+NkfaG+4w0YdiFdjOQUuGzxN01qjMkIt53T", "+ZwABUDFslQ7udw7VsU5AeCjEmTqogfLUUw0gHzd544=", c3979u6, c3218fz, c3983uA.a(123));
        this.f32984h = c3218fz;
        this.f32983g = map;
        this.i = displayMetrics;
    }
}
