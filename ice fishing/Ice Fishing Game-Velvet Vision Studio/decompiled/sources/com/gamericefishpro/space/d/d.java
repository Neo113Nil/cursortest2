package com.gamericefishpro.space.d;

import android.webkit.CookieManager;
import android.webkit.WebView;
import android.window.OnBackInvokedDispatcher;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.f1.a0;
import com.gamericefishpro.space.z4.u;
import java.util.ListIterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements com.gamericefishpro.space.z4.s {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object i;

    public /* synthetic */ d(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.i = obj2;
    }

    @Override // com.gamericefishpro.space.z4.s
    public final void j(u uVar, com.gamericefishpro.space.z4.o event) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                r rVar = (r) this.e;
                k kVar = (k) this.i;
                Intrinsics.checkNotNullParameter(uVar, "<unused var>");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == com.gamericefishpro.space.z4.o.ON_CREATE) {
                    OnBackInvokedDispatcher onBackInvokedDispatcher = kVar.getOnBackInvokedDispatcher();
                    Intrinsics.checkNotNullExpressionValue(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
                    rVar.b(onBackInvokedDispatcher);
                }
                break;
            default:
                com.gamericefishpro.space.x7.c cVar = (com.gamericefishpro.space.x7.c) this.e;
                com.gamericefishpro.space.f1.u uVar2 = (com.gamericefishpro.space.f1.u) this.i;
                Intrinsics.checkNotNullParameter(uVar, "<unused var>");
                Intrinsics.checkNotNullParameter(event, "event");
                int i = com.gamericefishpro.space.v7.f.a[event.ordinal()];
                if (i == 1) {
                    cVar.getClass();
                    CookieManager.getInstance().flush();
                    WebView webView = (WebView) CollectionsKt.C(uVar2);
                    if (webView != null) {
                        webView.onResume();
                    }
                    break;
                } else if (i == 2) {
                    cVar.getClass();
                    CookieManager.getInstance().flush();
                    WebView webView2 = (WebView) CollectionsKt.C(uVar2);
                    if (webView2 != null) {
                        webView2.onPause();
                    }
                    break;
                } else if (i == 3) {
                    ListIterator listIterator = uVar2.listIterator();
                    while (true) {
                        a0 a0Var = (a0) listIterator;
                        if (!a0Var.hasNext()) {
                            uVar2.clear();
                        } else {
                            ((WebView) a0Var.next()).destroy();
                        }
                        break;
                    }
                }
                break;
        }
    }
}
