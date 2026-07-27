package h1;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import i1.AbstractC4574a;
import java.lang.ref.WeakReference;
import k1.C4628a;
import m5.C4782a;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: b, reason: collision with root package name */
    public static s.l f38186b;

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f38185a = new LinearInterpolator();

    /* renamed from: c, reason: collision with root package name */
    public static final S0.s f38187c = S0.s.i("t", com.anythink.core.common.s.f16407a, "e", C4782a.PUSH_MINIFIED_BUTTONS_LIST, "i", "h", "to", "ti");

    /* renamed from: d, reason: collision with root package name */
    public static final S0.s f38188d = S0.s.i("x", "y");

    public static Interpolator a(PointF pointF, PointF pointF2) {
        WeakReference weakReference;
        Interpolator b9;
        pointF.x = j1.h.b(pointF.x, -1.0f, 1.0f);
        pointF.y = j1.h.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = j1.h.b(pointF2.x, -1.0f, 1.0f);
        float b10 = j1.h.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = b10;
        float f6 = pointF.x;
        float f9 = pointF.y;
        float f10 = pointF2.x;
        Matrix matrix = j1.j.f38533a;
        int i = f6 != 0.0f ? (int) (527 * f6) : 17;
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
            if (f38186b == null) {
                f38186b = new s.l();
            }
            weakReference = (WeakReference) f38186b.b(i, null);
        }
        Interpolator interpolator = weakReference != null ? (Interpolator) weakReference.get() : null;
        if (weakReference != null && interpolator != null) {
            return interpolator;
        }
        try {
            b9 = Q.a.b(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e6) {
            b9 = "The Path cannot loop back on itself.".equals(e6.getMessage()) ? Q.a.b(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
        try {
            WeakReference weakReference2 = new WeakReference(b9);
            synchronized (o.class) {
                f38186b.c(i, weakReference2);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        return b9;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x002d. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [android.view.animation.Interpolator] */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.view.animation.Interpolator] */
    public static C4628a b(AbstractC4574a abstractC4574a, X0.i iVar, float f6, D d2, boolean z8, boolean z9) {
        Object obj;
        LinearInterpolator a9;
        Object obj2;
        LinearInterpolator linearInterpolator;
        Interpolator a10;
        Interpolator a11;
        S0.s sVar;
        Object obj3;
        S0.s sVar2;
        PointF pointF;
        LinearInterpolator linearInterpolator2 = f38185a;
        S0.s sVar3 = f38187c;
        if (!z8 || !z9) {
            S0.s sVar4 = sVar3;
            if (!z8) {
                return new C4628a(d2.a(abstractC4574a, f6));
            }
            abstractC4574a.j();
            PointF pointF2 = null;
            Object obj4 = null;
            float f9 = 0.0f;
            boolean z10 = false;
            PointF pointF3 = null;
            PointF pointF4 = null;
            PointF pointF5 = null;
            Object obj5 = null;
            while (abstractC4574a.D()) {
                S0.s sVar5 = sVar4;
                switch (abstractC4574a.K(sVar5)) {
                    case 0:
                        f9 = (float) abstractC4574a.F();
                        break;
                    case 1:
                        obj5 = d2.a(abstractC4574a, f6);
                        break;
                    case 2:
                        obj4 = d2.a(abstractC4574a, f6);
                        break;
                    case 3:
                        pointF4 = n.b(abstractC4574a, 1.0f);
                        break;
                    case 4:
                        pointF2 = n.b(abstractC4574a, 1.0f);
                        break;
                    case 5:
                        if (abstractC4574a.G() != 1) {
                            z10 = false;
                            break;
                        } else {
                            z10 = true;
                            break;
                        }
                    case 6:
                        pointF3 = n.b(abstractC4574a, f6);
                        break;
                    case 7:
                        pointF5 = n.b(abstractC4574a, f6);
                        break;
                    default:
                        abstractC4574a.W();
                        break;
                }
                sVar4 = sVar5;
            }
            abstractC4574a.B();
            if (z10) {
                obj = obj5;
            } else {
                if (pointF4 != null && pointF2 != null) {
                    Object obj6 = obj4;
                    a9 = a(pointF4, pointF2);
                    obj = obj6;
                    C4628a c4628a = new C4628a(iVar, obj5, obj, a9, f9, (Float) null);
                    c4628a.f38684o = pointF3;
                    c4628a.f38685p = pointF5;
                    return c4628a;
                }
                obj = obj4;
            }
            a9 = linearInterpolator2;
            C4628a c4628a2 = new C4628a(iVar, obj5, obj, a9, f9, (Float) null);
            c4628a2.f38684o = pointF3;
            c4628a2.f38685p = pointF5;
            return c4628a2;
        }
        abstractC4574a.j();
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
        while (abstractC4574a.D()) {
            int K8 = abstractC4574a.K(sVar3);
            S0.s sVar6 = f38188d;
            LinearInterpolator linearInterpolator3 = linearInterpolator2;
            switch (K8) {
                case 0:
                    sVar = sVar3;
                    obj3 = obj7;
                    f10 = (float) abstractC4574a.F();
                    pointF12 = pointF12;
                    linearInterpolator2 = linearInterpolator3;
                    obj7 = obj3;
                    sVar3 = sVar;
                    break;
                case 1:
                    sVar = sVar3;
                    obj7 = d2.a(abstractC4574a, f6);
                    linearInterpolator2 = linearInterpolator3;
                    sVar3 = sVar;
                    break;
                case 2:
                    sVar = sVar3;
                    obj8 = d2.a(abstractC4574a, f6);
                    linearInterpolator2 = linearInterpolator3;
                    sVar3 = sVar;
                    break;
                case 3:
                    sVar = sVar3;
                    boolean z12 = z11;
                    obj3 = obj7;
                    PointF pointF14 = pointF12;
                    if (abstractC4574a.I() == 3) {
                        abstractC4574a.j();
                        float f11 = 0.0f;
                        float f12 = 0.0f;
                        float f13 = 0.0f;
                        float f14 = 0.0f;
                        while (abstractC4574a.D()) {
                            int K9 = abstractC4574a.K(sVar6);
                            if (K9 != 0) {
                                if (K9 != 1) {
                                    abstractC4574a.W();
                                } else if (abstractC4574a.I() == 7) {
                                    f14 = (float) abstractC4574a.F();
                                    f12 = f14;
                                } else {
                                    abstractC4574a.b();
                                    f12 = (float) abstractC4574a.F();
                                    f14 = abstractC4574a.I() == 7 ? (float) abstractC4574a.F() : f12;
                                    abstractC4574a.z();
                                }
                            } else if (abstractC4574a.I() == 7) {
                                f13 = (float) abstractC4574a.F();
                                f11 = f13;
                            } else {
                                abstractC4574a.b();
                                f11 = (float) abstractC4574a.F();
                                f13 = abstractC4574a.I() == 7 ? (float) abstractC4574a.F() : f11;
                                abstractC4574a.z();
                            }
                        }
                        PointF pointF15 = new PointF(f11, f12);
                        pointF12 = new PointF(f13, f14);
                        abstractC4574a.B();
                        pointF11 = pointF15;
                    } else {
                        pointF9 = n.b(abstractC4574a, f6);
                        pointF12 = pointF14;
                    }
                    z11 = z12;
                    linearInterpolator2 = linearInterpolator3;
                    obj7 = obj3;
                    sVar3 = sVar;
                    break;
                case 4:
                    boolean z13 = z11;
                    if (abstractC4574a.I() == 3) {
                        abstractC4574a.j();
                        float f15 = 0.0f;
                        float f16 = 0.0f;
                        float f17 = 0.0f;
                        float f18 = 0.0f;
                        while (abstractC4574a.D()) {
                            Object obj9 = obj7;
                            int K10 = abstractC4574a.K(sVar6);
                            if (K10 != 0) {
                                sVar2 = sVar3;
                                if (K10 != 1) {
                                    abstractC4574a.W();
                                } else if (abstractC4574a.I() == 7) {
                                    f18 = (float) abstractC4574a.F();
                                    pointF12 = pointF12;
                                    f16 = f18;
                                } else {
                                    pointF = pointF12;
                                    abstractC4574a.b();
                                    f16 = (float) abstractC4574a.F();
                                    f18 = abstractC4574a.I() == 7 ? (float) abstractC4574a.F() : f16;
                                    abstractC4574a.z();
                                    pointF12 = pointF;
                                }
                            } else {
                                sVar2 = sVar3;
                                pointF = pointF12;
                                if (abstractC4574a.I() == 7) {
                                    f17 = (float) abstractC4574a.F();
                                    pointF12 = pointF;
                                    f15 = f17;
                                } else {
                                    abstractC4574a.b();
                                    f15 = (float) abstractC4574a.F();
                                    f17 = abstractC4574a.I() == 7 ? (float) abstractC4574a.F() : f15;
                                    abstractC4574a.z();
                                    pointF12 = pointF;
                                }
                            }
                            obj7 = obj9;
                            sVar3 = sVar2;
                        }
                        sVar = sVar3;
                        PointF pointF16 = new PointF(f15, f16);
                        pointF6 = new PointF(f17, f18);
                        abstractC4574a.B();
                        pointF13 = pointF16;
                    } else {
                        sVar = sVar3;
                        pointF10 = n.b(abstractC4574a, f6);
                    }
                    z11 = z13;
                    linearInterpolator2 = linearInterpolator3;
                    sVar3 = sVar;
                    break;
                case 5:
                    z11 = abstractC4574a.G() == 1;
                    linearInterpolator2 = linearInterpolator3;
                    break;
                case 6:
                    pointF7 = n.b(abstractC4574a, f6);
                    linearInterpolator2 = linearInterpolator3;
                    break;
                case 7:
                    pointF8 = n.b(abstractC4574a, f6);
                    linearInterpolator2 = linearInterpolator3;
                    break;
                default:
                    abstractC4574a.W();
                    linearInterpolator2 = linearInterpolator3;
                    break;
            }
        }
        LinearInterpolator linearInterpolator4 = linearInterpolator2;
        boolean z14 = z11;
        Object obj10 = obj7;
        PointF pointF17 = pointF12;
        abstractC4574a.B();
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
                C4628a c4628a3 = (a10 != null || a11 == null) ? new C4628a(iVar, obj10, obj2, linearInterpolator, f10, (Float) null) : new C4628a(iVar, obj10, obj2, a10, a11, f10);
                c4628a3.f38684o = pointF7;
                c4628a3.f38685p = pointF8;
                return c4628a3;
            }
            obj2 = obj8;
            linearInterpolator = linearInterpolator4;
        }
        a11 = null;
        a10 = null;
        if (a10 != null) {
        }
        c4628a3.f38684o = pointF7;
        c4628a3.f38685p = pointF8;
        return c4628a3;
    }
}
