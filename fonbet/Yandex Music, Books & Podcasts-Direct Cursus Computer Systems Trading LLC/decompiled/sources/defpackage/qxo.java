package defpackage;

import android.app.Activity;
import android.view.Window;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public abstract class qxo {
    public static final agr a = new agr(new e5o(11));

    public static final void a(mxo mxoVar, vp5 vp5Var, boolean z, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(306564281);
        int i2 = (oq5Var.h(mxoVar) ? 4 : 2) | i | (oq5Var.h(vp5Var) ? 32 : 16);
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            boolean h = oq5Var.h(mxoVar) | oq5Var.h(vp5Var);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (h || K == kjnVar) {
                K = new s1n(mxoVar, vp5Var, (Continuation) null, 25);
                oq5Var.k0(K);
            }
            gld.w(oq5Var, mxoVar, (Function2) K);
            boolean h2 = oq5Var.h(vp5Var) | oq5Var.h(mxoVar);
            Object K2 = oq5Var.K();
            if (h2 || K2 == kjnVar) {
                K2 = new y20(vp5Var, mxoVar, z, 5);
                oq5Var.k0(K2);
            }
            gld.k(mxoVar, (Function1) K2, oq5Var);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new oc1(mxoVar, vp5Var, z, i, 18);
        }
    }

    public static final void b(final mxo mxoVar, hq5 hq5Var, final int i) {
        mxoVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(702474825);
        int i2 = (oq5Var.h(mxoVar) ? 4 : 2) | i;
        if (!oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            oq5Var.S();
        } else {
            if (!((Boolean) oq5Var.j((agr) ymg.d.c)).booleanValue()) {
                xmn r = oq5Var.r();
                if (r != null) {
                    final int i3 = 0;
                    r.d = new Function2(mxoVar, i, i3) { // from class: nxo
                        public final /* synthetic */ int a;
                        public final /* synthetic */ mxo b;

                        {
                            this.a = i3;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = this.a;
                            hq5 hq5Var2 = (hq5) obj;
                            ((Integer) obj2).getClass();
                            switch (i4) {
                                case 0:
                                    qxo.b(this.b, hq5Var2, rvf.R(1));
                                    break;
                                default:
                                    qxo.b(this.b, hq5Var2, rvf.R(1));
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            vp5 vp5Var = (vp5) oq5Var.j(a);
            if (vp5Var == null) {
                xq0.q("No ScrollFramesTracker provided, use ProvideScrollFrameTracker() or FrameTrackingEffect(scrollableState: ScrollableState, screenName: String");
                return;
            }
            a(mxoVar, vp5Var, false, oq5Var, (i2 & 14) | 384);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            final int i4 = 1;
            r2.d = new Function2(mxoVar, i, i4) { // from class: nxo
                public final /* synthetic */ int a;
                public final /* synthetic */ mxo b;

                {
                    this.a = i4;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = this.a;
                    hq5 hq5Var2 = (hq5) obj;
                    ((Integer) obj2).getClass();
                    switch (i42) {
                        case 0:
                            qxo.b(this.b, hq5Var2, rvf.R(1));
                            break;
                        default:
                            qxo.b(this.b, hq5Var2, rvf.R(1));
                            break;
                    }
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(mxo mxoVar, String str, hq5 hq5Var, int i) {
        mxoVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1039902388);
        int i2 = (oq5Var.h(mxoVar) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(str) ? 32 : 16;
        }
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            etn.l(ymg.d.o(0, oq5Var), ild.C(-2065323532, new hon(6, str, mxoVar), oq5Var), oq5Var, 56);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new x8l(mxoVar, str, i, 7);
        }
    }

    public static final void d(wn5 wn5Var, hq5 hq5Var, int i) {
        xmn r;
        ion ionVar;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1202729523);
        if (oq5Var.P(i & 1, (i & 19) != 18)) {
            if (((Boolean) mwo.e.getValue()).booleanValue()) {
                oq5Var.Z(-1898741771);
                oq5Var.p(false);
                Activity activity = (Activity) oq5Var.j(mhg.a);
                Window window = activity != null ? activity.getWindow() : null;
                if (window == null) {
                    oq5Var.Z(-1897800983);
                    wn5Var.invoke(oq5Var, 6);
                    oq5Var.p(false);
                    r = oq5Var.r();
                    if (r == null) {
                        return;
                    } else {
                        ionVar = new ion(i, 6, wn5Var);
                    }
                } else {
                    oq5Var.Z(-476862406);
                    oq5Var.p(false);
                    Object K = oq5Var.K();
                    kjn kjnVar = gq5.a;
                    if (K == kjnVar) {
                        K = new vp5(new lum(window, "Search"));
                        oq5Var.k0(K);
                    }
                    vp5 vp5Var = (vp5) K;
                    Unit unit = Unit.a;
                    boolean h = oq5Var.h(vp5Var);
                    Object K2 = oq5Var.K();
                    if (h || K2 == kjnVar) {
                        K2 = new mjm(20, vp5Var);
                        oq5Var.k0(K2);
                    }
                    gld.k(unit, (Function1) K2, oq5Var);
                    etn.m(new qzm[]{a.a(vp5Var), ymg.d.o(0, oq5Var)}, ild.C(-906051315, new ion(wn5Var, 3), oq5Var), oq5Var, 56);
                }
            } else {
                oq5Var.Z(-1897891379);
                wn5Var.invoke(oq5Var, 6);
                oq5Var.p(false);
                r = oq5Var.r();
                if (r == null) {
                    return;
                } else {
                    ionVar = new ion(i, 5, wn5Var);
                }
            }
            r.d = ionVar;
        }
        oq5Var.S();
        r = oq5Var.r();
        if (r != null) {
            ionVar = new ion(i, 4, wn5Var);
            r.d = ionVar;
        }
    }
}
