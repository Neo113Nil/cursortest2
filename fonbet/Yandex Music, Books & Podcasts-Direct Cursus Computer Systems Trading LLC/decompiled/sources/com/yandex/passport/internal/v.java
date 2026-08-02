package com.yandex.passport.internal;

import android.accounts.Account;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import defpackage.ca8;
import defpackage.ern;
import defpackage.etn;
import defpackage.f9f;
import defpackage.gld;
import defpackage.j9w;
import defpackage.l83;
import defpackage.u75;
import defpackage.x97;
import io.appmetrica.analytics.IReporterYandex;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* loaded from: classes4.dex */
public abstract class v {
    public static final List a = u75.h("ru.rutaxi.vezet", "ru.rutaxi.vezet.beta", "ru.rutaxi.vezet.develop", "ru.rutaxi.vezet.debug", "com.its.rto", "com.its.rto.beta", "com.its.rto.develop", "com.its.rto.debug", "ru.yandex.vezet", "ru.yandex.vezet.develop", "ru.yandex.vezet.debug");

    public static void a(PassportProcessGlobalComponent passportProcessGlobalComponent) {
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "initNotifications working", 8);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            l83 l83Var = new l83(passportProcessGlobalComponent.getPushSubscriptionScheduler());
            Context applicationContext = passportProcessGlobalComponent.getApplicationContext();
            applicationContext.getClass();
            IntentFilter intentFilter = new IntentFilter("android.app.action.NOTIFICATION_POLICY_ACCESS_GRANTED_CHANGED");
            intentFilter.addAction("android.app.action.APP_BLOCK_STATE_CHANGED");
            intentFilter.addAction("android.app.action.NOTIFICATION_CHANNEL_GROUP_BLOCK_STATE_CHANGED");
            intentFilter.addAction("android.app.action.INTERRUPTION_FILTER_CHANGED");
            intentFilter.addAction("android.app.action.NOTIFICATION_POLICY_CHANGED");
            applicationContext.registerReceiver(l83Var, intentFilter);
        }
        passportProcessGlobalComponent.getPushSubscriptionScheduler().b(null);
    }

    public static boolean b(Context context, IReporterYandex iReporterYandex) {
        if (!com.yandex.passport.common.util.a.d(context)) {
            try {
                Class.forName("com.yandex.passport.internal.util.MinifyUtilUnusedHelper");
                com.yandex.passport.internal.analytics.m mVar = com.yandex.passport.internal.analytics.m.g;
                IllegalStateException illegalStateException = new IllegalStateException("Release application is not minified");
                d(iReporterYandex, mVar, illegalStateException);
                new Handler(Looper.getMainLooper()).post(new androidx.core.app.a(2, illegalStateException));
                return false;
            } catch (ClassNotFoundException unused) {
                com.yandex.passport.common.logger.d dVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "minification Check: passed", 8);
                }
            }
        } else if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "minification Check: application is debuggable", 8);
            return true;
        }
        return true;
    }

    public static void c(Context context, IReporterYandex iReporterYandex) {
        context.getClass();
        com.yandex.plus.pay.ui.core.b.a = context.getApplicationContext();
        x97.y(gld.e(ca8.a), null, null, new j9w(context, iReporterYandex, null, 10), 3);
    }

    public static void d(IReporterYandex iReporterYandex, com.yandex.passport.internal.analytics.n nVar, Exception exc) {
        iReporterYandex.getClass();
        nVar.getClass();
        com.yandex.passport.common.logger.d dVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.b, null, "sendErrorToMetrica: " + nVar, exc);
        }
        iReporterYandex.reportError(nVar.b, exc);
    }

    public static void e(PassportProcessGlobalComponent passportProcessGlobalComponent, d dVar) {
        boolean u;
        com.yandex.passport.internal.core.sync.b syncHelper = passportProcessGlobalComponent.getSyncHelper();
        com.yandex.passport.internal.core.accounts.a accountSynchronizer = passportProcessGlobalComponent.getAccountSynchronizer();
        Context context = syncHelper.a;
        if (etn.z(context, "android.permission.READ_SYNC_SETTINGS") == 0 && etn.z(context, "android.permission.WRITE_SYNC_SETTINGS") == 0) {
            accountSynchronizer.getClass();
            Iterator it = dVar.g().iterator();
            while (it.hasNext()) {
                l lVar = (l) it.next();
                if (Intrinsics.f(com.yandex.passport.common.a.a() - lVar.e.c, syncHelper.c) > 0) {
                    f9f[] f9fVarArr = {ern.a(IOException.class), ern.a(JSONException.class), ern.a(com.yandex.passport.common.exception.a.class), ern.a(com.yandex.passport.data.exceptions.h.class)};
                    try {
                        accountSynchronizer.a(lVar.g, false);
                    } finally {
                        if (u) {
                        }
                    }
                } else if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "account synchronization on startup not required", 8);
                }
            }
            return;
        }
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "manual synchronization on startup is using because we don't have required sync permissions", 8);
        }
        Iterator it2 = dVar.b().iterator();
        while (it2.hasNext()) {
            Account account = (Account) it2.next();
            try {
                accountSynchronizer.a(account, false);
            } catch (com.yandex.passport.common.exception.a e) {
                com.yandex.passport.common.logger.d dVar2 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.b, null, "account synchronization on startup is failed, account=" + account, e);
                }
            } catch (com.yandex.passport.data.exceptions.h e2) {
                com.yandex.passport.common.logger.d dVar3 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.b, null, "account synchronization on startup is failed, account=" + account, e2);
                }
            } catch (IOException e3) {
                com.yandex.passport.common.logger.d dVar4 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.b, null, "account synchronization on startup is failed, account=" + account, e3);
                }
            } catch (JSONException e4) {
                com.yandex.passport.common.logger.d dVar5 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.b, null, "account synchronization on startup is failed, account=" + account, e4);
                }
            }
        }
    }
}
