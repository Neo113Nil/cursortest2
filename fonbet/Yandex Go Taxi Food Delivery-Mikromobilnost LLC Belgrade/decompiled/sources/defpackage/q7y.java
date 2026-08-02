package defpackage;

import kotlin.a;
import ru.yandex.taxi.network.api.models.GoApiOtherException;

/* loaded from: classes9.dex */
public final class q7y {
    public final i3y a = a.a(new ppr(20, this));

    public static void a(Throwable th, String str) {
        String concat = "LBS_ERROR_TOKEN_V1:".concat(str);
        if (th instanceof GoApiOtherException) {
            th = ((GoApiOtherException) th).getOriginal();
        }
        jst.e.g("LBS_ERROR_TOKEN_V1", "lbsLoggerTag", concat, th);
    }
}
