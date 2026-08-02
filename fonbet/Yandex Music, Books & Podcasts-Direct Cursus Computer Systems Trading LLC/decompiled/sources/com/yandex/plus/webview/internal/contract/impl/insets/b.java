package com.yandex.plus.webview.internal.contract.impl.insets;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.Window;
import android.webkit.WebView;
import com.yandex.passport.internal.ui.bouncer.roundabout.n;
import com.yandex.plus.core.analytics.logging.e;
import com.yandex.plus.core.insets.d;
import com.yandex.plus.core.insets.g;
import com.yandex.plus.core.insets.j;
import com.yandex.plus.webview.api.WebViewContainer;
import com.yandex.plus.webview.internal.f;
import com.yandex.plus.webview.internal.insets.c;
import defpackage.cg6;
import defpackage.f96;
import defpackage.jyr;
import defpackage.mxr;
import defpackage.nm6;
import defpackage.q5b;
import defpackage.qgg;
import defpackage.sph;
import defpackage.tyf;
import defpackage.xdr;
import defpackage.xq0;
import defpackage.xz0;
import defpackage.zne;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class b extends com.yandex.plus.webview.api.contract.b implements c {
    public final /* synthetic */ com.yandex.plus.webview.internal.contract.insets.a b = new com.yandex.plus.webview.internal.contract.insets.a();
    public final com.yandex.plus.webview.api.insets.c c;
    public final Resources d;

    public b(Context context, com.yandex.plus.webview.api.insets.c cVar) {
        this.c = cVar;
        this.d = context.getResources();
    }

    @Override // com.yandex.plus.webview.api.contract.b, com.yandex.plus.webview.api.contract.d
    public final Object l(mxr mxrVar) {
        return x(mxrVar);
    }

    @Override // com.yandex.plus.webview.internal.insets.c
    public final void m(com.yandex.plus.webview.internal.insets.b bVar) {
        this.b.a = new WeakReference(bVar);
    }

    @Override // com.yandex.plus.webview.api.contract.b, com.yandex.plus.webview.api.contract.d
    public final void t(f fVar, com.yandex.passport.legacy.lx.f fVar2) {
        Window window;
        super.t(fVar, fVar2);
        WeakReference weakReference = this.b.a;
        final com.yandex.plus.webview.internal.insets.b bVar = weakReference != null ? (com.yandex.plus.webview.internal.insets.b) weakReference.get() : null;
        if (bVar != null) {
            WebViewContainer webViewContainer = bVar.a;
            com.yandex.plus.webview.api.insets.c cVar = this.c;
            com.yandex.plus.webview.api.insets.a aVar = cVar.a;
            com.yandex.plus.webview.api.insets.a aVar2 = cVar.b;
            com.yandex.plus.webview.api.insets.a aVar3 = com.yandex.plus.webview.api.insets.a.a;
            if (aVar != aVar3 || aVar2 != aVar3) {
                d dVar = new d(0);
                j jVar = j.b;
                com.yandex.plus.core.insets.a aVar4 = new com.yandex.plus.core.insets.a();
                aVar4.b = new LinkedHashSet(2);
                com.yandex.plus.webview.api.insets.a aVar5 = com.yandex.plus.webview.api.insets.a.c;
                if (aVar == aVar5) {
                    aVar4.d();
                }
                if (aVar2 == aVar5) {
                    aVar4.c();
                }
                LinkedHashMap linkedHashMap = dVar.b;
                linkedHashMap.put(jVar, aVar4);
                final int i = 0;
                g gVar = new g() { // from class: com.yandex.plus.webview.internal.insets.a
                    @Override // com.yandex.plus.core.insets.g
                    public final void b(zne zneVar) {
                        int i2;
                        switch (i) {
                            case 0:
                                zneVar.getClass();
                                xdr xdrVar = bVar.c;
                                xdrVar.getClass();
                                xdrVar.m(null, zneVar);
                                break;
                            default:
                                zneVar.getClass();
                                int i3 = zneVar.d;
                                f96 f96Var = new f96();
                                WebViewContainer webViewContainer2 = bVar.a;
                                f96Var.f(webViewContainer2);
                                if (i3 > 0) {
                                    webViewContainer2.getWebView().scrollTo(webViewContainer2.getWebView().getScrollX(), webViewContainer2.getWebView().getContentHeight());
                                    int[] iArr = new int[2];
                                    webViewContainer2.getLocationOnScreen(iArr);
                                    int height = webViewContainer2.getHeight() + iArr[1];
                                    Context context = webViewContainer2.getContext();
                                    context.getClass();
                                    i2 = i3 - (com.yandex.plus.home.common.utils.a.f(context).y - height);
                                } else {
                                    i2 = 0;
                                }
                                f96Var.h(webViewContainer2.getWebView().getId(), 4, 0, 4, i2);
                                f96Var.b(webViewContainer2);
                                break;
                        }
                    }
                };
                com.yandex.plus.core.insets.a aVar6 = new com.yandex.plus.core.insets.a();
                aVar6.b = new LinkedHashSet(2);
                com.yandex.plus.webview.api.insets.a aVar7 = com.yandex.plus.webview.api.insets.a.b;
                if (aVar == aVar7) {
                    aVar6.d();
                }
                if (aVar2 == aVar7) {
                    aVar6.c();
                }
                linkedHashMap.put(gVar, aVar6);
                dVar.b(webViewContainer);
            }
            if (cVar.c) {
                if (Build.VERSION.SDK_INT <= 29) {
                    Context context = webViewContainer.getWebView().getContext();
                    Activity activity = context instanceof Activity ? (Activity) context : null;
                    if (activity != null && (window = activity.getWindow()) != null) {
                        window.setSoftInputMode(16);
                    }
                }
                WebView webView = webViewContainer.getWebView();
                final int i2 = 1;
                g gVar2 = new g() { // from class: com.yandex.plus.webview.internal.insets.a
                    @Override // com.yandex.plus.core.insets.g
                    public final void b(zne zneVar) {
                        int i22;
                        switch (i2) {
                            case 0:
                                zneVar.getClass();
                                xdr xdrVar = bVar.c;
                                xdrVar.getClass();
                                xdrVar.m(null, zneVar);
                                break;
                            default:
                                zneVar.getClass();
                                int i3 = zneVar.d;
                                f96 f96Var = new f96();
                                WebViewContainer webViewContainer2 = bVar.a;
                                f96Var.f(webViewContainer2);
                                if (i3 > 0) {
                                    webViewContainer2.getWebView().scrollTo(webViewContainer2.getWebView().getScrollX(), webViewContainer2.getWebView().getContentHeight());
                                    int[] iArr = new int[2];
                                    webViewContainer2.getLocationOnScreen(iArr);
                                    int height = webViewContainer2.getHeight() + iArr[1];
                                    Context context2 = webViewContainer2.getContext();
                                    context2.getClass();
                                    i22 = i3 - (com.yandex.plus.home.common.utils.a.f(context2).y - height);
                                } else {
                                    i22 = 0;
                                }
                                f96Var.h(webViewContainer2.getWebView().getId(), 4, 0, 4, i22);
                                f96Var.b(webViewContainer2);
                                break;
                        }
                    }
                };
                webView.getClass();
                d dVar2 = new d(0);
                com.yandex.plus.core.insets.a aVar8 = new com.yandex.plus.core.insets.a();
                aVar8.b = new LinkedHashSet(2);
                aVar8.b();
                dVar2.b.put(gVar2, aVar8);
                dVar2.b(webView);
            }
            com.yandex.plus.webview.api.insets.b bVar2 = com.yandex.plus.webview.api.insets.b.a;
            if (bVar2.equals(bVar2)) {
                return;
            }
            sph sphVar = new sph(bVar);
            if (bVar.a().isAttachedToWindow()) {
                bVar.a().getViewTreeObserver().addOnGlobalLayoutListener(sphVar);
            }
            bVar.a().addOnAttachStateChangeListener(new n(8, bVar, sphVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r10v23, types: [java.util.Set] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x(cg6 cg6Var) {
        a aVar;
        int i;
        Continuation continuation;
        zne zneVar;
        if (cg6Var instanceof a) {
            aVar = (a) cg6Var;
            int i2 = aVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.l = i2 - Integer.MIN_VALUE;
                Object obj = aVar.j;
                nm6 nm6Var = nm6.a;
                i = aVar.l;
                continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.plus.webview.api.insets.c cVar = this.c;
                    com.yandex.plus.webview.api.insets.a aVar2 = cVar.a;
                    com.yandex.plus.webview.api.insets.a aVar3 = com.yandex.plus.webview.api.insets.a.b;
                    boolean z = (aVar2 == aVar3) || (cVar.b == aVar3);
                    WeakReference weakReference = this.b.a;
                    if ((weakReference != null ? (com.yandex.plus.webview.internal.insets.b) weakReference.get() : null) != null && z) {
                        com.yandex.plus.pay.ui.core.debug.internal.ui.form.b bVar = new com.yandex.plus.pay.ui.core.debug.internal.ui.form.b(this, continuation, 12);
                        aVar.l = 1;
                        obj = tyf.L(300L, bVar, aVar);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                    }
                    return continuation != null ? q5b.a : continuation;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                zneVar = (zne) obj;
                if (zneVar != null) {
                    Resources resources = this.d;
                    resources.getClass();
                    ?? Y = xz0.Y(new com.yandex.plus.webview.api.contract.f[]{new com.yandex.plus.webview.api.contract.f(8, new Integer(com.yandex.plus.home.common.utils.a.k(resources, zneVar.a)), "sal", true), new com.yandex.plus.webview.api.contract.f(8, new Integer(com.yandex.plus.home.common.utils.a.k(resources, zneVar.c)), "sar", true), new com.yandex.plus.webview.api.contract.f(8, new Integer(com.yandex.plus.home.common.utils.a.k(resources, zneVar.b)), "sat", true), new com.yandex.plus.webview.api.contract.f(8, new Integer(com.yandex.plus.home.common.utils.a.k(resources, zneVar.d)), "sab", true)});
                    if (Y != 0) {
                        continuation = Y;
                        if (continuation != null) {
                        }
                    }
                }
                com.yandex.plus.core.analytics.logging.b bVar2 = com.yandex.plus.core.analytics.logging.b.b;
                jyr jyrVar = e.a;
                e.e(com.yandex.plus.core.analytics.logging.a.d, bVar2, "Wait for WebView insets timeout", null);
                if (continuation != null) {
                }
            }
        }
        aVar = new a(this, cg6Var);
        Object obj2 = aVar.j;
        nm6 nm6Var2 = nm6.a;
        i = aVar.l;
        continuation = null;
        if (i != 0) {
        }
        zneVar = (zne) obj2;
        if (zneVar != null) {
        }
        com.yandex.plus.core.analytics.logging.b bVar22 = com.yandex.plus.core.analytics.logging.b.b;
        jyr jyrVar2 = e.a;
        e.e(com.yandex.plus.core.analytics.logging.a.d, bVar22, "Wait for WebView insets timeout", null);
        if (continuation != null) {
        }
    }
}
