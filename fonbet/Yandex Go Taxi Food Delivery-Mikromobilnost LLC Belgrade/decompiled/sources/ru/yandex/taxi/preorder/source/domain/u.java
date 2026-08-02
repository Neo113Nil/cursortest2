package ru.yandex.taxi.preorder.source.domain;

import com.yandex.go.address.models.Address;
import com.yandex.go.clarify_address.ClarifyAddressBeforeOrderExperiment;
import com.yandex.go.point_selection_settings.PointSelectionSettingsInteractor$PointType;
import com.yandex.go.taxi.summary.api.analytics.SummaryExpandReason;
import defpackage.avd0;
import defpackage.bhv0;
import defpackage.biv0;
import defpackage.bov0;
import defpackage.d6z;
import defpackage.evu0;
import defpackage.hhv0;
import defpackage.hxx;
import defpackage.jhv0;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.ou7;
import defpackage.ozb;
import defpackage.pep0;
import defpackage.pex0;
import defpackage.pzb;
import defpackage.ra00;
import defpackage.rjt0;
import defpackage.sls;
import defpackage.tit0;
import defpackage.uet0;
import defpackage.wb1;
import defpackage.wiq0;
import defpackage.xit0;
import defpackage.y9l0;
import defpackage.yit0;
import defpackage.yvf0;
import defpackage.zsa;
import defpackage.zud0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.preorder.source.ModalViewOrigin;
import ru.yandex.taxi.preorder.source.domain.u;
import ru.yandex.taxi.routeselector.analytics.RouteSelectorOpenReason;

/* loaded from: classes6.dex */
public final class u {
    public final ra00 a;
    public final yit0 b;
    public final biv0 c;
    public final wiq0 d;
    public final rjt0 e;
    public final tit0 f;
    public final a g;
    public final ou7 h;
    public final wb1 i;
    public final yvf0 j;
    public final oep0 k;
    public final uet0 l;
    public final p m;
    public final avd0 n;
    public final xit0 o;
    public final com.yandex.go.address.position_confirmation.j p;
    public final pzb q;

    public u(ra00 ra00Var, yit0 yit0Var, biv0 biv0Var, wiq0 wiq0Var, rjt0 rjt0Var, tit0 tit0Var, a aVar, ou7 ou7Var, wb1 wb1Var, yvf0 yvf0Var, oep0 oep0Var, uet0 uet0Var, p pVar, avd0 avd0Var, xit0 xit0Var, com.yandex.go.address.position_confirmation.j jVar, pzb pzbVar) {
        this.a = ra00Var;
        this.b = yit0Var;
        this.c = biv0Var;
        this.d = wiq0Var;
        this.e = rjt0Var;
        this.f = tit0Var;
        this.g = aVar;
        this.h = ou7Var;
        this.i = wb1Var;
        this.j = yvf0Var;
        this.k = oep0Var;
        this.l = uet0Var;
        this.m = pVar;
        this.n = avd0Var;
        this.o = xit0Var;
        this.p = jVar;
        this.q = pzbVar;
    }

    public final boolean a(ModalViewOrigin modalViewOrigin) {
        if (this.h.b()) {
            this.o.a();
            this.l.a();
            return false;
        }
        if (modalViewOrigin == ModalViewOrigin.SUPERAPP_MAIN) {
            this.a.a();
        } else if (modalViewOrigin == ModalViewOrigin.SUMMARY) {
            bov0 a = this.c.a();
            if (a == null) {
                a = bov0.e;
            }
            this.b.c(a);
        }
        this.p.a();
        return true;
    }

    public final bov0 b(boolean z) {
        bov0 a = this.c.a();
        if (a == null) {
            a = bov0.e;
        }
        return new bov0(a.a, new bhv0(z ? new jhv0(new hhv0(SummaryExpandReason.AUTO_REDIRECT), true) : jhv0.c), a.c, a.d);
    }

