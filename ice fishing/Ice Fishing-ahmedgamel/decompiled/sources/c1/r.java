package c1;

import Z0.z;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import com.google.android.gms.internal.ads.LP;
import f1.C4515a;
import f1.C4516b;
import h1.AbstractC4563a;
import java.util.Collections;
import m1.C4739a;
import m1.C4740b;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    public final Matrix f5687b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f5688c;

    /* renamed from: d, reason: collision with root package name */
    public final Matrix f5689d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f5690e;

    /* renamed from: l, reason: collision with root package name */
    public AbstractC0545e f5696l;

    /* renamed from: m, reason: collision with root package name */
    public AbstractC0545e f5697m;

    /* renamed from: n, reason: collision with root package name */
    public AbstractC0545e f5698n;

    /* renamed from: o, reason: collision with root package name */
    public AbstractC0545e f5699o;

    /* renamed from: p, reason: collision with root package name */
    public AbstractC0545e f5700p;

    /* renamed from: q, reason: collision with root package name */
    public i f5701q;

    /* renamed from: r, reason: collision with root package name */
    public i f5702r;

    /* renamed from: s, reason: collision with root package name */
    public i f5703s;

    /* renamed from: t, reason: collision with root package name */
    public i f5704t;

    /* renamed from: u, reason: collision with root package name */
    public i f5705u;

    /* renamed from: v, reason: collision with root package name */
    public AbstractC0545e f5706v;

    /* renamed from: w, reason: collision with root package name */
    public AbstractC0545e f5707w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f5708x;

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f5686a = new Matrix();

    /* renamed from: f, reason: collision with root package name */
    public float f5691f = Float.NaN;

    /* renamed from: g, reason: collision with root package name */
    public float f5692g = Float.NaN;

    /* renamed from: h, reason: collision with root package name */
    public float f5693h = Float.NaN;
    public float i = 1.0f;

    /* renamed from: j, reason: collision with root package name */
    public float f5694j = 1.0f;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5695k = true;

    public r(f1.d dVar) {
        I1.d dVar2 = dVar.f37427a;
        this.f5696l = dVar2 == null ? null : dVar2.a();
        f1.e eVar = dVar.f37428b;
        this.f5697m = eVar == null ? null : eVar.a();
        C4515a c4515a = dVar.f37429c;
        this.f5698n = c4515a == null ? null : c4515a.a();
        C4516b c4516b = dVar.f37430d;
        this.f5699o = c4516b == null ? null : c4516b.a();
        C4516b c4516b2 = dVar.f37432f;
        this.f5701q = c4516b2 == null ? null : c4516b2.a();
        this.f5708x = dVar.f37438m;
        C4516b c4516b3 = dVar.f37434h;
        this.f5703s = c4516b3 == null ? null : c4516b3.a();
        C4516b c4516b4 = dVar.i;
        this.f5704t = c4516b4 == null ? null : c4516b4.a();
        C4516b c4516b5 = dVar.f37435j;
        this.f5705u = c4516b5 == null ? null : c4516b5.a();
        if (this.f5701q != null) {
            this.f5687b = new Matrix();
            this.f5688c = new Matrix();
            this.f5689d = new Matrix();
            this.f5690e = new float[9];
        } else {
            this.f5687b = null;
            this.f5688c = null;
            this.f5689d = null;
            this.f5690e = null;
        }
        C4516b c4516b6 = dVar.f37433g;
        this.f5702r = c4516b6 == null ? null : c4516b6.a();
        C4515a c4515a2 = dVar.f37431e;
        if (c4515a2 != null) {
            this.f5700p = c4515a2.a();
        }
        C4516b c4516b7 = dVar.f37436k;
        if (c4516b7 != null) {
            this.f5706v = c4516b7.a();
        } else {
            this.f5706v = null;
        }
        C4516b c4516b8 = dVar.f37437l;
        if (c4516b8 != null) {
            this.f5707w = c4516b8.a();
        } else {
            this.f5707w = null;
        }
    }

    public final void a(AbstractC4563a abstractC4563a) {
        abstractC4563a.f(this.f5700p);
        abstractC4563a.f(this.f5706v);
        abstractC4563a.f(this.f5707w);
        abstractC4563a.f(this.f5696l);
        abstractC4563a.f(this.f5697m);
        abstractC4563a.f(this.f5698n);
        abstractC4563a.f(this.f5699o);
        abstractC4563a.f(this.f5701q);
        abstractC4563a.f(this.f5702r);
        abstractC4563a.f(this.f5703s);
        abstractC4563a.f(this.f5704t);
        abstractC4563a.f(this.f5705u);
    }

    public final void b(InterfaceC0541a interfaceC0541a) {
        AbstractC0545e abstractC0545e = this.f5700p;
        if (abstractC0545e != null) {
            abstractC0545e.a(interfaceC0541a);
        }
        AbstractC0545e abstractC0545e2 = this.f5706v;
        if (abstractC0545e2 != null) {
            abstractC0545e2.a(interfaceC0541a);
        }
        AbstractC0545e abstractC0545e3 = this.f5707w;
        if (abstractC0545e3 != null) {
            abstractC0545e3.a(interfaceC0541a);
        }
        AbstractC0545e abstractC0545e4 = this.f5696l;
        if (abstractC0545e4 != null) {
            abstractC0545e4.a(interfaceC0541a);
        }
        AbstractC0545e abstractC0545e5 = this.f5697m;
        if (abstractC0545e5 != null) {
            abstractC0545e5.a(interfaceC0541a);
        }
        AbstractC0545e abstractC0545e6 = this.f5698n;
        if (abstractC0545e6 != null) {
            abstractC0545e6.a(interfaceC0541a);
        }
        AbstractC0545e abstractC0545e7 = this.f5699o;
        if (abstractC0545e7 != null) {
            abstractC0545e7.a(interfaceC0541a);
        }
        i iVar = this.f5701q;
        if (iVar != null) {
            iVar.a(interfaceC0541a);
        }
        i iVar2 = this.f5702r;
        if (iVar2 != null) {
            iVar2.a(interfaceC0541a);
        }
        i iVar3 = this.f5703s;
        if (iVar3 != null) {
            iVar3.a(interfaceC0541a);
            this.f5703s.a(new q(0, this));
        }
        i iVar4 = this.f5704t;
        if (iVar4 != null) {
            iVar4.a(interfaceC0541a);
            this.f5704t.a(new q(1, this));
        }
        i iVar5 = this.f5705u;
        if (iVar5 != null) {
            iVar5.a(interfaceC0541a);
            this.f5705u.a(new q(2, this));
        }
    }

    public final boolean c(ColorFilter colorFilter, LP lp) {
        if (colorFilter == z.f4080a) {
            AbstractC0545e abstractC0545e = this.f5696l;
            if (abstractC0545e == null) {
                this.f5696l = new s(lp, new PointF());
                return true;
            }
            abstractC0545e.j(lp);
            return true;
        }
        if (colorFilter == z.f4081b) {
            AbstractC0545e abstractC0545e2 = this.f5697m;
            if (abstractC0545e2 == null) {
                this.f5697m = new s(lp, new PointF());
                return true;
            }
            abstractC0545e2.j(lp);
            return true;
        }
        if (colorFilter == z.f4082c) {
            AbstractC0545e abstractC0545e3 = this.f5697m;
            if (abstractC0545e3 instanceof o) {
                o oVar = (o) abstractC0545e3;
                LP lp2 = oVar.f5679m;
                oVar.f5679m = lp;
                return true;
            }
        }
        if (colorFilter == z.f4083d) {
            AbstractC0545e abstractC0545e4 = this.f5697m;
            if (abstractC0545e4 instanceof o) {
                o oVar2 = (o) abstractC0545e4;
                LP lp3 = oVar2.f5680n;
                oVar2.f5680n = lp;
                return true;
            }
        }
        if (colorFilter == z.f4088j) {
            AbstractC0545e abstractC0545e5 = this.f5698n;
            if (abstractC0545e5 == null) {
                this.f5698n = new s(lp, new C4740b());
                return true;
            }
            abstractC0545e5.j(lp);
            return true;
        }
        if (colorFilter == z.f4089k) {
            AbstractC0545e abstractC0545e6 = this.f5699o;
            if (abstractC0545e6 == null) {
                this.f5699o = new s(lp, Float.valueOf(0.0f));
                return true;
            }
            abstractC0545e6.j(lp);
            return true;
        }
        if (colorFilter == 3) {
            AbstractC0545e abstractC0545e7 = this.f5700p;
            if (abstractC0545e7 == null) {
                this.f5700p = new s(lp, 100);
                return true;
            }
            abstractC0545e7.j(lp);
            return true;
        }
        if (colorFilter == z.f4067A) {
            AbstractC0545e abstractC0545e8 = this.f5706v;
            if (abstractC0545e8 == null) {
                this.f5706v = new s(lp, Float.valueOf(100.0f));
                return true;
            }
            abstractC0545e8.j(lp);
            return true;
        }
        if (colorFilter == z.f4068B) {
            AbstractC0545e abstractC0545e9 = this.f5707w;
            if (abstractC0545e9 == null) {
                this.f5707w = new s(lp, Float.valueOf(100.0f));
                return true;
            }
            abstractC0545e9.j(lp);
            return true;
        }
        if (colorFilter == z.f4093o) {
            if (this.f5701q == null) {
                this.f5701q = new i(Collections.singletonList(new C4739a(Float.valueOf(0.0f))));
            }
            this.f5701q.j(lp);
            return true;
        }
        if (colorFilter == z.f4094p) {
            if (this.f5702r == null) {
                this.f5702r = new i(Collections.singletonList(new C4739a(Float.valueOf(0.0f))));
            }
            this.f5702r.j(lp);
            return true;
        }
        if (colorFilter == z.f4090l) {
            if (this.f5703s == null) {
                this.f5703s = new i(Collections.singletonList(new C4739a(Float.valueOf(0.0f))));
            }
            this.f5703s.j(lp);
            return true;
        }
        if (colorFilter == z.f4091m) {
            if (this.f5704t == null) {
                this.f5704t = new i(Collections.singletonList(new C4739a(Float.valueOf(0.0f))));
            }
            this.f5704t.j(lp);
            return true;
        }
        if (colorFilter != z.f4092n) {
            return false;
        }
        if (this.f5705u == null) {
            this.f5705u = new i(Collections.singletonList(new C4739a(Float.valueOf(0.0f))));
        }
        this.f5705u.j(lp);
        return true;
    }

    public final void d() {
        for (int i = 0; i < 9; i++) {
            this.f5690e[i] = 0.0f;
        }
    }

    public final Matrix e() {
        i iVar;
        i iVar2;
        PointF pointF;
        C4740b c4740b;
        PointF pointF2;
        Matrix matrix = this.f5686a;
        matrix.reset();
        i iVar3 = this.f5703s;
        if ((iVar3 == null || iVar3.l() == 0.0f) && (((iVar = this.f5704t) == null || iVar.l() == 0.0f) && ((iVar2 = this.f5705u) == null || iVar2.l() == 0.0f))) {
            AbstractC0545e abstractC0545e = this.f5697m;
            if (abstractC0545e != null && (pointF2 = (PointF) abstractC0545e.e()) != null) {
                float f2 = pointF2.x;
                if (f2 != 0.0f || pointF2.y != 0.0f) {
                    matrix.preTranslate(f2, pointF2.y);
                }
            }
            if (!this.f5708x) {
                AbstractC0545e abstractC0545e2 = this.f5699o;
                if (abstractC0545e2 != null) {
                    float floatValue = abstractC0545e2 instanceof s ? ((Float) abstractC0545e2.e()).floatValue() : ((i) abstractC0545e2).l();
                    if (floatValue != 0.0f) {
                        matrix.preRotate(floatValue);
                    }
                }
            } else if (abstractC0545e != null) {
                float f9 = abstractC0545e.f5651d;
                PointF pointF3 = (PointF) abstractC0545e.e();
                float f10 = pointF3.x;
                float f11 = pointF3.y;
                abstractC0545e.i(1.0E-4f + f9);
                PointF pointF4 = (PointF) abstractC0545e.e();
                abstractC0545e.i(f9);
                matrix.preRotate((float) Math.toDegrees(Math.atan2(pointF4.y - f11, pointF4.x - f10)));
            }
            if (this.f5701q != null) {
                float cos = this.f5702r == null ? 0.0f : (float) Math.cos(Math.toRadians((-r5.l()) + 90.0f));
                float sin = this.f5702r == null ? 1.0f : (float) Math.sin(Math.toRadians((-r7.l()) + 90.0f));
                float tan = (float) Math.tan(Math.toRadians(r1.l()));
                d();
                float[] fArr = this.f5690e;
                fArr[0] = cos;
                fArr[1] = sin;
                float f12 = -sin;
                fArr[3] = f12;
                fArr[4] = cos;
                fArr[8] = 1.0f;
                Matrix matrix2 = this.f5687b;
                matrix2.setValues(fArr);
                d();
                fArr[0] = 1.0f;
                fArr[3] = tan;
                fArr[4] = 1.0f;
                fArr[8] = 1.0f;
                Matrix matrix3 = this.f5688c;
                matrix3.setValues(fArr);
                d();
                fArr[0] = cos;
                fArr[1] = f12;
                fArr[3] = sin;
                fArr[4] = cos;
                fArr[8] = 1.0f;
                Matrix matrix4 = this.f5689d;
                matrix4.setValues(fArr);
                matrix3.preConcat(matrix2);
                matrix4.preConcat(matrix3);
                matrix.preConcat(matrix4);
            }
            AbstractC0545e abstractC0545e3 = this.f5698n;
            if (abstractC0545e3 != null && (c4740b = (C4740b) abstractC0545e3.e()) != null) {
                float f13 = c4740b.f39355a;
                if (f13 != 1.0f || c4740b.f39356b != 1.0f) {
                    matrix.preScale(f13, c4740b.f39356b);
                }
            }
            AbstractC0545e abstractC0545e4 = this.f5696l;
            if (abstractC0545e4 != null && (pointF = (PointF) abstractC0545e4.e()) != null) {
                float f14 = pointF.x;
                if (f14 != 0.0f || pointF.y != 0.0f) {
                    matrix.preTranslate(-f14, -pointF.y);
                }
            }
        } else {
            i iVar4 = this.f5703s;
            float l9 = iVar4 != null ? iVar4.l() : 0.0f;
            i iVar5 = this.f5704t;
            float l10 = iVar5 != null ? iVar5.l() : 0.0f;
            i iVar6 = this.f5705u;
            float l11 = iVar6 != null ? iVar6.l() : 0.0f;
            if (this.f5695k || l9 != this.f5691f || l10 != this.f5692g || l11 != this.f5693h) {
                this.f5691f = l9;
                this.f5692g = l10;
                this.f5693h = l11;
                if (l9 != 0.0f) {
                    this.i = (float) Math.cos(Math.toRadians(l9));
                } else {
                    this.i = 1.0f;
                }
                if (l10 != 0.0f) {
                    this.f5694j = (float) Math.cos(Math.toRadians(l10));
                } else {
                    this.f5694j = 1.0f;
                }
                this.f5695k = false;
            }
            AbstractC0545e abstractC0545e5 = this.f5696l;
            PointF pointF5 = abstractC0545e5 == null ? null : (PointF) abstractC0545e5.e();
            AbstractC0545e abstractC0545e6 = this.f5697m;
            PointF pointF6 = abstractC0545e6 == null ? null : (PointF) abstractC0545e6.e();
            AbstractC0545e abstractC0545e7 = this.f5698n;
            C4740b c4740b2 = abstractC0545e7 != null ? (C4740b) abstractC0545e7.e() : null;
            float f15 = c4740b2 != null ? c4740b2.f39355a : 1.0f;
            float f16 = c4740b2 != null ? c4740b2.f39356b : 1.0f;
            float f17 = this.i;
            float f18 = this.f5694j;
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

    public final Matrix f(float f2) {
        AbstractC0545e abstractC0545e = this.f5697m;
        PointF pointF = abstractC0545e == null ? null : (PointF) abstractC0545e.e();
        AbstractC0545e abstractC0545e2 = this.f5698n;
        C4740b c4740b = abstractC0545e2 == null ? null : (C4740b) abstractC0545e2.e();
        AbstractC0545e abstractC0545e3 = this.f5696l;
        PointF pointF2 = abstractC0545e3 != null ? (PointF) abstractC0545e3.e() : null;
        Matrix matrix = this.f5686a;
        matrix.reset();
        if (pointF != null) {
            matrix.preTranslate(pointF.x * f2, pointF.y * f2);
        }
        i iVar = this.f5703s;
        float l9 = iVar != null ? iVar.l() * f2 : 0.0f;
        i iVar2 = this.f5704t;
        float l10 = iVar2 != null ? iVar2.l() * f2 : 0.0f;
        i iVar3 = this.f5705u;
        float l11 = iVar3 != null ? iVar3.l() * f2 : 0.0f;
        if (l9 == 0.0f && l10 == 0.0f && l11 == 0.0f) {
            AbstractC0545e abstractC0545e4 = this.f5699o;
            if (abstractC0545e4 != null) {
                matrix.preRotate(((Float) abstractC0545e4.e()).floatValue() * f2, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
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
        if (c4740b != null) {
            double d9 = f2;
            matrix.preScale((float) Math.pow(c4740b.f39355a, d9), (float) Math.pow(c4740b.f39356b, d9));
        }
        return matrix;
    }
}
