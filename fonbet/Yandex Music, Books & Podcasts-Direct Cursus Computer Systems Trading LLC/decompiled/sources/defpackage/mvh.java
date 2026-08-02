package defpackage;

import android.app.ActivityManager;
import android.app.BackgroundServiceStartNotAllowedException;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.yandex.music.shared.media.session.session.Media3SessionService;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class mvh implements rjc {
    public final /* synthetic */ ovh a;

    public mvh(ovh ovhVar) {
        this.a = ovhVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        List<ActivityManager.RunningAppProcessInfo> list;
        Object obj2;
        ((Boolean) obj).getClass();
        Context context = this.a.a;
        ssg.a(3, "MediaServiceStartAdapterImpl", "Starting service", null);
        try {
            Intent intent = new Intent(context, (Class<?>) Media3SessionService.class);
            intent.setAction("android.intent.action.MEDIA_BUTTON");
            context.startService(intent);
        } catch (IllegalStateException e) {
            if (Build.VERSION.SDK_INT >= 31 && !(e instanceof BackgroundServiceStartNotAllowedException)) {
                throw e;
            }
            int i = context.getApplicationInfo().uid;
            String str = context.getApplicationInfo().processName;
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            if (activityManager == null || (list = activityManager.getRunningAppProcesses()) == null) {
                list = c5b.a;
            }
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj2;
                if (runningAppProcessInfo.uid == i && Intrinsics.d(runningAppProcessInfo.processName, str)) {
                    break;
                }
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo2 = (ActivityManager.RunningAppProcessInfo) obj2;
            ssg.a(7, "MediaServiceStartAdapterImpl", "Service start not allowed (process importance: " + (runningAppProcessInfo2 != null ? Integer.valueOf(runningAppProcessInfo2.importance) : null) + ")", null);
        }
        return Unit.a;
    }
}
