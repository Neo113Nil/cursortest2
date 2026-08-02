package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.PolystarShape$Type;
import com.airbnb.lottie.model.content.ShapeTrimPath$Type;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public final class x5e0 implements vq90, e35, uix {
    public final String e;
    public final LottieDrawable f;
    public final PolystarShape$Type g;
    public final boolean h;
    public final boolean i;
    public final kor j;
    public final i35 k;
    public final kor l;
    public final kor m;
    public final kor n;
    public final kor o;
    public final kor p;
    public boolean r;
    public final Path a = new Path();
    public final Path b = new Path();
    public final PathMeasure c = new PathMeasure();
    public final float[] d = new float[2];
    public final dwd q = new dwd();

    public x5e0(LottieDrawable lottieDrawable, l35 l35Var, y5e0 y5e0Var) {
        this.f = lottieDrawable;
        this.e = y5e0Var.a;
        PolystarShape$Type polystarShape$Type = y5e0Var.b;
        this.g = polystarShape$Type;
        this.h = y5e0Var.j;
        this.i = y5e0Var.k;
        kor I = y5e0Var.c.I();
        this.j = I;
        i35 I2 = y5e0Var.d.I();
        this.k = I2;
        kor I3 = y5e0Var.e.I();
        this.l = I3;
        kor I4 = y5e0Var.g.I();
        this.n = I4;
        kor I5 = y5e0Var.i.I();
        this.p = I5;
        PolystarShape$Type polystarShape$Type2 = PolystarShape$Type.STAR;
        if (polystarShape$Type == polystarShape$Type2) {
            this.m = y5e0Var.f.I();
            this.o = y5e0Var.h.I();
        } else {
            this.m = null;
            this.o = null;
        }
        l35Var.c(I);
        l35Var.c(I2);
        l35Var.c(I3);
        l35Var.c(I4);
        l35Var.c(I5);
        if (polystarShape$Type == polystarShape$Type2) {
            l35Var.c(this.m);
            l35Var.c(this.o);
        }
        I.a(this);
        I2.a(this);
        I3.a(this);
        I4.a(this);
        I5.a(this);
        if (polystarShape$Type == polystarShape$Type2) {
            this.m.a(this);
            this.o.a(this);
        }
    }

    @Override // defpackage.tix
    public final void a(six sixVar, int i, ArrayList arrayList, six sixVar2) {
        ti20.g(sixVar, i, arrayList, sixVar2, this);
    }

    @Override // defpackage.e35
    public final void d() {
        this.r = false;
        this.f.invalidateSelf();
    }

    @Override // defpackage.uee
    public final void e(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                return;
            }
            uee ueeVar = (uee) arrayList.get(i);
            if (ueeVar instanceof ff11) {
                ff11 ff11Var = (ff11) ueeVar;
                if (ff11Var.c == ShapeTrimPath$Type.SIMULTANEOUSLY) {
                    this.q.a.add(ff11Var);
                    ff11Var.a(this);
                }
            }
            i++;
        }
    }

    @Override // defpackage.tix
    public final void g(puz puzVar, Object obj) {
        kor korVar;
        kor korVar2;
        if (obj == cuz.u) {
            this.j.k(puzVar);
            return;
        }
        if (obj == cuz.v) {
            this.l.k(puzVar);
            return;
        }
        if (obj == cuz.i) {
            this.k.k(puzVar);
            return;
        }
        if (obj == cuz.w && (korVar2 = this.m) != null) {
            korVar2.k(puzVar);
            return;
        }
        if (obj == cuz.x) {
            this.n.k(puzVar);
            return;
        }
        if (obj == cuz.y && (korVar = this.o) != null) {
            korVar.k(puzVar);
        } else if (obj == cuz.z) {
            this.p.k(puzVar);
        }
    }

    @Override // defpackage.uee
    public final String getName() {
        return this.e;
    }

    @Override // defpackage.vq90
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
        int i2 = w5e0.a[this.g.ordinal()];
        i35 i35Var = this.k;
        kor korVar = this.n;
        kor korVar2 = this.p;
        kor korVar3 = this.l;
        kor korVar4 = this.j;
        if (i2 == 1) {
            z = true;
            float floatValue = ((Float) korVar4.f()).floatValue();
            double radians = Math.toRadians((korVar3 != null ? ((Float) korVar3.f()).floatValue() : 0.0d) - 90.0d);
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
            float floatValue2 = ((Float) korVar.f()).floatValue();
            float floatValue3 = ((Float) this.m.f()).floatValue();
            kor korVar5 = this.o;
            float floatValue4 = korVar5 != null ? ((Float) korVar5.f()).floatValue() / 100.0f : 0.0f;
            float floatValue5 = korVar2 != null ? ((Float) korVar2.f()).floatValue() / 100.0f : 0.0f;
            if (f10 != 0.0f) {
                float b = g8e.b(floatValue2, floatValue3, f10, floatValue3);
                double d4 = b;
                f4 = b;
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
            int i3 = 0;
            boolean z3 = false;
            while (true) {
                double d7 = i3;
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
                        if (i3 == 0) {
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
                i3++;
                f2 = f6;
                f3 = sin3;
                f10 = f5;
                f = 2.0f;
            }
            PointF pointF = (PointF) i35Var.f();
            path.offset(pointF.x, pointF.y);
            path.close();
        } else if (i2 != 2) {
            z = true;
        } else {
            int floor = (int) Math.floor(((Float) korVar4.f()).floatValue());
            double radians2 = Math.toRadians((korVar3 != null ? ((Float) korVar3.f()).floatValue() : 0.0d) - 90.0d);
            double d9 = floor;
            float floatValue6 = ((Float) korVar2.f()).floatValue() / 100.0f;
            float floatValue7 = ((Float) korVar.f()).floatValue();
            double d10 = floatValue7;
            z = true;
            float cos6 = (float) (Math.cos(radians2) * d10);
            float sin6 = (float) (Math.sin(radians2) * d10);
            path.moveTo(cos6, sin6);
            double d11 = (float) (6.283185307179586d / d9);
            double ceil2 = Math.ceil(d9);
            double d12 = radians2 + d11;
            int i4 = 0;
            while (true) {
                double d13 = i4;
                if (d13 >= ceil2) {
                    break;
                }
                double d14 = ceil2;
                float cos7 = (float) (Math.cos(d12) * d10);
                float sin7 = (float) (Math.sin(d12) * d10);
                if (floatValue6 != 0.0f) {
                    i = i4;
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
                    i = i4;
                    d2 = d10;
                    cos6 = cos7;
                    sin6 = sin7;
                    if (d13 == d14 - 1.0d) {
                        i4 = i + 1;
                        ceil2 = d14;
                        d10 = d2;
                    } else {
                        path.lineTo(cos6, sin6);
                    }
                }
                d12 += d11;
                i4 = i + 1;
                ceil2 = d14;
                d10 = d2;
            }
            PointF pointF2 = (PointF) i35Var.f();
            path.offset(pointF2.x, pointF2.y);
            path.close();
        }
        path.close();
        this.q.a(path);
        this.r = z;
        return path;
    }
}
