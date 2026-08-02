package com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di;

import com.yandex.plus.bdui.plus.scenario.p;
import com.yandex.plus.bdui.s;
import com.yandex.plus.core.featureflags.x;
import com.yandex.plus.home.internal.di.y;
import com.yandex.plus.pay.internal.di.r;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.m;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.n;
import defpackage.b6e;
import defpackage.bsd;
import defpackage.buu;
import defpackage.cdk;
import defpackage.gdk;
import defpackage.jyr;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.z7o;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final /* synthetic */ class f implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i b;

    public /* synthetic */ f(i iVar, int i) {
        this.a = i;
        this.b = iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.a] */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.a] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        int i = this.a;
        Continuation continuation = null;
        i iVar = this.b;
        switch (i) {
            case 0:
                return iVar.p.c();
            case 1:
                StringBuilder sb = new StringBuilder("https://");
                r a = iVar.a();
                x xVar = iVar.q.a;
                sb.append(((com.yandex.plus.core.network.hosts.a) a.L.invoke()).e());
                sb.append('/');
                String sb2 = sb.toString();
                n nVar = iVar.c;
                if (nVar instanceof com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.k) {
                    String str2 = (String) ((com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.b) ((com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.d) xVar.a())).w.getValue();
                    str = str2 != null ? str2 : "api/mobile/flow/launch";
                    String str3 = (String) ((com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.b) ((com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.d) xVar.a())).x.getValue();
                    if (str3 == null) {
                        str3 = "checkout";
                    }
                    s sVar = new s(str3, (Integer) ((com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.b) ((com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.d) xVar.a())).y.getValue());
                    Boolean bool = (Boolean) ((com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.b) ((com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.d) xVar.a())).z.getValue();
                    continuation = new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.a(sb2, str, sVar, bool != null ? bool.booleanValue() : false);
                } else if (nVar instanceof m) {
                    String str4 = (String) ((com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.b) ((com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.d) xVar.a())).w.getValue();
                    str = str4 != null ? str4 : "api/mobile/flow/launch";
                    String str5 = (String) ((com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.b) ((com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.d) xVar.a())).A.getValue();
                    if (str5 == null) {
                        str5 = "paywall";
                    }
                    continuation = new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.a(sb2, str, new s(str5, (Integer) ((com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.b) ((com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.d) xVar.a())).B.getValue()), ((m) nVar).a.e);
                } else {
                    b6e.s();
                }
                return continuation;
            case 2:
                n nVar2 = iVar.c;
                if (nVar2 instanceof com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.k) {
                    com.yandex.plus.pay.internal.analytics.h hVar = (com.yandex.plus.pay.internal.analytics.h) iVar.a().E.get();
                    com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.e eVar = ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.k) nVar2).a;
                    return ((com.yandex.plus.pay.internal.analytics.i) hVar).a(eVar.c, eVar.b);
                }
                if (nVar2 instanceof m) {
                    return null;
                }
                b6e.s();
                return null;
            case 3:
                iVar.a().getClass();
                String str6 = iVar.a().a;
                com.yandex.plus.core.strings.a aVar = iVar.a().h;
                com.yandex.plus.pay.reporter.api.f fVar = iVar.a().B;
                ((com.yandex.plus.core.dispatcher.a) iVar.a().q).getClass();
                return new com.yandex.plus.pay.internal.benchmark.tarifficator.b(str6, aVar, new f(iVar, 6), new buu(iVar, continuation, 7), fVar, com.yandex.plus.core.dispatcher.a.f);
            case 4:
                return new g((gdk) iVar.a.c, 0);
            case 5:
                return new com.yandex.plus.pay.ui.webview.paymentwidget.domain.k(iVar.y);
            case 6:
                Object f = ((com.yandex.plus.experiments.impl.providers.h) iVar.p.a.getValue()).f();
                r7o r7oVar = z7o.b;
                return (com.yandex.plus.experiments.api.a) (f instanceof t7o ? null : f);
            case 7:
                return ((g) iVar.z.getValue()).a("family");
            case 8:
                com.yandex.passport.internal.core.accounts.h hVar2 = iVar.a;
                return new com.yandex.plus.pay.ui.webview.family.domain.a((b) ((jyr) hVar2.e).getValue(), (cdk) hVar2.b);
            case 9:
                y yVar = new y(iVar.y, (com.yandex.plus.log.api.b) iVar.o);
                com.yandex.plus.pay.log.impl.b bVar = iVar.o;
                com.yandex.plus.pay.ui.webview.common.diagnostic.a aVar2 = (com.yandex.plus.pay.ui.webview.common.diagnostic.a) iVar.B.getValue();
                ((com.yandex.plus.core.dispatcher.a) iVar.a().q).getClass();
                bsd bsdVar = com.yandex.plus.core.dispatcher.a.c;
                ((com.yandex.plus.core.dispatcher.a) iVar.a().q).getClass();
                return new com.yandex.plus.pay.ui.webview.family.ui.c(yVar, bVar, aVar2, bsdVar, com.yandex.plus.core.dispatcher.a.f, new com.yandex.plus.metrica.utils.n(0, iVar.q, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.e.class, "isFamilyWebViewTransparentBackgroundEnabled", "isFamilyWebViewTransparentBackgroundEnabled()Z", 0, 29));
            case 10:
                String str7 = iVar.a().i;
                String str8 = iVar.a().j;
                Long l = iVar.a().k;
                iVar.a().getClass();
                p[] pVarArr = p.a;
                String str9 = iVar.a().a;
                str9.getClass();
                return new com.yandex.plus.bdui.plus.checkout.p(l, str7, str8, str9);
            case 11:
                return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.h(((com.yandex.plus.pay.ui.common.api.a) iVar.t.getValue()).a(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar.e).a, iVar.n, iVar.o);
            case 12:
                com.yandex.plus.domain.auth.impl.i iVar2 = iVar.a().n;
                ((com.yandex.plus.core.dispatcher.a) iVar.a().q).getClass();
                return new com.yandex.plus.pay.ui.core.api.domain.a(iVar2, com.yandex.plus.core.dispatcher.a.f, iVar.o);
            case 13:
                return (com.yandex.plus.experiments.impl.providers.h) iVar.a().C.get();
            default:
                return new com.yandex.plus.pay.ui.common.api.a(iVar.a().l);
        }
    }
}
