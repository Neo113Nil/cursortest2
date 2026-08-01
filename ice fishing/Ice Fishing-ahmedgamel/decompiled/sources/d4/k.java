package d4;

import android.text.TextUtils;
import e4.C4463a;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public static final long f37069b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f37070c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d, reason: collision with root package name */
    public static k f37071d;

    /* renamed from: a, reason: collision with root package name */
    public final a4.e f37072a;

    public k(a4.e eVar) {
        this.f37072a = eVar;
    }

    public final boolean a(C4463a c4463a) {
        if (TextUtils.isEmpty(c4463a.f37197c)) {
            return true;
        }
        long j6 = c4463a.f37200f + c4463a.f37199e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f37072a.getClass();
        return j6 < timeUnit.toSeconds(System.currentTimeMillis()) + f37069b;
    }
}
