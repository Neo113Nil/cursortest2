package Z0;

import X0.v;
import X0.z;
import a1.AbstractC0428e;
import a1.InterfaceC0424a;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.google.android.gms.internal.ads.C2991bm;
import com.icefishing.icefishinglive2.AbstractC4404f;
import f1.AbstractC4498a;
import j1.AbstractC4603g;
import java.util.ArrayList;
import java.util.List;
import u.AbstractC5049e;

/* loaded from: classes.dex */
public final class n implements m, InterfaceC0424a, k {

    /* renamed from: e, reason: collision with root package name */
    public final String f4069e;

    /* renamed from: f, reason: collision with root package name */
    public final v f4070f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4071g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f4072h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final a1.i f4073j;

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC0428e f4074k;

    /* renamed from: l, reason: collision with root package name */
    public final a1.i f4075l;

    /* renamed from: m, reason: collision with root package name */
    public final a1.i f4076m;

    /* renamed from: n, reason: collision with root package name */
    public final a1.i f4077n;

    /* renamed from: o, reason: collision with root package name */
    public final a1.i f4078o;

    /* renamed from: p, reason: collision with root package name */
    public final a1.i f4079p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f4081r;

    /* renamed from: a, reason: collision with root package name */
    public final Path f4065a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final Path f4066b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final PathMeasure f4067c = new PathMeasure();

    /* renamed from: d, reason: collision with root package name */
    public final float[] f4068d = new float[2];

    /* renamed from: q, reason: collision with root package name */
    public final G1.e f4080q = new G1.e(2);

    public n(v vVar, AbstractC4498a abstractC4498a, e1.h hVar) {
        this.f4070f = vVar;
        this.f4069e = hVar.f37137a;
        int i = hVar.f37138b;
        this.f4071g = i;
        this.f4072h = hVar.f37145j;
        this.i = hVar.f37146k;
        a1.i a9 = hVar.f37139c.a();
        this.f4073j = a9;
        AbstractC0428e a10 = hVar.f37140d.a();
        this.f4074k = a10;
        a1.i a11 = hVar.f37141e.a();
        this.f4075l = a11;
        a1.i a12 = hVar.f37143g.a();
        this.f4077n = a12;
        a1.i a13 = hVar.i.a();
        this.f4079p = a13;
        if (i == 1) {
            this.f4076m = hVar.f37142f.a();
            this.f4078o = hVar.f37144h.a();
        } else {
            this.f4076m = null;
            this.f4078o = null;
        }
        abstractC4498a.d(a9);
        abstractC4498a.d(a10);
        abstractC4498a.d(a11);
        abstractC4498a.d(a12);
        abstractC4498a.d(a13);
        if (i == 1) {
            abstractC4498a.d(this.f4076m);
            abstractC4498a.d(this.f4078o);
        }
        a9.a(this);
        a10.a(this);
        a11.a(this);
        a12.a(this);
        a13.a(this);
        if (i == 1) {
            this.f4076m.a(this);
            this.f4078o.a(this);
        }
    }

    @Override // a1.InterfaceC0424a
    public final void a() {
        this.f4081r = false;
        this.f4070f.invalidateSelf();
    }

