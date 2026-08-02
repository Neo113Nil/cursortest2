package com.yandex.passport.internal.report;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.yandex.passport.internal.sloth.credentialmanager.SaveCredentialManagerActivity;
import com.yandex.passport.internal.ui.challenge.delete.DeleteForeverActivity;
import com.yandex.passport.internal.ui.domik.DomikActivity;
import com.yandex.passport.internal.ui.sloth.menu.UserMenuActivity;
import com.yandex.passport.internal.ui.sloth.plusdevices.ManagingPlusDevicesHelperActivity;
import com.yandex.plus.pay.internal.model.PlusPayRichText;
import defpackage.aur;
import defpackage.b6e;
import defpackage.bca;
import defpackage.ca8;
import defpackage.cxb;
import defpackage.dfi;
import defpackage.dq7;
import defpackage.dt0;
import defpackage.e5b;
import defpackage.ern;
import defpackage.f1d;
import defpackage.gld;
import defpackage.gm5;
import defpackage.hav;
import defpackage.hrg;
import defpackage.j0v;
import defpackage.jyr;
import defpackage.ltm;
import defpackage.mm6;
import defpackage.mn7;
import defpackage.msa;
import defpackage.nm6;
import defpackage.nsa;
import defpackage.ot0;
import defpackage.ow1;
import defpackage.ox6;
import defpackage.pjc;
import defpackage.qgg;
import defpackage.qqi;
import defpackage.r1w;
import defpackage.r2f;
import defpackage.r7o;
import defpackage.s7h;
import defpackage.sh;
import defpackage.ssa;
import defpackage.t7o;
import defpackage.tf6;
import defpackage.tyf;
import defpackage.urq;
import defpackage.v42;
import defpackage.v75;
import defpackage.wu0;
import defpackage.x0q;
import defpackage.x97;
import defpackage.xq0;
import defpackage.xz0;
import defpackage.y2x;
import defpackage.y7b;
import defpackage.y7g;
import defpackage.yd5;
import defpackage.z7o;
import defpackage.zsd;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class we extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public Object l;
    public Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ we(pjc pjcVar, Continuation continuation, sh shVar, Object obj, int i) {
        super(2, continuation);
        this.j = i;
        this.l = pjcVar;
        this.m = shVar;
        this.n = obj;
    }

    private final Object k(Object obj) {
        com.yandex.plus.bdui.action.a aVar;
        com.yandex.plus.bdui.plus.checkout.action.d dVar = (com.yandex.plus.bdui.plus.checkout.action.d) this.m;
        com.yandex.plus.bdui.plus.checkout.action.b bVar = (com.yandex.plus.bdui.plus.checkout.action.b) this.l;
        com.yandex.plus.log.api.b bVar2 = bVar.d;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.c;
            if (bVar2.b(aVar2)) {
                bVar2.c(aVar2, "PlusPayGooglePlayPurchaseActionHandler", "handle(); start purchase for productId = " + dVar.a);
            }
            com.yandex.passport.internal.flags.experiments.p pVar = bVar.b;
            String str = dVar.a;
            com.yandex.plus.pay.inapp.api.h hVar = dVar.b;
            this.k = 1;
            obj = pVar.C(str, hVar, this);
            if (obj == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        com.yandex.plus.bdui.plus.checkout.payment.h hVar2 = (com.yandex.plus.bdui.plus.checkout.payment.h) obj;
        Map a = com.yandex.plus.bdui.plus.checkout.utils.a.a(hVar2);
        if (hVar2 instanceof com.yandex.plus.bdui.plus.checkout.payment.g) {
            com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.c;
            if (bVar2.b(aVar3)) {
                bVar2.c(aVar3, "PlusPayGooglePlayPurchaseActionHandler", "handle(); purchase succeeded");
            }
            if (bVar2.b(aVar3)) {
                bVar2.c(aVar3, "PlusPayGooglePlayPurchaseActionHandler", "handle(); dispatch success action = " + dVar.c + " with payload = " + a);
            }
            aVar = dVar.c;
        } else if (hVar2 instanceof com.yandex.plus.bdui.plus.checkout.payment.f) {
            com.yandex.plus.log.api.a aVar4 = com.yandex.plus.log.api.a.e;
            if (bVar2.b(aVar4)) {
                bVar2.c(aVar4, "PlusPayGooglePlayPurchaseActionHandler", dfi.i(new StringBuilder("handle(); purchase failed with error code = "), ((com.yandex.plus.bdui.plus.checkout.payment.f) hVar2).a, '!'));
            }
            com.yandex.plus.log.api.a aVar5 = com.yandex.plus.log.api.a.c;
            if (bVar2.b(aVar5)) {
                bVar2.c(aVar5, "PlusPayGooglePlayPurchaseActionHandler", "handle(); dispatch error action = " + dVar.e + " with payload = " + a);
            }
            aVar = dVar.e;
        } else {
            if (!hVar2.equals(com.yandex.plus.bdui.plus.checkout.payment.e.a)) {
                b6e.s();
                return null;
            }
            com.yandex.plus.log.api.a aVar6 = com.yandex.plus.log.api.a.c;
            if (bVar2.b(aVar6)) {
                bVar2.c(aVar6, "PlusPayGooglePlayPurchaseActionHandler", "handle(); purchase cancelled");
            }
            if (bVar2.b(aVar6)) {
                bVar2.c(aVar6, "PlusPayGooglePlayPurchaseActionHandler", "handle(); dispatch cancel action = " + dVar.d + " with payload = " + a);
            }
            aVar = dVar.d;
        }
        com.yandex.plus.bdui.action.i iVar = (com.yandex.plus.bdui.action.i) this.n;
        iVar.a.a.a(aVar, iVar.b, a);
        return Unit.a;
    }

    private final Object l(Object obj) {
        Map n;
        com.yandex.plus.bdui.action.a aVar;
        com.yandex.plus.bdui.plus.checkout.action.e eVar = (com.yandex.plus.bdui.plus.checkout.action.e) this.m;
        com.yandex.plus.bdui.plus.checkout.action.b bVar = (com.yandex.plus.bdui.plus.checkout.action.b) this.l;
        com.yandex.plus.log.api.b bVar2 = bVar.d;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.c;
            if (bVar2.b(aVar2)) {
                bVar2.c(aVar2, "PlusPayGooglePlayRestorePurchasesActionHandler", "handle(); start restore purchases");
            }
            com.yandex.passport.internal.flags.experiments.p pVar = bVar.b;
            this.k = 1;
            obj = pVar.I(this);
            if (obj == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        com.yandex.plus.bdui.plus.checkout.payment.k kVar = (com.yandex.plus.bdui.plus.checkout.payment.k) obj;
        kVar.getClass();
        if (kVar.equals(com.yandex.plus.bdui.plus.checkout.payment.j.a)) {
            n = e5b.a;
            n.getClass();
        } else {
            if (!(kVar instanceof com.yandex.plus.bdui.plus.checkout.payment.i)) {
                b6e.s();
                return null;
            }
            n = dfi.n("inAppErrorCode", ((com.yandex.plus.bdui.plus.checkout.payment.i) kVar).a);
        }
        if (kVar instanceof com.yandex.plus.bdui.plus.checkout.payment.j) {
            com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.c;
            if (bVar2.b(aVar3)) {
                bVar2.c(aVar3, "PlusPayGooglePlayRestorePurchasesActionHandler", "handle(); restore purchases succeeded");
            }
            if (bVar2.b(aVar3)) {
                bVar2.c(aVar3, "PlusPayGooglePlayRestorePurchasesActionHandler", "handle(); dispatch success action = " + eVar.a + " with payload = " + n);
            }
            aVar = eVar.a;
        } else {
            if (!(kVar instanceof com.yandex.plus.bdui.plus.checkout.payment.i)) {
                b6e.s();
                return null;
            }
            com.yandex.plus.log.api.a aVar4 = com.yandex.plus.log.api.a.e;
            if (bVar2.b(aVar4)) {
                bVar2.c(aVar4, "PlusPayGooglePlayRestorePurchasesActionHandler", dfi.i(new StringBuilder("handle(); restore purchases failed with error code = "), ((com.yandex.plus.bdui.plus.checkout.payment.i) kVar).a, '!'));
            }
            com.yandex.plus.log.api.a aVar5 = com.yandex.plus.log.api.a.c;
            if (bVar2.b(aVar5)) {
                bVar2.c(aVar5, "PlusPayGooglePlayRestorePurchasesActionHandler", "handle(); dispatch error action = " + eVar.b + " with payload = " + n);
            }
            aVar = eVar.b;
        }
        com.yandex.plus.bdui.action.i iVar = (com.yandex.plus.bdui.action.i) this.n;
        iVar.a.a.a(aVar, iVar.b, n);
        return Unit.a;
    }

    private final Object n(Object obj) {
        com.yandex.plus.bdui.content.d dVar = (com.yandex.plus.bdui.content.d) this.m;
        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.a aVar = (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.a) this.n;
        com.yandex.plus.bdui.plus.checkout.content.controller.f0 f0Var = (com.yandex.plus.bdui.plus.checkout.content.controller.f0) this.l;
        com.yandex.plus.log.api.b bVar = f0Var.f;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            PlusPayRichText plusPayRichText = ((com.yandex.plus.bdui.plus.checkout.content.serializer.x5) dVar.b).c;
            this.k = 1;
            obj = f0Var.g(plusPayRichText, this);
            if (obj == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        CharSequence charSequence = (CharSequence) obj;
        com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.c;
        if (bVar.b(aVar2)) {
            bVar.c(aVar2, "PlusPayPresaleContentController", "onUpdateStateAsync(); set presale loading text = " + ((Object) charSequence));
        }
        aVar.i(charSequence);
        com.yandex.plus.pay.ui.core.mobile.view.toolbar.h d = com.yandex.plus.bdui.plus.checkout.content.controller.a.d(((com.yandex.plus.bdui.plus.checkout.content.serializer.x5) dVar.b).a);
        if (bVar.b(aVar2)) {
            bVar.c(aVar2, "PlusPayPresaleContentController", "onUpdateStateAsync(); apply toolbar state = " + d);
        }
        aVar.k.a(d);
        aVar.a.setVisibility(0);
        x97.y(f0Var.g, null, null, new y7b(f0Var, (com.yandex.plus.bdui.plus.checkout.content.serializer.x5) dVar.b, aVar, (Continuation) null, 16), 3);
        return Unit.a;
    }

    private final Object o(Object obj) {
        Object obj2;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i != 0) {
            if (i == 1) {
                qgg.h0(obj);
                return obj;
            }
            xq0.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        qgg.h0(obj);
        com.yandex.plus.bdui.plus.data.a aVar = (com.yandex.plus.bdui.plus.data.a) this.l;
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.m;
        this.k = 1;
        aVar.getClass();
        com.yandex.plus.bdui.shared.b bVar = (com.yandex.plus.bdui.shared.b) this.n;
        if (linkedHashSet.contains("__divkit__.__log_id__")) {
            bVar.getClass();
            com.yandex.plus.bdui.plus.shared.f fVar = (com.yandex.plus.bdui.plus.shared.f) bVar.e(ern.a(com.yandex.plus.bdui.plus.shared.f.class));
            String str = fVar != null ? fVar.a : null;
            if (str == null) {
                str = "";
            }
            obj2 = dfi.n("__divkit__.__log_id__", str);
        } else {
            obj2 = e5b.a;
            obj2.getClass();
        }
        return obj2 == nm6Var ? nm6Var : obj2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new we((com.yandex.passport.common.analytics.k) this.n, (xe) this.m, continuation);
            case 1:
                return new we((com.yandex.passport.internal.report.diary.m0) this.m, (com.yandex.passport.internal.methods.v5) this.n, continuation, 1);
            case 2:
                return new we((com.yandex.passport.internal.sloth.credentialmanager.a) this.l, (SaveCredentialManagerActivity) this.m, (com.yandex.passport.internal.sloth.credentialmanager.d) this.n, continuation, 2);
            case 3:
                return new we((com.yandex.passport.internal.ui.account_upgrade.j) this.m, (com.yandex.passport.internal.ui.account_upgrade.l) this.n, continuation, 3);
            case 4:
                return new we((com.yandex.passport.internal.report.reporters.m) this.l, (com.yandex.passport.internal.ui.bouncer.model.p1) this.m, (s7h) this.n, continuation, 4);
            case 5:
                return new we((pjc) this.l, continuation, (com.yandex.passport.internal.ui.bouncer.loading.i) this.m, (com.yandex.passport.internal.ui.bouncer.model.t1) this.n, 5);
            case 6:
                return new we((DeleteForeverActivity) this.n, continuation, 6);
            case 7:
                return new we((com.yandex.passport.internal.ui.domik.extaction.b) this.l, (com.yandex.passport.internal.entities.h) this.m, (com.yandex.passport.internal.ui.domik.d) this.n, continuation, 7);
            case 8:
                return new we((com.yandex.passport.internal.ui.domik.phone_number.b) this.l, (com.yandex.passport.internal.ui.domik.a0) this.m, (String) this.n, continuation, 8);
            case 9:
                return new we((com.yandex.passport.internal.ui.domik.samlsso.g) this.l, (com.yandex.passport.internal.entities.h) this.m, (com.yandex.passport.internal.ui.domik.d) this.n, continuation, 9);
            case 10:
                return new we((UserMenuActivity) this.l, (com.yandex.passport.internal.properties.j0) this.m, (com.yandex.passport.internal.l) this.n, continuation, 10);
            case 11:
                return new we((pjc) this.l, continuation, (UserMenuActivity) this.m, (com.yandex.passport.internal.report.reporters.o1) this.n, 11);
            case 12:
                return new we((String) this.m, (Messenger) this.n, continuation, 12);
            case 13:
                return new we((pjc) this.l, continuation, (ManagingPlusDevicesHelperActivity) this.m, (com.yandex.passport.internal.properties.o) this.n, 13);
            case 14:
                return new we((com.yandex.passport.internal.usecase.vpn.e) this.n, continuation, 14);
            case 15:
                we weVar = new we((ConnectivityManager) this.m, (tf6) this.n, continuation, 15);
                weVar.l = obj;
                return weVar;
            case 16:
                return new we((pjc) this.l, continuation, (com.yandex.passport.sloth.ui.b0) this.m, (com.yandex.passport.sloth.ui.a1) this.n, 16);
            case 17:
                return new we((com.yandex.plus.analytics.dwh.a) this.l, (String) this.m, (Map) this.n, continuation, 17);
            case 18:
                we weVar2 = new we((com.yandex.plus.bdui.flex.ui.b) this.m, this.n, continuation, 18);
                weVar2.l = obj;
                return weVar2;
            case 19:
                we weVar3 = new we((Collection) this.m, (com.yandex.plus.bdui.flex.ui.n) this.n, continuation, 19);
                weVar3.l = obj;
                return weVar3;
            case 20:
                return new we((com.yandex.plus.bdui.plus.action.g) this.l, (com.yandex.plus.bdui.query.b) this.m, (com.yandex.plus.bdui.action.i) this.n, continuation, 20);
            case 21:
                return new we((com.yandex.plus.bdui.plus.action.f) this.l, (com.yandex.plus.bdui.plus.action.g) this.m, (com.yandex.plus.bdui.action.i) this.n, continuation, 21);
            case 22:
                return new we((com.yandex.plus.bdui.plus.action.h) this.l, (com.yandex.plus.bdui.plus.action.i) this.m, (com.yandex.plus.bdui.action.i) this.n, continuation, 22);
            case 23:
                return new we((com.yandex.plus.bdui.plus.checkout.action.b) this.l, (com.yandex.plus.bdui.plus.checkout.action.c) this.m, (com.yandex.plus.bdui.action.i) this.n, continuation, 23);
            case 24:
                return new we((com.yandex.plus.bdui.plus.checkout.action.b) this.l, (com.yandex.plus.bdui.plus.checkout.action.d) this.m, (com.yandex.plus.bdui.action.i) this.n, continuation, 24);
            case 25:
                return new we((com.yandex.plus.bdui.plus.checkout.action.b) this.l, (com.yandex.plus.bdui.plus.checkout.action.e) this.m, (com.yandex.plus.bdui.action.i) this.n, continuation, 25);
            case 26:
                return new we((com.yandex.plus.bdui.plus.checkout.content.controller.f0) this.l, (com.yandex.plus.bdui.content.d) this.m, (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.a) this.n, continuation, 26);
            case 27:
                return new we((j0v) this.l, (com.yandex.plus.core.network.context.a) this.m, this.n, continuation, 27);
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new we((com.yandex.plus.bdui.plus.data.a) this.l, (LinkedHashSet) this.m, this.n, continuation, 28);
            default:
                return new we((String) this.l, (com.yandex.plus.home.api.prefetch.l) this.m, (String) this.n, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((we) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((we) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((we) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((we) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((we) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 5:
                return ((we) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 6:
                return ((we) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 7:
                return ((we) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 8:
                return ((we) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 9:
                return ((we) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 10:
                return ((we) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 11:
                return ((we) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 12:
                return ((we) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 13:
                return ((we) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 14:
                return ((we) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 15:
                return ((we) create((ltm) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 16:
                return ((we) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 17:
                return ((we) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 18:
                return ((we) create((com.yandex.plus.bdui.shared.b) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 19:
                return ((we) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 20:
                return ((we) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 21:
                return ((we) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 22:
                return ((we) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 23:
                return ((we) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 24:
                return ((we) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 25:
                return ((we) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 26:
                return ((we) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 27:
                return ((we) create((com.yandex.plus.core.network.context.a) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return ((we) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((we) create((r2f) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:258:0x05ae, code lost:
    
        if (r2.d("main", r16) == r0) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x05bb, code lost:
    
        if (com.yandex.passport.internal.usecase.vpn.e.a(r2, r16) == r0) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x055d, code lost:
    
        if (r3.a(r16) == r0) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0549, code lost:
    
        if (com.yandex.passport.internal.usecase.vpn.e.b(r2, r16) == r0) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x067b, code lost:
    
        if (r2 == r0) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x065f, code lost:
    
        if (r3.emit(r4, r16) == r0) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x0639, code lost:
    
        if (r2 == r0) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x0906, code lost:
    
        if (r3 == r2) goto L377;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x0abf, code lost:
    
        if (r3.emit(r4, r16) == r6) goto L442;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x0a2f, code lost:
    
        if (r2 == r6) goto L442;
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x0b59, code lost:
    
        if (r2.o(r0, r16) == r3) goto L472;
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:529:0x0b43, code lost:
    
        if (r4 == r3) goto L472;
     */
    /* JADX WARN: Code restructure failed: missing block: B:552:0x0b96, code lost:
    
        if (r2 == r0) goto L493;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01e9, code lost:
    
        if (((kotlin.Unit) r4) == null) goto L86;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:417:0x095b  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0aa0  */
    /* JADX WARN: Type inference failed for: r14v17, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.String] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object e;
        Object V;
        xe xeVar;
        Object a;
        Object c;
        Object g;
        Object obj2;
        com.yandex.passport.common.core.f fVar;
        Object obj3;
        Throwable a2;
        Object g2;
        Object obj4;
        Object G;
        DeleteForeverActivity deleteForeverActivity;
        Throwable a3;
        Object g3;
        Object g4;
        Object a4;
        Object M;
        com.yandex.passport.internal.ui.sloth.menu.host.a aVar;
        Object g0;
        com.yandex.passport.internal.usecase.vpn.e eVar;
        qqi qqiVar;
        Object c2;
        Object a5;
        Object V2;
        Object v;
        com.yandex.plus.bdui.action.a aVar2;
        int i = 4;
        int i2 = 14;
        int i3 = 25;
        int i4 = 0;
        boolean z = false;
        boolean z2 = false;
        int i5 = 3;
        int i6 = 2;
        int i7 = 1;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.analytics.k kVar = (com.yandex.passport.common.analytics.k) this.n;
                    this.k = 1;
                    kVar.getClass();
                    e = com.yandex.passport.common.analytics.k.e(kVar, this);
                    break;
                } else {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        xeVar = (xe) this.l;
                        qgg.h0(obj);
                        V = obj;
                        xeVar.d = (Map) V;
                        return Unit.a;
                    }
                    qgg.h0(obj);
                    com.yandex.passport.common.value.a aVar3 = (com.yandex.passport.common.value.a) obj;
                    e = aVar3 != null ? aVar3.a : null;
                }
                String str = (String) e;
                if (str != null) {
                    ye.a(str, ((xe) this.m).c);
                }
                xe xeVar2 = (xe) this.m;
                Context context = xeVar2.a;
                this.l = xeVar2;
                this.k = 2;
                V = x97.V(ca8.a, new wu0(context, r14, i7), this);
                if (V != nm6Var) {
                    xeVar = xeVar2;
                    xeVar.d = (Map) V;
                    return Unit.a;
                }
                return nm6Var;
            case 1:
                com.yandex.passport.internal.methods.v5 v5Var = (com.yandex.passport.internal.methods.v5) this.n;
                com.yandex.passport.internal.report.diary.m0 m0Var = (com.yandex.passport.internal.report.diary.m0) this.m;
                nm6 nm6Var2 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.report.diary.e0 e0Var = m0Var.c;
                    String name = v5Var.a.name();
                    m0Var.b.getClass();
                    com.yandex.passport.internal.database.diary.a aVar4 = new com.yandex.passport.internal.database.diary.a(name, System.currentTimeMillis(), false);
                    this.k = 1;
                    a = e0Var.a(aVar4, this);
                    break;
                } else {
                    if (i9 != 1) {
                        if (i9 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    a = ((z7o) obj).a;
                }
                r7o r7oVar = z7o.b;
                if (!(a instanceof t7o)) {
                    com.yandex.passport.internal.report.diary.b0 b0Var = m0Var.d;
                    this.l = a;
                    this.k = 2;
                    break;
                }
                return Unit.a;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.sloth.credentialmanager.a aVar5 = (com.yandex.passport.internal.sloth.credentialmanager.a) this.l;
                    if (aVar5 != null) {
                        com.yandex.passport.internal.sloth.credentialmanager.d dVar = (com.yandex.passport.internal.sloth.credentialmanager.d) this.n;
                        com.yandex.passport.internal.sloth.credentialmanager.e eVar2 = com.yandex.passport.internal.sloth.credentialmanager.e.AutoLogin;
                        this.k = 1;
                        c = dVar.c(aVar5, eVar2, this);
                        if (c == nm6Var3) {
                            return nm6Var3;
                        }
                    }
                    ((SaveCredentialManagerActivity) this.m).finish();
                    return Unit.a;
                }
                if (i10 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                c = obj;
                ((Boolean) c).getClass();
                ((SaveCredentialManagerActivity) this.m).finish();
                return Unit.a;
            case 3:
                com.yandex.passport.internal.ui.account_upgrade.l lVar = (com.yandex.passport.internal.ui.account_upgrade.l) this.n;
                com.yandex.passport.internal.ui.account_upgrade.j jVar = (com.yandex.passport.internal.ui.account_upgrade.j) this.m;
                x0q x0qVar = jVar.l;
                nm6 nm6Var4 = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.upgrader.d dVar2 = jVar.k;
                    com.yandex.passport.internal.upgrader.b bVar = new com.yandex.passport.internal.upgrader.b(lVar);
                    this.k = 1;
                    g = dVar2.g(bVar, this);
                    break;
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 == 3) {
                                qgg.h0(obj);
                                return Unit.a;
                            }
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj3 = this.l;
                        qgg.h0(obj);
                        obj2 = obj3;
                        a2 = z7o.a(obj2);
                        if (a2 != null) {
                            com.yandex.passport.common.logger.d dVar3 = com.yandex.passport.common.logger.a.a;
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "Failed to create webcard intent", a2);
                            }
                            com.yandex.passport.internal.ui.account_upgrade.g gVar = new com.yandex.passport.internal.ui.account_upgrade.g(a2);
                            this.l = obj2;
                            this.k = 3;
                            break;
                        }
                        return Unit.a;
                    }
                    qgg.h0(obj);
                    g = obj;
                }
                obj2 = ((z7o) g).a;
                if (!(obj2 instanceof t7o)) {
                    com.yandex.passport.internal.upgrader.a aVar6 = (com.yandex.passport.internal.upgrader.a) obj2;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "result url " + new URL(aVar6.a), 8);
                    }
                    String str2 = aVar6.a;
                    com.yandex.passport.internal.l lVar2 = aVar6.b;
                    if (lVar2 == null || (fVar = lVar2.b) == null) {
                        xq0.q("no uid in the result");
                        return null;
                    }
                    com.yandex.passport.internal.ui.account_upgrade.h hVar = new com.yandex.passport.internal.ui.account_upgrade.h(new com.yandex.passport.sloth.data.m(new com.yandex.passport.sloth.data.u(str2, fVar, com.yandex.plus.core.network.api.utils.a.S(lVar.b), false), fVar.a, new com.yandex.passport.common.properties.a(i2, z2 ? 1 : 0, z ? 1 : 0), i));
                    this.l = obj2;
                    this.k = 2;
                    if (x0qVar.emit(hVar, this) != nm6Var4) {
                        obj3 = obj2;
                        obj2 = obj3;
                    }
                    return nm6Var4;
                }
                a2 = z7o.a(obj2);
                if (a2 != null) {
                }
                return Unit.a;
            case 4:
                com.yandex.passport.internal.ui.bouncer.model.p1 p1Var = (com.yandex.passport.internal.ui.bouncer.model.p1) this.m;
                nm6 nm6Var5 = nm6.a;
                int i12 = this.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    long b = com.yandex.passport.common.time.a.b(0L, 0L, 0L, 120L);
                    this.k = 1;
                    if (y2x.o(b, this) == nm6Var5) {
                        return nm6Var5;
                    }
                } else {
                    if (i12 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                ((com.yandex.passport.internal.report.reporters.m) this.l).u(p1Var);
                ((s7h) this.n).a(p1Var);
                return Unit.a;
            case 5:
                nm6 nm6Var6 = nm6.a;
                int i13 = this.k;
                if (i13 == 0) {
                    qgg.h0(obj);
                    pjc pjcVar = (pjc) this.l;
                    com.yandex.passport.common.mvi.c cVar = new com.yandex.passport.common.mvi.c(i, (com.yandex.passport.internal.ui.bouncer.loading.i) this.m, (com.yandex.passport.internal.ui.bouncer.model.t1) this.n);
                    this.k = 1;
                    if (pjcVar.collect(cVar, this) == nm6Var6) {
                        return nm6Var6;
                    }
                } else {
                    if (i13 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 6:
                DeleteForeverActivity deleteForeverActivity2 = (DeleteForeverActivity) this.n;
                nm6 nm6Var7 = nm6.a;
                int i14 = this.k;
                if (i14 == 0) {
                    qgg.h0(obj);
                    int i15 = DeleteForeverActivity.j;
                    com.yandex.passport.internal.usecase.x0 getLocationIdUseCase = ((com.yandex.passport.internal.ui.challenge.delete.o0) deleteForeverActivity2.m()).getGetLocationIdUseCase();
                    com.yandex.passport.common.core.f L = com.yandex.plus.pay.ui.core.b.L(((com.yandex.passport.internal.ui.challenge.delete.o0) deleteForeverActivity2.m()).getProperties().a);
                    this.k = 1;
                    g2 = getLocationIdUseCase.g(L, this);
                    break;
                } else {
                    if (i14 != 1) {
                        if (i14 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        deleteForeverActivity = (DeleteForeverActivity) this.m;
                        obj4 = this.l;
                        qgg.h0(obj);
                        G = obj;
                        int i16 = DeleteForeverActivity.j;
                        ((com.yandex.passport.sloth.ui.b0) ((com.yandex.passport.internal.ui.challenge.delete.o0) deleteForeverActivity.m()).getDeleteForeverSlothUi().b.e.getValue()).e(new com.yandex.passport.sloth.ui.t0((com.yandex.passport.sloth.ui.a1) G));
                        a3 = z7o.a(obj4);
                        if (a3 != null) {
                            if (deleteForeverActivity2.g) {
                                deleteForeverActivity2.n().H(new com.yandex.passport.internal.ui.challenge.delete.t0(a3));
                            } else {
                                com.yandex.passport.internal.ui.challenge.delete.q1 n = deleteForeverActivity2.n();
                                x97.y(ot0.F(n), null, null, new r1w(n, r14, 23), 3);
                                deleteForeverActivity2.g = true;
                            }
                        }
                        return Unit.a;
                    }
                    qgg.h0(obj);
                    g2 = obj;
                }
                obj4 = ((z7o) g2).a;
                if (!(obj4 instanceof t7o)) {
                    long longValue = ((Number) obj4).longValue();
                    com.yandex.passport.internal.ui.challenge.delete.q1 n2 = deleteForeverActivity2.n();
                    com.yandex.passport.internal.properties.r properties = ((com.yandex.passport.internal.ui.challenge.delete.o0) deleteForeverActivity2.m()).getProperties();
                    this.l = obj4;
                    this.m = deleteForeverActivity2;
                    this.k = 2;
                    G = n2.G(properties, longValue, this);
                    if (G != nm6Var7) {
                        deleteForeverActivity = deleteForeverActivity2;
                        int i162 = DeleteForeverActivity.j;
                        ((com.yandex.passport.sloth.ui.b0) ((com.yandex.passport.internal.ui.challenge.delete.o0) deleteForeverActivity.m()).getDeleteForeverSlothUi().b.e.getValue()).e(new com.yandex.passport.sloth.ui.t0((com.yandex.passport.sloth.ui.a1) G));
                    }
                    return nm6Var7;
                }
                a3 = z7o.a(obj4);
                if (a3 != null) {
                }
                return Unit.a;
            case 7:
                com.yandex.passport.internal.ui.domik.d dVar4 = (com.yandex.passport.internal.ui.domik.d) this.n;
                com.yandex.passport.internal.ui.domik.extaction.b bVar2 = (com.yandex.passport.internal.ui.domik.extaction.b) this.l;
                nm6 nm6Var8 = nm6.a;
                int i17 = this.k;
                if (i17 == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.usecase.authorize.c cVar2 = bVar2.r;
                    com.yandex.passport.internal.usecase.authorize.a aVar7 = new com.yandex.passport.internal.usecase.authorize.a((com.yandex.passport.internal.entities.h) this.m, com.yandex.passport.internal.analytics.a.g, dVar4 != null ? dVar4.b : null, 0L);
                    this.k = 1;
                    g3 = cVar2.g(aVar7, this);
                    if (g3 == nm6Var8) {
                        return nm6Var8;
                    }
                } else {
                    if (i17 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    g3 = obj;
                }
                Object obj5 = ((z7o) g3).a;
                if (!(obj5 instanceof t7o)) {
                    com.yandex.passport.internal.l lVar3 = (com.yandex.passport.internal.l) obj5;
                    bVar2.v.e(com.yandex.passport.internal.analytics.g0.a);
                    com.yandex.passport.internal.ui.domik.v vVar = bVar2.t;
                    com.yandex.passport.api.w0 w0Var = com.yandex.passport.api.w0.c;
                    EnumSet noneOf = EnumSet.noneOf(com.yandex.passport.internal.ui.domik.w.class);
                    noneOf.getClass();
                    lVar3.getClass();
                    vVar.b(dVar4, new com.yandex.passport.internal.ui.domik.u(lVar3, null, w0Var, null, noneOf));
                }
                Throwable a6 = z7o.a(obj5);
                if (a6 != null) {
                    bVar2.l.m(Boolean.FALSE);
                    com.yandex.passport.internal.ui.f a7 = bVar2.q.a(a6);
                    bVar2.k.m(a7);
                    bVar2.s.b(a7);
                }
                return Unit.a;
            case 8:
                nm6 nm6Var9 = nm6.a;
                int i18 = this.k;
                if (i18 == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.ui.domik.phone_number.b bVar3 = (com.yandex.passport.internal.ui.domik.phone_number.b) this.l;
                    com.yandex.passport.internal.usecase.ui.n1 n1Var = bVar3.t;
                    com.yandex.passport.internal.usecase.ui.j1 j1Var = new com.yandex.passport.internal.usecase.ui.j1((com.yandex.passport.internal.ui.domik.a0) this.m, (String) this.n, bVar3.w);
                    this.k = 1;
                    if (n1Var.g(j1Var, this) == nm6Var9) {
                        return nm6Var9;
                    }
                } else {
                    if (i18 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 9:
                com.yandex.passport.internal.ui.domik.d dVar5 = (com.yandex.passport.internal.ui.domik.d) this.n;
                com.yandex.passport.internal.ui.domik.samlsso.g gVar2 = (com.yandex.passport.internal.ui.domik.samlsso.g) this.l;
                nm6 nm6Var10 = nm6.a;
                int i19 = this.k;
                if (i19 == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.usecase.authorize.c cVar3 = gVar2.t;
                    com.yandex.passport.internal.usecase.authorize.a aVar8 = new com.yandex.passport.internal.usecase.authorize.a((com.yandex.passport.internal.entities.h) this.m, com.yandex.passport.internal.analytics.a.i, dVar5 != null ? dVar5.b : null, 0L);
                    this.k = 1;
                    g4 = cVar3.g(aVar8, this);
                    if (g4 == nm6Var10) {
                        return nm6Var10;
                    }
                } else {
                    if (i19 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    g4 = obj;
                }
                Object obj6 = ((z7o) g4).a;
                if (!(obj6 instanceof t7o)) {
                    com.yandex.passport.internal.l lVar4 = (com.yandex.passport.internal.l) obj6;
                    DomikActivity domikActivity = (DomikActivity) gVar2.u;
                    domikActivity.d.M();
                    com.yandex.passport.internal.ui.domik.v domikRouter = domikActivity.j.getDomikRouter();
                    com.yandex.passport.api.w0 w0Var2 = com.yandex.passport.api.w0.c;
                    EnumSet noneOf2 = EnumSet.noneOf(com.yandex.passport.internal.ui.domik.w.class);
                    lVar4.getClass();
                    noneOf2.getClass();
                    domikRouter.b(dVar5, new com.yandex.passport.internal.ui.domik.u(lVar4, null, w0Var2, null, noneOf2));
                }
                if (z7o.a(obj6) != null) {
                    gVar2.y.m(com.yandex.passport.internal.ui.domik.samlsso.a.c);
                }
                gVar2.l.m(Boolean.FALSE);
                return Unit.a;
            case 10:
                UserMenuActivity userMenuActivity = (UserMenuActivity) this.l;
                nm6 nm6Var11 = nm6.a;
                int i20 = this.k;
                if (i20 == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.ui.sloth.menu.t tVar = (com.yandex.passport.internal.ui.sloth.menu.t) userMenuActivity.c.getValue();
                    com.yandex.passport.internal.properties.j0 j0Var = (com.yandex.passport.internal.properties.j0) this.m;
                    com.yandex.passport.internal.l lVar5 = (com.yandex.passport.internal.l) this.n;
                    this.k = 1;
                    a4 = tVar.a(j0Var, lVar5, this);
                    if (a4 == nm6Var11) {
                        return nm6Var11;
                    }
                } else {
                    if (i20 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    a4 = obj;
                }
                com.yandex.passport.sloth.ui.a1 a1Var = (com.yandex.passport.sloth.ui.a1) a4;
                com.yandex.passport.internal.ui.sloth.menu.e eVar3 = userMenuActivity.b;
                if (eVar3 == null) {
                    Intrinsics.j("component");
                    throw null;
                }
                com.yandex.passport.internal.ui.sloth.menu.i iVar = eVar3.getUiController().a;
                com.yandex.passport.sloth.ui.t0 t0Var = new com.yandex.passport.sloth.ui.t0(a1Var);
                iVar.getClass();
                com.yandex.passport.internal.ui.sloth.menu.o oVar = iVar.d;
                ((com.yandex.passport.sloth.ui.b0) oVar.d.getValue()).e(t0Var);
                com.yandex.passport.sloth.ui.b0 b0Var2 = (com.yandex.passport.sloth.ui.b0) oVar.d.getValue();
                b0Var2.getClass();
                ((FrameLayout) new urq(b0Var2).e()).setVisibility(0);
                ((LinearLayout) iVar.e.e()).setVisibility(8);
                return Unit.a;
            case 11:
                nm6 nm6Var12 = nm6.a;
                int i21 = this.k;
                if (i21 == 0) {
                    qgg.h0(obj);
                    pjc pjcVar2 = (pjc) this.l;
                    com.yandex.passport.common.mvi.c cVar4 = new com.yandex.passport.common.mvi.c(i2, (UserMenuActivity) this.m, (com.yandex.passport.internal.report.reporters.o1) this.n);
                    this.k = 1;
                    if (pjcVar2.collect(cVar4, this) == nm6Var12) {
                        return nm6Var12;
                    }
                } else {
                    if (i21 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 12:
                nm6 nm6Var13 = nm6.a;
                int i22 = this.k;
                if (i22 == 0) {
                    qgg.h0(obj);
                    gm5 gm5Var = com.yandex.passport.internal.ui.sloth.menu.host.d.a;
                    this.k = 1;
                    msa msaVar = nsa.b;
                    M = tyf.M(yd5.M(20, ssa.SECONDS), new dt0(i6, i3, r14), this);
                    break;
                } else if (i22 == 1) {
                    qgg.h0(obj);
                    M = obj;
                } else if (i22 == 2) {
                    aVar = (com.yandex.passport.internal.ui.sloth.menu.host.a) this.l;
                    qgg.h0(obj);
                    bca bcaVar = new bca(((com.yandex.passport.internal.ui.sloth.menu.host.b) aVar.a.get()).a, 18);
                    this.l = null;
                    this.k = 3;
                    g0 = zsd.g0(bcaVar, this);
                    break;
                } else {
                    if (i22 != 3) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    g0 = obj;
                    Messenger messenger = (Messenger) this.n;
                    String str3 = (String) g0;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "HOST COMMAND: " + str3, 8);
                    }
                    try {
                        messenger.send(Message.obtain(null, 11, cxb.K(new Pair("HOST_COMMAND", str3))));
                    } catch (RemoteException e2) {
                        com.yandex.passport.common.logger.d dVar6 = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "", e2);
                        }
                    }
                    return Unit.a;
                }
                aVar = (com.yandex.passport.internal.ui.sloth.menu.host.a) M;
                if (aVar != null) {
                    x0q x0qVar2 = ((com.yandex.passport.internal.ui.sloth.menu.host.b) aVar.a.get()).b;
                    com.yandex.passport.api.c2 c2Var = new com.yandex.passport.api.c2((String) this.m);
                    this.l = aVar;
                    this.k = 2;
                    break;
                } else {
                    return Unit.a;
                }
            case 13:
                nm6 nm6Var14 = nm6.a;
                int i23 = this.k;
                if (i23 == 0) {
                    qgg.h0(obj);
                    pjc pjcVar3 = (pjc) this.l;
                    com.yandex.passport.common.mvi.c cVar5 = new com.yandex.passport.common.mvi.c(15, (ManagingPlusDevicesHelperActivity) this.m, (com.yandex.passport.internal.properties.o) this.n);
                    this.k = 1;
                    if (pjcVar3.collect(cVar5, this) == nm6Var14) {
                        return nm6Var14;
                    }
                } else {
                    if (i23 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 14:
                nm6 nm6Var15 = nm6.a;
                int i24 = this.k;
                if (i24 == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.config.n nVar = ((com.yandex.passport.internal.usecase.vpn.e) this.n).e;
                    com.yandex.passport.common.core.b bVar4 = com.yandex.passport.common.core.b.c;
                    nVar.getClass();
                    SharedPreferences a8 = nVar.a.a(bVar4);
                    if (!(a8 != null ? a8.getBoolean("blockVpn", false) : false) && !((Boolean) ((com.yandex.passport.internal.usecase.vpn.e) this.n).f.b(com.yandex.passport.internal.flags.o.B0)).booleanValue()) {
                        return Unit.a;
                    }
                    com.yandex.passport.internal.usecase.vpn.e eVar4 = (com.yandex.passport.internal.usecase.vpn.e) this.n;
                    this.k = 1;
                    break;
                } else if (i24 == 1) {
                    qgg.h0(obj);
                } else {
                    if (i24 != 2) {
                        if (i24 == 3 || i24 == 4) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    eVar = (com.yandex.passport.internal.usecase.vpn.e) this.m;
                    qqiVar = (qqi) this.l;
                    qgg.h0(obj);
                    try {
                        boolean z3 = eVar.o;
                        if (!z3) {
                            eVar.o = true;
                        }
                        qqiVar.b(null);
                        com.yandex.passport.internal.usecase.vpn.e eVar5 = (com.yandex.passport.internal.usecase.vpn.e) this.n;
                        if (!z3) {
                            ((com.yandex.passport.common.coroutine.f) eVar5.b).getClass();
                            dq7 dq7Var = ca8.a;
                            x97.y(gld.e(mn7.d), ((com.yandex.passport.common.coroutine.b) eVar5.a).c, null, new com.yandex.passport.internal.usecase.vpn.a(eVar5, r14, i4), 2);
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "CheckVpnStatusUseCase observing started", 8);
                            }
                            com.yandex.passport.internal.usecase.vpn.e eVar6 = (com.yandex.passport.internal.usecase.vpn.e) this.n;
                            this.l = null;
                            this.m = null;
                            this.k = 3;
                            break;
                        } else {
                            this.l = null;
                            this.m = null;
                            this.k = 4;
                            break;
                        }
                    } catch (Throwable th) {
                        qqiVar.b(null);
                        throw th;
                    }
                }
                eVar = (com.yandex.passport.internal.usecase.vpn.e) this.n;
                qqiVar = eVar.q;
                this.l = qqiVar;
                this.m = eVar;
                this.k = 2;
                break;
            case 15:
                tf6 tf6Var = (tf6) this.n;
                ConnectivityManager connectivityManager = (ConnectivityManager) this.m;
                ltm ltmVar = (ltm) this.l;
                nm6 nm6Var16 = nm6.a;
                int i25 = this.k;
                if (i25 == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.utils.b bVar5 = new com.yandex.passport.internal.utils.b(ltmVar, connectivityManager, tf6Var);
                    try {
                        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().build(), bVar5);
                        com.yandex.plus.core.network.api.utils.a.i(bVar5.hashCode(), "registerNetworkCallback");
                    } catch (Exception e3) {
                        com.yandex.plus.core.network.api.utils.a.j(bVar5.hashCode(), e3, "registerNetworkCallback");
                    }
                    com.yandex.plus.core.network.api.utils.a.l(ltmVar, com.yandex.plus.core.network.api.utils.a.s(connectivityManager), tf6Var);
                    hav havVar = new hav(i3, connectivityManager, bVar5);
                    this.l = null;
                    this.k = 1;
                    if (y7g.q(ltmVar, havVar, this) == nm6Var16) {
                        return nm6Var16;
                    }
                } else {
                    if (i25 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 16:
                nm6 nm6Var17 = nm6.a;
                int i26 = this.k;
                if (i26 == 0) {
                    qgg.h0(obj);
                    pjc pjcVar4 = (pjc) this.l;
                    com.yandex.passport.common.mvi.c cVar6 = new com.yandex.passport.common.mvi.c(16, (com.yandex.passport.sloth.ui.b0) this.m, (com.yandex.passport.sloth.ui.a1) this.n);
                    this.k = 1;
                    if (pjcVar4.collect(cVar6, this) == nm6Var17) {
                        return nm6Var17;
                    }
                } else {
                    if (i26 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 17:
                String str4 = (String) this.m;
                com.yandex.plus.analytics.dwh.a aVar9 = (com.yandex.plus.analytics.dwh.a) this.l;
                com.yandex.plus.core.analytics.logging.d dVar7 = aVar9.b;
                nm6 nm6Var18 = nm6.a;
                int i27 = this.k;
                if (i27 == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.data.network.l lVar6 = aVar9.a;
                    j0v j0vVar = new j0v(str4, (Map) this.n, r14, i2);
                    ow1 ow1Var = new ow1(i5, 13, r14);
                    v42 v42Var = new v42(j0vVar, r14, 21);
                    com.yandex.plus.bdui.plus.content.controller.f fVar2 = (com.yandex.plus.bdui.plus.content.controller.f) lVar6.a;
                    com.yandex.plus.bdui.plus.content.controller.f fVar3 = new com.yandex.plus.bdui.plus.content.controller.f(com.yandex.plus.core.network.error.h.a, v42Var);
                    com.yandex.plus.bdui.plus.content.controller.f fVar4 = new com.yandex.plus.bdui.plus.content.controller.f(com.yandex.plus.core.network.error.e.a, ow1Var);
                    com.yandex.plus.core.network.retrofit.client.a aVar10 = (com.yandex.plus.core.network.retrofit.client.a) fVar2.c;
                    Function0[] function0Arr = (Function0[]) fVar2.b;
                    Function0[] function0Arr2 = (Function0[]) Arrays.copyOf(function0Arr, function0Arr.length);
                    Pair pair = new Pair(aVar10.d.getValue(), (com.yandex.plus.core.network.impl.c) aVar10.c.getValue());
                    List X = xz0.X(function0Arr2);
                    com.yandex.plus.core.network.error.a aVar11 = aVar10.a;
                    com.yandex.plus.core.network.error.b bVar6 = aVar10.b;
                    X.getClass();
                    com.yandex.plus.home.plaque.feature.internal.presentation.b bVar7 = new com.yandex.plus.home.plaque.feature.internal.presentation.b();
                    bVar7.a = pair;
                    bVar7.b = fVar3;
                    bVar7.c = fVar4;
                    bVar7.d = X;
                    bVar7.e = aVar11;
                    bVar7.f = bVar6;
                    this.k = 1;
                    c2 = bVar7.c(new com.yandex.plus.core.network.context.a(), this);
                    if (c2 == nm6Var18) {
                        return nm6Var18;
                    }
                } else {
                    if (i27 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    c2 = obj;
                }
                com.yandex.plus.core.network.call.c cVar7 = (com.yandex.plus.core.network.call.c) c2;
                boolean z4 = cVar7 instanceof com.yandex.plus.core.network.call.b;
                if (z4) {
                    com.yandex.plus.log.api.a aVar12 = com.yandex.plus.log.api.a.b;
                    if (dVar7.b(aVar12)) {
                        dVar7.a(aVar12, "DWH", hrg.q("DWH event ", str4, " sent successfully."), null);
                    }
                } else if (!(cVar7 instanceof com.yandex.plus.core.network.call.a)) {
                    b6e.s();
                    return null;
                }
                if (!z4) {
                    if (!(cVar7 instanceof com.yandex.plus.core.network.call.a)) {
                        b6e.s();
                        return null;
                    }
                    com.yandex.plus.core.network.error.l lVar7 = ((com.yandex.plus.core.network.call.a) cVar7).a;
                    com.yandex.plus.log.api.a aVar13 = com.yandex.plus.log.api.a.e;
                    if (dVar7.b(aVar13)) {
                        dVar7.a(aVar13, "DWH", hrg.q("DWH event ", str4, " not sent."), lVar7);
                    }
                }
                return Unit.a;
            case 18:
                com.yandex.plus.bdui.shared.b bVar8 = (com.yandex.plus.bdui.shared.b) this.l;
                nm6 nm6Var19 = nm6.a;
                int i28 = this.k;
                if (i28 != 0) {
                    if (i28 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                com.yandex.plus.bdui.flex.ui.s sVar = ((com.yandex.plus.bdui.flex.ui.b) this.m).g;
                Object obj7 = this.n;
                this.l = null;
                this.k = 1;
                Object v2 = sVar.v(obj7, bVar8, this);
                return v2 == nm6Var19 ? nm6Var19 : v2;
            case 19:
                mm6 mm6Var = (mm6) this.l;
                nm6 nm6Var20 = nm6.a;
                int i29 = this.k;
                if (i29 != 0) {
                    if (i29 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                Collection collection = (Collection) this.m;
                com.yandex.plus.bdui.flex.ui.n nVar2 = (com.yandex.plus.bdui.flex.ui.n) this.n;
                ArrayList arrayList = new ArrayList(v75.o(collection, 10));
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    arrayList.add(x97.p(mm6Var, nVar2.g, null, new com.yandex.passport.internal.ui.sloth.q(nVar2, (com.yandex.plus.bdui.flex.ui.p) it.next(), r14, i3), 2));
                }
                this.l = null;
                this.k = 1;
                Object v3 = ox6.v(arrayList, this);
                return v3 == nm6Var20 ? nm6Var20 : v3;
            case 20:
                com.yandex.plus.bdui.action.i iVar2 = (com.yandex.plus.bdui.action.i) this.n;
                Map map = iVar2.d;
                com.yandex.plus.bdui.query.b bVar9 = (com.yandex.plus.bdui.query.b) this.m;
                com.yandex.plus.bdui.plus.action.g gVar3 = (com.yandex.plus.bdui.plus.action.g) this.l;
                com.yandex.plus.log.api.b bVar10 = gVar3.d;
                nm6 nm6Var21 = nm6.a;
                int i30 = this.k;
                if (i30 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.log.api.a aVar14 = com.yandex.plus.log.api.a.c;
                    if (bVar10.b(aVar14)) {
                        bVar10.c(aVar14, "PlusCloseActionHandler", "handle(); query = " + bVar9);
                    }
                    com.yandex.plus.bdui.flex.action.b bVar11 = gVar3.a;
                    com.yandex.plus.bdui.document.e eVar7 = iVar2.c;
                    this.k = 1;
                    a5 = bVar11.a(bVar9, eVar7, this);
                    if (a5 == nm6Var21) {
                        return nm6Var21;
                    }
                } else {
                    if (i30 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    a5 = obj;
                }
                com.yandex.plus.bdui.action.g gVar4 = (com.yandex.plus.bdui.action.g) a5;
                if (!(gVar4 instanceof com.yandex.plus.bdui.action.f)) {
                    if (!(gVar4 instanceof com.yandex.plus.bdui.action.e)) {
                        b6e.s();
                        return null;
                    }
                    Throwable th2 = ((com.yandex.plus.bdui.action.e) gVar4).a;
                    com.yandex.plus.log.api.a aVar15 = com.yandex.plus.log.api.a.e;
                    if (bVar10.b(aVar15)) {
                        bVar10.a(aVar15, "PlusCloseActionHandler", "handle(); query execution failed!", th2);
                    }
                    return Unit.a;
                }
                com.yandex.plus.log.api.a aVar16 = com.yandex.plus.log.api.a.c;
                if (bVar10.b(aVar16)) {
                    bVar10.c(aVar16, "PlusCloseActionHandler", "handle(); query execution succeeded");
                }
                com.yandex.plus.bdui.action.f fVar5 = (com.yandex.plus.bdui.action.f) gVar4;
                com.yandex.plus.bdui.action.a aVar17 = fVar5.a;
                if (aVar17 == null) {
                    return null;
                }
                com.yandex.plus.bdui.shared.b bVar12 = fVar5.b;
                com.yandex.plus.bdui.action.h hVar2 = iVar2.b;
                com.yandex.plus.bdui.action.h hVar3 = new com.yandex.plus.bdui.action.h(bVar12 != null ? hVar2.a.d(bVar12) : hVar2.a);
                if (bVar10.b(aVar16)) {
                    bVar10.c(aVar16, "PlusCloseActionHandler", "handle(); dispatch feedback action = " + aVar17 + " with payload = " + map);
                }
                iVar2.a.a.a(aVar17, hVar3, map);
                return Unit.a;
            case 21:
                com.yandex.plus.bdui.plus.action.f fVar6 = (com.yandex.plus.bdui.plus.action.f) this.l;
                com.yandex.plus.bdui.plus.action.g gVar5 = (com.yandex.plus.bdui.plus.action.g) this.m;
                com.yandex.plus.log.api.b bVar13 = gVar5.d;
                nm6 nm6Var22 = nm6.a;
                int i31 = this.k;
                if (i31 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.bdui.query.b bVar14 = fVar6.b;
                    if (bVar14 != null) {
                        com.yandex.plus.bdui.action.i iVar3 = (com.yandex.plus.bdui.action.i) this.n;
                        kotlinx.coroutines.a aVar18 = gVar5.c;
                        we weVar = new we(gVar5, bVar14, iVar3, (Continuation) null, 20);
                        this.k = 1;
                        V2 = x97.V(aVar18, weVar, this);
                        if (V2 == nm6Var22) {
                            return nm6Var22;
                        }
                    }
                    com.yandex.plus.log.api.a aVar19 = com.yandex.plus.log.api.a.c;
                    if (bVar13.b(aVar19)) {
                        bVar13.c(aVar19, "PlusCloseActionHandler", "handle(); query not defined");
                    }
                    com.yandex.plus.log.api.a aVar20 = com.yandex.plus.log.api.a.c;
                    if (bVar13.b(aVar20)) {
                        bVar13.c(aVar20, "PlusCloseActionHandler", "handle(); result = " + fVar6.a);
                    }
                    gVar5.b.invoke(fVar6.a);
                    return Unit.a;
                }
                if (i31 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                V2 = obj;
                break;
            case 22:
                com.yandex.plus.bdui.action.i iVar4 = (com.yandex.plus.bdui.action.i) this.n;
                Map map2 = iVar4.d;
                com.yandex.plus.bdui.plus.action.h hVar4 = (com.yandex.plus.bdui.plus.action.h) this.l;
                com.yandex.plus.bdui.action.a aVar21 = hVar4.b;
                nm6 nm6Var23 = nm6.a;
                int i32 = this.k;
                if (i32 == 0) {
                    qgg.h0(obj);
                    long j = hVar4.a;
                    this.k = 1;
                    if (y2x.o(j, this) == nm6Var23) {
                        return nm6Var23;
                    }
                } else {
                    if (i32 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                com.yandex.plus.log.api.b bVar15 = ((com.yandex.plus.bdui.plus.action.i) this.m).c;
                com.yandex.plus.log.api.a aVar22 = com.yandex.plus.log.api.a.c;
                if (bVar15.b(aVar22)) {
                    bVar15.c(aVar22, "PlusDelayActionHandler", "handle(); dispatch delayed action = " + aVar21 + " with payload = " + map2);
                }
                iVar4.a.a.a(aVar21, iVar4.b, map2);
                return Unit.a;
            case 23:
                com.yandex.plus.bdui.action.i iVar5 = (com.yandex.plus.bdui.action.i) this.n;
                Map map3 = iVar5.d;
                com.yandex.plus.bdui.plus.checkout.action.c cVar8 = (com.yandex.plus.bdui.plus.checkout.action.c) this.m;
                com.yandex.plus.bdui.plus.checkout.action.b bVar16 = (com.yandex.plus.bdui.plus.checkout.action.b) this.l;
                com.yandex.plus.log.api.b bVar17 = bVar16.d;
                nm6 nm6Var24 = nm6.a;
                int i33 = this.k;
                if (i33 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.log.api.a aVar23 = com.yandex.plus.log.api.a.c;
                    if (bVar17.b(aVar23)) {
                        bVar17.c(aVar23, "PlusPayGooglePlayCompletePurchaseActionHandler", "handle(); start purchase completing");
                    }
                    com.yandex.passport.internal.flags.experiments.p pVar = bVar16.b;
                    String str5 = cVar8.a;
                    this.k = 1;
                    v = pVar.v(str5, this);
                    if (v == nm6Var24) {
                        return nm6Var24;
                    }
                } else {
                    if (i33 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    v = obj;
                }
                if (((Boolean) v).booleanValue()) {
                    com.yandex.plus.log.api.a aVar24 = com.yandex.plus.log.api.a.c;
                    if (bVar17.b(aVar24)) {
                        bVar17.c(aVar24, "PlusPayGooglePlayCompletePurchaseActionHandler", "handle(); purchase complete succeeded");
                    }
                    if (bVar17.b(aVar24)) {
                        bVar17.c(aVar24, "PlusPayGooglePlayCompletePurchaseActionHandler", "handle(); dispatch success action = " + cVar8.c + " with payload = " + map3);
                    }
                    aVar2 = cVar8.c;
                } else {
                    com.yandex.plus.log.api.a aVar25 = com.yandex.plus.log.api.a.e;
                    if (bVar17.b(aVar25)) {
                        bVar17.c(aVar25, "PlusPayGooglePlayCompletePurchaseActionHandler", "handle(); purchase complete failed!");
                    }
                    com.yandex.plus.log.api.a aVar26 = com.yandex.plus.log.api.a.c;
                    if (bVar17.b(aVar26)) {
                        bVar17.c(aVar26, "PlusPayGooglePlayCompletePurchaseActionHandler", "handle(); dispatch error action = " + cVar8.d + " with payload = " + map3);
                    }
                    aVar2 = cVar8.d;
                }
                iVar5.a.a.a(aVar2, iVar5.b, map3);
                return Unit.a;
            case 24:
                return k(obj);
            case 25:
                return l(obj);
            case 26:
                return n(obj);
            case 27:
                nm6 nm6Var25 = nm6.a;
                int i34 = this.k;
                if (i34 != 0) {
                    if (i34 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                j0v j0vVar2 = (j0v) this.l;
                com.yandex.plus.core.network.context.a aVar27 = (com.yandex.plus.core.network.context.a) this.m;
                Object obj8 = this.n;
                this.k = 1;
                Object invoke = j0vVar2.invoke(aVar27, obj8, this);
                return invoke == nm6Var25 ? nm6Var25 : invoke;
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return o(obj);
            default:
                String str6 = (String) this.l;
                nm6 nm6Var26 = nm6.a;
                int i35 = this.k;
                if (i35 != 0) {
                    if (i35 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                com.yandex.plus.core.analytics.logging.b bVar18 = com.yandex.plus.core.analytics.logging.b.a;
                String g5 = f1d.g("Saved file not found for url = ", str6);
                jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
                com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.d, bVar18, g5, null);
                com.yandex.plus.home.api.prefetch.l lVar8 = (com.yandex.plus.home.api.prefetch.l) this.m;
                String str7 = (String) this.n;
                this.k = 1;
                Object b2 = com.yandex.plus.home.api.prefetch.l.b(lVar8, str7, str6, this);
                return b2 == nm6Var26 ? nm6Var26 : b2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public we(com.yandex.passport.common.analytics.k kVar, xe xeVar, Continuation continuation) {
        super(2, continuation);
        this.j = 0;
        this.n = kVar;
        this.m = xeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ we(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
        this.m = obj2;
        this.n = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ we(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = obj;
        this.n = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ we(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.n = obj;
    }
}
