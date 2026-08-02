package com.yandex.plus.home.feature.panel.internal;

import com.yandex.plus.home.api.panel.g;
import com.yandex.plus.home.feature.panel.internal.sections.h;
import defpackage.b6e;
import defpackage.kcc;
import defpackage.lcc;
import defpackage.rjc;
import defpackage.wz0;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class d implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;

    public /* synthetic */ d(f fVar, int i) {
        this.a = i;
        this.b = fVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        Object eVar;
        String str;
        switch (this.a) {
            case 0:
                com.yandex.plus.home.repository.api.model.f fVar = (com.yandex.plus.home.repository.api.model.f) obj;
                boolean z = fVar instanceof com.yandex.plus.home.repository.api.model.c;
                com.yandex.plus.home.feature.panel.internalapi.model.d dVar = com.yandex.plus.home.feature.panel.internalapi.model.d.a;
                if (z) {
                    eVar = dVar;
                } else if (fVar instanceof com.yandex.plus.home.repository.api.model.e) {
                    com.yandex.plus.home.repository.api.model.user.f fVar2 = (com.yandex.plus.home.repository.api.model.user.f) ((com.yandex.plus.home.repository.api.model.e) fVar).a;
                    if (fVar2 instanceof com.yandex.plus.home.repository.api.model.user.b) {
                        eVar = new com.yandex.plus.home.feature.panel.internalapi.model.e(((com.yandex.plus.home.repository.api.model.user.b) fVar2).c);
                    } else {
                        if (!(fVar2 instanceof com.yandex.plus.home.repository.api.model.user.e)) {
                            b6e.s();
                            return null;
                        }
                        eVar = new com.yandex.plus.home.feature.panel.internalapi.model.e(null);
                    }
                } else {
                    if (!(fVar instanceof com.yandex.plus.home.repository.api.model.b)) {
                        b6e.s();
                        return null;
                    }
                    eVar = new com.yandex.plus.home.feature.panel.internalapi.model.e(null);
                }
                f fVar3 = this.b;
                com.yandex.plus.core.analytics.logging.d dVar2 = fVar3.h;
                com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
                if (dVar2.b(aVar)) {
                    dVar2.a(aVar, "PlusPanelViewManagerImpl", "subscribeToUpdates() familyState=" + eVar, null);
                }
                g gVar = fVar3.i;
                gVar.getClass();
                kcc kccVar = new kcc(new lcc(new wz0(8, gVar), true, com.yandex.plus.home.api.panel.f.c));
                while (kccVar.hasNext()) {
                    h hVar = (h) kccVar.next();
                    hVar.getClass();
                    com.yandex.plus.home.feature.panel.internal.shortcuts.lite.family.f fVar4 = hVar.z0;
                    if (fVar4 != null) {
                        com.yandex.plus.core.imageloader.b imageLoader = hVar.getImageLoader();
                        imageLoader.getClass();
                        if (eVar.equals(dVar)) {
                            fVar4.f = null;
                        } else {
                            if (!(eVar instanceof com.yandex.plus.home.feature.panel.internalapi.model.e)) {
                                b6e.s();
                                return null;
                            }
                            com.yandex.plus.home.repository.api.model.user.d dVar3 = ((com.yandex.plus.home.feature.panel.internalapi.model.e) eVar).b;
                            if (dVar3 == null) {
                                fVar4.f = null;
                            } else {
                                fVar4.f = dVar3;
                                com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.family.a aVar2 = fVar4.a;
                                if (!aVar2.isLaidOut() || aVar2.isLayoutRequested()) {
                                    aVar2.addOnLayoutChangeListener(new com.yandex.plus.home.feature.panel.internal.shortcuts.lite.family.d(0, fVar4, dVar3, imageLoader));
                                } else {
                                    com.yandex.plus.home.feature.panel.internal.shortcuts.lite.family.f.b(fVar4, dVar3, imageLoader);
                                }
                            }
                        }
                    }
                    com.yandex.plus.home.feature.panel.internal.shortcuts.lite.statusandfamily.c cVar = hVar.A0;
                    if (cVar != null) {
                        com.yandex.plus.core.imageloader.b imageLoader2 = hVar.getImageLoader();
                        imageLoader2.getClass();
                        if (eVar.equals(dVar)) {
                            cVar.p = null;
                        } else {
                            if (!(eVar instanceof com.yandex.plus.home.feature.panel.internalapi.model.e)) {
                                b6e.s();
                                return null;
                            }
                            com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.statusandfamily.b bVar = cVar.a;
                            if (!bVar.isLaidOut() || bVar.isLayoutRequested()) {
                                bVar.addOnLayoutChangeListener(new com.yandex.plus.home.feature.panel.internal.shortcuts.lite.family.d(1, cVar, (com.yandex.plus.home.feature.panel.internalapi.model.e) eVar, imageLoader2));
                            } else {
                                com.yandex.plus.home.feature.panel.internal.shortcuts.lite.statusandfamily.c.a(cVar, (com.yandex.plus.home.feature.panel.internalapi.model.e) eVar, imageLoader2);
                            }
                        }
                    }
                }
                return Unit.a;
            default:
                com.yandex.plus.home.repository.api.model.f fVar5 = (com.yandex.plus.home.repository.api.model.f) obj;
                boolean z2 = fVar5 instanceof com.yandex.plus.home.repository.api.model.c;
                com.yandex.plus.home.feature.panel.internalapi.model.c cVar2 = com.yandex.plus.home.feature.panel.internalapi.model.a.a;
                f fVar6 = this.b;
                if (!z2) {
                    if (fVar5 instanceof com.yandex.plus.home.repository.api.model.e) {
                        com.yandex.plus.home.repository.api.model.plusstate.a a = ((com.yandex.plus.home.repository.api.model.plusstate.f) ((com.yandex.plus.home.repository.api.model.e) fVar5).a).a();
                        if (a != null) {
                            BigDecimal scale = new BigDecimal(String.valueOf(a.a)).setScale(2, RoundingMode.HALF_UP);
                            str = fVar6.k.format(scale.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : scale.stripTrailingZeros());
                            str.getClass();
                        } else {
                            str = "–";
                        }
                        cVar2 = new com.yandex.plus.home.feature.panel.internalapi.model.b(str);
                    } else if (!(fVar5 instanceof com.yandex.plus.home.repository.api.model.b)) {
                        b6e.s();
                        return null;
                    }
                }
                com.yandex.plus.core.analytics.logging.d dVar4 = fVar6.h;
                com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.b;
                if (dVar4.b(aVar3)) {
                    dVar4.a(aVar3, "PlusPanelViewManagerImpl", "subscribeToUpdates() balanceState=" + cVar2, null);
                }
                g gVar2 = fVar6.i;
                gVar2.getClass();
                kcc kccVar2 = new kcc(new lcc(new wz0(8, gVar2), true, com.yandex.plus.home.api.panel.f.b));
                while (kccVar2.hasNext()) {
                    ((h) kccVar2.next()).setBalance(cVar2);
                }
                return Unit.a;
        }
    }
}
