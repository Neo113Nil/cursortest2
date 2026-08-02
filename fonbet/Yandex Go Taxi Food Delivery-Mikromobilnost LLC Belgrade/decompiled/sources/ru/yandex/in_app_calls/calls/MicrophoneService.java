package ru.yandex.in_app_calls.calls;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import defpackage.crg0;
import defpackage.dab1;
import defpackage.dj7;
import defpackage.evu0;
import defpackage.f69;
import defpackage.g4j0;
import defpackage.ljo;
import defpackage.m0h0;
import defpackage.sls;
import defpackage.tls;
import defpackage.vg20;
import defpackage.xi7;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.b;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u0003J\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lru/yandex/in_app_calls/calls/MicrophoneService;", "Landroid/app/Service;", "<init>", "()V", "Landroid/content/Intent;", "intent", "", "flags", "startId", "onStartCommand", "(Landroid/content/Intent;II)I", "Lzy11;", "stopForeground", "onCreate", "onDestroy", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "Companion", "vg20", "calls_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MicrophoneService extends Service {
    public static final vg20 Companion = new vg20();
    public static final int NOTIFICATION_ID = 7310;
    private static MicrophoneService instance;
    private static tls onError;
    private static sls onStarted;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        f69 f69Var = xi7.a;
        f69.k("onCreate", Collections.singletonList("MicrophoneService"));
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        f69 f69Var = xi7.a;
        f69.k("onDestroy", Collections.singletonList("MicrophoneService"));
        instance = null;
        onStarted = null;
        onError = null;
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        String str;
        String str2;
        Notification b;
        Notification.CallStyle forOngoingCall;
        String stringExtra;
        MicrophoneService microphoneService = this;
        f69 f69Var = xi7.a;
        f69.k("onStartCommand", Collections.singletonList("MicrophoneService"));
        instance = microphoneService;
        String str3 = "";
        if (intent == null || (str = intent.getStringExtra("title")) == null) {
            str = "";
        }
        if (intent == null || (str2 = intent.getStringExtra("subtitle")) == null) {
            str2 = "";
        }
        if (intent != null && (stringExtra = intent.getStringExtra("hangup")) != null) {
            str3 = stringExtra;
        }
        f69.k("buildOngoingCallNotification", Collections.singletonList("CallNotificationBuilder"));
        PendingIntent activity = PendingIntent.getActivity(microphoneService, 0, microphoneService.getPackageManager().getLaunchIntentForPackage(microphoneService.getPackageName()), 201326592);
        Intent intent2 = new Intent(CallReceiver.ACTION_HANGUP);
        intent2.setClass(microphoneService, CallReceiver.class);
        intent2.setPackage(microphoneService.getPackageName());
        PendingIntent broadcast = PendingIntent.getBroadcast(microphoneService, 0, intent2, 201326592);
        if (evu0.J(str2)) {
            dab1.q("ongoingCallNotificationSubtitleIsEmpty");
            str2 = "Ongoing call";
        }
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                Person build = new Person.Builder().setName(str2).setImportant(true).build();
                Notification.Builder smallIcon = new Notification.Builder(microphoneService, "ongoing_inapp_call").setContentText(str).setSmallIcon(m0h0.ic_phone_call);
                forOngoingCall = Notification.CallStyle.forOngoingCall(build, broadcast);
                b = smallIcon.setStyle(forOngoingCall).setContentIntent(activity).setColor(microphoneService.getColor(crg0.notification_icon_color)).setOngoing(true).build();
            } catch (Exception e) {
                xi7.a.m("buildOngoingCallNotification failed, falling back to legacy", e, Collections.singletonList("CallNotificationBuilder"));
                xi7.a.m("reportError: " + e, null, Collections.singletonList("Reporter"));
                g4j0.a("reportError", b.i(new Pair("error", e.toString()), new Pair("stacktrace", ljo.b(e))));
                b = dj7.b(microphoneService, str, str2, str3, activity, broadcast);
            }
            microphoneService = this;
        } else {
            b = dj7.b(microphoneService, str, str2, str3, activity, broadcast);
        }
        try {
            microphoneService.startForeground(NOTIFICATION_ID, b, 128);
            sls slsVar = onStarted;
            if (slsVar != null) {
                slsVar.invoke();
            }
            dab1.q("microphoneServiceStarted");
            return 1;
        } catch (ForegroundServiceStartNotAllowedException e2) {
            xi7.a.m("Can't start foreground service", e2, Collections.singletonList("MicrophoneService"));
            dab1.q("foregroundServiceStartNotAllowed");
            tls tlsVar = onError;
            if (tlsVar != null) {
                tlsVar.invoke(e2);
            }
            microphoneService.stopForeground();
            return 2;
        } catch (Exception e3) {
            xi7.a.m("Unable to start foreground service", e3, Collections.singletonList("MicrophoneService"));
            xi7.a.m("reportError: " + e3, null, Collections.singletonList("Reporter"));
            g4j0.a("reportError", b.i(new Pair("error", e3.toString()), new Pair("stacktrace", ljo.b(e3))));
            tls tlsVar2 = onError;
            if (tlsVar2 != null) {
                tlsVar2.invoke(e3);
            }
            microphoneService.stopForeground();
            return 2;
        }
    }

    public final void stopForeground() {
        instance = null;
        dab1.q("microphoneServiceStopped");
        try {
            stopForeground(1);
        } catch (Exception e) {
            f69 f69Var = xi7.a;
            xi7.a.m("Failed to stopForeground", e, Collections.singletonList("MicrophoneService"));
        }
        stopSelf();
    }
}
