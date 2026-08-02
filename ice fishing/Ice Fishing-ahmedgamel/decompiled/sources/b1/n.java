package b1;

import Z0.v;
import Z0.z;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import c1.AbstractC0545e;
import c1.InterfaceC0541a;
import com.google.android.gms.internal.ads.LP;
import com.google.android.gms.internal.ads.Wv;
import h1.AbstractC4563a;
import java.util.ArrayList;
import java.util.List;
import l1.AbstractC4672g;
import u.AbstractC5050e;

/* loaded from: classes.dex */
public final class n implements m, InterfaceC0541a, k {

    /* renamed from: e, reason: collision with root package name */
    public final String f5458e;

    /* renamed from: f, reason: collision with root package name */
    public final v f5459f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5460g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f5461h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final c1.i f5462j;

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC0545e f5463k;

    /* renamed from: l, reason: collision with root package name */
    public final c1.i f5464l;

    /* renamed from: m, reason: collision with root package name */
    public final c1.i f5465m;

    /* renamed from: n, reason: collision with root package name */
    public final c1.i f5466n;

    /* renamed from: o, reason: collision with root package name */
    public final c1.i f5467o;

    /* renamed from: p, reason: collision with root package name */
    public final c1.i f5468p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f5470r;

    /* renamed from: a, reason: collision with root package name */
    public final Path f5454a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final Path f5455b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final PathMeasure f5456c = new PathMeasure();

    /* renamed from: d, reason: collision with root package name */
    public final float[] f5457d = new float[2];

    /* renamed from: q, reason: collision with root package name */
    public final K1.b f5469q = new K1.b(2);

    public n(v vVar, AbstractC4563a abstractC4563a, g1.h hVar) {
        this.f5459f = vVar;
        this.f5458e = hVar.f37613a;
        int i = hVar.f37614b;
        this.f5460g = i;
        this.f5461h = hVar.f37621j;
        this.i = hVar.f37622k;
        c1.i a9 = hVar.f37615c.a();
        this.f5462j = a9;
        AbstractC0545e a10 = hVar.f37616d.a();
        this.f5463k = a10;
        c1.i a11 = hVar.f37617e.a();
        this.f5464l = a11;
        c1.i a12 = hVar.f37619g.a();
        this.f5466n = a12;
        c1.i a13 = hVar.i.a();
        this.f5468p = a13;
        if (i == 1) {
            this.f5465m = hVar.f37618f.a();
            this.f5467o = hVar.f37620h.a();
        } else {
            this.f5465m = null;
            this.f5467o = null;
        }
        abstractC4563a.f(a9);
        abstractC4563a.f(a10);
        abstractC4563a.f(a11);
        abstractC4563a.f(a12);
        abstractC4563a.f(a13);
        if (i == 1) {
            abstractC4563a.f(this.f5465m);
            abstractC4563a.f(this.f5467o);
        }
        a9.a(this);
        a10.a(this);
        a11.a(this);
        a12.a(this);
        a13.a(this);
        if (i == 1) {
            this.f5465m.a(this);
            this.f5467o.a(this);
        }
    }

    @Override // c1.InterfaceC0541a
    public final void a() {
        this.f5470r = false;
        this.f5459f.invalidateSelf();
    }

