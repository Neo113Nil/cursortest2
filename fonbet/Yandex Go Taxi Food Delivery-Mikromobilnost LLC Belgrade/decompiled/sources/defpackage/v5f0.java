package defpackage;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

/* loaded from: classes7.dex */
public final class v5f0 {
    public static final Map d = b.i(new Pair(6, "anr"), new Pair(4, "crash"), new Pair(5, "crash_native"), new Pair(3, "low_memory"));
    public final Context a;
    public final u5f0 b;
    public final AtomicBoolean c = new AtomicBoolean(false);

    public v5f0(Context context, u5f0 u5f0Var) {
        this.a = context;
        this.b = u5f0Var;
    }

    public final void a() {
        List historicalProcessExitReasons;
        long timestamp;
        int reason;
        int reason2;
        int importance;
        Context context = this.a;
        if (Build.VERSION.SDK_INT >= 30 && this.c.compareAndSet(false, true)) {
            try {
                Object systemService = context.getSystemService("activity");
                ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
                if (activityManager == null) {
                    return;
                }
                historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(context.getPackageName(), 0, 1);
                ApplicationExitInfo g = mh.g(a.R(historicalProcessExitReasons));
                if (g == null) {
                    return;
                }
                long j = context.getSharedPreferences("finsdk_stability", 0).getLong("last_exit_info_timestamp", 0L);
                timestamp = g.getTimestamp();
                if (timestamp > j) {
                    Map map = d;
                    Set keySet = map.keySet();
                    reason = g.getReason();
                    if (keySet.contains(Integer.valueOf(reason))) {
                        u5f0 u5f0Var = this.b;
                        reason2 = g.getReason();
                        String str = (String) map.getOrDefault(Integer.valueOf(reason2), "unknown");
                        importance = g.getImportance();
                        String valueOf = String.valueOf(importance);
                        z22 z22Var = u5f0Var.a;
                        MapBuilder mapBuilder = new MapBuilder();
                        mapBuilder.put(CRLReasonCodeExtension.REASON, str);
                        mapBuilder.put("importance", valueOf);
                        ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(new fyt0("stability_process_exit_info", mapBuilder.j()));
                        long currentTimeMillis = System.currentTimeMillis();
                        SharedPreferences.Editor edit = context.getSharedPreferences("finsdk_stability", 0).edit();
                        edit.putLong("last_exit_info_timestamp", currentTimeMillis);
                        edit.apply();
                    }
                }
            } catch (Exception unused) {
            }
        }
    }
}
