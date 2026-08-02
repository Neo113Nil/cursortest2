package f4;

import android.text.TextUtils;
import g4.C4532a;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static final long f37470b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f37471c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d, reason: collision with root package name */
    public static j f37472d;

    /* renamed from: a, reason: collision with root package name */
    public final c4.e f37473a;

    public j(c4.e eVar) {
        this.f37473a = eVar;
    }

    public final boolean a(C4532a c4532a) {
        if (TextUtils.isEmpty(c4532a.f37673c)) {
            return true;
        }
        long j6 = c4532a.f37676f + c4532a.f37675e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f37473a.getClass();
        return j6 < timeUnit.toSeconds(System.currentTimeMillis()) + f37470b;
    }
}
