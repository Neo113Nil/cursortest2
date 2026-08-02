package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import com.yandex.metrica.push.common.CoreConstants;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public abstract class ccf {
    public static q4r b;
    public static final LinearInterpolator a = new LinearInterpolator();
    public static final j6e c = j6e.s("t", "s", "e", "o", CoreConstants.PushMessage.SERVICE_TYPE, "h", "to", "ti");
    public static final j6e d = j6e.s("x", "y");

    public static Interpolator a(PointF pointF, PointF pointF2) {
        WeakReference weakReference;
        Interpolator pathInterpolator;
        pointF.x = y5i.b(pointF.x, -1.0f, 1.0f);
        pointF.y = y5i.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = y5i.b(pointF2.x, -1.0f, 1.0f);
        float b2 = y5i.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = b2;
        float f = pointF.x;
        float f2 = pointF.y;
        float f3 = pointF2.x;
        Matrix matrix = rvt.a;
        int i = f != 0.0f ? (int) (527 * f) : 17;
        if (f2 != 0.0f) {
            i = (int) (i * 31 * f2);
        }
        if (f3 != 0.0f) {
            i = (int) (i * 31 * f3);
        }
        if (b2 != 0.0f) {
            i = (int) (i * 31 * b2);
        }
        synchronized (ccf.class) {
            if (b == null) {
                b = new q4r(0);
            }
            weakReference = (WeakReference) b.c(i);
        }
        Interpolator interpolator = weakReference != null ? (Interpolator) weakReference.get() : null;
        if (weakReference != null && interpolator != null) {
            return interpolator;
        }
        try {
            pathInterpolator = new PathInterpolator(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e) {
            pathInterpolator = "The Path cannot loop back on itself.".equals(e.getMessage()) ? new PathInterpolator(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
        try {
            WeakReference weakReference2 = new WeakReference(pathInterpolator);
            synchronized (ccf.class) {
                b.e(i, weakReference2);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        return pathInterpolator;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x002d. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.animation.Interpolator] */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.view.animation.Interpolator] */
    public static acf b(b7f b7fVar, ayg aygVar, float f, xwt xwtVar, boolean z, boolean z2) {
        Object obj;
        LinearInterpolator a2;
        Interpolator a3;
        Interpolator a4;
        Object obj2;
        j6e j6eVar;
        j6e j6eVar2;
        PointF pointF;
        j6e j6eVar3 = c;
        LinearInterpolator linearInterpolator = a;
        if (!z || !z2) {
            j6e j6eVar4 = j6eVar3;
            if (!z) {
                return new acf(xwtVar.r(b7fVar, f));
            }
            b7fVar.b();
            PointF pointF2 = null;
            PointF pointF3 = null;
            PointF pointF4 = null;
            PointF pointF5 = null;
            boolean z3 = false;
            Object obj3 = null;
            float f2 = 0.0f;
            Object obj4 = null;
            while (b7fVar.hasNext()) {
                j6e j6eVar5 = j6eVar4;
                switch (b7fVar.D(j6eVar5)) {
                    case 0:
                        j6eVar4 = j6eVar5;
                        f2 = (float) b7fVar.nextDouble();
                        continue;
                    case 1:
                        obj3 = xwtVar.r(b7fVar, f);
                        break;
                    case 2:
                        obj4 = xwtVar.r(b7fVar, f);
                        break;
                    case 3:
                        pointF5 = p7f.b(b7fVar, 1.0f);
                        break;
                    case 4:
                        pointF2 = p7f.b(b7fVar, 1.0f);
                        break;
                    case 5:
                        if (b7fVar.nextInt() != 1) {
                            z3 = false;
                            break;
                        } else {
                            z3 = true;
                            break;
                        }
                    case 6:
                        pointF3 = p7f.b(b7fVar, f);
                        break;
                    case 7:
                        pointF4 = p7f.b(b7fVar, f);
                        break;
                    default:
                        b7fVar.w();
                        break;
                }
                j6eVar4 = j6eVar5;
            }
            b7fVar.o();
            if (z3) {
                obj = obj3;
            } else {
                if (pointF5 != null && pointF2 != null) {
                    a2 = a(pointF5, pointF2);
                    obj = obj4;
                    acf acfVar = new acf(aygVar, obj3, obj, a2, f2, (Float) null);
                    acfVar.o = pointF3;
                    acfVar.p = pointF4;
                    return acfVar;
                }
                obj = obj4;
            }
            a2 = linearInterpolator;
            acf acfVar2 = new acf(aygVar, obj3, obj, a2, f2, (Float) null);
            acfVar2.o = pointF3;
            acfVar2.p = pointF4;
            return acfVar2;
        }
        b7fVar.b();
        PointF pointF6 = null;
        PointF pointF7 = null;
        PointF pointF8 = null;
        boolean z4 = false;
        PointF pointF9 = null;
        PointF pointF10 = null;
        PointF pointF11 = null;
        Object obj5 = null;
        PointF pointF12 = null;
        PointF pointF13 = null;
        float f3 = 0.0f;
        Object obj6 = null;
        while (b7fVar.hasNext()) {
            int D = b7fVar.D(j6eVar3);
            j6e j6eVar6 = d;
            LinearInterpolator linearInterpolator2 = linearInterpolator;
            switch (D) {
                case 0:
                    j6eVar = j6eVar3;
                    f3 = (float) b7fVar.nextDouble();
                    linearInterpolator = linearInterpolator2;
                    j6eVar3 = j6eVar;
                    break;
                case 1:
                    j6eVar = j6eVar3;
                    obj5 = xwtVar.r(b7fVar, f);
                    linearInterpolator = linearInterpolator2;
                    j6eVar3 = j6eVar;
                    break;
                case 2:
                    j6eVar = j6eVar3;
                    obj6 = xwtVar.r(b7fVar, f);
                    linearInterpolator = linearInterpolator2;
                    j6eVar3 = j6eVar;
                    break;
                case 3:
                    j6eVar = j6eVar3;
                    boolean z5 = z4;
                    Object obj7 = obj5;
                    PointF pointF14 = pointF12;
                    if (b7fVar.peek() == 3) {
                        b7fVar.b();
                        float f4 = 0.0f;
                        float f5 = 0.0f;
                        float f6 = 0.0f;
                        float f7 = 0.0f;
                        while (b7fVar.hasNext()) {
                            int D2 = b7fVar.D(j6eVar6);
                            if (D2 != 0) {
                                if (D2 != 1) {
                                    b7fVar.w();
                                } else if (b7fVar.peek() == 7) {
                                    f7 = (float) b7fVar.nextDouble();
                                    f5 = f7;
                                } else {
                                    b7fVar.a();
                                    f5 = (float) b7fVar.nextDouble();
                                    f7 = b7fVar.peek() == 7 ? (float) b7fVar.nextDouble() : f5;
                                    b7fVar.g();
                                }
                            } else if (b7fVar.peek() == 7) {
                                f6 = (float) b7fVar.nextDouble();
                                f4 = f6;
                            } else {
                                b7fVar.a();
                                f4 = (float) b7fVar.nextDouble();
                                f6 = b7fVar.peek() == 7 ? (float) b7fVar.nextDouble() : f4;
                                b7fVar.g();
                            }
                        }
                        PointF pointF15 = new PointF(f4, f5);
                        pointF12 = new PointF(f6, f7);
                        b7fVar.o();
                        pointF11 = pointF15;
                    } else {
                        pointF9 = p7f.b(b7fVar, f);
                        pointF12 = pointF14;
                    }
                    z4 = z5;
                    linearInterpolator = linearInterpolator2;
                    obj5 = obj7;
                    j6eVar3 = j6eVar;
                    break;
                case 4:
                    boolean z6 = z4;
                    if (b7fVar.peek() == 3) {
                        b7fVar.b();
                        float f8 = 0.0f;
                        float f9 = 0.0f;
                        float f10 = 0.0f;
                        float f11 = 0.0f;
                        while (b7fVar.hasNext()) {
                            Object obj8 = obj5;
                            int D3 = b7fVar.D(j6eVar6);
                            if (D3 != 0) {
                                j6eVar2 = j6eVar3;
                                if (D3 != 1) {
                                    b7fVar.w();
                                } else if (b7fVar.peek() == 7) {
                                    f11 = (float) b7fVar.nextDouble();
                                    pointF12 = pointF12;
                                    f9 = f11;
                                } else {
                                    pointF = pointF12;
                                    b7fVar.a();
                                    f9 = (float) b7fVar.nextDouble();
                                    f11 = b7fVar.peek() == 7 ? (float) b7fVar.nextDouble() : f9;
                                    b7fVar.g();
                                    pointF12 = pointF;
                                }
                            } else {
                                j6eVar2 = j6eVar3;
                                pointF = pointF12;
                                if (b7fVar.peek() == 7) {
                                    f10 = (float) b7fVar.nextDouble();
                                    pointF12 = pointF;
                                    f8 = f10;
                                } else {
                                    b7fVar.a();
                                    f8 = (float) b7fVar.nextDouble();
                                    f10 = b7fVar.peek() == 7 ? (float) b7fVar.nextDouble() : f8;
                                    b7fVar.g();
                                    pointF12 = pointF;
                                }
                            }
                            obj5 = obj8;
                            j6eVar3 = j6eVar2;
                        }
                        j6eVar = j6eVar3;
                        PointF pointF16 = new PointF(f8, f9);
                        pointF6 = new PointF(f10, f11);
                        b7fVar.o();
                        pointF13 = pointF16;
                    } else {
                        j6eVar = j6eVar3;
                        pointF10 = p7f.b(b7fVar, f);
                    }
                    z4 = z6;
                    linearInterpolator = linearInterpolator2;
                    j6eVar3 = j6eVar;
                    break;
                case 5:
                    z4 = b7fVar.nextInt() == 1;
                    linearInterpolator = linearInterpolator2;
                    break;
                case 6:
                    pointF7 = p7f.b(b7fVar, f);
                    linearInterpolator = linearInterpolator2;
                    break;
                case 7:
                    pointF8 = p7f.b(b7fVar, f);
                    linearInterpolator = linearInterpolator2;
                    break;
                default:
                    b7fVar.w();
                    linearInterpolator = linearInterpolator2;
                    break;
            }
        }
        LinearInterpolator linearInterpolator3 = linearInterpolator;
        boolean z7 = z4;
        Object obj9 = obj5;
        PointF pointF17 = pointF12;
        b7fVar.o();
        if (z7) {
            obj2 = obj9;
        } else {
            if (pointF9 != null && pointF10 != null) {
                linearInterpolator3 = a(pointF9, pointF10);
            } else if (pointF11 != null && pointF17 != null && pointF13 != null && pointF6 != null) {
                a3 = a(pointF11, pointF13);
                a4 = a(pointF17, pointF6);
                obj2 = obj6;
                linearInterpolator3 = null;
                acf acfVar3 = (a3 != null || a4 == null) ? new acf(aygVar, obj9, obj2, linearInterpolator3, f3, (Float) null) : new acf(aygVar, obj9, obj2, a3, a4, f3);
                acfVar3.o = pointF7;
                acfVar3.p = pointF8;
                return acfVar3;
            }
            obj2 = obj6;
        }
        a3 = null;
        a4 = null;
        if (a3 != null) {
        }
        acfVar3.o = pointF7;
        acfVar3.p = pointF8;
        return acfVar3;
    }
}
