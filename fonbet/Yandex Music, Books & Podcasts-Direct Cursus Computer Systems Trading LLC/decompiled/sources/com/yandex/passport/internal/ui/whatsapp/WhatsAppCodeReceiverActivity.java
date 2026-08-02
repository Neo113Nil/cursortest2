package com.yandex.passport.internal.ui.whatsapp;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import com.yandex.passport.common.logger.b;
import com.yandex.passport.internal.di.a;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.report.l9;
import com.yandex.passport.internal.report.m9;
import com.yandex.passport.internal.report.reporters.l0;
import defpackage.cim;
import defpackage.dhv;
import defpackage.eye;
import defpackage.hq0;
import defpackage.kdv;
import defpackage.lg3;
import defpackage.y3t;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class WhatsAppCodeReceiverActivity extends hq0 {
    public static final /* synthetic */ int a = 0;

    @Override // androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Intent intent;
        kdv kdvVar;
        boolean anyMatch;
        super.onCreate(bundle);
        PassportProcessGlobalComponent a2 = a.a();
        l0 otpWaReporter = a2.getOtpWaReporter();
        try {
            otpWaReporter.getClass();
            otpWaReporter.p(l9.d);
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(b.b, null, "Intent received from WhatsApp", 8);
            }
            intent = getIntent();
            kdvVar = new kdv(1, otpWaReporter);
            try {
                PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("_ci_");
                if (pendingIntent == null) {
                    anyMatch = false;
                } else {
                    anyMatch = Arrays.stream(lg3.w).map(new cim(1)).anyMatch(new y3t(1, pendingIntent.getCreatorPackage()));
                }
            } catch (eye e) {
                kdvVar.accept(dhv.a, e);
            } catch (Exception e2) {
                kdvVar.accept(dhv.c, e2);
            }
        } catch (Exception e3) {
            otpWaReporter.u("activity_error", e3);
        }
        if (!anyMatch) {
            throw new eye("Invalid Intent");
        }
        String stringExtra = intent.getStringExtra("code");
        if (stringExtra != null) {
            a2.getSmsRetrieverHelper().a(stringExtra, com.yandex.passport.internal.smsretriever.a.OTP_WHATSAPP);
            otpWaReporter.p(m9.d);
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(b.b, null, "Successful code received from WhatsApp", 8);
            }
        } else {
            kdvVar.accept(dhv.b, null);
        }
        finish();
    }
}
