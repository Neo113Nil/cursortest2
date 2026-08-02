package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class lgm implements hak, yr2, cbf {
    public final String e;
    public final czg f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final yic j;
    public final cs2 k;
    public final yic l;
    public final yic m;
    public final yic n;
    public final yic o;
    public final yic p;
    public boolean r;
    public final Path a = new Path();
    public final Path b = new Path();
    public final PathMeasure c = new PathMeasure();
    public final float[] d = new float[2];
    public final ls5 q = new ls5(0);

    public lgm(czg czgVar, ds2 ds2Var, mgm mgmVar) {
        this.f = czgVar;
        this.e = mgmVar.a;
        int i = mgmVar.b;
        this.g = i;
        this.h = mgmVar.j;
        this.i = mgmVar.k;
        yic a = mgmVar.c.a();
        this.j = a;
        cs2 a2 = mgmVar.d.a();
        this.k = a2;
        yic a3 = mgmVar.e.a();
        this.l = a3;
        yic a4 = mgmVar.g.a();
        this.n = a4;
        yic a5 = mgmVar.i.a();
        this.p = a5;
        if (i == 1) {
            this.m = mgmVar.f.a();
            this.o = mgmVar.h.a();
        } else {
            this.m = null;
            this.o = null;
        }
        ds2Var.e(a);
        ds2Var.e(a2);
        ds2Var.e(a3);
        ds2Var.e(a4);
        ds2Var.e(a5);
        if (i == 1) {
            ds2Var.e(this.m);
            ds2Var.e(this.o);
        }
        a.a(this);
        a2.a(this);
        a3.a(this);
        a4.a(this);
        a5.a(this);
        if (i == 1) {
            this.m.a(this);
            this.o.a(this);
        }
    }

    @Override // defpackage.yr2
    public final void a() {
        this.r = false;
        this.f.invalidateSelf();
    }

    @Override // defpackage.lb6
    public final void b(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                return;
            }
            lb6 lb6Var = (lb6) arrayList.get(i);
            if (lb6Var instanceof sat) {
                sat satVar = (sat) lb6Var;
                if (satVar.c == 1) {
                    this.q.a.add(satVar);
                    satVar.c(this);
                }
            }
            i++;
        }
    }

    @Override // defpackage.bbf
    public final void c(abf abfVar, int i, ArrayList arrayList, abf abfVar2) {
        y5i.g(abfVar, i, arrayList, abfVar2, this);
    }

    @Override // defpackage.bbf
    public final void f(szg szgVar, Object obj) {
        yic yicVar;
        yic yicVar2;
        if (obj == lzg.u) {
            this.j.j(szgVar);
            return;
        }
        if (obj == lzg.v) {
            this.l.j(szgVar);
            return;
        }
        if (obj == lzg.i) {
            this.k.j(szgVar);
            return;
        }
        if (obj == lzg.w && (yicVar2 = this.m) != null) {
            yicVar2.j(szgVar);
            return;
        }
        if (obj == lzg.x) {
            this.n.j(szgVar);
            return;
        }
        if (obj == lzg.y && (yicVar = this.o) != null) {
            yicVar.j(szgVar);
        } else if (obj == lzg.z) {
            this.p.j(szgVar);
        }
    }

    @Override // defpackage.lb6
    public final String getName() {
        return this.e;
    }

    @Override // defpackage.hak
    public final Path getPath() {
        boolean z;
        float f;
        double d;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        int i;
        double d2;
        boolean z2 = this.r;
        Path path = this.a;
        if (z2) {
            return path;
        }
        path.reset();
        if (this.h) {
            this.r = true;
            return path;
        }
        int D = ouj.D(this.g);
        cs2 cs2Var = this.k;
        yic yicVar = this.n;
        yic yicVar2 = this.p;
        yic yicVar3 = this.l;
        yic yicVar4 = this.j;
        if (D == 0) {
            z = true;
            float floatValue = ((Float) yicVar4.e()).floatValue();
            double radians = Math.toRadians((yicVar3 != null ? ((Float) yicVar3.e()).floatValue() : 0.0d) - 90.0d);
            double d3 = floatValue;
            float f7 = (float) (6.283185307179586d / d3);
            if (this.i) {
                f7 *= -1.0f;
            }
            float f8 = f7;
            float f9 = f8 / 2.0f;
            float f10 = floatValue - ((int) floatValue);
            if (f10 != 0.0f) {
                f = 2.0f;
                radians += (1.0f - f10) * f9;
            } else {
                f = 2.0f;
            }
            float floatValue2 = ((Float) yicVar.e()).floatValue();
            float floatValue3 = ((Float) this.m.e()).floatValue();
            yic yicVar5 = this.o;
            float floatValue4 = yicVar5 != null ? ((Float) yicVar5.e()).floatValue() / 100.0f : 0.0f;
            float floatValue5 = yicVar2 != null ? ((Float) yicVar2.e()).floatValue() / 100.0f : 0.0f;
            if (f10 != 0.0f) {
                float e = su4.e(floatValue2, floatValue3, f10, floatValue3);
                double d4 = e;
                f4 = e;
                float cos = (float) (Math.cos(radians) * d4);
                float sin = (float) (Math.sin(radians) * d4);
                path.moveTo(cos, sin);
                d = radians + ((f8 * f10) / f);
                f2 = cos;
                f3 = sin;
            } else {
                double d5 = floatValue2;
                float cos2 = (float) (Math.cos(radians) * d5);
                float sin2 = (float) (Math.sin(radians) * d5);
                path.moveTo(cos2, sin2);
                d = radians + f9;
                f2 = cos2;
                f3 = sin2;
                f4 = 0.0f;
            }
            double ceil = Math.ceil(d3) * 2.0d;
            double d6 = d;
            int i2 = 0;
            boolean z3 = false;
            while (true) {
                double d7 = i2;
                if (d7 >= ceil) {
                    break;
                }
                float f11 = z3 ? floatValue2 : floatValue3;
                float f12 = (f4 == 0.0f || d7 != ceil - 2.0d) ? f9 : (f8 * f10) / f;
                if (f4 != 0.0f && d7 == ceil - 1.0d) {
                    f11 = f4;
                }
                double d8 = f11;
                float cos3 = (float) (Math.cos(d6) * d8);
                float sin3 = (float) (Math.sin(d6) * d8);
                if (floatValue4 == 0.0f && floatValue5 == 0.0f) {
                    path.lineTo(cos3, sin3);
                    f5 = f10;
                    f6 = cos3;
                } else {
                    f5 = f10;
                    Path path2 = path;
                    double atan2 = (float) (Math.atan2(f3, f2) - 1.5707963267948966d);
                    float cos4 = (float) Math.cos(atan2);
                    float sin4 = (float) Math.sin(atan2);
                    float f13 = f2;
                    float f14 = f3;
                    double atan22 = (float) (Math.atan2(sin3, cos3) - 1.5707963267948966d);
                    float cos5 = (float) Math.cos(atan22);
                    float sin5 = (float) Math.sin(atan22);
                    float f15 = z3 ? floatValue4 : floatValue5;
                    float f16 = z3 ? floatValue5 : floatValue4;
                    float f17 = (z3 ? floatValue3 : floatValue2) * f15 * 0.47829f;
                    float f18 = cos4 * f17;
                    float f19 = f17 * sin4;
                    float f20 = (z3 ? floatValue2 : floatValue3) * f16 * 0.47829f;
                    float f21 = cos5 * f20;
                    float f22 = f20 * sin5;
                    if (f10 != 0.0f) {
                        if (i2 == 0) {
                            f18 *= f5;
                            f19 *= f5;
                        } else if (d7 == ceil - 1.0d) {
                            f21 *= f5;
                            f22 *= f5;
                        }
                    }
                    f6 = cos3;
                    path = path2;
                    path.cubicTo(f13 - f18, f14 - f19, f21 + cos3, sin3 + f22, f6, sin3);
                }
                d6 += f12;
                z3 = !z3;
                i2++;
                f2 = f6;
                f3 = sin3;
                f10 = f5;
                f = 2.0f;
            }
            PointF pointF = (PointF) cs2Var.e();
            path.offset(pointF.x, pointF.y);
            path.close();
        } else if (D != 1) {
            z = true;
        } else {
            int floor = (int) Math.floor(((Float) yicVar4.e()).floatValue());
            double radians2 = Math.toRadians((yicVar3 != null ? ((Float) yicVar3.e()).floatValue() : 0.0d) - 90.0d);
            double d9 = floor;
            float floatValue6 = ((Float) yicVar2.e()).floatValue() / 100.0f;
            float floatValue7 = ((Float) yicVar.e()).floatValue();
            double d10 = floatValue7;
            z = true;
            float cos6 = (float) (Math.cos(radians2) * d10);
            float sin6 = (float) (Math.sin(radians2) * d10);
            path.moveTo(cos6, sin6);
            double d11 = (float) (6.283185307179586d / d9);
            double ceil2 = Math.ceil(d9);
            double d12 = radians2 + d11;
            int i3 = 0;
            while (true) {
                double d13 = i3;
                if (d13 >= ceil2) {
                    break;
                }
                double d14 = ceil2;
                float cos7 = (float) (Math.cos(d12) * d10);
                float sin7 = (float) (Math.sin(d12) * d10);
                if (floatValue6 != 0.0f) {
                    i = i3;
                    Path path3 = path;
                    d2 = d10;
                    double atan23 = (float) (Math.atan2(sin6, cos6) - 1.5707963267948966d);
                    float cos8 = (float) Math.cos(atan23);
                    float sin8 = (float) Math.sin(atan23);
                    double atan24 = (float) (Math.atan2(sin7, cos7) - 1.5707963267948966d);
                    float f23 = floatValue7 * floatValue6 * 0.25f;
                    float f24 = f23 * cos8;
                    float f25 = f23 * sin8;
                    float cos9 = ((float) Math.cos(atan24)) * f23;
                    float sin9 = f23 * ((float) Math.sin(atan24));
                    if (d13 == d14 - 1.0d) {
                        Path path4 = this.b;
                        path4.reset();
                        path4.moveTo(cos6, sin6);
                        float f26 = cos6 - f24;
                        float f27 = sin6 - f25;
                        float f28 = cos7 + cos9;
                        float f29 = sin7 + sin9;
                        path4.cubicTo(f26, f27, f28, f29, cos7, sin7);
                        PathMeasure pathMeasure = this.c;
                        pathMeasure.setPath(path4, false);
                        float length = pathMeasure.getLength() * 0.9999f;
                        float[] fArr = this.d;
                        pathMeasure.getPosTan(length, fArr, null);
                        path = path3;
                        path.cubicTo(f26, f27, f28, f29, fArr[0], fArr[1]);
                        cos6 = cos7;
                        sin6 = sin7;
                    } else {
                        float f30 = sin7 + sin9;
                        path = path3;
                        sin6 = sin7;
                        path.cubicTo(cos6 - f24, sin6 - f25, cos7 + cos9, f30, cos7, sin6);
                        cos6 = cos7;
                    }
                } else {
                    i = i3;
                    d2 = d10;
                    cos6 = cos7;
                    sin6 = sin7;
                    if (d13 == d14 - 1.0d) {
                        i3 = i + 1;
                        ceil2 = d14;
                        d10 = d2;
                    } else {
                        path.lineTo(cos6, sin6);
                    }
                }
                d12 += d11;
                i3 = i + 1;
                ceil2 = d14;
                d10 = d2;
            }
            PointF pointF2 = (PointF) cs2Var.e();
            path.offset(pointF2.x, pointF2.y);
            path.close();
        }
        path.close();
        this.q.b(path);
        this.r = z;
        return path;
    }
}