    public final void c(final ModalViewOrigin modalViewOrigin, Address address, final Runnable runnable) {
        if (this.f.c != null || address == null || address.X1()) {
            return;
        }
        wb1 wb1Var = this.i;
        final int i = 0;
        if (!wb1Var.c() ? false : wb1Var.k()) {
            return;
        }
        pex0 m = ((com.yandex.go.taxi.tariffs.internal.repository.k) this.d).m();
        zud0 a = ((com.yandex.go.point_selection_settings.d) this.n).a(m != null ? m.b : null, PointSelectionSettingsInteractor$PointType.SOURCE);
        final int i2 = 1;
        ((pep0) this.k).f(new zsa(29, (ru.yandex.taxi.routeselector.a) this.j.get(), new sls(this) { // from class: cit0
            public final /* synthetic */ u b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i;
                zy11 zy11Var = zy11.a;
                Runnable runnable2 = runnable;
                ModalViewOrigin modalViewOrigin2 = modalViewOrigin;
                u uVar = this.b;
                switch (i3) {
                    case 0:
                        uVar.p.d();
                        if (uVar.a(modalViewOrigin2)) {
                            runnable2.run();
                            break;
                        }
                        break;
                    default:
                        if (uVar.a(modalViewOrigin2)) {
                            runnable2.run();
                            break;
                        }
                        break;
                }
                return zy11Var;
            }
        }, new sls(this) { // from class: cit0
            public final /* synthetic */ u b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i2;
                zy11 zy11Var = zy11.a;
                Runnable runnable2 = runnable;
                ModalViewOrigin modalViewOrigin2 = modalViewOrigin;
                u uVar = this.b;
                switch (i3) {
                    case 0:
                        uVar.p.d();
                        if (uVar.a(modalViewOrigin2)) {
                            runnable2.run();
                            break;
                        }
                        break;
                    default:
                        if (uVar.a(modalViewOrigin2)) {
                            runnable2.run();
                            break;
                        }
                        break;
                }
                return zy11Var;
            }
        }), new y9l0(modalViewOrigin, RouteSelectorOpenReason.ADDRESS, a != null ? a.a : null, a != null ? a.b : null, a != null ? a.c : null, null, 96), hxx.a);
    }

    public final void d(RouteSelectorOpenReason routeSelectorOpenReason) {
        pex0 m = ((com.yandex.go.taxi.tariffs.internal.repository.k) this.d).m();
        zud0 a = ((com.yandex.go.point_selection_settings.d) this.n).a(m != null ? m.b : null, PointSelectionSettingsInteractor$PointType.SOURCE);
        final boolean c = this.c.c();
        final int i = 0;
        final int i2 = 1;
        ((pep0) this.k).f(new zsa(29, (ru.yandex.taxi.routeselector.a) this.j.get(), new sls(this) { // from class: bit0
            public final /* synthetic */ u b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i;
                zy11 zy11Var = zy11.a;
                boolean z = c;
                u uVar = this.b;
                switch (i3) {
                    case 0:
                        bov0 b = uVar.b(z);
                        uVar.p.d();
                        uVar.g.e(new tb(13, uVar, b));
                        break;
                    default:
                        uVar.b.c(uVar.b(z));
                        uVar.p.a();
                        break;
                }
                return zy11Var;
            }
        }, new sls(this) { // from class: bit0
            public final /* synthetic */ u b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i2;
                zy11 zy11Var = zy11.a;
                boolean z = c;
                u uVar = this.b;
                switch (i3) {
                    case 0:
                        bov0 b = uVar.b(z);
                        uVar.p.d();
                        uVar.g.e(new tb(13, uVar, b));
                        break;
                    default:
                        uVar.b.c(uVar.b(z));
                        uVar.p.a();
                        break;
                }
                return zy11Var;
            }
        }), new y9l0(ModalViewOrigin.SUMMARY, routeSelectorOpenReason, a != null ? a.a : null, a != null ? a.b : null, a != null ? a.c : null, null, 96), hxx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ad, code lost:
    
        if (r10 == r3) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r10v17, types: [sls] */
    /* JADX WARN: Type inference failed for: r2v14, types: [sls] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ozb ozbVar, ozb ozbVar2, ContinuationImpl continuationImpl) {
        SourcePointRouteSelectorNavigationInteractor$showRouteSelectorFromSummaryOnOrderButtonClick$1 sourcePointRouteSelectorNavigationInteractor$showRouteSelectorFromSummaryOnOrderButtonClick$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        zud0 a;
        final ozb ozbVar3;
        final sls slsVar;
        Object obj;
        String str;
        zud0 zud0Var;
        String str2;
        String str3;
        String Y;
        ozb ozbVar4;
        sls slsVar2;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        if (continuationImpl instanceof SourcePointRouteSelectorNavigationInteractor$showRouteSelectorFromSummaryOnOrderButtonClick$1) {
            sourcePointRouteSelectorNavigationInteractor$showRouteSelectorFromSummaryOnOrderButtonClick$1 = (SourcePointRouteSelectorNavigationInteractor$showRouteSelectorFromSummaryOnOrderButtonClick$1) continuationImpl;
            int i2 = sourcePointRouteSelectorNavigationInteractor$showRouteSelectorFromSummaryOnOrderButtonClick$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sourcePointRouteSelectorNavigationInteractor$showRouteSelectorFromSummaryOnOrderButtonClick$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = sourcePointRouteSelectorNavigationInteractor$showRouteSelectorFromSummaryOnOrderButtonClick$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sourcePointRouteSelectorNavigationInteractor$showRouteSelectorFromSummaryOnOrderButtonClick$1.label;
                pzb pzbVar = this.q;
                final int i3 = 1;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    pex0 m = ((com.yandex.go.taxi.tariffs.internal.repository.k) this.d).m();
                    a = ((com.yandex.go.point_selection_settings.d) this.n).a(m != null ? m.b : null, PointSelectionSettingsInteractor$PointType.SOURCE);
                    if (a != null && (str = a.a) != null) {
                        slsVar = ozbVar2;
                        zud0Var = a;
                        str2 = str;
                        ozbVar3 = ozbVar;
                        str3 = zud0Var != null ? zud0Var.b : null;
                        if (zud0Var == null && (str5 = zud0Var.c) != null) {
                            str6 = str3;
                            str7 = str5;
                            str8 = str2;
                            final int i4 = 0;
                            ((pep0) this.k).f(new zsa(29, (ru.yandex.taxi.routeselector.a) this.j.get(), new sls(this) { // from class: ait0
                                public final /* synthetic */ u b;

                                {
                                    this.b = this;
                                }

                                @Override // defpackage.sls
                                public final Object invoke() {
                                    int i5 = i4;
                                    zy11 zy11Var = zy11.a;
                                    sls slsVar3 = ozbVar3;
                                    u uVar = this.b;
                                    switch (i5) {
                                        case 0:
                                            uVar.p.d();
                                            uVar.g.e(new tb(13, uVar, null));
                                            slsVar3.invoke();
                                            break;
                                        default:
                                            yit0 yit0Var = uVar.b;
                                            bov0 a2 = uVar.c.a();
                                            if (a2 == null) {
                                                a2 = bov0.e;
                                            }
                                            yit0Var.c(a2);
                                            slsVar3.invoke();
                                            break;
                                    }
                                    return zy11Var;
                                }
                            }, new sls(this) { // from class: ait0
                                public final /* synthetic */ u b;

                                {
                                    this.b = this;
                                }

                                @Override // defpackage.sls
                                public final Object invoke() {
                                    int i5 = i3;
                                    zy11 zy11Var = zy11.a;
                                    sls slsVar3 = slsVar;
                                    u uVar = this.b;
                                    switch (i5) {
                                        case 0:
                                            uVar.p.d();
                                            uVar.g.e(new tb(13, uVar, null));
                                            slsVar3.invoke();
                                            break;
                                        default:
                                            yit0 yit0Var = uVar.b;
                                            bov0 a2 = uVar.c.a();
                                            if (a2 == null) {
                                                a2 = bov0.e;
                                            }
                                            yit0Var.c(a2);
                                            slsVar3.invoke();
                                            break;
                                    }
                                    return zy11Var;
                                }
                            }), new y9l0(ModalViewOrigin.SUMMARY, RouteSelectorOpenReason.SUMMARY, str8, str6, str7, null, 64), hxx.a);
                            return zy11.a;
                        }
                        sourcePointRouteSelectorNavigationInteractor$showRouteSelectorFromSummaryOnOrderButtonClick$1.L$0 = ozbVar3;
                        sourcePointRouteSelectorNavigationInteractor$showRouteSelectorFromSummaryOnOrderButtonClick$1.L$1 = slsVar;
                        sourcePointRouteSelectorNavigationInteractor$showRouteSelectorFromSummaryOnOrderButtonClick$1.L$2 = null;
                        sourcePointRouteSelectorNavigationInteractor$showRouteSelectorFromSummaryOnOrderButtonClick$1.L$3 = str2;
                        sourcePointRouteSelectorNavigationInteractor$showRouteSelectorFromSummaryOnOrderButtonClick$1.L$4 = str3;
                        sourcePointRouteSelectorNavigationInteractor$showRouteSelectorFromSummaryOnOrderButtonClick$1.label = 2;
                        ClarifyAddressBeforeOrderExperiment clarifyAddressBeforeOrderExperiment = (ClarifyAddressBeforeOrderExperiment) pzbVar.a.b.getValue();
                        Y = d6z.Y(clarifyAddressBeforeOrderExperiment, clarifyAddressBeforeOrderExperiment.f);
                        if (evu0.J(Y)) {
                            Y = null;
                        }
                        if (Y != coroutineSingletons) {
                            String str9 = Y;
                            ozbVar4 = ozbVar3;
                            obj2 = str9;
                            slsVar2 = slsVar;
                            str4 = str3;
                            String str10 = (String) obj2;
                            ozbVar3 = ozbVar4;
                            str6 = str4;
                            slsVar = slsVar2;
                            str8 = str2;
                            str7 = str10;
                            final int i42 = 0;
                            ((pep0) this.k).f(new zsa(29, (ru.yandex.taxi.routeselector.a) this.j.get(), new sls(this) { // from class: ait0
                                public final /* synthetic */ u b;

                                {
                                    this.b = this;
                                }

                                @Override // defpackage.sls
                                public final Object invoke() {
                                    int i5 = i42;
                                    zy11 zy11Var = zy11.a;
                                    sls slsVar3 = ozbVar3;
                                    u uVar = this.b;
                                    switch (i5) {
                                        case 0:
                                            uVar.p.d();
                                            uVar.g.e(new tb(13, uVar, null));
                                            slsVar3.invoke();
                                            break;
                                        default:
                                            yit0 yit0Var = uVar.b;
                                            bov0 a2 = uVar.c.a();
                                            if (a2 == null) {
                                                a2 = bov0.e;
                                            }
                                            yit0Var.c(a2);
                                            slsVar3.invoke();
                                            break;
                                    }
                                    return zy11Var;
                                }
                            }, new sls(this) { // from class: ait0
                                public final /* synthetic */ u b;

                                {
                                    this.b = this;
                                }

                                @Override // defpackage.sls
                                public final Object invoke() {
                                    int i5 = i3;
                                    zy11 zy11Var = zy11.a;
                                    sls slsVar3 = slsVar;
                                    u uVar = this.b;
                                    switch (i5) {
                                        case 0:
                                            uVar.p.d();
                                            uVar.g.e(new tb(13, uVar, null));
                                            slsVar3.invoke();
                                            break;
                                        default:
                                            yit0 yit0Var = uVar.b;
                                            bov0 a2 = uVar.c.a();
                                            if (a2 == null) {
                                                a2 = bov0.e;
                                            }
                                            yit0Var.c(a2);
                                            slsVar3.invoke();
                                            break;
                                    }
                                    return zy11Var;
                                }
                            }), new y9l0(ModalViewOrigin.SUMMARY, RouteSelectorOpenReason.SUMMARY, str8, str6, str7, null, 64), hxx.a);
                            return zy11.a;
                        }
                        return coroutineSingletons;
                    }
                    ozbVar3 = ozbVar;
                    sourcePointRouteSelectorNavigationInteractor$showRouteSelectorFromSummaryOnOrderButtonClick$1.L$0 = ozbVar3;
                    slsVar = ozbVar2;
                    sourcePointRouteSelectorNavigationInteractor$showRouteSelectorFromSummaryOnOrderButtonClick$1.L$1 = slsVar;
                    sourcePointRouteSelectorNavigationInteractor$showRouteSelectorFromSummaryOnOrderButtonClick$1.L$2 = a;
                    sourcePointRouteSelectorNavigationInteractor$showRouteSelectorFromSummaryOnOrderButtonClick$1.label = 1;
                    ClarifyAddressBeforeOrderExperiment clarifyAddressBeforeOrderExperiment2 = (ClarifyAddressBeforeOrderExperiment) pzbVar.a.b.getValue();
                    String Y2 = d6z.Y(clarifyAddressBeforeOrderExperiment2, clarifyAddressBeforeOrderExperiment2.e);
                    boolean J = evu0.J(Y2);
                    obj = Y2;
                    if (J) {
                        obj = null;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str4 = (String) sourcePointRouteSelectorNavigationInteractor$showRouteSelectorFromSummaryOnOrderButtonClick$1.L$4;
                        str2 = (String) sourcePointRouteSelectorNavigationInteractor$showRouteSelectorFromSummaryOnOrderButtonClick$1.L$3;
                        slsVar2 = (sls) sourcePointRouteSelectorNavigationInteractor$showRouteSelectorFromSummaryOnOrderButtonClick$1.L$1;
                        ?? r2 = (sls) sourcePointRouteSelectorNavigationInteractor$showRouteSelectorFromSummaryOnOrderButtonClick$1.L$0;
                        kotlin.b.b(obj2);
                        ozbVar4 = r2;
                        String str102 = (String) obj2;
                        ozbVar3 = ozbVar4;
                        str6 = str4;
                        slsVar = slsVar2;
                        str8 = str2;
                        str7 = str102;
                        final int i422 = 0;
                        ((pep0) this.k).f(new zsa(29, (ru.yandex.taxi.routeselector.a) this.j.get(), new sls(this) { // from class: ait0
                            public final /* synthetic */ u b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.sls
                            public final Object invoke() {
                                int i5 = i422;
                                zy11 zy11Var = zy11.a;
                                sls slsVar3 = ozbVar3;
                                u uVar = this.b;
                                switch (i5) {
                                    case 0:
                                        uVar.p.d();
                                        uVar.g.e(new tb(13, uVar, null));
                                        slsVar3.invoke();
                                        break;
                                    default:
                                        yit0 yit0Var = uVar.b;
                                        bov0 a2 = uVar.c.a();
                                        if (a2 == null) {
                                            a2 = bov0.e;
                                        }
                                        yit0Var.c(a2);
                                        slsVar3.invoke();
                                        break;
                                }
                                return zy11Var;
                            }
                        }, new sls(this) { // from class: ait0
                            public final /* synthetic */ u b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.sls
                            public final Object invoke() {
                                int i5 = i3;
                                zy11 zy11Var = zy11.a;
                                sls slsVar3 = slsVar;
                                u uVar = this.b;
                                switch (i5) {
                                    case 0:
                                        uVar.p.d();
                                        uVar.g.e(new tb(13, uVar, null));
                                        slsVar3.invoke();
                                        break;
                                    default:
                                        yit0 yit0Var = uVar.b;
                                        bov0 a2 = uVar.c.a();
                                        if (a2 == null) {
                                            a2 = bov0.e;
                                        }
                                        yit0Var.c(a2);
                                        slsVar3.invoke();
                                        break;
                                }
                                return zy11Var;
                            }
                        }), new y9l0(ModalViewOrigin.SUMMARY, RouteSelectorOpenReason.SUMMARY, str8, str6, str7, null, 64), hxx.a);
                        return zy11.a;
                    }
                    a = (zud0) sourcePointRouteSelectorNavigationInteractor$showRouteSelectorFromSummaryOnOrderButtonClick$1.L$2;
                    slsVar = (sls) sourcePointRouteSelectorNavigationInteractor$showRouteSelectorFromSummaryOnOrderButtonClick$1.L$1;
                    ?? r10 = (sls) sourcePointRouteSelectorNavigationInteractor$showRouteSelectorFromSummaryOnOrderButtonClick$1.L$0;
                    kotlin.b.b(obj2);
                    obj = obj2;
                    ozbVar3 = r10;
                }
                String str11 = (String) obj;
                zud0Var = a;
                str2 = str11;
                if (zud0Var != null) {
                }
                if (zud0Var == null) {
                }
                sourcePointRouteSelectorNavigationInteractor$showRouteSelectorFromSummaryOnOrderButtonClick$1.L$0 = ozbVar3;
                sourcePointRouteSelectorNavigationInteractor$showRouteSelectorFromSummaryOnOrderButtonClick$1.L$1 = slsVar;
                sourcePointRouteSelectorNavigationInteractor$showRouteSelectorFromSummaryOnOrderButtonClick$1.L$2 = null;
                sourcePointRouteSelectorNavigationInteractor$showRouteSelectorFromSummaryOnOrderButtonClick$1.L$3 = str2;
                sourcePointRouteSelectorNavigationInteractor$showRouteSelectorFromSummaryOnOrderButtonClick$1.L$4 = str3;
                sourcePointRouteSelectorNavigationInteractor$showRouteSelectorFromSummaryOnOrderButtonClick$1.label = 2;
                ClarifyAddressBeforeOrderExperiment clarifyAddressBeforeOrderExperiment3 = (ClarifyAddressBeforeOrderExperiment) pzbVar.a.b.getValue();
                Y = d6z.Y(clarifyAddressBeforeOrderExperiment3, clarifyAddressBeforeOrderExperiment3.f);
                if (evu0.J(Y)) {
                }
                if (Y != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
        }
        sourcePointRouteSelectorNavigationInteractor$showRouteSelectorFromSummaryOnOrderButtonClick$1 = new SourcePointRouteSelectorNavigationInteractor$showRouteSelectorFromSummaryOnOrderButtonClick$1(this, continuationImpl);
        Object obj22 = sourcePointRouteSelectorNavigationInteractor$showRouteSelectorFromSummaryOnOrderButtonClick$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sourcePointRouteSelectorNavigationInteractor$showRouteSelectorFromSummaryOnOrderButtonClick$1.label;
        pzb pzbVar2 = this.q;
        final int i32 = 1;
        if (i != 0) {
        }
        String str112 = (String) obj;
        zud0Var = a;
        str2 = str112;
        if (zud0Var != null) {
        }
        if (zud0Var == null) {
        }
        sourcePointRouteSelectorNavigationInteractor$showRouteSelectorFromSummaryOnOrderButtonClick$1.L$0 = ozbVar3;
        sourcePointRouteSelectorNavigationInteractor$showRouteSelectorFromSummaryOnOrderButtonClick$1.L$1 = slsVar;
        sourcePointRouteSelectorNavigationInteractor$showRouteSelectorFromSummaryOnOrderButtonClick$1.L$2 = null;
        sourcePointRouteSelectorNavigationInteractor$showRouteSelectorFromSummaryOnOrderButtonClick$1.L$3 = str2;
        sourcePointRouteSelectorNavigationInteractor$showRouteSelectorFromSummaryOnOrderButtonClick$1.L$4 = str3;
        sourcePointRouteSelectorNavigationInteractor$showRouteSelectorFromSummaryOnOrderButtonClick$1.label = 2;
        ClarifyAddressBeforeOrderExperiment clarifyAddressBeforeOrderExperiment32 = (ClarifyAddressBeforeOrderExperiment) pzbVar2.a.b.getValue();
        Y = d6z.Y(clarifyAddressBeforeOrderExperiment32, clarifyAddressBeforeOrderExperiment32.f);
        if (evu0.J(Y)) {
        }
        if (Y != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
