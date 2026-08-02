package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class xod {
    public static final mof y;
    public final yod a;
    public Outline f;
    public float j;
    public ocg k;
    public eak l;
    public nh0 m;
    public boolean n;
    public ou3 o;
    public gh0 p;
    public int q;
    public boolean s;
    public long t;
    public long u;
    public long v;
    public boolean w;
    public RectF x;
    public jx7 b = xv7.k;
    public xof c = xof.a;
    public Function1 d = lhb.I;
    public final kma e = new kma(16, this);
    public boolean g = true;
    public long h = 0;
    public long i = 9205357640488583168L;
    public final yk3 r = new yk3();

    static {
        boolean z = jof.a;
        y = jof.a ? rre.i : Build.VERSION.SDK_INT >= 28 ? og3.c : x2i.g;
    }

    public xod(yod yodVar) {
        this.a = yodVar;
        yodVar.w(false);
        this.t = 0L;
        this.u = 0L;
        this.v = 9205357640488583168L;
    }

    public final void a() {
        Outline outline;
        if (this.g) {
            boolean z = this.w;
            Outline outline2 = null;
            yod yodVar = this.a;
            if (z || yodVar.K() > 0.0f) {
                eak eakVar = this.l;
                if (eakVar != null) {
                    RectF rectF = this.x;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.x = rectF;
                    }
                    boolean z2 = eakVar instanceof nh0;
                    if (!z2) {
                        qq6.d("Unable to obtain android.graphics.Path");
                        return;
                    }
                    ((nh0) eakVar).a.computeBounds(rectF, false);
                    int i = Build.VERSION.SDK_INT;
                    if (i > 28 || ((nh0) eakVar).a.isConvex()) {
                        outline = this.f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f = outline;
                        }
                        if (i >= 30) {
                            qdq.O(outline, eakVar);
                        } else {
                            if (!z2) {
                                qq6.d("Unable to obtain android.graphics.Path");
                                return;
                            }
                            outline.setConvexPath(((nh0) eakVar).a);
                        }
                        this.n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.n = true;
                        outline = null;
                    }
                    this.l = eakVar;
                    if (outline != null) {
                        outline.setAlpha(yodVar.b());
                        outline2 = outline;
                    }
                    yodVar.C(outline2, (4294967295L & Math.round(rectF.height())) | (Math.round(rectF.width()) << 32));
                    if (this.n && this.w) {
                        yodVar.w(false);
                        yodVar.f();
                    } else {
                        yodVar.w(this.w);
                    }
                } else {
                    yodVar.w(this.w);
                    Outline outline4 = this.f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f = outline4;
                    }
                    Outline outline5 = outline4;
                    long Q = nt0.Q(this.u);
                    long j = this.h;
                    long j2 = this.i;
                    long j3 = j2 == 9205357640488583168L ? Q : j2;
                    int i2 = (int) (j >> 32);
                    int i3 = (int) (j & 4294967295L);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i3)), Math.round(Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat((int) (4294967295L & j3)) + Float.intBitsToFloat(i3)), this.j);
                    outline5.setAlpha(yodVar.b());
                    yodVar.C(outline5, nt0.K(j3));
                }
            } else {
                yodVar.w(false);
                yodVar.C(null, 0L);
            }
        }
        this.g = false;
    }

    public final void b() {
        if (this.s && this.q == 0) {
            yk3 yk3Var = this.r;
            xod xodVar = (xod) yk3Var.b;
            if (xodVar != null) {
                xodVar.f();
                yk3Var.b = null;
            }
            upi upiVar = (upi) yk3Var.d;
            if (upiVar != null) {
                Object[] objArr = upiVar.b;
                long[] jArr = upiVar.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    ((xod) objArr[(i << 3) + i3]).f();
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                upiVar.c();
            }
            this.a.f();
        }
    }

    public final void c(mu3 mu3Var, xod xodVar) {
        boolean z;
        boolean z2;
        Canvas canvas;
        boolean z3;
        float f;
        if (this.s) {
            return;
        }
        a();
        yod yodVar = this.a;
        if (!yodVar.g()) {
            try {
                yodVar.c(this.b, this.c, this, this.e);
            } catch (Throwable unused) {
            }
        }
        boolean z4 = yodVar.K() > 0.0f;
        if (z4) {
            mu3Var.n();
        }
        Canvas a = vd0.a(mu3Var);
        boolean isHardwareAccelerated = a.isHardwareAccelerated();
        if (!isHardwareAccelerated) {
            long j = this.t;
            float f2 = (int) (j >> 32);
            float f3 = (int) (j & 4294967295L);
            long j2 = this.u;
            float f4 = ((int) (j2 >> 32)) + f2;
            float f5 = ((int) (j2 & 4294967295L)) + f3;
            float b = yodVar.b();
            int z5 = yodVar.z();
            if (b < 1.0f || z5 != 3 || yodVar.p() == 1) {
                gh0 gh0Var = this.p;
                if (gh0Var == null) {
                    gh0Var = hld.p();
                    this.p = gh0Var;
                }
                gh0Var.c(b);
                gh0Var.d(z5);
                gh0Var.f(null);
                a = a;
                f = f2;
                a.saveLayer(f, f3, f4, f5, gh0Var.a);
            } else {
                a.save();
                a = a;
                f = f2;
            }
            a.translate(f, f3);
            a.concat(yodVar.y());
        }
        boolean z6 = !isHardwareAccelerated && this.w;
        if (z6) {
            mu3Var.r();
            ocg e = e();
            if (e instanceof ayj) {
                mu3.v(mu3Var, ((ayj) e).j);
            } else if (e instanceof byj) {
                nh0 nh0Var = this.m;
                if (nh0Var != null) {
                    nh0Var.a.rewind();
                } else {
                    nh0Var = ph0.a();
                    this.m = nh0Var;
                }
                eak.a(nh0Var, ((byj) e).j);
                mu3Var.h(nh0Var);
            } else if (e instanceof zxj) {
                mu3Var.h(((zxj) e).j);
            }
        }
        if (xodVar != null) {
            yk3 yk3Var = xodVar.r;
            if (!yk3Var.a) {
                rme.a("Only add dependencies during a tracking");
            }
            upi upiVar = (upi) yk3Var.d;
            if (upiVar != null) {
                upiVar.a(this);
            } else if (((xod) yk3Var.b) != null) {
                int i = xso.a;
                upi upiVar2 = new upi();
                xod xodVar2 = (xod) yk3Var.b;
                xodVar2.getClass();
                upiVar2.a(xodVar2);
                upiVar2.a(this);
                yk3Var.d = upiVar2;
                yk3Var.b = null;
            } else {
                yk3Var.b = this;
            }
            upi upiVar3 = (upi) yk3Var.e;
            if (upiVar3 != null) {
                z3 = !upiVar3.m(this);
            } else if (((xod) yk3Var.c) != this) {
                z3 = true;
            } else {
                yk3Var.c = null;
                z3 = false;
            }
            if (z3) {
                this.q++;
            }
        }
        if (((ud0) mu3Var).a.isHardwareAccelerated()) {
            z = z4;
            z2 = z6;
            canvas = a;
            yodVar.D(mu3Var);
        } else {
            ou3 ou3Var = this.o;
            if (ou3Var == null) {
                ou3Var = new ou3();
                this.o = ou3Var;
            }
            nsh nshVar = ou3Var.b;
            jx7 jx7Var = this.b;
            xof xofVar = this.c;
            long Q = nt0.Q(this.u);
            jx7 y2 = nshVar.y();
            xof A = nshVar.A();
            mu3 s = nshVar.s();
            z2 = z6;
            canvas = a;
            long B = nshVar.B();
            z = z4;
            xod xodVar3 = (xod) nshVar.c;
            nshVar.O(jx7Var);
            nshVar.P(xofVar);
            nshVar.M(mu3Var);
            nshVar.R(Q);
            nshVar.c = this;
            mu3Var.r();
            try {
                d(ou3Var);
            } finally {
                mu3Var.k();
                nshVar.O(y2);
                nshVar.P(A);
                nshVar.M(s);
                nshVar.R(B);
                nshVar.c = xodVar3;
            }
        }
        if (z2) {
            mu3Var.k();
        }
        if (z) {
            mu3Var.s();
        }
        if (isHardwareAccelerated) {
            return;
        }
        canvas.restore();
    }

    public final void d(jpa jpaVar) {
        yk3 yk3Var = this.r;
        yk3Var.c = (xod) yk3Var.b;
        upi upiVar = (upi) yk3Var.d;
        if (upiVar != null && upiVar.i()) {
            upi upiVar2 = (upi) yk3Var.e;
            if (upiVar2 == null) {
                int i = xso.a;
                upiVar2 = new upi();
                yk3Var.e = upiVar2;
            }
            upiVar2.k(upiVar);
            upiVar.c();
        }
        yk3Var.a = true;
        this.d.invoke(jpaVar);
        yk3Var.a = false;
        xod xodVar = (xod) yk3Var.c;
        if (xodVar != null) {
            xodVar.f();
        }
        upi upiVar3 = (upi) yk3Var.e;
        if (upiVar3 == null || !upiVar3.i()) {
            return;
        }
        Object[] objArr = upiVar3.b;
        long[] jArr = upiVar3.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            ((xod) objArr[(i2 << 3) + i4]).f();
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        upiVar3.c();
    }

    public final ocg e() {
        ocg ayjVar;
        ocg ocgVar = this.k;
        eak eakVar = this.l;
        if (ocgVar != null) {
            return ocgVar;
        }
        if (eakVar != null) {
            zxj zxjVar = new zxj(eakVar);
            this.k = zxjVar;
            return zxjVar;
        }
        long Q = nt0.Q(this.u);
        long j = this.h;
        long j2 = this.i;
        if (j2 != 9205357640488583168L) {
            Q = j2;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (Q >> 32)) + intBitsToFloat;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (Q & 4294967295L)) + intBitsToFloat2;
        if (this.j > 0.0f) {
            ayjVar = new byj(cb0.m(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4, (Float.floatToRawIntBits(r0) << 32) | (4294967295L & Float.floatToRawIntBits(r0))));
        } else {
            ayjVar = new ayj(new ynn(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4));
        }
        this.k = ayjVar;
        return ayjVar;
    }

    public final void f() {
        this.q--;
        b();
    }

    public final void g(jx7 jx7Var, xof xofVar, long j, Function1 function1) {
        boolean a = hqe.a(this.u, j);
        yod yodVar = this.a;
        if (!a) {
            this.u = j;
            long j2 = this.t;
            yodVar.G(j, (int) (j2 >> 32), (int) (j2 & 4294967295L));
            if (this.i == 9205357640488583168L) {
                this.g = true;
                a();
            }
        }
        this.b = jx7Var;
        this.c = xofVar;
        this.d = function1;
        yodVar.c(jx7Var, xofVar, this, this.e);
    }

    public final void h(float f) {
        yod yodVar = this.a;
        if (yodVar.b() == f) {
            return;
        }
        yodVar.n(f);
    }

    public final void i(long j, long j2, float f) {
        if (enj.c(this.h, j) && nmq.a(this.i, j2) && this.j == f && this.l == null) {
            return;
        }
        this.k = null;
        this.l = null;
        this.g = true;
        this.n = false;
        this.h = j;
        this.i = j2;
        this.j = f;
        a();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(cg6 cg6Var) {
        wod wodVar;
        int i;
        if (cg6Var instanceof wod) {
            wodVar = (wod) cg6Var;
            int i2 = wodVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wodVar.l = i2 - Integer.MIN_VALUE;
                Object obj = wodVar.j;
                nm6 nm6Var = nm6.a;
                i = wodVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    wodVar.l = 1;
                    obj = y.N(this, wodVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return new yg0((Bitmap) obj);
            }
        }
        wodVar = new wod(this, cg6Var);
        Object obj2 = wodVar.j;
        nm6 nm6Var2 = nm6.a;
        i = wodVar.l;
        if (i != 0) {
        }
        return new yg0((Bitmap) obj2);
    }
}
