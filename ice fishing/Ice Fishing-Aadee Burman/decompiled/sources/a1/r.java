package a1;

import X0.z;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import com.google.android.gms.internal.ads.C2991bm;
import d1.C4443a;
import d1.C4444b;
import d1.C4445c;
import f1.AbstractC4498a;
import java.util.Collections;
import k1.C4629a;
import k1.C4630b;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    public final Matrix f4292b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f4293c;

    /* renamed from: d, reason: collision with root package name */
    public final Matrix f4294d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f4295e;

    /* renamed from: l, reason: collision with root package name */
    public AbstractC0428e f4301l;

    /* renamed from: m, reason: collision with root package name */
    public AbstractC0428e f4302m;

    /* renamed from: n, reason: collision with root package name */
    public AbstractC0428e f4303n;

    /* renamed from: o, reason: collision with root package name */
    public AbstractC0428e f4304o;

    /* renamed from: p, reason: collision with root package name */
    public AbstractC0428e f4305p;

    /* renamed from: q, reason: collision with root package name */
    public i f4306q;

    /* renamed from: r, reason: collision with root package name */
    public i f4307r;

    /* renamed from: s, reason: collision with root package name */
    public i f4308s;

    /* renamed from: t, reason: collision with root package name */
    public i f4309t;

    /* renamed from: u, reason: collision with root package name */
    public i f4310u;

    /* renamed from: v, reason: collision with root package name */
    public AbstractC0428e f4311v;

    /* renamed from: w, reason: collision with root package name */
    public AbstractC0428e f4312w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f4313x;

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f4291a = new Matrix();

    /* renamed from: f, reason: collision with root package name */
    public float f4296f = Float.NaN;

    /* renamed from: g, reason: collision with root package name */
    public float f4297g = Float.NaN;

    /* renamed from: h, reason: collision with root package name */
    public float f4298h = Float.NaN;
    public float i = 1.0f;

    /* renamed from: j, reason: collision with root package name */
    public float f4299j = 1.0f;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4300k = true;

    public r(d1.e eVar) {
        C4445c c4445c = eVar.f37025a;
        this.f4301l = c4445c == null ? null : c4445c.a();
        d1.f fVar = eVar.f37026b;
        this.f4302m = fVar == null ? null : fVar.a();
        C4443a c4443a = eVar.f37027c;
        this.f4303n = c4443a == null ? null : c4443a.a();
        C4444b c4444b = eVar.f37028d;
        this.f4304o = c4444b == null ? null : c4444b.a();
        C4444b c4444b2 = eVar.f37030f;
        this.f4306q = c4444b2 == null ? null : c4444b2.a();
        this.f4313x = eVar.f37036m;
        C4444b c4444b3 = eVar.f37032h;
        this.f4308s = c4444b3 == null ? null : c4444b3.a();
        C4444b c4444b4 = eVar.i;
        this.f4309t = c4444b4 == null ? null : c4444b4.a();
        C4444b c4444b5 = eVar.f37033j;
        this.f4310u = c4444b5 == null ? null : c4444b5.a();
        if (this.f4306q != null) {
            this.f4292b = new Matrix();
            this.f4293c = new Matrix();
            this.f4294d = new Matrix();
            this.f4295e = new float[9];
        } else {
            this.f4292b = null;
            this.f4293c = null;
            this.f4294d = null;
            this.f4295e = null;
        }
        C4444b c4444b6 = eVar.f37031g;
        this.f4307r = c4444b6 == null ? null : c4444b6.a();
        C4443a c4443a2 = eVar.f37029e;
        if (c4443a2 != null) {
            this.f4305p = c4443a2.a();
        }
        C4444b c4444b7 = eVar.f37034k;
        if (c4444b7 != null) {
            this.f4311v = c4444b7.a();
        } else {
            this.f4311v = null;
        }
        C4444b c4444b8 = eVar.f37035l;
        if (c4444b8 != null) {
            this.f4312w = c4444b8.a();
        } else {
            this.f4312w = null;
        }
    }

    public final void a(AbstractC4498a abstractC4498a) {
        abstractC4498a.d(this.f4305p);
        abstractC4498a.d(this.f4311v);
        abstractC4498a.d(this.f4312w);
        abstractC4498a.d(this.f4301l);
        abstractC4498a.d(this.f4302m);
        abstractC4498a.d(this.f4303n);
        abstractC4498a.d(this.f4304o);
        abstractC4498a.d(this.f4306q);
        abstractC4498a.d(this.f4307r);
        abstractC4498a.d(this.f4308s);
        abstractC4498a.d(this.f4309t);
        abstractC4498a.d(this.f4310u);
    }

    public final void b(InterfaceC0424a interfaceC0424a) {
        AbstractC0428e abstractC0428e = this.f4305p;
        if (abstractC0428e != null) {
            abstractC0428e.a(interfaceC0424a);
        }
        AbstractC0428e abstractC0428e2 = this.f4311v;
        if (abstractC0428e2 != null) {
            abstractC0428e2.a(interfaceC0424a);
        }
        AbstractC0428e abstractC0428e3 = this.f4312w;
        if (abstractC0428e3 != null) {
            abstractC0428e3.a(interfaceC0424a);
        }
        AbstractC0428e abstractC0428e4 = this.f4301l;
        if (abstractC0428e4 != null) {
            abstractC0428e4.a(interfaceC0424a);
        }
        AbstractC0428e abstractC0428e5 = this.f4302m;
        if (abstractC0428e5 != null) {
            abstractC0428e5.a(interfaceC0424a);
        }
        AbstractC0428e abstractC0428e6 = this.f4303n;
        if (abstractC0428e6 != null) {
            abstractC0428e6.a(interfaceC0424a);
        }
        AbstractC0428e abstractC0428e7 = this.f4304o;
        if (abstractC0428e7 != null) {
            abstractC0428e7.a(interfaceC0424a);
        }
        i iVar = this.f4306q;
        if (iVar != null) {
            iVar.a(interfaceC0424a);
        }
        i iVar2 = this.f4307r;
        if (iVar2 != null) {
            iVar2.a(interfaceC0424a);
        }
        i iVar3 = this.f4308s;
        if (iVar3 != null) {
            iVar3.a(interfaceC0424a);
            this.f4308s.a(new q(0, this));
        }
        i iVar4 = this.f4309t;
        if (iVar4 != null) {
            iVar4.a(interfaceC0424a);
            this.f4309t.a(new q(1, this));
        }
        i iVar5 = this.f4310u;
        if (iVar5 != null) {
            iVar5.a(interfaceC0424a);
            this.f4310u.a(new q(2, this));
        }
    }

    public final boolean c(ColorFilter colorFilter, C2991bm c2991bm) {
        if (colorFilter == z.f3729a) {
            AbstractC0428e abstractC0428e = this.f4301l;
            if (abstractC0428e == null) {
                this.f4301l = new s(c2991bm, new PointF());
                return true;
            }
            abstractC0428e.j(c2991bm);
            return true;
        }
        if (colorFilter == z.f3730b) {
            AbstractC0428e abstractC0428e2 = this.f4302m;
            if (abstractC0428e2 == null) {
                this.f4302m = new s(c2991bm, new PointF());
                return true;
            }
            abstractC0428e2.j(c2991bm);
            return true;
        }
        if (colorFilter == z.f3731c) {
            AbstractC0428e abstractC0428e3 = this.f4302m;
            if (abstractC0428e3 instanceof o) {
                o oVar = (o) abstractC0428e3;
                C2991bm c2991bm2 = oVar.f4284m;
                oVar.f4284m = c2991bm;
                return true;
            }
        }
        if (colorFilter == z.f3732d) {
            AbstractC0428e abstractC0428e4 = this.f4302m;
            if (abstractC0428e4 instanceof o) {
                o oVar2 = (o) abstractC0428e4;
                C2991bm c2991bm3 = oVar2.f4285n;
                oVar2.f4285n = c2991bm;
                return true;
            }
        }
        if (colorFilter == z.f3737j) {
            AbstractC0428e abstractC0428e5 = this.f4303n;
            if (abstractC0428e5 == null) {
                this.f4303n = new s(c2991bm, new C4630b());
                return true;
            }
            abstractC0428e5.j(c2991bm);
            return true;
        }
        if (colorFilter == z.f3738k) {
            AbstractC0428e abstractC0428e6 = this.f4304o;
            if (abstractC0428e6 == null) {
                this.f4304o = new s(c2991bm, Float.valueOf(0.0f));
                return true;
            }
            abstractC0428e6.j(c2991bm);
            return true;
        }
        if (colorFilter == 3) {
            AbstractC0428e abstractC0428e7 = this.f4305p;
            if (abstractC0428e7 == null) {
                this.f4305p = new s(c2991bm, 100);
                return true;
            }
            abstractC0428e7.j(c2991bm);
            return true;
        }
        if (colorFilter == z.f3716A) {
            AbstractC0428e abstractC0428e8 = this.f4311v;
            if (abstractC0428e8 == null) {
                this.f4311v = new s(c2991bm, Float.valueOf(100.0f));
                return true;
            }
            abstractC0428e8.j(c2991bm);
            return true;
        }
        if (colorFilter == z.f3717B) {
            AbstractC0428e abstractC0428e9 = this.f4312w;
            if (abstractC0428e9 == null) {
                this.f4312w = new s(c2991bm, Float.valueOf(100.0f));
                return true;
            }
            abstractC0428e9.j(c2991bm);
            return true;
        }
        if (colorFilter == z.f3742o) {
            if (this.f4306q == null) {
                this.f4306q = new i(Collections.singletonList(new C4629a(Float.valueOf(0.0f))));
            }
            this.f4306q.j(c2991bm);
            return true;
        }
        if (colorFilter == z.f3743p) {
            if (this.f4307r == null) {
                this.f4307r = new i(Collections.singletonList(new C4629a(Float.valueOf(0.0f))));
            }
            this.f4307r.j(c2991bm);
            return true;
        }
        if (colorFilter == z.f3739l) {
            if (this.f4308s == null) {
                this.f4308s = new i(Collections.singletonList(new C4629a(Float.valueOf(0.0f))));
            }
            this.f4308s.j(c2991bm);
            return true;
        }
        if (colorFilter == z.f3740m) {
            if (this.f4309t == null) {
                this.f4309t = new i(Collections.singletonList(new C4629a(Float.valueOf(0.0f))));
            }
            this.f4309t.j(c2991bm);
            return true;
        }
        if (colorFilter != z.f3741n) {
            return false;
        }
        if (this.f4310u == null) {
            this.f4310u = new i(Collections.singletonList(new C4629a(Float.valueOf(0.0f))));
        }
        this.f4310u.j(c2991bm);
        return true;
    }

    public final void d() {
        for (int i = 0; i < 9; i++) {
            this.f4295e[i] = 0.0f;
        }
    }

    public final Matrix e() {
        i iVar;
        i iVar2;
        PointF pointF;
        C4630b c4630b;
        PointF pointF2;
        Matrix matrix = this.f4291a;
        matrix.reset();
        i iVar3 = this.f4308s;
        if ((iVar3 == null || iVar3.l() == 0.0f) && (((iVar = this.f4309t) == null || iVar.l() == 0.0f) && ((iVar2 = this.f4310u) == null || iVar2.l() == 0.0f))) {
            AbstractC0428e abstractC0428e = this.f4302m;
            if (abstractC0428e != null && (pointF2 = (PointF) abstractC0428e.e()) != null) {
                float f3 = pointF2.x;
                if (f3 != 0.0f || pointF2.y != 0.0f) {
                    matrix.preTranslate(f3, pointF2.y);
                }
            }
            if (!this.f4313x) {
                AbstractC0428e abstractC0428e2 = this.f4304o;
                if (abstractC0428e2 != null) {
                    float floatValue = abstractC0428e2 instanceof s ? ((Float) abstractC0428e2.e()).floatValue() : ((i) abstractC0428e2).l();
                    if (floatValue != 0.0f) {
                        matrix.preRotate(floatValue);
                    }
                }
            } else if (abstractC0428e != null) {
                float f9 = abstractC0428e.f4256d;
                PointF pointF3 = (PointF) abstractC0428e.e();
                float f10 = pointF3.x;
                float f11 = pointF3.y;
                abstractC0428e.i(1.0E-4f + f9);
                PointF pointF4 = (PointF) abstractC0428e.e();
                abstractC0428e.i(f9);
                matrix.preRotate((float) Math.toDegrees(Math.atan2(pointF4.y - f11, pointF4.x - f10)));
            }
            if (this.f4306q != null) {
                float cos = this.f4307r == null ? 0.0f : (float) Math.cos(Math.toRadians((-r5.l()) + 90.0f));
                float sin = this.f4307r == null ? 1.0f : (float) Math.sin(Math.toRadians((-r7.l()) + 90.0f));
                float tan = (float) Math.tan(Math.toRadians(r1.l()));
                d();
                float[] fArr = this.f4295e;
                fArr[0] = cos;
                fArr[1] = sin;
                float f12 = -sin;
                fArr[3] = f12;
                fArr[4] = cos;
                fArr[8] = 1.0f;
                Matrix matrix2 = this.f4292b;
                matrix2.setValues(fArr);
                d();
                fArr[0] = 1.0f;
                fArr[3] = tan;
                fArr[4] = 1.0f;
                fArr[8] = 1.0f;
                Matrix matrix3 = this.f4293c;
                matrix3.setValues(fArr);
                d();
                fArr[0] = cos;
                fArr[1] = f12;
                fArr[3] = sin;
                fArr[4] = cos;
                fArr[8] = 1.0f;
                Matrix matrix4 = this.f4294d;
                matrix4.setValues(fArr);
                matrix3.preConcat(matrix2);
                matrix4.preConcat(matrix3);
                matrix.preConcat(matrix4);
            }
            AbstractC0428e abstractC0428e3 = this.f4303n;
            if (abstractC0428e3 != null && (c4630b = (C4630b) abstractC0428e3.e()) != null) {
                float f13 = c4630b.f38566a;
                if (f13 != 1.0f || c4630b.f38567b != 1.0f) {
                    matrix.preScale(f13, c4630b.f38567b);
                }
            }
            AbstractC0428e abstractC0428e4 = this.f4301l;
            if (abstractC0428e4 != null && (pointF = (PointF) abstractC0428e4.e()) != null) {
                float f14 = pointF.x;
                if (f14 != 0.0f || pointF.y != 0.0f) {
                    matrix.preTranslate(-f14, -pointF.y);
                }
            }
        } else {
            i iVar4 = this.f4308s;
            float l9 = iVar4 != null ? iVar4.l() : 0.0f;
            i iVar5 = this.f4309t;
            float l10 = iVar5 != null ? iVar5.l() : 0.0f;
            i iVar6 = this.f4310u;
            float l11 = iVar6 != null ? iVar6.l() : 0.0f;
            if (this.f4300k || l9 != this.f4296f || l10 != this.f4297g || l11 != this.f4298h) {
                this.f4296f = l9;
                this.f4297g = l10;
                this.f4298h = l11;
                if (l9 != 0.0f) {
                    this.i = (float) Math.cos(Math.toRadians(l9));
                } else {
                    this.i = 1.0f;
                }
                if (l10 != 0.0f) {
                    this.f4299j = (float) Math.cos(Math.toRadians(l10));
                } else {
                    this.f4299j = 1.0f;
                }
                this.f4300k = false;
            }
            AbstractC0428e abstractC0428e5 = this.f4301l;
            PointF pointF5 = abstractC0428e5 == null ? null : (PointF) abstractC0428e5.e();
            AbstractC0428e abstractC0428e6 = this.f4302m;
            PointF pointF6 = abstractC0428e6 == null ? null : (PointF) abstractC0428e6.e();
            AbstractC0428e abstractC0428e7 = this.f4303n;
            C4630b c4630b2 = abstractC0428e7 != null ? (C4630b) abstractC0428e7.e() : null;
            float f15 = c4630b2 != null ? c4630b2.f38566a : 1.0f;
            float f16 = c4630b2 != null ? c4630b2.f38567b : 1.0f;
            float f17 = this.i;
            float f18 = this.f4299j;
            matrix.reset();
            if (pointF6 != null) {
                float f19 = pointF6.x;
                if (f19 != 0.0f || pointF6.y != 0.0f) {
                    matrix.preTranslate(f19, pointF6.y);
                }
            }
            if (l11 != 0.0f) {
                matrix.preRotate(l11);
            }
            if (l10 != 0.0f) {
                matrix.preScale(f18, 1.0f);
            }
            if (l9 != 0.0f) {
                matrix.preScale(1.0f, f17);
            }
            if (f15 != 1.0f || f16 != 1.0f) {
                matrix.preScale(f15, f16);
            }
            if (pointF5 != null) {
                float f20 = pointF5.x;
                if (f20 != 0.0f || pointF5.y != 0.0f) {
                    matrix.preTranslate(-f20, -pointF5.y);
                    return matrix;
                }
            }
        }
        return matrix;
    }

    public final Matrix f(float f3) {
        AbstractC0428e abstractC0428e = this.f4302m;
        PointF pointF = abstractC0428e == null ? null : (PointF) abstractC0428e.e();
        AbstractC0428e abstractC0428e2 = this.f4303n;
        C4630b c4630b = abstractC0428e2 == null ? null : (C4630b) abstractC0428e2.e();
        AbstractC0428e abstractC0428e3 = this.f4301l;
        PointF pointF2 = abstractC0428e3 != null ? (PointF) abstractC0428e3.e() : null;
        Matrix matrix = this.f4291a;
        matrix.reset();
        if (pointF != null) {
            matrix.preTranslate(pointF.x * f3, pointF.y * f3);
        }
        i iVar = this.f4308s;
        float l9 = iVar != null ? iVar.l() * f3 : 0.0f;
        i iVar2 = this.f4309t;
        float l10 = iVar2 != null ? iVar2.l() * f3 : 0.0f;
        i iVar3 = this.f4310u;
        float l11 = iVar3 != null ? iVar3.l() * f3 : 0.0f;
        if (l9 == 0.0f && l10 == 0.0f && l11 == 0.0f) {
            AbstractC0428e abstractC0428e4 = this.f4304o;
            if (abstractC0428e4 != null) {
                matrix.preRotate(((Float) abstractC0428e4.e()).floatValue() * f3, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
            }
        } else {
            float cos = l9 != 0.0f ? (float) Math.cos(Math.toRadians(l9)) : 1.0f;
            float cos2 = l10 != 0.0f ? (float) Math.cos(Math.toRadians(l10)) : 1.0f;
            if (l11 != 0.0f) {
                matrix.preRotate(l11, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
            }
            if (l10 != 0.0f) {
                matrix.preScale(cos2, 1.0f);
            }
            if (l9 != 0.0f) {
                matrix.preScale(1.0f, cos);
            }
        }
        if (c4630b != null) {
            double d2 = f3;
            matrix.preScale((float) Math.pow(c4630b.f38566a, d2), (float) Math.pow(c4630b.f38567b, d2));
        }
        return matrix;
    }
}
