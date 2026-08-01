package X3;

import V3.f;
import V3.g;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public static final SimpleDateFormat f3796a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        f3796a = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    @Override // V3.a
    public final void a(Object obj, Object obj2) {
        ((g) obj2).d(f3796a.format((Date) obj));
    }
}
