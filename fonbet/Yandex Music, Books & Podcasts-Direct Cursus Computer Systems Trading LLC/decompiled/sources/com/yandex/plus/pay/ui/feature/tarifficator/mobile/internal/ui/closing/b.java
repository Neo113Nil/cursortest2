package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.closing;

import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.o;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.home.internal.di.y;
import com.yandex.plus.pay.ui.common.api.ui.view.ProgressView;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.counter_offers.CounterOffersContentView;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.ErrorContentView;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.success.p001native.SuccessNativeContentView;
import com.yandex.plus.webview.api.WebViewContainer;
import defpackage.aur;
import defpackage.b6e;
import defpackage.nm6;
import defpackage.pyc;
import defpackage.qgg;
import defpackage.s9f;
import defpackage.t75;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b extends aur implements pyc {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ o l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(o oVar, Object obj, Continuation continuation, int i) {
        super(3, continuation);
        this.j = i;
        this.l = oVar;
        this.m = obj;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.j) {
            case 0:
                b bVar = new b((f) this.l, (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.content.c) this.m, (Continuation) obj3, 0);
                bVar.k = (i) obj2;
                return bVar.invokeSuspend(Unit.a);
            case 1:
                b bVar2 = new b((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.f) this.l, (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.counter_offers.f) this.m, (Continuation) obj3, 1);
                bVar2.k = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.i) obj2;
                return bVar2.invokeSuspend(Unit.a);
            case 2:
                b bVar3 = new b((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.f) this.l, (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.b) this.m, (Continuation) obj3, 2);
                bVar3.k = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.i) obj2;
                return bVar3.invokeSuspend(Unit.a);
            case 3:
                b bVar4 = new b((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.e) this.l, (com.yandex.plus.webview.internal.f) this.m, (Continuation) obj3, 3);
                bVar4.k = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.i) obj2;
                return bVar4.invokeSuspend(Unit.a);
            case 4:
                b bVar5 = new b((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.presale.c) this.l, (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.a) this.m, (Continuation) obj3, 4);
                bVar5.k = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.presale.g) obj2;
                return bVar5.invokeSuspend(Unit.a);
            default:
                b bVar6 = new b((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.f) this.l, (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.success.p001native.c) this.m, (Continuation) obj3, 5);
                bVar6.k = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.j) obj2;
                return bVar6.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        int i2 = 1;
        o oVar = this.l;
        Object obj2 = this.m;
        switch (i) {
            case 0:
                i iVar = (i) this.k;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                com.yandex.passport.internal.core.accounts.h hVar = ((f) oVar).j;
                com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.content.c cVar = (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.content.c) obj2;
                s9f[] s9fVarArr = f.l;
                if (!(iVar instanceof h)) {
                    if (!(iVar instanceof g)) {
                        b6e.s();
                        break;
                    } else {
                        ((View) hVar.x(f.l[0])).setVisibility(8);
                        cVar.d(((g) iVar).a);
                    }
                } else {
                    ((View) hVar.x(f.l[0])).setVisibility(0);
                    ((com.yandex.plus.coil.b) cVar.b).a(cVar.b());
                    cVar.a.setVisibility(8);
                }
                break;
            case 1:
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.i iVar2 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.i) this.k;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                com.yandex.passport.internal.core.accounts.h hVar2 = ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.f) oVar).k;
                com.yandex.plus.pay.ui.core.internal.tarifficator.ui.counter_offers.f fVar = (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.counter_offers.f) obj2;
                CounterOffersContentView counterOffersContentView = fVar.a;
                s9f[] s9fVarArr2 = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.f.l;
                if (!(iVar2 instanceof com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.g)) {
                    if (!(iVar2 instanceof com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.h)) {
                        b6e.s();
                        break;
                    } else {
                        ((ProgressView) hVar2.x(com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.f.l[1])).setVisibility(8);
                        fVar.f(((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.h) iVar2).a);
                        counterOffersContentView.setVisibility(0);
                    }
                } else {
                    ((ProgressView) hVar2.x(com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.f.l[1])).setVisibility(0);
                    counterOffersContentView.setVisibility(8);
                }
                break;
            case 2:
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.i iVar3 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.i) this.k;
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.f fVar2 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.f) oVar;
                com.yandex.passport.internal.core.accounts.h hVar3 = fVar2.j;
                com.yandex.passport.internal.core.accounts.h hVar4 = fVar2.k;
                com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.b bVar = (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.b) obj2;
                s9f[] s9fVarArr3 = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.f.l;
                if (!(iVar3 instanceof com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.g)) {
                    if (!(iVar3 instanceof com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.h)) {
                        b6e.s();
                        break;
                    } else {
                        s9f[] s9fVarArr4 = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.f.l;
                        ((ProgressView) hVar4.x(s9fVarArr4[1])).setVisibility(0);
                        ((ErrorContentView) hVar3.x(s9fVarArr4[0])).setVisibility(8);
                    }
                } else {
                    s9f[] s9fVarArr5 = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.f.l;
                    ((ProgressView) hVar4.x(s9fVarArr5[1])).setVisibility(8);
                    ((ErrorContentView) hVar3.x(s9fVarArr5[0])).setVisibility(0);
                    com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.g gVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.g) iVar3;
                    bVar.h(gVar.a);
                    r1.F((TextView) bVar.h.g(com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.b.r[8]), gVar.b);
                }
                break;
            case 3:
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.i iVar4 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.i) this.k;
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.e eVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.e) oVar;
                com.yandex.plus.webview.internal.f fVar3 = (com.yandex.plus.webview.internal.f) obj2;
                s9f[] s9fVarArr6 = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.e.p;
                if (!(iVar4 instanceof com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.h)) {
                    if (!(iVar4 instanceof com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.g)) {
                        b6e.s();
                        break;
                    } else {
                        String str = eVar.n;
                        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.g gVar2 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.g) iVar4;
                        String str2 = gVar2.a;
                        if (!Intrinsics.d(str, str2)) {
                            eVar.n = str2;
                            fVar3.n(str2, gVar2.b);
                        }
                        eVar.y().setVisibility(0);
                        eVar.y().setText(gVar2.c);
                    }
                } else {
                    ((View) eVar.k.x(com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.e.p[1])).setVisibility(0);
                    eVar.A().setVisibility(8);
                    eVar.y().setVisibility(8);
                }
                break;
            case 4:
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.presale.g gVar3 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.presale.g) this.k;
                nm6 nm6Var5 = nm6.a;
                qgg.h0(obj);
                com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.a aVar = (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.a) obj2;
                s9f[] s9fVarArr7 = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.presale.c.l;
                if (!(gVar3 instanceof com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.presale.d)) {
                    if (!(gVar3 instanceof com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.presale.f)) {
                        if (!(gVar3 instanceof com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.presale.e)) {
                            b6e.s();
                            break;
                        } else {
                            com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.presale.e eVar2 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.presale.e) gVar3;
                            aVar.h(eVar2.a, eVar2.b, eVar2.c, eVar2.d);
                        }
                    } else {
                        aVar.i(((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.presale.f) gVar3).a);
                    }
                } else {
                    aVar.g();
                    aVar.b().setVisibility(0);
                    aVar.b().setAlpha(1.0f);
                    aVar.c().setVisibility(8);
                    aVar.e().setVisibility(8);
                    aVar.l.a.setVisibility(8);
                    aVar.a().setVisibility(8);
                    aVar.f().setVisibility(8);
                }
                break;
            default:
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.j jVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.j) this.k;
                nm6 nm6Var6 = nm6.a;
                qgg.h0(obj);
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.f fVar4 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.f) oVar;
                com.yandex.plus.pay.ui.core.internal.tarifficator.ui.success.p001native.c cVar2 = (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.success.p001native.c) obj2;
                com.yandex.passport.internal.entities.j jVar2 = cVar2.h;
                SuccessNativeContentView successNativeContentView = cVar2.a;
                s9f[] s9fVarArr8 = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.f.q;
                if (!(jVar instanceof com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.g)) {
                    if (!(jVar instanceof com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.i)) {
                        if (!(jVar instanceof com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.h)) {
                            b6e.s();
                            break;
                        } else {
                            com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.h hVar5 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.h) jVar;
                            fVar4.y().setVisibility(8);
                            fVar4.A().setVisibility(8);
                            com.yandex.plus.webview.internal.f fVar5 = fVar4.k;
                            if (fVar5 != null) {
                                fVar5.k();
                            }
                            cVar2.c(hVar5.a);
                            successNativeContentView.setVisibility(0);
                            cVar2.d();
                        }
                    } else {
                        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.i iVar5 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.i) jVar;
                        jVar2.o();
                        successNativeContentView.setVisibility(8);
                        fVar4.y().setVisibility(8);
                        String str3 = fVar4.p;
                        String str4 = iVar5.a;
                        if (Intrinsics.d(str3, str4)) {
                            fVar4.A().setVisibility(0);
                            fVar4.y().setVisibility(8);
                        } else {
                            fVar4.A().setVisibility(8);
                            fVar4.y().setVisibility(0);
                            fVar4.p = str4;
                            long j = iVar5.b;
                            long j2 = iVar5.c;
                            WebViewContainer A = fVar4.A();
                            com.yandex.plus.home.plaque.plugin.internal.proxy.a h = com.yandex.plus.bdui.plus.analytics.b.h(t75.c(((com.yandex.plus.pay.ui.webview.paymentwidget.ui.c) fVar4.x().a.J0.getValue()).a("success", j, j2, new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.b(fVar4, i2))));
                            com.yandex.plus.core.network.ssl.a a = fVar4.x().a.t.a("TarifficatorSuccess");
                            ((com.yandex.plus.core.dispatcher.a) fVar4.x().a.i).getClass();
                            com.yandex.plus.webview.api.c cVar3 = new com.yandex.plus.webview.api.c(A, h, a, false, com.yandex.plus.core.dispatcher.a.c, fVar4.x().a.g);
                            com.yandex.plus.webview.api.request.b bVar2 = (com.yandex.plus.webview.api.request.b) fVar4.x().a.G.getValue();
                            bVar2.getClass();
                            cVar3.l = bVar2;
                            cVar3.n = j + j2;
                            cVar3.o = new y(fVar4.y(), fVar4.A());
                            cVar3.m = false;
                            com.yandex.plus.webview.internal.f a2 = cVar3.a();
                            fVar4.k = a2;
                            a2.n(str4, null);
                        }
                    }
                } else {
                    fVar4.y().setVisibility(0);
                    fVar4.A().setVisibility(8);
                    jVar2.o();
                    successNativeContentView.setVisibility(8);
                }
                break;
        }
        return null;
    }
}
