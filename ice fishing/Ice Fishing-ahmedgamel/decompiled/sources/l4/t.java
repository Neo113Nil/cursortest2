package l4;

import E2.M;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class t {

    /* renamed from: c, reason: collision with root package name */
    public static WeakReference f38957c;

    /* renamed from: a, reason: collision with root package name */
    public M f38958a;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f38959b;

    public t(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f38959b = scheduledThreadPoolExecutor;
    }

    public final synchronized s a() {
        String str;
        s sVar;
        M m9 = this.f38958a;
        synchronized (((ArrayDeque) m9.f764x)) {
            str = (String) ((ArrayDeque) m9.f764x).peek();
        }
        Pattern pattern = s.f38953d;
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
