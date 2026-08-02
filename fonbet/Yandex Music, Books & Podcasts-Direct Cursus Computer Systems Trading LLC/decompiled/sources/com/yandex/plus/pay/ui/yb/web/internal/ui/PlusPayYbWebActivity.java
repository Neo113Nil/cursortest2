package com.yandex.plus.pay.ui.yb.web.internal.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ViewGroup;
import com.yandex.plus.core.insets.j;
import com.yandex.plus.home.feature.webviews.internal.stories.m;
import com.yandex.plus.pay.ui.yb.web.internal.ui.g;
import defpackage.b1b;
import defpackage.btf;
import defpackage.dfu;
import defpackage.ern;
import defpackage.f1d;
import defpackage.hq0;
import defpackage.is6;
import defpackage.jyr;
import defpackage.kg5;
import defpackage.laq;
import defpackage.lyf;
import defpackage.nyf;
import defpackage.qpj;
import defpackage.r7o;
import defpackage.s9f;
import defpackage.t7o;
import defpackage.vq1;
import defpackage.wxf;
import defpackage.wyf;
import defpackage.x0q;
import defpackage.xdr;
import defpackage.xq0;
import defpackage.ybf;
import defpackage.yxm;
import defpackage.z7o;
import java.util.Arrays;
import java.util.LinkedHashSet;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class PlusPayYbWebActivity extends hq0 {
    public static final /* synthetic */ s9f[] i = {new yxm(PlusPayYbWebActivity.class, "root", "getRoot()Landroid/view/ViewGroup;", 0), f1d.c(ern.a, PlusPayYbWebActivity.class, "progressView", "getProgressView()Lcom/yandex/plus/pay/ui/common/api/ui/view/ProgressView;", 0), new yxm(PlusPayYbWebActivity.class, "webViewContainer", "getWebViewContainer()Lcom/yandex/plus/webview/api/WebViewContainer;", 0)};
    public boolean a;
    public final jyr b;
    public com.yandex.plus.pay.ui.yb.web.internal.di.c c;
    public final ybf d;
    public boolean e;
    public final com.yandex.plus.bdui.plus.content.controller.f f;
    public final com.yandex.plus.bdui.plus.content.controller.f g;
    public final com.yandex.plus.bdui.plus.content.controller.f h;

    public PlusPayYbWebActivity() {
        super(R.layout.pay_sdk_activity_yb_web);
        final int i2 = 0;
        this.b = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.ui.yb.web.internal.ui.a
            public final /* synthetic */ PlusPayYbWebActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                PlusPayYbWebActivity plusPayYbWebActivity = this.b;
                switch (i3) {
                    case 0:
                        s9f[] s9fVarArr = PlusPayYbWebActivity.i;
                        Intent intent = plusPayYbWebActivity.getIntent();
                        intent.getClass();
                        b bVar = (b) ((Parcelable) vq1.W(intent, "arguments", b.class));
                        if (bVar == null) {
                            xq0.q("PlusPayYbWebActivity must be started using contract");
                            break;
                        } else {
                            break;
                        }
                    default:
                        jyr jyrVar = plusPayYbWebActivity.b;
                        s9f[] s9fVarArr2 = PlusPayYbWebActivity.i;
                        final com.yandex.plus.pay.ui.yb.web.internal.di.c cVar = plusPayYbWebActivity.c;
                        if (cVar == null) {
                            xq0.x("YbWebComponent must be set");
                            break;
                        } else {
                            final String str = ((b) jyrVar.getValue()).a;
                            final long j = ((b) jyrVar.getValue()).b;
                            final long j2 = ((b) jyrVar.getValue()).c;
                            final com.yandex.plus.pay.ui.yb.api.e eVar = ((b) jyrVar.getValue()).d;
                            str.getClass();
                            eVar.getClass();
                            dfu[] dfuVarArr = (dfu[]) Arrays.copyOf(new dfu[]{new dfu(ern.a(g.class), new Function1() { // from class: com.yandex.plus.pay.ui.yb.web.internal.di.b
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    ((is6) obj).getClass();
                                    return new g(str, j, j2, cVar.c, eVar);
                                }
                            })}, 1);
                            break;
                        }
                }
                return null;
            }
        });
        final int i3 = 1;
        this.d = new ybf(ern.a(g.class), new c(this, 0), new Function0(this) { // from class: com.yandex.plus.pay.ui.yb.web.internal.ui.a
            public final /* synthetic */ PlusPayYbWebActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i3;
                PlusPayYbWebActivity plusPayYbWebActivity = this.b;
                switch (i32) {
                    case 0:
                        s9f[] s9fVarArr = PlusPayYbWebActivity.i;
                        Intent intent = plusPayYbWebActivity.getIntent();
                        intent.getClass();
                        b bVar = (b) ((Parcelable) vq1.W(intent, "arguments", b.class));
                        if (bVar == null) {
                            xq0.q("PlusPayYbWebActivity must be started using contract");
                            break;
                        } else {
                            break;
                        }
                    default:
                        jyr jyrVar = plusPayYbWebActivity.b;
                        s9f[] s9fVarArr2 = PlusPayYbWebActivity.i;
                        final com.yandex.plus.pay.ui.yb.web.internal.di.c cVar = plusPayYbWebActivity.c;
                        if (cVar == null) {
                            xq0.x("YbWebComponent must be set");
                            break;
                        } else {
                            final String str = ((b) jyrVar.getValue()).a;
                            final long j = ((b) jyrVar.getValue()).b;
                            final long j2 = ((b) jyrVar.getValue()).c;
                            final com.yandex.plus.pay.ui.yb.api.e eVar = ((b) jyrVar.getValue()).d;
                            str.getClass();
                            eVar.getClass();
                            dfu[] dfuVarArr = (dfu[]) Arrays.copyOf(new dfu[]{new dfu(ern.a(g.class), new Function1() { // from class: com.yandex.plus.pay.ui.yb.web.internal.di.b
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    ((is6) obj).getClass();
                                    return new g(str, j, j2, cVar.c, eVar);
                                }
                            })}, 1);
                            break;
                        }
                }
                return null;
            }
        }, new c(this, 1));
        this.f = new com.yandex.plus.bdui.plus.content.controller.f(new d(this, 0));
        this.g = new com.yandex.plus.bdui.plus.content.controller.f(new d(this, 1));
        this.h = new com.yandex.plus.bdui.plus.content.controller.f(new d(this, 2));
    }

    @Override // android.app.Activity
    public final void finish() {
        if (this.a) {
            setResult(0);
        } else {
            setResult(-1, new Intent().putExtra("arguments", j().n));
        }
        super.finish();
    }

    public final g j() {
        return (g) this.d.getValue();
    }

    @Override // androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object t7oVar;
        try {
            r7o r7oVar = z7o.b;
            t7oVar = (com.yandex.plus.pay.ui.yb.web.internal.di.c) com.yandex.plus.pay.ui.yb.web.internal.di.a.d.q(com.yandex.plus.bdui.plus.analytics.b.u(this));
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Throwable a = z7o.a(t7oVar);
        if (a != null) {
            com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.f;
            String str = "YbWebComponent is not found for " + PlusPayYbWebActivity.class.getName() + '!';
            jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
            com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.e, bVar, str, a);
        }
        Continuation continuation = null;
        if (t7oVar instanceof t7o) {
            t7oVar = null;
        }
        com.yandex.plus.pay.ui.yb.web.internal.di.c cVar = (com.yandex.plus.pay.ui.yb.web.internal.di.c) t7oVar;
        if (cVar == null) {
            com.yandex.plus.core.analytics.logging.b bVar2 = com.yandex.plus.core.analytics.logging.b.f;
            String concat = PlusPayYbWebActivity.class.getName().concat(" is recreated after application death");
            jyr jyrVar2 = com.yandex.plus.core.analytics.logging.e.a;
            com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.c, bVar2, concat, null);
            this.a = true;
            super.onCreate(bundle);
            finish();
            return;
        }
        this.c = cVar;
        b1b.b(this);
        com.yandex.plus.pay.ui.design.api.api.a aVar = cVar.f;
        aVar.getClass();
        setTheme(R.style.PaySDK_Theme_Plus_DayNight);
        getLayoutInflater().setFactory2(new com.yandex.plus.pay.ui.core.mobile.ui.kit.b(aVar));
        super.onCreate(bundle);
        ViewGroup viewGroup = (ViewGroup) this.f.g(i[0]);
        com.yandex.plus.core.insets.d dVar = new com.yandex.plus.core.insets.d(0);
        j jVar = j.c;
        com.yandex.plus.core.insets.a aVar2 = new com.yandex.plus.core.insets.a();
        aVar2.b = new LinkedHashSet(2);
        aVar2.d();
        aVar2.c();
        aVar2.b();
        dVar.b.put(jVar, aVar2);
        dVar.b(viewGroup);
        qpj onBackPressedDispatcher = getOnBackPressedDispatcher();
        onBackPressedDispatcher.getClass();
        wxf.k(onBackPressedDispatcher, this, new m(22, this));
        xdr xdrVar = j().q;
        nyf lifecycle = getLifecycle();
        lifecycle.getClass();
        lyf lyfVar = lyf.d;
        com.yandex.plus.bdui.flex.ui.a.k(kg5.t(xdrVar, lifecycle, lyfVar), wyf.F(getLifecycle()), new laq(this, continuation, 26));
        x0q x0qVar = j().p;
        nyf lifecycle2 = getLifecycle();
        lifecycle2.getClass();
        com.yandex.plus.bdui.flex.ui.a.i(kg5.t(x0qVar, lifecycle2, lyfVar), wyf.F(getLifecycle()), new laq(this, continuation, 27));
    }
}