    @Override // Z0.c
    public final void b(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                return;
            }
            c cVar = (c) arrayList.get(i);
            if (cVar instanceof t) {
                t tVar = (t) cVar;
                if (tVar.f4118c == 1) {
                    this.f4080q.f1056a.add(tVar);
                    tVar.d(this);
                }
            }
            i++;
        }
    }

    @Override // c1.f
    public final void e(c1.e eVar, int i, ArrayList arrayList, c1.e eVar2) {
        AbstractC4603g.g(eVar, i, arrayList, eVar2, this);
    }

    @Override // Z0.m
    public final Path f() {
        boolean z3;
        double d2;
        float f3;
        float f9;
        double d9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        int i;
        int i6;
        double d10;
        boolean z6 = this.f4081r;
        Path path = this.f4065a;
        if (z6) {
            return path;
        }
        path.reset();
        if (this.f4072h) {
            this.f4081r = true;
            return path;
        }
        int d11 = AbstractC5049e.d(this.f4071g);
        AbstractC0428e abstractC0428e = this.f4074k;
        float f16 = 0.0f;
        a1.i iVar = this.f4077n;
        a1.i iVar2 = this.f4079p;
        a1.i iVar3 = this.f4075l;
        a1.i iVar4 = this.f4073j;
        if (d11 == 0) {
            z3 = true;
            float floatValue = ((Float) iVar4.e()).floatValue();
            double radians = Math.toRadians((iVar3 != null ? ((Float) iVar3.e()).floatValue() : 0.0d) - 90.0d);
            double d12 = floatValue;
            float f17 = (float) (6.283185307179586d / d12);
            if (this.i) {
                f17 *= -1.0f;
            }
            float f18 = f17;
            float f19 = f18 / 2.0f;
            float f20 = floatValue - ((int) floatValue);
            if (f20 != 0.0f) {
                d2 = d12;
                radians += (1.0f - f20) * f19;
            } else {
                d2 = d12;
            }
            float floatValue2 = ((Float) iVar.e()).floatValue();
            float floatValue3 = ((Float) this.f4076m.e()).floatValue();
            a1.i iVar5 = this.f4078o;
            float floatValue4 = iVar5 != null ? ((Float) iVar5.e()).floatValue() / 100.0f : 0.0f;
            float floatValue5 = iVar2 != null ? ((Float) iVar2.e()).floatValue() / 100.0f : 0.0f;
            if (f20 != 0.0f) {
                float a9 = AbstractC4404f.a(floatValue2, floatValue3, f20, floatValue3);
                double d13 = a9;
                f10 = (float) (Math.cos(radians) * d13);
                f11 = (float) (Math.sin(radians) * d13);
                path.moveTo(f10, f11);
                f3 = 2.0f;
                d9 = radians + ((f18 * f20) / 2.0f);
                f12 = a9;
                f9 = f19;
            } else {
                f3 = 2.0f;
                double d14 = floatValue2;
                float cos = (float) (Math.cos(radians) * d14);
                float sin = (float) (Math.sin(radians) * d14);
                path.moveTo(cos, sin);
                f9 = f19;
                d9 = radians + f9;
                f10 = cos;
                f11 = sin;
                f12 = 0.0f;
            }
            double ceil = Math.ceil(d2) * 2.0d;
            double d15 = d9;
            int i9 = 0;
            boolean z9 = false;
            while (true) {
                double d16 = i9;
                if (d16 >= ceil) {
                    break;
                }
                float f21 = z9 ? floatValue2 : floatValue3;
                if (f12 == f16 || d16 != ceil - 2.0d) {
                    f13 = f16;
                    f14 = f9;
                } else {
                    f13 = f16;
                    f14 = (f18 * f20) / f3;
                }
                if (f12 != f16 && d16 == ceil - 1.0d) {
                    f21 = f12;
                }
                double d17 = f21;
                float cos2 = (float) (Math.cos(d15) * d17);
                float f22 = f18;
                float sin2 = (float) (Math.sin(d15) * d17);
                if (floatValue4 == f13 && floatValue5 == f13) {
                    path.lineTo(cos2, sin2);
                    f15 = f20;
                    i = i9;
                } else {
                    f15 = f20;
                    Path path2 = path;
                    float f23 = f11;
                    double atan2 = (float) (Math.atan2(f11, f10) - 1.5707963267948966d);
                    float cos3 = (float) Math.cos(atan2);
                    float sin3 = (float) Math.sin(atan2);
                    i = i9;
                    float f24 = f10;
                    double atan22 = (float) (Math.atan2(sin2, cos2) - 1.5707963267948966d);
                    float cos4 = (float) Math.cos(atan22);
                    float sin4 = (float) Math.sin(atan22);
                    float f25 = z9 ? floatValue4 : floatValue5;
                    float f26 = z9 ? floatValue5 : floatValue4;
                    float f27 = (z9 ? floatValue3 : floatValue2) * f25 * 0.47829f;
                    float f28 = cos3 * f27;
                    float f29 = f27 * sin3;
                    float f30 = (z9 ? floatValue2 : floatValue3) * f26 * 0.47829f;
                    float f31 = cos4 * f30;
                    float f32 = f30 * sin4;
                    if (f20 != 0.0f) {
                        if (i == 0) {
                            f28 *= f15;
                            f29 *= f15;
                        } else if (d16 == ceil - 1.0d) {
                            f31 *= f15;
                            f32 *= f15;
                        }
                    }
                    path = path2;
                    path.cubicTo(f24 - f28, f23 - f29, f31 + cos2, sin2 + f32, cos2, sin2);
                }
                d15 += f14;
                z9 = !z9;
                i9 = i + 1;
                f10 = cos2;
                f11 = sin2;
                f20 = f15;
                f18 = f22;
                f16 = f13;
            }
            PointF pointF = (PointF) abstractC0428e.e();
            path.offset(pointF.x, pointF.y);
            path.close();
        } else if (d11 != 1) {
            z3 = true;
        } else {
            int floor = (int) Math.floor(((Float) iVar4.e()).floatValue());
            double radians2 = Math.toRadians((iVar3 != null ? ((Float) iVar3.e()).floatValue() : 0.0d) - 90.0d);
            double d18 = floor;
            float floatValue6 = ((Float) iVar2.e()).floatValue() / 100.0f;
            float floatValue7 = ((Float) iVar.e()).floatValue();
            double d19 = floatValue7;
            z3 = true;
            float cos5 = (float) (Math.cos(radians2) * d19);
            float sin5 = (float) (Math.sin(radians2) * d19);
            path.moveTo(cos5, sin5);
            double d20 = (float) (6.283185307179586d / d18);
            double ceil2 = Math.ceil(d18);
            double d21 = radians2 + d20;
            int i10 = 0;
            while (true) {
                double d22 = i10;
                if (d22 >= ceil2) {
                    break;
                }
                double d23 = ceil2;
                float cos6 = (float) (Math.cos(d21) * d19);
                float sin6 = (float) (Math.sin(d21) * d19);
                if (floatValue6 != 0.0f) {
                    i6 = i10;
                    Path path3 = path;
                    d10 = d20;
                    double atan23 = (float) (Math.atan2(sin5, cos5) - 1.5707963267948966d);
                    float cos7 = (float) Math.cos(atan23);
                    float sin7 = (float) Math.sin(atan23);
                    float f33 = cos5;
                    double atan24 = (float) (Math.atan2(sin6, cos6) - 1.5707963267948966d);
                    float f34 = floatValue7 * floatValue6 * 0.25f;
                    float f35 = cos7 * f34;
                    float f36 = f34 * sin7;
                    float cos8 = ((float) Math.cos(atan24)) * f34;
                    float sin8 = f34 * ((float) Math.sin(atan24));
                    if (d22 == d23 - 1.0d) {
                        Path path4 = this.f4066b;
                        path4.reset();
                        path4.moveTo(f33, sin5);
                        float f37 = f33 - f35;
                        float f38 = sin5 - f36;
                        float f39 = cos6 + cos8;
                        float f40 = sin6 + sin8;
                        path4.cubicTo(f37, f38, f39, f40, cos6, sin6);
                        PathMeasure pathMeasure = this.f4067c;
                        pathMeasure.setPath(path4, false);
                        float length = pathMeasure.getLength() * 0.9999f;
                        float[] fArr = this.f4068d;
                        pathMeasure.getPosTan(length, fArr, null);
                        path = path3;
                        path.cubicTo(f37, f38, f39, f40, fArr[0], fArr[1]);
                        cos5 = cos6;
                        sin5 = sin6;
                    } else {
                        float f41 = sin6 + sin8;
                        path = path3;
                        path.cubicTo(f33 - f35, sin5 - f36, cos6 + cos8, f41, cos6, sin6);
                        cos5 = cos6;
                        sin5 = sin6;
                    }
                } else {
                    i6 = i10;
                    d10 = d20;
                    cos5 = cos6;
                    sin5 = sin6;
                    if (d22 == d23 - 1.0d) {
                        i10 = i6 + 1;
                        d20 = d10;
                        ceil2 = d23;
                    } else {
                        path.lineTo(cos5, sin5);
                    }
                }
                d21 += d10;
                i10 = i6 + 1;
                d20 = d10;
                ceil2 = d23;
            }
            PointF pointF2 = (PointF) abstractC0428e.e();
            path.offset(pointF2.x, pointF2.y);
            path.close();
        }
        path.close();
        this.f4080q.a(path);
        this.f4081r = z3;
        return path;
    }

    @Override // Z0.c
    public final String getName() {
        return this.f4069e;
    }

    @Override // c1.f
    public final void h(ColorFilter colorFilter, C2991bm c2991bm) {
        a1.i iVar;
        a1.i iVar2;
        if (colorFilter == z.f3748u) {
            this.f4073j.j(c2991bm);
            return;
        }
        if (colorFilter == z.f3749v) {
            this.f4075l.j(c2991bm);
            return;
        }
        if (colorFilter == z.i) {
            this.f4074k.j(c2991bm);
            return;
        }
        if (colorFilter == z.f3750w && (iVar2 = this.f4076m) != null) {
            iVar2.j(c2991bm);
            return;
        }
        if (colorFilter == z.f3751x) {
            this.f4077n.j(c2991bm);
            return;
        }
        if (colorFilter == z.f3752y && (iVar = this.f4078o) != null) {
            iVar.j(c2991bm);
        } else if (colorFilter == z.f3753z) {
            this.f4079p.j(c2991bm);
        }
    }
}
