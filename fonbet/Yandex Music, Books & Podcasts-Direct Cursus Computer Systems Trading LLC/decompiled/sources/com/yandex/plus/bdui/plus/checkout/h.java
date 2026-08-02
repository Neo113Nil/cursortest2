package com.yandex.plus.bdui.plus.checkout;

import android.content.Context;
import android.graphics.ComposeShader;
import android.graphics.PorterDuff;
import android.os.Looper;
import android.text.SpannedString;
import android.view.View;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.plus.content.serializer.u0;
import com.yandex.plus.core.featureflags.w;
import com.yandex.plus.core.featureflags.x;
import com.yandex.plus.home.internal.di.z;
import defpackage.bgv;
import defpackage.ezc;
import defpackage.gld;
import defpackage.h88;
import defpackage.rjf;
import defpackage.t75;
import defpackage.tf6;
import defpackage.u75;
import defpackage.x97;
import defpackage.y9w;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.Stack;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import okhttp3.OkHttpClient;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final /* synthetic */ class h implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ h(Function0 function0) {
        this.a = 11;
        this.b = (ezc) function0;
    }

    /* JADX WARN: Type inference failed for: r0v46, types: [ezc, kotlin.jvm.functions.Function0] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z = true;
        char c = 1;
        Continuation continuation = null;
        switch (this.a) {
            case 0:
                String languageTag = ((Locale) ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k) this.b).invoke()).toLanguageTag();
                languageTag.getClass();
                return languageTag;
            case 1:
                return ((com.yandex.plus.core.strings.a) this.b).toString();
            case 2:
                String queryParameter = ((com.yandex.plus.bdui.plus.checkout.webview.contract.b) this.b).a.b.a.c().getQueryParameter("scenario");
                return queryParameter == null ? "PlusPaymentWidget" : queryParameter;
            case 3:
                com.yandex.plus.bdui.plus.content.controller.q qVar = (com.yandex.plus.bdui.plus.content.controller.q) this.b;
                com.yandex.plus.bdui.m mVar = qVar.b;
                com.yandex.plus.bdui.action.c cVar = mVar.a;
                com.yandex.plus.log.api.b bVar = qVar.i;
                com.yandex.plus.bdui.flex.ui.content.c cVar2 = new com.yandex.plus.bdui.flex.ui.content.c(24);
                cVar.getClass();
                bVar.getClass();
                com.yandex.plus.bdui.action.c cVar3 = new com.yandex.plus.bdui.action.c(cVar, bVar, cVar2);
                mVar.getClass();
                Object invoke = qVar.e.invoke(new com.yandex.plus.bdui.m(cVar3));
                invoke.getClass();
                return (com.yandex.plus.bdui.ui.a) invoke;
            case 4:
                return new com.yandex.plus.core.templating.render.n(((u0) this.b).e);
            case 5:
                return (OkHttpClient) this.b;
            case 6:
                com.yandex.plus.bdui.m mVar2 = (com.yandex.plus.bdui.m) this.b;
                com.yandex.plus.bdui.shared.b bVar2 = com.yandex.plus.bdui.shared.b.a;
                mVar2.a.a(com.yandex.plus.bdui.plus.checkout.action.a.a(bVar2), new com.yandex.plus.bdui.action.h(bVar2), null);
                return Boolean.TRUE;
            case 7:
                return (com.yandex.plus.webview.core.d) this.b;
            case 8:
                return (com.yandex.plus.bdui.analytics.c) this.b;
            case 9:
                ((com.yandex.plus.core.dispatcher.a) ((com.yandex.plus.core.dispatcher.b) this.b)).getClass();
                return gld.e(com.yandex.plus.core.dispatcher.a.f);
            case 10:
                return (Map) ((com.yandex.plus.core.benchmark.c) this.b).b.invoke();
            case 11:
                return (com.yandex.plus.core.analytics.o) ((ezc) this.b).invoke();
            case 12:
                return new SimpleDateFormat("dd-MM-yy_HH:mm:ss", ((z) ((com.yandex.plus.bdui.plus.content.controller.f) ((com.yandex.passport.sloth.ui.c) this.b).b).c).q.a());
            case 13:
                String string = ((com.yandex.plus.core.debug.panel.internal.utils.resource.a) ((com.yandex.plus.bdui.plus.content.controller.f) this.b).c).a.getString(R.string.plus_sdk_debug_panel_logs_not_found);
                string.getClass();
                return new com.yandex.plus.core.debug.panel.internal.model.ui.d("empty_id", new SpannedString(string));
            case 14:
                com.yandex.plus.core.debug.panel.internal.presentation.view.d dVar = (com.yandex.plus.core.debug.panel.internal.presentation.view.d) this.b;
                Stack stack = dVar.h;
                if (stack.peek() instanceof com.yandex.plus.core.debug.panel.internal.presentation.view.c) {
                    dVar.a();
                } else {
                    Function1 function1 = dVar.g;
                    if (stack.size() > 1) {
                        dVar.removeAllViews();
                        dVar.addView((View) stack.pop());
                    } else {
                        z = false;
                    }
                    function1.invoke(Boolean.valueOf(z));
                }
                return Unit.a;
            case 15:
                x xVar = (x) this.b;
                com.yandex.plus.core.featureflags.z zVar = (com.yandex.plus.core.featureflags.z) xVar.a.get();
                w wVar = xVar.b;
                boolean z2 = zVar instanceof com.yandex.plus.core.featureflags.b;
                com.yandex.plus.core.featureflags.b bVar3 = z2 ? (com.yandex.plus.core.featureflags.b) zVar : null;
                if (bVar3 != null) {
                    bVar3.d = wVar;
                }
                com.yandex.plus.core.featureflags.b bVar4 = z2 ? (com.yandex.plus.core.featureflags.b) zVar : null;
                if (bVar4 != null) {
                    bVar4.e = null;
                }
                return zVar;
            case 16:
                com.yandex.passport.internal.flags.experiments.p pVar = (com.yandex.passport.internal.flags.experiments.p) this.b;
                return new ComposeShader(((com.yandex.plus.core.gradient.impl.b) pVar.b).n(), ((com.yandex.plus.core.gradient.impl.b) pVar.c).n(), PorterDuff.Mode.SRC_OVER);
            case 17:
                String upperCase = ((com.yandex.plus.core.network.header.b) this.b).a.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                return upperCase;
            case 18:
                Context context = ((com.yandex.plus.core.network.ssl.a) this.b).b;
                return new bgv(context.getApplicationContext(), new h88(context), new y9w(28));
            case 19:
                return new com.yandex.plus.di.g((Function0) ((com.yandex.plus.bdui.plus.content.controller.f) this.b).c);
            case 20:
                return new com.yandex.plus.di.g((com.yandex.plus.pay.ui.core.debug.internal.a) ((com.yandex.plus.bdui.plus.content.controller.f) this.b).c);
            case 21:
                com.yandex.plus.experiments.impl.a aVar = (com.yandex.plus.experiments.impl.a) this.b;
                com.yandex.plus.experiments.api.b bVar5 = aVar.a;
                return new com.yandex.plus.experiments.impl.providers.j(bVar5.e, bVar5.f, (com.yandex.plus.experiments.impl.mappers.a) aVar.c.getValue(), bVar5.h);
            case 22:
                return Boolean.valueOf(r1.l(((com.yandex.plus.home.featureflags.e) ((com.yandex.plus.home.featureflags.g) this.b)).D));
            case 23:
                return (com.yandex.plus.core.analytics.h) this.b;
            case 24:
                return (com.yandex.plus.core.analytics.f) ((com.yandex.plus.home.analytics.f) this.b).a.get();
            case 25:
                return new com.yandex.plus.home.common.utils.d((Looper) this.b);
            case 26:
                rjf rjfVar = (rjf) this.b;
                x97.y((tf6) rjfVar.n, null, null, new com.yandex.plus.home.dailyquests.feature.internal.ui.c(rjfVar, continuation, c == true ? 1 : 0), 3);
                return Unit.a;
            case 27:
                com.yandex.plus.home.feature.panel.internal.sections.b bVar6 = (com.yandex.plus.home.feature.panel.internal.sections.b) this.b;
                int i = com.yandex.plus.home.feature.panel.internal.sections.b.H0;
                return new com.yandex.plus.home.feature.panel.internal.stub.a(t75.c(new com.yandex.plus.home.feature.panel.internal.stub.c(com.yandex.plus.home.feature.panel.internal.stub.b.a, bVar6.G0)));
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                com.yandex.plus.home.feature.panel.internal.sections.c cVar4 = (com.yandex.plus.home.feature.panel.internal.sections.c) this.b;
                int i2 = com.yandex.plus.home.feature.panel.internal.sections.c.H0;
                return new com.yandex.plus.home.feature.panel.internal.stub.a(t75.c(new com.yandex.plus.home.feature.panel.internal.stub.c(com.yandex.plus.home.feature.panel.internal.stub.b.a, cVar4.G0)));
            default:
                com.yandex.plus.home.feature.panel.internal.sections.h hVar = (com.yandex.plus.home.feature.panel.internal.sections.h) this.b;
                int i3 = com.yandex.plus.home.feature.panel.internal.sections.h.B0;
                com.yandex.plus.home.feature.panel.internal.stub.b bVar7 = com.yandex.plus.home.feature.panel.internal.stub.b.b;
                int i4 = hVar.x0;
                return new com.yandex.plus.home.feature.panel.internal.stub.a(u75.h(new com.yandex.plus.home.feature.panel.internal.stub.c(bVar7, i4), new com.yandex.plus.home.feature.panel.internal.stub.c(bVar7, i4), new com.yandex.plus.home.feature.panel.internal.stub.c(com.yandex.plus.home.feature.panel.internal.stub.b.a, i4)));
        }
    }

    public /* synthetic */ h(com.yandex.plus.bdui.plus.scenario.m mVar, com.yandex.plus.bdui.m mVar2) {
        this.a = 6;
        this.b = mVar2;
    }

    public /* synthetic */ h(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
