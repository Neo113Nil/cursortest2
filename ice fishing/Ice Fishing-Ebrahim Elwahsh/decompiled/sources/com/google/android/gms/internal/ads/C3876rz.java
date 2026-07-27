package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.rz, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3876rz extends AbstractC3984tz {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f34146f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final Map f34147g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f34148h;
    public final Object i;

    public C3876rz(C3830r6 c3830r6, C3391iz c3391iz, EnumC3714oy enumC3714oy, Context context, Map map, C4158xA c4158xA) {
        super("3At8eFbAjAqsz9p03G/poStdLmldcsHDf7hwtHq+b9glp6N8klzSrT8HZ4GJjVN5", "mjdtNA0QQNNvx7gc0+BIhw0NZpaH3AMuijVtb9zt66I=", c3830r6, c3391iz, c4158xA.a(121));
        this.f34148h = enumC3714oy;
        this.i = context;
        this.f34147g = map;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3984tz
    public final void a(Method method, C3830r6 c3830r6) {
        switch (this.f34146f) {
            case 0:
                EnumC3714oy enumC3714oy = (EnumC3714oy) this.f34148h;
                Integer valueOf = Integer.valueOf(enumC3714oy.ordinal());
                Context context = (Context) this.i;
                Object obj = this.f34147g.get("up");
                Boolean bool = Boolean.TRUE;
                if (obj == null) {
                    obj = bool;
                }
                Object[] objArr = (Object[]) method.invoke("", valueOf, context, obj);
                objArr.getClass();
                synchronized (c3830r6) {
                    try {
                        if (enumC3714oy == EnumC3714oy.f33238n) {
                            Object obj2 = objArr[0];
                            if (obj2 == null) {
                                obj2 = r4;
                            }
                            long longValue = ((Long) obj2).longValue();
                            c3830r6.h();
                            ((D6) c3830r6.f30000u).B(longValue);
                            Object obj3 = objArr[1];
                            long longValue2 = ((Long) (obj3 != null ? obj3 : -1L)).longValue();
                            c3830r6.h();
                            ((D6) c3830r6.f30000u).C(longValue2);
                        }
                        long longValue3 = ((Long) objArr[2]).longValue();
                        c3830r6.h();
                        ((D6) c3830r6.f30000u).K0(longValue3);
                        long longValue4 = ((Long) objArr[3]).longValue();
                        c3830r6.h();
                        ((D6) c3830r6.f30000u).b0(longValue4);
                    } finally {
                    }
                }
                return;
            default:
                Map map = this.f34147g;
                MotionEvent motionEvent = (MotionEvent) map.get("nv");
                DisplayMetrics displayMetrics = (DisplayMetrics) this.i;
                Object[] objArr2 = (Object[]) method.invoke("", motionEvent, displayMetrics);
                objArr2.getClass();
                C4262z6 A8 = A6.A();
                Object obj4 = objArr2[0];
                boolean z8 = true;
                if (obj4 != null && objArr2[1] != null) {
                    long longValue5 = ((Long) obj4).longValue();
                    A8.h();
                    ((A6) A8.f30000u).B(longValue5);
                    long longValue6 = ((Long) objArr2[1]).longValue();
                    A8.h();
                    ((A6) A8.f30000u).C(longValue6);
                }
                Object obj5 = objArr2[2];
                if (obj5 != null) {
                    long longValue7 = ((Long) obj5).longValue();
                    A8.h();
                    ((A6) A8.f30000u).I(longValue7);
                }
                Object obj6 = objArr2[3];
                if (obj6 != null) {
                    long longValue8 = ((Long) obj6).longValue();
                    A8.h();
                    ((A6) A8.f30000u).G(longValue8);
                }
                Object obj7 = objArr2[4];
                if (obj7 != null) {
                    long longValue9 = ((Long) obj7).longValue();
                    A8.h();
                    ((A6) A8.f30000u).D(longValue9);
                }
                Object obj8 = objArr2[5];
                if (obj8 != null) {
                    int i = ((Long) obj8).longValue() != 0 ? 2 : 1;
                    A8.h();
                    ((A6) A8.f30000u).T(i);
                }
                Object obj9 = objArr2[6];
                if (obj9 != null) {
                    long longValue10 = ((Long) obj9).longValue();
                    A8.h();
                    ((A6) A8.f30000u).K(longValue10);
                }
                Object obj10 = objArr2[7];
                if (obj10 != null) {
                    long longValue11 = ((Long) obj10).longValue();
                    A8.h();
                    ((A6) A8.f30000u).J(longValue11);
                }
                Object obj11 = objArr2[8];
                if (obj11 != null) {
                    int i4 = ((Long) obj11).longValue() != 0 ? 2 : 1;
                    A8.h();
                    ((A6) A8.f30000u).U(i4);
                }
                synchronized (c3830r6) {
                    try {
                        Method b9 = ((C3391iz) this.f34148h).b("8cUAbwpt6SKUQHhtSwuMmdGkTrID2QvHq2LA27x2GE3ivBr88edu7HCA+XurISAj", "khOZexiJY4Vla3osCKZbCsXRCvuYnTPcWDFUfUGsZNQ=");
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
                            c3830r6.h();
                            ((D6) c3830r6.f30000u).L0(longValue12);
                        }
                        Object obj13 = objArr3[1];
                        if (obj13 != null) {
                            long longValue13 = ((Long) obj13).longValue();
                            c3830r6.h();
                            ((D6) c3830r6.f30000u).M0(longValue13);
                        }
                        Object obj14 = objArr3[2];
                        if (obj14 != null) {
                            long longValue14 = ((Long) obj14).longValue();
                            c3830r6.h();
                            ((D6) c3830r6.f30000u).N0(longValue14);
                        }
                        Object obj15 = objArr3[3];
                        if (obj15 != null) {
                            long longValue15 = ((Long) obj15).longValue();
                            c3830r6.h();
                            ((D6) c3830r6.f30000u).G(longValue15);
                        }
                        Object obj16 = objArr3[4];
                        if (obj16 != null) {
                            long longValue16 = ((Long) obj16).longValue();
                            c3830r6.h();
                            ((D6) c3830r6.f30000u).H(longValue16);
                        }
                        Ty ty = (Ty) map.get("oe");
                        if (ty != null) {
                            long j9 = ty.f27881a;
                            if (j9 > 0) {
                                c3830r6.h();
                                ((D6) c3830r6.f30000u).K(j9);
                            }
                            long j10 = ty.f27882b;
                            if (j10 > 0) {
                                c3830r6.h();
                                ((D6) c3830r6.f30000u).J(j10);
                            }
                            long j11 = ty.f27883c;
                            if (j11 > 0) {
                                c3830r6.h();
                                ((D6) c3830r6.f30000u).I(j11);
                            }
                            long j12 = ty.f27884d;
                            if (j12 > 0) {
                                c3830r6.h();
                                ((D6) c3830r6.f30000u).L(j12);
                            }
                        }
                        Ty ty2 = (Ty) map.get("oe");
                        if (ty2 != null && ty2.f27881a != 0) {
                            if ((displayMetrics == null || displayMetrics.density == 0.0f) ? false : true) {
                                double d2 = ty2.f27887g;
                                if (displayMetrics == null) {
                                    throw null;
                                }
                                long round = Math.round(d2 / displayMetrics.density);
                                A8.h();
                                ((A6) A8.f30000u).M(round);
                                long round2 = Math.round((ty2.f27889j - ty2.f27888h) / displayMetrics.density);
                                A8.h();
                                ((A6) A8.f30000u).N(round2);
                                long round3 = Math.round((ty2.f27890k - ty2.i) / displayMetrics.density);
                                A8.h();
                                ((A6) A8.f30000u).O(round3);
                                long round4 = Math.round(ty2.f27888h / displayMetrics.density);
                                A8.h();
                                ((A6) A8.f30000u).R(round4);
                                long round5 = Math.round(ty2.i / displayMetrics.density);
                                A8.h();
                                ((A6) A8.f30000u).S(round5);
                                if (((MotionEvent) map.get("nv")) != null) {
                                    long round6 = Math.round((((ty2.f27888h - ty2.f27889j) + r7.getRawX()) - r7.getX()) / displayMetrics.density);
                                    if (round6 != 0) {
                                        A8.h();
                                        ((A6) A8.f30000u).P(round6);
                                    }
                                    long round7 = Math.round((((ty2.i - ty2.f27890k) + r7.getRawY()) - r7.getY()) / displayMetrics.density);
                                    if (round7 != 0) {
                                        A8.h();
                                        ((A6) A8.f30000u).Q(round7);
                                    }
                                }
                            }
                        }
                        c3830r6.h();
                        ((D6) c3830r6.f30000u).T((A6) A8.j());
                        Uy[] uyArr = (Uy[]) map.get("ro");
                        if (uyArr != null) {
                            if (displayMetrics == null || displayMetrics.density == 0.0f) {
                                z8 = false;
                            }
                            if (z8) {
                                for (int i9 = 0; i9 <= uyArr.length - 2; i9++) {
                                    Uy uy = uyArr[i9];
                                    C4262z6 A9 = A6.A();
                                    double d3 = uy.f28192a;
                                    if (displayMetrics == null) {
                                        throw null;
                                    }
                                    long round8 = Math.round(d3 / displayMetrics.density);
                                    A9.h();
                                    ((A6) A9.f30000u).B(round8);
                                    long round9 = Math.round(uy.f28193b / displayMetrics.density);
                                    A9.h();
                                    ((A6) A9.f30000u).C(round9);
                                    A6 a62 = (A6) A9.j();
                                    c3830r6.h();
                                    ((D6) c3830r6.f30000u).U(a62);
                                }
                            }
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    public C3876rz(C3830r6 c3830r6, C3391iz c3391iz, Map map, DisplayMetrics displayMetrics, C4158xA c4158xA) {
        super("O/IhSczWkqH+q2aziu5mnePClwI2VInt8+rK2r5DAzxhVznO7DMyVuowa8d0HFxQ", "c/euB7bpmuTDKGTS9kQ/O7Lr64QuDKreUuxk5moaYNc=", c3830r6, c3391iz, c4158xA.a(123));
        this.f34148h = c3391iz;
        this.f34147g = map;
        this.i = displayMetrics;
    }
}
