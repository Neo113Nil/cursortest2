package com.yandex.passport.internal.ui.challenge.delete;

import com.yandex.passport.R;
import defpackage.ai6;
import defpackage.aqi;
import defpackage.bfu;
import defpackage.ern;
import defpackage.gld;
import defpackage.gq5;
import defpackage.gs6;
import defpackage.hq5;
import defpackage.kfu;
import defpackage.kjn;
import defpackage.l1p;
import defpackage.ngg;
import defpackage.oq5;
import defpackage.pl3;
import defpackage.rpg;
import defpackage.rvf;
import defpackage.s7h;
import defpackage.ss3;
import defpackage.ssd;
import defpackage.szf;
import defpackage.vh;
import defpackage.vq1;
import defpackage.xmn;
import defpackage.xq0;
import defpackage.xr7;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public abstract class g {
    public static final void a(final b bVar, final Function1 function1, hq5 hq5Var, final int i) {
        oq5 oq5Var;
        function1.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1750593111);
        final int i2 = 4;
        int i3 = (oq5Var2.f(bVar) ? 4 : 2) | i | (oq5Var2.h(function1) ? 32 : 16);
        if ((i3 & 19) == 18 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            y viewModelFactory = bVar.getViewModelFactory();
            oq5Var2.a0(1729797275);
            kfu a = rpg.a(oq5Var2);
            if (a == null) {
                xq0.q("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            bfu R = ngg.R(ern.a(j0.class), a, null, viewModelFactory, a instanceof ssd ? ((ssd) a).getDefaultViewModelCreationExtras() : gs6.b, oq5Var2);
            final int i4 = 0;
            oq5Var2.p(false);
            final j0 j0Var = (j0) R;
            aqi Q = szf.Q(j0Var.l, oq5Var2);
            vh vhVar = new vh(16);
            boolean h = oq5Var2.h(j0Var);
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            Object obj = K;
            if (h || K == kjnVar) {
                Function1 function12 = new Function1() { // from class: com.yandex.passport.internal.ui.challenge.delete.e
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        switch (i4) {
                            case 0:
                                xr7 xr7Var = j0Var.k;
                                com.yandex.passport.api.v vVar = (com.yandex.passport.api.v) obj2;
                                vVar.getClass();
                                if (vVar instanceof com.yandex.passport.api.t) {
                                    xr7Var.a(c0.a);
                                } else if (vVar instanceof com.yandex.passport.api.p) {
                                    xr7Var.a(a0.a);
                                } else if (vVar instanceof com.yandex.passport.api.r) {
                                    xr7Var.a(new e0(((com.yandex.passport.api.r) vVar).a));
                                } else if (vVar instanceof com.yandex.passport.api.s) {
                                    xr7Var.a(b0.a);
                                } else {
                                    xr7Var.a(new e0(new IllegalStateException("Unsupported bouncer answer: " + vVar)));
                                }
                                break;
                            case 1:
                                com.yandex.passport.sloth.b1 b1Var = (com.yandex.passport.sloth.b1) obj2;
                                b1Var.getClass();
                                j0Var.k.a(new g0(b1Var));
                                break;
                            case 2:
                                com.yandex.passport.sloth.h0 h0Var = (com.yandex.passport.sloth.h0) obj2;
                                h0Var.getClass();
                                j0Var.k.a(new f0(h0Var));
                                break;
                            case 3:
                                com.yandex.passport.sloth.ui.e1 e1Var = (com.yandex.passport.sloth.ui.e1) obj2;
                                e1Var.getClass();
                                j0Var.k.a(new h0(e1Var));
                                break;
                            default:
                                i0 i0Var = (i0) obj2;
                                i0Var.getClass();
                                j0Var.k.a(i0Var);
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var2.k0(function12);
                obj = function12;
            }
            s7h d0 = vq1.d0(vhVar, (Function1) obj, oq5Var2);
            ss3 ss3Var = j0Var.m;
            boolean h2 = oq5Var2.h(d0) | ((i3 & 14) == 4);
            Object K2 = oq5Var2.K();
            boolean z = false;
            boolean z2 = false;
            Object obj2 = K2;
            if (h2 || K2 == kjnVar) {
                l1p l1pVar = new l1p((Object) d0, (Object) bVar, (Continuation) (z ? 1 : 0), 15);
                oq5Var2.k0(l1pVar);
                obj2 = l1pVar;
            }
            com.yandex.plus.pay.ui.core.b.b(ss3Var, (Function2) obj2, oq5Var2, 0);
            v1 v1Var = ((z) Q.getValue()).b;
            if (v1Var == null) {
                oq5Var2.Z(1870060085);
            } else {
                oq5Var2.Z(1870060086);
                v1 v1Var2 = ((z) Q.getValue()).b;
                boolean h3 = ((i3 & 112) == 32) | oq5Var2.h(v1Var);
                Object K3 = oq5Var2.K();
                Object obj3 = K3;
                if (h3 || K3 == kjnVar) {
                    com.yandex.passport.internal.storage.a aVar = new com.yandex.passport.internal.storage.a(function1, v1Var, z2 ? 1 : 0, 7);
                    oq5Var2.k0(aVar);
                    obj3 = aVar;
                }
                gld.w(oq5Var2, v1Var2, (Function2) obj3);
            }
            oq5Var2.p(false);
            w wVar = ((z) Q.getValue()).a;
            v vVar = wVar instanceof v ? (v) wVar : null;
            if (vVar != null) {
                oq5Var2.Z(1870239948);
                com.yandex.passport.sloth.data.m mVar = vVar.a;
                com.yandex.passport.internal.ui.sloth.screen.e slothScreenComponentBuilder = bVar.getSlothScreenComponentBuilder();
                boolean h4 = oq5Var2.h(j0Var);
                Object K4 = oq5Var2.K();
                Object obj4 = K4;
                if (h4 || K4 == kjnVar) {
                    final int i5 = 1;
                    Function1 function13 = new Function1() { // from class: com.yandex.passport.internal.ui.challenge.delete.e
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj22) {
                            switch (i5) {
                                case 0:
                                    xr7 xr7Var = j0Var.k;
                                    com.yandex.passport.api.v vVar2 = (com.yandex.passport.api.v) obj22;
                                    vVar2.getClass();
                                    if (vVar2 instanceof com.yandex.passport.api.t) {
                                        xr7Var.a(c0.a);
                                    } else if (vVar2 instanceof com.yandex.passport.api.p) {
                                        xr7Var.a(a0.a);
                                    } else if (vVar2 instanceof com.yandex.passport.api.r) {
                                        xr7Var.a(new e0(((com.yandex.passport.api.r) vVar2).a));
                                    } else if (vVar2 instanceof com.yandex.passport.api.s) {
                                        xr7Var.a(b0.a);
                                    } else {
                                        xr7Var.a(new e0(new IllegalStateException("Unsupported bouncer answer: " + vVar2)));
                                    }
                                    break;
                                case 1:
                                    com.yandex.passport.sloth.b1 b1Var = (com.yandex.passport.sloth.b1) obj22;
                                    b1Var.getClass();
                                    j0Var.k.a(new g0(b1Var));
                                    break;
                                case 2:
                                    com.yandex.passport.sloth.h0 h0Var = (com.yandex.passport.sloth.h0) obj22;
                                    h0Var.getClass();
                                    j0Var.k.a(new f0(h0Var));
                                    break;
                                case 3:
                                    com.yandex.passport.sloth.ui.e1 e1Var = (com.yandex.passport.sloth.ui.e1) obj22;
                                    e1Var.getClass();
                                    j0Var.k.a(new h0(e1Var));
                                    break;
                                default:
                                    i0 i0Var = (i0) obj22;
                                    i0Var.getClass();
                                    j0Var.k.a(i0Var);
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    oq5Var2.k0(function13);
                    obj4 = function13;
                }
                Function1 function14 = (Function1) obj4;
                boolean h5 = oq5Var2.h(j0Var);
                Object K5 = oq5Var2.K();
                Object obj5 = K5;
                if (h5 || K5 == kjnVar) {
                    final int i6 = 2;
                    Function1 function15 = new Function1() { // from class: com.yandex.passport.internal.ui.challenge.delete.e
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj22) {
                            switch (i6) {
                                case 0:
                                    xr7 xr7Var = j0Var.k;
                                    com.yandex.passport.api.v vVar2 = (com.yandex.passport.api.v) obj22;
                                    vVar2.getClass();
                                    if (vVar2 instanceof com.yandex.passport.api.t) {
                                        xr7Var.a(c0.a);
                                    } else if (vVar2 instanceof com.yandex.passport.api.p) {
                                        xr7Var.a(a0.a);
                                    } else if (vVar2 instanceof com.yandex.passport.api.r) {
                                        xr7Var.a(new e0(((com.yandex.passport.api.r) vVar2).a));
                                    } else if (vVar2 instanceof com.yandex.passport.api.s) {
                                        xr7Var.a(b0.a);
                                    } else {
                                        xr7Var.a(new e0(new IllegalStateException("Unsupported bouncer answer: " + vVar2)));
                                    }
                                    break;
                                case 1:
                                    com.yandex.passport.sloth.b1 b1Var = (com.yandex.passport.sloth.b1) obj22;
                                    b1Var.getClass();
                                    j0Var.k.a(new g0(b1Var));
                                    break;
                                case 2:
                                    com.yandex.passport.sloth.h0 h0Var = (com.yandex.passport.sloth.h0) obj22;
                                    h0Var.getClass();
                                    j0Var.k.a(new f0(h0Var));
                                    break;
                                case 3:
                                    com.yandex.passport.sloth.ui.e1 e1Var = (com.yandex.passport.sloth.ui.e1) obj22;
                                    e1Var.getClass();
                                    j0Var.k.a(new h0(e1Var));
                                    break;
                                default:
                                    i0 i0Var = (i0) obj22;
                                    i0Var.getClass();
                                    j0Var.k.a(i0Var);
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    oq5Var2.k0(function15);
                    obj5 = function15;
                }
                Function1 function16 = (Function1) obj5;
                boolean h6 = oq5Var2.h(j0Var);
                Object K6 = oq5Var2.K();
                Object obj6 = K6;
                if (h6 || K6 == kjnVar) {
                    final int i7 = 3;
                    Function1 function17 = new Function1() { // from class: com.yandex.passport.internal.ui.challenge.delete.e
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj22) {
                            switch (i7) {
                                case 0:
                                    xr7 xr7Var = j0Var.k;
                                    com.yandex.passport.api.v vVar2 = (com.yandex.passport.api.v) obj22;
                                    vVar2.getClass();
                                    if (vVar2 instanceof com.yandex.passport.api.t) {
                                        xr7Var.a(c0.a);
                                    } else if (vVar2 instanceof com.yandex.passport.api.p) {
                                        xr7Var.a(a0.a);
                                    } else if (vVar2 instanceof com.yandex.passport.api.r) {
                                        xr7Var.a(new e0(((com.yandex.passport.api.r) vVar2).a));
                                    } else if (vVar2 instanceof com.yandex.passport.api.s) {
                                        xr7Var.a(b0.a);
                                    } else {
                                        xr7Var.a(new e0(new IllegalStateException("Unsupported bouncer answer: " + vVar2)));
                                    }
                                    break;
                                case 1:
                                    com.yandex.passport.sloth.b1 b1Var = (com.yandex.passport.sloth.b1) obj22;
                                    b1Var.getClass();
                                    j0Var.k.a(new g0(b1Var));
                                    break;
                                case 2:
                                    com.yandex.passport.sloth.h0 h0Var = (com.yandex.passport.sloth.h0) obj22;
                                    h0Var.getClass();
                                    j0Var.k.a(new f0(h0Var));
                                    break;
                                case 3:
                                    com.yandex.passport.sloth.ui.e1 e1Var = (com.yandex.passport.sloth.ui.e1) obj22;
                                    e1Var.getClass();
                                    j0Var.k.a(new h0(e1Var));
                                    break;
                                default:
                                    i0 i0Var = (i0) obj22;
                                    i0Var.getClass();
                                    j0Var.k.a(i0Var);
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    oq5Var2.k0(function17);
                    obj6 = function17;
                }
                com.yandex.plus.pay.ui.core.b.g(mVar, slothScreenComponentBuilder, function14, function16, (Function1) obj6, bVar.getProperties().d, oq5Var2, 0, 0);
                oq5Var2.p(false);
                xmn r = oq5Var2.r();
                if (r != null) {
                    r.d = new Function2(bVar, function1, i, i4) { // from class: com.yandex.passport.internal.ui.challenge.delete.f
                        public final /* synthetic */ int a;
                        public final /* synthetic */ b b;
                        public final /* synthetic */ Function1 c;

                        {
                            this.a = i4;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj7, Object obj8) {
                            int i8 = this.a;
                            hq5 hq5Var2 = (hq5) obj7;
                            ((Integer) obj8).getClass();
                            switch (i8) {
                                case 0:
                                    g.a(this.b, this.c, hq5Var2, rvf.R(1));
                                    break;
                                default:
                                    g.a(this.b, this.c, hq5Var2, rvf.R(1));
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            oq5Var2.Z(1870239947);
            oq5Var2.p(false);
            w wVar2 = ((z) Q.getValue()).a;
            if ((wVar2 instanceof u ? (u) wVar2 : null) == null) {
                oq5Var2.Z(1870794320);
            } else {
                oq5Var2.Z(1870794321);
                boolean h7 = oq5Var2.h(j0Var);
                Object K7 = oq5Var2.K();
                Object obj7 = K7;
                if (h7 || K7 == kjnVar) {
                    Function1 function18 = new Function1() { // from class: com.yandex.passport.internal.ui.challenge.delete.e
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj22) {
                            switch (i2) {
                                case 0:
                                    xr7 xr7Var = j0Var.k;
                                    com.yandex.passport.api.v vVar2 = (com.yandex.passport.api.v) obj22;
                                    vVar2.getClass();
                                    if (vVar2 instanceof com.yandex.passport.api.t) {
                                        xr7Var.a(c0.a);
                                    } else if (vVar2 instanceof com.yandex.passport.api.p) {
                                        xr7Var.a(a0.a);
                                    } else if (vVar2 instanceof com.yandex.passport.api.r) {
                                        xr7Var.a(new e0(((com.yandex.passport.api.r) vVar2).a));
                                    } else if (vVar2 instanceof com.yandex.passport.api.s) {
                                        xr7Var.a(b0.a);
                                    } else {
                                        xr7Var.a(new e0(new IllegalStateException("Unsupported bouncer answer: " + vVar2)));
                                    }
                                    break;
                                case 1:
                                    com.yandex.passport.sloth.b1 b1Var = (com.yandex.passport.sloth.b1) obj22;
                                    b1Var.getClass();
                                    j0Var.k.a(new g0(b1Var));
                                    break;
                                case 2:
                                    com.yandex.passport.sloth.h0 h0Var = (com.yandex.passport.sloth.h0) obj22;
                                    h0Var.getClass();
                                    j0Var.k.a(new f0(h0Var));
                                    break;
                                case 3:
                                    com.yandex.passport.sloth.ui.e1 e1Var = (com.yandex.passport.sloth.ui.e1) obj22;
                                    e1Var.getClass();
                                    j0Var.k.a(new h0(e1Var));
                                    break;
                                default:
                                    i0 i0Var = (i0) obj22;
                                    i0Var.getClass();
                                    j0Var.k.a(i0Var);
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    oq5Var2.k0(function18);
                    obj7 = function18;
                }
                b((Function1) obj7, oq5Var2, 0);
            }
            oq5Var2.p(false);
            com.yandex.passport.common.ui.progress.g gVar = bVar.getProperties().b;
            com.yandex.passport.common.ui.progress.g gVar2 = com.yandex.passport.common.ui.progress.g.e;
            oq5 oq5Var3 = oq5Var2;
            com.yandex.passport.internal.ui.a.i(null, gVar, false, oq5Var3, 0, 5);
            oq5Var = oq5Var3;
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            final int i8 = 1;
            r2.d = new Function2(bVar, function1, i, i8) { // from class: com.yandex.passport.internal.ui.challenge.delete.f
                public final /* synthetic */ int a;
                public final /* synthetic */ b b;
                public final /* synthetic */ Function1 c;

                {
                    this.a = i8;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj72, Object obj8) {
                    int i82 = this.a;
                    hq5 hq5Var2 = (hq5) obj72;
                    ((Integer) obj8).getClass();
                    switch (i82) {
                        case 0:
                            g.a(this.b, this.c, hq5Var2, rvf.R(1));
                            break;
                        default:
                            g.a(this.b, this.c, hq5Var2, rvf.R(1));
                            break;
                    }
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(Function1 function1, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(368269440);
        int i2 = (oq5Var.h(function1) ? 4 : 2) | i;
        if ((i2 & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            String M = rvf.M(R.string.passport_phonish_permanent_deletion_alert_text, oq5Var);
            String M2 = rvf.M(R.string.passport_native_to_browser_prompt_confirmation_title, oq5Var);
            String M3 = rvf.M(R.string.passport_native_to_browser_prompt_refusal_title, oq5Var);
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (z || K == kjnVar) {
                K = new pl3(7, function1);
                oq5Var.k0(K);
            }
            Function0 function0 = (Function0) K;
            boolean z2 = i3 == 4;
            Object K2 = oq5Var.K();
            if (z2 || K2 == kjnVar) {
                K2 = new pl3(8, function1);
                oq5Var.k0(K2);
            }
            Function0 function02 = (Function0) K2;
            boolean z3 = i3 == 4;
            Object K3 = oq5Var.K();
            if (z3 || K3 == kjnVar) {
                K3 = new pl3(9, function1);
                oq5Var.k0(K3);
            }
            com.yandex.passport.internal.ui.a.d(M, M2, M3, false, false, function0, function02, (Function0) K3, oq5Var, 0);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ai6(i, 4, function1);
        }
    }
}
