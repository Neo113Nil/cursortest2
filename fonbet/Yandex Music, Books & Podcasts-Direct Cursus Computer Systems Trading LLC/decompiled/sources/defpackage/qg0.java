package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class qg0 {
    public final jx7 a;
    public long b = 9205357640488583168L;
    public final a1b c;
    public final x6k d;
    public final boolean e;
    public boolean f;
    public long g;
    public long h;
    public final cw7 i;

    public qg0(Context context, jx7 jx7Var, long j, o0k o0kVar) {
        this.a = jx7Var;
        a1b a1bVar = new a1b(context, c3x.U(j));
        this.c = a1bVar;
        this.d = new x6k(Unit.a, wvo.e);
        this.e = true;
        this.g = 0L;
        this.h = -1L;
        r5 r5Var = new r5(1, this);
        ffm ffmVar = eur.a;
        iur iurVar = new iur(null, null, null, r5Var);
        this.i = Build.VERSION.SDK_INT >= 31 ? new zjr(iurVar, this, a1bVar) : new mmd(iurVar, this, a1bVar, o0kVar);
    }

    public final void a() {
        boolean z;
        a1b a1bVar = this.c;
        EdgeEffect edgeEffect = a1bVar.d;
        boolean z2 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = a1bVar.e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = !edgeEffect2.isFinished() || z;
        }
        EdgeEffect edgeEffect3 = a1bVar.f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z = !edgeEffect3.isFinished() || z;
        }
        EdgeEffect edgeEffect4 = a1bVar.g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            d();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x005c, code lost:
    
        if (r15.invokeSuspend(kotlin.Unit.a) == r1) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j, xfm xfmVar, cg6 cg6Var) {
        og0 og0Var;
        int i;
        long d;
        qg0 qg0Var;
        long d2;
        if (cg6Var instanceof og0) {
            og0Var = (og0) cg6Var;
            int i2 = og0Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                og0Var.n = i2 - Integer.MIN_VALUE;
                Object obj = og0Var.l;
                nm6 nm6Var = nm6.a;
                i = og0Var.n;
                if (i != 0) {
                    qgg.h0(obj);
                    if (nmq.e(this.g)) {
                        og0Var.n = 1;
                        xfmVar.getClass();
                        xfm xfmVar2 = new xfm((iyo) xfmVar.n, og0Var);
                        xfmVar2.m = j;
                    } else {
                        a1b a1bVar = this.c;
                        boolean g = a1b.g(a1bVar.f);
                        jx7 jx7Var = this.a;
                        long s = bzf.s((!g || yzt.b(j) >= 0.0f) ? (!a1b.g(a1bVar.g) || yzt.b(j) <= 0.0f) ? 0.0f : -ghh.k(a1bVar.d(), -yzt.b(j), Float.intBitsToFloat((int) (this.g >> 32)), jx7Var) : ghh.k(a1bVar.c(), yzt.b(j), Float.intBitsToFloat((int) (this.g >> 32)), jx7Var), (!a1b.g(a1bVar.d) || yzt.c(j) >= 0.0f) ? (!a1b.g(a1bVar.e) || yzt.c(j) <= 0.0f) ? 0.0f : -ghh.k(a1bVar.b(), -yzt.c(j), Float.intBitsToFloat((int) (4294967295L & this.g)), jx7Var) : ghh.k(a1bVar.e(), yzt.c(j), Float.intBitsToFloat((int) (4294967295L & this.g)), jx7Var));
                        if (s != 0) {
                            d();
                        }
                        d = yzt.d(j, s);
                        og0Var.j = this;
                        og0Var.k = d;
                        og0Var.n = 2;
                        xfmVar.getClass();
                        xfm xfmVar3 = new xfm((iyo) xfmVar.n, og0Var);
                        xfmVar3.m = d;
                        obj = xfmVar3.invokeSuspend(Unit.a);
                        if (obj != nm6Var) {
                            qg0Var = this;
                            d2 = yzt.d(d, ((yzt) obj).a);
                            qg0Var.f = false;
                            a1b a1bVar2 = qg0Var.c;
                            if (yzt.b(d2) <= 0.0f) {
                            }
                            if (yzt.c(d2) <= 0.0f) {
                            }
                            qg0Var.a();
                            return Unit.a;
                        }
                    }
                    return nm6Var;
                }
                if (i == 1) {
                    qgg.h0(obj);
                    return Unit.a;
                }
                if (i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                d = og0Var.k;
                qg0Var = og0Var.j;
                qgg.h0(obj);
                d2 = yzt.d(d, ((yzt) obj).a);
                qg0Var.f = false;
                a1b a1bVar22 = qg0Var.c;
                if (yzt.b(d2) <= 0.0f) {
                    EdgeEffect c = a1bVar22.c();
                    int b = eeh.b(yzt.b(d2));
                    if (Build.VERSION.SDK_INT >= 31) {
                        c.onAbsorb(b);
                    } else if (c.isFinished()) {
                        c.onAbsorb(b);
                    }
                } else if (yzt.b(d2) < 0.0f) {
                    EdgeEffect d3 = a1bVar22.d();
                    int i3 = -eeh.b(yzt.b(d2));
                    if (Build.VERSION.SDK_INT >= 31) {
                        d3.onAbsorb(i3);
                    } else if (d3.isFinished()) {
                        d3.onAbsorb(i3);
                    }
                }
                if (yzt.c(d2) <= 0.0f) {
                    EdgeEffect e = a1bVar22.e();
                    int b2 = eeh.b(yzt.c(d2));
                    if (Build.VERSION.SDK_INT >= 31) {
                        e.onAbsorb(b2);
                    } else if (e.isFinished()) {
                        e.onAbsorb(b2);
                    }
                } else if (yzt.c(d2) < 0.0f) {
                    EdgeEffect b3 = a1bVar22.b();
                    int i4 = -eeh.b(yzt.c(d2));
                    if (Build.VERSION.SDK_INT >= 31) {
                        b3.onAbsorb(i4);
                    } else if (b3.isFinished()) {
                        b3.onAbsorb(i4);
                    }
                }
                qg0Var.a();
                return Unit.a;
            }
        }
        og0Var = new og0(this, cg6Var);
        Object obj2 = og0Var.l;
        nm6 nm6Var2 = nm6.a;
        i = og0Var.n;
        if (i != 0) {
        }
    }

    public final long c() {
        long j = this.b;
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            j = a4g.y(this.g);
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / Float.intBitsToFloat((int) (this.g >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public final void d() {
        if (this.e) {
            this.d.setValue(Unit.a);
        }
    }

    public final float e(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect b = this.c.b();
        float f = -intBitsToFloat2;
        float f2 = 1 - intBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            f = rf0.u(b, f, f2);
        } else {
            b.onPull(f, f2);
        }
        return (i2 >= 31 ? rf0.l(b) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (4294967295L & this.g)) * (-f) : Float.intBitsToFloat(i);
    }

    public final float f(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i = (int) (j >> 32);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect c = this.c.c();
        float f = 1 - intBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            intBitsToFloat2 = rf0.u(c, intBitsToFloat2, f);
        } else {
            c.onPull(intBitsToFloat2, f);
        }
        return (i2 >= 31 ? rf0.l(c) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g >> 32)) * intBitsToFloat2 : Float.intBitsToFloat(i);
    }

    public final float g(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i = (int) (j >> 32);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect d = this.c.d();
        float f = -intBitsToFloat2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            f = rf0.u(d, f, intBitsToFloat);
        } else {
            d.onPull(f, intBitsToFloat);
        }
        return (i2 >= 31 ? rf0.l(d) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g >> 32)) * (-f) : Float.intBitsToFloat(i);
    }

    public final float h(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect e = this.c.e();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            intBitsToFloat2 = rf0.u(e, intBitsToFloat2, intBitsToFloat);
        } else {
            e.onPull(intBitsToFloat2, intBitsToFloat);
        }
        return (i2 >= 31 ? rf0.l(e) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g & 4294967295L)) * intBitsToFloat2 : Float.intBitsToFloat(i);
    }

    public final void i(long j) {
        boolean a = nmq.a(this.g, 0L);
        boolean a2 = nmq.a(j, this.g);
        this.g = j;
        if (!a2) {
            long b = (eeh.b(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (eeh.b(Float.intBitsToFloat((int) (j >> 32))) << 32);
            a1b a1bVar = this.c;
            a1bVar.c = b;
            EdgeEffect edgeEffect = a1bVar.d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (b >> 32), (int) (b & 4294967295L));
            }
            EdgeEffect edgeEffect2 = a1bVar.e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (b >> 32), (int) (b & 4294967295L));
            }
            EdgeEffect edgeEffect3 = a1bVar.f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (b & 4294967295L), (int) (b >> 32));
            }
            EdgeEffect edgeEffect4 = a1bVar.g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (b & 4294967295L), (int) (b >> 32));
            }
            EdgeEffect edgeEffect5 = a1bVar.h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (b >> 32), (int) (b & 4294967295L));
            }
            EdgeEffect edgeEffect6 = a1bVar.i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (b >> 32), (int) (b & 4294967295L));
            }
            EdgeEffect edgeEffect7 = a1bVar.j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (b & 4294967295L), (int) (b >> 32));
            }
            EdgeEffect edgeEffect8 = a1bVar.k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & b), (int) (b >> 32));
            }
        }
        if (a || a2) {
            return;
        }
        a();
    }
}
