package defpackage;

import android.content.Context;
import androidx.compose.animation.b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.a;
import com.yandex.music.core.job.JobService;
import com.yandex.music.screen.landing.api.header.ui.view.HeaderContentViewFrameLayout;
import com.yandex.pulse.metrics.o;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.common.media.context.Page;
import ru.yandex.music.common.media.context.h;

/* loaded from: classes3.dex */
public final /* synthetic */ class nha implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nha(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Continuation continuation = null;
        final int i = 3;
        final int i2 = 2;
        final int i3 = 1;
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                ksw.u((xha) this.b, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 1:
                ((Integer) obj2).getClass();
                y2x.e((xia) this.b, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 2:
                ((Integer) obj2).getClass();
                ox6.l((rja) this.b, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 3:
                e2o e2oVar = (e2o) this.b;
                int intValue = ((Integer) obj).intValue();
                int intValue2 = ((Integer) obj2).intValue();
                e2oVar.h.i(intValue);
                e2oVar.i.i(intValue2);
                e2oVar.j.setValue(Boolean.TRUE);
                return Unit.a;
            case 4:
                ((Integer) obj2).getClass();
                cxb.h((zwa) this.b, (hq5) obj, rvf.R(9));
                return Unit.a;
            case 5:
                msj msjVar = (msj) this.b;
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        return Unit.a;
                    }
                }
                oq5 oq5Var2 = (oq5) hq5Var;
                boolean f = oq5Var2.f(msjVar);
                Object K = oq5Var2.K();
                if (f || K == gq5.a) {
                    K = new yrm(R.drawable.ic_edit_24, R.string.playlist_edit, "dialog_action_edit", msjVar);
                    oq5Var2.k0(K);
                }
                ivf.o((yrm) K, msjVar, null, null, null, oq5Var2, 0, 28);
                return Unit.a;
            case 6:
                r1b r1bVar = (r1b) this.b;
                q1b q1bVar = (q1b) obj;
                s1b s1bVar = (s1b) obj2;
                q1bVar.getClass();
                s1bVar.getClass();
                nrf nrfVar = q1bVar.a;
                dqj Q = rzf.Q(new g73(nrfVar.a, nrfVar.b, new wn5(new t1b((int) (null == true ? 1 : 0), (Object) s1bVar, (Object) r1bVar), -1003120773, true), (cma) null, 24), q1bVar.d, q1bVar.e, null, null, null, 60);
                xdr xdrVar = s1bVar.d;
                xdrVar.getClass();
                return new cyd(Q, xdrVar);
            case 7:
                d2b d2bVar = (d2b) this.b;
                hq5 hq5Var2 = (hq5) obj;
                int intValue3 = ((Integer) obj2).intValue();
                oq5 oq5Var3 = (oq5) hq5Var2;
                if (oq5Var3.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    q6k.f(d2bVar, null, oq5Var3, 0);
                } else {
                    oq5Var3.S();
                }
                return Unit.a;
            case 8:
                String quantityString = ((Context) ((wbb) this.b).a.getValue()).getResources().getQuantityString(((Integer) obj).intValue(), ((Integer) obj2).intValue());
                quantityString.getClass();
                return quantityString;
            case 9:
                ((Integer) obj2).getClass();
                x97.i((heb) this.b, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 10:
                ((Integer) obj2).getClass();
                cxb.m((t5c) this.b, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 11:
                j1d j1dVar = (j1d) this.b;
                fi1 fi1Var = j1dVar.h;
                hq5 hq5Var3 = (hq5) obj;
                if ((3 & ((Integer) obj2).intValue()) == 2) {
                    oq5 oq5Var4 = (oq5) hq5Var3;
                    if (oq5Var4.z()) {
                        oq5Var4.S();
                        return Unit.a;
                    }
                }
                oq5 oq5Var5 = (oq5) hq5Var3;
                Object K2 = oq5Var5.K();
                kjn kjnVar = gq5.a;
                if (K2 == kjnVar) {
                    fi1Var.getClass();
                    K2 = pd.t(ypg.a);
                    oq5Var5.k0(K2);
                }
                pu0 pu0Var = (pu0) K2;
                Object K3 = oq5Var5.K();
                if (K3 == kjnVar) {
                    K3 = new i1d();
                    oq5Var5.k0(K3);
                }
                i1d i1dVar = (i1d) K3;
                g1d g1dVar = j1dVar.g;
                h1d h1dVar = (h1d) fi1Var.a.getValue();
                jyr jyrVar = j1dVar.i;
                e0d e0dVar = new e0d(new b0d(g1dVar.c), g1dVar.d, g1dVar.e);
                v4b v4bVar = new v4b();
                h1dVar.getClass();
                jyrVar.getClass();
                i1dVar.getClass();
                jf0.a(new qzm[0], pu0Var, g1dVar.e, ild.C(1580958686, new v48(15, h1d.a(new sml(new f0d(g1dVar.a, g1dVar.b)), e0dVar, jyrVar, i1dVar, v4bVar, null, oq5Var5, 3136), new d1d(hd6.b, false, true), j1dVar), oq5Var5), oq5Var5, 3120, 0);
                return Unit.a;
            case 12:
                ztd ztdVar = (ztd) this.b;
                hq5 hq5Var4 = (hq5) obj;
                int intValue4 = ((Integer) obj2).intValue();
                oq5 oq5Var6 = (oq5) hq5Var4;
                if (oq5Var6.P(intValue4 & 1, (intValue4 & 3) != 2)) {
                    String str = ztdVar.a;
                    String str2 = ztdVar.c;
                    ges j = nu0.j();
                    vci vciVar = vci.a;
                    if (1.0f <= 0.0d) {
                        qme.a("invalid weight; must be greater than zero");
                    }
                    xcs.b(str, new LayoutWeightElement(false, 1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f), 0L, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, j, oq5Var6, 0, 3120, 55292);
                    if (str2 != null) {
                        oq5Var6.Z(-621056170);
                        xcs.b(" · ".concat(str2), a.a(vciVar, "release_year"), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.i(), oq5Var6, 48, 0, 65532);
                    } else {
                        oq5Var6.Z(-625618936);
                    }
                    oq5Var6.p(false);
                } else {
                    oq5Var6.S();
                }
                return Unit.a;
            case 13:
                ((Integer) obj2).getClass();
                vnj.f((fud) this.b, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 14:
                final HeaderContentViewFrameLayout headerContentViewFrameLayout = (HeaderContentViewFrameLayout) this.b;
                hq5 hq5Var5 = (hq5) obj;
                int intValue5 = ((Integer) obj2).intValue();
                int i4 = HeaderContentViewFrameLayout.h;
                kjn kjnVar2 = gq5.a;
                oq5 oq5Var7 = (oq5) hq5Var5;
                if (oq5Var7.P(intValue5 & 1, (intValue5 & 3) != 2)) {
                    cvd state = headerContentViewFrameLayout.getState();
                    boolean h = oq5Var7.h(headerContentViewFrameLayout);
                    Object K4 = oq5Var7.K();
                    if (h || K4 == kjnVar2) {
                        K4 = new lhd(i2, headerContentViewFrameLayout);
                        oq5Var7.k0(K4);
                    }
                    Function1 function1 = (Function1) K4;
                    boolean h2 = oq5Var7.h(headerContentViewFrameLayout);
                    Object K5 = oq5Var7.K();
                    if (h2 || K5 == kjnVar2) {
                        final Object[] objArr = null == true ? 1 : 0;
                        K5 = new Function0() { // from class: dvd
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i5 = objArr;
                                HeaderContentViewFrameLayout headerContentViewFrameLayout2 = headerContentViewFrameLayout;
                                switch (i5) {
                                    case 0:
                                        int i6 = HeaderContentViewFrameLayout.h;
                                        Function0<Unit> runLottieListener = headerContentViewFrameLayout2.getRunLottieListener();
                                        if (runLottieListener != null) {
                                            runLottieListener.invoke();
                                        }
                                        break;
                                    default:
                                        int i7 = HeaderContentViewFrameLayout.h;
                                        Function0<Unit> buttonShownListener = headerContentViewFrameLayout2.getButtonShownListener();
                                        if (buttonShownListener != null) {
                                            buttonShownListener.invoke();
                                        }
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var7.k0(K5);
                    }
                    Function0 function0 = (Function0) K5;
                    boolean h3 = oq5Var7.h(headerContentViewFrameLayout);
                    Object K6 = oq5Var7.K();
                    if (h3 || K6 == kjnVar2) {
                        K6 = new Function0() { // from class: dvd
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i5 = i3;
                                HeaderContentViewFrameLayout headerContentViewFrameLayout2 = headerContentViewFrameLayout;
                                switch (i5) {
                                    case 0:
                                        int i6 = HeaderContentViewFrameLayout.h;
                                        Function0<Unit> runLottieListener = headerContentViewFrameLayout2.getRunLottieListener();
                                        if (runLottieListener != null) {
                                            runLottieListener.invoke();
                                        }
                                        break;
                                    default:
                                        int i7 = HeaderContentViewFrameLayout.h;
                                        Function0<Unit> buttonShownListener = headerContentViewFrameLayout2.getButtonShownListener();
                                        if (buttonShownListener != null) {
                                            buttonShownListener.invoke();
                                        }
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var7.k0(K6);
                    }
                    Function0 function02 = (Function0) K6;
                    vci vciVar2 = vci.a;
                    b2c b2cVar = ujf.a;
                    boolean booleanValue = ((Boolean) oq5Var7.j((agr) clg.d.c)).booleanValue();
                    b2cVar.getClass();
                    quj.p(0, headerContentViewFrameLayout.m10getLogoColorQN2ZGVo(), oq5Var7, state, d.e(vciVar2, ((cma) yhn.a(new cma(b2c.v(booleanValue, oq5Var7) / 2), new cma(56))).a), function0, function02, function1, headerContentViewFrameLayout.getCollapsedMode());
                } else {
                    oq5Var7.S();
                }
                return Unit.a;
            case 15:
                vci vciVar3 = vci.a;
                evo evoVar = (evo) this.b;
                hq5 hq5Var6 = (hq5) obj;
                int intValue6 = ((Integer) obj2).intValue();
                oq5 oq5Var8 = (oq5) hq5Var6;
                if (oq5Var8.P(intValue6 & 1, (intValue6 & 3) != 2)) {
                    int ordinal = evoVar.ordinal();
                    if (ordinal == 0) {
                        oq5Var8.Z(-2030670967);
                        gae.b(a0g.E(R.drawable.ic_queue_24, 0, oq5Var8), rvf.M(R.string.player_open_playback_queue_description, oq5Var8), a.a(vciVar3, "open_queue_button"), ((dq0) oq5Var8.j(eq0.a)).a.c, oq5Var8, 384, 0);
                        oq5Var8.p(false);
                    } else {
                        if (ordinal != 1) {
                            throw vz1.i(oq5Var8, 73039366, false);
                        }
                        oq5Var8.Z(-2030172797);
                        gae.b(a0g.E(R.drawable.ic_close_mid_24, 0, oq5Var8), rvf.M(R.string.player_close_playback_queue_description, oq5Var8), a.a(vciVar3, "close_queue_button"), ((dq0) oq5Var8.j(eq0.a)).a.c, oq5Var8, 384, 0);
                        oq5Var8.p(false);
                    }
                } else {
                    oq5Var8.S();
                }
                return Unit.a;
            case 16:
                cyd cydVar = (cyd) this.b;
                hq5 hq5Var7 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var9 = (oq5) hq5Var7;
                    if (oq5Var9.z()) {
                        oq5Var9.S();
                        return Unit.a;
                    }
                }
                Unit unit = Unit.a;
                oq5 oq5Var10 = (oq5) hq5Var7;
                boolean f2 = oq5Var10.f(cydVar);
                Object K7 = oq5Var10.K();
                if (f2 || K7 == gq5.a) {
                    K7 = new nz5(cydVar, continuation, 21);
                    oq5Var10.k0(K7);
                }
                gld.w(oq5Var10, unit, (Function2) K7);
                vci vciVar4 = vci.a;
                yci a = b.a(vciVar4, null, 3);
                kfh d = ug3.d(b2c.b, false);
                int i5 = oq5Var10.P;
                androidx.compose.runtime.internal.a l = oq5Var10.l();
                yci H = vnj.H(oq5Var10, a);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var10.d0();
                if (oq5Var10.O) {
                    oq5Var10.k(grbVar);
                } else {
                    oq5Var10.n0();
                }
                g0g.U(oq5Var10, d, wp5.f);
                g0g.U(oq5Var10, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var10.O || !Intrinsics.d(oq5Var10.K(), Integer.valueOf(i5))) {
                    ouj.x(i5, oq5Var10, i5, kb5Var);
                }
                g0g.U(oq5Var10, H, wp5.d);
                if (((Boolean) cydVar.c.getValue()).booleanValue()) {
                    oq5Var10.Z(-1800001755);
                    u1g.l(oq5Var10, d.d(vciVar4, 1.0f));
                    oq5Var10.p(false);
                } else {
                    oq5Var10.Z(-1799933896);
                    cydVar.a.getUi().invoke(oq5Var10, 0);
                    oq5Var10.p(false);
                }
                oq5Var10.p(true);
                return Unit.a;
            case 17:
                a2e a2eVar = (a2e) this.b;
                List list = (List) obj;
                String str3 = (String) obj2;
                list.getClass();
                str3.getClass();
                a2eVar.a(list, false, null, str3);
                return Unit.a;
            case 18:
                h2e h2eVar = (h2e) this.b;
                String str4 = (String) obj;
                String str5 = (String) obj2;
                str5.getClass();
                if (str4 != null && str4.length() != 0) {
                    a2e a2eVar2 = (a2e) h2eVar.o.getValue();
                    a2eVar2.getClass();
                    new yfx(a2eVar2.b, new h(Page.LANDING)).u(str4, str5);
                }
                return Unit.a;
            case 19:
                dfe dfeVar = (dfe) this.b;
                hq5 hq5Var8 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var11 = (oq5) hq5Var8;
                    if (oq5Var11.z()) {
                        oq5Var11.S();
                        return Unit.a;
                    }
                }
                oq5 oq5Var12 = (oq5) hq5Var8;
                boolean h4 = oq5Var12.h(dfeVar);
                Object K8 = oq5Var12.K();
                if (h4 || K8 == gq5.a) {
                    v2d v2dVar = new v2d(0, dfeVar, dfe.class, "onBackClick", "onBackClick()V", 0, 10);
                    oq5Var12.k0(v2dVar);
                    K8 = v2dVar;
                }
                zsd.g((Function0) ((h9f) K8), null, 0, 0L, 0, oq5Var12, 0, 30);
                return Unit.a;
            case 20:
                u2f u2fVar = (u2f) this.b;
                s2f s2fVar = (s2f) obj;
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                s2fVar.getClass();
                JobService jobService = u2fVar.d;
                if (jobService != null) {
                    jobService.jobFinished(s2fVar.a(), booleanValue2);
                }
                u2fVar.b.remove(Integer.valueOf(s2fVar.a().getJobId()));
                return Unit.a;
            case 21:
                ((Integer) obj2).getClass();
                bcx.k((bdf) this.b, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 22:
                ((Integer) obj2).getClass();
                kg5.h((cdf) this.b, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 23:
                final hla hlaVar = (hla) this.b;
                pvf pvfVar = (pvf) obj;
                pvfVar.getClass();
                ((gnq) obj2).getClass();
                final Object[] objArr2 = null == true ? 1 : 0;
                pvfVar.a(new String[]{"MIXES_MUSIC", "MIXES_GRID"}, new Function0() { // from class: aef
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (objArr2) {
                            case 0:
                                hla hlaVar2 = hlaVar;
                                l18 l18Var = l18.b;
                                bdt I = hag.I(v7i.class);
                                qdc qdcVar = l18Var.a;
                                qdcVar.getClass();
                                return new ce((v7i) qdcVar.C(I), (tmb) hlaVar2.b);
                            case 1:
                                hla hlaVar3 = hlaVar;
                                l18 l18Var2 = l18.b;
                                bdt I2 = hag.I(xdf.class);
                                qdc qdcVar2 = l18Var2.a;
                                qdcVar2.getClass();
                                return new ce((xdf) qdcVar2.C(I2), (tmb) hlaVar3.b);
                            case 2:
                                hla hlaVar4 = hlaVar;
                                l18 l18Var3 = l18.b;
                                bdt I3 = hag.I(tff.class);
                                qdc qdcVar3 = l18Var3.a;
                                qdcVar3.getClass();
                                return new ce((tff) qdcVar3.C(I3), (tmb) hlaVar4.b);
                            default:
                                hla hlaVar5 = hlaVar;
                                l18 l18Var4 = l18.b;
                                bdt I4 = hag.I(joq.class);
                                qdc qdcVar4 = l18Var4.a;
                                qdcVar4.getClass();
                                return new rsj((joq) qdcVar4.C(I4), (tmb) hlaVar5.b);
                        }
                    }
                });
                pvfVar.a(new String[]{"KIDS_FAVOURITE_SECTION"}, new Function0() { // from class: aef
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i3) {
                            case 0:
                                hla hlaVar2 = hlaVar;
                                l18 l18Var = l18.b;
                                bdt I = hag.I(v7i.class);
                                qdc qdcVar = l18Var.a;
                                qdcVar.getClass();
                                return new ce((v7i) qdcVar.C(I), (tmb) hlaVar2.b);
                            case 1:
                                hla hlaVar3 = hlaVar;
                                l18 l18Var2 = l18.b;
                                bdt I2 = hag.I(xdf.class);
                                qdc qdcVar2 = l18Var2.a;
                                qdcVar2.getClass();
                                return new ce((xdf) qdcVar2.C(I2), (tmb) hlaVar3.b);
                            case 2:
                                hla hlaVar4 = hlaVar;
                                l18 l18Var3 = l18.b;
                                bdt I3 = hag.I(tff.class);
                                qdc qdcVar3 = l18Var3.a;
                                qdcVar3.getClass();
                                return new ce((tff) qdcVar3.C(I3), (tmb) hlaVar4.b);
                            default:
                                hla hlaVar5 = hlaVar;
                                l18 l18Var4 = l18.b;
                                bdt I4 = hag.I(joq.class);
                                qdc qdcVar4 = l18Var4.a;
                                qdcVar4.getClass();
                                return new rsj((joq) qdcVar4.C(I4), (tmb) hlaVar5.b);
                        }
                    }
                });
                pvfVar.a(new String[]{"KIDS_TAB_VISIBILITY"}, new Function0() { // from class: aef
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i2) {
                            case 0:
                                hla hlaVar2 = hlaVar;
                                l18 l18Var = l18.b;
                                bdt I = hag.I(v7i.class);
                                qdc qdcVar = l18Var.a;
                                qdcVar.getClass();
                                return new ce((v7i) qdcVar.C(I), (tmb) hlaVar2.b);
                            case 1:
                                hla hlaVar3 = hlaVar;
                                l18 l18Var2 = l18.b;
                                bdt I2 = hag.I(xdf.class);
                                qdc qdcVar2 = l18Var2.a;
                                qdcVar2.getClass();
                                return new ce((xdf) qdcVar2.C(I2), (tmb) hlaVar3.b);
                            case 2:
                                hla hlaVar4 = hlaVar;
                                l18 l18Var3 = l18.b;
                                bdt I3 = hag.I(tff.class);
                                qdc qdcVar3 = l18Var3.a;
                                qdcVar3.getClass();
                                return new ce((tff) qdcVar3.C(I3), (tmb) hlaVar4.b);
                            default:
                                hla hlaVar5 = hlaVar;
                                l18 l18Var4 = l18.b;
                                bdt I4 = hag.I(joq.class);
                                qdc qdcVar4 = l18Var4.a;
                                qdcVar4.getClass();
                                return new rsj((joq) qdcVar4.C(I4), (tmb) hlaVar5.b);
                        }
                    }
                });
                l18 l18Var = l18.b;
                bdt I = hag.I(koq.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                if (lxe.l().a()) {
                    pvfVar.a(new String[]{"KIDS_EASY_LOGIN_PROMO"}, new Function0() { // from class: aef
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i) {
                                case 0:
                                    hla hlaVar2 = hlaVar;
                                    l18 l18Var2 = l18.b;
                                    bdt I2 = hag.I(v7i.class);
                                    qdc qdcVar2 = l18Var2.a;
                                    qdcVar2.getClass();
                                    return new ce((v7i) qdcVar2.C(I2), (tmb) hlaVar2.b);
                                case 1:
                                    hla hlaVar3 = hlaVar;
                                    l18 l18Var22 = l18.b;
                                    bdt I22 = hag.I(xdf.class);
                                    qdc qdcVar22 = l18Var22.a;
                                    qdcVar22.getClass();
                                    return new ce((xdf) qdcVar22.C(I22), (tmb) hlaVar3.b);
                                case 2:
                                    hla hlaVar4 = hlaVar;
                                    l18 l18Var3 = l18.b;
                                    bdt I3 = hag.I(tff.class);
                                    qdc qdcVar3 = l18Var3.a;
                                    qdcVar3.getClass();
                                    return new ce((tff) qdcVar3.C(I3), (tmb) hlaVar4.b);
                                default:
                                    hla hlaVar5 = hlaVar;
                                    l18 l18Var4 = l18.b;
                                    bdt I4 = hag.I(joq.class);
                                    qdc qdcVar4 = l18Var4.a;
                                    qdcVar4.getClass();
                                    return new rsj((joq) qdcVar4.C(I4), (tmb) hlaVar5.b);
                            }
                        }
                    });
                }
                return Unit.a;
            case 24:
                ((Integer) obj2).getClass();
                tt0.p((zef) this.b, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 25:
                ((Integer) obj2).getClass();
                vq1.i((aff) this.b, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 26:
                ((Integer) obj2).getClass();
                sk3.k((dgf) this.b, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 27:
                ((Integer) obj2).getClass();
                zc4.l((ygf) this.b, (hq5) obj, rvf.R(1));
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((Integer) obj2).getClass();
                yd5.k((zgf) this.b, (hq5) obj, rvf.R(1));
                return Unit.a;
            default:
                tjf tjfVar = (tjf) this.b;
                hq5 hq5Var9 = (hq5) obj;
                int intValue7 = ((Integer) obj2).intValue();
                oq5 oq5Var13 = (oq5) hq5Var9;
                if (oq5Var13.P(intValue7 & 1, (intValue7 & 3) != 2)) {
                    cb0.p((ior) tjfVar.m.getValue(), (sor) tjfVar.n.getValue(), oq5Var13, 64);
                } else {
                    oq5Var13.S();
                }
                return Unit.a;
        }
    }

    public /* synthetic */ nha(Object obj, int i, int i2) {
        this.a = i2;
        this.b = obj;
    }
}
