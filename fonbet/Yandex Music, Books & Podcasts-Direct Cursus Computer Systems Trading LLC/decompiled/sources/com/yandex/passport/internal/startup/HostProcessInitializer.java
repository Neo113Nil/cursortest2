package com.yandex.passport.internal.startup;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.passport.common.network.n;
import com.yandex.passport.internal.methods.requester.f;
import com.yandex.passport.internal.report.ye;
import com.yandex.passport.internal.util.l;
import defpackage.c5b;
import defpackage.lme;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.z7o;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/passport/internal/startup/HostProcessInitializer;", "Llme;", "", "<init>", "()V", "passport_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class HostProcessInitializer implements lme {
    @Override // defpackage.lme
    public final List a() {
        return c5b.a;
    }

    @Override // defpackage.lme
    public final Object create(Context context) {
        Object t7oVar;
        context.getClass();
        e eVar = e.a;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        synchronized (eVar) {
            if (!e.b) {
                try {
                    r7o r7oVar = z7o.b;
                    if (com.yandex.passport.internal.provider.communication.d.d == null) {
                        com.yandex.passport.internal.provider.communication.d.d = com.yandex.passport.internal.provider.communication.d.a();
                    }
                    com.yandex.passport.internal.autologin.ui.a aVar = new com.yandex.passport.internal.autologin.ui.a(ye.b(applicationContext));
                    ContentResolver contentResolver = applicationContext.getContentResolver();
                    contentResolver.getClass();
                    Uri a = l.a(applicationContext.getPackageName());
                    a.getClass();
                    d.a.b(applicationContext, new f(new n(12, contentResolver, a), aVar));
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "HostProcessInitializer initialized in host process", 8);
                    }
                    e.b = true;
                    t7oVar = Unit.a;
                } catch (Throwable th) {
                    r7o r7oVar2 = z7o.b;
                    t7oVar = new t7o(th);
                }
                Throwable a2 = z7o.a(t7oVar);
                if (a2 != null && com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "HostProcessInitializer init failed " + a2, 8);
                }
            } else if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "already initialized", 8);
            }
        }
        return Unit.a;
    }
}
