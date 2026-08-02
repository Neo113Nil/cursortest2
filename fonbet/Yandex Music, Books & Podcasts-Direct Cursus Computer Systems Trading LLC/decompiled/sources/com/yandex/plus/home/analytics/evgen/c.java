package com.yandex.plus.home.analytics.evgen;

import com.yandex.plus.bdui.plus.checkout.content.controller.w;
import com.yandex.plus.home.feature.webviews.internal.container.t;
import com.yandex.plus.home.feature.webviews.internal.container.u;
import com.yandex.plus.home.feature.webviews.internal.home.g;
import com.yandex.plus.home.k;
import com.yandex.plus.home.repository.api.model.plusstate.e;
import com.yandex.plus.home.repository.api.model.plusstate.f;
import com.yandex.pulse.metrics.o;
import defpackage.b6e;
import defpackage.ezc;
import defpackage.jyr;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final /* synthetic */ class c extends ezc implements Function0 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        com.yandex.plus.experiments.api.a aVar;
        com.yandex.plus.experiments.api.a aVar2;
        switch (this.a) {
            case 0:
                Object obj = (Long) ((d) this.receiver).e.invoke();
                break;
            case 1:
                w wVar = ((d) this.receiver).k;
                f fVar = wVar != null ? (f) wVar.invoke() : null;
                if (!(fVar instanceof com.yandex.plus.home.repository.api.model.plusstate.c)) {
                    if (!(fVar instanceof com.yandex.plus.home.repository.api.model.plusstate.d)) {
                        if (!(fVar instanceof com.yandex.plus.home.repository.api.model.plusstate.b)) {
                            if (!(fVar instanceof e)) {
                                if (fVar != null) {
                                    b6e.s();
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            case 2:
                w wVar2 = ((d) this.receiver).k;
                break;
            case 3:
                k kVar = ((d) this.receiver).j;
                if (kVar != null && (aVar = (com.yandex.plus.experiments.api.a) kVar.invoke()) != null && (r0 = aVar.a) != null) {
                    break;
                }
                break;
            case 4:
                k kVar2 = ((d) this.receiver).j;
                if (kVar2 != null && (aVar2 = (com.yandex.plus.experiments.api.a) kVar2.invoke()) != null && (r0 = aVar2.b) != null) {
                    break;
                }
                break;
            case 5:
                Object obj2 = (Long) ((d) this.receiver).e.invoke();
                break;
            case 6:
                w wVar3 = ((d) this.receiver).k;
                f fVar2 = wVar3 != null ? (f) wVar3.invoke() : null;
                if (!(fVar2 instanceof com.yandex.plus.home.repository.api.model.plusstate.c)) {
                    if (!(fVar2 instanceof com.yandex.plus.home.repository.api.model.plusstate.d)) {
                        if (!(fVar2 instanceof com.yandex.plus.home.repository.api.model.plusstate.b)) {
                            if (!(fVar2 instanceof e)) {
                                if (fVar2 != null) {
                                    b6e.s();
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            case 7:
                com.yandex.plus.home.feature.webviews.internal.home.k kVar3 = ((t) this.receiver).N;
                if (kVar3 != null) {
                    kVar3.j();
                }
                break;
            case 8:
                com.yandex.plus.home.feature.webviews.internal.home.k kVar4 = ((t) this.receiver).N;
                if (kVar4 != null) {
                    kVar4.p();
                }
                break;
            case 9:
                com.yandex.plus.home.feature.webviews.internal.home.k kVar5 = ((t) this.receiver).N;
                if (kVar5 != null) {
                    kVar5.j();
                }
                break;
            case 10:
                com.yandex.plus.home.feature.webviews.internal.home.k kVar6 = ((t) this.receiver).N;
                if (kVar6 != null) {
                    kVar6.p();
                }
                break;
            case 11:
                t.d((t) this.receiver);
                break;
            case 12:
                t.d((t) this.receiver);
                break;
            case 13:
                ((g) this.receiver).a();
                break;
            case 14:
                ((com.yandex.plus.home.feature.webviews.internal.stories.k) this.receiver).a();
                break;
            case 15:
                ((com.yandex.plus.home.feature.webviews.internal.home.a) this.receiver).j();
                break;
            case 16:
                ((com.yandex.plus.home.feature.webviews.internal.home.a) this.receiver).k();
                break;
            case 17:
                ((com.yandex.plus.home.feature.webviews.internal.home.a) this.receiver).u();
                break;
            case 18:
                ((com.yandex.plus.home.feature.webviews.internal.d) this.receiver).l();
                break;
            case 19:
                ((com.yandex.plus.home.feature.webviews.internal.home.a) this.receiver).p();
                break;
            case 20:
                ((com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.f) this.receiver).g();
                break;
            case 21:
                ((com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.f) this.receiver).h();
                break;
            case 22:
                g gVar = (g) this.receiver;
                gVar.getClass();
                com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.b;
                jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
                com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.c, bVar, "onRetryClick()", null);
                gVar.v.v();
                gVar.F0.l();
                break;
            case 23:
                ((t) ((u) this.receiver)).k();
                break;
            case 24:
                ((t) ((u) this.receiver)).k();
                break;
            case 25:
                com.yandex.plus.home.feature.webviews.internal.smart.e eVar = (com.yandex.plus.home.feature.webviews.internal.smart.e) this.receiver;
                eVar.getClass();
                com.yandex.plus.core.analytics.logging.b bVar2 = com.yandex.plus.core.analytics.logging.b.b;
                jyr jyrVar2 = com.yandex.plus.core.analytics.logging.e.a;
                com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.c, bVar2, "onRetryClick()", null);
                eVar.h.v();
                eVar.K.l();
                break;
            case 26:
                ((t) ((u) this.receiver)).k();
                break;
            case 27:
                ((com.yandex.plus.home.feature.webviews.internal.d) this.receiver).l();
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((com.yandex.plus.home.feature.webviews.internal.stories.c) this.receiver).p();
                break;
            default:
                ((com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.g) this.receiver).g();
                break;
        }
        return Unit.a;
    }
}
