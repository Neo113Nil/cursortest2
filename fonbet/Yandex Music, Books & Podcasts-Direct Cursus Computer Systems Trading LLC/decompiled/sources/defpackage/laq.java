package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.yandex.music.shared.ynison.api.queue.YnisonOptionCommand$RepeatToggle;
import com.yandex.music.shared.ynison.api.queue.YnisonOptionCommand$ShuffleWithIndices;
import com.yandex.passport.internal.properties.l;
import com.yandex.passport.internal.ui.bouncer.model.b1;
import com.yandex.passport.internal.ui.bouncer.model.c0;
import com.yandex.passport.internal.ui.bouncer.model.d0;
import com.yandex.passport.internal.ui.bouncer.model.l1;
import com.yandex.passport.internal.ui.bouncer.model.l2;
import com.yandex.passport.internal.ui.bouncer.model.middleware.v0;
import com.yandex.passport.internal.ui.bouncer.model.n2;
import com.yandex.passport.internal.ui.bouncer.model.o;
import com.yandex.passport.internal.ui.bouncer.model.r;
import com.yandex.passport.internal.ui.bouncer.model.r1;
import com.yandex.plus.domain.auth.api.e;
import com.yandex.plus.home.feature.webviews.internal.home.g;
import com.yandex.plus.home.feature.webviews.internal.stories.k;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.i;
import com.yandex.plus.home.internal.di.y;
import com.yandex.plus.home.t;
import com.yandex.plus.pay.ui.common.api.ui.view.ProgressView;
import com.yandex.plus.pay.ui.core.debug.internal.ui.form.h;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.j;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.content.c;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.counter_offers.f;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.b;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.a;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup.d;
import com.yandex.plus.pay.ui.yb.web.internal.ui.PlusPayYbWebActivity;
import com.yandex.plus.webview.api.WebViewContainer;
import io.appmetrica.analytics.IReporterYandex;
import io.appmetrica.analytics.UserInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class laq extends aur implements pyc {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ laq(Object obj, Continuation continuation, int i) {
        super(3, continuation);
        this.j = i;
        this.l = obj;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.j) {
            case 0:
                laq laqVar = new laq(3, 0, (Continuation) obj3);
                laqVar.k = (wpw) obj;
                laqVar.l = (YnisonOptionCommand$ShuffleWithIndices) obj2;
                return laqVar.invokeSuspend(Unit.a);
            case 1:
                laq laqVar2 = new laq(3, 1, (Continuation) obj3);
                laqVar2.k = (wpw) obj;
                laqVar2.l = (YnisonOptionCommand$RepeatToggle) obj2;
                return laqVar2.invokeSuspend(Unit.a);
            case 2:
                laq laqVar3 = new laq(3, 2, (Continuation) obj3);
                laqVar3.k = (yxc) obj;
                laqVar3.l = (u6m) obj2;
                return laqVar3.invokeSuspend(Unit.a);
            case 3:
                laq laqVar4 = new laq(3, 3, (Continuation) obj3);
                laqVar4.k = (xyo) obj;
                laqVar4.l = (grq) obj2;
                return laqVar4.invokeSuspend(Unit.a);
            case 4:
                laq laqVar5 = new laq(3, 4, (Continuation) obj3);
                laqVar5.k = (x66) obj;
                laqVar5.l = (crp) obj2;
                return laqVar5.invokeSuspend(Unit.a);
            case 5:
                laq laqVar6 = new laq(3, 5, (Continuation) obj3);
                laqVar6.k = (tru) obj;
                laqVar6.l = (e6l) obj2;
                return laqVar6.invokeSuspend(Unit.a);
            case 6:
                laq laqVar7 = new laq(3, 6, (Continuation) obj3);
                laqVar7.k = (List) obj;
                laqVar7.l = (yyb) obj2;
                return laqVar7.invokeSuspend(Unit.a);
            case 7:
                laq laqVar8 = new laq((ccw) this.l, (Continuation) obj3, 7);
                laqVar8.k = (Throwable) obj2;
                return laqVar8.invokeSuspend(Unit.a);
            case 8:
                laq laqVar9 = new laq((v0) this.l, (Continuation) obj3, 8);
                laqVar9.k = (l1) obj2;
                return laqVar9.invokeSuspend(Unit.a);
            case 9:
                laq laqVar10 = new laq((t) this.l, (Continuation) obj3, 9);
                laqVar10.k = (e) obj2;
                return laqVar10.invokeSuspend(Unit.a);
            case 10:
                laq laqVar11 = new laq((g) this.l, (Continuation) obj3, 10);
                laqVar11.k = (i) obj2;
                return laqVar11.invokeSuspend(Unit.a);
            case 11:
                laq laqVar12 = new laq((g) this.l, (Continuation) obj3, 11);
                laqVar12.k = (String) obj2;
                return laqVar12.invokeSuspend(Unit.a);
            case 12:
                laq laqVar13 = new laq((com.yandex.plus.home.feature.webviews.internal.smart.e) this.l, (Continuation) obj3, 12);
                laqVar13.k = (i) obj2;
                return laqVar13.invokeSuspend(Unit.a);
            case 13:
                laq laqVar14 = new laq((com.yandex.plus.home.feature.webviews.internal.smart.e) this.l, (Continuation) obj3, 13);
                laqVar14.k = (String) obj2;
                return laqVar14.invokeSuspend(Unit.a);
            case 14:
                laq laqVar15 = new laq((k) this.l, (Continuation) obj3, 14);
                laqVar15.k = (i) obj2;
                return laqVar15.invokeSuspend(Unit.a);
            case 15:
                laq laqVar16 = new laq((k) this.l, (Continuation) obj3, 15);
                laqVar16.k = (String) obj2;
                return laqVar16.invokeSuspend(Unit.a);
            case 16:
                laq laqVar17 = new laq((com.yandex.plus.pay.ui.core.debug.internal.ui.form.e) this.l, (Continuation) obj3, 16);
                laqVar17.k = (h) obj2;
                return laqVar17.invokeSuspend(Unit.a);
            case 17:
                laq laqVar18 = new laq((j) this.l, (Continuation) obj3, 17);
                laqVar18.k = (com.yandex.plus.pay.ui.core.mobile.view.toolbar.h) obj2;
                return laqVar18.invokeSuspend(Unit.a);
            case 18:
                laq laqVar19 = new laq((c) this.l, (Continuation) obj3, 18);
                laqVar19.k = (com.yandex.plus.pay.ui.core.mobile.view.toolbar.h) obj2;
                return laqVar19.invokeSuspend(Unit.a);
            case 19:
                laq laqVar20 = new laq((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.g) this.l, (Continuation) obj3, 19);
                laqVar20.k = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.j) obj2;
                return laqVar20.invokeSuspend(Unit.a);
            case 20:
                laq laqVar21 = new laq((f) this.l, (Continuation) obj3, 20);
                laqVar21.k = (com.yandex.plus.pay.ui.core.mobile.view.toolbar.h) obj2;
                return laqVar21.invokeSuspend(Unit.a);
            case 21:
                laq laqVar22 = new laq((b) this.l, (Continuation) obj3, 21);
                laqVar22.k = (com.yandex.plus.pay.ui.core.mobile.view.toolbar.h) obj2;
                return laqVar22.invokeSuspend(Unit.a);
            case 22:
                laq laqVar23 = new laq((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.e) this.l, (Continuation) obj3, 22);
                laqVar23.k = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.f) obj2;
                return laqVar23.invokeSuspend(Unit.a);
            case 23:
                laq laqVar24 = new laq((a) this.l, (Continuation) obj3, 23);
                laqVar24.k = (com.yandex.plus.pay.ui.core.mobile.view.toolbar.h) obj2;
                return laqVar24.invokeSuspend(Unit.a);
            case 24:
                laq laqVar25 = new laq((com.yandex.plus.pay.ui.core.internal.tarifficator.ui.success.p001native.c) this.l, (Continuation) obj3, 24);
                laqVar25.k = (com.yandex.plus.pay.ui.core.mobile.view.toolbar.h) obj2;
                return laqVar25.invokeSuspend(Unit.a);
            case 25:
                laq laqVar26 = new laq((d) this.l, (Continuation) obj3, 25);
                laqVar26.k = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup.g) obj2;
                return laqVar26.invokeSuspend(Unit.a);
            case 26:
                laq laqVar27 = new laq((PlusPayYbWebActivity) this.l, (Continuation) obj3, 26);
                laqVar27.k = (com.yandex.plus.pay.ui.yb.web.internal.ui.f) obj2;
                return laqVar27.invokeSuspend(Unit.a);
            default:
                laq laqVar28 = new laq((PlusPayYbWebActivity) this.l, (Continuation) obj3, 27);
                laqVar28.k = (com.yandex.plus.pay.ui.yb.web.internal.ui.e) obj2;
                return laqVar28.invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:166:0x0609  */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        s9p i0;
        List<n2> list;
        int i = 2;
        int i2 = 0;
        switch (this.j) {
            case 0:
                wpw wpwVar = (wpw) this.k;
                YnisonOptionCommand$ShuffleWithIndices ynisonOptionCommand$ShuffleWithIndices = (YnisonOptionCommand$ShuffleWithIndices) this.l;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                r5 = ynisonOptionCommand$ShuffleWithIndices.getIndices() != null;
                int originalPosition = ynisonOptionCommand$ShuffleWithIndices.getOriginalPosition();
                hqw b = wpwVar.b();
                if (b != null) {
                    if (b instanceof gqw) {
                        gqw gqwVar = (gqw) b;
                        gqwVar.f(r5);
                        gqwVar.e(originalPosition);
                    } else if (!(b instanceof cqw) && !(b instanceof aqw) && !(b instanceof bqw)) {
                        b6e.s();
                        return null;
                    }
                }
                return Unit.a;
            case 1:
                wpw wpwVar2 = (wpw) this.k;
                YnisonOptionCommand$RepeatToggle ynisonOptionCommand$RepeatToggle = (YnisonOptionCommand$RepeatToggle) this.l;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                nyn mode = ynisonOptionCommand$RepeatToggle.getMode();
                wpwVar2.getClass();
                mode.getClass();
                hqw b2 = wpwVar2.b();
                if (b2 != null) {
                    if (b2 instanceof gqw) {
                        gqw gqwVar2 = (gqw) b2;
                        ssg.a(4, "YnisonRemoteQueue", "repeat " + mode, null);
                        gqwVar2.b().c.a(new ppw(mode, gqwVar2.a().b()));
                    } else if (!(b2 instanceof cqw) && !(b2 instanceof aqw) && !(b2 instanceof bqw)) {
                        b6e.s();
                        return null;
                    }
                }
                return Unit.a;
            case 2:
                yxc yxcVar = (yxc) this.k;
                u6m u6mVar = (u6m) this.l;
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                if (yxcVar.a.d && yxcVar.h) {
                    r5 = false;
                }
                return new Pair(Boolean.valueOf(r5), u6mVar);
            case 3:
                xyo xyoVar = (xyo) this.k;
                grq grqVar = (grq) this.l;
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                if (xyoVar instanceof vyo) {
                    return ld6.a;
                }
                if (xyoVar instanceof wyo) {
                    bu8 bu8Var = (bu8) ((wyo) xyoVar).a;
                    grqVar.getClass();
                    return new nd6(bu8Var, grqVar != grq.a);
                }
                if (xyoVar == null) {
                    return pd6.a;
                }
                b6e.s();
                return null;
            case 4:
                x66 x66Var = (x66) this.k;
                crp crpVar = (crp) this.l;
                nm6 nm6Var5 = nm6.a;
                qgg.h0(obj);
                int ordinal = crpVar.ordinal();
                if (ordinal == 0) {
                    return x66Var.a ? rqp.a : rqp.d;
                }
                if (ordinal == 1) {
                    return rqp.b;
                }
                if (ordinal == 2) {
                    return rqp.c;
                }
                b6e.s();
                return null;
            case 5:
                tru truVar = (tru) this.k;
                e6l e6lVar = (e6l) this.l;
                nm6 nm6Var6 = nm6.a;
                qgg.h0(obj);
                if (!(truVar instanceof sru)) {
                    if ((truVar instanceof pru) || (truVar instanceof rru) || (truVar instanceof qru)) {
                        return truVar;
                    }
                    b6e.s();
                    return null;
                }
                d6l x = p6g.x(e6lVar);
                if (x != null) {
                    u3q g = x.a.g();
                    e5q e5qVar = g instanceof e5q ? (e5q) g : null;
                    if (e5qVar != null) {
                        i0 = hdg.i0(e5qVar);
                        boolean C = p6g.C(e6lVar);
                        sru sruVar = (sru) truVar;
                        List<Object> list2 = sruVar.b;
                        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
                        for (Object obj2 : list2) {
                            if (!(obj2 instanceof fsu)) {
                                if (!(obj2 instanceof gsu)) {
                                    b6e.s();
                                    return null;
                                }
                                obj2 = gsu.c((gsu) obj2, null, (i0 == null || !((gsu) obj2).f.b.b(i0)) ? mhi.a : C ? mhi.b : mhi.c, 47);
                            }
                            arrayList.add(obj2);
                        }
                        return sru.a(sruVar, false, arrayList, false, 5);
                    }
                }
                i0 = null;
                boolean C2 = p6g.C(e6lVar);
                sru sruVar2 = (sru) truVar;
                List<Object> list22 = sruVar2.b;
                ArrayList arrayList2 = new ArrayList(v75.o(list22, 10));
                while (r4.hasNext()) {
                }
                return sru.a(sruVar2, false, arrayList2, false, 5);
            case 6:
                List list3 = (List) this.k;
                yyb yybVar = (yyb) this.l;
                nm6 nm6Var7 = nm6.a;
                qgg.h0(obj);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : list3) {
                    jja jjaVar = (jja) obj3;
                    if (jjaVar.c != hja.d && jjaVar.a.k == dg2.b) {
                        arrayList3.add(obj3);
                    }
                }
                return new kvu(arrayList3, yybVar == yyb.c);
            case 7:
                Throwable th = (Throwable) this.k;
                nm6 nm6Var8 = nm6.a;
                qgg.h0(obj);
                ssg.a(4, ccw.l, "stop events: " + th + " (timestamp=" + ccw.b((ccw) this.l) + ")", null);
                return Unit.a;
            case 8:
                l1 l1Var = (l1) this.k;
                nm6 nm6Var9 = nm6.a;
                qgg.h0(obj);
                b1 b1Var = l1Var.d;
                if (b1Var == null || (list = b1Var.b) == null) {
                    l lVar = l1Var.c;
                    return lVar != null ? new r(lVar) : new o("RestartActor", "No bouncer parameters in current state", null);
                }
                boolean isEmpty = list.isEmpty();
                l lVar2 = b1Var.a;
                if (!isEmpty) {
                    return new d0(new r1(lVar2, list));
                }
                ArrayList arrayList4 = new ArrayList();
                for (n2 n2Var : list) {
                    if (n2Var instanceof l2) {
                        arrayList4.add(((l2) n2Var).a);
                    }
                }
                return new c0(lVar2, arrayList4, null, b1Var.e, b1Var.f, false, null, null, 192);
            case 9:
                e eVar = (e) this.k;
                nm6 nm6Var10 = nm6.a;
                qgg.h0(obj);
                t tVar = (t) this.l;
                com.yandex.plus.core.analytics.metrica.h hVar = (com.yandex.plus.core.analytics.metrica.h) tVar.d.z.getValue();
                if (hVar != null) {
                    com.yandex.plus.core.analytics.logging.d dVar = tVar.b.x;
                    com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
                    if (dVar.b(aVar)) {
                        dVar.a(aVar, "PlusHomeSdkImpl", "Update analytics user consumer: account=" + eVar, null);
                    }
                    Long id = eVar.getId();
                    String l = id != null ? id.toString() : null;
                    if (l != null) {
                        IReporterYandex iReporterYandex = hVar.b;
                        iReporterYandex.reportUserInfoEvent(new UserInfo(l));
                        iReporterYandex.setUserProfileID(l);
                        ((com.yandex.plus.metrica.utils.j) hVar.a).a(l);
                    } else {
                        IReporterYandex iReporterYandex2 = hVar.b;
                        iReporterYandex2.reportUserInfoEvent(new UserInfo(null));
                        iReporterYandex2.setUserProfileID(null);
                        ((com.yandex.plus.metrica.utils.j) hVar.a).a(null);
                    }
                }
                return Unit.a;
            case 10:
                i iVar = (i) this.k;
                nm6 nm6Var11 = nm6.a;
                qgg.h0(obj);
                ((com.yandex.plus.home.feature.webviews.internal.home.a) ((g) this.l).e).d(iVar);
                return Unit.a;
            case 11:
                String str = (String) this.k;
                nm6 nm6Var12 = nm6.a;
                qgg.h0(obj);
                ((com.yandex.plus.home.feature.webviews.internal.home.a) ((g) this.l).e).g(str);
                return Unit.a;
            case 12:
                i iVar2 = (i) this.k;
                nm6 nm6Var13 = nm6.a;
                qgg.h0(obj);
                ((com.yandex.plus.home.feature.webviews.internal.smart.j) ((com.yandex.plus.home.feature.webviews.internal.smart.e) this.l).e).d(iVar2);
                return Unit.a;
            case 13:
                String str2 = (String) this.k;
                nm6 nm6Var14 = nm6.a;
                qgg.h0(obj);
                ((com.yandex.plus.home.feature.webviews.internal.smart.j) ((com.yandex.plus.home.feature.webviews.internal.smart.e) this.l).e).g(str2);
                return Unit.a;
            case 14:
                i iVar3 = (i) this.k;
                nm6 nm6Var15 = nm6.a;
                qgg.h0(obj);
                ((com.yandex.plus.home.feature.webviews.internal.stories.c) ((k) this.l).e).d(iVar3);
                return Unit.a;
            case 15:
                String str3 = (String) this.k;
                nm6 nm6Var16 = nm6.a;
                qgg.h0(obj);
                ((com.yandex.plus.home.feature.webviews.internal.stories.c) ((k) this.l).e).g(str3);
                return Unit.a;
            case 16:
                h hVar2 = (h) this.k;
                nm6 nm6Var17 = nm6.a;
                qgg.h0(obj);
                com.yandex.plus.pay.ui.core.debug.internal.ui.form.e eVar2 = (com.yandex.plus.pay.ui.core.debug.internal.ui.form.e) this.l;
                s9f[] s9fVarArr = com.yandex.plus.pay.ui.core.debug.internal.ui.form.e.o;
                if (hVar2 instanceof com.yandex.plus.pay.ui.core.debug.internal.ui.form.g) {
                    ((ProgressView) eVar2.j.x(com.yandex.plus.pay.ui.core.debug.internal.ui.form.e.o[1])).setVisibility(0);
                    eVar2.x().setVisibility(8);
                } else {
                    if (!(hVar2 instanceof com.yandex.plus.pay.ui.core.debug.internal.ui.form.f)) {
                        b6e.s();
                        return null;
                    }
                    com.yandex.plus.pay.ui.core.debug.internal.domain.form.d dVar2 = ((com.yandex.plus.pay.ui.core.debug.internal.ui.form.f) hVar2).a;
                    com.yandex.plus.pay.ui.core.debug.internal.ui.form.web.a aVar2 = (com.yandex.plus.pay.ui.core.debug.internal.ui.form.web.a) eVar2.m.getValue();
                    List list4 = dVar2.b;
                    aVar2.getClass();
                    aVar2.b = list4;
                    String str4 = eVar2.n;
                    String str5 = dVar2.a;
                    if (!Intrinsics.d(str4, str5)) {
                        com.yandex.plus.webview.internal.f fVar = eVar2.l;
                        if (fVar != null) {
                            fVar.n(str5, null);
                        }
                        eVar2.n = str5;
                    }
                }
                return Unit.a;
            case 17:
                com.yandex.plus.pay.ui.core.mobile.view.toolbar.h hVar3 = (com.yandex.plus.pay.ui.core.mobile.view.toolbar.h) this.k;
                nm6 nm6Var18 = nm6.a;
                qgg.h0(obj);
                j jVar = (j) this.l;
                hVar3.getClass();
                jVar.u.a(hVar3);
                return Unit.a;
            case 18:
                com.yandex.plus.pay.ui.core.mobile.view.toolbar.h hVar4 = (com.yandex.plus.pay.ui.core.mobile.view.toolbar.h) this.k;
                nm6 nm6Var19 = nm6.a;
                qgg.h0(obj);
                c cVar = (c) this.l;
                hVar4.getClass();
                ((com.yandex.plus.pay.ui.core.mobile.view.toolbar.i) cVar.m.getValue()).a(hVar4);
                return Unit.a;
            case 19:
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.j jVar2 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.j) this.k;
                nm6 nm6Var20 = nm6.a;
                qgg.h0(obj);
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.g gVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.g) this.l;
                com.yandex.passport.internal.core.accounts.h hVar5 = gVar.l;
                s9f[] s9fVarArr2 = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.g.q;
                if (jVar2 instanceof com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.i) {
                    ((View) hVar5.x(com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.g.q[2])).setVisibility(0);
                    gVar.A().setVisibility(8);
                    gVar.y().setVisibility(8);
                } else {
                    if (!(jVar2 instanceof com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.h)) {
                        b6e.s();
                        return null;
                    }
                    gVar.y().setVisibility(0);
                    String str6 = gVar.o;
                    com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.h hVar6 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.h) jVar2;
                    String str7 = hVar6.a;
                    if (!Intrinsics.d(str6, str7)) {
                        gVar.o = str7;
                        WebViewContainer A = gVar.A();
                        com.yandex.plus.home.plaque.plugin.internal.proxy.a h = com.yandex.plus.bdui.plus.analytics.b.h(t75.c(((com.yandex.plus.pay.ui.webview.paymentwidget.ui.c) gVar.x().a.J0.getValue()).a("contacts", 10000L, 10000L, new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.b(gVar, i2))));
                        com.yandex.plus.core.network.ssl.a a = gVar.x().a.t.a("TarifficatorContacts");
                        ((com.yandex.plus.core.dispatcher.a) gVar.x().a.i).getClass();
                        com.yandex.plus.webview.api.c cVar2 = new com.yandex.plus.webview.api.c(A, h, a, false, com.yandex.plus.core.dispatcher.a.c, gVar.x().a.g);
                        com.yandex.plus.webview.api.request.b bVar = (com.yandex.plus.webview.api.request.b) gVar.x().a.G.getValue();
                        bVar.getClass();
                        cVar2.l = bVar;
                        cVar2.n = 20000L;
                        cVar2.o = new y((View) hVar5.x(com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.g.q[2]), gVar.A());
                        cVar2.m = false;
                        com.yandex.plus.webview.internal.f a2 = cVar2.a();
                        gVar.p = a2;
                        a2.n(str7, null);
                    }
                    gVar.y().setText(hVar6.b);
                }
                return Unit.a;
            case 20:
                com.yandex.plus.pay.ui.core.mobile.view.toolbar.h hVar7 = (com.yandex.plus.pay.ui.core.mobile.view.toolbar.h) this.k;
                nm6 nm6Var21 = nm6.a;
                qgg.h0(obj);
                f fVar2 = (f) this.l;
                hVar7.getClass();
                fVar2.m.a(hVar7);
                return Unit.a;
            case 21:
                com.yandex.plus.pay.ui.core.mobile.view.toolbar.h hVar8 = (com.yandex.plus.pay.ui.core.mobile.view.toolbar.h) this.k;
                nm6 nm6Var22 = nm6.a;
                qgg.h0(obj);
                ((b) this.l).b(hVar8);
                return Unit.a;
            case 22:
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.f fVar3 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.f) this.k;
                nm6 nm6Var23 = nm6.a;
                qgg.h0(obj);
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.e eVar3 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.e) this.l;
                s9f[] s9fVarArr3 = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.e.p;
                if (fVar3 == null) {
                    b6e.s();
                    return null;
                }
                Context requireContext = eVar3.requireContext();
                requireContext.getClass();
                String str8 = fVar3.a;
                String str9 = fVar3.b;
                String str10 = fVar3.c;
                try {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType(str10);
                    intent.putExtra("android.intent.extra.TITLE", str8);
                    intent.putExtra("android.intent.extra.TEXT", str9);
                    Intent createChooser = Intent.createChooser(intent, null);
                    createChooser.addFlags(268435456);
                    requireContext.startActivity(createChooser);
                } catch (ActivityNotFoundException e) {
                    com.yandex.plus.pay.log.impl.b bVar2 = eVar3.x().a.g;
                    com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.e;
                    bVar2.getClass();
                    bVar2.a(aVar3, "FamilyFragment", "There is no intent handler for sharing", e);
                }
                return Unit.a;
            case 23:
                com.yandex.plus.pay.ui.core.mobile.view.toolbar.h hVar9 = (com.yandex.plus.pay.ui.core.mobile.view.toolbar.h) this.k;
                nm6 nm6Var24 = nm6.a;
                qgg.h0(obj);
                a aVar4 = (a) this.l;
                hVar9.getClass();
                aVar4.k.a(hVar9);
                return Unit.a;
            case 24:
                com.yandex.plus.pay.ui.core.mobile.view.toolbar.h hVar10 = (com.yandex.plus.pay.ui.core.mobile.view.toolbar.h) this.k;
                nm6 nm6Var25 = nm6.a;
                qgg.h0(obj);
                com.yandex.plus.pay.ui.core.internal.tarifficator.ui.success.p001native.c cVar3 = (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.success.p001native.c) this.l;
                hVar10.getClass();
                cVar3.g.a(hVar10);
                return Unit.a;
            case 25:
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup.g gVar2 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup.g) this.k;
                nm6 nm6Var26 = nm6.a;
                qgg.h0(obj);
                d dVar3 = (d) this.l;
                com.yandex.passport.internal.core.accounts.h hVar11 = dVar3.i;
                s9f[] s9fVarArr4 = d.m;
                if (gVar2 instanceof com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup.f) {
                    ((ProgressView) hVar11.x(d.m[0])).setVisibility(0);
                    dVar3.z().setVisibility(8);
                } else {
                    if (!(gVar2 instanceof com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup.e)) {
                        b6e.s();
                        return null;
                    }
                    String str11 = dVar3.k;
                    com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup.e eVar4 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup.e) gVar2;
                    String str12 = eVar4.a;
                    if (!Intrinsics.d(str11, str12)) {
                        dVar3.k = str12;
                        long j = eVar4.c;
                        WebViewContainer z = dVar3.z();
                        com.yandex.plus.home.plaque.plugin.internal.proxy.a h2 = com.yandex.plus.bdui.plus.analytics.b.h(t75.c(((com.yandex.plus.pay.ui.webview.paymentwidget.ui.c) dVar3.x().a.J0.getValue()).a("topup", j, j, new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.b(dVar3, i))));
                        com.yandex.plus.core.network.ssl.a a3 = dVar3.x().a.t.a("TarifficatorTopup");
                        ((com.yandex.plus.core.dispatcher.a) dVar3.x().a.i).getClass();
                        com.yandex.plus.webview.api.c cVar4 = new com.yandex.plus.webview.api.c(z, h2, a3, false, com.yandex.plus.core.dispatcher.a.c, dVar3.x().a.g);
                        com.yandex.plus.webview.api.request.b bVar3 = (com.yandex.plus.webview.api.request.b) dVar3.x().a.G.getValue();
                        bVar3.getClass();
                        cVar4.l = bVar3;
                        cVar4.n = j + j;
                        cVar4.o = new y((View) hVar11.x(d.m[0]), dVar3.z());
                        cVar4.m = false;
                        com.yandex.plus.webview.internal.f a4 = cVar4.a();
                        dVar3.l = a4;
                        a4.n(str12, null);
                    }
                }
                return Unit.a;
            case 26:
                com.yandex.plus.pay.ui.yb.web.internal.ui.f fVar4 = (com.yandex.plus.pay.ui.yb.web.internal.ui.f) this.k;
                nm6 nm6Var27 = nm6.a;
                qgg.h0(obj);
                PlusPayYbWebActivity plusPayYbWebActivity = (PlusPayYbWebActivity) this.l;
                com.yandex.plus.bdui.plus.content.controller.f fVar5 = plusPayYbWebActivity.h;
                if (!plusPayYbWebActivity.e) {
                    com.yandex.plus.pay.ui.yb.web.internal.di.c cVar5 = plusPayYbWebActivity.c;
                    if (cVar5 == null) {
                        xq0.x("YbWebComponent must be set");
                        return null;
                    }
                    long j2 = fVar4.b;
                    long j3 = fVar4.c;
                    s9f[] s9fVarArr5 = PlusPayYbWebActivity.i;
                    WebViewContainer webViewContainer = (WebViewContainer) fVar5.g(s9fVarArr5[2]);
                    com.yandex.plus.home.plaque.plugin.internal.proxy.a h3 = com.yandex.plus.bdui.plus.analytics.b.h(t75.c(cVar5.a.a("yb_binding", j2, j3, new com.yandex.plus.home.plaque.plugin.internal.proxy.a(22, plusPayYbWebActivity))));
                    com.yandex.plus.core.network.ssl.a a5 = cVar5.e.a("YbBinding");
                    ((com.yandex.plus.core.dispatcher.a) cVar5.d).getClass();
                    com.yandex.plus.webview.api.c cVar6 = new com.yandex.plus.webview.api.c(webViewContainer, h3, a5, false, com.yandex.plus.core.dispatcher.a.c, cVar5.b);
                    cVar6.o = new y((View) plusPayYbWebActivity.g.g(s9fVarArr5[1]), (WebViewContainer) fVar5.g(s9fVarArr5[2]));
                    com.yandex.plus.pay.ui.webview.common.diagnostic.c cVar7 = (com.yandex.plus.pay.ui.webview.common.diagnostic.c) cVar5.g.getValue();
                    cVar7.getClass();
                    cVar6.l = cVar7;
                    cVar6.n = j2 + j3;
                    cVar6.m = false;
                    com.yandex.plus.webview.internal.f a6 = cVar6.a();
                    plusPayYbWebActivity.e = true;
                    a6.n(fVar4.a, null);
                }
                return Unit.a;
            default:
                com.yandex.plus.pay.ui.yb.web.internal.ui.e eVar5 = (com.yandex.plus.pay.ui.yb.web.internal.ui.e) this.k;
                nm6 nm6Var28 = nm6.a;
                qgg.h0(obj);
                PlusPayYbWebActivity plusPayYbWebActivity2 = (PlusPayYbWebActivity) this.l;
                s9f[] s9fVarArr6 = PlusPayYbWebActivity.i;
                if (eVar5 != null) {
                    plusPayYbWebActivity2.finish();
                    return Unit.a;
                }
                b6e.s();
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ laq(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.j = i2;
    }
}
