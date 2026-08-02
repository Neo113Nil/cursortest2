package com.yandex.passport.internal.sso.announcing;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.ouj;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class SsoAnnouncingReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "onReceive()", 8);
        }
        if (intent == null) {
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.e, null, "onReceive: ignored because intent is null", 8);
                return;
            }
            return;
        }
        if (!"com.yandex.passport.ACTION_SSO_ANNOUNCEMENT".equals(intent.getAction())) {
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "onReceive: ignored because wrong action", 8);
                return;
            }
            return;
        }
        if (intent.getComponent() == null) {
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "onReceive: ignored because component is null", 8);
                return;
            }
            return;
        }
        String stringExtra = intent.getStringExtra("com.yandex.passport.SOURCE_PACKAGE_NAME");
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, ouj.k('\'', "onReceive: remotePackageName: '", stringExtra), 8);
        }
        if (Intrinsics.d(stringExtra, context.getPackageName())) {
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "onReceive: ignored broadcast from self", 8);
            }
        } else if (stringExtra != null) {
            new Thread(new com.yandex.passport.internal.interaction.c(4, stringExtra, goAsync())).start();
        } else if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "onReceive: ignored because remotePackageName is null", 8);
        }
    }
}
