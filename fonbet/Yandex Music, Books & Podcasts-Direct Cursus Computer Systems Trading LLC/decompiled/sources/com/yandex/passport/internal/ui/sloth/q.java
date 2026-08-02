package com.yandex.passport.internal.ui.sloth;

import android.app.Activity;
import android.view.View;
import com.yandex.passport.api.z1;
import com.yandex.passport.data.network.f7;
import com.yandex.passport.data.network.j7;
import com.yandex.passport.data.network.k7;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.kb;
import com.yandex.passport.internal.report.mb;
import com.yandex.passport.internal.report.reporters.o1;
import com.yandex.passport.internal.report.reporters.q1;
import com.yandex.passport.internal.report.reporters.r1;
import com.yandex.passport.internal.report.reporters.z0;
import com.yandex.passport.internal.report.ve;
import com.yandex.passport.internal.report.ze;
import com.yandex.passport.internal.ui.sloth.authsdk.AuthSdkSlothActivity;
import com.yandex.passport.internal.ui.sloth.menu.UserMenuActivity;
import com.yandex.passport.internal.ui.sloth.plusdevices.ManagingPlusDevicesHelperActivity;
import com.yandex.passport.internal.ui.sloth.plusdevices.ManagingPlusDevicesSlothActivity;
import com.yandex.passport.internal.ui.sloth.webcard.WebCardSlothActivity;
import com.yandex.passport.internal.ui.sloth.webcard.f1;
import com.yandex.passport.internal.ui.sloth.webcard.h1;
import com.yandex.passport.internal.ui.sloth.webcard.k1;
import com.yandex.passport.internal.usecase.b2;
import com.yandex.passport.internal.usecase.c1;
import com.yandex.passport.internal.usecase.d1;
import com.yandex.passport.internal.usecase.v1;
import com.yandex.passport.sloth.b1;
import com.yandex.passport.sloth.data.n0;
import com.yandex.passport.sloth.data.o0;
import com.yandex.passport.sloth.ui.a1;
import com.yandex.passport.sloth.ui.v0;
import defpackage.aa0;
import defpackage.ak1;
import defpackage.aur;
import defpackage.b6e;
import defpackage.fgp;
import defpackage.fxf;
import defpackage.gld;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.ot0;
import defpackage.pjc;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.rar;
import defpackage.t75;
import defpackage.t7o;
import defpackage.wvs;
import defpackage.wwd;
import defpackage.x0q;
import defpackage.x97;
import defpackage.xpi;
import defpackage.xq0;
import defpackage.xz0;
import defpackage.y2x;
import defpackage.z7o;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(pjc pjcVar, Continuation continuation, Object obj, int i) {
        super(2, continuation);
        this.j = i;
        this.l = pjcVar;
        this.m = obj;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                q qVar = new q((StandaloneSlothActivity) this.m, continuation, 0);
                qVar.l = obj;
                return qVar;
            case 1:
                q qVar2 = new q((AuthSdkSlothActivity) this.m, continuation, 1);
                qVar2.l = obj;
                return qVar2;
            case 2:
                return new q((pjc) this.l, continuation, (o1) this.m, 2);
            case 3:
                return new q((pjc) this.l, continuation, (UserMenuActivity) this.m, 3);
            case 4:
                q qVar3 = new q((ManagingPlusDevicesHelperActivity) this.m, continuation, 4);
                qVar3.l = obj;
                return qVar3;
            case 5:
                return new q((pjc) this.l, continuation, (ManagingPlusDevicesHelperActivity) this.m, 5);
            case 6:
                return new q((com.yandex.plus.core.locale.b) this.l, (com.yandex.passport.internal.ui.sloth.plusdevices.j) this.m, continuation, 6);
            case 7:
                q qVar4 = new q((ManagingPlusDevicesSlothActivity) this.m, continuation, 7);
                qVar4.l = obj;
                return qVar4;
            case 8:
                q qVar5 = new q((com.yandex.passport.internal.ui.sloth.screen.i) this.m, continuation, 8);
                qVar5.l = obj;
                return qVar5;
            case 9:
                q qVar6 = new q((WebCardSlothActivity) this.m, continuation, 9);
                qVar6.l = obj;
                return qVar6;
            case 10:
                return new q((k1) this.m, continuation, 10);
            case 11:
                q qVar7 = new q((k1) this.m, continuation, 11);
                qVar7.l = obj;
                return qVar7;
            case 12:
                return new q((k1) this.l, (Throwable) this.m, continuation, 12);
            case 13:
                return new q((com.yandex.passport.internal.ui.social.authenticators.c) this.l, (com.yandex.passport.internal.entities.h) this.m, continuation, 13);
            case 14:
                return new q((com.yandex.passport.internal.ui.tv.d) this.l, (com.yandex.passport.internal.entities.h) this.m, continuation, 14);
            case 15:
                return new q((com.yandex.passport.internal.ui.util.j) this.l, (Activity) this.m, continuation, 15);
            case 16:
                return new q((d1) this.l, (c1) this.m, continuation, 16);
            case 17:
                return new q((b2) this.l, (v1) this.m, continuation, 17);
            case 18:
                return new q((fgp) this.l, (com.yandex.passport.sloth.ui.b) this.m, continuation, 18);
            case 19:
                return new q((com.yandex.passport.sloth.l) this.l, (List) this.m, continuation, 19);
            case 20:
                return new q((com.yandex.passport.sloth.j0) this.l, (String) this.m, continuation, 20);
            case 21:
                return new q((com.yandex.passport.sloth.j0) this.l, (b1) this.m, continuation, 21);
            case 22:
                return new q((a1) this.l, (com.yandex.passport.sloth.ui.webview.f) this.m, continuation, 22);
            case 23:
                return new q((com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.d) this.l, (com.yandex.plus.acquisition.sdk.pay.common.api.k) this.m, continuation, 23);
            case 24:
                return new q((com.yandex.plus.bdui.flex.ui.n) this.l, (com.yandex.passport.internal.entities.j) this.m, continuation, 24);
            case 25:
                return new q((com.yandex.plus.bdui.flex.ui.n) this.l, (com.yandex.plus.bdui.flex.ui.p) this.m, continuation, 25);
            case 26:
                q qVar8 = new q((com.yandex.plus.bdui.flex.ui.n) this.m, continuation, 26);
                qVar8.l = obj;
                return qVar8;
            case 27:
                return new q((com.yandex.passport.internal.entities.j) this.l, (aa0) this.m, continuation, 27);
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new q((com.yandex.plus.bdui.plus.checkout.action.f) this.l, (com.yandex.plus.bdui.plus.action.e) this.m, continuation, 28);
            default:
                return new q((com.yandex.plus.bdui.plus.checkout.content.controller.b0) this.l, (List) this.m, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
        }
        return ((q) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x028e, code lost:
    
        if (r0.d(r8, r26) == r6) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0246, code lost:
    
        if (r8.b(r10, r26) == r6) goto L133;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0552  */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r12v86 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [kotlin.coroutines.Continuation, kotlin.coroutines.CoroutineContext, pm6] */
    /* JADX WARN: Type inference failed for: r6v4 */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        k1 k1Var;
        ?? r6;
        Object g;
        Object obj2;
        Throwable a2;
        Object g2;
        char c;
        char c2;
        Object g3;
        Object b;
        String str;
        Object a3;
        int i = this.j;
        int i2 = 5;
        int i3 = 2;
        int i4 = 8;
        int i5 = 3;
        int i6 = 0;
        Object obj3 = this.m;
        switch (i) {
            case 0:
                mm6 mm6Var = (mm6) this.l;
                nm6 nm6Var = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    long a4 = com.yandex.passport.common.time.a.a(0, 0, 50);
                    this.l = mm6Var;
                    this.k = 1;
                    if (y2x.o(a4, this) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i7 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                if (gld.T(mm6Var)) {
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Manually recreating activity", 8);
                    }
                    ((StandaloneSlothActivity) obj3).recreate();
                }
                return Unit.a;
            case 1:
                mm6 mm6Var2 = (mm6) this.l;
                nm6 nm6Var2 = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    long X = fxf.X(0, 50);
                    this.l = mm6Var2;
                    this.k = 1;
                    if (y2x.o(X, this) == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i8 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                if (gld.T(mm6Var2)) {
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Manually recreating activity", 8);
                    }
                    ((AuthSdkSlothActivity) obj3).recreate();
                }
                return Unit.a;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    pjc pjcVar = (pjc) this.l;
                    com.yandex.passport.common.ui.compose.a aVar = new com.yandex.passport.common.ui.compose.a(7, (o1) obj3);
                    this.k = 1;
                    if (pjcVar.collect(aVar, this) == nm6Var3) {
                        return nm6Var3;
                    }
                } else {
                    if (i9 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 3:
                nm6 nm6Var4 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    pjc pjcVar2 = (pjc) this.l;
                    com.yandex.passport.common.ui.compose.a aVar2 = new com.yandex.passport.common.ui.compose.a(i4, (UserMenuActivity) obj3);
                    this.k = 1;
                    if (pjcVar2.collect(aVar2, this) == nm6Var4) {
                        return nm6Var4;
                    }
                } else {
                    if (i10 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 4:
                mm6 mm6Var3 = (mm6) this.l;
                nm6 nm6Var5 = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    long a5 = com.yandex.passport.common.time.a.a(0, 0, 50);
                    this.l = mm6Var3;
                    this.k = 1;
                    if (y2x.o(a5, this) == nm6Var5) {
                        return nm6Var5;
                    }
                } else {
                    if (i11 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                if (gld.T(mm6Var3)) {
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Manually recreating activity", 8);
                    }
                    ((ManagingPlusDevicesHelperActivity) obj3).recreate();
                }
                return Unit.a;
            case 5:
                nm6 nm6Var6 = nm6.a;
                int i12 = this.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    pjc pjcVar3 = (pjc) this.l;
                    com.yandex.passport.common.ui.compose.a aVar3 = new com.yandex.passport.common.ui.compose.a(9, (ManagingPlusDevicesHelperActivity) obj3);
                    this.k = 1;
                    if (pjcVar3.collect(aVar3, this) == nm6Var6) {
                        return nm6Var6;
                    }
                } else {
                    if (i12 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 6:
                com.yandex.passport.internal.ui.sloth.plusdevices.j jVar = (com.yandex.passport.internal.ui.sloth.plusdevices.j) obj3;
                nm6 nm6Var7 = nm6.a;
                int i13 = this.k;
                if (i13 != 0) {
                    if (i13 == 1) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                com.yandex.plus.core.locale.b bVar = (com.yandex.plus.core.locale.b) this.l;
                if (bVar instanceof com.yandex.passport.internal.ui.sloth.plusdevices.g) {
                    com.yandex.passport.internal.properties.o oVar = ((com.yandex.passport.internal.ui.sloth.plusdevices.g) bVar).a;
                    this.k = 1;
                    if (com.yandex.passport.internal.ui.sloth.plusdevices.j.a(jVar, oVar, this) == nm6Var7) {
                        return nm6Var7;
                    }
                } else {
                    if (!(bVar instanceof com.yandex.passport.internal.ui.sloth.plusdevices.h)) {
                        b6e.s();
                        return null;
                    }
                    com.yandex.passport.internal.ui.sloth.plusdevices.h hVar = (com.yandex.passport.internal.ui.sloth.plusdevices.h) bVar;
                    x97.y(ot0.F(jVar), null, null, new ak1(jVar, hVar.b, hVar.a, (Continuation) null, 16), 3);
                }
                return Unit.a;
            case 7:
                mm6 mm6Var4 = (mm6) this.l;
                nm6 nm6Var8 = nm6.a;
                int i14 = this.k;
                if (i14 == 0) {
                    qgg.h0(obj);
                    long X2 = fxf.X(0, 50);
                    this.l = mm6Var4;
                    this.k = 1;
                    if (y2x.o(X2, this) == nm6Var8) {
                        return nm6Var8;
                    }
                } else {
                    if (i14 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                if (gld.T(mm6Var4)) {
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Manually recreating activity", 8);
                    }
                    ((ManagingPlusDevicesSlothActivity) obj3).recreate();
                }
                return Unit.a;
            case 8:
                mm6 mm6Var5 = (mm6) this.l;
                nm6 nm6Var9 = nm6.a;
                int i15 = this.k;
                if (i15 == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.sloth.d1 d1Var = ((com.yandex.passport.internal.ui.sloth.screen.i) obj3).k;
                    CoroutineContext coroutineContext = mm6Var5.getCoroutineContext();
                    this.l = null;
                    this.k = 1;
                    if (d1Var.b(coroutineContext, this) == nm6Var9) {
                        return nm6Var9;
                    }
                } else {
                    if (i15 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 9:
                mm6 mm6Var6 = (mm6) this.l;
                nm6 nm6Var10 = nm6.a;
                int i16 = this.k;
                if (i16 == 0) {
                    qgg.h0(obj);
                    long X3 = fxf.X(0, 50);
                    this.l = mm6Var6;
                    this.k = 1;
                    if (y2x.o(X3, this) == nm6Var10) {
                        return nm6Var10;
                    }
                } else {
                    if (i16 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                if (gld.T(mm6Var6)) {
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Manually recreating activity", 8);
                    }
                    ((WebCardSlothActivity) obj3).recreate();
                }
                return Unit.a;
            case 10:
                k1 k1Var2 = (k1) obj3;
                nm6 nm6Var11 = nm6.a;
                int i17 = this.k;
                if (i17 == 0) {
                    qgg.h0(obj);
                    this.l = k1Var2;
                    this.k = 1;
                    a = k1.a(k1Var2, this);
                    if (a == nm6Var11) {
                        return nm6Var11;
                    }
                    k1Var = k1Var2;
                } else {
                    if (i17 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k1Var = (k1) this.l;
                    qgg.h0(obj);
                    a = obj;
                }
                k1Var.s = (com.yandex.passport.sloth.data.m) a;
                r1 r1Var = k1Var2.o;
                com.yandex.passport.sloth.data.m mVar = k1Var2.s;
                if (mVar == null) {
                    Intrinsics.j("slothParams");
                    throw null;
                }
                o0 o0Var = mVar.a;
                n0 n0Var = o0Var instanceof n0 ? (n0) o0Var : null;
                com.yandex.passport.sloth.data.h hVar2 = n0Var != null ? n0Var.e : null;
                int i18 = hVar2 == null ? -1 : h1.a[hVar2.ordinal()];
                if (i18 == 1) {
                    r1Var.u(q1.b);
                } else if (i18 == 2) {
                    r1Var.u(q1.a);
                }
                com.yandex.passport.internal.ui.sloth.webcard.a aVar4 = k1Var2.l;
                com.yandex.passport.sloth.data.m mVar2 = k1Var2.s;
                if (mVar2 == null) {
                    Intrinsics.j("slothParams");
                    throw null;
                }
                com.yandex.passport.common.network.n nVar = (com.yandex.passport.common.network.n) aVar4;
                nVar.getClass();
                com.yandex.passport.internal.flags.experiments.p pVar = new com.yandex.passport.internal.flags.experiments.p(i2);
                pVar.b = mVar2;
                pVar.c = new com.yandex.passport.sloth.dependencies.g(t75.c(((com.yandex.passport.internal.ui.sloth.webcard.b) nVar.b).a));
                pVar.d = ((com.yandex.passport.internal.sloth.k) nVar.c).a();
                k1Var2.r = pVar.t().a();
                return Unit.a;
            case 11:
                k1 k1Var3 = (k1) obj3;
                mm6 mm6Var7 = (mm6) this.l;
                nm6 nm6Var12 = nm6.a;
                int i19 = this.k;
                if (i19 == 0) {
                    qgg.h0(obj);
                    r6 = 0;
                    rar y = x97.y(mm6Var7, null, null, new q(k1Var3, false ? 1 : 0, 10), 3);
                    this.l = mm6Var7;
                    this.k = 1;
                    if (y.j0(this) == nm6Var12) {
                        return nm6Var12;
                    }
                } else {
                    if (i19 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    r6 = 0;
                }
                x97.y(mm6Var7, r6, r6, new f1(k1Var3, r6, i6), 3);
                x97.y(ot0.F(k1Var3), r6, r6, new f1(k1Var3, r6, i3), 3);
                x97.y(ot0.F(k1Var3), r6, r6, new f1(k1Var3, r6, i5), 3);
                x97.y(ot0.F(k1Var3), r6, r6, new f1(k1Var3, r6, 4), 3);
                x97.y(ot0.F(k1Var3), r6, r6, new f1(k1Var3, r6, i2), 3);
                x97.y(mm6Var7, r6, r6, new f1(k1Var3, r6, 1), 3);
                return Unit.a;
            case 12:
                nm6 nm6Var13 = nm6.a;
                int i20 = this.k;
                if (i20 == 0) {
                    qgg.h0(obj);
                    x0q x0qVar = ((k1) this.l).x;
                    com.yandex.passport.internal.sloth.performers.webcard.e eVar = new com.yandex.passport.internal.sloth.performers.webcard.e((Throwable) obj3);
                    this.k = 1;
                    if (x0qVar.emit(eVar, this) == nm6Var13) {
                        return nm6Var13;
                    }
                } else {
                    if (i20 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 13:
                com.yandex.passport.internal.ui.social.authenticators.c cVar = (com.yandex.passport.internal.ui.social.authenticators.c) this.l;
                Object obj4 = cVar.n;
                nm6 nm6Var14 = nm6.a;
                int i21 = this.k;
                if (i21 != 0) {
                    if (i21 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    g = obj;
                    obj2 = ((z7o) g).a;
                    if (!(obj2 instanceof t7o)) {
                        cVar.O((com.yandex.passport.internal.l) obj2);
                    }
                    a2 = z7o.a(obj2);
                    if (a2 != null) {
                        cVar.M(a2);
                    }
                    return Unit.a;
                }
                qgg.h0(obj);
                if (!(obj4 instanceof com.yandex.passport.internal.ui.social.g)) {
                    wvs.p("Internal error: onWebSocial only for SocialMode.WebViewSocial");
                    return null;
                }
                com.yandex.passport.internal.usecase.authorize.c cVar2 = cVar.v;
                com.yandex.passport.internal.analytics.a aVar5 = com.yandex.passport.internal.analytics.a.k;
                com.yandex.passport.internal.usecase.authorize.a aVar6 = new com.yandex.passport.internal.usecase.authorize.a((com.yandex.passport.internal.entities.h) obj3, new com.yandex.passport.internal.analytics.a(aVar5.a, aVar5.b, cVar.k.l), ((com.yandex.passport.internal.ui.social.g) obj4).c, 0L);
                this.k = 1;
                g = cVar2.g(aVar6, this);
                if (g == nm6Var14) {
                    return nm6Var14;
                }
                obj2 = ((z7o) g).a;
                if (!(obj2 instanceof t7o)) {
                }
                a2 = z7o.a(obj2);
                if (a2 != null) {
                }
                return Unit.a;
            case 14:
                com.yandex.passport.internal.ui.tv.d dVar = (com.yandex.passport.internal.ui.tv.d) this.l;
                nm6 nm6Var15 = nm6.a;
                int i22 = this.k;
                if (i22 == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.usecase.authorize.c cVar3 = dVar.q;
                    com.yandex.passport.internal.usecase.authorize.a aVar7 = new com.yandex.passport.internal.usecase.authorize.a((com.yandex.passport.internal.entities.h) obj3, com.yandex.passport.internal.analytics.a.i, null, 0L);
                    this.k = 1;
                    g2 = cVar3.g(aVar7, this);
                    if (g2 == nm6Var15) {
                        return nm6Var15;
                    }
                } else {
                    if (i22 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    g2 = obj;
                }
                Object obj5 = ((z7o) g2).a;
                if (!(obj5 instanceof t7o)) {
                    dVar.t.m((com.yandex.passport.internal.l) obj5);
                }
                Throwable a6 = z7o.a(obj5);
                if (a6 != null) {
                    dVar.l.m(Boolean.FALSE);
                    com.yandex.passport.internal.ui.f a7 = dVar.s.a(a6);
                    dVar.k.m(a7);
                    dVar.r.b(a7);
                }
                return Unit.a;
            case 15:
                nm6 nm6Var16 = nm6.a;
                int i23 = this.k;
                if (i23 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (((xpi) ((com.yandex.passport.internal.ui.util.j) this.l).e.getValue()).emit((Activity) obj3, this) == nm6Var16) {
                        return nm6Var16;
                    }
                } else {
                    if (i23 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 16:
                d1 d1Var2 = (d1) this.l;
                z0 z0Var = d1Var2.e;
                c1 c1Var = (c1) obj3;
                nm6 nm6Var17 = nm6.a;
                int i24 = this.k;
                if (i24 == 0) {
                    qgg.h0(obj);
                    long j = c1Var.a;
                    long j2 = c1Var.a;
                    String str2 = c1Var.b;
                    String str3 = c1Var.c;
                    z0Var.getClass();
                    c = 2;
                    c2 = 0;
                    z0Var.n(kb.d, new com.yandex.passport.internal.report.c(Long.valueOf(j)), new ve(str3, 11), new ff(str2, 14));
                    if (str2 == null) {
                        return new z7o(null);
                    }
                    com.yandex.passport.internal.l d = d1Var2.c.a().d(j2);
                    if (d == null) {
                        com.yandex.passport.api.h hVar3 = com.yandex.passport.api.h.c;
                        hVar3.getClass();
                        com.yandex.passport.api.impl.b a8 = com.yandex.passport.api.impl.b.a(hVar3.d());
                        a8.getClass();
                        com.yandex.passport.api.exception.b bVar2 = new com.yandex.passport.api.exception.b(new z1(a8, j2));
                        d1Var2.e.u(c1Var.a, c1Var.c, c1Var.b, bVar2);
                        r7o r7oVar = z7o.b;
                        return new z7o(new t7o(bVar2));
                    }
                    k7 k7Var = d1Var2.b;
                    com.yandex.passport.internal.network.mappers.b bVar3 = d1Var2.d;
                    com.yandex.passport.common.core.b bVar4 = d.b.a;
                    bVar3.getClass();
                    f7 f7Var = new f7(d.h(), d.d, com.yandex.passport.internal.network.mappers.b.a(bVar4), c1Var.b);
                    this.k = 1;
                    g3 = k7Var.g(f7Var, this);
                    if (g3 == nm6Var17) {
                        return nm6Var17;
                    }
                } else {
                    if (i24 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    g3 = obj;
                    c = 2;
                    c2 = 0;
                }
                Object obj6 = ((z7o) g3).a;
                boolean z = obj6 instanceof t7o;
                if (!z) {
                    long j3 = c1Var.a;
                    String str4 = c1Var.c;
                    String str5 = c1Var.b;
                    z0Var.getClass();
                    str5.getClass();
                    mb mbVar = mb.d;
                    com.yandex.passport.internal.report.c cVar4 = new com.yandex.passport.internal.report.c(Long.valueOf(j3));
                    ve veVar = new ve(str4, 11);
                    ff ffVar = new ff(str5, 14);
                    ze[] zeVarArr = new ze[3];
                    zeVarArr[c2] = cVar4;
                    zeVarArr[1] = veVar;
                    zeVarArr[c] = ffVar;
                    z0Var.n(mbVar, zeVarArr);
                }
                Throwable a9 = z7o.a(obj6);
                if (a9 != null) {
                    d1Var2.e.u(c1Var.a, c1Var.c, c1Var.b, a9);
                }
                if (!z) {
                    obj6 = ((j7) obj6).b;
                }
                return new z7o(obj6);
            case 17:
                nm6 nm6Var18 = nm6.a;
                int i25 = this.k;
                if (i25 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    Object g4 = ((b2) this.l).a.g((v1) obj3, this);
                    return g4 == nm6Var18 ? nm6Var18 : g4;
                }
                if (i25 == 1) {
                    qgg.h0(obj);
                    return obj;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 18:
                nm6 nm6Var19 = nm6.a;
                int i26 = this.k;
                if (i26 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (((fgp) this.l).m((com.yandex.passport.sloth.ui.b) obj3, this) == nm6Var19) {
                        return nm6Var19;
                    }
                } else {
                    if (i26 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 19:
                nm6 nm6Var20 = nm6.a;
                int i27 = this.k;
                if (i27 == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.sloth.v vVar = ((com.yandex.passport.sloth.l) this.l).b;
                    com.yandex.passport.sloth.m mVar3 = new com.yandex.passport.sloth.m((List) obj3);
                    this.k = 1;
                    if (vVar.d(mVar3, this) == nm6Var20) {
                        return nm6Var20;
                    }
                } else {
                    if (i27 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 20:
                com.yandex.passport.sloth.j0 j0Var = (com.yandex.passport.sloth.j0) this.l;
                nm6 nm6Var21 = nm6.a;
                int i28 = this.k;
                try {
                } catch (Exception e) {
                    com.yandex.passport.sloth.a1 a1Var = j0Var.d;
                    String message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    a1Var.a(new com.yandex.passport.sloth.n0(message, 3));
                }
                if (i28 == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.sloth.v vVar2 = j0Var.e;
                    com.yandex.passport.sloth.n nVar2 = new com.yandex.passport.sloth.n(true);
                    this.k = 1;
                    break;
                } else {
                    if (i28 != 1) {
                        if (i28 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                LinkedHashMap g5 = com.yandex.passport.common.url.b.g((String) obj3, xz0.Y(new String[]{"access_token", "token_type", "expires_in"}));
                String str6 = (String) g5.get("access_token");
                String str7 = (String) g5.get("token_type");
                String str8 = (String) g5.get("expires_in");
                r12 = str8 != null ? new Long(Long.parseLong(str8)) : 0;
                com.yandex.passport.sloth.v vVar3 = j0Var.e;
                str6.getClass();
                str7.getClass();
                r12.getClass();
                com.yandex.passport.sloth.d dVar2 = new com.yandex.passport.sloth.d(r12.longValue(), str6, str7);
                this.k = 2;
                break;
            case 21:
                nm6 nm6Var22 = nm6.a;
                int i29 = this.k;
                if (i29 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (((com.yandex.passport.sloth.j0) this.l).e.d((b1) obj3, this) == nm6Var22) {
                        return nm6Var22;
                    }
                } else {
                    if (i29 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 22:
                nm6 nm6Var23 = nm6.a;
                int i30 = this.k;
                if (i30 == 0) {
                    qgg.h0(obj);
                    a1 a1Var2 = (a1) this.l;
                    com.yandex.passport.sloth.ui.webview.d dVar3 = (com.yandex.passport.sloth.ui.webview.d) ((com.yandex.passport.sloth.ui.webview.f) obj3);
                    v0 v0Var = new v0(dVar3.a, dVar3.b);
                    this.k = 1;
                    if (((com.yandex.passport.sloth.c1) a1Var2).f(v0Var, this) == nm6Var23) {
                        return nm6Var23;
                    }
                } else {
                    if (i30 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 23:
                nm6 nm6Var24 = nm6.a;
                int i31 = this.k;
                if (i31 != 0) {
                    if (i31 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.d dVar4 = (com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.d) this.l;
                kotlinx.coroutines.a aVar8 = dVar4.d;
                wwd wwdVar = new wwd(dVar4, (com.yandex.plus.acquisition.sdk.pay.common.api.k) obj3, r12, i5);
                this.k = 1;
                Object V = x97.V(aVar8, wwdVar, this);
                return V == nm6Var24 ? nm6Var24 : V;
            case 24:
                nm6 nm6Var25 = nm6.a;
                int i32 = this.k;
                if (i32 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (y2x.o(100L, this) == nm6Var25) {
                        return nm6Var25;
                    }
                } else {
                    if (i32 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                com.yandex.plus.log.api.b bVar5 = ((com.yandex.plus.bdui.flex.ui.n) this.l).i;
                com.yandex.plus.log.api.a aVar9 = com.yandex.plus.log.api.a.c;
                if (bVar5.b(aVar9)) {
                    bVar5.c(aVar9, "PlusUiControllerUpdateCoordinatorImpl", "executeUpdateTasks(); show preview");
                }
                com.yandex.passport.internal.entities.j jVar2 = (com.yandex.passport.internal.entities.j) obj3;
                com.yandex.plus.bdui.flex.utils.c cVar5 = (com.yandex.plus.bdui.flex.utils.c) jVar2.a;
                com.yandex.plus.bdui.flex.utils.c cVar6 = (com.yandex.plus.bdui.flex.utils.c) jVar2.a;
                com.yandex.passport.internal.flags.experiments.p pVar2 = (com.yandex.passport.internal.flags.experiments.p) jVar2.d;
                View view = pVar2 != null ? (View) pVar2.d : null;
                if (view != null && cVar6.indexOfChild(view) < 0) {
                    cVar6.a(cVar6.getChildCount(), view);
                }
                cVar6.removeViewInLayout((View) jVar2.b);
                cVar5.requestLayout();
                cVar5.invalidate();
                return Unit.a;
            case 25:
                com.yandex.plus.bdui.flex.ui.p pVar3 = (com.yandex.plus.bdui.flex.ui.p) obj3;
                nm6 nm6Var26 = nm6.a;
                int i33 = this.k;
                if (i33 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.bdui.flex.ui.n nVar3 = (com.yandex.plus.bdui.flex.ui.n) this.l;
                    this.k = 1;
                    b = com.yandex.plus.bdui.flex.ui.n.b(nVar3, pVar3, this);
                    if (b == nm6Var26) {
                        return nm6Var26;
                    }
                } else {
                    if (i33 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    b = obj;
                }
                return new Pair(pVar3, (com.yandex.plus.bdui.shared.b) b);
            case 26:
                mm6 mm6Var8 = (mm6) this.l;
                nm6 nm6Var27 = nm6.a;
                int i34 = this.k;
                if (i34 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.bdui.flex.ui.n nVar4 = (com.yandex.plus.bdui.flex.ui.n) obj3;
                    Collection values = nVar4.k.values();
                    this.l = null;
                    this.k = 1;
                    if (com.yandex.plus.bdui.flex.ui.n.a(nVar4, mm6Var8, values, this) == nm6Var27) {
                        return nm6Var27;
                    }
                } else {
                    if (i34 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 27:
                com.yandex.passport.internal.entities.j jVar3 = (com.yandex.passport.internal.entities.j) this.l;
                com.yandex.plus.bdui.flex.utils.c cVar7 = (com.yandex.plus.bdui.flex.utils.c) jVar3.a;
                nm6 nm6Var28 = nm6.a;
                int i35 = this.k;
                if (i35 == 0) {
                    qgg.h0(obj);
                    View view2 = (View) jVar3.b;
                    if (cVar7.indexOfChild(view2) < 0) {
                        cVar7.a(0, view2);
                    }
                    this.k = 1;
                    if (((aa0) obj3).invoke(this) == nm6Var28) {
                        return nm6Var28;
                    }
                } else {
                    if (i35 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                com.yandex.passport.internal.flags.experiments.p pVar4 = (com.yandex.passport.internal.flags.experiments.p) jVar3.d;
                View view3 = pVar4 != null ? (View) pVar4.d : null;
                if (view3 != null) {
                    cVar7.removeViewInLayout(view3);
                }
                return Unit.a;
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                com.yandex.plus.bdui.plus.action.e eVar2 = (com.yandex.plus.bdui.plus.action.e) obj3;
                nm6 nm6Var29 = nm6.a;
                int i36 = this.k;
                if (i36 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.bdui.plus.checkout.action.f fVar = (com.yandex.plus.bdui.plus.checkout.action.f) this.l;
                    boolean z2 = fVar.b;
                    str = fVar.a;
                    if (z2) {
                        com.yandex.plus.pay.ui.core.api.domain.a aVar10 = (com.yandex.plus.pay.ui.core.api.domain.a) eVar2.d;
                        this.k = 1;
                        a3 = aVar10.a(str, this);
                        if (a3 == nm6Var29) {
                            return nm6Var29;
                        }
                    }
                    ((com.yandex.plus.home.internal.di.y) eVar2.c).i(str);
                    return Unit.a;
                }
                if (i36 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                a3 = obj;
                str = (String) a3;
                ((com.yandex.plus.home.internal.di.y) eVar2.c).i(str);
                return Unit.a;
            default:
                nm6 nm6Var30 = nm6.a;
                int i37 = this.k;
                if (i37 != 0) {
                    if (i37 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                com.yandex.plus.pay.inapp.api.e eVar3 = com.yandex.plus.pay.inapp.api.e.a;
                this.k = 1;
                Object c3 = ((com.yandex.plus.pay.inapp.api.b) ((com.yandex.plus.bdui.plus.checkout.content.controller.b0) this.l).d).c((List) obj3, eVar3, this);
                return c3 == nm6Var30 ? nm6Var30 : c3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
        this.m = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = obj;
    }
}
