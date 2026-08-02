package com.yandex.passport.sloth.ui;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import defpackage.b6e;
import defpackage.rjc;
import defpackage.t7g;
import defpackage.yd5;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class t implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ b0 b;

    public /* synthetic */ t(b0 b0Var, int i) {
        this.a = i;
        this.b = b0Var;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                b0 b0Var = this.b;
                s0 s0Var = b0Var.m;
                b bVar = (b) obj;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "SlothNetworkStatus " + bVar, 8);
                }
                if (Intrinsics.d(bVar, b.a)) {
                    if (b0Var.s().h) {
                        com.yandex.passport.sloth.ui.webview.i s = b0Var.s();
                        s0 s0Var2 = s.a;
                        s0Var2.getClass();
                        s0Var2.b(q0.c);
                        s.a.a.f.reload();
                    } else {
                        s0Var.b(q0.d);
                    }
                } else if (Intrinsics.d(bVar, b.b)) {
                    s0Var.c();
                } else if (bVar != null) {
                    b6e.s();
                    return null;
                }
                return Unit.a;
            default:
                String str = ((com.yandex.passport.common.url.b) obj).a;
                b0 b0Var2 = this.b;
                com.yandex.passport.sloth.ui.webview.i s2 = b0Var2.s();
                boolean d = Intrinsics.d((b) ((com.yandex.passport.internal.sloth.n) b0Var2.u).a.a.getValue(), b.a);
                s0 s0Var3 = s2.a;
                str.getClass();
                if (d) {
                    s0 s0Var4 = s2.a;
                    s0Var4.getClass();
                    s0Var4.b(q0.c);
                }
                String m0 = StringsKt.m0('?', StringsKt.k0(str, "https://localhost/", ""), "");
                if (StringsKt.U(m0)) {
                    s0Var3.a.f.loadUrl(str, ((com.yandex.passport.internal.ui.sloth.j) s2.d).a);
                } else {
                    InputStream open = s0Var3.a.f.getContext().getAssets().open("webam/".concat(m0));
                    open.getClass();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open, Charsets.UTF_8), RemoteCameraConfig.Notification.ID);
                    try {
                        String F = t7g.F(bufferedReader);
                        bufferedReader.close();
                        s0Var3.a.f.loadDataWithBaseURL(str, F, "text/html", "UTF-8", "");
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            yd5.q(bufferedReader, th);
                            throw th2;
                        }
                    }
                }
                return Unit.a;
        }
    }
}
