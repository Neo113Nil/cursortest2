package com.yandex.plus.home.feature.webviews.internal.stories;

import android.content.Context;
import com.yandex.passport.internal.t;
import com.yandex.plus.home.internal.di.z;
import com.yandex.plus.metrica.utils.x;
import com.yandex.pulse.histogram.ComponentHistograms;
import defpackage.ezc;
import defpackage.jyr;
import defpackage.zsd;
import io.appmetrica.analytics.IReporterYandex;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import timber.log.Timber;

/* loaded from: classes5.dex */
public final /* synthetic */ class i extends ezc implements Function0 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object c;
        Object obj = null;
        Object[] objArr = 0;
        switch (this.a) {
            case 0:
                ((com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.g) this.receiver).h();
                return Unit.a;
            case 1:
                ((c) this.receiver).k();
                return Unit.a;
            case 2:
                k kVar = (k) this.receiver;
                kVar.getClass();
                com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.b;
                jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
                com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.c, bVar, "onRetryClick()", null);
                kVar.t.v();
                kVar.B0.l();
                return Unit.a;
            case 3:
                return ((com.yandex.plus.home.auth.f) this.receiver).a();
            case 4:
                return zsd.b0(new t(((com.yandex.plus.home.auth.f) this.receiver).a.h, 26));
            case 5:
                com.yandex.plus.home.auth.f fVar = (com.yandex.plus.home.auth.f) this.receiver;
                fVar.getClass();
                com.yandex.plus.domain.auth.impl.i iVar = fVar.a;
                iVar.getClass();
                Object value = iVar.h.getValue();
                com.yandex.plus.domain.auth.api.b bVar2 = value instanceof com.yandex.plus.domain.auth.api.b ? (com.yandex.plus.domain.auth.api.b) value : null;
                return Boolean.valueOf(bVar2 != null ? bVar2.c : false);
            case 6:
                return ((z) this.receiver).b.a.f("WebHome.OpenDuration");
            case 7:
                return ((z) this.receiver).b.a.f("WebSimple.OpenDuration");
            case 8:
                return ((z) this.receiver).b.a.f("WebSmart.OpenDuration");
            case 9:
                return ((z) this.receiver).b.a.f("WebStories.OpenDuration");
            case 10:
                return com.yandex.plus.home.internal.di.p.d(((com.yandex.plus.home.internal.di.p) this.receiver).a.l.b()).concat("v1/experiments");
            case 11:
                return com.yandex.plus.home.internal.di.p.d(((com.yandex.plus.home.internal.di.p) this.receiver).a.l.a()).concat("v1/experiments");
            case 12:
                return ((com.yandex.plus.home.internal.di.e) this.receiver).a.e("Panel.Light.DataLoading", "Panel.DataParsing");
            case 13:
                return ((com.yandex.plus.home.internal.di.e) this.receiver).a.e("Panel.Heavy.DataLoading", "Panel.DataParsing");
            case 14:
                return ((com.yandex.plus.home.internal.di.e) this.receiver).a("RedAlert.Digest.DataLoading");
            case 15:
                return ((com.yandex.plus.home.internal.di.e) this.receiver).a("RedAlert.Callback.Loading");
            case 16:
                return com.yandex.plus.core.locale.b.m((com.yandex.plus.core.locale.a) this.receiver);
            case 17:
                return com.yandex.plus.core.locale.b.m((com.yandex.plus.core.locale.a) this.receiver);
            case 18:
                com.yandex.plus.home.plaque.plugin.internal.defaults.a.c((com.yandex.plus.home.plaque.plugin.internal.defaults.a) this.receiver);
                return Unit.a;
            case 19:
                com.yandex.plus.home.plaque.plugin.internal.defaults.a.c((com.yandex.plus.home.plaque.plugin.internal.defaults.a) this.receiver);
                return Unit.a;
            case 20:
                com.yandex.plus.home.plaque.plugin.internal.defaults.a.c((com.yandex.plus.home.plaque.plugin.internal.defaults.a) this.receiver);
                return Unit.a;
            case 21:
                com.yandex.plus.home.plaque.plugin.internal.defaults.a.c((com.yandex.plus.home.plaque.plugin.internal.defaults.a) this.receiver);
                return Unit.a;
            case 22:
                com.yandex.plus.home.plaque.plugin.internal.defaults.a.c((com.yandex.plus.home.plaque.plugin.internal.defaults.a) this.receiver);
                return Unit.a;
            case 23:
                return (com.yandex.plus.metrica.utils.f) ((com.yandex.plus.metrica.utils.g) this.receiver).c.getValue();
            case 24:
                return (com.yandex.plus.metrica.utils.f) ((com.yandex.plus.metrica.utils.g) this.receiver).a.getValue();
            case 25:
                return (com.yandex.plus.metrica.utils.f) ((com.yandex.plus.metrica.utils.g) this.receiver).a.getValue();
            case 26:
                return (com.yandex.plus.metrica.utils.f) ((com.yandex.plus.metrica.utils.g) this.receiver).b.getValue();
            case 27:
                return (com.yandex.plus.metrica.utils.f) ((com.yandex.plus.metrica.utils.g) this.receiver).b.getValue();
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return (IReporterYandex) ((x) this.receiver).h();
            default:
                x xVar = (x) this.receiver;
                com.yandex.plus.metrica.utils.g gVar = xVar.b;
                Context context = xVar.a;
                String str = xVar.c;
                String str2 = xVar.d;
                String str3 = xVar.e;
                com.yandex.plus.core.config.a aVar = xVar.f;
                boolean booleanValue = ((Boolean) xVar.h.getValue()).booleanValue();
                gVar.getClass();
                context.getClass();
                aVar.getClass();
                Timber.Companion companion = Timber.INSTANCE;
                companion.tag("Metrica7Facade").d("Get Pulse component histograms", new Object[0]);
                if (gVar.e(context, str, str2, str3, aVar, booleanValue, true) == null || (c = gVar.c("ComponentHistograms", new com.yandex.plus.metrica.utils.c(gVar, str3, objArr == true ? 1 : 0))) == null) {
                    companion.tag("Metrica7Facade").w("Can't get AppMetrica internal reporter so Pulse component histograms could not got either", new Object[0]);
                } else {
                    obj = c;
                }
                return (ComponentHistograms) obj;
        }
    }
}
