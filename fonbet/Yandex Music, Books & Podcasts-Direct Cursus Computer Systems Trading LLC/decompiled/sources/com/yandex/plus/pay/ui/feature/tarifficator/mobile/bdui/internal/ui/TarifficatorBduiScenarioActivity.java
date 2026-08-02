package com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.home.internal.di.y;
import com.yandex.plus.metrica.utils.x;
import defpackage.b1b;
import defpackage.b6e;
import defpackage.btf;
import defpackage.cg6;
import defpackage.dfu;
import defpackage.ern;
import defpackage.f1d;
import defpackage.jyr;
import defpackage.nm6;
import defpackage.nme;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.s9f;
import defpackage.sj;
import defpackage.t7o;
import defpackage.v75;
import defpackage.vq1;
import defpackage.wyf;
import defpackage.x97;
import defpackage.xq0;
import defpackage.ybf;
import defpackage.yxm;
import defpackage.z7o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Locale;
import java.util.concurrent.ConcurrentMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class TarifficatorBduiScenarioActivity extends com.yandex.plus.pay.ui.common.api.b implements com.yandex.plus.di.d {
    public static final /* synthetic */ s9f[] g = {new yxm(TarifficatorBduiScenarioActivity.class, "component", "getComponent()Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/bdui/internal/common/di/ScenarioComponent;", 0), f1d.c(ern.a, TarifficatorBduiScenarioActivity.class, "progressView", "getProgressView()Lcom/yandex/plus/pay/ui/common/api/ui/view/ProgressView;", 0)};
    public final jyr b;
    public final com.yandex.plus.bdui.plus.content.controller.f c;
    public final ybf d;
    public com.yandex.plus.bdui.plus.scenario.n e;
    public final com.yandex.plus.bdui.plus.content.controller.f f;

    public TarifficatorBduiScenarioActivity() {
        super(R.layout.pay_sdk_activity_bdui_payment);
        final int i = 0;
        this.b = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.f
            public final /* synthetic */ TarifficatorBduiScenarioActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                n nVar;
                int i2 = i;
                TarifficatorBduiScenarioActivity tarifficatorBduiScenarioActivity = this.b;
                switch (i2) {
                    case 0:
                        s9f[] s9fVarArr = TarifficatorBduiScenarioActivity.g;
                        Intent intent = tarifficatorBduiScenarioActivity.getIntent();
                        if (intent != null && (nVar = (n) ((Parcelable) vq1.W(intent, "input", n.class))) != null) {
                            return nVar;
                        }
                        xq0.q("TarifficatorBduiScenarioActivity must be created with a contract");
                        return null;
                    case 1:
                        s9f[] s9fVarArr2 = TarifficatorBduiScenarioActivity.g;
                        n nVar2 = (n) tarifficatorBduiScenarioActivity.b.getValue();
                        com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.d dVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.d) com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.b.d.q(com.yandex.plus.bdui.plus.analytics.b.u(tarifficatorBduiScenarioActivity));
                        int requestedOrientation = tarifficatorBduiScenarioActivity.getRequestedOrientation();
                        nVar2.getClass();
                        com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.c cVar = dVar.a;
                        com.yandex.passport.internal.core.accounts.h hVar = new com.yandex.passport.internal.core.accounts.h(cVar.z, cVar.A, cVar.m);
                        com.yandex.plus.bdui.r rVar = cVar.a;
                        com.yandex.plus.core.config.a aVar = cVar.h;
                        com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar2 = cVar.q;
                        com.yandex.plus.pay.ui.design.api.api.a aVar3 = cVar.j;
                        y yVar = cVar.x;
                        com.yandex.plus.pay.ui.core.internal.di.g gVar = cVar.y;
                        com.yandex.plus.pay.internal.g gVar2 = cVar.B;
                        com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.i iVar = new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.i(hVar, rVar, nVar2, aVar, aVar2, aVar3, yVar, gVar, cVar.r, cVar.s, cVar.t, cVar.u, cVar.v, cVar.w, cVar.p, cVar.l, gVar2, cVar.n);
                        com.yandex.plus.pay.internal.di.r c = gVar2.c();
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.e(iVar, new sj(iVar, cVar.b, cVar.c, c.d, c.e, requestedOrientation));
                    default:
                        s9f[] s9fVarArr3 = TarifficatorBduiScenarioActivity.g;
                        dfu[] dfuVarArr = (dfu[]) Arrays.copyOf(new dfu[]{new dfu(ern.a(u.class), new com.yandex.plus.home.feature.webviews.internal.stories.m(8, tarifficatorBduiScenarioActivity.l().b))}, 1);
                        return new nme((dfu[]) Arrays.copyOf(dfuVarArr, dfuVarArr.length));
                }
            }
        });
        final int i2 = 1;
        this.c = new com.yandex.plus.bdui.plus.content.controller.f(this, new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.f
            public final /* synthetic */ TarifficatorBduiScenarioActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                n nVar;
                int i22 = i2;
                TarifficatorBduiScenarioActivity tarifficatorBduiScenarioActivity = this.b;
                switch (i22) {
                    case 0:
                        s9f[] s9fVarArr = TarifficatorBduiScenarioActivity.g;
                        Intent intent = tarifficatorBduiScenarioActivity.getIntent();
                        if (intent != null && (nVar = (n) ((Parcelable) vq1.W(intent, "input", n.class))) != null) {
                            return nVar;
                        }
                        xq0.q("TarifficatorBduiScenarioActivity must be created with a contract");
                        return null;
                    case 1:
                        s9f[] s9fVarArr2 = TarifficatorBduiScenarioActivity.g;
                        n nVar2 = (n) tarifficatorBduiScenarioActivity.b.getValue();
                        com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.d dVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.d) com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.b.d.q(com.yandex.plus.bdui.plus.analytics.b.u(tarifficatorBduiScenarioActivity));
                        int requestedOrientation = tarifficatorBduiScenarioActivity.getRequestedOrientation();
                        nVar2.getClass();
                        com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.c cVar = dVar.a;
                        com.yandex.passport.internal.core.accounts.h hVar = new com.yandex.passport.internal.core.accounts.h(cVar.z, cVar.A, cVar.m);
                        com.yandex.plus.bdui.r rVar = cVar.a;
                        com.yandex.plus.core.config.a aVar = cVar.h;
                        com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar2 = cVar.q;
                        com.yandex.plus.pay.ui.design.api.api.a aVar3 = cVar.j;
                        y yVar = cVar.x;
                        com.yandex.plus.pay.ui.core.internal.di.g gVar = cVar.y;
                        com.yandex.plus.pay.internal.g gVar2 = cVar.B;
                        com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.i iVar = new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.i(hVar, rVar, nVar2, aVar, aVar2, aVar3, yVar, gVar, cVar.r, cVar.s, cVar.t, cVar.u, cVar.v, cVar.w, cVar.p, cVar.l, gVar2, cVar.n);
                        com.yandex.plus.pay.internal.di.r c = gVar2.c();
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.e(iVar, new sj(iVar, cVar.b, cVar.c, c.d, c.e, requestedOrientation));
                    default:
                        s9f[] s9fVarArr3 = TarifficatorBduiScenarioActivity.g;
                        dfu[] dfuVarArr = (dfu[]) Arrays.copyOf(new dfu[]{new dfu(ern.a(u.class), new com.yandex.plus.home.feature.webviews.internal.stories.m(8, tarifficatorBduiScenarioActivity.l().b))}, 1);
                        return new nme((dfu[]) Arrays.copyOf(dfuVarArr, dfuVarArr.length));
                }
            }
        });
        final int i3 = 2;
        this.d = new ybf(ern.a(u.class), new i(this, i), new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.f
            public final /* synthetic */ TarifficatorBduiScenarioActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                n nVar;
                int i22 = i3;
                TarifficatorBduiScenarioActivity tarifficatorBduiScenarioActivity = this.b;
                switch (i22) {
                    case 0:
                        s9f[] s9fVarArr = TarifficatorBduiScenarioActivity.g;
                        Intent intent = tarifficatorBduiScenarioActivity.getIntent();
                        if (intent != null && (nVar = (n) ((Parcelable) vq1.W(intent, "input", n.class))) != null) {
                            return nVar;
                        }
                        xq0.q("TarifficatorBduiScenarioActivity must be created with a contract");
                        return null;
                    case 1:
                        s9f[] s9fVarArr2 = TarifficatorBduiScenarioActivity.g;
                        n nVar2 = (n) tarifficatorBduiScenarioActivity.b.getValue();
                        com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.d dVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.d) com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.b.d.q(com.yandex.plus.bdui.plus.analytics.b.u(tarifficatorBduiScenarioActivity));
                        int requestedOrientation = tarifficatorBduiScenarioActivity.getRequestedOrientation();
                        nVar2.getClass();
                        com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.c cVar = dVar.a;
                        com.yandex.passport.internal.core.accounts.h hVar = new com.yandex.passport.internal.core.accounts.h(cVar.z, cVar.A, cVar.m);
                        com.yandex.plus.bdui.r rVar = cVar.a;
                        com.yandex.plus.core.config.a aVar = cVar.h;
                        com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar2 = cVar.q;
                        com.yandex.plus.pay.ui.design.api.api.a aVar3 = cVar.j;
                        y yVar = cVar.x;
                        com.yandex.plus.pay.ui.core.internal.di.g gVar = cVar.y;
                        com.yandex.plus.pay.internal.g gVar2 = cVar.B;
                        com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.i iVar = new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.i(hVar, rVar, nVar2, aVar, aVar2, aVar3, yVar, gVar, cVar.r, cVar.s, cVar.t, cVar.u, cVar.v, cVar.w, cVar.p, cVar.l, gVar2, cVar.n);
                        com.yandex.plus.pay.internal.di.r c = gVar2.c();
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.e(iVar, new sj(iVar, cVar.b, cVar.c, c.d, c.e, requestedOrientation));
                    default:
                        s9f[] s9fVarArr3 = TarifficatorBduiScenarioActivity.g;
                        dfu[] dfuVarArr = (dfu[]) Arrays.copyOf(new dfu[]{new dfu(ern.a(u.class), new com.yandex.plus.home.feature.webviews.internal.stories.m(8, tarifficatorBduiScenarioActivity.l().b))}, 1);
                        return new nme((dfu[]) Arrays.copyOf(dfuVarArr, dfuVarArr.length));
                }
            }
        }, new i(this, i2));
        this.f = new com.yandex.plus.bdui.plus.content.controller.f(new com.yandex.passport.common.util.e(9, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object k(TarifficatorBduiScenarioActivity tarifficatorBduiScenarioActivity, Bundle bundle, cg6 cg6Var) {
        j jVar;
        int i;
        ViewGroup viewGroup;
        if (cg6Var instanceof j) {
            jVar = (j) cg6Var;
            int i2 = jVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.m = i2 - Integer.MIN_VALUE;
                j jVar2 = jVar;
                Object obj = jVar2.k;
                nm6 nm6Var = nm6.a;
                i = jVar2.m;
                if (i != 0) {
                    qgg.h0(obj);
                    View findViewById = tarifficatorBduiScenarioActivity.findViewById(R.id.bdui_container);
                    findViewById.getClass();
                    ViewGroup viewGroup2 = (ViewGroup) findViewById;
                    u uVar = (u) tarifficatorBduiScenarioActivity.d.getValue();
                    com.yandex.plus.home.feature.webviews.internal.webview.a aVar = new com.yandex.plus.home.feature.webviews.internal.webview.a(1, tarifficatorBduiScenarioActivity, TarifficatorBduiScenarioActivity.class, "handleClose", "handleClose(Lcom/yandex/plus/bdui/DocumentScenarioResult;)V", 0, 27);
                    jVar2.j = viewGroup2;
                    jVar2.m = 1;
                    obj = uVar.a(tarifficatorBduiScenarioActivity, R.id.bdui_container, bundle, aVar, jVar2);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    viewGroup = viewGroup2;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    viewGroup = jVar2.j;
                    qgg.h0(obj);
                }
                com.yandex.plus.bdui.plus.scenario.n nVar = (com.yandex.plus.bdui.plus.scenario.n) obj;
                tarifficatorBduiScenarioActivity.e = nVar;
                nVar.getClass();
                viewGroup.getClass();
                nVar.a.g(viewGroup, tarifficatorBduiScenarioActivity);
                return Unit.a;
            }
        }
        jVar = new j(tarifficatorBduiScenarioActivity, cg6Var);
        j jVar22 = jVar;
        Object obj2 = jVar22.k;
        nm6 nm6Var2 = nm6.a;
        i = jVar22.m;
        if (i != 0) {
        }
        com.yandex.plus.bdui.plus.scenario.n nVar2 = (com.yandex.plus.bdui.plus.scenario.n) obj2;
        tarifficatorBduiScenarioActivity.e = nVar2;
        nVar2.getClass();
        viewGroup.getClass();
        nVar2.a.g(viewGroup, tarifficatorBduiScenarioActivity);
        return Unit.a;
    }

    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.e l() {
        return (com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.e) this.c.getValue(this, g[0]);
    }

    @Override // com.yandex.plus.di.d
    public final com.yandex.plus.di.c o() {
        return l();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ea, code lost:
    
        if ((r3 != null ? r3.c : false) != false) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        Object t7oVar;
        try {
            r7o r7oVar = z7o.b;
            t7oVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.d) com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.b.d.q(com.yandex.plus.bdui.plus.analytics.b.u(this));
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Throwable a = z7o.a(t7oVar);
        if (a != null) {
            com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.f;
            jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
            com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.e, bVar, "PlusTarifficatorMobileBduiComponent is not found!", a);
        }
        Continuation continuation = null;
        if (t7oVar instanceof t7o) {
            t7oVar = null;
        }
        com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.d dVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.d) t7oVar;
        Object[] objArr = 0;
        if (dVar == null) {
            com.yandex.plus.core.analytics.logging.b bVar2 = com.yandex.plus.core.analytics.logging.b.f;
            jyr jyrVar2 = com.yandex.plus.core.analytics.logging.e.a;
            com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.c, bVar2, "TarifficatorBduiScenarioActivity is recreated after application death", null);
            super.onCreate(bundle);
            setResult(0);
            finish();
            return;
        }
        com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.c cVar = dVar.a;
        com.yandex.plus.core.analytics.metrica.f j = ((x) cVar.o).j();
        if (j != null) {
            getLifecycle().a(new g(objArr == true ? 1 : 0, j));
        }
        com.yandex.plus.pay.ui.design.api.api.a aVar = cVar.j;
        Locale a2 = cVar.k.a();
        com.yandex.plus.ui.core.theme.a aVar2 = (com.yandex.plus.ui.core.theme.a) ((com.yandex.plus.pay.ui.design.plus.api.a) aVar).a.a.getValue();
        TypedValue typedValue = new TypedValue();
        int i = 1;
        getResources().getValue(R.dimen.pay_sdk_mobile_content_scale_factor, typedValue, true);
        j(a2, aVar2, typedValue.getFloat());
        b1b.b(this);
        com.yandex.plus.pay.log.impl.b bVar3 = l().a.o;
        r1.r(bVar3, this, "TarifficatorBdui");
        getLifecycle().a(new com.yandex.plus.pay.ui.common.api.log.g(new com.yandex.passport.internal.entities.j(bVar3, this, "TarifficatorBdui")));
        getLayoutInflater().setFactory2(new com.yandex.plus.pay.ui.common.api.log.b("TarifficatorBdui", bVar3, new com.yandex.plus.pay.ui.core.mobile.ui.kit.b(aVar)));
        super.onCreate(bundle);
        com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.e l = l();
        com.yandex.plus.domain.auth.impl.i iVar = l.a.a().n;
        com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.i iVar2 = l.a;
        com.yandex.plus.core.config.a aVar3 = iVar2.d;
        com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.e eVar = iVar2.q;
        if (aVar3 != com.yandex.plus.core.config.a.a) {
            Object value = iVar.h.getValue();
            com.yandex.plus.domain.auth.api.b bVar4 = value instanceof com.yandex.plus.domain.auth.api.b ? (com.yandex.plus.domain.auth.api.b) value : null;
        }
        if (r1.l(((com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.b) ((com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.d) eVar.a.a())).u)) {
            com.yandex.plus.bdui.plus.analytics.b.p(this);
        }
        com.yandex.plus.pay.ui.common.api.a aVar4 = (com.yandex.plus.pay.ui.common.api.a) l().a.t.getValue();
        aVar4.getClass();
        aVar4.b = new WeakReference(this);
        x97.y(wyf.F(getLifecycle()), null, null, new h(this, bundle, continuation, i), 3);
    }

    @Override // defpackage.hq0, androidx.fragment.app.t, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        com.yandex.plus.bdui.plus.scenario.n nVar = this.e;
        if (nVar != null) {
            nVar.a.f();
        }
        this.e = null;
    }

    @Override // defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        com.yandex.plus.core.benchmark.o oVar;
        long j;
        com.yandex.plus.core.benchmark.r rVar;
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        com.yandex.plus.bdui.plus.scenario.n nVar = this.e;
        if (nVar != null) {
            com.yandex.passport.internal.social.d dVar = nVar.c;
            Long l = (Long) dVar.c;
            com.yandex.plus.bdui.query.e eVar = (com.yandex.plus.bdui.query.e) dVar.d;
            int i = dVar.b;
            Collection<com.yandex.plus.core.benchmark.l> values = ((ConcurrentMap) nVar.d.b.getValue()).values();
            ArrayList arrayList = new ArrayList(v75.o(values, 10));
            for (com.yandex.plus.core.benchmark.l lVar : values) {
                lVar.getClass();
                arrayList.add((com.yandex.plus.core.benchmark.i) lVar.a(new com.yandex.plus.core.benchmark.j(lVar, 1)));
            }
            com.yandex.plus.core.benchmark.t tVar = (com.yandex.plus.core.benchmark.t) nVar.d.c.getValue();
            do {
                Object obj = tVar.c.a.get();
                obj.getClass();
                oVar = (com.yandex.plus.core.benchmark.o) obj;
                j = tVar.c.b;
            } while (oVar != tVar.c.a.get());
            int ordinal = oVar.ordinal();
            if (ordinal == 0) {
                rVar = com.yandex.plus.core.benchmark.p.a;
            } else {
                if (ordinal != 1) {
                    b6e.s();
                    return;
                }
                rVar = new com.yandex.plus.core.benchmark.q(j);
            }
            bundle.putParcelable("PlusDocumentScenario.LastSessionState[" + nVar.b + ']', new com.yandex.plus.bdui.plus.scenario.q(l, eVar, i, arrayList, rVar));
        }
    }
}
