package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import com.airbnb.lottie.AsyncUpdates;
import com.airbnb.lottie.parser.moshi.JsonReader$Token;
import com.airbnb.lottie.parser.moshi.a;
import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;
import java.lang.ref.WeakReference;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes.dex */
public abstract class tkx {
    public static pnt0 b;
    public static final LinearInterpolator a = new LinearInterpolator();
    public static final hzk c = hzk.n("t", "s", "e", "o", CoreConstants.PushMessage.SERVICE_TYPE, "h", "to", "ti");
    public static final hzk d = hzk.n(RemoteBioParameters.X, RemoteBioParameters.Y);

    public static Interpolator a(PointF pointF, PointF pointF2) {
        WeakReference weakReference;
        Interpolator pathInterpolator;
        pointF.x = ti20.b(pointF.x, -1.0f, 1.0f);
        pointF.y = ti20.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = ti20.b(pointF2.x, -1.0f, 1.0f);
        float b2 = ti20.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = b2;
        float f = pointF.x;
        float f2 = pointF.y;
        float f3 = pointF2.x;
        Matrix matrix = zw21.a;
        int i = f != 0.0f ? (int) (527.0f * f) : 17;
        if (f2 != 0.0f) {
            i = (int) (i * 31 * f2);
        }
        if (f3 != 0.0f) {
            i = (int) (i * 31 * f3);
        }
        if (b2 != 0.0f) {
            i = (int) (i * 31 * b2);
        }
        AsyncUpdates asyncUpdates = upx.a;
        synchronized (tkx.class) {
            if (b == null) {
                b = new pnt0();
            }
            weakReference = (WeakReference) b.b(i);
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
        AsyncUpdates asyncUpdates2 = upx.a;
        try {
            WeakReference weakReference2 = new WeakReference(pathInterpolator);
            synchronized (tkx.class) {
                b.d(i, weakReference2);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        return pathInterpolator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.animation.Interpolator] */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.view.animation.Interpolator] */
    public static rkx b(a aVar, nsz nszVar, float f, m131 m131Var, boolean z, boolean z2) {
        Object obj;
        LinearInterpolator a2;
        Interpolator a3;
        Interpolator a4;
        Object obj2;
        hzk hzkVar;
        LinearInterpolator linearInterpolator;
        hzk hzkVar2;
        PointF pointF;
        float f2;
        hzk hzkVar3 = c;
        LinearInterpolator linearInterpolator2 = a;
        if (!z || !z2) {
            hzk hzkVar4 = hzkVar3;
            if (!z) {
                return new rkx(m131Var.x(aVar, f));
            }
            aVar.c();
            PointF pointF2 = null;
            PointF pointF3 = null;
            PointF pointF4 = null;
            PointF pointF5 = null;
            boolean z3 = false;
            Object obj3 = null;
            float f3 = 0.0f;
            Object obj4 = null;
            while (aVar.hasNext()) {
                hzk hzkVar5 = hzkVar4;
                switch (aVar.o(hzkVar5)) {
                    case 0:
                        hzkVar4 = hzkVar5;
                        f3 = (float) aVar.nextDouble();
                        continue;
                    case 1:
                        obj3 = m131Var.x(aVar, f);
                        break;
                    case 2:
                        obj4 = m131Var.x(aVar, f);
                        break;
                    case 3:
                        pointF5 = yex.b(aVar, 1.0f);
                        break;
                    case 4:
                        pointF2 = yex.b(aVar, 1.0f);
                        break;
                    case 5:
                        if (aVar.nextInt() != 1) {
                            z3 = false;
                            break;
                        } else {
                            z3 = true;
                            break;
                        }
                    case 6:
                        pointF3 = yex.b(aVar, f);
                        break;
                    case 7:
                        pointF4 = yex.b(aVar, f);
                        break;
                    default:
                        aVar.skipValue();
                        break;
                }
                hzkVar4 = hzkVar5;
            }
            aVar.e();
            if (z3) {
                obj = obj3;
            } else {
                if (pointF5 != null && pointF2 != null) {
                    a2 = a(pointF5, pointF2);
                    obj = obj4;
                    rkx rkxVar = new rkx(nszVar, obj3, obj, a2, f3, (Float) null);
                    rkxVar.o = pointF3;
                    rkxVar.p = pointF4;
                    return rkxVar;
                }
                obj = obj4;
            }
            a2 = linearInterpolator2;
            rkx rkxVar2 = new rkx(nszVar, obj3, obj, a2, f3, (Float) null);
            rkxVar2.o = pointF3;
            rkxVar2.p = pointF4;
            return rkxVar2;
        }
        aVar.c();
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
        float f4 = 0.0f;
        Object obj6 = null;
        while (aVar.hasNext()) {
            int o = aVar.o(hzkVar3);
            hzk hzkVar6 = d;
            switch (o) {
                case 0:
                    hzkVar = hzkVar3;
                    linearInterpolator = linearInterpolator2;
                    f4 = (float) aVar.nextDouble();
                    break;
                case 1:
                    obj5 = m131Var.x(aVar, f);
                    continue;
                case 2:
                    obj6 = m131Var.x(aVar, f);
                    continue;
                case 3:
                    hzk hzkVar7 = hzkVar3;
                    PointF pointF14 = pointF7;
                    LinearInterpolator linearInterpolator3 = linearInterpolator2;
                    boolean z5 = z4;
                    Object obj7 = obj5;
                    if (aVar.k() == JsonReader$Token.BEGIN_OBJECT) {
                        aVar.c();
                        float f5 = 0.0f;
                        float f6 = 0.0f;
                        float f7 = 0.0f;
                        float f8 = 0.0f;
                        while (aVar.hasNext()) {
                            int o2 = aVar.o(hzkVar6);
                            if (o2 == 0) {
                                JsonReader$Token k = aVar.k();
                                JsonReader$Token jsonReader$Token = JsonReader$Token.NUMBER;
                                if (k == jsonReader$Token) {
                                    f7 = (float) aVar.nextDouble();
                                    f5 = f7;
                                } else {
                                    aVar.a();
                                    f5 = (float) aVar.nextDouble();
                                    f7 = aVar.k() == jsonReader$Token ? (float) aVar.nextDouble() : f5;
                                    aVar.d();
                                }
                            } else if (o2 != 1) {
                                aVar.skipValue();
                            } else {
                                JsonReader$Token k2 = aVar.k();
                                JsonReader$Token jsonReader$Token2 = JsonReader$Token.NUMBER;
                                if (k2 == jsonReader$Token2) {
                                    f8 = (float) aVar.nextDouble();
                                    f6 = f8;
                                } else {
                                    aVar.a();
                                    f6 = (float) aVar.nextDouble();
                                    f8 = aVar.k() == jsonReader$Token2 ? (float) aVar.nextDouble() : f6;
                                    aVar.d();
                                }
                            }
                        }
                        pointF11 = new PointF(f5, f6);
                        pointF12 = new PointF(f7, f8);
                        aVar.e();
                    } else {
                        pointF9 = yex.b(aVar, f);
                    }
                    z4 = z5;
                    obj5 = obj7;
                    linearInterpolator2 = linearInterpolator3;
                    hzkVar3 = hzkVar7;
                    pointF7 = pointF14;
                    continue;
                case 4:
                    linearInterpolator = linearInterpolator2;
                    boolean z6 = z4;
                    if (aVar.k() != JsonReader$Token.BEGIN_OBJECT) {
                        pointF10 = yex.b(aVar, f);
                        z4 = z6;
                        linearInterpolator2 = linearInterpolator;
                        break;
                    } else {
                        aVar.c();
                        float f9 = 0.0f;
                        float f10 = 0.0f;
                        float f11 = 0.0f;
                        float f12 = 0.0f;
                        while (aVar.hasNext()) {
                            Object obj8 = obj5;
                            int o3 = aVar.o(hzkVar6);
                            if (o3 != 0) {
                                hzkVar2 = hzkVar3;
                                if (o3 != 1) {
                                    aVar.skipValue();
                                    obj5 = obj8;
                                    hzkVar3 = hzkVar2;
                                } else {
                                    JsonReader$Token k3 = aVar.k();
                                    JsonReader$Token jsonReader$Token3 = JsonReader$Token.NUMBER;
                                    if (k3 == jsonReader$Token3) {
                                        pointF = pointF7;
                                        f12 = (float) aVar.nextDouble();
                                        obj5 = obj8;
                                        pointF8 = pointF8;
                                        f10 = f12;
                                    } else {
                                        pointF = pointF7;
                                        PointF pointF15 = pointF8;
                                        aVar.a();
                                        float nextDouble = (float) aVar.nextDouble();
                                        if (aVar.k() == jsonReader$Token3) {
                                            f10 = nextDouble;
                                            f12 = (float) aVar.nextDouble();
                                        } else {
                                            f10 = nextDouble;
                                            f12 = f10;
                                        }
                                        aVar.d();
                                        obj5 = obj8;
                                        pointF8 = pointF15;
                                    }
                                }
                            } else {
                                hzkVar2 = hzkVar3;
                                pointF = pointF7;
                                PointF pointF16 = pointF8;
                                JsonReader$Token k4 = aVar.k();
                                JsonReader$Token jsonReader$Token4 = JsonReader$Token.NUMBER;
                                if (k4 == jsonReader$Token4) {
                                    f11 = (float) aVar.nextDouble();
                                    obj5 = obj8;
                                    pointF8 = pointF16;
                                    f9 = f11;
                                } else {
                                    aVar.a();
                                    pointF8 = pointF16;
                                    float nextDouble2 = (float) aVar.nextDouble();
                                    if (aVar.k() == jsonReader$Token4) {
                                        f2 = nextDouble2;
                                        f11 = (float) aVar.nextDouble();
                                    } else {
                                        f2 = nextDouble2;
                                        f11 = f2;
                                    }
                                    aVar.d();
                                    obj5 = obj8;
                                    f9 = f2;
                                }
                            }
                            hzkVar3 = hzkVar2;
                            pointF7 = pointF;
                        }
                        hzkVar = hzkVar3;
                        PointF pointF17 = new PointF(f9, f10);
                        pointF6 = new PointF(f11, f12);
                        aVar.e();
                        z4 = z6;
                        pointF13 = pointF17;
                        break;
                    }
                case 5:
                    if (aVar.nextInt() == 1) {
                        z4 = true;
                        break;
                    } else {
                        z4 = false;
                        continue;
                    }
                case 6:
                    pointF7 = yex.b(aVar, f);
                    continue;
                case 7:
                    pointF8 = yex.b(aVar, f);
                    continue;
                default:
                    aVar.skipValue();
                    continue;
            }
            linearInterpolator2 = linearInterpolator;
            hzkVar3 = hzkVar;
        }
        PointF pointF18 = pointF7;
        LinearInterpolator linearInterpolator4 = linearInterpolator2;
        boolean z7 = z4;
        Object obj9 = obj5;
        aVar.e();
        if (z7) {
            obj2 = obj9;
        } else {
            if (pointF9 != null && pointF10 != null) {
                linearInterpolator4 = a(pointF9, pointF10);
            } else if (pointF11 != null && pointF12 != null && pointF13 != null && pointF6 != null) {
                a3 = a(pointF11, pointF13);
                a4 = a(pointF12, pointF6);
                obj2 = obj6;
                linearInterpolator4 = null;
                rkx rkxVar3 = (a3 != null || a4 == null) ? new rkx(nszVar, obj9, obj2, linearInterpolator4, f4, (Float) null) : new rkx(nszVar, obj9, obj2, a3, a4, f4);
                rkxVar3.o = pointF18;
                rkxVar3.p = pointF8;
                return rkxVar3;
            }
            obj2 = obj6;
        }
        a3 = null;
        a4 = null;
        if (a3 != null) {
        }
        rkxVar3.o = pointF18;
        rkxVar3.p = pointF8;
        return rkxVar3;
    }
}
