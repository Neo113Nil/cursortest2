package ru.yandex.taxi.scooters.presentation.feedback;

import android.content.Context;
import defpackage.tj60;
import defpackage.xj60;

/* loaded from: classes6.dex */
public abstract class b {
    public static final void a(final tj60 tj60Var, Context context) {
        final ScootersFeedbackSubmittedNotification scootersFeedbackSubmittedNotification = new ScootersFeedbackSubmittedNotification(context, null, 0, 6, null);
        scootersFeedbackSubmittedNotification.setExpiresListener(new xj60() { // from class: ru.yandex.taxi.scooters.presentation.feedback.a
            @Override // defpackage.xj60
            public final void a() {
                tj60.this.c(scootersFeedbackSubmittedNotification.getNotificationId());
            }
        });
        tj60Var.e(scootersFeedbackSubmittedNotification);
        scootersFeedbackSubmittedNotification.startExpiresTimer(30000L);
    }
}
