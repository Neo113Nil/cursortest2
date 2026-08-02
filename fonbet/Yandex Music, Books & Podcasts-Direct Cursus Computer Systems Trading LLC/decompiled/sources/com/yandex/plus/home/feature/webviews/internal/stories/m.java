package com.yandex.plus.home.feature.webviews.internal.stories;

import android.content.res.TypedArray;
import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.yandex.plus.bdui.r;
import com.yandex.plus.home.internal.di.y;
import com.yandex.plus.metrica.utils.a0;
import com.yandex.plus.metrica.utils.x;
import com.yandex.plus.pay.internal.model.PlusPayClosingOffer;
import com.yandex.plus.pay.ui.core.mobile.view.PlusPayAvatarImageView;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.u;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.yandex.plus.pay.ui.yb.web.internal.ui.PlusPayYbWebActivity;
import com.yandex.plus.plaquesdk.plaque.api.models.j0;
import defpackage.aaw;
import defpackage.b6e;
import defpackage.b85;
import defpackage.is6;
import defpackage.jk6;
import defpackage.kpj;
import defpackage.mn7;
import defpackage.ot0;
import defpackage.p79;
import defpackage.q5b;
import defpackage.r7o;
import defpackage.rj7;
import defpackage.s9f;
import defpackage.sj;
import defpackage.t7o;
import defpackage.tah;
import defpackage.uao;
import defpackage.vat;
import defpackage.wop;
import defpackage.wyf;
import defpackage.x97;
import defpackage.xdr;
import defpackage.z7o;
import io.appmetrica.analytics.IReporterYandex;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt__StringsKt;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final /* synthetic */ class m implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [com.yandex.plus.plaquesdk.plaque.api.models.j0] */
    /* JADX WARN: Type inference failed for: r9v34, types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List split$default;
        Object t7oVar;
        Object obj2;
        Set set;
        Iterable iterable;
        int i = this.a;
        int i2 = 0;
        int i3 = 2;
        String str = null;
        com.yandex.passport.internal.entities.j jVar = null;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                WebResourceRequest webResourceRequest = (WebResourceRequest) obj;
                s9f[] s9fVarArr = p.C;
                webResourceRequest.getClass();
                return (WebResourceResponse) x97.D(kotlin.coroutines.g.a, new com.yandex.plus.bdui.ui.b((p) obj3, webResourceRequest, r6, 27));
            case 1:
                vat vatVar = (vat) obj;
                vatVar.getClass();
                com.yandex.plus.home.plaque.repository.api.model.a aVar = (com.yandex.plus.home.plaque.repository.api.model.a) vatVar.b;
                com.yandex.plus.home.plaque.repository.api.model.b bVar = (com.yandex.plus.home.plaque.repository.api.model.b) vatVar.c;
                com.yandex.passport.internal.entities.j jVar2 = ((com.yandex.plus.home.plaque.feature.internal.presentation.h) obj3).e;
                j0 j0Var = aVar != null ? aVar.a : bVar.a;
                jVar2.getClass();
                int ordinal = j0Var.d.ordinal();
                if (ordinal == 0 || ordinal == 1) {
                    ReentrantLock reentrantLock = (ReentrantLock) jVar2.e;
                    reentrantLock.lock();
                    try {
                        com.yandex.passport.internal.flags.experiments.p pVar = (com.yandex.passport.internal.flags.experiments.p) jVar2.d;
                        if (pVar != null) {
                            Map b = tah.b(new Pair("plaque_source", j0Var.e.name()));
                            com.yandex.plus.core.benchmark.l lVar = (com.yandex.plus.core.benchmark.l) pVar.b;
                            AtomicReference atomicReference = (AtomicReference) pVar.d;
                            com.yandex.plus.home.benchmark.a aVar2 = com.yandex.plus.home.benchmark.a.b;
                            com.yandex.plus.home.benchmark.a aVar3 = com.yandex.plus.home.benchmark.a.c;
                            while (true) {
                                if (atomicReference.compareAndSet(aVar2, aVar3)) {
                                    lVar.d();
                                    ((com.yandex.plus.bdui.q) pVar.c).invoke(lVar, b);
                                } else if (atomicReference.get() != aVar2) {
                                }
                            }
                        }
                        jVar2.d = null;
                        xdr xdrVar = (xdr) jVar2.c;
                        Boolean bool = Boolean.FALSE;
                        xdrVar.getClass();
                        xdrVar.m(null, bool);
                        reentrantLock.unlock();
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                } else if (ordinal != 2 && ordinal != 3) {
                    b6e.s();
                    return null;
                }
                return new Pair(bVar.a, aVar != null ? aVar.a : null);
            case 2:
                IReporterYandex iReporterYandex = (IReporterYandex) obj;
                iReporterYandex.getClass();
                return new com.yandex.plus.core.analytics.metrica.h(iReporterYandex, (a0) ((x) obj3).g.getValue());
            case 3:
                com.yandex.plus.pay.log.impl.b bVar2 = (com.yandex.plus.pay.log.impl.b) obj3;
                String str2 = (String) obj;
                str2.getClass();
                String[] strArr = {"Authorization", "X-OAuth-Token"};
                split$default = StringsKt__StringsKt.split$default(str2, new String[]{StringUtil.LF}, false, 0, 6, null);
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : split$default) {
                    String str3 = (String) obj4;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= 2) {
                            arrayList.add(obj4);
                        } else {
                            if (kotlin.text.c.v(str3, strArr[i4], false)) {
                                break;
                            }
                            i4++;
                        }
                    }
                }
                com.yandex.plus.pay.log.impl.b.d(bVar2, com.yandex.plus.pay.api.log.b.a, CollectionsKt.X(arrayList, StringUtil.LF, null, null, null, 62));
                return Unit.a;
            case 4:
                uao uaoVar = (uao) obj;
                uaoVar.getClass();
                uaoVar.a(new com.yandex.plus.core.network.c(((com.yandex.plus.pay.internal.di.e) obj3).a.a()));
                return Unit.a;
            case 5:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                com.yandex.plus.pay.log.impl.b.f(((com.yandex.plus.pay.internal.feature.offers.j) obj3).e, com.yandex.plus.pay.common.internal.log.a.c, "Error when receiving composite offers. Retrying...", th2, 8);
                return Unit.a;
            case 6:
                ValueCallback valueCallback = (ValueCallback) obj;
                s9f[] s9fVarArr2 = com.yandex.plus.pay.ui.core.debug.internal.ui.form.e.o;
                valueCallback.getClass();
                x97.y(wyf.F(((com.yandex.plus.pay.ui.core.debug.internal.ui.form.e) obj3).getLifecycle()), null, null, new com.yandex.plus.pay.ui.core.debug.internal.ui.form.b(valueCallback, r6, i2), 3);
                return Unit.a;
            case 7:
                PlusPayAvatarImageView plusPayAvatarImageView = (PlusPayAvatarImageView) obj3;
                TypedArray typedArray = (TypedArray) obj;
                int i5 = PlusPayAvatarImageView.g;
                typedArray.getClass();
                plusPayAvatarImageView.setStrokeWidth(typedArray.getDimension(2, plusPayAvatarImageView.getResources().getDimension(R.dimen.pay_sdk_avatar_stroke_width)));
                plusPayAvatarImageView.setStrokePadding(typedArray.getDimension(1, plusPayAvatarImageView.getResources().getDimension(R.dimen.pay_sdk_avatar_stroke_padding)));
                plusPayAvatarImageView.setPlusStroked(typedArray.getBoolean(0, false));
                return Unit.a;
            case 8:
                sj sjVar = (sj) obj3;
                ((is6) obj).getClass();
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.i iVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.i) sjVar.b;
                if (iVar.i != null) {
                    com.yandex.plus.core.imageloader.b bVar3 = iVar.n;
                    ((com.yandex.plus.core.dispatcher.a) iVar.a().q).getClass();
                    mn7 mn7Var = com.yandex.plus.core.dispatcher.a.e;
                    com.yandex.plus.pay.log.impl.b bVar4 = iVar.o;
                    bVar3.getClass();
                    mn7Var.getClass();
                    bVar4.getClass();
                    try {
                        r7o r7oVar = z7o.b;
                        aaw aawVar = p79.b;
                        t7oVar = "32.48.0";
                    } catch (Throwable th3) {
                        r7o r7oVar2 = z7o.b;
                        t7oVar = new t7o(th3);
                    }
                    Throwable a = z7o.a(t7oVar);
                    if (a != null) {
                        b6e.o("Can not get DivKit version!", a);
                        return null;
                    }
                    String str4 = (String) t7oVar;
                    com.yandex.plus.divkit.utils.a aVar4 = (com.yandex.plus.divkit.utils.a) com.yandex.plus.divkit.api.f.b.getValue();
                    com.yandex.plus.core.version.d dVar = aVar4.a;
                    com.yandex.plus.core.version.a a2 = com.yandex.plus.core.version.e.a(str4);
                    if (a2 == null) {
                        rj7.i(str4, "\" parsing failed!", "DivKit version \"");
                        return null;
                    }
                    int i6 = a2.b;
                    int i7 = a2.a;
                    if ((Integer.compare(i7 ^ Integer.MIN_VALUE, -2147483616) <= 0 && (i7 != 32 || Integer.compare(i6 ^ Integer.MIN_VALUE, -2147483636) < 0)) || Integer.compare(i7 ^ Integer.MIN_VALUE, -2147483616) > 0) {
                        throw new IllegalStateException(("DivKit version \"" + str4 + "\" is not compatible with version constraints " + dVar + '!').toString());
                    }
                    Iterator it = aVar4.b.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (com.yandex.plus.divkit.utils.a.a(bVar4, (String) obj2) != null) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    if (((String) obj2) == null || (set = com.yandex.plus.divkit.utils.a.d) == null) {
                        set = q5b.a;
                    }
                    Iterator it2 = aVar4.c.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            ?? next = it2.next();
                            if (com.yandex.plus.divkit.utils.a.a(bVar4, (String) next) != null) {
                                str = next;
                            }
                        }
                    }
                    if (str == null || (iterable = com.yandex.plus.divkit.utils.a.e) == null) {
                        iterable = q5b.a;
                    }
                    LinkedHashSet i8 = wop.i(set, iterable);
                    bVar3.getClass();
                    mn7Var.getClass();
                    bVar4.getClass();
                    jVar = new com.yandex.passport.internal.entities.j();
                    jVar.a = str4;
                    jVar.b = i8;
                    jVar.c = bVar3;
                    jVar.d = mn7Var;
                    jVar.e = bVar4;
                }
                com.yandex.passport.internal.entities.j jVar3 = jVar;
                r rVar = iVar.b;
                String str5 = (String) sjVar.c;
                String str6 = (String) sjVar.d;
                String str7 = (String) sjVar.e;
                String str8 = (String) sjVar.f;
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.a aVar5 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.a) iVar.u.getValue();
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.n nVar = iVar.c;
                String str9 = (String) iVar.v.getValue();
                int i9 = sjVar.a;
                com.yandex.plus.core.locale.a aVar6 = iVar.a().m;
                com.yandex.plus.core.location.a aVar7 = iVar.a().o;
                com.yandex.plus.core.strings.a aVar8 = iVar.a().h;
                com.yandex.plus.pay.ui.core.api.common.a aVar9 = (com.yandex.plus.pay.ui.core.api.common.a) iVar.w.getValue();
                com.yandex.plus.pay.ui.design.api.api.a aVar10 = iVar.e;
                y yVar = iVar.f;
                com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.d dVar2 = (com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.d) iVar.F.getValue();
                com.yandex.plus.pay.ui.core.api.domain.a aVar11 = (com.yandex.plus.pay.ui.core.api.domain.a) iVar.G.getValue();
                com.yandex.plus.metrica.utils.i iVar2 = iVar.a().s;
                com.yandex.plus.pay.internal.common.e eVar = iVar.a().v;
                int i10 = 0;
                int i11 = 0;
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k kVar = new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k(i11, iVar, com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.i.class, "getTestIds", "getTestIds()Ljava/util/List;", i10, 0);
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k kVar2 = new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k(i11, iVar, com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.i.class, "getTriggeredTestIds", "getTriggeredTestIds()Ljava/lang/String;", i10, 1);
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k kVar3 = new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k(i11, iVar, com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.i.class, "getExperimentFlags", "getExperimentFlags()Ljava/util/Set;", i10, 2);
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k kVar4 = new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k(i11, iVar, com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.i.class, "getDwhAnalyticsReporter", "getDwhAnalyticsReporter()Lcom/yandex/plus/analytics/dwh/DwhAnalyticsReporter;", i10, 3);
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k kVar5 = new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k(i11, iVar, com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.i.class, "getAnalyticsGlobalParams", "getAnalyticsGlobalParams()Ljava/util/Map;", i10, 4);
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k kVar6 = new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k(i11, iVar, com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.i.class, "getOffersAnalyticsGlobalParams", "getOffersAnalyticsGlobalParams()Ljava/util/Map;", i10, 5);
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k kVar7 = new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k(i11, iVar, com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.i.class, "getOffersAnalyticsPlatformParams", "getOffersAnalyticsPlatformParams()Ljava/util/Map;", i10, 6);
                int i12 = 0;
                return new u(rVar, str5, str6, str7, str8, aVar5, nVar, str9, i9, aVar6, aVar7, aVar8, aVar9, aVar10, yVar, dVar2, aVar11, iVar2, eVar, kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, new com.yandex.plus.home.feature.webviews.internal.webview.a(1, iVar, com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.i.class, "getGoogleBillingConfig", "getGoogleBillingConfig(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", i10, 26), iVar.a().f, iVar.a().g, new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k(0, iVar, com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.i.class, "getHttpClient", "getHttpClient()Lokhttp3/OkHttpClient;", i10, 7), iVar.g, iVar.n, iVar.a().n, iVar.h, iVar.a().F, jVar3, iVar.j, iVar.k, iVar.l, iVar.a().K, new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.animation.a(22, sjVar), iVar.a().y, new jk6(0, 28, com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.i.class, iVar, "benchmarkReporter", "getBenchmarkReporter()Lcom/yandex/plus/pay/internal/benchmark/BenchmarkReporter;"), iVar.m, new com.yandex.plus.home.feature.webviews.internal.webview.a(1, iVar, com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.i.class, "getPaymentWidgetContractFactory", "getPaymentWidgetContractFactory(Lkotlin/jvm/functions/Function0;)Lcom/yandex/plus/pay/ui/webview/paymentwidget/ui/WebPaymentWidgetContractFactory;", 0, 25), new jk6(i12, 29, com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.i.class, iVar, "familyContractFactory", "getFamilyContractFactory()Lcom/yandex/plus/pay/ui/webview/family/ui/FamilyContractFactory;"), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.j(i12, 0, com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.i.class, iVar, "familyScreenAnalytics", "getFamilyScreenAnalytics()Lcom/yandex/plus/pay/ui/webview/family/domain/FamilyScreenAnalytics;"), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.j(i12, 1, com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.i.class, iVar, "familyWebViewDiagnostic", "getFamilyWebViewDiagnostic()Lcom/yandex/plus/pay/ui/webview/common/diagnostic/WebViewDiagnostic;"), (com.yandex.plus.bdui.plus.checkout.g) iVar.E.getValue(), iVar.a().q, iVar.o, iVar.s);
            case 9:
                com.yandex.plus.log.api.b bVar5 = ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.d) obj3).c;
                com.yandex.plus.core.data.pay.l lVar2 = (com.yandex.plus.core.data.pay.l) obj;
                lVar2.getClass();
                if (lVar2 instanceof com.yandex.plus.core.data.pay.p) {
                    com.yandex.plus.log.api.a aVar12 = com.yandex.plus.log.api.a.c;
                    if (bVar5.b(aVar12)) {
                        bVar5.c(aVar12, "BindPaymentMethodInteractor", "PlusSelectPaymentMethodState.Started");
                    }
                } else {
                    if (!(lVar2 instanceof com.yandex.plus.core.data.pay.o)) {
                        b6e.s();
                        return null;
                    }
                    com.yandex.plus.log.api.a aVar13 = com.yandex.plus.log.api.a.d;
                    if (bVar5.b(aVar13)) {
                        bVar5.c(aVar13, "BindPaymentMethodInteractor", "PlusSelectPaymentMethodState.NonTerminalError - " + ((com.yandex.plus.core.data.pay.o) lVar2).d);
                    }
                }
                return Unit.a;
            case 10:
                TarifficatorScenarioActivity tarifficatorScenarioActivity = (TarifficatorScenarioActivity) obj3;
                s9f[] s9fVarArr3 = TarifficatorScenarioActivity.g;
                ((kpj) obj).getClass();
                if (tarifficatorScenarioActivity.getSupportFragmentManager().H() == 0) {
                    ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.c) tarifficatorScenarioActivity.f.getValue()).n.a();
                } else {
                    tarifficatorScenarioActivity.getSupportFragmentManager().T();
                }
                return Unit.a;
            case 11:
                s9f[] s9fVarArr4 = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.q.s;
                ((kpj) obj).getClass();
                ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.q) obj3).A().L();
                return Unit.a;
            case 12:
                s9f[] s9fVarArr5 = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.closing.f.l;
                ((kpj) obj).getClass();
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.closing.k kVar8 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.closing.k) ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.closing.f) obj3).i.getValue();
                PlusPayClosingOffer plusPayClosingOffer = kVar8.q;
                if (plusPayClosingOffer != null) {
                    ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.closing.b) kVar8.p).a(kVar8.n.a.a(), plusPayClosingOffer);
                }
                kVar8.k.a();
                return Unit.a;
            case 13:
                s9f[] s9fVarArr6 = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.g.q;
                ((kpj) obj).getClass();
                ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.g) obj3).z().G();
                return Unit.a;
            case 14:
                s9f[] s9fVarArr7 = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.f.l;
                ((kpj) obj).getClass();
                ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.k) ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.f) obj3).i.getValue()).k.a();
                return Unit.a;
            case 15:
                s9f[] s9fVarArr8 = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.f.l;
                ((kpj) obj).getClass();
                ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.k) ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.f) obj3).i.getValue()).r.a();
                return Unit.a;
            case 16:
                s9f[] s9fVarArr9 = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.e.p;
                ((kpj) obj).getClass();
                ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.e) obj3).z().G();
                return Unit.a;
            case 17:
                s9f[] s9fVarArr10 = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.presale.c.l;
                ((kpj) obj).getClass();
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.presale.j x = ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.presale.c) obj3).x();
                x.J();
                x.G();
                return Unit.a;
            case 18:
                s9f[] s9fVarArr11 = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent.e.m;
                ((kpj) obj).getClass();
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent.l lVar3 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent.l) ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent.e) obj3).h.getValue();
                x97.y(ot0.F(lVar3), null, null, new com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.d(lVar3, r6, i3), 3);
                return Unit.a;
            case 19:
                s9f[] s9fVarArr12 = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.f.q;
                ((kpj) obj).getClass();
                ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.f) obj3).z().l.b(com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.success.b.e);
                return Unit.a;
            case 20:
                s9f[] s9fVarArr13 = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup.d.m;
                ((kpj) obj).getClass();
                ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup.d) obj3).y().G();
                return Unit.a;
            case 21:
                s9f[] s9fVarArr14 = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.d.o;
                ((kpj) obj).getClass();
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.m z = ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.d) obj3).z();
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.i iVar3 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.i) z.z.getValue();
                if ((iVar3 instanceof com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.g) || (iVar3 instanceof com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.f) || (iVar3 instanceof com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.e)) {
                    z.H();
                } else if (!(iVar3 instanceof com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.h)) {
                    b6e.s();
                    return null;
                }
                return Unit.a;
            case 22:
                s9f[] s9fVarArr15 = PlusPayYbWebActivity.i;
                ((kpj) obj).getClass();
                ((PlusPayYbWebActivity) obj3).j().H();
                return Unit.a;
            case 23:
                com.yandex.plus.webview.core.g gVar = (com.yandex.plus.webview.core.g) obj;
                gVar.getClass();
                Iterator it3 = b85.C(((com.yandex.passport.legacy.lx.f) obj3).a, com.yandex.plus.webview.core.javascript.a.class).iterator();
                while (it3.hasNext()) {
                    gVar.a((com.yandex.plus.webview.core.javascript.a) it3.next());
                }
                return Unit.a;
            default:
                final Function1 function1 = (Function1) obj;
                function1.getClass();
                ((m) obj3).invoke(new ValueCallback() { // from class: com.yandex.plus.webview.api.b
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj5) {
                        Function1.this.invoke((Uri[]) obj5);
                    }
                });
                return Unit.a;
        }
    }
}
