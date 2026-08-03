package w;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import m0.l1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g implements w0 {

    /* renamed from: g, reason: collision with root package name */
    public e1.b f7418g;

    /* renamed from: h, reason: collision with root package name */
    public final y f7419h;

    /* renamed from: i, reason: collision with root package name */
    public final l1 f7420i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f7421j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f7422k;

    /* renamed from: l, reason: collision with root package name */
    public long f7423l;

    /* renamed from: m, reason: collision with root package name */
    public r1.m f7424m;

    /* renamed from: n, reason: collision with root package name */
    public final y0.n f7425n;

    public g(Context context, u0 u0Var) {
        y yVar = new y(context, f1.d0.s(u0Var.f7513a));
        this.f7419h = yVar;
        m0.z0 z0Var = m0.z0.f4841i;
        ac.o oVar = ac.o.f277a;
        this.f7420i = new l1(oVar, z0Var);
        this.f7421j = true;
        this.f7423l = 0L;
        c0.d dVar = new c0.d(this, null, 12);
        r1.g gVar = r1.u.f5994a;
        this.f7425n = new SuspendPointerInputElement(oVar, null, new r1.t(dVar), 6).d(Build.VERSION.SDK_INT >= 31 ? new w(this, yVar) : new w(this, yVar, u0Var));
    }

    @Override // w.w0
    public final boolean a() {
        y yVar = this.f7419h;
        EdgeEffect edgeEffect = yVar.f7526d;
        h hVar = h.f7427a;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? hVar.b(edgeEffect) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = yVar.f7527e;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? hVar.b(edgeEffect2) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = yVar.f7528f;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? hVar.b(edgeEffect3) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = yVar.f7529g;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? hVar.b(edgeEffect4) : 0.0f) != 0.0f;
        }
        return false;
    }

    @Override // w.w0
    public final y0.n b() {
        return this.f7425n;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0149 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0253 A[ADDED_TO_REGION] */
    @Override // w.w0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long c(long j3, int i10, wc.i iVar) {
        float h10;
        float j6;
        long h11;
        boolean z10;
        boolean z11;
        EdgeEffect b2;
        EdgeEffect e10;
        EdgeEffect d10;
        boolean z12;
        boolean z13;
        if (e1.e.e(this.f7423l)) {
            iVar.getClass();
            x.z0 z0Var = (x.z0) iVar.f7723h;
            return new e1.b(x.z0.a(z0Var, z0Var.f7958h, j3, z0Var.f7957g)).f1929a;
        }
        boolean z14 = this.f7422k;
        boolean z15 = true;
        y yVar = this.f7419h;
        if (!z14) {
            if (y.g(yVar.f7528f)) {
                i(0L);
            }
            if (y.g(yVar.f7529g)) {
                j(0L);
            }
            if (y.g(yVar.f7526d)) {
                k(0L);
            }
            if (y.g(yVar.f7527e)) {
                h(0L);
            }
            this.f7422k = true;
        }
        if (e1.b.e(j3) != 0.0f) {
            if (y.g(yVar.f7526d)) {
                h10 = k(j3);
                if (!y.g(yVar.f7526d)) {
                    yVar.e().onRelease();
                }
            } else if (y.g(yVar.f7527e)) {
                h10 = h(j3);
                if (!y.g(yVar.f7527e)) {
                    yVar.b().onRelease();
                }
            }
            if (e1.b.d(j3) != 0.0f) {
                if (y.g(yVar.f7528f)) {
                    j6 = i(j3);
                    if (!y.g(yVar.f7528f)) {
                        yVar.c().onRelease();
                    }
                } else if (y.g(yVar.f7529g)) {
                    j6 = j(j3);
                    if (!y.g(yVar.f7529g)) {
                        yVar.d().onRelease();
                    }
                }
                h11 = v6.a.h(j6, h10);
                if (!e1.b.b(h11, 0L)) {
                    g();
                }
                long f10 = e1.b.f(j3, h11);
                iVar.getClass();
                x.z0 z0Var2 = (x.z0) iVar.f7723h;
                long j10 = new e1.b(x.z0.a(z0Var2, z0Var2.f7958h, f10, z0Var2.f7957g)).f1929a;
                long f11 = e1.b.f(f10, j10);
                if (i10 == 1) {
                    if (e1.b.d(f11) > 0.5f) {
                        i(f11);
                    } else {
                        if (e1.b.d(f11) >= -0.5f) {
                            z12 = false;
                            if (e1.b.e(f11) <= 0.5f) {
                                k(f11);
                            } else if (e1.b.e(f11) < -0.5f) {
                                h(f11);
                            } else {
                                z13 = false;
                                if (!z12 || z13) {
                                    z10 = true;
                                    if (y.f(yVar.f7528f) || e1.b.d(j3) >= 0.0f) {
                                        z11 = false;
                                    } else {
                                        EdgeEffect c3 = yVar.c();
                                        float d11 = e1.b.d(j3);
                                        if (c3 instanceof f0) {
                                            f0 f0Var = (f0) c3;
                                            float f12 = f0Var.f7417b + d11;
                                            f0Var.f7417b = f12;
                                            if (Math.abs(f12) > f0Var.f7416a) {
                                                f0Var.onRelease();
                                            }
                                        } else {
                                            c3.onRelease();
                                        }
                                        z11 = !y.f(yVar.f7528f);
                                    }
                                    if (y.f(yVar.f7529g) && e1.b.d(j3) > 0.0f) {
                                        d10 = yVar.d();
                                        float d12 = e1.b.d(j3);
                                        if (d10 instanceof f0) {
                                            d10.onRelease();
                                        } else {
                                            f0 f0Var2 = (f0) d10;
                                            float f13 = f0Var2.f7417b + d12;
                                            f0Var2.f7417b = f13;
                                            if (Math.abs(f13) > f0Var2.f7416a) {
                                                f0Var2.onRelease();
                                            }
                                        }
                                        z11 = (z11 && y.f(yVar.f7529g)) ? false : true;
                                    }
                                    if (y.f(yVar.f7526d) && e1.b.e(j3) < 0.0f) {
                                        e10 = yVar.e();
                                        float e11 = e1.b.e(j3);
                                        if (e10 instanceof f0) {
                                            e10.onRelease();
                                        } else {
                                            f0 f0Var3 = (f0) e10;
                                            float f14 = f0Var3.f7417b + e11;
                                            f0Var3.f7417b = f14;
                                            if (Math.abs(f14) > f0Var3.f7416a) {
                                                f0Var3.onRelease();
                                            }
                                        }
                                        z11 = (z11 && y.f(yVar.f7526d)) ? false : true;
                                    }
                                    if (y.f(yVar.f7527e) && e1.b.e(j3) > 0.0f) {
                                        b2 = yVar.b();
                                        float e12 = e1.b.e(j3);
                                        if (b2 instanceof f0) {
                                            b2.onRelease();
                                        } else {
                                            f0 f0Var4 = (f0) b2;
                                            float f15 = f0Var4.f7417b + e12;
                                            f0Var4.f7417b = f15;
                                            if (Math.abs(f15) > f0Var4.f7416a) {
                                                f0Var4.onRelease();
                                            }
                                        }
                                        z11 = (z11 && y.f(yVar.f7527e)) ? false : true;
                                    }
                                    if (!z11 && !z10) {
                                        z15 = false;
                                    }
                                    if (z15) {
                                        g();
                                    }
                                    return e1.b.g(h11, j10);
                                }
                            }
                            z13 = true;
                            if (!z12) {
                            }
                            z10 = true;
                            if (y.f(yVar.f7528f)) {
                            }
                            z11 = false;
                            if (y.f(yVar.f7529g)) {
                                d10 = yVar.d();
                                float d122 = e1.b.d(j3);
                                if (d10 instanceof f0) {
                                }
                                if (z11) {
                                }
                            }
                            if (y.f(yVar.f7526d)) {
                                e10 = yVar.e();
                                float e112 = e1.b.e(j3);
                                if (e10 instanceof f0) {
                                }
                                if (z11) {
                                }
                            }
                            if (y.f(yVar.f7527e)) {
                                b2 = yVar.b();
                                float e122 = e1.b.e(j3);
                                if (b2 instanceof f0) {
                                }
                                if (z11) {
                                }
                            }
                            if (!z11) {
                                z15 = false;
                            }
                            if (z15) {
                            }
                            return e1.b.g(h11, j10);
                        }
                        j(f11);
                    }
                    z12 = true;
                    if (e1.b.e(f11) <= 0.5f) {
                    }
                    z13 = true;
                    if (!z12) {
                    }
                    z10 = true;
                    if (y.f(yVar.f7528f)) {
                    }
                    z11 = false;
                    if (y.f(yVar.f7529g)) {
                    }
                    if (y.f(yVar.f7526d)) {
                    }
                    if (y.f(yVar.f7527e)) {
                    }
                    if (!z11) {
                    }
                    if (z15) {
                    }
                    return e1.b.g(h11, j10);
                }
                z10 = false;
                if (y.f(yVar.f7528f)) {
                }
                z11 = false;
                if (y.f(yVar.f7529g)) {
                }
                if (y.f(yVar.f7526d)) {
                }
                if (y.f(yVar.f7527e)) {
                }
                if (!z11) {
                }
                if (z15) {
                }
                return e1.b.g(h11, j10);
            }
            j6 = 0.0f;
            h11 = v6.a.h(j6, h10);
            if (!e1.b.b(h11, 0L)) {
            }
            long f102 = e1.b.f(j3, h11);
            iVar.getClass();
            x.z0 z0Var22 = (x.z0) iVar.f7723h;
            long j102 = new e1.b(x.z0.a(z0Var22, z0Var22.f7958h, f102, z0Var22.f7957g)).f1929a;
            long f112 = e1.b.f(f102, j102);
            if (i10 == 1) {
            }
            z10 = false;
            if (y.f(yVar.f7528f)) {
            }
            z11 = false;
            if (y.f(yVar.f7529g)) {
            }
            if (y.f(yVar.f7526d)) {
            }
            if (y.f(yVar.f7527e)) {
            }
            if (!z11) {
            }
            if (z15) {
            }
            return e1.b.g(h11, j102);
        }
        h10 = 0.0f;
        if (e1.b.d(j3) != 0.0f) {
        }
        j6 = 0.0f;
        h11 = v6.a.h(j6, h10);
        if (!e1.b.b(h11, 0L)) {
        }
        long f1022 = e1.b.f(j3, h11);
        iVar.getClass();
        x.z0 z0Var222 = (x.z0) iVar.f7723h;
        long j1022 = new e1.b(x.z0.a(z0Var222, z0Var222.f7958h, f1022, z0Var222.f7957g)).f1929a;
        long f1122 = e1.b.f(f1022, j1022);
        if (i10 == 1) {
        }
        z10 = false;
        if (y.f(yVar.f7528f)) {
        }
        z11 = false;
        if (y.f(yVar.f7529g)) {
        }
        if (y.f(yVar.f7526d)) {
        }
        if (y.f(yVar.f7527e)) {
        }
        if (!z11) {
        }
        if (z15) {
        }
        return e1.b.g(h11, j1022);
    }

    public final void d() {
        boolean z10;
        y yVar = this.f7419h;
        EdgeEffect edgeEffect = yVar.f7526d;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z10 = edgeEffect.isFinished();
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = yVar.f7527e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z10 = edgeEffect2.isFinished() || z10;
        }
        EdgeEffect edgeEffect3 = yVar.f7528f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z10 = edgeEffect3.isFinished() || z10;
        }
        EdgeEffect edgeEffect4 = yVar.f7529g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z10 = edgeEffect4.isFinished() || z10;
        }
        if (z10) {
            g();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // w.w0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(long j3, x.y0 y0Var, fc.d dVar) {
        e eVar;
        int i10;
        float f10;
        float f11;
        long d10;
        g gVar;
        long d11;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i11 = eVar.f7410k;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f7410k = i11 - Integer.MIN_VALUE;
                Object obj = eVar.f7408i;
                i10 = eVar.f7410k;
                ac.o oVar = ac.o.f277a;
                if (i10 != 0) {
                    v6.a.W(obj);
                    boolean e10 = e1.e.e(this.f7423l);
                    gc.a aVar = gc.a.f2559g;
                    if (e10) {
                        eVar.f7410k = 1;
                        y0Var.getClass();
                        x.y0 y0Var2 = new x.y0(y0Var.f7944j, eVar);
                        y0Var2.f7943i = j3;
                        if (y0Var2.invokeSuspend(oVar) != aVar) {
                            return oVar;
                        }
                    } else {
                        float b2 = s2.p.b(j3);
                        y yVar = this.f7419h;
                        if (b2 > 0.0f && y.g(yVar.f7528f)) {
                            EdgeEffect c3 = yVar.c();
                            int I = bc.a0.I(s2.p.b(j3));
                            if (Build.VERSION.SDK_INT >= 31) {
                                c3.onAbsorb(I);
                            } else if (c3.isFinished()) {
                                c3.onAbsorb(I);
                            }
                            f10 = s2.p.b(j3);
                        } else if (s2.p.b(j3) >= 0.0f || !y.g(yVar.f7529g)) {
                            f10 = 0.0f;
                        } else {
                            EdgeEffect d12 = yVar.d();
                            int i12 = -bc.a0.I(s2.p.b(j3));
                            if (Build.VERSION.SDK_INT >= 31) {
                                d12.onAbsorb(i12);
                            } else if (d12.isFinished()) {
                                d12.onAbsorb(i12);
                            }
                            f10 = s2.p.b(j3);
                        }
                        if (s2.p.c(j3) > 0.0f && y.g(yVar.f7526d)) {
                            EdgeEffect e11 = yVar.e();
                            int I2 = bc.a0.I(s2.p.c(j3));
                            if (Build.VERSION.SDK_INT >= 31) {
                                e11.onAbsorb(I2);
                            } else if (e11.isFinished()) {
                                e11.onAbsorb(I2);
                            }
                            f11 = s2.p.c(j3);
                        } else if (s2.p.c(j3) >= 0.0f || !y.g(yVar.f7527e)) {
                            f11 = 0.0f;
                        } else {
                            EdgeEffect b10 = yVar.b();
                            int i13 = -bc.a0.I(s2.p.c(j3));
                            if (Build.VERSION.SDK_INT >= 31) {
                                b10.onAbsorb(i13);
                            } else if (b10.isFinished()) {
                                b10.onAbsorb(i13);
                            }
                            f11 = s2.p.c(j3);
                        }
                        long j6 = v6.a.j(f10, f11);
                        if (j6 != 0) {
                            g();
                        }
                        d10 = s2.p.d(j3, j6);
                        eVar.f7406g = this;
                        eVar.f7407h = d10;
                        eVar.f7410k = 2;
                        y0Var.getClass();
                        x.y0 y0Var3 = new x.y0(y0Var.f7944j, eVar);
                        y0Var3.f7943i = d10;
                        obj = y0Var3.invokeSuspend(oVar);
                        if (obj != aVar) {
                            gVar = this;
                        }
                    }
                    return aVar;
                }
                if (i10 == 1) {
                    v6.a.W(obj);
                    return oVar;
                }
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d10 = eVar.f7407h;
                gVar = eVar.f7406g;
                v6.a.W(obj);
                d11 = s2.p.d(d10, ((s2.p) obj).f6404a);
                gVar.f7422k = false;
                y yVar2 = gVar.f7419h;
                if (s2.p.b(d11) <= 0.0f) {
                    EdgeEffect c7 = yVar2.c();
                    int I3 = bc.a0.I(s2.p.b(d11));
                    if (Build.VERSION.SDK_INT >= 31) {
                        c7.onAbsorb(I3);
                    } else if (c7.isFinished()) {
                        c7.onAbsorb(I3);
                    }
                } else if (s2.p.b(d11) < 0.0f) {
                    EdgeEffect d13 = yVar2.d();
                    int i14 = -bc.a0.I(s2.p.b(d11));
                    if (Build.VERSION.SDK_INT >= 31) {
                        d13.onAbsorb(i14);
                    } else if (d13.isFinished()) {
                        d13.onAbsorb(i14);
                    }
                }
                if (s2.p.c(d11) <= 0.0f) {
                    EdgeEffect e12 = yVar2.e();
                    int I4 = bc.a0.I(s2.p.c(d11));
                    if (Build.VERSION.SDK_INT >= 31) {
                        e12.onAbsorb(I4);
                    } else if (e12.isFinished()) {
                        e12.onAbsorb(I4);
                    }
                } else if (s2.p.c(d11) < 0.0f) {
                    EdgeEffect b11 = yVar2.b();
                    int i15 = -bc.a0.I(s2.p.c(d11));
                    if (Build.VERSION.SDK_INT >= 31) {
                        b11.onAbsorb(i15);
                    } else if (b11.isFinished()) {
                        b11.onAbsorb(i15);
                    }
                }
                if (d11 != 0) {
                    gVar.g();
                }
                gVar.d();
                return oVar;
            }
        }
        eVar = new e(this, (hc.c) dVar);
        Object obj2 = eVar.f7408i;
        i10 = eVar.f7410k;
        ac.o oVar2 = ac.o.f277a;
        if (i10 != 0) {
        }
        d11 = s2.p.d(d10, ((s2.p) obj2).f6404a);
        gVar.f7422k = false;
        y yVar22 = gVar.f7419h;
        if (s2.p.b(d11) <= 0.0f) {
        }
        if (s2.p.c(d11) <= 0.0f) {
        }
        if (d11 != 0) {
        }
        gVar.d();
        return oVar2;
    }

    public final long f() {
        e1.b bVar = this.f7418g;
        long v10 = bVar != null ? bVar.f1929a : i7.b.v(this.f7423l);
        return v6.a.h(e1.b.d(v10) / e1.e.d(this.f7423l), e1.b.e(v10) / e1.e.b(this.f7423l));
    }

    public final void g() {
        if (this.f7421j) {
            this.f7420i.setValue(ac.o.f277a);
        }
    }

    public final float h(long j3) {
        float d10 = e1.b.d(f());
        float e10 = e1.b.e(j3) / e1.e.b(this.f7423l);
        EdgeEffect b2 = this.f7419h.b();
        float f10 = -e10;
        float f11 = 1 - d10;
        int i10 = Build.VERSION.SDK_INT;
        h hVar = h.f7427a;
        if (i10 >= 31) {
            f10 = hVar.c(b2, f10, f11);
        } else {
            b2.onPull(f10, f11);
        }
        return (i10 >= 31 ? hVar.b(b2) : 0.0f) == 0.0f ? e1.e.b(this.f7423l) * (-f10) : e1.b.e(j3);
    }

    public final float i(long j3) {
        float e10 = e1.b.e(f());
        float d10 = e1.b.d(j3) / e1.e.d(this.f7423l);
        EdgeEffect c3 = this.f7419h.c();
        float f10 = 1 - e10;
        int i10 = Build.VERSION.SDK_INT;
        h hVar = h.f7427a;
        if (i10 >= 31) {
            d10 = hVar.c(c3, d10, f10);
        } else {
            c3.onPull(d10, f10);
        }
        return (i10 >= 31 ? hVar.b(c3) : 0.0f) == 0.0f ? e1.e.d(this.f7423l) * d10 : e1.b.d(j3);
    }

    public final float j(long j3) {
        float e10 = e1.b.e(f());
        float d10 = e1.b.d(j3) / e1.e.d(this.f7423l);
        EdgeEffect d11 = this.f7419h.d();
        float f10 = -d10;
        int i10 = Build.VERSION.SDK_INT;
        h hVar = h.f7427a;
        if (i10 >= 31) {
            f10 = hVar.c(d11, f10, e10);
        } else {
            d11.onPull(f10, e10);
        }
        return (i10 >= 31 ? hVar.b(d11) : 0.0f) == 0.0f ? e1.e.d(this.f7423l) * (-f10) : e1.b.d(j3);
    }

    public final float k(long j3) {
        float d10 = e1.b.d(f());
        float e10 = e1.b.e(j3) / e1.e.b(this.f7423l);
        EdgeEffect e11 = this.f7419h.e();
        int i10 = Build.VERSION.SDK_INT;
        h hVar = h.f7427a;
        if (i10 >= 31) {
            e10 = hVar.c(e11, e10, d10);
        } else {
            e11.onPull(e10, d10);
        }
        return (i10 >= 31 ? hVar.b(e11) : 0.0f) == 0.0f ? e1.e.b(this.f7423l) * e10 : e1.b.e(j3);
    }

    public final void l(long j3) {
        boolean a6 = e1.e.a(this.f7423l, 0L);
        boolean a8 = e1.e.a(j3, this.f7423l);
        this.f7423l = j3;
        if (!a8) {
            long e10 = i7.b.e(bc.a0.I(e1.e.d(j3)), bc.a0.I(e1.e.b(j3)));
            y yVar = this.f7419h;
            yVar.f7525c = e10;
            EdgeEffect edgeEffect = yVar.f7526d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (e10 >> 32), (int) (e10 & 4294967295L));
            }
            EdgeEffect edgeEffect2 = yVar.f7527e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (e10 >> 32), (int) (e10 & 4294967295L));
            }
            EdgeEffect edgeEffect3 = yVar.f7528f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (e10 & 4294967295L), (int) (e10 >> 32));
            }
            EdgeEffect edgeEffect4 = yVar.f7529g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (e10 & 4294967295L), (int) (e10 >> 32));
            }
            EdgeEffect edgeEffect5 = yVar.f7530h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (e10 >> 32), (int) (e10 & 4294967295L));
            }
            EdgeEffect edgeEffect6 = yVar.f7531i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (e10 >> 32), (int) (e10 & 4294967295L));
            }
            EdgeEffect edgeEffect7 = yVar.f7532j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (e10 & 4294967295L), (int) (e10 >> 32));
            }
            EdgeEffect edgeEffect8 = yVar.f7533k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (e10 & 4294967295L), (int) (e10 >> 32));
            }
        }
        if (a6 || a8) {
            return;
        }
        g();
        d();
    }
}
