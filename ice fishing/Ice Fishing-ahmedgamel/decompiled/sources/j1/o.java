package j1;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.lang.ref.WeakReference;
import k1.AbstractC4640b;
import k1.C4639a;
import l1.AbstractC4672g;
import m1.C4739a;
import q5.C4876a;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: b, reason: collision with root package name */
    public static s.l f38455b;

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f38454a = new LinearInterpolator();

    /* renamed from: c, reason: collision with root package name */
    public static final C4639a f38456c = C4639a.d("t", com.anythink.core.common.s.f17036a, "e", C4876a.PUSH_MINIFIED_BUTTONS_LIST, "i", "h", "to", "ti");

    /* renamed from: d, reason: collision with root package name */
    public static final C4639a f38457d = C4639a.d("x", "y");

    public static Interpolator a(PointF pointF, PointF pointF2) {
        WeakReference weakReference;
        Interpolator b9;
        pointF.x = AbstractC4672g.b(pointF.x, -1.0f, 1.0f);
        pointF.y = AbstractC4672g.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = AbstractC4672g.b(pointF2.x, -1.0f, 1.0f);
        float b10 = AbstractC4672g.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = b10;
        float f2 = pointF.x;
        float f9 = pointF.y;
        float f10 = pointF2.x;
        Matrix matrix = l1.i.f38862a;
        int i = f2 != 0.0f ? (int) (527 * f2) : 17;
        if (f9 != 0.0f) {
            i = (int) (i * 31 * f9);
        }
        if (f10 != 0.0f) {
            i = (int) (i * 31 * f10);
        }
        if (b10 != 0.0f) {
            i = (int) (i * 31 * b10);
        }
        synchronized (o.class) {
            if (f38455b == null) {
                f38455b = new s.l();
            }
            weakReference = (WeakReference) f38455b.b(i, null);
        }
        Interpolator interpolator = weakReference != null ? (Interpolator) weakReference.get() : null;
        if (weakReference != null && interpolator != null) {
            return interpolator;
        }
        try {
            b9 = Q.a.b(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e9) {
            b9 = "The Path cannot loop back on itself.".equals(e9.getMessage()) ? Q.a.b(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
        try {
            WeakReference weakReference2 = new WeakReference(b9);
            synchronized (o.class) {
                f38455b.c(i, weakReference2);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        return b9;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x002d. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [android.view.animation.Interpolator] */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.view.animation.Interpolator] */
    public static C4739a b(AbstractC4640b abstractC4640b, Z0.i iVar, float f2, D d9, boolean z6, boolean z9) {
        Object obj;
        LinearInterpolator a9;
        Object obj2;
        LinearInterpolator linearInterpolator;
        Interpolator a10;
        Interpolator a11;
        C4639a c4639a;
        Object obj3;
        C4639a c4639a2;
        PointF pointF;
        LinearInterpolator linearInterpolator2 = f38454a;
        C4639a c4639a3 = f38456c;
        if (!z6 || !z9) {
            C4639a c4639a4 = c4639a3;
            if (!z6) {
                return new C4739a(d9.b(abstractC4640b, f2));
            }
            abstractC4640b.j();
            PointF pointF2 = null;
            Object obj4 = null;
            float f9 = 0.0f;
            boolean z10 = false;
            PointF pointF3 = null;
            PointF pointF4 = null;
            PointF pointF5 = null;
            Object obj5 = null;
            while (abstractC4640b.D()) {
                C4639a c4639a5 = c4639a4;
                switch (abstractC4640b.K(c4639a5)) {
                    case 0:
                        f9 = (float) abstractC4640b.F();
                        break;
                    case 1:
                        obj5 = d9.b(abstractC4640b, f2);
                        break;
                    case 2:
                        obj4 = d9.b(abstractC4640b, f2);
                        break;
                    case 3:
                        pointF4 = n.b(abstractC4640b, 1.0f);
                        break;
                    case 4:
                        pointF2 = n.b(abstractC4640b, 1.0f);
                        break;
                    case 5:
                        if (abstractC4640b.G() != 1) {
                            z10 = false;
                            break;
                        } else {
                            z10 = true;
                            break;
                        }
                    case 6:
                        pointF3 = n.b(abstractC4640b, f2);
                        break;
                    case 7:
                        pointF5 = n.b(abstractC4640b, f2);
                        break;
                    default:
                        abstractC4640b.W();
                        break;
                }
                c4639a4 = c4639a5;
            }
            abstractC4640b.B();
            if (z10) {
                obj = obj5;
            } else {
                if (pointF4 != null && pointF2 != null) {
                    Object obj6 = obj4;
                    a9 = a(pointF4, pointF2);
                    obj = obj6;
                    C4739a c4739a = new C4739a(iVar, obj5, obj, a9, f9, (Float) null);
                    c4739a.f39353o = pointF3;
                    c4739a.f39354p = pointF5;
                    return c4739a;
                }
                obj = obj4;
            }
            a9 = linearInterpolator2;
            C4739a c4739a2 = new C4739a(iVar, obj5, obj, a9, f9, (Float) null);
            c4739a2.f39353o = pointF3;
            c4739a2.f39354p = pointF5;
            return c4739a2;
        }
        abstractC4640b.j();
        PointF pointF6 = null;
        PointF pointF7 = null;
        PointF pointF8 = null;
        boolean z11 = false;
        PointF pointF9 = null;
        PointF pointF10 = null;
        PointF pointF11 = null;
        Object obj7 = null;
        PointF pointF12 = null;
        PointF pointF13 = null;
        float f10 = 0.0f;
        Object obj8 = null;
        while (abstractC4640b.D()) {
            int K7 = abstractC4640b.K(c4639a3);
            C4639a c4639a6 = f38457d;
            LinearInterpolator linearInterpolator3 = linearInterpolator2;
            switch (K7) {
                case 0:
                    c4639a = c4639a3;
                    obj3 = obj7;
                    f10 = (float) abstractC4640b.F();
                    pointF12 = pointF12;
                    linearInterpolator2 = linearInterpolator3;
                    obj7 = obj3;
                    c4639a3 = c4639a;
                    break;
                case 1:
                    c4639a = c4639a3;
                    obj7 = d9.b(abstractC4640b, f2);
                    linearInterpolator2 = linearInterpolator3;
                    c4639a3 = c4639a;
                    break;
                case 2:
                    c4639a = c4639a3;
                    obj8 = d9.b(abstractC4640b, f2);
                    linearInterpolator2 = linearInterpolator3;
                    c4639a3 = c4639a;
                    break;
                case 3:
                    c4639a = c4639a3;
                    boolean z12 = z11;
                    obj3 = obj7;
                    PointF pointF14 = pointF12;
                    if (abstractC4640b.I() == 3) {
                        abstractC4640b.j();
                        float f11 = 0.0f;
                        float f12 = 0.0f;
                        float f13 = 0.0f;
                        float f14 = 0.0f;
                        while (abstractC4640b.D()) {
                            int K8 = abstractC4640b.K(c4639a6);
                            if (K8 != 0) {
                                if (K8 != 1) {
                                    abstractC4640b.W();
                                } else if (abstractC4640b.I() == 7) {
                                    f14 = (float) abstractC4640b.F();
                                    f12 = f14;
                                } else {
                                    abstractC4640b.b();
                                    f12 = (float) abstractC4640b.F();
                                    f14 = abstractC4640b.I() == 7 ? (float) abstractC4640b.F() : f12;
                                    abstractC4640b.z();
                                }
                            } else if (abstractC4640b.I() == 7) {
                                f13 = (float) abstractC4640b.F();
                                f11 = f13;
                            } else {
                                abstractC4640b.b();
                                f11 = (float) abstractC4640b.F();
                                f13 = abstractC4640b.I() == 7 ? (float) abstractC4640b.F() : f11;
                                abstractC4640b.z();
                            }
                        }
                        PointF pointF15 = new PointF(f11, f12);
                        pointF12 = new PointF(f13, f14);
                        abstractC4640b.B();
                        pointF11 = pointF15;
                    } else {
                        pointF9 = n.b(abstractC4640b, f2);
                        pointF12 = pointF14;
                    }
                    z11 = z12;
                    linearInterpolator2 = linearInterpolator3;
                    obj7 = obj3;
                    c4639a3 = c4639a;
                    break;
                case 4:
                    boolean z13 = z11;
                    if (abstractC4640b.I() == 3) {
                        abstractC4640b.j();
                        float f15 = 0.0f;
                        float f16 = 0.0f;
                        float f17 = 0.0f;
                        float f18 = 0.0f;
                        while (abstractC4640b.D()) {
                            Object obj9 = obj7;
                            int K9 = abstractC4640b.K(c4639a6);
                            if (K9 != 0) {
                                c4639a2 = c4639a3;
                                if (K9 != 1) {
                                    abstractC4640b.W();
                                } else if (abstractC4640b.I() == 7) {
                                    f18 = (float) abstractC4640b.F();
                                    pointF12 = pointF12;
                                    f16 = f18;
                                } else {
                                    pointF = pointF12;
                                    abstractC4640b.b();
                                    f16 = (float) abstractC4640b.F();
                                    f18 = abstractC4640b.I() == 7 ? (float) abstractC4640b.F() : f16;
                                    abstractC4640b.z();
                                    pointF12 = pointF;
                                }
                            } else {
                                c4639a2 = c4639a3;
                                pointF = pointF12;
                                if (abstractC4640b.I() == 7) {
                                    f17 = (float) abstractC4640b.F();
                                    pointF12 = pointF;
                                    f15 = f17;
                                } else {
                                    abstractC4640b.b();
                                    f15 = (float) abstractC4640b.F();
                                    f17 = abstractC4640b.I() == 7 ? (float) abstractC4640b.F() : f15;
                                    abstractC4640b.z();
                                    pointF12 = pointF;
                                }
                            }
                            obj7 = obj9;
                            c4639a3 = c4639a2;
                        }
                        c4639a = c4639a3;
                        PointF pointF16 = new PointF(f15, f16);
                        pointF6 = new PointF(f17, f18);
                        abstractC4640b.B();
                        pointF13 = pointF16;
                    } else {
                        c4639a = c4639a3;
                        pointF10 = n.b(abstractC4640b, f2);
                    }
                    z11 = z13;
                    linearInterpolator2 = linearInterpolator3;
                    c4639a3 = c4639a;
                    break;
                case 5:
                    z11 = abstractC4640b.G() == 1;
                    linearInterpolator2 = linearInterpolator3;
                    break;
                case 6:
                    pointF7 = n.b(abstractC4640b, f2);
                    linearInterpolator2 = linearInterpolator3;
                    break;
                case 7:
                    pointF8 = n.b(abstractC4640b, f2);
                    linearInterpolator2 = linearInterpolator3;
                    break;
                default:
                    abstractC4640b.W();
                    linearInterpolator2 = linearInterpolator3;
                    break;
            }
        }
        LinearInterpolator linearInterpolator4 = linearInterpolator2;
        boolean z14 = z11;
        Object obj10 = obj7;
        PointF pointF17 = pointF12;
        abstractC4640b.B();
        if (z14) {
            linearInterpolator = linearInterpolator4;
            obj2 = obj10;
        } else if (pointF9 != null && pointF10 != null) {
            linearInterpolator = a(pointF9, pointF10);
            obj2 = obj8;
        } else {
            if (pointF11 != null && pointF17 != null && pointF13 != null && pointF6 != null) {
                a10 = a(pointF11, pointF13);
                a11 = a(pointF17, pointF6);
                obj2 = obj8;
                linearInterpolator = null;
                C4739a c4739a3 = (a10 != null || a11 == null) ? new C4739a(iVar, obj10, obj2, linearInterpolator, f10, (Float) null) : new C4739a(iVar, obj10, obj2, a10, a11, f10);
                c4739a3.f39353o = pointF7;
                c4739a3.f39354p = pointF8;
                return c4739a3;
            }
            obj2 = obj8;
            linearInterpolator = linearInterpolator4;
        }
        a11 = null;
        a10 = null;
        if (a10 != null) {
        }
        c4739a3.f39353o = pointF7;
        c4739a3.f39354p = pointF8;
        return c4739a3;
    }
}
