package r5;

import D.v;
import android.app.Notification;
import com.onesignal.notifications.internal.display.impl.b;
import org.json.JSONObject;
import p5.d;
import v7.InterfaceC5133d;

/* renamed from: r5.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC4967c {
    void createGenericPendingIntentsForGroup(v vVar, com.onesignal.notifications.internal.display.impl.a aVar, JSONObject jSONObject, String str, int i);

    Object createGrouplessSummaryNotification(d dVar, com.onesignal.notifications.internal.display.impl.a aVar, int i, int i4, InterfaceC5133d interfaceC5133d);

    Notification createSingleNotificationBeforeSummaryBuilder(d dVar, v vVar);

    Object createSummaryNotification(d dVar, b.a aVar, int i, InterfaceC5133d interfaceC5133d);

    Object updateSummaryNotification(d dVar, InterfaceC5133d interfaceC5133d);
}
