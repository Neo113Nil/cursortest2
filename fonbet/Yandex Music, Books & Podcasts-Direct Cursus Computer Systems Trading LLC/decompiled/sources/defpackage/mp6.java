package defpackage;

import android.os.Looper;
import java.util.Arrays;
import java.util.Locale;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.e;

/* loaded from: classes6.dex */
public final class mp6 extends ku2 {
    public final tf6 b = gld.e(e.c(a4g.n(), dm6.a()));

    @Override // timber.log.Timber.Tree
    public final void log(int i, String str, String str2, Throwable th) {
        String str3;
        str2.getClass();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            x97.y(this.b, null, null, new v3(this, i, str, str2, th, (Continuation) null), 3);
            return;
        }
        bec a = bec.a();
        Locale locale = Locale.US;
        Integer valueOf = Integer.valueOf(ku2.a);
        Long valueOf2 = Long.valueOf(Thread.currentThread().getId());
        switch (i) {
            case 2:
                str3 = "V";
                break;
            case 3:
                str3 = "D";
                break;
            case 4:
                str3 = "I";
                break;
            case 5:
                str3 = "W";
                break;
            case 6:
                str3 = "E";
                break;
            case 7:
                str3 = "A";
                break;
            default:
                str3 = "UNKNOWN";
                break;
        }
        String format = String.format(locale, "%1$d %2$d %3$s %4$s %5$s", Arrays.copyOf(new Object[]{valueOf, valueOf2, str3, str == null ? "nonetag" : str, str2}, 5));
        kp6 kp6Var = a.a;
        ((vq6) kp6Var.o.a).d(new ip6(kp6Var, System.currentTimeMillis() - kp6Var.d, format, 0));
    }
}
