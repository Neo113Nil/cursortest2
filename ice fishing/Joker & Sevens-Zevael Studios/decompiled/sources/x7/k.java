package x7;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public static final long f8395b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f8396c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d, reason: collision with root package name */
    public static k f8397d;

    /* renamed from: a, reason: collision with root package name */
    public final u7.d f8398a;

    public k(u7.d dVar) {
        this.f8398a = dVar;
    }

    public final boolean a(y7.b bVar) {
        if (TextUtils.isEmpty(bVar.f8805c)) {
            return true;
        }
        long j3 = bVar.f8808f + bVar.f8807e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f8398a.getClass();
        return j3 < timeUnit.toSeconds(System.currentTimeMillis()) + f8395b;
    }
}
