package j4;

import C2.N;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class t {

    /* renamed from: c, reason: collision with root package name */
    public static WeakReference f38445c;

    /* renamed from: a, reason: collision with root package name */
    public N f38446a;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f38447b;

    public t(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f38447b = scheduledThreadPoolExecutor;
    }

    public final synchronized s a() {
        String str;
        s sVar;
        N n9 = this.f38446a;
        synchronized (((ArrayDeque) n9.f304x)) {
            str = (String) ((ArrayDeque) n9.f304x).peek();
        }
        Pattern pattern = s.f38441d;
        sVar = null;
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("!", -1);
            if (split.length == 2) {
                sVar = new s(split[0], split[1]);
            }
        }
        return sVar;
    }
}
