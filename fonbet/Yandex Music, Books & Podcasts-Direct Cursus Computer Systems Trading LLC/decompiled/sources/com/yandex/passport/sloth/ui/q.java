package com.yandex.passport.sloth.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.view.View;
import android.view.Window;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.o4;
import defpackage.aur;
import defpackage.b6e;
import defpackage.jyr;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.x97;
import defpackage.z7o;
import java.io.ByteArrayOutputStream;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class q extends aur implements Function2 {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
        this.k = obj2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                q qVar = new q((y1) this.l, continuation, 0);
                qVar.k = obj;
                return qVar;
            case 1:
                q qVar2 = new q((com.yandex.passport.internal.ui.sloth.webcard.n) this.l, continuation, 1);
                qVar2.k = obj;
                return qVar2;
            case 2:
                q qVar3 = new q((com.yandex.passport.internal.ui.sloth.webcard.n) this.l, continuation, 2);
                qVar3.k = ((com.yandex.passport.common.url.b) obj).a;
                return qVar3;
            case 3:
                return new q((y1) this.l, (x1) this.k, continuation, 3);
            case 4:
                return new q((com.yandex.plus.bdui.flex.ui.n) this.k, (com.yandex.passport.internal.ui.challenge.vpn.c) this.l, false, continuation, 4);
            case 5:
                return new q((com.yandex.plus.webview.core.d) this.k, (String) this.l, false, continuation, 5);
            case 6:
                q qVar4 = new q((com.yandex.plus.home.t) this.l, continuation, 6);
                qVar4.k = obj;
                return qVar4;
            case 7:
                return new q((com.yandex.passport.internal.core.accounts.h) this.k, (com.yandex.plus.home.dailyquests.repository.api.dailyquests.i) this.l, false, continuation, 7);
            case 8:
                return new q((com.yandex.plus.home.feature.webviews.internal.bridge.b) this.k, (o4) this.l, false, continuation, 8);
            case 9:
                return new q((com.yandex.plus.home.feature.webviews.internal.webview.b) this.k, (o4) this.l, false, continuation, 9);
            case 10:
                q qVar5 = new q((com.yandex.plus.home.graphql.plusstate.f) this.l, continuation, 10);
                qVar5.k = obj;
                return qVar5;
            case 11:
                q qVar6 = new q((com.yandex.plus.home.graphql.user.e) this.l, continuation, 11);
                qVar6.k = obj;
                return qVar6;
            case 12:
                return new q((com.yandex.passport.internal.entities.j) this.k, (com.yandex.plus.home.repository.api.model.user.a) this.l, false, continuation, 12);
            case 13:
                return new q((com.yandex.plus.home.repository.api.model.panel.d0) this.k, (com.yandex.passport.internal.entities.j) this.l, false, continuation, 13);
            case 14:
                q qVar7 = new q((com.yandex.plus.pay.internal.feature.payment.inapp.google.d) this.l, continuation, 14);
                qVar7.k = obj;
                return qVar7;
            case 15:
                return new q((com.yandex.plus.home.plaque.feature.internal.presentation.b) this.k, (Context) this.l, false, continuation, 15);
            case 16:
                return new q((com.yandex.plus.pay.ui.webview.paymentwidget.ui.d) this.k, (String) this.l, false, continuation, 16);
            default:
                return new q((com.yandex.passport.internal.core.accounts.h) this.l, this.k, continuation, 17);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 2:
                break;
        }
        return ((q) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Uri A;
        String str;
        int i = this.j;
        Continuation continuation = null;
        Object obj2 = this.l;
        switch (i) {
            case 0:
                y1 y1Var = (y1) obj2;
                b bVar = (b) this.k;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "SlothNetworkStatus " + bVar, 8);
                }
                if (Intrinsics.d(bVar, b.a)) {
                    y1Var.a(q1.a);
                } else if (Intrinsics.d(bVar, b.b)) {
                    y1Var.a(new t1(com.yandex.passport.sloth.ui.webview.b.a));
                } else if (bVar != null) {
                    b6e.s();
                    return null;
                }
                return Unit.a;
            case 1:
                com.yandex.passport.sloth.u uVar = (com.yandex.passport.sloth.u) this.k;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                ((com.yandex.passport.internal.ui.sloth.webcard.n) obj2).n(new c0(uVar));
                return Unit.a;
            case 2:
                String str2 = (String) this.k;
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                ((com.yandex.passport.internal.ui.sloth.webcard.n) obj2).n(new d0(str2));
                return Unit.a;
            case 3:
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                ((y1) obj2).k.a((x1) this.k);
                return Unit.a;
            case 4:
                nm6 nm6Var5 = nm6.a;
                qgg.h0(obj);
                com.yandex.plus.bdui.flex.ui.n nVar = (com.yandex.plus.bdui.flex.ui.n) this.k;
                com.yandex.passport.internal.ui.challenge.vpn.c cVar = (com.yandex.passport.internal.ui.challenge.vpn.c) obj2;
                com.yandex.plus.log.api.b bVar2 = nVar.i;
                com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
                if (bVar2.b(aVar)) {
                    bVar2.c(aVar, "PlusUiControllerUpdateCoordinatorImpl", "finishUpdate()");
                }
                nVar.j = com.yandex.plus.bdui.flex.ui.g.b;
                cVar.invoke(nVar);
                return Unit.a;
            case 5:
                nm6 nm6Var6 = nm6.a;
                qgg.h0(obj);
                ((com.yandex.plus.webview.core.d) this.k).n((String) obj2, null);
                return Unit.a;
            case 6:
                mm6 mm6Var = (mm6) this.k;
                nm6 nm6Var7 = nm6.a;
                qgg.h0(obj);
                com.yandex.plus.home.t tVar = (com.yandex.plus.home.t) obj2;
                x97.y(mm6Var, null, null, new com.yandex.plus.home.o(tVar, continuation, 9), 3);
                return x97.y(mm6Var, null, null, new com.yandex.plus.home.o(tVar, continuation, 10), 3);
            case 7:
                nm6 nm6Var8 = nm6.a;
                qgg.h0(obj);
                com.yandex.plus.home.dailyquests.repository.api.dailyquests.i iVar = (com.yandex.plus.home.dailyquests.repository.api.dailyquests.i) obj2;
                String str3 = iVar.a;
                String str4 = iVar.c;
                String str5 = iVar.d;
                str3.getClass();
                str4.getClass();
                str5.getClass();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str3);
                int T = StringsKt.T(spannableStringBuilder, str4, 0, false, 6);
                Integer valueOf = Integer.valueOf(T);
                if (T < 0) {
                    valueOf = null;
                }
                if (valueOf == null) {
                    return null;
                }
                int intValue = valueOf.intValue();
                spannableStringBuilder.replace(intValue, str4.length() + intValue, (CharSequence) str5);
                return new SpannedString(spannableStringBuilder);
            case 8:
                nm6 nm6Var9 = nm6.a;
                qgg.h0(obj);
                com.yandex.plus.home.feature.webviews.internal.bridge.b bVar3 = (com.yandex.plus.home.feature.webviews.internal.bridge.b) this.k;
                com.yandex.plus.core.graphql.type.a1 a1Var = bVar3.e;
                o4 o4Var = (o4) obj2;
                String str6 = o4Var.b;
                a1Var.getClass();
                str6.getClass();
                bVar3.A(new com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.x(o4Var.a, str6));
                return Unit.a;
            case 9:
                nm6 nm6Var10 = nm6.a;
                qgg.h0(obj);
                com.yandex.plus.home.feature.webviews.internal.webview.b bVar4 = (com.yandex.plus.home.feature.webviews.internal.webview.b) this.k;
                com.yandex.plus.core.graphql.type.a1 a1Var2 = bVar4.i;
                o4 o4Var2 = (o4) obj2;
                String str7 = o4Var2.b;
                a1Var2.getClass();
                str7.getClass();
                bVar4.C(new com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.x(o4Var2.a, o4Var2.b));
                return Unit.a;
            case 10:
                com.yandex.plus.home.repository.api.model.f fVar = (com.yandex.plus.home.repository.api.model.f) this.k;
                nm6 nm6Var11 = nm6.a;
                qgg.h0(obj);
                com.yandex.plus.core.analytics.logging.d dVar = ((com.yandex.plus.home.graphql.plusstate.f) obj2).g;
                com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.b;
                if (dVar.b(aVar2)) {
                    dVar.a(aVar2, "PlusStateRepositoryImpl", "getPlusStateFlow(): " + fVar, null);
                }
                return Unit.a;
            case 11:
                com.yandex.plus.home.repository.api.model.f fVar2 = (com.yandex.plus.home.repository.api.model.f) this.k;
                nm6 nm6Var12 = nm6.a;
                qgg.h0(obj);
                com.yandex.plus.core.analytics.logging.d dVar2 = ((com.yandex.plus.home.graphql.user.e) obj2).e;
                com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.b;
                if (dVar2.b(aVar3)) {
                    dVar2.a(aVar3, "GraphQLUserRepository", "getUserWithFamilyFlow(): " + fVar2, null);
                }
                return Unit.a;
            case 12:
                nm6 nm6Var13 = nm6.a;
                qgg.h0(obj);
                return Boolean.valueOf(((com.yandex.plus.home.core.navigation.b) ((com.yandex.passport.internal.entities.j) this.k).c).a(null, ((com.yandex.plus.home.repository.api.model.user.a) obj2).b, "text/plain"));
            case 13:
                com.yandex.passport.internal.entities.j jVar = (com.yandex.passport.internal.entities.j) obj2;
                com.yandex.plus.home.internal.di.z zVar = (com.yandex.plus.home.internal.di.z) jVar.a;
                nm6 nm6Var14 = nm6.a;
                qgg.h0(obj);
                com.yandex.plus.home.repository.api.model.panel.d0 d0Var = (com.yandex.plus.home.repository.api.model.panel.d0) this.k;
                String str8 = d0Var.c;
                if (StringsKt.U(str8)) {
                    str8 = null;
                }
                if (str8 == null) {
                    str8 = d0Var.d;
                }
                int ordinal = d0Var.e.ordinal();
                if (ordinal != 0 && ordinal != 1) {
                    if (ordinal == 2) {
                        A = Uri.parse(str8);
                    } else if (ordinal != 3) {
                        if (ordinal != 4) {
                            b6e.s();
                            return null;
                        }
                        com.yandex.plus.bdui.flex.ui.s sVar = new com.yandex.plus.bdui.flex.ui.s(zVar.D, zVar.K, (Set) zVar.Q.invoke(), (Uri) zVar.R.invoke(), (Uri) zVar.S.invoke());
                        A = sVar.A((com.yandex.plus.home.feature.webviews.internal.uri.a) sVar.g);
                    }
                    return Boolean.valueOf(((com.yandex.plus.home.core.navigation.a) jVar.b).a(A));
                }
                Uri parse = Uri.parse(str8);
                zVar.getClass();
                parse.getClass();
                com.yandex.plus.bdui.flex.ui.s sVar2 = new com.yandex.plus.bdui.flex.ui.s(zVar.D, zVar.K, (Set) zVar.Q.invoke(), (Uri) zVar.R.invoke(), (Uri) zVar.S.invoke());
                Object r = sVar2.r(parse);
                if (z7o.a(r) != null) {
                    r = (com.yandex.plus.home.feature.webviews.internal.uri.b) ((jyr) sVar2.e).getValue();
                }
                A = sVar2.A((com.yandex.plus.home.feature.webviews.internal.uri.j) r);
                return Boolean.valueOf(((com.yandex.plus.home.core.navigation.a) jVar.b).a(A));
            case 14:
                com.yandex.plus.pay.api.feature.inapp.restore.e eVar = (com.yandex.plus.pay.api.feature.inapp.restore.e) this.k;
                nm6 nm6Var15 = nm6.a;
                qgg.h0(obj);
                com.yandex.plus.pay.log.impl.b bVar5 = ((com.yandex.plus.pay.internal.feature.payment.inapp.google.d) obj2).f;
                com.yandex.plus.pay.common.internal.log.a aVar4 = com.yandex.plus.pay.common.internal.log.a.b;
                eVar.getClass();
                if (eVar instanceof com.yandex.plus.pay.api.feature.inapp.restore.d) {
                    str = "Waiting";
                } else if (eVar instanceof com.yandex.plus.pay.api.feature.inapp.restore.c) {
                    str = "Success";
                } else {
                    if (!(eVar instanceof com.yandex.plus.pay.api.feature.inapp.restore.b)) {
                        b6e.s();
                        return null;
                    }
                    str = "Error(exception=" + ((com.yandex.plus.pay.api.feature.inapp.restore.b) eVar).a + ')';
                }
                bVar5.g(aVar4, "Collect in-app restore state: ".concat(str), null);
                return Unit.a;
            case 15:
                nm6 nm6Var16 = nm6.a;
                qgg.h0(obj);
                Context context = (Context) obj2;
                ((com.yandex.plus.home.plaque.feature.internal.presentation.b) this.k).getClass();
                Activity activity = context instanceof Activity ? (Activity) context : null;
                if (activity == null) {
                    return null;
                }
                Window window = activity.getWindow();
                window.getClass();
                View rootView = window.getDecorView().getRootView();
                Bitmap createBitmap = Bitmap.createBitmap(rootView.getWidth(), rootView.getHeight(), Bitmap.Config.ARGB_8888);
                rootView.draw(new Canvas(createBitmap));
                if (createBitmap == null) {
                    return null;
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArray.getClass();
                return com.yandex.plus.home.plaque.feature.internal.presentation.b.j("image/png", byteArray);
            case 16:
                nm6 nm6Var17 = nm6.a;
                qgg.h0(obj);
                com.yandex.plus.pay.ui.webview.paymentwidget.ui.d dVar3 = (com.yandex.plus.pay.ui.webview.paymentwidget.ui.d) this.k;
                dVar3.k.a(dVar3.g, (String) obj2, "init-started");
                dVar3.j.y("Started message timeout!");
                com.yandex.plus.log.api.b bVar6 = dVar3.i;
                com.yandex.plus.log.api.a aVar5 = com.yandex.plus.log.api.a.e;
                if (bVar6.b(aVar5)) {
                    bVar6.c(aVar5, "WebPaymentWidgetContractImpl", "Started message timeout!");
                }
                return Unit.a;
            default:
                nm6 nm6Var18 = nm6.a;
                qgg.h0(obj);
                com.yandex.plus.home.feature.webviews.internalapi.bridge.c cVar2 = (com.yandex.plus.home.feature.webviews.internalapi.bridge.c) ((com.yandex.passport.internal.core.accounts.h) obj2).b;
                Object obj3 = this.k;
                obj3.getClass();
                return cVar2.a.c(cVar2.b, obj3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(Object obj, Object obj2, boolean z, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = obj;
        this.l = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
    }
}
