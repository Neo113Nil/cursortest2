package defpackage;

import android.graphics.Rect;
import android.util.Log;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class eei implements Comparable {
    public int c;
    public float a = 0.0f;
    public int b = 0;
    public final LinkedHashMap d = new LinkedHashMap();
    public float e = 1.0f;
    public float f = 0.0f;
    public float g = 0.0f;
    public float h = 0.0f;
    public float i = 1.0f;
    public float j = 1.0f;
    public float k = Float.NaN;
    public float l = Float.NaN;
    public float m = 0.0f;
    public float n = 0.0f;
    public float o = 0.0f;
    public float p = Float.NaN;
    public float q = Float.NaN;

    public static boolean b(float f, float f2) {
        return (Float.isNaN(f) || Float.isNaN(f2)) ? Float.isNaN(f) != Float.isNaN(f2) : Math.abs(f - f2) > 1.0E-6f;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void a(int i, HashMap hashMap) {
        for (String str : hashMap.keySet()) {
            ihu ihuVar = (ihu) hashMap.get(str);
            if (ihuVar != null) {
                str.getClass();
                char c = 65535;
                switch (str.hashCode()) {
                    case -1249320806:
                        if (str.equals("rotationX")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1249320805:
                        if (str.equals("rotationY")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1225497657:
                        if (str.equals("translationX")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1225497656:
                        if (str.equals("translationY")) {
                            c = 3;
                            break;
                        }
                        break;
                    case -1225497655:
                        if (str.equals("translationZ")) {
                            c = 4;
                            break;
                        }
                        break;
                    case -1001078227:
                        if (str.equals("progress")) {
                            c = 5;
                            break;
                        }
                        break;
                    case -908189618:
                        if (str.equals("scaleX")) {
                            c = 6;
                            break;
                        }
                        break;
                    case -908189617:
                        if (str.equals("scaleY")) {
                            c = 7;
                            break;
                        }
                        break;
                    case -760884510:
                        if (str.equals("transformPivotX")) {
                            c = '\b';
                            break;
                        }
                        break;
                    case -760884509:
                        if (str.equals("transformPivotY")) {
                            c = '\t';
                            break;
                        }
                        break;
                    case -40300674:
                        if (str.equals(CameraProperty.ROTATION)) {
                            c = '\n';
                            break;
                        }
                        break;
                    case -4379043:
                        if (str.equals("elevation")) {
                            c = 11;
                            break;
                        }
                        break;
                    case 37232917:
                        if (str.equals("transitionPathRotate")) {
                            c = '\f';
                            break;
                        }
                        break;
                    case 92909918:
                        if (str.equals("alpha")) {
                            c = '\r';
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        ihuVar.b(i, Float.isNaN(this.h) ? 0.0f : this.h);
                        break;
                    case 1:
                        ihuVar.b(i, Float.isNaN(this.a) ? 0.0f : this.a);
                        break;
                    case 2:
                        ihuVar.b(i, Float.isNaN(this.m) ? 0.0f : this.m);
                        break;
                    case 3:
                        ihuVar.b(i, Float.isNaN(this.n) ? 0.0f : this.n);
                        break;
                    case 4:
                        ihuVar.b(i, Float.isNaN(this.o) ? 0.0f : this.o);
                        break;
                    case 5:
                        ihuVar.b(i, Float.isNaN(this.q) ? 0.0f : this.q);
                        break;
                    case 6:
                        ihuVar.b(i, Float.isNaN(this.i) ? 1.0f : this.i);
                        break;
                    case 7:
                        ihuVar.b(i, Float.isNaN(this.j) ? 1.0f : this.j);
                        break;
                    case '\b':
                        ihuVar.b(i, Float.isNaN(this.k) ? 0.0f : this.k);
                        break;
                    case '\t':
                        ihuVar.b(i, Float.isNaN(this.l) ? 0.0f : this.l);
                        break;
                    case '\n':
                        ihuVar.b(i, Float.isNaN(this.g) ? 0.0f : this.g);
                        break;
                    case 11:
                        ihuVar.b(i, Float.isNaN(this.f) ? 0.0f : this.f);
                        break;
                    case '\f':
                        ihuVar.b(i, Float.isNaN(this.p) ? 0.0f : this.p);
                        break;
                    case '\r':
                        ihuVar.b(i, Float.isNaN(this.e) ? 1.0f : this.e);
                        break;
                    default:
                        if (str.startsWith("CUSTOM")) {
                            String str2 = str.split(StringUtils.COMMA)[1];
                            LinkedHashMap linkedHashMap = this.d;
                            if (linkedHashMap.containsKey(str2)) {
                                p86 p86Var = (p86) linkedHashMap.get(str2);
                                if (ihuVar instanceof fhu) {
                                    ((fhu) ihuVar).f.append(i, p86Var);
                                    break;
                                } else {
                                    Log.e("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i + ", value" + p86Var.a() + ihuVar);
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            Log.e("MotionPaths", "UNKNOWN spline ".concat(str));
                            break;
                        }
                }
            }
        }
    }

    public final void c(Rect rect, f96 f96Var, int i, int i2) {
        rect.width();
        rect.height();
        a96 k = f96Var.k(i2);
        d96 d96Var = k.c;
        c96 c96Var = k.d;
        int i3 = d96Var.c;
        this.b = i3;
        int i4 = d96Var.b;
        this.c = i4;
        this.e = (i4 == 0 || i3 != 0) ? d96Var.d : 0.0f;
        e96 e96Var = k.f;
        boolean z = e96Var.m;
        this.f = e96Var.n;
        this.g = e96Var.b;
        this.h = e96Var.c;
        this.a = e96Var.d;
        this.i = e96Var.e;
        this.j = e96Var.f;
        this.k = e96Var.g;
        this.l = e96Var.h;
        this.m = e96Var.j;
        this.n = e96Var.k;
        this.o = e96Var.l;
        jya.c(c96Var.d);
        this.p = c96Var.h;
        this.q = k.c.e;
        for (String str : k.g.keySet()) {
            p86 p86Var = (p86) k.g.get(str);
            int D = ouj.D(p86Var.c);
            if (D != 4 && D != 5 && D != 7) {
                this.d.put(str, p86Var);
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                }
            }
            float f = this.g + 90.0f;
            this.g = f;
            if (f > 180.0f) {
                this.g = f - 360.0f;
                return;
            }
            return;
        }
        this.g -= 90.0f;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ((eei) obj).getClass();
        return Float.compare(0.0f, 0.0f);
    }
}
