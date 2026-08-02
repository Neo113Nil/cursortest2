package com.yandex.passport.internal.ui.bouncer.roundabout;

import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.g0;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import defpackage.a4g;
import defpackage.ctm;
import defpackage.dzf;
import defpackage.ezf;
import defpackage.gld;
import defpackage.ldu;
import defpackage.nsa;
import defpackage.rar;
import defpackage.ru2;
import defpackage.sph;
import defpackage.tf6;
import defpackage.vwo;
import defpackage.wdu;
import defpackage.x97;
import defpackage.xal;
import defpackage.xdr;
import defpackage.zne;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.coroutines.Continuation;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class n implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.a;
        int i2 = 7;
        Continuation continuation = null;
        int i3 = 3;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((com.yandex.passport.common.ui.view.j) obj2).removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = wdu.a;
                ldu.c((com.yandex.passport.common.ui.view.j) obj);
                break;
            case 1:
                ((vwo) obj2).removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap2 = wdu.a;
                ldu.c((vwo) obj);
                break;
            case 2:
                ((View) obj2).removeOnAttachStateChangeListener(this);
                ((g0) obj).f.invoke();
                break;
            case 3:
                ((View) obj2).removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap3 = wdu.a;
                ldu.c((View) obj);
                break;
            case 4:
                view.getClass();
                com.yandex.plus.bdui.plus.content.controller.f fVar = (com.yandex.plus.bdui.plus.content.controller.f) obj2;
                fVar.c = x97.y(ezf.D(ctm.i), null, null, new com.yandex.plus.home.api.prefetch.j(fVar, (com.yandex.plus.bdui.plus.checkout.h) obj, continuation, i2), 3);
                break;
            case 5:
                break;
            case 6:
                view.getClass();
                ((com.yandex.plus.home.feature.webviews.internal.container.t) obj2).b.k((com.yandex.plus.home.feature.webviews.internal.container.s) obj);
                break;
            case 7:
                view.getClass();
                com.yandex.plus.home.feature.webviews.internal.container.t tVar = (com.yandex.plus.home.feature.webviews.internal.container.t) obj2;
                tVar.I = gld.e(((kotlinx.coroutines.a) obj).plus(a4g.n()));
                FrameLayout frameLayout = tVar.K;
                if (!frameLayout.isLaidOut() || frameLayout.isLayoutRequested()) {
                    frameLayout.addOnLayoutChangeListener(new com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.minipromo.a(i3, tVar));
                } else if (com.yandex.plus.home.feature.webviews.internal.container.t.c(tVar, frameLayout)) {
                    com.yandex.plus.core.insets.d dVar = new com.yandex.plus.core.insets.d(0);
                    com.yandex.plus.home.feature.webviews.internal.container.r rVar = new com.yandex.plus.home.feature.webviews.internal.container.r(tVar);
                    com.yandex.plus.core.insets.a aVar = new com.yandex.plus.core.insets.a();
                    aVar.b = new LinkedHashSet(2);
                    aVar.d();
                    aVar.c();
                    dVar.b.put(rVar, aVar);
                    dVar.b(frameLayout);
                } else {
                    xdr xdrVar = tVar.J;
                    xdrVar.getClass();
                    xdrVar.m(null, zne.e);
                }
                com.yandex.plus.home.feature.webviews.internal.overlap.g gVar = tVar.t;
                com.yandex.passport.sloth.ui.c cVar = new com.yandex.passport.sloth.ui.c(i2, tVar);
                frameLayout.getClass();
                com.yandex.plus.home.feature.webviews.internal.overlap.e eVar = new com.yandex.plus.home.feature.webviews.internal.overlap.e(nsa.f(gVar.a), gVar.b, gVar.c, frameLayout, cVar);
                eVar.a(com.yandex.plus.home.feature.webviews.internal.overlap.c.a);
                gVar.d.put(frameLayout, eVar);
                View view2 = tVar.L;
                View findViewById = view2.findViewById(R.id.plus_sdk_btn_debug_panel);
                findViewById.getClass();
                r1.E(findViewById, new xal(28, tVar));
                if (tVar.y != com.yandex.plus.core.config.a.a) {
                    tf6 tf6Var = tVar.I;
                    if (tf6Var != null) {
                        x97.y(tf6Var, null, null, new com.yandex.passport.internal.ui.social.i(tVar, continuation, 16), 3);
                        break;
                    }
                } else {
                    view2.setVisibility(0);
                    frameLayout.addView(view2);
                    break;
                }
                break;
            default:
                view.getClass();
                ((com.yandex.plus.webview.internal.insets.b) obj2).a().getViewTreeObserver().addOnGlobalLayoutListener((sph) obj);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
            case 3:
                break;
            case 4:
                view.getClass();
                com.yandex.plus.bdui.plus.content.controller.f fVar = (com.yandex.plus.bdui.plus.content.controller.f) this.b;
                rar rarVar = (rar) fVar.c;
                if (rarVar != null) {
                    rarVar.g(null);
                }
                fVar.c = null;
                break;
            case 5:
                ((View) this.b).removeOnAttachStateChangeListener(this);
                com.yandex.plus.bdui.flex.ui.s sVar = (com.yandex.plus.bdui.flex.ui.s) this.c;
                com.yandex.plus.bdui.flex.ui.s.d(sVar, view);
                com.yandex.plus.bdui.flex.ui.s.b(sVar, view);
                ((SparseArray) sVar.g).remove(view.getId());
                break;
            case 6:
                view.getClass();
                com.yandex.passport.internal.entities.j jVar = ((com.yandex.plus.home.feature.webviews.internal.container.t) this.b).b;
                com.yandex.plus.home.feature.webviews.internal.container.s sVar2 = (com.yandex.plus.home.feature.webviews.internal.container.s) this.c;
                jVar.getClass();
                Set set = (Set) jVar.b;
                set.remove(sVar2);
                if (set.isEmpty()) {
                    ((dzf) jVar.d).getLifecycle().d((ru2) jVar.e);
                    break;
                }
                break;
            case 7:
                view.getClass();
                com.yandex.plus.home.feature.webviews.internal.container.t tVar = (com.yandex.plus.home.feature.webviews.internal.container.t) this.b;
                com.yandex.plus.home.feature.webviews.internal.overlap.g gVar = tVar.t;
                FrameLayout frameLayout = tVar.K;
                frameLayout.getClass();
                com.yandex.plus.home.feature.webviews.internal.overlap.e eVar = (com.yandex.plus.home.feature.webviews.internal.overlap.e) gVar.d.remove(frameLayout);
                if (eVar != null) {
                    eVar.f = true;
                }
                tf6 tf6Var = ((com.yandex.plus.home.feature.webviews.internal.container.t) this.b).I;
                if (tf6Var != null) {
                    gld.L(tf6Var, null);
                }
                ((com.yandex.plus.home.feature.webviews.internal.container.t) this.b).I = null;
                break;
            default:
                view.getClass();
                ((com.yandex.plus.webview.internal.insets.b) this.b).a().getViewTreeObserver().removeOnGlobalLayoutListener((sph) this.c);
                break;
        }
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }

    private final void e(View view) {
    }

    private final void f(View view) {
    }

    private final void g(View view) {
    }
}
