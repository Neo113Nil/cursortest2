package com.yandex.passport.internal.ui.sloth.webcard;

import android.net.Uri;
import android.os.Bundle;
import com.yandex.passport.api.y1;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import defpackage.gq5;
import defpackage.hq5;
import defpackage.ild;
import defpackage.kjn;
import defpackage.oq5;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;
    public final /* synthetic */ WebCardComposeActivity c;

    public /* synthetic */ c(f fVar, WebCardComposeActivity webCardComposeActivity, int i) {
        this.a = i;
        switch (i) {
            case 1:
                break;
            default:
                com.yandex.passport.common.ui.a aVar = com.yandex.passport.common.ui.a.a;
                break;
        }
        this.b = fVar;
        this.c = webCardComposeActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        final int i2 = 1;
        final WebCardComposeActivity webCardComposeActivity = this.c;
        switch (i) {
            case 0:
                com.yandex.passport.common.ui.a aVar = com.yandex.passport.common.ui.a.c;
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                int i3 = WebCardComposeActivity.a;
                if ((intValue & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                boolean z = com.yandex.plus.pay.ui.core.b.z(aVar, hq5Var);
                f fVar = this.b;
                com.yandex.passport.common.ui.compose.theme.d.a(z, fVar.isWhiteLabel(), ild.C(-2070297799, new c(fVar, webCardComposeActivity, i2), hq5Var), hq5Var, 384, 0);
            default:
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i4 = WebCardComposeActivity.a;
                if ((intValue2 & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                oq5 oq5Var3 = (oq5) hq5Var2;
                boolean h = oq5Var3.h(webCardComposeActivity);
                Object K = oq5Var3.K();
                kjn kjnVar = gq5.a;
                if (h || K == kjnVar) {
                    K = new com.yandex.passport.internal.ui.sloth.authsdk.h0(10, webCardComposeActivity);
                    oq5Var3.k0(K);
                }
                Function0 function0 = (Function0) K;
                boolean h2 = oq5Var3.h(webCardComposeActivity);
                Object K2 = oq5Var3.K();
                if (h2 || K2 == kjnVar) {
                    final int i5 = 0;
                    K2 = new Function1() { // from class: com.yandex.passport.internal.ui.sloth.webcard.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            int i6 = i5;
                            WebCardComposeActivity webCardComposeActivity2 = webCardComposeActivity;
                            switch (i6) {
                                case 0:
                                    s0 s0Var = (s0) obj3;
                                    int i7 = WebCardComposeActivity.a;
                                    s0Var.getClass();
                                    com.yandex.passport.internal.ui.a.r(webCardComposeActivity2, com.yandex.plus.core.locale.b.w(s0Var));
                                    break;
                                default:
                                    com.yandex.passport.internal.ui.d dVar = (com.yandex.passport.internal.ui.d) obj3;
                                    int i8 = WebCardComposeActivity.a;
                                    dVar.getClass();
                                    int i9 = WebViewActivity.h;
                                    com.yandex.passport.api.impl.b P = com.yandex.plus.core.network.api.utils.a.P(dVar.c);
                                    y1 y1Var = y1.a;
                                    com.yandex.passport.internal.ui.webview.webcases.a0 a0Var = com.yandex.passport.internal.ui.webview.webcases.a0.CHANGE_PASSWORD;
                                    String str = dVar.a;
                                    Uri uri = dVar.b;
                                    str.getClass();
                                    uri.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putString("url", str);
                                    bundle.putParcelable("return_url", uri);
                                    webCardComposeActivity2.startActivity(com.yandex.passport.data.network.token.i.e(P, webCardComposeActivity2, y1Var, a0Var, bundle));
                                    webCardComposeActivity2.finish();
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    oq5Var3.k0(K2);
                }
                Function1 function1 = (Function1) K2;
                boolean h3 = oq5Var3.h(webCardComposeActivity);
                Object K3 = oq5Var3.K();
                if (h3 || K3 == kjnVar) {
                    K3 = new Function1() { // from class: com.yandex.passport.internal.ui.sloth.webcard.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            int i6 = i2;
                            WebCardComposeActivity webCardComposeActivity2 = webCardComposeActivity;
                            switch (i6) {
                                case 0:
                                    s0 s0Var = (s0) obj3;
                                    int i7 = WebCardComposeActivity.a;
                                    s0Var.getClass();
                                    com.yandex.passport.internal.ui.a.r(webCardComposeActivity2, com.yandex.plus.core.locale.b.w(s0Var));
                                    break;
                                default:
                                    com.yandex.passport.internal.ui.d dVar = (com.yandex.passport.internal.ui.d) obj3;
                                    int i8 = WebCardComposeActivity.a;
                                    dVar.getClass();
                                    int i9 = WebViewActivity.h;
                                    com.yandex.passport.api.impl.b P = com.yandex.plus.core.network.api.utils.a.P(dVar.c);
                                    y1 y1Var = y1.a;
                                    com.yandex.passport.internal.ui.webview.webcases.a0 a0Var = com.yandex.passport.internal.ui.webview.webcases.a0.CHANGE_PASSWORD;
                                    String str = dVar.a;
                                    Uri uri = dVar.b;
                                    str.getClass();
                                    uri.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putString("url", str);
                                    bundle.putParcelable("return_url", uri);
                                    webCardComposeActivity2.startActivity(com.yandex.passport.data.network.token.i.e(P, webCardComposeActivity2, y1Var, a0Var, bundle));
                                    webCardComposeActivity2.finish();
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    oq5Var3.k0(K3);
                }
                j.b(this.b, function0, function1, (Function1) K3, oq5Var3, 0);
        }
        return Unit.a;
    }
}
