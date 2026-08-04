package com.gamericefishpro.space.l7;

import android.content.Context;
import android.os.Message;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.d0.w;
import com.gamericefishpro.space.f1.u;
import com.gamericefishpro.space.t0.i;
import com.gamericefishpro.space.t0.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ com.gamericefishpro.space.oh.d y;
    public final /* synthetic */ com.gamericefishpro.space.oh.d z;

    public /* synthetic */ a(com.gamericefishpro.space.x7.f fVar, Context context, u uVar, FrameLayout frameLayout, com.gamericefishpro.space.v7.c cVar, w wVar, com.gamericefishpro.space.e.e eVar) {
        this.e = fVar;
        this.i = context;
        this.v = uVar;
        this.w = frameLayout;
        this.y = cVar;
        this.z = wVar;
        this.A = eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Integer) obj2).getClass();
                c.a((Function0) this.e, (Function0) this.i, (Function0) this.v, (Function0) this.w, (Function0) this.y, (Function0) this.z, (e) this.A, (r) obj, i.D(1));
                return Unit.a;
            default:
                com.gamericefishpro.space.x7.f fVar = (com.gamericefishpro.space.x7.f) this.e;
                Context context = (Context) this.i;
                u uVar = (u) this.v;
                FrameLayout frameLayout = (FrameLayout) this.w;
                com.gamericefishpro.space.v7.c cVar = (com.gamericefishpro.space.v7.c) this.y;
                w wVar = (w) this.z;
                com.gamericefishpro.space.e.e eVar = (com.gamericefishpro.space.e.e) this.A;
                Message message = (Message) obj2;
                Intrinsics.checkNotNullParameter((WebView) obj, "<unused var>");
                WebView webViewA = fVar.a(context, uVar, frameLayout, cVar, wVar, eVar);
                Object obj3 = message != null ? message.obj : null;
                WebView.WebViewTransport webViewTransport = obj3 instanceof WebView.WebViewTransport ? (WebView.WebViewTransport) obj3 : null;
                if (webViewTransport != null) {
                    webViewTransport.setWebView(webViewA);
                }
                if (message != null) {
                    message.sendToTarget();
                }
                return Boolean.TRUE;
        }
    }

    public /* synthetic */ a(Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4, Function0 function5, e eVar, int i) {
        this.e = function0;
        this.i = function1;
        this.v = function2;
        this.w = function3;
        this.y = function4;
        this.z = function5;
        this.A = eVar;
    }
}
