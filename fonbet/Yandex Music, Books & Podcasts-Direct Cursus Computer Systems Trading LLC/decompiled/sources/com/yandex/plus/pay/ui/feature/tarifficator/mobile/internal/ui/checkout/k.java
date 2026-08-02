package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout;

import android.view.View;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.CheckoutContentView;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.upsale.UpsaleContentView;
import defpackage.aur;
import defpackage.b6e;
import defpackage.nm6;
import defpackage.pyc;
import defpackage.qgg;
import defpackage.s9f;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k extends aur implements pyc {
    public final /* synthetic */ int j;
    public final /* synthetic */ com.yandex.plus.pay.ui.core.internal.tarifficator.ui.common.b k;
    public final /* synthetic */ com.yandex.plus.webview.internal.f l;
    public /* synthetic */ Object m;
    public final /* synthetic */ androidx.fragment.app.o n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(androidx.fragment.app.o oVar, Object obj, com.yandex.plus.pay.ui.core.internal.tarifficator.ui.common.b bVar, com.yandex.plus.webview.internal.f fVar, Continuation continuation, int i) {
        super(3, continuation);
        this.j = i;
        this.n = oVar;
        this.o = obj;
        this.k = bVar;
        this.l = fVar;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.j) {
            case 0:
                q qVar = (q) this.n;
                com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.j jVar = (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.j) this.o;
                com.yandex.plus.webview.internal.f fVar = this.l;
                k kVar = new k(qVar, jVar, this.k, fVar, (Continuation) obj3, 0);
                kVar.m = (v) obj2;
                return kVar.invokeSuspend(Unit.a);
            default:
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.d dVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.d) this.n;
                com.yandex.plus.pay.ui.core.internal.tarifficator.ui.upsale.c cVar = (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.upsale.c) this.o;
                com.yandex.plus.webview.internal.f fVar2 = this.l;
                k kVar2 = new k(dVar, cVar, this.k, fVar2, (Continuation) obj3, 1);
                kVar2.m = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.i) obj2;
                return kVar2.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        com.yandex.plus.webview.internal.f fVar = this.l;
        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.common.b bVar = this.k;
        Object obj2 = this.o;
        androidx.fragment.app.o oVar = this.n;
        switch (i) {
            case 0:
                v vVar = (v) this.m;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                q qVar = (q) oVar;
                com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.j jVar = (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.j) obj2;
                CheckoutContentView checkoutContentView = jVar.a;
                View view = jVar.H;
                s9f[] s9fVarArr = q.s;
                if (!(vVar instanceof t)) {
                    if (!(vVar instanceof s)) {
                        if (!(vVar instanceof u)) {
                            if (!(vVar instanceof r)) {
                                b6e.s();
                                break;
                            } else {
                                r rVar = (r) vVar;
                                String str = rVar.d;
                                if (!Intrinsics.d(qVar.n, str)) {
                                    qVar.n = str;
                                    fVar.n(str, null);
                                }
                                qVar.z().setVisibility(8);
                                if (rVar.e) {
                                    qVar.B().setVisibility(0);
                                    qVar.x().setVisibility(8);
                                    bVar.d();
                                } else {
                                    qVar.B().setVisibility(8);
                                    qVar.x().setVisibility(0);
                                    jVar.h(rVar.a);
                                    bVar.f(rVar.b, rVar.c);
                                }
                            }
                        } else {
                            u uVar = (u) vVar;
                            qVar.z().setVisibility(8);
                            qVar.x().setVisibility(0);
                            qVar.B().setVisibility(8);
                            jVar.h(uVar.a);
                            bVar.f(uVar.b, uVar.c);
                        }
                    } else {
                        qVar.z().setVisibility(8);
                        qVar.x().setVisibility(0);
                        qVar.B().setVisibility(8);
                        jVar.h(((s) vVar).a);
                        checkoutContentView.removeView(view);
                        jVar.e().setEnabled(true);
                        bVar.d();
                    }
                } else {
                    com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.g gVar = ((t) vVar).a;
                    if (gVar != null) {
                        qVar.z().setVisibility(8);
                        qVar.x().setVisibility(0);
                        jVar.h(gVar);
                        if (view.getParent() == null) {
                            checkoutContentView.addView(view);
                        }
                        jVar.e().setEnabled(false);
                    } else {
                        qVar.z().setVisibility(0);
                        qVar.x().setVisibility(8);
                    }
                    qVar.B().setVisibility(8);
                    bVar.d();
                }
                qVar.r = vVar;
                qVar.D();
                break;
            default:
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.i iVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.i) this.m;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.d dVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.d) oVar;
                com.yandex.plus.pay.ui.core.internal.tarifficator.ui.upsale.c cVar = (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.upsale.c) obj2;
                UpsaleContentView upsaleContentView = cVar.a;
                s9f[] s9fVarArr2 = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.d.o;
                if (!(iVar instanceof com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.g)) {
                    if (!(iVar instanceof com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.f)) {
                        if (!(iVar instanceof com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.h)) {
                            if (!(iVar instanceof com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.e)) {
                                b6e.s();
                                break;
                            } else {
                                dVar.y().setVisibility(8);
                                dVar.A().setVisibility(0);
                                fVar.n(((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.e) iVar).a, null);
                                bVar.d();
                                upsaleContentView.setVisibility(8);
                            }
                        } else {
                            dVar.y().setVisibility(8);
                            dVar.A().setVisibility(8);
                            com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.h hVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.h) iVar;
                            bVar.f(hVar.b, hVar.c);
                            cVar.c(hVar.a);
                            upsaleContentView.setVisibility(0);
                        }
                    } else {
                        dVar.y().setVisibility(8);
                        dVar.A().setVisibility(8);
                        bVar.d();
                        cVar.c(((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.f) iVar).a);
                        upsaleContentView.setVisibility(0);
                    }
                } else {
                    dVar.y().setVisibility(0);
                    dVar.A().setVisibility(8);
                    bVar.d();
                    upsaleContentView.setVisibility(8);
                }
                break;
        }
        return null;
    }
}
