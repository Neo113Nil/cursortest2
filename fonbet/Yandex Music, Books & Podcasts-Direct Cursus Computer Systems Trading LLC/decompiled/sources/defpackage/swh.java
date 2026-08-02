package defpackage;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import com.yandex.music.shared.media.session.session.Media3SessionService;
import com.yandex.music.shared.media.session.session.MusicMediaButtonReceiver;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class swh extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;
    public static final String[] b = {"android.intent.action.MEDIA_BUTTON", "androidx.media3.session.MediaLibraryService", "androidx.media3.session.MediaSessionService"};
    public static final /* synthetic */ int c = 0;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        ComponentName componentName;
        if (intent == null || !Objects.equals(intent.getAction(), "android.intent.action.MEDIA_BUTTON") || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Log.d("MediaButtonReceiver", "Ignore unsupported intent: " + intent);
            return;
        }
        Bundle extras = intent.getExtras();
        extras.getClass();
        KeyEvent keyEvent = (KeyEvent) extras.getParcelable("android.intent.extra.KEY_EVENT");
        if (keyEvent == null || keyEvent.getAction() != 0 || keyEvent.getRepeatCount() != 0) {
            return;
        }
        if (dvt.a >= 26 && keyEvent.getKeyCode() != 126 && keyEvent.getKeyCode() != 85 && keyEvent.getKeyCode() != 79) {
            Log.w("MediaButtonReceiver", "Ignore key event that is not a `play` command on API 26 or above to avoid an 'ForegroundServiceDidNotStartInTimeException'");
            return;
        }
        int i = 0;
        while (true) {
            String[] strArr = b;
            if (i >= 3) {
                b6e.w(Arrays.toString(strArr), "Could not find any Service that handles any of the actions ");
                return;
            }
            String str = strArr[i];
            PackageManager packageManager = context.getPackageManager();
            Intent intent2 = new Intent(str);
            intent2.setPackage(context.getPackageName());
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent2, 0);
            if (queryIntentServices.size() == 1) {
                ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
            } else {
                if (!queryIntentServices.isEmpty()) {
                    StringBuilder u = ouj.u("Expected 1 service that handles ", str, ", found ");
                    u.append(queryIntentServices.size());
                    throw new IllegalStateException(u.toString());
                }
                componentName = null;
            }
            if (componentName != null) {
                intent.setComponent(componentName);
                psh pshVar = MusicMediaButtonReceiver.d;
                if (pshVar == null) {
                    Intrinsics.j("component");
                    throw null;
                }
                ((ush) pshVar.l.getValue()).getClass();
                ssg.a(3, "MusicMediaButtonReceiver", "shouldStartForegroundService: true", null);
                try {
                    etn.h0(context, intent);
                    return;
                } catch (IllegalStateException e) {
                    if (Build.VERSION.SDK_INT < 31 || !rf0.p(e)) {
                        throw e;
                    }
                    rf0.d(e);
                    ssg.a(7, "MusicMediaButtonReceiver", "Start foreground playback not allowed", new Media3SessionService.MusicBackgroundServiceStartNotAllowedException());
                    return;
                }
            }
            i++;
        }
    }
}
