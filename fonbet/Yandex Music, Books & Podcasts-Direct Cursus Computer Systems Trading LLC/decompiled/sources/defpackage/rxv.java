package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class rxv {
    public static final act K = weo.S(300, 0, nya.d, 2);
    public static final /* synthetic */ int L = 0;
    public final x6k A;
    public final x6k B;
    public final x6k C;
    public final x6k D;
    public final x6k E;
    public final x0q F;
    public final x0q G;
    public final x6k H;
    public boolean I;
    public final x6k J;
    public final float a;
    public final float b;
    public final float c;
    public final x6k d;
    public final x6k e;
    public final x6k f;
    public final x6k g;
    public final t6k h;
    public final t6k i;
    public final x6k j;
    public rk6 k;
    public final ok6 l;
    public final x6k m;
    public final x6k n;
    public final x6k o;
    public final x6k p;
    public long q;
    public final long r;
    public final mqi s;
    public final mqi t;
    public final mqi u;
    public final x8a v;
    public final x6k w;
    public final x6k x;
    public final x6k y;
    public final x6k z;

    public rxv(float f, float f2, int i, int i2, jeh jehVar, float f3, float f4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, heh hehVar, float f5, float f6) {
        jehVar.getClass();
        hehVar.getClass();
        float f7 = f5;
        float min = Math.min(f3, f7);
        f4 = (256 & 32) != 0 ? 1.0f : f4;
        float f8 = (256 & 256) != 0 ? 1.0f : 0.0f;
        f7 = (256 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 ? Float.MAX_VALUE : f7;
        float f9 = (256 & 1024) == 0 ? f6 : 1.0f;
        jehVar.getClass();
        hehVar.getClass();
        this.a = f8;
        this.b = f7;
        this.c = f9;
        this.d = szf.g0(hehVar);
        this.e = szf.g0(new enj(swf.i(f, f2)));
        this.f = szf.g0(new wpe(xv.t(i, i2)));
        this.g = szf.g0(jehVar);
        this.h = new t6k(min);
        this.i = new t6k(f4);
        Boolean bool = Boolean.FALSE;
        this.j = szf.g0(bool);
        this.k = new rk6(0, 0, 0, 0);
        this.l = new ok6(0);
        this.m = szf.g0(new enj(swf.i(f, f2)));
        this.n = szf.g0(new wpe(xv.t(i, i2)));
        this.o = szf.g0(ewo.a);
        this.p = szf.g0(bool);
        this.q = 0L;
        this.r = xv.t(64, 100);
        this.s = new mqi();
        this.t = new mqi();
        this.u = new mqi();
        this.v = new x8a();
        this.w = szf.g0(Boolean.valueOf(z));
        this.x = szf.g0(Boolean.valueOf(z3));
        this.y = szf.g0(Boolean.valueOf(z4));
        this.z = szf.g0(Boolean.valueOf(z5));
        this.A = szf.g0(Boolean.valueOf(z2));
        this.B = szf.g0(Boolean.valueOf(z6));
        this.C = szf.g0(Boolean.valueOf(z6));
        Boolean bool2 = Boolean.FALSE;
        this.D = szf.g0(bool2);
        this.E = szf.g0(bool2);
        x0q b = y0q.b(1, 0, oi3.b, 2);
        this.F = b;
        this.G = b;
        this.H = szf.g0(null);
        this.J = szf.g0(new enj(0L));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object c(rxv rxvVar, cg6 cg6Var) {
        oeh oehVar;
        int i;
        if (cg6Var instanceof oeh) {
            oehVar = (oeh) cg6Var;
            int i2 = oehVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oehVar.m = i2 - Integer.MIN_VALUE;
                Object obj = oehVar.k;
                nm6 nm6Var = nm6.a;
                i = oehVar.m;
                int i3 = 1;
                if (i != 0) {
                    qgg.h0(obj);
                    mqi mqiVar = rxvVar.s;
                    hqi hqiVar = hqi.c;
                    ikc ikcVar = new ikc(i3, 4, null);
                    oehVar.j = rxvVar;
                    oehVar.m = 1;
                    if (mqiVar.b(hqiVar, ikcVar, oehVar) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rxvVar = oehVar.j;
                    qgg.h0(obj);
                }
                rxvVar.q(enj.g(rxvVar.g(), swf.i(nmq.d(rxvVar.q) * ((int) (rxvVar.d() >> 32)), nmq.b(rxvVar.q) * ((int) (rxvVar.d() & 4294967295L)))));
                rxvVar.f.setValue(new wpe(0L));
                return Unit.a;
            }
        }
        oehVar = new oeh(rxvVar, cg6Var);
        Object obj2 = oehVar.k;
        nm6 nm6Var2 = nm6.a;
        i = oehVar.m;
        int i32 = 1;
        if (i != 0) {
        }
        rxvVar.q(enj.g(rxvVar.g(), swf.i(nmq.d(rxvVar.q) * ((int) (rxvVar.d() >> 32)), nmq.b(rxvVar.q) * ((int) (rxvVar.d() & 4294967295L)))));
        rxvVar.f.setValue(new wpe(0L));
        return Unit.a;
    }

    public static Object l(rxv rxvVar, mqi mqiVar, Function0 function0, Function1 function1, cg6 cg6Var, int i) {
        hqi hqiVar = hqi.c;
        if ((i & 1) != 0) {
            hqiVar = hqi.a;
        }
        if ((i & 2) != 0) {
            function0 = new opg(22);
        }
        rxvVar.getClass();
        Object o0 = bkp.o0(mqiVar, hqiVar, function0, "MatrixState", function1, cg6Var);
        return o0 == nm6.a ? o0 : Unit.a;
    }

    public final Object a(geh gehVar, tm0 tm0Var, peh pehVar) {
        long t = gehVar != null ? xv.t(gehVar.a, gehVar.b) : d();
        long i = swf.i(nmq.d(this.q) * ((int) (t >> 32)), nmq.b(this.q) * ((int) (4294967295L & t)));
        this.m.setValue(new enj(i));
        this.n.setValue(new wpe(t));
        hqi hqiVar = hqi.a;
        Object l = l(this, this.s, null, new neh(this, i, tm0Var, null, 1), pehVar, 2);
        return l == nm6.a ? l : Unit.a;
    }

    public final Object b(float f, tm0 tm0Var, cg6 cg6Var) {
        Object l = l(this, this.t, null, new meh(this, f, tm0Var, null, 1), cg6Var, 3);
        return l == nm6.a ? l : Unit.a;
    }

    public final long d() {
        return ((wpe) this.f.getValue()).a;
    }

    public final heh e() {
        return (heh) this.d.getValue();
    }

    public final long f(long j, long j2) {
        float d = nmq.d(this.q);
        t6k t6kVar = this.h;
        float e = t6kVar.e() * d;
        float e2 = t6kVar.e() * nmq.b(this.q);
        long g = enj.g(g(), swf.i(((int) (d() >> 32)) * e, ((int) (d() & 4294967295L)) * e2));
        long g2 = enj.g(enj.h(j2, g), enj.h(j, g));
        return xv.t(((int) (d() >> 32)) + eeh.b(enj.e(g2) / e), ((int) (d() & 4294967295L)) + eeh.b(enj.f(g2) / e2));
    }

    public final long g() {
        return ((enj) this.e.getValue()).a;
    }

    public final jeh h() {
        return (jeh) this.g.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00aa, code lost:
    
        if (j(r10, r12, r0) != r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ac, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006b, code lost:
    
        if (j(r10, r13, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(long j, tm0 tm0Var, cg6 cg6Var) {
        pxv pxvVar;
        int i;
        if (cg6Var instanceof pxv) {
            pxvVar = (pxv) cg6Var;
            int i2 = pxvVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pxvVar.n = i2 - Integer.MIN_VALUE;
                Object obj = pxvVar.l;
                Object obj2 = nm6.a;
                i = pxvVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    this.H.setValue(null);
                    if (this.h.e() == 2.2f && h() == jeh.b) {
                        tm0 S = weo.S(300, 0, lya.c, 2);
                        pxvVar.k = tm0Var;
                        pxvVar.j = j;
                        pxvVar.n = 1;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        this.I = false;
                        return Unit.a;
                    }
                    j = pxvVar.j;
                    tm0Var = pxvVar.k;
                    qgg.h0(obj);
                }
                if (this.I) {
                    this.F.a(new wpe(f(j, ((enj) this.J.getValue()).a)));
                    this.w.setValue(Boolean.TRUE);
                    o(true);
                }
                if (this.I || h() != jeh.a) {
                    pxvVar.k = null;
                    pxvVar.j = j;
                    pxvVar.n = 2;
                }
                this.I = false;
                return Unit.a;
            }
        }
        pxvVar = new pxv(this, cg6Var);
        Object obj3 = pxvVar.l;
        Object obj22 = nm6.a;
        i = pxvVar.n;
        if (i != 0) {
        }
        if (this.I) {
        }
        if (this.I) {
        }
        pxvVar.k = null;
        pxvVar.j = j;
        pxvVar.n = 2;
    }

    public final Object j(long j, tm0 tm0Var, cg6 cg6Var) {
        Object l;
        int ordinal = h().ordinal();
        Continuation continuation = null;
        if (ordinal == 0) {
            l = l(this, this.s, new keh(this, 0), new hv0(this, continuation, 18), cg6Var, 1);
            if (l != nm6.a) {
                l = Unit.a;
            }
        } else {
            if (ordinal != 1) {
                b6e.s();
                return null;
            }
            l = l(this, this.s, new keh(this, 1), new w90(this, tm0Var, continuation, 7), cg6Var, 1);
            if (l != nm6.a) {
                l = Unit.a;
            }
        }
        return l == nm6.a ? l : Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(cg6 cg6Var) {
        qxv qxvVar;
        int i;
        if (cg6Var instanceof qxv) {
            qxvVar = (qxv) cg6Var;
            int i2 = qxvVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qxvVar.l = i2 - Integer.MIN_VALUE;
                Object obj = qxvVar.j;
                nm6 nm6Var = nm6.a;
                i = qxvVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    qxvVar.l = 1;
                    this.v.f();
                    qs qsVar = new qs(this, null, 5);
                    Object b = this.s.b(hqi.a, qsVar, qxvVar);
                    nm6 nm6Var2 = nm6.a;
                    if (b != nm6Var2) {
                        b = Unit.a;
                    }
                    if (b != nm6Var2) {
                        b = Unit.a;
                    }
                    if (b == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                if (h() == jeh.a && e() == heh.b) {
                    this.H.setValue(new Float(0.0f));
                }
                return Unit.a;
            }
        }
        qxvVar = new qxv(this, cg6Var);
        Object obj2 = qxvVar.j;
        nm6 nm6Var3 = nm6.a;
        i = qxvVar.l;
        if (i != 0) {
        }
        if (h() == jeh.a) {
            this.H.setValue(new Float(0.0f));
        }
        return Unit.a;
    }

    public final void m(float f) {
        float c = yhn.c(f, this.a, this.b);
        mqi mqiVar = this.t;
        if (mqiVar.b.g()) {
            try {
                this.h.h(c);
            } finally {
                mqiVar.c();
            }
        }
    }

    public final void n(long j, lfm lfmVar) {
        ewo ewoVar;
        lfmVar.getClass();
        if (((Boolean) this.B.getValue()).booleanValue()) {
            return;
        }
        if (h() == jeh.a && e() == heh.b && Math.abs(enj.e(j)) > Math.abs(enj.f(j))) {
            x6k x6kVar = this.H;
            Float f = (Float) x6kVar.getValue();
            x6kVar.setValue(Float.valueOf(enj.e(j) + (f != null ? f.floatValue() : 0.0f)));
        } else {
            x6k x6kVar2 = this.o;
            lfmVar.getClass();
            int ordinal = h().ordinal();
            if (ordinal == 0) {
                ezf.r(this.v, lfmVar);
                long g = g();
                int ordinal2 = e().ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        j = enj.a(0.0f, 0.0f, 2, j);
                    } else if (ordinal2 == 2) {
                        j = enj.a(0.0f, 0.0f, 1, j);
                    } else {
                        b6e.s();
                    }
                }
                q(enj.g(g, j));
            } else if (ordinal == 1) {
                mqi mqiVar = this.s;
                if (mqiVar.b.g()) {
                    try {
                        int ordinal3 = ((ewo) x6kVar2.getValue()).ordinal();
                        if (ordinal3 == 0) {
                            if (Math.abs(enj.e(j)) > Math.abs(enj.f(j))) {
                                q(enj.g(g(), enj.a(0.0f, 0.0f, 1, j)));
                                ewoVar = ewo.c;
                            } else {
                                q(enj.g(g(), enj.a(0.0f, 0.0f, 2, j)));
                                ewoVar = ewo.b;
                            }
                            x6kVar2.setValue(ewoVar);
                        } else if (ordinal3 == 1) {
                            q(enj.g(g(), enj.a(0.0f, 0.0f, 2, j)));
                        } else {
                            if (ordinal3 != 2) {
                                throw new x7j();
                            }
                            q(enj.g(g(), enj.a(0.0f, 0.0f, 1, j)));
                        }
                        mqiVar.c();
                    } catch (Throwable th) {
                        mqiVar.c();
                        throw th;
                    }
                }
            } else {
                b6e.s();
            }
        }
        if (((Boolean) this.w.getValue()).booleanValue()) {
            this.A.setValue(Boolean.FALSE);
        }
    }

    public final void o(boolean z) {
        this.x.setValue(Boolean.valueOf(z));
    }

    public final void p(boolean z) {
        this.j.setValue(Boolean.valueOf(z));
    }

    public final void q(long j) {
        this.e.setValue(new enj(j));
    }

    public final void r(boolean z) {
        this.E.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
    
        if (a(r13, r14, r5) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0095, code lost:
    
        if (a(r13, r14, r5) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0063, code lost:
    
        if (l(r1, r11.s, null, r4, r5, 2) == r0) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(jeh jehVar, geh gehVar, tm0 tm0Var, cg6 cg6Var) {
        peh pehVar;
        int i;
        rxv rxvVar;
        int ordinal;
        if (cg6Var instanceof peh) {
            pehVar = (peh) cg6Var;
            int i2 = pehVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pehVar.o = i2 - Integer.MIN_VALUE;
                peh pehVar2 = pehVar;
                Object obj = pehVar2.m;
                nm6 nm6Var = nm6.a;
                i = pehVar2.o;
                int i3 = 1;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    hqi hqiVar = hqi.a;
                    ikc ikcVar = new ikc(i3, 5, continuation);
                    pehVar2.j = jehVar;
                    pehVar2.k = gehVar;
                    pehVar2.l = tm0Var;
                    pehVar2.o = 1;
                    rxvVar = this;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                qgg.h0(obj);
                                return Unit.a;
                            }
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        rxvVar = this;
                        rxvVar.o.setValue(ewo.a);
                        return Unit.a;
                    }
                    tm0Var = pehVar2.l;
                    gehVar = pehVar2.k;
                    jehVar = pehVar2.j;
                    qgg.h0(obj);
                    rxvVar = this;
                }
                rxvVar.g.setValue(jehVar);
                ordinal = jehVar.ordinal();
                if (ordinal != 0) {
                    pehVar2.j = null;
                    pehVar2.k = null;
                    pehVar2.l = null;
                    pehVar2.o = 2;
                } else {
                    if (ordinal != 1) {
                        b6e.s();
                        return null;
                    }
                    pehVar2.j = null;
                    pehVar2.k = null;
                    pehVar2.l = null;
                    pehVar2.o = 3;
                }
                return nm6Var;
            }
        }
        pehVar = new peh(this, cg6Var);
        peh pehVar22 = pehVar;
        Object obj2 = pehVar22.m;
        nm6 nm6Var2 = nm6.a;
        i = pehVar22.o;
        int i32 = 1;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        rxvVar.g.setValue(jehVar);
        ordinal = jehVar.ordinal();
        if (ordinal != 0) {
        }
        return nm6Var2;
    }
}
