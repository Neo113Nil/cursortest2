package com.yandex.plus.home;

import android.animation.ValueAnimator;
import android.view.View;
import defpackage.a4g;
import defpackage.b6;
import defpackage.gld;
import defpackage.im6;
import defpackage.tf6;
import defpackage.x97;
import defpackage.xdr;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class r implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final Object b;

    public r() {
        this.a = 6;
        this.b = new HashSet();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.a;
        view.getClass();
        switch (i) {
            case 0:
                ((t) this.b).j.a();
                break;
            case 1:
                break;
            case 2:
                ((com.yandex.plus.home.dailyquests.feature.internal.ui.states.c) this.b).f.start();
                break;
            case 3:
                com.yandex.plus.home.feature.panel.internal.f fVar = (com.yandex.plus.home.feature.panel.internal.f) this.b;
                com.yandex.plus.core.analytics.logging.d dVar = fVar.h;
                com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
                Continuation continuation = null;
                if (dVar.b(aVar)) {
                    dVar.a(aVar, "PlusPanelViewManagerImpl", "onViewAttachedToWindow() panel view attached", null);
                }
                ((com.yandex.plus.core.dispatcher.a) fVar.g).getClass();
                tf6 e = gld.e(com.yandex.plus.core.dispatcher.a.d.plus(a4g.n()));
                fVar.l = e;
                x97.y(e, null, null, new com.yandex.plus.home.feature.panel.internal.e(fVar, continuation, 2), 3);
                break;
            case 4:
                ((b6) this.b).B();
                break;
            case 5:
                com.yandex.plus.home.plaque.feature.internal.presentation.b bVar = (com.yandex.plus.home.plaque.feature.internal.presentation.b) this.b;
                com.yandex.plus.log.api.b bVar2 = (com.yandex.plus.log.api.b) bVar.b;
                com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.c;
                if (bVar2.b(aVar2)) {
                    bVar2.c(aVar2, "PlaqueViewControllerImpl", "onViewAttached()");
                }
                com.yandex.passport.internal.entities.j jVar = (com.yandex.passport.internal.entities.j) bVar.a;
                xdr xdrVar = (xdr) jVar.b;
                Boolean bool = Boolean.TRUE;
                xdrVar.getClass();
                xdrVar.m(null, bool);
                jVar.R();
                tf6 e2 = gld.e(((kotlinx.coroutines.a) bVar.c).plus(a4g.n()).plus(new im6("PlaqueViewControllerImpl")));
                bVar.e = e2;
                x97.y(e2, null, null, new com.yandex.passport.internal.ui.social.i(bVar, null, 23), 3);
                break;
            case 6:
                Iterator it = ((HashSet) this.b).iterator();
                while (it.hasNext()) {
                    ((com.yandex.plus.home.plaque.feature.internal.b) it.next()).a(true);
                }
                break;
            default:
                Iterator it2 = ((CopyOnWriteArraySet) ((com.yandex.plus.webview.internal.f) this.b).r.b).iterator();
                while (it2.hasNext()) {
                    ((com.yandex.plus.webview.api.contract.d) it2.next()).getClass();
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.a;
        view.getClass();
        switch (i) {
            case 0:
                ((t) this.b).j.b();
                break;
            case 1:
                com.yandex.plus.bdui.plus.analytics.b.d((tf6) this.b);
                break;
            case 2:
                ValueAnimator valueAnimator = ((com.yandex.plus.home.dailyquests.feature.internal.ui.states.c) this.b).f;
                valueAnimator.removeAllUpdateListeners();
                valueAnimator.cancel();
                break;
            case 3:
                com.yandex.plus.home.feature.panel.internal.f fVar = (com.yandex.plus.home.feature.panel.internal.f) this.b;
                com.yandex.plus.core.analytics.logging.d dVar = fVar.h;
                com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
                if (dVar.b(aVar)) {
                    dVar.a(aVar, "PlusPanelViewManagerImpl", "onViewAttachedToWindow() panel view detached", null);
                }
                tf6 tf6Var = fVar.l;
                if (tf6Var != null) {
                    gld.L(tf6Var, null);
                }
                fVar.l = null;
                break;
            case 4:
                ((b6) this.b).C();
                break;
            case 5:
                com.yandex.plus.home.plaque.feature.internal.presentation.b bVar = (com.yandex.plus.home.plaque.feature.internal.presentation.b) this.b;
                com.yandex.plus.log.api.b bVar2 = (com.yandex.plus.log.api.b) bVar.b;
                com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.c;
                if (bVar2.b(aVar2)) {
                    bVar2.c(aVar2, "PlaqueViewControllerImpl", "onViewDetached()");
                }
                tf6 tf6Var2 = (tf6) bVar.e;
                if (tf6Var2 != null) {
                    gld.L(tf6Var2, null);
                }
                bVar.e = null;
                com.yandex.passport.internal.entities.j jVar = (com.yandex.passport.internal.entities.j) bVar.a;
                com.yandex.passport.internal.flags.experiments.p pVar = (com.yandex.passport.internal.flags.experiments.p) jVar.d;
                if (pVar != null) {
                    AtomicReference atomicReference = (AtomicReference) pVar.d;
                    com.yandex.plus.home.benchmark.a aVar3 = com.yandex.plus.home.benchmark.a.b;
                    com.yandex.plus.home.benchmark.a aVar4 = com.yandex.plus.home.benchmark.a.d;
                    while (true) {
                        if (atomicReference.compareAndSet(aVar3, aVar4)) {
                            ((com.yandex.plus.core.benchmark.l) pVar.b).d();
                        } else if (atomicReference.get() != aVar3) {
                        }
                    }
                }
                jVar.d = null;
                xdr xdrVar = (xdr) jVar.b;
                Boolean bool = Boolean.FALSE;
                xdrVar.getClass();
                xdrVar.m(null, bool);
                break;
            case 6:
                Iterator it = ((HashSet) this.b).iterator();
                while (it.hasNext()) {
                    ((com.yandex.plus.home.plaque.feature.internal.b) it.next()).a(false);
                }
                break;
            default:
                com.yandex.plus.webview.internal.f fVar2 = (com.yandex.plus.webview.internal.f) this.b;
                com.yandex.plus.bdui.plus.analytics.b.d(fVar2.n);
                com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar5 = fVar2.r;
                aVar5.getClass();
                Iterator it2 = ((CopyOnWriteArraySet) aVar5.b).iterator();
                while (it2.hasNext()) {
                    ((com.yandex.plus.webview.api.contract.d) it2.next()).g();
                }
                break;
        }
    }

    public /* synthetic */ r(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
