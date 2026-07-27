package h1;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import i1.AbstractC4579a;
import j1.AbstractC4603g;
import java.lang.ref.WeakReference;
import k1.C4629a;
import q5.C4927a;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: b, reason: collision with root package name */
    public static s.l f37986b;

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f37985a = new LinearInterpolator();

    /* renamed from: c, reason: collision with root package name */
    public static final S0.l f37987c = S0.l.F("t", com.anythink.core.common.s.f16249a, "e", C4927a.PUSH_MINIFIED_BUTTONS_LIST, "i", "h", "to", "ti");

    /* renamed from: d, reason: collision with root package name */
    public static final S0.l f37988d = S0.l.F("x", "y");

    public static Interpolator a(PointF pointF, PointF pointF2) {
        WeakReference weakReference;
        Interpolator b9;
        pointF.x = AbstractC4603g.b(pointF.x, -1.0f, 1.0f);
        pointF.y = AbstractC4603g.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = AbstractC4603g.b(pointF2.x, -1.0f, 1.0f);
        float b10 = AbstractC4603g.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = b10;
        float f3 = pointF.x;
        float f9 = pointF.y;
        float f10 = pointF2.x;
        Matrix matrix = j1.j.f38350a;
        int i = f3 != 0.0f ? (int) (527 * f3) : 17;
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
            if (f37986b == null) {
                f37986b = new s.l();
            }
            weakReference = (WeakReference) f37986b.b(i, null);
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
                f37986b.c(i, weakReference2);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        return b9;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x002d. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [android.view.animation.Interpolator] */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.view.animation.Interpolator] */
    public static C4629a b(AbstractC4579a abstractC4579a, X0.i iVar, float f3, D d2, boolean z3, boolean z6) {
        Object obj;
        LinearInterpolator a9;
        Object obj2;
        LinearInterpolator linearInterpolator;
        Interpolator a10;
        Interpolator a11;
        S0.l lVar;
        Object obj3;
        S0.l lVar2;
        PointF pointF;
        LinearInterpolator linearInterpolator2 = f37985a;
        S0.l lVar3 = f37987c;
        if (!z3 || !z6) {
            S0.l lVar4 = lVar3;
            if (!z3) {
                return new C4629a(d2.b(abstractC4579a, f3));
            }
            abstractC4579a.j();
            PointF pointF2 = null;
            Object obj4 = null;
            float f9 = 0.0f;
            boolean z9 = false;
            PointF pointF3 = null;
            PointF pointF4 = null;
            PointF pointF5 = null;
            Object obj5 = null;
            while (abstractC4579a.D()) {
                S0.l lVar5 = lVar4;
                switch (abstractC4579a.K(lVar5)) {
                    case 0:
                        f9 = (float) abstractC4579a.F();
                        break;
                    case 1:
                        obj5 = d2.b(abstractC4579a, f3);
                        break;
                    case 2:
                        obj4 = d2.b(abstractC4579a, f3);
                        break;
                    case 3:
                        pointF4 = n.b(abstractC4579a, 1.0f);
                        break;
                    case 4:
                        pointF2 = n.b(abstractC4579a, 1.0f);
                        break;
                    case 5:
                        if (abstractC4579a.G() != 1) {
                            z9 = false;
                            break;
                        } else {
                            z9 = true;
                            break;
                        }
                    case 6:
                        pointF3 = n.b(abstractC4579a, f3);
                        break;
                    case 7:
                        pointF5 = n.b(abstractC4579a, f3);
                        break;
                    default:
                        abstractC4579a.W();
                        break;
                }
                lVar4 = lVar5;
            }
            abstractC4579a.B();
            if (z9) {
                obj = obj5;
            } else {
                if (pointF4 != null && pointF2 != null) {
                    Object obj6 = obj4;
                    a9 = a(pointF4, pointF2);
                    obj = obj6;
                    C4629a c4629a = new C4629a(iVar, obj5, obj, a9, f9, (Float) null);
                    c4629a.f38564o = pointF3;
                    c4629a.f38565p = pointF5;
                    return c4629a;
                }
                obj = obj4;
            }
            a9 = linearInterpolator2;
            C4629a c4629a2 = new C4629a(iVar, obj5, obj, a9, f9, (Float) null);
            c4629a2.f38564o = pointF3;
            c4629a2.f38565p = pointF5;
            return c4629a2;
        }
        abstractC4579a.j();
        PointF pointF6 = null;
        PointF pointF7 = null;
        PointF pointF8 = null;
        boolean z10 = false;
        PointF pointF9 = null;
        PointF pointF10 = null;
        PointF pointF11 = null;
        Object obj7 = null;
        PointF pointF12 = null;
        PointF pointF13 = null;
        float f10 = 0.0f;
        Object obj8 = null;
        while (abstractC4579a.D()) {
            int K7 = abstractC4579a.K(lVar3);
            S0.l lVar6 = f37988d;
            LinearInterpolator linearInterpolator3 = linearInterpolator2;
            switch (K7) {
                case 0:
                    lVar = lVar3;
                    obj3 = obj7;
                    f10 = (float) abstractC4579a.F();
                    pointF12 = pointF12;
                    linearInterpolator2 = linearInterpolator3;
                    obj7 = obj3;
                    lVar3 = lVar;
                    break;
                case 1:
                    lVar = lVar3;
                    obj7 = d2.b(abstractC4579a, f3);
                    linearInterpolator2 = linearInterpolator3;
                    lVar3 = lVar;
                    break;
                case 2:
                    lVar = lVar3;
                    obj8 = d2.b(abstractC4579a, f3);
                    linearInterpolator2 = linearInterpolator3;
                    lVar3 = lVar;
                    break;
                case 3:
                    lVar = lVar3;
                    boolean z11 = z10;
                    obj3 = obj7;
                    PointF pointF14 = pointF12;
                    if (abstractC4579a.I() == 3) {
                        abstractC4579a.j();
                        float f11 = 0.0f;
                        float f12 = 0.0f;
                        float f13 = 0.0f;
                        float f14 = 0.0f;
                        while (abstractC4579a.D()) {
                            int K8 = abstractC4579a.K(lVar6);
                            if (K8 != 0) {
                                if (K8 != 1) {
                                    abstractC4579a.W();
                                } else if (abstractC4579a.I() == 7) {
                                    f14 = (float) abstractC4579a.F();
                                    f12 = f14;
                                } else {
                                    abstractC4579a.b();
                                    f12 = (float) abstractC4579a.F();
                                    f14 = abstractC4579a.I() == 7 ? (float) abstractC4579a.F() : f12;
                                    abstractC4579a.z();
                                }
                            } else if (abstractC4579a.I() == 7) {
                                f13 = (float) abstractC4579a.F();
                                f11 = f13;
                            } else {
                                abstractC4579a.b();
                                f11 = (float) abstractC4579a.F();
                                f13 = abstractC4579a.I() == 7 ? (float) abstractC4579a.F() : f11;
                                abstractC4579a.z();
                            }
                        }
                        PointF pointF15 = new PointF(f11, f12);
                        pointF12 = new PointF(f13, f14);
                        abstractC4579a.B();
                        pointF11 = pointF15;
                    } else {
                        pointF9 = n.b(abstractC4579a, f3);
                        pointF12 = pointF14;
                    }
                    z10 = z11;
                    linearInterpolator2 = linearInterpolator3;
                    obj7 = obj3;
                    lVar3 = lVar;
                    break;
                case 4:
                    boolean z12 = z10;
                    if (abstractC4579a.I() == 3) {
                        abstractC4579a.j();
                        float f15 = 0.0f;
                        float f16 = 0.0f;
                        float f17 = 0.0f;
                        float f18 = 0.0f;
                        while (abstractC4579a.D()) {
                            Object obj9 = obj7;
                            int K9 = abstractC4579a.K(lVar6);
                            if (K9 != 0) {
                                lVar2 = lVar3;
                                if (K9 != 1) {
                                    abstractC4579a.W();
                                } else if (abstractC4579a.I() == 7) {
                                    f18 = (float) abstractC4579a.F();
                                    pointF12 = pointF12;
                                    f16 = f18;
                                } else {
                                    pointF = pointF12;
                                    abstractC4579a.b();
                                    f16 = (float) abstractC4579a.F();
                                    f18 = abstractC4579a.I() == 7 ? (float) abstractC4579a.F() : f16;
                                    abstractC4579a.z();
                                    pointF12 = pointF;
                                }
                            } else {
                                lVar2 = lVar3;
                                pointF = pointF12;
                                if (abstractC4579a.I() == 7) {
                                    f17 = (float) abstractC4579a.F();
                                    pointF12 = pointF;
                                    f15 = f17;
                                } else {
                                    abstractC4579a.b();
                                    f15 = (float) abstractC4579a.F();
                                    f17 = abstractC4579a.I() == 7 ? (float) abstractC4579a.F() : f15;
                                    abstractC4579a.z();
                                    pointF12 = pointF;
                                }
                            }
                            obj7 = obj9;
                            lVar3 = lVar2;
                        }
                        lVar = lVar3;
                        PointF pointF16 = new PointF(f15, f16);
                        pointF6 = new PointF(f17, f18);
                        abstractC4579a.B();
                        pointF13 = pointF16;
                    } else {
                        lVar = lVar3;
                        pointF10 = n.b(abstractC4579a, f3);
                    }
                    z10 = z12;
                    linearInterpolator2 = linearInterpolator3;
                    lVar3 = lVar;
                    break;
                case 5:
                    z10 = abstractC4579a.G() == 1;
                    linearInterpolator2 = linearInterpolator3;
                    break;
                case 6:
                    pointF7 = n.b(abstractC4579a, f3);
                    linearInterpolator2 = linearInterpolator3;
                    break;
                case 7:
                    pointF8 = n.b(abstractC4579a, f3);
                    linearInterpolator2 = linearInterpolator3;
                    break;
                default:
                    abstractC4579a.W();
                    linearInterpolator2 = linearInterpolator3;
                    break;
            }
        }
        LinearInterpolator linearInterpolator4 = linearInterpolator2;
        boolean z13 = z10;
        Object obj10 = obj7;
        PointF pointF17 = pointF12;
        abstractC4579a.B();
        if (z13) {
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
                C4629a c4629a3 = (a10 != null || a11 == null) ? new C4629a(iVar, obj10, obj2, linearInterpolator, f10, (Float) null) : new C4629a(iVar, obj10, obj2, a10, a11, f10);
                c4629a3.f38564o = pointF7;
                c4629a3.f38565p = pointF8;
                return c4629a3;
            }
            obj2 = obj8;
            linearInterpolator = linearInterpolator4;
        }
        a11 = null;
        a10 = null;
        if (a10 != null) {
        }
        c4629a3.f38564o = pointF7;
        c4629a3.f38565p = pointF8;
        return c4629a3;
    }
}
