package ru.yandex.taxi.logistics.care.impl.router;

import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.qu;
import defpackage.tje;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class e {
    public final /* synthetic */ f a;
    public final /* synthetic */ boolean b;

    public e(f fVar, boolean z) {
        this.a = fVar;
        this.b = z;
    }

    public final void a() {
        this.a.r(new qu(9));
    }

    public final void b(PermissionRequest permissionRequest) {
        if (permissionRequest != null) {
            f fVar = this.a;
            fVar.V = tje.N(fVar.O, null, null, new DeliveryCareRouterImpl$handlePermissionRequest$1$1(permissionRequest, fVar, null), 3);
        }
    }

    public final void c(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        f fVar = this.a;
        pzt0 pzt0Var = fVar.W;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        ru.yandex.taxi.fragment.common.c cVar = new ru.yandex.taxi.fragment.common.c();
        if (webView == null || valueCallback == null || fileChooserParams == null) {
            return;
        }
        fVar.W = tje.N(fVar.O, null, null, new DeliveryCareRouterImpl$handleShowFleChooser$1(cVar, webView, fVar, fileChooserParams, valueCallback, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, Continuation continuation) {
        DeliveryCareRouterImpl$provideModalView$3$onUnauthorized$1 deliveryCareRouterImpl$provideModalView$3$onUnauthorized$1;
        int i;
        if (continuation instanceof DeliveryCareRouterImpl$provideModalView$3$onUnauthorized$1) {
            deliveryCareRouterImpl$provideModalView$3$onUnauthorized$1 = (DeliveryCareRouterImpl$provideModalView$3$onUnauthorized$1) continuation;
            int i2 = deliveryCareRouterImpl$provideModalView$3$onUnauthorized$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryCareRouterImpl$provideModalView$3$onUnauthorized$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deliveryCareRouterImpl$provideModalView$3$onUnauthorized$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryCareRouterImpl$provideModalView$3$onUnauthorized$1.label;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                kotlin.b.b(obj);
                if (!this.b) {
                    return zy11.a;
                }
                ru.yandex.taxi.logistics.care.impl.auth.a aVar = this.a.H;
                deliveryCareRouterImpl$provideModalView$3$onUnauthorized$1.L$0 = null;
                deliveryCareRouterImpl$provideModalView$3$onUnauthorized$1.label = 1;
                Object c = aVar.c(str, deliveryCareRouterImpl$provideModalView$3$onUnauthorized$1);
                return c == coroutineSingletons ? coroutineSingletons : c;
            }
        }
        deliveryCareRouterImpl$provideModalView$3$onUnauthorized$1 = new DeliveryCareRouterImpl$provideModalView$3$onUnauthorized$1(this, (ContinuationImpl) continuation);
        Object obj2 = deliveryCareRouterImpl$provideModalView$3$onUnauthorized$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryCareRouterImpl$provideModalView$3$onUnauthorized$1.label;
        if (i == 0) {
        }
    }
}
