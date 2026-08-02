package com.yandex.passport.internal.ui.bouncer.roundabout;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yandex.passport.data.network.s7;
import com.yandex.passport.internal.ui.challenge.delete.DeleteAccountActivity;
import com.yandex.passport.internal.ui.challenge.delete.r1;
import com.yandex.passport.internal.ui.challenge.delete.s1;
import com.yandex.passport.internal.ui.challenge.delete.t1;
import com.yandex.passport.internal.ui.challenge.delete.u1;
import com.yandex.passport.internal.ui.challenge.delete.v1;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.LogoutBottomSheetComposeActivity;
import com.yandex.passport.internal.ui.challenge.vpn.VpnChallengeActivity;
import com.yandex.passport.internal.ui.domik.DomikActivity;
import com.yandex.passport.internal.ui.sloth.authsdk.AuthSdkSlothComposeActivity;
import com.yandex.passport.internal.ui.sloth.plusdevices.ManagingPlusDevicesActivity;
import com.yandex.passport.sloth.c1;
import com.yandex.passport.sloth.ui.a1;
import com.yandex.passport.sloth.v0;
import com.yandex.plus.bdui.plus.checkout.content.controller.n0;
import com.yandex.plus.pay.adapter.internal.h1;
import com.yandex.plus.pay.adapter.internal.y0;
import defpackage.asq;
import defpackage.b6e;
import defpackage.c5b;
import defpackage.cr;
import defpackage.e5b;
import defpackage.ei;
import defpackage.g4f;
import defpackage.g4i;
import defpackage.md;
import defpackage.mlr;
import defpackage.omb;
import defpackage.s9f;
import defpackage.sre;
import defpackage.t13;
import defpackage.t75;
import defpackage.uhp;
import defpackage.x97;
import defpackage.zh;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final /* synthetic */ class k implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k(com.yandex.passport.data.network.l lVar, com.yandex.plus.pay.adapter.api.i iVar) {
        this.a = 28;
        this.b = iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0036 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0084  */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        md mdVar;
        Integer intOrNull;
        List c;
        boolean z;
        List d;
        Iterator it;
        boolean z2;
        int i = 6;
        int i2 = -1;
        boolean z3 = true;
        Object obj2 = null;
        switch (this.a) {
            case 0:
                s7 s7Var = (s7) this.b;
                ((Context) obj).getClass();
                return (t13) s7Var.get();
            case 1:
                d dVar = (d) this.b;
                ((Context) obj).getClass();
                return (t13) dVar.get();
            case 2:
                DeleteAccountActivity deleteAccountActivity = (DeleteAccountActivity) this.b;
                v1 v1Var = (v1) obj;
                int i3 = DeleteAccountActivity.b;
                v1Var.getClass();
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "activity finishWithResult " + v1Var, 8);
                }
                if (v1Var instanceof u1) {
                    i = -1;
                } else if (v1Var instanceof r1) {
                    i = 0;
                } else if (!(v1Var instanceof t1)) {
                    if (!(v1Var instanceof s1)) {
                        b6e.s();
                        return null;
                    }
                    i = 13;
                }
                deleteAccountActivity.setResult(i, new Intent());
                deleteAccountActivity.finish();
                return Unit.a;
            case 3:
                LogoutBottomSheetComposeActivity logoutBottomSheetComposeActivity = (LogoutBottomSheetComposeActivity) this.b;
                Throwable th = (Throwable) obj;
                int i4 = LogoutBottomSheetComposeActivity.f;
                th.getClass();
                com.yandex.passport.internal.ui.a.q(logoutBottomSheetComposeActivity, th);
                return Unit.a;
            case 4:
                com.yandex.passport.internal.storage.d dVar2 = (com.yandex.passport.internal.storage.d) this.b;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) obj;
                layoutParams.getClass();
                layoutParams.width = -1;
                layoutParams.height = (int) (56 * g4i.a.density);
                dVar2.invoke(layoutParams);
                return Unit.a;
            case 5:
                VpnChallengeActivity vpnChallengeActivity = (VpnChallengeActivity) this.b;
                boolean z4 = VpnChallengeActivity.a;
                ((com.yandex.passport.internal.ui.challenge.vpn.p) obj).getClass();
                vpnChallengeActivity.finish();
                return Unit.a;
            case 6:
                ((DomikActivity) this.b).k.y.l((Boolean) obj);
                return null;
            case 7:
                com.yandex.passport.internal.ui.domik.smsauth.b bVar = (com.yandex.passport.internal.ui.domik.smsauth.b) this.b;
                com.yandex.passport.internal.ui.f fVar = (com.yandex.passport.internal.ui.f) obj;
                fVar.getClass();
                bVar.k.m(fVar);
                return Unit.a;
            case 8:
                AuthSdkSlothComposeActivity authSdkSlothComposeActivity = (AuthSdkSlothComposeActivity) this.b;
                com.yandex.passport.internal.ui.sloth.authsdk.g gVar = (com.yandex.passport.internal.ui.sloth.authsdk.g) obj;
                int i5 = AuthSdkSlothComposeActivity.a;
                gVar.getClass();
                com.yandex.passport.internal.ui.a.r(authSdkSlothComposeActivity, com.yandex.plus.core.network.api.utils.a.H(gVar));
                return Unit.a;
            case 9:
                ManagingPlusDevicesActivity managingPlusDevicesActivity = (ManagingPlusDevicesActivity) this.b;
                int intValue = ((Integer) obj).intValue();
                int i6 = ManagingPlusDevicesActivity.a;
                managingPlusDevicesActivity.setResult(intValue);
                managingPlusDevicesActivity.finish();
                return Unit.a;
            case 10:
                Activity activity = (Activity) this.b;
                WeakReference weakReference = (WeakReference) obj;
                weakReference.getClass();
                Activity activity2 = (Activity) weakReference.get();
                if (activity2 != null && !activity2.equals(activity)) {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            case 11:
                ((com.yandex.passport.sloth.i) this.b).b.a(v0.d);
                return Unit.a;
            case 12:
                zh zhVar = (zh) this.b;
                PendingIntent pendingIntent = (PendingIntent) obj;
                pendingIntent.getClass();
                try {
                    IntentSender intentSender = pendingIntent.getIntentSender();
                    intentSender.getClass();
                    zhVar.a(new sre(intentSender, null, 0, 0));
                } catch (Throwable th2) {
                    com.yandex.passport.common.logger.d dVar3 = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.d, null, "Can't launch phone number hint intent launcher.", th2);
                    }
                }
                return Unit.a;
            case 13:
                a1 a1Var = (a1) this.b;
                String str = (String) obj;
                str.getClass();
                return ((c1) a1Var).c(str);
            case 14:
                com.yandex.passport.sloth.ui.b0 b0Var = (com.yandex.passport.sloth.ui.b0) this.b;
                PendingIntent pendingIntent2 = (PendingIntent) obj;
                pendingIntent2.getClass();
                try {
                    ei eiVar = b0Var.C;
                    IntentSender intentSender2 = pendingIntent2.getIntentSender();
                    intentSender2.getClass();
                    eiVar.a(new sre(intentSender2, null, 0, 0));
                } catch (Throwable th3) {
                    com.yandex.passport.common.logger.d dVar4 = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.d, null, "Can't launch phone number hint intent launcher.", th3);
                    }
                }
                return Unit.a;
            case 15:
                com.yandex.plus.bdui.plus.checkout.o oVar = (com.yandex.plus.bdui.plus.checkout.o) this.b;
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                com.yandex.plus.bdui.action.a a = oVar.a(th4);
                com.yandex.plus.bdui.flex.action.j jVar = a instanceof com.yandex.plus.bdui.flex.action.j ? (com.yandex.plus.bdui.flex.action.j) a : null;
                return (jVar == null || (mdVar = jVar.a) == null) ? new com.yandex.plus.bdui.flex.action.e(a, null) : mdVar;
            case 16:
                n0 n0Var = (n0) this.b;
                com.yandex.plus.core.data.pay.l lVar = (com.yandex.plus.core.data.pay.l) obj;
                lVar.getClass();
                com.yandex.plus.log.api.b bVar2 = n0Var.h;
                com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
                if (bVar2.b(aVar)) {
                    bVar2.c(aVar, "PlusPayUserAddNewCardContentController", "bindNewCard(); not terminal state - ".concat(com.yandex.plus.bdui.plus.analytics.b.M(lVar)));
                }
                return Unit.a;
            case 17:
                n0 n0Var2 = (n0) this.b;
                com.yandex.plus.core.data.pay.l lVar2 = (com.yandex.plus.core.data.pay.l) obj;
                lVar2.getClass();
                com.yandex.plus.log.api.b bVar3 = n0Var2.h;
                com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.c;
                if (bVar3.b(aVar2)) {
                    bVar3.c(aVar2, "PlusPayUserAddNewSbpContentController", "bindNewSbpToken(); not terminal state - ".concat(com.yandex.plus.bdui.plus.analytics.b.M(lVar2)));
                }
                return Unit.a;
            case 18:
                uhp uhpVar = (uhp) this.b;
                g4f g4fVar = (g4f) obj;
                g4fVar.getClass();
                g4fVar.d = true;
                g4fVar.c = true;
                g4fVar.b = false;
                g4fVar.e = true;
                if (uhpVar != null) {
                    g4fVar.i = uhpVar;
                }
                return Unit.a;
            case 19:
                Class<?> cls = (Class) this.b;
                ((Class) obj).getClass();
                while (cls.isArray()) {
                    cls = cls.getComponentType();
                    cls.getClass();
                }
                if (cls.isPrimitive()) {
                    return "java.lang";
                }
                String name = cls.getName();
                int W = StringsKt.W(name, '.', 0, 6);
                return W >= 0 ? mlr.K(W, name) : "";
            case 20:
                cr crVar = (cr) this.b;
                ((com.yandex.plus.core.benchmark.l) obj).getClass();
                com.yandex.plus.home.g gVar2 = (com.yandex.plus.home.g) crVar.b;
                com.yandex.plus.paymentsdk.internal.method.e eVar = gVar2.b;
                com.yandex.passport.internal.entities.j jVar2 = gVar2.a;
                com.yandex.plus.core.graphql.daily.progress.s sVar = new com.yandex.plus.core.graphql.daily.progress.s(11);
                ((com.yandex.plus.core.dispatcher.a) ((com.yandex.plus.home.internal.di.u) crVar.c).w).getClass();
                return new com.yandex.plus.home.j(new com.yandex.plus.home.internal.di.t(eVar, jVar2, sVar, new com.yandex.passport.internal.core.accounts.h(com.yandex.plus.core.dispatcher.a.f)), (com.yandex.plus.home.internal.di.u) crVar.c, (com.yandex.plus.home.internal.di.e) crVar.d, (com.yandex.plus.home.internal.di.d) crVar.e, (com.yandex.plus.home.internal.di.l) crVar.f, (com.yandex.plus.home.plaque.feature.internal.presentation.b) crVar.g, (com.yandex.plus.domain.auth.impl.i) crVar.h, (com.yandex.plus.home.api.b) crVar.i);
            case 21:
                asq.N((TextView) ((com.yandex.plus.home.feature.panel.internal.shortcuts.daily.bottom.d) this.b).g.g(com.yandex.plus.home.feature.panel.internal.shortcuts.daily.bottom.d.o[0]), ColorStateList.valueOf(((Integer) obj).intValue()));
                return Unit.a;
            case 22:
                com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.g gVar3 = (com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.g) this.b;
                com.yandex.plus.home.feature.panel.internalapi.analytics.b bVar4 = (com.yandex.plus.home.feature.panel.internalapi.analytics.b) obj;
                bVar4.getClass();
                com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.b bVar5 = gVar3.i;
                r6 = bVar5 != null ? bVar5.b : 0;
                String str2 = gVar3.a;
                str2.getClass();
                omb ombVar = ((com.yandex.plus.home.analytics.b) bVar4).a;
                if (r6 != 0 && (intOrNull = StringsKt.toIntOrNull(r6)) != null) {
                    i2 = intOrNull.intValue();
                }
                e5b e5bVar = e5b.a;
                e5bVar.getClass();
                ombVar.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("counter_val", String.valueOf(i2));
                linkedHashMap.put("origin", e5bVar);
                linkedHashMap.put("shortcut_id", str2);
                linkedHashMap.put("_meta", omb.a(1, new HashMap()));
                ombVar.d("PlusPult.DailyWidget.Top.Clicked", linkedHashMap);
                return Unit.a;
            case 23:
                com.yandex.plus.home.feature.panel.internal.shortcuts.daily.mapper.f fVar2 = (com.yandex.plus.home.feature.panel.internal.shortcuts.daily.mapper.f) this.b;
                Integer num = (Integer) obj;
                num.getClass();
                return new Pair(fVar2, num);
            case 24:
                asq.N((TextView) ((com.yandex.plus.home.feature.panel.internal.shortcuts.daily.top.b) this.b).i.g(com.yandex.plus.home.feature.panel.internal.shortcuts.daily.top.b.s[0]), ColorStateList.valueOf(((Integer) obj).intValue()));
                return Unit.a;
            case 25:
                return com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.status.b.t((com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.status.b) this.b, ((Integer) obj).intValue());
            case 26:
                com.yandex.plus.home.feature.webviews.internal.home.k kVar = (com.yandex.plus.home.feature.webviews.internal.home.k) this.b;
                WebResourceRequest webResourceRequest = (WebResourceRequest) obj;
                s9f[] s9fVarArr = com.yandex.plus.home.feature.webviews.internal.home.k.B;
                webResourceRequest.getClass();
                return (WebResourceResponse) x97.D(kotlin.coroutines.g.a, new com.yandex.plus.bdui.ui.b(kVar, webResourceRequest, r6, 21));
            case 27:
                com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.acquisition.controllers.c cVar = (com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.acquisition.controllers.c) this.b;
                View view = (View) obj;
                view.getClass();
                ViewGroup viewGroup = cVar.a;
                if (viewGroup.getChildCount() == 0) {
                    viewGroup.addView(view);
                    ((com.yandex.plus.home.feature.webviews.internal.purchase.pay.g) cVar.e.getValue()).a();
                }
                return Unit.a;
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                com.yandex.plus.pay.adapter.api.i iVar = (com.yandex.plus.pay.adapter.api.i) this.b;
                List list = (List) obj;
                list.getClass();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next = it2.next();
                        com.yandex.plus.pay.adapter.internal.i iVar2 = (com.yandex.plus.pay.adapter.internal.i) ((com.yandex.plus.pay.adapter.api.j) next);
                        if (iVar2.e() != null) {
                            com.yandex.plus.pay.adapter.api.h e = iVar2.e();
                            if ((e != null ? com.yandex.plus.pay.adapter.internal.n.c(((h1) e).a.getVendor()) : null) != iVar) {
                                z = false;
                                d = iVar2.d();
                                if ((d instanceof Collection) || !d.isEmpty()) {
                                    it = d.iterator();
                                    while (it.hasNext()) {
                                        if (com.yandex.plus.pay.adapter.internal.n.c(((y0) ((com.yandex.plus.pay.adapter.api.e) it.next())).a.getVendor()) != iVar) {
                                            z2 = false;
                                            if (z && z2) {
                                                obj2 = next;
                                            }
                                        }
                                    }
                                }
                                z2 = true;
                                if (z) {
                                }
                            }
                        }
                        z = true;
                        d = iVar2.d();
                        if (d instanceof Collection) {
                        }
                        it = d.iterator();
                        while (it.hasNext()) {
                        }
                        z2 = true;
                        if (z) {
                        }
                    }
                }
                com.yandex.plus.pay.adapter.api.j jVar3 = (com.yandex.plus.pay.adapter.api.j) obj2;
                return (jVar3 == null || (c = t75.c(jVar3)) == null) ? c5b.a : c;
            default:
                com.yandex.plus.home.feature.webviews.internal.smart.i iVar3 = (com.yandex.plus.home.feature.webviews.internal.smart.i) this.b;
                WebResourceRequest webResourceRequest2 = (WebResourceRequest) obj;
                s9f[] s9fVarArr2 = com.yandex.plus.home.feature.webviews.internal.smart.i.r;
                webResourceRequest2.getClass();
                return (WebResourceResponse) x97.D(kotlin.coroutines.g.a, new com.yandex.plus.bdui.ui.b(iVar3, webResourceRequest2, r6, 25));
        }
    }

    public /* synthetic */ k(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ k(com.yandex.plus.bdui.plus.checkout.o oVar, com.yandex.plus.bdui.flex.utils.b bVar) {
        this.a = 15;
        this.b = oVar;
    }
}
