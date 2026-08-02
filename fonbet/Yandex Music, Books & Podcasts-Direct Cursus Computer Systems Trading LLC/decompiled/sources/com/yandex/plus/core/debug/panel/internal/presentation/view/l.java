package com.yandex.plus.core.debug.panel.internal.presentation.view;

import com.yandex.plus.home.internal.di.w;
import com.yandex.plus.home.internal.di.x;
import com.yandex.plus.pay.api.feature.tarifficator.payment.p;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.e0;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.v;
import com.yandex.plus.plaquesdk.plaque.api.models.g0;
import com.yandex.plus.plaquesdk.plaque.api.models.h0;
import com.yandex.plus.plaquesdk.plaque.api.models.i0;
import com.yandex.plus.plaquesdk.plaque.api.models.j0;
import defpackage.b6e;
import defpackage.msa;
import defpackage.nm6;
import defpackage.nsa;
import defpackage.qgg;
import defpackage.rjc;
import defpackage.ssa;
import defpackage.xq0;
import defpackage.yd5;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ rjc b;

    public /* synthetic */ l(rjc rjcVar, int i) {
        this.a = i;
        this.b = rjcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x014b  */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.yandex.plus.home.dailyquests.feature.api.model.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.yandex.plus.home.dailyquests.feature.api.model.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.yandex.plus.home.dailyquests.feature.api.model.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [rjc] */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        k kVar;
        int i;
        com.yandex.plus.core.debug.panel.internal.presentation.viewModel.a aVar;
        int i2;
        com.yandex.plus.home.auth.a aVar2;
        int i3;
        com.yandex.plus.home.common.utils.flow.a aVar3;
        int i4;
        com.yandex.plus.home.dailyquests.feature.internal.ui.g gVar;
        int i5;
        com.yandex.plus.home.dailyquests.plugin.internal.proxy.e eVar;
        int i6;
        Object obj2;
        com.yandex.plus.home.dailyquests.plugin.internal.proxy.f fVar;
        int i7;
        Object obj3;
        com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.e eVar2;
        int i8;
        com.yandex.plus.home.feature.webviews.internal.stories.g gVar2;
        int i9;
        com.yandex.plus.home.feature.webviews.internal.treasury.a aVar4;
        int i10;
        com.yandex.plus.home.graphql.plusstate.d dVar;
        int i11;
        com.yandex.plus.home.graphql.user.d dVar2;
        int i12;
        w wVar;
        int i13;
        x xVar;
        int i14;
        com.yandex.plus.home.plaque.feature.internal.d dVar3;
        int i15;
        com.yandex.plus.home.plaque.feature.internal.presentation.e eVar3;
        int i16;
        com.yandex.plus.home.plaque.feature.internal.presentation.f fVar2;
        int i17;
        com.yandex.plus.home.plaque.feature.internal.presentation.g gVar3;
        int i18;
        long j;
        com.yandex.plus.home.plaque.plugin.internal.a aVar5;
        int i19;
        com.yandex.plus.home.plaque.plugin.internal.b bVar;
        int i20;
        com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.b bVar2;
        int i21;
        e0 e0Var;
        int i22;
        int i23 = this.a;
        com.yandex.plus.home.dailyquests.feature.api.model.d dVar4 = com.yandex.plus.home.dailyquests.feature.api.model.d.a;
        ?? r5 = com.yandex.plus.home.dailyquests.feature.api.model.f.a;
        ?? r6 = com.yandex.plus.home.dailyquests.feature.api.model.g.a;
        ?? r7 = com.yandex.plus.home.dailyquests.feature.api.model.e.a;
        ?? r8 = this.b;
        switch (i23) {
            case 0:
                if (continuation instanceof k) {
                    kVar = (k) continuation;
                    int i24 = kVar.k;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        kVar.k = i24 - Integer.MIN_VALUE;
                        Object obj4 = kVar.j;
                        nm6 nm6Var = nm6.a;
                        i = kVar.k;
                        if (i != 0) {
                            qgg.h0(obj4);
                            com.yandex.plus.core.debug.panel.internal.model.log.d dVar5 = ((com.yandex.plus.core.debug.panel.internal.presentation.state.e) obj).d;
                            kVar.k = 1;
                            if (r8.emit(dVar5, kVar) == nm6Var) {
                                break;
                            }
                        } else if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj4);
                        }
                        break;
                    }
                }
                kVar = new k(this, continuation);
                Object obj42 = kVar.j;
                nm6 nm6Var2 = nm6.a;
                i = kVar.k;
                if (i != 0) {
                }
            case 1:
                if (continuation instanceof com.yandex.plus.core.debug.panel.internal.presentation.viewModel.a) {
                    aVar = (com.yandex.plus.core.debug.panel.internal.presentation.viewModel.a) continuation;
                    int i25 = aVar.k;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        aVar.k = i25 - Integer.MIN_VALUE;
                        Object obj5 = aVar.j;
                        nm6 nm6Var3 = nm6.a;
                        i2 = aVar.k;
                        if (i2 != 0) {
                            qgg.h0(obj5);
                            Boolean valueOf = Boolean.valueOf(!((List) obj).isEmpty());
                            aVar.k = 1;
                            if (r8.emit(valueOf, aVar) == nm6Var3) {
                                break;
                            }
                        } else if (i2 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj5);
                        }
                        break;
                    }
                }
                aVar = new com.yandex.plus.core.debug.panel.internal.presentation.viewModel.a(this, continuation);
                Object obj52 = aVar.j;
                nm6 nm6Var32 = nm6.a;
                i2 = aVar.k;
                if (i2 != 0) {
                }
            case 2:
                if (continuation instanceof com.yandex.plus.home.auth.a) {
                    aVar2 = (com.yandex.plus.home.auth.a) continuation;
                    int i26 = aVar2.k;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        aVar2.k = i26 - Integer.MIN_VALUE;
                        Object obj6 = aVar2.j;
                        nm6 nm6Var4 = nm6.a;
                        i3 = aVar2.k;
                        if (i3 != 0) {
                            qgg.h0(obj6);
                            Boolean valueOf2 = Boolean.valueOf(((com.yandex.plus.domain.auth.api.e) obj) instanceof com.yandex.plus.domain.auth.api.b);
                            aVar2.k = 1;
                            if (r8.emit(valueOf2, aVar2) == nm6Var4) {
                                break;
                            }
                        } else if (i3 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj6);
                        }
                        break;
                    }
                }
                aVar2 = new com.yandex.plus.home.auth.a(this, continuation);
                Object obj62 = aVar2.j;
                nm6 nm6Var42 = nm6.a;
                i3 = aVar2.k;
                if (i3 != 0) {
                }
            case 3:
                if (continuation instanceof com.yandex.plus.home.common.utils.flow.a) {
                    aVar3 = (com.yandex.plus.home.common.utils.flow.a) continuation;
                    int i27 = aVar3.k;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        aVar3.k = i27 - Integer.MIN_VALUE;
                        Object obj7 = aVar3.j;
                        nm6 nm6Var5 = nm6.a;
                        i4 = aVar3.k;
                        if (i4 != 0) {
                            qgg.h0(obj7);
                            Object obj8 = ((Pair) obj).b;
                            aVar3.k = 1;
                            if (r8.emit(obj8, aVar3) == nm6Var5) {
                                break;
                            }
                        } else if (i4 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj7);
                        }
                        break;
                    }
                }
                aVar3 = new com.yandex.plus.home.common.utils.flow.a(this, continuation);
                Object obj72 = aVar3.j;
                nm6 nm6Var52 = nm6.a;
                i4 = aVar3.k;
                if (i4 != 0) {
                }
            case 4:
                if (continuation instanceof com.yandex.plus.home.dailyquests.feature.internal.ui.g) {
                    gVar = (com.yandex.plus.home.dailyquests.feature.internal.ui.g) continuation;
                    int i28 = gVar.k;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        gVar.k = i28 - Integer.MIN_VALUE;
                        Object obj9 = gVar.j;
                        nm6 nm6Var6 = nm6.a;
                        i5 = gVar.k;
                        if (i5 != 0) {
                            qgg.h0(obj9);
                            com.yandex.plus.home.dailyquests.feature.internal.model.j jVar = (com.yandex.plus.home.dailyquests.feature.internal.model.j) obj;
                            jVar.getClass();
                            if (!(jVar instanceof com.yandex.plus.home.dailyquests.feature.internal.model.b)) {
                                if (!(jVar instanceof com.yandex.plus.home.dailyquests.feature.internal.model.i)) {
                                    if (!(jVar instanceof com.yandex.plus.home.dailyquests.feature.internal.model.h)) {
                                        if (!(jVar instanceof com.yandex.plus.home.dailyquests.feature.internal.model.a)) {
                                            b6e.s();
                                            break;
                                        }
                                    } else {
                                        dVar4 = r5;
                                    }
                                } else {
                                    dVar4 = r6;
                                }
                            } else {
                                dVar4 = r7;
                            }
                            gVar.k = 1;
                            if (r8.emit(dVar4, gVar) == nm6Var6) {
                                break;
                            }
                        } else if (i5 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj9);
                        }
                        break;
                    }
                }
                gVar = new com.yandex.plus.home.dailyquests.feature.internal.ui.g(this, continuation);
                Object obj92 = gVar.j;
                nm6 nm6Var62 = nm6.a;
                i5 = gVar.k;
                if (i5 != 0) {
                }
            case 5:
                if (continuation instanceof com.yandex.plus.home.dailyquests.plugin.internal.proxy.e) {
                    eVar = (com.yandex.plus.home.dailyquests.plugin.internal.proxy.e) continuation;
                    int i29 = eVar.k;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        eVar.k = i29 - Integer.MIN_VALUE;
                        Object obj10 = eVar.j;
                        nm6 nm6Var7 = nm6.a;
                        i6 = eVar.k;
                        if (i6 != 0) {
                            qgg.h0(obj10);
                            com.yandex.plus.home.dailyquests.feature.api.model.h hVar = (com.yandex.plus.home.dailyquests.feature.api.model.h) obj;
                            if (!Intrinsics.d(hVar, r7)) {
                                if (!Intrinsics.d(hVar, r6)) {
                                    if (!Intrinsics.d(hVar, r5)) {
                                        if (!Intrinsics.d(hVar, dVar4)) {
                                            b6e.s();
                                            break;
                                        } else {
                                            obj2 = com.yandex.plus.home.dailyquests.plugin.api.model.d.a;
                                        }
                                    } else {
                                        obj2 = com.yandex.plus.home.dailyquests.plugin.api.model.f.a;
                                    }
                                } else {
                                    obj2 = com.yandex.plus.home.dailyquests.plugin.api.model.g.a;
                                }
                            } else {
                                obj2 = com.yandex.plus.home.dailyquests.plugin.api.model.e.a;
                            }
                            eVar.k = 1;
                            if (r8.emit(obj2, eVar) == nm6Var7) {
                                break;
                            }
                        } else if (i6 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj10);
                        }
                        break;
                    }
                }
                eVar = new com.yandex.plus.home.dailyquests.plugin.internal.proxy.e(this, continuation);
                Object obj102 = eVar.j;
                nm6 nm6Var72 = nm6.a;
                i6 = eVar.k;
                if (i6 != 0) {
                }
            case 6:
                if (continuation instanceof com.yandex.plus.home.dailyquests.plugin.internal.proxy.f) {
                    fVar = (com.yandex.plus.home.dailyquests.plugin.internal.proxy.f) continuation;
                    int i30 = fVar.k;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        fVar.k = i30 - Integer.MIN_VALUE;
                        Object obj11 = fVar.j;
                        nm6 nm6Var8 = nm6.a;
                        i7 = fVar.k;
                        if (i7 != 0) {
                            qgg.h0(obj11);
                            com.yandex.plus.home.dailyquests.feature.api.model.c cVar = (com.yandex.plus.home.dailyquests.feature.api.model.c) obj;
                            if (!(cVar instanceof com.yandex.plus.home.dailyquests.feature.api.model.a)) {
                                if (!(cVar instanceof com.yandex.plus.home.dailyquests.feature.api.model.b)) {
                                    b6e.s();
                                    break;
                                } else {
                                    obj3 = com.yandex.plus.home.dailyquests.plugin.api.model.b.a;
                                }
                            } else {
                                com.yandex.plus.home.dailyquests.feature.api.model.a aVar6 = (com.yandex.plus.home.dailyquests.feature.api.model.a) cVar;
                                obj3 = new com.yandex.plus.home.dailyquests.plugin.api.model.a(aVar6.a, aVar6.b);
                            }
                            fVar.k = 1;
                            if (r8.emit(obj3, fVar) == nm6Var8) {
                                break;
                            }
                        } else if (i7 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj11);
                        }
                        break;
                    }
                }
                fVar = new com.yandex.plus.home.dailyquests.plugin.internal.proxy.f(this, continuation);
                Object obj112 = fVar.j;
                nm6 nm6Var82 = nm6.a;
                i7 = fVar.k;
                if (i7 != 0) {
                }
            case 7:
                if (continuation instanceof com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.e) {
                    eVar2 = (com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.e) continuation;
                    int i31 = eVar2.k;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        eVar2.k = i31 - Integer.MIN_VALUE;
                        Object obj12 = eVar2.j;
                        nm6 nm6Var9 = nm6.a;
                        i8 = eVar2.k;
                        if (i8 != 0) {
                            qgg.h0(obj12);
                            if (obj instanceof com.yandex.plus.home.feature.webviews.internal.events.a) {
                                eVar2.k = 1;
                                if (r8.emit(obj, eVar2) == nm6Var9) {
                                    break;
                                }
                            }
                        } else if (i8 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj12);
                        }
                        break;
                    }
                }
                eVar2 = new com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.e(this, continuation);
                Object obj122 = eVar2.j;
                nm6 nm6Var92 = nm6.a;
                i8 = eVar2.k;
                if (i8 != 0) {
                }
            case 8:
                if (continuation instanceof com.yandex.plus.home.feature.webviews.internal.stories.g) {
                    gVar2 = (com.yandex.plus.home.feature.webviews.internal.stories.g) continuation;
                    int i32 = gVar2.k;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        gVar2.k = i32 - Integer.MIN_VALUE;
                        Object obj13 = gVar2.j;
                        nm6 nm6Var10 = nm6.a;
                        i9 = gVar2.k;
                        if (i9 != 0) {
                            qgg.h0(obj13);
                            if (((Boolean) obj).booleanValue()) {
                                gVar2.k = 1;
                                if (r8.emit(obj, gVar2) == nm6Var10) {
                                    break;
                                }
                            }
                        } else if (i9 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj13);
                        }
                        break;
                    }
                }
                gVar2 = new com.yandex.plus.home.feature.webviews.internal.stories.g(this, continuation);
                Object obj132 = gVar2.j;
                nm6 nm6Var102 = nm6.a;
                i9 = gVar2.k;
                if (i9 != 0) {
                }
            case 9:
                if (continuation instanceof com.yandex.plus.home.feature.webviews.internal.treasury.a) {
                    aVar4 = (com.yandex.plus.home.feature.webviews.internal.treasury.a) continuation;
                    int i33 = aVar4.k;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        aVar4.k = i33 - Integer.MIN_VALUE;
                        Object obj14 = aVar4.j;
                        nm6 nm6Var11 = nm6.a;
                        i10 = aVar4.k;
                        if (i10 != 0) {
                            qgg.h0(obj14);
                            if (obj instanceof com.yandex.plus.treasury.api.a) {
                                aVar4.k = 1;
                                if (r8.emit(obj, aVar4) == nm6Var11) {
                                    break;
                                }
                            }
                        } else if (i10 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj14);
                        }
                        break;
                    }
                }
                aVar4 = new com.yandex.plus.home.feature.webviews.internal.treasury.a(this, continuation);
                Object obj142 = aVar4.j;
                nm6 nm6Var112 = nm6.a;
                i10 = aVar4.k;
                if (i10 != 0) {
                }
            case 10:
                if (continuation instanceof com.yandex.plus.home.graphql.plusstate.d) {
                    dVar = (com.yandex.plus.home.graphql.plusstate.d) continuation;
                    int i34 = dVar.k;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        dVar.k = i34 - Integer.MIN_VALUE;
                        Object obj15 = dVar.j;
                        nm6 nm6Var12 = nm6.a;
                        i11 = dVar.k;
                        if (i11 != 0) {
                            qgg.h0(obj15);
                            if (obj instanceof com.yandex.plus.home.repository.api.model.d) {
                                dVar.k = 1;
                                if (r8.emit(obj, dVar) == nm6Var12) {
                                    break;
                                }
                            }
                        } else if (i11 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj15);
                        }
                        break;
                    }
                }
                dVar = new com.yandex.plus.home.graphql.plusstate.d(this, continuation);
                Object obj152 = dVar.j;
                nm6 nm6Var122 = nm6.a;
                i11 = dVar.k;
                if (i11 != 0) {
                }
            case 11:
                if (continuation instanceof com.yandex.plus.home.graphql.user.d) {
                    dVar2 = (com.yandex.plus.home.graphql.user.d) continuation;
                    int i35 = dVar2.k;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        dVar2.k = i35 - Integer.MIN_VALUE;
                        Object obj16 = dVar2.j;
                        nm6 nm6Var13 = nm6.a;
                        i12 = dVar2.k;
                        if (i12 != 0) {
                            qgg.h0(obj16);
                            if (obj instanceof com.yandex.plus.home.repository.api.model.d) {
                                dVar2.k = 1;
                                if (r8.emit(obj, dVar2) == nm6Var13) {
                                    break;
                                }
                            }
                        } else if (i12 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj16);
                        }
                        break;
                    }
                }
                dVar2 = new com.yandex.plus.home.graphql.user.d(this, continuation);
                Object obj162 = dVar2.j;
                nm6 nm6Var132 = nm6.a;
                i12 = dVar2.k;
                if (i12 != 0) {
                }
            case 12:
                if (continuation instanceof w) {
                    wVar = (w) continuation;
                    int i36 = wVar.k;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        wVar.k = i36 - Integer.MIN_VALUE;
                        Object obj17 = wVar.j;
                        nm6 nm6Var14 = nm6.a;
                        i13 = wVar.k;
                        if (i13 != 0) {
                            qgg.h0(obj17);
                            Set set = (Set) obj;
                            if (set.contains(com.yandex.plus.home.state.b.c) || set.contains(com.yandex.plus.home.state.b.a)) {
                                wVar.k = 1;
                                if (r8.emit(obj, wVar) == nm6Var14) {
                                    break;
                                }
                            }
                        } else if (i13 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj17);
                        }
                        break;
                    }
                }
                wVar = new w(this, continuation);
                Object obj172 = wVar.j;
                nm6 nm6Var142 = nm6.a;
                i13 = wVar.k;
                if (i13 != 0) {
                }
                break;
            case 13:
                if (continuation instanceof x) {
                    xVar = (x) continuation;
                    int i37 = xVar.k;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        xVar.k = i37 - Integer.MIN_VALUE;
                        Object obj18 = xVar.j;
                        nm6 nm6Var15 = nm6.a;
                        i14 = xVar.k;
                        if (i14 != 0) {
                            qgg.h0(obj18);
                            Unit unit = Unit.a;
                            xVar.k = 1;
                            if (r8.emit(unit, xVar) == nm6Var15) {
                                break;
                            }
                        } else if (i14 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj18);
                        }
                        break;
                    }
                }
                xVar = new x(this, continuation);
                Object obj182 = xVar.j;
                nm6 nm6Var152 = nm6.a;
                i14 = xVar.k;
                if (i14 != 0) {
                }
            case 14:
                if (continuation instanceof com.yandex.plus.home.plaque.feature.internal.d) {
                    dVar3 = (com.yandex.plus.home.plaque.feature.internal.d) continuation;
                    int i38 = dVar3.k;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        dVar3.k = i38 - Integer.MIN_VALUE;
                        Object obj19 = dVar3.j;
                        nm6 nm6Var16 = nm6.a;
                        i15 = dVar3.k;
                        if (i15 != 0) {
                            qgg.h0(obj19);
                            if (!(((com.yandex.plus.domain.auth.api.e) obj) instanceof com.yandex.plus.domain.auth.api.c)) {
                                dVar3.k = 1;
                                if (r8.emit(obj, dVar3) == nm6Var16) {
                                    break;
                                }
                            }
                        } else if (i15 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj19);
                        }
                        break;
                    }
                }
                dVar3 = new com.yandex.plus.home.plaque.feature.internal.d(this, continuation);
                Object obj192 = dVar3.j;
                nm6 nm6Var162 = nm6.a;
                i15 = dVar3.k;
                if (i15 != 0) {
                }
            case 15:
                if (continuation instanceof com.yandex.plus.home.plaque.feature.internal.presentation.e) {
                    eVar3 = (com.yandex.plus.home.plaque.feature.internal.presentation.e) continuation;
                    int i39 = eVar3.k;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        eVar3.k = i39 - Integer.MIN_VALUE;
                        Object obj20 = eVar3.j;
                        nm6 nm6Var17 = nm6.a;
                        i16 = eVar3.k;
                        if (i16 != 0) {
                            qgg.h0(obj20);
                            com.yandex.plus.home.plaque.repository.api.model.c cVar2 = (com.yandex.plus.home.plaque.repository.api.model.c) obj;
                            j0 b = cVar2 != null ? cVar2.b() : null;
                            if (b != null) {
                                eVar3.k = 1;
                                if (r8.emit(b, eVar3) == nm6Var17) {
                                    break;
                                }
                            }
                        } else if (i16 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj20);
                        }
                        break;
                    }
                }
                eVar3 = new com.yandex.plus.home.plaque.feature.internal.presentation.e(this, continuation);
                Object obj202 = eVar3.j;
                nm6 nm6Var172 = nm6.a;
                i16 = eVar3.k;
                if (i16 != 0) {
                }
            case 16:
                if (continuation instanceof com.yandex.plus.home.plaque.feature.internal.presentation.f) {
                    fVar2 = (com.yandex.plus.home.plaque.feature.internal.presentation.f) continuation;
                    int i40 = fVar2.k;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        fVar2.k = i40 - Integer.MIN_VALUE;
                        Object obj21 = fVar2.j;
                        nm6 nm6Var18 = nm6.a;
                        i17 = fVar2.k;
                        if (i17 != 0) {
                            qgg.h0(obj21);
                            com.yandex.plus.home.plaque.repository.api.model.c cVar3 = (com.yandex.plus.home.plaque.repository.api.model.c) obj;
                            Map c = cVar3 != null ? cVar3.c() : null;
                            if (c != null) {
                                fVar2.k = 1;
                                if (r8.emit(c, fVar2) == nm6Var18) {
                                    break;
                                }
                            }
                        } else if (i17 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj21);
                        }
                        break;
                    }
                }
                fVar2 = new com.yandex.plus.home.plaque.feature.internal.presentation.f(this, continuation);
                Object obj212 = fVar2.j;
                nm6 nm6Var182 = nm6.a;
                i17 = fVar2.k;
                if (i17 != 0) {
                }
            case 17:
                if (continuation instanceof com.yandex.plus.home.plaque.feature.internal.presentation.g) {
                    gVar3 = (com.yandex.plus.home.plaque.feature.internal.presentation.g) continuation;
                    int i41 = gVar3.k;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        gVar3.k = i41 - Integer.MIN_VALUE;
                        Object obj22 = gVar3.j;
                        nm6 nm6Var19 = nm6.a;
                        i18 = gVar3.k;
                        if (i18 != 0) {
                            qgg.h0(obj22);
                            com.yandex.plus.core.coroutines.extensions.flow.b bVar3 = (com.yandex.plus.core.coroutines.extensions.flow.b) obj;
                            Pair pair = (Pair) bVar3.a;
                            Pair pair2 = (Pair) bVar3.b;
                            j0 j0Var = pair != null ? (j0) pair.a : null;
                            j0 j0Var2 = (j0) pair2.a;
                            com.yandex.plus.plaquesdk.plaque.api.models.x b2 = com.yandex.plus.home.plaque.feature.internal.presentation.h.b(j0Var2.b, ((com.yandex.plus.home.plaque.feature.api.context.b) pair2.b).c);
                            String str = j0Var2.a;
                            g0 g0Var = j0Var2.c;
                            i0 i0Var = j0Var2.d;
                            h0 h0Var = j0Var2.e;
                            boolean z = j0Var2.f;
                            str.getClass();
                            i0Var.getClass();
                            j0 j0Var3 = new j0(str, b2, g0Var, i0Var, h0Var, z);
                            if (j0Var == null || j0Var.b.b(j0Var2.b)) {
                                nsa.b.getClass();
                                j = 0;
                            } else {
                                msa msaVar = nsa.b;
                                j = yd5.M(300, ssa.MILLISECONDS);
                            }
                            com.yandex.plus.home.plaque.feature.internal.presentation.a aVar7 = new com.yandex.plus.home.plaque.feature.internal.presentation.a(j0Var3, j);
                            gVar3.k = 1;
                            if (r8.emit(aVar7, gVar3) == nm6Var19) {
                                break;
                            }
                        } else if (i18 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj22);
                        }
                        break;
                    }
                }
                gVar3 = new com.yandex.plus.home.plaque.feature.internal.presentation.g(this, continuation);
                Object obj222 = gVar3.j;
                nm6 nm6Var192 = nm6.a;
                i18 = gVar3.k;
                if (i18 != 0) {
                }
                break;
            case 18:
                if (continuation instanceof com.yandex.plus.home.plaque.plugin.internal.a) {
                    aVar5 = (com.yandex.plus.home.plaque.plugin.internal.a) continuation;
                    int i42 = aVar5.k;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        aVar5.k = i42 - Integer.MIN_VALUE;
                        Object obj23 = aVar5.j;
                        nm6 nm6Var20 = nm6.a;
                        i19 = aVar5.k;
                        if (i19 != 0) {
                            qgg.h0(obj23);
                            Set set2 = (Set) obj;
                            if (set2.contains(com.yandex.plus.home.state.b.f) || set2.contains(com.yandex.plus.home.state.b.a)) {
                                aVar5.k = 1;
                                if (r8.emit(obj, aVar5) == nm6Var20) {
                                    break;
                                }
                            }
                        } else if (i19 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj23);
                        }
                        break;
                    }
                }
                aVar5 = new com.yandex.plus.home.plaque.plugin.internal.a(this, continuation);
                Object obj232 = aVar5.j;
                nm6 nm6Var202 = nm6.a;
                i19 = aVar5.k;
                if (i19 != 0) {
                }
                break;
            case 19:
                if (continuation instanceof com.yandex.plus.home.plaque.plugin.internal.b) {
                    bVar = (com.yandex.plus.home.plaque.plugin.internal.b) continuation;
                    int i43 = bVar.k;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        bVar.k = i43 - Integer.MIN_VALUE;
                        Object obj24 = bVar.j;
                        nm6 nm6Var21 = nm6.a;
                        i20 = bVar.k;
                        if (i20 != 0) {
                            qgg.h0(obj24);
                            Unit unit2 = Unit.a;
                            bVar.k = 1;
                            if (r8.emit(unit2, bVar) == nm6Var21) {
                                break;
                            }
                        } else if (i20 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj24);
                        }
                        break;
                    }
                }
                bVar = new com.yandex.plus.home.plaque.plugin.internal.b(this, continuation);
                Object obj242 = bVar.j;
                nm6 nm6Var212 = nm6.a;
                i20 = bVar.k;
                if (i20 != 0) {
                }
            case 20:
                if (continuation instanceof com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.b) {
                    bVar2 = (com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.b) continuation;
                    int i44 = bVar2.k;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        bVar2.k = i44 - Integer.MIN_VALUE;
                        Object obj25 = bVar2.j;
                        nm6 nm6Var22 = nm6.a;
                        i21 = bVar2.k;
                        if (i21 != 0) {
                            qgg.h0(obj25);
                            if (com.yandex.plus.bdui.plus.analytics.b.q((p) obj)) {
                                bVar2.k = 1;
                                if (r8.emit(obj, bVar2) == nm6Var22) {
                                    break;
                                }
                            }
                        } else if (i21 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj25);
                        }
                        break;
                    }
                }
                bVar2 = new com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.b(this, continuation);
                Object obj252 = bVar2.j;
                nm6 nm6Var222 = nm6.a;
                i21 = bVar2.k;
                if (i21 != 0) {
                }
            default:
                if (continuation instanceof e0) {
                    e0Var = (e0) continuation;
                    int i45 = e0Var.k;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        e0Var.k = i45 - Integer.MIN_VALUE;
                        Object obj26 = e0Var.j;
                        nm6 nm6Var23 = nm6.a;
                        i22 = e0Var.k;
                        if (i22 != 0) {
                            qgg.h0(obj26);
                            com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.g a = ((v) obj).a();
                            e0Var.k = 1;
                            if (r8.emit(a, e0Var) == nm6Var23) {
                                break;
                            }
                        } else if (i22 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj26);
                        }
                        break;
                    }
                }
                e0Var = new e0(this, continuation);
                Object obj262 = e0Var.j;
                nm6 nm6Var232 = nm6.a;
                i22 = e0Var.k;
                if (i22 != 0) {
                }
        }
        return Unit.a;
    }

    public /* synthetic */ l(rjc rjcVar, Object obj, int i) {
        this.a = i;
        this.b = rjcVar;
    }
}
