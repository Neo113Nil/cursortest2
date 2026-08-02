package com.yandex.div.core.dagger;

import android.content.Context;
import android.graphics.Paint;
import android.view.ContextThemeWrapper;
import com.yandex.div.core.dagger.Div2Component;
import com.yandex.div.core.dagger.Div2ViewComponent;
import com.yandex.div.core.dagger.DivKitComponent;
import defpackage.a39;
import defpackage.av8;
import defpackage.btf;
import defpackage.bv8;
import defpackage.bz2;
import defpackage.bz9;
import defpackage.c5p;
import defpackage.ce8;
import defpackage.cp9;
import defpackage.cu9;
import defpackage.d39;
import defpackage.dd9;
import defpackage.doh;
import defpackage.dph;
import defpackage.dt8;
import defpackage.e0n;
import defpackage.efb;
import defpackage.eg8;
import defpackage.ehv;
import defpackage.en8;
import defpackage.er9;
import defpackage.es6;
import defpackage.ewe;
import defpackage.f39;
import defpackage.fdu;
import defpackage.feu;
import defpackage.g23;
import defpackage.gao;
import defpackage.gc8;
import defpackage.gm9;
import defpackage.gp8;
import defpackage.grb;
import defpackage.h23;
import defpackage.hp8;
import defpackage.hw9;
import defpackage.jl9;
import defpackage.kb9;
import defpackage.l1j;
import defpackage.l2k;
import defpackage.l79;
import defpackage.lkk;
import defpackage.lum;
import defpackage.lwj;
import defpackage.ly9;
import defpackage.m0a;
import defpackage.m1a;
import defpackage.m39;
import defpackage.mf9;
import defpackage.myd;
import defpackage.nct;
import defpackage.nm9;
import defpackage.o19;
import defpackage.ogu;
import defpackage.one;
import defpackage.ox6;
import defpackage.ozw;
import defpackage.p0a;
import defpackage.pct;
import defpackage.pe8;
import defpackage.pgu;
import defpackage.pir;
import defpackage.pv9;
import defpackage.py9;
import defpackage.qct;
import defpackage.qe9;
import defpackage.qg8;
import defpackage.qu9;
import defpackage.qyd;
import defpackage.qz9;
import defpackage.r0a;
import defpackage.rn;
import defpackage.rt8;
import defpackage.rwd;
import defpackage.sc9;
import defpackage.si9;
import defpackage.sj3;
import defpackage.sjo;
import defpackage.stn;
import defpackage.su8;
import defpackage.tb8;
import defpackage.tc9;
import defpackage.ttn;
import defpackage.tx8;
import defpackage.tz9;
import defpackage.u23;
import defpackage.um9;
import defpackage.uyd;
import defpackage.v23;
import defpackage.v29;
import defpackage.v8a;
import defpackage.vf6;
import defpackage.vgu;
import defpackage.vx6;
import defpackage.vyd;
import defpackage.w09;
import defpackage.w1a;
import defpackage.w2s;
import defpackage.w8s;
import defpackage.wb8;
import defpackage.wh9;
import defpackage.wvs;
import defpackage.wzg;
import defpackage.x19;
import defpackage.x2i;
import defpackage.xc9;
import defpackage.xk8;
import defpackage.xzi;
import defpackage.xzn;
import defpackage.y79;
import defpackage.yb8;
import defpackage.ygb;
import defpackage.yk8;
import defpackage.yo6;
import defpackage.yqf;
import defpackage.z0a;
import defpackage.zb;
import defpackage.znk;
import java.util.HashSet;
import java.util.concurrent.ExecutorService;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class Yatagan$DivKitComponent implements DivKitComponent {
    public volatile Object a = new UninitializedLock();
    public volatile Object b = new UninitializedLock();
    public volatile Object c = new UninitializedLock();
    public volatile Object d = new UninitializedLock();
    public volatile Object e = new UninitializedLock();
    public volatile Object f = new UninitializedLock();
    public volatile Object g = new UninitializedLock();
    public volatile Object h = new UninitializedLock();
    public final Context i;
    public final vx6 j;

    public static final class ComponentFactoryImpl implements DivKitComponent.Builder {
        public Context a;
        public vx6 b;

        @Override // com.yandex.div.core.dagger.DivKitComponent.Builder
        public final DivKitComponent.Builder a(Context context) {
            this.a = context;
            return this;
        }

        @Override // com.yandex.div.core.dagger.DivKitComponent.Builder
        public final DivKitComponent.Builder b(vx6 vx6Var) {
            this.b = vx6Var;
            return this;
        }

        @Override // com.yandex.div.core.dagger.DivKitComponent.Builder
        public final Yatagan$DivKitComponent build() {
            return new Yatagan$DivKitComponent(this.a, this.b);
        }
    }

    public static final class Div2ComponentImpl implements Div2Component {
        public final ContextThemeWrapper S;
        public final Integer T;
        public final su8 U;
        public final bz9 V;
        public final dt8 W;
        public final Yatagan$DivKitComponent X;
        public volatile Object a = new UninitializedLock();
        public volatile Object b = new UninitializedLock();
        public volatile Object c = new UninitializedLock();
        public volatile Object d = new UninitializedLock();
        public volatile Object e = new UninitializedLock();
        public volatile Object f = new UninitializedLock();
        public volatile Object g = new UninitializedLock();
        public volatile Object h = new UninitializedLock();
        public volatile Object i = new UninitializedLock();
        public volatile Object j = new UninitializedLock();
        public volatile Object k = new UninitializedLock();
        public volatile Object l = new UninitializedLock();
        public volatile Object m = new UninitializedLock();
        public volatile Object n = new UninitializedLock();
        public volatile Object o = new UninitializedLock();
        public volatile Object p = new UninitializedLock();
        public volatile Object q = new UninitializedLock();
        public volatile Object r = new UninitializedLock();
        public volatile Object s = new UninitializedLock();
        public volatile Object t = new UninitializedLock();
        public volatile Object u = new UninitializedLock();
        public volatile Object v = new UninitializedLock();
        public volatile Object w = new UninitializedLock();
        public volatile Object x = new UninitializedLock();
        public volatile Object y = new UninitializedLock();
        public volatile Object z = new UninitializedLock();
        public volatile Object A = new UninitializedLock();
        public volatile Object B = new UninitializedLock();
        public volatile Object C = new UninitializedLock();
        public volatile Object D = new UninitializedLock();
        public volatile Object E = new UninitializedLock();
        public volatile Object F = new UninitializedLock();
        public volatile Object G = new UninitializedLock();
        public volatile Object H = new UninitializedLock();
        public volatile Object I = new UninitializedLock();
        public volatile Object J = new UninitializedLock();
        public volatile Object K = new UninitializedLock();
        public volatile Object L = new UninitializedLock();
        public volatile Object M = new UninitializedLock();
        public volatile Object N = new UninitializedLock();
        public volatile Object O = new UninitializedLock();
        public volatile Object P = new UninitializedLock();
        public volatile Object Q = new UninitializedLock();
        public volatile Object R = new UninitializedLock();

        public static final class ComponentFactoryImpl implements Div2Component.Builder {
            public Yatagan$DivKitComponent a;
            public ContextThemeWrapper b;
            public dt8 c;
            public Integer d;
            public su8 e;
            public bz9 f;

            @Override // com.yandex.div.core.dagger.Div2Component.Builder
            public final Div2Component.Builder a(dt8 dt8Var) {
                this.c = dt8Var;
                return this;
            }

            @Override // com.yandex.div.core.dagger.Div2Component.Builder
            public final Div2Component.Builder b(bz9 bz9Var) {
                this.f = bz9Var;
                return this;
            }

            @Override // com.yandex.div.core.dagger.Div2Component.Builder
            public final Div2Component build() {
                return new Div2ComponentImpl(this.a, this.b, this.c, this.d, this.e, this.f);
            }

            @Override // com.yandex.div.core.dagger.Div2Component.Builder
            public final Div2Component.Builder c() {
                this.d = Integer.valueOf(R.style.Div_Theme);
                return this;
            }

            @Override // com.yandex.div.core.dagger.Div2Component.Builder
            public final Div2Component.Builder d(su8 su8Var) {
                this.e = su8Var;
                return this;
            }

            @Override // com.yandex.div.core.dagger.Div2Component.Builder
            public final Div2Component.Builder e(ContextThemeWrapper contextThemeWrapper) {
                this.b = contextThemeWrapper;
                return this;
            }
        }

        public static final class Div2ViewComponentImpl implements Div2ViewComponent {
            public volatile Object a = new UninitializedLock();
            public volatile Object b = new UninitializedLock();
            public volatile Object c = new UninitializedLock();
            public volatile Object d = new UninitializedLock();
            public volatile Object e = new UninitializedLock();
            public volatile Object f = new UninitializedLock();
            public volatile Object g = new UninitializedLock();
            public volatile Object h = new UninitializedLock();
            public volatile Object i = new UninitializedLock();
            public volatile Object j = new UninitializedLock();
            public volatile Object k = new UninitializedLock();
            public volatile Object l = new UninitializedLock();
            public volatile Object m = new UninitializedLock();
            public volatile Object n = new UninitializedLock();
            public volatile Object o = new UninitializedLock();
            public volatile Object p = new UninitializedLock();
            public final gc8 q;
            public final Div2ComponentImpl r;
            public final Yatagan$DivKitComponent s;

            public static final class ComponentFactoryImpl implements Div2ViewComponent.Builder {
                public Div2ComponentImpl a;
                public Yatagan$DivKitComponent b;
                public gc8 c;

                @Override // com.yandex.div.core.dagger.Div2ViewComponent.Builder
                public final Div2ViewComponent.Builder a(gc8 gc8Var) {
                    this.c = gc8Var;
                    return this;
                }

                @Override // com.yandex.div.core.dagger.Div2ViewComponent.Builder
                public final Div2ViewComponent build() {
                    return new Div2ViewComponentImpl(this.a, this.b, this.c);
                }
            }

            public static final class DoubleCheck implements yqf {
                public final Div2ViewComponentImpl a;
                public final int b;
                public volatile l79 c;

                public DoubleCheck(Div2ViewComponentImpl div2ViewComponentImpl, int i) {
                    this.a = div2ViewComponentImpl;
                    this.b = i;
                }

                @Override // defpackage.szm
                public final Object get() {
                    l79 l79Var;
                    l79 l79Var2;
                    l79 l79Var3 = this.c;
                    if (l79Var3 != null) {
                        return l79Var3;
                    }
                    synchronized (this) {
                        try {
                            l79Var = this.c;
                            if (l79Var == null) {
                                Div2ViewComponentImpl div2ViewComponentImpl = this.a;
                                int i = this.b;
                                Div2ComponentImpl div2ComponentImpl = div2ViewComponentImpl.r;
                                gc8 gc8Var = div2ViewComponentImpl.q;
                                if (i == 0) {
                                    l79Var2 = new l79(gc8Var, div2ComponentImpl.H(), 0);
                                } else {
                                    if (i != 1) {
                                        throw new AssertionError();
                                    }
                                    l79Var2 = new l79(gc8Var, div2ComponentImpl.H(), 1);
                                }
                                l79Var = l79Var2;
                                this.c = l79Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return l79Var;
                }
            }

            public static final class UninitializedLock {
            }

            public Div2ViewComponentImpl(Div2ComponentImpl div2ComponentImpl, Yatagan$DivKitComponent yatagan$DivKitComponent, gc8 gc8Var) {
                this.r = div2ComponentImpl;
                this.s = yatagan$DivKitComponent;
                this.q = gc8Var;
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public final ygb a() {
                Object obj;
                Object obj2 = this.h;
                if (obj2 instanceof UninitializedLock) {
                    synchronized (obj2) {
                        try {
                            obj = this.h;
                            if (obj instanceof UninitializedLock) {
                                efb b0 = this.r.b0();
                                gc8 gc8Var = this.q;
                                dt8 dt8Var = this.r.W;
                                boolean z = dt8Var.t;
                                dt8Var.getClass();
                                ygb ygbVar = new ygb(b0, gc8Var, z, false, v(), this.r.W.k);
                                this.h = ygbVar;
                                obj = ygbVar;
                            }
                        } finally {
                        }
                    }
                    obj2 = obj;
                }
                return (ygb) obj2;
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public final one b() {
                Object obj;
                Object obj2 = this.j;
                if (obj2 instanceof UninitializedLock) {
                    synchronized (obj2) {
                        try {
                            obj = this.j;
                            if (obj instanceof UninitializedLock) {
                                obj = new one(this.q);
                                this.j = obj;
                            }
                        } finally {
                        }
                    }
                    obj2 = obj;
                }
                return (one) obj2;
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public final wh9 c() {
                return this.r.R();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public final g23 d() {
                return t();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public final qu9 e() {
                return this.r.T();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public final y79 f() {
                Object obj;
                Object obj2 = this.m;
                if (obj2 instanceof UninitializedLock) {
                    synchronized (obj2) {
                        try {
                            obj = this.m;
                            if (obj instanceof UninitializedLock) {
                                obj = new y79(this.r.b0(), this.q);
                                this.m = obj;
                            }
                        } finally {
                        }
                    }
                    obj2 = obj;
                }
                return (y79) obj2;
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public final xzn g() {
                Object obj;
                Object obj2 = this.l;
                if (obj2 instanceof UninitializedLock) {
                    synchronized (obj2) {
                        try {
                            obj = this.l;
                            if (obj instanceof UninitializedLock) {
                                obj = new xzn(this.q, this.r.W.c);
                                this.l = obj;
                            }
                        } finally {
                        }
                    }
                    obj2 = obj;
                }
                return (xzn) obj2;
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public final l79 h() {
                Object obj;
                Object obj2 = this.f;
                if (obj2 instanceof UninitializedLock) {
                    synchronized (obj2) {
                        try {
                            obj = this.f;
                            if (obj instanceof UninitializedLock) {
                                obj = (l79) (this.r.W.A ? new DoubleCheck(this, 1).get() : new DoubleCheck(this, 0).get());
                                this.f = obj;
                            }
                        } finally {
                        }
                    }
                    obj2 = obj;
                }
                return (l79) obj2;
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public final efb i() {
                return this.r.b0();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public final doh j() {
                Object obj;
                Object obj2 = this.e;
                if (obj2 instanceof UninitializedLock) {
                    synchronized (obj2) {
                        try {
                            obj = this.e;
                            if (obj instanceof UninitializedLock) {
                                doh dohVar = new doh(this.r.K(), this.r.J(), this.r.W(), this.r.b0(), this.r.I());
                                this.e = dohVar;
                                obj = dohVar;
                            }
                        } finally {
                        }
                    }
                    obj2 = obj;
                }
                return (doh) obj2;
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public final hw9 k() {
                Object obj;
                Object obj2 = this.b;
                if (obj2 instanceof UninitializedLock) {
                    synchronized (obj2) {
                        try {
                            obj = this.b;
                            if (obj instanceof UninitializedLock) {
                                obj = new hw9(this.r.S, u());
                                this.b = obj;
                            }
                        } finally {
                        }
                    }
                    obj2 = obj;
                }
                return (hw9) obj2;
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public final z0a l() {
                return u();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public final en8 m() {
                Object obj;
                Object obj2 = this.k;
                if (obj2 instanceof UninitializedLock) {
                    synchronized (obj2) {
                        try {
                            obj = this.k;
                            if (obj instanceof UninitializedLock) {
                                obj = new en8(this.q);
                                this.k = obj;
                            }
                        } finally {
                        }
                    }
                    obj2 = obj;
                }
                return (en8) obj2;
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public final h23 n() {
                Object obj;
                Object obj2;
                Object obj3 = this.n;
                if (obj3 instanceof UninitializedLock) {
                    synchronized (obj3) {
                        try {
                            obj = this.n;
                            if (obj instanceof UninitializedLock) {
                                gc8 gc8Var = this.q;
                                g23 t = t();
                                Yatagan$DivKitComponent yatagan$DivKitComponent = this.s;
                                Object obj4 = yatagan$DivKitComponent.a;
                                if (obj4 instanceof UninitializedLock) {
                                    synchronized (obj4) {
                                        obj2 = yatagan$DivKitComponent.a;
                                        if (obj2 instanceof UninitializedLock) {
                                            v23 v23Var = new v23(new u23());
                                            yatagan$DivKitComponent.a = v23Var;
                                            obj2 = v23Var;
                                        }
                                    }
                                    obj4 = obj2;
                                }
                                obj = new h23(gc8Var, t, (v23) obj4);
                                this.n = obj;
                            }
                        } catch (Throwable th) {
                            throw th;
                        } finally {
                        }
                    }
                    obj3 = obj;
                }
                return (h23) obj3;
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public final ttn o() {
                Object obj;
                Object obj2 = this.c;
                if (obj2 instanceof UninitializedLock) {
                    synchronized (obj2) {
                        try {
                            obj = this.c;
                            if (obj instanceof UninitializedLock) {
                                gc8 gc8Var = this.q;
                                Div2ComponentImpl div2ComponentImpl = this.r;
                                obj = new ttn(gc8Var, div2ComponentImpl.W.g, div2ComponentImpl.I());
                                this.c = obj;
                            }
                        } finally {
                        }
                    }
                    obj2 = obj;
                }
                return (ttn) obj2;
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public final fdu p() {
                return v();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public final dph q() {
                Object obj;
                Object obj2 = this.d;
                if (obj2 instanceof UninitializedLock) {
                    synchronized (obj2) {
                        try {
                            obj = this.d;
                            if (obj instanceof UninitializedLock) {
                                obj = new dph(t(), this.r.I());
                                this.d = obj;
                            }
                        } finally {
                        }
                    }
                    obj2 = obj;
                }
                return (dph) obj2;
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public final sj3 r() {
                Object obj;
                Object obj2 = this.p;
                if (obj2 instanceof UninitializedLock) {
                    synchronized (obj2) {
                        try {
                            obj = this.p;
                            if (obj instanceof UninitializedLock) {
                                obj = new sj3(this.q);
                                this.p = obj;
                            }
                        } finally {
                        }
                    }
                    obj2 = obj;
                }
                return (sj3) obj2;
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public final um9 s() {
                Object obj;
                Object obj2 = this.g;
                if (obj2 instanceof UninitializedLock) {
                    synchronized (obj2) {
                        try {
                            obj = this.g;
                            if (obj instanceof UninitializedLock) {
                                obj = new um9(this.q);
                                this.g = obj;
                            }
                        } finally {
                        }
                    }
                    obj2 = obj;
                }
                return (um9) obj2;
            }

            public final g23 t() {
                Object obj;
                Object obj2 = this.o;
                if (obj2 instanceof UninitializedLock) {
                    synchronized (obj2) {
                        try {
                            obj = this.o;
                            if (obj instanceof UninitializedLock) {
                                obj = new g23();
                                this.o = obj;
                            }
                        } finally {
                        }
                    }
                    obj2 = obj;
                }
                return (g23) obj2;
            }

            public final z0a u() {
                Object obj;
                Object obj2 = this.a;
                if (obj2 instanceof UninitializedLock) {
                    synchronized (obj2) {
                        try {
                            obj = this.a;
                            if (obj instanceof UninitializedLock) {
                                obj = new z0a();
                                this.a = obj;
                            }
                        } finally {
                        }
                    }
                    obj2 = obj;
                }
                return (z0a) obj2;
            }

            public final fdu v() {
                Object obj;
                Object obj2 = this.i;
                if (obj2 instanceof UninitializedLock) {
                    synchronized (obj2) {
                        try {
                            obj = this.i;
                            if (obj instanceof UninitializedLock) {
                                obj = new fdu();
                                this.i = obj;
                            }
                        } finally {
                        }
                    }
                    obj2 = obj;
                }
                return (fdu) obj2;
            }
        }

        public static final class ProviderImpl implements yqf {
            public final Div2ComponentImpl a;
            public final int b;

            public ProviderImpl(Div2ComponentImpl div2ComponentImpl, int i) {
                this.a = div2ComponentImpl;
                this.b = i;
            }

            @Override // defpackage.szm
            public final Object get() {
                Div2ComponentImpl div2ComponentImpl = this.a;
                int i = this.b;
                if (i == 0) {
                    return div2ComponentImpl.H();
                }
                if (i == 1) {
                    return div2ComponentImpl.D();
                }
                if (i == 2) {
                    return div2ComponentImpl.Y();
                }
                wvs.b();
                return null;
            }
        }

        public static final class UninitializedLock {
        }

        public Div2ComponentImpl(Yatagan$DivKitComponent yatagan$DivKitComponent, ContextThemeWrapper contextThemeWrapper, dt8 dt8Var, Integer num, su8 su8Var, bz9 bz9Var) {
            this.X = yatagan$DivKitComponent;
            this.S = contextThemeWrapper;
            this.W = dt8Var;
            this.T = num;
            this.U = su8Var;
            this.V = bz9Var;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final w1a A() {
            return a0();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final qu9 B() {
            return T();
        }

        public final zb C() {
            Object obj;
            Object obj2 = this.F;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.F;
                        if (obj instanceof UninitializedLock) {
                            obj = new zb(this.W.v);
                            this.F = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (zb) obj2;
        }

        public final tb8 D() {
            Object obj;
            Object obj2 = this.i;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.i;
                        if (obj instanceof UninitializedLock) {
                            obj = new tb8(Y(), H(), R());
                            this.i = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (tb8) obj2;
        }

        public final ce8 E() {
            Object obj;
            Object obj2 = this.O;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.O;
                        if (obj instanceof UninitializedLock) {
                            obj = new ce8(new ProviderImpl(this.X, 3), this.W.o, this.W.p, this.W.q);
                            this.O = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (ce8) obj2;
        }

        public final qg8 F() {
            Object obj;
            Object obj2 = this.p;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.p;
                        if (obj instanceof UninitializedLock) {
                            dt8 dt8Var = this.W;
                            obj = new qg8(dt8Var.b, dt8Var.c, E());
                            this.p = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (qg8) obj2;
        }

        public final gp8 G() {
            Object obj;
            Object obj2 = this.G;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.G;
                        if (obj instanceof UninitializedLock) {
                            gp8 gp8Var = new gp8(new xzi(L()), T(), new znk(28, F()), new bz2(this.W.v, C(), 10), new ozw(29, b0()));
                            this.G = gp8Var;
                            obj = gp8Var;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (gp8) obj2;
        }

        public final hp8 H() {
            Object obj;
            Object obj2 = this.h;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.h;
                        if (obj instanceof UninitializedLock) {
                            py9 V = V();
                            gp8 G = G();
                            ly9 U = U();
                            ly9 U2 = U();
                            a39 L = L();
                            lum lumVar = new lum();
                            lumVar.a = U2;
                            lumVar.b = L;
                            lumVar.c = new Paint();
                            er9 er9Var = new er9(G, U, lumVar, this.W.u);
                            rt8 rt8Var = new rt8(G(), new ProviderImpl(this, 2), O(), new ProviderImpl(this, 0), b0());
                            si9 si9Var = new si9(G());
                            v29 K = K();
                            o19 J = J();
                            x19 x19Var = new x19(G(), O(), new ProviderImpl(this, 0), new ProviderImpl(this, 2), 0);
                            gp8 G2 = G();
                            p0a Y = Y();
                            ProviderImpl providerImpl = new ProviderImpl(this, 0);
                            xc9 N = N();
                            this.W.getClass();
                            w09 w09Var = new w09(G2, Y, providerImpl, N, 0.0f);
                            kb9 kb9Var = new kb9(G(), Y(), new ProviderImpl(this, 0), N(), F(), d0(), C());
                            cp9 cp9Var = new cp9(G(), Y(), new ProviderImpl(this, 0), k0(), new c5p(6, this.W.k), F(), this.W.c, L(), a0(), N(), c0(), R(), g0());
                            gm9 gm9Var = new gm9(G(), Y(), new ProviderImpl(this, 0), S(), F(), O(), N(), a0(), b0(), j0(), R());
                            av8 av8Var = new av8(G(), this.W.g, I(), new ProviderImpl(this, 0));
                            m39 m39Var = new m39(G(), d0(), 0);
                            gp8 G3 = G();
                            yb8 yb8Var = this.W.c;
                            ly9 U3 = U();
                            pct i0 = i0();
                            efb b0 = b0();
                            this.W.getClass();
                            hp8 hp8Var = new hp8(V, er9Var, rt8Var, si9Var, K, J, x19Var, w09Var, kb9Var, cp9Var, gm9Var, av8Var, m39Var, new jl9(G3, yb8Var, U3, i0, b0, 0.0f, this.W.t), new rt8(G(), U(), j0(), F(), C(), b0()), new x19(G(), U(), j0(), b0(), 1), W(), I(), d0(), new m39(G(), new nct(b0()), 1));
                            this.h = hp8Var;
                            obj = hp8Var;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (hp8) obj2;
        }

        public final tx8 I() {
            Object obj;
            Object obj2 = this.d;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.d;
                        if (obj instanceof UninitializedLock) {
                            obj = new tx8(this.W.j);
                            this.d = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (tx8) obj2;
        }

        public final o19 J() {
            Object obj;
            Object obj2 = this.f;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.f;
                        if (obj instanceof UninitializedLock) {
                            obj = new o19(G(), L(), P(), b0());
                            this.f = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (o19) obj2;
        }

        public final v29 K() {
            Object obj;
            Object obj2 = this.e;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.e;
                        if (obj instanceof UninitializedLock) {
                            obj = new v29(G(), L(), P(), b0());
                            this.e = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (v29) obj2;
        }

        public final a39 L() {
            Object obj;
            Object obj2 = this.H;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.H;
                        if (obj instanceof UninitializedLock) {
                            d39 d39Var = new d39(this.W.a, this.S);
                            this.H = d39Var;
                            obj = d39Var;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (a39) obj2;
        }

        public final f39 M() {
            Object obj;
            Object obj2 = this.k;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.k;
                        if (obj instanceof UninitializedLock) {
                            obj = new f39(L());
                            this.k = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (f39) obj2;
        }

        public final xc9 N() {
            Object obj;
            Object obj2 = this.P;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.P;
                        if (obj instanceof UninitializedLock) {
                            obj = new xc9();
                            this.P = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (xc9) obj2;
        }

        public final dd9 O() {
            Object obj;
            Object obj2 = this.x;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.x;
                        if (obj instanceof UninitializedLock) {
                            obj = new dd9(N(), new ProviderImpl(this, 1));
                            this.x = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (dd9) obj2;
        }

        public final qe9 P() {
            Object obj;
            Object obj2 = this.I;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.I;
                        if (obj instanceof UninitializedLock) {
                            obj = new qe9(this.W.e, (ExecutorService) this.X.j.b);
                            this.I = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (qe9) obj2;
        }

        public final mf9 Q() {
            Object obj;
            Object obj2 = this.l;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.l;
                        if (obj instanceof UninitializedLock) {
                            f39 M = M();
                            dt8 dt8Var = this.W;
                            mf9 mf9Var = new mf9(M, dt8Var.g, I(), dt8Var.i);
                            this.l = mf9Var;
                            obj = mf9Var;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (mf9) obj2;
        }

        public final wh9 R() {
            Object obj;
            Object obj2 = this.c;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.c;
                        if (obj instanceof UninitializedLock) {
                            obj = new wh9(S(), g0());
                            this.c = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (wh9) obj2;
        }

        public final nm9 S() {
            Object obj;
            Object obj2 = this.w;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.w;
                        if (obj instanceof UninitializedLock) {
                            obj = new nm9(this.W.d, h0());
                            this.w = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (nm9) obj2;
        }

        public final qu9 T() {
            Object obj;
            Object obj2 = this.b;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.b;
                        if (obj instanceof UninitializedLock) {
                            this.W.getClass();
                            qu9 qu9Var = new qu9(a0(), Q(), new pv9(0, new ProviderImpl(this, 1)), C(), b0());
                            this.b = qu9Var;
                            obj = qu9Var;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (qu9) obj2;
        }

        public final ly9 U() {
            Object obj;
            Object obj2 = this.Q;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.Q;
                        if (obj instanceof UninitializedLock) {
                            dt8 dt8Var = this.W;
                            obj = new ly9(dt8Var.l, dt8Var.k);
                            this.Q = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (ly9) obj2;
        }

        public final py9 V() {
            Object obj;
            Object obj2 = this.K;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.K;
                        if (obj instanceof UninitializedLock) {
                            obj = new py9();
                            this.K = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (py9) obj2;
        }

        public final tz9 W() {
            Object obj;
            Object obj2 = this.g;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.g;
                        if (obj instanceof UninitializedLock) {
                            tz9 tz9Var = new tz9(G(), i0(), F(), X(), (ExecutorService) this.X.j.b, this.W.h);
                            this.g = tz9Var;
                            obj = tz9Var;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (tz9) obj2;
        }

        public final m0a X() {
            Object obj;
            Object obj2 = this.v;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.v;
                        if (obj instanceof UninitializedLock) {
                            obj = new m0a();
                            this.v = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (m0a) obj2;
        }

        public final p0a Y() {
            Object obj;
            Object obj2 = this.j;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.j;
                        if (obj instanceof UninitializedLock) {
                            p0a p0aVar = new p0a(c0(), k0(), V(), this.W.m, l0());
                            this.j = p0aVar;
                            obj = p0aVar;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (p0a) obj2;
        }

        public final m1a Z() {
            Object obj;
            Object obj2 = this.n;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.n;
                        if (obj instanceof UninitializedLock) {
                            dt8 dt8Var = this.W;
                            obj = new m1a(dt8Var.c, dt8Var.f, dt8Var.b, E());
                            this.n = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (m1a) obj2;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final boolean a() {
            this.W.getClass();
            return false;
        }

        public final w1a a0() {
            Object obj;
            Object obj2 = this.m;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.m;
                        if (obj instanceof UninitializedLock) {
                            obj = new w1a(new gao(15), Z());
                            this.m = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (w1a) obj2;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final sjo b() {
            return e0();
        }

        public final efb b0() {
            Object obj;
            Object obj2 = this.a;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.a;
                        if (obj instanceof UninitializedLock) {
                            this.W.getClass();
                            obj = new efb();
                            this.a = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (efb) obj2;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final qz9 c() {
            Object obj;
            Object obj2 = this.u;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.u;
                        if (obj instanceof UninitializedLock) {
                            obj = new qz9(X());
                            this.u = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (qz9) obj2;
        }

        public final Context c0() {
            Object obj;
            Object obj2 = this.M;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.M;
                        if (obj instanceof UninitializedLock) {
                            ContextThemeWrapper contextThemeWrapper = this.S;
                            int intValue = this.T.intValue();
                            obj = this.W.z ? new vf6(contextThemeWrapper, intValue) : new ContextThemeWrapper(contextThemeWrapper, intValue);
                            this.M = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (Context) obj2;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final su8 d() {
            return this.U;
        }

        public final l2k d0() {
            Object obj;
            Object obj2 = this.L;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.L;
                        if (obj instanceof UninitializedLock) {
                            obj = new l2k();
                            this.L = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (l2k) obj2;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final tb8 e() {
            return D();
        }

        public final sjo e0() {
            Object obj;
            Object obj2 = this.s;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.s;
                        if (obj instanceof UninitializedLock) {
                            obj = new sjo(new vx6(18, this.V, F(), f0()), b0());
                            this.s = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (sjo) obj2;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final boolean f() {
            return this.W.C;
        }

        public final pir f0() {
            Object obj;
            Object obj2 = this.C;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.C;
                        if (obj instanceof UninitializedLock) {
                            obj = new pir(new ProviderImpl(this.X, 2));
                            this.C = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (pir) obj2;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final cu9 g() {
            Object obj;
            Object obj2 = this.t;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.t;
                        if (obj instanceof UninitializedLock) {
                            obj = new cu9(F(), b0());
                            this.t = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (cu9) obj2;
        }

        public final w2s g0() {
            Object obj;
            Object obj2 = this.r;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.r;
                        if (obj instanceof UninitializedLock) {
                            obj = new w2s();
                            this.r = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (w2s) obj2;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final bz9 h() {
            return this.V;
        }

        public final w8s h0() {
            Object obj;
            Object obj2 = this.q;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.q;
                        if (obj instanceof UninitializedLock) {
                            obj = new w8s();
                            this.q = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (w8s) obj2;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final yb8 i() {
            return this.W.c;
        }

        public final pct i0() {
            Object obj;
            Object obj2 = this.J;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.J;
                        if (obj instanceof UninitializedLock) {
                            obj = new pct(b0());
                            this.J = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (pct) obj2;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final wb8 j() {
            this.W.getClass();
            return wb8.b;
        }

        public final qct j0() {
            Object obj;
            Object obj2 = this.R;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.R;
                        if (obj instanceof UninitializedLock) {
                            obj = new qct(b0());
                            this.R = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (qct) obj2;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final bv8 k() {
            return new bv8();
        }

        public final ogu k0() {
            Object obj;
            Object obj2;
            Object obj3 = this.N;
            if (obj3 instanceof UninitializedLock) {
                synchronized (obj3) {
                    try {
                        obj = this.N;
                        if (obj instanceof UninitializedLock) {
                            boolean z = this.W.w;
                            boolean z2 = this.W.x;
                            this.W.getClass();
                            xzi xziVar = z2 ? new xzi(new lwj(new pgu())) : new xzi(lwj.b);
                            Object obj4 = this.y;
                            if (obj4 instanceof UninitializedLock) {
                                synchronized (obj4) {
                                    obj2 = this.y;
                                    if (obj2 instanceof UninitializedLock) {
                                        boolean z3 = this.W.y;
                                        obj2 = new lkk();
                                        this.y = obj2;
                                    }
                                }
                                obj4 = obj2;
                            }
                            obj = z ? new rn((pgu) ((lwj) xziVar.a).a, (lkk) obj4, this.X.d()) : new e0n();
                            this.N = obj;
                        }
                    } catch (Throwable th) {
                        throw th;
                    } finally {
                    }
                }
                obj3 = obj;
            }
            return (ogu) obj3;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final stn l() {
            Object obj;
            Object obj2 = this.B;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.B;
                        if (obj instanceof UninitializedLock) {
                            obj = new stn(e0());
                            this.B = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (stn) obj2;
        }

        public final vgu l0() {
            Object obj;
            Object obj2 = this.z;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.z;
                        if (obj instanceof UninitializedLock) {
                            obj = new vgu(this.X.i, this.W.m);
                            this.z = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (vgu) obj2;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final pir m() {
            return f0();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final nm9 n() {
            return S();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final rwd o() {
            this.W.getClass();
            return rwd.c;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final vyd p() {
            Object obj;
            Object obj2 = this.A;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.A;
                        if (obj instanceof UninitializedLock) {
                            this.X.j.getClass();
                            es6 es6Var = qyd.h0;
                            obj = new vyd();
                            this.A = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (vyd) obj2;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final wzg q() {
            Object obj;
            Object obj2 = this.D;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.D;
                        if (obj instanceof UninitializedLock) {
                            ContextThemeWrapper contextThemeWrapper = this.S;
                            this.W.getClass();
                            wzg wzgVar = new wzg(contextThemeWrapper);
                            this.D = wzgVar;
                            obj = wzgVar;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (wzg) obj2;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final w8s r() {
            return h0();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final yk8 s() {
            Object obj;
            Yatagan$DivKitComponent yatagan$DivKitComponent = this.X;
            Object obj2 = yatagan$DivKitComponent.b;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = yatagan$DivKitComponent.b;
                        if (obj instanceof UninitializedLock) {
                            obj = new yk8(yatagan$DivKitComponent.e());
                            yatagan$DivKitComponent.b = obj;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (yk8) obj2;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final pe8 t() {
            Object obj;
            Object obj2 = this.o;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.o;
                        if (obj instanceof UninitializedLock) {
                            qg8 F = F();
                            yb8 yb8Var = this.W.c;
                            ce8 E = E();
                            dt8 dt8Var = this.W;
                            pe8 pe8Var = new pe8(F, yb8Var, E, dt8Var.r, dt8Var.s);
                            this.o = pe8Var;
                            obj = pe8Var;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (pe8) obj2;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final boolean u() {
            return this.W.B;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final hp8 v() {
            return H();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final r0a w() {
            Object obj;
            Object obj2 = this.E;
            if (obj2 instanceof UninitializedLock) {
                synchronized (obj2) {
                    try {
                        obj = this.E;
                        if (obj instanceof UninitializedLock) {
                            f39 M = M();
                            dt8 dt8Var = this.W;
                            r0a r0aVar = new r0a(M, dt8Var.g, I(), dt8Var.i);
                            this.E = r0aVar;
                            obj = r0aVar;
                        }
                    } finally {
                    }
                }
                obj2 = obj;
            }
            return (r0a) obj2;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final qg8 x() {
            return F();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final Div2ViewComponent.Builder y() {
            Div2ViewComponentImpl.ComponentFactoryImpl componentFactoryImpl = new Div2ViewComponentImpl.ComponentFactoryImpl();
            componentFactoryImpl.a = this;
            componentFactoryImpl.b = this.X;
            return componentFactoryImpl;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final eg8 z() {
            return this.W.b;
        }
    }

    public static final class ProviderImpl implements yqf {
        public final Yatagan$DivKitComponent a;
        public final int b;

        public ProviderImpl(Yatagan$DivKitComponent yatagan$DivKitComponent, int i) {
            this.a = yatagan$DivKitComponent;
            this.b = i;
        }

        @Override // defpackage.szm
        public final Object get() {
            Object obj;
            Object obj2;
            Object obj3;
            Yatagan$DivKitComponent yatagan$DivKitComponent = this.a;
            int i = this.b;
            if (i == 1) {
                yatagan$DivKitComponent.j.getClass();
                es6 es6Var = qyd.h0;
                return x2i.f;
            }
            if (i == 2) {
                return yatagan$DivKitComponent.c();
            }
            if (i == 3) {
                Object obj4 = yatagan$DivKitComponent.e;
                if (obj4 != null) {
                    synchronized (obj4) {
                        try {
                            obj = yatagan$DivKitComponent.e;
                            if (obj != null) {
                                yatagan$DivKitComponent.j.getClass();
                                yatagan$DivKitComponent.e = null;
                                obj = null;
                            }
                        } finally {
                        }
                    }
                    obj4 = obj;
                }
                if (obj4 == null) {
                    return null;
                }
                l1j.f();
                return null;
            }
            if (i == 4) {
                Object obj5 = yatagan$DivKitComponent.f;
                if (obj5 instanceof UninitializedLock) {
                    synchronized (obj5) {
                        try {
                            obj2 = yatagan$DivKitComponent.f;
                            if (obj2 instanceof UninitializedLock) {
                                Object obj6 = yatagan$DivKitComponent.j.c;
                                uyd uydVar = new uyd();
                                yatagan$DivKitComponent.f = uydVar;
                                obj2 = uydVar;
                            }
                        } finally {
                        }
                    }
                    obj5 = obj2;
                }
                return (uyd) obj5;
            }
            if (i != 5) {
                yatagan$DivKitComponent.getClass();
                wvs.b();
                return null;
            }
            Object obj7 = yatagan$DivKitComponent.h;
            if (obj7 instanceof UninitializedLock) {
                synchronized (obj7) {
                    try {
                        obj3 = yatagan$DivKitComponent.h;
                        if (obj3 instanceof UninitializedLock) {
                            obj3 = new myd();
                            btf.b(grb.z);
                            yatagan$DivKitComponent.h = obj3;
                        }
                    } finally {
                    }
                }
                obj7 = obj3;
            }
            return (myd) obj7;
        }
    }

    public static final class UninitializedLock {
    }

    public Yatagan$DivKitComponent(Context context, vx6 vx6Var) {
        this.i = context;
        this.j = vx6Var;
    }

    public static DivKitComponent.Builder builder() {
        return new ComponentFactoryImpl();
    }

    @Override // com.yandex.div.core.dagger.DivKitComponent
    public final qyd a() {
        Object obj = this.j.c;
        return qyd.h0;
    }

    @Override // com.yandex.div.core.dagger.DivKitComponent
    public final Div2Component.Builder b() {
        Div2ComponentImpl.ComponentFactoryImpl componentFactoryImpl = new Div2ComponentImpl.ComponentFactoryImpl();
        componentFactoryImpl.a = this;
        return componentFactoryImpl;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005a, code lost:
    
        throw r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ewe c() {
        Object obj;
        Object obj2;
        Object obj3 = this.c;
        if (obj3 instanceof UninitializedLock) {
            synchronized (obj3) {
                try {
                    obj = this.c;
                    if (obj instanceof UninitializedLock) {
                        this.j.getClass();
                        xzi xziVar = new xzi(lwj.b);
                        Context context = this.i;
                        this.j.getClass();
                        es6 es6Var = qyd.h0;
                        Object obj4 = this.g;
                        if (obj4 instanceof UninitializedLock) {
                            synchronized (obj4) {
                                obj2 = this.g;
                                if (obj2 instanceof UninitializedLock) {
                                    this.j.getClass();
                                    tc9.a.getClass();
                                    obj2 = (tc9) sc9.b.getValue();
                                    this.g = obj2;
                                }
                            }
                            obj4 = obj2;
                        }
                        obj = ox6.J(xziVar, context, (tc9) obj4);
                        this.c = obj;
                    }
                } finally {
                }
            }
            obj3 = obj;
        }
        return (ewe) obj3;
    }

    public final feu d() {
        Object obj;
        Object obj2 = this.d;
        if (obj2 instanceof UninitializedLock) {
            synchronized (obj2) {
                try {
                    obj = this.d;
                    if (obj instanceof UninitializedLock) {
                        Object obj3 = this.j.c;
                        feu feuVar = new feu((yo6) ((v8a) qyd.h0.b).b.getValue());
                        this.d = feuVar;
                        obj = feuVar;
                    }
                } finally {
                }
            }
            obj2 = obj;
        }
        return (feu) obj2;
    }

    public final HashSet e() {
        HashSet hashSet = new HashSet(17);
        hashSet.add(new xk8(16));
        hashSet.add(new xk8(0));
        hashSet.add(new xk8(1));
        hashSet.add(new xk8(2));
        hashSet.add(new xk8(3));
        hashSet.add(new xk8(4));
        hashSet.add(new xk8(5));
        hashSet.add(new xk8(6));
        hashSet.add(new xk8(8));
        hashSet.add(new xk8(10));
        hashSet.add(new xk8(9));
        hashSet.add(new xk8(11));
        Object obj = this.j.d;
        hashSet.add(new xk8(ehv.b));
        hashSet.add(new xk8(13));
        hashSet.add(new xk8(15));
        hashSet.add(new xk8(14));
        hashSet.add(new xk8(7));
        return hashSet;
    }
}
