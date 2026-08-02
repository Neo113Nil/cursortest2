package ru.yandex.taxi.preorder.summary.solid.sourcedestination;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import defpackage.ati;
import defpackage.cma1;
import defpackage.cms;
import defpackage.cpv0;
import defpackage.hbp0;
import defpackage.ik31;
import defpackage.ike;
import defpackage.jl40;
import defpackage.jms;
import defpackage.l8x;
import defpackage.lct0;
import defpackage.mct0;
import defpackage.mi31;
import defpackage.oox0;
import defpackage.pex0;
import defpackage.pox0;
import defpackage.tje;
import defpackage.v580;
import defpackage.vpr;
import defpackage.w511;
import defpackage.wov0;
import defpackage.xev0;
import defpackage.yev0;
import defpackage.zev0;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.design.sourcedestination.SourceTrailMode;

/* loaded from: classes6.dex */
public final /* synthetic */ class c implements vpr, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ cpv0 b;

    public /* synthetic */ c(cpv0 cpv0Var, int i) {
        this.a = i;
        this.b = cpv0Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        v580 v580Var;
        v580 v580Var2;
        View view;
        boolean isHidden;
        switch (this.a) {
            case 0:
                zev0 zev0Var = (zev0) obj;
                cpv0 cpv0Var = this.b;
                hbp0 hbp0Var = cpv0Var.w;
                kotlinx.coroutines.a.g(((ike) hbp0Var.c()).a, null);
                if (zev0Var instanceof yev0) {
                    r0 r0Var = cpv0Var.C;
                    wov0 wov0Var = wov0.a;
                    r0Var.getClass();
                    r0Var.m(null, wov0Var);
                } else {
                    if (!(zev0Var instanceof xev0)) {
                        w511.b();
                        return null;
                    }
                    mct0 mct0Var = mct0.m;
                    lct0 lct0Var = new lct0();
                    cpv0Var.y = lct0Var;
                    r0 r0Var2 = cpv0Var.z;
                    mct0 a = lct0Var.a();
                    r0Var2.getClass();
                    r0Var2.m(null, a);
                    b bVar = cpv0Var.A;
                    if (bVar != null) {
                        tje.N(hbp0Var.c(), null, null, new SummarySourceDestinationViewHolderDelegate$observeData$1(cpv0Var, null), 3);
                        tje.N(hbp0Var.c(), null, null, new SummarySourceDestinationViewHolderDelegate$observeData$2(cpv0Var, null), 3);
                        tje.N(hbp0Var.c(), null, null, new SummarySourceDestinationViewHolderDelegate$observeData$3(cpv0Var, bVar, null), 3);
                        tje.N(hbp0Var.c(), null, null, new SummarySourceDestinationViewHolderDelegate$observeData$4(cpv0Var, bVar, null), 3);
                        tje.N(hbp0Var.c(), null, null, new SummarySourceDestinationViewHolderDelegate$observeData$5(cpv0Var, null), 3);
                        tje.N(hbp0Var.c(), null, null, new SummarySourceDestinationViewHolderDelegate$observeData$6(cpv0Var, null), 3);
                        tje.N(hbp0Var.c(), null, null, new SummarySourceDestinationViewHolderDelegate$observeData$7(cpv0Var, null), 3);
                        tje.N(hbp0Var.c(), null, null, new SummarySourceDestinationViewHolderDelegate$observeData$8(cpv0Var, null), 3);
                    }
                    cpv0Var.a();
                }
                return zy11.a;
            default:
                cpv0 cpv0Var2 = this.b;
                cpv0Var2.getClass();
                mi31 mi31Var = ((ik31) obj).b;
                pex0 pex0Var = mi31Var.a;
                if (!pex0Var.u || pex0Var.o0 >= cpv0Var2.m.c().b.size()) {
                    b bVar2 = cpv0Var2.A;
                    if (bVar2 != null) {
                        bVar2.c();
                    }
                } else {
                    b bVar3 = cpv0Var2.A;
                    if (bVar3 != null && (view = bVar3.p) != null && view.getVisibility() != 0) {
                        view.setVisibility(0);
                        isHidden = bVar3.b.a.isHidden();
                        if (isHidden) {
                            view.setTranslationY(0.0f);
                        } else {
                            ViewPropertyAnimator viewPropertyAnimator = bVar3.q;
                            if (viewPropertyAnimator != null) {
                                viewPropertyAnimator.cancel();
                            }
                            ViewPropertyAnimator interpolator = bVar3.n != null ? cma1.h(r3.getHeight() / 2, view).setInterpolator(new DecelerateInterpolator()) : null;
                            bVar3.q = interpolator;
                            if (interpolator != null) {
                                interpolator.start();
                            }
                        }
                    }
                }
                lct0 lct0Var2 = cpv0Var2.y;
                pex0 pex0Var2 = mi31Var.a;
                oox0 oox0Var = pex0Var2.r;
                pox0 pox0Var = oox0Var.c;
                ati atiVar = pex0Var2.Z;
                String str = (atiVar == null || (v580Var2 = atiVar.b) == null) ? null : v580Var2.b.b;
                String str2 = (atiVar == null || (v580Var = atiVar.b) == null) ? null : v580Var.b.a;
                lct0Var2.h = str;
                if (str2 == null) {
                    str2 = oox0Var.a;
                }
                lct0Var2.i = str2;
                String str3 = pox0Var.a;
                lct0Var2.j = str3;
                Pair pair = cpv0Var2.x;
                if (!jl40.l(str3, pair != null ? (String) pair.c() : null)) {
                    Pair pair2 = cpv0Var2.x;
                    l8x l8xVar = pair2 != null ? (l8x) pair2.f() : null;
                    if (l8xVar != null) {
                        l8xVar.a(null);
                    }
                    cpv0Var2.x = new Pair(str3, tje.N(cpv0Var2.w.c(), null, null, new SummarySourceDestinationViewHolderDelegate$loadRideTimeIcon$job$1(cpv0Var2, str3, null), 3));
                }
                cpv0Var2.d();
                SourceTrailMode sourceTrailMode = cpv0Var2.k.a(cpv0Var2.l.a.P) ? SourceTrailMode.PORCH : SourceTrailMode.NONE;
                lct0 lct0Var3 = cpv0Var2.y;
                lct0Var3.c = sourceTrailMode;
                r0 r0Var3 = cpv0Var2.z;
                mct0 a2 = lct0Var3.a();
                r0Var3.getClass();
                r0Var3.m(null, a2);
                cpv0Var2.a();
                r0 r0Var4 = cpv0Var2.z;
                mct0 a3 = cpv0Var2.y.a();
                r0Var4.getClass();
                r0Var4.m(null, a3);
                return zy11.a;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
        }
        return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        switch (this.a) {
            case 0:
                return new AdaptedFunctionReference(2, this.b, cpv0.class, "handleControlState", "handleControlState(Lcom/yandex/go/taxi/summary/shared/sourcedestination/SummaryControlState;)V", 4);
            default:
                return new AdaptedFunctionReference(2, this.b, cpv0.class, "onTariffUpdated", "onTariffUpdated(Lru/yandex/taxi/tariffs/model/verticals/VerticalsSnapshot;)V", 4);
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
