package com.yandex.plus.bdui.plus.content.controller;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.yandex.plus.bdui.flex.ui.t;
import com.yandex.plus.bdui.s;
import com.yandex.plus.webview.api.WebViewContainer;
import defpackage.btf;
import defpackage.cg6;
import defpackage.dzf;
import defpackage.ern;
import defpackage.hrg;
import defpackage.jyr;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.tf6;
import defpackage.ujd;
import defpackage.v75;
import defpackage.xq0;
import defpackage.yn7;
import defpackage.z75;
import defpackage.z7o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class q implements com.yandex.plus.bdui.ui.a, yn7 {
    public final s a;
    public final com.yandex.plus.bdui.m b;
    public final com.yandex.plus.bdui.flex.ui.s c;
    public final f d;
    public final com.yandex.plus.bdui.flex.factory.h e;
    public final com.yandex.passport.internal.ui.challenge.vpn.c f;
    public final dzf g;
    public final tf6 h;
    public final com.yandex.plus.log.api.b i;
    public final jyr j;
    public FrameLayout k;
    public com.yandex.plus.webview.core.d l;
    public View m;
    public boolean n;

    public q(s sVar, com.yandex.plus.bdui.m mVar, com.yandex.plus.bdui.flex.ui.s sVar2, f fVar, com.yandex.plus.bdui.flex.factory.h hVar, com.yandex.passport.internal.ui.challenge.vpn.c cVar, dzf dzfVar, tf6 tf6Var, com.yandex.plus.log.api.b bVar) {
        sVar.getClass();
        mVar.getClass();
        dzfVar.getClass();
        bVar.getClass();
        this.a = sVar;
        this.b = mVar;
        this.c = sVar2;
        this.d = fVar;
        this.e = hVar;
        this.f = cVar;
        this.g = dzfVar;
        this.h = tf6Var;
        this.i = bVar;
        this.j = btf.b(new com.yandex.plus.bdui.plus.checkout.h(3, this));
    }

    @Override // com.yandex.plus.bdui.ui.c
    public final void a(View view) {
        view.getClass();
        this.g.getLifecycle().d(this);
        FrameLayout frameLayout = this.k;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.l = null;
        View view2 = this.m;
        if (view2 != null) {
            ((com.yandex.plus.bdui.ui.a) this.j.getValue()).a(view2);
        }
        this.m = null;
        this.k = null;
    }

    @Override // com.yandex.plus.bdui.ui.c
    public final View b(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.l = null;
        View view = this.m;
        if (view != null) {
            ((com.yandex.plus.bdui.ui.a) this.j.getValue()).a(view);
        }
        this.m = null;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.k = frameLayout;
        this.g.getLifecycle().a(this);
        return frameLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.plus.bdui.ui.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(com.yandex.plus.bdui.content.d dVar, t tVar, Continuation continuation) {
        p pVar;
        int i;
        if (continuation instanceof p) {
            pVar = (p) continuation;
            int i2 = pVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pVar.l = i2 - Integer.MIN_VALUE;
                Object obj = pVar.j;
                Object obj2 = nm6.a;
                i = pVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    if (!dVar.d) {
                        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
                        com.yandex.plus.log.api.b bVar = this.i;
                        if (bVar.b(aVar)) {
                            bVar.c(aVar, "PlusWebContentController", "onUpdateStateAsync()");
                        }
                        FrameLayout frameLayout = this.k;
                        if (frameLayout != null) {
                            frameLayout.removeAllViews();
                            View view = this.m;
                            if (view != null) {
                                ((com.yandex.plus.bdui.ui.a) this.j.getValue()).a(view);
                            }
                            this.m = null;
                            com.yandex.plus.bdui.action.h hVar = new com.yandex.plus.bdui.action.h(dVar.c);
                            pVar.l = 1;
                            if (d(hVar, dVar, tVar, pVar) == obj2) {
                                return obj2;
                            }
                        } else {
                            com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.d;
                            if (bVar.b(aVar2)) {
                                bVar.c(aVar2, "PlusWebContentController", "onUpdateStateAsync(); parent view not found!");
                            }
                        }
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            }
        }
        pVar = new p(this, continuation);
        Object obj3 = pVar.j;
        Object obj22 = nm6.a;
        i = pVar.l;
        if (i != 0) {
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(com.yandex.plus.bdui.action.h hVar, com.yandex.plus.bdui.content.d dVar, t tVar, cg6 cg6Var) {
        n nVar;
        int i;
        z7o z7oVar;
        q qVar;
        Object e;
        if (cg6Var instanceof n) {
            nVar = (n) cg6Var;
            int i2 = nVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.l = i2 - Integer.MIN_VALUE;
                n nVar2 = nVar;
                Object obj = nVar2.j;
                nm6 nm6Var = nm6.a;
                i = nVar2.l;
                z7oVar = null;
                if (i != 0) {
                    qgg.h0(obj);
                    FrameLayout frameLayout = this.k;
                    if (frameLayout == null) {
                        qVar = this;
                        if (z7oVar != null) {
                            Object obj2 = z7oVar.a;
                            if (!(obj2 instanceof t7o)) {
                                Pair pair = (Pair) obj2;
                                WebViewContainer webViewContainer = (WebViewContainer) pair.a;
                                com.yandex.plus.webview.core.d dVar2 = (com.yandex.plus.webview.core.d) pair.b;
                                FrameLayout frameLayout2 = qVar.k;
                                if (frameLayout2 != null) {
                                    qVar.l = dVar2;
                                    frameLayout2.addView(webViewContainer, new FrameLayout.LayoutParams(-1, -1));
                                    if (qVar.n) {
                                        dVar2.onResume();
                                        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
                                        com.yandex.plus.log.api.b bVar = qVar.i;
                                        if (bVar.b(aVar)) {
                                            bVar.c(aVar, "PlusWebContentController", "WebView.onResume()");
                                        }
                                    }
                                }
                            }
                            r7o r7oVar = z7o.b;
                        }
                        return Unit.a;
                    }
                    nVar2.l = 1;
                    qVar = this;
                    e = qVar.e(frameLayout, hVar, dVar, tVar, nVar2);
                    if (e == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    e = ((z7o) obj).a;
                    qVar = this;
                }
                z7oVar = new z7o(e);
                if (z7oVar != null) {
                }
                return Unit.a;
            }
        }
        nVar = new n(this, cg6Var);
        n nVar22 = nVar;
        Object obj3 = nVar22.j;
        nm6 nm6Var2 = nm6.a;
        i = nVar22.l;
        z7oVar = null;
        if (i != 0) {
        }
        z7oVar = new z7o(e);
        if (z7oVar != null) {
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(FrameLayout frameLayout, com.yandex.plus.bdui.action.h hVar, com.yandex.plus.bdui.content.d dVar, t tVar, cg6 cg6Var) {
        o oVar;
        int i;
        Iterator it;
        if (cg6Var instanceof o) {
            oVar = (o) cg6Var;
            int i2 = oVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oVar.l = i2 - Integer.MIN_VALUE;
                o oVar2 = oVar;
                Object obj = oVar2.j;
                nm6 nm6Var = nm6.a;
                i = oVar2.l;
                if (i == 0) {
                    if (i == 1) {
                        qgg.h0(obj);
                        return ((z7o) obj).a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                Context context = frameLayout.getContext();
                com.yandex.plus.bdui.content.a aVar = dVar.b;
                com.yandex.plus.bdui.plus.webview.q qVar = new com.yandex.plus.bdui.plus.webview.q(this.b, (com.yandex.plus.bdui.plus.content.r) aVar, hVar, frameLayout);
                com.yandex.plus.bdui.plus.content.r rVar = (com.yandex.plus.bdui.plus.content.r) aVar;
                List list = rVar.d;
                ArrayList arrayList = new ArrayList();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    String str = (String) it2.next();
                    str.getClass();
                    f fVar = this.d;
                    com.yandex.plus.bdui.plus.webview.c cVar = (com.yandex.plus.bdui.plus.webview.c) fVar.c.get(str);
                    com.yandex.plus.log.api.b bVar = (com.yandex.plus.log.api.b) fVar.b;
                    if (cVar != null) {
                        com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.c;
                        it = it2;
                        if (bVar.b(aVar2)) {
                            bVar.c(aVar2, "DefaultWebViewBridgeProvider", hrg.q("getBridge(); web bridge with name \"", str, "\" found"));
                        }
                    } else {
                        it = it2;
                        com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.d;
                        if (bVar.b(aVar3)) {
                            bVar.c(aVar3, "DefaultWebViewBridgeProvider", hrg.q("getBridge(); web bridge with name \"", str, "\" not found!"));
                        }
                    }
                    if (cVar != null) {
                        arrayList.add(cVar);
                    }
                    it2 = it;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    com.yandex.plus.bdui.plus.webview.c cVar2 = (com.yandex.plus.bdui.plus.webview.c) it3.next();
                    cVar2.getClass();
                    Set set = cVar2.a;
                    ArrayList arrayList3 = new ArrayList(v75.o(set, 10));
                    Iterator it4 = set.iterator();
                    while (it4.hasNext()) {
                        arrayList3.add((com.yandex.plus.webview.api.contract.d) ((Function1) it4.next()).invoke(qVar));
                    }
                    z75.t(arrayList2, CollectionsKt.A0(arrayList3));
                }
                Set A0 = CollectionsKt.A0(arrayList2);
                com.yandex.plus.log.api.a aVar4 = com.yandex.plus.log.api.a.c;
                com.yandex.plus.log.api.b bVar2 = this.i;
                if (bVar2.b(aVar4)) {
                    StringBuilder sb = new StringBuilder("loadWebView(); found contracts = ");
                    Set set2 = A0;
                    ArrayList arrayList4 = new ArrayList(v75.o(set2, 10));
                    Iterator it5 = set2.iterator();
                    while (it5.hasNext()) {
                        arrayList4.add(ern.a(((com.yandex.plus.webview.api.contract.d) it5.next()).getClass()).h());
                    }
                    sb.append(arrayList4);
                    sb.append(" from bridges = ");
                    ArrayList arrayList5 = new ArrayList(v75.o(arrayList, 10));
                    Iterator it6 = arrayList.iterator();
                    while (it6.hasNext()) {
                        arrayList5.add(ern.a(((com.yandex.plus.bdui.plus.webview.c) it6.next()).getClass()).h());
                    }
                    sb.append(arrayList5);
                    sb.append("for requested plugins = ");
                    sb.append(rVar.d);
                    bVar2.c(aVar4, "PlusWebContentController", sb.toString());
                }
                ujd ujdVar = new ujd(5, this, q.class, "showFailureView", "showFailureView(Lcom/yandex/plus/bdui/action/DocumentContext;Lcom/yandex/plus/bdui/content/ContentUpdate;Lcom/yandex/plus/bdui/ui/PreviewController;Ljava/lang/String;Ljava/lang/Throwable;)V", 0, 3);
                hVar.getClass();
                dVar.getClass();
                com.yandex.plus.log.api.b bVar3 = this.i;
                bVar3.getClass();
                com.yandex.passport.internal.entities.j jVar = new com.yandex.passport.internal.entities.j();
                jVar.a = hVar;
                jVar.b = dVar;
                jVar.c = tVar;
                jVar.d = ujdVar;
                jVar.e = bVar3;
                context.getClass();
                oVar2.l = 1;
                Object m = this.c.m(context, this.b, hVar, this.a, rVar, A0, jVar, this.h, oVar2);
                return m == nm6Var ? nm6Var : m;
            }
        }
        oVar = new o(this, cg6Var);
        o oVar22 = oVar;
        Object obj2 = oVar22.j;
        nm6 nm6Var2 = nm6.a;
        i = oVar22.l;
        if (i == 0) {
        }
    }

    @Override // defpackage.yn7
    public final void onPause(dzf dzfVar) {
        this.n = false;
        com.yandex.plus.webview.core.d dVar = this.l;
        if (dVar != null) {
            dVar.a();
            com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
            com.yandex.plus.log.api.b bVar = this.i;
            if (bVar.b(aVar)) {
                bVar.c(aVar, "PlusWebContentController", "WebView.onPause()");
            }
        }
    }

    @Override // defpackage.yn7
    public final void onResume(dzf dzfVar) {
        dzfVar.getClass();
        this.n = true;
        com.yandex.plus.webview.core.d dVar = this.l;
        if (dVar != null) {
            dVar.onResume();
            com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
            com.yandex.plus.log.api.b bVar = this.i;
            if (bVar.b(aVar)) {
                bVar.c(aVar, "PlusWebContentController", "WebView.onResume()");
            }
        }
    }
}