    @Override // b1.InterfaceC0519c
    public final void b(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                return;
            }
            InterfaceC0519c interfaceC0519c = (InterfaceC0519c) arrayList.get(i);
            if (interfaceC0519c instanceof t) {
                t tVar = (t) interfaceC0519c;
                if (tVar.f5507c == 1) {
                    this.f5469q.f1670a.add(tVar);
                    tVar.c(this);
                }
            }
            i++;
        }
    }

    @Override // e1.f
    public final void c(e1.e eVar, int i, ArrayList arrayList, e1.e eVar2) {
        AbstractC4672g.g(eVar, i, arrayList, eVar2, this);
    }

    @Override // e1.f
    public final void d(ColorFilter colorFilter, LP lp) {
        c1.i iVar;
        c1.i iVar2;
        if (colorFilter == z.f4099u) {
            this.f5462j.j(lp);
            return;
        }
        if (colorFilter == z.f4100v) {
            this.f5464l.j(lp);
            return;
        }
        if (colorFilter == z.i) {
            this.f5463k.j(lp);
            return;
        }
        if (colorFilter == z.f4101w && (iVar2 = this.f5465m) != null) {
            iVar2.j(lp);
            return;
        }
        if (colorFilter == z.f4102x) {
            this.f5466n.j(lp);
            return;
        }
        if (colorFilter == z.f4103y && (iVar = this.f5467o) != null) {
            iVar.j(lp);
        } else if (colorFilter == z.f4104z) {
            this.f5468p.j(lp);
        }
    }

    @Override // b1.m
    public final Path g() {
        boolean z6;
        double d9;
        float f2;
        float f9;
        double d10;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        int i;
        int i4;
        double d11;
        boolean z9 = this.f5470r;
        Path path = this.f5454a;
        if (z9) {
            return path;
        }
        path.reset();
        if (this.f5461h) {
            this.f5470r = true;
            return path;
        }
        int d12 = AbstractC5050e.d(this.f5460g);
        AbstractC0545e abstractC0545e = this.f5463k;
        float f16 = 0.0f;
        c1.i iVar = this.f5466n;
        c1.i iVar2 = this.f5468p;
        c1.i iVar3 = this.f5464l;
        c1.i iVar4 = this.f5462j;
        if (d12 == 0) {
            z6 = true;
            float floatValue = ((Float) iVar4.e()).floatValue();
            double radians = Math.toRadians((iVar3 != null ? ((Float) iVar3.e()).floatValue() : 0.0d) - 90.0d);
            double d13 = floatValue;
            float f17 = (float) (6.283185307179586d / d13);
            if (this.i) {
                f17 *= -1.0f;
            }
            float f18 = f17;
            float f19 = f18 / 2.0f;
            float f20 = floatValue - ((int) floatValue);
            if (f20 != 0.0f) {
                d9 = d13;
                radians += (1.0f - f20) * f19;
            } else {
                d9 = d13;
            }
            float floatValue2 = ((Float) iVar.e()).floatValue();
            float floatValue3 = ((Float) this.f5465m.e()).floatValue();
            c1.i iVar5 = this.f5467o;
            float floatValue4 = iVar5 != null ? ((Float) iVar5.e()).floatValue() / 100.0f : 0.0f;
            float floatValue5 = iVar2 != null ? ((Float) iVar2.e()).floatValue() / 100.0f : 0.0f;
            if (f20 != 0.0f) {
                float a9 = Wv.a(floatValue2, floatValue3, f20, floatValue3);
                double d14 = a9;
                f10 = (float) (Math.cos(radians) * d14);
                f11 = (float) (Math.sin(radians) * d14);
                path.moveTo(f10, f11);
                f2 = 2.0f;
                d10 = radians + ((f18 * f20) / 2.0f);
                f12 = a9;
                f9 = f19;
            } else {
                f2 = 2.0f;
                double d15 = floatValue2;
                float cos = (float) (Math.cos(radians) * d15);
                float sin = (float) (Math.sin(radians) * d15);
                path.moveTo(cos, sin);
                f9 = f19;
                d10 = radians + f9;
                f10 = cos;
                f11 = sin;
                f12 = 0.0f;
            }
            double ceil = Math.ceil(d9) * 2.0d;
            double d16 = d10;
            int i6 = 0;
            boolean z10 = false;
            while (true) {
                double d17 = i6;
                if (d17 >= ceil) {
                    break;
                }
                float f21 = z10 ? floatValue2 : floatValue3;
                if (f12 == f16 || d17 != ceil - 2.0d) {
                    f13 = f16;
                    f14 = f9;
                } else {
                    f13 = f16;
                    f14 = (f18 * f20) / f2;
                }
                if (f12 != f16 && d17 == ceil - 1.0d) {
                    f21 = f12;
                }
                double d18 = f21;
                float cos2 = (float) (Math.cos(d16) * d18);
                float f22 = f18;
                float sin2 = (float) (Math.sin(d16) * d18);
                if (floatValue4 == f13 && floatValue5 == f13) {
                    path.lineTo(cos2, sin2);
                    f15 = f20;
                    i = i6;
                } else {
                    f15 = f20;
                    Path path2 = path;
                    float f23 = f11;
                    double atan2 = (float) (Math.atan2(f11, f10) - 1.5707963267948966d);
                    float cos3 = (float) Math.cos(atan2);
                    float sin3 = (float) Math.sin(atan2);
                    i = i6;
                    float f24 = f10;
                    double atan22 = (float) (Math.atan2(sin2, cos2) - 1.5707963267948966d);
                    float cos4 = (float) Math.cos(atan22);
                    float sin4 = (float) Math.sin(atan22);
                    float f25 = z10 ? floatValue4 : floatValue5;
                    float f26 = z10 ? floatValue5 : floatValue4;
                    float f27 = (z10 ? floatValue3 : floatValue2) * f25 * 0.47829f;
                    float f28 = cos3 * f27;
                    float f29 = f27 * sin3;
                    float f30 = (z10 ? floatValue2 : floatValue3) * f26 * 0.47829f;
                    float f31 = cos4 * f30;
                    float f32 = f30 * sin4;
                    if (f20 != 0.0f) {
                        if (i == 0) {
                            f28 *= f15;
                            f29 *= f15;
                        } else if (d17 == ceil - 1.0d) {
                            f31 *= f15;
                            f32 *= f15;
                        }
                    }
                    path = path2;
                    path.cubicTo(f24 - f28, f23 - f29, f31 + cos2, sin2 + f32, cos2, sin2);
                }
                d16 += f14;
                z10 = !z10;
                i6 = i + 1;
                f10 = cos2;
                f11 = sin2;
                f20 = f15;
                f18 = f22;
                f16 = f13;
            }
            PointF pointF = (PointF) abstractC0545e.e();
            path.offset(pointF.x, pointF.y);
            path.close();
        } else if (d12 != 1) {
            z6 = true;
        } else {
            int floor = (int) Math.floor(((Float) iVar4.e()).floatValue());
            double radians2 = Math.toRadians((iVar3 != null ? ((Float) iVar3.e()).floatValue() : 0.0d) - 90.0d);
            double d19 = floor;
            float floatValue6 = ((Float) iVar2.e()).floatValue() / 100.0f;
            float floatValue7 = ((Float) iVar.e()).floatValue();
            double d20 = floatValue7;
            z6 = true;
            float cos5 = (float) (Math.cos(radians2) * d20);
            float sin5 = (float) (Math.sin(radians2) * d20);
            path.moveTo(cos5, sin5);
            double d21 = (float) (6.283185307179586d / d19);
            double ceil2 = Math.ceil(d19);
            double d22 = radians2 + d21;
            int i9 = 0;
            while (true) {
                double d23 = i9;
                if (d23 >= ceil2) {
                    break;
                }
                double d24 = ceil2;
                float cos6 = (float) (Math.cos(d22) * d20);
                float sin6 = (float) (Math.sin(d22) * d20);
                if (floatValue6 != 0.0f) {
                    i4 = i9;
                    Path path3 = path;
                    d11 = d21;
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
                    if (d23 == d24 - 1.0d) {
                        Path path4 = this.f5455b;
                        path4.reset();
                        path4.moveTo(f33, sin5);
                        float f37 = f33 - f35;
                        float f38 = sin5 - f36;
                        float f39 = cos6 + cos8;
                        float f40 = sin6 + sin8;
                        path4.cubicTo(f37, f38, f39, f40, cos6, sin6);
                        PathMeasure pathMeasure = this.f5456c;
                        pathMeasure.setPath(path4, false);
                        float length = pathMeasure.getLength() * 0.9999f;
                        float[] fArr = this.f5457d;
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
                    i4 = i9;
                    d11 = d21;
                    cos5 = cos6;
                    sin5 = sin6;
                    if (d23 == d24 - 1.0d) {
                        i9 = i4 + 1;
                        d21 = d11;
                        ceil2 = d24;
                    } else {
                        path.lineTo(cos5, sin5);
                    }
                }
                d22 += d11;
                i9 = i4 + 1;
                d21 = d11;
                ceil2 = d24;
            }
            PointF pointF2 = (PointF) abstractC0545e.e();
            path.offset(pointF2.x, pointF2.y);
            path.close();
        }
        path.close();
        this.f5469q.a(path);
        this.f5470r = z6;
        return path;
    }

    @Override // b1.InterfaceC0519c
    public final String getName() {
        return this.f5458e;
    }
}
